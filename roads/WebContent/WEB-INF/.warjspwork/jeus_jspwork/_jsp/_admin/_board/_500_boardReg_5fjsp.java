package jeus_jspwork._jsp._admin._board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_boardReg_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_0.setPageContext(pageContext);
      _jspx_th_spring_bind_0.setPath("boardReg.TITLE");
      try {
        try {
          int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
          if (_jspx_eval_spring_bind_0 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template10);
              // jsp code [from=(119,107);to=(119,121)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${boardReg.TITLE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template11);

            } while (_jspx_th_spring_bind_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_0.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_0.doCatch(t);
        } finally {
          _jspx_th_spring_bind_0.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_0.release();
      }

      out.write(_jspx_template12);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_1.setPageContext(pageContext);
      _jspx_th_spring_bind_1.setPath("boardReg.USER_ID");
      try {
        try {
          int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
          if (_jspx_eval_spring_bind_1 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template13);
              // jsp code [from=(125,110);to=(125,126)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${boardReg.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template14);

            } while (_jspx_th_spring_bind_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_1.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_1.doCatch(t);
        } finally {
          _jspx_th_spring_bind_1.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_1.release();
      }

      out.write(_jspx_template15);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_2.setPageContext(pageContext);
      _jspx_th_spring_bind_2.setPath("boardReg.PUBLIC_YN");
      try {
        try {
          int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
          if (_jspx_eval_spring_bind_2 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template16);

            } while (_jspx_th_spring_bind_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_2.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_2.doCatch(t);
        } finally {
          _jspx_th_spring_bind_2.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_2.release();
      }

      out.write(_jspx_template17);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_3 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_3.setPageContext(pageContext);
      _jspx_th_spring_bind_3.setPath("boardReg.NOTICE_FROMDATE");
      try {
        try {
          int _jspx_eval_spring_bind_3 = _jspx_th_spring_bind_3.doStartTag();
          if (_jspx_eval_spring_bind_3 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template18);

            } while (_jspx_th_spring_bind_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_3.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_3.doCatch(t);
        } finally {
          _jspx_th_spring_bind_3.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_3.release();
      }

      out.write(_jspx_template19);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_4 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_4.setPageContext(pageContext);
      _jspx_th_spring_bind_4.setPath("boardReg.NOTICE_TODATE");
      try {
        try {
          int _jspx_eval_spring_bind_4 = _jspx_th_spring_bind_4.doStartTag();
          if (_jspx_eval_spring_bind_4 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template20);

            } while (_jspx_th_spring_bind_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_4.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_4.doCatch(t);
        } finally {
          _jspx_th_spring_bind_4.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_4.release();
      }

      out.write(_jspx_template21);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_5 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_5.setPageContext(pageContext);
      _jspx_th_spring_bind_5.setPath("boardReg.CONTENT");
      try {
        try {
          int _jspx_eval_spring_bind_5 = _jspx_th_spring_bind_5.doStartTag();
          if (_jspx_eval_spring_bind_5 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template22);
              // jsp code [from=(177,90);to=(177,106)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${boardReg.CONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template23);

            } while (_jspx_th_spring_bind_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_5.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_5.doCatch(t);
        } finally {
          _jspx_th_spring_bind_5.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_5.release();
      }

      out.write(_jspx_template24);

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
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody { \r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script type=\"text/javascript\">\r\n           \r\n\tfunction submitClick()\r\n\t{\t\r\n\t\tvar w = document.regForm;\r\n\r\n\t\tif(w.PUBLIC_YN.value==\"5\"){\r\n\t\t\tif(!confirm(\"팝업 공지는 기간이 중복되지 않게 등록 하셔야 합니다.\\n등록하시겠습니까?\")){\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(!checkStrNVMsg(w.TITLE,\"제목\")) return;\r\n\t\tif(!checkStrNVMsg(w.USER_ID,\"작성자\")) return;\r\n\t\tif(!checkStrNVMsg(w.CONTENT,\"내용\")) return;\r\n\t\tif(!checkStrNVMsg(w.PUBLIC_YN,\"공개여부\")) return;\r\n\t\tif(!checkStrNVMsg(w.NOTICE_FROMDATE,\"공지시작 날짜\")) return;\r\n\t\tif(!checkStrNVMsg(w.NOTICE_TODATE,\"공지종료 날짜\")) return;\r\n\r\n\t    if(w.NOTICE_FROMDATE.value > w.NOTICE_TODATE.value)\r\n\t\t{ \r\n\t\t\talert(\"시작일자는 종료일자보다 클수없습니다!\");\r\n\t\t\tw.NOTICE_FROMDATE.select();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tw.action = \"/admin/boardReg.do\";\t\t\r\n\t\tw.submit();\t\t\t\t\t\r\n\t}\r\n\t\r\n\t//숫자만 입력\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\r\n\t \tif ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)\r\n\t \t{\r\n\t\t  \twindow.event.returnValue = true;\r\n\t\t\treturn;\r\n\t \t}else {\t \r\n\t \t\twindow.event.returnValue = false;\r\n\t \t\treturn;\r\n \t \t}\r\n\t}\r\n\t\r\n</script>\r\n\r\n<body>\r\n<form name=\"regForm\" id=\"regForm\" method=\"post\">\r\n<input name=\"modeType\" type=\"hidden\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/admin_cont7_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td align=\"center\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"40\" align=\"right\">\r\n\t<!--상단 기안문상신,도움말 메뉴-->\r\n\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"8\"></td>\r\n            </tr>\r\n          <tr>\r\n            <td><a href=\"#\"><img src=\"/img/help_icon.gif\" alt=\"도움말\" width=\"65\" height=\"18\" border=\"0\"></a></td>\r\n            </tr>\r\n        </table>\r\n\t<!--상단 기안문상신,도움말 메뉴-->\t\t</td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td><img src=\"/img/sub_admin_title15.gif\" width=\"110\" height=\"22\"></td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n          <tr>\r\n            <td align=\"left\" class=\"contborder_blue\">\r\n           \r\n            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n              <tr>\r\n                <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                    <tr>\r\n                      <td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">제 목</td>\r\n                      <td width=\"30%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                      \t";
  private final static String _jspx_template10 = "\r\n                        \t<input name=\"TITLE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template11 = "\">";
  private final static String _jspx_template12 = "</td>\r\n                      <td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작성자</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                        <tr>\r\n                          <td>\r\n                          ";
  private final static String _jspx_template13 = "\r\n                          \t<input name=\"USER_ID\" type=\"text\" class=\"input_form1\" style=\"width:80px\" value=\"";
  private final static String _jspx_template14 = "\">";
  private final static String _jspx_template15 = "</td>\r\n                        </tr>\r\n                      </table></td>\r\n                    </tr>\r\n                    \t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\" class=\"sub_table\">\r\n                    <tr>\r\n                      <td width=\"15%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공개여부</td>\r\n                      <td width=\"30%\" colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                      ";
  private final static String _jspx_template16 = "\r\n\t                      <select name=\"PUBLIC_YN\" class=\"input_form1\" style=\"width:100px\">\r\n\t                        <option value=\"\">선택하세요</option>\r\n\t                        <option value=\"1\">서울시공지</option>\r\n\t                        <option value=\"2\">자치구공지</option>\r\n\t                        <option value=\"3\">전체공개</option>\r\n\t                        <option value=\"4\">비공개</option>\r\n\t                        <option value=\"5\">팝업공지</option>\r\n\t                      </select>";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">공지예약</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"NOTICE_FROMDATE\" type=\"text\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:80px;ime-mode:disabled\" onkeydown=\"onlyNumberInput();\")>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/calendar_icon.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('NOTICE_FROMDATE'), 'yyyymmdd');\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"NOTICE_TODATE\" type=\"text\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:80px;ime-mode:disabled\" onkeydown=\"onlyNumberInput();\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/calendar_icon.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('NOTICE_TODATE'), 'yyyymmdd');\"></a>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n              <tr>\r\n    \t\t  \t<td height=\"15\"></td>\r\n  \t\t\t  </tr>\r\n              <tr>\r\n              \t<td colspan=\"10\" align=\"center\" valign=\"top\">\r\n              \t\t";
  private final static String _jspx_template22 = "\r\n         \t\t\t\t<textarea name=\"CONTENT\" class=\"text_box\" style=\"width:97%;height:300px\" >";
  private final static String _jspx_template23 = "</textarea>\r\n           \t  \t\t";
  private final static String _jspx_template24 = "\r\n           \t  \t</td>\r\n              </tr>\r\n            </table>\r\n          \r\n            </td>\r\n          </tr>\r\n          \r\n        </table></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"10\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td  align=\"right\">\r\n        \t<a href=\"#\"><img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\"></a>\r\n        \t <a href=\"/admin/board.do\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n        </td>\r\n      </tr>     \r\n    </table></td>\r\n  </tr>\r\n  <tr>\r\n    <td height=\"30\"></td>\r\n  </tr>\r\n</table>\r\n</td>\r\n</tr>\r\n</table>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
