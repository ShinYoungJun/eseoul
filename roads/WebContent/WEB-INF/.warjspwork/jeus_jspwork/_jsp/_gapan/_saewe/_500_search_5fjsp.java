package jeus_jspwork._jsp._gapan._saewe;

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
      // jsp code [from=(70,48);to=(70,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CAL_MODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(172,26);to=(172,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(178,30);to=(178,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(206,68);to=(206,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(207,62);to=(207,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(209,62);to=(209,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(255,109);to=(255,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(258,109);to=(258,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(270,15);to=(270,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(279,18);to=(279,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(313,90);to=(313,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(325,18);to=(325,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(330,18);to=(330,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(345,109);to=(345,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(346,109);to=(346,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(357,147);to=(357,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(368,152);to=(368,159)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMINNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(375,152);to=(375,159)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMINNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(380,17);to=(380,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sunap_part}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(400,35);to=(400,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template34);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template62);

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
            out.write(_jspx_template30);
            // jsp code [from=(454,66);to=(454,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(456,63);to=(456,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(457,66);to=(457,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);

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
            out.write(_jspx_template35);
            // jsp code [from=(468,46);to=(468,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(468,66);to=(468,75)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(469,61);to=(469,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(470,50);to=(470,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(471,49);to=(471,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(472,49);to=(472,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(473,49);to=(473,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(474,50);to=(474,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(476,50);to=(476,58)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(476,67);to=(476,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(476,85);to=(476,98)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(476,107);to=(476,119)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(476,128);to=(476,139)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(476,148);to=(476,159)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(476,168);to=(476,183)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(478,50);to=(478,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(479,49);to=(479,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(480,49);to=(480,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(481,49);to=(481,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // jsp code [from=(482,50);to=(482,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_LASTYEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template55);
            // jsp code [from=(483,50);to=(483,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template56);
            // jsp code [from=(484,50);to=(484,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQ_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template57);
            // jsp code [from=(485,50);to=(485,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SANCHULGIGAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template58);
            // jsp code [from=(486,69);to=(486,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template59);
            // jsp code [from=(488,69);to=(488,83)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template60);
            // jsp code [from=(489,50);to=(489,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template61);

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
  private final static String _jspx_template9 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t\r\n\tfunction\tView(gapanNo,seq)\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/gapan/saewe/view.do?GAPAN_NO=\"+gapanNo+\"&SEQ=\"+seq;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.currentPage.value\t= 1;\r\n\t\tform.action = \"/gapan/saewe/search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\texcel_Search()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.currentPage.value\t= 1;\r\n\t\tform.action = \"/gapan/saewe/excel_search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tSelect_UseType(sel)\r\n\t{\r\n\r\n\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode.jsp?SectionCode=\" + sel.value;\r\n\t}\r\n\r\n\tfunction\tInit()\r\n\t{\r\n\r\n\t\tvar obj = document.form.message.value;\r\n\t\t\r\n\t\tif(obj != \"\")\t\r\n\t\t\talert(obj);\r\n\r\n\t\tsetSelectedOption(document.form.CAL_MODE, '";
  private final static String _jspx_template10 = "');\r\n\t\tsetYear();\r\n\r\n\r\n\t\t\r\n\t}\r\n\r\n\t//select의 option을 선택된 값으로 지정\r\n\tfunction setSelectedOption(obj, val){\r\n\t\tfor(i = 0 ; i < obj.options.length ; i++){\r\n\t\t\tif(obj.options[i].value == val){\r\n\t\t\t\tobj.options[i].selected = true;\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\r\n\tfunction checkKeySearch()\r\n\t{\r\n\t\tif(event.keyCode == 13) Search();\r\n\t}\r\n\t\t\r\n\tfunction SaeweSuipBugwa_Ilgwal()\r\n\t{\r\n\t\t document.getElementById(\"Bugwa_Ilgwal\").onclick = function(){\r\n            \t alert(\"잠시만 기다리세요.\");\r\n       \r\n\t\t         };\r\n\t\tvar f = document.form;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no_arr = document.getElementsByName(\"GAPAN_NO_ARR\");\r\n\t\tvar tax_yn_arr = document.getElementsByName(\"TAX_YN_ARR\");\r\n\t\tvar count = 0;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true && tax_yn_arr[i].value == '미부과'){\r\n\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\tcount++;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(count <= 0){\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}else{\r\n\t\t\tif(!confirm('부과대상이 아닌것을 제외한\\n'+count+'건에 대해서 부과하시겠습니까?.'))\r\n\t\t\t\treturn;\r\n\t\t\t\r\n\t\t\tform.action = \"/gapan/saewe/saeweSuipBugwa_ilgwal.do\";\r\n\t\t\tform.submit();\r\n\t\t\r\n\t\t}\r\n\r\n\t}\r\n\r\n\t//********** BEGIN_현진_20120228\r\n\tfunction bugwa_cancel(){\t\t\r\n\t\tvar f = document.form;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no_arr = document.getElementsByName(\"GAPAN_NO_ARR\");\r\n\t\tvar tax_yn_arr = document.getElementsByName(\"TAX_YN_ARR\");\r\n\t\t\t\t\t\r\n\t\tvar count = 0;\r\n\t\tvar hitCount = 0;\r\n\t\tvar target;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\tif(tax_yn_arr[i].value == '부과'){\r\n\t\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\t\thitCount++;\r\n\t\t\t\t\ttarget = i;\r\n\t\t\t\t}\r\n\t\t\tcount++;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(count == 0){\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}else if(count <= 0 || hitCount <= 0){\r\n\t\t\talert(\"부과 철회는 부과된 대상에 대해서만  가능합니다.\");\r\n\t\t\treturn;\r\n\t\t}else{\r\n\t\t\tif (confirm(\"부과 철회 하시겠습니까?\")){\r\n\t\t\t\tform.action = \"/gapan/saewe/bugwa_cancel.do\";\r\n\t\t\t\tform.submit();\r\n\t\t\t}else{\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\t\t\r\n\t}\r\n\t//********** END_현진_20120228\r\n\t\t\r\n\t\t\r\n    function setYear()\r\n    {\r\n        now = new Date();\r\n        Y = now.getFullYear();\r\n\r\n        var strYear = \"";
  private final static String _jspx_template11 = "\";    \r\n        function setYear()\r\n        {\r\n            now = new Date();\r\n            Y = now.getFullYear();\r\n\r\n            var strYear = \"";
  private final static String _jspx_template12 = "\";\r\n\r\n            for(var i = 0 ; i < 10 ; i++){\r\n                newItem = new Option(i);\r\n                document.getElementById(\"YEAR\").options[i]  = newItem;\r\n                document.getElementById(\"YEAR\").options[i].text = Y+1-i;\r\n                document.getElementById(\"YEAR\").options[i].value = Y+1-i;\r\n                if(strYear == Y-i) document.getElementById(\"YEAR\").options[i].selected = true;\r\n            }\r\n\r\n            document.getElementById(\"YEAR\").options.value = strYear;\r\n        }\r\n\r\n        for(var i = 0 ; i < 10 ; i++){\r\n            newItem = new Option(i);\r\n            document.getElementById(\"YEAR\").options[i]  = newItem;\r\n            document.getElementById(\"YEAR\").options[i].text = Y+1-i;\r\n            document.getElementById(\"YEAR\").options[i].value = Y+1-i;\r\n            if(strYear == Y-i) document.getElementById(\"YEAR\").options[i].selected = true;\r\n        }\r\n\r\n        document.getElementById(\"YEAR\").options.value = strYear;\r\n    }\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\" action=\"search.jsp\">\r\n\t<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template13 = "\"> \r\n\t<input type=\"hidden\" id=\"TOTALCNT\" name=\"TOTALCNT\" value=\"";
  private final static String _jspx_template14 = "\"> \r\n\t<input type=\"hidden\" id=\"excel\" name=\"excel\" value=\"\"> \r\n\t<input type=\"hidden\" name=\"message\" name=\"message\" value=\"";
  private final static String _jspx_template15 = "\">\r\n\r\n\t<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td height=\"43\"><img src=\"/img/sub9_cont3_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\">\r\n\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t\t</tr>\r\n\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><img src=\"/img/sub_petition_title10.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td class=\"contborder_blue\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출년도</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"YEAR\" id=\"YEAR\" class=\"input_form1\" style=\"width:130px\">\r\n                                                 </select>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">갱신기간</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"GIGAN1\" name=\"GIGAN1\" type=\"text\" class=\"input_form1\" style=\"width: 70px\" value=\"";
  private final static String _jspx_template16 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"middle\" onclick=\"popUpCalendar(this, document.getElementById('GIGAN1'), 'yyyymmdd')\" style=\"vertical-align: middle;cursor: pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;~&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"GIGAN2\" name=\"GIGAN2\" type=\"text\" class=\"input_form1\" style=\"width: 70px\" value=\"";
  private final static String _jspx_template17 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"middle\" onclick=\"popUpCalendar(this, document.getElementById('GIGAN2'), 'yyyymmdd')\" style=\"vertical-align: middle;cursor: pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"TAX_SET\" name=\"TAX_SET\" class=\"input_form1\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"TAX_YN\" name=\"TAX_YN\" class=\"input_form1\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template19 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물명</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"1\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"FT_TYP\" name=\"FT_TYP\" style=\"width: 200px\" class=\"input_form1\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"011\">가로판매대</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"012\">구두수선대</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출목적</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"1\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"CAL_MODE\" name=\"CAL_MODE\" style=\"width: 200px\" class=\"input_form1\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">점용료</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">대부료</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width:130px\">";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법정동</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"HJ_CD\" name=\"HJ_CD\" class=\"input_form1\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지번지</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" class=\"input_form1\" style=\"width: 40px\" value=\"";
  private final static String _jspx_template23 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t- <input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" class=\"input_form1\" style=\"width: 40px\" value=\"";
  private final static String _jspx_template24 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"NAME\" name=\"NAME\" type=\"text\" class=\"input_form1\" style=\"width: 100px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template25 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120404 -->\r\n\t\t\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"ADMINNO\"  name=\"ADMINNO\" type=\"text\" class=\"input_form1\" style=\"width: 120px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template26 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"ADMINNO\"  name=\"ADMINNO\" type=\"text\" class=\"input_form1\" style=\"width: 120px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template27 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납여부</td>\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"SUNAP_YN\" name=\"SUNAP_YN\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t";
  private final static String _jspx_template28 = "\r\n\t\t\t\t\t  \t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120404 -->\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"32\" align=\"right\"><a href=\"javascript:Search()\">\r\n\t\t\t\t\t\t\t\t\t\t<img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"34\" class=\"sub_stan\">전체건수 : <span\r\n\t\t\t\t\t\t\t\t\t\tclass=\"sub_stan_blue\">";
  private final static String _jspx_template29 = "</span> 건</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"780px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t\t\t\t    <TD width=\"26px\"  valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t      <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t        <TR height=\"26\">\r\n\t\t\t\t\t\t\t\t\t              <td width=\"35px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" ID=\"SELECT_ALL\" onclick=\"javascript:selectAll(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t        </TR>\r\n\t\t\t\t\t\t\t\t\t      </TABLE>\r\n\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t      <DIV id=\"topLine2\" style=\"width:737px;overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t\t        <TABLE width=\"1440px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t          <TR height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50\">번호</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출년도</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세번호</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영인</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지주소</td>\r\n\t\t\t\t\t\t\t\t\t            <!-- \r\n\t\t\t\t\t\t\t\t\t            <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지새주소</td>\r\n\t\t\t\t\t\t\t\t\t             -->\r\n\t\t\t\t\t\t\t\t\t            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물명</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과목적</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적(㎡)</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작년도<br/>부과금액</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도<br/>부과금액</td>\r\n\t\t\t\t\t\t\t\t\t            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">갱신일자</td>                                                \r\n\t\t\t\t\t\t\t\t\t            <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출일자</td>                                                \r\n\t\t\t\t\t\t\t\t\t            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과여부</td>\r\n\t\t\t\t\t\t\t\t\t            <!--  //********** BEGIN_KANG_20120404 -->\r\n\t\t\t\t\t\t\t\t\t            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납일</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120404 -->\r\n\t\t\t\t\t\t\t\t\t          </TR>\r\n\t\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t\t\t\t    <TD width=\"26px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t      <DIV id=\"leftDisplay2\" style=\"width:26px;height:257px;overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t\t        <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t  \t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr height=\"26px\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"35px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" NAME=\"SELECT_ITEM\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"GAPAN_NO_ARR\" value=\"";
  private final static String _jspx_template31 = "\"> \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"ITEM_CHECK\" value=\"\">\r\n\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"SEQ_ARR\" value=\"";
  private final static String _jspx_template32 = "\">\r\n\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"TAX_YN_ARR\" value=\"";
  private final static String _jspx_template33 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t      <DIV id=\"mainDisplay2\" style=\"width:754px;height:274px;overflow:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\" onscroll=\"scrollAll()\">\r\n\t\t\t\t\t\t\t\t\t        <TABLE width=\"1440px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t          ";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr onClick=\"javascript:View('";
  private final static String _jspx_template36 = "','";
  private final static String _jspx_template37 = "')\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" height=\"26\" align=\"center\">";
  private final static String _jspx_template38 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template39 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\">";
  private final static String _jspx_template40 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\">";
  private final static String _jspx_template41 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" align=\"center\">";
  private final static String _jspx_template43 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" align=\"center\">";
  private final static String _jspx_template44 = "&nbsp;";
  private final static String _jspx_template45 = "&nbsp;";
  private final static String _jspx_template46 = "&nbsp;";
  private final static String _jspx_template47 = "&nbsp;";
  private final static String _jspx_template48 = "&nbsp;";
  private final static String _jspx_template49 = "&nbsp;";
  private final static String _jspx_template50 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\" >";
  private final static String _jspx_template51 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\">";
  private final static String _jspx_template52 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\">";
  private final static String _jspx_template53 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\">";
  private final static String _jspx_template54 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template55 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template56 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template57 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" align=\"center\">";
  private final static String _jspx_template58 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" class=\"sub_table_r\" align=\"center\">";
  private final static String _jspx_template59 = "</td> \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120404 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" class=\"sub_table_r\" align=\"center\">";
  private final static String _jspx_template60 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template61 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120404 -->                                                                               \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template62 = "\t\r\n\t\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120228 -->\r\n\t\t\t\t\t\t\t\t<img src=\"/img/bugwa_cancel_icon.gif\" alt=\"부과철회\" border=\"0\" onclick=\"javascript:bugwa_cancel();\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120228 -->\r\n\t\t\t\t\t\t\t\t<img src=\"../../../img/levy_icon3.gif\" id=\"Bugwa_Ilgwal\" name=\"Bugwa_Ilgwal\" alt=\"일괄부과 처리\" border=\"0\" onclick=\"javascript:SaeweSuipBugwa_Ilgwal()\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t\t\t\t<img src=\"../../../img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td></td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</form>\r\n</body>\r\n</html>";
}
