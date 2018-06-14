package main.java.gapan.jumyong.web;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;

import main.java.gapan.jumyong.model.DisUseBean;
import main.java.gapan.jumyong.service.*;
import main.java.gapan.jumyong.model.ProductBean;

import main.java.common.util.catUtil.Util;

public class DisUseFormControl extends SimpleFormController {	
	
  	/**
  	 * inspect 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
			
	private	Util util = new Util();
	
	public void setGapan_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public DisUseFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {		
		
		String strFormView = null;
		
		
		String gapanNo = ServletRequestUtils.getStringParameter(request,"GAPAN_NO","");		
		String mode = ServletRequestUtils.getStringParameter(request,"mode","");
		String SECTION = ServletRequestUtils.getStringParameter(request,"SECTION");
		String flag = ServletRequestUtils.getStringParameter(request,"flag","");
		
		String strFormview = "/gapan/jumyong/disuse";
		setFormView(strFormview);
		String strSuccessView = "redirect:/gapan/jumyong/disUse.do?GAPAN_NO="+gapanNo+"&mode=view";
		
		request.setAttribute("GAPAN_NO", gapanNo);
		request.setAttribute("SECTION", SECTION);
				
		
		DisUseBean disUseBean = new DisUseBean();
		
		if(!mode.equals("view"))
		{
			System.out.println("mode가 view가 아닌....");		
			System.out.println("GAPAN_NO::"+gapanNo);
			disUseBean = objJumyongService.disUseInfo(gapanNo);
			if(disUseBean.getDISUSE_MANAGER() == null && disUseBean.getDISUSE_DATE() == null && disUseBean.getDISUSE_REASON() == null){
				mode = "edit";
			}else if(mode.equals("del")){
				System.out.println("삭제모드");
				objJumyongService.disuseCancel(gapanNo);
				request.setAttribute("afterSave","1");
			}
		}
		
		request.setAttribute("mode", mode);
		request.setAttribute("flag", flag);
		
		setSuccessView(strSuccessView);
		
		
		return disUseBean;
		
	}

	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception{
		try
		{	
			DisUseBean disUseBean = (DisUseBean)command;
			
			String gapanNo = ServletRequestUtils.getStringParameter(request,"GAPAN_NO");
			
			
			//1. history_info 테이블 insert			
			ProductBean pb = new ProductBean();
			pb.setGAPAN_NO(gapanNo);
			String max_seq = objJumyongService.getHistoryMaxSeq(pb);
			pb.setSEQ(max_seq);
			pb.setWORK_NM(disUseBean.getDISUSE_MANAGER());
			pb.setSAYU(disUseBean.getDISUSE_REASON());
			pb.setGU_CODE(gapanNo.substring(0,3));
			
			if( disUseBean.getDISUSE_DATE() != null && !"".equals(disUseBean.getDISUSE_DATE()) ){
				pb.setWRITEDATE(util.Date_Cut(disUseBean.getDISUSE_DATE()));
			}
			
			objJumyongService.insertHistoryInfo(pb);
			System.out.println("@@@@@@@@@@@@@@");
			// 2. place 테이블 update 
			disUseBean.setGAPAN_NO(gapanNo);
			disUseBean.setSECTION("4"); 		// 폐쇄코드 4
			objJumyongService.disUseUpdate(disUseBean);
			
			// 3. admin_base 테이블 update
			objJumyongService.Admin_baseUp_dateUpdateQuery(util.Date_Cut(disUseBean.getDISUSE_DATE()) ,disUseBean.getGAPAN_NO());
			System.out.println("getSuccessView()::::"+getSuccessView());
		}catch(Exception err)
		{
			err.printStackTrace();
		}		
		
		return new ModelAndView(getSuccessView()+"&flag=success");
	}
	
}