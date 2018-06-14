package main.java.jumyong.jumyong.web;


import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.model.BoardFileBean;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.UUID;



import java.text.SimpleDateFormat;
import java.util.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;

import main.java.common.util.*;

import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.service.*;


import main.java.common.util.*;
import main.java.common.util.catUtil.Util;

public class DisUseFormControl extends SimpleFormController {	
	
  	/**
  	 * inspect 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	public DisUseFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		DisUseBean disUseBean = new DisUseBean();
		
		System.out.println("DisUseFormControl : formBackingObject");
		
		try{
			if(userId != null){
				
                // 현년도 계산
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String thisDate = formatter.format(cal.getTime());
                String thisYear = thisDate.substring(0, 4);
                
                
				String strFormView = null;
				
				
				String adminNo = ServletRequestUtils.getStringParameter(request,"ADMIN_NO","");		
				String mode = ServletRequestUtils.getStringParameter(request,"mode","");
				String SECTION = ServletRequestUtils.getStringParameter(request,"SECTION");
				String afterSave = ServletRequestUtils.getStringParameter(request,"afterSave");
				
				String strFormview = "/jumyong/jumyong/disuse";
				setFormView(strFormview);
				
				String strSuccessView = "redirect:/jumyong/disUse.do?ADMIN_NO="+adminNo+"&SECTION="+SECTION;
				
				request.setAttribute("ADMIN_NO", adminNo);
				
				request.setAttribute("toDate", util.Date_Paste(thisDate));
				request.setAttribute("afterSave", afterSave);
				
				
				if(mode.equals("del")){
					
					UserBean	userBean	= new UserBean();
					userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
					String name = userBean.getNAME();
					
					//1. history_info 테이블 insert			
					ProductBean pb = new ProductBean();
					pb.setADMIN_NO(adminNo);
					String max_seq = objJumyongService.getHistoryMaxSeq(pb);
					pb.setSEQ(max_seq);
					pb.setWORK_NM(name);
					pb.setSAYU("");
					pb.setGU_CODE(adminNo.substring(6,9));
					pb.setWRITEDATE(thisDate);
					pb.setGUNGE("폐쇄해지");
					objJumyongService.insertHistoryInfo(pb);
					
					objJumyongService.disUseDelete(adminNo);
					request.setAttribute("afterSave", "1");
				}
				
				disUseBean = objJumyongService.disUseInfo(adminNo);
				if(disUseBean.getDISUSE_MANAGER() == null && disUseBean.getDISUSE_DATE() == null && disUseBean.getDISUSE_REASON() == null){
					mode = "new";
				}else{
					disUseBean.setDISUSE_DATE(util.Date_Paste(disUseBean.getDISUSE_DATE()));
				}
				
				request.setAttribute("SECTION", disUseBean.getSECTION());
				request.setAttribute("mode", mode);
				
				setSuccessView(strSuccessView);
			}
		}catch(Exception e){
			System.out.println("에러 formb:"+e.toString());
		}			
		
		return disUseBean;
		
	}

	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception	 {
		try
		{	
			DisUseBean disUseBean = (DisUseBean)command;
			String adminNo = ServletRequestUtils.getStringParameter(request,"ADMIN_NO","");		
			String mode = ServletRequestUtils.getStringParameter(request,"mode","");		

			
			System.out.println("ADMIN_NO" + adminNo);
			System.out.println("mode :::" + mode+"::");

			if(mode.equals("edit")){
				//1. history_info 테이블 insert			
				ProductBean pb = new ProductBean();
				pb.setADMIN_NO(adminNo);
				String max_seq = objJumyongService.getHistoryMaxSeq(pb);
				pb.setSEQ(max_seq);
				pb.setWORK_NM(disUseBean.getDISUSE_MANAGER());
				pb.setSAYU(disUseBean.getDISUSE_REASON());
				pb.setGU_CODE(adminNo.substring(6,9));
				if( disUseBean.getDISUSE_DATE() != null && !"".equals(disUseBean.getDISUSE_DATE()) ){
					pb.setWRITEDATE(util.Date_Cut(disUseBean.getDISUSE_DATE()));
				}
				pb.setGUNGE("폐쇄내용수정");
				objJumyongService.insertHistoryInfo(pb);
			}else if(mode.equals("new")){
				//1. history_info 테이블 insert			
				ProductBean pb = new ProductBean();
				pb.setADMIN_NO(adminNo);
				String max_seq = objJumyongService.getHistoryMaxSeq(pb);
				pb.setSEQ(max_seq);
				pb.setWORK_NM(disUseBean.getDISUSE_MANAGER());
				pb.setSAYU(disUseBean.getDISUSE_REASON());
				pb.setGU_CODE(adminNo.substring(6,9));
				if( disUseBean.getDISUSE_DATE() != null && !"".equals(disUseBean.getDISUSE_DATE()) ){
					pb.setWRITEDATE(util.Date_Cut(disUseBean.getDISUSE_DATE()));
				}
				pb.setGUNGE("폐쇄적용");
				objJumyongService.insertHistoryInfo(pb);
			}
			
			
			
			// 2. place 테이블 update
			disUseBean.setADMIN_NO(adminNo);
			disUseBean.setSECTION("4"); 		// 폐쇄코드 4
			objJumyongService.disUseUpdate(disUseBean);
			// 3. admin_base 테이블 update
			objJumyongService.Admin_baseUp_dateUpdateQuery(util.Date_Cut(disUseBean.getDISUSE_DATE()) ,disUseBean.getADMIN_NO());
			
			
			request.setAttribute("ADMIN_NO", adminNo);
					
			
		}catch(Exception err)
		{
			System.out.println("에러"+err.toString());
		}		
		setSuccessView(getSuccessView().toString()+"&afterSave=1");
		
		System.out.println(getSuccessView().toString());
		
		return new ModelAndView(getSuccessView());
	}
	
}