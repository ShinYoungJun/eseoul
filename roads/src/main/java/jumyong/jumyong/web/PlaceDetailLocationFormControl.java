package main.java.jumyong.jumyong.web;


import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;

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

import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyong.service.*;

public class PlaceDetailLocationFormControl extends SimpleFormController {	
	
  	/**
  	 * inspect 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
		
	private	CommonCodeService	commonCodeService		= null;		
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCodeService) 
	{
		this.commonCodeService 	= commonCodeService;
	}	
	
	public PlaceDetailLocationFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {		
		//	삭제 세션
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		List	list	=	null;
		PlaceLocationBean pb = null;
		
		try{
			if(userId != null)
			{
				String strFormView = null;
				String adminNo = ServletRequestUtils.getStringParameter(request,"no");		
				String mode = ServletRequestUtils.getStringParameter(request,"mode");
				String seq = ServletRequestUtils.getStringParameter(request,"seq");		
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "3");
				String SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
				String strFormview = "/jumyong/jumyong/info_placeLocation";
				String strSuccessView = "redirect:/jumyong/placeLocationEdit.do?no="+adminNo+"&currentPage="+strCurrentPage+"&SECTION="+SECTION;
				
				
				// pnu, addr, name 값가져오기
				List pnu_addr = commonCodeService.getAddrPNU(adminNo);
				if(pnu_addr.size()>0){
					UserBean objUserBean = new UserBean();
					objUserBean = (UserBean)pnu_addr.get(0);
					System.out.println("@@@@@@@@@@"+objUserBean.getPNU()+":"+objUserBean.getADDR()+":"+objUserBean.getNAME());
					request.setAttribute("PNU", objUserBean.getPNU());
					request.setAttribute("Addr", objUserBean.getADDR());
					request.setAttribute("Name", objUserBean.getNAME());
				}else if(pnu_addr.size()==0){
					request.setAttribute("PNU", "0");
				}
				// pnu, addr, name 값가져오기 종료
				
				if(mode == null)
					mode = "view";
				
				request.setAttribute("no", adminNo);
				request.setAttribute("mode", mode);		
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);
				request.setAttribute("SECTION", SECTION);
				
				pb = new PlaceLocationBean();
				
		//		상단 리스트 화면		
				List LocationList = objJumyongService.retrieveLocatonList( Integer.parseInt(strCurrentPage) ,3,adminNo);		
				int listNum = objJumyongService.getLocationListCount(adminNo);
				request.setAttribute("listNum", String.valueOf(listNum));
				
		//		리스트의 페이징 html 
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
						,Integer.parseInt(strCountPerPage), "", "no="+adminNo, "/jumyong/placeLocationEdit.do",listNum);
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				
				request.setAttribute("Llist", LocationList);
				request.setAttribute("seq",  seq);
				
						
		//		수정화면 일때.. jsp 페이지 바꿈		
				
				if(mode.equals("edit"))
				{
					strFormview = "/jumyong/jumyong/info_placeLocationEdit";				// edit일때 formview의 화면을 바꿈. 
				}else if(mode.equals("add"))
					strSuccessView = "redirect:/jumyong/placeLocationEdit.do?no="+adminNo+"&SECTION="+SECTION;	//add 일때는 추가 후 리스트 제일 처음으로
				
				System.out.println("success"+strSuccessView);
				setFormView(strFormview);
				setSuccessView(strSuccessView);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		return pb;
	}

	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {
		
		

		try
		{	
			PlaceLocationBean objLocatoinBean = (PlaceLocationBean)command;
			
			String adminNo = ServletRequestUtils.getStringParameter(request,"no");
			
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			String seq = ServletRequestUtils.getStringParameter(request,"seq");
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			String Locate_x = ServletRequestUtils.getStringParameter(request,"Locate_x");
			String Locate_y = ServletRequestUtils.getStringParameter(request,"Locate_y");
			
			objLocatoinBean.setADMIN_NO(adminNo);
			
			objLocatoinBean.setLOCATE_X(Locate_x);
			objLocatoinBean.setLOCATE_Y(Locate_y);
			
			System.out.println(objLocatoinBean.getAREA());
			if( !seq.equals(""))			
				objLocatoinBean.setSEQ( Integer.parseInt(seq) );
System.out.println("위치정보:"+objLocatoinBean);
			if(mode.equals("add"))
			{
				objJumyongService.insertLocation(objLocatoinBean);
			}
			else if(mode.equals("edit"))
			{
				objJumyongService.updateLocation(objLocatoinBean);
				
			}
				
			
		
		}catch(Exception err)
		{
			System.out.println("location입력 control"+err.toString());
		}
		
		System.out.println(getSuccessView());
		
		
		return new ModelAndView(getSuccessView());
	}
}