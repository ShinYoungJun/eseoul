package jeus_jspwork._jsp._rojum._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_owner_5flist_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(68,9);to=(68,13)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(69,38);to=(69,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${target_name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(70,38);to=(70,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${target_ssn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      out.write(_jspx_template13);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template35);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template45);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("OwnerList");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template14);
            // jsp code [from=(225,62);to=(225,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(226,61);to=(226,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(227,64);to=(227,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_GENDER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(228,59);to=(228,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_AGE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(229,60);to=(229,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(230,63);to=(230,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(231,61);to=(231,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_SAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(232,61);to=(232,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_JIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(233,63);to=(233,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(234,62);to=(234,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_SAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(235,64);to=(235,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(236,63);to=(236,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(237,61);to=(237,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_TOSAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(238,65);to=(238,88)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_TOJIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(239,65);to=(239,88)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(240,59);to=(240,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(241,60);to=(241,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(242,63);to=(242,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.ADDR_CHECK1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(243,61);to=(243,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.ADDR_CHECK2}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(244,56);to=(244,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.LT_SEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("OwnerList");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template36);
            // jsp code [from=(255,158);to=(255,167)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(256,61);to=(256,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(257,82);to=(257,101)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(259,14);to=(259,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template42);
            // jsp code [from=(263,14);to=(263,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_TOJIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(263,41);to=(263,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OwnerList.OWNER_TOSAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template41);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n<script>\r\n\r\nfunction Summit(){\r\n\tvar f = document.jumyongForm;\r\n\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\tvar count = 0;\r\n\tvar hitFlag;\r\n\r\n\r\n\t//대상변수들\r\n\tvar owner_name = document.getElementsByName(\"OWNER_NAME\");\r\n\tvar owner_ssn = document.getElementsByName(\"OWNER_SSN\");\r\n\tvar owner_gender = document.getElementsByName(\"OWNER_GENDER\");\r\n\tvar owner_age = document.getElementsByName(\"OWNER_AGE\");\r\n\tvar owner_post = document.getElementsByName(\"OWNER_POST\");\r\n\tvar owner_addr1 = document.getElementsByName(\"OWNER_ADDR1\");\r\n\tvar owner_san = document.getElementsByName(\"OWNER_SAN\");\r\n\tvar owner_jibun = document.getElementsByName(\"OWNER_JIBUN\");\r\n\tvar owner_addr2 = document.getElementsByName(\"OWNER_ADDR2\");\r\n\tvar owner_same = document.getElementsByName(\"OWNER_SAME\");\r\n\tvar owner_topost = document.getElementsByName(\"OWNER_TOPOST\");\r\n\tvar owner_toaddr1 = document.getElementsByName(\"OWNER_TOADDR1\");\r\n\tvar owner_tosan = document.getElementsByName(\"OWNER_TOSAN\");\r\n\tvar owner_tojibun = document.getElementsByName(\"OWNER_TOJIBUN\");\r\n\tvar owner_toaddr2 = document.getElementsByName(\"OWNER_TOADDR2\");\r\n\tvar owner_tel = document.getElementsByName(\"OWNER_TEL\");\r\n\tvar owner_hp = document.getElementsByName(\"OWNER_HP\");\r\n\tvar addr_check1 = document.getElementsByName(\"ADDR_CHECK1\");\r\n\tvar addr_check2 = document.getElementsByName(\"ADDR_CHECK2\");\r\n\tvar lt_sel = document.getElementsByName(\"LT_SEL\");\r\n\r\n\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\tif(select_item[i].checked == true){\r\n\t\t\tcount++;\r\n\t\t\thitFlag = i;\r\n\t\t}\r\n\t}\r\n\tif(count <= 0){\r\n\t\talert(\"운영자를 선택하세요.\");\r\n\t\treturn;\r\n\t}else{\r\n\r\n\r\n\t\tif('";
  private final static String _jspx_template10 = "' == 'short'){\r\n\t\t\topener.document.getElementById(\"";
  private final static String _jspx_template11 = "\").value = owner_name[hitFlag].value;\r\n\t\t\topener.document.getElementById(\"";
  private final static String _jspx_template12 = "\").value = addSSNDash(owner_ssn[hitFlag].value);\r\n\t\t\tself.close();\r\n\r\n\t\t}else{\r\n\t\t\topener.document.getElementById(\"OWNER_NAME\").value = owner_name[hitFlag].value;\r\n\r\n\t\t\topener.document.getElementById(\"OWNER_SSN1\").value = cutText(addSSNDash(owner_ssn[hitFlag].value),'-',0);\r\n\t\t\topener.document.getElementById(\"OWNER_SSN2\").value = cutText(addSSNDash(owner_ssn[hitFlag].value),'-',1);\r\n\t\t\t\r\n\t\t\tif(owner_gender[hitFlag].value == '1'){\r\n\t\t\t\topener.document.getElementsByName(\"OWNER_GENDER\")[0].checked = true;\r\n\t\t\t}else{\r\n\t\t\t\topener.document.getElementsByName(\"OWNER_GENDER\")[1].checked = true;\r\n\t\t\t}\r\n\t\t\topener.document.getElementById(\"OWNER_AGE\").value = owner_age[hitFlag].value;\r\n\t\t\topener.document.getElementById(\"OWNER_POST\").value = owner_post[hitFlag].value;\r\n\t\t\topener.document.getElementById(\"OWNER_ADDR1\").value = owner_addr1[hitFlag].value;\r\n\t\t\topener.document.getElementById(\"OWNER_SAN\").value = owner_san[hitFlag].value;\r\n\r\n\t\t\topener.document.getElementById(\"OWNER_BONBUN\").value = cutText(owner_jibun[hitFlag].value,'-',0);\r\n\t\t\topener.document.getElementById(\"OWNER_BUBUN\").value = cutText(owner_jibun[hitFlag].value,'-',1);\r\n\t\t\t\r\n\t\t\topener.document.getElementById(\"OWNER_ADDR2\").value = owner_addr2[hitFlag].value;\r\n\t\t\topener.document.getElementById(\"OWNER_TOPOST\").value = owner_topost[hitFlag].value;\r\n\t\t\topener.document.getElementById(\"OWNER_TOADDR1\").value = owner_toaddr1[hitFlag].value;\r\n\t\t\topener.document.getElementById(\"OWNER_TOSAN\").value = owner_tosan[hitFlag].value;\r\n\t\t\t\r\n\t\t\topener.document.getElementById(\"OWNER_TOBONBUN\").value = cutText(owner_tojibun[hitFlag].value,'-',0);\r\n\t\t\topener.document.getElementById(\"OWNER_TOBUBUN\").value = cutText(owner_tojibun[hitFlag].value,'-',1);\r\n\r\n\t\t\topener.document.getElementById(\"OWNER_TOADDR2\").value = owner_toaddr2[hitFlag].value;\r\n\r\n\t\t\topener.document.getElementById(\"OWNER_TEL1\").value = cutText(owner_tel[hitFlag].value,'-',0);\r\n\t\t\topener.document.getElementById(\"OWNER_TEL2\").value = cutText(owner_tel[hitFlag].value,'-',1);\r\n\t\t\topener.document.getElementById(\"OWNER_TEL3\").value = cutText(owner_tel[hitFlag].value,'-',2);\r\n\r\n\t\t\topener.document.getElementById(\"OWNER_HP1\").value = cutText(owner_hp[hitFlag].value,'-',0);\r\n\t\t\topener.document.getElementById(\"OWNER_HP2\").value = cutText(owner_hp[hitFlag].value,'-',1);\r\n\t\t\topener.document.getElementById(\"OWNER_HP3\").value = cutText(owner_hp[hitFlag].value,'-',2);\r\n\r\n\t\t\tif(addr_check1[hitFlag].value == '1'){\r\n\t\t\t\topener.document.getElementById(\"ADDR_CHECK1\").checked = true;\r\n\t\t\t}else{\r\n\t\t\t\topener.document.getElementById(\"ADDR_CHECK1\").checked = false;\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\t\r\n\t\t\tvar lt_sel_list = opener.document.getElementById('LT_SEL').options;\r\n\r\n\t\t\tfor(var i = 0 ; i < lt_sel_list.length ; i++){\r\n\t\t\t\tif(lt_sel_list[i].value == lt_sel[hitFlag].value){\r\n\t\t\t\t\tlt_sel_list[i].selected = true;\r\n\t\t\t\t} \r\n\t\t\t}\r\n\t\t\t \r\n\t\t\tself.close();\r\n\r\n\t\t}\r\n\r\n\t\t\r\n\t}\r\n}\r\n\r\nfunction cutText(txt,sp,count){\r\n\r\n\tvar arrayTxt = txt.split(sp);\r\n\r\n\tif(arrayTxt.length == 1 && count == 0){\r\n\t\treturn arrayTxt[count];\r\n\t}else if(arrayTxt.length == 1 && count != 0){\r\n\t\treturn '';\r\n\r\n\t}\r\n\treturn arrayTxt[count];\r\n}\r\n\r\nfunction checkItem(obj){\r\n\tvar selectItems = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\r\n\tfor(var i = 0 ; i < selectItems.length ; i++){\r\n\t\tif(selectItems[i] == obj){\r\n\t\t\tif(selectItems[i].checked){\r\n\t\t\t\tcheckNum = i;\t\r\n\t\t\t}else{\r\n\t\t\t\tcheckNum = null;\r\n\t\t\t}\r\n\t\t}else{\r\n\t\t\tselectItems[i].checked = false;\r\n\t\t}\r\n\t}\r\n\t\r\n}\r\n\r\n</script>\r\n<link href=\"/css/pop.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n</head>\r\n\r\n<body onload=\"\">\r\n\r\n<form id=\"ownerListForm\" name=\"ownerListForm\" method=\"post\">\r\n\t<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td height=\"12\">\r\n\t\t\t\t<img src=\"/img/box_top_left.gif\" width=\"12\" height=\"12\"></td>\r\n\t\t\t<td background=\"/img/box_top_mid.gif\"></td>\r\n\t\t\t<td><img src=\"/img/box_top_right.gif\" width=\"12\" height=\"12\"></td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td width=\"12\" background=\"/img/box_left.gif\"></td>\r\n\t\t\t<td align=\"center\" valign=\"top\">\r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td al";
  private final static String _jspx_template13 = "ign=\"center\">\r\n\t\t\t\t\t<span class=\"sub_stan_blue\" style=\"font-size:12px\">운영자 조회 리스트</span>\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"10px\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"420px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t    <td valign=\"top\">\r\n\t\t\t\t\t\t      <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t        <tr>\r\n\t\t\t\t\t              <td width=\"26px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t        </tr>\r\n\t\t\t\t\t\t      </TABLE>\r\n\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t    <td width=\"383px\" valign=\"top\">\r\n\t\t\t\t\t\t      <div id=\"topLine2\" style=\"width:383px;overflow:hidden;\">\r\n\t\t\t\t\t\t        <TABLE width=\"500px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t          <tr >\r\n\t\t\t\t  \t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자</td>\r\n\t\t\t\t  \t\t\t\t\t<td width=\"120px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자 주민번호</td>\r\n\t\t\t\t  \t\t\t\t\t<td width=\"200px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자 주소</td>\r\n\t\t\t\t\t\t          </tr>\r\n\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t      </div>\r\n\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t    <TD width=\"26px\" valign=\"top\">\r\n\t\t\t\t\t\t      <DIV id=\"leftDisplay2\" style=\"width:26px;height:207px;overflow:hidden;\">\r\n\t\t\t\t\t\t        <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t          \t\t\t";
  private final static String _jspx_template14 = "\r\n\t\t\t\t  \t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor: pointer\">\r\n\t\t\t\t  \t\t\t\t\t\t<td width=\"26px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" NAME=\"SELECT_ITEM\" onclick=\"checkItem(this);\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"ITEM_CHECK\" value=\"\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_NAME\" value=\"";
  private final static String _jspx_template15 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_SSN\" value=\"";
  private final static String _jspx_template16 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_GENDER\" value=\"";
  private final static String _jspx_template17 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_AGE\" value=\"";
  private final static String _jspx_template18 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_POST\" value=\"";
  private final static String _jspx_template19 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_ADDR1\" value=\"";
  private final static String _jspx_template20 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_SAN\" value=\"";
  private final static String _jspx_template21 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_JIBUN\" value=\"";
  private final static String _jspx_template22 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_ADDR2\" value=\"";
  private final static String _jspx_template23 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_SAME\" value=\"";
  private final static String _jspx_template24 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_TOPOST\" value=\"";
  private final static String _jspx_template25 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_TOADDR1\" value=\"";
  private final static String _jspx_template26 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_TOSAN\" value=\"";
  private final static String _jspx_template27 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_TOJIBUN\" value=\"";
  private final static String _jspx_template28 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_TOADDR2\" value=\"";
  private final static String _jspx_template29 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_TEL\" value=\"";
  private final static String _jspx_template30 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_HP\" value=\"";
  private final static String _jspx_template31 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"ADDR_CHECK1\" value=\"";
  private final static String _jspx_template32 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"ADDR_CHECK2\" value=\"";
  private final static String _jspx_template33 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"LT_SEL\" value=\"";
  private final static String _jspx_template34 = "\">\r\n\t\t\t\t  \t\t\t\t\t\t</td>\r\n\t\t\t\t  \t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t    <TD width=\"400px\" valign=\"top\">\r\n\t\t\t\t\t\t      <DIV id=\"mainDisplay2\" style=\"width:400px;height:224px;overflow:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\" onscroll =\"scrollAll()\">\r\n\t\t\t\t\t\t        <TABLE width=\"500px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t          ";
  private final static String _jspx_template36 = "\r\n\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor: pointer\" onclick=\"selectRowOne('";
  private final static String _jspx_template37 = "');\">\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\">";
  private final static String _jspx_template38 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"120px\" align=\"center\"><script>document.write(addSSNDash('";
  private final static String _jspx_template39 = "'));</script></td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"200px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template40 = "&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t산\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template43 = " ";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template45 = "\t\r\n\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td height=\"5px\">\r\n\t\t\t\t</td>\r\n\t\t\t\t\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<img src=\"/img/select_icon2.gif\" alt=\"선택\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:Summit();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"self.close();\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t\t<td width=\"12\" background=\"/img/box_right.gif\"></td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td height=\"12\"><img src=\"/img/box_bottom_left.gif\" width=\"12\"\r\n\t\t\t\theight=\"12\"></td>\r\n\t\t\t<td background=\"/img/box_bottom_mid.gif\"></td>\r\n\t\t\t<td><img src=\"/img/box_bottom_right.gif\" width=\"12\" height=\"12\"></td>\r\n\t\t</tr>\r\n\t</table>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
