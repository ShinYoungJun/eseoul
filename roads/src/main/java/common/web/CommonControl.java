/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.10
				*�����ۼ��� :  mylee
				*�ֿ�ó������ : ������ ��û�� ���� ���丮,Ȯ���ڸ� ÷����Ų��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/
 
package main.java.common.web;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonControl implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String contextPath = request.getContextPath();
		String uri = request.getRequestURI(); 

		if (logger.isDebugEnabled()) {
			logger.debug("URI : " + uri);
			logger.debug("ContextPath : " + contextPath);
		}

		int begin = 0;
		if ((contextPath == null) || (contextPath.equals(""))) {
			begin = 1;
		} else {
			begin = contextPath.length() + 1;
		}

		if (logger.isDebugEnabled()) {
			logger.debug("Begin : " + begin);
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}
		String fileName = uri.substring(begin, end);
		if (fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
		}

		for (Enumeration en = request.getParameterNames(); en.hasMoreElements();) {
			String attribute = (String) en.nextElement();
			Object attributeValue = request.getParameter(attribute);

			if (logger.isDebugEnabled()) {
				logger.debug("set Attribute in Request : " + attribute + "="
						+ attributeValue);
			}

			request.setAttribute(attribute, attributeValue);
		}

		return new ModelAndView("/"+fileName);
	}
}
