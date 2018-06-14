package jeus_jspwork._jsp._gapan._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_violation_5fregister_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(160,26);to=(160,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(161,26);to=(161,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(162,26);to=(162,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(163,26);to=(163,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL4}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(164,26);to=(164,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL5}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(165,26);to=(165,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL6}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(166,26);to=(166,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL7}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(168,29);to=(168,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTSEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(169,26);to=(169,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTSEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(170,26);to=(170,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTSEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(171,26);to=(171,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTSEL4}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(172,26);to=(172,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTSEL5}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(216,47);to=(216,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(218,52);to=(218,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(219,54);to=(219,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(220,68);to=(220,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(221,72);to=(221,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_IMG1_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(222,72);to=(222,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_IMG2_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(223,78);to=(223,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTIMG1_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(224,78);to=(224,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTIMG2_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(236,96);to=(236,113)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_DEG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(253,101);to=(253,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_DEPT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(288,87);to=(288,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(322,132);to=(322,153)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_CONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(338,93);to=(338,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTDATE }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(388,128);to=(388,148)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_POINTS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(397,138);to=(397,162)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTCONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language='JavaScript' src='/js/common.js'></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script>\r\n\r\n\r\n\t\r\n\t// 등록폼 체크\r\n\tfunction checkForm(){\r\n\t\tvar form1 = document.form1;\r\n\t\talert(form1.year.value);\r\n\r\n\t\tform1.submit();\r\n\t\t//\t특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴\r\n\t\t//\t\tw.content.value = w.content.value+' '+'\\n';\t\r\n\t\t\r\n\t}\r\n\r\n\t// 저장하기\r\n\tfunction goSave(){\r\n\r\n\t\tvar f = document.form;\r\n\t\t\r\n\t\r\n\t\tif( f.VIO_POINTS.value == \"\" ){\r\n\t\t\tf.VIO_POINTS.value = \"0.0\";\r\n\t\t}\r\n\t\t\r\n\t\tif( confirm(\"저장하시겠습니까? \") ){\r\n\t\t\t\r\n\t\t\tf.action = \"/gapan/jumyong/violation_registerPrc.do\";\r\n\t\t\tf.submit();\r\n\t\t}\r\n\t}\r\n\r\n\t// 리스트로\r\n\tfunction goList(){\r\n\t\t\r\n\t\tvar f = document.form;\r\n\t\tvar GAPAN_NO = document.getElementById(\"GAPAN_NO\").value;\r\n\t\tvar GP_TYP = document.getElementById(\"GP_TYP\").value;\r\n\t\tvar SEQ = document.getElementById(\"SEQ\").value;\r\n\r\n\t\tf.action = \"/gapan/jumyong/info_violation.do?GAPAN_NO=\"+GAPAN_NO+\"&GP_TYP=\"+GP_TYP+\"&SEQ=\"+SEQ;\r\n\t\tf.submit();\r\n\t}\r\n\r\n\r\n\r\n\r\n    function ChangeImg(thisObj, preViewer) {\r\n\r\n        if(!/(\\.gif|\\.jpg|\\.jpeg|\\.png|\\.bmp)$/i.test(thisObj.value)) {\r\n            alert(\"이미지 형식의 파일을 선택하십시오\");\r\n            return;\r\n        }\r\n\r\n        preViewer = (typeof(preViewer) == \"object\") ? preViewer : document.getElementById(preViewer);\r\n        var ua = window.navigator.userAgent;\r\n\r\n        if (ua.indexOf(\"MSIE\") > -1) {\r\n            var img_path = \"\";\r\n            if (thisObj.value.indexOf(\"\\\\fakepath\\\\\") < 0) {\r\n                img_path = thisObj.value;\r\n            } else {\r\n                thisObj.select();\r\n                var selectionRange = document.selection.createRange();\r\n                img_path = selectionRange.text.toString();\r\n                thisObj.blur();\r\n            }\r\n                      \r\n            img_path = img_path.split('%').join('%25');\r\n            \r\n            preViewer.style.filter = \"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='\" + img_path + \"', sizingMethod='scale')\";\r\n            \r\n            \r\n        } else {\r\n            preViewer.innerHTML = \"\";\r\n            var W = preViewer.offsetWidth;\r\n            var H = preViewer.offsetHeight;\r\n            var tmpImage = document.createElement(\"img\");\r\n            preViewer.appendChild(tmpImage);\r\n\r\n            tmpImage.onerror = function () {\r\n                return preViewer.innerHTML = \"\";\r\n            };\r\n\r\n            tmpImage.onload = function () {\r\n\r\n                if (this.width > W) {\r\n                    this.height = this.height / (this.width / W);\r\n                    this.width = W;\r\n                }\r\n                if (this.height > H) {\r\n                    this.width = this.width / (this.height / H);\r\n                    this.height = H;\r\n                }\r\n            };\r\n            if (ua.indexOf(\"Firefox/3\") > -1) {\r\n                var picData = thisObj.files.item(0).getAsDataURL();\r\n                tmpImage.src = picData;\r\n            } else {\r\n                tmpImage.src = \"file://\" + thisObj.value;\r\n            }\r\n        }\r\n    }\r\n\r\n\t\r\n\tfunction InitPage()\r\n\t{\r\n\r\n\t\t// 수정일때 차수 수정 못하도록 \r\n\t\tif( document.getElementById(\"mode\").value == 'edit' ){\t\t\t\r\n\t\t\tdocument.getElementById(\"VIO_DEG\").disabled = \"true\";\r\n\t\t}\r\n\r\n        // 이미지 기본 로드\r\n        if(document.getElementById('VIO_IMG1_NAME').value != ''){\r\n        \tChangeImg(document.getElementById('VIO_IMG1_NAME'), 'VIO_IMG1_PREVIEW');\r\n        }\r\n        \r\n        // 이미지 기본 로드\r\n        if(document.getElementById('VIO_IMG2_NAME').value != ''){\r\n        \tChangeImg(document.getEle";
  private final static String _jspx_template10 = "mentById('VIO_IMG2_NAME'), 'VIO_IMG2_PREVIEW');\r\n        }\r\n\r\n        // 이미지 기본 로드\r\n        if(document.getElementById('VIO_ACTIMG1_NAME').value != ''){\r\n        \tChangeImg(document.getElementById('VIO_ACTIMG1_NAME'), 'VIO_ACTIMG1_PREVIEW');\r\n        }\r\n        \r\n        // 이미지 기본 로드\r\n        if(document.getElementById('VIO_ACTIMG2_NAME').value != ''){\r\n        \tChangeImg(document.getElementById('VIO_ACTIMG2_NAME'), 'VIO_ACTIMG2_PREVIEW');\r\n        }\r\n        \r\n        \r\n\t\tvar _vioSel = document.getElementsByName('VIO_SEL');\r\n\t\tvar _vioActSel = document.getElementsByName('VIO_ActSEL');\r\n\t\t\r\n\t\tvar _vioSelArray = ['";
  private final static String _jspx_template11 = "',\r\n\t\t                    '";
  private final static String _jspx_template12 = "',\r\n\t\t                    '";
  private final static String _jspx_template13 = "',\r\n\t\t                    '";
  private final static String _jspx_template14 = "',\r\n\t\t                    '";
  private final static String _jspx_template15 = "',\r\n\t\t                    '";
  private final static String _jspx_template16 = "',\r\n\t\t                    '";
  private final static String _jspx_template17 = "'];\r\n\t\t\r\n\t\tvar _vioActSelArray = ['";
  private final static String _jspx_template18 = "',\r\n\t\t                    '";
  private final static String _jspx_template19 = "',\r\n\t\t                    '";
  private final static String _jspx_template20 = "',\r\n\t\t                    '";
  private final static String _jspx_template21 = "',\r\n\t\t                    '";
  private final static String _jspx_template22 = "'];\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\tfor(var i = 0;i < _vioSel.length ;i++){\r\n\t\t\tif(_vioSelArray[i] == '1')\r\n\t\t\t\t_vioSel[i].checked = true;\r\n\t\t}\r\n\t\t\r\n\t\tfor(var i = 0;i < _vioActSel.length ;i++){\r\n\t\t\tif(_vioActSelArray[i] == '1')\r\n\t\t\t_vioActSel[i].checked = true;\r\n\t\t}\r\n\t\t\r\n\r\n\t\tturnValidation(_vioSel[6],'VIO_CONTENT');\r\n\t\tturnValidation(_vioActSel[3],'VIO_POINTS');\r\n\t\tturnValidation(_vioActSel[4],'VIO_ACTCONTENT');\r\n\t\t\r\n\t\t\r\n\t\r\n\t}\r\n\t\r\n\tfunction turnValidation(org,obj){\r\n\t\t\r\n\t\tif(org.checked){\r\n\t\t\tdocument.getElementById(obj).disabled = false;\r\n\t\t\tdocument.getElementById(obj).focus();\r\n\t\t}else{\r\n\t\t\tdocument.getElementById(obj).value = '';\r\n\t\t\tdocument.getElementById(obj).disabled = true;\r\n\t\t\t\r\n\t\t}\r\n\t\t\r\n\t}\r\n\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"InitPage();\">\r\n\r\n<form id=\"form\" name=\"form\" method=\"post\" enctype=\"multipart/form-data\">\r\n<input type=\"hidden\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template23 = "\"> \r\n\t<input type=\"hidden\" id=\"GP_TYP\" name=\"GP_TYP\" value=\"001\"> \r\n\t<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template24 = "\"> \r\n\t<input type=\"hidden\" id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template25 = "\"> \r\n\t<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template26 = "\">\r\n\t<input type=\"hidden\" id=\"VIO_IMG1_NAME\" name=\"VIO_IMG1_NAME\" value=\"";
  private final static String _jspx_template27 = "\">\r\n\t<input type=\"hidden\" id=\"VIO_IMG2_NAME\" name=\"VIO_IMG2_NAME\" value=\"";
  private final static String _jspx_template28 = "\">\r\n\t<input type=\"hidden\" id=\"VIO_ACTIMG1_NAME\" name=\"VIO_ACTIMG1_NAME\" value=\"";
  private final static String _jspx_template29 = "\">\r\n\t<input type=\"hidden\" id=\"VIO_ACTIMG2_NAME\" name=\"VIO_ACTIMG2_NAME\" value=\"";
  private final static String _jspx_template30 = "\">\r\n\t\r\n<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"contborder_purple\">\r\n\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"52px\" align=\"left\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t위반내역 관리번호 : <input type=\"text\" id=\"VIO_DEG\" name=\"VIO_DEG\" class=\"input_form1\" value=\"";
  private final static String _jspx_template31 = "\" style=\"width: 30px; border: 0px; text-decoration: none\" readonly>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"left\" class=\"sub_table_b\" colspan=\"4\">\r\n\t\t\t\t\t\t* 위반사항\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"10%\" height=\"32px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점검기관</td>\r\n\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input type=\"text\" id=\"VIO_DEPT\" name=\"VIO_DEPT\" class=\"input_form1\" maxlength=\"55\" value=\"";
  private final static String _jspx_template32 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"55%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\" rowspan=\"3\">\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50%\" nowrap>\r\n\t\t\t\t\t\t\t\t\t위반사진1\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50%\" nowrap>\r\n\t\t\t\t\t\t\t\t\t위반사진2\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"file\" id=\"VIO_IMG1\" name='VIO_IMG1' class=\"input_form1\" size=\"15\" onchange=\"ChangeImg(this,'VIO_IMG1_PREVIEW');\"/>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"file\" id=\"VIO_IMG2\" name='VIO_IMG2'  class=\"input_form1\" size=\"15\" onchange=\"document.getElementById('VIO_IMG2_NAME').value = this.value;ChangeImg(this,'VIO_IMG2_PREVIEW');\"/>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"78px\" id=\"VIO_IMG1_PREVIEW\" style=\"background-repeat:no-repeat; background-attachment:inherit;\"></td>\r\n\t\t\t\t\t\t\t\t\t<td id=\"VIO_IMG2_PREVIEW\" style=\"background-repeat: no-repeat; background-attachment: inherit;\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"32px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">위반일자</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input type=\"text\" id=\"VIO_DATE\"  name=\"VIO_DATE\" class=\"input_form1\" value=\"";
  private final static String _jspx_template33 = "\" readonly> \r\n\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('VIO_DATE'), 'yyyymmdd');\" style=\"vertical-align:middle;cursor: pointer\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"110px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">위반내역</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" value=\"1\">전매/전대</input>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" value=\"2\">대리운영</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" value=\"3\">불법광고물</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" value=\"4\">음식조리</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" value=\"5\">불법적치물</input>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" value=\"6\">시설물훼손</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" value=\"7\" onclick=\"turnValidation(this,'VIO_CONTENT')\">\r\n\t\t\t\t\t\t\t\t\t\t\t기타\r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"VIO_CONTENT\" name=\"VIO_CONTENT\" class=\"input_form1\" style=\"width:190px\" maxlength=\"100\" value='";
  private final static String _jspx_template34 = "' disabled=\"disabled\">\r\n\t\t\t\t\t\t\t\t\t\t\t</input>\r\n\t\t\t\t\t\t\t\t\t\t</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"left\" class=\"sub_table_b\" colspan=\"4\">\r\n\t\t\t\t\t* 조치사항\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"32px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조치일자</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"1\">\r\n\t\t\t\t\t\t\t<input type=\"text\" id=\"VIO_ACTDATE\"  name=\"VIO_ACTDATE\" class=\"input_form1\" value=\"";
  private final static String _jspx_template35 = "\" readonly> \r\n\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('VIO_ACTDATE'), 'yyyymmdd');\" style=\"vertical-align:middle;cursor: pointer\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\" rowspan=\"3\">\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50%\" nowrap>\r\n\t\t\t\t\t\t\t\t\t조치사진1\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50%\" nowrap>\r\n\t\t\t\t\t\t\t\t\t조치사진2\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"file\" id=\"VIO_ACTIMG1\" name='VIO_ACTIMG1' class=\"input_form1\" size=\"15\" onchange=\"ChangeImg(this,'VIO_ACTIMG1_PREVIEW');\"/>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"file\" id=\"VIO_ACTIMG2\" name='VIO_ACTIMG2'  class=\"input_form1\" size=\"15\" onchange=\"document.getElementById('VIO_ACTIMG2_NAME').value = this.value;ChangeImg(this,'VIO_ACTIMG2_PREVIEW');\"/>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"78px\" id=\"VIO_ACTIMG1_PREVIEW\" style=\"background-repeat: no-repeat; background-attachment: inherit;\"></td>\r\n\t\t\t\t\t\t\t\t\t<td id=\"VIO_ACTIMG2_PREVIEW\" style=\"background-repeat: no-repeat; background-attachment: inherit;\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"110px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조치내용</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_ACTSEL\" value=\"1\">허가취소</input>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_ACTSEL\" value=\"2\">시정명령</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_ACTSEL\" value=\"3\">과태료부과</input>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_ACTSEL\" value=\"4\" onclick=\"turnValidation(this,'VIO_POINTS')\">\r\n\t\t\t\t\t\t\t\t\t\t\t벌점부과\r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"VIO_POINTS\" name=\"VIO_POINTS\" class=\"input_form1\" style=\"width:50px\" maxlength=\"20\" value=\"";
  private final static String _jspx_template36 = "\" onKeyDown=\"onlyNumberInput();\" disabled=\"disabled\">점\r\n\t\t\t\t\t\t\t\t\t\t\t</input>\r\n\t\t\t\t\t\t\t\t\t\t</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_ACTSEL\" value=\"5\" onclick=\"turnValidation(this,'VIO_ACTCONTENT')\">\r\n\t\t\t\t\t\t\t\t\t\t\t기타\r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"VIO_ACTCONTENT\" name=\"VIO_ACTCONTENT\" class=\"input_form1\" style=\"width:100px\" maxlength=\"150\" value='";
  private final static String _jspx_template37 = "' disabled=\"disabled\">\r\n\t\t\t\t\t\t\t\t\t\t\t</input>\r\n\t\t\t\t\t\t\t\t\t\t</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\r\n\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\"><img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goSave();\" style=\"cursor: pointer\"> \r\n\t\t\t\t\t<img src=\"/img/list_icon2.gif\" alt=\"리스트\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goList();\" style=\"cursor: pointer\">\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n\r\n</form>\r\n\r\n</body>\r\n</html>\r\n";
}
