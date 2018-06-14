package jeus_jspwork._jsp._rojum._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_disuse_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/loginCheck.jsp",
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
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template1);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      out.write(_jspx_template8);
      out.write(_jspx_template9);
      // jsp code [from=(25,9);to=(25,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${afterSave}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(109,47);to=(109,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(110,42);to=(110,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(111,54);to=(111,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${InspectDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(112,53);to=(112,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(126,80);to=(126,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(128,81);to=(128,113)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(disuse.DISUSE_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template16);
      // jsp code [from=(132,80);to=(132,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_0.setPageContext(pageContext);
      _jspx_th_spring_bind_0.setPath("disuse.DISUSE_MANAGER");
      try {
        try {
          int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
          if (_jspx_eval_spring_bind_0 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template18);
              // jsp code [from=(166,135);to=(166,156)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template19);

            } while (_jspx_th_spring_bind_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_0.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_0.doCatch(t);
        } finally {
          _jspx_th_spring_bind_0.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_0.release();
      }

      out.write(_jspx_template20);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_1.setPageContext(pageContext);
      _jspx_th_spring_bind_1.setPath("disuse.DISUSE_DATE");
      try {
        try {
          int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
          if (_jspx_eval_spring_bind_1 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template21);
              // jsp code [from=(172,129);to=(172,161)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(disuse.DISUSE_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

              out.write(_jspx_template22);

            } while (_jspx_th_spring_bind_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_1.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_1.doCatch(t);
        } finally {
          _jspx_th_spring_bind_1.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_1.release();
      }

      out.write(_jspx_template23);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_2.setPageContext(pageContext);
      _jspx_th_spring_bind_2.setPath("disuse.DISUSE_REASON");
      try {
        try {
          int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
          if (_jspx_eval_spring_bind_2 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template24);
              // jsp code [from=(181,133);to=(181,153)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template25);

            } while (_jspx_th_spring_bind_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_2.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_2.doCatch(t);
        } finally {
          _jspx_th_spring_bind_2.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_2.release();
      }

      out.write(_jspx_template26);

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
  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

  }
  
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "    \r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script>\r\n\r\n\tfunction InitPage()\r\n\t{\r\n\t\tif('";
  private final static String _jspx_template10 = "' == '1'){\r\n\t\t\tparent.location.reload();\r\n\t\t}\r\n\t\t\r\n\t\tif(document.getElementById(\"mode\").value == \"edit\" )\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"view\").style.display = \"none\";\r\n\t\t\tdocument.getElementById(\"edit\").style.display= \"block\";\r\n\t\t}else\r\n\t\t{\t\t\r\n\t\t\tdocument.getElementById(\"edit\").style.display = \"none\";\r\n\t\t\tdocument.getElementById(\"view\").style.display = \"block\";\r\n\t\t}\r\n\t}\r\n\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\tvar disUseForm = document.disUseForm;\r\n\t\t\r\n\t\tif(disUseForm.DISUSE_MANAGER.value==\"\"){\r\n\t\t\talert(\"담당자를 넣어주세요\");\r\n\t\t\tdisUseForm.DISUSE_MANAGER.focus()\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(disUseForm.DISUSE_DATE.value==\"\"){\r\n\t\t\talert(\"등록일자를 넣어주세요\");\r\n\t\t\tpopUpCalendar(document.getElementById('calendar'), document.getElementById('DISUSE_DATE'), 'yyyymmdd');\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(disUseForm.DISUSE_REASON.value==\"\"){\r\n\t\t\talert(\"등록이유를  넣어주세요\");\r\n\t\t\tdisUseForm.DISUSE_REASON.focus()\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\r\n\t\tif(!confirm(\"폐쇄적용시 모든 기능에서 제외됩니다. 계속 진행하시겠습니까?\"))\r\n            return;\r\n\t\t\r\n\t\tvar param = parent.document.location;\r\n\r\n\t\tparent.document.location=param;\r\n\t\t\r\n\t\tdisUseForm.submit();\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t\r\n\t// 등록폼 체크\r\n\tfunction checkForm(){\r\n\t\tvar form1 = document.form1;\r\n\t\talert(form1.year.value);\r\n\r\n\t\tform1.submit();\r\n\t\t//\t특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴\r\n\t\t//\t\tw.content.value = w.content.value+' '+'\\n';\t\r\n\t\t\r\n\t}\r\n\t\r\n\tfunction goModify()\r\n\t{\r\n\t\tvar goUrl = \"/rojum/jumyong/disUse.do?ADMIN_NO=\"+document.getElementById(\"ADMIN_NO\").value+\"&mode=edit\";\r\n\t\tlocation.href(goUrl);\t\t\r\n\t}\r\n\r\n\tfunction goDelete()\r\n\t{\r\n\t\tif(!confirm(\"폐쇄적용을 해지하시겠습니까?\"))\r\n            return;\r\n\t\tvar goUrl = \"/rojum/jumyong/disUse.do?ADMIN_NO=\"+document.getElementById(\"ADMIN_NO\").value+\"&mode=del\";\r\n\t\tlocation.href(goUrl);\t\t\r\n\t}\r\n\r\n\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n\r\n<form name=\"disUseForm\" id=\"disUseForm\" method=\"post\" action =\"/rojum/jumyong/disUse.do\">\r\n\r\n<input name=\"ADMIN_NO\" id=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template11 = "\" type=\"hidden\" >\r\n<input name=\"mode\"  id = \"mode\" value=\"";
  private final static String _jspx_template12 = "\" type=\"hidden\" >\r\n<input name=\"InspectDate\"  id=\"InspectDate\" value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\" >\r\n<input name=\"OLD_SECTION\" id=\"OLD_SECTION\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\" >\r\n<input name=\"SECTION\" id=\"SECTION\" type=\"hidden\" >\r\n\r\n\r\n<div id=\"view\" style=\"width:100%;\">\r\n\t<table width=\"510\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t    \t<td>\t\t\t\t\t\t\t            \r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t        \t<tr>\r\n\t      \t\t\t<td>\r\n\t       \t\t\t<table width=\"100%\" border=\"0\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t        \t<tr>\r\n\t                    \t<td width=\"15%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t                    <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t\t\t\t<td width=\"15%\" width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일</td>\r\n\t       \t\t            <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>                \r\n\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">이유</td>\r\n\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t\t\t</tr>\t\t\t\t\t\t\r\n\t\t\t\t\t</table>\r\n\t\t            </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>              \r\n\t\t\t\t\t<td height=\"10\" align=\"right\" colspan=\"3\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>              \r\n\t\t\t\t\t<td height=\"10\" align=\"right\" colspan=\"3\">\r\n\t\t\t\t\t\t<img src=\"/img/discan_icon.gif\" alt=\"해지\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goDelete();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goModify();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>      \r\n\t</table>\r\n</div>\r\n\r\n<div id=\"edit\" style=\"width:100%;display:none;\">\r\n\t<table width=\"510\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t    \t<td>\t\t\t\t\t\t\t            \r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t        \t<tr>\r\n\t      \t\t\t<td>\r\n\t       \t\t\t<table width=\"100%\" border=\"0\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t        \t<tr>\r\n\t                    \t<td width=\"15%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t                    <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t                    ";
  private final static String _jspx_template18 = "\r\n\t\t\t\t                    <input name=\"DISUSE_MANAGER\" id=\"DISUSE_MANAGER\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template19 = "\" maxlength=\"20\">\r\n\t\t\t\t                ";
  private final static String _jspx_template20 = "\r\n\t\t\t                </td>\r\n\t\t\t\t\t\t\t<td width=\"15%\" width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일</td>\r\n\t       \t\t            <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t                    ";
  private final static String _jspx_template21 = "\t       \t\t            \r\n\t\t\t\t                    <input name=\"DISUSE_DATE\" id=\"DISUSE_DATE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template22 = "\" readonly>\r\n\t\t\t                    ";
  private final static String _jspx_template23 = "\r\n\t\t\t                    <img id=\"calendar\" src=\"/img/calendar_icon.gif\" style=\"cursor:pointer;vertical-align: middle;\" onclick=\"popUpCalendar(this, document.getElementById('DISUSE_DATE'), 'yyyymmdd');\">\r\n\t\t\t                </td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>                \r\n\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">이유</td>\r\n\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t                    ";
  private final static String _jspx_template24 = "\t\t                    \r\n\t\t\t                    \t<input name=\"DISUSE_REASON\" id=\"DISUSE_REASON\" type=\"text\" class=\"input_form1\" style=\"width:410px\" value=\"";
  private final static String _jspx_template25 = "\" maxlength=\"100\">\r\n\t\t                    \t";
  private final static String _jspx_template26 = "\r\n\t\t                    \t</td>\r\n\t\t                    \t\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t</table>\r\n\t\t            </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"20\" align=\"right\" colspan=\"4\">\r\n\t\t\t\t\t\t<img src=\"/img/apply_red.gif\" alt=\"적용\"  border=\"0\" onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\">&nbsp;\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>      \r\n\t</table>\r\n</div>\r\n</form>\r\n\r\n\r\n\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
