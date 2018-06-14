package jeus_jspwork._jsp._gapan._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_search_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(33,16);to=(33,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sessionUserId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(35,6);to=(35,27)]
      out.write(_jspx_template10);
      // jsp code [from=(45,8);to=(45,70)]
      out.write(_jspx_template11);
      // jsp code [from=(48,8);to=(48,37)]
      out.write(_jspx_template12);
      // jsp code [from=(60,6);to=(60,25)]
      out.write(_jspx_template13);
      // jsp code [from=(64,7);to=(82,4)]
      out.write(_jspx_template14);
      // jsp code [from=(84,7);to=(84,26)]
      out.write(_jspx_template15);
      // jsp code [from=(89,7);to=(107,4)]
      out.write(_jspx_template16);
      // jsp code [from=(112,6);to=(112,27)]
      out.write(_jspx_template17);
      // jsp code [from=(131,7);to=(131,26)]
      out.write(_jspx_template18);
      // jsp code [from=(134,6);to=(134,25)]
      out.write(_jspx_template19);
      out.write(_jspx_template20);
      // jsp code [from=(159,12);to=(159,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(160,13);to=(160,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(162,54);to=(162,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(163,56);to=(163,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ft_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(164,7);to=(164,28)]
      out.write(_jspx_template24);
      // jsp code [from=(166,7);to=(166,26)]
      out.write(_jspx_template25);
      out.write(_jspx_template26);
      // jsp code [from=(167,14);to=(167,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${yearVal}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(168,14);to=(168,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${yearVal}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(169,14);to=(169,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${yearVal}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(170,5);to=(170,40)]
      out.write(_jspx_template29);
      // jsp code [from=(173,6);to=(173,34)]
      out.write(_jspx_template30);
      // jsp code [from=(220,27);to=(220,41)]
      out.write(_jspx_template31);
      // jsp code [from=(222,26);to=(222,33)]
      out.write(_jspx_template32);
      // jsp code [from=(223,45);to=(223,67)]
      out.write(_jspx_template33);
      // jsp code [from=(224,36);to=(224,51)]
      out.write(_jspx_template34);
      out.write(_jspx_template35);
      // jsp code [from=(340,21);to=(340,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_set}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(354,6);to=(354,36)]
      out.write(_jspx_template36);
      // jsp code [from=(386,6);to=(386,44)]
      out.write(_jspx_template37);
      out.write(_jspx_template38);
      // jsp code [from=(388,19);to=(388,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_set}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(411,32);to=(411,49)]
      out.write(_jspx_template39);
      // jsp code [from=(433,32);to=(433,49)]
      out.write(_jspx_template40);
      // jsp code [from=(488,6);to=(488,36)]
      out.write(_jspx_template41);
      // jsp code [from=(520,6);to=(520,43)]
      out.write(_jspx_template42);
      out.write(_jspx_template43);
      // jsp code [from=(522,19);to=(522,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_set}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(545,31);to=(545,48)]
      out.write(_jspx_template44);
      // jsp code [from=(567,31);to=(567,48)]
      out.write(_jspx_template45);
      out.write(_jspx_template46);
      // jsp code [from=(631,55);to=(631,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(632,59);to=(632,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      out.write(_jspx_template49);
      // jsp code [from=(809,9);to=(809,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(812,10);to=(812,32)]
      out.write(_jspx_template50);
      // jsp code [from=(813,10);to=(823,7)]
      out.write(_jspx_template51);
      out.write(_jspx_template52);
      // jsp code [from=(826,155);to=(826,166)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${numberValue}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(828,10);to=(828,29)]
      out.write(_jspx_template53);
      out.write(_jspx_template54);
      // jsp code [from=(837,83);to=(837,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(841,39);to=(841,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(852,98);to=(852,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(875,176);to=(875,187)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(880,10);to=(880,31)]
      out.write(_jspx_template58);
      // jsp code [from=(881,10);to=(886,7)]
      out.write(_jspx_template59);
      // jsp code [from=(896,10);to=(896,29)]
      out.write(_jspx_template60);
      // jsp code [from=(905,10);to=(905,31)]
      out.write(_jspx_template61);
      out.write(_jspx_template62);
      // jsp code [from=(914,176);to=(914,187)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FACILITY_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(921,10);to=(921,29)]
      out.write(_jspx_template63);
      out.write(_jspx_template64);
      // jsp code [from=(934,89);to=(934,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(960,16);to=(960,37)]
      out.write(_jspx_template65);
      // jsp code [from=(962,16);to=(962,35)]
      out.write(_jspx_template66);
      // jsp code [from=(966,34);to=(966,58)]
      out.write(_jspx_template67);
      // jsp code [from=(968,34);to=(968,56)]
      out.write(_jspx_template68);
      // jsp code [from=(969,34);to=(969,56)]
      out.write(_jspx_template69);
      // jsp code [from=(972,16);to=(972,35)]
      out.write(_jspx_template70);
      // jsp code [from=(973,34);to=(973,53)]
      out.write(_jspx_template71);
      // jsp code [from=(974,16);to=(976,13)]
      out.write(_jspx_template72);
      // jsp code [from=(977,16);to=(977,33)]
      out.write(_jspx_template73);
      out.write(_jspx_template74);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      // jsp code [from=(1010,17);to=(1010,36)]
      out.write(_jspx_template78);
      out.write(_jspx_template79);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      // jsp code [from=(1066,17);to=(1066,36)]
      out.write(_jspx_template123);
      // jsp code [from=(1076,26);to=(1083,23)]
      out.write(_jspx_template124);
      // jsp code [from=(1084,27);to=(1084,51)]
      out.write(_jspx_template125);
      out.write(_jspx_template126);
      // jsp code [from=(1117,16);to=(1117,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${org_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template127);
      // jsp code [from=(1118,17);to=(1118,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dept_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template128);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist1}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template75);
            // jsp code [from=(1000,76);to=(1000,90)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template76);
            // jsp code [from=(1001,84);to=(1001,102)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template77);

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist1}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template80);
            // jsp code [from=(1018,77);to=(1018,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template81);
            // jsp code [from=(1019,85);to=(1019,103)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template82);
            // jsp code [from=(1024,169);to=(1024,183)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template83);
            // jsp code [from=(1025,49);to=(1025,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template84);
            // jsp code [from=(1026,68);to=(1026,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(1027,18);to=(1027,39)]
            out.write(_jspx_template85);
            out.write(_jspx_template86);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            // jsp code [from=(1029,18);to=(1029,37)]
            out.write(_jspx_template88);
            out.write(_jspx_template89);
            // jsp code [from=(1030,66);to=(1030,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template90);
            // jsp code [from=(1031,66);to=(1031,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template91);
            // jsp code [from=(1032,67);to=(1032,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(1033,36);to=(1033,59)]
            out.write(_jspx_template92);
            out.write(_jspx_template93);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            // jsp code [from=(1035,36);to=(1035,57)]
            out.write(_jspx_template100);
            out.write(_jspx_template101);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_3_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template102);
            // jsp code [from=(1038,67);to=(1038,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(1039,18);to=(1039,37)]
            out.write(_jspx_template103);
            // jsp code [from=(1040,24);to=(1040,43)]
            out.write(_jspx_template104);
            // jsp code [from=(1041,18);to=(1043,14)]
            out.write(_jspx_template105);
            // jsp code [from=(1044,18);to=(1044,35)]
            out.write(_jspx_template106);
            out.write(_jspx_template107);
            // jsp code [from=(1045,67);to=(1045,79)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template108);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template116);
            // jsp code [from=(1056,67);to=(1056,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VIO_CD_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template117);
            // jsp code [from=(1057,67);to=(1057,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VIO_ACTCD_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template118);
            // jsp code [from=(1058,67);to=(1058,99)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.MUL_FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template119);
            // jsp code [from=(1058,105);to=(1058,135)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.MUL_TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template120);
            // jsp code [from=(1059,66);to=(1059,79)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_A}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template121);
            // jsp code [from=(1060,67);to=(1060,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.UP_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template122);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FACILITY_NO != null && board.FACILITY_NO != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(1028,119);to=(1028,131)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template87);
          // jsp code [from=(1028,137);to=(1028,154)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FACILITY_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM != null && board.DORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(1034,129);to=(1034,137)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template94);
          // jsp code [from=(1034,141);to=(1034,150)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template95);
          // jsp code [from=(1034,154);to=(1034,167)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template96);
          // jsp code [from=(1034,171);to=(1034,183)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_1)) return true;


          out.write(_jspx_template98);
          // jsp code [from=(1034,267);to=(1034,278)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template99);
          // jsp code [from=(1034,282);to=(1034,297)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TEL != '--' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(1037,108);to=(1037,123)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
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
          out.write(_jspx_template109);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template112);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template115);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU != '0' && board.BD_BU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template97);
          // jsp code [from=(1034,245);to=(1034,256)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VIO_ACCPOINTS >= 100}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template110);
          // jsp code [from=(1049,52);to=(1049,71)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VIO_ACCPOINTS}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template111);

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
          out.write(_jspx_template113);
          // jsp code [from=(1052,34);to=(1052,53)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VIO_ACCPOINTS}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template114);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
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
  private final static String _jspx_template9 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script type=\"text/javascript\" src=\"/js/jquery-1.6.1.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/jquery.json-2.4.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n<script>\r\n\r\n\tfunction gapanRegister(){\r\n\r\n   \t\tvar form = document.jumyongForm;\r\n   \t\tform.action = \"/gapan/jumyong/register.do\";\r\n   \t\tform.submit();\r\n\t\t\r\n\t}\r\n\tvar user = \"";
  // jsp code [from=(35,6);to=(35,27)]
  private final static String _jspx_template10 = "\"; //k00000013\r\n\r\n\t";
  // jsp code [from=(45,8);to=(45,70)]
  private final static String _jspx_template11 = "\r\n\tfunction selectFT_TYP(init){\t\t\r\n\t\tvar FT_TYP = document.getElementById(\"FT_TYP\").value;\r\n\t\tif(init != \"init\"){\r\n\t\t\tdocument.getElementById(\"FACILITY_NO\").value = \"\";\r\n\t\t}\r\n\t\tvar Facility = \"\";\r\n\r\n\t\tif(FT_TYP == \"%\"){\r\n\t\t\t/* BEGIN_KANG_20120426 */\r\n\t\t\t";
  // jsp code [from=(48,8);to=(48,37)]
  private final static String _jspx_template12 = "\t\t\t\t\r\n\t\t\tdocument.getElementById(\"FacilityView\").style.display=\"block\";\r\n\t\t\tFacility = \"시설물명\";\r\n\t\t\t";
  // jsp code [from=(60,6);to=(60,25)]
  private final static String _jspx_template13 = "\t\t\r\n\t\t}else{\r\n\t\t\tdocument.getElementById(\"FacilityView\").style.display=\"block\";\t\t\t\r\n\t\t\tif(FT_TYP == \"011\"){\r\n\t\t\t\tFacility = \"가로판매대\";\r\n\t\t\t}else if(FT_TYP == \"012\"){\r\n\t\t\t\tFacility = \"구두수선대\";\r\n\t\t\t}\r\n\t\t}\r\n\t\tdocument.getElementById(\"Facility\").innerHTML=Facility;\r\n\r\n\t};\r\n\t";
  // jsp code [from=(64,7);to=(82,4)]
  private final static String _jspx_template14 = "\r\n\t\r\n\tfunction goSearch()\r\n\t{\r\n\t\t";
  // jsp code [from=(84,7);to=(84,26)]
  private final static String _jspx_template15 = "\r\n\t\tSearch(\"/gapan/jumyong/search.do\");\r\n\t\t";
  // jsp code [from=(89,7);to=(107,4)]
  private final static String _jspx_template16 = "\r\n\t};\r\n\t\r\n\tfunction\texcel_Search()\r\n\t{\r\n\t\t";
  // jsp code [from=(112,6);to=(112,27)]
  private final static String _jspx_template17 = "\r\n\t\tSearch(\"/gapan/jumyong/excel_search.do\");\r\n\t\t\r\n\t}\r\n\r\n\t";
  // jsp code [from=(131,7);to=(131,26)]
  private final static String _jspx_template18 = "\r\n\tfunction Search(url)\r\n\t{\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\r\n\t\tvar ft_typ = document.getElementById(\"FT_TYP\").value;\r\n\t\tvar gu_cd = getValueSelectTag(\"GU_CD\");\t\t\t\t\r\n\t\tvar FACILITY_NO = document.getElementById(\"FACILITY_NO\").value;\r\n\t\t\r\n\t\tlocation.href= url + \"?type=\"+type+\"&section=\"+section\r\n\t\t+\"&tax_set=\"+tax_set+\"&ft_typ=\"+ft_typ+\"&gu_cd=\"+gu_cd+\"&bj_cd=\"+bj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"\r\n\t\t+jumyongName+\"&numberValue=\"+numberValue+\"&FACILITY_NO=\"+FACILITY_NO;\r\n\t\t\r\n\t\t";
  // jsp code [from=(134,6);to=(134,25)]
  private final static String _jspx_template19 = "\r\n\t\t\r\n\t}\r\n\t";
  private final static String _jspx_template20 = "\r\n\r\n\t\r\n\t\r\n\tfunction goView(adminVal)\r\n\t{\t\t\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\r\n\t\tvar ft_typ = document.getElementById(\"FT_TYP\").value;\t\t\r\n\t\t\r\n\t\tvar param = \"/gapan/jumyong/view.do?GAPAN_NO=\"+adminVal+\"&type=\"+type+\"&section=\"+section\r\n\t\t\t+\"&tax_set=\"+tax_set+\"&ft_typ=\"+ft_typ+\"&bj_cd=\"+bj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"\r\n\t\t\t+jumyongName+\"&numberValue=\"+numberValue;\r\n\r\n\t\tlocation.href=param;\r\n\t}\r\n\t\r\n\tfunction InitPage()\r\n\t{\r\n    \tif('";
  private final static String _jspx_template21 = "'.length > 0){\r\n\t\t\talert('";
  private final static String _jspx_template22 = "');\t\t\t\t\t\r\n    \t}\r\n\t\tsetSelectedOption(document.jumyongForm.SECTION, '";
  private final static String _jspx_template23 = "');\r\n\t\tdocument.getElementById(\"FT_TYP\").options.value = '";
  // jsp code [from=(164,7);to=(164,28)]
  private final static String _jspx_template24 = "';\r\n\t\t";
  // jsp code [from=(166,7);to=(166,26)]
  private final static String _jspx_template25 = "\r\n\t\tselectFT_TYP(\"init\");\r\n\t\t";
  private final static String _jspx_template26 = "\r\n\t\tsetYear('";
  private final static String _jspx_template27 = "','YEAR1');\r\n\t\tsetYear('";
  private final static String _jspx_template28 = "','YEAR10');\r\n\t\tsetYear('";
  // jsp code [from=(170,5);to=(170,40)]
  private final static String _jspx_template29 = "','YEAR4');\r\n";
  // jsp code [from=(173,6);to=(173,34)]
  private final static String _jspx_template30 = "\r\n\t}\r\n\r\n\t";
  // jsp code [from=(220,27);to=(220,41)]
  private final static String _jspx_template31 = "\r\n\tfunction setSelectedOption(obj, val){\r\n\t\tfor(i = 0 ; i < obj.options.length ; i++){\r\n\t\t\tif(obj.options[i].value == val){\r\n\t\t\t\tobj.options[i].selected = true;\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t};\r\n\t\r\n\tfunction setYear(data,targetId) {\r\n  \tnow = new Date();\r\n    Y = now.getFullYear();\r\n\r\n    var strYear = data;\r\n\t\tvar target = document.getElementById(targetId);\r\n    for(var i = 0 ; i < 10 ; i++){\r\n    \toption = new Option(i);\r\n    \toption.text = Y+2-i;\r\n    \toption.value = Y+2-i;\r\n      target.add(option);\r\n      if(strYear == Y+2-i) { \r\n    \t  option.selected = true;\r\n    \t  target.defaultIdx = i;\r\n      }\r\n    }\r\n    \r\n    target.options.value = strYear;\r\n  };\r\n  \t\r\n  function setDefaultSelect(targetId) {\r\n\t  var target = document.getElementById(targetId);\r\n\t  if (target != null && target.defaultIdx != null) {\r\n\t\t  target.options[target.defaultIdx].selected = true;\r\n\t\t  target.options.value = target.options[target.defaultIdx].value;\r\n\t  }\r\n  };\r\n  \r\n\tfunction getDateType1(date1)\r\n\t{\r\n\t\tvar year= date1.getFullYear();\r\n\t    var mon = (date1.getMonth()+1)>9 ? ''+(date1.getMonth()+1) : '0'+(date1.getMonth()+1);\r\n\t    var day = date1.getDate()>9 ? ''+date1.getDate() : '0'+date1.getDate();\r\n\t\t\r\n\t\treturn (year+\"-\"+mon+\"-\"+day);\r\n\t};\r\n\t\r\n\tfunction add_date(i) ";
  // jsp code [from=(222,26);to=(222,33)]
  private final static String _jspx_template32 = "\r\n\t{\r\n\t   var currentDate; ";
  // jsp code [from=(223,45);to=(223,67)]
  private final static String _jspx_template33 = "\r\n\t   currentDate = this.getDate() + i*1; ";
  // jsp code [from=(224,36);to=(224,51)]
  private final static String _jspx_template34 = "\r\n\t   this.setDate(currentDate); ";
  private final static String _jspx_template35 = "\r\n\t};\r\n\t\r\n\tfunction checkKeySearch(){\r\n\t\tif(event.keyCode == \"13\")\r\n\t\t\tgoSearch();\r\n\t};\r\n\t\r\n\r\n\tfunction changeGuCd(obj){\r\n    \tvar guCd = getSelectedValue(obj);\r\n        var\tparam\t= \"guCd=\"+guCd;\r\n        \r\n        sendRequest(\"/get_bjdong_code.do\", param, \"GET\", ResultChangeGuCd);\r\n    }\r\n\t\r\n\t function\tResultChangeGuCd(obj)\r\n     {\r\n     \tselect_innerHTML(document.getElementById(\"BJ_CD\"), obj);\r\n     \t//********** BEGIN_현진_20120315 kny\r\n     \tchangeGuCdGuGan();\r\n     \t//********** END_현진_20120315 kny\r\n     \t\r\n     }\r\n\r\n\t function changeGuCdGuGan(){\t\t\r\n\t\t\tvar guCd = document.getElementById(\"GU_CD\").value;\t    \t\r\n\t\t\tvar\tparam\t= \"guCd=\"+guCd;\r\n\t\t\tsendRequest(\"/rojum/survey/getSectionCode.do\", param, \"GET\", ResultChangeGuCdGuGan);\r\n\t\t}\r\n\r\n\t function\tResultChangeGuCdGuGan(obj)\r\n\t{\r\n\t\t//select_innerHTML(document.getElementById(\"GUGAN_CD\"),obj);\r\n\t}\r\n\r\n\t////////////////////////////////AJAX////////////////////////////////////////////\r\n     function getXMLHTTPRequest()\r\n     {\r\n         var xRequest = null;\r\n         xRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n         return xRequest;\r\n     }\t\r\n\t \r\n\t var req;\r\n     var call;\r\n\t \r\n\t function sendRequest(url, params, HttpMethod, callback)\r\n     {\r\n         req = getXMLHTTPRequest();\r\n\r\n         call\t= callback;\r\n         if(req){\r\n             req.onreadystatechange = onReadyStateChange;\r\n             req.open(HttpMethod, url, true);\r\n             req.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n             req.send(params);\r\n         }\r\n     }\r\n\r\n\t function onReadyStateChange()\r\n     {\r\n         var ready = req.readyState;\r\n         var data = null;\r\n         if(ready == 4){\r\n             if(this.call\t!= null)\r\n             {\r\n                 this.call(req.responseText);\r\n             }\r\n         }\r\n     }\r\n\r\n     \r\n\r\n\r\n\t\t\r\n\tfunction calcJumyong(){\r\n\t\tvar f = document.jumyongForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no = document.getElementsByName(\"GAPAN_NO\");\r\n\t\tvar section_name = document.getElementsByName(\"SECTION_NAME\");\r\n\t\tvar count = 0;\r\n\t\tvar hitFlag;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\tcount++;\r\n\t\t\t\thitFlag = i;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif(count <= 0){\r\n\t\t\talert(\"처리할 데이터가 없습니다. \");\r\n\t\t\treturn;\r\n\t\t}else if(count == 1){\r\n\t\t\tvar type = f.TYPE.value;\r\n\t\t\tvar section = f.SECTION.value;\r\n\t\t\tvar tax_set = f.TAX_SET.value;\r\n\t\t\tvar bj_cd = f.BJ_CD.value;\r\n\t\t\tvar bonbun  = f.BONBUN.value;\r\n\t\t\tvar bubun = f.BUBUN.value;\r\n\t\t\tvar jumyongName = f.jumyongName.value;\r\n\t\t\tvar numberValue = f.numberValue.value;\r\n\t\t\tvar ft_typ = f.FT_TYP.value;\r\n\r\n\t\t\tvar param = \"/gapan/jumyong/view.do?GAPAN_NO=\"+gapan_no[hitFlag].value+\"&type=\"+type+\"&section=\"+section\r\n\t\t\t\t\t\t\t\t+\"&tax_set=\"+tax_set+\"&ft_typ=\"+ft_typ+\"&bj_cd=\"+bj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun\r\n\t\t\t\t\t\t\t\t+\"&jumyongName=\"+jumyongName+\"&numberValue=\"+numberValue\r\n\t\t\t\t\t\t\t\t+\"&CAL_MODE=cal1&section_name=\"+section_name[hitFlag].value;\r\n\r\n\t\t\tlocation.href=param;\r\n\r\n\t\t}else{\r\n\r\n\t\t\tvar tax_set = '";
  // jsp code [from=(354,6);to=(354,36)]
  private final static String _jspx_template36 = "';\r\n\t\t\tif(tax_set == '%' || tax_set == ''){\r\n\t\t\t\talert('세입구분을 선택하여 조회후 산출해주세요');\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tf.CAL_MODE.value = \"cal1\";\r\n      Message_Display('Dlg_BatchCal1','Dlg_BatchCal1Main',1, 'dialog-background', null,\r\n\t\t\t\tfunction () {\r\n\t\t\t\t\tsetDefaultSelect('YEAR1');\t\r\n\t\t\t\t}\r\n     \t);\r\n\t\t}\r\n\t};\r\n\t\r\n\t";
  // jsp code [from=(386,6);to=(386,44)]
  private final static String _jspx_template37 = "\r\n\tfunction removeJumyong( pYear, pList) {\r\n\t\tvar message = { year : pYear, list : pList};\r\n\t\t$.ajax({\r\n\t\t\ttype: 'POST',\r\n\t\t  url: '/gapan/jumyong/batch_removeJumyong.do',\r\n\t\t  data: {msg : $.toJSON(message)},\r\n\t\t  contentType: 'application/x-www-form-urlencoded; charset=utf-8',\r\n\t\t  dataType: 'json',\r\n\t\t  success: function(data,textStatus,jqXHR){\r\n\t\t\t  var message = \"미부과된 점용료 산출내역 없습니다.\";\r\n\t\t\t  switch(data.result) {\r\n\t\t\t  case 'success': {\r\n\t\t\t\t  message = data.status.year + '년도 산출내역중 삭제 요청' + data.status.total + '건 중  ' + data.status.success + '건 삭제 완료 되었습니다.';\r\n\t\t\t\t  break;\r\n\t\t\t  }\r\n\t\t\t  case 'error': {\r\n\t\t\t\t  break;\r\n\t\t\t  }\r\n\t\t\t  default:\r\n\t\t\t\t  break;\r\n\t\t\t  }\r\n\t\t\t  alert(message);\r\n\t\t\t  Message_Display('waitbar', 'img-wait', 0);\r\n\t\t\t},\r\n\t\t  error: function(jqXHR, textStatus, errorThrown ){\r\n\t\t  \talert(textStatus);\r\n\t\t  \tMessage_Display('waitbar', 'img-wait', 0); \r\n\t\t\t}\r\n\t  });\r\n\t};\r\n\t\r\n\t";
  private final static String _jspx_template38 = "\r\n\tfunction onclickRemoveJumyong() {\r\n\t\tvar taxSet = '";
  // jsp code [from=(411,32);to=(411,49)]
  private final static String _jspx_template39 = "';\r\n\r\n\t\tvar list = new Array();\r\n\t\tif(taxSet == '%' || taxSet == ''){\r\n\t\t\talert('세입구분을 선택하여 조회후 삭제해주세요');\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tvar f = document.jumyongForm;\r\n\t\tvar $checkedtems = $('[name=\"SELECT_ITEM\"]:checked');\r\n\t\tvar len = $checkedtems.length;\r\n\t\t\r\n\t\tif (len > 0) {\r\n\t\t\tMessage_Display('year-selector', 'year-selector-main', 1, \r\n\t\t\t\t\t'dialog-background',\r\n\t\t\t\t\t'점용료 일괄삭제를 위해 산출년도를 선택하세요.',\r\n\t\t\t\t\tfunction () {\r\n\t\t\t\t\t\tsetDefaultSelect('YEAR10');\t\r\n\t\t\t\t\t},\r\n\t\t\t\t\t{\r\n\t\t\t\t\t\tid \t\t: 'positive-button',\r\n\t\t\t\t\t\ttitle : '삭제',\r\n\t\t\t\t\t\tsrc\t\t: '/img/del_icon3.gif',\r\n\t\t\t\t\t\tfunc \t: function() { ";
  // jsp code [from=(433,32);to=(433,49)]
  private final static String _jspx_template40 = "\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\tMessage_Display('waitbar', 'img-wait', 1, 'dialog-background');\r\n\t\t\t\t\t\t\tvar year = $('#YEAR10').val();\r\n\t\t\t\t\t\t\tvar $selectItems = $('[name=\"SELECT_ITEM\"]');\r\n\t\t\t\t\t\t\tvar $gapanNos = $('[name=\"GAPAN_NO\"]');\r\n\t\t\t\t\t\t\tvar $sectionNames = $('[name=\"SECTION_NAME\"]');\r\n\t\t\t\t\t\t\tvar len = $checkedtems.length;\r\n\t\r\n\t\t\t\t\t\t\tfor (var i = 0; i < len; i++) {\r\n\t\t\t\t\t\t\t\tvar item = {};\r\n\t\t\t\t\t\t\t\tif ($selectItems.eq(i).is(\":checked\")) {\r\n\t\t\t\t\t\t\t\t\titem.no = $gapanNos.eq(i).val();\r\n\t\t\t\t\t\t\t\t\titem.secton = $sectionNames.eq(i).val();\r\n\t\t\t\t\t\t\t\t\tlist.push(item);\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\tremoveJumyong(year, list);\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t},\r\n\t\t\t\t\t{\r\n\t\t\t\t\t\tid\t\t: 'negative-button',\r\n\t\t\t\t\t\ttitle\t: '취소',\r\n\t\t\t\t\t\tfunc \t: function() { ";
  // jsp code [from=(488,6);to=(488,36)]
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t);\r\n\t\t} else {\r\n\t\t\talert(\"처리할 데이터가 없습니다. \");\r\n\t\t\treturn;\r\n\t\t}\t\t\r\n\t};\r\n\t\r\n\tfunction calcRent(){\r\n\t\tvar f = document.jumyongForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no = document.getElementsByName(\"GAPAN_NO\");\r\n\t\tvar section_name = document.getElementsByName(\"SECTION_NAME\");\r\n\t\tvar count = 0;\r\n\t\tvar hitFlag;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\tcount++;\r\n\t\t\t\thitFlag = i;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif(count <= 0){\r\n\t\t\talert(\"처리할 데이터가 없습니다. \");\r\n\t\t\treturn;\r\n\t\t}else if(count == 1){\r\n\t\t\tvar type = f.TYPE.value;\r\n\t\t\tvar section = f.SECTION.value;\r\n\t\t\tvar tax_set = f.TAX_SET.value;\r\n\t\t\tvar bj_cd = f.BJ_CD.value;\r\n\t\t\tvar bonbun  = f.BONBUN.value;\r\n\t\t\tvar bubun = f.BUBUN.value;\r\n\t\t\tvar jumyongName = f.jumyongName.value;\r\n\t\t\tvar numberValue = f.numberValue.value;\r\n\t\t\tvar ft_typ = f.FT_TYP.value;\r\n\t\t\tvar param = \"/gapan/jumyong/view.do?GAPAN_NO=\"+gapan_no[hitFlag].value+\"&type=\"+type+\"&section=\"+section\r\n\t\t\t\t+\"&tax_set=\"+tax_set+\"&ft_typ=\"+ft_typ+\"&bj_cd=\"+bj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun\r\n\t\t\t\t+\"&jumyongName=\"+jumyongName+\"&numberValue=\"+numberValue\r\n\t\t\t\t+\"&CAL_MODE=cal4&section_name=\"+section_name[hitFlag].value;\r\n\t\t\tlocation.href=param;\r\n\t\t}else{\r\n\t\t\tf.CAL_MODE.value = \"cal4\";\r\n      Message_Display('Dlg_BatchCal4','Dlg_BatchCal4Main',1,'dialog-background', null,\r\n    \t\tfunction () {\r\n\t\t\t\t\tsetDefaultSelect('YEAR1');\t\r\n\t\t\t\t}\r\n      );\r\n\t\t}\r\n\r\n\t};\r\n\t\r\n\t";
  // jsp code [from=(520,6);to=(520,43)]
  private final static String _jspx_template42 = "\r\n\tfunction removeRent( pYear, pList) {\r\n\t\tvar message = { year : pYear, list : pList};\r\n\t\t$.ajax({\r\n\t\t\ttype: 'POST',\r\n\t\t  url: '/gapan/jumyong/batch_removeRental.do',\r\n\t\t  data: {msg : $.toJSON(message)},\r\n\t\t  contentType: 'application/x-www-form-urlencoded; charset=utf-8',\r\n\t\t  dataType: 'json',\r\n\t\t  success: function(data,textStatus,jqXHR){\r\n\t\t\t  var message = '미부과된 대부료 산출내역 및 삭제 내역이 없습니다.';\r\n\t\t\t  switch(data.result) {\r\n\t\t\t  case 'success': {\r\n\t\t\t\t  message = data.status.year + '년도 산출내역중 삭제 요청' + data.status.total + '건 중  ' + data.status.success + '건 삭제 완료 되었습니다.';\r\n\t\t\t\t  break;\r\n\t\t\t  }\r\n\t\t\t  case 'error': {\r\n\t\t\t\t  break;\r\n\t\t\t  }\r\n\t\t\t  default:\r\n\t\t\t\t  break;\r\n\t\t\t  }\r\n\t\t\t  alert(message);\r\n\t\t\t  Message_Display('waitbar', 'img-wait', 0);\r\n\t\t\t},\r\n\t\t  error: function(jqXHR, textStatus, errorThrown ){\r\n\t\t  \talert(textStatus);\r\n\t\t  \tMessage_Display('waitbar', 'img-wait', 0); \r\n\t\t\t}\r\n\t  });\r\n\t};\r\n\r\n\t";
  private final static String _jspx_template43 = "\r\n\tfunction onclickRemoveRent() {\r\n\t\tvar taxSet = '";
  // jsp code [from=(545,31);to=(545,48)]
  private final static String _jspx_template44 = "';\r\n\r\n\t\tvar list = new Array();\r\n\t\tif(taxSet == '%' || taxSet == ''){\r\n\t\t\talert('세입구분을 선택하여 조회후 삭제해주세요');\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tvar f = document.jumyongForm;\r\n\t\tvar $checkedtems = $('[name=\"SELECT_ITEM\"]:checked');\r\n\t\tvar len = $checkedtems.length;\r\n\t\t\r\n\t\tif (len > 0) {\r\n\t\t\tMessage_Display('year-selector', 'year-selector-main', 1, \r\n\t\t\t\t'dialog-background',\r\n\t\t\t\t'대부료 일괄삭제를 위해 산출년도를 선택하세요.',\r\n\t\t\t\tfunction() {\r\n\t\t\t\t\tsetDefaultSelect('YEAR10');\r\n\t\t\t\t},\r\n\t\t\t\t{\r\n\t\t\t\t\tid \t\t: 'positive-button',\r\n\t\t\t\t\ttitle : '삭제',\r\n\t\t\t\t\tsrc\t\t: '/img/del_icon3.gif',\r\n\t\t\t\t\tfunc \t: function() { ";
  // jsp code [from=(567,31);to=(567,48)]
  private final static String _jspx_template45 = "\t\t\t\t\t\t\t\r\n\t\t\t\t\t\tMessage_Display('waitbar', 'img-wait', 1, 'dialog-background');\r\n\t\t\t\t\t\tvar year = $('#YEAR10').val();\r\n\t\t\t\t\t\tvar $selectItems = $('[name=\"SELECT_ITEM\"]');\r\n\t\t\t\t\t\tvar $gapanNos = $('[name=\"GAPAN_NO\"]');\r\n\t\t\t\t\t\tvar $sectionNames = $('[name=\"SECTION_NAME\"]');\r\n\t\t\t\t\t\tvar len = $checkedtems.length;\r\n\t\t\r\n\t\t\t\t\t\tfor (var i = 0; i < len; i++) {\r\n\t\t\t\t\t\t\tvar item = {};\r\n\t\t\t\t\t\t\tif ($selectItems.eq(i).is(\":checked\")) {\r\n\t\t\t\t\t\t\t\titem.no = $gapanNos.eq(i).val();\r\n\t\t\t\t\t\t\t\titem.secton = $sectionNames.eq(i).val();\r\n\t\t\t\t\t\t\t\tlist.push(item);\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\tremoveRent(year, list);\r\n\t\t\t\t\t}\r\n\t\t\t\t},\r\n\t\t\t\t{\r\n\t\t\t\t\tid\t\t: 'negative-button',\r\n\t\t\t\t\ttitle\t: '취소',\r\n\t\t\t\t\tfunc \t: function() { ";
  private final static String _jspx_template46 = "\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t);\r\n\t\t} else {\r\n\t\t\talert(\"처리할 데이터가 없습니다. \");\r\n\t\t\treturn;\r\n\t\t}\t\t\r\n\t};\r\n\t    \r\n\tfunction goExtension(){\r\n\t\tvar f = document.jumyongForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no = document.getElementsByName(\"GAPAN_NO\");\r\n\t\tvar count = 0;\r\n\t\tvar hitFlag;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\tcount++;\r\n\t\t\t\thitFlag = i;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif(count <= 0){\r\n\t\t\talert(\"처리할 데이터가 없습니다. \");\r\n\t\t\treturn;\r\n\t\t}else{\r\n\t\t\tMessage_Display('Dlg_BatchExtention','Dlg_BatchExtentionMain',1,'dialog-background');\r\n\t\t}\r\n\t};\r\n\t\r\n\tfunction goExtentionSubmit(){\r\n\t\tvar form \t= document.jumyongForm;\r\n\t\tvar\tstr\t\t= \"\";\r\n    \t\t\r\n\t\tif(form.NEW_MUL_FROMDATE.value.length\t< 1){\r\n    \tstr\t+= \"점용허가 시작일을 선택하세요.\\n\";\r\n    \tform.NEW_MUL_FROMDATE.focus();\r\n    }else if(form.NEW_MUL_TODATE.value.length\t< 1){\r\n    \tstr\t+= \"점용허가 종료일을 선택하세요.\\n\";\r\n    \tform.NEW_MUL_TODATE.focus();\r\n    }else if((Number(removeDash(form.NEW_MUL_TODATE.value))-Number(removeDash(form.NEW_MUL_FROMDATE.value))) < 2){\r\n    \tstr\t+= \"점용허가 종료일보다 시작일이 빠를수 없습니다.\\n\";\r\n    }\r\n\r\n    if(str\t== \"\") {\r\n\t\t\tif(!confirm('점용허가기간을 변경하시겠습니까?')){\r\n      \treturn;\r\n      }\r\n    \tdocument.jumyongForm.action = '/gapan/jumyong/batch_extention.do';\r\n    \tdocument.jumyongForm.submit();\r\n    } else {\r\n    \talert(str);\r\n    \treturn;\r\n    }\r\n\t};\r\n\t\t\t\r\n</script>\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n<form id=\"jumyongForm\" name=\"jumyongForm\" action=\"/mdb/executeUpload.do\" method=\"post\" enctype=\"multipart/form-data\">\r\n<input name=\"toDateValue\" id = \"toDateValue\" value=\"";
  private final static String _jspx_template47 = "\" type=\"hidden\">\r\n<input name=\"fromDateValue\" id = \"fromDateValue\" value=\"";
  private final static String _jspx_template48 = "\" type=\"hidden\">\r\n<input name=\"TYPE\" id=\"TYPE\" value=\"1\" type=\"hidden\">\r\n<input name=\"CAL_MODE\" id=\"CAL_MODE\" type=\"hidden\" >\r\n<div id=\"dialog-background\" class=\"dialog-background\"></div>\r\n<div id=\"waitbar\" style=\"position: absolute;z-index: 100;visibility: hidden;\">\r\n<img src=\"/img/wait.gif\" id=\"img-wait\">\r\n</div>\r\n<div id=\"year-selector\" style=\"position:absolute;z-index: 100;visibility:hidden;\">\r\n\t<table id=\"year-selector-main\" width=\"300px\" height=\"150px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;background-color:#c9dfed;filter:Alpha(Opacity=90)\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\">\r\n\t\t\t\t<table width=\"290px\" height=\"140px\" border=\"0\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"5px\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t<font color=\"red\"><span id=\"message\">empty</span></font>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t산출년도\r\n\t\t\t\t\t\t\t<select name=\"YEAR10\" id=\"YEAR10\" class=\"input_form1\" style=\"width:60px\">\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" >\r\n\t\t\t\t\t\t\t<img id=\"positive-button\" src=\"/img/cal_icon.gif\" alt=\"산출\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor:pointer\">\r\n\t\t\t\t\t\t\t<img id=\"negative-button\" src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</div>\r\n\r\n\r\n<div id=\"Dlg_BatchExtention\" style=\"position:absolute;visibility:hidden;z-index: 100;\">\r\n\t<table id=\"Dlg_BatchExtentionMain\" width=\"300px\" height=\"150px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;background-color:#c9dfed;filter:Alpha(Opacity=90)\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\">\r\n\t\t\t\t<table width=\"290px\" height=\"140px\" border=\"0\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"5px\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t<font color=\"red\">새로운 점용허가기간을 선택하세요.</font>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td  align=\"center\">\r\n\t\t\t\t\t\t\t<input name=\"NEW_MUL_FROMDATE\" id =\"NEW_MUL_FROMDATE\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly>\r\n\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer\" onclick=\"popUpCalendar(this, document.getElementById('NEW_MUL_FROMDATE'), 'yyyymmdd');\">\r\n\t\t\t\t\t\t\t&nbsp;~&nbsp;\r\n\t\t\t\t\t\t\t<input name=\"NEW_MUL_TODATE\" id =\"NEW_MUL_TODATE\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly>\r\n\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer\" onclick=\"popUpCalendar(this, document.getElementById('NEW_MUL_TODATE'), 'yyyymmdd');\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" >\r\n\t\t\t\t\t\t\t<img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\" onClick=\"goExtentionSubmit();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"Message_Display('Dlg_BatchExtention','Dlg_BatchExtentionMain',0);\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</div>\r\n\r\n<div id=\"Dlg_BatchCal1\" style=\"position:absolute;visibility:hidden;z-index: 100;\">\r\n\t<table id=\"Dlg_BatchCal1Main\" width=\"300px\" height=\"150px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;background-color:#c9dfed;filter:Alpha(Opacity=90)\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\">\r\n\t\t\t\t<table width=\"290px\" height=\"140px\" border=\"0\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"5px\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t<font color=\"red\">일괄 점용료계산을 위해 산출년도를 선택하세요.</font>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t산출년도\r\n\t\t\t\t\t\t\t<select name=\"YEAR1\" id=\"YEAR1\" class=\"input_form1\" style=\"width";
  private final static String _jspx_template49 = ":60px\">\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" >\r\n\t\t\t\t\t\t\t<img src=\"/img/cal_icon.gif\" alt=\"산출\" width=\"56\" height=\"18\" border=\"0\" onClick=\"document.jumyongForm.action = '/gapan/jumyong/batch_cal1.do';document.jumyongForm.submit();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"Message_Display('Dlg_BatchCal1','Dlg_BatchCal1Main',0);\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</div>\r\n\r\n<div id=\"Dlg_BatchCal4\" style=\"position:absolute;visibility:hidden;z-index: 100;\">\r\n\t<table id=\"Dlg_BatchCal4Main\" width=\"300px\" height=\"150px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;background-color:#c9dfed;filter:Alpha(Opacity=90)\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\">\r\n\t\t\t\t<table width=\"290px\" height=\"140px\" border=\"0\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"5px\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t<font color=\"red\">일괄 임대료 계산을 위해 산출년도를 선택하세요.</font>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t산출년도\r\n\t\t\t\t\t\t\t<select name=\"YEAR4\" id=\"YEAR4\" class=\"input_form1\" style=\"width:60px\">\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" >\r\n\t\t\t\t\t\t\t<img src=\"/img/cal_icon.gif\" alt=\"산출\" width=\"56\" height=\"18\" border=\"0\" onClick=\"document.jumyongForm.action = '/gapan/jumyong/batch_cal4.do';document.jumyongForm.submit();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"Message_Display('Dlg_BatchCal4','Dlg_BatchCal4Main',0);\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</div>\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub9_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td ><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>     \r\n      <tr>\r\n        <td><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr >\r\n                  <td ><img src=\"/img/sub_petition_title15.gif\" width=\"110\" height=\"22\"></td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n\t\t<tr>\r\n            <td  class=\"contborder_purple\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n              <tr>\r\n                <td>\r\n                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\r\n                    <tr>\r\n                      <td height=\"26px\" width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t  <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <select id=\"TAX_SET\" name=\"TAX_SET\" class=\"essential\" style=\"width:130px\">\r\n\t\t\t\t\t\t";
  // jsp code [from=(812,10);to=(812,32)]
  private final static String _jspx_template50 = "\r\n\t\t\t\t\t  </select>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t";
  // jsp code [from=(813,10);to=(823,7)]
  private final static String _jspx_template51 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template52 = "\r\n\t\t\t\t\t <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >관리번호</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  \t<input id=\"numberValue\" name=\"numberValue\" type=\"text\" class=\"input_form1\" style=\"width:130px\"  onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  // jsp code [from=(828,10);to=(828,29)]
  private final static String _jspx_template53 = "\">\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n                    </tr>\r\n                    <tr>\r\n                      <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<!--\r\n\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width:130px\">";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width: 130px\" onchange=\"javascript:changeGuCd(this);\">\r\n                                    ";
  private final static String _jspx_template56 = "\r\n                                </select>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t  </table>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법정동</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr>\r\n\t                      <td>\r\n\t                      <select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width:130px\">";
  private final static String _jspx_template57 = "\r\n\t                      </select>\r\n\t                      </td>\r\n\t\t\t\t\t\t </tr>\r\n\t\t\t\t\t  </table>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t</tr> \r\n                    <tr>\r\n           \t\t\t  <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번 지 </td>\r\n\t                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                        <tr>\r\n\t                          <td>\r\n\t                          <input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" class=\"input_form1\" style=\"width:40px\" >\r\n\t\t\t\t\t\t\t- <input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" class=\"input_form1\" style=\"width:40px\" >\r\n\t                          </td>\r\n\t                        </tr>\r\n\t                      </table>\r\n                      </td>\r\n\t\t\t\t\t   <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                        <tr>\r\n                          <td><input name=\"jumyongName\" id=\"jumyongName\" type=\"text\" class=\"input_form1\" style=\"width:130px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  // jsp code [from=(880,10);to=(880,31)]
  private final static String _jspx_template58 = "\"></td>\r\n                        </tr>\r\n                      </table></td>\r\n                    </tr>\r\n                \t<tr>\r\n\t\t\t\t\t";
  // jsp code [from=(881,10);to=(886,7)]
  private final static String _jspx_template59 = "\r\n\t\t\t\t\t";
  // jsp code [from=(896,10);to=(896,29)]
  private final static String _jspx_template60 = "\r\n\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물명</td>\r\n\t\t\t\t\t  <td height=\"26px\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<select name=\"FT_TYP\" id=\"FT_TYP\" class=\"input_form1\" style=\"width:150px\" onchange=\"javascript:selectFT_TYP(this)\">\r\n\t\t\t\t\t\t\t<option value=\"%\">::선택::</option>\r\n\t\t\t\t\t\t\t<option value=\"011\">가로판매대</option>\r\n\t\t\t\t\t\t\t<option value=\"012\">구두수선대</option>\r\n\t\t\t\t\t\t</select>\t\t\t\t\t\t\t\t\t\t\t  \r\n\t\t\t\t\t  </td>\t\t\r\n\t\t\t\t\t";
  // jsp code [from=(905,10);to=(905,31)]
  private final static String _jspx_template61 = "                \t\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">폐쇄목록</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<select id=\"SECTION\" name=\"SECTION\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t<option value=\"1\">감춤</option>\r\n\t\t\t\t\t\t\t\t<option value=\"4\">보기</option>\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template62 = "\r\n\t\t\t\t\t<tr>\r\n                \t  <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >시설물 번호</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n                      <div id=\"FacilityView\" style=\"display:none\">                      \r\n                      \t<table width=\"300px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"left\">\r\n                      \t\t<tr>\r\n                      \t\t\t<td align=\"left\" class=\"sub_stan\" >                      \t\t\t\t\r\n                      \t\t\t\t<span id=\"Facility\" class=\"sub_stan\"></span>&nbsp;-&nbsp;\r\n                      \t\t\t\t<input id=\"FACILITY_NO\" name=\"FACILITY_NO\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onchange=\"isNum(this,'시설물 번호')\" maxlength=\"5\" value=\"";
  // jsp code [from=(921,10);to=(921,29)]
  private final static String _jspx_template63 = "\"/> \r\n                      \t\t\t</td>                      \t\t\t\r\n                      \t\t</tr>\r\n                      \t</table>\r\n                      </div>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template64 = "\r\n                </table>\r\n                </td>\r\n              </tr>\r\n                <tr>\r\n                  <td height=\"40\" align=\"right\">\r\n                  \t<img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:goSearch();\" style=\"cursor:pointer\" >\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  // jsp code [from=(960,16);to=(960,37)]
  private final static String _jspx_template65 = "</span>건 </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n                  \t<table width=\"780px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t  <TR> <!-- \r\n\t\t\t\t\t\t\t\t    <TD width=\"26px\"  valign=\"top\">\r\n\t\t\t\t\t\t\t\t      <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t        <TR>\r\n\t\t\t\t\t\t\t\t              <td width=\"35px\" height=\"30px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" ID=\"SELECT_ALL\" onclick=\"javascript:selectAll(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t        </TR>\r\n\t\t\t\t\t\t\t\t      </TABLE>\r\n\t\t\t\t\t\t\t\t    </TD> -->\r\n\t\t\t\t\t\t\t\t    <TD width=\"2000px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t      <DIV id=\"topLine2\" style=\"width:737px;overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t        <TABLE width=\"1530px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t          <TR>\r\n\t\t\t\t\t\t\t\t          \r\n\t\t\t\t\t\t\t\t          \t<td width=\"35px\" height=\"30px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" ID=\"SELECT_ALL\" onclick=\"javascript:selectAll(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t  \t\t</td>\r\n\t\t\t\t\t\t\t\t          \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"40px\" height=\"30px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t                  <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  // jsp code [from=(962,16);to=(962,35)]
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"130px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물 번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  // jsp code [from=(966,34);to=(966,58)]
  private final static String _jspx_template67 = "\t\t\t\t\t                        \r\n\t\t\t\t\t                        <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t                        <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영인</td>\r\n\t\t\t\t\t                        <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지</td>\r\n\t\t\t\t\t                        ";
  // jsp code [from=(968,34);to=(968,56)]
  private final static String _jspx_template68 = "\r\n\t\t\t\t\t                        <td width=\"250px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명주소</td>\r\n\t\t\t\t\t                        ";
  // jsp code [from=(969,34);to=(969,56)]
  private final static String _jspx_template69 = "\r\n\t\t\t\t\t                        ";
  // jsp code [from=(972,16);to=(972,35)]
  private final static String _jspx_template70 = "\r\n\t\t\t\t\t                        <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t                        <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  // jsp code [from=(973,34);to=(973,53)]
  private final static String _jspx_template71 = "\r\n\t\t\t\t\t                        ";
  // jsp code [from=(974,16);to=(976,13)]
  private final static String _jspx_template72 = "\r\n\t\t\t\t\t\t\t\t\t\t\t";
  // jsp code [from=(977,16);to=(977,33)]
  private final static String _jspx_template73 = "\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template74 = "\t\t\t\t\t                       \r\n\t\t\t\t\t                        <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물명</td>\r\n\t\t\t\t\t                        <td width=\"50px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">벌점</td>\r\n\t\t\t\t\t                        \r\n\t\t\t\t\t                        <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">위반내역</td>\r\n\t\t\t\t\t                        <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리내역</td>\r\n\t\t\t\t\t                        \r\n\t\t\t\t\t                        <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t\t                        <td width=\"50px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적(㎡)</td>                       \r\n\t\t\t\t\t                        <td width=100px align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">갱신일자</td>                                                 \r\n\t\t\t\t\t\t\t\t          </TR>\r\n\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t  <TR><!-- \r\n\t\t\t\t\t\t\t\t    <TD width=\"26px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t      <DIV id=\"leftDisplay2\" style=\"width:26px;height:257px;overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t        <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t          \t\t\t";
  private final static String _jspx_template75 = "\r\n\t\t\t\t\t\t  \t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor: pointer\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t<td width=\"35px\" height=\"29px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" id=\"SELECT_ITEM\" NAME=\"SELECT_ITEM\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" id=\"GAPAN_NO\" NAME=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template76 = "\"> \r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" id=\"SECTION_NAME\" NAME=\"SECTION_NAME\" value=\"";
  private final static String _jspx_template77 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" id=\"ITEM_CHECK\" NAME=\"ITEM_CHECK\" value=\"\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  // jsp code [from=(1010,17);to=(1010,36)]
  private final static String _jspx_template78 = "\r\n\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t    </TD> -->\r\n\t\t\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template79 = "\r\n\t\t\t\t\t\t\t\t      <DIV id=\"mainDisplay2\" style=\"width:754px;height:274px;overflow-x:scroll;overflow-y:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\" onscroll=\"scrollColumn()\">\r\n\t\t\t\t\t\t\t\t\t\t <TABLE width=\"1530px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t          ";
  private final static String _jspx_template80 = "\r\n\t\t\t\t\t\t\t\t          \r\n\t\t\t\t\t\t\t\t          <tr>\r\n\t\t\t\t\t\t\t\t          \t<td rowspan=\"2\" width=\"35px\" height=\"29px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" id=\"SELECT_ITEM\" NAME=\"SELECT_ITEM\">\r\n\t\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" id=\"GAPAN_NO\" NAME=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template81 = "\"> \r\n\t\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" id=\"SECTION_NAME\" NAME=\"SECTION_NAME\" value=\"";
  private final static String _jspx_template82 = "\">\r\n\t\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" id=\"ITEM_CHECK\" NAME=\"ITEM_CHECK\" value=\"\">\r\n\t\t\t\t\t\t\t  \t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t          </tr>\r\n\t\t\t\t\t\t\t\t          \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr height=\"26px\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor: pointer\" onclick=\"goView('";
  private final static String _jspx_template83 = "');\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"40px\" align=\"center\"> ";
  private final static String _jspx_template84 = "</td>\r\n\t\t\t\t\t\t\t                        <td width=\"100px\" align=\"center\" >";
  // jsp code [from=(1027,18);to=(1027,39)]
  private final static String _jspx_template85 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template86 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"130px\" align=\"center\" >";
  private final static String _jspx_template87 = " - ";
  // jsp code [from=(1029,18);to=(1029,37)]
  private final static String _jspx_template88 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template89 = "\t\t\t\t\t\t\t                        \r\n\t\t\t\t\t\t\t                        <td width=\"80px\" align=\"center\">";
  private final static String _jspx_template90 = "</td>                        \r\n\t\t\t\t\t\t\t                        <td width=\"80px\" align=\"center\">";
  private final static String _jspx_template91 = "</td>\r\n\t\t\t\t\t\t\t                        <td width=\"150px\" align=\"center\">";
  // jsp code [from=(1033,36);to=(1033,59)]
  private final static String _jspx_template92 = "</td>\r\n\t\t\t\t\t\t\t                        ";
  private final static String _jspx_template93 = "\r\n\t\t\t\t\t\t\t                        <td width=\"300px\" align=\"center\" >";
  private final static String _jspx_template94 = " ";
  private final static String _jspx_template95 = " ";
  private final static String _jspx_template96 = " ";
  private final static String _jspx_template97 = "-";
  private final static String _jspx_template98 = " ";
  private final static String _jspx_template99 = " ";
  // jsp code [from=(1035,36);to=(1035,57)]
  private final static String _jspx_template100 = "</td>\r\n\t\t\t\t\t\t\t                        ";
  private final static String _jspx_template101 = "\t\r\n\t\t\t\t\t\t\t                        <!--  //********** BEGIN_KANG_20120420 -->\r\n\t\t\t\t\t\t\t                        <td width=\"100px\" align=\"center\">";
  private final static String _jspx_template102 = "</td>\r\n\t\t\t\t\t\t\t                        <td width=\"100px\" align=\"center\">";
  // jsp code [from=(1039,18);to=(1039,37)]
  private final static String _jspx_template103 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  // jsp code [from=(1040,24);to=(1040,43)]
  private final static String _jspx_template104 = "\r\n\t\t\t\t\t\t\t            ";
  // jsp code [from=(1041,18);to=(1043,14)]
  private final static String _jspx_template105 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  // jsp code [from=(1044,18);to=(1044,35)]
  private final static String _jspx_template106 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template107 = "\t\t\t\t\t\t\t                        \r\n\t\t\t\t\t\t\t                        <td width=\"100px\" align=\"center\">";
  private final static String _jspx_template108 = "</td>    \r\n\t\t\t\t\t\t\t                        <td width=\"50px\" align=\"center\">\r\n\t\t\t\t\t                        \t\t";
  private final static String _jspx_template109 = "\r\n\t\t\t\t\t                        \t\t";
  private final static String _jspx_template110 = "\r\n\t\t\t\t\t                        \t\t<font color=\"red\">";
  private final static String _jspx_template111 = "</font>\r\n\t\t\t\t\t                        \t\t";
  private final static String _jspx_template112 = "\r\n\t\t\t\t\t                        \t\t";
  private final static String _jspx_template113 = "\r\n\t\t\t\t\t                        \t\t";
  private final static String _jspx_template114 = "\r\n\t\t\t\t\t                        \t\t";
  private final static String _jspx_template115 = "\r\n\t\t\t\t\t                        \t\t";
  private final static String _jspx_template116 = "\r\n\t\t\t\t\t                        \t\t</td>\r\n\t\t\t\t\t                        \t\t<td width=\"150px\" align=\"center\">";
  private final static String _jspx_template117 = "</td>\r\n\t\t\t\t\t                        \t\t<td width=\"150px\" align=\"center\">";
  private final static String _jspx_template118 = "</td>\r\n\t\t\t\t\t\t\t                        <td width=\"150px\" align=\"center\">";
  private final static String _jspx_template119 = " ~ ";
  private final static String _jspx_template120 = "</td>\r\n\t\t\t\t\t                        \t\t<td width=\"50px\" align=\"center\">";
  private final static String _jspx_template121 = "</td>                                                                 \t                        \r\n\t\t\t\t\t\t\t                        <td width=\"100px\" align=\"center\">";
  private final static String _jspx_template122 = "</td>                                                                           \r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  // jsp code [from=(1066,17);to=(1066,36)]
  private final static String _jspx_template123 = "\t\r\n\t\t\t\t\t\t\t\t        </TABLE>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        \r\n\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t    ";
  // jsp code [from=(1076,26);to=(1083,23)]
  private final static String _jspx_template124 = "\r\n\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t \t\t\t </td>\r\n                </tr>\r\n\t              <tr>              \r\n\t\t                <td height=\"40\" align=\"right\">\r\n\t\t\t                <table border=\"0\" width=\"100%\">\r\n\t\t\t                \t<tr>\r\n\t\t\t\t                \t<td align=\"right\">\r\n\t\t\t\t                \t";
  // jsp code [from=(1084,27);to=(1084,51)]
  private final static String _jspx_template125 = "\r\n\t\t\t\t\t                 ";
  private final static String _jspx_template126 = "\r\n\t\t\t                            <img src=\"/img/rojum_register.gif\" id=\"register\" alt=\"신규등록\" border=\"0\" onclick=\"javascript:gapanRegister();\">\r\n\t\t\t\t                \t\t<img src=\"/img/gapan_cal1_n_del.gif\" alt=\"점용료 산출 | 삭제\" border=\"0\" style=\"cursor: pointer;\" usemap=\"#cal1map\">\r\n\t\t\t\t                \t\t<map name=\"cal1map\">\r\n\t\t\t\t                \t\t\t<area shape=\"rect\" coords=\"5,2,81,20\" onclick=\"javascript:calcJumyong();\" alt=\"점용로 산출\" />\r\n\t\t\t\t                \t\t\t<area shape=\"rect\" coords=\"83,2,115,20\" onclick=\"javascript:onclickRemoveJumyong();\" alt=\"점용로 삭제\" />\r\n\t\t\t\t                \t\t</map>\r\n\t\t\t\t                \t\t<img src=\"/img/gapan_cal4_n_del.gif\" alt=\"대부료 산출 | 삭제\" border=\"0\" style=\"cursor: pointer;\" usemap=\"#cal4map\">\r\n\t\t\t\t                \t\t<map name=\"cal4map\">\r\n\t\t\t\t                \t\t\t<area shape=\"rect\" coords=\"7,2,84,20\" onclick=\"javascript:calcRent();\" alt=\"대부료 산출\" />\r\n\t\t\t\t                \t\t\t<area shape=\"rect\" coords=\"86,2,114,20\" onclick=\"javascript:onclickRemoveRent();\" alt=\"대부료 삭제\" />\r\n\t\t\t\t                \t\t</map>\r\n\t\t\t\t                \t\t<img src=\"/img/extension.gif\" alt=\"허가기간 연장\" border=\"0\" onclick=\"javascript:goExtension();\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t                \t<img src=\"/img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:pointer;\">\t\t\t\t\t              \r\n\t\t\t\t\t                </td>\t\t\t\t\t\t                \r\n\t\t\t\t                </tr>\r\n\t\t\t\t             </table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t              </tr>\r\n            </table></td>\r\n          </tr>\r\n        </table></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n</table>\r\n</td></tr></table>\r\n</form>\r\n</body>\r\n\r\n<script type=\"text/javascript\">\r\n\r\nvar org_cd = ";
  private final static String _jspx_template127 = ";\t\t\t\t//사용자 시군구 기관 코드\r\nvar dept_cd = ";
  private final static String _jspx_template128 = ";\t\t\t//사용자 부서코드\r\n\tif(org_cd==0 && user == 'k00000013'){\r\n\t\t//$(\"#register\").show();\r\n\t\t///$(\"#register\").show();\r\n\t\t$(\"#register\").show();\r\n\t}else if(user == 'roadsdb'){\r\n\t\t$(\"#register\").show();\r\n\t}else{\r\n\t\t//$(\"#register\").hide();\r\n\t\t$(\"#register\").hide();\r\n\t}\r\n</script>\r\n\r\n</html>";
}
