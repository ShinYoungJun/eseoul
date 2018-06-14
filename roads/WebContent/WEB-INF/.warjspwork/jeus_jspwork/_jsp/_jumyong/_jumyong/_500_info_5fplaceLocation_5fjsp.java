package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fplaceLocation_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(135,35);to=(135,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(136,41);to=(136,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(137,37);to=(137,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(138,53);to=(138,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(139,37);to=(139,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(140,39);to=(140,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Addr}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(141,39);to=(141,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(142,47);to=(142,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Locate_x }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(143,47);to=(143,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Locate_y }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(144,45);to=(144,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(153,176);to=(153,183)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listNum}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(169,176);to=(169,186)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${place.AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(172,178);to=(172,189)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${place.WIDTH}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(175,180);to=(175,192)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${place.HEIGHT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(178,136);to=(178,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${place.EXPLAIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template26);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template28);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template48);
      // jsp code [from=(220,27);to=(220,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);

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
  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template25);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_1.setPageContext(pageContext);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template27);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Llist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template29);
            // jsp code [from=(194,98);to=(194,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(194,108);to=(194,117)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(194,133);to=(194,144)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(194,161);to=(194,173)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(195,58);to=(195,67)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(196,46);to=(196,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(197,46);to=(197,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WIDTH}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(198,46);to=(198,58)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HEIGHT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(199,46);to=(199,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.EXPLAIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(200,86);to=(200,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LOCATE_X}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(200,106);to=(200,120)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LOCATE_Y}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template47);

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

  private boolean _jspx_th_c_if_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_2.setPageContext(pageContext);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template41);
          // jsp code [from=(204,106);to=(204,108)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template42);
          // jsp code [from=(204,116);to=(204,125)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template43);
          // jsp code [from=(204,141);to=(204,152)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template44);
          // jsp code [from=(204,169);to=(204,181)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template45);
          // jsp code [from=(205,83);to=(205,92)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template46);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
  private final static String _jspx_template7 = "    \r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script>\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\tvar placeLocationForm = document.placeLocationForm;\r\n\r\n\t\tif(placeLocationForm.Locate_x.value==null || placeLocationForm.Locate_x.value==\"\" || placeLocationForm.Locate_x.value.length==0){\r\n\t\t\talert(\"위치 정보가 필요합니다.\\n위치등록을 해 주세요\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(placeLocationForm.Locate_y.value==null || placeLocationForm.Locate_y.value==\"\" || placeLocationForm.Locate_y.value.length==0){\r\n\t\t\talert(\"위치 정보가 필요합니다.\\n위치등록을 해 주세요\");\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tif(placeLocationForm.AREA.value==null || placeLocationForm.AREA.value==\"\" || placeLocationForm.AREA.value.length==0){\t\t\t\r\n\t\t\talert(\"면적값이  필요합니다.\");\r\n\t\t\tplaceLocationForm.AREA.value=\"\";\r\n\t\t\tplaceLocationForm.AREA.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(placeLocationForm.AREA.value<=0){\r\n\t\t\talert(\"면적값을 올바르게 넣어주세요\");\r\n\t\t\tplaceLocationForm.AREA.value=\"\";\r\n\t\t\tplaceLocationForm.AREA.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(placeLocationForm.WIDTH.value.length>0)\r\n\t\tif(placeLocationForm.WIDTH.value<=0){\r\n\t\t\talert(\"가로값을 올바르게 넣어주세요\");\r\n\t\t\tplaceLocationForm.WIDTH.value=\"\";\r\n\t\t\tplaceLocationForm.WIDTH.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(placeLocationForm.HEIGHT.value.length>0)\r\n\t\tif(placeLocationForm.HEIGHT.value<=0){\r\n\t\t\talert(\"가로값을 올바르게 넣어주세요\");\r\n\t\t\tplaceLocationForm.HEIGHT.value=\"\";\r\n\t\t\tplaceLocationForm.HEIGHT.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(placeLocationForm.EXPLAIN.value.length==0){\r\n\t\t\tplaceLocationForm.EXPLAIN.value=\"-\";\r\n\t\t}\r\n\t\t\r\n\t\tvar mode = document.getElementById(\"mode\").value;\r\n\t\t\r\n\t\t//alert(document.getElementById(\"AREA1\").value);\r\n\t\t\r\n\t\tif(mode != \"edit\")\r\n\t\t\tdocument.getElementById(\"mode\").value = \"add\";\r\n\t\t\r\n\t\tplaceLocationForm.submit();\r\n\t}\r\n\t\r\n\tfunction goDel(seqValue)\r\n\t{\r\n\t\tvar no = document.getElementById(\"no\").value;\t\t\t\t\t\t//성공후 돌아올 페이지 위해\r\n\t\tvar currentPage = document.getElementById(\"currentPage\").value;\t\t//성공후 돌아올 페이지 위해\r\n\t\t\r\n\t\t//seqValue - 삭제할 번호를 찾음\r\n\t\t\r\n\t\tif(confirm(\"정말 삭제하시겠습니까?\"))\r\n\t\tlocation.href(\"/jumyong/jumyong/deleteLocation.do?no=\"+no+\"&currentPage=\"+currentPage+\"&seq=\"+seqValue);\r\n\t}\r\n\t\r\n\t  \r\n\tfunction popGeoInfo(flag, x, y)\r\n\t{\r\n\t\tvar form = document.placeLocationForm;\r\n\t\tvar addr = document.getElementById(\"Addr\").value;\r\n\t    var name = document.getElementById(\"Name\").value;\r\n\t    var no = document.getElementById(\"no\").value;\r\n\t    var pnu = document.getElementById(\"PNU\").value;\r\n\t    var url = \"\";\r\n\t\t    \r\n\t\tif(flag == \"check\"){ //위치확인\r\n\t\t\turl = '/jumyong/map/mini_map.do?PNU='+pnu+'&X_COORD='+x+'&Y_COORD='+y+'&TYPE=view';\r\n\t\t}\r\n\t\telse{\r\n\t\t\tif(document.getElementById(\"PNU\").value==\"0\"){\r\n\t\t    \talert(\"PNU 정보가 없습니다.\\관리자에게 연락하세요.\");\r\n\t\t    }\r\n\t\t    else{\t    \t\r\n\t\t\t\turl = '/jumyong/map/mini_map.do?PNU='+pnu+'&TYPE=edit';\r\n\t\t    }\r\n\t\t}\r\n\r\n\t\t\r\n   \t   \r\n\t\tcw=screen.availWidth; // 화면 너비\r\n\t\tch=screen.availHeight; // 화면 높이\r\n\t\t\r\n\t\tsw=800;// 띄울 창의 너비\r\n\t\tsh=600;// 띄울 창의 높이\r\n\t\t\r\n\t\tml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치\r\n\t\tmt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치\r\n\r\n  \t\tvar param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';\r\n\r\n\t\twindow.open(url, \"minimap\", param);\r\n\t}\r\n\t\r\n\t\r\n\r\n\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body >\r\n\r\n<form id=\"placeLocationForm\" name=\"placeLocationForm\" method=\"post\" action = \"/jumyong/placeLocationEdit.do\" >\r\n\r\n<input id=\"no\" name=\"no\" value=\"";
  private final static String _jspx_template10 = "\" type=\"hidden\" >\r\n<input id = \"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template11 = "\" type=\"hidden\" >\r\n<input id=\"seq\" name=\"seq\" value=\"";
  private final static String _jspx_template12 = "\" type=\"hidden\" >\r\n<input id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\" >\r\n<input id=\"PNU\" name=\"PNU\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\">\r\n<input id=\"Addr\" name=\"Addr\" value=\"";
  private final static String _jspx_template15 = "\" type=\"hidden\">\r\n<input id=\"Name\" name=\"Name\" value=\"";
  private final static String _jspx_template16 = "\" type=\"hidden\">\r\n<input id=\"Locate_x\" name=\"Locate_x\" value=\"";
  private final static String _jspx_template17 = "\" type=\"hidden\">\r\n<input id=\"Locate_y\" name=\"Locate_y\" value=\"";
  private final static String _jspx_template18 = "\" type=\"hidden\">\r\n<input id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template19 = "\" type=\"hidden\">\r\n\r\n<div id=\"view\" style=\"width:100%;\">\r\n<table width=\"100%\"   >\r\n\r\n            <tr>\r\n                <td>\r\n                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                    <tr>\r\n                      <td height=\"28\" colspan=\"7\" bgcolor=\"#FFFFFF\" class=\"table_bl_left\"><span class=\"sub_stan_blue\">* 위치정보</span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp총 ";
  private final static String _jspx_template20 = "건\r\n                      </td>\r\n                      </tr>\r\n                    <tr>\r\n                      <td width=\"5%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                      <td width=\"10%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n                      <td width=\"10%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">가로</td>\r\n                      <td width=\"10%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세로</td>\r\n                      <td width=\"35%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지 상세설명 </td>\r\n                      <td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용위치</td>\r\n                      <td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기능 </td>\r\n                      </tr>\r\n                      <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n                      <td height=\"26\" align=\"center\">-</td>\r\n                      \r\n                      <td align=\"center\">\r\n                      \t<input id=\"AREA\" name=\"AREA\" type=\"text\" class=\"input_form1\" style=\"width:40px\" onKeyPress=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" value=\"";
  private final static String _jspx_template21 = "\">\r\n                      </td>\r\n                      <td align=\"center\">\r\n\t                      <input id=\"WIDTH\" name=\"WIDTH\" type=\"text\" class=\"input_form1\" style=\"width:40px\" onKeyPress=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" value=\"";
  private final static String _jspx_template22 = "\">\r\n\t                  </td>\r\n                      <td align=\"center\">\r\n    \t                  <input id=\"HEIGHT\" name=\"HEIGHT\" type=\"text\" class=\"input_form1\" style=\"width:40px\" onKeyPress=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" value=\"";
  private final static String _jspx_template23 = "\">\r\n    \t              </td>\r\n                      <td align=\"center\">\r\n        \t              <input id=\"EXPLAIN\" name=\"EXPLAIN\" type=\"text\" class=\"input_form1\" style=\"width:220px\" maxlength=\"100\" value=\"";
  private final static String _jspx_template24 = "\">\r\n        \t          </td>\r\n                      <td align=\"center\">\r\n                      \t";
  private final static String _jspx_template25 = "\r\n                      \t<a href=\"javascript:popGeoInfo('write')\" class=\"inqu\"><img src=\"/img/loca_icon2.gif\" alt=\"위치등록\" width=\"64\" height=\"18\" border=\"0\"></a>\r\n                      \t";
  private final static String _jspx_template26 = "\r\n                      </td>\r\n                      <td align=\"center\">\r\n\t                    ";
  private final static String _jspx_template27 = "\r\n\t                    <img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\"></img>\r\n\t                    ";
  private final static String _jspx_template28 = "\r\n                      </td>\r\n                    </tr>\r\n                      \r\n                    ";
  private final static String _jspx_template29 = "\r\n                      <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" >\r\n                      <!-- onclick=\"javascript:location.href('/jumyong/placeLocationEdit.do?no=";
  private final static String _jspx_template30 = "&seq=";
  private final static String _jspx_template31 = "&currentPage=";
  private final static String _jspx_template32 = "&countPerPage=";
  private final static String _jspx_template33 = "');\" style=\"cursor:pointer\" -->\r\n                        <td height=\"26\" align=\"center\">";
  private final static String _jspx_template34 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template35 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template36 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template37 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template38 = "</td>\r\n                        <td align=\"center\"><a href=\"javascript:popGeoInfo('check','";
  private final static String _jspx_template39 = "','";
  private final static String _jspx_template40 = "')\" class=\"inqu\"><img src=\"/img/loca_icon.gif\" alt=\"위치확인!!\" width=\"64\" height=\"18\" border=\"0\"></a></td>\r\n                      \t<td align=\"center\">\r\n                      \t\t";
  private final static String _jspx_template41 = "\r\n                      \t\t<img src=\"/img/mod_icon2.gif\" alt=\"수정\" width=\"34\" height=\"18\" border=\"0\" \r\n                      \t\t\tonClick=\"javascript:location.href('/jumyong/placeLocationEdit.do?mode=edit&no=";
  private final static String _jspx_template42 = "&seq=";
  private final static String _jspx_template43 = "&currentPage=";
  private final static String _jspx_template44 = "&countPerPage=";
  private final static String _jspx_template45 = "'  );\" style=\"cursor:pointer\" >\r\n                      \t\t<img src=\"/img/del_icon.gif\" onClick=\"javascript:goDel('";
  private final static String _jspx_template46 = "'  );\" alt=\"삭제\" width=\"34\" height=\"18\" border=\"0\"  style=\"cursor:pointer\" >\r\n                      \t\t";
  private final static String _jspx_template47 = "\r\n                      \t</td>\r\n                      </tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template48 = "\r\n\r\n                </table>\r\n                \r\n                </td>\r\n              </tr>\r\n             <tr>\r\n                <td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                    <tr>\r\n                      <td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                        <tr>\r\n                        ";
  private final static String _jspx_template49 = "\r\n                        </tr>\r\n                        \r\n                      </table></td>\r\n\r\n                    </tr>\r\n                    <tr>\r\n                    </tr>\r\n                  </table></td>\r\n              </tr>\r\n            </table>\r\n</div>            \r\n\r\n\r\n<div id=\"edit\" style=\"width:100%;display:none;\">\r\n\r\n</div>    \r\n\r\n</form>\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
