package jeus_jspwork._jsp._facility._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumji_5fmodify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
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
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template8);
      // jsp code [from=(124,43);to=(124,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(124,77);to=(124,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(128,47);to=(128,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(129,50);to=(129,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(130,46);to=(130,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(131,46);to=(131,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(132,49);to=(132,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQUEST_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(133,48);to=(133,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${object_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(134,48);to=(134,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${choose_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(135,49);to=(135,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(142,75);to=(142,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template35);
      // jsp code [from=(180,9);to=(180,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(202,11);to=(202,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_owner_Group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(208,11);to=(208,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(215,184);to=(215,194)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(224,150);to=(224,158)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${standard}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(229,136);to=(229,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${quantity}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(236,185);to=(236,193)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${depth_ck}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(237,106);to=(237,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${depth_num}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(249,96);to=(249,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_fromdate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(250,97);to=(250,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_todate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(254,106);to=(254,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${partly_period}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(255,224);to=(255,236)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${total_period}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(272,140);to=(272,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sisul_post}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(275,139);to=(275,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sisul_addr1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(276,98);to=(276,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sisul_addr2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(294,111);to=(294,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${work_fromdate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(297,109);to=(297,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${work_todate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(305,114);to=(305,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${completion_date}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(313,91);to=(313,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${exe_info}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(336,8);to=(336,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposesebu_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(338,18);to=(338,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposesebu_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${clist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("dept");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template4);
            // jsp code [from=(97,11);to=(97,20)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template5);
            // jsp code [from=(97,36);to=(97,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dept.DEPTH}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template6);
            // jsp code [from=(97,57);to=(97,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dept.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template7);

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
          out.write(_jspx_template20);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template32);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template34);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist!= null && !empty blist}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template21);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_1_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template31);

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
          out.write(_jspx_template33);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
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
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template22);
            // jsp code [from=(158,67);to=(158,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(158,87);to=(158,102)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OBJECT_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(159,44);to=(159,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(160,32);to=(160,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(161,32);to=(161,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.QUANTITY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(162,32);to=(162,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(162,56);to=(162,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(163,32);to=(163,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);

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

  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<!--<script language=\"javascript\" src=\"/jsp/facility/minwon/tab/info_register.js\"></script>-->\r\n<script language=\"javascript\" src=\"/jsp/facility/minwon/tab/info_sisul_register.js\"></script>\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\tvar dept = [];\r\n\t\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.Tab_Img(\"jumji\");\r\n\r\n\t\tIFRM_PurposeCode.PURPOSE_CD.className=\"view\";\r\n\t}\r\n\t\r\n\tfunction\tSisul_Click()\r\n\t{\t\r\n\t\tif(document.getElementById(\"XMLDATA\").value\t== \"\")\r\n\t\t{\r\n\t\t\tSisul_Init();\r\n\t\t\tSisul_Init_UseType();\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction\tModify()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\tvar purpose_cd = IFRM_PurposeCode.PURPOSE_CD.value;\r\n\t\tform.PURPOSE_CD.value = purpose_cd;\r\n\t\tform.action = \"jumji_modify_prc.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tInit_UseType(sel)\r\n\t{\r\n\t\tdocument.getElementById(\"UseType1\").style.display = \"none\";\r\n\t\tdocument.getElementById(\"UseType2\").style.display = \"none\";\r\n\t\t\r\n\t\tif(sel == '2' || sel == '3')\r\n\t\t\tdocument.getElementById(\"UseType2\").style.display = \"block\";\t//\t하천, 구거\r\n\t\telse\t\t\t\t\t\t\r\n\t\t\tdocument.getElementById(\"UseType1\").style.display = \"block\";\t//\t도로\t\r\n\t}\r\n\r\n\tfunction\tInit_UseSection(sel)\r\n\t{\r\n\t\tif(sel == '1')\r\n\t\t\tdocument.getElementById(\"UseSection\").style.display = \"block\";\t//\t정기\r\n\t\telse\r\n\t\t\tdocument.getElementById(\"UseSection\").style.display = \"none\";\r\n\t}\r\n\r\n\tfunction choose_place(admin_no, object_no)\r\n\t{\r\n\t\tvar gu_code= document.getElementById(\"gu_code\").value;\r\n\t\tvar corp_cd = document.getElementById(\"corp_cd\").value;\r\n\t\tvar request_no= document.getElementById(\"request_no\").value;\r\n\t\tvar currentPage= document.getElementById(\"currentPage\").value;\r\n\r\n\t\tlocation.href=\"/facility/jumyonginfo/jumji_modify.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n\t\t+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&object_no=\"+object_no+\"&ADMIN_NO=\"+admin_no;\r\n\t}\r\n\r\n\tfunction\tCancel()\r\n\t{\r\n\t\tdocument.form.action = \"/facility/jumyonginfo/jumji_view.do\";\r\n\t\tdocument.form.submit();\r\n\t}\r\n\t\r\n\t//\t심도\r\n\tfunction\tInit_Depth()\r\n\t{\r\n\t\t";
  private final static String _jspx_template4 = "\r\n\t\t\tdept[";
  private final static String _jspx_template5 = "] = { depth: ";
  private final static String _jspx_template6 = ", rate: ";
  private final static String _jspx_template7 = "};\r\n\t\t";
  private final static String _jspx_template8 = "\r\n\t}\r\n\t\r\n\tfunction\tSelect_Depth()\r\n\t{\r\n\t\tvar\tnum\t= document.getElementById(\"DEPTH_CK\").value;\r\n\t\t\r\n\t\tfor(var i=0; i < dept.length ; i++)\r\n\t\t{\r\n\t\t\tif(num >= dept[i].depth)\r\n\t\t\t{\r\n\t\t\t\tdocument.getElementById(\"DEPTH_NUM\").value\t= dept[i].rate;\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(num == \"\")\r\n\t\t\tdocument.getElementById(\"DEPTH_NUM\").value\t= \"\";\r\n\t\telse\r\n\t\t\tdocument.getElementById(\"DEPTH_NUM\").value\t= \"0\";\r\n\t}\r\n\t\r\n\tInit_Depth();\r\n//]]>\r\n</script>\r\n\r\n<!-- body onload=\"Init(); Init_UseType('";
  private final static String _jspx_template9 = "'); Init_UseSection('";
  private final static String _jspx_template10 = "');\" -->\r\n<body>\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" name=\"currentPage\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" name=\"CORP_CD\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" name=\"REQUEST_NO\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" name=\"object_no\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" name=\"choose_no\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template18 = "\">\r\n\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t        <tr>\r\n\t\t\t\t<td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template19 = "</span> 건 </td>\r\n\t        </tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t        <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"5%\" nowrap=\"nowrap\">번호</td>\r\n\t\t\t\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"40%\" nowrap=\"nowrap\">점용목적(코드)</td>\r\n\t\t\t\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"5%\" nowrap=\"nowrap\">수량</td>\r\n\t\t\t    \t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"30%\" nowrap=\"nowrap\">점용기간</td>\r\n\t\t\t\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"20%\" nowrap=\"nowrap\">세입구분</td>\r\n\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t                      ";
  private final static String _jspx_template22 = "\r\n\t\t\t\t                      <tr onClick=\"javascript:choose_place('";
  private final static String _jspx_template23 = "','";
  private final static String _jspx_template24 = "');\" onMouseOver=this.style.backgroundColor='#f6f7f8' onMouseOut=this.style.backgroundColor='' style='CURSOR: Hand;'>\r\n\t\t\t\t\t\t\t\t\t\t<td height='26' align='center'>";
  private final static String _jspx_template25 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align='center'>";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align='center'>";
  private final static String _jspx_template27 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align='center'>";
  private final static String _jspx_template28 = " ~ ";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align='center'>";
  private final static String _jspx_template30 = "</td>\r\n\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"11\" height=\"26\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t ";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t  <td height=\"30\" align=\"center\">\r\n\t\t\t\t  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template36 = "\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t  </table>\r\n\t\t\t  </td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td width=\"100\" height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n\t\t\t\t\t\t  <td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">도로</td>\r\n\t\t\t\t\t\t  <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t\t  <td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"SECTION\" value=\"1\">계속\r\n  \t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소유자</td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t<select name=\"OWNER_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template37 = "\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t<select name=\"TAX_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" ><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"25\" src=\"/jsp/common/purposeCode/purposeCode.jsp?SectionCode=4&PURPOSE_CD=";
  private final static String _jspx_template39 = "&essential=1\"></iframe>\r\n\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">상세시설물</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<select name=\"PURPOSESEBU_CD\" id=\"PURPOSESEBU_CD\" class=\"input_form1\" style=\"width:120px\"></select>\r\n\t\t\t\t\t\t\t</td>    \r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">규격</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"STANDARD\" type=\"text\" class=\"input_form1\" style=\"width:140px\" maxlength=\"12\" value=\"";
  private final static String _jspx_template40 = "\"></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수량(연장)</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input name=\"QUANTITY\" type=\"text\" class=\"essential\" style=\"width:140px\" maxlength=\"12\" onKeyUp=\"nr_num_float(this);\" value=\"";
  private final static String _jspx_template41 = "\"> 개(또는 m)\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">심도(감액적용)</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"DEPTH_CK\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onKeyUp=\"Select_Depth(); nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"3\"  value=\"";
  private final static String _jspx_template42 = "\">&nbspm &nbsp&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"DEPTH_NUM\" type=\"text\" class=\"input_form1\" style=\"width:50px\" readonly  value=\"";
  private final static String _jspx_template43 = "\"> %\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"MUL_FROMDATE\" type=\"text\" class=\"essential\" style=\"width:70px\" value=\"";
  private final static String _jspx_template44 = "\" readonly><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t\t\t\t\t~ <input name=\"MUL_TODATE\" type=\"text\" class=\"essential\" style=\"width:70px\"  value=\"";
  private final static String _jspx_template45 = "\" readonly><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, MUL_TODATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr style=\"display:none\" id=\"UseSection\">\r\n\t\t\t\t\t\t\t\t\t<td>일시점용<input name=\"PARTLY_PERIOD\" type=\"text\" class=\"essential\" style=\"width:300px\"  value=\"";
  private final static String _jspx_template46 = "\">\r\n\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;총<input name=\"TOTAL_PERIOD\" type=\"text\" class=\"essential\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\"  value=\"";
  private final static String _jspx_template47 = "\">일</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t  <td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\"><img src=\"/img/facility_view3.gif\" alt=\"시설물 주소\"></span></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t  </table></td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주소</td>\r\n\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><input name=\"SISUL_POST\" type=\"text\" class=\"essential\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" readonly  value=\"";
  private final static String _jspx_template48 = "\"></td>\r\n\t\t\t\t\t\t\t\t\t\t<td><a href=\"javascript:openZipcodePopup('form.SISUL_POST', 'form.SISUL_ADDR1');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"SISUL_ADDR1\" type=\"text\" class=\"essential\" style=\"width:250px\" onFocus=\"Jumin_toaddr_Check();\" readonly  value=\"";
  private final static String _jspx_template49 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"SISUL_ADDR2\" type=\"text\" class=\"essential\" style=\"width:250px\"  value=\"";
  private final static String _jspx_template50 = "\">\r\n\t\t\t\t\t\t\t\t\t\t</td>  \r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t  <td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\"><img src=\"/img/facility_view4.gif\" alt=\"공사(굴착) 정보\"></span></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t  </table></td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t  <td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사기간 </td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"WORK_FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:65px\" readonly value=\"";
  private final static String _jspx_template51 = "\"></td>\r\n\t\t\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, WORK_FROMDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"WORK_TODATE\" type=\"text\" class=\"input_form1\" style=\"width:65px\" readonly value=\"";
  private final static String _jspx_template52 = "\"></td>\r\n\t\t\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, WORK_TODATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t   </td>\r\n\t\t\t\t\t\t   <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">준공년월일 </td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"COMPLETION_DATE\" type=\"text\" class=\"input_form1\" style=\"width:65px\" readonly  value=\"";
  private final static String _jspx_template53 = "\"></td>\r\n\t\t\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, COMPLETION_DATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사내용</td>\r\n\t\t\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<input name=\"EXE_INFO\" type=\"text\" class=\"input_form1\" style=\"width:98%\"  value=\"";
  private final static String _jspx_template54 = "\">\r\n\t\t\t\t\t\t    </table>\r\n\t\t\t\t\t\t   </td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\">\r\n\t\t\t\t\t\t<table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t\t  \t\t<a href=\"javascript:Cancel()\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\"></a>\t\r\n\t\t\t\t\t  \t\t<a href=\"javascript:parent.ModifyPrc()\"><img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table></td>\r\n\t\t\t</tr>\r\n\r\n</table>\r\n</body>\r\n</html>\r\n<script language=\"javascript\">\r\n\t//상세시설물 선택\r\n\tfunction purposesebu_select(){\r\n\t\tif(";
  private final static String _jspx_template55 = " > 0){\r\n\t\t\tvar frm=document.form.PURPOSESEBU_CD;\r\n\t\t\tfrm.options[";
  private final static String _jspx_template56 = "].selected = true;\r\n\t\t}\r\n\t}\r\n</script>";
}
