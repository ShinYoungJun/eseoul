//	2009		Kim Yun Seo

package main.java.junggi.gigan.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.junggi.gigan.model.AppealBean;
import main.java.junggi.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabJumin_Control	extends MultiActionController{

	private	IGiganService		iGiganervice	= null;
//	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
		

	public void setJunggi_giganService(IGiganService junggi_giganService) 
	{
		this.iGiganervice = junggi_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
//		this.commonCode 	= commonCode;
	}
	
	
	//	������ ����
	public ModelAndView 	Jumin_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
	//	System.out.println(adminno);
		
		List		list 	= iGiganervice.executeJumin_View(adminno);
		
		AppealBean	Bean	= new AppealBean();
		
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
		
		request.setAttribute("ADMIN_NO", adminno);
		
		return new ModelAndView("/junggi/gigan/tab/jumin_view", "board", Bean);
	}
}
