package jeus_jspwork._jsp._admin._section;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_register_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return null;
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
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
      // jsp code [from=(68,9);to=(68,12)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(69,22);to=(69,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(71,9);to=(71,11)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(93,53);to=(93,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(94,51);to=(94,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(95,63);to=(95,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${modyGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(96,69);to=(96,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${modyGUGAN_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(115,10);to=(115,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(119,110);to=(119,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SectionBean.GUGAN_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(122,115);to=(122,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SectionBean.GUGAN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template16);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template18);

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
  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode=='add'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template15);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_1.setPageContext(pageContext);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode=='modify'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template17);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>구간명 설정</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody,td,th {\r\n\tfont-family: 돋움;\r\n\tfont-size: 12px;\r\n\tcolor: #053e8a;\r\n}\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n\tmargin-right: 0px;\r\n\tmargin-bottom: 0px;\r\n}\r\n.style1 {color: #000000}\r\n.style3 {color: #FF6600; font-weight: bold; }\r\n\r\n-->\r\n</style>\r\n<script language=\"JavaScript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\">\r\n//<!--\r\n \tfunction register()\r\n\t{ \t\t\r\n \t\tvar w = document.form;\r\n \t\t\r\n \t \t\t\r\n\t\tif(siguCheck(w.GU_CD.value)){\r\n\t\t\tif(w.GUGAN_CD.value ==\"\"){\r\n\t\t\t\talert(\"구간번호를 입력해주세요\");\r\n\t\t\t\tw.GUGAN_CD.focus();\r\n\t\t\t\treturn\r\n\t\t\t}\r\n\t\t\tif(w.GUGAN_CD.value <= 0 ){\r\n\t\t\t\talert(\"구간번호는 0 보다 큰 정수를 입력하셔야 합니다.\");\r\n\t\t\t\tw.GUGAN_CD.focus();\r\n\t\t\t\treturn\r\n\t\t\t}\r\n\t\t\tif(getByteLength(w.GUGAN_NAME)>20){\r\n\t\t\t\talert(\"구간명은 20Byte 를 초과할 수 없습니다.\\r\\n(한글2byte, 영문/숫자 1byte)\");\r\n\t\t\t\tw.GUGAN_NAME.focus();\r\n\t\t\t\treturn\r\n\t\t\t}\t\t\t\r\n\t\t\tw.submit();\r\n\t\t}else{\r\n\t\t\tw.GU_CD.focus();\r\n\t\t\treturn\r\n\t\t}\t\t\r\n\t\t\r\n\t}\r\n\r\n\tfunction cancel(){\r\n\t\twindow.close();\r\n\t}\r\n\t\t\r\n\tfunction InitPage(){\t\t\r\n\t\tif('";
  private final static String _jspx_template5 = "'.length > 0){\r\n            alert('";
  private final static String _jspx_template6 = "');\r\n        }\r\n\t\tif('";
  private final static String _jspx_template7 = "'== 'true'){\r\n\t\t\topener.location.reload('/admin/section/list.do'); \r\n\t\t\twindow.close();\r\n        }\t\r\n    }\r\n\tfunction  siguCheck(gu_cd)\r\n\t{\t\r\n\t\tif(gu_cd==\"000\"){\r\n\t\t\talert(\"시군구명을 선택해주세요.\");\r\n\t\t\treturn false;\r\n\t\t}else{\r\n\t\t\treturn true;\r\n\t\t}\r\n\t}\r\n    \r\n\t\r\n//-->\r\n</script>\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n<form name=\"form\" method=\"post\" action=\"/admin/section/register.do\">\r\n<input type=\"hidden\" id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template8 = "\"/>\r\n<input type=\"hidden\" id=\"MSG\" name=\"MSG\" value=\"";
  private final static String _jspx_template9 = "\"/>\r\n<input type=\"hidden\" id=\"modyGU_CD\" name=\"modyGU_CD\" value=\"";
  private final static String _jspx_template10 = "\"/>\r\n<input type=\"hidden\" id=\"modyGUGAN_CD\" name=\"modyGUGAN_CD\" value=\"";
  private final static String _jspx_template11 = "\"/>\t\r\n<table width=\"580\" height=\"130\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t<tr>\r\n\t\t<td height=\"30px\" style=\"padding:6\" valign=\"bottom\"><span class=\"sub_stan_blue\"><b>* 구간명 설정 </b></span></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td style=\"padding:6\" valign=\"top\">\r\n\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구간번호</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구간명</td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t</tr>\r\n\t\t\t\t <tr>\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t<td height=\"26\" align=\"center\">\r\n\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template12 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t제 <input type=\"text\" name=\"GUGAN_CD\" id=\"GUGAN_CD\" size=\"5\" maxlength=\"3\" class=\"input_form1\" value=\"";
  private final static String _jspx_template13 = "\" onchange=\"isNum(this,'구간번호')\"/> 구간\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<input type=\"text\" name=\"GUGAN_NAME\" id=\"GUGAN_NAME\" size=\"20\"  maxlength=\"20\" class=\"input_form1\" value=\"";
  private final static String _jspx_template14 = "\"/>\t\t\t\t\t \r\n\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t<img src=\"/img/register_icon2.gif\" alt=\"등록\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:register()\">\r\n\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:register()\">\r\n\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:cancel()\">\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n\t\t\t";
}
