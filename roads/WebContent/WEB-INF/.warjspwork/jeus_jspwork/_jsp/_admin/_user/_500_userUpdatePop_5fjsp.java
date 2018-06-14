package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_userUpdatePop_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(54,9);to=(54,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(55,13);to=(55,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(142,23);to=(142,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(162,22);to=(162,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(180,20);to=(180,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.WORK_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(257,7);to=(262,4)]
      out.write(_jspx_template12);
      out.write(_jspx_template13);
      // jsp code [from=(321,57);to=(321,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${result}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(322,61);to=(322,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${deptCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(323,65);to=(323,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${input_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template20);
      // jsp code [from=(385,105);to=(385,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.POSITION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(390,96);to=(390,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(395,101);to=(395,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(402,96);to=(402,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.PW}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(409,146);to=(409,157)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.PW}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(427,166);to=(427,182)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.TEL_EXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(443,100);to=(443,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.EMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(459,179);to=(459,199)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.INSARANGKEY}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(478,107);to=(478,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.BUKWA_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(485,107);to=(485,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.ELEC_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(491,111);to=(491,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.SAEALL_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(502,111);to=(502,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.BUKWA_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(509,111);to=(509,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.ELEC_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(515,115);to=(515,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userView.SAEALL_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(534,49);to=(534,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${siguCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(535,49);to=(535,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);

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
            out.write(_jspx_template17);
            // jsp code [from=(370,25);to=(370,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(370,40);to=(370,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);

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
  private final static String _jspx_template7 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\nhtml {overflow-x : hidden;}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script type=\"text/javascript\">\r\n\r\n\tfunction fn_pwCheck()\r\n\t{\t\r\n\t    var fm = document.regForm; \r\n\t    \r\n\t\tif(fm.PW.value != fm.pwConfirm.value)\r\n\t\t{\t\r\n\t\t\talert(\"패스워드를 정확히 입력 해 주세요.\");\r\n\t\t\tfm.PW.focus();\r\n\t\t\tfm.pwConfirm.select();\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\treturn true;\t\t\t\r\n\t}\r\n\t           \r\n\tfunction fn_upDate()\r\n\t{\t\r\n\t\tvar w = document.regForm;\r\n\r\n\t\tif(!fn_pwCheck()) return;\r\n\t\tif(!isEmail(w.EMAIL)) return;\t\r\n\t\tif(!checkStrNVMsg(w.SIGU_CD,\"소속기관\"))return;\r\n\t\tif(!checkStrNVMsg(result.listForm.deptCode,\"소속부서\"))return;\r\n\t\tif(!checkStrNVMsg(w.NAME,\"이름\"))return;\r\n\t\tif(!checkStrNVMsg(w.userId,\"아이디\"))return;\r\n\t\tif(!checkStrNVMsg(w.PW,\"패스워드\"))return;\r\n\t\tif(!checkStrNVMsg(w.SECTION,\"사용자등급\"))return;\r\n\t\tif(!checkStrNVMsg(w.work_id1,\"주민등록번호\"))return;\r\n\t\tif(!checkStrNVMsg(w.work_id2,\"주민등록번호\"))return;\r\n\r\n\t\tif('";
  private final static String _jspx_template8 = "' == 'roadsdb'){\r\n\t\t\talert('";
  private final static String _jspx_template9 = "' + '계정입니다.');\r\n\t\t}else if(w.INSARANGKEY.value.length > 0 && w.INSARANGKEY.value.length < 13){\r\n\t\t\talert(\"인사대체키의 입력이 잘못되었습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tsetWork_id();\r\n\t\tsetTel();  \r\n\t\tsetHP(); \t\t\r\n\t\tw.deptCode.value = result.listForm.deptCode.value;\r\n\t\tif(w.input_type.value==\"text\"){\t\t//받은 input_type이  text이면 \t\t\t\r\n\t\t\tw.BUKWA_ID.value  = w.BUKWA_ID1.value;\r\n\t\t\tw.ELEC_ID.value   = w.ELEC_ID1.value;\r\n\t\t\tw.SAEALL_ID.value = w.SAEALL_ID1.value;\r\n\t\t}else if(w.input_type.value==\"pass\"){\r\n\t\t\tw.BUKWA_ID.value  = w.BUKWA_ID2.value;\r\n\t\t\tw.ELEC_ID.value   = w.ELEC_ID2.value;\r\n\t\t\tw.SAEALL_ID.value = w.SAEALL_ID2.value;\r\n\t\t}\r\n\t\tw.action = \"/admin/user/userReg.do\";\t\t\r\n\t\tw.submit();\t\t\t\t\r\n\t}\r\n\t\r\n\tfunction setWork_id(){\r\n\t\tvar work_id1 = document.regForm.work_id1.value;\r\n\t   \tvar work_id2 = document.regForm.work_id2.value;\r\n\t   \t\r\n\t   \tif(work_id1 != \"\" && work_id2!= \"\")\r\n\t\t   \tdocument.regForm.WORK_ID.value = work_id1+work_id2;\r\n\t}\r\n\t\r\n\tfunction setTel()\r\n\t{\r\n\t\tvar tel1 = document.regForm.tel1.value;\r\n\t   \tvar tel2 = document.regForm.tel2.value;\r\n\t   \tvar tel3 = document.regForm.tel3.value;\r\n\t   \t\r\n\t   \tif(tel1 != \"\" && tel2!= \"\" && tel3 != \"\")\r\n\t   \t\tdocument.regForm.TEL.value = tel1+\"-\"+tel2+\"-\"+tel3;\r\n\t}\r\n\t\r\n\tfunction setHP()\r\n\t{\r\n\t\tvar hp1 = document.regForm.hp1.value;\r\n\t   \tvar hp2 = document.regForm.hp2.value;\r\n\t   \tvar hp3 = document.regForm.hp3.value;\r\n\t   \t\r\n\t   \t if(hp1 != \"\" && hp2!= \"\" && hp3 != \"\")\r\n\t   \t\tdocument.regForm.HP.value = hp1+\"-\"+hp2+\"-\"+hp3;\r\n\t}\t\r\n\t\t\r\n\tfunction changeFocus(varControl, varNext)\r\n\t{\r\n\t\tif(varControl.value.length == varControl.maxLength)\r\n\t\t{\r\n\t\t\tvarNext.focus();\r\n\t\t\tvarNext.select(); \r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction fn_callBack()\r\n\t{\r\n\t\tvar fm = document.regForm; \r\n\t\t\r\n\t   \tif(fm.result.value != \"\") \r\n\t\t{\r\n\t\t\tif(fm.result.value == 'true')\r\n\t\t\t{\r\n\t\t\t\talert(\"사용자정보가 변경되었습니다!\");\r\n\t\t\t\topener.location.reload();\r\n\t    \t\twindow.close();\r\n\t    \t}\r\n\t    \telse\r\n\t    \t\talert(\"저장에 실패했습니다!\");\r\n\t\t}\r\n\t}\r\n\t\r\n\t//구코드 변경시 부서코드list 조회\r\n\tfunction fn_guChange()\r\n\t{\r\n\t\tvar sigucd = document.regForm.SIGU_CD.value;\t\t\t\r\n\t\tresult.getDeptCode(sigucd,\"update\");  \r\n\t}\r\n\t\r\n\t//전화번호 format\r\n\tfunction fn_telSplit()\r\n\t{\r\n\t\tvar string_tel = \"";
  private final static String _jspx_template10 = "\";\r\n\t \tvar split_tel  = string_tel.split('-');\r\n  \t  \r\n  \t  \tif(string_tel==\"\")\r\n  \t  \t{\r\n\t\t   \tdocument.regForm.tel1.value=\"\";\r\n\t   \t   \tdocument.regForm.tel2.value=\"\";\r\n\t   \t   \tdocument.regForm.tel3.value=\"\";\r\n\t \t}\r\n\t\telse\r\n\t   \t{\r\n\t\t\tdocument.regForm.tel1.value=split_tel[0];\r\n\t   \t   \tdocument.regForm.tel2.value=split_tel[1];\r\n\t   \t   \tdocument.regForm.tel3.value=split_tel[2];\r\n\t   \t}\r\n\t}\r\n\t\r\n\t//HP format\r\n\tfunction fn_hpSplit()\r\n\t{\r\n\t\tvar string_hp = \"";
  private final static String _jspx_template11 = "\";\r\n\t \tvar split_hp  = string_hp.split('-');\r\n  \t  \t\r\n  \t  \tif(string_hp==\"\")\r\n  \t  \t{\r\n\t\t   \tdocument.regForm.hp1.value=\"\";\r\n\t   \t   \tdocument.regForm.hp2.value=\"\";\r\n\t   \t   \tdocument.regForm.hp3.value=\"\";\r\n\t \t}\r\n\t\telse\r\n\t   \t{\r\n\t\t\tdocument.regForm.hp1.value=split_hp[0];\r\n\t   \t   \tdocument.regForm.hp2.value=split_hp[1];\r\n\t   \t   \tdocument.regForm.hp3.value=split_hp[2];\r\n\t   \t}\r\n\t}\r\n\r\n\tfunction fn_wiSplit(){\r\n\t\tvar work_id = \"";
  // jsp code [from=(257,7);to=(262,4)]
  private final static String _jspx_template12 = "\";\r\n\r\n\t\tif(work_id==\"\"){\r\n\t\t\tdocument.regForm.work_id1.value = \"\";\r\n\t\t\tdocument.regForm.work_id2.value = \"\";\r\n\t\t}else{\r\n\t\t\tdocument.regForm.work_id1.value = work_id.substring(0, 6);\r\n\t\t\tdocument.regForm.work_id2.value = work_id.substring(6, 13);\r\n\t\t}\r\n\t}\r\n\t\r\n\t//전화번호 입력시 포커스이동\r\n\tfunction fn_checklength(nextfield,chars,currfield) \r\n\t{\r\n\t\tvar x = eval('document.regForm.'+currfield+'.value.length');\r\n\t\tvar y = eval('document.regForm.'+currfield+'.value');\r\n\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\tif(code == 9)\r\n\t\t\treturn;\r\n\t\t\r\n\t\tif (x == chars || (currfield == 'tel1' &&  y =='02')) \r\n\t\t{\r\n\t    \teval('document.regForm.' + nextfield + '.focus();');\r\n\t    \teval('document.regForm.' + nextfield + '.select();');\r\n\t  \t}\r\n\t}\r\n\r\n\t//숫자만 입력\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\tvar code = window.event.keyCode;\r\n\r\n\t \tif ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)\r\n\t \t{\t\r\n\t\t  \twindow.event.returnValue = true;\r\n\t\t\treturn;\r\n\t \t}else {\t \r\n\t \t\twindow.event.returnValue = false;\r\n\t \t\treturn;\r\n \t \t}\r\n\t}\r\n\r\n\t\r\n\tfunction onclickPwMod(e) {\r\n\t\tvar event = e || window.event;\r\n\t\tvar PW = document.getElementById('PW');\r\n\t\tvar pwConfirm = document.getElementById('pwConfirm');\r\n\t\tif (event.checked) {\r\n\t\t\tPW.orginalPw = PW.value;\r\n\t\t\tpwConfirm.value = '';\r\n\t\t\tpwConfirm.readOnly = false;\r\n\t\t\tPW.readOnly = false;\r\n\t\t} else {\r\n\t\t\tPW.value = PW.orginalPw;\r\n\t\t\tpwConfirm.value = PW.orginalPw;\r\n\t\t\tPW.readOnly = true;\r\n\t\t\tpwConfirm.readOnly = true;\r\n\t\t}\r\n\t\t\r\n\t}\r\n\t\r\n\tfunction init()\r\n\t{\r\n\t\tvar w = document.regForm;\r\n\t\tvar cd =w.deptCode.value;\t\r\n\t\t\r\n\t\tif(document.getElementById(\"SIGU_CD\").value == \"\")\t\r\n\t\t\tdocument.getElementById(\"SIGU_CD\").disabled = false;\t\t\r\n\t\t\r\n\t\tfn_guChange();\t\r\n\t\tfn_telSplit();\t\r\n\t\tfn_hpSplit();\r\n\t\tfn_wiSplit();\r\n\r\n\t\tdocument.getElementById(\"dept_cd\").innerHTML = cd;\r\n\t\t\r\n\t\t";
  private final static String _jspx_template13 = "\r\n\t\tvar PW = document.getElementById('PW');\r\n\t\tvar pwConfirm = document.getElementById('pwConfirm');\r\n\t\tvar section = document.getElementById('SECTION');\r\n\t\r\n\t\tif(w.input_type.value==\"text\"){\t\t//받은 input_type이  text이면 \t\t\t\r\n\t\t\tdocument.getElementById(\"input_text\").style.display = \"block\";\r\n\t\t\tpwConfirm.value = '';\r\n\t\t}else if(w.input_type.value==\"pass\"){\r\n\t\t\tdocument.getElementById(\"input_pass\").style.display = \"block\";\r\n\t\t\tvar isPwEdit = document.getElementById('isPwEdit');\r\n\t\t\tvar chkMod = document.getElementById('EditMod');\r\n\t\t\tisPwEdit.style.visibility = 'visible';\r\n\t\t\tPW.readOnly = true;\r\n\t\t\tpwConfirm.readOnly = true;\r\n\t\t\tchkMod.checked = false;\r\n\t\t\tsection.disabled = false;\r\n\t\t\t\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction strCharByte(chStr) {\r\n\t    if (chStr.substring(0, 2) == '%u') {\r\n\t        if (chStr.substring(2,4) == '00')\r\n\t            return 1;\r\n\t        else\r\n\t            return 2;        //한글\r\n\t    } else if (chStr.substring(0,1) == '%') {\r\n\t        if (parseInt(chStr.substring(1,3), 16) > 127)\r\n\t            return 2;        //한글\r\n\t        else\r\n\t            return 1;\r\n\t    } else {\r\n\t            return 1;\r\n\t    }\r\n\t}\r\n\tfunction koreaCheck(){\t\r\n\t\tvar i;\r\n    var ch;\r\n    var keyword = document.getElementById(\"userId\").value;\r\n\t\tfor (i=0;i<keyword.length;i++) {\r\n\t        ch = escape(keyword.charAt(i));        //ISO-Latin-1 문자셋으로 변경\r\n\r\n\t        if (strCharByte(ch) == 2) { //한글이 아닐 경우\r\n\t        \talert(\"한글은 입력할 수 없습니다.\");\r\n\t        \tdocument.getElementById(\"USER_ID\").value = \"\";\r\n\t        \tdocument.getElementById(\"USER_ID\").focus();\r\n\r\n\t   \t\t\t\r\n\t            return;\r\n\t        }\r\n\t    }\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"fn_callBack();init()\">\r\n<form id=\"regForm\" name=\"regForm\" method=\"post\">\r\n<input id=\"modeType\" name=\"modeType\" type=\"hidden\" value=\"edit\">\r\n<input id=\"result\" name=\"result\" type=\"hidden\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input id=\"deptCode\" name=\"deptCode\" type=\"hidden\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input id=\"input_type\" name=\"input_type\" type=\"hidden\" value=\"";
  private final static String _jspx_template16 = "\">\r\n\r\n<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"13\" colspan=\"3\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td width=\"15\"></td>\r\n\t\t<td height=\"47\">\r\n\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\tclass=\"admin_w\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"33\"><img src=\"/img/admin_pop_left.gif\" width=\"33\"\r\n\t\t\t\t\theight=\"47\"></td>\r\n\t\t\t\t<td background=\"/img/admin_pop_cen.gif\"><span\r\n\t\t\t\t\tclass=\"admin_w_b\">사용자</span> 정보 입력</td>\r\n\t\t\t\t<td width=\"33\"><img src=\"/img/admin_pop_right.gif\" width=\"33\"\r\n\t\t\t\t\theight=\"47\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t\t<td width=\"15\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td></td>\r\n\t\t<td>\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"20\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"48%\" valign=\"top\" bgcolor=\"#FFFFFF\" class=\"admin_bl_left\">\r\n\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\tclass=\"sub_table_b\">구분</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"\r\n\t\t\t\t\t\t\tcolspan=\"3\">내용</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\">소속기관</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t<select id=\"SIGU_CD\" name=\"SIGU_CD\" class=\"essential\" style=\"width:100px\" onchange=\"fn_guChange();\" disabled>\r\n\t\t\t\t\t\t\t<option value =\"\">기관선택</option>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t<option value=\"";
  private final static String _jspx_template18 = "\">";
  private final static String _jspx_template19 = "</option>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\t\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">소속부서</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t<iframe height=\"20\" width=\"150\" id=\"result\" name=\"result\" src=\"/admin/user/deptCode.do\" frameborder=\"0\" scrolling=\"no\" marginwidth=\"0\" marginheight=\"0\">\r\n\t\t\t\t\t\t</iframe>&nbsp; &nbsp;(부서코드: &nbsp; <a id=\"dept_cd\"></a>)\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\">담당업무</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t<input id=\"POSITION\" name=\"POSITION\" type=\"text\" class=\"input_form1\" style=\"width:150px\" value=\"";
  private final static String _jspx_template21 = "\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">이 름</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t<input id=\"NAME\" name=\"NAME\" type=\"text\" class=\"essential\"  style=\"width:150px\" value=\"";
  private final static String _jspx_template22 = "\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\">아이디</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"userId\" name=\"userId\" type=\"text\" class=\"essential\" style=\"width:150px\"  value=\"";
  private final static String _jspx_template23 = "\" readOnly = \"true\" onkeyup=\"koreaCheck();\">\r\n\t\t\t\t\t\t\t<font color=\"blue\" style=\"font-size:11px;\">(영문,숫자 포함 최소 6자  최대13자 가능)</font>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">패스워드</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"PW\" name=\"PW\" type=\"password\" class=\"essential\" style=\"width:150px\" value=\"";
  private final static String _jspx_template24 = "\" maxlength=\"13\">\r\n\t\t\t\t\t\t\t<span id=\"isPwEdit\" style=\"visibility: hidden;\"><input id=\"EditMod\" name=\"EditMod\" type=\"checkbox\" checked=\"checked\" onclick=\"javascript:onclickPwMod(this);\">패스워드 수정</span>\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" >패스워드확인</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"pwConfirm\" name=\"pwConfirm\" type=\"password\" class=\"essential\" style=\"width:150px\" onChange=\"javascript:fn_pwCheck();\" value=\"";
  private final static String _jspx_template25 = "\" maxlength=\"13\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">사용자등급</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\" bgcolor=\"f2f2f2\">\r\n\t\t\t\t\t\t<select id=\"SECTION\" name=\"SECTION\" class=\"essential\" style=\"width:140px\"  disabled>\r\n\t\t\t\t\t\t\t<option value=\"\">선택하세요</option>\r\n\t\t\t\t\t\t\t<option value=\"1\">관리자</option>\r\n\t\t\t\t\t\t\t<option value=\"2\">부서업무담당자</option>\r\n\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t</tr>\t\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\">전화번호</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"tel1\" name=\"tel1\" type=\"text\" class=\"input_form1\" style=\"width:30px;ime-mode:disabled\" maxlength=\"3\" onkeyup=\"fn_checklength('tel2',3,this.name);\" onkeydown=\"onlyNumberInput();\"> -\r\n\t\t\t\t\t\t\t<input id=\"tel2\" name=\"tel2\" type=\"text\" class=\"input_form1\" style=\"width:40px;ime-mode:disabled\" maxlength=\"4\" onkeyup=\"fn_checklength('tel3',4,this.name);\" onkeydown=\"onlyNumberInput();\"> -\r\n\t\t\t\t\t\t\t<input id=\"tel3\" name=\"tel3\" type=\"text\" class=\"input_form1\" style=\"width:40px;ime-mode:disabled\" maxlength=\"4\" onkeydown=\"onlyNumberInput();\">  내선:\r\n\t\t\t\t\t\t\t<input id=\"TEL_EXT\" name=\"TEL_EXT\" type=\"text\" class=\"input_form1\" style=\"width:20px;ime-mode:disabled\" maxlength=\"3\" onkeydown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template26 = "\"> \t\t\r\n\t\t\t\t\t\t\t<input id=\"TEL\" name=\"TEL\" type=\"hidden\" class=\"input_form1\">\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">휴대폰번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t<input id=\"hp1\" name=\"hp1\" type=\"text\" class=\"input_form1\" style=\"width:30px;ime-mode:disabled\" maxlength=\"3\" onkeyup=\"fn_checklength('hp2',3,this.name);\" onkeydown=\"onlyNumberInput();\"> -\r\n\t\t\t\t\t\t<input id=\"hp2\" name=\"hp2\" type=\"text\" class=\"input_form1\" style=\"width:40px;ime-mode:disabled\" maxlength=\"4\" onkeyup=\"fn_checklength('hp3',4,this.name);\" onkeydown=\"onlyNumberInput();\"> -\r\n\t\t\t\t\t\t<input id=\"hp3\" name=\"hp3\" type=\"text\" class=\"input_form1\" style=\"width:40px;ime-mode:disabled\" maxlength=\"4\" onkeydown=\"onlyNumberInput();\">\r\n\t\t\t\t\t\t<input id=\"HP\" name=\"HP\" type=\"hidden\" class=\"input_form1\">\t\t\t\t\t\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\">E-mail</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"EMAIL\" name=\"EMAIL\" type=\"text\" class=\"input_form1\" style=\"width:200px\" value=\"";
  private final static String _jspx_template27 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\t\t\t\t\t\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">주민등록번호</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\" bgcolor=\"f2f2f2\">\r\n\t\t\t\t\t\t\t<input id=\"work_id1\" name=\"work_id1\" type=\"text\" class=\"essential\" style=\"width:100px\" maxlength=\"6\" onkeyup=\"fn_checklength('work_id2',6,this.name);\" onkeydown=\"onlyNumberInput();\">\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"work_id2\" name=\"work_id2\" type=\"password\" class=\"essential\" style=\"width:100px\" maxlength=\"7\" onkeydown=\"onlyNumberInput();\">\t\r\n\t\t\t\t\t\t\t<input id=\"WORK_ID\" name=\"WORK_ID\" type=\"hidden\" class=\"input_form1\" style=\"width:200px\">\t\t\t\t\t\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\t\t\t\t\r\n\t\t\t\t\t<!-- 인사대체키 -->\r\n\t\t\t\t\t<tr>\t\t\t\t\t\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"f2f2f2\">인사대체키</td>\r\n\t\t\t\t\t\t<td class=\"table_bl_left\" colspan=\"3\" bgcolor=\"f2f2f2\">\r\n\t\t\t\t\t\t\t<input id=\"INSARANGKEY\" name=\"INSARANGKEY\" type=\"text\" class=\"essential\" style=\"width:100px\" maxlength=\"13\" onkeyup=\"fn_checklength('INSARANGKEY',13,this.name);\" value=\"";
  private final static String _jspx_template28 = "\">\t\t\t\t\t\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n<tr>\r\n<td align=\"center\">\r\n\t\t\t\t\t\t<div id=\"input_text\" style=\"width:100%;display:none;\">\r\n\t\t\t\t\t\t<table width=\"485\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"90\" height=\"30\" align=\"center\" >세외수입 사용자 ID</td>\r\n\t\t\t\t\t\t\t\t<td width=\"375\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"BUKWA_ID1\" name=\"BUKWA_ID1\" type=\"text\" class=\"essential\"\tstyle=\"width:150px\" value=\"";
  private final static String _jspx_template29 = "\" maxlength=\"13\" onkeydown=\"onlyNumberInput()\">\r\n\t\t\t\t\t\t\t\t<font color=\"blue\" style=\"font-size:11px;\">(주민번호 입력, '-'제외)</font>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td height=\"30\" align=\"center\" bgcolor=\"f2f2f2\">전자결제 사용자 ID</td>\r\n\t\t\t\t\t\t\t\t<td class=\"table_bl_left\" bgcolor=\"f2f2f2\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"ELEC_ID1\" name=\"ELEC_ID1\" type=\"text\" class=\"input_form1\"\tstyle=\"width:150px\" value=\"";
  private final static String _jspx_template30 = "\" maxlength=\"13\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"30\" align=\"center\" >새올행정 사용자  ID</td>\r\n\t\t\t\t\t\t\t\t<td class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"SAEALL_ID1\" name=\"SAEALL_ID1\" type=\"text\" class=\"input_form1\"\tstyle=\"width:150px\" value=\"";
  private final static String _jspx_template31 = "\" maxlength=\"13\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div id=\"input_pass\" style=\"width:100%;display:none;\">\r\n\t\t\t\t\t\t<table width=\"485\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"90\" height=\"30\" align=\"center\" >세외수입 사용자 ID</td>\r\n\t\t\t\t\t\t\t\t<td width=\"375\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"BUKWA_ID2\" name=\"BUKWA_ID2\" type=\"password\" class=\"essential\"\tstyle=\"width:150px\" value=\"";
  private final static String _jspx_template32 = "\" maxlength=\"13\" onkeydown=\"onlyNumberInput()\">\r\n\t\t\t\t\t\t\t\t<font color=\"blue\" style=\"font-size:11px;\">(주민번호 입력, '-'제외)</font>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td height=\"30\" align=\"center\" bgcolor=\"f2f2f2\">전자결제 사용자 ID</td>\r\n\t\t\t\t\t\t\t\t<td class=\"table_bl_left\" bgcolor=\"f2f2f2\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"ELEC_ID2\" name=\"ELEC_ID2\" type=\"password\" class=\"input_form1\"\tstyle=\"width:150px\" value=\"";
  private final static String _jspx_template33 = "\" maxlength=\"13\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"30\" align=\"center\" >새올행정 사용자  ID</td>\r\n\t\t\t\t\t\t\t\t<td class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t<input id=\"SAEALL_ID2\" name=\"SAEALL_ID2\" type=\"password\" class=\"input_form1\"\tstyle=\"width:150px\" value=\"";
  private final static String _jspx_template34 = "\" maxlength=\"13\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n</table>\t\t\t\t\t\t\r\n<table align=\"center\">\r\n\t<td height=\"50\" colspan=\"3\" align=\"center\"><a href=\"#\"><img\r\n\t\tsrc=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:fn_upDate();\"></a><a\r\n\t\thref=\"#\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\"\r\n\t\theight=\"18\" border=\"0\" onClick=javascript:window.close();></a></td>\r\n</table>\r\n<input id=\"BUKWA_ID\" name=\"BUKWA_ID\" type=\"hidden\" value=\"\">\r\n<input id=\"ELEC_ID\" name=\"ELEC_ID\" type=\"hidden\" value=\"\">\r\n<input id=\"SAEALL_ID\" name=\"SAEALL_ID\" type=\"hidden\" value=\"\">\r\n<script language=\"javascript\">\r\n<!--\r\n\tsetSelectedOption(document.regForm.SIGU_CD, \"";
  private final static String _jspx_template35 = "\");\r\n\tsetSelectedOption(document.regForm.SECTION, \"";
  private final static String _jspx_template36 = "\");\r\n//-->\r\n</script> \r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
