package main.java.rojum.jumyong.web;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;

import main.java.rojum.jumyong.model.DisUseBean;
import main.java.rojum.jumyong.model.GapanBaseBean;
import main.java.rojum.jumyong.service.*;
import main.java.rojum.jumyong.model.ProductBean;

import main.java.common.commonCode.model.UserBean;
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
	
	public void setRojum_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public DisUseFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {		
		
		String strFormView = null;
		
		
		String adminNo = ServletRequestUtils.getStringParameter(request,"ADMIN_NO","");		
		String mode = ServletRequestUtils.getStringParameter(request,"mode","");
		String SECTION = ServletRequestUtils.getStringParameter(request,"SECTION");
		
		String strFormview = "/rojum/jumyong/disuse";
		setFormView(strFormview);
		String strSuccessView = "redirect:/rojum/jumyong/disUse.do?ADMIN_NO="+adminNo+"&mode=view";
		
		request.setAttribute("ADMIN_NO", adminNo);
		request.setAttribute("SECTION", SECTION);
				
		
		DisUseBean disUseBean = new DisUseBean();
		
		if(!mode.equals("view"))
		{	
			disUseBean = objJumyongService.disUseInfo(adminNo);
			if((disUseBean.getDISUSE_MANAGER() == null || disUseBean.getDISUSE_MANAGER().equals(""))
					&& (disUseBean.getDISUSE_DATE() == null || disUseBean.getDISUSE_DATE().equals(""))
					&& (disUseBean.getDISUSE_REASON() == null || disUseBean.getDISUSE_REASON().equals(""))){
				mode = "edit";
			
			}else if(mode.equals("del")){
				System.out.println("삭제모드");
				objJumyongService.disuseCancel(adminNo);
				request.setAttribute("afterSave","1");
			}
		}
		
		
		request.setAttribute("mode", mode);
		
		setSuccessView(strSuccessView);
		
		
		return disUseBean;
		
	}

	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception{
		try
		{	
			DisUseBean disUseBean = (DisUseBean)command;
			
			String adminNo = ServletRequestUtils.getStringParameter(request,"ADMIN_NO");
			
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			
			
			
			//1. history_info 테이블 insert			
			ProductBean pb = new ProductBean();
			pb.setADMIN_NO(adminNo);
			String max_seq = objJumyongService.getHistoryMaxSeq(pb);
			pb.setSEQ(max_seq);
			pb.setWORK_NM(disUseBean.getDISUSE_MANAGER());
			pb.setSAYU(disUseBean.getDISUSE_REASON());
			pb.setGU_CODE(adminNo.substring(0,3));
			
			if( disUseBean.getDISUSE_DATE() != null && !"".equals(disUseBean.getDISUSE_DATE()) ){
				pb.setWRITEDATE(util.Date_Cut(disUseBean.getDISUSE_DATE()));
			}
			
			objJumyongService.insertHistoryInfo(pb);
			System.out.println("@@@@@@@@@@@@@@");
			// 2. place 테이블 update 
			disUseBean.setADMIN_NO(adminNo);
			disUseBean.setSECTION("4"); 		// 폐쇄코드 4
			objJumyongService.disUseUpdate(disUseBean);
			
			// 3. admin_base 테이블 update
			GapanBaseBean bean = new GapanBaseBean();
			bean.setCLOSE_DATE(util.Date_Cut(disUseBean.getDISUSE_DATE()));
			bean.setFINISH_ID(userId);
			bean.setGAPAN_NO(adminNo);

			objJumyongService.GapanBaseUpdate(bean);
			
			System.out.println("getSuccessView()::::"+getSuccessView());
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}		
		
		return new ModelAndView(getSuccessView());
	}
	
}