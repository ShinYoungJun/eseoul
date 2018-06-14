package jeus_jspwork._jsp._gapan._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_menu_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
  private final static String _jspx_template9 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<link href=\"/css/Mroads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/mapImg/left_background.gif);\r\n}\r\n-->\r\n</style>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script type=\"text/JavaScript\">\r\nfunction showdiv(){\r\n  if(top.map.layerdiv.style.display == \"block\"){\r\n  \ttop.map.layerdiv.style.display = \"none\";\r\n  }\r\n  else\r\n  {\r\n  \ttop.map.layerdiv.style.display = \"block\";\r\n  }\r\n}\r\n</script>\r\n</head>\r\n<body>\r\n<table width=\"100%\" height=\"62\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" background=\"/img/mapImg/top_back.gif\">\r\n  <tr>\r\n    <td width=\"260\"><img src=\"/img/mapImg/logo.gif\" width=\"260\" height=\"62\"></td>\r\n    <td><table width=\"100%\" height=\"62\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n      <tr>\r\n        <td height=\"10\"><img src=\"/img/mapImg/menu_back2.gif\" width=\"220\" height=\"10\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td background=\"/img/mapImg/menu_back.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td width=\"15\"><img src=\"/img/mapImg/menu_left.gif\" width=\"15\" height=\"48\"></td>\r\n            <td width=\"6\"></td>\r\n            <td><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n              <tr>\r\n                <td><a href=\"javascript:top.map.Fit();\" onFocus=\"this.blur()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image7','','/img/mapImg/maptool1_on.gif',1)\"><img src=\"/img/mapImg/maptool1_off.gif\" alt=\"전체\" name=\"Image7\" width=\"38\" height=\"48\" border=\"0\"></a></td>               \t\r\n                <td><a href=\"javascript:top.map.ZoomIn()\" onFocus=\"this.blur()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image8','','/img/mapImg/maptool2_on.gif',1)\"><img src=\"/img/mapImg/maptool2_off.gif\" alt=\"확대\" name=\"Image8\" width=\"38\" height=\"48\" border=\"0\"></a></td>\r\n                <td><a href=\"javascript:top.map.ZoomOut()\" onFocus=\"this.blur()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image9','','/img/mapImg/maptool3_on.gif',1)\"><img src=\"/img/mapImg/maptool3_off.gif\" alt=\"축소\" name=\"Image9\" width=\"38\" height=\"48\" border=\"0\"></a></td>\r\n                <td><a href=\"javascript:top.map.toggleControl('none')\" onFocus=\"this.blur()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image22','','/img/mapImg/maptool15_on.gif',1)\"><img src=\"/img/mapImg/maptool15_off.gif\" alt=\"이동\" name=\"Image22\" width=\"38\" height=\"48\" border=\"0\"></a></td>\r\n                <td><a href=\"javascript:top.map.toggleControl('line')\" onFocus=\"this.blur()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image12','','/img/mapImg/maptool6_on.gif',1)\"><img src=\"/img/mapImg/maptool6_off.gif\" alt=\"거리\" name=\"Image12\" width=\"38\" height=\"48\" border=\"0\"></a></td>\r\n                <td><a href=\"javascript:top.map.toggleControl('polygon')\" onFocus=\"this.blur()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image13','','/img/mapImg/maptool7_on.gif',1)\"><img src=\"/img/mapImg/maptool7_off.gif\" alt=\"면적\" name=\"Image13\" width=\"38\" height=\"48\" border=\"0\"></a></td>\r\n                <td><a href=\"javascript:top.map.winMapPrint()\" onFocus=\"this.blur()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image16','','/img/mapImg/maptool10_on.gif',1)\"><img src=\"/img/mapImg/maptool10_off.gif\" alt=\"인쇄\" name=\"Image16\" width=\"38\" height=\"48\" border=\"0\"></a></td>\r\n\t\t\t\t<td><a href=\"javascript:showdiv();\" onFocus=\"this.blur()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image19','','/img/mapImg/maptool12_on.gif',1)\"><img src=\"/img/mapImg/maptool12_off.gif\" alt=\"레이어\" name=\"Image19\" width=\"41\" height=\"48\" border=\"0\"></a></td>\r\n\t\t\t\t<td><div class=\"sub_stan_b\">\r\n\t\t\t\t<img src=\"/img/mapImg/blueQuad.gif\" style=\"vertical-align: middle;\">\r\n\t\t\t\t가로판매대 : <input type=\"text\" id =\"saleCount\" name=\"saleCount\" value=\"\" size=\"5\" class=\"essential\"  readonly>\r\n\t\t\t\t<img src=\"/img/mapImg/redQuad.gif\" style";
  private final static String _jspx_template10 = "=\"vertical-align: middle;\">\r\n\t\t\t\t구두수선대 : <input type=\"text\" id =\"fixCount\" name=\"fixCount\" value=\"\" size=\"5\" class=\"essential\"  readonly>\r\n              \t<td></td>\r\n              </tr>\r\n            </table>\r\n        \t</td>\r\n            <td width=\"17\"><img src=\"/img/mapImg/menu_right.gif\" width=\"17\" height=\"48\"></td>\r\n          </tr>\r\n        </table></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"4\"><img src=\"/img/mapImg/menu_back3.gif\" width=\"220\" height=\"4\"></td>\r\n      </tr>\r\n    </table></td>\r\n    <td width=\"10\"></td>\r\n  </tr>\r\n</table>\r\n</body>\r\n</html>";
}
