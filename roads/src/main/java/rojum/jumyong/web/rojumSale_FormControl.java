
package main.java.rojum.jumyong.web;


import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.Globals;



import java.text.SimpleDateFormat;
import java.util.*;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import org.springframework.web.bind.ServletRequestUtils;

import main.java.common.util.*;
import main.java.common.util.catUtil.Util;


import main.java.rojum.jumyong.model.GapanBaseBean;
import main.java.rojum.jumyong.model.ProductBean;
import main.java.rojum.jumyong.model.SaleBean;

import main.java.rojum.jumyong.service.*;

public class rojumSale_FormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION ����Ʈ ��ȸ
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private	CommonCodeService	commonCode		= null;	
	private IJumyongService objJumyongService = null;
	private	Util				util			= new Util();
	
	
	public void setRojum_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	public rojumSale_FormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {
		
		
		System.out.println("rojumSale_FormControl : : formBackingObject");

		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SaleBean pb = null;


			if(userId != null)
			{
				String gapanNo = ServletRequestUtils.getStringParameter(request,"GAPAN_NO");		
				String mode = ServletRequestUtils.getStringParameter(request,"mode","view");
				String seq = ServletRequestUtils.getStringParameter(request,"seq");
				String use_section = ServletRequestUtils.getStringParameter(request,"USE_SECTION");
				
				System.out.println("@@@@@@@@@@@ GAPAN_NO :"+gapanNo);
				System.out.println("@@@@@@@@@@@ seq :"+seq);
				
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				request.setAttribute("GAPAN_NO", gapanNo);
				request.setAttribute("seq", seq);
				request.setAttribute("USE_SECTION", use_section);
				
				pb = new SaleBean();
				
				List productList = objJumyongService.ProductSaleList(gapanNo);
				
				//section ����
				
				//section ����
				Map mapSection = (Map)objJumyongService.getSection(gapanNo);
				String section = mapSection.get("SECTION").toString();	
				request.setAttribute("SECTION", section);
				
				Map mapTaxAt = (Map)objJumyongService.getTaxtationAt(gapanNo);
				String tax_at = mapTaxAt.get("TAXTATION_AT").toString();	
				request.setAttribute("tax_at", tax_at);
				
				
				String strFormView = "/rojum/jumyong/info_product_sale";
				setFormView(strFormView);
			
					if(productList.size() > 0)	//������ ����Ʈ�� �ִ���...
					{
						pb = (SaleBean)productList.get(0);
					}
					else
					{
						mode = "add";
					}
						
					request.setAttribute("mode", mode);
					
					if(mode.equals("del")){
						objJumyongService.executeDeleteProductSale(gapanNo);
						pb = new SaleBean();
						
					}
				
				if(seq == null) seq = "0";
				
				request.setAttribute("seq",  seq);
					
				//������ ������ ���ư� ������
				setSuccessView("redirect:/rojum/jumyong/rojumSale.do?GAPAN_NO="+gapanNo);
			}
		return pb;
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception	 {
		
		System.out.println("rojumSale_FormControl : : onSubmit");
		
		try{							
			SaleBean objSaleBean = (SaleBean)command;						
			
			//���� ��¥ , 7���� ��¥ ���ϱ�
			Calendar  cal  =  Calendar.getInstance();
			SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // ������ ��� ���� ����
			String  toDate  =  sdf.format (cal.getTime());      // ���� ��¥ ������ ����
					
			
			String gapanNo = ServletRequestUtils.getStringParameter(request,"GAPAN_NO");
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			
			
			objSaleBean.setGAPAN_NO(gapanNo);
					
			
			if(mode.equals("add")){
				
				objJumyongService.ExecuteSale_Register(objSaleBean);
			
			}else if(mode.equals("edit")){
				
				objJumyongService.UpdateSale_Register(objSaleBean);

			}
			
			//������Ʈ ��¥ ����
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			
			GapanBaseBean bean = new GapanBaseBean();
			bean.setFINISH_ID(userId);
			bean.setGAPAN_NO(gapanNo);

			objJumyongService.GapanBaseUpdate(bean);
			
		
		}catch(Exception err)
		{
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