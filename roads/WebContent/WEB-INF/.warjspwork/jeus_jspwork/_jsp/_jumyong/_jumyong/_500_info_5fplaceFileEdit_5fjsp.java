package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fplaceFileEdit_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  fmt:message ---- invoke //
      if (_jspx_th_fmt_message_0_fn(pageContext, null)) return;


      out.write(_jspx_template10);
      // ----  fmt:message ---- invoke //
      if (_jspx_th_fmt_message_1_fn(pageContext, null)) return;


      out.write(_jspx_template11);
      out.write(_jspx_template12);
      // jsp code [from=(298,37);to=(298,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(299,41);to=(299,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(300,39);to=(300,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(301,55);to=(301,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(309,95);to=(309,102)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listNum}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template43);
      // jsp code [from=(381,13);to=(381,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);

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
  private boolean _jspx_th_fmt_message_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  fmt:message ---- //
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = new org.apache.taglibs.standard.tag.rt.fmt.MessageTag();
    _jspx_th_fmt_message_0.setPageContext(pageContext);
    _jspx_th_fmt_message_0.setKey("attachfile.defaultfile.size");
    try {
      int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();

      if (_jspx_th_fmt_message_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_fmt_message_0.release();
    }
    return false;
  }

  private boolean _jspx_th_fmt_message_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  fmt:message ---- //
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = new org.apache.taglibs.standard.tag.rt.fmt.MessageTag();
    _jspx_th_fmt_message_1.setPageContext(pageContext);
    _jspx_th_fmt_message_1.setKey("attachfile.maxfile.size");
    try {
      int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();

      if (_jspx_th_fmt_message_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_fmt_message_1.release();
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
            out.write(_jspx_template18);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template42);

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

  private boolean _jspx_th_c_choose_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_0.setPageContext(pageContext);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template19);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template26);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template41);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_0.setPageContext(pageContext);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ == seq}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template20);
          // jsp code [from=(325,44);to=(325,53)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template21);
          // jsp code [from=(328,15);to=(328,29)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${attatched_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template22);
          // jsp code [from=(331,119);to=(331,137)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DATA_EXPLAIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template23);
          // jsp code [from=(333,117);to=(333,134)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ATTACH_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template24);
          // jsp code [from=(336,128);to=(336,141)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REGDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template25);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_0.setPageContext(pageContext);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
      if (_jspx_eval_c_otherwise_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template27);
          // jsp code [from=(358,44);to=(358,53)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template28);
          // jsp code [from=(359,32);to=(359,52)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DATA_TYPE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template29);
          // jsp code [from=(360,32);to=(360,50)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DATA_EXPLAIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template30);
          // jsp code [from=(362,140);to=(362,157)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ATTACH_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template31);
          // jsp code [from=(362,163);to=(362,186)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ATTACH_SAVED_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template32);
          // jsp code [from=(362,193);to=(362,210)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ATTACH_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template33);
          // jsp code [from=(364,32);to=(364,59)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.REGDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template34);
          // jsp code [from=(365,179);to=(365,181)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template35);
          // jsp code [from=(365,189);to=(365,198)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template36);
          // jsp code [from=(365,214);to=(365,225)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template37);
          // jsp code [from=(365,242);to=(365,254)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template38);
          // jsp code [from=(366,70);to=(366,79)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template39);
          // jsp code [from=(366,85);to=(366,108)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ATTACH_SAVED_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template40);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

  }
  
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n\r\n.ov {\r\n\ttext-decoration: underline;\r\n\tcolor: red;\r\n}\r\n\r\n.ot {\r\n\ttext-decoration: none;\r\n\tcolor: black;\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n\r\n\r\n<script>\r\n\r\n\t\r\n\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\tvar placeFileForm = document.placeFileForm;\r\n\t\t\r\n\t\tvar mode = document.getElementById(\"mode\").value;\r\n\t\t\r\n\t\tif(mode != \"edit\")\r\n\t\t\tdocument.getElementById(\"mode\").value = \"add\";\r\n\t\t\t\r\n\t\tif(document.getElementById('ATTACH_SIZE').value == \"\" || document.getElementById('ATTACH_FILE').value ==\"\")\r\n\t\t{\r\n\t\t\talert(\"파일이 첨부되지 않았습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif( document.placeFileForm.DATA_TYPE.value == \"\" ){\r\n\t\t\talert(\"자료유형이 선택되지 않았습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tplaceFileForm.submit();\r\n\t}\r\n\t\r\n\tfunction goDel(seqValue)\r\n\t{\r\n\t\tvar no = document.getElementById(\"no\").value;\t\t\t\t\t\t//성공후 돌아올 페이지 위해\r\n\t\tvar currentPage = document.getElementById(\"currentPage\").value;\t\t//성공후 돌아올 페이지 위해\r\n\t\t\r\n\t\tif(confirm(\"정말 삭제하시겠습니까?\"))\r\n\t\tlocation.href(\"/jumyong/jumyong/deleteFile.do?no=\"+no+\"&filename=\"+delfile+\"&currentPage=\"+currentPage+\"&seq=\"+seqValue);\r\n\t}\r\n\t\r\n\t\r\n\tvar MaxFileCnt = 1;\r\n\tvar TotalFileCnt = 0;\r\n\tvar TotalFileSize = 0;\r\n\t\t\r\n\tvar MaxSizeParam = null;\r\n\tvar MaxSize = 0;\r\n\tvar DefaultMaxSize = 10240000;//parseInt('";
  private final static String _jspx_template10 = "');\t\r\n\t\r\n\t// max size 지정이 안되어있는 경우 default max size지정\r\n\tif(MaxSizeParam == null)\r\n\t\tMaxSize = DefaultMaxSize/1024000;\r\n\telse\r\n\t\tMaxSize = MaxSizeParam;\r\n\t\t\r\n\tvar MaxNormalSize = parseInt('";
  private final static String _jspx_template11 = "');\t\r\n\r\n\t\t\r\n\tfunction remove_item(seq) {\r\n\r\n\t\t\r\n\t\tTotalFileCnt = parseInt(TotalFileCnt)-1;\t\t\r\n\t   \tdocument.getElementById('total_file_index').value = TotalFileCnt;\t    \r\n\t    \r\n\t    scripts[seq].status = false;\r\n\t    document.getElementById('file_item'+(seq+1)).innerHTML = '';\r\n\t    item_list();\r\n\t}\t\r\n\r\n\tfunction attach(obj) {\r\n\t    var val = obj.value;\r\n\t\tfile_size = get_file_check(document.getElementById(obj.id).value);\t\r\n\t\t\r\n\t\tif(0 == file_size)\r\n\t\t{\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tdocument.getElementById('ATTACH_SIZE').value = CutDecimalPoint(file_size/1024);\t    \r\n\t    document.getElementById('ATTACH_FILE').value = getNoDirFileName(val);\r\n\t}\r\n\t\r\n\tfunction get_file_check(filename)\r\n\t{\r\n\r\n\t\t//먼저 확장자 체크부터 한다.\r\n\t\tif(false == check_fileExt(filename))\r\n\t\t\treturn 0;\r\n\t\t\r\n\t\ttmpfilesize = getFileSize(filename);\r\n\t\t\r\n\t\t//파일이름 길이 체크\r\n\t\tif(false == check_fileNameSize(filename))\r\n\t\t\treturn 0;\r\n\r\n\t\t/*\r\n\t\tif(tmpfilesize > MaxSize*1024000)\r\n\t\t{\r\n\t\t\talert(MaxSize+\"MB이상 파일은 첨부할 수 없습니다.\");\r\n\t\t\treturn 0;\r\n\t\t}\r\n\t\t\r\n\t\tTotalFileSize = TotalFileSize + parseInt(tmpfilesize);\r\n\r\n\t\t// 페이지별로 지정된 max용량 비교\r\n\t\tif(TotalFileSize > MaxSize*1024000)\r\n\t\t{\r\n\t\t\talert(\"첨부파일의 총용량은 \"+MaxSize+\"MB이상을 초과할 수 없습니다.\");\r\n\t\t\tTotalFileSize = TotalFileSize - parseInt(tmpfilesize);\r\n\t\t\tdocument.getElementById('ATTACH_SIZE').value = \"\";\r\n\t\t\tdocument.getElementById('ATTACH_FILE').value =\"\";\r\n\t\t\treturn 0;\r\n\t\t}\r\n\r\n\t\t// 전체 시스템에 지정된 max용량 비교\r\n\t\tif(TotalFileSize > MaxNormalSize)\r\n\t\t{\r\n\t\t\talert(\"첨부파일의 총용량은 \"+MaxNormalSize+\"MB이상을 초과할 수 없습니다.\");\r\n\t\t\tdocument.getElementById('ATTACH_SIZE').value = \"\";\r\n\t\t\tdocument.getElementById('ATTACH_FILE').value =\"\";\r\n\t\t\tTotalFileSize = TotalFileSize - parseInt(tmpfilesize);\r\n\t\t\treturn 0;\r\n\t\t}\t\r\n\t\t*/\r\n\t\treturn tmpfilesize;\r\n\t}\r\n\t\r\n\t\r\n\tfunction check_fileNameSize(filename){\r\n\t\tvar path = filename.split(\"\\\\\");\r\n\t\tvar fileNameSize = path[path.length - 1].length;\r\n\t\t\r\n\t\tif(fileNameSize > 20){\r\n\t\t\talert('파일이름이 20자를 초과할수 없습니다.');\r\n\t\t\treturn false;\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\treturn true;\r\n\t\t}\r\n\t\t\r\n\t}\r\n\t\r\n\t/**\r\n\t* 첨부파일 확장자 체크\r\n\t*/\r\n\tfunction check_fileExt(filename)\r\n\t{\r\n\t\tvar index = filename.lastIndexOf('.');\r\n\t\tfileExpan = filename.substring(parseInt(index)+1 , filename.length );\r\n\t\tfileExpan = fileExpan.toLowerCase();\r\n\r\n\r\n\t\tif(fileExpan ==\"jpg\"||fileExpan ==\"gif\"||fileExpan ==\"bmp\"\r\n\t\t\t||fileExpan ==\"hwp\"||fileExpan ==\"doc\"||fileExpan ==\"xls\"||fileExpan ==\"xlsx\"||fileExpan ==\"txt\"\r\n\t\t\t||fileExpan ==\"ppt\"||fileExpan ==\"zip\"||fileExpan ==\"wmv\"||fileExpan ==\"mpg\"\r\n\t\t\t||fileExpan ==\"pdf\"){\r\n\t\t\treturn true;\r\n\t\t}\r\n\t\telse{\r\n//\t\t\tdocument.getElementById(\"file_item1\").innerHTML = '<input type=\"file\" name=\"file1\" id=\"file1\" onchange=\"attach(this)\" size=\"100\" >';\r\n\t\t\talert(\"실행파일은 첨부할수 없습니다.\\n다시 선택하여 주십시오.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\t\r\n\t}\t\t\t\r\n\t\r\n\t\r\n\t\r\n\tfunction getFileSize(filename)\r\n\t{\r\n\t\treturn 1024*1024;\r\n\t}\r\n\t\r\n\tfunction getNoDirFileName(filename)\r\n\t{\r\n\t\tvar path = filename.split(\"\\\\\");\r\n\t\treturn path[path.length - 1];\t\t\r\n\t}\r\n\t\r\n\t\r\n\tfunction getFileName(seq) { \r\n\t return document.getElementById('file'+(seq+1)).value;\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t\r\n\tfunction add_item(idx, val) {\r\n\r\n\t    var seq = scripts.length;\r\n\t    var display_script = '<span id=\\\"display_item'+idx+'\\\">'+getNoDirFileName(val)+'&nbsp;&nbsp;<img src=\\\"/images/button/delete.gif\\\" align=\\\"absmiddle\\\" onclick=\\\"remove_item('+seq+')\\\" style=\\\"cursor:pointer\\\" alt=\\\"삭제\\\"><br/>';\r\n\t    var file_script = '<span id=\\\"file_item'+idx+'\\\"><input type=\\\"file\\\" name=\\\"file'+idx+'\\\" id=\\\"file'+idx+'\\\" onchange=\\\"attach(this)\\\" size=\\\"1\\\" style=\\\"width:0;cursor:pointer\\\"></span>';   \r\n\t    scripts[seq] = new make_array(true, display_script);\r\n\t    document.getElementById('file_items').insertAdjacentHTML(\"afterEnd\", file_script);\r\n\t    \r\n\t}\r\n\t\r\n\t\r\n\r\n\r\n\r\n\tvar scripts = new Array; \r\n\tfunction make_array(status, display_script) {\r\n\t    this.status = status;\r\n\t    this.display_script = display_script;\r\n\t}\r\n\t\r\n\t\t//소수점 이하 처리 함수 ;소수점 둘째자리까지 표현 \r\n\t  function CutDecimalPoint(intTarget) {\r\n\t        var intResult = 0;\r\n\t        var strTarget = String(intTarget).split('.');\r\n\t        if(strTarget[1]!=null && strTarget[1].length > 2) {\r\n\t      ";
  private final static String _jspx_template12 = "      strTarget[1] = strTarget[1].slice(0, 2);\r\n\t        }else{\r\n\t            strTarget[1] = \"00\";\r\n\t        }\r\n\t        intResult = Number(strTarget[0]+'.'+strTarget[1]);\r\n\t        return intResult;\r\n\t    } \t\r\n\t\r\n\t\r\n\t\tfunction item_list() {\r\n\t    var validate_cnt = 0;\r\n\t    var display_scripts = '';\r\n\t\r\n\t    for (var i = 0; i < scripts.length; i++) {\r\n\t        if (scripts[i].status){\r\n\t            validate_cnt++;\r\n\t            display_scripts += '<b>'+validate_cnt+'</b>. '+scripts[i].display_script;\r\n\t            \r\n\r\n\t        }\r\n\t    }\r\n\t \r\n\t\tif (validate_cnt == 0)\r\n\t        display_scripts = '<img src=\\\"/images/common/navi_arr.gif\\\" align=\\\"absmiddle\\\">첨부 파일이 없습니다...';\r\n\t}\r\n\t\r\n\t\tfunction goDown(attatch_file,saved_file)\r\n\t\t{\r\n\t\t\tdocument.fileDownForm.fileName.value = trimStr(attatch_file);\r\n\t\t\tdocument.fileDownForm.realFileName.value = trimStr(saved_file);\r\n\t\t\tdocument.fileDownForm.submit();\r\n\t\t\t\r\n\t\t}\r\n\r\n\t\tfunction trimStr(str)\r\n\t\t{\t\r\n\t\t\tre = / /g;\r\n\t\t\tstr = str.replace(re,\"\"); \r\n\t\t\treturn str;\r\n\r\n\t\t}\r\n\r\n\t\r\n\r\n\t\r\n\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n\t<input type=\"hidden\" id=\"total_file_index\" name=\"total_file_index\">\r\n\t\r\n\t<form id=\"fileDownForm\" name=\"fileDownForm\" method=\"post\" action=\"/vodownload.do\">\r\n\t\t<input id=\"fileName\" name=\"fileName\" type=\"hidden\" >\r\n\t\t<input id=\"realFileName\" name=\"realFileName\" type=\"hidden\" >\r\n\t</form>\r\n\r\n\t<form id=\"placeFileForm\" name=\"placeFileForm\" method=\"post\" action=\"/jumyong/placeFileEdit.do\" enctype=\"multipart/form-data\">\r\n\t\t<input id=\"no\" name=\"no\" value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\"> \r\n\t\t<input id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\"> \r\n\t\t<input id=\"seq\" name=\"seq\" value=\"";
  private final static String _jspx_template15 = "\" type=\"hidden\"> \r\n\t\t<input id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template16 = "\" type=\"hidden\">\r\n\r\n\t\t<table width=\"100%\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"28\" colspan=\"7\" bgcolor=\"#FFFFFF\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<span class=\"sub_stan_blue\">*파일정보</span> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 총 ";
  private final static String _jspx_template17 = "건\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"5%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">자료유형</td>\r\n\t\t\t\t\t\t\t<td width=\"23%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">자료설명</td>\r\n\t\t\t\t\t\t\t<td width=\"23%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">첨부파일명</td>\r\n\t\t\t\t\t\t\t<td width=\"10%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록날짜</td>\r\n\t\t\t\t\t\t\t<td width=\"14%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기능</td>\r\n\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template19 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"DATA_TYPE\" name=\"DATA_TYPE\" class=\"input_form1\" style=\"width: 90px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\"><input name=\"DATA_EXPLAIN\" type=\"text\" class=\"input_form1\" style=\"width: 140px\" value=\"";
  private final static String _jspx_template23 = "\" maxlength=\"150\"></td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"ATTACH_FILE\" id=\"ATTACH_FILE\" type=\"text\" class=\"input_form1\" style=\"width: 140px\" value=\"";
  private final static String _jspx_template24 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"ATTACH_SIZE\" name=\"ATTACH_SIZE\" type=\"hidden\" class=\"input_form1\" style=\"width:45px\" >\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\"><input name=\"REGDATE\" id=\"REGDATE\" type=\"hidden\" class=\"input_form1\" style=\"width: 55px\" value=\"";
  private final static String _jspx_template25 = "\"> \r\n\t\t\t\t\t\t\t\t\t\t\t<span onclick=\"javascript:document.getElementById('file1').click();\" style=\"cursor: pointer; position: relative; top: 10px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/file2.gif\" align=\"absmiddle\" alt=\"파일첨부하기\">&nbsp;파일첨부\r\n\t\t\t\t\t\t\t\t\t\t\t</span>\r\n\t\t\t\t\t\t\t\t\t\t\t<div style=\"width: 10; height: 16; overflow: hidden; position: relative; top: -5px; filter: alpha(opacity = 0); -moz-opacity: 0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"file_items\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<span id=\"file_item1\"><input type=\"file\" id=\"file1\" name=\"file1\"  onchange=\"attach(this)\" size=\"1\" style=\"width: 50; cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor: pointer\"> \r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template26 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template27 = "\r\n\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template28 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template30 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t<span style=\"cursor: pointer;\" onmouseover=\"this.className='ov'\" onmouseout=\"this.className='ot'\" class=\"ot\" onclick=\"goDown('";
  private final static String _jspx_template31 = "','";
  private final static String _jspx_template32 = "')\">";
  private final static String _jspx_template33 = " </span>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template34 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\"><img src=\"/img/mod_icon2.gif\" alt=\"수정\" width=\"34\" height=\"18\" border=\"0\" onClick=\"javascript:location.href='/jumyong/placeFileEdit.do?mode=edit&no=";
  private final static String _jspx_template35 = "&seq=";
  private final static String _jspx_template36 = "&currentPage=";
  private final static String _jspx_template37 = "&countPerPage=";
  private final static String _jspx_template38 = "'\" style=\"cursor: pointer\"> \r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/del_icon.gif\" onClick=\"javascript:goDel('";
  private final static String _jspx_template39 = "','";
  private final static String _jspx_template40 = "');\" alt=\"삭제\" width=\"34\" height=\"18\" border=\"0\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template43 = "\r\n\r\n\t\t\t\t\t</table></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</form>\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
