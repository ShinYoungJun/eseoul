package jeus_jspwork._jsp._menu._left;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_admin_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(9,3);to=(12,1)]
      
      String org_cd = (String)session.getAttribute("org_cd");
      String dept_cd = (String)session.getAttribute("dept_cd");

      out.write(_jspx_template4);
      // jsp code [from=(66,54);to=(66,60)]
      out.print(org_cd);

      out.write(_jspx_template5);
      out.write(_jspx_template6);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('������� ���ð��� ����Ǿ����ϴ�. �ٽ� ���� ���ֽñ� �ٶ��ϴ�.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "  \t\r\n<!--  //********** BEGIN_����_20120229 -->\r\n";
  private final static String _jspx_template3 = "\r\n<!--   //********** END_����_20120229 -->\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template4 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: ����� ������������ý��� :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n\tmargin-right: 0px;\r\n\tmargin-bottom: 0px;\r\n\tbackground-image: url(../img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n<!--\r\n           \r\n\tfunction\tmenuBtn_chk(o)\r\n\t{\r\n\t\tdocument.getElementById(\"board\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"code\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"connect\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"record\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"user\").className = \"leftM2\";\r\n\t\t//********** BEGIN_����_20120227\r\n\t\tdocument.getElementById(\"code2\").className = \"leftM2\";\r\n\t\t//********** END_����_20120227\t\t\t\t\r\n\t\tdocument.getElementById(o.id).className = \"leftM1\";\r\n\t}\r\n\t\r\n\tfunction guCd_chk()\r\n\t{\r\n\t\tvar guCd = document.form.guCd.value;\r\n\r\n\t\tif(guCd != '0000000')\r\n\t\t{\r\n\t\t\talert(\"������ �����ϴ�.\");\r\n\t\t\treturn;\r\n\t\t}\t\r\n\t\t\r\n\t\tvar w = document.form;\r\n\t\ttop.frames[2].location = \"/admin/board.do\";\t\t\t\t\r\n\t}\r\n-->\t\r\n\r\n</script>\r\n\r\n<body>\r\n<form name=\"form\">\r\n<input type=\"hidden\" id=\"guCd\" name=\"guCd\" value=\"";
  private final static String _jspx_template5 = "\">\r\n<table width=\"200\" border=\"0\" cellpadding=\"0\"\tcellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"center\" valign=\"top\">\r\n\t\t<table width=\"170\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"17\">&nbsp;</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"35\"><img src=\"/img/admin_title.gif\"\r\n\t\t\t\t\talt=\"�����ڸ޴�\" width=\"170\" height=\"35\"></td>\r\n\t\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"center\" valign=\"top\" bgcolor=\"f8f8f8\" class=\"leftborder\">\r\n\t\t\t\t<!--���� �޴�����-->\r\n\t\t\t\t<table width=\"150\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"12\" colspan=\"2\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"29\" height=\"27\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_menuicon.gif\" width=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"/admin/user/user.do\" class=\"leftM1\"\r\n\t\t\t\t\t\t\ttarget=\"cont\" id=\"user\" onclick=\"javascript:menuBtn_chk(this);\">�����\r\n\t\t\t\t\t\t����</a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"27\"><img src=\"/img/sub_menuicon.gif\"\r\n\t\t\t\t\t\t\twidth=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"javascript:guCd_chk();\" id=\"board\" class=\"leftM2\" onclick=\"javascript:menuBtn_chk(this);\">��������\r\n\t\t\t\t\t\t����</a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"29\" height=\"27\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_menuicon.gif\" width=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"/admin/commCode/areaCode.do\" class=\"leftM2\"\r\n\t\t\t\t\t\t\ttarget=\"cont\" id=\"code\" onclick=\"javascript:menuBtn_chk(this);\">�����ڵ����</a>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<!--  //********** BEGIN_����_20120317 -->\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"29\" height=\"27\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_menuicon.gif\" width=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"/admin/section/list.do\" class=\"leftM2\"\r\n\t\t\t\t\t\t\ttarget=\"cont\" id=\"code2\" onclick=\"javascript:menuBtn_chk(this);\">�Ÿ����� ��ġ�� ����  </a>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t<!--   //********** END_����_20120317 -->\r\n\t\t\t\t\t<!--  //********** BEGIN_����_20120308 -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"29\" height=\"27\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_menuicon.gif\" width=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"/jumyong/junggi/semokListTest.do\" class=\"leftM2\"\r\n\t\t\t\t\t\t\ttarget=\"cont\">�����ڵ���ȸ(�׽�Ʈ)  </a>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t<!--   //********** END_����_20120308 -->\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"27\"><img src=\"/img/sub_menuicon.gif\"\r\n\t\t\t\t\t\t\twidth=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"/admin/sysHistory.do\" class=\"leftM2\"\r\n\t\t\t\t\t\t\ttarget=\"cont\" id=\"record\" onclick=\"javascript:menuBtn_chk(this);\">�ý���\r\n\t\t\t\t\t\t�̷���ȸ</a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"27\"><img src=\"/img/sub_menuicon.gif\"\r\n\t\t\t\t\t\t\twidth=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"/admin/sysConnect.do\" class=\"leftM2\"\r\n\t\t\t\t\t\t\ttarget=\"cont\" id=\"connect\"\r\n\t\t\t\t\t\t\tonclick=\"javascript:menuBtn_chk(this);\">�ý��� ������ȸ</a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"12\" colspan=\"2\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t</table>\r\n\t\t\t\t<!--���� �޴�����--></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"15px\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"154\" align=\"center\" ><!--�����ϴ� ���-->\r\n\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"#\"><img src=\"/img/left_banner1.gif\"\r\n\t\t\t\t\talt=\"����ü��ܼ��� ����¡���ý���\" width=\"176\" height=\"58\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"#\"><img src=\"/img/left_banner2.gif\"\r\n\t\t\t\t\talt=\"�ǽð��ο��뺸�ý���\" width=\"176\" height=\"47\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"#\"><img src=\"/img/left_banner3.gif\"\r\n\t\t\t\t\talt=\"���ùο������ý���\" width=\"176\" height=\"52\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t<!--�����ϴ� ��� ��--></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td h";
  private final static String _jspx_template6 = "eight=\"60\" align=\"center\"><!--���û���Ʈ--> <select\r\n\t\t\tname=\"select2\" class=\"related\" style=\"width:170px; background:f1f2f2\">\r\n\t\t\t<option selected>���û���Ʈ</option>\r\n\t\t</select></td>\r\n\t\t<!--���û���Ʈ ��-->\r\n\t</tr>\r\n</table>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
