package jeus_jspwork._jsp._facility._minwon._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_saewol_5fregister_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template15);
      out.write(_jspx_template16);
      // jsp code [from=(396,22);to=(396,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(399,26);to=(399,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(404,24);to=(404,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(409,24);to=(409,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(513,65);to=(513,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(514,63);to=(514,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_CHECK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(515,67);to=(515,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_PROCESS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(516,57);to=(516,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(517,57);to=(517,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(518,61);to=(518,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(519,63);to=(519,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_REQNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(520,61);to=(520,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(521,61);to=(521,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(522,60);to=(522,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(558,164);to=(558,174)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_NO_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(560,150);to=(560,159)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GUBUN_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(567,118);to=(567,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_DATE_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(574,116);to=(574,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PREDATE_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(582,154);to=(582,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_DEP_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(584,160);to=(584,174)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGE_DEP_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(589,152);to=(589,162)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_NM_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(591,154);to=(591,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGER_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(596,107);to=(596,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NOTES_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(602,156);to=(602,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AGENT_NM_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(604,158);to=(604,171)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AGENT_TEL_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(608,149);to=(608,157)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(611,122);to=(611,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_ssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(612,125);to=(612,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_ssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(618,112);to=(618,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POST_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(624,108);to=(624,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR1_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(625,108);to=(625,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR2_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(630,146);to=(630,153)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TEL_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(632,144);to=(632,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HP_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(782,14);to=(786,10)]
      out.write(_jspx_template49);
      // jsp code [from=(782,14);to=(786,10)]
      out.write(_jspx_template50);
      // jsp code [from=(782,14);to=(786,10)]
      out.write(_jspx_template51);
      out.write(_jspx_template52);
      // jsp code [from=(793,11);to=(793,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_owner_Group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(797,11);to=(797,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      out.write(_jspx_template55);
      // jsp code [from=(871,17);to=(871,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(874,41);to=(874,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(879,44);to=(879,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(884,44);to=(884,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);

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
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/facility/minwon/tab/info_sisul_register.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t\r\n\t\r\n\tvar dept = [];\r\n\r\n//\tfunction\tInit()\r\n//\t{\t\t\r\n//\t\tparent.iFrameResizeTab(\"tab1\");\t\r\n//\t\tIFRM_PurposeCode.PURPOSE_CD.className\t= \"essential\";\r\n//\t}\r\n\t\r\n\tfunction\tSisul_Click()\r\n\t{\t\r\n\t\tif(document.getElementById(\"XMLDATA\").value\t== \"\")\r\n\t\t{\r\n\t\t\tSisul_Init();\r\n\t\t\tSisul_Init_UseType();\r\n\t\t}\r\n\t}\r\n\t\r\n\t//\t심도\r\n\tfunction\tInit_Depth()\r\n\t{\r\n\t\t";
  private final static String _jspx_template10 = "\r\n\t\t\tdept[";
  private final static String _jspx_template11 = "] = { depth: ";
  private final static String _jspx_template12 = ", rate: ";
  private final static String _jspx_template13 = "};\r\n\t\t";
  private final static String _jspx_template14 = "\r\n\t}\r\n\r\n\tfunction\tSelect_Depth()\r\n\t{\r\n\t\tvar\tnum\t= document.getElementById(\"DEPTH_CK\").value;\r\n\t\t\r\n\t\tfor(var i=0; i < dept.length ; i++)\r\n\t\t{\r\n\t\t\tif(num >= dept[i].depth)\r\n\t\t\t{\r\n\t\t\t\tdocument.getElementById(\"DEPTH_NUM\").value\t= dept[i].rate;\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(num == \"\")\r\n\t\t\tdocument.getElementById(\"DEPTH_NUM\").value\t= \"\";\r\n\t\telse\r\n\t\t\tdocument.getElementById(\"DEPTH_NUM\").value\t= \"0\";\r\n\t}\r\n\t\r\n\t//Init();\r\n\tInit_Depth();\r\n\t\r\n\t// getElementsByClassName\r\n\tfunction getElementsByClassName(clsName,parentNode) {\r\n\t\tvar arr = new Array();\r\n\t\tvar elems;\r\n\t\t\r\n\t\tif (parentNode == null) {\r\n\t\t\telems = document.getElementsByTagName(\"*\");\r\n\t\t} else {\r\n\t\t\telems = parentNode.getElementsByTagName(\"*\");\r\n\t\t}\r\n\t\tfor ( var cls, i = 0; ( elem = elems[i] ); i++ ) {\r\n\t\t\tif ( elem.className == clsName ) {\r\n\t\t\t\tarr[arr.length] = elem;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn arr;\r\n\t}\r\n\tfunction tabDisplay(tab,content,num,type) {\r\n\t\tfor (var i=0; i<content.length; i++) {\r\n\t\t\tvar tab_off = tab[i].childNodes[0].getAttribute('src').replace(/_on|_off|_chk/i,'_off');\r\n\t\t\tvar tab_on = tab[num].getElementsByTagName('img')[0].getAttribute('src').replace(/_on|_off|_chk/i,'_off');\r\n\t\t\tvar tab_chk = tab[num].getElementsByTagName('img')[0].getAttribute('src').replace(/_on|_off|_chk/i,'_on');\r\n\t\t\ttab[i].getElementsByTagName('img')[0].setAttribute('src',tab_off);\r\n\t\t\ttab[num].getElementsByTagName('img')[0].setAttribute('src',tab_chk);\r\n\t\t\tcontent[i].style.display = 'none';\r\n\t\t\tcontent[num].style.display = 'block';\r\n\r\n\t\t\tparent.iFrameResizeTab(\"tab1\");\t//\t화면 RESIZE\r\n\t\t}\r\n\t}\r\n\tfunction tabAct(tab,content,num,type) {\r\n\t\ttab[num].onclick = function() {\r\n\t\t\ttabDisplay(tab,content,num);\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\tif (type == true) {\r\n\t\t\tvar tabimg = tab[num].getElementsByTagName('img')[0];\r\n\t\t\tvar tab_off = tabimg.getAttribute('src').replace(/_on|_off|_chk/i,'_on');\r\n\t\t\tvar tab_on = tabimg.getAttribute('src').replace(/_on|_off|_chk/i,'_off');\r\n\t\t\ttab[num].onmouseover = function() {\r\n\t\t\t\tif (tabimg.getAttribute('src').indexOf('_on') == -1) {\r\n\t\t\t\t\ttabimg.setAttribute('src',tab_on);\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\ttab[num].onmouseout = function() {\r\n\t\t\t\tif (tabimg.getAttribute('src').indexOf('_on') != -1) {\r\n\t\t\t\t\ttabimg.setAttribute('src',tab_off);\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\twindow.onload = tabMenu;\r\n\tfunction tabMenu() {\r\n\t\tvar tabs = document.getElementById('tabmenu');\r\n\t\tvar tab = tabs.getElementsByTagName('a'); // 탭 요소\r\n\t\tvar contents = document.getElementById('tabcontents');\r\n\t\tvar content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class\r\n\t\tvar type = true; // 롤오버의 true / false\r\n\t\tfor (var i=0; i<tab.length; i++) {\r\n\t\t\ttabDisplay(tab,content,0,true);\r\n\t\t\ttabAct(tab,content,i,type);\r\n\t\t}\r\n\t}\r\n\r\n\tfunction\tRegisterPrc()\r\n\t{\r\n\t\tvar\tresult\t= DataCheck();\r\n\r\n\t\tif(result\t==\tfalse)\r\n\t\t\treturn false;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tform.PURPOSE_CD.value\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE_CD\").value;\r\n\r\n\t\tform.action = \"saewol_registerprc.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\r\n\tfunction\tSelect_UseSection(sel)\r\n\t{\r\n\t\tif(sel.value == '1')\r\n\t\t\tdocument.getElementById(\"UseSection\").style.display = \"block\";\r\n\t\telse\r\n\t\t\tdocument.getElementById(\"UseSection\").style.display = \"none\";\r\n\t}\r\n\r\n\tfunction\tJumin_toaddr_Check()\r\n\t{\r\n\t\tvar form \t\t=\tdocument.form;\r\n\t\tvar\tchk\t\t\t=\tform.ADDR_CHECK.checked;\r\n\r\n\t\tif(chk\t== true)\r\n\t\t{\r\n\t\t\tform.TO_POST.value\t\t= \tform.BON_POST.value;\r\n\t\t\tform.TO_ADDR1.value\t\t= \tform.BON_ADDR1.value;\r\n\t\t\tform.TO_ADDR2.value\t\t= \tform.BON_ADDR2.value;\r\n\t\t\tform.ADDR_CHECK.value\t=\t\"1\";\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tform.TO_POST.value\t\t=\t\"\";\r\n\t\t\tform.TO_ADDR1.value\t\t=\t\"\";\r\n\t\t\tform.TO_ADDR2.value\t\t=\t\"\";\r\n\t\t\tform.ADDR_CHECK.value\t=\t\"0\";\r\n\t\t}\r\n\t}\r\n\t\r\n\t\tfunction\tSelect_UseType(sel)\r\n\t{\r\n//\t\tvar idx = sel.selectedIndex;\r\n\t\t\t\r\n\t\tdocument.getElementById(\"UseType1\").style.display = \"none\";\r\n\t\tdocument.getElementById(\"UseType2\").style.display = \"none\";\r\n\t\t\r\n\t\tif(sel.value == '2' || sel.value == '3')\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"하천/구거명\";\r\n\t\t\tdocu";
  private final static String _jspx_template15 = "ment.getElementById(\"UseType2\").style.display \t= \"block\";\t//\t하천, 구거\r\n\t\t}\r\n\t\telse if(sel.value == '1')\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"주차면수\";\r\n\t\t\tdocument.getElementById(\"UseType1\").style.display \t= \"block\";\t//\t도로\r\n\t\t}\r\n\t\telse\r\n\t\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"\";\r\n\t\t\r\n\t//\telse if(sel.value == '4')\t\t\t\t\t\t//\t노점\r\n\t//\t\tdocument.getElementById(\"UseType1\").style.display = \"block\";\r\n\r\n\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode.jsp?SectionCode=\" + sel.value + \"&essential=1\";\r\n\t}\t\r\n\r\n\tfunction\tSelect_UseSection(sel)\r\n\t{\r\n\t\tif(sel.value == '1')\r\n\t\t\tdocument.getElementById(\"UseSection\").style.display = \"block\";\t//\t정기\r\n\t\telse\r\n\t\t\tdocument.getElementById(\"UseSection\").style.display = \"none\";\r\n\r\n\t\tparent.iFrameResizeTab(\"tab1\");\t//\t화면 RESIZE\r\n\t}\r\n\r\n\tfunction \topenZipcodePopup(post, addr)\r\n\t{\r\n\t\tvar\tpost1\t= post;\r\n\t\tvar\taddr1\t= addr;\r\n\r\n\t\tvar url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1;\r\n\t\tvar winName = \"우편번호입력\";\r\n\t\tvar width \t= 420;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t}\r\n\r\n\tfunction\tDataCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n\t\tvar tabs = document.getElementById('tabmenu');\r\n\t\tvar tab = tabs.getElementsByTagName('a'); // 탭 요소\r\n\t\tvar contents = document.getElementById('tabcontents');\r\n\t\tvar content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class\r\n\t\r\n\t\t//\t점용인 정보\r\n\t\tif(form.NAME.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용인(법인명)을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\ttabDisplay(tab,content,1);\r\n\t\t\topenCorpcodePopup('form.NAME','form.OFFICE','form.CORP_CD');\r\n\t\t\t//form.CORP_NM.focus();\r\n\t\t}\r\n\t\telse if(form.jumin_ssn1.value.length\t< 6)\r\n\t\t{\r\n\t\t\tstr\t+= \"주민(법인)번호가 입력되지 않았거나\\n자리수가 틀립니다.\";\t\r\n\t\t\talert(str);\r\n\t\t\ttabDisplay(tab,content,1);\r\n\t\t\tform.jumin_ssn1.focus();\r\n\t\t}\r\n\t\telse if(form.jumin_ssn2.value.length\t< 7)\r\n\t\t{\r\n\t\t\tstr\t+= \"주민(법인)번호가 입력되지 않았거나\\n자리수가 틀립니다.\";\t\r\n\t\t\talert(str);\r\n\t\t\ttabDisplay(tab,content,1);\r\n\t\t\tform.jumin_ssn2.focus();\r\n\t\t}\r\n\t\telse if(form.BON_POST.value.length\t< 1){\r\n\t\t\tstr\t+= \"점용인 우편번호를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\ttabDisplay(tab,content,1);\r\n\t\t\t//form.BON_POST.focus();\r\n\t\t\topenZipcodePopup('form.BON_POST', 'form.BON_ADDR1');\r\n\t\t}\r\n\t\telse if(form.BON_ADDR2.value.length\t< 1){\r\n\t\t\tstr\t+= \"점용인 상세 주소를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\ttabDisplay(tab,content,1);\r\n\t\t\tform.BON_ADDR2.focus();\r\n\t\t}\r\n\t\telse if(form.XMLDATA.value.length < 10)\r\n\t\t{\r\n\t\t\tstr\t+= \"시설물 정보는 1개이상 등록해야 합니다.\\n\";\r\n\t\t\talert(str);\r\n\t\t\ttabDisplay(tab,content,2);\r\n\t\t\tform.OWNER_SET.focus();\r\n\t\t}\r\n\t\t\r\n\t\t\r\n\t\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\t\treturn\tfalse;\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\tfunction selectTabMenu(){\r\n\t\t\r\n\t\tvar tabs = document.getElementById('tabmenu');\r\n\t\tvar tab = tabs.getElementsByTagName('a'); // 탭 요소\t\r\n\t\tvar contents = document.getElementById('tabcontents');\r\n\t\tvar content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class\r\n\t\tvar type = true; // 롤오버의 true / false\t\t\r\n\t\ttabDisplay(tab,content,1,true);\r\n\t\ttabAct(tab,content,1,type);\t\t\r\n\t}\r\n\t\r\n\t\r\n\t/*\r\n\r\n\tajax 함수\r\n\r\n\t*/\t\r\n\t\tfunction setSisul_addr1(){\r\n\r\n\t//\talert('실행'+document.getElementById('bj_cd').value );\r\n\t\t\r\n\t\t\tvar param = \"&bj_cd=\"+document.getElementById('bj_cd').value; \r\n\r\n\t\t\tsendRequest(\"/facility/minwon/get_ajax_refdongname.do\", param, \"GET\", ResultSisulAddr1);\r\n\t\t}\r\n\r\n\t\tfunction\tResultSisulAddr1(obj)\r\n\t\t{\r\n\t\t\t\r\n\t\t\t  var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n\r\n\t\t\t  xmldoc.async\t= false;\r\n\t\t\t  \r\n\t\t\t  xmldoc.loadXML(obj);\r\n\t\t\t  \r\n\t\t\t  \r\n\t\t\t  \r\n\t\t\t  if(xmldoc.getElementsByTagName(\"SISUL_ADDR1\").length >0 && xmldoc.getElementsByTagName(\"SISUL_ADDR1\").item(0).firstChild != null)  document.getElementById(\"SISUL_ADDR1\").value \t  = xmldoc.getElementsByTagName(\"SISUL_ADDR1\").item(0).firstChild.nodeValue;\t\t\t \t\t    \r\n\t\t\t  else document.getElementById(\"SISUL_ADDR1\").value = \"\";  \r\n\r\n\t\t}\r\n\r\n\tfunction\tNew_Sisul_Register()\r\n\t{";
  private final static String _jspx_template16 = "\r\n\t\t\r\n\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\tvar\tvalue;\r\n\t\tvar\tresult\t= Sisul_DataCheck();\r\n\r\n\t\tif(result\t==\tfalse)\r\n\t\t\treturn;\r\n\t\tform.PURPOSE_CD.value\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE_CD\").value;\t\r\n\t\tvalue\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE1\");\r\n\t\tform.PURPOSE1_NM.value\t= value[value.selectedIndex].text;\r\n\t\tvalue\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE2\");\r\n\t\tform.PURPOSE2_NM.value\t= value[value.selectedIndex].text;\r\n\t\tvalue\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE3\");\r\n\t\tform.PURPOSE3_NM.value\t= value[value.selectedIndex].text;\r\n\r\n\t\tinsertNode();\t//\t노드에 추가\r\n\t\t//Clear();\r\n\t\tmakeList();\r\n\t\t\r\n\t\tvar addr_fix = document.getElementById(\"addr_fix\");\r\n\t\tvar SISUL_POST = form.SISUL_POST.value;\r\n\t\tvar SISUL_ADDR1 = form.SISUL_ADDR1.value;\r\n\t\tvar SISUL_ADDR2 = form.SISUL_ADDR2.value;\r\n\t\tvar BONBUN = form.BONBUN.value;\r\n\t\tvar BUBUN = form.BUBUN.value;\r\n\t\r\n\t\t\r\n\t\tvar innerHtml =\t\"<table border='0' cellpadding='0' cellspacing='0' class='sub_stan'>\"; \r\n\t\tinnerHtml += \"<tr>\";\r\n\t\tinnerHtml += \"\t<td><input name='SISUL_POST' id='SISUL_POST' type='text' class='essential' style='width:50px' onFocus='' value='\"+SISUL_POST+\"' readonly></td>\";\r\n\t\tinnerHtml += \"\t<td><a href='javascript:openZipcodePopup('form.SISUL_POST', '');'><img src='/img/search_icon.gif' alt='검색' width='56' height='18' border='0'></a></td>\";\r\n\t\tinnerHtml += \"\t<td bgcolor='eaeaea' class='table_bl_left'>\";\r\n\t\t\t\r\n\t\tinnerHtml += \t \t\"";
  private final static String _jspx_template17 = "\"+\"&nbsp;\";\r\n        \r\n        innerHtml += \"    \t<select id='BJ_CD' name='BJ_CD' class='essential' style='width:80px' >\";\r\n        innerHtml +=\"\t ";
  private final static String _jspx_template18 = "\";\r\n        innerHtml += \"      \t</select>\";\r\n        \r\n        innerHtml += \"    &nbsp;\";\r\n        innerHtml += \"    \t<select id='HJ_CD' name='HJ_CD' class='essential' style='width:80px' >\";\r\n        innerHtml +=\"";
  private final static String _jspx_template19 = "\";\r\n        innerHtml += \"    \t</select>\";\r\n        \r\n\t    innerHtml += \"        &nbsp;/&nbsp;\";\r\n\t    innerHtml += \"        \t<select id='SPC_CD' name='SPC_CD' class='essential' style='width:75px' >\";\r\n        innerHtml +=\"";
  private final static String _jspx_template20 = "\";\r\n        innerHtml += \"    \t</select>\";\r\n        innerHtml += \"    \t&nbsp;\";\r\n        innerHtml += \"    \t<input type='text' id='BONBUN'  name='BONBUN' class='essential' style='width:30px' maxlength='4' value='\"+BONBUN+\"'>\";\t        \r\n        innerHtml += \"- <input type='text' id='BUBUN' name='BUBUN' class='essential' style='width:30px' maxlength='4'value='\"+BUBUN+\"'> &nbsp;번지\";\r\n        \r\n\t\tinnerHtml += \"\t</td> \"; \r\n\t\tinnerHtml += \"</tr>\";\r\n\t\tinnerHtml += \"<tr>\t\";\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\tinnerHtml += \"\t<td colspan='3'><input name='SISUL_ADDR2' id='SISUL_ADDR2' type='text' class='essential' style='width:300px' onclick='javascript:setSisul_addr1();' value='\"+SISUL_ADDR2+\"'>\";\r\n\t\tinnerHtml += \"\t<input name='SISUL_ADDR1' id='SISUL_ADDR1' type='hidden' class='essential' style='width:200px' value='\"+SISUL_ADDR1+\"'>\";\r\n\t\tinnerHtml += \"\t</td>\";\r\n\t\tinnerHtml += \"</tr>\";\r\n\t\tinnerHtml += \"</table>\";\r\n\t\r\n\t\tvar hj_cd =  document.getElementById('HJ_CD').value;\r\n\t\tvar bj_cd =  document.getElementById('BJ_CD').value;\r\n\t\tvar spc_cd =  document.getElementById('SPC_CD').value;\t\t\t\r\n\t\t\r\n\t\taddr_fix.innerHTML = innerHtml;\r\n\t\t\r\n\t\tdocument.getElementById('HJ_CD').value = hj_cd;\r\n\t\t document.getElementById('BJ_CD').value = bj_cd;\r\n\t\t document.getElementById('SPC_CD').value = spc_cd;\r\n\t\t\r\n\t\tparent.iFrameResizeTab(\"tab1\");\t//\t화면 RESIZE\r\n\t}\r\n\t\r\n\t\r\n\tfunction\tInit()\r\n\t{\r\n\t\tparent.iFrameResizeTab(\"tab1\");\r\n\t//\tIFRM_PurposeCode.PURPOSE_CD.className\t= \"essential\";\r\n\t}\r\n\t\r\n\t\r\n\t//삽입시작 2009.06.04 전승원\r\n\tfunction \topenCorpcodePopup(corpNm, office, corpCd)\t//corpNm : 법인명, office : 지점명, corpCd : 코드값\r\n\t{\r\n\t\tvar\toffice1\t= corpNm;\r\n\t\tvar\tjijum1\t= office;\r\n\t\tvar\tcode1\t= corpCd;\r\n\t\t\r\n\t\tvar url \t= \"/corpcode.do?openerCorpNm=\" + office1 + \"&openerOffice=\" + jijum1 + \"&openerCorpCd=\" + code1;\r\n\t\tvar winName = \"점용업체입력\";\r\n\t\tvar width \t= 420;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t}\r\n\t\r\n\t//삽입시작 2009.07.06 전승원\r\n\tfunction \tminusFacilityPopup(corp_cd, gu_code, purpose_cd)\t//corp_cd : 법인명, gu_code : 지점명, purpose_cd : 코드값\r\n\t{\r\n\t\tvar\tcorp_cd\t= corp_cd;\r\n\t\tvar\tgu_code\t= gu_code;\r\n\t\tvar\tpurpose_cd\t= purpose_cd;\r\n\t\t\r\n\t\tvar url \t= \"/corpcode.do?corp_cd=\" + corp_cd + \"&gu_code=\" + gu_code + \"&purpose_cd=\" + purpose_cd;\r\n\t\tvar winName = \"점용업체입력\";\r\n\t\tvar width \t= 420;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t}\r\n\t\r\n\tfunction\tJumin_toaddr_Check2()\r\n\t{\r\n\t\tvar form \t\t=\tdocument.form;\r\n\t\tvar\tchk\t\t\t=\tform.ADDR_CHECK.checked;\r\n\t\tvar addr_check \t=\tdocument.getElementById(\"ADDR_CHECK\");\r\n\t\t\r\n\t\tif(chk\t== true)\r\n\t\t{\r\n\t\t\tform.TO_POST.value\t\t=\tform.BON_POST.value;\r\n\t\t\tform.TO_ADDR1.value\t\t=\tform.BON_ADDR1.value;\r\n\t\t\tform.TO_ADDR2.value\t\t=\tform.BON_ADDR2.value;\r\n\t\t\tform.ADDR_CHECK.value\t=\t\"1\";\r\n\t\t}\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n\r\n<body>\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"UserType\" id=\"UserType\">\r\n<input type=\"hidden\" name=\"UserSection\" id=\"UserSection\">\r\n<input type=\"hidden\" name=\"PURPOSE_CD\" id=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" name=\"MIN_CHECK\" id=\"MIN_CHECK\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" name=\"MIN_PROCESS\" id=\"MIN_PROCESS\" value=\"";
  private final static String _jspx_template23 = "\">\r\n<input type=\"hidden\" name=\"GIGAN1\" id=\"GIGAN1\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=\"hidden\" name=\"GIGAN2\" id=\"GIGAN2\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=\"hidden\" name=\"MIN_NAME\" id=\"MIN_NAME\" value=\"";
  private final static String _jspx_template26 = "\">\r\n<input type=\"hidden\" name=\"MIN_REQNO\" id=\"MIN_REQNO\" value=\"";
  private final static String _jspx_template27 = "\">\r\n<input type=\"hidden\" name=\"ADMIN_NO\" id=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template28 = "\">\r\n<input type=\"hidden\" name=\"CORP_CD\"  id=\"CORP_CD\"  value=\"";
  private final static String _jspx_template29 = "\">\r\n<input type=\"hidden\" name=\"GU_CODE\" id=\"GU_CODE\"  value=\"";
  private final static String _jspx_template30 = "\">\r\n<input type=\"hidden\" name=\"PURPOSE1_NM\" id=\"PURPOSE1_NM\">\r\n<input type=\"hidden\" name=\"PURPOSE2_NM\" id=\"PURPOSE2_NM\">\r\n<input type=\"hidden\" name=\"PURPOSE3_NM\" id=\"PURPOSE3_NM\">\r\n<input type=\"hidden\" name=\"TAX_SET_NM\" id=\"TAX_SET_NM\">\r\n<input type=\"hidden\" name=\"PURPOSESEBU_NM\" id=\"PURPOSESEBU_NM\">\r\n<input type=\"hidden\" name=\"XMLDATA\" id=\"XMLDATA\">\r\n<input type=\"hidden\" name=\"LISTSEQ\" id=\"LISTSEQ\" value=\"\">\r\n\r\n<tr>\r\n\t<td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n   \t\t<tr>\r\n         \t<td height=\"22\" background=\"/img/tab_line_purple.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<ul id=\"tabmenu\">\r\n\t\t\t\t\t<td width=\"111\"><a><img src=\"/img/sub_petition_title9_on.gif\" alt=\"민원정보\" width=\"110\" height=\"22\" border=\"0\" onclick=\"\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t<td width=\"111\"><a><img src=\"/img/sub_petition_title2_off_b.gif\" alt=\"점용인 정보\" width=\"110\" height=\"22\" border=\"0\" onclick=\"\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t<td width=\"111\"><a><img src=\"/img/sub_facility_title3_off.gif\" alt=\"시설물 정보\" width=\"110\" height=\"22\" border=\"0\" onclick=\"Sisul_Click();\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t</ul>\r\n\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\r\n\t\t<tr>\r\n            <td align=\"left\" class=\"contborder_purple\">\r\n\t\r\n\t\t<div id=\"tabcontents\">\r\n\t\t\r\n\t\t\t<div class=\"tabcontent\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\r\n                <tr>\r\n\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수번호</td>\r\n\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_NO_MIN\" id=\"REQ_NO_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template31 = "\" maxlength=\"20\" readonly></td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원구분</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"GUBUN_MIN\" id=\"GUBUN_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template32 = "\" maxlength=\"25\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수일자</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td><input name=\"REQ_DATE_MIN\" id=\"REQ_DATE_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template33 = "\" readonly></td>\r\n\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, REQ_DATE_MIN, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리예정일자</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td><input name=\"PREDATE_MIN\" id=\"PREDATE_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template34 = "\" readonly></td>\r\n\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, PREDATE_MIN, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수부서</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_DEP_MIN\" id=\"REQ_DEP_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template35 = "\"  maxlength=\"10\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"MANAGE_DEP_MIN\" id=\"MANAGE_DEP_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template36 = "\"  maxlength=\"10\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_NM_MIN\" id=\"REQ_NM_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template37 = "\" maxlength=\"10\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"MANAGER_MIN\" id=\"MANAGER_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template38 = "\" maxlength=\"10\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원요지</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<input name=\"NOTES_MIN\" id=\"NOTES_MIN\" type=\"text\" class=\"input_form1\" style=\"width:98%\"  value=\"";
  private final static String _jspx_template39 = "\" maxlength=\"100\">\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"AGENT_NM_MIN\" id=\"AGENT_NM_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template40 = "\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인 연락처</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"AGENT_TEL_MIN\" id=\"AGENT_TEL_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template41 = "\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"NAME_MIN\" id=\"NAME_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\"  value=\"";
  private final static String _jspx_template42 = "\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주민번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"min_ssn1\" id=\"min_ssn1\" type=\"text\" class=\"essential\" style=\"width:40px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template43 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_ssn2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t\t - <input name=\"min_ssn2\" id=\"min_ssn2\" type=\"text\" class=\"essential\" style=\"width:45px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template44 = "\" onKeyPress=\"nr_num_int(this);\" maxlength=\"7\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 우편번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  \t<td><input name=\"POST_MIN\" id=\"POST_MIN\" type=\"text\" class=\"input_form1\" style=\"width:50px\" value=\"";
  private final static String _jspx_template45 = "\" readonly></td>\r\n\t\t\t\t\t\t\t  \t<td><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:openZipcodePopup('form.POST_MIN', 'form.ADDR1_MIN');\" style=\"CURSOR:Hand\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"ADDR1_MIN\" id=\"ADDR1_MIN\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template46 = "\" readonly>\r\n\t\t\t\t\t\t\t<input name=\"ADDR2_MIN\" id=\"ADDR2_MIN\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template47 = "\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"TEL_MIN\" id=\"TEL_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template48 = "\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 휴대폰</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"HP_MIN\" id=\"HP_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  // jsp code [from=(782,14);to=(786,10)]
  private final static String _jspx_template49 = "\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n                  \t</table></td>\r\n                </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</div>\r\n\t\t\r\n\t\t\t<div class=\"tabcontent\" style=\"display:none\">\r\n\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인(법인명)</td>\r\n\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <!-- \r\n\t\t\t\t\t\t\t  <td><input name=\"CORP_NM\" type=\"text\" class=\"essential\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t\t\t\t  -->\r\n\t\t\t\t\t\t\t  <td width='130' align='left'><input name=\"NAME\" id=\"NAME\"  type=\"text\" class=\"essential\" style=\"width:120px\" value=\"\"  readonly></td>\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td  height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민(법인)번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"jumin_ssn1\"  id=\"jumin_ssn1\"  type=\"text\" class=\"essential\" style=\"width:40px; ime-mode:disabled\" value=\"\"  maxlength=\"6\" readonly>\r\n\t\t\t\t\t\t  - <input name=\"jumin_ssn2\"  id=\"jumin_ssn2\"  type=\"text\" class=\"essential\" style=\"width:45px; ime-mode:disabled\"  maxlength=\"7\" value=\"\" readonly>\r\n\t\t\t\t\t\t </td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대표자명</td>\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"NAME\" type=\"text\" class=\"input_form1\" style=\"width:120px\" onFocus=\"\"></td>\t\t\t\t\r\n\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"TOPOST_NM\"  id=\"TOPOST_NM\"  type=\"text\" class=\"input_form1\" style=\"width:120px\"  readonly></td>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업자 등록번호</td>\r\n\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_bizssn1\"  id=\"jumin_bizssn1\"  type=\"text\" class=\"input_form1\" value=\"\" style=\"width:30px; ime-mode:disabled\"  maxlength=\"3\" readonly>\r\n\t\t\t\t\t\t  - <input name=\"jumin_bizssn2\"  id=\"jumin_bizssn2\" type=\"text\" class=\"input_form1\" value=\"\" style=\"width:15px; ime-mode:disabled\" maxlength=\"2\" readonly>\r\n\t\t\t\t\t\t  - <input name=\"jumin_bizssn3\"  id=\"jumin_bizssn3\"  type=\"text\" class=\"input_form1\" value=\"\" style=\"width:35px; ime-mode:disabled\" maxlength=\"5\" readonly>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><input name=\"BON_POST\" id=\"BON_POST\" type=\"text\" class=\"essential\" style=\"width:50px\"  value=\"\" readonly></td>\r\n\t\t\t\t\t\t\t\t  <td>&nbsp;&nbsp;&nbsp;</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"BON_ADDR1\"  id=\"BON_ADDR1\"  type=\"text\" class=\"essential\" style=\"width:250px\"  value=\"\" readonly>\r\n\t\t\t\t\t\t\t<input name=\"BON_ADDR2\"  id=\"BON_ADDR2\"  type=\"text\" class=\"essential\" style=\"width:250px\"  value=\"\" readonly>\r\n\t\t\t\t\t\t\t<input name=\"JIBUN_MAIN\" id=\"JIBUN_MAIN\"  type=\"text\" class=\"essential\" style=\"width:50px;\" maxlength=\"4\"  readonly>&nbsp; - &nbsp; <input name=\"JIBUN_SUB\" id=\"JIBUN_SUB\" type=\"text\" class=\"essential\" style=\"width:50px\" maxlength=\"4\"  readonly> &nbsp;번지\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">업태</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"BIZ_STATUS\"  id=\"BIZ_STATUS\"  type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"\" readonly></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">종목</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"BIZ_TYPES\"  id=\"BIZ_TYPES\"  type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"\" readonly></td>\t\t\t\t\r\n\t\t\t\t  \t</tr>\t\t\t\t\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td";
  // jsp code [from=(782,14);to=(786,10)]
  private final static String _jspx_template50 = " height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t \t<td><span class=\"sub_stan_blue\">* 우편물 송달지</span>  </td>\r\n\t\t\t\t\t\t\t  \t<td width=\"16\"></td>\r\n\t\t\t\t\t\t\t  \t<td></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 주소</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"TO_POST\"  id=\"TO_POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\"  readonly value=\"\"></td>\r\n\t\t\t\t\t\t\t\t\t<td>&nbsp;&nbsp;&nbsp;</td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"TO_ADDR1\"  id=\"TO_ADDR1\"  type=\"text\" class=\"input_form1\" style=\"width:250px\"  readonly value=\"\">\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"TO_ADDR2\" id=\"TO_ADDR2\"  type=\"text\" class=\"input_form1\" style=\"width:250px\"  value=\"\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"TO_JIBUN_MAIN\" id=\"TO_JIBUN_MAIN\"  type=\"text\" class=\"input_form1\"  style=\"width:50px\"   maxlength=\"4\"   readonly>&nbsp; - &nbsp; <input name=\"TO_JIBUN_SUB\" id=\"TO_JIBUN_SUB\" type=\"text\"  class=\"input_form1\"  style=\"width:50px\"  maxlength=\"4\"  readonly>&nbsp;번지\r\n\t\t\t\t\t\t\t\t\t</td>  \r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  \t<td><span class=\"sub_stan_blue\">* 담당자 정보</span></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지점명/담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" height=\"25\">\r\n\t\t\t\t\t\t\t<input name=\"OFFICE\"  id=\"OFFICE\"  type=\"text\" class=\"input_form1\" style=\"width:100px\" value=\"\" readonly>\r\n\t\t\t\t\t\t\t/ <input name=\"MANAGER\"  id=\"MANAGER\"  type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"\" readonly>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_tel1\"  id=\"jumin_tel1\"  type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\"  maxlength=\"3\" value=\"\" readonly> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_tel2\"  id=\"jumin_tel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" value=\"\" readonly> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_tel3\"  id=\"jumin_tel3\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" value=\"\" readonly>\r\n\t\t\t\t\t\t\t&nbsp;&nbsp;(&nbsp;내선&nbsp;<input name=\"TEL_EXT\"  id=\"TEL_EXT\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" value=\"\" readonly>&nbsp;)\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">FAX</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_fax1\"  id=\"jumin_fax1\"  type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" maxlength=\"3\" readonly> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_fax2\"  id=\"jumin_fax2\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" readonly> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_fax3\"  id=\"jumin_fax3\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4\" readonly>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"jumin_hp1\"  id=\"jumin_hp1\"  type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" maxlength=\"3\" readonly> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_hp2\"  id=\"jumin_hp2\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" maxlength=\"4\" readonly> - \r\n\t\t\t\t\t\t\t<input name=\"jumin_hp3\" id=\"jumin_hp3\"  type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\"  maxlength=\"4";
  // jsp code [from=(782,14);to=(786,10)]
  private final static String _jspx_template51 = "\" readonly>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t  \r\n                  \t</table>\r\n\t\t\t</div>\r\n\t\t\t\r\n\t\t\t<div class=\"tabcontent\" style=\"display:none\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100%\" colspan=\"7\">\r\n\t\t\t\t\t\t\t<div id=\"blist\"></div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"30\" align=\"center\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n\t\t\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"TYPE\" id=\"TYPE\" value=\"1\">도로\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"SECTION\" id=\"SECTION\" value=\"1\">계속\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template52 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소유자</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select name=\"OWNER_SET\" id=\"OWNER_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template53 = "\r\n\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select name=\"TAX_SET\" id=\"TAX_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" ><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"25\" src=\"/jsp/common/purposeCode/purposeCode.jsp?SectionCode=4&PURPOSE_CD=000&essential=1\"></iframe>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">상세시설물</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<select name=\"PURPOSESEBU_CD\" id=\"PURPOSESEBU_CD\" class=\"input_form1\" style=\"width:120px\"></select>\r\n\t\t\t\t\t\t\t\t</td>             \r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">규격</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"STANDARD\" id=\"STANDARD\" type=\"text\" class=\"input_form1\" style=\"width:140px\" maxlength=\"12\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr> \r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수량(연장)</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"QUANTITY\" id=\"QUANTITY\" type=\"text\" class=\"essential\" style=\"width:140px\" maxlength=\"11\" onKeyUp=\"nr_num_float(this);\" > 개(또는 m)\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">심도(감액적용)</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"DEPTH_CK\" id=\"DEPTH_CK\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onKeyUp=\"Select_Depth(); nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"3\">&nbspm &nbsp&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"DEPTH_NUM\" id=\"DEPTH_NUM\" type=\"text\" class=\"input_form1\" style=\"width:50px\" readonly> %\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"MUL_FROMDATE\" id=\"MUL_FROMDATE\" type=\"text\" class=\"essential\" style=\"width:70px\" readonly><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t\t\t\t\t~ <input name=\"MUL_TODATE\" id=\"MUL_TODATE\" type=\"text\" class=\"essential\" style=\"width:70px\" readonly><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, MUL_TODATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<tr style=\"display:none\" id=\"UseSection\">\r\n\t\t\t\t\t\t\t\t\t<td>일시점용<input name=\"PARTLY_PERIOD\" id=\"PARTLY_PERIOD\" type=\"text\" class=\"essential\" style=\"width:300px\">\r\n\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;총<input name=\"TOTAL_PERIOD\" id=\"TOTAL_PERIOD\" type=\"text\" class=\"essential\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\">일</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><span class=\"sub_stan_blue\">* 시설물 주소</span></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대표 주소</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<div id=\"addr_fix\">\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\"> \r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><input name=\"SISUL_POST\" id=\"SISUL_POST\" type=\"text\" class=\"essential\" style=\"width:50px\" onFocus=\"\" readonly></t";
  private final static String _jspx_template55 = "d>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"javascript:openZipcodePopup('form.SISUL_POST', '');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t \t";
  private final static String _jspx_template56 = "&nbsp;\r\n\t\t\t                    \t\r\n\t\t\t\t\t                            \t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"essential\" style=\"width:80px\" >\r\n\t\t\t\t\t                                \t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t                              \t</select>\r\n\t\t\t\t                                \r\n\t\t\t\t                                &nbsp;\r\n\t\t\t\t                                \t<select id=\"HJ_CD\" name=\"HJ_CD\" class=\"essential\" style=\"width:80px\" >\r\n\t\t\t\t                                   \t\t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t                                \t</select>\r\n\t\t\t\t                                \r\n\t\t\t\t                 \t            &nbsp;/&nbsp;\r\n\t\t\t\t                 \t            \t<select id=\"SPC_CD\" name=\"SPC_CD\" class=\"essential\" style=\"width:75px\"  onChange =\"javascript:setSisul_addr1();\">\r\n\t\t\t\t                                   \t\t";
  private final static String _jspx_template59 = "\r\n\t\t\t\t                                \t</select>\r\n\t\t\t\t                                \t&nbsp;\r\n\t\t\t\t                                \t<input type='text' id=\"BONBUN\"  name=\"BONBUN\" class=\"essential\" style=\"width:30px\" maxlength=\"4\"> - <input type='text' id=\"BUBUN\" name=\"BUBUN\" class=\"essential\" style=\"width:30px\" maxlength=\"4\"> &nbsp;번지 \r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>  \r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td colspan='3'><input name=\"SISUL_ADDR1\" id=\"SISUL_ADDR1\" type=\"hidden\" class=\"essential\" style=\"width:200px\" disabled>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"SISUL_ADDR2\" id=\"SISUL_ADDR2\" type=\"text\" class=\"essential\" style=\"width:300px\" \t>\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr> \r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><span class=\"sub_stan_blue\">* 공사(굴착) 정보</span></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사기간 </td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"WORK_FROMDATE\" id=\"WORK_FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:65px\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, WORK_FROMDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"WORK_TODATE\" id=\"WORK_TODATE\" type=\"text\" class=\"input_form1\" style=\"width:65px\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, WORK_TODATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">준공년월일</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td><input name=\"COMPLETION_DATE\" id=\"COMPLETION_DATE\" type=\"text\" class=\"input_form1\" style=\"width:65px\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, COMPLETION_DATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사내용</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"EXE_INFO\" id=\"EXE_INFO\" type=\"text\" class=\"input_form1\" style=\"width:98%\">\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t<table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<img src=\"/img/add_icon2.gif\" alt=\"추가\" border=\"0\" onClick='javascript:New_Sisul_Register()' style=\"CURSOR:hand\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t</table>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t\t</td>\r\n\t\t</tr>\r\n \t\r\n\t</table></td>\r\n\t</tr>\r\n\r\n</form>\r\n</table>\r\n</body>\r\n</html>\r\n<script language=\"javaScript\">\r\n//<![CDATA[\r\n\tparent.getSearchData(document.form.NAME_MIN.value, document.form.min_ssn1.value, document.form.min_ssn2.value);\r\n\r\n\t//상세시설물 선택\r\n\tfunction purposesebu_select(){\r\n\t\tvar frm=document.form.PURPOSESEBU_CD;\r\n\t\tfrm.options[0].selected = true;\r\n\t}\r\n//]]>\r\n</script>";
}
