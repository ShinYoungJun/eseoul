package main.java.jumyong.jumyong.web;


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
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.service.*;


import main.java.common.util.*;
import main.java.common.util.catUtil.Pageing;

public class JumyongHistoryFormControl extends SimpleFormController {	
	
  	/**
  	 * inspect 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
	private	Pageing				pageing			= new Pageing();
	
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public JumyongHistoryFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		ProductBean pb = new ProductBean();
		List historyList = new ArrayList();
		String strFormView = null;
		
		try{
			if(userId != null){				
				
				
				String adminNo = ServletRequestUtils.getStringParameter(request,"ADMIN_NO","");		
				String mode = ServletRequestUtils.getStringParameter(request,"mode","");
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				
				//String strSuccessView = "redirect:/jumyong/jumyong/history_view.do?ADMIN_NO="+adminNo;
				
				request.setAttribute("ADMIN_NO", adminNo);
				
				// 이력정보 count
//				int listCount = objJumyongService.getHistoryListCount(adminNo);
//				
//				int	rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);
//				
//				historyList = objJumyongService.getHistoryList(adminNo , rowCol, rowCol+3);
				
				if(!mode.equals("view"))
				{
//							
////					disUseBean = objJumyongService.disUseInfo(adminNo);
////					if(disUseBean.getDISUSE_MANAGER() == null && disUseBean.getDISUSE_DATE() == null && disUseBean.getDISUSE_REASON() == null)
////						mode = "edit";
				}
				
				request.setAttribute("mode", mode);
				
				//setSuccessView(strSuccessView);
//				String strFormview = "history_register";
//				System.out.println("strFormview=== " + strFormview);
//				setFormView(strFormview);
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}			
		
		return pb;
		
	}

	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {
		try
		{	
			ProductBean pb = (ProductBean)command;
			
			String adminNo = ServletRequestUtils.getStringParameter(request,"ADMIN_NO");
			String mode = ServletRequestUtils.getStringParameter(request,"mode","");
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			
			pb.setADMIN_NO(adminNo);

			// 등록
			if ( mode != null && "add".equals(mode) ){
				
				objJumyongService.insertHistoryInfo(pb);
			}
			// 수정
			else{
				
			}
			//objJumyongService.disUseUpdate(disUseBean);
			
		
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}		
		
		return new ModelAndView(getSuccessView());
	}
	
}