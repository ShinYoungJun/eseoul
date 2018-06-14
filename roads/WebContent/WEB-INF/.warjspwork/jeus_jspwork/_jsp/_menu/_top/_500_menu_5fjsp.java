package jeus_jspwork._jsp._menu._top;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_menu_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
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
      // jsp code [from=(190,19);to=(190,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(216,59);to=(216,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(217,65);to=(217,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${grade_menu}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(251,97);to=(251,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${grade_menu}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      out.write(_jspx_template9);
      // jsp code [from=(313,34);to=(313,38)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guNm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(316,52);to=(316,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(317,47);to=(317,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(350,20);to=(350,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${grade_menu}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(351,16);to=(351,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${org_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(352,17);to=(352,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dept_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(385,43);to=(385,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${grade_menu}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(402,18);to=(402,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(406,22);to=(406,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${insarangKey}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);

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
  private final static String _jspx_template3 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n\tmargin-right: 0px;\r\n\tmargin-bottom: 0px;\r\n}\r\n-->\r\n</style>\r\n<script language=\"javascript\" type=\"text/javascript\">\r\n\tfunction showTime()\r\n\t{\r\n\t    if (!document.all&&!document.getElementById) return;\r\n\t\r\n\t    thelement = document.getElementById ? document.getElementById(\"clock\") : document.all.clock;\r\n\t\r\n\t    var montharray=new Array(\"1월\",\"2월\",\"3월\",\"4월\",\"5월\",\"6월\",\"7월\",\"8월\",\"9월\",\"10월\",\"11월\",\"12월\");\r\n\t\r\n\t    var Digital = new Date();\r\n\t\r\n\t    var months  = Digital.getMonth();\r\n\t    var days    = Digital.getDate();\r\n\t    var hours   = Digital.getHours();\r\n\t    var minutes = Digital.getMinutes();\r\n\t\r\n\t    if (hours > 12) \r\n\t    \thours  = \"오후 \"+String(Number(hours)-Number(12));\r\n\t    else \r\n\t    \thours = \"오전 \"+hours;\r\n\t    \r\n\t    if (minutes < 10) minutes=\"0\"+minutes;\r\n\t\r\n\t    var ctime = montharray[months]+\" \"+days+\"일 \"+hours+\":\"+minutes;\r\n\t\r\n\t        thelement.innerHTML=ctime;\r\n\t        setTimeout(\"showTime()\",1000);\r\n\t}\r\n\r\n\tfunction goUrl(url1,url2)\r\n\t{\t\r\n\t\ttop.frames[1].location=url1;\t\r\n\t\ttop.frames[2].location=url2;\r\n\t}\t\r\n\t\r\n\t/** 지도페이지 사이즈 **/\r\n\t  var winW = screen.availWidth - 10;\t\r\n\t  var winH = screen.availHeight - 50;\r\n\t  /** 지도페이지 옵션 **/\r\n\t  var mapWinOpt = \"toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=yes,left=0px,top=0px,width=\"+winW+\"px,height=\"+winH+\"px\";\r\n\t  var mapWin = null;          \r\n\t  \r\n\tfunction popGeoInfo()\r\n\t{\r\n\t\tvar url = \"/jsp/map/index.jsp\";\r\n\t    \tmapWin = window.open(url,\"mapWin\",mapWinOpt);\r\n\t    \tmapWin.focus();  \r\n\t}\r\n\t\r\n\tfunction confirmLogout()\r\n\t{\r\n\t\tif(confirm(\"로그아웃하시겠습니까?\"))\r\n\t\t\tparent.location.href='/admin/user/logout.do';\r\n\t}\r\n\r\n\t//사용자정보 수정 팝업오픈\r\n\tfunction userUpdate(obj)\r\n\t{\t\r\n\t\tvar param = \"/admin/user/userDetail.do?userId=\"+obj+\"&input_type=text\";\t\t//id_type은 정보변경 팝업에서 개인정보 id의 input type을 정해줌 \r\n\t    var winPosLeft = 'left='+(screen.width - 520) / 2;  // 새창 x 좌표 \r\n  \t\tvar winPosTop = 'top='+(screen.height - 500 - 100) / 2;  // 새창 y 좌표 \r\n  \t\tvar param1 = \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, \"+winPosLeft+\",\"+ winPosTop+\", width=520, height=626\";\r\n\t\t\r\n\t\twindow.open( param, \"상세정보2\", param1);\t\r\n\t}\r\n\t\r\n\tfunction init()\r\n\t{\t\r\n\t\t//alert(document.getElementById(\"GRADE_MENU\").value);\r\n\t\tvar w = document.listForm;\r\n\t\t//alert(w.section.value);\r\n\r\n\t\tif(w.section.value != '1')\r\n\t\t\tw.admin.style.visibility = \"hidden\";\r\n\t}\r\n\t\r\n\t// 관리자메뉴활성\r\n\tfunction admin_open()\r\n\t{\r\n\t\tvar w = document.listForm;\r\n\t\t\r\n\t\tif(w.section.value == '1')\r\n\t\t{\r\n\t\t\tgoUrl('/jsp/menu/left/admin.jsp','/admin/user/user.do');\r\n\t\t}\t\r\n\t}\r\n\r\n\r\n</script>\r\n<script type=\"text/JavaScript\">\r\n<!--\r\n\r\nvar clickImgNm = \"Image5\";\r\n\r\nfunction MM_swapImgRestore() { //v3.0\r\n\t  var i,x,a=document.MM_sr; \r\n\t  for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++)\r\n\t  \t  x.src=x.oSrc;\t \r\n\t  \r\n}\r\n\r\nfunction MM_preloadImages() { //v3.0\r\n\tvar d=document; \r\n\tif(d.images)\r\n\t{ \r\n\t\tif(!d.MM_p) d.MM_p=new Array();\r\n\t\tvar i,j=d.MM_p.length,a=MM_preloadImages.arguments; \r\n\t\tfor(i=0; i<a.length; i++)\r\n\t\t\tif (a[i].indexOf(\"#\")!=0)\r\n\t\t\t{ \r\n\t\t\t\td.MM_p[j]=new Image; \r\n\t\t\t\td.MM_p[j++].src=a[i];\r\n\t\t\t}\r\n\t}\r\n}\r\n\r\nfunction MM_findObj(n, d) { //v4.01\r\n  var p,i,x;  if(!d) d=document; if((p=n.indexOf(\"?\"))>0&&parent.frames.length) {\r\n    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}\r\n  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];\r\n  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);\r\n  if(!x && d.getElementById) x=d.getElementById(n); return x;\r\n}\r\n\r\nfunction MM_swapImage() { //v3.0\r\n\tvar i,j=0,x,a=MM_swapImage.arguments;\r\n\tdocument.MM_sr=new Array;\r\n\tfor(i=0;i<(a.length-2);i+=3)\r\n\tif ((x=MM_findObj(a[i]))!=null)\r\n\t{\r\n\t\tdocument.MM_sr[j++]=x; \r\n\t\tif(!x.oSrc) x.oSrc=x.src; \r\n\t\tx.src=a[i+2];\r\n\t}\r\n}\r\n\r\n\r\nfunction mouseOverFn(imgNm,blank,gifNm,num)\r\n{\r\n\tMM_swapImage(imgNm,blank,gifNm,num);\r\n}\r\n\r\n\r\nfunction mouseOutFn()\r\n{\r\n";
  private final static String _jspx_template4 = "\r\n\t\r\n\timg5 = document.getElementById(\"Image5\");\r\n\timg7 = document.getElementById(\"Image7\");\r\n\timg8 = document.getElementById(\"Image8\");\r\n\timg9 = document.getElementById(\"Image9\");\r\n\timg10 = document.getElementById(\"Image10\");\r\n\timg15 = document.getElementById(\"Image15\");\t\t\t\t\t\r\n\t\r\n\tif(clickImgNm !=\"Image5\")\r\n\t\timgRestore(img5,'/img/submenu1_off.gif');\r\n\tif(clickImgNm !=\"Image7\")\t\t\r\n\t\timgRestore(img7,'/img/submenu3_off.gif');\r\n\tif(clickImgNm !=\"Image8\")\t\t\r\n\t\timgRestore(img8,'/img/submenu7_off.gif');\r\n\tif(clickImgNm !=\"Image10\")\t\t\r\n\t\timgRestore(img10,'/img/submenu8_off.gif');\r\n\tif(clickImgNm !=\"Image9\")\t\t\r\n\t\timgRestore(img9,'/img/submenu5_off.gif');\r\n\tif(clickImgNm !=\"Image15\")\t\t\r\n\t\timgRestore(img15,'/img/submenu6_off.gif');\r\n\t\r\n}\r\n\r\n\r\nfunction changePw(){\r\n\tvar idcheck = \"";
  private final static String _jspx_template5 = "\";\r\n\tif(idcheck == \"cgpark2\"){\r\n\t\ttop.frames[2].location='/admin/user/changePwdView.do?userId='+idcheck;\r\n\t\t//goUrl('/jsp/menu/left/admin.jsp','/admin/user/changePwd.do');\r\n\t\t//goUrl('/jsp/menu/left/admin.jsp', '/jsp/admin/user/changePwd.jsp');\r\n\t}\r\n}\r\n\r\nfunction clickImgFn(img) { \r\n\tclickImgNm = img;\r\n\tmouseOutFn();\r\n}\r\n\r\n\r\nfunction imgRestore(img,srcParam) {\r\n\timg.src=srcParam;\r\n}\r\n\r\n//-->\r\n</script>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<body\r\n\tonLoad=\"showTime(); MM_preloadImages('/img/submenu2_on.gif','/img/submenu3_on.gif','/img/submenu7_on.gif','/img/submenu5_on.gif');init();\">\r\n<form id=\"listForm\" name=\"listForm\">\r\n<input type=\"hidden\" id=\"section\" name=\"section\" value=\"";
  private final static String _jspx_template6 = "\">\r\n<input type=\"hidden\" id=\"grade_menu\" name=\"grade_menu\" value=\"";
  private final static String _jspx_template7 = "\">\r\n<table width=\"100%\" height=\"115\" border=\"0\" cellpadding=\"0\"\r\n\tcellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td background=\"/img/sub_topback.gif\">\r\n\t\t<table width=\"1000\" height=\"115\" border=\"0\" cellpadding=\"0\"\r\n\t\t\tcellspacing=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"200\" rowspan=\"4\"><img\r\n\t\t\t\t\tsrc=\"/img/sub_logo.gif\" width=\"200\" height=\"115\"></td>\r\n\t\t\t\t<td height=\"38\" align=\"right\"\r\n\t\t\t\t\tbackground=\"/img/sub_topimg.gif\"><!--최상단메뉴-->\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t<!--  \t<td><a href=\"#\"><img src=\"/img/sub_topm1.gif\"\r\n\t\t\t\t\t\t\talt=\"홈\" width=\"21\" height=\"18\" border=\"0\"></a></td>  -->\r\n\t\t\t            <td id=\"menu7\" style=\"display:block;\"><img id=\"admin\" name=\"admin\" src=\"/img/sub_topm2.gif\" alt=\"관리자\" width=\"40\" height=\"18\" border=\"0\" onClick=\"admin_open();\" style=\"cursor:pointer\" ></td>\r\n\t\t<!-- \t\t\t<td><a href=\"#\"><img src=\"/img/sub_topm3.gif\"\r\n\t\t\t\t\t\t\talt=\"게시판\" width=\"32\" height=\"18\" border=\"0\"></a></td>  -->\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t<!--최상단메뉴 끝--></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"35\"><!--서브메뉴-->\r\n\t\t\t\t<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120418 -->\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<td id=\"menu1\" style=\"display:block;\" onClick=\"goUrl('/jsp/menu/left/jumyong.jsp','/jumyong/minwon/search.do');\" >\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<img src=\"/img/submenu1_on.gif\" alt=\"점용 관리\" id=\"Image5\" name=\"Image5\" height=\"35\" border=\"0\" onclick=\"javascript:clickImgFn('Image5')\";\r\n\t\t\t\t\t\t\tonMouseOut=\"mouseOutFn()\" onMouseOver=\"mouseOverFn('Image5','','/img/submenu1_on.gif',1);\" style=\"cursor:pointer\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t <td id=\"menu1\" style=\"display:block;\" onClick=\"goUrl('/jsp/menu/left/jumyong.jsp?grade=";
  private final static String _jspx_template8 = "','/jumyong/minwon/search.do');\" >\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<img src=\"/img/submenu1_on.gif\" alt=\"점용 관리\" id=\"Image5\" name=\"Image5\" height=\"35\" border=\"0\" onclick=\"javascript:clickImgFn('Image5')\";\r\n\t\t\t\t\t\t\tonMouseOut=\"mouseOutFn()\" onMouseOver=\"mouseOverFn('Image5','','/img/submenu1_on.gif',1);\" style=\"cursor:pointer\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<!--   //********** END_KANG_20120418 -->\r\n<!-- \t\t\t\t\t<td onClick=\"goUrl('/jsp/menu/left/junggi.jsp','/junggi/imposition/search.do');\">\r\n\t\t\t\t\t\t\t<img src=\"/img/submenu2_off.gif\" alt=\"정기분 관리\" name=\"Image6\" height=\"35\" border=\"0\"  onclick=\"javascript:clickImgFn('Image6')\";\r\n\t\t\t\t\t\t\tonMouseOut=\"mouseOutFn()\" onMouseOver=\"mouseOverFn('Image6','','/img/submenu2_on.gif',1);\" \r\n\t\t\t\t\t\t\tonclick=\"clikImgNm='Image6'\"style=\"cursor:pointer\">\r\n\t\t\t\t\t\t</td>\r\n -->\t\t\t\t\t\t\r\n\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120416 -->\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<td id=\"menu2\" style=\"display:block;\" onClick=\"goUrl('/jsp/menu/left/facility.jsp','/facility/minwon/search.do');\">\r\n\t\t\t\t\t\t\t<img src=\"/img/submenu3_off.gif\" alt=\"시설물 관리\" id=\"Image7\" name=\"Image7\" height=\"35\" border=\"0\"  onclick=\"javascript:clickImgFn('Image7')\";\r\n\t\t\t\t\t\t\tonMouseOut=\"mouseOutFn()\" onMouseOver=\"mouseOverFn('Image7','','/img/submenu3_on.gif',1)\"\r\n\t\t\t\t\t\t\tonclick=\"clikImgNm='Image7'\"style=\"cursor:pointer\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t<td id=\"menu2\" style=\"display:block;\" onClick=\"goUrl('/jsp/menu/left/facility.jsp','/facility/adminbiz/search.do');\">\r\n\t\t\t\t\t\t\t<img src=\"/img/submenu3_off.gif\" alt=\"시설물 관리\" id=\"Image7\" name=\"Image7\" height=\"35\" border=\"0\"  onclick=\"javascript:clickImgFn('Image7')\";\r\n\t\t\t\t\t\t\tonMouseOut=\"mouseOutFn()\" onMouseOver=\"mouseOverFn('Image7','','/img/submenu3_on.gif',1)\"\r\n\t\t\t\t\t\t\tonclick=\"clikImgNm='Image7'\"style=\"cursor:pointer\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<!--   //********** END_KANG_20120416 -->\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<td id=\"menu3\" style=\"display:block;\" onClick=\"goUrl('/jsp/menu/left/gapan.jsp','/gapan/jumyong/search.do');\">\r\n\t\t\t\t\t\t\t<img src=\"/img/submenu7_off.gif\" alt=\"보도상영업시설물 관리\" id=\"Image8\" name=\"Image8\" height=\"35\" border=\"0\" onclick=\"javascript:clickImgFn('Image8')\";\r\n\t\t\t\t\t\t\tonMouseOut=\"mouseOutFn()\" onMouseOver=\"mouseOverFn('Image8','','/img/submenu7_on.gif',1)\"\r\n\t\t\t\t\t\t\tonclick=\"clikImgNm='Image8'\"style=\"cursor:pointer\">\r\n\t\t\t            </td>\r\n\t\t\t            <td id=\"menu8\" style=\"display:block;\" onClick=\"goUrl('/jsp/menu/left/rojum.jsp','/rojum/survey/search.do?doSearch=none');\">\r\n\t\t\t\t\t\t\t<img src=\"/img/submenu8_off.gif\" alt=\"거리가게 적치물 관리\" id=\"Image10\" name=\"Image10\" height=\"35\" border=\"0\" onclick=\"javascript:clickImgFn('Image10')\";\r\n\t\t\t\t\t\t\tonMouseOut=\"mouseOutFn()\" onMouseOver=\"mouseOverFn('Image10','','/img/submenu8_on.gif',1)\"\r\n\t\t\t\t\t\t\tonclick=\"clikImgNm='Image10'\"style=\"cursor:pointer\">\r\n\t\t\t            </td>\r\n\t\t\t           <td id=\"menu4\" style=\"display:block;\" onClick=\"goUrl('/jsp/menu/left/statistics.jsp','/statistics/statistics.do?mode=all');\">\t\t\t \r\n\t\t\t            \t<img src=\"/img/submenu5_off.gif\" alt=\"통계 관리\" id=\"Image9\" name=\"Image9\"  height=\"35\" border=\"0\" onclick=\"javascript:clickImgFn('Image9')\";\r\n\t\t\t\t\t\t\tonMouseOut=\"mouseOutFn()\" onMouseOver=\"mouseOverFn('Image9','','/img/submenu5_on.gif',1)\"\r\n\t\t\t\t\t\t\tonclick=\"clikImgNm='Image9'\"style=\"cursor:pointer\">\r\n\t\t\t            </td>\r\n\t\t\t            <td id=\"menu5\" style=\"display:block;\" onClick=\"popGeoInfo();\">\r\n\t\t\t    \t        <img src=\"/img/submenu6_off.gif\" alt=\"지리정보\" id=\"Image15\" name=\"Image15\" height=\"35\" border=\"0\"  onclick=\"javascript:clickImgFn('Image15')\";\r\n\t\t\t    \t        onMouseOut=\"mouseOutFn()\" onMouseOver=\"mouseOverFn('Image15','','/img/submenu6_on.gif',1)\" onclick=\"clikImgNm='Image15'\"style=\"cursor:pointer\">\r\n\t\t\t    \t    </td>\r\n\t\t\t          </tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t<!--서브메뉴 끝-->\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"28\">\r\n\t\t\t\t<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"35\" height=\"28\"\r\n\t\t\t\t\t\t\tbackground=\"/img/sub_timeback1.gif\"></td>\r\n\t\t\t\t\t\t<td width=\"750\" valign=\"bottom\"\r\n\t\t\t\t\t\t\tbackground=\"/img/sub_timeback2.gif\"><!--상단 로그인정보-->\r\n\t\t\t\t\t\t<table width=\"750\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template9 = "\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"70\" height=\"26\" align=\"right\"><span\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_stan_blue\">";
  private final static String _jspx_template10 = "청</span> </td>\r\n\t\t\t\t\t\t\t\t<td width=\"19\"><img src=\"/img/time_line.gif\"\r\n\t\t\t\t\t\t\t\t\twidth=\"19\" height=\"11\"></td>\r\n\t\t\t\t\t\t\t\t<td width=\"125\"><span class=\"sub_stan_b\">";
  private final static String _jspx_template11 = "</span>님 환영합니다</td>\r\n\t\t\t\t\t\t\t\t<td><a href=\"javascript:userUpdate('";
  private final static String _jspx_template12 = "');\"><img src=\"/img/info_mod.gif\"\r\n\t\t\t\t\t\t\t\t\talt=\"정보변경\" width=\"68\" height=\"14\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<a id=\"pwch\" href=\"javascript:changePw();\"><img \r\n\t\t\t\t\t\t\t\t\tsrc=\"/img/changepw_mod.gif\" alt=\"로그아웃\" width=\"53\" height=\"14\"\r\n\t\t\t\t\t\t\t\t\tborder=\"0\"></a>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<a href=\"javascript:confirmLogout();\"><img\r\n\t\t\t\t\t\t\t\t\tsrc=\"/img/logout.gif\" alt=\"로그아웃\" width=\"53\" height=\"14\"\r\n\t\t\t\t\t\t\t\t\tborder=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t<td width=\"12\"><img src=\"/img/time_img.gif\"\r\n\t\t\t\t\t\t\t\t\twidth=\"9\" height=\"11\"></td>\r\n\t\t\t\t\t\t\t\t<td width=\"120\" class=\"sub_stan\"><span id=\"clock\"></span></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t<!--상단 로그인정보 끝--></td>\r\n\t\t\t\t\t\t<td width=\"15\" background=\"/img/sub_timeback3.gif\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"><img src=\"/img/sub_topimg2.gif\"\r\n\t\t\t\t\twidth=\"290\" height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n<div id=\"menu6\"></div>\r\n</form>\r\n<script>\r\nvar grade_menu = ";
  private final static String _jspx_template13 = ";\t\t// 사용자 등급 점수\r\nvar org_cd = ";
  private final static String _jspx_template14 = ";\t\t\t\t//사용자 시군구 기관 코드\r\nvar dept_cd = ";
  private final static String _jspx_template15 = ";\t\t\t//사용자 부서코드\r\n//var grade_menu = 202;\r\nvar square = 1;\r\nvar now = 0;\r\n\r\n\r\nfor(i=8;i>0;i--){\r\n\r\n\tfor(j=0;j<i;j++){\t\t//2의 제곱값 구하기\r\n\t\tsquare =  square*2;\r\n\t}\r\n\t\r\n\tgrade_menu = grade_menu - square;\r\n\tif(grade_menu>=0){  \t\r\n\t\tdocument.getElementById(\"menu\"+i).style.display = \"block\";\r\n\t\tif(i == 1 || i == 2 || i == 3 || i == 8)\t\r\n\t\t\tnow=i;\r\n\t}else if(grade_menu<0){\t\t\t\t\r\n\t\t\tdocument.getElementById(\"menu\"+i).style.display = \"none\";\r\n\t\t\tgrade_menu = grade_menu + square;\r\n\t}\r\n\tsquare = 1;\t\r\n}\r\n//********** BEGIN_현진_20120306\r\ndocument.getElementById(\"menu5\").style.display = \"none\";\t\r\n//********** END_현진_20120306\r\n//********** BEGIN_KANG_20120417\r\ndocument.getElementById(\"menu4\").style.display = \"none\";\t\r\n//********** END_KANG_20120417\r\n\r\nif(now==1){\r\n//********** BEGIN_KANG_20120418\r\n//goUrl('/jsp/menu/left/jumyong.jsp','/jumyong/minwon/search.do');\r\ngoUrl('/jsp/menu/left/jumyong.jsp?grade=";
  private final static String _jspx_template16 = "','/jumyong/minwon/search.do');\r\n//********** END_KANG_20120418\r\n}else if(now==2){\r\ngoUrl('/jsp/menu/left/facility.jsp','/facility/minwon/search.do');\r\n}else if(now==3){\r\ngoUrl('/jsp/menu/left/gapan.jsp','/gapan/jumyong/search.do');\r\n}else if(now==8){\r\ngoUrl('/jsp/menu/left/rojum.jsp','/rojum/accept/search.do');\r\n}/*else if(now==5){\r\ngoUrl('/jsp/menu/left/statistics.jsp','/statistics/statistics.do?mode=stat');\r\n}*/\r\n\r\n</script>\r\n</body>\r\n\r\n<script type=\"text/javascript\">\r\n\r\nvar idcheck = \"";
  private final static String _jspx_template17 = "\";\r\nif(idcheck != \"cgpark2\"){\r\n\tdocument.getElementById(\"pwch\").style.display=\"none\";\r\n}\r\nvar insarangKey = '";
  private final static String _jspx_template18 = "';\r\nif(insarangKey == \"\"){\r\n\twindow.open(\"/admin/user/getInsarangKey.do\", \"gongji\", \"width=770,height=700,left=20,top=20,scrollbars=yes\");\r\n}\r\n</script>\r\n\r\n</html>\r\n";
}
