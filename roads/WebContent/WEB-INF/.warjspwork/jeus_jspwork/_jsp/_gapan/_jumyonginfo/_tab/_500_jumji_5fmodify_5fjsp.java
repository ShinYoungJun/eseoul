package jeus_jspwork._jsp._gapan._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumji_5fmodify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(74,16);to=(74,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIDO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(74,26);to=(74,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      out.write(_jspx_template13);
      // jsp code [from=(272,17);to=(272,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIDO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(272,38);to=(272,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      out.write(_jspx_template16);
      // jsp code [from=(479,19);to=(479,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ft_sel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(480,19);to=(480,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ft_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(526,23);to=(526,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(563,43);to=(563,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(563,77);to=(563,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(566,62);to=(566,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(567,60);to=(567,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(568,60);to=(568,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${X_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(569,60);to=(569,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Y_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(570,62);to=(570,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WITH_PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(571,66);to=(571,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CD }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(572,72);to=(572,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SHOP_IMG_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(599,13);to=(599,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(609,66);to=(609,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(618,62);to=(618,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(635,28);to=(635,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIDO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(635,50);to=(635,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(638,15);to=(638,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(644,15);to=(644,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(656,54);to=(656,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(660,52);to=(660,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(674,94);to=(674,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WITH_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(675,92);to=(675,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WITH_BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(676,90);to=(676,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WITH_BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(684,111);to=(684,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(685,121);to=(685,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIDO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(685,131);to=(685,138)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(710,81);to=(710,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SHOP_IMG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(719,111);to=(719,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_INFO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(725,111);to=(725,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_INFO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(732,13);to=(732,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ar_sel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(734,105);to=(734,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AR_TXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(743,115);to=(743,131)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FOUND_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(757,13);to=(757,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${uc_sel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(759,105);to=(759,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.UC_TXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(763,129);to=(763,162)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SF_VALUE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template52);
      // jsp code [from=(794,56);to=(794,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_L}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(799,56);to=(799,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_H}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(804,56);to=(804,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_A}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(816,57);to=(816,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CHANGE_Y}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(817,56);to=(817,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CHANGE_M}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template60);
      // jsp code [from=(832,181);to=(832,198)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.facility_No}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(843,57);to=(843,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CHANGE_Y}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(844,56);to=(844,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CHANGE_M}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(867,15);to=(867,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sg_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // jsp code [from=(881,15);to=(881,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sg_itm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template65);
      // jsp code [from=(887,15);to=(887,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sg_sel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template66);
      // jsp code [from=(895,54);to=(895,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MEM_NUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(905,62);to=(905,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OPEN_TIME1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);
      // jsp code [from=(909,62);to=(909,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OPEN_TIME2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template69);
      // jsp code [from=(913,64);to=(913,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CLOSE_TIME1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // jsp code [from=(917,64);to=(917,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CLOSE_TIME2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template71);
      // jsp code [from=(927,67);to=(927,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERMIT_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template72);
      // jsp code [from=(940,58);to=(940,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DAY_SALES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template73);
      // jsp code [from=(948,146);to=(948,157)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NOTES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template74);
      // jsp code [from=(956,38);to=(956,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template75);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ft_typ == '011' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template58);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ft_typ == '012' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template59);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
  }

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:insertComma2", main.java.common.util.StringUtil.class, "insertComma2", new Class[] {java.lang.String.class});

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template10 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t\r\n\tfunction\tModifyPrc()\r\n\t{\r\n\t\tvar\tresult\t= DataCheck();\r\n\t\t\r\n\t\tif(result\t==\tfalse)\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\r\n\t\r\n\r\n\t\t//김권태 . 2009.11.09 수정\r\n\t\t//점용지 미입력\r\n\t\tvar BJ_CD = form.BJ_CD.value;\r\n\t\tvar SPC_CD = form.SPC_CD.value;\r\n\t\tvar BONBUN = form.BONBUN.value;\r\n\t\tvar BUBUN = form.BUBUN.value;\r\n\t\tvar FLAG = \"GAPAN\";\r\n\t\tvar addNum = \"\";\r\n\r\n\t\tif(BONBUN.length < 4){\r\n\t\t\tvar bonbun_Count =  4 - BONBUN.length;\r\n\t\t\t\r\n\t\t\tfor(var i=0; i < bonbun_Count; i++){\r\n\t\t\t\taddNum = addNum + \"0\";\r\n\t\t\t}\r\n\t\t}\r\n\t\tvar winPosBONBUN_4LENGTH = addNum+BONBUN;\r\n\r\n\t\taddNum = \"\";\r\n\t\r\n\t\tif(BUBUN.length < 4){\r\n\t\t\t\r\n\t\t\t\r\n\t\t\tvar bubun_Count = 4 - BUBUN.length;\r\n\t\t\t\r\n\t\t\tfor(var i=0; i < bubun_Count; i++){\r\n\t\t\t\taddNum = addNum + \"0\";\r\n\t\t\t}\r\n\t\t}\r\n\t\tvar winPosBUBUN_4LENGTH = addNum+BUBUN;\r\n\t\t\r\n\t\tvar PNU = '";
  private final static String _jspx_template11 = "'+'";
  private final static String _jspx_template12 = "'+BJ_CD+SPC_CD+winPosBONBUN_4LENGTH+winPosBUBUN_4LENGTH;\t\t//PNU값 생성\r\n\r\n\t\tform.WITH_PNU.value = PNU;\t//PNU 파라메터에 값  세팅\r\n\r\n\t\t//수정 끝\r\n\t\t\r\n\t\t//가액 콤마 삭제\r\n\t\tdocument.getElementById(\"SF_VALUE\").value = removeComma(document.getElementById(\"SF_VALUE\").value);\r\n\t\t\r\n\r\n\t\tform.action = \"/gapan/jumyonginfo/jumji_modify_prc.do\";\r\n\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\t\r\n\tfunction\tDataCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\r\n\t\tif(form.CHANGE_Y.value.length != 4 && form.CHANGE_Y.value.length != 0)\r\n\t\t{\r\n\t\t\tstr\t+= \"교체년도는 4자리 입니다.\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.CHANGE_Y.focus();\r\n\t\t}\r\n\t\telse if(form.CHANGE_M.value.length != 2 && form.CHANGE_M.value.length != 0)\r\n\t\t{\r\n\t\t\tstr\t+= \"교체월은 2자리 입니다.\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.CHANGE_M.focus();\r\n\t\t}\r\n\t\telse if(form.TAX_SET.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"세입구분을 선택하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.TAX_SET.focus();\r\n\t\t}\r\n\t\telse if(form.MUL_FROMDATE.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용기간을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.MUL_FROMDATE.focus();\r\n\t\t}\r\n\t\telse if(form.MUL_TODATE.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용기간을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.MUL_TODATE.focus();\r\n\t\t}\r\n\t\telse if(form.BJ_CD.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용지 법정동을 선택 하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.BJ_CD.focus();\r\n\t\t}\r\n\t\telse if(form.HJ_CD.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용지 행정동을 선택 하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.HJ_CD.focus();\r\n\t\t}\r\n\t\telse if(form.SPC_CD.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용지 번지종류를 선택 하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.SPC_CD.focus();\r\n\t\t}\r\n\t\telse if(form.BONBUN.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용지 본번을 입력 하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.BONBUN.focus();\r\n\t\t}\r\n\t\telse if(form.FT_TYP.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"시설물명을 선택하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.FT_TYP.focus();\r\n\t\t}\r\n\t\telse if(form.PLACE_L.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용면적 가로를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.PLACE_L.focus();\r\n\t\t}\r\n\t\telse if(form.PLACE_H.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용면적 세로를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.PLACE_H.focus();\r\n\t\t}\r\n\t\telse if(form.FT_TYP.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"시설물명을 선택하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.FT_TYP.focus();\r\n\t\t}\r\n\t\telse if(form.FT_SEL.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"시설물 규격을 선택하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.FT_SEL.focus();\r\n\t\t}\r\n\r\n\t\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\t\t\r\n\t\treturn\tfalse;\r\n\t}\r\n\r\n\tfunction\tCancel(gapanno)\r\n\t{\r\n\t\tdocument.form.action = \"/gapan/jumyonginfo/jumji_view.do?GAPAN_NO=\"+gapanno;\r\n\t\tdocument.form.submit();\r\n\t}\r\n\t\t\r\n\t//파일업로드 찾아보기 버튼 변경\r\n\tfunction ChangeImg3()\r\n\t{\r\n\t//  var fileName = document.sender.file.value; //일단 주소부분은 주석처리\r\n\t\tnewImg = new Image(); //이미지 객체 생성\r\n\t\timgFileSize = \"\"; \r\n\t\tnewImg.src = \"\";\r\n\t\tmaxFileSize = 150*200;\r\n\t\tnewImg.src = document.getElementById(\"file3\").value\r\n\t\tvar imgpath = document.form.SHOP_IMG.value;\r\n\t\tdocument.all[\"tblview3\"].style.backgroundImage=\"url(\" + imgpath + \")\";\r\n\t\tdocument.all[\"tblview3\"].style.backgroundRepeat=\"no-repeat\";\r\n\t\timgFileSize = newImg.fileSize;\r\n\t}\r\n\t\r\n\tfunction jumyongZibun(SIDO, SIGU_CD){\r\n\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\r\n\t\tif(form.BJ_CD.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용지 법정동을 선택 하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.BJ_CD.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\telse if(form.HJ_CD.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용지 행정동을 선택 하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.HJ_CD.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\telse if(form.SPC_CD.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용지 번지종류를 선택 하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.SPC_CD.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\telse if(form.BONBUN.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용지 본번을 입력 하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.BONBUN.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tvar BJ_CD = form.BJ_CD.value;\r\n\t\tvar SPC_CD = form.SPC_CD.value;\r\n\t\tvar BONBUN = form.BONBUN.value;\r\n\t\tvar BUBUN = form.BUBUN.value;\r\n\t\tvar FLAG \t\t\t= \"GAPAN\";\r\n\t\tvar addNum = \"\";\r\n\r\n\t\tif(BONBUN.length < 4){\r\n\t\t\tvar bonbun_Count =  4 - BONBUN.length;\r\n\t\t\t\r\n\t\t\tfor(var i=0; i < bonbun_Count; i++){\r\n\t\t\t\taddNum = addNum + \"0\";\r\n\t\t\t}\r\n\t\t}\r\n\t\tvar winPosBONBUN_4LENGTH = addNum+BONBUN;\r\n\t\r\n\t\tif(BUBUN.length < 4){\r\n\t\t\t\r\n\t\t\tvar bubun_Count = 4 - BUBUN.length;\r\n\t\t\tvar addNum = \"\";\r\n\t\t\t\r\n\t\t\tfor(var i=0; i < bubun_Count; i++";
  private final static String _jspx_template13 = "){\r\n\t\t\t\taddNum = addNum + \"0\";\r\n\t\t\t}\r\n\t\t}\r\n\t\tvar winPosBUBUN_4LENGTH = addNum+BUBUN;\r\n\t\tvar PNU = SIDO+SIGU_CD+BJ_CD+SPC_CD+winPosBONBUN_4LENGTH+winPosBUBUN_4LENGTH;\t\t//PNU값 생성\r\n\r\n\t\t//ADDR 생성\t\t\r\n\t\tvar ADDR = '";
  private final static String _jspx_template14 = "' + ' ' + '";
  private final static String _jspx_template15 = "' + ' ' + form.BJ_CD.options[form.BJ_CD.selectedIndex].text + ' ' + form.SPC_CD.options[form.SPC_CD.selectedIndex].text + ' ' + BONBUN;\r\n\t\tif(BUBUN.length > 0){\r\n\t\t\tADDR = ADDR + '-' + BUBUN;\r\n\t\t}\r\n\t\tform.WITH_PNU.value = PNU;\t//PNU 파라메터에 값  세팅\r\n\t\t\r\n\t\t\r\n\t\tvar url = '/gapan/map/mini_map.do?PNU='+PNU+'&X_COORD='+form.X_COORD.value+'&Y_COORD='+form.Y_COORD.value+'&TYPE=edit';\r\n\r\n\t\tcw=screen.availWidth;\r\n\t\tch=screen.availHeight;\r\n\t\t\r\n\t\tsw=800;\r\n\t\tsh=600;\r\n\t\t\r\n\t\tml=(cw-sw)/2;\r\n\t\tmt=(ch-sh)/2;\r\n\r\n  \t\tvar param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';\r\n\r\n\t\twindow.open(url, \"minimap\", param);\r\n\t}\r\n\t\r\n\tfunction attach(obj) {\r\n\t\t/*\r\n\t    var val = obj.value;\r\n\t    //alert(obj.id);\r\n\t    //alert(document.getElementById(obj.id).value);\t    \r\n\t\tfile_size = get_file_check(document.getElementById(obj.id).value);\t\r\n\t\t\r\n\t\tif(0 == file_size)\r\n\t\t{\r\n\t\t\talert(file_size);\r\n\t\t\talert(document.getElementById('file1').value);\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tdocument.getElementById('ATTACH_SIZE').value = CutDecimalPoint(file_size/1024);\t    \r\n\t    document.getElementById('ATTACH_FILE').value = getNoDirFileName(val);\r\n\t    */\r\n\t}\r\n\t\r\n\r\n\t\r\n\tfunction ChangeImg(thisObj, preViewer) {\r\n\t\t\r\n\t\tif(!/(\\.gif|\\.jpg|\\.jpeg|\\.png)$/i.test(thisObj.value)) {\r\n\t\t\talert(\"이미지 형식의 파일을 선택하십시오\");\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tpreViewer = (typeof(preViewer) == \"object\") ? preViewer : document.getElementById(preViewer);\r\n\t\tvar ua = window.navigator.userAgent;\r\n\r\n\t\tif (ua.indexOf(\"MSIE\") > -1) {\r\n\t\t\tvar img_path = \"\";\r\n\t\t\tif (thisObj.value.indexOf(\"\\\\fakepath\\\\\") < 0) {                 \r\n\t\t\t\timg_path = thisObj.value;\r\n\t\t\t} else {\r\n\t\t\t\tthisObj.select();\r\n\t\t\t\tvar selectionRange = document.selection.createRange();\r\n\t\t\t\timg_path = selectionRange.text.toString();\r\n\t\t\t\tthisObj.blur();\r\n\t\t\t}\r\n\t\t\t\tpreViewer.style.filter = \"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='fi\" + \"le://\" + img_path + \"', sizingMethod='scale')\";\r\n\t\t} else {\r\n\t\t\tpreViewer.innerHTML = \"\";\r\n\t\t\tvar W = preViewer.offsetWidth;\r\n\t\t\tvar H = preViewer.offsetHeight;\r\n\t\t\tvar tmpImage = document.createElement(\"img\");\r\n\t\t\tpreViewer.appendChild(tmpImage);\r\n\t\r\n\t\t\ttmpImage.onerror = function () {\r\n\t\t\t\treturn preViewer.innerHTML = \"\";\r\n\t\t\t}\r\n\t\r\n\t\t\ttmpImage.onload = function () {\r\n\t\r\n\t\t\t\tif (this.width > W) {\r\n\t\t\t\t\tthis.height = this.height / (this.width / W);\r\n\t\t\t\t\tthis.width = W;\r\n\t\t\t\t}\r\n\t\t\t\tif (this.height > H) {\r\n\t\t\t\t\tthis.width = this.width / (this.height / H);\r\n\t\t\t\t\tthis.height = H;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t        if (ua.indexOf(\"Firefox/3\") > -1) {\r\n\t\t\t\tvar picData = thisObj.files.item(0).getAsDataURL();\r\n\t\t\t\ttmpImage.src = picData;\r\n\t\t\t} else {\r\n\t\t\t\ttmpImage.src = \"file://\" + thisObj.value;\r\n\t\t\t}\r\n\t\t}\r\n     }\r\n\r\n\tfunction Jumji_CalPlaceSize()\r\n\t{\r\n\t\t\r\n\r\n\t\tvar ret = parseFloat(form.PLACE_L.value) * parseFloat(form.PLACE_H.value);\r\n\t\tform.PLACE_A.value = Math.round( ret* Math.pow(10,parseInt(3,10)) ) / Math.pow(10,parseInt(3,10));\r\n\r\n\t\t\t\r\n\t}\r\n\r\n\r\n\t////////////////////////////////AJAX////////////////////////////////////////////\r\n\t////////////////////////////////AJAX////////////////////////////////////////////\r\n\t////////////////////////////////AJAX////////////////////////////////////////////\r\n\tfunction getXMLHTTPRequest()\r\n\t{\r\n\t\tvar xRequest = null;\r\n\t\txRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n\t\treturn xRequest;\r\n\t}\r\n\r\n\tvar req;\r\n\tvar\tcall;\r\n\t\r\n\tfunction sendRequest(url, params, HttpMethod, callback)\r\n\t{\r\n\t\treq = getXMLHTTPRequest();\r\n\r\n\t\tcall\t= callback;\r\n\t\tif(req){\r\n\t\t\treq.onreadystatechange = onReadyStateChange;\r\n\t\t\treq.open(HttpMethod, url, true);\r\n\t\t\treq.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n\t\t\treq.send(params);\r\n\t\t}\r\n\t}\r\n\r\n\tfunction onReadyStateChange()\r\n\t{\r\n\t\tvar ready = req.readyState;\r\n\t\tvar data = null;\r\n\t\tif(ready == 4){\r\n\t\t\tif(this.call\t!= null)\r\n\t\t\t{\r\n\t\t\t\tthis.call(req.responseText);\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\r\n\t\r\n\tfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n\t{\r\n        var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n        var selectBoxLabel;\r\n        var root";
  private final static String _jspx_template16 = ";\r\n        var selectBoxValue;\r\n        var opt \t= document.getElementById(selectBoxId);\r\n        var tags\t= \"\";\r\n        var\ttext\t= \"\";\r\n\r\n        for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n        {\r\n        \topt.options[i]\t= null;\r\n        }\r\n\r\n        xmldoc.async\t= false;\r\n\r\n\t\txmldoc.loadXML(strParam);\r\n\r\n\r\n\t\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n        if(root <= 0)\r\n        {\r\n            tags \t= document.createElement(\"option\");\r\n            text\t= document.createTextNode(\"\");\r\n            tags.setAttribute(\"label\", \"\");\r\n            tags.appendChild(text);\r\n            tags.value = 0;\r\n            opt.appendChild(tags);\r\n            return;\r\n        }\r\n\r\n        if(topLabel != null && topLabel != \"\")\r\n\t\t{\r\n            tags \t= document.createElement(\"option\");\r\n            text\t= document.createTextNode(topLabel);\r\n            tags.setAttribute(\"label\", topLabel);\r\n            tags.appendChild(text);\r\n            tags.value = '';\r\n            opt.appendChild(tags);\r\n        }\r\n    \t\r\n        for(var i = 0; i < root; i++)\r\n        {\r\n        \t\r\n        \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n        \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n            tags \t= document.createElement(\"option\");\r\n       \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n            tags.setAttribute(\"label\", selectBoxLabel);\r\n    \r\n            tags.value = selectBoxValue;\r\n            tags.appendChild(text);\r\n            opt.appendChild(tags);\r\n        }\r\n\r\n\t\tvar ft_sel = '";
  private final static String _jspx_template17 = "';\r\n\t\tvar ft_typ = '";
  private final static String _jspx_template18 = "';\r\n\r\n        if(ft_typ.length > 0 && document.getElementById('FLAG').value == '2'){\r\n        \tdocument.getElementById(\"FT_TYP\").options.value = ft_typ;\r\n      \t};\r\n\r\n        if(ft_sel.length > 0 && document.getElementById('FLAG').value == '1'){\r\n        \tdocument.getElementById(\"FT_SEL\").options.value = ft_sel;\r\n        };\r\n\r\n        document.getElementById('FLAG').value = parseInt(document.getElementById('FLAG').value) - 1;\r\n        \r\n    }\r\n\r\n\tfunction\tSelectedFTTYP()\r\n\t{\r\n\t\tvar\tFT_TYP\t= document.getElementById(\"FT_TYP\").value;\r\n\t\t\r\n\t\tvar\tparam\t= \"FT_TYP=\"+FT_TYP;\r\n\r\n\t\tsendRequest(\"/gapan/jumyonginfo/get_ft_sel.do\", param, \"GET\", ResultFTTYP);\r\n\t}\r\n\r\n\tfunction\tSelectedGPTYP()\r\n\t{\r\n\t\tvar\tparam\t= \"GP_TYP=001\";\r\n\t\tsendRequest(\"/gapan/jumyonginfo/get_ft_typ.do\", param, \"GET\", ResultGPTYP);\r\n\t\t\r\n\t}\r\n\r\n\r\n\t\r\n\r\n\tfunction\tResultFTTYP(obj)\r\n\t{\r\n\t\tfncSelectBoxSetting(obj, \"FT_SEL\", \"EEE\", \"::선택::\");\r\n\t}\r\n\r\n\tfunction\tResultGPTYP(obj)\r\n\t{\r\n\t\tfncSelectBoxSetting(obj, \"FT_TYP\", \"EEE\", \"::선택::\");\r\n\t\tSelectedFTTYP();\r\n\t}\r\n\r\n\tfunction Init(){\r\n\t\t\r\n\t\tvar mul_spc_cd = \"";
  private final static String _jspx_template19 = "\";\r\n\t\t\r\n\t\tif(mul_spc_cd==\"산번지\")\r\n\t\t\tmul_spc_cd = \"2\";\r\n\t\tif(mul_spc_cd==\"일반번지\")\r\n\t\t\tmul_spc_cd = \"1\";\r\n\t\tdocument.getElementById(\"SPC_CD\").value=mul_spc_cd;\r\n\t\r\n\t\t//시설물, 규격 초기화\r\n\t\tSelectedGPTYP();\r\n\r\n\t}\r\n\r\n\t//********** BEGIN_KANG_20120423\r\n\tfunction selectFT_TYP(){\t\t\r\n\t\tvar FT_TYP = document.getElementById(\"FT_TYP\").value;\r\n\t\tvar Facility = \"\";\r\n\t\t\r\n\t\tif(FT_TYP == \"%\" || FT_TYP == \"\"){\t\t\t\r\n\t\t\tdocument.getElementById(\"FacilityView\").style.display=\"none\";\t\t\t\t\r\n\t\t}else{\t\t\t\r\n\t\t\tdocument.getElementById(\"FacilityView\").style.display=\"block\";\t\t\t\r\n\t\t\tif(FT_TYP == \"011\"){\r\n\t\t\t\tFacility = \"가로판매대\";\r\n\t\t\t}else if(FT_TYP == \"012\"){\r\n\t\t\t\tFacility = \"구두수선대\";\r\n\t\t\t}\r\n\t\t}\r\n\t\t//document.getElementById(\"Facility\").value=Facility;\t\r\n\t\tdocument.getElementById(\"Facility\").innerHTML=Facility;\r\n\r\n\t}\r\n\t//********** END_KANG_20120423\t\r\n\r\n//]]>\r\n</script>\r\n\r\n<!-- body onload=\"Init(); Init_UseType('";
  private final static String _jspx_template20 = "'); Init_UseSection('";
  private final static String _jspx_template21 = "');\" -->\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\" enctype=\"multipart/form-data\">\r\n\t<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template22 = "\">\r\n\t<input type=\"hidden\" id=\"GU_CODE\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template23 = "\">\r\n\t<input type=\"hidden\" id=\"X_COORD\" name=\"X_COORD\" value=\"";
  private final static String _jspx_template24 = "\">\r\n\t<input type=\"hidden\" id=\"Y_COORD\" name=\"Y_COORD\" value=\"";
  private final static String _jspx_template25 = "\">\r\n\t<input type=\"hidden\" id=\"WITH_PNU\" name=\"WITH_PNU\" value=\"";
  private final static String _jspx_template26 = "\">\r\n\t<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template27 = "\">\r\n\t<input type=\"hidden\" id=\"SHOP_IMG_NAME\" name=\"SHOP_IMG_NAME\" value=\"";
  private final static String _jspx_template28 = "\">\r\n\t<input type=\"hidden\" id=\"FLAG\" name=\"FLAG\" value=\"2\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" bgcolor=\"#FFFFFF\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"60\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/0811_tt2.gif\" width=\"44\" height=\"17\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t<select id=\"TAX_SET\" name=\"TAX_SET\" class=\"essential\" style=\"width: 70px\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template29 = "\r\n\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"MUL_FROMDATE\" name=\"MUL_FROMDATE\" value=\"";
  private final static String _jspx_template30 = "\" type=\"text\" class=\"essential\" style=\"width: 76px\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onClick=\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"MUL_TODATE\" name=\"MUL_TODATE\" value=\"";
  private final static String _jspx_template31 = "\" type=\"text\" class=\"essential\" style=\"width: 76px\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onClick=\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t인접지 지번<br/>(공시지가대상)\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"76\">";
  private final static String _jspx_template32 = "&nbsp;&nbsp;";
  private final static String _jspx_template33 = "&nbsp;&nbsp;</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"essential\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"HJ_CD\" name=\"HJ_CD\" class=\"essential\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">/</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"SPC_CD\" name=\"SPC_CD\" class=\"essential\" style=\"width: 75px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">일반번지</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">산번지</option>\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"10\">&nbsp;</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template36 = "\" type=\"text\" class=\"essential\" style=\"width: 50px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">-</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template37 = "\" type=\"text\" class=\"input_form1\" style=\"width: 50px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"30\" align=\"center\">번지</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t인접지<br/>도로명주소\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<img alt=\"검색\" src=\"/img/search_icon.gif\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:openZipcodePopup_new('','','form.WITH_DORO_NM','','','','','','','');\"  style=\"cursor: pointer; vertical-align: middle;\">\r\n\t\t\t\t\t\t\t\t\t<input id=\"WITH_DORO_NM\" name=\"WITH_DORO_NM\" type=\"text\" class=\"essential\" value=\"";
  private final static String _jspx_template38 = "\" style=\"width: 250px\" onclick=\"javascript: openZipcodePopup_new('','','form.WITH_DORO_NM','','','','','','','');\"></input>\r\n\t\t\t\t\t\t\t\t\t<input id=\"WITH_BD_BON\" name=\"WITH_BD_BON\" type=\"text\" class=\"essential\" value=\"";
  private final static String _jspx_template39 = "\" style=\"width: 25px\"></input>\r\n\t\t\t\t\t\t\t\t\t<input id=\"WITH_BD_BU\" name=\"WITH_BD_BU\" type=\"text\" class=\"essential\" value=\"";
  private final static String _jspx_template40 = "\" style=\"width: 25px\"></input>\r\n\t\t\t\t\t\t\t\t\t<br/><font color=\"blue\">* 수정 시, 검색버튼을 클릭 후, 팝업창에서 도로명주소 검색 후 해당 도로명 주소를 선택</font>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"100\" nowrap>점용지 주소</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\" nowrap>\r\n\t\t\t\t\t\t\t\t\t<input id=\"WITH_ADDR\" name=\"WITH_ADDR\" type=\"text\" class=\"input_form1\" style=\"width: 200px\" value=\"";
  private final static String _jspx_template41 = "\" maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<img src=\"/img/loca_icon2.gif\" alt=\"위치등록\" width=\"64\" height=\"18\" border=\"0\" onClick=\"javascript:jumyongZibun('";
  private final static String _jspx_template42 = "','";
  private final static String _jspx_template43 = "');\" style=\"CURSOR: Hand;\"></td>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" rowspan=\"5\" nowrap>\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물 사진</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<br>\r\n\t\t\t\t\t\t\t\t\t\t<br>\r\n\t\t\t\t\t\t\t\t\t\t<span onclick=\"javascript:document.getElementById('file3').click();\" style=\"overflow: hidden; background-repeat: no-repeat; cursor: pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t</span>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" rowspan=\"5\" nowrap=\"nowrap\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input type='file' id=\"SHOP_IMG\" name='SHOP_IMG' style=\"width: 10;\" onchange=\"ChangeImg(this, 'tblview3');\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=100 height=130 id=\"tblview3\" style=\"background-image:url('";
  private final static String _jspx_template44 = "'); background-repeat:no-repeat; background-attachment:scroll;\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주변정보</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input id=\"WITH_INFO\" name=\"WITH_INFO\" type=\"text\" class=\"input_form1\" style=\"width: 264px\" value=\"";
  private final static String _jspx_template45 = "\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로정보</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input id=\"ROAD_INFO\" name=\"ROAD_INFO\" type=\"text\" class=\"input_form1\" style=\"width: 264px\" value=\"";
  private final static String _jspx_template46 = "\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지역정보</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<select id=\"AR_SEL\" name=\"AR_SEL\" class=\"input_form1\" style=\"width: 76px\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t<input id=\"AR_TXT\" name=\"AR_TXT\" type=\"text\" class=\"input_form1\" style=\"width: 184px\" value=\"";
  private final static String _jspx_template48 = "\" maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">설치일자</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"FOUND_DATE\" name=\"FOUND_DATE\" type=\"text\" class=\"input_form1\" style=\"width: 120px\" value=\"";
  private final static String _jspx_template49 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onClick=\"popUpCalendar(this, document.getElementById('FOUND_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인접시설</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<select id=\"UC_SEL\" name=\"UC_SEL\" class=\"input_form1\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template50 = "\r\n\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t<input id=\"UC_TXT\" name=\"UC_TXT\" type=\"text\" class=\"input_form1\" style=\"width: 150px\" value=\"";
  private final static String _jspx_template51 = "\" maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물 가액</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input id=\"SF_VALUE\" name=\"SF_VALUE\" type=\"text\" class=\"input_form1\" style=\"width: 80px; ime-mode: disabled;\" value=\"";
  private final static String _jspx_template52 = "\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\" maxlength=\"16\">원\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물명/규격</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120423 -->\r\n\t\t\t\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"FT_TYP\" name=\"FT_TYP\" class=\"essential\" style=\"width: 100px\" onchange=\"SelectedFTTYP();\">\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"FT_TYP\" name=\"FT_TYP\" class=\"essential\" style=\"width: 100px\" onchange=\"SelectedFTTYP();selectFT_TYP();\">\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120423 -->\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">/</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"FT_SEL\" name=\"FT_SEL\" class=\"essential\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"PLACE_L\" name=\"PLACE_L\" value=\"";
  private final static String _jspx_template53 = "\" type=\"text\" class=\"essential\" style=\"width: 40px\" onKeyPress=\"nr_num_float(this),Jumji_CalPlaceSize();\" onKeyUp=\"nr_num_float(this),Jumji_CalPlaceSize();\" maxlength=\"5\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">m</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"12\" align=\"center\">x</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"PLACE_H\" name=\"PLACE_H\" value=\"";
  private final static String _jspx_template54 = "\" type=\"text\" class=\"essential\" style=\"width: 40px\" onKeyPress=\"nr_num_float(this),Jumji_CalPlaceSize();\" onKeyUp=\"nr_num_float(this),Jumji_CalPlaceSize();\" maxlength=\"5\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">m</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"12\" align=\"center\">=</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"PLACE_A\" name=\"PLACE_A\" value=\"";
  private final static String _jspx_template55 = "\" type=\"text\" class=\"essential\" style=\"width: 60px\" onKeyPress=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" maxlength=\"5\" readonly=\"readonly\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">㎡</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120423 -->\r\n\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">교체년월</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t<input id=\"CHANGE_Y\"  name=\"CHANGE_Y\" value=\"";
  private final static String _jspx_template56 = "\" type=\"text\" class=\"input_form1\" style=\"width: 30px\" onKeyPress=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" maxlength=\"4\">년&nbsp;\r\n\t\t\t\t\t\t\t\t\t<input id=\"CHANGE_M\" name=\"CHANGE_M\" value=\"";
  private final static String _jspx_template57 = "\" type=\"text\" class=\"input_form1\" style=\"width: 15px\" onKeyPress=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" maxlength=\"2\">월\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물 번호</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t                      <div id=\"FacilityView\" style=\"display:block\">                      \r\n\t\t\t\t\t                      \t<table width=\"250px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"left\">\r\n\t\t\t\t\t                      \t\t<tr>\r\n\t\t\t\t\t                      \t\t\t<td align=\"left\" class=\"sub_stan\" >                      \t\t\t\t\r\n\t\t\t\t\t                      \t\t\t\t<span id=\"Facility\" class=\"sub_stan\">";
  private final static String _jspx_template58 = "가로판매대";
  private final static String _jspx_template59 = "구두수선대";
  private final static String _jspx_template60 = "</span>&nbsp;-&nbsp;\r\n\t\t\t\t\t                      \t\t\t\t<input id=\"facility_No\" name=\"facility_No\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onchange=\"isNum(this,'시설물 번호')\" maxlength=\"5\" value=\"";
  private final static String _jspx_template61 = "\"/> \r\n\t\t\t\t\t                      \t\t\t</td>                      \t\t\t\r\n\t\t\t\t\t                      \t\t</tr>\r\n\t\t\t\t\t                      \t</table>\r\n\t\t\t\t\t                      </div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">교체년월</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input id=\"CHANGE_Y\"  name=\"CHANGE_Y\" value=\"";
  private final static String _jspx_template62 = "\" type=\"text\" class=\"input_form1\" style=\"width: 30px\" onKeyPress=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" maxlength=\"4\">년&nbsp;\r\n\t\t\t\t\t\t\t\t\t<input id=\"CHANGE_M\" name=\"CHANGE_M\" value=\"";
  private final static String _jspx_template63 = "\" type=\"text\" class=\"input_form1\" style=\"width: 15px\" onKeyPress=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" maxlength=\"2\">월\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<!--   //********** END_KANG_20120423 -->\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" bgcolor=\"#FFFFFF\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"60\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/0811_tt1.gif\" width=\"44\" height=\"17\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">취급품목</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"SG_TYP\" name=\"SG_TYP\" class=\"input_form1\" style=\"width: 76px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template64 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">상품분류</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"SG_ITM\" name=\"SG_ITM\" class=\"input_form1\" style=\"width: 76px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template65 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">/</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"SG_SEL\" name=\"SG_SEL\" class=\"input_form1\" style=\"width: 76px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">영업인원</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input id=\"MEM_NUM\" name=\"MEM_NUM\" value=\"";
  private final static String _jspx_template67 = "\" class=\"input_form1\" style=\"width: 76px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, OPEN_TIME1, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t\t\t\t\t(운영자 본인 포함)\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영시간</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"OPEN_TIME1\" name=\"OPEN_TIME1\" value=\"";
  private final static String _jspx_template68 = "\" type=\"text\" class=\"input_form1\" style=\"width: 30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);count_check(this, OPEN_TIME2, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"12\" align=\"center\">:</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"OPEN_TIME2\" name=\"OPEN_TIME2\" value=\"";
  private final static String _jspx_template69 = "\" type=\"text\" class=\"input_form1\" style=\"width: 30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);count_check(this, CLOSE_TIME1, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"12\" align=\"center\">~</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"CLOSE_TIME1\" name=\"CLOSE_TIME1\" value=\"";
  private final static String _jspx_template70 = "\" type=\"text\" class=\"input_form1\" style=\"width: 30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);count_check(this, CLOSE_TIME2, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"12\" align=\"center\">:</td>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"CLOSE_TIME2\" name=\"CLOSE_TIME2\" value=\"";
  private final static String _jspx_template71 = "\" type=\"text\" class=\"input_form1\" style=\"width: 30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"2\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">허가일자</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><input id=\"PERMIT_DATE\" name=\"PERMIT_DATE\" value=\"";
  private final static String _jspx_template72 = "\" type=\"text\" class=\"input_form1\" style=\"width: 76px\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td><a>\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onClick=\"popUpCalendar(this, document.getElementById('PERMIT_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">일매출액</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input id=\"DAY_SALES\" name=\"DAY_SALES\" value=\"";
  private final static String _jspx_template73 = "\" type=\"text\" class=\"input_form1\" style=\"width: 76px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"8\"> 원\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\" colspan=\"2\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">기타정보</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<textarea id=\"NOTES\" name=\"NOTES\" class=\"input_form1\" style=\"width: 620px\" rows=\"10\" cols=\"200\" onkeyup=\"displayBytes(2048, 'NOTE');\">";
  private final static String _jspx_template74 = "</textarea>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t<a href=\"javascript:Cancel('";
  private final static String _jspx_template75 = "')\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t<a href=\"javascript:ModifyPrc()\"><img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n\r\n</body>\r\n</html>\r\n";
}
