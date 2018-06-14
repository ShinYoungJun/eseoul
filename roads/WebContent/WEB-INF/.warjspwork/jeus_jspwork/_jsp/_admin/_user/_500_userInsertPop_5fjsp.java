package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_userInsertPop_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      out.write(_jspx_template1);
      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      out.write(_jspx_template8);
      out.write(_jspx_template9);
      // jsp code [from=(319,61);to=(319,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${modeType}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(320,57);to=(320,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${result}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(321,67);to=(321,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${checkResult}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(323,65);to=(323,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${input_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(324,57);to=(324,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${org_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template18);
      // jsp code [from=(388,120);to=(388,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userReg.POSITION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(394,112);to=(394,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userReg.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(400,141);to=(400,156)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userReg.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(407,112);to=(407,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userReg.PW}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(448,115);to=(448,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userReg.EMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(475,107);to=(475,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.BUKWA_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(482,107);to=(482,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.ELEC_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(488,111);to=(488,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.SAEALL_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(499,111);to=(499,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.BUKWA_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(506,111);to=(506,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.ELEC_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(512,115);to=(512,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.SAEALL_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guCdList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template15);
            // jsp code [from=(371,25);to=(371,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(371,40);to=(371,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);

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
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\nhtml {overflow-x : hidden;}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script> \r\n<script type=\"text/javascript\">\r\n\r\n\t\r\n\t//패스워드 확인\r\n\tfunction fn_pwCheck()\r\n\t{\t\r\n\t    var fm = document.regForm; \r\n\t    \r\n\t\tif(fm.PW.value != fm.pwConfirm.value)\r\n\t\t{\t \r\n\t\t\talert(\"패스워드를 정확히 입력 해 주세요.\");\r\n\t\t\tfm.PW.focus();\r\n\t\t\tfm.pwConfirm.select();\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\treturn true;\t\t\t\r\n\t}\r\n\t\r\n    //저장       \r\n\tfunction fn_insert()\r\n\t{\t\r\n\t\tvar w = document.regForm;\r\n\t\tdocument.getElementById(\"SIGU_CD\").disabled = false;\t// SIGU_CD가 disabled가 되면 값 넘길때 null로 받기 때문에 disabled를 풀어준다.\r\n\t\tif(w.USER_ID.value.length<6 || w.USER_ID.value.length>13){\r\n\t\t\talert(\"아이디는 최소 6자 최대 13자 가능합니다.\");\r\n\t\t\tw.USER_ID.value=\"\";\r\n\t\t\tw.USER_ID.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif(!fnCheckPassword()) {\r\n\t\t\tw.PW.focus();\r\n\t\t\tw.PW.select();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(!fn_pwCheck()) return;\r\n\t\tif(!isEmail(w.EMAIL)) return;\t\r\n\t\tif(!checkStrNVMsg(w.SIGU_CD,\"소속기관\"))return;\r\n\t\tif(!checkStrNVMsg(result.listForm.deptCode,\"소속부서\"))return;\r\n\t\tif(!checkStrNVMsg(w.NAME,\"이름\"))return;\r\n\t\tif(!checkStrNVMsg(w.USER_ID,\"아이디\"))return;\r\n\t\tif(!checkStrNVMsg(w.PW,\"패스워드\"))return;\r\n\t\tif(!checkStrNVMsg(w.SECTION,\"사용자등급\"))return;\r\n\t\tif(!checkStrNVMsg(w.work_id1,\"주민등록번호\"))return;\r\n\t\tif(!checkStrNVMsg(w.work_id2,\"주민등록번호\"))return;\r\n\t\tif(w.input_type.value==\"text\")\r\n\t\t\tif(!checkStrNVMsg(w.BUKWA_ID1,\"세외수입 사용자 ID\"))return;\r\n\t\tif(w.input_type.value==\"pass\")\t\t\t\r\n\t\t\tif(!checkStrNVMsg(w.BUKWA_ID2,\"세외수입 사용자 ID\"))return;\r\n\t\t\t\r\n\t\tsetWork_id();\r\n\t\tsetTel(); \r\n\t\tsetHP();  \r\n\t\tw.DEPT_CD.value = result.listForm.deptCode.value; \r\n\t\t\t\t\r\n\t\tif(w.input_type.value==\"text\"){\t\t//받은 input_type이  text이면 \t\t\t\r\n\t\t\tw.BUKWA_ID.value  = w.BUKWA_ID1.value;\r\n\t\t\tw.ELEC_ID.value   = w.ELEC_ID1.value;\r\n\t\t\tw.SAEALL_ID.value = w.SAEALL_ID1.value;\r\n\t\t}else if(w.input_type.value==\"pass\"){\r\n\t\t\tw.BUKWA_ID.value  = w.BUKWA_ID2.value;\r\n\t\t\tw.ELEC_ID.value   = w.ELEC_ID2.value;\r\n\t\t\tw.SAEALL_ID.value = w.SAEALL_ID2.value;\r\n\t\t}\r\n\t\t\r\n\t\tw.action = \"/admin/user/userReg.do\";\t\t\r\n\t\tw.submit();\t\r\n\t\t\r\n\t}\r\n\t\r\n\tfunction setWork_id(){\r\n\t\tvar work_id1 = document.regForm.work_id1.value;\r\n\t   \tvar work_id2 = document.regForm.work_id2.value;\r\n\t   \t\r\n\t   \tif(work_id1 != \"\" && work_id2!= \"\")\r\n\t\t   \tdocument.regForm.WORK_ID.value = work_id1+work_id2;\r\n\t}\r\n\t\r\n\tfunction setTel()\r\n\t{\r\n\t\tvar tel1 = document.regForm.tel1.value;\r\n\t   \tvar tel2 = document.regForm.tel2.value;\r\n\t   \tvar tel3 = document.regForm.tel3.value;\r\n\t   \t\r\n\t   \tif(tel1 != \"\" && tel2!= \"\" && tel3 != \"\")\r\n\t   \t\tdocument.regForm.TEL.value = tel1+\"-\"+tel2+\"-\"+tel3;\r\n\t}\r\n\t\r\n\tfunction setHP()\r\n\t{\r\n\t\tvar hp1 = document.regForm.hp1.value;\r\n\t   \tvar hp2 = document.regForm.hp2.value;\r\n\t   \tvar hp3 = document.regForm.hp3.value;\r\n\t   \t\r\n\t   \tif(hp1 != \"\" && hp2!= \"\" && hp3 != \"\")\r\n\t   \t\tdocument.regForm.HP.value = hp1+\"-\"+hp2+\"-\"+hp3;\r\n\t}\r\n\r\n\t//전화번호 입력시 포커스이동\r\n\tfunction fn_checklength(nextfield,chars,currfield) {\r\n\t\r\n\t\tvar x = eval('document.regForm.'+currfield+'.value.length');\r\n\t\tvar y = eval('document.regForm.'+currfield+'.value');\r\n\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\tif(code == 9)\r\n\t\t\treturn;\r\n\t\t\r\n\t\tif (x == chars || (currfield == 'tel1' &&  y =='02')) \r\n\t\t{\r\n\t    \teval('document.regForm.' + nextfield + '.focus();');\r\n\t    \teval('document.regForm.' + nextfield + '.select();');\r\n\t  \t}\r\n\t}\r\n\t\t\r\n\tfunction changeFocus(varControl, varNext)\r\n\t{\r\n\t\tvar w = document.regForm;\r\n\t\t\r\n\t\tif(w.ssn1.value.length == 6 && w.ssn2.value.length == 7)\r\n\t\t\treturn;\r\n\t\t\r\n\t\tif(varControl.value.length == varControl.maxLength)\r\n\t\t{\r\n\t\t\tvarNext.focus();\r\n\t\t\tvarNext.select(); \r\n\t\t}\r\n\t}\r\n\t\t\r\n\t//저장 후처리\r\n\tfunction fn_callBack()\r\n\t{\r\n\t\tvar ";
  private final static String _jspx_template8 = "fm = document.regForm; \r\n\t\t\r\n\t   \tif(fm.result.value != \"\") \r\n\t\t{\r\n\t\t\tif(fm.result.value == 'true')\r\n\t\t\t{   \r\n\t\t\t\talert(\"저장에 성공했습니다!\");\r\n\t\t\t\t\r\n\t\t\t\tif(opener.result){\r\n\t\t\t\t\tvar w = opener.document.listForm;\r\n\t\t\t\t\tw.deptCode.value = opener.result.listForm.deptCode.value; \r\n\t\t\t\t\tw.action = \"/admin/user/user.do\";\t\t\r\n\t\t\t\t\tw.submit();\t\r\n\t\t\t\t}\r\n\t\t\t\twindow.close();\r\n\t    \t\t\r\n\t    \t}else if(fm.checkResult.value == \"false\"){\r\n\t    \t\t\talert(\"중복된 ID입니다!\");\t\t    \t\t\t\t    \t\t\t\r\n\t    \t}else{\r\n\t    \t\t\talert(\"저장에 실패했습니다!\");\t    \t\t\t\r\n\t    \t}\r\n\t\t}\r\n\t}\r\n\t\r\n\t//ID중복 체크\r\n\tfunction fn_idCheck()\r\n\t{\r\n\t\t\r\n\t\tvar w = document.idForm;\r\n\t\tw.action = \"/admin/user/userReg.do\";\r\n\t\tw.submit();\t\r\n\t}\r\n\r\n\t//구코드 변경시 부서코드list 조회\r\n\tfunction fn_guChange()\r\n\t{\r\n\t\tvar sigucd = document.regForm.SIGU_CD.value;\t\t\t\r\n\t\tresult.getDeptCode(sigucd);  \r\n\t}\r\n\r\n\t//숫자만 입력\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\r\n\t \tif ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)\r\n\t \t{\r\n\t\t  \twindow.event.returnValue = true;\r\n\t\t\treturn;\r\n\t \t}else {\t \r\n\t \t\twindow.event.returnValue = false;\r\n\t \t\treturn;\r\n \t \t}\r\n\t}\t\t\t\r\n\t\r\n\tfunction init(){\r\n\t\tvar w = document.regForm;\r\n\r\n\t\tif(w.input_type.value==\"text\"){\t\t//받은 input_type이  text이면 \t\t\t\r\n\t\t\tdocument.getElementById(\"input_text\").style.display = \"block\";\r\n\t\t}else if(w.input_type.value==\"pass\"){\r\n\t\t\tdocument.getElementById(\"input_pass\").style.display = \"block\";\r\n\t\t}\r\n\r\n\t\tif(w.org_cd.value!=\"\"){\r\n\t\t\tdocument.getElementById(\"SIGU_CD\").value=w.org_cd.value;\r\n\t\t\tfn_guChange();\r\n\t\t\tdocument.getElementById(\"SIGU_CD\").disabled = true;\r\n\t\t}\r\n\t\tif(w.org_cd.value==\"0000000\")\r\n\t\t\tdocument.getElementById(\"SIGU_CD\").disabled = false;\r\n\t}\r\n\t\r\n\tfunction strCharByte(chStr) {\r\n\t    if (chStr.substring(0, 2) == '%u') {\r\n\t        if (chStr.substring(2,4) == '00')\r\n\t            return 1;\r\n\t        else\r\n\t            return 2;        //한글\r\n\t    } else if (chStr.substring(0,1) == '%') {\r\n\t        if (parseInt(chStr.substring(1,3), 16) > 127)\r\n\t            return 2;        //한글\r\n\t        else\r\n\t            return 1;\r\n\t    } else {\r\n\t            return 1;\r\n\t    }\r\n\t}\r\n\tfunction koreaCheck(){\t\r\n\t\tvar i;\r\n\t    var ch;\r\n\t\tvar keyword = document.getElementById(\"USER_ID\").value;\r\n\t\tfor (i=0;i<keyword.length;i++) {\r\n\t        ch = escape(keyword.charAt(i));        //ISO-Latin-1 문자셋으로 변경\r\n\r\n\t        if (strCharByte(ch) == 2) { //한글이 아닐 경우\r\n\t        \talert(\"한글은 입력할 수 없습니다.\");\r\n\t        \tdocument.getElementById(\"USER_ID\").value = \"\";\r\n\t        \tdocument.getElementById(\"USER_ID\").focus();\r\n\r\n\t   \t\t\t\r\n\t            return;\r\n\t        }\r\n\t    }\r\n\t}\r\n\r\n\tfunction fnCheckPassword() {\r\n\r\n\t\tvar upw = document.getElementById(\"PW\").value;\r\n\t\tvar uid = document.getElementById(\"USER_ID\").value;\r\n\r\n\t\tvar chk_num = upw.search(/[0-9]/g); \r\n\t\tvar chk_eng = upw.search(/[a-z]/ig); \r\n\t\tvar strSpecial = upw.search(/[`~!@#$%^&*|\\\\\\'\\\";:\\/?]/gi);\r\n\r\n\t\t/*\r\n\t\t if( upw.indexOf( uid ) > -1) {\r\n\t\t\t document.getElementById(\"message\").innerHTML = \"비밀번호에 ID를 포함할수 없습니다.\";\r\n\t\t\t return false;\r\n\t\t }\r\n\t\t*/\r\n\t\t\r\n\t\t /* check whether input value is included space or not  */\r\n\t\t var retVal = checkSpace( upw );\r\n\t\t if( retVal ) {\r\n\t\t\tdocument.getElementById(\"message\").innerHTML = \"비밀번호는 공백없이 입력해 주세요.\";\r\n\t\t\t return false;\r\n\t\t }\r\n\r\n\t\t if(upw.length < 9){\r\n\t\t\tdocument.getElementById(\"message\").innerHTML = \"9자 이상의 비밀번호만 입력 가능 합니다.\";\r\n\t\t\treturn false;\r\n\t\t }\r\n\r\n\t\tif(upw.length > 14){\r\n\t\t\tdocument.getElementById(\"message\").innerHTML = \"13자 이하의 비밀번호만 입력 가능 합니다.\";\r\n\t\t   return false;\r\n\t\t }\r\n\r\n\t\t if(chk_num < 0 || chk_eng < 0){ \r\n\t\t\tdocument.getElementById(\"message\").innerHTML = \"비밀번호는 문자, 숫자가 조합 되어야 합니다.\";\r\n\t\t   return false; \r\n\t\t }\r\n\r\n\t\tdocument.getElementById(\"message\").innerHTML = \"\";\r\n\t    return true;\r\n\r\n\t}\r\n\r\n// space 가 있으면 true, 없으면 false\r\nfunction checkSpace( str )\r\n{\r\n     if(str.search(/\\s/) != -1){\r\n      return true;\r\n     } else {\r\n        return false;\r\n     }\r\n}\r\n</script>\r\n\r\n<body onload=\"init();fn_callBack();\">\r\n\r\n<form name=\"regForm\" id=\"regForm\" method=\"post\">\r\n<input id=\"modeType\" name=\"modeTyp";
  private final static String _jspx_template9 = "e\" type=\"hidden\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input id=\"result\" name=\"result\" type=\"hidden\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input id=\"checkResult\" name=\"checkResult\" type=\"hidden\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input id=\"DEPT_CD\" name=\"DEPT_CD\" type=\"hidden\" >\r\n<input id=\"input_type\" name=\"input_type\" type=\"hidden\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input id=\"org_cd\" name=\"org_cd\" type=\"hidden\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\r\n<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"13\" colspan=\"3\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td width=\"15\"></td>\r\n\t\t<td height=\"47\">\r\n\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\tclass=\"admin_w\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"33\"><img src=\"/img/admin_pop_left.gif\" width=\"33\"\r\n\t\t\t\t\theight=\"47\"></td>\r\n\t\t\t\t<td background=\"/img/admin_pop_cen.gif\"><span\r\n\t\t\t\t\tclass=\"admin_w_b\">사용자</span> 정보 입력</td>\r\n\t\t\t\t<td width=\"33\"><img src=\"/img/admin_pop_right.gif\" width=\"33\"\r\n\t\t\t\t\theight=\"47\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t\t<td width=\"15\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td></td>\r\n\t\t<td>\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"20\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"48%\" valign=\"top\" bgcolor=\"#FFFFFF\" class=\"admin_bl_left\">\r\n\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\tclass=\"sub_table_b\">구분</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"\r\n\t\t\t\t\t\t\tcolspan=\"3\">내용</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\">소속기관</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t<select id=\"SIGU_CD\" name=\"SIGU_CD\" class=\"essential\" style=\"width:100px\" onchange=\"fn_guChange();\">\r\n\t\t\t\t\t\t\t<option value =\"\">기관선택</option>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t<option value=\"";
  private final static String _jspx_template16 = "\">";
  private final static String _jspx_template17 = "</option>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\t\t\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">소속부서</td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t<iframe height=\"20\" width=\"150\" id=\"result\" name=\"result\" src=\"/admin/user/deptCode.do\" frameborder=\"0\" scrolling=\"no\" marginwidth=\"0\" marginheight=\"0\">\r\n\t\t\t\t\t\t</iframe>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\">담당업무</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t<input id=\"POSITION\" name=\"POSITION\" type=\"text\" class=\"input_form1\" maxlength=\"15\" style=\"width:150px\" value=\"";
  private final static String _jspx_template19 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">이 름</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"NAME\" name=\"NAME\" type=\"text\" class=\"essential\"  maxlength=\"20\" style=\"width:150px\" value=\"";
  private final static String _jspx_template20 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\">아이디</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input name=\"USER_ID\" id=\"USER_ID\" type=\"text\" class=\"essential\" maxlength=\"13\" style=\"width:150px\" onkeyup=\"koreaCheck();\" value=\"";
  private final static String _jspx_template21 = "\">\t\t\t\t\r\n\t\t\t\t\t\t\t<font color=\"blue\" style=\"font-size:11px;\">(영문,숫자 포함 최소 6자  최대13자 가능)</font>\r\n\t\t\t\t\t\t</td>\t\t\t   \r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">패스워드</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"PW\" name=\"PW\" type=\"password\" class=\"essential\" maxlength=\"13\"  style=\"width:150px\" value=\"";
  private final static String _jspx_template22 = "\" onkeyup=\"fnCheckPassword();\">\r\n\t\t\t\t\t\t\t<font color=\"red\" style=\"font-size:11px;\" id=\"message\"></font>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\">패스워드확인</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"pwConfirm\" name=\"pwConfirm\" type=\"password\" class=\"essential\"  maxlength=\"13\" style=\"width:150px\" onChange=\"javascript:fn_pwCheck();\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">사용자등급</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\" bgcolor=\"f2f2f2\">\r\n\t\t\t\t\t\t<select id=\"SECTION\" name=\"SECTION\" class=\"essential\" style=\"width:140px\">\r\n\t\t\t\t\t\t\t<option value=\"\">선택하세요</option>\r\n\t\t\t\t\t\t\t<option value=\"1\">관리자</option>\r\n\t\t\t\t\t\t\t<option value=\"2\">부서업무담당자</option>\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" >전화번호</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t<input id=\"tel1\" name=\"tel1\" type=\"text\" class=\"input_form1\" style=\"width:30px;ime-mode:disabled\" maxlength=\"3\" onkeyup=\"fn_checklength('tel2',3,this.name);\" onkeydown=\"onlyNumberInput();\"> -\r\n\t\t\t\t\t\t<input id=\"tel2\" name=\"tel2\" type=\"text\" class=\"input_form1\" style=\"width:40px;ime-mode:disabled\" maxlength=\"4\" onkeyup=\"fn_checklength('tel3',4,this.name);\" onkeydown=\"onlyNumberInput();\"> -\r\n\t\t\t\t\t\t<input id=\"tel3\" name=\"tel3\" type=\"text\" class=\"input_form1\" style=\"width:40px;ime-mode:disabled\" maxlength=\"4\" onkeydown=\"onlyNumberInput();\">  내선:\r\n\t\t\t\t\t\t<input id=\"TEL_EXT\" name=\"TEL_EXT\" type=\"text\" class=\"input_form1\" style=\"width:20px;ime-mode:disabled\" maxlength=\"3\" onkeydown=\"onlyNumberInput();\"> \t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<input id=\"TEL\" name=\"TEL\" type=\"hidden\" class=\"input_form1\">\r\n\t\t\t\t\t</tr> \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">휴대폰번호</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\" bgcolor=\"f2f2f2\">\r\n\t\t\t\t\t\t<input id=\"hp1\" name=\"hp1\" type=\"text\" class=\"input_form1\" style=\"width:30px;ime-mode:disabled\" maxlength=\"3\" onkeyup=\"fn_checklength('hp2',3,this.name);\" onkeydown=\"onlyNumberInput();\"> -\r\n\t\t\t\t\t\t<input id=\"hp2\" name=\"hp2\" type=\"text\" class=\"input_form1\" style=\"width:40px;ime-mode:disabled\" maxlength=\"4\" onkeyup=\"fn_checklength('hp3',4,this.name);\" onkeydown=\"onlyNumberInput();\"> -\r\n\t\t\t\t\t\t<input id=\"hp3\" name=\"hp3\" type=\"text\" class=\"input_form1\" style=\"width:40px;ime-mode:disabled\" maxlength=\"4\" onkeydown=\"onlyNumberInput();\">\r\n\t\t\t\t\t\t<input id=\"HP\" name=\"HP\" type=\"hidden\" class=\"input_form1\">\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" >E-mail</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"EMAIL\" name=\"EMAIL\" type=\"text\" class=\"input_form1\" maxlength=\"50\" style=\"width:200px\" value=\"";
  private final static String _jspx_template23 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\t\t\t\t\t\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">주민등록번호</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\" bgcolor=\"f2f2f2\">\r\n\t\t\t\t\t\t\t<input id=\"work_id1\" name=\"work_id1\" type=\"text\" class=\"essential\" style=\"width:100px\" maxlength=\"6\" onkeydown=\"nr_num_int(this);\" onkeyup=\"nr_num_int(this);fn_checklength('work_id2',6,this.name);\" >\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"work_id2\" name=\"work_id2\" type=\"password\" class=\"essential\" style=\"width:100px\" maxlength=\"7\" onkeydown=\"nr_num_int(this);\" onkeyup=\"nr_num_int(this);\">\r\n\t\t\t\t\t\t\t<input id=\"WORK_ID\" name=\"WORK_ID\" type=\"hidden\" style=\"width:200px\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n<tr>\r\n<td align=\"center\">\r\n\t\t\t\t\t\t<div id=\"input_text\" style=\"width:100%;display:none;\">\r\n\t\t\t\t\t\t<table width=\"485\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"90\" height=\"30\" align=\"center\" >세외수입 사용자 ID</td>\r\n\t\t\t\t\t\t\t\t<td width=\"375\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"BUKWA_ID1\" name=\"BUKWA_ID1\" type=\"text\" class=\"essential\" style=\"width:200px\" value=\"";
  private final static String _jspx_template24 = "\" maxlength=\"13\" onkeydown=\"onlyNumberInput()\">\r\n\t\t\t\t\t\t\t\t<font color=\"blue\" style=\"font-size:11px;\">(주민번호 입력, '-'제외)</font>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td height=\"30\" align=\"center\" bgcolor=\"f2f2f2\">전자결제 사용자 ID</td>\r\n\t\t\t\t\t\t\t\t<td class=\"table_bl_left\" bgcolor=\"f2f2f2\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input\tid=\"ELEC_ID1\" name=\"ELEC_ID1\" type=\"text\" class=\"input_form1\"\tstyle=\"width:200px\" value=\"";
  private final static String _jspx_template25 = "\" maxlength=\"13\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"30\" align=\"center\" >새올행정 사용자  ID</td>\r\n\t\t\t\t\t\t\t\t<td class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"SAEALL_ID1\" name=\"SAEALL_ID1\" type=\"text\" class=\"input_form1\"\tstyle=\"width:200px\" value=\"";
  private final static String _jspx_template26 = "\" maxlength=\"13\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div id=\"input_pass\" style=\"width:100%;display:none;\">\r\n\t\t\t\t\t\t<table width=\"485\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"90\" height=\"30\" align=\"center\" >세외수입 사용자 ID</td>\r\n\t\t\t\t\t\t\t\t<td width=\"375\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"BUKWA_ID2\" name=\"BUKWA_ID2\" type=\"password\" class=\"essential\" style=\"width:200px\" value=\"";
  private final static String _jspx_template27 = "\" maxlength=\"13\" onkeydown=\"onlyNumberInput()\">\r\n\t\t\t\t\t\t\t\t<font color=\"blue\" style=\"font-size:11px;\">(주민번호 입력, '-'제외)</font>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td height=\"30\" align=\"center\" bgcolor=\"f2f2f2\">전자결제 사용자 ID</td>\r\n\t\t\t\t\t\t\t\t<td class=\"table_bl_left\" bgcolor=\"f2f2f2\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"ELEC_ID2\" name=\"ELEC_ID2\" type=\"password\" class=\"input_form1\"\tstyle=\"width:200px\" value=\"";
  private final static String _jspx_template28 = "\" maxlength=\"13\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"30\" align=\"center\" >새올행정 사용자  ID</td>\r\n\t\t\t\t\t\t\t\t<td class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"SAEALL_ID2\" name=\"SAEALL_ID2\" type=\"password\" class=\"input_form1\"\tstyle=\"width:200px\" value=\"";
  private final static String _jspx_template29 = "\" maxlength=\"13\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n</table>\r\n<div style=\"font-size: 12px; margin-top: 10px; margin-left: 10px; color:red\"> 신청하신 후 서울시 보도환경개선과(02-2133-8133)로 승인요청하시면 됩니다.</div>\r\n<table align=\"center\"><tr>\r\n\t<td height=\"50\" colspan=\"3\" align=\"center\"><a href=\"#\"><img\r\n\t\tsrc=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:fn_insert();\"></a><a\r\n\t\thref=\"#\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\"\r\n\t\theight=\"18\" border=\"0\" onClick=javascript:window.close();></a></td></tr>\r\n</table>\r\n<input name=\"BUKWA_ID\" type=\"hidden\" value=\"\">\r\n<input name=\"ELEC_ID\" type=\"hidden\" value=\"\">\r\n<input name=\"SAEALL_ID\" type=\"hidden\" value=\"\">\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
