package jeus_jspwork._jsp._facility._minwon._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fregister_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template14);
      // jsp code [from=(159,23);to=(159,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(162,27);to=(162,38)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(167,25);to=(167,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(172,25);to=(172,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(212,65);to=(212,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(213,63);to=(213,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_CHECK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(214,67);to=(214,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_PROCESS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(215,57);to=(215,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(216,57);to=(216,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(217,61);to=(217,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(218,63);to=(218,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_REQNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(219,61);to=(219,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(220,60);to=(220,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(221,60);to=(221,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(268,118);to=(268,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_DATE_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(275,116);to=(275,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PREDATE_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(283,154);to=(283,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_DEP_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(285,160);to=(285,174)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGE_DEP_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(292,154);to=(292,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGER_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(317,124);to=(317,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_ssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(318,127);to=(318,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_ssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(325,112);to=(325,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POST_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(329,150);to=(329,159)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR1_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(330,108);to=(330,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR2_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      out.write(_jspx_template39);
      // jsp code [from=(401,98);to=(401,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(403,93);to=(403,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(405,93);to=(405,102)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(406,100);to=(406,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(457,102);to=(457,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(459,97);to=(459,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_TOBON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(461,97);to=(461,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_TOBU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(462,104);to=(462,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(469,111);to=(469,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(470,105);to=(470,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_TOBON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(472,105);to=(472,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_TOBU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(473,112);to=(473,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(480,110);to=(480,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(568,14);to=(572,10)]
      out.write(_jspx_template52);
      // jsp code [from=(568,14);to=(572,10)]
      out.write(_jspx_template53);
      out.write(_jspx_template54);
      // jsp code [from=(579,11);to=(579,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_owner_Group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(583,11);to=(583,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      out.write(_jspx_template57);
      // jsp code [from=(657,17);to=(657,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(660,41);to=(660,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(665,44);to=(665,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(670,44);to=(670,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);

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
    _jspx_th_c_forEach_0.setVar("dept");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template10);
            // jsp code [from=(54,11);to=(54,20)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);
            // jsp code [from=(54,36);to=(54,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dept.DEPTH}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);
            // jsp code [from=(54,57);to=(54,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dept.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = " \r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/facility/minwon/tab/info_register.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/facility/minwon/tab/info_sisul_register.js\"></script>\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tvar dept = [];\r\n\r\n//\tfunction\tInit()\r\n//\t{\t\t\r\n//\t\tparent.iFrameResizeTab(\"tab1\");\t\r\n//\t\tIFRM_PurposeCode.PURPOSE_CD.className\t= \"essential\";\r\n//\t}\r\n\t\r\n\tfunction\tSisul_Click()\r\n\t{\t\r\n\t\tif(document.getElementById(\"XMLDATA\").value\t== \"\")\r\n\t\t{\r\n\t\t\tSisul_Init();\r\n\t\t\tSisul_Init_UseType();\r\n\t\t}\r\n\t}\r\n\t\r\n\t//\t심도\r\n\tfunction\tInit_Depth()\r\n\t{\r\n\t\t";
  private final static String _jspx_template10 = "\r\n\t\t\tdept[";
  private final static String _jspx_template11 = "] = { depth: ";
  private final static String _jspx_template12 = ", rate: ";
  private final static String _jspx_template13 = "};\r\n\t\t";
  private final static String _jspx_template14 = "\r\n\t}\r\n\r\n\tfunction\tSelect_Depth()\r\n\t{\r\n\t\tvar\tnum\t= document.getElementById(\"DEPTH_CK\").value;\r\n\t\t\r\n\t\tfor(var i=0; i < dept.length ; i++)\r\n\t\t{\r\n\t\t\tif(num >= dept[i].depth)\r\n\t\t\t{\r\n\t\t\t\tdocument.getElementById(\"DEPTH_NUM\").value\t= dept[i].rate;\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(num == \"\")\r\n\t\t\tdocument.getElementById(\"DEPTH_NUM\").value\t= \"\";\r\n\t\telse\r\n\t\t\tdocument.getElementById(\"DEPTH_NUM\").value\t= \"0\";\r\n\t}\r\n\t\r\n\tfunction selectTabMenu(){\r\n\t\r\n\t\tvar tabs = document.getElementById('tabmenu');\r\n\t\tvar tab = tabs.getElementsByTagName('a'); // 탭 요소\t\r\n\t\tvar contents = document.getElementById('tabcontents');\r\n\t\tvar content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class\r\n\t\tvar type = true; // 롤오버의 true / false\t\t\r\n\t\ttabDisplay(tab,content,1,true);\r\n\t\ttabAct(tab,content,1,type);\t\t\r\n\t}\r\n\t\r\n\t\r\n\t/*\r\n\r\n\tajax 함수\r\n\r\n\t*/\t\r\n\t\tfunction setSisul_addr1(){\r\n\r\n\t//\talert('실행'+document.getElementById('bj_cd').value );\r\n\t\t\r\n\t\t\tvar param = \"&bj_cd=\"+document.getElementById('BJ_CD').value; \r\n\r\n\t\t\tsendRequest(\"/facility/minwon/get_ajax_refdongname.do\", param, \"GET\", ResultSisulAddr1);\r\n\t\t}\r\n\r\n\t\tfunction\tResultSisulAddr1(obj)\r\n\t\t{\r\n\t\t\t\r\n\t\t\t  var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n\r\n\t\t\t  xmldoc.async\t= false;\r\n\t\t\t  \r\n\t\t\t  xmldoc.loadXML(obj);\r\n\t\t\t  \r\n\t\t\t  \r\n\t\t\t  \r\n\t\t\t  if(xmldoc.getElementsByTagName(\"SISUL_ADDR1\").length >0 && xmldoc.getElementsByTagName(\"SISUL_ADDR1\").item(0).firstChild != null)  document.getElementById(\"SISUL_ADDR1\").value \t  = xmldoc.getElementsByTagName(\"SISUL_ADDR1\").item(0).firstChild.nodeValue;\t\t\t \t\t    \r\n\t\t\t  else document.getElementById(\"SISUL_ADDR1\").value = \"\";  \r\n\r\n\t\t}\r\n\t\t\r\n\t\t/*\r\n\r\n\t\t시설 추가 함수\r\n\r\n\t\t*/\t\r\n\t\t\r\n\t\tfunction\tNew_Sisul_Register()\r\n\t\t{\t\t\t\r\n\t\t\tvar form = document.form;\r\n\t\t\tvar\tvalue;\r\n\t\t\tvar\tresult\t= Sisul_DataCheck();\r\n\r\n\t\t\tif(result\t==\tfalse)\r\n\t\t\t\treturn;\r\n\t\t\tform.PURPOSE_CD.value\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE_CD\").value;\t\r\n\t\t\tvalue\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE1\");\r\n\t\t\tform.PURPOSE1_NM.value\t= value[value.selectedIndex].text;\r\n\t\t\tvalue\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE2\");\r\n\t\t\tform.PURPOSE2_NM.value\t= value[value.selectedIndex].text;\r\n\t\t\tvalue\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE3\");\r\n\t\t\tform.PURPOSE3_NM.value\t= value[value.selectedIndex].text;\r\n\r\n\t\t\tinsertNode();\t//\t노드에 추가\r\n\t\t\t//Clear();\r\n\t\t\tmakeList();\r\n\t\t\t\r\n\t\t\tvar addr_fix = document.getElementById(\"addr_fix\");\r\n\t\t\tvar SISUL_POST = form.SISUL_POST.value;\r\n\t\t\tvar SISUL_ADDR1 = form.SISUL_ADDR1.value;\r\n\t\t\tvar SISUL_ADDR2 = form.SISUL_ADDR2.value;\r\n\t\t\tvar BONBUN = form.BONBUN.value;\r\n\t\t\tvar BUBUN = form.BUBUN.value;\r\n\t\t\r\n\t\t\t\r\n\t\t\tvar innerHtml =\t\"<table border='0' cellpadding='0' cellspacing='0' class='sub_stan'>\"; \r\n\t\t\tinnerHtml += \"<tr>\";\r\n\t\t\tinnerHtml += \"\t<td><input name='SISUL_POST' type='text' class='essential' style='width:50px' onFocus='' value='\"+SISUL_POST+\"' ></td>\";\r\n\t\t\tinnerHtml += \"\t<td><a href='javascript:openZipcodePopup_new('form.SISUL_POST','','','','','','','','','');'><img src='/img/search_icon.gif' alt='검색' width='56' height='18' border='0'></a></td>\";\r\n\t\t\tinnerHtml += \"\t<td bgcolor='eaeaea' class='table_bl_left'>\";\r\n\t\t\t\t\r\n\t\t\tinnerHtml += \t \t\"";
  private final static String _jspx_template15 = "\"+\"&nbsp;\";\r\n\t        \r\n\t        innerHtml += \"    \t<select id='BJ_CD' name='BJ_CD' class='essential' style='width:80px' >\";\r\n\t        innerHtml +=\"\t ";
  private final static String _jspx_template16 = "\";\r\n\t        innerHtml += \"      \t</select>\";\r\n\t        \r\n\t        innerHtml += \"    &nbsp;\";\r\n\t        innerHtml += \"    \t<select id='HJ_CD' name='HJ_CD' class='essential' style='width:80px' >\";\r\n\t        innerHtml +=\"";
  private final static String _jspx_template17 = "\";\r\n\t        innerHtml += \"    \t</select>\";\r\n\t        \r\n\t\t    innerHtml += \"        &nbsp;/&nbsp;\";\r\n\t\t    innerHtml += \"        \t<select id='SPC_CD' name='SPC_CD' class='essential' style='width:75px' >\";\r\n\t        innerHtml +=\"";
  private final static String _jspx_template18 = "\";\r\n\t        innerHtml += \"    \t</select>\";\r\n\t        innerHtml += \"    \t&nbsp;\";\r\n\t        innerHtml += \"    \t<input type='text' id='BONBUN'  name='BONBUN' class='essential' style='width:30px' maxlength='4' value='\"+BONBUN+\"'>\";\t        \r\n\t        innerHtml += \"- <input type='text' id='BUBUN' name='BUBUN' class='essential' style='width:30px' maxlength='4'value='\"+BUBUN+\"'> &nbsp;번지\";\r\n\t        \r\n\t\t\tinnerHtml += \"\t</td> \"; \r\n\t\t\tinnerHtml += \"</tr>\";\r\n\t\t\tinnerHtml += \"<tr>\t\";\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\tinnerHtml += \"\t<td colspan='3'><input name='SISUL_ADDR2' type='text' class='essential' style='width:300px' onclick='javascript:setSisul_addr1();' value='\"+SISUL_ADDR2+\"'>\";\r\n\t\t\tinnerHtml += \"\t<input name='SISUL_ADDR1' type='hidden' class='essential' style='width:200px' value='\"+SISUL_ADDR1+\"'>\";\r\n\t\t\tinnerHtml += \"\t</td>\";\r\n\t\t\tinnerHtml += \"</tr>\";\r\n\t\t\tinnerHtml += \"</table>\";\r\n\t\t\r\n\t\t\tvar hj_cd =  document.getElementById('HJ_CD').value;\r\n\t\t\tvar bj_cd =  document.getElementById('BJ_CD').value;\r\n\t\t\tvar spc_cd =  document.getElementById('SPC_CD').value;\t\t\t\r\n\t\t\t\r\n\t\t\taddr_fix.innerHTML = innerHtml;\r\n\t\t\t\r\n\t\t\tdocument.getElementById('HJ_CD').value = hj_cd;\r\n\t\t\tdocument.getElementById('BJ_CD').value = bj_cd;\r\n\t\t\tdocument.getElementById('SPC_CD').value = spc_cd;\r\n\t\t\t\r\n\t\t\tparent.iFrameResizeTab(\"tab1\");\t//\t화면 RESIZE\r\n\t\t}\r\n\t//Init();\r\n\tInit_Depth();\r\n\r\n//]]>\r\n</script>\r\n\r\n\r\n<body>\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"UserType\" id=\"UserType\">\r\n<input type=\"hidden\" name=\"UserSection\" id=\"UserSection\">\r\n<input type=\"hidden\" name=\"PURPOSE_CD\" id=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" name=\"MIN_CHECK\" id=\"MIN_CHECK\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" name=\"MIN_PROCESS\" id=\"MIN_PROCESS\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" name=\"GIGAN1\" id=\"GIGAN1\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" name=\"GIGAN2\" id=\"GIGAN2\" value=\"";
  private final static String _jspx_template23 = "\">\r\n<input type=\"hidden\" name=\"MIN_NAME\" id=\"MIN_NAME\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=\"hidden\" name=\"MIN_REQNO\" id=\"MIN_REQNO\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=\"hidden\" name=\"ADMIN_NO\" id=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template26 = "\">\r\n<input type=\"hidden\" name=\"CORP_CD\" id=\"CORP_CD\"  value=\"";
  private final static String _jspx_template27 = "\">\r\n<input type=\"hidden\" name=\"GU_CODE\" id=\"GU_CODE\"  value=\"";
  private final static String _jspx_template28 = "\">\r\n<input type=\"hidden\" name=\"PURPOSE1_NM\" id=\"PURPOSE1_NM\">\r\n<input type=\"hidden\" name=\"PURPOSE2_NM\" id=\"PURPOSE2_NM\">\r\n<input type=\"hidden\" name=\"PURPOSE3_NM\" id=\"PURPOSE3_NM\">\r\n<input type=\"hidden\" name=\"TAX_SET_NM\" id=\"TAX_SET_NM\">\r\n<input type=\"hidden\" name=\"PURPOSESEBU_NM\" id=\"PURPOSESEBU_NM\">\r\n<input type=\"hidden\" name=\"XMLDATA\" id=\"XMLDATA\">\r\n<input type=\"hidden\" name=\"LISTSEQ\" id=\"LISTSEQ\" value=\"\">\r\n\r\n<tr>\r\n\t<td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n   \t\t<tr>\r\n         \t<td height=\"22\" background=\"/img/tab_line_purple.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<ul id=\"tabmenu\">\r\n\t\t\t\t\t<td width=\"111\"><a><img src=\"/img/sub_petition_title9_on.gif\" alt=\"민원정보\" width=\"110\" height=\"22\" border=\"0\" onclick=\"\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t<td width=\"111\"><a><img src=\"/img/sub_petition_title2_off_b.gif\" alt=\"점용인 정보\" width=\"110\" height=\"22\" border=\"0\" onclick=\"\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t<td width=\"111\"><a><img src=\"/img/sub_facility_title3_off.gif\" alt=\"시설물 정보\" width=\"110\" height=\"22\" border=\"0\" onclick=\"Sisul_Click();\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t</ul>\r\n\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\r\n\t\t<tr>\r\n            <td align=\"left\" class=\"contborder_purple\">\r\n\t\r\n\t\t<div id=\"tabcontents\">\r\n\t\t\r\n\t\t\t<div class=\"tabcontent\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\r\n                <tr>\r\n\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수번호</td>\r\n\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"REQ_NO_MIN\" id=\"REQ_NO_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"18\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원구분</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"GUBUN_MIN\" id=\"GUBUN_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수일자</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td><input name=\"REQ_DATE_MIN\" id=\"REQ_DATE_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template29 = "\" ></td>\r\n\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, REQ_DATE_MIN, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리예정일자</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td><input name=\"PREDATE_MIN\" id=\"PREDATE_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template30 = "\" ></td>\r\n\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, PREDATE_MIN, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수부서</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_DEP_MIN\" id=\"REQ_DEP_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template31 = "\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"MANAGE_DEP_MIN\" id=\"MANAGE_DEP_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template32 = "\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_NM_MIN\" id=\"REQ_NM_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"MANAGER_MIN\" id=\"MANAGER_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template33 = "\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원요지</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<input name=\"NOTES_MIN\" id=\"NOTES_MIN\" type=\"text\" class=\"input_form1\" style=\"width:98%\">\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"AGENT_NM_MIN\" id=\"AGENT_NM_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인 연락처</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"min_agent_tel1\" id=\"min_agent_tel1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, min_agent_tel2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_agent_tel2\" id=\"min_agent_tel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, min_agent_tel3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_agent_tel3\" id=\"min_agent_tel3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, min_agent_tel3, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"NAME_MIN\" id=\"NAME_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주민번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"min_ssn1\" id=\"min_ssn1\" type=\"text\" class=\"input_form1\" style=\"width:40px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template34 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, min_ssn2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t\t - <input name=\"min_ssn2\" id=\"min_ssn2\" type=\"text\" class=\"input_form1\" style=\"width:45px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template35 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"7\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 우편번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  \t<td><input name=\"POST_MIN\" id=\"POST_MIN\" type=\"text\" class=\"input_form1\" style=\"width:50px\" value=\"";
  private final static String _jspx_template36 = "\" ></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"ADDR1_MIN\" id=\"ADDR1_MIN\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template37 = "\" >\r\n\t\t\t\t\t\t\t<input name=\"ADDR2_MIN\" id=\"ADDR2_MIN\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template38 = "\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"min_tel1\" id=\"min_tel1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_tel2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_tel2\" id=\"min_tel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_tel3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_tel3\" id=\"min_tel3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_tel3, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 휴대폰</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"min_hp1\" id=\"min_hp1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_hp2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_hp2\" id=\"min_hp2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_hp3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_hp3\" id=\"min_hp3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_hp3, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n                  \t</table></td>\r\n                </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</div>\r\n\t\t\r\n\t\t\t<!--  //********** BEGIN_KANG_20120410 -->\r\n\t\t\t<div class=\"tabcontent\" style=\"display:none\">\r\n\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인(법인명)</td>\r\n\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <td width='130' align='left'><input name=\"NAME\" id=\"NAME\" type=\"text\" class=\"essential\" style=\"width:120px\" value=\"\" readonly /></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td  height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민(법인)번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"jumin_ssn1\"  id=\"jumin_ssn1\"  type=\"text\" class=\"essential\" style=\"width:40px; ime-mode:disabled\" value=\"\"  maxlength=\"6\"  readonly/>\r\n\t\t\t\t\t\t  - <input name=\"jumin_ssn2\"  id=\"jumin_ssn2\"  type=\"text\" class=\"essential\" style=\"width:45px; ime-mode:disabled\"  maxlength=\"7\" value=\"\" readonly />\r\n\t\t\t\t\t\t </td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<!--  //********** BEGIN_KANG_20120409 -->\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지점명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\"><input name=\"OFFICE\"  id=\"OFFICE\"  type=\"text\" class=\"input_form1\" style=\"width:100px\" value=\"\" readonly/></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t<!--   //********** END_KANG_20120409 -->\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대표자명</td>\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"NAME\" id=\"NAME\" type=\"text\" class=\"input_form1\" style=\"width:120px\" readonly/></td>\t\t\t\t\r\n\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"TOPOST_NM\"  id=\"TOPOST_NM\"  type=\"text\" class=\"input_form1\" style=\"width:120px\" readonly/></td>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업자 등록번호</td>\r\n\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_bizssn1\"  id=\"jumin_bizssn1\"  type=\"text\" class=\"input_form1\" value=\"\" style=\"width:30px; ime-mode:disabled\"  maxlength=\"3\" readonly />\r\n\t\t\t\t\t\t  - <input name=\"jumin_bizssn2\"  id=\"jumin_bizssn2\" type=\"text\" class=\"input_form1\" value=\"\" ";
  private final static String _jspx_template39 = "style=\"width:15px; ime-mode:disabled\" maxlength=\"2\" readonly />\r\n\t\t\t\t\t\t  - <input name=\"jumin_bizssn3\"  id=\"jumin_bizssn3\"  type=\"text\" class=\"input_form1\" value=\"\" style=\"width:35px; ime-mode:disabled\" maxlength=\"5\" readonly />\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">                                            \r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"50px\"><input id=\"BON_POST\" name=\"BON_POST\" type=\"text\" style=\"width:50px\" readonly class=\"input_form1\" /></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\t\t\t\t\t  \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<!-- 기본 주소  -->\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"ADDR1\" name=\"ADDR1\" type=\"text\" class=\"essential\" style=\"width:250px\" value=\"";
  private final static String _jspx_template40 = "\" readonly>\r\n\t\t\t\t\t\t\t산<input id=\"SAN\" name=\"SAN\" type=\"checkbox\" style=\"vertical-align: middle;\" readonly >\r\n\t\t\t\t\t\t\t<input id=\"BON\" name=\"BON\" type=\"text\" class=\"essential\" style=\"width:25px\" value=\"";
  private final static String _jspx_template41 = "\" readonly/>\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"BU\" name=\"BU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" value=\"";
  private final static String _jspx_template42 = "\" readonly/>\r\n\t\t\t\t\t\t\t<input id=\"ADDR2\" name=\"ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:135px\" value=\"";
  private final static String _jspx_template43 = "\"  maxlength=\"50\" readonly/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t<!-- 도로명주소 -->\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"SI\" name=\"SI\" type=\"hidden\" value=\"\" readonly>\r\n\t\t\t\t\t\t\t<input id=\"GUN\" name=\"GUN\" type=\"hidden\" value=\"\" readonly>\r\n\t\t\t\t\t\t\t<input id=\"DORO_NM\" name=\"DORO_NM\" type=\"hidden\" value=\"\" readonly>\r\n\t\t\t\t\t\t\t<input type=\"hidden\" id=\"DONG\" name=\"DONG\" readonly />\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<input id=\"ADDR1_NEW\" name=\"ADDR1_NEW\" type=\"text\" class=\"essential\" style=\"width:250px\" readonly/>\r\n\t\t\t\t\t\t\t<input id=\"BD_BON\" name=\"BD_BON\" type=\"text\" class=\"essential\" style=\"width:25px\" readonly/>\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"BD_BU\" name=\"BD_BU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" readonly/>\r\n\t\t\t\r\n\t\t\t\t\t\t\t<input id=\"BD_NM\" name=\"BD_NM\" type=\"text\" class=\"input_form1\" style=\"width:135px\" maxlength=\"50\" readonly/>\r\n\t\t\t\t\t\t\t<input id=\"BD_DET_NM\" name=\"BD_DET_NM\" type=\"text\" class=\"input_form1\" style=\"width:214px\" maxlength=\"50\" readonly/>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n \r\n \r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">업태</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"BIZ_STATUS\"  id=\"BIZ_STATUS\"  type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"\" readonly/></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">종목</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"BIZ_TYPES\"  id=\"BIZ_TYPES\"  type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"\" readonly/></td>\t\t\t\t\r\n\t\t\t\t  \t</tr>\t\t\t\t\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t \t<td><span class=\"sub_stan_blue\">* 우편물 송달지</span>  </td>\r\n\t\t\t\t\t\t\t  \t<td width=\"16\"></td>\r\n\t\t\t\t\t\t\t  \t<td></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<!-- 송달지 주소 -->\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"  colspan=\"3\">\r\n\t\t\t\t\t\t\t<table  width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"50px\"><input id=\"TO_POST\" name=\"TO_POST\" type=\"text\" style=\"width:50px\" value=\"\" readonly class=\"input_form1\"/></td>  \r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"TOADDR1\" name=\"TOADDR1\" type=\"text\" class=\"essential\" style=\"width:250px\" value=\"";
  private final static String _jspx_template44 = "\" readonly/>\r\n\t\t\t\t\t\t\t산<input id=\"TOSAN\" name=\"TOSAN\" type=\"checkbox\" style=\"vertical-align: middle;\" readonly/>\r\n\t\t\t\t\t\t\t<input id=\"TOBON\" name=\"TOBON\" type=\"text\" class=\"essential\" style=\"width:25px\" value=\"";
  private final static String _jspx_template45 = "\" readonly/>\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"TOBU\" name=\"TOBU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" value=\"";
  private final static String _jspx_template46 = "\" readonly/>\r\n\t\t\t\t\t\t\t<input id=\"TOADDR2\" name=\"TOADDR2\" type=\"text\" class=\"input_form1\" style=\"width:135px\" value=\"";
  private final static String _jspx_template47 = "\" maxlength=\"50\" readonly/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t<!-- 송달지 도로명주소 -->\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 도로명주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t<input id=\"TOADDR1_NEW\" name=\"TOADDR1_NEW\" type=\"text\" class=\"essential\" style=\"width:250px\" value=\"";
  private final static String _jspx_template48 = "\" readonly/>\r\n\t\t\t\t\t\t\t<input id=\"TOBON_NEW\" name=\"TOBON_NEW\" type=\"text\" class=\"essential\" style=\"width:25px\" value=\"";
  private final static String _jspx_template49 = "\" readonly />\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"TOBU_NEW\" name=\"TOBU_NEW\" type=\"text\" class=\"input_form1\" style=\"width:25px\" value=\"";
  private final static String _jspx_template50 = "\" readonly/>\r\n\t\t\t\t\t\t\t<input id=\"TOADDR2_NEW\" name=\"TOADDR2_NEW\" type=\"text\" class=\"input_form1\" style=\"width:135px\" value=\"";
  private final static String _jspx_template51 = "\"  maxlength=\"50\" readonly/>\r\n\t\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t\t<input id=\"TOSI\" name=\"TOSI\" type=\"hidden\" readonly/>\r\n\t\t\t\t\t\t\t<input id=\"TOGUN\" name=\"TOGUN\" type=\"hidden\" readonly/>\r\n\t\t\t\t\t\t\t<input id=\"TO_DORO_NM\" name=\"TO_DORO_NM\" type=\"hidden\" readonly/>\r\n\t\t\t\t\t\t\t<input type=\"hidden\" id=\"TODONG\" name=\"TODONG\" readonly/>\r\n\t\t\t\t\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\t\t\t\t<input id=\"TOADDR1_NEW\" name=\"TOADDR1_NEW\" type=\"text\" class=\"essential\" style=\"width:250px\" value=\"";
  // jsp code [from=(568,14);to=(572,10)]
  private final static String _jspx_template52 = "\" readonly>\r\n\t\t\t\t\t\t\t<input id=\"TO_BD_BON\" name=\"TO_BD_BON\" type=\"text\" class=\"essential\" style=\"width:25px\" readonly/>\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"TO_BD_BU\" name=\"TO_BD_BU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" readonly/>\t\t\r\n\t\t\t\t\t\t\t<input id=\"TO_BD_NM\" name=\"TO_BD_NM\" type=\"text\" class=\"input_form1\" style=\"width:135px\" maxlength=\"50\" readonly/>\r\n\t\t\t\t\t\t\t<input id=\"TO_BD_DET_NM\" name=\"TO_BD_DET_NM\" type=\"text\" class=\"input_form1\" style=\"width:214px\" maxlength=\"50\" readonly/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\r\n\t\t\t\t  \t</tr>\r\n\r\n\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  \t<td><span class=\"sub_stan_blue\">* 담당자 정보</span></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120409 -->\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지점명/담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" height=\"25\">\r\n\t\t\t\t\t\t\t<input name=\"OFFICE\"  id=\"OFFICE\"  type=\"text\" class=\"input_form1\" style=\"width:100px\" value=\"\" readonly/>\r\n\t\t\t\t\t\t\t/ <input name=\"MANAGER\"  id=\"MANAGER\"  type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"\" readonly/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" height=\"25\">\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<input name=\"MANAGER\"  id=\"MANAGER\"  type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"\" readonly/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<!--   //********** END_KANG_20120409 -->\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_tel1\"  id=\"jumin_tel1\"  type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\"  maxlength=\"3\" value=\"\" readonly/> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_tel2\"  id=\"jumin_tel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" value=\"\" readonly/> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_tel3\"  id=\"jumin_tel3\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" value=\"\" readonly/>\r\n\t\t\t\t\t\t\t&nbsp;&nbsp;(&nbsp;내선&nbsp;<input name=\"TEL_EXT\"  id=\"TEL_EXT\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" value=\"\" readonly/>&nbsp;)\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">FAX</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_fax1\"  id=\"jumin_fax1\"  type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" maxlength=\"3\" readonly/> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_fax2\"  id=\"jumin_fax2\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" readonly/> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_fax3\"  id=\"jumin_fax3\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" readonly/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_hp1\"  id=\"jumin_hp1\"  type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" maxlength=\"3\" readonly/> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_hp2\"  id=\"jumin_hp2\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" maxlength=\"4\" readonly/> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_hp3\" id=\"jumin_hp3\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" readonly/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t<table width=\"100%\" border=\"0\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t    <tr>\r\n\t\t\t\t\t<td class=\"sub_stan\" height='25' align='right' valign='bottom'>\r\n\t\t\t\t\t\t<font color='red' size='2'>※ 하단에 기존점용정보에서 선택을 누르면 입력됩니다.</font>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n                  \t</table>\r\n\t\t\t</div>\r\n\t\t\t<!--   //********** END_KANG";
  // jsp code [from=(568,14);to=(572,10)]
  private final static String _jspx_template53 = "_20120410 -->\r\n\t\t\t\r\n\t\t\t<div class=\"tabcontent\" style=\"display:none\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100%\" colspan=\"7\">\r\n\t\t\t\t\t\t\t<div id=\"blist\"></div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"30\" align=\"center\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n\t\t\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"TYPE\" id=\"TYPE\" value=\"1\">도로\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"SECTION\" id=\"SECTION\" value=\"1\">계속\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소유자</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select name=\"OWNER_SET\" id=\"OWNER_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select name=\"TAX_SET\" id=\"TAX_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" ><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"25\" src=\"/jsp/common/purposeCode/purposeCode.jsp?SectionCode=4&PURPOSE_CD=000&essential=1\"></iframe>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">상세시설물</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<select name=\"PURPOSESEBU_CD\" id=\"PURPOSESEBU_CD\" class=\"input_form1\" style=\"width:120px\"></select>\r\n\t\t\t\t\t\t\t\t</td>             \r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">규격</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"STANDARD\" id=\"STANDARD\" type=\"text\" class=\"input_form1\" style=\"width:140px\" maxlength=\"12\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr> \r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수량(연장)</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"QUANTITY\" id=\"QUANTITY\" type=\"text\" class=\"essential\" style=\"width:140px\" maxlength=\"11\" onKeyUp=\"nr_num_float(this);\" > 개(또는 m)\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">심도(감액적용)</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"DEPTH_CK\" id=\"DEPTH_CK\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onKeyUp=\"Select_Depth(); nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"3\">&nbspm &nbsp&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"DEPTH_NUM\" id=\"DEPTH_NUM\" type=\"text\" class=\"input_form1\" style=\"width:50px\" > %\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"MUL_FROMDATE\" id=\"MUL_FROMDATE\" type=\"text\" class=\"essential\" style=\"width:70px\" ><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t\t\t\t\t~ <input name=\"MUL_TODATE\" id=\"MUL_TODATE\" type=\"text\" class=\"essential\" style=\"width:70px\" ><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, MUL_TODATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<tr style=\"display:none\" id=\"UseSection\">\r\n\t\t\t\t\t\t\t\t\t<td>일시점용<input name=\"PARTLY_PERIOD\" id=\"PARTLY_PERIOD\" type=\"text\" class=\"essential\" style=\"width:300px\">\r\n\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;총<input name=\"TOTAL_PERIOD\" id=\"TOTAL_PERIOD\" type=\"text\" class=\"essential\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\">일</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><span class=\"sub_stan_blue\">* 시설물 주소</span></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대표 주소</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<div id=\"addr_fix\">\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\"> \r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><input name=\"SISUL_POST\" id=\"SISUL_POST\" type=\"text\" class=\"essential\" style=\"width:50px\" onFocus=\"\" ></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"jav";
  private final static String _jspx_template57 = "ascript:openZipcodePopup_new('form.SISUL_POST','','','','','','','','','');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t \t";
  private final static String _jspx_template58 = "&nbsp;\r\n\t\t\t                    \t\r\n\t\t\t\t\t                            \t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"essential\" style=\"width:80px\" >\r\n\t\t\t\t\t                                \t";
  private final static String _jspx_template59 = "\r\n\t\t\t\t\t                              \t</select>\r\n\t\t\t\t                                \r\n\t\t\t\t                                &nbsp;\r\n\t\t\t\t                                \t<select id=\"HJ_CD\" name=\"HJ_CD\" class=\"essential\" style=\"width:80px\" >\r\n\t\t\t\t                                   \t\t";
  private final static String _jspx_template60 = "\r\n\t\t\t\t                                \t</select>\r\n\t\t\t\t                                \r\n\t\t\t\t                 \t            &nbsp;/&nbsp;\r\n\t\t\t\t                 \t            \t<select id=\"SPC_CD\" name=\"SPC_CD\" class=\"essential\" style=\"width:75px\"  onChange =\"javascript:setSisul_addr1();\">\r\n\t\t\t\t                                   \t\t";
  private final static String _jspx_template61 = "\r\n\t\t\t\t                                \t</select>\r\n\t\t\t\t                                \t&nbsp;\r\n\t\t\t\t                                \t<input type='text' id=\"BONBUN\"  name=\"BONBUN\" class=\"essential\" style=\"width:30px\" maxlength=\"4\"> - <input type='text' id=\"BUBUN\" name=\"BUBUN\" class=\"essential\" style=\"width:30px\" maxlength=\"4\"> &nbsp;번지 \r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>  \r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td colspan='3'><input name=\"SISUL_ADDR1\" id=\"SISUL_ADDR1\" type=\"text\" class=\"essential\" style=\"width:200px\" disabled>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"SISUL_ADDR2\" id=\"SISUL_ADDR2\" type=\"text\" class=\"essential\" style=\"width:300px\" \t>\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr> \r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><span class=\"sub_stan_blue\">* 공사(굴착) 정보</span></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사기간 </td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"WORK_FROMDATE\" id=\"WORK_FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:65px\" ></td>\r\n\t\t\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, WORK_FROMDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"WORK_TODATE\" id=\"WORK_TODATE\" type=\"text\" class=\"input_form1\" style=\"width:65px\" ></td>\r\n\t\t\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, WORK_TODATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">준공년월일</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"COMPLETION_DATE\" id=\"COMPLETION_DATE\" type=\"text\" class=\"input_form1\" style=\"width:65px\" ></td>\r\n\t\t\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, COMPLETION_DATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사내용</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"EXE_INFO\" id=\"EXE_INFO\" type=\"text\" class=\"input_form1\" style=\"width:98%\">\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t<table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<img src=\"/img/add_icon2.gif\" alt=\"추가\" border=\"0\" onClick='javascript:New_Sisul_Register()' style=\"CURSOR:hand\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t</table>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t\t</td>\r\n\t\t</tr>\r\n \t\r\n \t\r\n\t</table></td>\r\n\t</tr>\r\n</form>\r\n</table>\r\n</body>\r\n</html>\r\n";
}
