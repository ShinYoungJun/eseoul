package jeus_jspwork._jsp._menu._left;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_gapan_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return null;
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
      // jsp code [from=(4,3);to=(9,1)]
      
      	String menu_param = request.getParameter("menu_param");
      	if (menu_param == null) {
      		menu_param = "";
      	}

      out.write(_jspx_template1);
      // jsp code [from=(77,24);to=(77,34)]
      out.print(menu_param);

      out.write(_jspx_template2);
      out.write(_jspx_template3);

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
  private final static String _jspx_template1 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n\tmargin-right: 0px;\r\n\tmargin-bottom: 0px;\r\n\tbackground-image: url(../../img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n    function Init(menu_param)\r\n    {\r\n    \tif(menu_param != \"\")\r\n    \t{\r\n\t\t\tdocument.getElementById(\"jumyong\").className = \"leftM1\";\r\n\t\t\tdocument.getElementById(\"saewe\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"geoInfo\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"oldminwon\").className = \"leftM2\";\t\t\r\n\t\t\t//********** BEGIN_현진_20120220\r\n\t\t\tdocument.getElementById(\"statistics\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"bbs\").className = \"leftM2\";\r\n\t\t\t//********** END_현진_20120220\r\n    \t}\r\n    }\r\n\r\n\tfunction\tmenuBtn_chk(o)\r\n\t{\r\n\t\tdocument.getElementById(\"jumyong\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"saewe\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"geoInfo\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"oldminwon\").className = \"leftM2\";\t\r\n\t\t//********** BEGIN_현진_20120220\r\n\t\tdocument.getElementById(\"statistics\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"bbs\").className = \"leftM2\";\r\n\t\t//********** END_현진_20120220\r\n\t\tdocument.getElementById(o.id).className = \"leftM1\";\r\n\t}\r\n\r\n\tfunction popGeoInfo()\r\n\t{\r\n\r\n\t/** 지도페이지 사이즈 **/\r\n\t\t  var winW = screen.availWidth - 10;\t\r\n\t\t  var winH = screen.availHeight - 50;\r\n\t\t  /** 지도페이지 옵션 **/\r\n\t\t  var mapWinOpt = \"toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=yes,left=0px,top=0px,width=\"+winW+\"px,height=\"+winH+\"px\";\r\n\t\t  var mapWin = null;   \r\n\t\t\r\n\t\tvar url = \"/gapan/map/MapIndex.do\";\r\n\t    \tmapWin = window.open(url,\"mapWin\",mapWinOpt);\r\n\t    \tmapWin.focus();\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init('";
  private final static String _jspx_template2 = "')\">\r\n<table width=\"200px\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"center\" valign=\"top\">\r\n\t\t<table width=\"170px\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"17\">&nbsp;</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"35\"><img src=\"/img/sub9_title.gif\" alt=\"보도상영업시설관리\" width=\"170\" height=\"35\"></td>\r\n\t\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"center\" valign=\"top\" bgcolor=\"f8f8f8\" class=\"leftborder\">\r\n\t\t\t\t<table width=\"150\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"12\" colspan=\"2\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"29px\" height=\"29px\">\r\n\t\t\t\t\t\t\t<img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t\t<a href=\"/gapan/jumyong/search.do\" class=\"leftM2\" target=\"cont\" id=\"jumyong\" onClick=\"javascript:menuBtn_chk(this);\">점용허가 및 관리</a>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"27px\">\r\n\t\t\t\t\t\t\t<img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t\t<a href=\"/gapan/saewe/search.do\" class=\"leftM2\" target=\"cont\" id=\"saewe\" onclick=\"javascript:menuBtn_chk(this);\">세외수입 관리</a>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"27px\">\r\n\t\t\t\t\t\t\t<img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t\t<a href=\"/gapan/statistics/statistics.do\" class=\"leftM2\" target=\"cont\" id=\"statistics\" onclick=\"javascript:menuBtn_chk(this);\">\r\n\t\t\t\t\t\t\t\t통계관리\r\n\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29\"\r\n\t\t\t\t\t\t\theight=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t\t<div id=\"geoInfo\" onclick=\"javascript:menuBtn_chk(this);popGeoInfo();\" style=\"font-family돋움;font-size:12px;color:#858585;cursor:pointer;\">\r\n\t\t\t\t\t\t\t\t지리정보\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"27px\">\r\n\t\t\t\t\t\t\t<img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"/jumyong/oldminwon/search.do\" class=\"leftM2\" target=\"cont\" id=\"oldminwon\" onclick=\"javascript:menuBtn_chk(this);\">(구)민원행정 조회 </a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n        \t\t\t   <td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n   \t\t\t\t       </tr>\r\n   \t\t\t       <tr>\r\n   \t\t\t         <td height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n    \t\t        <td align=\"left\"><a href=\"/bbs/bbs_gapan.jsp\" class=\"leftM2\" target=\"cont\" id=\"bbs\" onClick=\"javascript:menuBtn_chk(this);\">게시판 및 연락처 </a> </td>\r\n       \t\t\t   </tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"12px\" colspan=\"2\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t</table>\r\n\t\t\t\t<!--좌측 메뉴시작--></td>\r\n\t\t\t</tr>\r\n\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n    <td height=\"174\" align=\"center\" valign=\"bottom\">\r\n<!--좌측하단 배너-->\r\n\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td><a href=\"http://98.33.4.164\" target=\"_blank\"><img src=\"/img/left_banner1.gif\" alt=\"서울시세외수입종합징수시스템\" width=\"176\" height=\"58\" border=\"0\"></a></td>\r\n      </tr>\r\n      <tr>\r\n        <td><a href=\"http://98.33.5.30\" target=\"_blank\"><img src=\"/img/left_banner2.gif\" alt=\"서울시민원행정정보시스템\" width=\"176\" height=\"47\" border=\"0\"></a></td>\r\n      </tr>\r\n      <tr>\r\n        <td><a href=\"http://98.33.1.136:8080\" target=\"_blank\"><img src=\"/img/left_banner3.gif\" alt=\"민원처리온라인공개시스템\" width=\"176\" height=\"52\" border=\"0\"></a></td>\r\n      </tr>\r\n\t\t<!--  //********** BEGIN_KANG_21020524 -->\r\n\t\t<tr>\r\n\t\t\t<td><a href=\"http://www.juso.go.kr/openIndexPage.do\" target=\"_blank\"><img src=\"/img/left_banner_juso.gif\" alt=\"도로명주소 안내시스템\" border=\"0\"></a></td>\r\n\t\t</tr>\r\n\t\t<!--   //********** END_KANG_21020524 -->\r\n\t\t<!-- sungh83 20131129 -->\r\n\t\t<tr><td height ='3'></td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td><a ";
  private final static String _jspx_template3 = "href=\"http://road.cpermit.go.kr/cap/discussion/index.jsp\" target=\"_blank\"><img src=\"/img/left_banner_roadinfo.gif\" alt=\"도로점용정보마당 안내시스템\" border=\"0\"></a></td>\r\n\t\t</tr>\r\n\t\t<!-- sungh83 20131129 -->          \r\n    </table>\r\n<!--좌측하단 배너 끝-->\r\n    </td>\r\n  </tr>\r\n\t<tr>\r\n\t\t<td height=\"60\" align=\"center\"></td>\r\n\t</tr>\r\n</table>\r\n</body>\r\n</html>\r\n";
}
