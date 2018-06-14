
package main.java.jumyong.junggi.web;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;



import main.java.jumyong.jumyong.model.ProductBean;



import main.java.jumyong.junggi.service.*;

public class ReductionFormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJunggiService objJunggiService = null;
		
	
	public void setJunggiService (JunggiService newObjJunggiService)
	{
		this.objJunggiService = newObjJunggiService;
	}
	
	
	public ReductionFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {
		ProductBean pb = new ProductBean();
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");							
		
		try{
			if(userId != null){
				
				String cal_sum_seq = ServletRequestUtils.getStringParameter(request,"cal_sum_seq","");
				String mode = ServletRequestUtils.getStringParameter(request,"mode","");
				
				String redirect = ServletRequestUtils.getStringParameter(request,"redirect","");
				String section = ServletRequestUtils.getStringParameter(request,"SECTION","");
				String ADMIN_NO = ServletRequestUtils.getStringParameter(request,"ADMIN_NO","");
				
				String defineTax =  ServletRequestUtils.getStringParameter(request,"defineTax");
				
				request.setAttribute("cal_sum_seq",cal_sum_seq);
				request.setAttribute("mode",mode);
				request.setAttribute("section", section);
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				
				request.setAttribute("defineTax",defineTax);
				
				
				
				request.setAttribute("redirect",redirect);
				
				String strFormView = "/jumyong/junggi/info_reduction";
				setFormView(strFormView);
				
		//		페이지 성공후 돌아갈 페이지
				setSuccessView("redirect:/jumyong/junggi/reduction.do?cal_sum_seq="+cal_sum_seq+"&redirect=1");
				
		//		reduction정보
			    pb = objJunggiService.GetReductionInfo(cal_sum_seq,ADMIN_NO);
				
			}
		}catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		
		return pb;
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {
		try
		{
			//입력 수정 위해 mode를 가지고 옴		
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			String section = ServletRequestUtils.getStringParameter(request,"section");
			//System.out.println("mode="+mode);
			String cal_sum_seq = ServletRequestUtils.getStringParameter(request,"cal_sum_seq");
			
			ProductBean objProductBean = (ProductBean)command;
			
			objProductBean.setSEQ(cal_sum_seq);
			
			if(mode.equals("add"))
			{
				// 무단이 아닌 감면율인경우 점용료 * (100-감면율)
				if( section!= null && !"3".equals(section)){
					
					objJunggiService.CalSumReductionUpdate(objProductBean);
				
				// 무단일 경우 점용료 * 지분율
				}else{
				
					objJunggiService.CalSumReductionUpdate_noPermission(objProductBean);
				}
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
