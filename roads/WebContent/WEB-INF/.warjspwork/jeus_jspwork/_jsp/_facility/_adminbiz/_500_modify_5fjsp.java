package jeus_jspwork._jsp._facility._adminbiz;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_modify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template10);
      // jsp code [from=(291,60);to=(291,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(292,60);to=(292,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(293,69);to=(293,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(294,62);to=(294,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${adminBiz}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(295,62);to=(295,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(341,78);to=(341,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template28);
      // jsp code [from=(358,113);to=(358,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_ssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(359,73);to=(359,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_ssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(369,106);to=(369,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OFFICE }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(387,84);to=(387,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST_NM }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(390,97);to=(390,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn1 }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(391,100);to=(391,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn2 }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(392,100);to=(392,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn3 }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(405,203);to=(405,213)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(419,200);to=(419,211)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(420,248);to=(420,260)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SPC_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template40);
      // jsp code [from=(420,360);to=(420,371)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LNBR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(420,679);to=(420,690)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LNBR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(420,1043);to=(420,1054)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(426,69);to=(426,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(426,86);to=(426,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(426,104);to=(426,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(427,58);to=(427,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(428,60);to=(428,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(429,62);to=(429,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(430,72);to=(430,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(431,68);to=(431,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(433,65);to=(433,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(434,61);to=(434,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(435,69);to=(435,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(443,99);to=(443,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZ_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(445,97);to=(445,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZ_TYPES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template58);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template60);
      // jsp code [from=(470,192);to=(470,204)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(477,201);to=(477,213)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(491,202);to=(491,215)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(492,254);to=(492,269)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_SPC_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template66);
      // jsp code [from=(492,378);to=(492,392)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_LNBR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(492,710);to=(492,724)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_LNBR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);
      // jsp code [from=(492,1087);to=(492,1100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template69);
      // jsp code [from=(498,73);to=(498,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // jsp code [from=(498,92);to=(498,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template71);
      // jsp code [from=(498,112);to=(498,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template72);
      // jsp code [from=(500,62);to=(500,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template73);
      // jsp code [from=(501,64);to=(501,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template74);
      // jsp code [from=(502,66);to=(502,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template75);
      // jsp code [from=(503,74);to=(503,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template76);
      // jsp code [from=(504,70);to=(504,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template77);
      // jsp code [from=(506,67);to=(506,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template78);
      // jsp code [from=(507,67);to=(507,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template79);
      // jsp code [from=(508,75);to=(508,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template80);
      // jsp code [from=(517,238);to=(517,251)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template81);
      // jsp code [from=(520,56);to=(520,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template82);
      // jsp code [from=(521,57);to=(521,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template83);
      // jsp code [from=(523,15);to=(523,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_to_spc_cd }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template84);
      // jsp code [from=(525,62);to=(525,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_LNBR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template85);
      // jsp code [from=(525,248);to=(525,262)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_LNBR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template86);
      // jsp code [from=(544,91);to=(544,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template87);
      // jsp code [from=(548,224);to=(548,234)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_tel1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template88);
      // jsp code [from=(549,224);to=(549,235)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_tel2 }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template89);
      // jsp code [from=(550,221);to=(550,232)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_tel3 }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template90);
      // jsp code [from=(551,216);to=(551,232)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL_EXT }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template91);
      // jsp code [from=(558,224);to=(558,234)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_fax1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template92);
      // jsp code [from=(559,226);to=(559,237)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_fax2 }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template93);
      // jsp code [from=(560,226);to=(560,237)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_fax3 }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(564,208);to=(564,218)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_hp1 }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);
      // jsp code [from=(565,208);to=(565,218)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_hp2 }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template96);
      // jsp code [from=(566,193);to=(566,203)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_hp3 }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template97);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${companyList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("company");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template17);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template22);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template27);

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

  private boolean _jspx_th_c_if_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_2.setPageContext(pageContext);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SPC_CD == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template39);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_3.setPageContext(pageContext);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_CHECK == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template57);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_4.setPageContext(pageContext);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_CHECK != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template59);

        } while (_jspx_th_c_if_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_4.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_5_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_5.setPageContext(pageContext);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_SPC_CD == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template65);

        } while (_jspx_th_c_if_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_5.release();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${company.OFFICE_CD == board.OFFICE_CD }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template18);
          // jsp code [from=(347,31);to=(347,48)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${company.OFFICE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template19);
          // jsp code [from=(347,52);to=(347,64)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${company.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template20);
          // jsp code [from=(347,79);to=(347,91)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${company.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template21);

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
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${company.OFFICE_CD != board.OFFICE_CD }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template23);
          // jsp code [from=(350,31);to=(350,48)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${company.OFFICE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template24);
          // jsp code [from=(350,52);to=(350,64)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${company.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template25);
          // jsp code [from=(350,70);to=(350,82)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${company.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template26);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "    \r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<!--  //********** BEGIN_hoban_20120303 -->\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>\r\n<!--  //********** END_hoban_20120303 -->   \r\n<!--  //********** BEGIN_KANG_20120409 -->\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<!--   //********** END_KANG_20120409 -->\r\n\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t\r\n\tfunction\tModify()\r\n\t{ \r\n\t\tvar form = document.form; \r\n\t\tvar NAME = document.getElementById(\"NAME\").value; \r\n\t\tvar jumin_ssn1 =  document.getElementById(\"jumin_ssn1\").value; \r\n\t\tvar jumin_ssn2 = document.getElementById(\"jumin_ssn2\").value;\r\n\t\tvar BON_POST = document.getElementById(\"BON_POST\").value;\r\n\t\tvar ADDR1 = document.getElementById(\"ADDR1\").value;\r\n\t\t\r\n\t\tvar jumin_tel1 = document.getElementById(\"jumin_tel1\").value;\r\n\t\tvar jumin_tel2 = document.getElementById(\"jumin_tel2\").value;\r\n\t\tvar jumin_tel3 = document.getElementById(\"jumin_tel3\").value;\r\n\t\tvar jumin_fax1 = document.getElementById(\"jumin_fax1\").value;\r\n\t\tvar jumin_fax2 = document.getElementById(\"jumin_fax2\").value;\r\n\t\tvar jumin_fax3 = document.getElementById(\"jumin_fax3\").value;\r\n\t\tvar jumin_hp1 =  document.getElementById(\"jumin_hp1\").value;\r\n\t\tvar jumin_hp2 =  document.getElementById(\"jumin_hp2\").value;\r\n\t\tvar jumin_hp3 =  document.getElementById(\"jumin_hp3\").value;\r\n\t\t\r\n\t\tvar jumin_bizssn1 =  document.getElementById(\"jumin_bizssn1\").value;\r\n\t\tvar jumin_bizssn2 =  document.getElementById(\"jumin_bizssn2\").value;\r\n\t\tvar jumin_bizssn3 =  document.getElementById(\"jumin_bizssn3\").value; \r\n\t\t\r\n\t\tif(NAME  == ''){\r\n\t\t\t\r\n\t\t\talert('점용인(법인명)을 입력해주세요');\r\n\t\t\treturn;\r\n\t\t\t\r\n\t\t}else if(jumin_ssn1 == '' || jumin_ssn2 == ''){\r\n\t\t\t\r\n\t\t\talert('주민(법인)번호를 정확히 입력해주세요');\r\n\t\t\treturn;\r\n\t\t\t\r\n\t\t}else if(BON_POST == ''){\r\n\t\t\talert('점용인 주소를 선택해주세요');\r\n\t\t\treturn;\r\n\t\t\t\r\n\t\t}else if(ADDR1 == ''){\r\n\t\t\talert('점용인 주소를 선택해주세요');\r\n\t\t\treturn;\r\n\t\t\t\r\n\t\t}\r\n\t\t\r\n\t\tif(jumin_ssn1.length != 6 || jumin_ssn2.length != 7 ){\r\n\t\t\t\r\n\t\t\talert(\"주민(법인)번호를 정확히 입력해주세요!\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif(jumin_bizssn1.length != 3 || jumin_bizssn2.length != 2 || jumin_bizssn3.length != 5 ){\r\n\t\t\t\r\n\t\t\talert(\"사업자등록번호를 정확히 입력해주세요!\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\t\t\r\n\t\tif(jumin_tel1 != '' && jumin_tel2 !='' && jumin_tel3 != ''){\r\n\t\t\t\r\n\t\t}else if(jumin_tel1 == '' && jumin_tel2 =='' && jumin_tel3 == ''){\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\talert('전화번호를 모두 입력해주세요');\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif(jumin_fax1 != '' && jumin_fax2 !='' && jumin_fax3 != ''){\r\n\t\t\t\r\n\t\t}else if(jumin_fax1 == '' && jumin_fax2 =='' && jumin_fax3 == ''){\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\talert('팩스번호를 모두 입력해주세요');\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif(jumin_hp1 != '' && jumin_hp2 !='' && jumin_hp3 != ''){\r\n\t\t\t\r\n\t\t}else if(jumin_hp1 == '' && jumin_hp2 =='' && jumin_hp3 == ''){\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\talert('핸드폰번호를 모두 입력해주세요');\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t \r\n\t\tform.action = \"/facility/adminbiz/modifyprc.do\"; \r\n\t\t\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tgoList()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\tvar currentPage = form.currentPage.value;\r\n\r\n\t\tform.action = \"/facility/adminbiz/search.do?currentPage=\"+currentPage;\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\r\n\tfunction\tJumin_toaddr_Check()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tchk1\t= form.ADDR_CHECK.checked;\r\n\r\n\t\tif(chk1\t== true)\r\n\t\t{\r\n\t\t\tform.TO_POST.value\t= form.BON_POST.value;\r\n\t\t\tform.TOADDR1.value\t= form.ADDR1.value;\r\n\t\t\tform.TOADDR2.value\t= form.ADDR2.value;\r\n\t\t\t\r\n\t\t\tif(form.SPC_CD.checked == true){\r\n\t\t\t\tform.SPC_CD.value = \"1\";\r\n\t\t\t\tform.TO_SPC_CD.checked = true;\r\n\t\t\t\tform.TO_SPC_CD.value = \"1\";\r\n\t\t\t}else{\r\n\t\t\t\tform.SPC_CD.value = \"0\";\r\n\t\t\t\tform.TO_SPC_CD.checked = false;\r\n\t\t\t\tform.TO_SPC_CD.value = \"0\";\r\n\t\t\t}\r\n\t\t\tform.TO_LNBR1.value\t= form.LNBR1.value;\r\n\t\t\tform.TO_LNBR2.value\t= form.LNBR2.valu";
  private final static String _jspx_template10 = "e;\r\n\t\t\t \r\n\t\t\tform.TOADDR1_NEW.value\t= form.ADDR1_NEW.value;\r\n\t\t\t//form.TOADDR2.value\t= form.ADDR2.value;\r\n\t\t\t\r\n\t\t\tform.TOSI.value\t= form.SI.value;\r\n\t\t\tform.TOGUN.value\t\t= form.GUN.value;\r\n\t\t\tform.TODONG.value\t\t= form.DONG.value;\r\n\t\t\tform.TO_DORO_NM.value\t= form.ROAD_ADDR.value;\r\n\t\t\tform.TO_BD_NM.value\t\t= form.BD_NM.value;\r\n\t\t\tform.TO_BD_DET_NM.value\t= form.BD_DET_NM.value;\r\n\t\t\t\r\n\t\t\tform.TO_BD_BON.value\t= form.ROAD_BON.value;\r\n\t\t\tform.TO_BD_BU.value\t\t= form.ROAD_BU.value;\r\n\t\t\t\r\n\t\t\tform.ADDR_CHECK.value = \"1\";\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tform.ADDR_CHECK.value = \"0\";\r\n\t\t\t\r\n\t\t\tif(form.TO_SPC_CD.checked == true){\r\n\t\t\t\tform.TO_SPC_CD.value = \"1\";\r\n\t\t\t}else{\r\n\t\t\t\tform.TO_SPC_CD.value = \"0\";\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction\tJumin_toaddr_Check2()\r\n\t{\r\n\t\tvar form \t\t=\tdocument.form;\r\n\t\tvar\tchk\t\t\t=\tform.ADDR_CHECK.checked;\r\n\t\tvar addr_check \t=\tdocument.getElementById(\"ADDR_CHECK\");\r\n\t\t\r\n\t\tif(chk\t== true)\r\n\t\t{\r\n\t\t\tform.TO_POST.value\t\t=\tform.BON_POST.value;\r\n\t\t\tform.TOADDR1.value\t\t=\tform.ADDR1.value;\r\n\t\t\tform.TOADDR2.value\t\t=\tform.ADDR2.value;\r\n\t\t\r\n\t\t\t\r\n\t\t\tform.ADDR_CHECK.value\t=\t\"1\";\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction openWrite(){\r\n\t\t\r\n\t\tvar group = document.getElementById('selectCompany').value;\r\n\t\t\r\n\t\tvar array = group.split('/');\r\n\t\t\r\n\t\tvar office_cd = array[0];\r\n\t\tvar Name = array[1];\r\n\t\t\r\n\t\tif(office_cd == '99'){\r\n\t\t\tdocument.getElementById(\"NAME\").readOnly = false;\r\n\t\t\tdocument.getElementById(\"NAME\").value = \"\";\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\tdocument.getElementById(\"NAME\").readOnly = true;\r\n\t\t\tdocument.getElementById(\"NAME\").value = Name;\r\n\t\t}\r\n\t\t//********** BEGIN_KANG_20120410\r\n\t\tselectOffice(office_cd);\r\n\t\t//********** END_KANG_20120410\t\r\n\t}\r\n\r\n\t//********** BEGIN_KANG_20120410\t\r\n\tfunction officeSelect(){\r\n\t\tvar group = document.getElementById('selectOffice').value;\r\n\t\t\r\n\t\tvar array = group.split('/');\r\n\t\t\r\n\t\tvar office_cd = array[0];\r\n\t\tvar Name = array[1];\r\n\t\t\r\n\t\tdocument.getElementById(\"OFFICE\").value = Name;\r\n\t\t\r\n\t}\r\n\t\r\n\tfunction selectOffice(obj){        \t\r\n        var\tparam\t= \"office=\"+obj;\r\n        sendRequest(\"/facility/adminbiz/office.do\", param, \"GET\", ResultChangeOfficeList);    \t\r\n    }\r\n\r\n    function\tResultChangeOfficeList(obj)    {\r\n        if(obj != null){        \t\r\n        \tdocument.getElementById(\"selectOfficeDiv\").style.display = \"block\";\r\n        }\r\n    \tselect_innerHTML(document.getElementById(\"selectOffice\"),obj);\r\n    }\r\n\r\n    function getXMLHTTPRequest()\r\n    {\r\n        var xRequest = null;\r\n        xRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n        return xRequest;\r\n    }\r\n\r\n    var req;\r\n    var\tcall;\r\n\r\n    function sendRequest(url, params, HttpMethod, callback)\r\n    {\r\n        req = getXMLHTTPRequest();\r\n\r\n        call\t= callback;\r\n        if(req){\r\n            req.onreadystatechange = onReadyStateChange;\r\n            req.open(HttpMethod, url, true);\r\n            req.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n            req.send(params);\r\n        }\r\n    }\r\n    function onReadyStateChange()\r\n    {\r\n        var ready = req.readyState;\r\n        var data = null;\r\n        if(ready == 4){\r\n            if(this.call\t!= null)\r\n            {\r\n                this.call(req.responseText);\r\n            }\r\n        }\r\n    }\r\n\t//********** END_KANG_20120410\t\t\r\n\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n\t\r\n\t<input type=\"hidden\" name=\"CORP_CD\" id=\"CORP_CD\" value=\"";
  private final static String _jspx_template11 = "\">\r\n\t<input type=\"hidden\" name=\"GU_CODE\" id=\"GU_CODE\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\t<input type=\"hidden\" name=\"currentPage\"  id=\"currentPage\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\t<input type=\"hidden\" name=\"adminBiz\" id=\"adminBiz\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\t<input type=\"hidden\" name=\"MIN_NAME\" id=\"MIN_NAME\" value=\"";
  private final static String _jspx_template15 = "\">\r\n\t\r\n\r\n\t\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub3_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td align=\"left\" >\r\n\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t      <tr>\r\n\t\t\t        <td height=\"1\" bgcolor=\"#ffffff\"></td>\r\n\t\t\t      </tr>\r\n\t\t\t      <tr>\r\n\t\t\t        <td height=\"14\"></td>\r\n\t\t\t      </tr>\r\n\t\t\t      \r\n\t\t\t      <tr>\r\n\t\t\t        <td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t          <tr>\r\n\t\t\t            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t                <tr>\r\n\t\t\t                  <td><img src=\"/img/sub_petition_title1.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t                </tr>\r\n\t\t\t            </table></td>\r\n\t\t\t          </tr>\r\n\t\t\t          \r\n\t\t\t          <tr>\r\n\t\t\t            <td class=\"contborder_blue\">\r\n\t\t\t\r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\r\n                <tr>\r\n                  \t<td>\r\n                  \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인(법인명)</td>\r\n\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <!-- \r\n\t\t\t\t\t\t\t  <td><input name=\"CORP_NM\" type=\"text\" class=\"essential\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t\t\t\t  -->\r\n\t\t\t\t\t\t\t  <td width='130' align='left'><input name=\"NAME\" id=\"NAME\"  value=\"";
  private final static String _jspx_template16 = "\" type=\"text\" class=\"essential\" style=\"width:120px\"   ></td>\r\n\t\t\t\t\t\t\t  <td>\t\t\t\t\t  \t\t\t\t\r\n\t\t\t\t\t\t\t  \t<select id=\"selectCompany\" name=\"selectCompany\" class=\"input_form1\" onChange =\"openWrite();\" >\r\n\t\t\t\t\t\t\t  \t\t<option value=\"99\" >새로입력</option>\r\n\t\t\t\t\t\t\t  \t\t";
  private final static String _jspx_template17 = "\t\t\t\t\t\r\n\t\t\t\t\t\t\t  \t\t\t";
  private final static String _jspx_template18 = "\t\t  \t\t\r\n\t\t\t\t\t\t\t  \t\t\t\t<option value=\"";
  private final static String _jspx_template19 = "/";
  private final static String _jspx_template20 = "\" selected >";
  private final static String _jspx_template21 = " </option>\r\n\t\t\t\t\t\t\t  \t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t  \t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t  \t\t\t\t<option value=\"";
  private final static String _jspx_template24 = "/";
  private final static String _jspx_template25 = "\" >";
  private final static String _jspx_template26 = " </option>\r\n\t\t\t\t\t\t\t  \t\t\t";
  private final static String _jspx_template27 = "\t\t\t\t\t  \t\r\n\t\t\t\t\t\t\t  \t\t";
  private final static String _jspx_template28 = "\t\t\t\t\t\t\t  \t\t\r\n\t\t\t\t\t\t\t  \t</select>\r\n\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td  height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민(법인)번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"jumin_ssn1\" id=\"jumin_ssn1\" type=\"text\"  value=\"";
  private final static String _jspx_template29 = "\" class=\"essential\" style=\"width:40px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_ssn2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t  - <input name=\"jumin_ssn2\" id=\"jumin_ssn2\" type=\"text\" value=\"";
  private final static String _jspx_template30 = "\" class=\"essential\" style=\"width:45px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"7\" >\r\n\t\t\t\t\t\t </td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t<!--  //********** BEGIN_KANG_20120410 -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지점명</td>\r\n\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"130\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t<input  id=\"OFFICE\" name=\"OFFICE\" type=\"text\" class=\"input_form1\" style=\"width:100px\" value=\"";
  private final static String _jspx_template31 = "\">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<div id=\"selectOfficeDiv\" style=\"display:none\">\r\n\t\t\t\t\t\t\t\t\t\t<select id=\"selectOffice\" name=\"selectOffice\" class=\"input_form1\" style=\"width:100px\" onChange =\"officeSelect();\" >\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t\t\t  \t\t\r\n\t\t\t\t\t\t\t\t\t  \t</select>\r\n\t\t\t\t\t\t\t\t\t  \t</div>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t<!--   //********** END_KANG_20120410 -->\t\t\t\t  \t\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대표자명</td>\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"NAME\" type=\"text\" class=\"input_form1\" style=\"width:120px\" onFocus=\"Jumin_toaddr_Check();\"></td>\t\t\t\t\r\n\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"TOPOST_NM\"  value=\"";
  private final static String _jspx_template32 = "\"type=\"text\" class=\"input_form1\" style=\"width:120px\" onFocus=\"Jumin_toaddr_Check();\"></td>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업자 등록번호</td>\r\n\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_bizssn1\"  id=\"jumin_bizssn1\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template33 = "\" style=\"width:30px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_bizssn2, 3);\" maxlength=\"3\">\r\n\t\t\t\t\t\t  - <input name=\"jumin_bizssn2\"  id=\"jumin_bizssn2\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template34 = "\" style=\"width:15px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_bizssn3, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t\t  - <input name=\"jumin_bizssn3\"  id=\"jumin_bizssn3\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template35 = "\" style=\"width:35px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"5\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t\r\n\t\t\t\t  \t\r\n\t\t\t\t  \t<!-- //********** BEGIN_hoban_20120303 -->\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120212 -->\r\n\r\n\t\t\t\t\t\t\t <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">                                            \r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"50px\"><input id=\"BON_POST\" name=\"BON_POST\" type=\"text\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template36 = "\" onchange=\"Jumin_toaddr_Check();\"  readonly class=\"input_form1\"></td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.BON_POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.ROAD_ADDR', 'form.BD_NM','form.DONG','form.LNBR1', 'form.LNBR2' );\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t<td><a href=\"javascript:addrConfirm('BON_POST','SI','GUN','DONG','ROAD_ADDR','LNBR1','LNBR2','ROAD_BON','ROAD_BU','BD_NM','BD_DET_NM','ADDR1','ADDR2','ADDR1_NEW','form')\"><img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t<!--   //********** END_현진_20120212 -->\t\t\t\t\t\r\n\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\t\t\t\t\t  \r\n\t\t\t\t\t  \t<tr>\r\n\r\n\t\t\t\t\t  \t\t<!-- 주민등록지 기본 주소 -->\r\n\t\t\t\t\t\t\t<td height=\"45px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"ADDR1\" name=\"ADDR1\" type=\"text\" class=\"input_form1\" style=\"width:245px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template37 = "\" readonly>\r\n\t\t\t\t\t\t\t\t<br>&nbsp;산&nbsp;<input type=\"checkbox\" id=\"SPC_CD\" name=\"SPC_CD\" style=\"vertical-align: middle;\" onclick=\"Jumin_toaddr_Check();\"  onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template38 = "\" ";
  private final static String _jspx_template39 = "checked";
  private final static String _jspx_template40 = ">&nbsp;<input id=\"LNBR1\" name=\"LNBR1\" value=\"";
  private final static String _jspx_template41 = "\" type=\"text\" class=\"input_form1\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyUp=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, LNBR1, 4);\" onKeyPress=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, LNBR1, 4);\" maxlength=\"4\">&nbsp;-&nbsp;<input id=\"LNBR2\" name=\"LNBR2\" value=\"";
  private final static String _jspx_template42 = "\" type=\"text\" class=\"input_form1\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyUp=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, LNBR2, 4);\" onKeyPress=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, LNBR2, 4);\" maxlength=\"4\">&nbsp;<input id=\"ADDR2\" name=\"ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:118px\" value=\"";
  private final static String _jspx_template43 = "\" onKeyUp=\"Jumin_toaddr_Check();\" maxlength=\"50\">\r\n\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t  \t<!-- 주민등록지 도로명 주소 -->\r\n\t\t\t\t\t\t\t<td height=\"45px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"ADDR1_NEW\" name=\"ADDR1_NEW\" type=\"text\" value=\"";
  private final static String _jspx_template44 = "&nbsp;";
  private final static String _jspx_template45 = "&nbsp;";
  private final static String _jspx_template46 = "\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly>\r\n\t \t\t\t\t\t\t\t<input type=\"hidden\" id=\"SI\" name=\"SI\" value=\"";
  private final static String _jspx_template47 = "\">\r\n\t \t\t\t\t\t\t\t<input type=\"hidden\" id=\"GUN\" name=\"GUN\" value=\"";
  private final static String _jspx_template48 = "\">\r\n\t \t\t\t\t\t\t\t<input type=\"hidden\" id=\"DONG\" name=\"DONG\" value=\"";
  private final static String _jspx_template49 = "\">\r\n\t \t\t\t\t\t\t\t<input type=\"hidden\" id=\"ROAD_ADDR\" name=\"ROAD_ADDR\" value=\"";
  private final static String _jspx_template50 = "\">\r\n\t \t\t\t\t\t\t\t<input id=\"ROAD_BON\" name=\"ROAD_BON\" type=\"text\" VALUE=\"";
  private final static String _jspx_template51 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t<input id=\"ROAD_BU\" name=\"ROAD_BU\" type=\"text\" VALUE=\"";
  private final static String _jspx_template52 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t\t\t<input id=\"BD_NM\" name=\"BD_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template53 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<input id=\"BD_DET_NM\" name=\"BD_DET_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template54 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\t\r\n\t\t\t\t  \t<!-- //********** END_hoban_20120303 -->\r\n\t\t\t\t  \t\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">업태</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"BIZ_STATUS\" type=\"text\"  value = \"";
  private final static String _jspx_template55 = "\" class=\"input_form1\" style=\"width:120px\" value=\"\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">종목</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"BIZ_TYPES\" type=\"text\" value = \"";
  private final static String _jspx_template56 = "\"class=\"input_form1\" style=\"width:120px\" value=\"\"></td>\t\t\t\t\r\n\t\t\t\t  \t</tr>\t\t\t\t\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t \t<td><span class=\"sub_stan_blue\">* 우편물 송달지</span> :\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t\t\t\t  \t\t<input id=\"ADDR_CHECK\" name=\"ADDR_CHECK\" type=\"checkbox\" onclick=\"javascript:Jumin_toaddr_Check()\"  value=\"1\" checked>\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template59 = "\r\n\t\t\t\t\t\t\t\t\t  \t\t<input id=\"ADDR_CHECK\" name=\"ADDR_CHECK\" type=\"checkbox\" onclick=\"javascript:Jumin_toaddr_Check()\" value=\"0\">\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template60 = "\r\n\t\t\t\t\t\t\t  \t\t\t점용인 주소와 동일</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t  \t</tr>\r\n\r\n\t\t\t\t  \t<!-- //********** BEGIN_hoban_20120303 -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120212 -->\r\n\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n  \t\t\t\t\t\t\t\t\t  <td><input id=\"TO_POST\" name=\"TO_POST\" type=\"text\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template61 = "\" readonly  class=\"essential\"></td>\r\n\t\t\t\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup_new('form.TO_POST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t<table  width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"50px\"><input id=\"TO_POST\" name=\"TO_POST\" type=\"text\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template62 = "\"  onchange=\"Jumin_toaddr_Check();\"  readonly class=\"input_form1\"></td>                                                    \r\n\t\t\t\t\t\t\t\t\t<td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.TO_POST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM','form.TODONG', 'form.TO_LNBR1', 'form.TO_LNBR2');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t<td><a href=\"javascript:addrConfirm('TO_POST','TOSI','TOGUN','TODONG','TO_DORO_NM','TO_LNBR1','TO_LNBR2','TO_BD_BON','TO_BD_BU','TO_BD_NM','TO_BD_DET_NM','TOADDR1','TOADDR2','TOADDR1_NEW','form')\"><img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\"></a></td>\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t<!--   //********** END_현진_20120212 -->\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\r\n\t\t\t\t\t\t\t<!-- 실 거주지 기본 주소 -->\r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"TOADDR1\" name=\"TOADDR1\" type=\"text\" class=\"essential\" style=\"width:245px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template63 = "\" readonly>\r\n\t\t\t\t\t\t\t\t<br>&nbsp;산&nbsp;<input type=\"checkbox\" id=\"TO_SPC_CD\" name=\"TO_SPC_CD\" style=\"vertical-align: middle;\" onclick=\"Jumin_toaddr_Check();\"  onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template64 = "\" ";
  private final static String _jspx_template65 = "checked";
  private final static String _jspx_template66 = ">&nbsp;<input id=\"TO_LNBR1\" name=\"TO_LNBR1\" value=\"";
  private final static String _jspx_template67 = "\" type=\"text\" class=\"essential\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyUp=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, TO_LNBR1, 4);\" onKeyPress=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, TO_LNBR1, 4);\" maxlength=\"4\">&nbsp;-&nbsp;<input id=\"TO_LNBR2\" name=\"TO_LNBR2\" value=\"";
  private final static String _jspx_template68 = "\" type=\"text\" class=\"input_form1\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyUp=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, TO_LNBR2, 4);\" onKeyPress=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, TO_LNBR2, 4);\" maxlength=\"4\">&nbsp;<input id=\"TOADDR2\" name=\"TOADDR2\" type=\"text\" class=\"input_form1\" style=\"width:118px\" value=\"";
  private final static String _jspx_template69 = "\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" maxlength=\"50\">&nbsp;\r\n\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t\t<!-- 실거주지 도로명 주소 -->\r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"TOADDR1_NEW\" name=\"TOADDR1_NEW\" type=\"text\" value=\"";
  private final static String _jspx_template70 = "&nbsp;";
  private final static String _jspx_template71 = "&nbsp;";
  private final static String _jspx_template72 = "&nbsp;\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly>\r\n\t \t\t\t\t\t\t\t\r\n\t \t\t\t\t\t\t\t<input type=\"hidden\" id=\"TOSI\" name=\"TOSI\" value=\"";
  private final static String _jspx_template73 = "\">\r\n\t \t\t\t\t\t\t\t<input type=\"hidden\" id=\"TOGUN\" name=\"TOGUN\" value=\"";
  private final static String _jspx_template74 = "\">\r\n\t \t\t\t\t\t\t\t<input type=\"hidden\" id=\"TODONG\" name=\"TODONG\" value=\"";
  private final static String _jspx_template75 = "\" }>\r\n\t \t\t\t\t\t\t\t<input type=\"hidden\" id=\"TO_DORO_NM\" name=\"TO_DORO_NM\" value=\"";
  private final static String _jspx_template76 = "\"> \r\n\t \t\t\t\t\t\t\t<input id=\"TO_BD_BON\" name=\"TO_BD_BON\" type=\"text\" value=\"";
  private final static String _jspx_template77 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t<input id=\"TO_BD_BU\" name=\"TO_BD_BU\" type=\"text\" value=\"";
  private final static String _jspx_template78 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t\t\t<input id=\"TO_BD_NM\" name=\"TO_BD_NM\" type=\"text\" value=\"";
  private final static String _jspx_template79 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<input id=\"TO_BD_DET_NM\" name=\"TO_BD_DET_NM\" type=\"text\" value=\"";
  private final static String _jspx_template80 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<!--  \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 주소</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"TO_POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onclick=\"Jumin_toaddr_Check2();\" onchange=\"Jumin_toaddr_Check2();\" onFocus=\"Jumin_toaddr_Check2();\" onkeyup=\"Jumin_toaddr_Check2();\" readonly value=\"";
  private final static String _jspx_template81 = "\"></td>\r\n\t\t\t\t\t\t\t\t\t<td><a href=\"javascript:openZipcodePopup('form.TO_POST', 'form.TOADDR1');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"TOADDR1\" type=\"text\" value = \"";
  private final static String _jspx_template82 = "\" class=\"input_form1\" style=\"width:250px\" onclick=\"Jumin_toaddr_Check2();\" onchange=\"Jumin_toaddr_Check2();\" onFocus=\"Jumin_toaddr_Check2();\" onkeyup=\"Jumin_toaddr_Check2();\" readonly value=\"\">\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"TO_ADDR2\" type=\"text\" value = \"";
  private final static String _jspx_template83 = "\" class=\"input_form1\" style=\"width:250px\" onclick=\"Jumin_toaddr_Check2();\" onchange=\"Jumin_toaddr_Check2();\" onFocus=\"Jumin_toaddr_Check2();\" onkeyup=\"Jumin_toaddr_Check2();\" value=\"\">\r\n\t\t\t\t\t\t\t\t\t\t<SELECT ID=\"TO_SPC_CD\" NAME=\"TO_SPC_CD\">\r\n\t\t\t\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template84 = "\r\n\t\t\t\t\t\t\t\t\t\t</SELECT>\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"TO_JIBUN_MAIN\" type=\"text\" value = \"";
  private final static String _jspx_template85 = "\"class=\"input_form1\"  style=\"width:50px\"   maxlength=\"4\"  onKeyUp=\"count_check(this, TO_JIBUN_SUB, 4);\">&nbsp; - &nbsp; <input name=\"TO_JIBUN_SUB\" type=\"text\"  value = \"";
  private final static String _jspx_template86 = "\"class=\"input_form1\"  style=\"width:50px\"  maxlength=\"4\"  onKeyUp=\"count_check(this, OFFICE, 4);\">&nbsp;번지\r\n\t\t\t\t\t\t\t\t\t</td>  \r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t-->\r\n\t\t\t\t  \t<!-- //********** END_hoban_20120303 -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  \t<td><span class=\"sub_stan_blue\">* 담당자 정보</span></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" height=\"25\">\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<input name=\"MANAGER\" type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"";
  private final static String _jspx_template87 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_tel1\" id=\"jumin_tel1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_tel2, 3);\" maxlength=\"3\" value=\"";
  private final static String _jspx_template88 = "\"> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_tel2\" id=\"jumin_tel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_tel3, 4);\" maxlength=\"4\" value=\"";
  private final static String _jspx_template89 = "\"> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_tel3\" id=\"jumin_tel3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, TEL_EXT, 4);\" maxlength=\"4\" value=\"";
  private final static String _jspx_template90 = "\">\r\n\t\t\t\t\t\t\t&nbsp;&nbsp;(&nbsp;내선&nbsp;<input name=\"TEL_EXT\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"4\" value=\"";
  private final static String _jspx_template91 = "\">&nbsp;)\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">FAX</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_fax1\" id=\"jumin_fax1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_fax2, 3);\" maxlength=\"3\" value=\"";
  private final static String _jspx_template92 = "\"> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_fax2\" id=\"jumin_fax2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_fax3, 4);\" maxlength=\"4\" value = \"";
  private final static String _jspx_template93 = "\"> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_fax3\" id=\"jumin_fax3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_fax3, 4);\" maxlength=\"4\" value = \"";
  private final static String _jspx_template94 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_hp1\" id=\"jumin_hp1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_hp2, 3);\" value =\"";
  private final static String _jspx_template95 = "\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_hp2\" id=\"jumin_hp2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_hp3, 4);\" value =\"";
  private final static String _jspx_template96 = "\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_hp3\" id=\"jumin_hp3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" value =\"";
  private final static String _jspx_template97 = "\"  maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t  \r\n                  \t</table></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t  \t<td colspan='4' height =\"30\" align=\"right\" ><img src='/img/save_icon2.gif' alt=\"저장\" border=\"0\" onClick=\"Modify();\" style=\"cursor:hand;\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\r\n\t\t\t\r\n\t\t\t\r\n\t\t\t\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n    \r\n    </td>         \r\n</tr>\r\n<tr>\r\n\t<td height='50' align='right'><img src=\"/img/list_icon.gif\" alt=\"리스트\"  border=\"0\" onClick='goList();' style='cursor:hand;'></td>\r\n</tr>\r\n</table>\r\n\t\r\n\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
}
