package jeus_jspwork._jsp._rojum._saewe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_misunap_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/environment_setting.jsp",
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
      // jsp code [from=(1,3);to=(12,1)]
      
         String MapServerIP="98.33.1.86";
         String MapServerPort="8080";
         String MapServerURL="http://"+MapServerIP+":"+MapServerPort;
         
         String WebServerIP=MapServerIP;
         String WebServerPort=MapServerPort;
         String WebServerURL="http://"+WebServerIP;
         
         String newMapAddr="/RoadsMap/MapService";//WEbtoB proxy process
         

      out.write(_jspx_template1);
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template2);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      out.write(_jspx_template8);
      out.write(_jspx_template9);
      out.write(_jspx_template10);
      // jsp code [from=(43,21);to=(43,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CAL_MODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(106,67);to=(106,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(107,61);to=(107,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(109,59);to=(109,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(110,59);to=(110,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(111,63);to=(111,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(164,89);to=(164,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template56);

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
            out.write(_jspx_template18);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template55);

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

  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_DATE != '0000-00-00'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template19);
          // jsp code [from=(201,50);to=(201,64)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template20);
          // jsp code [from=(201,71);to=(201,80)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template21);
          // jsp code [from=(201,86);to=(201,100)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_MODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template22);
          // jsp code [from=(201,106);to=(201,121)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template23);
          // jsp code [from=(202,71);to=(202,85)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template24);
          // jsp code [from=(203,56);to=(203,66)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template25);
          // jsp code [from=(204,56);to=(204,68)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template26);
          // jsp code [from=(205,76);to=(205,88)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template27);
          // jsp code [from=(206,76);to=(206,90)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template28);
          // jsp code [from=(207,57);to=(207,71)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template29);
          // jsp code [from=(208,57);to=(208,73)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template30);
          // jsp code [from=(209,56);to=(209,74)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_GUBUN_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template31);
          // ----  c:choose ---- invoke //
          if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template41);
          // jsp code [from=(226,57);to=(226,72)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_CD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template42);
          // jsp code [from=(227,57);to=(227,77)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REPLY_GUBUN_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template43);
          // jsp code [from=(228,57);to=(228,67)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template44);
          // jsp code [from=(229,57);to=(229,67)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template45);
          // jsp code [from=(230,57);to=(230,65)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template46);
          // jsp code [from=(230,74);to=(230,83)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template47);
          // jsp code [from=(230,92);to=(230,104)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template48);
          // jsp code [from=(230,113);to=(230,124)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template49);
          // jsp code [from=(230,133);to=(230,146)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template50);
          // jsp code [from=(230,155);to=(230,166)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template51);
          // jsp code [from=(230,175);to=(230,190)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template52);
          // jsp code [from=(231,57);to=(231,72)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template53);
          // jsp code [from=(232,57);to=(232,85)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template54);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_0.setPageContext(pageContext);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template32);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template34);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template36);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_2_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template38);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_3_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template40);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_MODE == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template33);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_1.setPageContext(pageContext);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_MODE == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template35);

        } while (_jspx_th_c_when_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_2.setPageContext(pageContext);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_MODE == '3' && board.TAX_GUBUN == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
      if (_jspx_eval_c_when_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template37);

        } while (_jspx_th_c_when_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_2.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_3.setPageContext(pageContext);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_MODE == '3' && board.TAX_GUBUN == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
      if (_jspx_eval_c_when_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template39);

        } while (_jspx_th_c_when_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_3.release();
    }
    return false;
  }

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:insertComma2", main.java.common.util.StringUtil.class, "insertComma2", new Class[] {java.lang.String.class});

  }
  
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = " \r\n";
  private final static String _jspx_template2 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            #tr_fixed_header\r\n            {\r\n                position: relative;\r\n                top: expression(this.offsetParent.scrollTop);\r\n                z-index: 20;\r\n            }\r\n\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        \r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tInit()\r\n\t{\t\r\n\t\t\r\n\t\tvar cal_mode = '";
  private final static String _jspx_template11 = "';\r\n\t\t\r\n\t\tvar tax_gubun = document.getElementById('TAX_GUBUN').value;\r\n\r\n\t\tif(cal_mode == '3' && tax_gubun == '3'){\r\n\t\t\tdocument.form.CAL_MODE.options[1].selected = true;\t\t\t\r\n\t\t}else if(cal_mode == '3' && tax_gubun == '2'){\r\n\t\t\tdocument.form.CAL_MODE.options[2].selected = true;\r\n\t\t}else{\r\n\t\t\tdocument.form.CAL_MODE.options[0].selected = true;\r\n\t\t}\r\n\t\t\r\n\t}\r\n\r\n\tfunction checkKeySearch()\r\n\t{\r\n\t\tif(event.keyCode == 13) Search();\r\n\t}\r\n\t\r\n\t\r\n\tfunction changeCalmode(obj){\r\n\t\r\n\t\tfor(var i = 0 ; i < obj.options.length ; i++){\r\n\t\t\tif(obj.options[i].selected){\r\n\t\t\t\tif(i == 1){\r\n\t\t\t\t\tdocument.getElementById('TAX_GUBUN').value = \"3\";\t\t\t\t\r\n\t\t\t\t}else if(i == 2){\r\n\t\t\t\t\tdocument.getElementById('TAX_GUBUN').value = \"2\";\r\n\t\t\t\t}else{\r\n\t\t\t\t\tdocument.getElementById('TAX_GUBUN').value = \"\";\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t}\t\r\n\r\n\t\r\n    function scroll_Left() {\r\n    \tdocument.all.topLine2.scrollLeft = document.all.mainDisplay2.scrollLeft;\r\n    }\r\n      \r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.currentPage.value\t= 1;\r\n\t\tform.action = \"/rojum/saewe/misunap.do\";\r\n\t\tform.submit();\r\n\t}\t\t\r\n\t\r\n\tfunction\tView(adminno,seq, calmode, taxgubun)\r\n\t{\r\n\t\tvar form = document.form;\t\t\r\n\t\t\r\n\t\tform.action = \"/rojum/saewe/view.do?ADMIN_NO=\" + adminno+\"&SEQ=\"+seq+\"&misunap=Y&tax=\"+taxgubun;\t\t\t\r\n\t\t\r\n\t\tform.submit();\r\n\t}\t\r\n//]]>\r\n</script>\r\n</head>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"TOTALCNT\" name=\"TOTALCNT\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"excel\" name=\"excel\" value=\"\">\r\n<input type=\"hidden\" id=\"message\" name=\"message\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" id=\"USER_ID\" name=\"USER_ID\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"TAX_GUBUN\" name=\"TAX_GUBUN\" value=\"";
  private final static String _jspx_template16 = "\">\r\n\r\n\r\n<table width=\"800px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\">\r\n    \t<img src=\"/img/sub7_cont2-2_title.gif\" width=\"800\" height=\"43\">\r\n\t</td>\r\n  </tr>\r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n            </td>\r\n          </tr>\r\n          \r\n          <tr>\r\n            <td class=\"contborder_blue\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td>\r\n                  \t<table width=\"350px\" width=\"left\" border=\"0\">\r\n                  \t\r\n                  \t\t<tr>\r\n                  \t\t\t<td>\r\n\t\t                  \t\t<table width=\"300px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t    <tr>\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출목적</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"1\">\r\n\t\t\t\t\t\t\t\t\t  <select id=\"CAL_MODE\" name=\"CAL_MODE\" class=\"input_form1\" style=\"width:100px\" onchange=\"changeCalmode(this);\">\r\n\t\t\t\t\t\t\t\t\t  \t<option value=\"%\">::전체::</option>\r\n\t\t\t\t\t\t\t\t\t  \t<option value=\"3\">과태료(사전통지)</option>\r\n\t\t\t\t\t\t\t\t\t \t<option value=\"3\">과태료</option>\r\n\t\t\t\t\t\t\t\t\t  </select>\r\n\t\t\t\t\t\t\t\t  </td>\t\t\t\t\t\t  \r\n\t\t\t\t\t\t\t\t</tr>                                 \r\n\t\t\t                  \t</table>\t\r\n                  \t\t\t</td>                  \t\t\t\r\n                  \t\t\t<td height=\"32\" align=\"left\">\r\n                  \t\t\t<a href=\"javascript:Search()\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\"></a>\t\t\t\r\n                  \t\t\t</td>\r\n                  \t\t</tr>\r\n                  \t</table>\r\n\t                  \r\n                  </td>\r\n                </tr>                \r\n\r\n                <tr>\r\n                  <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template17 = "</span>건 </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                  \t<table width=\"780px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t      <DIV id=\"topLine2\" style=\"width:737px;overflow:hidden;\">\r\n\t\t\t\t\t\t      <TABLE width=\"1890px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t          <TR>\r\n      \t\t\t\t\t\t  \t\t<td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t                            <td width=\"40px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">년도</td>\r\n\t\t                            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세번호</td>\r\n\t\t                            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과여부</td>\r\n\t\t                            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납여부</td>\r\n\t\t                             <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일</td>\r\n\t\t                            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납일</td>\r\n\t\t                            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n\t\t                            <td width=\"110px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출목적</td>\r\n\t\t                            <td width=\"180px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n\t\t                            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">의견제출상태</td>\r\n\t\t                            <td width=\"150px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자</td>\r\n\t\t                            <td width=\"200px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주소</td>\r\n\t\t                            <td width=\"350px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">새주소</td>\r\n\t\t                            <td width=\"100px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n\t\t                            <td width=\"120px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과금액</td> \r\n\t\t\t\t\t\t          </TR>\r\n\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t      <DIV id=\"mainDisplay2\" style=\"width:754px;height:274px;overflow:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\" onscroll=\"scroll_Left()\">\r\n\t\t\t\t\t\t        <TABLE width=\"1890px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t          ";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t          \t";
  private final static String _jspx_template19 = "\r\n\t\t\t\t\t\t          \t<tr onClick=\"javascript:View('";
  private final static String _jspx_template20 = "', '";
  private final static String _jspx_template21 = "','";
  private final static String _jspx_template22 = "','";
  private final static String _jspx_template23 = "')\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"CURSOR: Hand;\" >\r\n\t      \t        \t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\">";
  private final static String _jspx_template24 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"40px\" align=\"center\">";
  private final static String _jspx_template25 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"60px\" align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"60px\" class=\"sub_table_r\" align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"60px\" class=\"sub_table_r\" align=\"center\">";
  private final static String _jspx_template28 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template29 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template30 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"60px\" align=\"center\">";
  private final static String _jspx_template31 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"110px\" align=\"center\">\r\n\t      \t        \t\t\t\t\t\t";
  private final static String _jspx_template32 = "\r\n\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t      \t        \t\t\t\t\t\t\t점용료\r\n\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t      \t        \t\t\t\t\t\t\t변상금\r\n\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template36 = "\r\n\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template37 = "\r\n\t      \t        \t\t\t\t\t\t\t과태료\r\n\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template38 = "\t        \t\t\t\t\t\t\t\r\n\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t      \t        \t\t\t\t\t\t\t과태료(사전통지)\r\n\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template40 = "\r\n\t      \t        \t\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t      \t        \t\t\t\t\t</td>\r\n\t      \t        \t\t\t\t\t<td width=\"180px\" align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template43 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"150px\" align=\"center\">";
  private final static String _jspx_template44 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"200px\" align=\"center\">";
  private final static String _jspx_template45 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"350px\" align=\"center\">";
  private final static String _jspx_template46 = "&nbsp;";
  private final static String _jspx_template47 = "&nbsp;";
  private final static String _jspx_template48 = "&nbsp;";
  private final static String _jspx_template49 = "&nbsp;";
  private final static String _jspx_template50 = "&nbsp;";
  private final static String _jspx_template51 = "&nbsp;";
  private final static String _jspx_template52 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template53 = "</td>\r\n\t      \t        \t\t\t\t\t<td width=\"120px\" align=\"center\">";
  private final static String _jspx_template54 = "</td>\t\r\n\t\t                     \t\t</tr>\r\n\t\t                     \t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\t\r\n\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t </td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n          </tr>\r\n        </table></td>\r\n      </tr>\r\n  \t<tr><td>\r\n  \t</td>\r\n  \t</tr>\r\n</table></td>\r\n</tr>\r\n</table>\r\n</form>         \r\n\r\n\r\n</body>\r\n</html>";
}
