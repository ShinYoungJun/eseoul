package jeus_jspwork._jsp._rojum._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_view_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(132,20);to=(132,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(226,9);to=(226,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(228,83);to=(228,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(228,103);to=(228,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(230,9);to=(230,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(232,83);to=(232,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(232,103);to=(232,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(233,15);to=(233,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(235,83);to=(235,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(235,103);to=(235,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(236,15);to=(236,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(238,83);to=(238,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(238,103);to=(238,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(242,86);to=(242,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(286,61);to=(286,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(287,49);to=(287,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(288,55);to=(288,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(295,59);to=(295,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(296,55);to=(296,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bj_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(297,67);to=(297,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(298,57);to=(298,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bonbun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(299,55);to=(299,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(300,67);to=(300,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${numberValue}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(301,69);to=(301,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxtation_at}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(302,63);to=(302,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${maintn_ob}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(303,55);to=(303,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(304,57);to=(304,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mg_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(305,57);to=(305,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(306,61);to=(306,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(324,55);to=(324,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(337,68);to=(337,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(338,69);to=(338,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(345,174);to=(345,182)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(345,194);to=(345,205)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(360,68);to=(360,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(361,84);to=(361,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(362,79);to=(362,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(363,73);to=(363,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);

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
  private final static String _jspx_template9 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\t\tiFrm.style.height = the_height + \"px\";\r\n\t}\r\n\r\n\tfunction \tTabUp_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg2\t= document.getElementById(\"unyong_img\");\r\n\t\tvar\timg4\t= document.getElementById(\"jumji_img\");\r\n\r\n\t\timg2.src\t= \"/img/sub_gapan_title4_off.gif\";\r\n\t\timg4.src\t= \"/img/sub_petition_title10_off.gif\";\r\n\r\n\t\tif(Tab_Value\t== \"unyong\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_gapan_title4_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg4.src\t\t= \"/img/sub_petition_title10_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTab_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg2\t= document.getElementById(\"unyong_img\");\r\n\t\tvar\timg4\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg2.src\t= \"/img/sub_gapan_title4_off.gif\";\r\n\t\timg4.src\t= \"/img/sub_petition_title10_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"unyong\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_gapan_title4_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg4.src\t\t= \"/img/sub_petition_title10_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"product_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"noPermission_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"penalty_img\");\r\n\t\tvar\timg4\t= document.getElementById(\"sale_img\");\r\n\r\n\r\n\t\timg1.src\t= \"/img/rojum_cal1_title_off.gif\";\r\n\t\timg2.src\t= \"/img/rojum_cal2_title_off.gif\";\r\n\t\timg3.src\t= \"/img/rojum_cal3_title_off.gif\";\r\n\t\timg4.src\t= \"/img/rojum_cal4_title_off.gif\";\r\n\r\n\t\tif(Tab_Value\t== \"product\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/rojum_cal1_title_on.gif\";\r\n\t\t}\r\n\t\tif(Tab_Value\t== \"product_noPermission\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/rojum_cal2_title_on.gif\";\r\n\t\t}\r\n\t\tif(Tab_Value\t== \"product_penalty\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/rojum_cal3_title_on.gif\";\r\n\t\t}\r\n\t\tif(Tab_Value\t== \"product_sale\")\r\n\t\t{\r\n\t\t\timg4.src\t\t= \"/img/rojum_cal4_title_on.gif\";\r\n\t\t}\r\n\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\r\n\t}\r\n\r\n\tfunction Tab_Unyong(gapanno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tvar section = '";
  private final static String _jspx_template10 = "';\r\n\t\t\r\n\t\tif(tab.value\t== \"unyong\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"unyong\";\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=\" + gapanno+\"&SECTION=\"+section;\r\n\t}\r\n\r\n\tfunction Tab_Jumji(gapanno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\r\n\t\tif(tab.value\t== \"jumji\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumji\";\r\n\r\n\t\tvar tabs\t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=\" + gapanno;\r\n\t}\r\n\r\n\r\n\tfunction Tab_Product(gapanno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"product\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"product\";\r\n\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\t \r\n\r\n\t\tTabDown_Img(\"product\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/rojum/jumyong/rojumCal1.do?GAPAN_NO=\" + gapanno + \"&SEQ=\" + seq;\t\t\r\n\t\t\r\n\t}\r\n\r\n\r\n\tfunction Tab_Product_noPermission(gapanno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"product_noPermission\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"product_noPermission\";\r\n\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\t\r\n\t\t \r\n\t\t\r\n\t\tTabDown_Img(\"product_noPermission\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\t//tabs.src\t= \"/rojum/jumyong/rojumCal2.do?GAPAN_NO=\" + gapanno + \"&SEQ=\" + seq + \"&YEAR=\" + tabDown.document.getElementById(\"YEAR\").value + \"&PRICE=\"+ tabDown.document.getElementById(\"PRICE\").value +\"&AREA_AFTER=\"+ tabDown.document.getElementById(\"AREA_AFTER\").value +\"&RATE=\"+ tabDown.document.getElementById(\"RATE\").value +\"&FROMDATE=\"+ tabDown.document.getElementById(\"FROMDATE\").value+\"&TODATE=\" + tabDown.document.getElementById(\"TODATE\").value +\"&PERIOD=\"+tabDown.document.getElementById(\"PERIOD\").value +\"&REDUCTION_REASON=\"+tabDown.document.getElementById(\"REDUCTION_REASON\").value +\"&REDUCTION_RATE=\"+tabDown.document.getElementById(\"REDUCTION_RATE\").value+\"&ADJUSTMENT=\"+tabDown.document.getElementById(\"ADJUSTMENT\").value+\"&SUM_ADJUST=\"+tabDown.document.getElementById(\"SUM_ADJUST\").value+\"&SUM_YEAR=\"+tabDown.document.getElementById(\"SUM_YEAR\").value;\t\t\r\n\t\ttabs.src\t= \"/rojum/jumyong/rojumCal2.do?GAPAN_NO=\" + gapanno + \"&SEQ=\" + seq +\"&SUM_ADJUST=\"+tabDown.document.getElementById(\"SUM_YEAR\").value;\r\n\t\t\r\n\t}\r\n\tfunction Tab_Product_penalty(gapanno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"product_penalty\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"product_penalty\";\r\n\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\r\n\t\tTabDown_Img(\"product_penalty\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/rojum/jumyong/rojumCal3.do?GAPAN_NO=\" + gapanno + \"&SEQ=\" + seq;\t\t\r\n\t\t\r\n\t}\r\n\tfunction Tab_Product_sale(gapanno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"product_sale\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"product_sale\";\r\n\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\r\n\t\tTabDown_Img(\"product_sale\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/rojum/jumyong/rojumSale.do?GAPAN_NO=\" + gapanno + \"&SEQ=\" + seq;\t\t\r\n\t\t\r\n\t}\r\n\t\r\n\tfunction \tInit()\r\n\t{\r\n\t\tif('";
  private final static String _jspx_template11 = "' == 'cal1'){\r\n\t\t\tTabDown_Img(\"product\");\t\r\n\t\t\tdocument.getElementById(\"tabDown\").src=\"/rojum/jumyong/rojumCal1.do?GAPAN_NO=";
  private final static String _jspx_template12 = "&SECTION=";
  private final static String _jspx_template13 = "\";\r\n\t\t}\r\n\t\tif('";
  private final static String _jspx_template14 = "' == 'cal2'){\r\n\t\t\tTabDown_Img(\"product_noPermission\");\t\r\n\t\t\tdocument.getElementById(\"tabDown\").src=\"/rojum/jumyong/rojumCal2.do?GAPAN_NO=";
  private final static String _jspx_template15 = "&SECTION=";
  private final static String _jspx_template16 = "\";\r\n\t\t}else if('";
  private final static String _jspx_template17 = "' == 'cal3'){\r\n\t\t\tTabDown_Img(\"product_penalty\");\r\n\t\t\tdocument.getElementById(\"tabDown\").src=\"/rojum/jumyong/rojumCal3.do?GAPAN_NO=";
  private final static String _jspx_template18 = "&SECTION=";
  private final static String _jspx_template19 = "\";\r\n\t\t}else if('";
  private final static String _jspx_template20 = "' == 'cal4'){\r\n\t\t\tTabDown_Img(\"product_sale\");\r\n\t\t\tdocument.getElementById(\"tabDown\").src=\"/rojum/jumyong/rojumSale.do?GAPAN_NO=";
  private final static String _jspx_template21 = "&SECTION=";
  private final static String _jspx_template22 = "\";\r\n\t\t}\r\n\r\n\t\tTabUp_Img(\"jumji\");\r\n\t\tdocument.getElementById(\"tabUp\").src= \"/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=";
  private final static String _jspx_template23 = "\";\r\n\r\n\t}\r\n\t\r\n\tfunction goSearch()\r\n\t{\r\n\t\tvar section = document.getElementById(\"section\").value;\r\n\t\tvar bj_cd = document.getElementById(\"bj_cd\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar bonbun = document.getElementById(\"bonbun\").value;\r\n\t\tvar bubun = document.getElementById(\"bubun\").value;\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\r\n\t\tvar taxtation_at = document.getElementById(\"taxtation_at\").value;\r\n\t\tvar maintn_ob = document.getElementById(\"maintn_ob\").value;\r\n\t\tvar gu_cd = document.getElementById(\"gu_cd\").value;\r\n\t\tvar mg_typ = document.getElementById(\"mg_typ\").value;\r\n\t\tvar fromDate = document.getElementById(\"fromDate\").value;\r\n\t\tvar toDate = document.getElementById(\"toDate\").value;\r\n\t\t\r\n\r\n\t\tlocation.href=\"/rojum/jumyong/search.do?gu_cd=\"+gu_cd+\"&bj_cd=\"+bj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun\r\n\t\t+\"&jumyongName=\"+jumyongName+\"&numberValue=\"+numberValue\r\n\t\t+\"&fromDate=\"+fromDate+\"&toDate=\"+toDate+\"&maintn_ob=\"+maintn_ob+\"&section=\"+section+\"&mg_typ=\"+mg_typ;\r\n\t}\r\n\t\r\n\tvar i = 0;\r\n\t\r\n\tfunction resizeTabup(value)\r\n\t{\r\n\t\tif(i%2 == 0)\r\n\t\tiFrameResize(document.getElementById(value));\t\r\n\t\telse\r\n\t\t{\t\t\r\n\t\t\tvar iFrm = document.getElementById(\"tabUp1\");\r\n\t\t\tvar the_height = 0;\r\n\t\t\tiFrm.style.height = the_height;\r\n\t\t}\t\r\n\t\ti=i+1;\r\n\t}\r\n\t\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=hidden id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=hidden id=\"USER_ID\" name=USER_ID value=\"";
  private final static String _jspx_template26 = "\">\r\n\r\n<input type=\"hidden\" id=\"CURRENT_TABUP\" name=\"CURRENT_TABUP\" value=\"minwon\">\r\n<input type=\"hidden\" id=\"CURRENT_TABDOWN\" name=\"CURRENT_TABDOWN\" value=\"product\">\r\n<input type=\"hidden\" id=\"year\" name=\"year\" value=\"\">\r\n\r\n\r\n<input type=\"hidden\" id=\"section\" name=\"section\" value=\"";
  private final static String _jspx_template27 = "\" >\r\n<input type=\"hidden\" id=\"bj_cd\" name=\"bj_cd\" value=\"";
  private final static String _jspx_template28 = "\" >\r\n<input type=\"hidden\" id=\"jumyongName\" name=\"jumyongName\" value=\"";
  private final static String _jspx_template29 = "\" >\r\n<input type=\"hidden\" id=\"bonbun\" name=\"bonbun\" value=\"";
  private final static String _jspx_template30 = "\" >\r\n<input type=\"hidden\" id=\"bubun\" name=\"bubun\" value=\"";
  private final static String _jspx_template31 = "\" >\r\n<input type=\"hidden\" id=\"numberValue\" name=\"numberValue\" value=\"";
  private final static String _jspx_template32 = "\" >\r\n<input type=\"hidden\" id=\"taxtation_at\" name=\"taxtation_at\" value=\"";
  private final static String _jspx_template33 = "\" >\r\n<input type=\"hidden\" id=\"maintn_ob\" name=\"maintn_ob\" value=\"";
  private final static String _jspx_template34 = "\" >\r\n<input type=\"hidden\" id=\"gu_cd\" name=\"gu_cd\" value=\"";
  private final static String _jspx_template35 = "\" >\r\n<input type=\"hidden\" id=\"mg_typ\" name=\"mg_typ\" value=\"";
  private final static String _jspx_template36 = "\" >\r\n<input type=\"hidden\" id=\"toDate\" name=\"toDate\" value=\"";
  private final static String _jspx_template37 = "\" >\r\n<input type=\"hidden\" id=\"fromDate\" name=\"fromDate\" value=\"";
  private final static String _jspx_template38 = "\" >\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub7_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n \r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n      <tr>\r\n      \t<td align=\"right\" class=\"sub_table_b\">관리번호 : ";
  private final static String _jspx_template39 = "</td>\r\n      \r\n      </tr>\r\n      \r\n      \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n        <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>                 \r\n                  <td width=\"111\"><a href=\"javascript:Tab_Jumji('";
  private final static String _jspx_template40 = "')\"><img id=\"jumji_img\" name=\"jumji_img\" src=\"/img/sub_petition_title10_off.gif\" alt=\"시설/운영 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Unyong('";
  private final static String _jspx_template41 = "')\"><img id=\"unyong_img\" name=\"unyong_img\" src=\"/img/sub_gapan_title4_off.gif\" alt=\"운영자 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t  <tr>\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp\" name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=";
  private final static String _jspx_template42 = "&SECTION=";
  private final static String _jspx_template43 = "\"></iframe>\r\n\t\t</td>\r\n\t  </tr>\r\n\t  \r\n\t   <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n\r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  \r\n\t              <td width=\"111\" onclick =\"javascript:Tab_Product('";
  private final static String _jspx_template44 = "')\"><img id=\"product_img\" name=\"product_img\" src=\"/img/rojum_cal1_title_on.gif\" alt=\"점용료 산출내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n                  <td width=\"111\" onclick =\"javascript:Tab_Product_noPermission('";
  private final static String _jspx_template45 = "')\"><img id=\"noPermission_img\" name=\"noPermission_img\" src=\"/img/rojum_cal2_title_on.gif\" alt=\"변상금 산출내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n                  <td width=\"111\" onclick =\"javascript:Tab_Product_penalty('";
  private final static String _jspx_template46 = "')\"><img id=\"penalty_img\" name=\"penalty_img\" src=\"/img/rojum_cal3_title_off.gif\" alt=\"과태료 산출내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t              <td width=\"111\" onclick =\"javascript:Tab_Product_sale('";
  private final static String _jspx_template47 = "')\"><img id=\"sale_img\" name=\"sale_img\" src=\"/img/rojum_cal4_title_off.gif\" alt=\"폐기/매각 내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t              </tr>\r\n            </table>\r\n            </td>\r\n          </tr>\t\t  \r\n          <tr>\r\n  \t\t\t<td>\r\n  \t\t\t\t<iframe width=\"100%\" id = \"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this);\" scrolling=\"no\" src=\"\"></iframe>\r\n  \t\t\t</td>\r\n          </tr>\r\n        </table>\r\n        </td>\r\n      </tr>\t\t\r\n\t\t\r\n\t</table>\r\n\t</td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"40\" align=\"right\">\r\n\r\n\t      <img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\" onclick=\"javascript:goSearch();\" style=\"cursor:pointer\" >\r\n\t      \r\n      </td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"20\" ></td>\r\n\t</tr>\r\n\t\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\r\n</table>\r\n</form>\r\n</body>\r\n</html>";
}
