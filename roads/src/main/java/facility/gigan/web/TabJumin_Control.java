
package main.java.facility.gigan.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;
import main.java.facility.gigan.model.AppealBean;
import main.java.facility.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabJumin_Control	extends MultiActionController{

	private	IGiganService		iGiganervice	= null;
//	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
		

	public void setFacility_giganService(IGiganService facility_giganService) 
	{
		this.iGiganervice = facility_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
//		this.commonCode 	= commonCode;
	}
	
	
	//	점용인 정보
	public ModelAndView 	Jumin_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		AppealBean	Bean	= new AppealBean();
		
		try{
			if(userId != null){
				String 		corpCd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
				String 		guCode 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				
				list 	= iGiganervice.executeJumin_View(corpCd,guCode);
				System.out.println("list="+list);
				
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (AppealBean)list.get(0);
					
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
				
				request.setAttribute("CORP_CD", corpCd);
				request.setAttribute("GU_CODE", guCode);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	

		return new ModelAndView("/facility/gigan/tab/jumin_view", "board", Bean);
	}
}
