/***********************************
 * 수정일 : 2007.9.27
 * 최종수정자 : 최진용
 * 수정내용 :
 ***********************************/

package main.java.jumyong.jumyong.web;


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
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.service.*;

public class delJumyongBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * QABoard 리스트 조회 (login 안한상태에 보이는 리스트)
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	
	
	private IJumyongService objJumyongService = null;
	
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public delJumyongBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {
		
		
		
		String strFormView = null;
		
		String adminNo = ServletRequestUtils.getStringParameter(request,"no");
		
		String addSum = ServletRequestUtils.getStringParameter(request,"addSum");
		
		
		
		ProductBean pb = new ProductBean();
		try{
			if(adminNo != null)	{
				request.setAttribute("no", adminNo);
				
				
				pb = objJumyongService.productInfo("1");
				
				if(pb == null)
					return new ProductBean();
				
				int rate = 0;
				
				if(addSum != null)
					request.setAttribute("rate", String.valueOf(objJumyongService.getProductRate(addSum)));
				
				//System.out.println("no="+pb.getFROMDATE());
				
				setSuccessView("redirect:/jumyong/productInsert.do?no="+adminNo);
			}else
				setSuccessView("redirect:/jumyong/productInsert.do?");
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
		
		return pb;
	}
	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {

		try
		{
			
			//System.out.println("여기 오고2");
			ProductBean objProductBean = (ProductBean)command;
			String adminNo = ServletRequestUtils.getStringParameter(request,"no");
			
			objProductBean.setADMIN_NO(adminNo);
			
			if(adminNo != null)
				objJumyongService.insertProduct(objProductBean);	
		
		/*
		objProductBean.setADMIN_NO("2001-3324");
		
		objProductBean.setyear("2008");
		//objProductBean.setPRICE("2000");
		objProductBean.setFROMDATE("20080101");
		objProductBean.setTODATE("20080101");
		objProductBean.setSIZE_AFTER(100);
		objProductBean.setRATE(2000);
		objProductBean.setSUM_LASTYEAR(1000);
		objProductBean.setSUM_YEAR(1000);
		objProductBean.setSUM_ADJUST(1000);
		System.out.println("aa1="+aa1);
		//objJumyongService.insertProduct(objProductBean);
		System.out.println("값은="+objProductBean.getPRICE());*/
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
		return new ModelAndView(getSuccessView());
	}
}