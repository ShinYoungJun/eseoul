package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_landPriceList_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(54,15);to=(54,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(80,37);to=(80,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template15);
      // jsp code [from=(145,107);to=(145,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${priceList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template12);
            // jsp code [from=(124,80);to=(124,90)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(126,59);to=(126,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JIGA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);

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
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('������� ���ð��� ����Ǿ����ϴ�. �ٽ� ���� ���ֽñ� �ٶ��ϴ�.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: ����� ������������ý��� :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<link href=\"/css/pop.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script>\r\nfunction sumPrice(){\r\n/*\r\n\tvar priceList = document.getElementsByName(\"JIGA\");\r\n\t\r\n\tvar totalPrice = 0;\r\n\t\r\n\tfor(var i = 0; i < priceList.length ; i++){\r\n\t\ttotalPrice += Number(priceList[i].value);\r\n\t}\r\n\tdocument.getElementById(\"giga\").value = Math.floor(fixFloatCal(totalPrice/priceList.length));\r\n*/\r\n\tvar priceList = document.getElementsByName(\"JIGA\");\r\n\t\r\n\tvar totalPrice = 0;\r\n\r\n\tvar count = 0;\r\n\t\r\n\tfor(var i = 0; i < priceList.length ; i++){\r\n\t\ttotalPrice += Number(priceList[i].value);\r\n\t\tif (Number(priceList[i].value) == -1) {\r\n\t\t\tcount += 1;\r\n\t\t}\r\n\t}\r\n\tdocument.getElementById(\"giga\").value = Math.floor(fixFloatCal(totalPrice/priceList.length));\r\n\r\n\t// 2013.03.07 by ksic\r\n\t// ���������� �������� ���������� 5�� �� ������ ��ȸ �� ������ ���� ���������� �����ϵ��� �Ǿ� �־\r\n\t// 5�� �� �������� ��û �� ������� ���������� '-1'�� �����ϰ�\r\n\t// �� ���������� '-1' ���� �����ϸ� �Ʒ��� �޽����� ����.\r\n\tif (count > 0)\r\n\t\talert(\"[\"+";
  private final static String _jspx_template10 = "+\"]�⵵�� ���������� ���� �������� �⵵�� 5�� �� �����Ϳ��� �� �ý��ۿ��� �������� �ʽ��ϴ�.\" +\r\n\t\t\t\t\"\\n�ѱ��������� �ý��ۿ��� �˻��Ͽ� ���������� ����� �Է��Ͻʽÿ�.\" +\r\n\t\t\t\t\"\\nURL -> http://klis.seoul.go.kr\" +\r\n\t\t\t\t\"�ε��� �������� > ������������\");\r\n}\r\n\r\n\r\n\r\nfunction close2()\r\n{\r\n\tvar giga = document.getElementById(\"giga\").value;\r\n\t\r\n\tvar idx = document.getElementById(\"idx\").value;\r\n\t\r\n\tif(idx != \"\"){\r\n\t\topener.document.getElementsByName(\"PRICE\")[idx].value = giga;\r\n\t}else{\r\n\t\topener.document.getElementById(\"PRICE\").value=giga;\t\r\n\t}\r\n\r\n\tself.close();\r\n}\r\n</script>\r\n</head>\r\n\r\n<body onload=\"sumPrice();\">\r\n<input id=\"idx\" name=\"idx\" value=\"";
  private final static String _jspx_template11 = "\" type=\"hidden\">\r\n\t<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td width=\"12px\" height=\"12px\"><img src=\"/img/box_top_left.gif\" width=\"12\" height=\"12\"></td>\r\n\t\t\t<td height=\"12px\" background=\"/img/box_top_mid.gif\"></td>\r\n\t\t\t<td width=\"12px\" height=\"12px\"><img src=\"/img/box_top_right.gif\" width=\"12\" height=\"12\"></td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td width=\"12px\" background=\"/img/box_left.gif\"></td>\r\n\t\t\t<td align=\"center\" valign=\"top\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"admin_w\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"40px\" height=\"40px\"><img src=\"/img/admin_pop_left2.gif\" width=\"40px\" height=\"40px\"></td>\r\n\t\t\t\t\t\t\t\t\t<td background=\"/img/admin_pop_cen.gif\" class=\"admin_w_b\" style=\"padding-top: 3\">��������</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"33px\"><img src=\"/img/close.gif\" alt=\"�ݱ�\" width=\"33px\" height=\"40px\" border=\"0\" onClick=\"self.close();\" style=\"cursor: pointer;\" /></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"5\" colspan=\"3\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t<table width=\"280px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t                        \t\t\t<td width=\"160px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��</td>\r\n\t\t\t                        \t\t\t<td width=\"120px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >��������</td>\r\n\t\t\t                      \t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t<DIV style=\"width:297px;height:100px;overflow-y:scroll;overflow-x:none;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\">\r\n\t\t\t\t\t\t\t\t\t\t<table width=\"280px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t                      \t\t\t";
  private final static String _jspx_template12 = "\t                      \r\n\t\t\t\t                      \t\t<tr>\r\n\t\t\t\t                        \t\t<td width=\"160px\" height=\"26px\" align=\"center\">";
  private final static String _jspx_template13 = "</td>                                                                                    \r\n\t\t\t\t                        \t\t<td width=\"120px\" align=\"center\">\r\n\t\t\t\t                        \t\t<input name=\"JIGA\" value=\"";
  private final static String _jspx_template14 = "\" type=\"text\" class=\"input_form1\" style=\"width:100px\" onKeyDown=\"nr_num_int(this);sumPrice();\" onKeyUp=\"nr_num_int(this);sumPrice();\" onKeyPress=\"nr_num_int(this);sumPrice();\">\r\n\t\t\t\t                        \t\t</td>            \r\n\t\t\t\t                      \t\t</tr>\r\n\t\t\t\t\t\t\t\t\t \t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</DIV>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"10px\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t          \t\t\t\t\t<tr>\r\n\t          \t\t\t\t\t\t<td height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�⵵</td>\r\n\t\t\t\t            \t\t<td height=\"28px\" bgcolor=\"#F6F6F6\" class=\"table_bl_left\"><span class=\"sub_stan_blue\">";
  private final static String _jspx_template16 = "</span>��</td>\r\n\t\t\t\t            \t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��հ�������</td>\r\n\t\t\t\t            \t\t<td bgcolor=\"#F6F6F6\" class=\"table_bl_left\">\r\n\t\t\t\t            \t\t\t<span class=\"sub_stan_blue\">\r\n\t\t\t\t            \t\t\t<input name=\"giga\" id=\"giga\" type=\"text\" value = \"\" style=\"width:70px;ime-mode:disabled;\"  class=\"input_form1\" >\r\n\t\t\t\t            \t\t\t</span> ��&nbsp;&nbsp;\r\n\t\t\t\t            \t\t\t<span class=\"sub_stan_blue\" style=\"cursor:pointer\" onclick=\"javascript:close2();\">����</span> \r\n\t\t\t\t            \t\t</td>\r\n\t          \t\t\t\t\t</tr>\r\n          \t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t\t<td width=\"12px\" background=\"/img/box_right.gif\"></td>\r\n\t\t</tr>\r\n\t\t<t>\r\n\t\t\t<td width=\"12px\" height=\"12px\"><img src=\"/img/box_bottom_left.gif\" width=\"12\" height=\"12\" style=\"vertical-align: top;\"></td>\r\n\t\t\t<td background=\"/img/box_bottom_mid.gif\"></td>\r\n\t\t\t<td width=\"12px\" height=\"12px\"><img src=\"/img/box_bottom_right.gif\" width=\"12\" height=\"12\" style=\"vertical-align: top;\">\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</body>\r\n</html>";
}
