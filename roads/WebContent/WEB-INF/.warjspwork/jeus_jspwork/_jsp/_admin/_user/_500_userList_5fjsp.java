package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_userList_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/include.jsp",
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
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template8);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template9);
      out.write(_jspx_template10);
      // jsp code [from=(49,84);to=(49,90)]
      out.print(userId);

      out.write(_jspx_template11);
      // jsp code [from=(192,47);to=(192,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(195,47);to=(195,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${deptCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(196,43);to=(196,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${org_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(255,35);to=(255,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userGrade}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template19);
      // jsp code [from=(280,41);to=(280,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(339,111);to=(339,121)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template49);
      // jsp code [from=(392,27);to=(392,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(419,52);to=(419,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userGrade}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(420,51);to=(420,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${siguCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(421,49);to=(421,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${certYN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);

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
            out.write(_jspx_template16);
            // jsp code [from=(265,30);to=(265,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(265,45);to=(265,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);

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
            out.write(_jspx_template22);
            // jsp code [from=(369,36);to=(369,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(369,62);to=(369,71)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(370,31);to=(370,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(370,52);to=(370,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(370,73);to=(370,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(371,33);to=(371,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(371,56);to=(371,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(371,77);to=(371,90)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(373,57);to=(373,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(373,101);to=(373,110)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(374,57);to=(374,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(374,101);to=(374,119)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(375,57);to=(375,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(375,101);to=(375,112)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(376,57);to=(376,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(376,101);to=(376,114)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DEPT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(377,57);to=(377,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(377,101);to=(377,111)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(378,57);to=(378,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(378,101);to=(378,114)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(379,57);to=(379,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(379,101);to=(379,119)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQUEST_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(380,57);to=(380,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(380,101);to=(380,120)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.APPROVAL_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(381,57);to=(381,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(381,101);to=(381,121)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LAST_CONN_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);

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

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n           \r\n    //조회       \r\n\tfunction reSearch()\r\n\t{\t\r\n\t\tvar w = document.listForm;\r\n\t\t\r\n\t\tw.deptCode.value = result.listForm.deptCode.value; \r\n\t\tw.action = \"/admin/user/user.do\";\t\t\r\n\t\tw.submit();\t\t\t\r\n\t}\r\n\t\r\n\t//사용자정보 등록 팝업오픈\r\n\tfunction userEditPop()\r\n\t{\r\n\t    var winPosLeft = 'left='+(screen.width - 520) / 2; // 새창 x 좌표 \r\n  \t\tvar winPosTop = 'top='+(screen.height - 500 - 100) / 2; // 새창 y 좌표 \r\n  \t\tvar param = \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, \"+winPosLeft+\",\"+ winPosTop+\", width=520, height=600\";\r\n\r\n\t\twindow.open(\"/admin/user/userReg.do?input_type=pass&guCheck=1\",\"상세정보1\",param );\t\r\n\t}\r\n\t\r\n\t//사용자정보 수정 팝업오픈\r\n\tfunction userDetailPop(obj)\r\n\t{\t\r\n\t\tvar param = \"/admin/user/userDetail.do?userId=\"+obj+\"&input_type=pass&adId=\"+\"";
  private final static String _jspx_template11 = "\";\r\n\t    var winPosLeft = 'left='+(screen.width - 520) / 2; // 새창 x 좌표 \r\n  \t\tvar winPosTop = 'top='+(screen.height - 500 - 100) / 2; // 새창 y 좌표 \r\n  \t\tvar param1 = \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, \"+winPosLeft+\",\"+ winPosTop+\", width=520, height=600\";\r\n\t\t\r\n\t\twindow.open( param, \"상세정보2\", param1);\t\r\n\t}\r\n\t\r\n\t//등급별 메뉴사용자권한 팝업오픈\r\n\tfunction userAuthorityPop(obj)\r\n\t{\t\r\n\t\tvar w = document.listForm;\t\r\n\t\tvar rowCount = document.getElementById(\"listSize\").value;\t\t\t\t\r\n\t\tvar check_count = 0;\r\n\t\t\r\n\t\tfor(i=1; i<= rowCount; i++)\t{\t\r\n\t\t\tif(document.getElementById(\"checkbox\"+i).checked) { \t\r\n\t\t\t \tcheck_count++;\r\n\t\t\t }\r\n\t\t}\r\n\t\tif(check_count==0){\r\n\t\t\talert(\"사용자를 체크후 사용해 주세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(check_count>1){\r\n\t\t\talert(\"권한은 체크를 하나만 가능합니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t{\t\r\n\t\t\tif(document.getElementById(\"checkbox\"+i).checked)\r\n\t\t\t { \t\r\n\t\t\t  \tdocument.getElementById(\"deleteSeq\").value = document.getElementById(\"seq\"+i).value;\t\r\n\t\t\t  \tdocument.getElementById(\"user_grade\").value = document.getElementById(\"grade\"+i).value;\t\r\n\t\t\t\t\r\n\t\t\t}\t\t\t\r\n\t\t}\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\t//var param = \"/jsp/admin/user/userAuthorityPop.jsp\";\r\n\t\tvar param = \"/admin/user/userAuthority.do?user_id=\"+document.getElementById(\"deleteSeq\").value+\"&userGrade=\"+document.getElementById(\"user_grade\").value;\r\n\t\twindow.open( param, \"상세정보3\", \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, width=280, height=400\");\t\r\n\t}\t\r\n\t\r\n\t//행삭제\r\n\tfunction deleteRow()\r\n\t{\t\r\n\t\tvar w = document.listForm;\t\r\n\t\tvar rowCount = document.getElementById(\"listSize\").value;\r\n\t\t\r\n\t\tif(!confirm(\"삭제하시겠습니까?\"))\r\n\t\t\treturn;\r\n\t\t \r\n\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t{\t\r\n\t\t\tif(document.getElementById(\"checkbox\"+i).checked)\r\n\t\t\t { \t\r\n\t\t\t  \tdocument.getElementById(\"deleteSeq\").value = document.getElementById(\"seq\"+i).value;\t\r\n\t\t\t\tw.action = \"/admin/user/userDel.do\";\t\r\n\t\t\t\tw.submit();\r\n\t\t\t}\t\t\t\r\n\t\t}\r\n\t}\r\n\t\r\n\t//승인\r\n\tfunction fn_confirm()\r\n\t{\t\r\n\t\tvar w = document.listForm;\t\r\n\t\tvar rowCount = document.getElementById(\"listSize\").value;\r\n\t\t\r\n\t\tif(!confirm(\"승인하시겠습니까?\"))\r\n\t\t\treturn;\r\n\t\t\t\r\n\t\tw.modeType.value = \"confirm\";\t \r\n\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t{\t\r\n\t\t\tif(document.getElementById(\"checkbox\"+i).checked)\r\n\t\t\t { \t\r\n\t\t\t  \tdocument.getElementById(\"deleteSeq\").value = document.getElementById(\"seq\"+i).value;\t\r\n\t\t\t\tw.action = \"/admin/user/confirm.do\";\t\r\n\t\t\t\tw.submit();\r\n\t\t\t}\t\t\t\r\n\t\t}\r\n\t}\r\n\t\r\n\t//구코드 조회\r\n\tfunction guCodeList()\r\n\t{\t\r\n\t\tvar w = document.listForm;\r\n\t\tw.action = \"/admin/user/guCode.do\";\t\t\r\n\t}\t\r\n\t\r\n\t//구코드 변경시 부서코드list 조회\r\n\tfunction fn_guChange()\r\n\t{\r\n\t\tvar sigucd = document.listForm.siguCode.value;\t\t\t\r\n\t\tresult.getDeptCode(sigucd,\"list\");  \r\n\t}\r\n\t\r\n\t//전체선택\r\n\tfunction fn_allSelect()\t\r\n\t{\r\n\t\tvar w = document.listForm;\t\r\n\t\tvar rowCount = document.getElementById(\"listSize\").value;\r\n\t\t\r\n\t\tif (w.allCheck.checked)\r\n\t\t{\r\n\t\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t\t{\t\r\n\t\t\t\tdocument.getElementById(\"checkbox\"+i).checked = true;\t\r\n\t\t\t}\t\r\n\t\t}\r\n\t\telse\t\t \r\n\t\t{\r\n\t\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t\t{\t\r\n\t\t\t\tdocument.getElementById(\"checkbox\"+i).checked = false;\t\t\t\t\t\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction test()\r\n\t{\r\n\t\tvar w = document.listForm;\t\r\n\t\talert(\"w.test.value=\"+w.test.value); \r\n\t}\r\n\t\r\n\tfunction init()\r\n\t{\t\r\n\t\tif(document.getElementById(\"siguCode\").value == \"\")\t\r\n\t\t\tdocument.getElementById(\"siguCode\").disabled = false;\t\t\r\n\t\tif(document.getElementById(\"org_cd\").value == \"0000000\"){\r\n\t\t\tdocument.getElementById(\"siguCode\").disabled = false;\t\r\n\t\t}\r\n\t\tfn_guChange();\t\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"init();\">\r\n<form name=\"listForm\" method=\"post\">\r\n<input name=\"listSize\" id=\"listSize\" value=\"";
  private final static String _jspx_template12 = "\" type=\"hidden\">\r\n<input name=\"deleteSeq\" id=\"deleteSeq\" type=\"hidden\">\r\n<input name=\"modeType\" type=\"hidden\" value=\"del\">\r\n<input name=\"deptCode\" id=\"deptCode\" value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\">\r\n<input name=\"org_cd\" id=\"org_cd\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\">\r\n<input name=\"user_grade\" id=\"user_grade\" type=\"hidden\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont1_title.gif\" width=\"800\"\r\n\t\t\theight=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<!-- \t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"8\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/help_icon.gif\" alt=\"도움말\"\r\n\t\t\t\t\t\t\twidth=\"65\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t -->\t\t\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/sub_admin_title1.gif\" width=\"110\"\r\n\t\t\t\t\t\t\t\t\theight=\"22\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\tcellspacing=\"0\" class=\"sub_table\">\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">사용자 등급</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select\r\n\t\t\t\t\t\t\t\t\t\t\tname=\"userGrade\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\t\t\tstyle=\"width:140px\"> ";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">사용자 소속</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"10%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><select\r\n\t\t\t\t\t\t\t\t\t\t\tname=\"siguCode\" id=\"siguCode\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\t\t\tstyle=\"width:100px\" onchange=\"fn_guChange();\" disabled>\r\n\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">기관선택</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"";
  private final static String _jspx_template17 = "\">";
  private final static String _jspx_template18 = "</option>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template19 = "\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t</select> \r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\t\r\n\t\t\t\t\t\t\t\t\t\t\t<iframe height=\"20\" width=\"100\" name=\"result\" src=\"/admin/user/deptCode.do\" frameborder=\"0\" scrolling=\"no\" marginwidth=\"0\" marginheight=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t</iframe>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">이 름</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\t\t\tname=\"userName\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\t\t\tstyle=\"width:120px\" value=\"";
  private final static String _jspx_template20 = "\"></td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인증여부</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\"><select\r\n\t\t\t\t\t\t\t\t\t\t\tname=\"certYN\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t<option value=\"N\">미인증</option>\r\n\t\t\t\t\t\t\t\t\t\t\t<option value=\"Y\">인증</option>\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\"><img\r\n\t\t\t\t\t\t\t\t\tsrc=\"/img/search_icon.gif\" alt=\"조회\" width=\"56\" height=\"18\"\r\n\t\t\t\t\t\t\t\t\tborder=\"0\" onClick=\"javascript:reSearch();\" style=\"cursor:pointer\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"30\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/sub_admin_title2.gif\" width=\"110\"\r\n\t\t\t\t\t\t\t\t\theight=\"22\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><img src=\"/img/new_icon.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\talt=\"신규\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:userEditPop();\" style=\"cursor:pointer\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<td><img src=\"/img/del_icon.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\talt=\"삭제\" width=\"34\" height=\"18\" border=\"0\" onClick=\"javascript:deleteRow();\" style=\"cursor:pointer\";></td>\t\r\n\t\t\t\t\t\t\t\t\t    <td><img src=\"/img/confirm.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\talt=\"승인\" width=\"34\" height=\"18\" border=\"0\" onClick=\"javascript:fn_confirm();\" style=\"cursor:pointer\";></td>\t\r\n\t\t\t\t\t\t\t\t\t    <td><img src=\"/img/authority.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\talt=\"권한\" width=\"34\" height=\"18\" border=\"0\" onClick=\"javascript:userAuthorityPop();\" style=\"cursor:pointer\";></td>\r\n\t\t\t\t\t\t\t\t\t    \r\n\t\t\t\t\t\t\t\t\t    <td width=\"100%\" height=\"34\" class=\"sub_stan\" align=\"right\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template21 = "</span> 건 </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\tcellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"allCheck\" id=\"allCheck\" type=\"checkbox\" value=\"checkbox\" onclick=\"fn_allSelect();\" >\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사용자등급</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소속기관</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소속부서</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">이름</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">아이디</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">ID신청일</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">ID승인일</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종접속일</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\"\r\n\t\t\t\t\t\t\t\t\t\t\tonMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" height=\"26\">\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"checkbox";
  private final static String _jspx_template23 = "\" id=\"checkbox";
  private final static String _jspx_template24 = "\" type=\"checkbox\" value=\"checkbox\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"seq";
  private final static String _jspx_template25 = "\" id=\"seq";
  private final static String _jspx_template26 = "\" value=\"";
  private final static String _jspx_template27 = "\" type=\"hidden\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"grade";
  private final static String _jspx_template28 = "\" id=\"grade";
  private final static String _jspx_template29 = "\" value=\"";
  private final static String _jspx_template30 = "\" type=\"hidden\">\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onClick=\"userDetailPop('";
  private final static String _jspx_template31 = "');\" style=\"cursor:pointer\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onClick=\"userDetailPop('";
  private final static String _jspx_template33 = "');\" style=\"cursor:pointer\">";
  private final static String _jspx_template34 = "</td>\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onClick=\"userDetailPop('";
  private final static String _jspx_template35 = "');\" style=\"cursor:pointer\">";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onClick=\"userDetailPop('";
  private final static String _jspx_template37 = "');\" style=\"cursor:pointer\">";
  private final static String _jspx_template38 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onClick=\"userDetailPop('";
  private final static String _jspx_template39 = "');\" style=\"cursor:pointer\">";
  private final static String _jspx_template40 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onClick=\"userDetailPop('";
  private final static String _jspx_template41 = "');\" style=\"cursor:pointer\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onClick=\"userDetailPop('";
  private final static String _jspx_template43 = "');\" style=\"cursor:pointer\">";
  private final static String _jspx_template44 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onClick=\"userDetailPop('";
  private final static String _jspx_template45 = "');\" style=\"cursor:pointer\">";
  private final static String _jspx_template46 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onClick=\"userDetailPop('";
  private final static String _jspx_template47 = "');\" style=\"cursor:pointer\">";
  private final static String _jspx_template48 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template49 = "\r\n\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<!-- 페이징시작 -->";
  private final static String _jspx_template50 = "<!-- 페이징끝 -->\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\"><a href=\"#\"><img\r\n\t\t\t\t\tsrc=\"/img/result_icon.gif\" alt=\"결과 출력\" width=\"74\" height=\"22\"\r\n\t\t\t\t\tborder=\"0\"></a><a href=\"#\"><img src=\"/img/excel_icon.gif\"\r\n\t\t\t\t\talt=\"EXCEL 변환\" width=\"94\" height=\"22\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"30\"></td>\r\n\t</tr>\r\n</table>\r\n<script language=\"javascript\">\r\n<!--\r\n\tsetSelectedOption(document.listForm.userGrade, \"";
  private final static String _jspx_template51 = "\");\r\n\tsetSelectedOption(document.listForm.siguCode, \"";
  private final static String _jspx_template52 = "\");\r\n\tsetSelectedOption(document.listForm.certYN, \"";
  private final static String _jspx_template53 = "\");\r\n//-->\r\n</script> \r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
