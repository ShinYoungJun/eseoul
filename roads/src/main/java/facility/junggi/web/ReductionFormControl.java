
package main.java.facility.junggi.web;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;



import main.java.facility.jumyong.model.Equip_ProductBean;



import main.java.facility.junggi.service.*;

public class ReductionFormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJunggiService objJunggiService = null;
		
	
	public void setJunggiService_facility(IJunggiService newObjJunggiService) {
		this.objJunggiService = newObjJunggiService;
	}
	
	public ReductionFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {
		Equip_ProductBean pb = new Equip_ProductBean();
		
		try
		{
			String cal_sum_seq = ServletRequestUtils.getStringParameter(request,"cal_sum_seq","");
			String mode = ServletRequestUtils.getStringParameter(request,"mode","");
			
			String redirect = ServletRequestUtils.getStringParameter(request,"redirect","");
			
			request.setAttribute("cal_sum_seq",cal_sum_seq);
			request.setAttribute("mode",mode);
			request.setAttribute("redirect",redirect);
			
			String strFormView = "/facility/junggi/tab/info_reduction";
			setFormView(strFormView);
			
	//		페이지 성공후 돌아갈 페이지
			setSuccessView("redirect:/facility/junggi/reduction.do?cal_sum_seq="+cal_sum_seq+"&redirect=1");
			
	//		reduction정보
		    pb = objJunggiService.GetReductionInfo(cal_sum_seq);
		}catch(Exception err)
		{
			
		}
		
		return pb;
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception	 {
		try
		{
			//입력 수정 위해 mode를 가지고 옴		
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			//String cal_sum_seq = ServletRequestUtils.getStringParameter(request,"cal_sum_seq");
			
			Equip_ProductBean objProductBean = (Equip_ProductBean)command;
			
			//objProductBean.setSEQ(cal_sum_seq);
			
			if(mode.equals("add"))
			{
				objJunggiService.CalSumReductionUpdate(objProductBean);
			}
			else if(mode.equals("edit"))
			{
				
			}
			
		
		}catch(Exception err)
		{
			System.out.println("입력,수정에러="+err.toString());
		}
		
		return new ModelAndView(getSuccessView());
	}
	
	
	
}
