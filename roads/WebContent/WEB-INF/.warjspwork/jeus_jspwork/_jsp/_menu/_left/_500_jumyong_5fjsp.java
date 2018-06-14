package jeus_jspwork._jsp._menu._left;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumyong_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template10);
      // jsp code [from=(6,3);to=(12,1)]
      
      	String menu_param = request.getParameter("menu_param");
      	//********** BEGIN_KANG_20120418
      	String grade = request.getParameter("grade");
      	//********** END_KANG_20120418
      	if(menu_param == null){ menu_param = ""; }

      out.write(_jspx_template11);
      out.write(_jspx_template12);
      // jsp code [from=(168,24);to=(168,35)]
      out.print(menu_param );

      out.write(_jspx_template13);
      out.write(_jspx_template14);
      // jsp code [from=(364,21);to=(364,26)]
      out.print(grade);

      out.write(_jspx_template15);
      // jsp code [from=(365,16);to=(365,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${org_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(366,17);to=(366,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dept_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);

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
  private final static String _jspx_template0 = "\r\n   ";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template11 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n\tmargin-right: 0px;\r\n\tmargin-bottom: 0px;\r\n\tbackground-image: url(../../img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n    function Init(menu_param)\r\n    {\r\n    \tif(menu_param != \"\")\r\n    \t{\r\n    \t\tdocument.getElementById(\"minwon\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"jumyong\").className = \"leftM1\";\r\n\t\t\tdocument.getElementById(\"junggi\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"saewe\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"gigan\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"oldminwon\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"bbs\").className = \"leftM2\";\r\n\t\t\t//********** BEGIN_KANG_20120417\r\n\t\t\tdocument.getElementById(\"statistics\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"stat0\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"stat1\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"stat2\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"stat3\").className = \"leftM2\";\r\n\t\t\t//********** END_KANG_20120417\r\n    \t}\r\n    \tvar myDate = new Date();\r\n\t\t  var years = myDate.getFullYear();\r\n\t\t  \r\n\t\t  var inquiryElements = document.createElement('ul');\r\n\t\t  inquiryElements.className=\"sub_table\";\r\n\t\t  //inquiryElements.style.paddingLeft = \"30px\";\r\n\t\t  inquiryElements.style.marginTop = \"0\";\r\n\t\t  inquiryElements.style.textAlign = \"left\";\r\n\t\t  inquiryElements.style.listStyleType  = \"none\";\r\n\t\t  \r\n\t\t  var inquiryInnerHtml = \"<li>\";\r\n\t\t  inquiryInnerHtml += \"<a href='/bbs/bbs_inquiry.jsp' class='leftM2' target='cont' name='inquiryA' id='inquiry0' onclick='javascript:menuBtn_chk(this);'>- 전체</a></li>\";\r\n\t\t  \r\n\t\t   inquiryInnerHtml += \"<li>\";\r\n\t\t   inquiryInnerHtml +=\"<a href='/bbs/jumyong_term_inquiry.action?from=\"+parseInt(years-4)+\"' class='leftM2' target='cont'  name='inquiryA' id='inquiry\"+parseInt(years-4)+\"' onclick='menuBtn_chk(this);'>- \" + parseInt(years-4) +\" 년도 이전</a></li>\"\r\n\t\t  for(var idx=3; idx>=0; idx--){\r\n\t\t\t  inquiryInnerHtml += \"<li>\";\r\n\t\t\t  inquiryInnerHtml += \"<a href='/bbs/jumyong_term_inquiry.action?from=\"+parseInt(years-idx)+\"' class='leftM2' target='cont''  name='inquiryA' id='inquiry\"+parseInt(years-idx)+\"' onclick='menuBtn_chk(this);'>- \" + parseInt(years-idx) +\" 년도</a></li>\";\r\n\t\t  }\r\n\t\r\n\t\t  inquiryElements.innerHTML=inquiryInnerHtml;\r\n\t\t  \r\n\t\t  document.getElementById(\"inquirySub\").appendChild(inquiryElements);\r\n    }\r\n    \r\n\tfunction\tmenuBtn_chk(o)\r\n\t{\r\n\t\tdocument.getElementById(\"minwon\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"jumyong\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"junggi\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"saewe\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"gigan\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"oldminwon\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"bbs\").className = \"leftM2\";\r\n\t\t//********** BEGIN_KANG_20120417\t\t\r\n\t\tif(o.id.substr(0,4) != \"stat\"){\r\n\t\t\tdocument.getElementById(\"statistics\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"statisticsSub\").style.display = \"none\";\r\n\t\t\tcheck = 0;\r\n\t\t}\t\t\r\n\t\tdocument.getElementById(\"stat0\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"stat1\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"stat2\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"stat3\").className = \"leftM2\";\r\n\t\t//********** END_KANG_20120417\r\n\t\t\r\n\t\tif(o.id.substr(0,4) != \"inqu\"){\r\n\t\t\tdocument.getElementById(\"inquiry\").className = \"leftM2\";\r\n\t\t\tdocument.getElementById(\"inquirySub\").style.display = \"none\";\r\n\t\t}\t\r\n\t\t\r\n\t\tfor(var idx=0; idx<document.getElementsByName(\"inquiryA\").length; idx++){\r\n\t\t\tdocument.getElementsByName(\"inquiryA\")[idx].className = \"leftM2\"; \r\n\t\t}\r\n\t\t\r\n\t\tdocument.getElementById(o.id).className = \"leftM1\";\r\n\t}\r\n\t\r\n\t//********** BEGIN_KANG_20120417\r\n\tvar check = 0;\r\n\tfunction\tsubMenuClick(type){\r\n\t\tvar disInfo = ";
  private final static String _jspx_template12 = "document.getElementById(\"inquirySub\").style.display;\r\n\t\tif(type=='inquiry'){\r\n\t\t\tif(disInfo == 'none'){\r\n\t\t\t\tdocument.getElementById(\"inquirySub\").style.display = \"block\";\r\n\t\t\t\tmenuBtn_chk(document.getElementById(\"inquiry\"));\t\t\t\r\n\t\t\t}else{\r\n\t\t\t\tdocument.getElementById(\"inquirySub\").style.display = \"none\";\r\n\t\t\t\tmenuBtn_chk(document.getElementById(\"inquiry\"));\t\r\n\t\t\t}\r\n\t\t\t//menuBtn_chk(document.getElementById(\"inquiry\").getElementByTagName(\"li\"));\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\tif(check == 0){\r\n\t\t\t\tdocument.getElementById(\"statisticsSub\").style.display = \"block\";\r\n\t\t\t\tmenuBtn_chk(document.getElementById(\"statistics\"));\t\t\t\r\n\t\t\t\tcheck = 1;\t\t\t\r\n\t\t\t}else{\r\n\t\t\t\tdocument.getElementById(\"statisticsSub\").style.display = \"none\";\t\t\t\r\n\t\t\t\tmenuBtn_chk(document.getElementById(\"statistics\"));\t\r\n\t\t\t\tcheck = 0;\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t//********** END_KANG_20120417\r\n\r\n\tfunction popGeoInfo(){\r\n\t/** 지도페이지 사이즈 **/\r\n\t\t  var winW = screen.availWidth - 10;\t\r\n\t\t  var winH = screen.availHeight - 50;\r\n\t\t  /** 지도페이지 옵션 **/\r\n\t\t  var mapWinOpt = \"toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=yes,left=0px,top=0px,width=\"+winW+\"px,height=\"+winH+\"px\";\r\n\t\t  var mapWin = null;   \r\n\t\t\r\n\t\tvar url = \"/jumyong/map/MapIndex.do\";\r\n\t    \tmapWin = window.open(url,\"mapWin\",mapWinOpt);\r\n\t    \tmapWin.focus();\r\n\t}\r\n\r\n\tvar check2 = 0;\r\n\tfunction displayTerm() {\r\n\t\tif(check2 == 0){\r\n\t\t\tdocument.getElementById(\"termSub\").style.display = \"block\";\r\n\t\t\tmenuBtn_chk(document.getElementById(\"inquiry\"));\t\t\t\r\n\t\t\tcheck2 = 1;\t\t\t\r\n\t\t}else{\r\n\t\t\tdocument.getElementById(\"termSub\").style.display = \"none\";\t\t\t\r\n\t\t\tmenuBtn_chk(document.getElementById(\"inquiry\"));\t\r\n\t\t\tcheck2 = 0;\r\n\t\t}\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init('";
  private final static String _jspx_template13 = "')\">\r\n<table width=\"200px\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"center\" valign=\"top\">\r\n\t\t<table width=\"170px\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td height=\"17px\">&nbsp;</td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td height=\"35px\"><img src=\"/img/sub1_title.gif\" alt=\"점용관리\" width=\"170px\" height=\"35px\"></td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\" valign=\"top\" bgcolor=\"f8f8f8\" class=\"leftborder\">\r\n\t\t\t<!--좌측 메뉴시작-->\r\n\t\t\t<table width=\"150px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"12px\" colspan=\"2\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"29px\" height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t<td align=\"left\"><a href=\"/jumyong/minwon/search.do\" class=\"leftM1\" target=\"cont\" id=\"minwon\" onclick=\"javascript:menuBtn_chk(this);\">민원접수 및 등록</a> </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t<td align=\"left\"><a href=\"/jumyong/jumyong/search.do?doSearch=none\" class=\"leftM2\" target=\"cont\" id=\"jumyong\" onclick=\"javascript:menuBtn_chk(this);\">점용허가 및 관리</a> </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t<td align=\"left\"><a href=\"/jumyong/saewe/search.do?doSearch=none\" class=\"leftM2\" target=\"cont\" id=\"saewe\" onclick=\"javascript:menuBtn_chk(this);\">세외수입 관리</a> </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t<td align=\"left\"><a href=\"/jumyong/gigan/search.do\" class=\"leftM2\" target=\"cont\" id=\"gigan\" onclick=\"javascript:menuBtn_chk(this);\">기간 연장</a> </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t<td align=\"left\"><a href=\"/jumyong/junggi/search.do?doSearch=none\" class=\"leftM2\" target=\"cont\" id=\"junggi\" onclick=\"javascript:menuBtn_chk(this);\">정기분 관리</a> </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<!--  //********** BEGIN_KANG_20120418 -->\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"2\" height=\"0\">\r\n\t\t\t\t\t\t<div id=\"staticMenu\" style=\"display:none\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"29px\" height=\"27px\">\r\n\t\t\t\t\t\t\t\t\t\t<img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:subMenuClick();\" class=\"leftM2\" id=\"statistics\">통계관리</a>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"0\"></td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<div id=\"statisticsSub\" style=\"display:none\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" height=\"20\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/statistics/statistics.do?mode=all\" class=\"leftM2\" target=\"cont\" id=\"stat0\" onclick=\"javascript:menuBtn_chk(this);\">- 전체</a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/statistics/statistics.do?mode=stat\" class=\"leftM2\" target=\"cont\" id=\"stat1\" onclick=\"javascript:menuBtn_chk(this);\">- 법정동별</a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" height=\"20\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/statistics/statistics.do?mode=purpose\" class=\"leftM2\" target=\"cont\"id=\"stat2\" onclick=\"javascript:menuBtn_chk(this);\">- 점용목적별</a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\" height=\"20\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/statistics/statistics.do?mode=semok\" class=\"leftM2\" target=\"cont\" id=\"stat3\" onclick=\"javascript:menuBtn_chk(this);\">- 세목코드별</";
  private final static String _jspx_template14 = "a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"5\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\t\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<!--   //********** END_KANG_20120418 -->\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<div id=\"geoInfo\" onclick=\"javascript:menuBtn_chk(this);popGeoInfo();\" style=\"font-family돋움;font-size:12px;color:#858585;cursor:pointer;\">\r\n\t\t\t\t\t\t지리정보\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t<td align=\"left\"><a href=\"/jumyong/oldminwon/search.do\" class=\"leftM2\" target=\"cont\" id=\"oldminwon\" onclick=\"javascript:menuBtn_chk(this);\">(구)민원행정 조회 </a> </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<a href=\"javascript:subMenuClick('inquiry');\" class=\"leftM2\" id=\"inquiry\">질의회신</a>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"2\">\r\n\t\t\t\t\t\t<div id=\"inquirySub\" style=\"display: none\"></div>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1px\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"27px\"><img src=\"/img/sub_menuicon.gif\" width=\"29px\" height=\"27px\"/></td>\r\n\t\t\t\t\t<td align=\"left\"><a href=\"/bbs/bbs_jumyong.jsp\" class=\"leftM2\" target=\"cont\" id=\"bbs\" onClick=\"javascript:menuBtn_chk(this);\">게시판 및 연락처 </a> </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"12px\" colspan=\"2\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t<!--좌측 메뉴시작-->\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\t</td>\r\n</tr>\r\n\t\r\n<tr>\r\n\t<td height=\"174\" align=\"center\" valign=\"bottom\">\r\n\t\t<!--좌측하단 배너-->\r\n\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"http://98.33.4.164\" target=\"_blank\"><img src=\"/img/left_banner1.gif\" alt=\"서울시세외수입종합징수시스템\" width=\"176\" height=\"58\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"http://98.33.5.30\" target=\"_blank\"><img src=\"/img/left_banner2.gif\" alt=\"서울시민원행정정보시스템\" width=\"176\" height=\"47\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"http://98.33.1.136:8080\" target=\"_blank\"><img src=\"/img/left_banner3.gif\" alt=\"민원처리온라인공개시스템\" width=\"176\" height=\"52\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t\t<!--  //********** BEGIN_KANG_21020524 -->\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"http://www.juso.go.kr/openIndexPage.do\" target=\"_blank\"><img src=\"/img/left_banner_juso.gif\" alt=\"도로명주소 안내시스템\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t\t<!--   //********** END_KANG_21020524 -->\r\n\t\t\t\t\t<!-- sungh83 20131129 -->\r\n\t\t\t<tr><td height ='3'></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"http://road.cpermit.go.kr/cap/discussion/index.jsp\" target=\"_blank\"><img src=\"/img/left_banner_roadinfo.gif\" alt=\"도로점용정보마당 안내시스템\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t\t<!-- sungh83 20131129 -->    \r\n\t\t</table>\r\n\t\t<!--좌측하단 배너 끝-->\r\n\t</td>\r\n</tr>\r\n<!--관련사이트-->\r\n<!-- \r\n\t<tr>\r\n\t\t<td height=\"60\" align=\"center\">\r\n\t\t<select name=\"select2\" class=\"related\" style=\"width:170px; background:f1f2f2\">\r\n\t\t<option selected>관련사이트</option>\r\n\t\t</select>\r\n\t\t</td>\r\n\t</tr>\r\n-->\r\n<!--관련사이트 끝-->\r\n</table>\r\n<!--  //********** BEGIN_KANG_20120418 -->\r\n<script>\r\nvar grade_menu = ";
  private final static String _jspx_template15 = ";\t\t// 사용자 등급 점수\r\nvar org_cd = ";
  private final static String _jspx_template16 = ";\t\t\t//사용자 시군구 기관 코드\r\nvar dept_cd = ";
  private final static String _jspx_template17 = ";\t\t\t//사용자 부서코드\r\nvar square = 1;\r\nvar now = 0;\r\nfor(i=8;i>0;i--){\r\n\r\n\tfor(j=0;j<i;j++){\t\t//2의 제곱값 구하기\r\n\t\tsquare =  square*2;\r\n\t}\r\n\t\r\n\tgrade_menu = grade_menu - square;\r\n\tif(grade_menu>=0){\r\n\t\tif(i == 4)\t\r\n\t\t\tdocument.getElementById(\"staticMenu\").style.display = \"block\";\r\n\t}else if(grade_menu<0){\r\n\t\tgrade_menu = grade_menu + square;\r\n\t}\r\n\tsquare = 1;\t\r\n}\r\n</script>\r\n<!--   //********** END_KANG_20120418 -->\r\n\r\n\r\n</body>\r\n</html>\r\n";
}
