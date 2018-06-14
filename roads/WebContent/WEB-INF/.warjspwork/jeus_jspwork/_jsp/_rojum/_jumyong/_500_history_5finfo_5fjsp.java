package jeus_jspwork._jsp._rojum._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_history_5finfo_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(50,15);to=(50,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath }",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(50,27);to=(50,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin.OWNER_IMG_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(113,81);to=(113,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(113,101);to=(113,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(125,63);to=(125,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(126,47);to=(126,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(170,55);to=(170,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(179,76);to=(179,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(180,77);to=(180,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(187,182);to=(187,190)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(187,202);to=(187,213)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(209,182);to=(209,190)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(209,202);to=(209,213)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);

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
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\"\r\n\tsrc=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n\t//         \r\n\r\n\tfunction iFrameResize(obj) {\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\t\tiFrm.style.height = the_height + \"px\";\r\n\t}\r\n\r\n\tfunction Init() {\r\n\t\thistoryBack = document.referrer;\r\n\r\n\t}\r\n\r\n\tvar historyBack = '';\r\n\tvar w, h;\r\n\tvar max_w = 150; //창의 가로크기, 이미지의 최대 크기가 된다.\r\n\timg_src = \"";
  private final static String _jspx_template10 = "\"; //이미지의 주소, img1의 src속성과 같아야 한다.\r\n\r\n\tfunction img_resize()\r\n\t{\r\n\t\tvar i = eval(document.all.img1);\r\n\t \tw = i.width;\r\n\t \th = i.height;\r\n\t\tif(w > max_w)\r\n\t \t{\r\n\t  \t\ti.width = max_w;\r\n\t \t}\r\n\t}\r\n\t\r\n\tfunction \tTab_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg2\t= document.getElementById(\"unyong_img\");\r\n\t\tvar\timg4\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg2.src\t= \"/img/sub_gapan_title4_off.gif\";\r\n\t\timg4.src\t= \"/img/sub_petition_title10_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"unyong\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_gapan_title4_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg4.src\t\t= \"/img/sub_petition_title10_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\r\n\tfunction Tab_Unyong(gapanno) {\r\n\t\tvar tab = document.getElementById(\"CURRENT_TABUP\");\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\r\n\t\tif (tab.value == \"unyong\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value = \"unyong\";\r\n\r\n\t\tvar tabs = document.getElementById(\"tabUp\");\r\n\t\ttabs.src = \"/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=\" + gapanno\r\n\t\t\t\t+ \"&SECTION=\" + section;\r\n\t}\r\n\r\n\tfunction Tab_Jumji(gapanno) {\r\n\t\tvar tab = document.getElementById(\"CURRENT_TABUP\");\r\n\r\n\t\tif (tab.value == \"jumji\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value = \"jumji\";\r\n\r\n\t\tvar tabs = document.getElementById(\"tabUp\");\r\n\t\ttabs.src = \"/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=\" + gapanno;\r\n\t}\r\n\r\n\tfunction PopupDisUse() {\r\n\t\tif (document.getElementById(\"DlgDisuse\").style.display == \"none\") {\r\n\t\t\tdocument.getElementById(\"DisFrm\").src = \"/rojum/jumyong/disUse.do?ADMIN_NO=";
  private final static String _jspx_template11 = "&SECTION=";
  private final static String _jspx_template12 = "\";\r\n\t\t\tMessageDisplay('DlgDisuse', 'DlgDisuseMain', 1);\r\n\t\t} else {\r\n\t\t\tMessageDisplay('DlgDisuse', 'DlgDisuseMain', 0);\r\n\t\t}\r\n\t}\r\n\r\n\t//\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n\t<form id=\"form\" name=\"form\" method=\"post\">\r\n\t\t<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\t\t<input id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\">\r\n\t\t<input type=\"hidden\" id=\"CURRENT_TABUP\" name=\"CURRENT_TABUP\" value=\"minwon\"> \r\n\t\t<input type=\"hidden\" id=\"CURRENT_TABDOWN\" name=\"CURRENT_TABDOWN\" value=\"product\"> \r\n\t\t<div id=\"DlgDisuse\" style=\"position: absolute;display: none;\">\r\n\t\t\t<table id=\"DlgDisuseMain\" width=\"500\" height=\"100px\" border=\"2\" bordercolor=\"#f05175\" style=\"border-collapse: collapse; background-color: white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"20px\" align=\"center\">\r\n\t\t\t\t\t\t<font color=\"red\">\r\n\t\t\t\t\t\t\t닫으실려면 폐쇄버튼을 다시 눌러주세요.\r\n\t\t\t\t\t\t</font>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<table width=\"510\" height=\"90px\" border=\"0\" style=\"border-collapse: collapse; background-color: white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t<iframe width=\"100%\" height=\"100%\" id=\"DisFrm\" name=\"DisFrm\" align=\"middle\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\"></iframe>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</div>\r\n\r\n\t\t<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"43\">\r\n\t\t\t\t\t<img src=\"/img/sub7_cont1_title.gif\" width=\"800\" height=\"43\">\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td align=\"right\" class=\"sub_table_b\">관리번호 : ";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t        <tr>\r\n\t\t\t\t\t\t\t\t            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n\t\t\t\t\t\t\t\t            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t                <tr>                 \r\n\t\t\t\t\t\t\t\t                  <td width=\"111\"><a href=\"javascript:Tab_Jumji('";
  private final static String _jspx_template16 = "')\"><img id=\"jumji_img\" name=\"jumji_img\" src=\"/img/sub_petition_title10_off.gif\" alt=\"시설/운영 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t                  <td width=\"111\"><a href=\"javascript:Tab_Unyong('";
  private final static String _jspx_template17 = "')\"><img id=\"unyong_img\" name=\"unyong_img\" src=\"/img/sub_gapan_title4_off.gif\" alt=\"운영자 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t                </tr>\r\n\t\t\t\t\t\t\t\t            </table>\r\n\t\t\t\t\t\t\t\t            </td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp\" name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=";
  private final static String _jspx_template18 = "&SECTION=";
  private final static String _jspx_template19 = "\"></iframe>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"60\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/popup_disuse.gif\" alt=\"폐쇄처리\" border=\"0\" onclick=\"javascript:PopupDisUse();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\" onclick=\"history.back();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"111\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/sub_rojum_title1_on.gif\" alt=\"이력조회\" width=\"110\" height=\"22\" border=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<iframe width=\"100%\" height=\"100%\" id=\"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/rojum/jumyong/owner_history.do?GAPAN_NO=";
  private final static String _jspx_template20 = "&SECTION=";
  private final static String _jspx_template21 = "\"></iframe>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\t</form>\r\n\r\n</body>\r\n</html>";
}
