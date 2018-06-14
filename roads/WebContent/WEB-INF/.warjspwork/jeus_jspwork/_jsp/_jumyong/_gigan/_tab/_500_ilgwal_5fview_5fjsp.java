package jeus_jspwork._jsp._jumyong._gigan._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_ilgwal_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/include.jsp",
      "/jsp/common/loginCheck.jsp"
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
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template8);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template9);
      // jsp code [from=(64,50);to=(64,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(65,47);to=(65,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(67,45);to=(67,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(68,45);to=(68,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(69,49);to=(69,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(70,45);to=(70,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(71,44);to=(71,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(72,43);to=(72,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(73,46);to=(73,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMINNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(74,43);to=(74,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(75,46);to=(75,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(76,48);to=(76,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OWNER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(77,46);to=(77,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(78,44);to=(78,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(79,44);to=(79,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(86,74);to=(86,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template37);
      // jsp code [from=(122,7);to=(122,14)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template26);
            // jsp code [from=(104,48);to=(104,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(105,64);to=(105,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(106,26);to=(106,39)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(107,26);to=(107,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(108,26);to=(108,36)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(109,26);to=(109,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMYONGJI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(110,26);to=(110,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CLASS}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(110,49);to=(110,67)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_SORT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(110,71);to=(110,89)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_KIND}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(111,26);to=(111,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GIGAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);

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
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n           \r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tform.action = \"ilgwal_view.do?currentPage=\" + page;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tView(adminno, seq)\r\n\t{\r\n\r\n\t}\r\n\r\n\tfunction\tSave()\r\n\t{\r\n\t//\tif(page\t==\t\"\")\r\n\t//\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tform.action = \"gigan_register.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"currentPage\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" name=\"TOTALCNT\" value=\"";
  private final static String _jspx_template11 = "\">\r\n\r\n<input type=\"hidden\" name=\"GIGAN1\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" name=\"GIGAN2\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" name=\"NAME\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" name=\"ADMINNO\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" name=\"TYPE\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" name=\"SECTION\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" name=\"OWNER_SET\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" name=\"TAX_SET\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template23 = "\">\r\n<input type=\"hidden\" name=\"HJ_CD\" value=\"";
  private final static String _jspx_template24 = "\">\r\n\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n     \t\r\n        <tr>\r\n\t\t\t<td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template25 = "</span> 건 </td>\r\n        </tr>\r\n\t      \r\n       <tr>\r\n         <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n             <tr>\r\n               <td width=\"30\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n               <td width=\"70\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n               <td width=\"50\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>종류</td>\r\n               <td width=\"50\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>구분</td>\r\n               <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인</td>\r\n               <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지</td>\r\n               <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n               <td width=\"150\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>         \r\n             </tr>\r\n             \r\n             ";
  private final static String _jspx_template26 = "\r\n             <tr>\r\n             \t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t\t\t<td align=\"center\"><script>var adminno = nr_Adminno_Cut(\"";
  private final static String _jspx_template28 = "\"); document.write(adminno);</script></td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template30 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template31 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template33 = " ";
  private final static String _jspx_template34 = " ";
  private final static String _jspx_template35 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template36 = "</td>\r\n             </tr>\r\n\t\t\t";
  private final static String _jspx_template37 = "\r\n\t\t \r\n\t\t </table>\r\n\t\t </td>\r\n\t    </tr>\r\n\t\t\r\n\t\t<tr>\r\n\t\t  <td height=\"30\" align=\"center\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t</tr>\r\n\t\t  </table></td>\r\n\t\t</tr>\r\n\t\t\r\n\r\n\t</table></td>\r\n  </tr>\r\n\r\n</table>\r\n\r\n</body>\r\n\r\n</html>";
}
