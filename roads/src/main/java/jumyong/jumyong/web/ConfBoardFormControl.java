package main.java.jumyong.jumyong.web;


import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;

import java.text.SimpleDateFormat;
import java.util.*;

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
import main.java.jumyong.gigan.model.PlaceBean;
import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.service.*;

public class ConfBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * conf 리스트 조회 
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
		
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public ConfBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		ConfBean cb = new ConfBean();
		try{
			if(userId != null)
			{
				String strFormView = null;
				
				String adminNo = ServletRequestUtils.getStringParameter(request,"no");		
				String mode = ServletRequestUtils.getStringParameter(request,"mode");
				String seq = ServletRequestUtils.getStringParameter(request,"seq","0");		
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
				String SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
				
				
				if(mode == null)
					mode = "view";
				if(seq == null)
					seq = "0";
				
				request.setAttribute("no", adminNo);
				request.setAttribute("mode", mode);		
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);
				request.setAttribute("SECTION", SECTION);								
				
				//상단 리스트 화면
				List ConfList = objJumyongService.retrieveConfList(Integer.parseInt(strCurrentPage),4,adminNo, seq);
				int listSize = ConfList.size();	
				request.setAttribute("listSize", String.valueOf((listSize)));
				
				
		
		//		리스트의 페이징 html 
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
						,Integer.parseInt(strCountPerPage), "", "no="+adminNo, "/jumyong/confEdit.do",objJumyongService.getConfListCount(adminNo));
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				
				
				
				
				if(!mode.equals("add"))			//confinspectInfo 에 정보를 넣어야 될때(추가가 아닐때)
				{
					if(listSize > 0)
					{	
						
		//				 seq가 없으면 리스트의 첫번째 행을 info 정보로 넣기
						if(seq == null || seq.equals("")||seq.equals("null"))
						{					
							seq = String.valueOf(((ConfBean)ConfList.get(0)).getSEQ());
						}				
						List ConfInfoList = objJumyongService.ConfInfo(adminNo,seq);
						cb= (ConfBean)ConfInfoList.get(0);		
						seq = String.valueOf(cb.getSEQ());
						
						// 날짜에 '-' 표시
						String strConf_date = cb.getCONF_DATE();
						if(strConf_date != null)
							cb.setCONF_DATE(addDash(strConf_date));
		
		//				상단 리스트 일정 글자수 이상 자르기		
							int textLength = 20;			
							for(int i=0;i<ConfList.size();i++)
					  		{
					  			String confComment = ((ConfBean)ConfList.get(i)).getCONF_COMMENT();
					  			
					  			
					  			if(confComment != null && confComment.length()>=textLength)
					  				((ConfBean)ConfList.get(i)).setCONF_COMMENT((confComment.substring(0,textLength)+".."));	  			
					  		}
								
							
						
					}else // list가 없을때는 추가이므로 mode 설정후 바로 return
					{
						mode = "add";
						request.setAttribute("mode", mode);							
					}
				}
				
				request.setAttribute("CList", ConfList);
				//추가 일때 조사일자 오늘 날짜로.
				if(mode.equals("add"))
				{
				//			오늘 날짜 , 7일전 날짜 구하기
					Calendar cal = Calendar.getInstance();
					
					SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
					cb.setCONF_DATE(addDash(sdf.format (cal.getTime())));      // 오늘 날짜 변수에 저장
				}		
				
				request.setAttribute("seq",  seq);
				setSuccessView("redirect:/jumyong/confEdit.do?no="+adminNo+"&seq="+seq);
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}				
		return cb;
	}
	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {

		try
		{
			ConfBean objConfBean = (ConfBean)command;
			String adminNo = ServletRequestUtils.getStringParameter(request,"no");
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			String seq = ServletRequestUtils.getStringParameter(request,"seq");
			
			objConfBean.setADMIN_NO(adminNo);
			objConfBean.setCONF_DATE(removeDash(objConfBean.getCONF_DATE()));
			
			if( !seq.equals(""))
				objConfBean.setSEQ(Integer.parseInt(seq));
			
			if(mode.equals("add"))
				objJumyongService.insertConf(objConfBean);
			
			else if(mode.equals("edit"))			
				objJumyongService.updateConf(objConfBean);			
		
		}catch(Exception err)
		{
			System.out.println(err.toString());
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