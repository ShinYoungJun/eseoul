package jeus_jspwork._jsp._rojum._jumyonginfo._tab;

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
      // jsp code [from=(56,26);to=(56,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIDO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(56,36);to=(56,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(69,18);to=(69,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGE_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      out.write(_jspx_template14);
      // jsp code [from=(208,26);to=(208,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIDO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(208,36);to=(208,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      out.write(_jspx_template17);
      // jsp code [from=(389,29);to=(389,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ft_sel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(390,29);to=(390,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ft_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(391,29);to=(391,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ft_cat}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(475,61);to=(475,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SURVEY_YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(486,33);to=(486,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(495,19);to=(495,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_SEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(554,57);to=(554,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGE_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(555,61);to=(555,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(556,59);to=(556,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${X_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(557,59);to=(557,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Y_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(558,61);to=(558,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WITH_PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(559,65);to=(559,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CD }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(560,71);to=(560,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SHOP_IMG_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(561,73);to=(561,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SHOP_IMG2_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template37);
      // jsp code [from=(598,12);to=(598,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mg_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template44);
      // jsp code [from=(621,28);to=(621,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIDO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(621,50);to=(621,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(624,12);to=(624,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(628,12);to=(628,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(639,52);to=(639,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(643,50);to=(643,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(658,92);to=(658,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WITH_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(659,90);to=(659,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WITH_BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(660,89);to=(660,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WITH_BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(668,132);to=(668,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIDO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(668,142);to=(668,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(669,108);to=(669,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(703,100);to=(703,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(709,108);to=(709,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_INFO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(718,107);to=(718,121)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REG_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(738,41);to=(738,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ft_cat}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(751,54);to=(751,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_L}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(755,54);to=(755,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_H}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(759,54);to=(759,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_A}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(771,11);to=(771,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dp_sel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // jsp code [from=(773,103);to=(773,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DP_TXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template65);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template67);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template69);
      // jsp code [from=(781,114);to=(781,146)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.SPECIAL_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template70);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template72);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template74);
      // jsp code [from=(801,14);to=(801,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mt_sel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template75);
      // jsp code [from=(809,80);to=(809,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAR_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template76);
      // jsp code [from=(833,14);to=(833,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sg_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template77);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template79);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template81);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template83);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_8_fn(pageContext, null)) return;


      out.write(_jspx_template85);
      // jsp code [from=(850,52);to=(850,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MEM_NUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template86);
      // jsp code [from=(856,56);to=(856,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DAY_SALES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template87);
      // jsp code [from=(866,60);to=(866,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OPEN_TIME1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template88);
      // jsp code [from=(870,60);to=(870,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OPEN_TIME2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template89);
      // jsp code [from=(874,62);to=(874,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CLOSE_TIME1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template90);
      // jsp code [from=(878,62);to=(878,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CLOSE_TIME2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template91);
      // jsp code [from=(886,10);to=(886,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${un_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template92);
      // jsp code [from=(888,50);to=(888,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.UN_TXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template93);
      // jsp code [from=(895,48);to=(895,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NOTES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(903,108);to=(903,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);

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
          out.write(_jspx_template32);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template34);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template36);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGE_TYP == '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template39);
          // jsp code [from=(607,133);to=(607,140)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template40);
          // jsp code [from=(608,116);to=(608,130)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GUGAN_CD_LIST }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template41);
          // jsp code [from=(609,101);to=(609,115)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REG_SEQ }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template42);
          // jsp code [from=(610,97);to=(610,112)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REG_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template43);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SPECIAL_ST == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template66);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SPECIAL_ST != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template68);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MAINTN_OB == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template71);

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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MAINTN_OB != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template73);

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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LIQUOR_SL == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template78);

        } while (_jspx_th_c_if_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_5.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_6_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_6.setPageContext(pageContext);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LIQUOR_SL != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template80);

        } while (_jspx_th_c_if_6.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_6.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_6.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_7_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_7.setPageContext(pageContext);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LPGAS_US == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template82);

        } while (_jspx_th_c_if_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_7.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_7.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_8_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_8.setPageContext(pageContext);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LPGAS_US != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
      if (_jspx_eval_c_if_8 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template84);

        } while (_jspx_th_c_if_8.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_8.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_8.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGE_TYP == '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
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
          out.write(_jspx_template35);

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template10 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/rojumGugan.js\"></script>\r\n<!-- #mr 130302 -->\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>    \r\n<script type=\"text/javascript\">\r\n        //<![CDATA[\r\n\t//********** BEGIN_현진_20120315\r\n        function changeGugan(){        \t\r\n        \tdocument.getElementById(\"REG_SEQ\").value = \"\";\r\n        \tdocument.getElementById(\"REG_NAME\").value = \"\";\r\n        }\r\n\t//********** END_현진_20120315\r\n\r\n        function\tModifyPrc()\r\n        {\r\n            var\tresult\t= DataCheck();\r\n\r\n            if(result\t==\tfalse)\r\n                return;\r\n\r\n            var form \t= document.form;\r\n            var\tstr\t\t= \"\";\r\n\r\n\r\n\r\n          \t//PNU 파라메터에 값  세팅\r\n\t\t    var form = document.form;\r\n            var BJ_CD = form.BJ_CD.value;\r\n            var SPC_CD = form.SPC_CD.value;\r\n            var BONBUN = form.BONBUN.value;\r\n            var BUBUN = form.BUBUN.value;\r\n            var PNU = '";
  private final static String _jspx_template11 = "'+'";
  private final static String _jspx_template12 = "'+BJ_CD+SPC_CD+addZero(BONBUN,4)+addZero(BUBUN,4);;\r\n            form.WITH_PNU.value = PNU;\r\n\r\n          \tform.action = \"/rojum/jumyonginfo/jumji_modify_prc.do\";\r\n            form.submit();\r\n        }\r\n\r\n\r\n        function\tDataCheck()\r\n        {\r\n            var form \t= document.form;\r\n            var\tstr\t\t= \"\";\r\n          //********** BEGIN_현진_20120315\r\n           if(\"";
  private final static String _jspx_template13 = "\" == \"0\"){\r\n        \tvar GUGAN_CD = document.getElementById(\"GUGAN_CD\").value;\r\n        \tvar REG_SEQ = document.getElementById(\"REG_SEQ\").value;\r\n        \t\r\n        \tif(GUGAN_CD != null && GUGAN_CD != \"\"){\r\n        \t\tif(REG_SEQ == null || REG_SEQ == \"\"){\r\n        \t\t\tstr += \"구간 등록번호를 생성해주세요!\";\r\n        \t\t\tform.REG_NAME.focus();\r\n        \t\t\talert(str);\r\n            \t}\r\n        \t\t\r\n        \t}\r\n           }\r\n        \t//********** END_현진_20120315        \r\n        \t\r\n    \t\tif(document.getElementById(\"MG_TYP\").value != '0'){\r\n    \t\t\tif(getValueSelectTag(\"MANAGE_TYP\") < 1)\r\n        \t\t{\r\n        \t\t\tstr\t+= \"등록 구분을 선택 하세요\\n\";\r\n        \t\t\talert(str);\r\n        \t\t\ttabDisplay(tab,content,0);\r\n        \t\t\tform.MG_TYP.focus();\r\n        \t\t}\r\n    \t\t}\r\n    \t\telse if(form.REG_DATE.value.length\t< 1)\r\n            {\r\n            \tif(getValueSelectTag(\"MANAGE_TYP\") == \"2\"){\r\n            \t\tstr\t+= \"수거일자를 선택 하세요\\n\";\r\n            \t}else if(getValueSelectTag(\"MANAGE_TYP\") == \"3\"){\r\n            \t\tstr\t+= \"계도일자를 선택 하세요\\n\";\r\n            \t}else{\r\n            \t\tstr\t+= \"설치일자를 선택 하세요\\n\";\r\n            \t}\r\n                alert(str);\r\n               //********** BEGIN_KANG_20120419\r\n               // tabDisplay(tab,content,0);\r\n               //********** END_KANG_20120419\r\n                form.REG_DATE.focus();\r\n            }\r\n            else if(form.BJ_CD.value.length\t< 1)\r\n            {\r\n                str\t+= \"점용지 법정동을 선택 하세요\\n\";\r\n                alert(str);\r\n                form.BJ_CD.focus();\r\n            }\r\n            else if(form.HJ_CD.value.length\t< 1)\r\n            {\r\n                str\t+= \"지 행정동을 선택 하세요\\n\";\r\n                alert(str);\r\n                form.HJ_CD.focus();\r\n            }\r\n            else if(form.SPC_CD.value.length\t< 1)\r\n            {\r\n                str\t+= \"점용지 번지종류를 선택 하세요\\n\";\r\n                alert(str);\r\n                form.SPC_CD.focus();\r\n            }\r\n            else if(form.BONBUN.value.length\t< 1)\r\n            {\r\n                str\t+= \"점용지 본번을 입력 하세요\\n\";\r\n                alert(str);\r\n                form.BONBUN.focus();\r\n            }\r\n            else if(form.FT_TYP.value.length\t< 1)\r\n            {\r\n                str\t+= \"시설물명을 선택하세요\\n\";\r\n                alert(str);\r\n                form.FT_TYP.focus();\r\n            }\r\n            else if(form.PLACE_L.value.length\t< 1)\r\n            {\r\n                str\t+= \"점용면적 가로를 입력하세요\\n\";\r\n                alert(str);\r\n                form.PLACE_L.focus();\r\n            }\r\n            else if(form.PLACE_H.value.length\t< 1)\r\n            {\r\n                str\t+= \"점용면적 세로를 입력하세요\\n\";\r\n                alert(str);\r\n                form.PLACE_H.focus();\r\n            }\r\n            else if(form.FT_TYP.value.length\t< 1)\r\n            {\r\n                str\t+= \"시설물명을 선택하세요\\n\";\r\n                alert(str);\r\n                form.FT_TYP.focus();\r\n            }\r\n            else if(form.FT_SEL.value.length\t< 1)\r\n            {\r\n                str\t+= \"시설물 규격을 선택하세요\\n\";\r\n                alert(str);\r\n                form.FT_SEL.focus();\r\n            }\r\n    \t\telse if(form.FT_TYP.value == '021' && form.FT_CAT.value.length\t< 1)\r\n    \t\t{\r\n    \t\t\tstr\t+= \"시설 유형을 선택하세요\\n\";\r\n    \t\t\talert(str);\r\n    \t\t\tform.FT_CAT.focus();\r\n    \t\t}\r\n    \t\telse if(document.getElementsByName(\"SPECIAL_ST\")[1].checked && form.SPECIAL_DATE.value.length\t< 1)\r\n    \t\t{\r\n    \t\t\tstr\t+= \"특화거리 조성일자를 입력하세요\\n\";\r\n    \t\t\talert(str);\r\n    \t\t\tform.SPECIAL_DATE.focus();\r\n    \t\t}\r\n\r\n            if(str\t== \"\")\r\n            {\r\n                return\ttrue;\r\n            }\r\n\r\n            return\tfalse;\r\n        }\r\n\r\n        function Cancel(gapanno)\r\n        {\r\n            document.form.action = \"/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=\"+gapanno;\r\n            document.form.submit();\r\n        }\r\n\r\n\t    function jumyongZibun(SIDO, SIGU_CD){\r\n\r\n            var form \t= document.form;\r\n            var\tstr\t\t= \"\";\r\n\r\n            if(form.BJ_CD.value.length\t< 1)\r\n            {\r\n                str\t+= \"점용지 법정동을 선택 하세요\\n\";\r\n                alert(str);\r\n                form.BJ_CD.focus();\r\n                return;\r\n            }\r\n           \r\n            var B";
  private final static String _jspx_template14 = "J_CD = form.BJ_CD.value;\r\n            var SPC_CD = form.SPC_CD.value;\r\n            var BONBUN = form.BONBUN.value;\r\n            var BUBUN = form.BUBUN.value;\r\n            var addNum = \"\";\r\n\r\n            var PNU = '";
  private final static String _jspx_template15 = "'+'";
  private final static String _jspx_template16 = "'+BJ_CD+SPC_CD+addZero(BONBUN,4)+addZero(BUBUN,4);;\r\n            form.WITH_PNU.value = PNU;\r\n\r\n            var url = '/rojum/map/mini_map.do?PNU='+PNU+'&X_COORD='+form.X_COORD.value+'&Y_COORD='+form.Y_COORD.value+'&TYPE=edit';\r\n\r\n            cw=screen.availWidth;\r\n            ch=screen.availHeight;\r\n\r\n            sw=800;\r\n            sh=600;\r\n\r\n            ml=(cw-sw)/2;\r\n            mt=(ch-sh)/2;\r\n\r\n            var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';\r\n\r\n            window.open(url, \"minimap\", param);\r\n        }\r\n\r\n        function ChangeImg(thisObj, preViewer) {\r\n\r\n            if(!/(\\.gif|\\.jpg|\\.jpeg|\\.png|\\.bmp)$/i.test(thisObj.value)) {\r\n                alert(\"이미지 형식의 파일을 선택하십시오\");\r\n                return;\r\n            }\r\n\r\n            preViewer = (typeof(preViewer) == \"object\") ? preViewer : document.getElementById(preViewer);\r\n            var ua = window.navigator.userAgent;\r\n\r\n            if (ua.indexOf(\"MSIE\") > -1) {\r\n                var img_path = \"\";\r\n                if (thisObj.value.indexOf(\"\\\\fakepath\\\\\") < 0) {\r\n                    img_path = thisObj.value;\r\n                } else {\r\n                    thisObj.select();\r\n                    var selectionRange = document.selection.createRange();\r\n                    img_path = selectionRange.text.toString();\r\n                    thisObj.blur();\r\n                }\r\n\r\n                img_path = img_path.split('%').join('%25');\r\n                \r\n                preViewer.style.filter = \"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='\" + img_path + \"', sizingMethod='scale')\";\r\n            } else {\r\n                preViewer.innerHTML = \"\";\r\n                var W = preViewer.offsetWidth;\r\n                var H = preViewer.offsetHeight;\r\n                var tmpImage = document.createElement(\"img\");\r\n                preViewer.appendChild(tmpImage);\r\n\r\n                tmpImage.onerror = function () {\r\n                    return preViewer.innerHTML = \"\";\r\n                };\r\n\r\n                tmpImage.onload = function () {\r\n\r\n                    if (this.width > W) {\r\n                        this.height = this.height / (this.width / W);\r\n                        this.width = W;\r\n                    }\r\n                    if (this.height > H) {\r\n                        this.width = this.width / (this.height / H);\r\n                        this.height = H;\r\n                    }\r\n                };\r\n                if (ua.indexOf(\"Firefox/3\") > -1) {\r\n                    var picData = thisObj.files.item(0).getAsDataURL();\r\n                    tmpImage.src = picData;\r\n                } else {\r\n                    tmpImage.src = \"file://\" + thisObj.value;\r\n                }\r\n            }\r\n        }\r\n\r\n        function Jumji_CalPlaceSize()\r\n        {\r\n            var ret = parseFloat(form.PLACE_L.value) * parseFloat(form.PLACE_H.value);\r\n            form.PLACE_A.value = Math.round( ret* Math.pow(10,parseInt(3,10)) ) / Math.pow(10,parseInt(3,10));\r\n        }\r\n\r\n\r\n        ////////////////////////////////AJAX////////////////////////////////////////////\r\n        ////////////////////////////////AJAX////////////////////////////////////////////\r\n        ////////////////////////////////AJAX////////////////////////////////////////////\r\n        function getXMLHTTPRequest()\r\n        {\r\n            var xRequest = null;\r\n            xRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n            return xRequest;\r\n        }\r\n\r\n        var req;\r\n        var\tcall;\r\n\r\n        function sendRequest(url, params, HttpMethod, callback)\r\n        {\r\n            req = getXMLHTTPRequest();\r\n\r\n            call\t= callback;\r\n            if(req){\r\n                req.onreadystatechange = onReadyStateChange;\r\n                req.open(HttpMethod, url, true);\r\n                req.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n                req.send(params);\r\n            }\r\n        }\r\n\r\n        function onReadyStateChange()\r\n        {\r\n            var ready = req.rea";
  private final static String _jspx_template17 = "dyState;\r\n            var data = null;\r\n            if(ready == 4){\r\n                if(this.call\t!= null)\r\n                {\r\n                    this.call(req.responseText);\r\n                }\r\n            }\r\n        }\r\n\r\n\r\n        function fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n        {\r\n            var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n            var selectBoxLabel;\r\n            var root;\r\n            var selectBoxValue;\r\n            var opt \t= document.getElementById(selectBoxId);\r\n            var tags\t= \"\";\r\n            var\ttext\t= \"\";\r\n\r\n            for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n            {\r\n                opt.options[i]\t= null;\r\n            }\r\n\r\n            xmldoc.async\t= false;\r\n\r\n            xmldoc.loadXML(strParam);\r\n\r\n\r\n            root = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n            if(root <= 0)\r\n            {\r\n                tags \t= document.createElement(\"option\");\r\n                text\t= document.createTextNode(\"\");\r\n                tags.setAttribute(\"label\", \"\");\r\n                tags.appendChild(text);\r\n                tags.value = 0;\r\n                opt.appendChild(tags);\r\n                return;\r\n            }\r\n\r\n            if(topLabel != null && topLabel != \"\")\r\n            {\r\n                tags \t= document.createElement(\"option\");\r\n                text\t= document.createTextNode(topLabel);\r\n                tags.setAttribute(\"label\", topLabel);\r\n                tags.appendChild(text);\r\n                tags.value = '';\r\n                opt.appendChild(tags);\r\n            }\r\n\r\n            for(var i = 0; i < root; i++)\r\n            {\r\n\r\n                selectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n                selectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n                tags \t= document.createElement(\"option\");\r\n                text\t= document.createTextNode(selectBoxLabel);\r\n\r\n                tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n                tags.value = selectBoxValue;\r\n                tags.appendChild(text);\r\n                opt.appendChild(tags);\r\n            }\r\n\r\n            var ft_sel = '";
  private final static String _jspx_template18 = "';\r\n            var ft_typ = '";
  private final static String _jspx_template19 = "';\r\n            var ft_cat = '";
  private final static String _jspx_template20 = "';\r\n\r\n            if(ft_typ.length > 0 && document.getElementById('FLAG').value == '3'){\r\n                setSelectedOption(document.getElementById(\"FT_TYP\"),ft_typ);\r\n            };\r\n\r\n            if(ft_sel.length > 0 && document.getElementById('FLAG').value == '2'){\r\n                setSelectedOption(document.getElementById(\"FT_SEL\"),ft_sel);\r\n            };\r\n            \r\n            if(ft_typ ='021' && document.getElementById('FLAG').value == '1'){\r\n            \tsetSelectedOption(document.getElementById(\"FT_CAT\"),ft_cat);\r\n            };\r\n            \r\n            \r\n\r\n            document.getElementById('FLAG').value = parseInt(document.getElementById('FLAG').value) - 1;\r\n\r\n        }\r\n\r\n        function ChangeFTSEL(obj){\r\n        \tvar ftSel = getSelectedValue(obj);\r\n        \t\r\n        \tif(ftSel == '214'){\r\n        \t\tdocument.getElementById(\"CAR_NO\").style.display = \"block\";\r\n        \t\tdocument.getElementById(\"CAR_NO_SPAN\").style.display = \"block\";\r\n        \t}else{\r\n        \t\tdocument.getElementById(\"CAR_NO\").value = \"\";\r\n        \t\tdocument.getElementById(\"CAR_NO\").style.display = \"none\";\r\n        \t\tdocument.getElementById(\"CAR_NO_SPAN\").style.display = \"none\";\r\n        \t}\r\n        \t\r\n        }\r\n\r\n\r\n        function\tSelectedGPTYP()\r\n        {\r\n            var\tparam\t= \"GP_TYP=\"+'002';\r\n            sendRequest(\"/rojum/jumyonginfo/get_ft_typ.do\", param, \"GET\", ResultGPTYP);\r\n\r\n        }\r\n        function\tResultGPTYP(obj)\r\n        {\r\n            fncSelectBoxSetting(obj, \"FT_TYP\", \"EEE\", \"::선택::\");\r\n            SelectedFTTYP();\r\n        }\r\n        \r\n        function\tSelectedFTTYP()\r\n        {\r\n            var\tFT_TYP\t= document.getElementById(\"FT_TYP\").value;\r\n\r\n            var\tparam\t= \"FT_TYP=\"+FT_TYP;\r\n\r\n            sendRequest(\"/rojum/jumyonginfo/get_ft_sel.do\", param, \"GET\", ResultFTSEL);\r\n        }\r\n\r\n        function\tResultFTSEL(obj)\r\n        {\r\n            fncSelectBoxSetting(obj, \"FT_SEL\", \"EEE\", \"::선택::\");\r\n            \r\n            var\tFT_TYP\t= getSelectedValue(document.getElementById(\"FT_TYP\"));\r\n            var\tparam\t= \"FT_TYP=\"+FT_TYP;\r\n            if(FT_TYP == '021'){\r\n            \tdocument.getElementById(\"FT_CAL_ROW\").style.display = \"block\";\r\n            \tsendRequest(\"/rojum/jumyonginfo/get_ft_cat.do\", param, \"GET\", ResultFTCAT);\r\n            }else{\r\n            \tdocument.getElementById(\"FT_CAL_ROW\").style.display = \"none\";\r\n            }\r\n        }\r\n        \r\n        function\tResultFTCAT(obj)\r\n        {\r\n            fncSelectBoxSetting(obj, \"FT_CAT\", \"EEE\", \"::선택::\");\r\n        }\r\n\r\n\r\n\r\n\r\n\r\n\r\n        function Init(){\r\n        \t\r\n        \tif(document.getElementById(\"MG_TYP\").value == '0'){\r\n        \t\tdocument.getElementById(\"SURVEY_YEAR\").style.display = \"block\";\r\n        \t\tsetYear(document.getElementById(\"SURVEY_YEAR\"),'";
  private final static String _jspx_template21 = "');\r\n        \t\tdocument.getElementById(\"REG_DATE_CONTENT\").innerHTML = \"설치일자\";\r\n        \t\t //********** BEGIN_현진_20120207\r\n        \t\t document.getElementById(\"REG_DATE\").className = \"essential\";\r\n        \t\t //********** END_현진_20120207        \t\t\r\n        \t}else{\r\n        \t\tdocument.getElementById(\"MANAGE_TYP\").style.display = \"block\";\r\n        \t\tchangeMgTyp();\r\n        \t}\r\n        \t\r\n        \t\r\n            var mul_spc_cd = \"";
  private final static String _jspx_template22 = "\";\r\n\r\n            if(mul_spc_cd==\"산번지\")\r\n                mul_spc_cd = \"2\";\r\n            if(mul_spc_cd==\"일반번지\")\r\n                mul_spc_cd = \"1\";\r\n            document.getElementById(\"SPC_CD\").value=mul_spc_cd;\r\n            \r\n            \r\n            if(\"";
  private final static String _jspx_template23 = "\" == \"214\"){\r\n        \t\tdocument.getElementById(\"CAR_NO\").style.display = \"block\";\r\n        \t\tdocument.getElementById(\"CAR_NO_SPAN\").style.display = \"block\";\r\n            }\r\n\r\n          \t\r\n            //시설물, 규격 초기화\r\n            SelectedGPTYP();\r\n            \r\n            //특화거리 조성여부 처리\r\n            check_special_st();\r\n\r\n\t   \t \t\r\n            // 이미지 기본 로드\r\n            if(document.getElementById('SHOP_IMG_NAME').value != ''){\r\n\t            ChangeImg(document.getElementById('SHOP_IMG_NAME'), 'SHOP_IMG_PREVIEW');\r\n            }\r\n            \r\n            // 이미지 기본 로드\r\n            if(document.getElementById('SHOP_IMG2_NAME').value != ''){\r\n    \t        ChangeImg(document.getElementById('SHOP_IMG2_NAME'), 'SHOP_IMG2_PREVIEW');    \t  \r\n            }\r\n            \r\n        }\r\n\r\n\r\n        function changeMgTyp(){\r\n\r\n        \tvar targetTag = getValueSelectTag(\"MANAGE_TYP\");\r\n        \tvar regdateContent = document.getElementById(\"REG_DATE_CONTENT\");\r\n\r\n\r\n        \tif(targetTag == '1'){\r\n        \t\tregdateContent.innerHTML = \"설치일자\";\r\n        \t}else if(targetTag == '2'){\r\n        \t\tregdateContent.innerHTML = \"수거일자\";\r\n        \t}else if(targetTag == '3'){\r\n        \t\tregdateContent.innerHTML = \"계도일자\";\r\n        \t}else{\r\n        \t\tregdateContent.innerHTML = \"\";\r\n        \t}\r\n        }\r\n        \r\n        function check_special_st(){\r\n        \tvar specialSt = document.getElementsByName(\"SPECIAL_ST\");\r\n        \tif(specialSt[0].checked){\r\n        \t\tdocument.getElementById(\"SPECIAL_DATE_SPAN\").style.display = \"none\";\r\n        \t\tdocument.getElementById(\"SPECIAL_DATE\").value = \"\";\r\n        \t}else{\r\n        \t\tdocument.getElementById(\"SPECIAL_DATE_SPAN\").style.display = \"inline-block\";\r\n        \t}\r\n        \t\r\n        }\r\n\r\n        //]]>\r\n    </script>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\" enctype=\"multipart/form-data\">\r\n<input type=\"hidden\" id=\"MG_TYP\" name=\"MG_TYP\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=\"hidden\" id=\"X_COORD\" name=\"X_COORD\" value=\"";
  private final static String _jspx_template26 = "\"> \r\n<input type=\"hidden\" id=\"Y_COORD\" name=\"Y_COORD\" value=\"";
  private final static String _jspx_template27 = "\"> \r\n<input type=\"hidden\" id=\"WITH_PNU\" name=\"WITH_PNU\" value=\"";
  private final static String _jspx_template28 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template29 = "\">\r\n<input type=\"hidden\" id=\"SHOP_IMG_NAME\" name=\"SHOP_IMG_NAME\" value=\"";
  private final static String _jspx_template30 = "\">\r\n<input type=\"hidden\" id=\"SHOP_IMG2_NAME\" name=\"SHOP_IMG2_NAME\" value=\"";
  private final static String _jspx_template31 = "\">\r\n<input type=\"hidden\" id=\"FLAG\" name=\"FLAG\" value=\"3\">\r\n\t\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"34px\" colspan=\"4\" bgcolor=\"#FFFFFF\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"80\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t<span class=\"sub_stan_blue\">* 시설정보</span>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"12%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t\t\t조사년도\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t\t\t등록구분\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template36 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template37 = "\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<select id=\"SURVEY_YEAR\" name=\"SURVEY_YEAR\" class=\"essential\" style=\"width:100px;display: none;\">\r\n\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t<select id=\"MANAGE_TYP\" name=\"MANAGE_TYP\" class=\"essential\" style=\"width:100px;display: none;\" onchange=\"changeMgTyp();\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<!--  //********** BEGIN_현진_20120313 -->\r\n\t\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t\t<tr>\r\n                        \t<td width=\"12%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구간번호</td>\r\n                            <td colspan=\"3\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n                            \t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width:100px\" onchange=\"changeGuCd(this);\">";
  private final static String _jspx_template40 = "</select>\r\n\t\t\t\t\t\t\t\t<select name=\"GUGAN_CD\" id=\"GUGAN_CD\" style=\"width:200px\" class=\"input_form1\"  onchange=\"changeGugan();\">";
  private final static String _jspx_template41 = "</select>\r\n\t\t\t\t\t\t\t\t등록번호 <input type=\"hidden\" name=\"REG_SEQ\" id=\"REG_SEQ\" class=\"input_form1\" readonly value=\"";
  private final static String _jspx_template42 = "\"/>\r\n\t\t\t\t\t\t\t\t<input type=\"text\" name=\"REG_NAME\" id=\"REG_NAME\" class=\"input_form1\" readonly  value=\"";
  private final static String _jspx_template43 = "\"/>\r\n\t\t\t\t\t\t\t\t<input type=\"button\" class=\"input_form1\" value=\"생성\" onClick=\"javascript:regnameCreate();\"/>\r\n                            </td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t<!--   //********** END_현진_20120313 -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인접지 지번<br>(공시지가<br>&nbsp;적용지번)</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"76px\">";
  private final static String _jspx_template45 = "&nbsp;&nbsp;";
  private final static String _jspx_template46 = "&nbsp;&nbsp;</td>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"essential\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td>&nbsp; <select id=\"HJ_CD\" name=\"HJ_CD\" class=\"essential\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template48 = "\r\n\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t\t<td width=\"16px\" align=\"center\">/</td>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<select id=\"SPC_CD\" name=\"SPC_CD\" class=\"essential\" style=\"width: 75px\">\r\n\t\t\t\t\t\t\t\t\t\t<option value=\"1\">일반번지</option>\r\n\t\t\t\t\t\t\t\t\t\t<option value=\"2\">산번지</option>\r\n\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"10px\">&nbsp;</td>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<input id=\"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template49 = "\" type=\"text\" class=\"essential\" style=\"width: 50px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"16px\" align=\"center\">-</td>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<input id=\"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template50 = "\" type=\"text\" class=\"input_form1\" style=\"width: 50px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"30px\" align=\"center\">번지</td>\r\n\t\t\t\t\t\t\t\t<td>\r\n\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n<!-- 인접지 도로명주소 추가 #mr-->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인접지 도로명주소</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:openZipcodePopup_new('', '', 'form.WITH_DORO_NM', '', '', '', '','','', '');\" style=\"cursor: pointer; vertical-align: middle;\">\r\n\t\t\t\t\t\t\t<input id=\"WITH_DORO_NM\" name=\"WITH_DORO_NM\" type=\"text\" class=\"essential\" value=\"";
  private final static String _jspx_template51 = "\" style=\"width:250px\" onclick=\"javascript:openZipcodePopup_new('', '', 'form.WITH_DORO_NM', '', '', '', '','','', '');\" maxlength=\"120\">\r\n\t\t\t\t\t\t\t<input id=\"WITH_BD_BON\" name=\"WITH_BD_BON\" type=\"text\" class=\"essential\" value=\"";
  private final static String _jspx_template52 = "\" style=\"width:25px\"/>\r\n\t\t\t\t\t\t\t-<input id=\"WITH_BD_BU\" name=\"WITH_BD_BU\" type=\"text\" class=\"essential\" value=\"";
  private final static String _jspx_template53 = "\" style=\"width:25px\"/>\r\n\t\t\t\t\t\t\t<br><font color=\"blue\">* 수정 시, 검색  버튼을 클릭 후, 팝업창에서 도로명 주소로 검색 후 해당 도로명 주소를 선택</font>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\t\t\t\t\r\n<!-- #mr --> \t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap>점용지 위치</td>\r\n\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"f6f6f6\" class=\"table_bl_left\" nowrap>\r\n\t\t\t\t\t\t\t<img src=\"/img/loca_icon2.gif\" alt=\"위치등록\" id=\"LocReg\" width=\"64\" height=\"18\" border=\"0\" onClick=\"javascript:jumyongZibun('";
  private final static String _jspx_template54 = "','";
  private final static String _jspx_template55 = "');\" style=\"CURSOR:pointer;vertical-align: middle;\">\r\n\t\t\t\t\t\t\t<input id=\"WITH_ADDR\" name=\"WITH_ADDR\" type=\"text\" class=\"input_form1\" style=\"width:150px\" value=\"";
  private final static String _jspx_template56 = "\" maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"50%\" align=\"center\" bgcolor=\"f6f6f6\" class=\"table_bl_left\" style=\"border:0px;margin:0px;padding:0px\" rowspan=\"5\" nowrap colspan=\"2\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" width=\"50%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap>\r\n\t\t\t\t\t\t\t\t정비전 사진\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<td width=\"50%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap>\r\n\t\t\t\t\t\t\t\t정비후 사진\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"file\" id=\"SHOP_IMG\" name='SHOP_IMG' class=\"input_form1\" size=\"12\" onchange=\"ChangeImg(this,'SHOP_IMG_PREVIEW');\"/>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<input type=\"file\" id=\"SHOP_IMG2\" name='SHOP_IMG2'  class=\"input_form1\" size=\"12\" onchange=\"document.getElementById('SHOP_IMG2_NAME').value = this.value;ChangeImg(this,'SHOP_IMG2_PREVIEW');\"/>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"112px\" id=\"SHOP_IMG_PREVIEW\" style=\"background-repeat: no-repeat; background-attachment: inherit;\"></td>\r\n\t\t\t\t\t\t\t\t<td id=\"SHOP_IMG2_PREVIEW\" style=\"background-repeat: no-repeat; background-attachment: inherit;\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"15%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로 지번</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"JIBUN\" name=\"JIBUN\" type=\"text\" class=\"input_form1\" style=\"width:220px\" value=\"";
  private final static String _jspx_template57 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"15%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주변정보</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"WITH_INFO\" name=\"WITH_INFO\" type=\"text\" class=\"input_form1\" style=\"width:220px\" value=\"";
  private final static String _jspx_template58 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t                        <div id=\"REG_DATE_CONTENT\">\r\n\t                        </div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"REG_DATE\" name=\"REG_DATE\" type=\"text\" class=\"input_form1\" style=\"width:120px;\" value=\"";
  private final static String _jspx_template59 = "\"  readonly>\r\n\t                \t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onClick=\"popUpCalendar(this, document.getElementById('REG_DATE'), 'yyyymmdd')\" style=\"CURSOR:pointer;vertical-align: middle;\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"52px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설종류/<br>형태/유형별</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\" style=\"vertical-align: top;\">\r\n\t\t                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\" >\r\n                               \t<tr>\r\n                                    <td height=\"26px\">\r\n                                    \t<select id=\"FT_TYP\" name=\"FT_TYP\" class=\"essential\" style=\"width: 100px\" onchange=\"SelectedFTTYP();\">\r\n\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t<select id=\"FT_SEL\" name=\"FT_SEL\" class=\"essential\" style=\"width: 130px\" onchange=\"ChangeFTSEL(this);\">\r\n\t\t\t\t\t\t\t\t\t\t</select>\r\n                                  \t</td>\r\n                               \t</tr>\r\n                               \t<tr id=\"FT_CAL_ROW\" name=\"FT_CAL_ROW\" style=\"display: none;\">\r\n                                    <td height=\"26px\">\r\n                                    \t<select id=\"FT_CAT\" name=\"FT_CAT\" class=\"essential\" style=\"width: 130px\">\r\n                                    \t\t";
  private final static String _jspx_template60 = "\r\n\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n                            \t</tr>\r\n                            </table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<input id=\"PLACE_L\" name=\"PLACE_L\" value=\"";
  private final static String _jspx_template61 = "\" type=\"text\" class=\"essential\" style=\"width: 40px\" onKeyPress=\"nr_num_float(this),Jumji_CalPlaceSize();\" onKeyUp=\"nr_num_float(this),Jumji_CalPlaceSize();\" maxlength=\"5\"></td>\r\n\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">m</td>\r\n\t\t\t\t\t\t\t\t<td width=\"12\" align=\"center\">x</td>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<input id=\"PLACE_H\" name=\"PLACE_H\" value=\"";
  private final static String _jspx_template62 = "\" type=\"text\" class=\"essential\" style=\"width: 40px\" onKeyPress=\"nr_num_float(this),Jumji_CalPlaceSize();\" onKeyUp=\"nr_num_float(this),Jumji_CalPlaceSize();\" maxlength=\"5\"></td>\r\n\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">m</td>\r\n\t\t\t\t\t\t\t\t<td width=\"12\" align=\"center\">=</td>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<input id=\"PLACE_A\" name=\"PLACE_A\" value=\"";
  private final static String _jspx_template63 = "\" type=\"text\" class=\"essential\" style=\"width: 60px\" onKeyPress=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" maxlength=\"5\" readonly=\"readonly\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">㎡</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"15%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">보관장소</td>\r\n\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<select id=\"DP_SEL\" name=\"DP_SEL\" class=\"input_form1\" style=\"width: 76px\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template64 = "\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t<input id=\"DP_TXT\" name=\"DP_TXT\" type=\"text\" class=\"input_form1\" style=\"width: 150px\" value=\"";
  private final static String _jspx_template65 = "\" maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거리조성</td>\r\n\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t                <input name=\"SPECIAL_ST\" type=\"radio\" value=\"1\" onclick=\"check_special_st();\" style=\"vertical-align: middle;\" ";
  private final static String _jspx_template66 = "checked";
  private final static String _jspx_template67 = ">일반거리\r\n                            <input name=\"SPECIAL_ST\" type=\"radio\" value=\"0\" onclick=\"check_special_st();\" style=\"vertical-align: middle;\" ";
  private final static String _jspx_template68 = "checked";
  private final static String _jspx_template69 = ">특화거리\r\n                            <span id=\"SPECIAL_DATE_SPAN\" style=\"display: inline-block;\">\r\n                            /조성일자:\r\n                            <input id=\"SPECIAL_DATE\" name=\"SPECIAL_DATE\"  type=\"text\" class=\"essential\" value=\"";
  private final static String _jspx_template70 = "\" style=\"width:60px;vertical-align: middle;\" readonly>\r\n\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onClick=\"popUpCalendar(this, document.getElementById('SPECIAL_DATE'), 'yyyymmdd')\" style=\"CURSOR:pointer;vertical-align: middle;\">\r\n                            </span>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">정비/관리</td>\r\n\t\t\t\t\t\t<td colspan=\"1\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input id=\"MAINTN_OB\" name=\"MAINTN_OB\" type=\"radio\" value=\"1\" ";
  private final static String _jspx_template71 = "checked";
  private final static String _jspx_template72 = ">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"50px\">관리대상</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input id=\"MAINTN_OB\" name=\"MAINTN_OB\" type=\"radio\" value=\"0\" ";
  private final static String _jspx_template73 = "checked";
  private final static String _jspx_template74 = ">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"50px\">정비대상</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<select id=\"MT_SEL\" name=\"MT_SEL\" class=\"input_form1\" style=\"width: 76px\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template75 = "\r\n\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n                    \t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"><span id=\"CAR_NO_SPAN\" style=\"display: none;\">차량번호</span></td>\r\n                        <td colspan=\"1\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n                        \t<input id=\"CAR_NO\" name=\"CAR_NO\" type=\"text\" value=\"";
  private final static String _jspx_template76 = "\" class=\"input_form1\" style=\"width: 76px;display: none;\" maxlength=\"10\">\r\n                    \t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"34px\" colspan=\"4\" bgcolor=\"#FFFFFF\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"80\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t<span class=\"sub_stan_blue\">*\t운영정보</span>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">취급품목</td>\r\n\t\t\t\t\t\t<td colspan=\"1\" bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<select id=\"SG_TYP\" name=\"SG_TYP\" class=\"input_form1\" style=\"width: 76px\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template77 = "\r\n\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input id=\"LIQUOR_SL\" name=\"LIQUOR_SL\" type=\"checkbox\" ";
  private final static String _jspx_template78 = "value='1' checked";
  private final static String _jspx_template79 = " ";
  private final static String _jspx_template80 = "value='0'";
  private final static String _jspx_template81 = ">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"75px\">주류판매</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input id=\"LPGAS_US\" name=\"LPGAS_US\" type=\"checkbox\" ";
  private final static String _jspx_template82 = "value='1' checked";
  private final static String _jspx_template83 = " ";
  private final static String _jspx_template84 = "value='0'";
  private final static String _jspx_template85 = ">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"75px\">LPG 사용</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">영업인원</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"MEM_NUM\" name=\"MEM_NUM\" value=\"";
  private final static String _jspx_template86 = "\" class=\"input_form1\" style=\"width: 76px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, OPEN_TIME1, 2);\" maxlength=\"2\">(운영자 본인 포함)\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">일매출액</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\" colspan='3'>\r\n\t\t\t\t\t\t\t<input id=\"DAY_SALES\" name=\"DAY_SALES\" value=\"";
  private final static String _jspx_template87 = "\" type=\"text\" class=\"input_form1\" style=\"width: 76px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"8\"> 원\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\tclass=\"sub_table_b\">운영시간</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<input id=\"OPEN_TIME1\" name=\"OPEN_TIME1\" value=\"";
  private final static String _jspx_template88 = "\" type=\"text\" class=\"input_form1\" style=\"width: 30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);count_check(this, OPEN_TIME2, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"12\" align=\"center\">:</td>\r\n\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t<input id=\"OPEN_TIME2\" name=\"OPEN_TIME2\" value=\"";
  private final static String _jspx_template89 = "\" type=\"text\" class=\"input_form1\" style=\"width: 30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);count_check(this, CLOSE_TIME1, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"12\" align=\"center\">~</td>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<input id=\"CLOSE_TIME1\" name=\"CLOSE_TIME1\" value=\"";
  private final static String _jspx_template90 = "\" type=\"text\" class=\"input_form1\" style=\"width: 30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);count_check(this, CLOSE_TIME2, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"12\" align=\"center\">:</td>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<input id=\"CLOSE_TIME2\" name=\"CLOSE_TIME2\" value=\"";
  private final static String _jspx_template91 = "\" type=\"text\" class=\"input_form1\" style=\"width: 30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"2\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">가입단체</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<select id=\"UN_TYP\" name=\"UN_TYP\" class=\"input_form1\" style=\"width: 76px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template92 = "\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t<input id=\"UN_TXT\" name=\"UN_TXT\" value=\"";
  private final static String _jspx_template93 = "\" type=\"text\" class=\"input_form1\" style=\"width: 158px\" maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기타정보</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"NOTES\" name=\"NOTES\" value=\"";
  private final static String _jspx_template94 = "\" type=\"text\" class=\"input_form1\" style=\"width:600px\" maxlength=\"255\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Cancel('";
  private final static String _jspx_template95 = "')\" style=\"cursor: pointer;\">\r\n\t\t\t\t\t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:ModifyPrc()\" style=\"cursor: pointer;\">\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n\r\n</form>\r\n\r\n</body>\r\n</html>";
}
