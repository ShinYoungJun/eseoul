package jeus_jspwork._jsp._jumyong._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumyong_5fresult_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template27);

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
  private boolean _jspx_th_c_choose_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_0.setPageContext(pageContext);
    try {
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template10);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template12);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template26);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_0.setPageContext(pageContext);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${adminNo == ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template11);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_0.setPageContext(pageContext);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
      if (_jspx_eval_c_otherwise_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template13);
          // jsp code [from=(25,62);to=(25,76)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template14);
          // jsp code [from=(29,63);to=(29,73)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template15);
          // jsp code [from=(33,63);to=(33,72)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template16);
          // jsp code [from=(38,63);to=(38,80)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.APPEAL_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template17);
          // jsp code [from=(42,63);to=(42,78)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template18);
          // jsp code [from=(44,63);to=(44,81)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template19);
          // jsp code [from=(48,63);to=(48,81)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template20);
          // jsp code [from=(52,63);to=(52,79)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template21);
          // jsp code [from=(56,63);to=(56,78)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template22);
          // jsp code [from=(60,63);to=(60,80)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERIOD_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template23);
          // jsp code [from=(64,63);to=(64,77)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CLASS_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template24);
          // jsp code [from=(68,63);to=(68,78)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template25);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<link href=\"/css/Mroads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<body>\r\n";
  private final static String _jspx_template10 = "\r\n";
  private final static String _jspx_template11 = "\r\n<br>\r\n<br>\r\n<font style='font-family: 돋움;font-size: 12px;color: gray;'>&nbsp;&nbsp;&nbsp;상세정보를 확인할 점용지를 클릭하세요.</font>\r\n";
  private final static String _jspx_template12 = "\r\n";
  private final static String _jspx_template13 = "\r\n<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td>\r\n\t\t<table width=\"235px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"70px\"  height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인명</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"22px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">";
  private final static String _jspx_template16 = "\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자주소</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"70px\" height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n\t\t\t\t<td width=\"48px\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t<td width=\"70px\" height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t<td width=\"47px\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지지번</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로지번</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">";
  private final static String _jspx_template24 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"22px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">";
  private final static String _jspx_template25 = " ㎡/개</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n";
  private final static String _jspx_template26 = "\r\n";
  private final static String _jspx_template27 = "\r\n</body>\r\n</html>";
}
