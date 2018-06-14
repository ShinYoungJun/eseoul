package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_deptCode_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/include.jsp"
    };
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse  response)
      throws ServletException, IOException {

    JspFactory	_jspxFactory = null;
    PageContext	pageContext = null;
    HttpSession	session = null;
    ServletContext	application = null;
    ServletConfig	config = null;
    JspWriter	out = null;
    Object		page = this;
    String		_value = null;

    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      pageContext = _jspxFactory.getPageContext(this, request, response, "/jsp/common/error.jsp", true, 8192, true);
      session = pageContext.getSession();
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();

      response.setContentType("text/html;charset=MS949");

      out.write(_jspx_template0);
      out.write(_jspx_template1);
      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      // jsp code [from=(75,47);to=(75,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${modeType}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template12);

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)) {
        if (out.getBufferSize() != 0) {
          try {
            out.clear();
          } catch (Exception _exc) { }
        }
        pageContext.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(pageContext);
    }
  }
  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${deptCdList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template9);
            // jsp code [from=(81,20);to=(81,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(81,37);to=(81,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.DEPT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);

          } while (_jspx_th_c_forEach_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_0.doCatch(t);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_0.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction getDeptCode(cd,obj)\r\n\t{\t\r\n\t\tvar w = document.listForm;\r\n\t\tw.siguCode.value = cd;\r\n\t\tw.modeType.value = obj;\r\n\t\t\r\n\t\tw.action = \"/admin/user/deptCode.do\";\t\t\r\n\t\tw.submit();\t\t\t\r\n\t} \r\n\t\r\n\t//부서코드 리스트를 update\r\n\tfunction fn_init()\r\n\t{ \t\r\n\t\tvar val = \"\";\r\n\t\tvar obj = document.listForm.deptCode;;\r\n\t\tvar modeType = document.listForm.modeType.value;\r\n\t\t\r\n\t\tif(\"list\" == modeType)\t\r\n\t\t\tval = parent.document.listForm.deptCode.value;\r\n\t\telse if(\"insert\" == modeType)\r\n\t\t\tval = parent.document.regForm.deptCode.value;\t\r\n\t\telse if(\"update\" == modeType)\r\n\t\t\tval = parent.document.regForm.deptCode.value;\t\r\n\t\telse\r\n\t\t\treturn;\r\n\t\t\r\n\t\tfor(i = 0 ; i < obj.options.length ; i++)\r\n\t\t{\r\n\t\t\tif(obj.options[i].value == val)\r\n\t\t\t{\r\n\t\t\t\tobj.options[i].selected = true;\r\n\t\t\t\treturn;\r\n\t\t\t}\t\r\n\t\t}\r\n\t}  \r\n\r\n\r\n\tfunction setDeptcd()\r\n\t{\r\n\t\tvar obj = document.listForm.deptCode.value;\r\n\t\tparent.document.getElementById(\"dept_cd\").innerHTML = obj;\r\n\t\r\n\t}\r\n\t          \r\n//]]>\r\n</script>\r\n\r\n<body onload=\"fn_init();\">\r\n<form name=\"listForm\" method=\"post\">\r\n<input name=\"siguCode\" id=\"siguCode\" value=\"\" type=\"hidden\">\r\n<input name=\"modeType\" type=\"hidden\" value=\"";
  private final static String _jspx_template8 = "\">\r\n<input name=\"deptCd\" id=\"deptCd\" value=\"\" type=\"hidden\">\r\n\t\r\n\t<select name=\"deptCode\" class=\"essential\" style=\"width:150px\" onchange=\"setDeptcd();\">\r\n\t\t<option value =\"\">부서선택</option>\r\n\t\t";
  private final static String _jspx_template9 = "\r\n\t\t<option value=\"";
  private final static String _jspx_template10 = "\">";
  private final static String _jspx_template11 = "</option>\r\n\t\t";
  private final static String _jspx_template12 = "\t\t\t\r\n\t</select>\r\n\t\t\r\n</form>\r\n</body>\r\n</html>\r\n\t\t\t\t";
}
