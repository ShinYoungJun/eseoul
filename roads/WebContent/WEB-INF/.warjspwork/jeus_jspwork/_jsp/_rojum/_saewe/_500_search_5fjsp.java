package jeus_jspwork._jsp._rojum._saewe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_search_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(112,21);to=(112,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CAL_MODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(174,26);to=(174,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      out.write(_jspx_template13);
      // jsp code [from=(441,38);to=(441,50)]
      out.print(WebServerURL);

      out.write(_jspx_template14);
      // jsp code [from=(456,67);to=(456,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(457,61);to=(457,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(459,59);to=(459,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(460,59);to=(460,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(533,56);to=(533,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${thisDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(595,11);to=(595,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(604,12);to=(604,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sunap_part}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(615,10);to=(615,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(624,11);to=(624,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_part}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(635,32);to=(635,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(638,32);to=(638,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(645,121);to=(645,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(646,101);to=(646,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(655,147);to=(655,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(660,171);to=(660,181)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(674,89);to=(674,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template42);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template85);

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
            out.write(_jspx_template31);
            // jsp code [from=(724,66);to=(724,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(725,64);to=(725,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(726,66);to=(726,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(727,61);to=(727,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(728,66);to=(728,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_MODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(729,67);to=(729,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(730,69);to=(730,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REPLY_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(731,67);to=(731,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REPLY_ETC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(732,68);to=(732,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REPLY_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(733,71);to=(733,90)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REPLY_MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);

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

  private boolean _jspx_th_c_forEach_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_1.setPageContext(pageContext);
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template43);
            // jsp code [from=(748,52);to=(748,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(748,73);to=(748,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(748,88);to=(748,102)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_MODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(748,108);to=(748,123)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(750,73);to=(750,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(751,58);to=(751,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(752,58);to=(752,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(753,78);to=(753,90)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(754,78);to=(754,92)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(755,59);to=(755,73)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(758,48);to=(758,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template57);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template60);
            // jsp code [from=(763,58);to=(763,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_GUBUN_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template61);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template71);
            // jsp code [from=(780,59);to=(780,74)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_CD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template72);
            // jsp code [from=(781,59);to=(781,79)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REPLY_GUBUN_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template73);
            // jsp code [from=(782,59);to=(782,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template74);
            // jsp code [from=(783,59);to=(783,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template75);
            // jsp code [from=(784,59);to=(784,67)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template76);
            // jsp code [from=(784,76);to=(784,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template77);
            // jsp code [from=(784,94);to=(784,106)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template78);
            // jsp code [from=(784,115);to=(784,126)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template79);
            // jsp code [from=(784,135);to=(784,148)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template80);
            // jsp code [from=(784,157);to=(784,168)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template81);
            // jsp code [from=(784,177);to=(784,192)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template82);
            // jsp code [from=(785,59);to=(785,74)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template83);
            // jsp code [from=(786,59);to=(786,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template84);

          } while (_jspx_th_c_forEach_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_1.doCatch(t);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_1.release();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_DATE == '0000-00-00'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template55);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template56);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_2.setPageContext(pageContext);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_DATE != '0000-00-00'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template58);
          // jsp code [from=(761,98);to=(761,115)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_DATE }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template59);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
          out.write(_jspx_template62);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template64);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template66);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_2_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template68);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_3_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template70);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
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
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_DATE != '0000-00-00'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(760,178);to=(760,195)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_DATE }",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
          out.write(_jspx_template63);

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
          out.write(_jspx_template65);

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
          out.write(_jspx_template67);

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
          out.write(_jspx_template69);

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
  private final static String _jspx_template10 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            #tr_fixed_header\r\n            {\r\n                position: relative;\r\n                top: expression(this.offsetParent.scrollTop);\r\n                z-index: 20;\r\n            }\r\n\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        \r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do?currentPage=\" + page;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\t//********** BEGIN_현진_20120222\r\n\t/*\r\n\tfunction\tView(adminno,seq)\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\t//********** BEGIN_현진_20120218\r\n\t\t//form.action = \"view.do?ADMIN_NO=\" + adminno+\"&SEQ=\"+seq;\r\n\t\tform.action = \"/rojum/saewe/view.do?ADMIN_NO=\" + adminno+\"&SEQ=\"+seq;\r\n\t\t//********** END_현진_20120218\t\t\r\n\t\t\r\n\t\tform.submit();\r\n\t}\r\n\t*/\r\n\tfunction\tView(adminno,seq, calmode, taxgubun)\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\tvar btnYN = \"N\";\r\n\t\tif(calmode=='3'&&taxgubun=='3'){\r\n\t\t\tbtnYN = \"Y\";\r\n\t\t}\r\n//\t\talert(btnYN);\r\n\t\tform.action = \"/rojum/saewe/view.do?ADMIN_NO=\" + adminno+\"&SEQ=\"+seq+\"&BTNYN=\"+btnYN;\t\t\t\r\n\t\t\r\n\t\tform.submit();\r\n\t}\r\n\t//********** END_현진_20120222\t\r\n\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.currentPage.value\t= 1;\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\texcel_Search()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.currentPage.value\t= 1;\r\n\t\tform.action = \"excel_search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tSelect_UseType(sel)\r\n\t{\r\n\r\n\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode.jsp?SectionCode=\" + sel.value;\r\n\t}\r\n\r\n\tfunction\tInit()\r\n\t{\t\r\n\t\tsetYear();\r\n\t\t\r\n\t\tvar obj = document.form.message.value;\r\n\t\t\r\n\t\tif(obj != \"\")\t\r\n\t\t\talert(obj);\r\n\r\n\t\tvar cal_mode = '";
  private final static String _jspx_template11 = "';\r\n\t\t\r\n\t\tvar tax_gubun = getValueSelectTag('TAX_GUBUN');\r\n\t\t\r\n\t\tif(cal_mode == '3' && tax_gubun == '3'){\r\n\t\t\tdocument.form.CAL_MODE.options[3].selected = true;\r\n\t\t\t//document.getElementById('TAX_GUBUN').disabled = true;\r\n\t\t}else if(cal_mode == '3' && tax_gubun != '3'){\r\n\t\t\tdocument.form.CAL_MODE.options[4].selected = true;\r\n\t\t}else if(cal_mode != ''){\r\n\t\t\tchangeSelectTag('CAL_MODE',cal_mode);\r\n\t\t}\r\n\r\n\t\t\r\n\t}\r\n\r\n\tfunction checkKeySearch()\r\n\t{\r\n\t\tif(event.keyCode == 13) Search();\r\n\t}\r\n\r\n\t\r\n\tfunction SaeweSuipBugwa_Ilgwal()\r\n\t{\r\n\r\n\t\tvar f = document.form;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no_arr = document.getElementsByName(\"GAPAN_NO_ARR\");\r\n\t\tvar tax_yn_arr = document.getElementsByName(\"TAX_YN_ARR\");\r\n\t\tvar sunap_yn_arr = document.getElementsByName(\"SUNAP_YN_ARR\");\r\n\t\tvar count = 0;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true && tax_yn_arr[i].value == '미부과' && sunap_yn_arr[i].value == '미수납'){\r\n\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\tcount++;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(count <= 0){\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}else{\r\n\t\t\tif(!confirm('부과대상이 아닌것을 제외한\\n'+count+'건에 대해서 부과하시겠습니까?.'))\r\n\t\t\t\treturn;\r\n\t\t\t\r\n\t\t\tdocument.getElementById(\"Bugwa_Ilgwal\").onclick = function(){\r\n        \t\talert(\"잠시만 기다리세요.\");\r\n         \t};\r\n\t\t\t\r\n\t\t\tform.action = \"/rojum/saewe/saeweSuipBugwa_ilgwal.do\";\r\n\t\t\tform.submit();\r\n\t\t\r\n\t\t}\r\n\t}\r\n\r\n\t function setYear()\r\n    {\r\n        now = new Date();\r\n        Y = now.getFullYear();\r\n\r\n        var strYear = \"";
  private final static String _jspx_template12 = "\";\r\n\r\n        for(var i = 0 ; i < 10 ; i++){\r\n            newItem = new Option(i);\r\n            document.getElementById(\"YEAR\").options[i]  = newItem;\r\n            document.getElementById(\"YEAR\").options[i].text = Y+1-i;\r\n            document.getElementById(\"YEAR\").options[i].value = Y+1-i;\r\n            if(strYear == Y-i) document.getElementById(\"YEAR\").options[i].selected = true;\r\n        }\r\n\r\n        document.getElementById(\"YEAR\").options.value = strYear;\r\n    }\r\n\r\n\tfunction SaeweSunap(){\r\n\r\n\t\tvar f = document.form;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no_arr = document.getElementsByName(\"GAPAN_NO_ARR\");\r\n\t\tvar tax_yn_arr = document.getElementsByName(\"TAX_YN_ARR\");\r\n\t\tvar sunap_yn_arr = document.getElementsByName(\"SUNAP_YN_ARR\");\r\n\t\tvar count = 0;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true && tax_yn_arr[i].value == '부과' && sunap_yn_arr[i].value == '미수납'){\r\n\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\tcount++;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(count <= 0){\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}else{\r\n\t\t\tf.ReturnMsg.value = '수납대상이 아닌 것을 제외한\\n'+count+'건에 대해 수납일자를 선택하세요.';\r\n            MessageDisplay('Dlg_Sunap','Dlg_SunapMain',1);\r\n\t\t\r\n\t\t}\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\tfunction SearchPenaltyIlgwal(){\r\n\t\r\n\t\tvar f = document.form;\r\n\t\tform.action = \"/rojum/saewe/search_penalty_ilgwal.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\t\r\n\tfunction changeCalmode(obj){\r\n\t\tfor(var i = 0 ; i < obj.options.length ; i++){\r\n\t\t\tif(obj.options[i].selected){\r\n\t\t\t\tif(i == 3){\r\n\t\t\t\t\tchangeSelectTag('TAX_GUBUN','3');\r\n\t\t\t\t\t//document.getElementById('TAX_GUBUN').disabled = true;\r\n\t\t\t\t}else{\r\n\t\t\t\t\tchangeSelectTag('TAX_GUBUN','');\r\n\t\t\t\t\t//document.getElementById('TAX_GUBUN').disabled = false;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t\r\n\t\r\n\tfunction changeTaxGubun(){\r\n\t\t\r\n\t\tvar cal_mode = document.getElementById('CAL_MODE').options;\r\n\t\t\r\n\t\tfor(var i = 0 ; i < cal_mode.length ; i++){\r\n\t\t\tif(cal_mode[i].selected){\r\n\t\t\t\tif(i == 3){\r\n\t\t\t\t\tchangeSelectTag('TAX_GUBUN',3);\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction ReplyPop(){\r\n\t\t\r\n\t\tvar f = document.form;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no_arr = document.getElementsByName(\"GAPAN_NO_ARR\");\r\n\t\tvar cal_mode_arr = document.getElementsByName(\"CAL_MODE_ARR\");\r\n\t\tvar tax_gubun_arr = document.getElementsByName(\"TAX_GUBUN_ARR\");\r\n\t\tvar tax_yn_arr = document.getElementsByName(\"TAX_YN_ARR\");\r\n\t\tvar reply_gubun_arr = document.getElementsByName(\"REPLY_GUBUN_ARR\");\r\n\t\tvar reply_etc_arr = document.getElementsByName(\"REPLY_ETC_ARR\");\r\n\t\tvar reply_date_arr = document.getElementsByName(\"REPLY_DATE_ARR\");\r\n\t\tvar reply_manager_arr = document.getElementsByName(\"REPLY_MANAGER_ARR\");\r\n\t\t\r\n\t\t\r\n\t\tvar count = 0;\r\n\t\tvar hitCount = 0;\r\n\t\tvar target;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\tif(cal_mode_arr[i].value == '3' && tax_gubun_arr[i].value == '3' && tax_yn_arr[i].value == '부과'){\r\n\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\thitCount++;\r\n\t\t\t\ttarget = i;\r\n\t\t\t}\r\n\t\t\tcount++;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(count == 0){\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}else if(count != 1 || hitCount != 1){\r\n\t\t\talert(\"한건의 부과된 사전통지대상만이 의견제출하실수 있습니다.\");\r\n\t\t}else{\r\n\t\t\t\r\n\t\t\tchangeSelectTag('REPLY_GUBUN',reply_gubun_arr[target].value);\r\n\t\t\tdocument.getElementById('REPLY_ETC').innerHTML = reply_etc_arr[target].value; \r\n\t\t\tdocument.getElementById('REPLY_DATE').value = reply_date_arr[target].value; \r\n\t\t\tdocument.getElementById('REPLY_MANAGER').value = reply_manager_arr[target].value; \r\n\t\t\t\r\n            MessageDisplay('Dlg_Reply','Dlg_ReplyMain',1);\r\n\t\t}\t\t\r\n\t}\r\n\t\r\n\t//********** BEGIN_현진_20120227\r\n\tfunction bugwa_cancel(){\t\t\r\n\t\tvar f = document.form;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no_arr = document.getElementsByName(\"GAPAN_NO_ARR\");\r\n\t\tvar cal_mode_arr = document.getElementsByName(\"CAL_M";
  private final static String _jspx_template13 = "ODE_ARR\");\r\n\t\tvar tax_gubun_arr = document.getElementsByName(\"TAX_GUBUN_ARR\");\r\n\t\tvar tax_yn_arr = document.getElementsByName(\"TAX_YN_ARR\");\r\n\t\tvar reply_gubun_arr = document.getElementsByName(\"REPLY_GUBUN_ARR\");\r\n\t\tvar reply_etc_arr = document.getElementsByName(\"REPLY_ETC_ARR\");\r\n\t\tvar reply_date_arr = document.getElementsByName(\"REPLY_DATE_ARR\");\r\n\t\tvar reply_manager_arr = document.getElementsByName(\"REPLY_MANAGER_ARR\");\r\n\t\t\r\n\t\t\r\n\t\tvar count = 0;\r\n\t\tvar hitCount = 0;\r\n\t\tvar target;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\tif(tax_yn_arr[i].value == '부과'){\r\n\t\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\t\thitCount++;\r\n\t\t\t\t\ttarget = i;\r\n\t\t\t\t}\r\n\t\t\tcount++;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(count == 0){\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}else if(count <= 0 || hitCount <= 0){\r\n\t\t\talert(\"부과 철회는 부과된 대상에 대해서만  가능합니다.\");\r\n\t\t\treturn;\r\n\t\t}else{\r\n\t\t\t//if (confirm(\"부과 철회 하시겠습니까?\")){\r\n\t\t\tif (confirm(\"부과대상에 대해서만 철회됩니다.\"+hitCount + \"부과 철회 하시겠습니까?\")){\r\n\t\t\t\t//********** BEGIN_현진_20120322\r\n\t\t\t\t//form.action = \"/rojum/saewe/bugwa_cancel.do\";\r\n\t\t\t\tform.action = \"/rojum/saewe/bugwa_cancel.do?mode=bugwa\";\r\n\t\t\t\t//********** END_현진_20120322\r\n\t\t\t\tform.submit();\r\n\t\t\t}else{\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\t\t\r\n\t}\r\n\t//********** END_현진_20120227\r\n\t\t\r\n\t//********** BEGIN_현진_20120322\r\n\t\tfunction deleteData(){\t\t\r\n\t\tvar f = document.form;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar tax_yn_arr = document.getElementsByName(\"TAX_YN_ARR\");\r\n\t\t\r\n\t\tvar count = 0;\r\n\t\tvar hitCount = 0;\r\n\t\tvar target;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\tif(tax_yn_arr[i].value == '미부과'){\r\n\t\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\t\thitCount++;\r\n\t\t\t\t\ttarget = i;\r\n\t\t\t\t}\r\n\t\t\tcount++;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(count == 0){\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}else if(count <= 0 || hitCount <= 0){\r\n\t\t\talert(\"삭제는 미부과 대상에 대해서만  가능합니다.\");\r\n\t\t\treturn;\r\n\t\t}else{\r\n\t\t\tif (confirm(\"미부과대상에 대해서만 삭제됩니다.\"+hitCount + \"건 삭제 하시겠습니까?\")){\r\n\t\t\t\tform.action = \"/rojum/saewe/bugwa_cancel.do?mode=mibugwa\";\r\n\t\t\t\tform.submit();\r\n\t\t\t}else{\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\t\t\r\n\t}\r\n\t//********** END_현진_20120322\r\n\t\r\n\tfunction PreNotice(){\r\n\t\t\r\n\t\tvar f = document.form;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no_arr = document.getElementsByName(\"GAPAN_NO_ARR\");\r\n\t\tvar seq_arr = document.getElementsByName(\"SEQ_ARR\");\r\n\t\tvar tax_yn_arr = document.getElementsByName(\"TAX_YN_ARR\");\r\n\t\tvar cal_mode_arr = document.getElementsByName(\"CAL_MODE_ARR\");\r\n\t\tvar tax_gubun_arr = document.getElementsByName(\"TAX_GUBUN_ARR\");\r\n\t\t\r\n\t\tvar count = 0;\r\n\t\tvar hitCount = 0;\r\n\t\tvar target;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\tif(cal_mode_arr[i].value == '3' && tax_gubun_arr[i].value == '3' && tax_yn_arr[i].value == '부과'){\r\n\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\thitCount++;\r\n\t\t\t\ttarget = i;\r\n\t\t\t}\r\n\t\t\tcount++;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif(count == 0){\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}else if(count != 1 || hitCount != 1){\r\n\t\t\talert(\"한건의 부과된 사전통지대상만이 출력하실수 있습니다.\");\r\n\t\t}else{\r\n\t\t\t\r\n\t\t\tvar oRptMainParam;\r\n\t\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t\t// 옵션 - viewer\t\r\n\t\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=800,height=600\");\r\n\t\t\t\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"rojum_pre_notice\");\r\n\r\n\t\t\t// 필수 - 데이터 타입 설정\r\n\t\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t\t// 옵션 - 다른 DB를 연결시\r\n\t\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t\t// 옵션 - 파라메터 설정\r\n\t\t\tvar form \t= document.form;\r\n\t\t\t\r\n\t\t\toRptMainParam.put(\"GAPAN_NO\" ,gapan_no_arr[target].value);\r\n\t\t\toRptMainParam.put(\"SEQ\" ,seq_arr[target].value);\r\n\t\t\toRptMainParam.put(\"USER_ID\" ,form.USER_ID.value);\r\n\t\t\toRptMainParam.put(\"IMG_PATH\" ,'";
  private final static String _jspx_template14 = "'+'/img/stamp/'+gapan_no_arr[target].value.substring(0,3)+'.png');\r\n\t\t\t\r\n\t\t\r\n\t\t\t// preview 팝업 열기\r\n\t\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t}\r\n\t}\r\n\t    \r\n\t\t\r\n//]]>\r\n</script>\r\n</head>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"TOTALCNT\" name=\"TOTALCNT\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"excel\" name=\"excel\" value=\"\">\r\n<input type=\"hidden\" id=\"message\" name=\"message\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" id=\"USER_ID\" name=\"USER_ID\" value=\"";
  private final static String _jspx_template18 = "\">\r\n\r\n<div id=\"Dlg_Reply\" style=\"position:absolute;display:none;\">\r\n\t<table id=\"Dlg_ReplyMain\" width=\"200px\" height=\"243px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;background-color:#c9dfed;filter:Alpha(Opacity=90)\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t\t<table width=\"190px\" height=\"233px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td height=\"25px\" colspan=\"2\">\r\n\t\t\t\t\t<font color=\"red\">의견제출 관리</font>\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"120px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">진행상태</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <select id=\"REPLY_GUBUN\" name=\"REPLY_GUBUN\" class=\"input_form1\" style=\"width:60px\">\r\n\t\t\t\t\t  \t<option value=\"1\">신청</option>\r\n\t\t\t\t\t  \t<option value=\"2\">취소</option>\r\n\t\t\t\t\t  \t<option value=\"3\">승인</option>\r\n\t\t\t\t\t \t<option value=\"4\">기각</option>\r\n\t\t\t\t\t  </select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종변경일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id =\"REPLY_DATE\" name=\"REPLY_DATE\" type=\"text\" class=\"input_form1\" style=\"width:60px;border:0px\" readonly>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">의견제출자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id =\"REPLY_MANAGER\" name=\"REPLY_MANAGER\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:60px\" maxlength=\"5\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" colspan=\"2\">의견요지</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"2\" height=\"78px\">\r\n\t\t\t\t\t\t<textarea id =\"REPLY_ETC\" name=\"REPLY_ETC\" class=\"input_form1\" cols=\"30\" rows=\"5\">\r\n\t\t\t\t\t\t</textarea>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\" height=\"26px\" colspan=\"2\">\r\n\t\t\t\t\t\t<img src=\"/img/submit.gif\" alt=\"제출\" width=\"56\" height=\"18\" border=\"0\" onClick=\"document.form.action = '/rojum/saewe/submit_reply.do';document.form.submit();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"MessageDisplay('Dlg_Reply','Dlg_ReplyMain',0);\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t</table>\r\n</div>\r\n\r\n<div id=\"Dlg_Sunap\" style=\"position:absolute;display:none;\">\r\n\t<table id=\"Dlg_SunapMain\" width=\"300px\" height=\"150px\" border=\"0\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;background-color:#ffffff;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t\t<table width=\"290px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td height=\"5px\">\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<textarea rows=\"2\" cols=\"1\" id =\"ReturnMsg\" name=\"ReturnMsg\"  class=\"input_form1\" style=\"width:280px;overflow:hidden;text-align:center;border:0px;color:red;\" readonly></textarea>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t수납일자\r\n\t\t\t\t\t\t<input id =\"SunapDate\" name=\"SunapDate\" value=\"";
  private final static String _jspx_template19 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly>\r\n\t\t\t\t\t    <img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer\" onclick=\"popUpCalendar(this, document.getElementById('SunapDate'), 'yyyymmdd');\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\" >\r\n\t\t\t\t\t\t<img src=\"/img/sunap_icon2.gif\" alt=\"수납\" width=\"56\" height=\"18\" border=\"0\" onClick=\"document.form.action = '/rojum/saewe/saeweSunap.do';document.form.submit();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"MessageDisplay('Dlg_Sunap','Dlg_SunapMain',0);\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t</table>\r\n</div>\r\n\r\n<table width=\"800px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\">\r\n    \t<img src=\"/img/sub7_cont2_title.gif\" width=\"800\" height=\"43\">\r\n\t</td>\r\n  </tr>\r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n            </td>\r\n          </tr>\r\n          \r\n          <tr>\r\n            <td class=\"contborder_blue\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                  \r\n\t\t\t\t    <tr>\r\n\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출년도</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"1\">\r\n\t                      <select id=\"YEAR\" name=\"YEAR\" class=\"input_form1\" style=\"width:130px\">\r\n\t                      </select>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출목적</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"1\">\r\n\t\t\t\t\t\t  <select id=\"CAL_MODE\" name=\"CAL_MODE\" class=\"input_form1\" style=\"width:100px\" onchange=\"changeCalmode(this);\">\r\n\t\t\t\t\t\t  \t<option value=\"%\">::전체::</option>\r\n\t\t\t\t\t\t  \t<option value=\"1\">점용료</option>\r\n\t\t\t\t\t\t  \t<option value=\"2\">변상료</option>\r\n\t\t\t\t\t\t  \t<option value=\"3\">과태료(사전통지)</option>\r\n\t\t\t\t\t\t \t<option value=\"3\">과태료</option>\r\n\t\t\t\t\t\t  </select>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t</tr>\r\n                    \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  <td height=\"26px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과여부</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                      <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                      <tr>\r\n\t\t\t\t\t\t\t<select id=\"TAX_YN\" name=\"TAX_YN\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t\t</select>\r\n\t                      </tr>\r\n                      </table>\r\n                      </td>\r\n\t\t\t\t\t\r\n\t\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납여부</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <select id=\"SUNAP_YN\" name=\"SUNAP_YN\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t  \t\t";
  private final static String _jspx_template21 = "\r\n\r\n\t\t\t\t\t  </select>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t\t  \r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <select id=\"TAX_SET\" name=\"TAX_SET\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t  </select>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t  <td height=\"26px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                      <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                      <tr>\r\n\t\t\t\t\t\t\t<select id=\"TAX_GUBUN\" name=\"TAX_GUBUN\" class=\"input_form1\" style=\"width:100px;\" onchange=\"changeTaxGubun();\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t</select>\r\n\t                      </tr>\r\n                      </table>\r\n                      </td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t        <tr>\r\n\t                  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법정동/행정동</td>\r\n\t                  <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                  \t<tr><td><select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width:100px\">\r\n\t                            ";
  private final static String _jspx_template24 = "\r\n\t                        </select></td>\r\n\t              \t\t<td>&nbsp;<select id=\"HJ_CD\" name=\"HJ_CD\" class=\"input_form1\" style=\"width:100px\">\r\n\t                            ";
  private final static String _jspx_template25 = "\r\n\t                        </select></td>   \r\n\t                    </tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t                  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지번지</td>\r\n\t                  <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                    <tr>\r\n\t                      <td><input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template26 = "\"> -\r\n\t\t\t\t\t\t\t  <input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template27 = "\">\r\n\t\t\t\t\t\t  </td>\r\n\t                    </tr>\r\n\t                  </table></td>\r\n\t                </tr>\r\n\t\t\t\t \r\n\t                <tr>\r\n\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<input id=\"GAPAN_NO\" name=\"GAPAN_NO\" type=\"text\" class=\"input_form1\" style=\"width:120px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template28 = "\">\r\n\t\t\t\t\t  </table></td>\r\n    \t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소유자/법인명</td>\r\n\t                  <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                    <tr>\r\n\t                      <td><input id=\"OWNER_NAME\" name=\"OWNER_NAME\" type=\"text\" class=\"input_form1\" style=\"width:100px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template29 = "\"></td>\r\n\t                    </tr>\r\n\t                  </table></td>\r\n\t                </tr>\t                \r\n                  </table></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"32\" align=\"right\"><a href=\"javascript:Search()\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n                </tr>\r\n\r\n                <tr>\r\n                  <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template30 = "</span>건 </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                  \t<table width=\"780px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t\t\t    <TD width=\"26px\"  valign=\"top\">\r\n\t\t\t\t\t\t\t\t      <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t        <TR>\r\n\t\t\t\t\t\t\t\t              <td width=\"26px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" id=\"SELECT_ALL\" onclick=\"javascript:selectAll(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t        </TR>\r\n\t\t\t\t\t\t\t\t      </TABLE>\r\n\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t      <DIV id=\"topLine2\" style=\"width:737px;overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t      <!--  //********** BEGIN_현진_20120207 width=\"1440px\" 을 width=\"1640px\" -->\r\n\t\t\t\t\t\t\t\t      <TABLE width=\"1940px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t  <!--   //********** END_현진_20120207 -->\r\n\t\t\t\t\t\t\t\t          <TR>\r\n        \t\t\t\t\t\t  \t\t\t<td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t                            <td width=\"40px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">년도</td>\r\n\t\t\t\t                            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세번호</td>\r\n\t\t\t\t                            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과여부</td>\r\n\t\t\t\t                            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납여부</td>\r\n\t\t\t\t                            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일</td>\r\n\t\t\t\t                            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납일</td>\r\n\t\t\t\t                            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n\t\t\t\t                            <td width=\"110px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출목적</td>\r\n\t\t\t\t                            <td width=\"180px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n\t\t\t\t                            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">의견제출상태</td>\r\n\t\t\t\t                            <td width=\"150px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자</td>\r\n\t\t\t\t                            <td width=\"200px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주소</td>\r\n\t\t\t\t                            <td width=\"400px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">새주소</td>\r\n\t\t\t\t                            <td width=\"100px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n\t\t\t\t                            <td width=\"120px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과금액</td> \r\n\t\t\t\t\t\t\t\t          </TR>\r\n\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t\t\t    <TD width=\"26px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t      <DIV id=\"leftDisplay2\" style=\"width:26px;height:257px;overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t        <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t          \t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t  \t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor: pointer\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t<td width=\"26px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" NAME=\"SELECT_ITEM\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"GAPAN_NO_ARR\" value=\"";
  private final static String _jspx_template32 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"TAX_YN_ARR\" value=\"";
  private final static String _jspx_template33 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"SUNAP_YN_ARR\" value=\"";
  private final static String _jspx_template34 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"SEQ_ARR\" value=\"";
  private final static String _jspx_template35 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"CAL_MODE_ARR\" value=\"";
  private final static String _jspx_template36 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"TAX_GUBUN_ARR\" value=\"";
  private final static String _jspx_template37 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"REPLY_GUBUN_ARR\" value=\"";
  private final static String _jspx_template38 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"REPLY_ETC_ARR\" value=\"";
  private final static String _jspx_template39 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"REPLY_DATE_ARR\" value=\"";
  private final static String _jspx_template40 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"REPLY_MANAGER_ARR\" value=\"";
  private final static String _jspx_template41 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"ITEM_CHECK\" value=\"\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t    <TD width=\"1940px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t      <DIV id=\"mainDisplay2\" style=\"width:754px;height:274px;overflow:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\" onscroll=\"scrollAll()\">\r\n\t\t\t\t\t\t\t\t      <!--  //********** BEGIN_현진_20120207 width=\"1440px\" 을 width=\"1640px\" -->\r\n\t\t\t\t\t\t\t\t        <TABLE width=\"1940px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t  <!--   //********** END_현진_20120207 -->\t\t\t\t\t\t\t\t      \r\n\t\t\t\t\t\t\t\t          ";
  private final static String _jspx_template43 = "\r\n\t\t\t\t\t\t\t\t          \t<!--  //********** BEGIN_현진_20120222 -->\r\n\t\t\t\t\t\t\t\t          \t<tr onClick=\"javascript:View('";
  private final static String _jspx_template44 = "', '";
  private final static String _jspx_template45 = "','";
  private final static String _jspx_template46 = "','";
  private final static String _jspx_template47 = "')\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"CURSOR: Hand;\" >\r\n\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120222 -->\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\">";
  private final static String _jspx_template48 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"40px\" align=\"center\">";
  private final static String _jspx_template49 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"60px\" align=\"center\">";
  private final static String _jspx_template50 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"60px\" class=\"sub_table_r\" align=\"center\">";
  private final static String _jspx_template51 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"60px\" class=\"sub_table_r\" align=\"center\">";
  private final static String _jspx_template52 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template53 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<!--  //********** BEGIN_KANG_20120705 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template54 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "<td width=\"100px\" align=\"center\" class=\"sub_table_r\" >(과태료재부과 )";
  private final static String _jspx_template56 = "</td>";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template58 = "<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template59 = "</td>";
  private final static String _jspx_template60 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120705 -->\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"60px\" align=\"center\">";
  private final static String _jspx_template61 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"110px\" align=\"center\">\r\n\t\t\t      \t        \t\t\t\t\t\t";
  private final static String _jspx_template62 = "\r\n\t\t\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template63 = "\r\n\t\t\t      \t        \t\t\t\t\t\t\t점용료\r\n\t\t\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template64 = "\r\n\t\t\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template65 = "\r\n\t\t\t      \t        \t\t\t\t\t\t\t변상금\r\n\t\t\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template66 = "\r\n\t\t\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template67 = "\r\n\t\t\t      \t        \t\t\t\t\t\t\t과태료\r\n\t\t\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template68 = "\t        \t\t\t\t\t\t\t\r\n\t\t\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template69 = "\r\n\t\t\t      \t        \t\t\t\t\t\t\t과태료(사전통지)\r\n\t\t\t      \t        \t\t\t\t\t\t\t";
  private final static String _jspx_template70 = "\r\n\t\t\t      \t        \t\t\t\t\t\t";
  private final static String _jspx_template71 = "\r\n\t\t\t      \t        \t\t\t\t\t</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"180px\" align=\"center\">";
  private final static String _jspx_template72 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template73 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"150px\" align=\"center\">";
  private final static String _jspx_template74 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"200px\" align=\"center\">";
  private final static String _jspx_template75 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"400px\" align=\"center\">";
  private final static String _jspx_template76 = "&nbsp;";
  private final static String _jspx_template77 = "&nbsp;";
  private final static String _jspx_template78 = "&nbsp;";
  private final static String _jspx_template79 = "&nbsp;";
  private final static String _jspx_template80 = "&nbsp;";
  private final static String _jspx_template81 = "&nbsp;";
  private final static String _jspx_template82 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template83 = "</td>\r\n\t\t\t      \t        \t\t\t\t\t<td width=\"120px\" align=\"center\">";
  private final static String _jspx_template84 = "</td>\t\r\n\t\t\t\t                     \t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template85 = "\t\r\n\r\n\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t \r\n\t\t\t\t\t </td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n             <td height=\"40\" align=\"right\">\r\n\t\t\t\t<!--  //********** BEGIN_현진_20120222 -->\r\n\t\t\t\t<!-- \r\n\t\t\t\t<img src=\"/img/rojum_prenotice_icon.gif\" alt=\"사전통지서\" border=\"0\" onclick=\"javascript:PreNotice();\" style=\"cursor:pointer;\">\r\n\t\t\t\t-->\r\n\t\t\t\t<!--  //********** BEGIN_현진_20120227 -->\r\n\t\t\t\t<img src=\"/img/bugwa_cancel_icon.gif\" alt=\"부과철회\" border=\"0\" onclick=\"javascript:bugwa_cancel();\" style=\"cursor:pointer;\">\r\n\t\t\t\t<!--   //********** END_현진_20120227 -->\r\n\t\t\t\t<!--  //********** BEGIN_현진_20120322 -->\r\n\t\t\t\t<img src=\"/img/del_icon5.gif\" alt=\"삭제\" border=\"0\" onclick=\"javascript:deleteData();\" style=\"cursor:pointer;\">\r\n\t\t\t\t<!--   //********** END_현진_20120322 -->\r\n\t\t\t\t<!--   //********** END_현진_20120222 -->             \t\r\n             \t<img src=\"/img/submit_reply.gif\" alt=\"의견제출\" border=\"0\" onclick=\"javascript:ReplyPop();\" style=\"cursor:pointer;\">\r\n \t            <!--  //********** BEGIN_현진_20120222 -->\r\n\t\t\t\t<!-- \r\n\t\t\t\t<img src=\"/img/rojum_saewe_penalty.gif\" alt=\"미수납과태료조회\" border=\"0\" onclick=\"javascript:SearchPenaltyIlgwal();\" style=\"cursor:pointer;\">\r\n\t\t\t\t-->\r\n\t\t\t\t<!--   //********** END_현진_20120222 --> \t            \r\n             \t<img src=\"/img/rojum_sunap_icon.gif\" alt=\"수납처리\" border=\"0\" onclick=\"javascript:SaeweSunap()\" style=\"cursor:pointer;\">\r\n             \t<img src=\"/img/levy_icon3.gif\" id=\"Bugwa_Ilgwal\" name=\"Bugwa_Ilgwal\" alt=\"일괄부과 처리\" border=\"0\" onclick=\"javascript:SaeweSuipBugwa_Ilgwal();\" style=\"cursor:pointer;\">\r\n           \t\t<img src=\"/img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:pointer;\">\r\n            </td>\r\n          </tr>\r\n        </table></td>\r\n      </tr>\r\n\r\n  \t<tr><td>\r\n  \t</td>\r\n  \t</tr>\r\n</table></td>\r\n</tr>\r\n</table>\r\n</form>         \r\n\r\n\r\n</body>\r\n</html>";
}
