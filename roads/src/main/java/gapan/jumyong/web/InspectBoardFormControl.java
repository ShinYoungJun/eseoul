package main.java.gapan.jumyong.web;


import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;

import java.net.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;



import main.java.gapan.jumyong.model.InspectBean;


import main.java.gapan.jumyong.service.*;

public class InspectBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * inspect 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
		
	
	public void setGapan_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public InspectBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {		
		
		String strFormView = null;
		
		String adminNo = ServletRequestUtils.getStringParameter(request,"no");		
		String mode = ServletRequestUtils.getStringParameter(request,"mode");
		String seq = ServletRequestUtils.getStringParameter(request,"seq");		
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
		String section = ServletRequestUtils.getStringParameter(request, "SECTION");
		
		
		if(mode == null)
			mode = "view";
		
		//System.out.println("&&&mode:"+mode);
		request.setAttribute("no", adminNo);
		request.setAttribute("mode", mode);
		request.setAttribute("SECTION", section);	
		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		
		InspectBean ib = new InspectBean();
		
//		상단 리스트 화면		
		List InspectList = objJumyongService.retrieveInspectList( Integer.parseInt(strCurrentPage) ,4,adminNo);		
		//System.out.println("InspectList size:"+InspectList.size());
		
		
		int listSize = InspectList.size();		
		request.setAttribute("listSize",  String.valueOf((listSize)));
//		리스트의 페이징 html 
		String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
				,Integer.parseInt(strCountPerPage), "", "no="+adminNo, "/gapan/jumyong/inspectEdit.do",objJumyongService.getInspectListCount(adminNo));
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		
			
		if(!mode.equals("add"))			//inspectInfo 에 정보를 넣어야 될때(추가가 아닐때)
		{
			//System.out.println("!mode.equals(add) is true!");
			if(listSize > 0)
			{
				// seq가 없으면 리스트의 첫번째 행을 info 정보로 넣기
				if(   (seq == null || seq.equals("")||seq.equals("null"))   )
				{					
					//ib = (InspectBean)InspectList.get(0);
					seq = String.valueOf(((InspectBean)InspectList.get(0)).getSEQ());
				}
				//System.out.println("%%%%seq:"+seq);
					List InspectInfoList = objJumyongService.InspectInfo(adminNo,seq);
					ib= (InspectBean)InspectInfoList.get(0);
					seq = String.valueOf(ib.getSEQ());
				
					
				// 날짜에 '-' 표시
				String strInspect_date = ib.getINSPECT_DATE();
				if(strInspect_date != null)
					ib.setINSPECT_DATE(addDash(strInspect_date));
				
				
				
				//		상단 리스트 일정 글자수 이상 자르기
				int textLength = 10;
				for(int i=0;i<InspectList.size();i++)
		  		{
		  			String inspectOpinion = ((InspectBean)InspectList.get(i)).getINSPECT_OPINION();
		  			String managerOpinion = ((InspectBean)InspectList.get(i)).getMANAGER_OPINION();
		  			String approvalCondition = ((InspectBean)InspectList.get(i)).getAPPROVAL_CONDITION();
		  			
		  			if(inspectOpinion != null && inspectOpinion.length()>=textLength)
		  				((InspectBean)InspectList.get(i)).setINSPECT_OPINION(inspectOpinion.substring(0,textLength)+"..");
		  			
		  			if(managerOpinion != null && managerOpinion.length()>=textLength)
		  				((InspectBean)InspectList.get(i)).setMANAGER_OPINION(managerOpinion.substring(0,textLength)+"..");
		  			
		  			if(approvalCondition != null && approvalCondition.length()>=textLength)
		  				((InspectBean)InspectList.get(i)).setAPPROVAL_CONDITION(approvalCondition.substring(0,textLength)+"..");	  			
		  		}	
				
				
				
			}else // list가 없을때는 추가이므로 mode 설정후 바로 return
			{
				mode = "add";
				request.setAttribute("mode", mode);				
			}
		}
		
		request.setAttribute("iList", InspectList);
		
		//추가 일때 조사일자 오늘 날짜로.
		if(mode.equals("add"))
		{
		//			오늘 날짜 , 7일전 날짜 구하기
			Calendar cal = Calendar.getInstance();
			
			SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
			ib.setINSPECT_DATE(addDash(sdf.format (cal.getTime())));      // 오늘 날짜 변수에 저장			
		}
		
		request.setAttribute("seq",  seq);
		setSuccessView("redirect:/gapan/jumyong/inspectEdit.do?no="+adminNo+"&seq="+seq);
		return ib;
	}
	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {

		try
		{
			
			InspectBean objInspectBean = (InspectBean)command;
			String adminNo = ServletRequestUtils.getStringParameter(request,"no");
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			String seq = ServletRequestUtils.getStringParameter(request,"seq");
			
			objInspectBean.setADMIN_NO(adminNo);
			objInspectBean.setINSPECT_DATE(removeDash(objInspectBean.getINSPECT_DATE()));
		
			if( !seq.equals("")){	//받은 seq가 있으면... 
				objInspectBean.setSEQ( Integer.parseInt(seq) );		//기존에 받은 변수 seq를 빈즈에 삽입해라
			}
			
			if(mode.equals("add"))	{		
				//System.out.println("add로 선택~!");
				objJumyongService.insertInspect(objInspectBean);
			}
			else if(mode.equals("edit"))			
				objJumyongService.updateInspect(objInspectBean);			
		
		}catch(Exception err)
		{
			System.out.println("inpsect입력 control"+err.toString());
		}
		return new ModelAndView(getSuccessView());
	}
	
	
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	

	public String addDash(String val1)
	{	
		if(val1.length() >= 8)
			val1 = val1.substring(0,4)+"-"+val1.substring(4,6)+"-"+val1.substring(6,8);
		else if(val1.length() >= 6)
			val1 = val1.substring(0,4)+"-"+val1.substring(4,6);
		
		return val1;
	}
	
}