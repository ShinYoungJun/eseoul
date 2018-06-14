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
  	 * inspect ����Ʈ ��ȸ
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
		
//		��� ����Ʈ ȭ��		
		List LocationList = objJumyongService.retrieveLocatonList( Integer.parseInt(strCurrentPage) ,3,adminNo);		
		
		
		
		
		int listNum = objJumyongService.getLocationListCount(adminNo);
		
		
		
		request.setAttribute("listNum", String.valueOf(listNum));
		
		
		
//		����Ʈ�� ����¡ html 
		String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
				,Integer.parseInt(strCountPerPage), "", "no="+adminNo, "/gapan/jumyong/placeLocationEdit.do",listNum);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		
		request.setAttribute("Llist", LocationList);
		request.setAttribute("seq",  seq);
		
				
//		����ȭ�� �϶�.. jsp ������ �ٲ�		
		
		if(mode.equals("edit"))
		{
			strFormview = "/gapan/jumyong/info_placeLocationEdit";				// edit�϶� formview�� ȭ���� �ٲ�. 
		}else if(mode.equals("add"))
			strSuccessView = "redirect:/gapan/jumyong/placeLocationEdit.do?no="+adminNo;	//add �϶��� �߰� �� ����Ʈ ���� ó������
		
		
		
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
			System.out.println("location�Է� control"+err.toString());
		}
		
		System.out.println(getSuccessView());
		
		
		return new ModelAndView(getSuccessView());
	}
}