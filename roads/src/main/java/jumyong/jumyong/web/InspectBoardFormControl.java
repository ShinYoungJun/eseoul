package main.java.jumyong.jumyong.web;


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

import main.java.common.util.*;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.service.*;

public class InspectBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * inspect 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
		
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public InspectBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		InspectBean ib = new InspectBean();
		
		try{
			if(userId != null){
				String strFormView = null;
				
				String adminNo = ServletRequestUtils.getStringParameter(request,"no");		
				String mode = ServletRequestUtils.getStringParameter(request,"mode");
				String seq = ServletRequestUtils.getStringParameter(request,"seq", "0");		
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
				String SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
				
				
				
				if(mode == null)
					mode = "view";
				if(seq == null)
					seq = "0";
				
				request.setAttribute("seq",  seq);
				request.setAttribute("no", adminNo);
				request.setAttribute("mode", mode);		
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);
				request.setAttribute("SECTION", SECTION);
		
		//		상단 리스트 화면		
				List InspectList = objJumyongService.retrieveInspectList( Integer.parseInt(strCurrentPage) ,4,adminNo, seq);		
				
				
				
				int listSize = InspectList.size();		
				request.setAttribute("listSize",  String.valueOf((listSize)));
		//		리스트의 페이징 html 
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
						,Integer.parseInt(strCountPerPage), "", "no="+adminNo, "/jumyong/inspectEdit.do",objJumyongService.getInspectListCount(adminNo));
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				
					
				if(!mode.equals("add"))			//inspectInfo 에 정보를 넣어야 될때(추가가 아닐때)
				{
					if(listSize > 0)
					{
						// seq가 없으면 리스트의 첫번째 행을 info 정보로 넣기
						if(   (seq == null || seq.equals("")||seq.equals("null"))   )
						{					
							//ib = (InspectBean)InspectList.get(0);
							seq = String.valueOf(((InspectBean)InspectList.get(0)).getSEQ());
						}
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
				

				setSuccessView("redirect:/jumyong/inspectEdit.do?no="+adminNo+"&seq="+seq);
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}		
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
			
			
			request.setAttribute("seq",  seq);
			
			objInspectBean.setADMIN_NO(adminNo);
			objInspectBean.setINSPECT_DATE(removeDash(objInspectBean.getINSPECT_DATE()));
			
			System.out.println("SEQ " + seq +adminNo);

			
		
			if( seq != null)			
				objInspectBean.setSEQ( Integer.parseInt(seq) );
			
			if(mode.equals("add"))			
				objJumyongService.insertInspect(objInspectBean);
			
			else if(mode.equals("edit"))			
				objJumyongService.updateInspect(objInspectBean);			
		
		}catch(Exception err)
		{
			System.out.println("inpsect입력 control");
			err.printStackTrace();
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