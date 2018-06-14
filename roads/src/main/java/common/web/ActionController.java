package main.java.common.web;

import 	javax.servlet.http.HttpServletRequest;
import 	javax.servlet.http.HttpServletResponse;
import 	org.apache.commons.logging.Log;
import 	org.apache.commons.logging.LogFactory;
import 	org.springframework.web.servlet.ModelAndView;
import 	org.springframework.web.servlet.mvc.Controller;

public class ActionController	implements	Controller {
	protected	final	Log	logger = LogFactory.getLog(getClass());
	
	public ModelAndView handleRequest(HttpServletRequest request,
		HttpServletResponse response) throws Exception
	{
		logger.info("Spring Start!!");
		request.setAttribute("name", "Å×½ºÆ®");
		
		return new ModelAndView("jsp/common/main.jsp");
	//	return new ModelAndView("jsp/hello.jsp");
	}
}
