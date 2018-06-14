//	2009		Kim Yun Seo

package main.java.jumyong.saewe.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.jumyong.saewe.model.AppealBean;
import main.java.jumyong.saewe.model.TaxationBean;
import main.java.jumyong.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabJumin_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
//	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
		

	public void setJumyong_saeweService(ISaeweService jumyong_saeweService) 
	{
		this.iSaeweService = jumyong_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
//		this.commonCode 	= commonCode;
	}
	
	
	//	점용인 정보
	public ModelAndView 	Jumin_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");			
		AppealBean	Bean	= new AppealBean();
		
		System.out.println("tab.Tabjumin_contro(juminview)");
		System.out.println("tab.Tabjumin_contro(juminview)");
		System.out.println("tab.Tabjumin_contro(juminview)");
		System.out.println("tab.Tabjumin_contro(juminview)");
		
		try{
			if(userId != null){
				
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
			//	System.out.println(adminno);
				
				//	점용인 정보를 데이블에서 가져온다.
				List		list 	= iSaeweService.executeJumin_View(adminno);								
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (AppealBean)list.get(0);
					
					//	"-" 추가
					//	SSN
					List	ssn	= util.SubString_SSN(Bean.getSSN());
					if(!ssn.get(0).equals(""))
						Bean.setSSN(ssn.get(0) + "-" + ssn.get(1));
				//	request.setAttribute("jumin_ssn1", ssn.get(0));
				//	request.setAttribute("jumin_ssn2", ssn.get(1));
					
					//	BIZSSN
					List	bizssn	= util.SubString_BIZSSN(Bean.getBIZSSN());
					if(!bizssn.get(0).equals(""))
						Bean.setBIZSSN(bizssn.get(0) + "-" + bizssn.get(1) + "-" + bizssn.get(2));
				//	request.setAttribute("jumin_bizssn1", bizssn.get(0));
				//	request.setAttribute("jumin_bizssn2", bizssn.get(1));
				//	request.setAttribute("jumin_bizssn3", bizssn.get(2));
				}
				
				request.setAttribute("ADMIN_NO", adminno);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/saewe/tab/jumin_view", "board", Bean);
	}
}
