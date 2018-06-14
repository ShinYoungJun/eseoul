package main.java.common.zipCode.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.zipCode.service.IZipCodeService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class ZipCodeControl	extends MultiActionController{

	private	IZipCodeService		iZipCodeService	= null;

	public void setZipCodeService(IZipCodeService zipCodeService)
	{
		this.iZipCodeService = zipCodeService;
	}

	public	ModelAndView	ZipCode(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String strTown 			= ServletRequestUtils.getStringParameter(request, "town", "");
		String openerPost 	= ServletRequestUtils.getStringParameter(request, "openerPost", "");
		String openerAddr 		= ServletRequestUtils.getStringParameter(request, "openerAddr", "");
		String openerAddrNew 		= ServletRequestUtils.getStringParameter(request, "openerAddrNew", "");
		String openerSi 		= ServletRequestUtils.getStringParameter(request, "openerSi", "");
		String openerGun 		= ServletRequestUtils.getStringParameter(request, "openerGun", "");
		String openerDoro 		= ServletRequestUtils.getStringParameter(request, "openerDoro", "");
		String openerBd 		= ServletRequestUtils.getStringParameter(request, "openerBd", "");
		//********** BEGIN_현진_20120210
		String jibun 		= ServletRequestUtils.getStringParameter(request, "jibun", "");
		String jibu 		= ServletRequestUtils.getStringParameter(request, "jibu", "");
		//********** END_현진_20120210
		
		
		// added by samlee .
		request.setAttribute("mode", "result");
		request.setAttribute("town", strTown);
		
		request.setAttribute("openerPost", openerPost);
		request.setAttribute("openerAddr", openerAddr);
		request.setAttribute("openerAddrNew", openerAddrNew);
		request.setAttribute("openerSi", openerSi);
		request.setAttribute("openerGun", openerGun);
		request.setAttribute("openerDoro", openerDoro);
		request.setAttribute("openerBd", openerBd);		
		//********** BEGIN_현진_20120210
		request.setAttribute("jibun", jibun);
		request.setAttribute("jibu", jibu);
		//********** END_현진_20120210
		
		
		
	//	System.out.println(openerPost);
	//	System.out.println(openerAddr);
		
		if(strTown.equals("")	||	strTown == null)
			return	new ModelAndView("/common/zipCode/ZipCode", "zipCode", null);
		//********** BEGIN_현진_20120210
		return	new ModelAndView("/common/zipCode/ZipCode", "zipCode", iZipCodeService.executeZipCodeList(strTown, jibun, jibu));
		//********** END_현진_20120210
	}
}
