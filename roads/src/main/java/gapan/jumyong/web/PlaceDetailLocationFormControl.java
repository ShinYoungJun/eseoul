package main.java.gapan.jumyong.web;


import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;

import java.util.*;

import java.net.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;


import main.java.gapan.jumyong.model.PlaceLocationBean;

import main.java.gapan.jumyong.service.*;


public class PlaceDetailLocationFormControl extends SimpleFormController {	
	
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
	
	public PlaceDetailLocationFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {		
		
		String strFormView = null;
		
		String adminNo = ServletRequestUtils.getStringParameter(request,"no");		
		String mode = ServletRequestUtils.getStringParameter(request,"mode");
		String seq = ServletRequestUtils.getStringParameter(request,"seq");		
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "3");
		String strFormview = "/gapan/jumyong/info_placeLocation";
		String strSuccessView = "redirect:/gapan/jumyong/placeLocationEdit.do?no="+adminNo+"&currentPage="+strCurrentPage;
		
		if(mode == null)
			mode = "view";
		
		
		
		request.setAttribute("no", adminNo);
		request.setAttribute("mode", mode);		
		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		
		
		PlaceLocationBean pb = new PlaceLocationBean();
		
//		상단 리스트 화면		
		List LocationList = objJumyongService.retrieveLocatonList( Integer.parseInt(strCurrentPage) ,3,adminNo);		
		
		
		
		
		int listNum = objJumyongService.getLocationListCount(adminNo);
		
		
		
		request.setAttribute("listNum", String.valueOf(listNum));
		
		
		
//		리스트의 페이징 html 
		String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
				,Integer.parseInt(strCountPerPage), "", "no="+adminNo, "/gapan/jumyong/placeLocationEdit.do",listNum);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		
		request.setAttribute("Llist", LocationList);
		request.setAttribute("seq",  seq);
		
				
//		수정화면 일때.. jsp 페이지 바꿈		
		
		if(mode.equals("edit"))
		{
			strFormview = "/gapan/jumyong/info_placeLocationEdit";				// edit일때 formview의 화면을 바꿈. 
		}else if(mode.equals("add"))
			strSuccessView = "redirect:/gapan/jumyong/placeLocationEdit.do?no="+adminNo;	//add 일때는 추가 후 리스트 제일 처음으로
		
		
		
		System.out.println("success"+strSuccessView);
		setFormView(strFormview);
		setSuccessView(strSuccessView);
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
			
			
			objLocatoinBean.setADMIN_NO(adminNo);
			
			
			System.out.println(objLocatoinBean.getAREA());
			if( !seq.equals(""))			
				objLocatoinBean.setSEQ( Integer.parseInt(seq) );

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