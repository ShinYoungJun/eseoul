package jeus_jspwork._jsp._rojum._minwon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_excel_5fsearch_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(20,3);to=(24,1)]
      
      	response.setContentType("application/vnd.ms-excel; charset=euc-kr");
       	response.setHeader("Content-Disposition", "filename=거리가게민원현황.xls"); 
       	response.setHeader("Content-Description", "JSP Generated Data"); 

      out.write(_jspx_template10);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


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
  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template11);
            // jsp code [from=(40,42);to=(40,73)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.REGIST_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template12);
            // jsp code [from=(41,43);to=(41,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL_SUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(42,42);to=(42,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(43,42);to=(43,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(44,42);to=(44,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(45,42);to=(45,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL4}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(46,42);to=(46,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL5}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(47,42);to=(47,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL6}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(48,42);to=(48,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL7}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);

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

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

  }
  
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n\r\n<html xmlns:x=\"urn:schemas-microsoft-com:office:excel\">\r\n<head>\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<!--[if gte mso 9]><xml>\r\n<x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet>\r\n<x:Name>Sheet1</x:Name>\r\n<x:WorksheetOptions><x:Panes><x:Pane>\r\n</x:Pane></x:Panes></x:WorksheetOptions>\r\n</x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook>\r\n</xml><![endif]-->\r\n</head>\r\n\r\n<body>\r\n\r\n";
  private final static String _jspx_template10 = "\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n     <tr height=\"26px\">\r\n       <td width=\"90px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일자</td>\r\n       <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">계</td>\r\n       <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인터넷</td>\r\n       <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">120살피미</td>\r\n       <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">해피콜</td>\r\n       <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화</td>\r\n       <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">방문</td>\r\n       <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">진정ㆍ건의</td>\r\n       <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기타</td>\r\n   </tr>\r\n\t";
  private final static String _jspx_template11 = "\r\n   <tr height=\"26px\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor: pointer\">\r\n       <td width=\"90px\" align=\"center\">";
  private final static String _jspx_template12 = "</td>\r\n       <td width=\"100px\" align=\"center\">";
  private final static String _jspx_template13 = "</td>\r\n       <td width=\"80px\" align=\"center\">";
  private final static String _jspx_template14 = "</td>\r\n       <td width=\"80px\" align=\"center\">";
  private final static String _jspx_template15 = "</td>\r\n       <td width=\"80px\" align=\"center\">";
  private final static String _jspx_template16 = "</td>\r\n       <td width=\"80px\" align=\"center\">";
  private final static String _jspx_template17 = "</td>\r\n       <td width=\"80px\" align=\"center\">";
  private final static String _jspx_template18 = "</td>\r\n       <td width=\"80px\" align=\"center\">";
  private final static String _jspx_template19 = "</td>\r\n       <td width=\"80px\" align=\"center\">";
  private final static String _jspx_template20 = "</td>\r\n   </tr>\r\n   ";
  private final static String _jspx_template21 = "\r\n\r\n</table>\r\n</body>\r\n</html>\r\n\r\n";
}
