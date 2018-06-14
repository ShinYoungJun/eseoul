
package main.java.facility.saewe.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;
import main.java.facility.saewe.model.AppealBean;
import main.java.facility.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabJumin_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
//	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
		

	public void setFacility_saeweService(ISaeweService facility_saeweService) 
	{
		this.iSaeweService = facility_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
//		this.commonCode 	= commonCode;
	}
	
	
	//	점용인 정보
	public ModelAndView 	Jumin_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId			= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		AppealBean	Bean		= new AppealBean();
		
		try{
			if(userId != null){
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		//		String 		request_no 	= ServletRequestUtils.getStringParameter(request, "request_no", "");
		
				list 	= iSaeweService.executeJumin_View(gu_code,corp_cd);
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (AppealBean)list.get(0);
					
					//	SSN
					List	ssn	= util.SubString_SSN(Bean.getSSN());
					if(!ssn.get(0).equals(""))
						Bean.setSSN(ssn.get(0) + "-" + ssn.get(1));
					
					//	BIZSSN
					List	bizssn	= util.SubString_BIZSSN(Bean.getBIZSSN());
					if(!bizssn.get(0).equals(""))
						Bean.setBIZSSN(bizssn.get(0) + "-" + bizssn.get(1) + "-" + bizssn.get(2));
					
					Bean.setREGDATE(util.Date_Paste(Bean.getREGDATE()));
				}
				
				request.setAttribute("ADMIN_NO", adminno);
				request.setAttribute("GU_CODE", gu_code);
				request.setAttribute("CORP_CD", corp_cd);
			
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/saewe/tab/jumin_view", "board", Bean);
	}
}
