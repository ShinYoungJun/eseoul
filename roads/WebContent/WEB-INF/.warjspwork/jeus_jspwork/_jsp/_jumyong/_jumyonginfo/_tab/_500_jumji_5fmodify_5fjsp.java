package jeus_jspwork._jsp._jumyong._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumji_5fmodify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template1);
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template2);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      out.write(_jspx_template8);
      out.write(_jspx_template9);
      out.write(_jspx_template10);
      out.write(_jspx_template11);
      out.write(_jspx_template12);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template16);
      out.write(_jspx_template17);
      out.write(_jspx_template18);
      // jsp code [from=(585,39);to=(585,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(588,61);to=(588,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(589,65);to=(589,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(590,59);to=(590,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(603,10);to=(603,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(607,10);to=(607,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${occupancy_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(614,10);to=(614,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_owner_Group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(618,10);to=(618,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(626,110);to=(626,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(639,144);to=(639,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(640,103);to=(640,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(641,101);to=(641,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_HO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(648,109);to=(648,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JYADDR_NEW}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(649,107);to=(649,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JYADDR_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(650,106);to=(650,121)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JYADDR_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(658,11);to=(658,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SIGUNGU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(660,24);to=(660,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(663,19);to=(663,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(666,19);to=(666,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(668,51);to=(668,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(669,51);to=(669,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(670,50);to=(670,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(671,47);to=(671,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(680,108);to=(680,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(681,233);to=(681,247)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(682,236);to=(682,249)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(692,123);to=(692,140)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARKING_NUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(695,116);to=(695,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RIVER_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(698,109);to=(698,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RIVER_RANK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(706,16);to=(706,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sigungu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(709,16);to=(709,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(712,19);to=(712,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(734,170);to=(734,180)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(734,195);to=(734,211)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template57);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template61);
      // jsp code [from=(771,105);to=(771,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(777,131);to=(777,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(781,121);to=(781,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // jsp code [from=(787,135);to=(787,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template65);
      // jsp code [from=(791,125);to=(791,147)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template66);
      // jsp code [from=(799,152);to=(799,167)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(816,70);to=(816,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WORK_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);
      // jsp code [from=(819,66);to=(819,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WORK_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template69);
      // jsp code [from=(828,105);to=(828,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.EXE_INFO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${priceAddrList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("addr");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template13);
            // jsp code [from=(217,18);to=(217,26)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${addr.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(217,32);to=(217,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${addr.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);

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

  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template53);
          // jsp code [from=(745,155);to=(745,174)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTLY_PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template54);
          // jsp code [from=(746,144);to=(746,162)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTAL_PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template55);
          // jsp code [from=(749,92);to=(749,106)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DUE_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template56);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION != '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template58);
          // jsp code [from=(759,119);to=(759,137)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template59);
          // jsp code [from=(760,118);to=(760,134)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template60);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "  \r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n";
  private final static String _jspx_template11 = "  \r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<!--  //********** BEGIN_현진_20120215 -->\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>\r\n<!--   //********** END_현진_20120215 -->   \r\n\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n           \r\n          \r\n\t//2014.3.10 우편번호체크\r\n\tfunction isPostNum(obj)\r\n\t{\r\n\t\tif(!isNum(obj, \"우편번호\")) return;\t//숫자여부체크\r\n\t\tif(form.MUL_POST.value.length < 6 && form.MUL_POST.value.length > 0){\r\n\t\t\talert(\"우편번호는 6자리 입니다!\")\r\n\t\t}\r\n\t\treturn;\r\n\t\t\r\n\t}\r\n\r\n\t\r\n\tfunction\tModifyPrc()\r\n\t{\r\n\t\tvar\tresult\t= DataCheck();\r\n\r\n\t\tif(result\t==\tfalse)\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tform.PURPOSE_CD.value\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE_CD\").value;\r\n\r\n\t\tform.action = \"/jumyong/jumyonginfo/jumji_modify_prc.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tCancel()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/jumyong/jumyonginfo/jumji_view.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tInit_UseType(sel)\r\n\t{\r\n\t\tif(sel == '2')\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"하천명/등급\";\r\n\t\t\tdocument.getElementById(\"UseType2\").style.display \t= \"inline-block\";\t// 하천명\r\n\t\t\tdocument.getElementById(\"UseType3\").style.display \t= \"inline-block\"; // 하천등급\r\n\t\t}else if(sel == '3'){\r\n\t\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"하천명\";\r\n\t\t\tdocument.getElementById(\"UseType2\").style.display \t= \"inline-block\";\t// 하천명\r\n\t\t}else if(sel == '1'){\r\n\t\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"주차면수\";\r\n\t\t\tdocument.getElementById(\"UseType1\").style.display \t= \"inline-block\";\t//\t도로\r\n\t\t}\r\n\t}\r\n\r\n\tfunction\tSelect_UseType(sel)\r\n\t{\r\n\t\tdocument.getElementById(\"UseType1\").style.display = \"none\";\r\n\t\tdocument.getElementById(\"UseType2\").style.display = \"none\";\r\n\t\tdocument.getElementById(\"UseType3\").style.display \t= \"none\";\r\n\t\t\r\n\t\tif(sel.value == '2')\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"하천명/등급\";\r\n\t\t\tdocument.getElementById(\"UseType2\").style.display \t= \"inline-block\";\t// 하천명\r\n\t\t\tdocument.getElementById(\"UseType3\").style.display \t= \"inline-block\"; // 하천등급\r\n\t\t\t\r\n\t\t}\r\n\t\telse if(sel.value == '3')\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"하천명\";\r\n\t\t\tdocument.getElementById(\"UseType2\").style.display \t= \"inline-block\";\t// 하천명\r\n\t\t}\r\n\t\telse if(sel.value == '1')\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"주차면수\";\r\n\t\t\tdocument.getElementById(\"UseType1\").style.display \t= \"inline-block\";\t//\t도로\r\n\t\t\t\r\n\t\t}\r\n\r\n\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode.jsp?SectionCode=\" + sel.value + \"&essential=1\";\r\n\t}\r\n\r\n\r\n\tfunction\tSelect_UseSection(sel)\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\tif(sel.value == '2')\r\n\t\t{\r\n\t\t\tvar MUL_DIV = document.getElementById(\"MUL_DIV\");\r\n\t\t  \t\r\n\t\t  \tvar innerHtml = \"\";\r\n\t\t  \tinnerHtml += \"<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>\";\r\n\t\t\t\tinnerHtml += \"\t<tr id='MulDateSection'>\";\r\n\t\t  \tinnerHtml += \"\t\t<td id='UseSection' style='display:block'>\";\r\n\t\t  \tinnerHtml += \"\t\t\t<input id='PARTLY_PERIOD' maxlength='100' name='PARTLY_PERIOD' type='text' class='essential' style='width:300px'\"; \r\n\t\t  \tinnerHtml += \"\t\t\tvalue='일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09' onclick='checkPARTLY_PERIOD()'>\";\r\n\t\t\t \tinnerHtml += \"\t\t\t&nbsp;&nbsp;총<input name='TOTAL_PERIOD' maxlength='5' type='text' class='essential' style='width:30px' value='' style='ime-mode:disabled' onKeyDown='nr_num_int(this);' onKeyUp='nr_num_int(this);' onKeyPress='nr_num_int(this);'>일\";\r\n\t\t\t \tinnerHtml += \"\t\t</td>\";\r\n\t\t\t \tinnerHtml += \"\t<td bgcolo";
  private final static String _jspx_template12 = "r='eaeaea' class='table_bl_left'>&nbsp;&nbsp;&nbsp;(만료일: \";\r\n\t\t\t \tinnerHtml += \"<input id='DUE_DATE' name='DUE_DATE' type='text' readonly style='width: 70px;'>\";\r\n\t\t\t \tinnerHtml += \"<a><img onclick=\\\"popUpCalendar(this, document.getElementById('DUE_DATE'), 'yyyymmdd')\\\" src='/img/calendar_icon.gif' width='16' height='16' border='0' align='absmiddle' style='vertical-align:middle;CURSOR: pointer;'></a>\";\r\n\t\t\t \tinnerHtml += \")</td>\";\r\n\t\t\t \tinnerHtml += \"\t</tr>\";\r\n\t  \t\tinnerHtml += \"</table>\";\r\n\t\t \t\r\n\t\t \t\tMUL_DIV.innerHTML = innerHtml;\r\n\r\n\t\t\t \t/*innerHtml = \"\";\r\n\t\t\t \tinnerHtml += \"<input id='DUE_DATE' name='DUE_DATE' type='text' class='essential' readonly='readonly'>\";\r\n\t\t\t \tinnerHtml += \"<a><img onclick=\\\"popUpCalendar(this, document.getElementById('DUE_DATE'), 'yyyymmdd')\\\" src='/img/calendar_icon.gif' width='16' height='16' border='0' align='absmiddle' style='vertical-align:middle;CURSOR: pointer;'></a>\";\r\n\t\t\t \tdocument.getElementById(\"setSectionTD\").innerHTML = innerHtml;*/\t \t\r\n\r\n\t\t}\r\n\t\telse if(sel.value == '3')\r\n\t\t{\r\n\t\t\tvar MUL_DIV = document.getElementById(\"MUL_DIV\");\r\n\t\t\t\r\n\t\t\tvar innerHtml = \"\";\r\n\t\t\t\tinnerHtml += \"<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>\";\r\n\t\t\t\tinnerHtml += \"\t<tr id='MulDateSection'>\";\r\n\t\t\t\tinnerHtml += \"\t\t<td id='UseSection' style='display:block'>\";\r\n\t\t  \t\tinnerHtml += \"\t\t\t<input id='MUL_FROMDATE' name='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\\\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd', 0)\\\" style='CURSOR: Hand;'></a>\";\r\n\t\t\t  \tinnerHtml += \"\t\t\t~ <input id='MUL_TODATE' name='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\\\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd', 0)\\\" style='CURSOR: Hand;'></a>\";\r\n\t  \t\t\tinnerHtml += \"\t\t</td>\";\r\n\t\t  \t\tinnerHtml += \"\t</tr>\";\r\n\t\t  \t\tinnerHtml += \"</table>\";\r\n\t\t  \t\t\r\n\t\t  \tMUL_DIV.innerHTML = innerHtml;\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tvar MUL_DIV = document.getElementById(\"MUL_DIV\");\r\n\t\t\t\r\n\t\t\tvar innerHtml = \"\";\r\n\t\t\t\tinnerHtml += \"<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>\";\r\n\t\t\t\tinnerHtml += \"\t<tr id='MulDateSection'>\";\r\n\t\t\t\tinnerHtml += \"\t\t<td id='UseSection' style='display:block'>\";\r\n\t\t  \t\tinnerHtml += \"\t\t\t<input id='MUL_FROMDATE' name='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\\\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')\\\" style='CURSOR: Hand;'></a>\";\r\n\t\t\t  \tinnerHtml += \"\t\t\t~ <input id='MUL_TODATE' name='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\\\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')\\\" style='CURSOR: Hand;'></a>\";\r\n\t  \t\t\tinnerHtml += \"\t\t</td>\";\r\n\t  \t\t\tinnerHtml += \"\t</tr>\";\r\n\t  \t\t\tinnerHtml += \"</table>\";\r\n\t  \t\t\r\n\t  \t\tMUL_DIV.innerHTML = innerHtml;\r\n\t\t}\r\n\t\t\r\n\t}\r\n\t//********** BEGIN_현진_20120215\r\n\t/*\r\n\t\tfunction \topenZipcodePopup(post, addr)\r\n\t{\r\n\t\tvar\tpost1\t= post;\r\n\t\tvar\taddr1\t= addr;\r\n\r\n\t\tvar url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1;\r\n\t\tvar winName = \"우편번호입력\";\r\n\t\tvar width \t= 420;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t}\t\r\n\t\r\n\t*/\r\n\t//********** END_현진_20120215\r\n\t\r\n\r\n\tfunction \tInit()\r\n\t{\t\r\n\t\tparent.Tab_Img(\"jumji\");\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\t\r\n\t\t";
  private final static String _jspx_template13 = "\r\n\t\taddWithAddr('";
  private final static String _jspx_template14 = "','";
  private final static String _jspx_template15 = "');\r\n\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\r\n\t}\r\n\r\n\r\n\tfunction\tDataCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n\t\t//\t점용지 정보\r\n\t\tif(form.TYPE.value.length\t< 1){\r\n\t\t\tstr\t+= \"점용 종류를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.TYPE.focus();\r\n\t\t}\r\n\t\telse if(form.SECTION.value.length\t< 1){\r\n\t\t\tstr\t+= \"점용 구분을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.SECTION.focus();\r\n\t\t}\r\n\t\telse if(form.OWNER_SET.value.length\t< 1){\r\n\t\t\tstr\t+= \"소유자 구분을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.OWNER_SET.focus();\r\n\t\t}\r\n\t\telse if(form.TAX_SET.value.length\t< 1){\r\n\t\t\tstr\t+= \"세입 구분을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.TAX_SET.focus();\r\n\t\t}\r\n\t\telse if(form.BJ_CD.value.length\t< 1){\r\n\t\t\tstr\t+= \"점용지 법정동을 입력하세요.\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.BJ_CD.focus();\r\n\t\t}\r\n\t\telse if(form.HJ_CD.value.length\t< 1){\r\n\t\t\tstr\t+= \"점용지 행정동을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.HJ_CD.focus();\r\n\t\t}\r\n\t\telse if(form.SPC_CD.value.length\t< 1){\r\n\t\t\tstr\t+= \"점용지 번지선택을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.SPC_CD.focus();\r\n\t\t}\r\n\t\telse if(form.BONBUN.value.length\t< 1){\r\n\t\t\tstr\t+= \"점용지 본번을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.BONBUN.focus();\r\n\t\t}\r\n\t\telse if(form.ROAD_BON.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"도로 주소를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.ROAD_BON.focus();\r\n\t\t}\r\n\t\telse if(form.MUL_POST.value.length\t< 1){\r\n\t\t\tstr\t+= \"우편번호를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\topenZipcodePopup('form.MUL_POST', '', '', '', '', '', '', '', '', '');\r\n\t\t}\r\n\t\telse if(IFRM_PurposeCode.PURPOSE_CD.value < 010){\r\n\t\t\tstr\t+= \"점용목적을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t}\r\n\t\telse if(form.AREA_SIZE.value.length < 1){\r\n\t\t\tstr\t+= \"점용면적을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.AREA_SIZE.focus();\r\n\t\t}\r\n\t\telse if(IFRM_PurposeCode.isSelectOK() == false)\r\n\t\t{\r\n\t\t\tstr += \"점용목적을 정확히 선택하세요\"\r\n\t\t\talert(str);\r\n\t\t}\r\n\t\telse if(document.getElementsByName(\"WITH_ADDR_PNU\").length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"한개 이상에 공시지가 주소를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\t//form.WITH_ADDR_LIST.focus();\r\n\t\t\tform.WITH_GU_CD.focus();\r\n\t\t}\r\n\t\telse if(form.SECTION.value\t== '1' || form.SECTION.value == '3')\r\n\t\t{\r\n\t\t\tif(form.MUL_FROMDATE.value.length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"점용기간을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.MUL_FROMDATE.focus();\r\n\t\t\t}\r\n\t\t\telse if(form.MUL_TODATE.value.length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"점용기간을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.MUL_TODATE.focus();\r\n\t\t\t}\r\n\t\t}\r\n\t\telse if(form.SECTION.value\t== '2')\r\n\t\t{\r\n\t\t\tif(form.PARTLY_PERIOD.value.length\t< 1 || form.PARTLY_PERIOD.value == \"일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09\")\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"일시점용기간을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.PARTLY_PERIOD.focus();\r\n\t\t\t}\r\n\t\t\telse if(form.TOTAL_PERIOD.value.length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"일시점용기간 총일수를 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.TOTAL_PERIOD.focus();\r\n\t\t\t}\r\n\t\t}\r\n\t\r\n\r\n\t\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\r\n\t\treturn\tfalse;\t\t\r\n\t}\r\n\t\r\n\tfunction goViewJibunMap(gubun){\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n\t\tif(gubun == 'with'){\r\n\t\t\tif(getSelectedValue(form.BJ_CD).length\t< 1){\r\n\t\t\t\tstr\t+= \"점용지 법정동을 입력하세요.\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.BJ_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(getSelectedValue(form.SPC_CD).length\t< 1){\r\n\t\t\t\tstr\t+= \"점용지 번지선택을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.SPC_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(form.BONBUN.value.length\t< 1){\r\n\t\t\t\tstr\t+= \"점용지 본번을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.BONBUN.focus();\r\n\t\t\t}\r\n\t\t}else if(gubun == 'road'){\r\n\t\t\tif(getSelectedValue(form.BJ_CD).length\t< 1){\r\n\t\t\t\tstr\t+= \"점용지 법정동을 입력하세요.\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.BJ_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(getSelectedValue(form.SPC_CD).length\t< 1){\r\n\t\t\t\tstr\t+= \"점용지 번지선택을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.SPC_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(form.ROAD_BON.value.length\t< 1){\r\n\t\t\t\tstr\t+= \"도로주소 본번을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.ROAD_BON.focus();\r\n\t\t\t}\r\n\t\t}else if(gubun == 'price'){\r\n\t\t\tif(getSelectedValue(form.WITH_GU_CD).length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"구를 선택하세요.\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.WITH_GU_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(getSelectedValue(form.WITH_BJ_CD).length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"법정동을 선택하세요.\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.WITH_BJ_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(getSelectedValue(form.WITH_SPC_CD).length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"번지를 선택하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.WITH_SPC_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(form.WIT";
  private final static String _jspx_template17 = "H_BONBUN.value.length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"본번을 선택하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.WITH_BONBUN.focus();\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\tvar bjCd = getSelectedValue(form.BJ_CD);\r\n\t\t\tvar spcCd = getSelectedValue(form.SPC_CD);\r\n\t\t\tvar sigungu = form.SIGUNGU.value;\r\n\t\t\t\r\n\t\t\tif(gubun == 'with'){\r\n\t\t\t\tvar bonbunCd = form.BONBUN.value;\r\n\t\t\t\tvar bubunCd = form.BUBUN.value;\r\n\t\t\t}else if(gubun == 'road'){\r\n\t\t\t\tvar bonbunCd = form.ROAD_BON.value;\r\n\t\t\t\tvar bubunCd = form.ROAD_BU.value;\r\n\t\t\t}else if(gubun == 'price'){\r\n\t\t\t\tsigungu = getSelectedValue(form.WITH_GU_CD);\r\n\t\t\t\tbjCd = getSelectedValue(form.WITH_BJ_CD);\r\n\t\t\t\tspcCd = getSelectedValue(form.WITH_SPC_CD);\r\n\t\t\t\tvar bonbunCd = form.WITH_BONBUN.value;\r\n\t\t\t\tvar bubunCd = form.WITH_BUBUN.value;\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\tvar pnu = '11'+sigungu+bjCd+spcCd+addZero(bonbunCd,4)+addZero(bubunCd,4);\r\n\t\t\t\r\n\t\t\tvar url = '/jumyong/map/mini_map.do?PNU='+pnu+'&TYPE=view';\r\n\t\t\tcw=screen.availWidth; // 화면 너비\r\n\t\t\tch=screen.availHeight; // 화면 높이\r\n\t\t\t\r\n\t\t\tsw=800;// 띄울 창의 너비\r\n\t\t\tsh=600;// 띄울 창의 높이\r\n\t\t\t\r\n\t\t\tml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치\r\n\t\t\tmt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치\r\n\r\n\t\t\tvar param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';\r\n\t\t\twindow.open(url, \"minimap\", param);\r\n\t\t\t\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\treturn;\r\n\t\t\t\r\n\t\t}\r\n\t}\r\n\t\r\n\t\r\n\tfunction delWithAddr(obj){\r\n\t\tvar list = document.getElementsByName(\"DEL_ID\");\r\n\t\tvar delId;\r\n\t\tfor(var i = 0 ; i < list.length ; i++){\r\n\t\t\tif(list[i] == obj){\r\n\t\t\t\tdelId = i;\r\n\t\t\t\t\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tvar tbody = document.getElementById(\"WITH_ADDR_LIST\");\r\n\t\ttbody.deleteRow(delId);\r\n\t}\r\n\r\n\tfunction addWithAddr(pnu,text){\r\n\t\t\r\n\t\tvar tbody = document.getElementById(\"WITH_ADDR_LIST\");\r\n\t\t  \r\n\t\tvar tr,td,Elem;\r\n\t\t\r\n\t\ttr = document.createElement('tr');\r\n\t\ttd = document.createElement('td');\r\n\t\ttd.setAttribute(\"height\", \"18px\");\r\n\t\ttd.setAttribute(\"width\", \"90%\");\r\n\t\t\r\n\t\t//Elem = document.createElement(\"<input name='WITH_ADDR_PNU' type='hidden'>\");\r\n\t\tvar Elem1 = document.createElement(\"div\");\r\n\t\tvar innerElem1 = \"<input name='WITH_ADDR_PNU' type='hidden' value='\"+pnu+\"'>\";\r\n\t\tElem1.innerHTML = innerElem1; \r\n\t\t//Elem.value = pnu;\r\n\t\ttd.appendChild(Elem1);\r\n\t\t\r\n\t\t//Elem = document.createElement(\"<input name='WITH_ADDR_TEXT' type='text' readonly>\");\r\n\t\tvar Elem2 = document.createElement(\"div\");\r\n\t\tvar innerElem2 = \"<input name='WITH_ADDR_TEXT' type='text' readonly class='input_form1' style='border: 0; width: 100%;' value='\"+text+\"'>\";\r\n\t\tElem2.innerHTML=innerElem2;\r\n\t\t//\tElem.className = 'input_form1';\r\n//\t\tElem.style.border = '0px';\r\n//\t\tElem.style.width = '100%';\r\n//\t\tElem.value = text;\r\n\t\ttd.appendChild(Elem2);\r\n\r\n\t\t\r\n\t\ttr.appendChild(td);\r\n\t\ttd = document.createElement('td');\r\n\t\ttd.setAttribute(\"width\", \"10%\");\r\n\t\t\r\n\t\tElem = document.createElement('img');\r\n\t\tElem.src = '/img/mapImg/close.gif';\r\n\t\tElem.name = 'DEL_ID';\r\n\t\tElem.alt = '삭제';\r\n\t\tElem.style.width = '22px';\r\n\t\tElem.style.height = '17px';\r\n\t\tElem.style.border = '0px';\r\n\t\tElem.style.CURSOR = 'pointer';\r\n\t\tElem.style.verticalAlign = 'middle';\r\n\t\tElem.onclick = function(){\r\n\t\t\tdelWithAddr(this);\r\n\t\t};\r\n\t\ttd.appendChild(Elem);\r\n\t\ttr.appendChild(td);\r\n\t\ttbody.appendChild(tr);\r\n\t\t\r\n\t}\r\n\t\r\n\t// 평균 인접지 공시지가\r\n\tfunction \taddWithAddrList()\r\n\t{\r\n\t\t\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n\t\tif(getSelectedValue(form.WITH_GU_CD).length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"구를 선택하세요.\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.WITH_GU_CD.focus();\r\n\t\t}\r\n\t\telse if(getSelectedValue(form.WITH_BJ_CD).length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"법정동을 선택하세요.\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.WITH_BJ_CD.focus();\r\n\t\t}\r\n\t\telse if(getSelectedValue(form.WITH_SPC_CD).length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"번지를 선택하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.WITH_SPC_CD.focus();\r\n\t\t}\r\n\t\telse if(form.WITH_BONBUN.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"본번을 선택하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.WITH_BONBUN.focus();\r\n\t\t}\r\n\t\telse{\r\n\t\t\t\r\n\t\t\tvar pnu = '11'+getSelectedValue(form.WITH_GU_CD)+getSelectedValue(form.WITH_BJ_CD)\r\n\t\t\t+getSelectedValue(form.WITH_SPC_CD)+addZero(form.WITH_BONBUN.value,4)+addZero(form.WITH_BUBUN.value,4);\r\n\t\t\t\r\n\t\t\tvar text = getSelect";
  private final static String _jspx_template18 = "edText(form.WITH_GU_CD)+' '+getSelectedText(form.WITH_BJ_CD)+' ';\r\n\t\t\tif(form.WITH_SPC_CD.value == '2')text += '산 ';\r\n\t\t\ttext += form.WITH_BONBUN.value;\r\n\t\t\tif(form.WITH_BUBUN.value.length > 0){\r\n\t\t\t\ttext += '-'+form.WITH_BUBUN.value;\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\t\r\n\t\t\taddWithAddr(pnu,text);\r\n\t\t}\t\r\n\t}\r\n\t\r\n\t//********** BEGIN_현진_20120222\r\n\tfunction changeWithGuCd(obj){\r\n\t\tvar guCd = getSelectedValue(obj);\r\n\t\tvar param = \"guCd=\"+guCd;\r\n\t    sendRequest(\"/get_bjdong_code.do\", param, \"GET\", ResultChangeWithGuCd);\r\n\t}\r\n\r\n\tfunction\tResultChangeWithGuCd(obj)\r\n\t{\r\n\t\tselect_innerHTML(document.getElementById(\"WITH_BJ_CD\"),obj);\r\n\t}\r\n\t\t\r\n\t//********** END_현진_20120222\r\n\t\r\n\t// 2016.02.12 kny\r\nfunction checkPARTLY_PERIOD(){\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\tif(form.PARTLY_PERIOD.value.length\t< 1 || form.PARTLY_PERIOD.value == \"일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09\")\r\n\t{\r\n\t\tform.PARTLY_PERIOD.value = \"\";\r\n\t}\r\n}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init(); Init_UseType('";
  private final static String _jspx_template19 = "'); \">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" id=\"SIGUNGU\" name=\"SIGUNGU\" value=\"";
  private final static String _jspx_template22 = "\">\r\n\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_purple\">\r\n\r\n\t\t<div id=\"tabcontents\">\r\n\t\t\t<div class=\"tabcontent\" id=\"tab1\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><table id=\"table1\" width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td width=\"14%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n\t\t\t\t\t\t  <td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><select id=\"TYPE\" name=\"TYPE\" class=\"essential\" style=\"width:70px\" OnChange=\"Select_UseType(this);\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t      </select></td>\r\n\t\t\t\t\t\t  <td width=\"14%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t\t  <td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><select id=\"SECTION\" name=\"SECTION\" class=\"essential\" style=\"width:70px\" OnChange=\"Select_UseSection(this);\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template24 = "\r\n\t\t\t\t\t\t  </select>\r\n\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소유자</td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select id=\"OWNER_SET\" name=\"OWNER_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template25 = "\r\n\t\t\t\t\t\t  </select></td>\r\n\t\t\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select id=\"TAX_SET\" name=\"TAX_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template26 = "\r\n\t\t\t\t\t\t  </select></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t   <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><input id=\"MUL_POST\" name=\"MUL_POST\" type=\"text\" class=\"essential\" style=\"width:50px\" value=\"";
  private final static String _jspx_template27 = "\" maxlength=\"6\" onblur=\"javascript:isPostNum(this);\"></td>\r\n\t\t\t\t\t\t\t\t  <td>\r\n<!-- 점용지 도로명주소 추가 (파라메터 수정) #mr-->\t\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t\t\t  \t<!-- <a href=\"javascript:openZipcodePopup_new('form.MUL_POST','','','','','','','','','');\">-->\r\n\t\t\t\t\t\t\t\t  \t<a href=\"javascript:openZipcodePopup_new('form.MUL_POST', '', 'form.JYADDR_NEW', '', '', '', '','','', '');\">\r\n<!-- #mr -->\t\t\t\t\t\t\t\t  \t\r\n\t\t\t\t\t\t\t\t  \t\t<img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\">\r\n\t\t\t\t\t\t\t\t  \t</a>\r\n\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t  </table>\r\n\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">건물(명) 정보 </td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"BD_NM\" name=\"BD_NM\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template28 = "\">\r\n\t\t\t\t\t\t\t<input id=\"BD_DONG\" name=\"BD_DONG\" type=\"text\" class=\"input_form1\" style=\"width:30px\" value=\"";
  private final static String _jspx_template29 = "\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\">\r\n\t\t\t\t\t\t\t동 <input id=\"BD_HO\" name=\"BD_HO\" type=\"text\" class=\"input_form1\" style=\"width:30px\" value=\"";
  private final static String _jspx_template30 = "\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\">\r\n\t\t\t\t\t\t\t호 </td>\r\n\t\t\t\t\t\t</tr>\r\n<!-- 점용지 도로명주소 추가 #mr-->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지도로명주소</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"JYADDR_NEW\" name=\"JYADDR_NEW\" type=\"text\" class=\"essential\" style=\"width:250px\"  value=\"";
  private final static String _jspx_template31 = "\" onClick=\"javascript:openZipcodePopup_new('form.MUL_POST', '', 'form.JYADDR_NEW', '', '', '', '','','', '');\" readonly>\r\n\t\t\t\t\t\t\t<input id=\"JYADDR_BON\" name=\"JYADDR_BON\" type=\"text\" class=\"essential\" style=\"width:25px\" value=\"";
  private final static String _jspx_template32 = "\"/>\r\n\t\t\t\t\t\t\t-<input id=\"JYADDR_BU\" name=\"JYADDR_BU\" type=\"text\" class=\"essential\" style=\"width:25px\" value=\"";
  private final static String _jspx_template33 = "\"/>\r\n\t\t\t\t\t\t\t<br><font color=\"blue\">*수정 시, 팝업창에서 도로명 주소로 검색 후 해당 도로명 주소를 선택</font>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\t\t\t\t\r\n<!-- #mr -->\t\t\t\t\t\t\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지지번</td>\r\n\t\t\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  ";
  private final static String _jspx_template34 = "&nbsp;\r\n\t\t                  <select id=\"BJ_CD\" name=\"BJ_CD\" class=\"essential\" style=\"width:80px\">\r\n\t\t                  \t";
  private final static String _jspx_template35 = "\r\n                          </select> \r\n\t\t                  <select id=\"HJ_CD\" name=\"HJ_CD\" class=\"essential\" style=\"width:80px\">\r\n\t\t\t            \t";
  private final static String _jspx_template36 = "\r\n\t\t\t              </select>\r\n\t\t\t\t\t\t  <select id=\"SPC_CD\" name=\"SPC_CD\" class=\"essential\" style=\"width:75px\">\r\n\t\t\t            \t";
  private final static String _jspx_template37 = "\r\n\t\t\t              </select>\r\n\t\t\t\t\t\t  <input id=\"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template38 = "\" type=\"text\" class=\"essential\" style=\"width:40px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t  - <input id=\"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template39 = "\" type=\"text\" class=\"input_form1\" style=\"width:40px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t  번지 <input id=\"TONG\" name=\"TONG\" value=\"";
  private final static String _jspx_template40 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"2\">\r\n\t\t\t\t\t\t  통 <input id=\"BAN\" name=\"BAN\" value=\"";
  private final static String _jspx_template41 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"2\">\r\n\t\t\t\t\t\t  반\r\n\t\t\t\t\t\t  <img src=\"/img/loca_icon.gif\" alt=\"위치확인\" id=\"LocReg\" width=\"64\" height=\"18\" border=\"0\" onClick=\"javascript:goViewJibunMap('with');\" style=\"vertical-align:middle;CURSOR:pointer;\"> \r\n\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\r\n\t\t                <tr>\r\n\t\t                  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로(하천)지번</td>\r\n\t\t                  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"ROAD_ADDR\" name=\"ROAD_ADDR\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template42 = "\" maxlength=\"12\">\r\n\t\t\t\t\t\t\t\t<input id=\"ROAD_BON\" name=\"ROAD_BON\" type=\"text\" class=\"essential\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\" value=\"";
  private final static String _jspx_template43 = "\" >\r\n\t\t\t\t\t\t\t  - <input id=\"ROAD_BU\" name=\"ROAD_BU\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\" value=\"";
  private final static String _jspx_template44 = "\" >\r\n\t\t\t\t\t\t\t  <img src=\"/img/loca_icon.gif\" alt=\"위치확인\" id=\"LocReg\" width=\"64\" height=\"18\" border=\"0\" onClick=\"javascript:goViewJibunMap('road');\" style=\"vertical-align:middle;CURSOR:pointer;\">\r\n\t\t                  </td>\r\n\t\t       \t\t\t  \r\n\t\t\t\t\t\t  <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"\">\r\n\t\t\t\t\t\t  \t<input id=\"USERTYPENAME\" name=\"USERTYPENAME\" type=\"text\" style=\"width:95px\" class=\"viewcol\" value=\"주차면수\">\r\n\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t  \t                      \t\t\t  \r\n\t\t       \t\t\t  <td colspan=\"0\" bgcolor=\"F6F6F6\" class=\"table_bl_left\">\r\n\t\t\t       \t\t\t  <span id=\"UseType1\" style=\"display:none\">\r\n\t\t\t\t              \t<input id=\"PARKING_NUM\" name=\"PARKING_NUM\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template45 = "\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"3\"> 면\r\n\t\t\t                  </span> \r\n\t\t\t       \t\t\t  <span id=\"UseType2\" style=\"display:none\">\r\n\t\t\t\t              \t<input id=\"RIVER_NM\" name=\"RIVER_NM\" type=\"text\" class=\"essential\" style=\"width:100px\" value=\"";
  private final static String _jspx_template46 = "\">\r\n\t\t\t                  </span>\r\n\t\t\t                  <span id=\"UseType3\" style=\"display:none;\">\r\n\t\t\t\t\t\t\t\t<input id=\"RIVER_RANK\" name=\"RIVER_RANK\" type=\"text\" class=\"essential\" style=\"width:100px\" value=\"";
  private final static String _jspx_template47 = "\" maxlength=\"3\">\r\n\t\t\t\t\t\t\t  </span>\r\n\t\t                  </td>\r\n\t\t                </tr>\r\n\t\t                <tr>\r\n\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" colspan=\"1\">공시지가<br>적용지번</td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t  <select id=\"WITH_GU_CD\" name=\"WITH_GU_CD\" class=\"input_form1\" style=\"width:80px\" onchange=\"changeWithGuCd(this);\">\r\n\t\t\t\t\t\t      \t";
  private final static String _jspx_template48 = "\r\n\t\t\t\t\t\t      </select>\r\n\t\t\t\t\t\t\t  <select id=\"WITH_BJ_CD\" name=\"WITH_BJ_CD\" class=\"input_form1\" style=\"width:80px\">\r\n\t\t\t\t\t\t      \t";
  private final static String _jspx_template49 = "\r\n\t\t\t\t\t\t      </select>\r\n\t\t\t\t\t          <select id=\"WITH_SPC_CD\" name=\"WITH_SPC_CD\" class=\"input_form1\" style=\"width:75px\">\r\n\t\t\t\t\t          \t";
  private final static String _jspx_template50 = "\r\n\t\t\t\t\t          </select>\r\n\t\t\t\t\t          <p style=\"font-size: 8px\"></p>\r\n\t\t\t\t\t          <input id=\"WITH_BONBUN\" name=\"WITH_BONBUN\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t  - <input id=\"WITH_BUBUN\" name=\"WITH_BUBUN\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t  번지\r\n\t\t\t\t\t\t\t  <img src=\"/img/add_icon.gif\" alt=\"추가\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:addWithAddrList();\" style=\"CURSOR: Hand;vertical-align: middle;\">\r\n\t\t\t\t\t\t\t  <img src=\"/img/loca_icon.gif\" alt=\"위치확인\" id=\"LocReg\" width=\"64\" height=\"18\" border=\"0\" onClick=\"javascript:goViewJibunMap('price');\" style=\"vertical-align: middle;CURSOR:pointer;\">\r\n\t\t\t\t\t\t  </td>\t\t\t\t\t\t  \r\n\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" colspan=\"1\">공시지가<br>적용지번<br>목록</td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t  <div style=\"height: 60px;overflow-y:scroll;\">\r\n\t\t\t\t\t\t\t  <table width=\"90%\">\r\n\t\t\t\t\t\t\t  <tbody id=\"WITH_ADDR_LIST\" >\r\n\t\t\t\t\t\t\t  </tbody>\r\n\t\t\t\t\t\t\t  </table>\r\n\t\t\t\t\t\t\t  </div>\r\n\t\t\t\t\t\t  </td>\t\t\t\t\t\t  \r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" ><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"25\" src=\"/jsp/common/purposeCode/purposeCode.jsp?SectionCode=";
  private final static String _jspx_template51 = "&PURPOSE_CD=";
  private final static String _jspx_template52 = "&essential=1\"></iframe>\r\n\t\t\t\t\t\t  </table></td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  \t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t\t\t  \t<td id=\"MUL\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t  \t\t<div id=\"MUL_DIV\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template53 = "\t\r\n\t\t\t\t\t\t\t\t\t\t<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>\r\n\t\t\t\t\t\t\t\t\t\t\t<tr id='MulDateSection'>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td id='UseSection' style='display:block'>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input id='PARTLY_PERIOD' maxlength='100' id='PARTLY_PERIOD' name='PARTLY_PERIOD' type='text' class='essential' style='width:300px' value='";
  private final static String _jspx_template54 = "' onclick='checkPARTLY_PERIOD();'\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;총<input id='TOTAL_PERIOD' name='TOTAL_PERIOD' maxlength='5' type='text' class='essential' style='width:30px' value='";
  private final static String _jspx_template55 = "' style='ime-mode:disabled' onKeyDown='nr_num_int(this);' onKeyUp='nr_num_int(this);' onKeyPress='nr_num_int(this);'>일\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>&nbsp;&nbsp;(만료일:\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input id='DUE_DATE' name='DUE_DATE' type='text' class='input_form1' value=\"";
  private final static String _jspx_template56 = "\" style=\"width: 70px;\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<a><img onclick=\"popUpCalendar(this, document.getElementById('DUE_DATE'), 'yyyymmdd')\" src='/img/calendar_icon.gif' width='16' height='16' border='0' align='absmiddle' style='vertical-align:middle;CURSOR: pointer;'></a>)\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t            ";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t  \t\t\t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t\t  \t\t\t<table id=\"MUL_TABLE\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr id=\"MulDateSection\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"UseSection\" style=\"display:block\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t  \t<input id=\"MUL_FROMDATE\" name=\"MUL_FROMDATE\" type=\"text\" class=\"essential\" style=\"width:70px\" value=\"";
  private final static String _jspx_template59 = "\" readonly><a><img onclick=\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')\" src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" style=\"vertical-align:middle;CURSOR: pointer;\"></a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t  \t ~ <input id=\"MUL_TODATE\" name=\"MUL_TODATE\" type=\"text\" class=\"essential\" style=\"width:70px\" value=\"";
  private final static String _jspx_template60 = "\"  readonly><a><img onclick=\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')\" src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" style=\"vertical-align:middle;CURSOR: pointer;\"></a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t            ";
  private final static String _jspx_template61 = "\r\n\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t\t  \t<td height=\"26px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" id=\"area\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"AREA_SIZE\" name=\"AREA_SIZE\" type=\"text\" class=\"essential\" style=\"width:50px\" value=\"";
  private final static String _jspx_template62 = "\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" onKeyPress=\"nr_num_float(this);\" maxlength=\"17\"> m / ㎡ / 개\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n\t\t\t\t\t  \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"PERCENT_RATE\" name=\"PERCENT_RATE\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:right\" value=\"";
  private final static String _jspx_template63 = "\" onKeyDown=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" onKeyPress=\"nr_num_float(this);\" maxlength=\"6\">%\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n\t\t\t\t\t  \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  \t\t\t<input id=\"PERCENT_REASON\" name=\"PERCENT_REASON\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template64 = "\" maxlength=\"200\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n\t\t\t\t\t  \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"REDUCTION_RATE\" name=\"REDUCTION_RATE\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:right\" value=\"";
  private final static String _jspx_template65 = "\" onKeyDown=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" onKeyPress=\"nr_num_float(this);\" maxlength=\"9\">%\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n\t\t\t\t\t  \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  \t\t\t<input id=\"REDUCTION_REASON\" name=\"REDUCTION_REASON\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template66 = "\" maxlength=\"200\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<tr>\r\n\t\t        \t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n      \t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n       \t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n        \t\t\t\t\t\t\t<textarea id=\"REFERENCE\" name=\"REFERENCE\" onkeyup=\"displayBytes(500, 'REFERENCE');\" type=\"text\" class=\"input_form1\" style=\"width:98%\">";
  private final static String _jspx_template67 = "</textarea>\r\n       \t\t\t\t\t\t\t</table>\r\n      \t\t\t\t\t\t</td>\r\n        \t\t\t\t</tr>\r\n        \t\t\t\t\r\n\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t  <td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\">* 공사(굴착) 정보</span></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t  </table></td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t    \r\n\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사기간 </td>\r\n\t\t\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <td><input id=\"WORK_FROMDATE\" name=\"WORK_FROMDATE\" value=\"";
  private final static String _jspx_template68 = "\" type=\"text\" class=\"input_form1\" style=\"width:65px\" readonly></td>\r\n\t\t\t\t\t\t\t  <td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('WORK_FROMDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t  <td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t\t\t\t  <td><input id=\"WORK_TODATE\" name=\"WORK_TODATE\" value=\"";
  private final static String _jspx_template69 = "\" type=\"text\" class=\"input_form1\" style=\"width:65px\" readonly></td>\r\n\t\t\t\t\t\t\t  <td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('WORK_TODATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t  </table></td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t    \r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사내용</td>\r\n\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<input id=\"EXE_INFO\" name=\"EXE_INFO\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template70 = "\">\r\n\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Cancel();\">\r\n\t\t\t\t\t\t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:ModifyPrc();\">\r\n\t\t\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\t\t\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t</table></td>\r\n\t</tr>\r\n\r\n</table>\r\n</body>\r\n</html>\r\n";
}
