package jeus_jspwork._jsp._jumyong._minwon._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_saewol_5fregister_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template11);
      out.write(_jspx_template12);
      out.write(_jspx_template13);
      out.write(_jspx_template14);
      // jsp code [from=(758,65);to=(758,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(759,63);to=(759,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_CHECK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(760,67);to=(760,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_PROCESS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(761,57);to=(761,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(762,57);to=(762,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(763,61);to=(763,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(764,63);to=(764,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_REQNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(766,61);to=(766,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WITH_XML}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(767,59);to=(767,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(798,164);to=(798,174)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_NO_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(800,150);to=(800,159)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GUBUN_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(806,118);to=(806,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_DATE_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(813,116);to=(813,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PREDATE_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(820,154);to=(820,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_DEP_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(822,160);to=(822,174)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGE_DEP_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(826,152);to=(826,162)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_NM_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(828,154);to=(828,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGER_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(833,106);to=(833,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NOTES_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(839,114);to=(839,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AGENT_NM_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(843,116);to=(843,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_agent_tel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(848,148);to=(848,156)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(851,124);to=(851,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_ssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(852,127);to=(852,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_ssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(858,112);to=(858,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POST_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(870,108);to=(870,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR1_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(871,108);to=(871,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR2_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(877,189);to=(877,196)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_tel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(881,187);to=(881,193)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_hp}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(888,124);to=(888,140)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MINWON_REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(909,225);to=(909,229)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(913,126);to=(913,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_ssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(914,129);to=(914,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_ssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(919,96);to=(919,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(920,99);to=(920,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(921,99);to=(921,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(924,109);to=(924,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BIZ_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(925,111);to=(925,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BIZ_TYPES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(933,233);to=(933,237)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(940,227);to=(940,232)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(942,222);to=(942,232)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(944,222);to=(944,231)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(945,229);to=(945,234)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(951,100);to=(951,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${EMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(955,114);to=(955,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${B_PERMISSION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(987,193);to=(987,197)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TONM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(995,235);to=(995,241)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(1002,102);to=(1002,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(1004,226);to=(1004,238)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_TOBON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(1006,226);to=(1006,237)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_TOBU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(1007,233);to=(1007,240)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // jsp code [from=(1013,102);to=(1013,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOEMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template65);
      // jsp code [from=(1035,124);to=(1035,140)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template66);
      // jsp code [from=(1056,225);to=(1056,229)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(1060,126);to=(1060,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_ssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);
      // jsp code [from=(1061,129);to=(1061,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_ssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template69);
      // jsp code [from=(1066,96);to=(1066,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // jsp code [from=(1067,99);to=(1067,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template71);
      // jsp code [from=(1068,99);to=(1068,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template72);
      // jsp code [from=(1071,109);to=(1071,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BIZ_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template73);
      // jsp code [from=(1072,111);to=(1072,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BIZ_TYPES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template74);
      // jsp code [from=(1082,233);to=(1082,237)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template75);
      // jsp code [from=(1094,247);to=(1094,251)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template76);
      // jsp code [from=(1109,227);to=(1109,232)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template77);
      // jsp code [from=(1111,222);to=(1111,232)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template78);
      // jsp code [from=(1113,222);to=(1113,231)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template79);
      // jsp code [from=(1114,229);to=(1114,234)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template80);
      // jsp code [from=(1127,240);to=(1127,248)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DR_ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template81);
      // jsp code [from=(1128,237);to=(1128,245)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DR_ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template82);
      // jsp code [from=(1130,230);to=(1130,243)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DR_APPEAL_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template83);
      // jsp code [from=(1132,230);to=(1132,242)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DR_APPEAL_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template84);
      // jsp code [from=(1149,100);to=(1149,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${EMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template85);
      // jsp code [from=(1153,114);to=(1153,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${B_PERMISSION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template86);
      // jsp code [from=(1185,193);to=(1185,197)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TONM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template87);
      // jsp code [from=(1196,235);to=(1196,241)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template88);
      // jsp code [from=(1215,249);to=(1215,255)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template89);
      // jsp code [from=(1230,102);to=(1230,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template90);
      // jsp code [from=(1232,226);to=(1232,238)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_TOBON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template91);
      // jsp code [from=(1234,226);to=(1234,237)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_TOBU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template92);
      // jsp code [from=(1235,233);to=(1235,240)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template93);
      // jsp code [from=(1242,111);to=(1242,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(1243,234);to=(1243,246)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_TOBON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);
      // jsp code [from=(1245,234);to=(1245,245)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_TOBU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template96);
      // jsp code [from=(1246,241);to=(1246,248)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template97);
      // jsp code [from=(1253,110);to=(1253,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template98);
      // jsp code [from=(1265,102);to=(1265,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TOEMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template99);
      // jsp code [from=(1287,124);to=(1287,140)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${APPEAL_REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template100);
      // jsp code [from=(1309,11);to=(1309,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template101);
      // jsp code [from=(1315,11);to=(1315,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${occupancy_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template102);
      // jsp code [from=(1323,10);to=(1323,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_owner_Group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template103);
      // jsp code [from=(1327,10);to=(1327,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template104);
      // jsp code [from=(1335,105);to=(1335,113)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MUL_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template105);
      // jsp code [from=(1345,102);to=(1345,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template106);
      // jsp code [from=(1346,103);to=(1346,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BD_DONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template107);
      // jsp code [from=(1347,99);to=(1347,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BD_HO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template108);
      // jsp code [from=(1353,9);to=(1353,14)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template109);
      // jsp code [from=(1355,16);to=(1355,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template110);
      // jsp code [from=(1358,19);to=(1358,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template111);
      // jsp code [from=(1361,19);to=(1361,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template112);
      // jsp code [from=(1363,58);to=(1363,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template113);
      // jsp code [from=(1364,49);to=(1364,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template114);
      // jsp code [from=(1365,48);to=(1365,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template115);
      // jsp code [from=(1366,45);to=(1366,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template116);
      // jsp code [from=(1374,107);to=(1374,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template117);
      // jsp code [from=(1384,124);to=(1384,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PARKING_NUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template118);
      // jsp code [from=(1387,119);to=(1387,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${RIVER_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template119);
      // jsp code [from=(1390,109);to=(1390,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${RIVER_RANK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template120);
      // jsp code [from=(1398,15);to=(1398,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sigungu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template121);
      // jsp code [from=(1401,15);to=(1401,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template122);
      // jsp code [from=(1404,18);to=(1404,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template123);
      // jsp code [from=(1426,170);to=(1426,174)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template124);
      // jsp code [from=(1426,189);to=(1426,199)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template125);
      // jsp code [from=(1436,117);to=(1436,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MUL_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template126);
      // jsp code [from=(1437,116);to=(1437,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MUL_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template127);
      // jsp code [from=(1448,105);to=(1448,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template128);
      // jsp code [from=(1454,130);to=(1454,142)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template129);
      // jsp code [from=(1458,120);to=(1458,134)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template130);
      // jsp code [from=(1464,134);to=(1464,148)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template131);
      // jsp code [from=(1468,124);to=(1468,140)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template132);
      // jsp code [from=(1475,122);to=(1475,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PLACE_REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template133);
      // jsp code [from=(1492,70);to=(1492,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WORK_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template134);
      // jsp code [from=(1495,66);to=(1495,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WORK_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template135);
      // jsp code [from=(1504,105);to=(1504,113)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${EXE_INFO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template136);

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
  private final static String _jspx_template2 = "    \r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"JavaScript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"JavaScript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"JavaScript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"JavaScript\" src=\"/js/common.js\"></script>\r\n<!--  //********** BEGIN_현진_20120222 -->\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>\r\n<!--   //********** END_현진_20120222 -->   \r\n<script type=\"text/javascript\">\r\nfunction\tJumin_toaddr_Check()\r\n{\r\n\tvar form \t\t=\tdocument.form;\r\n\tvar\tchk\t\t\t=\tform.ADDR_CHECK.checked;\r\n\t\r\n\tif(chk\t== true)\r\n\t{\r\n\t\tform.TONM.value\t\t\t= form.NAME.value;\r\n\t\tform.TOPOST.value\t\t= form.POST.value;\r\n\t\t\r\n\t\tform.TOADDR1.value\t\t= form.ADDR1.value;\r\n\t\tform.TOSAN.checked\t\t= form.SAN.checked;\r\n\t\tform.TOBON.value\t\t= form.BON.value;\r\n\t\tform.TOBU.value\t\t\t= form.BU.value;\r\n\t\tform.TOADDR2.value\t\t= form.ADDR2.value;\r\n\t\tform.TOMAIL.value\t\t= form.EMAIL.value;\r\n\r\n\t\tform.jumin_totel1.value\t= form.jumin_tel1.value;\r\n\t\tform.jumin_totel2.value\t= form.jumin_tel2.value;\r\n\t\tform.jumin_totel3.value\t= form.jumin_tel3.value;\r\n\r\n\t\tform.jumin_tohp1.value\t= form.jumin_hp1.value;\r\n\t\tform.jumin_tohp2.value\t= form.jumin_hp2.value;\r\n\t\tform.jumin_tohp3.value\t= form.jumin_hp3.value;\t\r\n\r\n\t\t//********** BEGIN_현진_20120222\r\n\t\t\r\n\t\tform.TO_BD_BON.value\t= form.BD_BON.value;\r\n\t\tform.TO_BD_BU.value\t\t= form.BD_BU.value;\r\n\t\tform.TO_BD_DET_NM.value\t= form.BD_DET_NM.value;\r\n\t\tform.TO_BD_NM.value\t\t= form.BD_NM_NEW.value;\r\n\t\tform.TOSI.value\t\t\t= form.SI.value;\r\n\t\tform.TOGUN.value\t\t= form.GUN.value;\r\n\t\tform.TO_DORO_NM.value\t= form.DORO_NM.value;\r\n\t\tform.TODONG.value\t\t= form.DONG.value;\r\n\r\n\t\tform.TOADDR1_NEW.value       =      form.ADDR1_NEW.value\r\n\t\tform.TO_BD_BON.value         =      form.BD_BON.value\r\n\t\tform.TO_BD_BU.value          =      form.BD_BU.value\r\n\t\tform.TO_BD_NM.value          =      form.BD_NM_NEW.value\r\n\t\tform.TO_BD_DET_NM.value      =      form.BD_DET_NM.value\r\n\r\n\t\t//********** END_현진_20120222\t\t \r\n\t\tform.ADDR_CHECK.value=\"1\";\t\t\r\n\t}\r\n}\r\n\r\n\r\nfunction changeWithGuCd(obj){\r\n\tvar guCd = getSelectedValue(obj);\r\n\tvar param = \"guCd=\"+guCd;\r\n    sendRequest(\"/get_bjdong_code.do\", param, \"GET\", ResultChangeWithGuCd);\r\n}\r\n\r\nfunction\tResultChangeWithGuCd(obj)\r\n{\r\n\tselect_innerHTML(document.getElementById(\"WITH_BJ_CD\"),obj);\r\n}\r\n\r\n/////////////////////////////////////////////////////////\r\n\r\nfunction getElementsByClassName(clsName,parentNode) {\r\n\tvar arr = new Array();\r\n\tvar elems;\r\n\t\r\n\tif (parentNode == null) {\r\n\t\telems = document.getElementsByTagName(\"*\");\r\n\t} else {\r\n\t\telems = parentNode.getElementsByTagName(\"*\");\r\n\t}\r\n\tfor ( var cls, i = 0; ( elem = elems[i] ); i++ ) {\r\n\t\tif ( elem.className == clsName ) {\r\n\t\t\tarr[arr.length] = elem;\r\n\t\t}\r\n\t}\r\n\treturn arr;\r\n}\r\nfunction tabDisplay(tab,content,num,type) {\r\n\tfor (var i=0; i<content.length; i++) {\r\n\t\tvar tab_off = tab[i].childNodes[0].getAttribute('src').replace(/_on|_off|_chk/i,'_off');\r\n\t\tvar tab_on = tab[num].getElementsByTagName('img')[0].getAttribute('src').replace(/_on|_off|_chk/i,'_off');\r\n\t\tvar tab_chk = tab[num].getElementsByTagName('img')[0].getAttribute('src').replace(/_on|_off|_chk/i,'_on');\r\n\t\ttab[i].getElementsByTagName('img')[0].setAttribute('src',tab_off);\r\n\t\ttab[num].getElementsByTagName('img')[0].setAttribute('src',tab_chk);\r\n\t\tcontent[i].style.display = 'none';\r\n\t\tcontent[num].style.display = 'block';\r\n\r\n\t\tparent.iFrameResizeTab(\"tab1\");\t//\t화면 RESIZE\r\n\t}\r\n}\r\nfunction tabAct(tab,content,num,type) {\r\n\ttab[num].onclick = function() {\r\n\t\ttabDisplay(tab,content,num);\r\n\t\treturn false;\r\n\t}\r\n\tif (type == true) {\r\n\t\tvar tabimg = tab[num].getElementsByTagName('img')[0];\r\n\t\tvar tab_off = tabimg.getAttribute('src').replace(/_on|_off|_chk/i,";
  private final static String _jspx_template10 = "'_on');\r\n\t\tvar tab_on = tabimg.getAttribute('src').replace(/_on|_off|_chk/i,'_off');\r\n\t\ttab[num].onmouseover = function() {\r\n\t\t\tif (tabimg.getAttribute('src').indexOf('_on') == -1) {\r\n\t\t\t\ttabimg.setAttribute('src',tab_on);\r\n\t\t\t}\r\n\t\t}\r\n\t\ttab[num].onmouseout = function() {\r\n\t\t\tif (tabimg.getAttribute('src').indexOf('_on') != -1) {\r\n\t\t\t\ttabimg.setAttribute('src',tab_off);\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n}\r\nwindow.onload = tabMenu;\r\nfunction tabMenu() {\r\n\tvar tabs = document.getElementById('tabmenu');\r\n\tvar tab = tabs.getElementsByTagName('a'); // 탭 요소\r\n\tvar contents = document.getElementById('tabcontents');\r\n\tvar content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class\r\n\tvar type = true; // 롤오버의 true / false\r\n\tfor (var i=0; i<tab.length; i++) {\r\n\t\ttabDisplay(tab,content,0,true);\r\n\t\ttabAct(tab,content,i,type);\r\n\t}\r\n}\r\n\r\nfunction\tRegisterPrc()\r\n{\r\n\tvar\tresult\t= DataCheck();\r\n\r\n\tif(result\t==\tfalse)\r\n\t\treturn false;\r\n\t\r\n\tvar form = document.form;\r\n\t\r\n\tform.PURPOSE_CD.value\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE_CD\").value;\r\n\r\n\tform.action = \"info_registerprc.do\";\r\n\t\r\n\tform.submit();\r\n}\r\n\r\n\r\nfunction\tSearch()\r\n{\r\n\tvar form = document.form;\r\n\r\n\tform.action = \"search.do\";\r\n\tform.submit();\r\n}\r\n\r\n\r\nfunction\tSelect_UseSection(sel)\r\n{\r\n\tvar form \t= document.form;\r\n\t\r\n\tif(sel.value == '2')\r\n\t{\r\n\t\tvar MUL_DIV = document.getElementById(\"MUL_DIV\");\r\n\t  \t\r\n\t  \tvar innerHtml = \"\";\r\n\t\t  \tinnerHtml += \"<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>\";\r\n\t\t\tinnerHtml += \"\t<tr id='MulDateSection'>\";\r\n\t\t  \tinnerHtml += \"\t\t<td id='UseSection' style='display:block'>\";\r\n\t\t  \tinnerHtml += \"\t\t\t<input id='PARTLY_PERIOD' maxlength='100' name='PARTLY_PERIOD' type='text' class='essential' style='width:400px' value='일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09' onclick=\\\"javascript:document.form.PARTLY_PERIOD.value = '';\\\">\";\r\n\t\t \tinnerHtml += \"\t\t\t&nbsp;&nbsp;총<input name='TOTAL_PERIOD' maxlength='5' type='text' class='essential' style='width:30px' value='' style='ime-mode:disabled' onKeyDown='nr_num_int(this);' onKeyUp='nr_num_int(this);' onKeyPress='nr_num_int(this);'>일\";\r\n\t\t \tinnerHtml += \"\t\t</td>\";\r\n\t\t \tinnerHtml += \"\t</tr>\";\r\n\t  \t\tinnerHtml += \"</table>\";\r\n\t \t\r\n\t \tMUL_DIV.innerHTML = innerHtml;\r\n\t \t\r\n\t}\r\n\telse if(sel.value == '3')\r\n\t{\r\n\t\tvar MUL_DIV = document.getElementById(\"MUL_DIV\");\r\n\t\t\r\n\t\tvar innerHtml = \"\";\r\n\t\t\tinnerHtml += \"<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>\";\r\n\t\t\tinnerHtml += \"\t<tr id='MulDateSection'>\";\r\n\t\t\tinnerHtml += \"\t\t<td id='UseSection' style='display:block'>\";\r\n\t  \t\tinnerHtml += \"\t\t\t<input name='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\\\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd', 0)\\\" style='CURSOR: Pointer;vertical-align: middle;'></a>\";\r\n\t\t  \tinnerHtml += \"\t\t\t~ <input name='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\\\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd', 0)\\\" style='CURSOR: Pointer;vertical-align: middle;'></a>\";\r\n  \t\t\tinnerHtml += \"\t\t</td>\";\r\n\t  \t\tinnerHtml += \"\t</tr>\";\r\n\t  \t\tinnerHtml += \"</table>\";\r\n\t  \t\t\r\n\t  \tMUL_DIV.innerHTML = innerHtml;\r\n\t  \t\r\n\t}\r\n\telse\r\n\t{\r\n\t\tvar MUL_DIV = document.getElementById(\"MUL_DIV\");\r\n\t\t\r\n\t\tvar innerHtml = \"\";\r\n\t\t\tinnerHtml += \"<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>\";\r\n\t\t\tinnerHtml += \"\t<tr id='MulDateSection'>\";\r\n\t\t\tinnerHtml += \"\t\t<td id='UseSection' style='display:block'>\";\r\n\t  \t\tinnerHtml += \"\t\t\t<input name='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\\\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')\\\" style='CURSOR: P";
  private final static String _jspx_template11 = "ointer;vertical-align: middle;'></a>\";\r\n\t\t  \tinnerHtml += \"\t\t\t~ <input name='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\\\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')\\\" style='CURSOR: Pointer;vertical-align: middle;'></a>\";\r\n  \t\t\tinnerHtml += \"\t\t</td>\";\r\n  \t\t\tinnerHtml += \"\t</tr>\";\r\n  \t\t\tinnerHtml += \"</table>\";\r\n  \t\t\r\n  \t\tMUL_DIV.innerHTML = innerHtml;\r\n  \t\t\r\n\t}\r\n\t\r\n\tparent.iFrameResizeTab(\"tab1\");\t//\t화면 RESIZE\r\n}\r\n\r\n\r\n\r\nfunction\tSelect_UseType(sel)\r\n{\r\n\tdocument.getElementById(\"doroname\").colSpan= 1;\r\n\tdocument.getElementById(\"jucha\").style.display = \"none\";\r\n\tdocument.getElementById(\"jucha_value\").style.display = \"none\";\r\n\tdocument.getElementById(\"UseType1\").style.display = \"none\";\r\n\tdocument.getElementById(\"UseType2\").style.display = \"none\";\r\n\tdocument.getElementById(\"UseType3\").style.display \t= \"none\";\r\n\t\r\n\tif(sel.value == '2')\r\n\t{\r\n\t\tdocument.getElementById(\"jucha\").style.display = \"block\";\r\n\t\tdocument.getElementById(\"jucha_value\").style.display = \"inline-block\";\r\n\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"하천명/등급\";\r\n\t\tdocument.getElementById(\"UseType2\").style.display \t= \"inline-block\";\t// 하천명\r\n\t\tdocument.getElementById(\"UseType3\").style.display \t= \"inline-block\"; // 하천등급\r\n\t\t\r\n\t}\r\n\telse if(sel.value == '3')\r\n\t{\r\n\t\tdocument.getElementById(\"jucha\").style.display = \"block\";\r\n\t\tdocument.getElementById(\"jucha_value\").style.display = \"inline-block\";\r\n\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"하천명\";\r\n\t\tdocument.getElementById(\"UseType2\").style.display \t= \"inline-block\";\t// 하천명\r\n\t}\r\n\telse if(sel.value == '1')\r\n\t{\r\n\t\tdocument.getElementById(\"jucha\").style.display = \"block\";\r\n\t\tdocument.getElementById(\"jucha_value\").style.display = \"inline-block\";\r\n\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"주차면수\";\r\n\t\tdocument.getElementById(\"UseType1\").style.display \t= \"inline-block\";\t//\t도로\r\n\t\t\r\n\t}\r\n\telse{\r\n\t\tdocument.getElementById(\"doroname\").colSpan= 3;\r\n\t\tdocument.getElementById(\"USERTYPENAME\").value\t\t= \"\";\r\n\t}\r\n\r\n\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode.jsp?SectionCode=\" + sel.value + \"&essential=1\";\r\n}\t\r\n\r\n//********** BEGIN_현진_20120222\r\n/*\r\nfunction \topenZipcodePopup(post, addr)\r\n{\r\n\tvar\tpost1\t= post;\r\n\tvar\taddr1\t= addr;\r\n\r\n\tvar url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1;\r\n\tvar winName = \"우편번호입력\";\r\n\tvar width \t= 420;\r\n\tvar height \t= 305;\r\n\tvar scroll \t= \"yes\";\r\n\tvar resize \t= \"no\";\r\n\r\n\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\toption\t+= \"resize=\" + resize + \", \";\r\n\toption\t+= \"width=\" + width + \", \";\r\n\toption\t+= \"height=\" + height;\r\n\r\n\twindow.open(url, winName, option);\r\n}\r\n*/\r\n//********** END_현진_20120222\r\n \r\nfunction\tDataCheck()\r\n{\r\n\tvar form \t= document.form;\r\n\tvar\tstr\t\t= \"\";\r\n\tvar tabs = document.getElementById('tabmenu');\r\n\tvar tab = tabs.getElementsByTagName('a'); // 탭 요소\r\n\tvar contents = document.getElementById('tabcontents');\r\n\tvar content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class\r\n\t\r\n\t//\t점용인 정보\r\n\tif(form.NAME.value.length\t< 1){\r\n\t\tstr\t+= \"점용인/법인명을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\t//parent.iFrameResizeTab(\"tab1\");\r\n\t\ttabDisplay(tab,content,1);\r\n\t\tform.NAME.focus();\r\n\t}\r\n\telse if(form.jumin_ssn1.value.length < 6)\r\n\t{\r\n\t\tstr\t+= \"주민(법인)번호가 입력되지 않았거나\\n자리수가 틀립니다.\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,1);\r\n\t\tform.jumin_ssn1.focus();\r\n\t}\r\n\telse if(form.jumin_ssn2.value.length < 7)\r\n\t{\r\n\t\tstr\t+= \"주민(법인)번호가 입력되지 않았거나\\n자리수가 틀립니다.\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,1);\r\n\t\tform.jumin_ssn2.focus();\r\n\t}\r\n\telse if(form.POST.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"우편번호를 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,1);\r\n\t\topenZipcodePopup('form.POST', 'form.ADDR1');\r\n\t}\r\n\telse if(form.BON.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"본번을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,1);\r\n\t\tform.BON.focus();\r\n\t}\r\n\telse if(form.TOPOST.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"우편번호를 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,1);\r\n\t\topenZipcodePopup('form.";
  private final static String _jspx_template12 = "TOPOST', 'form.TOADDR1');\r\n\t}\r\n\telse if(form.TOBON.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"본번을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,1);\r\n\t\tform.TOBON.focus();\r\n\t}\r\n\telse if(form.TYPE.value.length\t< 1)\t//\t점용지 정보\r\n\t{\r\n\t\tstr\t+= \"점용 종류를 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.TYPE.focus();\r\n\t}\r\n\telse if(form.SECTION.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"점용 구분을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.SECTION.focus();\r\n\t}\r\n\telse if(form.OWNER_SET.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"소유자 구분을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.OWNER_SET.focus();\r\n\t}\r\n\telse if(form.TAX_SET.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"세입 구분을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.TAX_SET.focus();\r\n\t}\r\n\telse if(form.MUL_POST.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"우편번호를 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\t//********** BEGIN_현진_20120222\t\t\r\n\t\t//openZipcodePopup('form.MUL_POST', '');\r\n\t\topenZipcodePopup_new('form.MUL_POST','','','','','','','','','');\r\n\t\t//********** END_현진_20120222\r\n\t\t\r\n\t}\r\n\telse if(form.BJ_CD.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"법정동을 입력하세요.\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.BJ_CD.focus();\r\n\t}\r\n\telse if(form.HJ_CD.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"행정동을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.HJ_CD.focus();\r\n\t}\r\n\telse if(form.SPC_CD.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"번지선택을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.SPC_CD.focus();\r\n\t}\r\n\telse if(form.BONBUN.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"본번을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.BONBUN.focus();\r\n\t}\r\n\telse if(form.ROAD_BON.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"도로(하천) 주소를 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.ROAD_BON.focus();\r\n\t}\r\n\telse if(document.getElementsByName(\"WITH_ADDR_PNU\").length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"한개 이상에 공시지가 주소를 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\t//form.WITH_ADDR_LIST.focus();\r\n\t\tform.WITH_GU_CD.focus();\r\n\t}\r\n\telse if(form.MUL_POST.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"우편번호를 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.MUL_POST.focus();\r\n\t}\r\n\r\n\telse if(IFRM_PurposeCode.PURPOSE_CD.value < 011)\r\n\t{\r\n\t\tstr\t+= \"점용목적을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tIFRM_PurposeCode.PURPOSE_CD.focus();\r\n\t}\r\n\telse if (IFRM_PurposeCode.isSelectOK()==false)\r\n\t{\r\n\t\tstr += \"점용목적을 정확히 선택하세요\"\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t}\r\n\telse if(form.AREA_SIZE.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"점용면적을 입력하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.AREA_SIZE.focus();\r\n\t}\r\n\telse if(form.SECTION.value\t== '1' || form.SECTION.value\t== '3'){\r\n\t\tif(form.MUL_FROMDATE.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용기간을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\ttabDisplay(tab,content,2);\r\n\t\t\tform.MUL_FROMDATE.focus();\r\n\t\t}\r\n\t\telse if(form.MUL_TODATE.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용기간을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\ttabDisplay(tab,content,2);\r\n\t\t\tform.MUL_TODATE.focus();\r\n\t\t}\r\n\t}else if(form.SECTION.value\t== '2')\r\n\t{\r\n\t\tif(form.PARTLY_PERIOD.value.length\t< 1 || form.PARTLY_PERIOD.value == \"일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09\")\r\n\t\t{\r\n\t\t\tstr\t+= \"일시점용기간을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\ttabDisplay(tab,content,2);\r\n\t\t\tform.PARTLY_PERIOD.focus();\r\n\t\t}\r\n\t\telse if(form.TOTAL_PERIOD.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"일시점용기간 총일수를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\ttabDisplay(tab,content,2);\r\n\t\t\tform.TOTAL_PERIOD.focus();\r\n\t\t}\r\n\t}\r\n\r\n\r\n\tif(str\t== \"\")\r\n\t{\r\n\t\treturn\ttrue;\r\n\t}\r\n\t\r\n\treturn\tfalse;\r\n}\r\n\r\nfunction\tInit()\r\n{\r\n\tparent.iFrameResizeTab(\"tab1\");\r\n}\r\n\r\n\r\n\r\n// 평균 인접지 공시지가\r\nfunction \taddWithAddrList()\r\n{\r\n\t\r\n\tvar form \t= document.form;\r\n\tvar tabs = document.getElementById('tabmenu');\r\n\tvar tab = tabs.getElementsByTagName('a'); // 탭 요소\r\n\tvar contents = document.getElementById('tabcontents');\r\n\tvar content = getElementsByClassName('tabcontent',contents); // 컨텐츠\r\n\tvar\tstr\t\t= \"\";\r\n\t\r\n\tif(getSelectedValue(form.WITH_GU_CD).length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"구를 선택하세요.\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.WITH_GU_CD.focus();\r\n\t}\r\n\telse if(getSelectedValue(form";
  private final static String _jspx_template13 = ".WITH_BJ_CD).length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"법정동을 선택하세요.\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.WITH_BJ_CD.focus();\r\n\t}\r\n\telse if(getSelectedValue(form.WITH_SPC_CD).length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"번지를 선택하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.WITH_SPC_CD.focus();\r\n\t}\r\n\telse if(form.WITH_BONBUN.value.length\t< 1)\r\n\t{\r\n\t\tstr\t+= \"본번을 선택하세요\\n\";\r\n\t\talert(str);\r\n\t\ttabDisplay(tab,content,2);\r\n\t\tform.WITH_BONBUN.focus();\r\n\t}\r\n\telse{\r\n\t\t\r\n\t\tvar pnu = '11'+getSelectedValue(form.WITH_GU_CD)+getSelectedValue(form.WITH_BJ_CD)\r\n\t\t+getSelectedValue(form.WITH_SPC_CD)+addZero(form.WITH_BONBUN.value,4)+addZero(form.WITH_BUBUN.value,4);\r\n\t\t\r\n\t\tvar text = getSelectedText(form.WITH_GU_CD)+' '+getSelectedText(form.WITH_BJ_CD)+' ';\r\n\t\tif(form.WITH_SPC_CD.value == '2')text += '산 ';\r\n\t\ttext += form.WITH_BONBUN.value;\r\n\t\tif(form.WITH_BUBUN.value.length > 0){\r\n\t\t\ttext += '-'+form.WITH_BUBUN.value;\r\n\t\t}\r\n\t\t\r\n\t\taddWithAddr(pnu,text);\r\n\t}\t\r\n}\r\n\r\nfunction delWithAddr(obj){\r\n\tvar list = document.getElementsByName(\"DEL_ID\");\r\n\tvar delId;\r\n\tfor(var i = 0 ; i < list.length ; i++){\r\n\t\tif(list[i] == obj){\r\n\t\t\tdelId = i;\r\n\t\t\t\r\n\t\t}\r\n\t}\r\n\t\r\n\tvar tbody = document.getElementById(\"WITH_ADDR_LIST\");\r\n\ttbody.deleteRow(delId);\r\n}\r\n\r\nfunction addWithAddr(pnu,text){\r\n\t\r\n\tvar tbody = document.getElementById(\"WITH_ADDR_LIST\");\r\n\t  \r\n\tvar tr,td,Elem;\r\n\t\r\n\ttr = document.createElement('tr');\r\n\ttd = document.createElement('td');\r\n\ttd.setAttribute(\"height\", \"18px\");\r\n\ttd.setAttribute(\"width\", \"90%\");\r\n\t\r\n\t//Elem = document.createElement(\"<input name='WITH_ADDR_PNU' type='hidden'>\");\r\n\tvar Elem1 = document.createElement(\"div\");\r\n\tvar innerElem1 = \"<input name='WITH_ADDR_PNU' type='hidden' value='\"+pnu+\"'>\";\r\n\tElem1.innerHTML = innerElem1; \r\n\ttd.appendChild(Elem1);\r\n\t\r\n\t//Elem = document.createElement(\"<input name='WITH_ADDR_TEXT' type='text' readonly>\");\r\n\tvar Elem2 = document.createElement(\"div\");\r\n\tvar innerElem2 = \"<input name='WITH_ADDR_TEXT' type='text' readonly class='input_form1' style='border: 0; width: 100%;' value='\"+text+\"'>\";\r\n\tElem2.innerHTML=innerElem2;\r\n\ttd.appendChild(Elem2);\r\n\r\n\t\r\n\ttr.appendChild(td);\r\n\ttd = document.createElement('td');\r\n\ttd.setAttribute(\"width\", \"10%\");\r\n\t\r\n\tElem = document.createElement('img');\r\n\tElem.src = '/img/mapImg/close.gif';\r\n\tElem.name = 'DEL_ID';\r\n\tElem.alt = '삭제';\r\n\tElem.style.width = '22px';\r\n\tElem.style.height = '17px';\r\n\tElem.style.border = '0px';\r\n\tElem.style.CURSOR = 'pointer';\r\n\tElem.style.verticalAlign = 'middle';\r\n\tElem.onclick = function(){\r\n\t\tdelWithAddr(this);\r\n\t};\r\n\ttd.appendChild(Elem);\r\n\ttr.appendChild(td);\r\n\ttbody.appendChild(tr);\r\n\t\r\n}\r\n\r\n\r\n\r\n\tfunction goViewJibunMap(gubun){\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n\t\tif(gubun == 'with'){\r\n\t\t\tif(getSelectedValue(form.BJ_CD).length\t< 1){\r\n\t\t\t\tstr\t+= \"점용지 법정동을 입력하세요.\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.BJ_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(getSelectedValue(form.SPC_CD).length\t< 1){\r\n\t\t\t\tstr\t+= \"점용지 번지선택을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.SPC_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(form.BONBUN.value.length\t< 1){\r\n\t\t\t\tstr\t+= \"점용지 본번을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.BONBUN.focus();\r\n\t\t\t}\r\n\t\t}else if(gubun == 'road'){\r\n\t\t\tif(getSelectedValue(form.BJ_CD).length\t< 1){\r\n\t\t\t\tstr\t+= \"점용지 법정동을 입력하세요.\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.BJ_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(getSelectedValue(form.SPC_CD).length\t< 1){\r\n\t\t\t\tstr\t+= \"점용지 번지선택을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.SPC_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(form.ROAD_BON.value.length\t< 1){\r\n\t\t\t\tstr\t+= \"도로주소 본번을 입력하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\tform.ROAD_BON.focus();\r\n\t\t\t}\r\n\t\t}else if(gubun == 'price'){\r\n\t\t\tif(getSelectedValue(form.WITH_GU_CD).length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"구를 선택하세요.\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\ttabDisplay(tab,content,2);\r\n\t\t\t\tform.WITH_GU_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(getSelectedValue(form.WITH_BJ_CD).length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"법정동을 선택하세요.\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\ttabDisplay(tab,content,2);\r\n\t\t\t\tform.WITH_BJ_CD.focus();\r\n\t\t\t}\r\n\t\t\telse if(getSelectedValue(form.WITH_SPC_CD).length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"번지를 선택하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\ttabDisplay(tab,content,2);\r\n\t\t\t\tform.WITH_SPC_CD.focus";
  private final static String _jspx_template14 = "();\r\n\t\t\t}\r\n\t\t\telse if(form.WITH_BONBUN.value.length\t< 1)\r\n\t\t\t{\r\n\t\t\t\tstr\t+= \"본번을 선택하세요\\n\";\r\n\t\t\t\talert(str);\r\n\t\t\t\ttabDisplay(tab,content,2);\r\n\t\t\t\tform.WITH_BONBUN.focus();\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\tvar bjCd = getSelectedValue(form.BJ_CD);\r\n\t\t\tvar spcCd = getSelectedValue(form.SPC_CD);\r\n\t\t\tvar sigungu = form.SIGUNGU.value;\r\n\t\t\t\r\n\t\t\tif(gubun == 'with'){\r\n\t\t\t\tvar bonbunCd = form.BONBUN.value;\r\n\t\t\t\tvar bubunCd = form.BUBUN.value;\r\n\t\t\t}else if(gubun == 'road'){\r\n\t\t\t\tvar bonbunCd = form.ROAD_BON.value;\r\n\t\t\t\tvar bubunCd = form.ROAD_BU.value;\r\n\t\t\t}else if(gubun == 'price'){\r\n\t\t\t\tsigungu = getSelectedValue(form.WITH_GU_CD);\r\n\t\t\t\tbjCd = getSelectedValue(form.WITH_BJ_CD);\r\n\t\t\t\tspcCd = getSelectedValue(form.WITH_SPC_CD);\r\n\t\t\t\tvar bonbunCd = form.WITH_BONBUN.value;\r\n\t\t\t\tvar bubunCd = form.WITH_BUBUN.value;\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\tvar pnu = '11'+sigungu+bjCd+spcCd+addZero(bonbunCd,4)+addZero(bubunCd,4);\r\n\t\t\t\r\n\t\t\t\r\n\t\t\tvar url = '/jumyong/map/mini_map.do?PNU='+pnu+'&TYPE=view';\r\n\t\t\tcw=screen.availWidth; // 화면 너비\r\n\t\t\tch=screen.availHeight; // 화면 높이\r\n\t\t\t\r\n\t\t\tsw=800;// 띄울 창의 너비\r\n\t\t\tsh=600;// 띄울 창의 높이\r\n\t\t\t\r\n\t\t\tml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치\r\n\t\t\tmt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치\r\n\r\n\t\t\tvar param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';\r\n\t\t\twindow.open(url, \"minimap\", param);\r\n\t\t\t\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\treturn;\r\n\t\t\t\r\n\t\t}\r\n\t}\r\n</script>\r\n<body>\r\n\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"UserType\" name=\"UserType\">\r\n<input type=\"hidden\" id=\"UserSection\" name=\"UserSection\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"MIN_CHECK\" name=\"MIN_CHECK\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"MIN_PROCESS\" name=\"MIN_PROCESS\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" id=\"GIGAN1\" name=\"GIGAN1\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" id=\"GIGAN2\" name=\"GIGAN2\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" id=\"MIN_NAME\" name=\"MIN_NAME\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" id=\"MIN_REQNO\" name=\"MIN_REQNO\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" id=\"NOWTAB\" name=\"NOWTAB\" value=\"0\">\r\n<input type=\"hidden\" id=\"WITH_XML\" name=\"WITH_XML\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" id=\"SIGUNGU\" name=\"SIGUNGU\" value=\"";
  private final static String _jspx_template23 = "\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<tr>\r\n\t<td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n   \t\t<tr>\r\n         \t<td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n         \t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t               <tr>\r\n\t               \t<ul id=\"tabmenu\">\r\n\t\t\t\t\t\t<td width=\"111\"><a><img src=\"/img/sub_petition_title9_on.gif\" alt=\"민원정보\" width=\"110\" height=\"22\" border=\"0\" onclick=\"Init();\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a><img src=\"/img/sub_petition_title2_off_b.gif\" alt=\"점용인 정보\" width=\"110\" height=\"22\" border=\"0\" onclick=\"Init();\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a><img src=\"/img/sub_petition_title3_off.gif\" alt=\"점용지 정보\" width=\"110\" height=\"22\" border=\"0\" onclick=\"Init();\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t</ul>\r\n\t               </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<tr>\r\n            <td align=\"left\" class=\"contborder_purple\">\r\n\t\r\n\t\t<div id=\"tabcontents\">\r\n\t\t\r\n\t\t\t<div class=\"tabcontent\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\r\n                <tr>\r\n\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수번호</td>\r\n\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"REQ_NO_MIN\" name=\"REQ_NO_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template24 = "\"  maxlength=\"20\" readonly></td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원구분</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"GUBUN_MIN\" name=\"GUBUN_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template25 = "\" maxlength=\"25\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수일자</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td><input id=\"REQ_DATE_MIN\" name=\"REQ_DATE_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template26 = "\" readonly></td>\r\n\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('REQ_DATE_MIN'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리예정일자</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td><input id=\"PREDATE_MIN\" name=\"PREDATE_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template27 = "\" readonly></td>\r\n\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('PREDATE_MIN'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수부서</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"REQ_DEP_MIN\" name=\"REQ_DEP_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template28 = "\" maxlength=\"10\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"MANAGE_DEP_MIN\" name=\"MANAGE_DEP_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template29 = "\" maxlength=\"10\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"REQ_NM_MIN\" name=\"REQ_NM_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template30 = "\" maxlength=\"10\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"MANAGER_MIN\" name=\"MANAGER_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template31 = "\" maxlength=\"10\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원요지</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<input id=\"NOTES_MIN\" name=\"NOTES_MIN\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template32 = "\" maxlength=\"100\">\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"AGENT_NM_MIN\" name=\"AGENT_NM_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template33 = "\"  maxlength=\"10\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인 연락처</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"min_agent_tel\" name=\"min_agent_tel\" type=\"text\" class=\"input_form1\" style=\"width:100px\" value=\"";
  private final static String _jspx_template34 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"11\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"NAME_MIN\" name=\"NAME_MIN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template35 = "\" maxlength=\"10\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주민번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"min_ssn1\" name=\"min_ssn1\" type=\"text\" class=\"input_form1\" style=\"width:40px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template36 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_ssn2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t\t - <input id=\"min_ssn2\" name=\"min_ssn2\" type=\"text\" class=\"input_form1\" style=\"width:87px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template37 = "\" onKeyPress=\"nr_num_int(this);\" maxlength=\"7\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 우편번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  \t<td><input id=\"POST_MIN\" name=\"POST_MIN\" type=\"text\" class=\"input_form1\" style=\"width:50px\" value=\"";
  private final static String _jspx_template38 = "\" readonly></td>\r\n\t\t\t\t\t\t\t  \t<!--  //********** BEGIN_현진_20120222 -->\r\n\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:openZipcodePopup('form.POST_MIN', 'form.ADDR1_MIN');\" style=\"CURSOR:Hand\"></td>\r\n\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:openZipcodePopup_new('form.POST_MIN', 'form.ADDR1_MIN','','','','','','','','');\" style=\"CURSOR:Hand\"></td>\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120222 -->\r\n\t\t\t\t\t\t\t  \t\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"ADDR1_MIN\" name=\"ADDR1_MIN\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template39 = "\" readonly>\r\n\t\t\t\t\t\t\t<input id=\"ADDR2_MIN\" name=\"ADDR2_MIN\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template40 = "\" maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"min_tel\" name=\"min_tel\" type=\"text\" class=\"input_form1\" style=\"width:100px\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" style=\"ime-mode:disabled\" value=\"";
  private final static String _jspx_template41 = "\" maxlength=\"11\">  \r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 휴대폰</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"min_hp\" name=\"min_hp\" type=\"text\" class=\"input_form1\" style=\"width:100px\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" style=\"ime-mode:disabled\" value=\"";
  private final static String _jspx_template42 = "\" maxlength=\"11\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<textarea id=\"MINWON_REFERENCE\" name=\"MINWON_REFERENCE\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template43 = "\" maxlength=\"500\"></textarea>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n                  \t</table>\r\n                  \t</td>\r\n                </tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t</div>\r\n<!--  //********** BEGIN_현진_20120222 -->\r\n<!-- \r\n\t\t\t<div class=\"tabcontent\" style=\"display:none\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\r\n                <tr>\r\n                  \t<td>\r\n                  \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td width=\"14%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"NAME\" name=\"NAME\" type=\"text\" class=\"essential\" style=\"width:250px\" onKeyUp=\"Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template44 = "\"  maxlength=\"20\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"14%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민/법인번호</td>\r\n\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_ssn1\" name=\"jumin_ssn1\" type=\"text\" class=\"essential\" style=\"width:40px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template45 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_ssn2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t  - <input id=\"jumin_ssn2\" name=\"jumin_ssn2\" type=\"text\" class=\"essential\" style=\"width:45px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template46 = "\" onKeyPress=\"nr_num_int(this);\" maxlength=\"7\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업자등록번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_bizssn1\" name=\"jumin_bizssn1\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template47 = "\" style=\"width:20px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_bizssn2, 3);\" maxlength=\"3\">\r\n\t\t\t\t\t\t  - <input id=\"jumin_bizssn2\" name=\"jumin_bizssn2\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template48 = "\" style=\"width:15px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_bizssn3, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t\t  - <input id=\"jumin_bizssn3\" name=\"jumin_bizssn3\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template49 = "\" style=\"width:35px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" maxlength=\"5\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">업태/업종</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"BIZ_STATUS\" name=\"BIZ_STATUS\" type=\"text\" class=\"input_form1\" style=\"width:60px\" value=\"";
  private final static String _jspx_template50 = "\" maxlength=\"50\">\r\n\t\t\t\t\t\t  / <input id=\"BIZ_TYPES\" name=\"BIZ_TYPES\" type=\"text\" class=\"input_form1\" style=\"width:160px\" value=\"";
  private final static String _jspx_template51 = "\" maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><input id=\"POST\" name=\"POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template52 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup('form.POST', 'form.ADDR1');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"ADDR1\" name=\"ADDR1\" type=\"text\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template53 = "\" readonly>\r\n\t\t\t\t\t\t\t산<input id=\"SAN\" name=\"SAN\" type=\"checkbox\" style=\"vertical-align: middle;\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t\t\t<input id=\"BON\" name=\"BON\" type=\"text\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template54 = "\">\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"BU\" name=\"BU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template55 = "\" >\r\n\t\t\t\t\t\t\t<input id=\"ADDR2\" name=\"ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template56 = "\"  maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">e-mail</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"EMAIL\" name=\"EMAIL\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template57 = "\" style=\"ime-mode:disabled\" onKeyUp=\"Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기존 허가번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"B_PERMISSION\" name=\"B_PERMISSION\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template58 = "\" style=\"ime-mode:disabled\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"  onkeyup=\"Jumin_toaddr_Check();\" maxlength=\"20\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_tel1\" name=\"jumin_tel1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_tel2, 3); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_tel2\" name=\"jumin_tel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_tel3, 4); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_tel3\" name=\"jumin_tel3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_tel3, 4); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_hp1\" name=\"jumin_hp1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_hp2, 3); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_hp2\" name=\"jumin_hp2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_hp3, 4); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_hp3\" name=\"jumin_hp3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_hp3, 4); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"34px\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\">* 우편물 송달지</span> : </td>\r\n\t\t\t\t\t\t\t\t  <td width=\"16px\">\r\n\t\t\t\t\t\t\t\t  \t<input id=\"ADDR_CHECK\" name=\"ADDR_CHECK\" type=\"checkbox\" value=\"1\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" checked=\"checked\"></td>\r\n\t\t\t\t\t\t\t\t  <td width=\"110px\">점용인 정보와 동일 </td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물 수령인 </td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"TONM\" name=\"TONM\" type=\"text\" class=\"essential\" style=\"width:250px\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template59 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><input id=\"TOPOST\" name=\"TOPOST\" type=\"text\" class=\"essential\" style=\"width:50px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template60 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup('form.TOPOST', 'form.TOADDR1');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"TOADDR1\" name=\"TOADDR1\" type=\"text\" class=\"essential\" style=\"width:250px\" value=\"";
  private final static String _jspx_template61 = "\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" readonly>\r\n\t\t\t\t\t\t\t산<input id=\"TOSAN\" name=\"TOSAN\" type=\"checkbox\" style=\"vertical-align: middle;\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t\t\t<input id=\"TOBON\" name=\"TOBON\" type=\"text\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template62 = "\">\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"TOBU\" name=\"TOBU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template63 = "\" >\r\n\t\t\t\t\t\t\t<input id=\"TOADDR2\" name=\"TOADDR2\" type=\"text\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template64 = "\"  maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">e-mail</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"TOMAIL\" name=\"TOMAIL\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template65 = "\"  onKeyUp=\"Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" style=\"ime-mode:disabled\"  maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_totel1\" name=\"jumin_totel1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_totel2, 3);\" maxlength=\"3\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_totel2\" name=\"jumin_totel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_totel3, 4);\" maxlength=\"4\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_totel3\" name=\"jumin_totel3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_totel3, 4);\" maxlength=\"4\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_tohp1\" name=\"jumin_tohp1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_tohp2, 3);\" maxlength=\"3\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_tohp2\" name=\"jumin_tohp2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_tohp3, 4);\" maxlength=\"4\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_tohp3\" name=\"jumin_tohp3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_tohp3, 4);\" maxlength=\"4\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t    <tr>\r\n\t\t\t\t\t  \t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<textarea id=\"APPEAL_REFERENCE\" name=\"APPEAL_REFERENCE\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template66 = "\" maxlength=\"500\"></textarea>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t    </tr>\r\n                  \t</table>\r\n                  \t</td>\r\n\t\t\t\t  \t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t</div>\r\n\t\t\t\r\n-->\r\n\t\t\t<div class=\"tabcontent\" style=\"display:none\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\r\n                <tr>\r\n                  \t<td>\r\n                  \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td width=\"14%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"NAME\" name=\"NAME\" type=\"text\" class=\"essential\" style=\"width:250px\" onKeyUp=\"Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template67 = "\"  maxlength=\"20\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"14%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민/법인번호</td>\r\n\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_ssn1\" name=\"jumin_ssn1\" type=\"text\" class=\"essential\" style=\"width:40px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template68 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_ssn2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t  - <input id=\"jumin_ssn2\" name=\"jumin_ssn2\" type=\"text\" class=\"essential\" style=\"width:87px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template69 = "\" onKeyPress=\"nr_num_int(this);\" maxlength=\"7\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업자등록번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_bizssn1\" name=\"jumin_bizssn1\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template70 = "\" style=\"width:20px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_bizssn2, 3);\" maxlength=\"3\">\r\n\t\t\t\t\t\t  - <input id=\"jumin_bizssn2\" name=\"jumin_bizssn2\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template71 = "\" style=\"width:15px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_bizssn3, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t\t  - <input id=\"jumin_bizssn3\" name=\"jumin_bizssn3\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template72 = "\" style=\"width:35px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" maxlength=\"5\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">업태/업종</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"BIZ_STATUS\" name=\"BIZ_STATUS\" type=\"text\" class=\"input_form1\" style=\"width:60px\" value=\"";
  private final static String _jspx_template73 = "\" maxlength=\"50\">\r\n\t\t\t\t\t\t  / <input id=\"BIZ_TYPES\" name=\"BIZ_TYPES\" type=\"text\" class=\"input_form1\" style=\"width:160px\" value=\"";
  private final static String _jspx_template74 = "\" maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<!--  //********** BEGIN_현진_20120215 -->\r\n                  \t<!-- \r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><input id=\"POST\" name=\"POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template75 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM');\"><img src=\"/img/search_icon.gif\" alt=\"읍면동검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\t\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t-->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  \t<td width=\"50px\"><input id=\"POST\" name=\"POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template76 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t  \t<td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','form.DONG','form.BON', 'form.BU');\"><img src=\"/img/search_icon.gif\" alt=\"읍면동검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\t\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t\t\t\t<td align=\"right\"><a href=\"javascript:addrConfirm('POST','SI','GUN','DONG','DORO_NM','BON','BU','BD_BON','BD_BU','BD_NM_NEW','BD_DET_NM','ADDR1','ADDR2','ADDR1_NEW','form')\"><img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t<!--  sungh83 20131105 -->\r\n\t\t\t\t\t\t\t\t\t<td><span class=\"sub_table_b\">%도로명주소의 건물본번,부번을 입력하시려면 확인버튼을 클릭하시오</span></td>\r\n\t\t\t\t\t\t\t      \t<!--  sungh83 20131105 --> \r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<!-- 기본 주소  -->\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"ADDR1\" name=\"ADDR1\" type=\"text\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template77 = "\" readonly>\r\n\t\t\t\t\t\t\t산<input id=\"SAN\" name=\"SAN\" type=\"checkbox\" style=\"vertical-align: middle;\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t\t\t<input id=\"BON\" name=\"BON\" type=\"text\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template78 = "\">\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"BU\" name=\"BU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template79 = "\" >\r\n\t\t\t\t\t\t\t<input id=\"ADDR2\" name=\"ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template80 = "\"  maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t<!-- 도로명주소 -->\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t\t\t\t\t<input id=\"SI\" name=\"SI\" type=\"hidden\" value=\"\">\r\n\t\t\t\t\t\t\t<input id=\"GUN\" name=\"GUN\" type=\"hidden\" value=\"\">\r\n\t\t\t\t\t\t\t<input id=\"DORO_NM\" name=\"DORO_NM\" type=\"hidden\" value=\"\">\r\n\t\t\t\t\t\t\t<input type=\"hidden\" id=\"DONG\" name=\"DONG\">\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\t\t\t\t\r\n \t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t\t\t\t\t<!-- <input id=\"ADDR1_NEW\" name=\"ADDR1_NEW\" type=\"text\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template81 = "\" readonly>\r\n\t\t\t\t\t\t\t<input id=\"ADDR2_NEW\" name=\"ADDR2_NEW\" type=\"text\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template82 = "\"  maxlength=\"50\"> \r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<input id=\"BON_NEW\" name=\"BON_NEW\" type=\"text\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template83 = "\">\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"BU_NEW\" name=\"BU_NEW\" type=\"text\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template84 = "\" >\r\n\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t<input id=\"ADDR1_NEW\" name=\"ADDR1_NEW\" type=\"text\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" readonly>\r\n\t\t\t\t\t\t\t<input id=\"BD_BON\" name=\"BD_BON\" type=\"text\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"/>\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"BD_BU\" name=\"BD_BU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"/>\r\n\t\t\t\r\n\t\t\t\t\t\t\t<input id=\"BD_NM_NEW\" name=\"BD_NM_NEW\" type=\"text\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t<input id=\"BD_DET_NM\" name=\"BD_DET_NM\" type=\"text\" class=\"input_form1\" style=\"width:214px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">e-mail</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"EMAIL\" name=\"EMAIL\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template85 = "\" style=\"ime-mode:disabled\" onKeyUp=\"Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기존 허가번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"B_PERMISSION\" name=\"B_PERMISSION\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template86 = "\" style=\"ime-mode:disabled\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"  onkeyup=\"Jumin_toaddr_Check();\" maxlength=\"20\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_tel1\" name=\"jumin_tel1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_tel2, 3); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_tel2\" name=\"jumin_tel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_tel3, 4); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_tel3\" name=\"jumin_tel3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_tel3, 4); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_hp1\" name=\"jumin_hp1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_hp2, 3); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_hp2\" name=\"jumin_hp2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_hp3, 4); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_hp3\" name=\"jumin_hp3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, jumin_hp3, 4); Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"34px\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\">* 우편물 송달지</span> : </td>\r\n\t\t\t\t\t\t\t\t  <td width=\"16px\">\r\n\t\t\t\t\t\t\t\t  \t<input id=\"ADDR_CHECK\" name=\"ADDR_CHECK\" type=\"checkbox\" value=\"1\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" checked=\"checked\"></td>\r\n\t\t\t\t\t\t\t\t  <td width=\"110px\">점용인 정보와 동일 </td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물 수령인 </td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"TONM\" name=\"TONM\" type=\"text\" class=\"essential\" style=\"width:250px\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template87 = "\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t\r\n\t\t\t\t  \t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t\t\t<!-- \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><input id=\"TOPOST\" name=\"TOPOST\" type=\"text\" class=\"essential\" style=\"width:50px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template88 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t<input id=\"TOSI\" name=\"TOBU\" type=\"hidden\" >\r\n\t\t\t\t\t\t\t\t\t<input id=\"TOGUN\" name=\"TOBU\" type=\"hidden\" >\r\n\t\t\t\t\t\t\t\t\t<input id=\"TO_DORO_NM\" name=\"TOBU\" type=\"hidden\" >\r\n\t\t\t\t\t\t\t\t\t<input id=\"TO_BD_NM\" name=\"TOBU\" type=\"hidden\" >\r\n\t\t\t\t\t\t\t\t\t<input id=\"TO_BD_DET_NM\" name=\"TOBU\" type=\"hidden\" >\r\n\t\t\t\t\t\t\t\t\t<input id=\"TO_BD_BON\" name=\"TOBU\" type=\"hidden\" >\r\n\t\t\t\t\t\t\t\t\t<input id=\"TO_BD_BU\" name=\"TOBU\" type=\"hidden\" >\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t -->\t\t\t\t\t\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  \t<td width=\"50px\"><input id=\"TOPOST\" name=\"TOPOST\" type=\"text\" class=\"essential\" style=\"width:50px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template89 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t  \t<td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM','form.TODONG','form.TOBON', 'form.TOBU' );\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"right\"><a href=\"javascript:addrConfirm('TOPOST','TOSI','TOGUN','TODONG','TO_DORO_NM','TOBON','TOBU','TO_BD_BON','TO_BD_BU','TO_BD_NM','TO_BD_DET_NM','TOADDR1','TOADDR2','TOADDR1_NEW','form')\"><img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\"></a></td>\t\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t\t\t\t<!--  sungh83 20131105 -->\r\n\t\t\t\t\t\t\t\t\t<td><span class=\"sub_table_b\">%도로명주소의 건물본번,부번을 입력하시려면 확인버튼을 클릭하시오</span></td>\r\n\t\t\t\t\t\t\t      \t<!--  sungh83 20131105 --> \r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\t  \t<!-- 송달지 주소 -->\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"TOADDR1\" name=\"TOADDR1\" type=\"text\" class=\"essential\" style=\"width:250px\" value=\"";
  private final static String _jspx_template90 = "\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" readonly>\r\n\t\t\t\t\t\t\t산<input id=\"TOSAN\" name=\"TOSAN\" type=\"checkbox\" style=\"vertical-align: middle;\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t\t\t<input id=\"TOBON\" name=\"TOBON\" type=\"text\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template91 = "\">\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"TOBU\" name=\"TOBU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template92 = "\" >\r\n\t\t\t\t\t\t\t<input id=\"TOADDR2\" name=\"TOADDR2\" type=\"text\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template93 = "\"  maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t<!-- 송달지 도로명주소 -->\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 도로명주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t<input id=\"TOADDR1_NEW\" name=\"TOADDR1_NEW\" type=\"text\" class=\"essential\" style=\"width:250px\" value=\"";
  private final static String _jspx_template94 = "\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" readonly>\r\n\t\t\t\t\t\t\t<input id=\"TOBON_NEW\" name=\"TOBON_NEW\" type=\"text\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template95 = "\">\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"TOBU_NEW\" name=\"TOBU_NEW\" type=\"text\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template96 = "\" >\r\n\t\t\t\t\t\t\t<input id=\"TOADDR2_NEW\" name=\"TOADDR2_NEW\" type=\"text\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template97 = "\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t\t<input id=\"TOSI\" name=\"TOSI\" type=\"hidden\" >\r\n\t\t\t\t\t\t\t<input id=\"TOGUN\" name=\"TOGUN\" type=\"hidden\" >\r\n\t\t\t\t\t\t\t<input id=\"TO_DORO_NM\" name=\"TO_DORO_NM\" type=\"hidden\" >\r\n\t\t\t\t\t\t\t<input type=\"hidden\" id=\"TODONG\" name=\"TODONG\">\r\n\t\t\t\t\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\t\t\t\t<input id=\"TOADDR1_NEW\" name=\"TOADDR1_NEW\" type=\"text\" class=\"essential\" style=\"width:250px\" value=\"";
  private final static String _jspx_template98 = "\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" readonly>\r\n\t\t\t\t\t\t\t<input id=\"TO_BD_BON\" name=\"TO_BD_BON\" type=\"text\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t<input id=\"TO_BD_BU\" name=\"TO_BD_BU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\">\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<input id=\"TO_BD_NM\" name=\"TO_BD_NM\" type=\"text\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t<input id=\"TO_BD_DET_NM\" name=\"TO_BD_DET_NM\" type=\"text\" class=\"input_form1\" style=\"width:214px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">e-mail</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"TOMAIL\" name=\"TOMAIL\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template99 = "\"  onKeyUp=\"Jumin_toaddr_Check();\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" style=\"ime-mode:disabled\"  maxlength=\"50\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_totel1\" name=\"jumin_totel1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_totel2, 3);\" maxlength=\"3\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_totel2\" name=\"jumin_totel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_totel3, 4);\" maxlength=\"4\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_totel3\" name=\"jumin_totel3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_totel3, 4);\" maxlength=\"4\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"jumin_tohp1\" name=\"jumin_tohp1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_tohp2, 3);\" maxlength=\"3\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_tohp2\" name=\"jumin_tohp2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_tohp3, 4);\" maxlength=\"4\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"> - \r\n\t\t\t\t\t\t\t<input id=\"jumin_tohp3\" name=\"jumin_tohp3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_tohp3, 4);\" maxlength=\"4\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t    <tr>\r\n\t\t\t\t\t  \t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<textarea id=\"APPEAL_REFERENCE\" name=\"APPEAL_REFERENCE\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template100 = "\" maxlength=\"500\"></textarea>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t    </tr>\r\n                  \t</table>\r\n                  \t</td>\r\n\t\t\t\t  \t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t</div>\r\n\r\n<!--   //********** END_현진_20120222 -->\t\t\r\n\r\n\t\t\t<div class=\"tabcontent\" style=\"display:none\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t                <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"14%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">점용종류</td>\r\n\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">\r\n\t\t\t\t\t\t\t<select id=\"TYPE\" name=\"TYPE\" class=\"essential\" style=\"width:70px\" OnChange=\"Select_UseType(this);\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template101 = "\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"14%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">점용구분</td>\r\n\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">\r\n\t\t\t\t\t\t\t<select id=\"SECTION\" name=\"SECTION\" class=\"essential\" style=\"width:70px\" OnChange=\"Select_UseSection(this);\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template102 = "\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  \t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소유자</td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select id=\"OWNER_SET\" name=\"OWNER_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template103 = "\r\n\t\t\t\t\t  \t</select></td>\r\n\t\t\t\t\t  \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select id=\"TAX_SET\" name=\"TAX_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template104 = "\r\n\t\t\t\t\t  \t</select>\r\n\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  \t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t<input id=\"MUL_POST\" name=\"MUL_POST\" type=\"text\" class=\"essential\" style=\"width:50px\" value=\"";
  private final static String _jspx_template105 = "\" readonly>\t\t\t\t\t\t  \t\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120222 -->\r\n\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t<img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:openZipcodePopup('form.MUL_POST', '');\" style=\"cursor: pointer; vertical-align: middle;\">\r\n\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t<img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:openZipcodePopup_new('form.MUL_POST','','','','','','','','','');\" style=\"cursor: pointer; vertical-align: middle;\">\r\n\t\t\t\t\t\t\t<!--   //********** END_현진_20120222 -->\t\t\t\t\t\t  \t\r\n\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t  \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">건물(명) 정보 </td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  \t\t<input id=\"BD_NM\" name=\"BD_NM\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template106 = "\"  maxlength=\"25\">\r\n\t\t\t\t\t\t\t<input id=\"BD_DONG\" name=\"BD_DONG\" type=\"text\" class=\"input_form1\" style=\"width:30px\" value=\"";
  private final static String _jspx_template107 = "\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\"  maxlength=\"4\">동 \r\n\t\t\t\t\t\t\t<input id=\"BD_HO\" name=\"BD_HO\" type=\"text\" class=\"input_form1\" style=\"width:30px\" value=\"";
  private final static String _jspx_template108 = "\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\"  maxlength=\"4\">호 \r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  \t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지지번</td>\r\n\t\t\t\t\t  \t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template109 = "&nbsp;\r\n\t\t\t\t\t  \t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"essential\" style=\"width:80px\">\r\n\t\t\t\t        \t";
  private final static String _jspx_template110 = "\r\n\t\t\t\t        </select>\r\n\t\t\t\t        <select id=\"HJ_CD\" name=\"HJ_CD\" class=\"essential\" style=\"width:80px\">\r\n\t\t\t            \t";
  private final static String _jspx_template111 = "\r\n\t\t\t            </select>\r\n\t\t\t            <select id=\"SPC_CD\" name=\"SPC_CD\" class=\"essential\" style=\"width:75px\">\r\n\t\t\t            \t";
  private final static String _jspx_template112 = "\r\n\t\t\t            </select>\r\n\t\t\t            <input id=\"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template113 = "\" type=\"text\" class=\"essential\" style=\"width:40px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t- <input id=\"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template114 = "\" type=\"text\" class=\"input_form1\" style=\"width:40px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t번지 <input id=\"TONG\" name=\"TONG\" value=\"";
  private final static String _jspx_template115 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"2\">\r\n\t\t\t\t\t\t통 <input id=\"BAN\" name=\"BAN\" value=\"";
  private final static String _jspx_template116 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"2\"> \r\n\t\t\t\t\t\t반\r\n\t\t\t\t\t\t<img src=\"/img/loca_icon.gif\" alt=\"위치확인\" id=\"LocReg\" width=\"64\" height=\"18\" border=\"0\" onClick=\"javascript:goViewJibunMap('with');\" style=\"vertical-align: middle;CURSOR:pointer;\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t                <tr> \r\n\t                  \t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로(하천)지번<br/></td>\r\n\t                  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" id=\"doroname\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"ROAD_ADDR\" name=\"ROAD_ADDR\" type=\"text\" class=\"input_form1\" style=\"width:60px\" value=\"";
  private final static String _jspx_template117 = "\" maxlength=\"12\">\r\n\t\t\t\t\t\t\t<input id=\"ROAD_BON\" name=\"ROAD_BON\" type=\"text\" class=\"essential\" style=\"width:40px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t  - <input id=\"ROAD_BU\" name=\"ROAD_BU\" type=\"text\" class=\"input_form1\" style=\"width:40px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t  <img src=\"/img/loca_icon.gif\" alt=\"위치확인\" id=\"LocReg\" width=\"64\" height=\"18\" border=\"0\" onClick=\"javascript:goViewJibunMap('road');\" style=\"vertical-align: middle;CURSOR:pointer;\">\r\n\t\t\t\t\t\t </td>\r\n\t       \t\t\t  \t<td width=\"100px\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"\" id=\"jucha\" style=\"display:none\">\r\n\t\t\t\t\t  \t\t<input id=\"USERTYPENAME\" name=\"USERTYPENAME\" type=\"text\" style=\"width:95px\" class=\"viewcol\" value=\"주차면수\">\r\n\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t  \t<td colspan=\"0\" bgcolor=\"F6F6F6\" class=\"table_bl_left\" id=\"jucha_value\" style=\"display:none\">\r\n\t\t       \t\t\t  \t<span id=\"UseType1\" style=\"display:none\">\r\n\t\t\t                \t<input id=\"PARKING_NUM\" name=\"PARKING_NUM\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template118 = "\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\"  maxlength=\"4\"> 면\r\n\t\t                  \t</span>\r\n\t\t       \t\t\t  \t<span id=\"UseType2\" style=\"display:none\">\r\n\t\t\t                  \t<input id=\"RIVER_NM\" name=\"RIVER_NM\" type=\"text\" class=\"essential\" style=\"width:100px\" value=\"";
  private final static String _jspx_template119 = "\" maxlength=\"6\">\r\n\t\t                  \t</span>\r\n\t\t                  \t<span id=\"UseType3\" style=\"display:none;\">\r\n\t\t\t\t\t\t\t\t<input id=\"RIVER_RANK\" name=\"RIVER_RANK\" type=\"text\" class=\"essential\" style=\"width:100px\" value=\"";
  private final static String _jspx_template120 = "\" maxlength=\"3\">\r\n\t\t\t\t\t\t\t</span>\r\n\t                  \t</td>\r\n\t                </tr>\r\n\t                <tr>\r\n\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" colspan=\"1\">공시지가<br>적용지번</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  <select id=\"WITH_GU_CD\" name=\"WITH_GU_CD\" class=\"input_form1\" style=\"width:80px\" onchange=\"changeWithGuCd(this);\">\r\n\t\t\t\t\t      \t";
  private final static String _jspx_template121 = "\r\n\t\t\t\t\t      </select>\r\n\t\t\t\t\t\t  <select id=\"WITH_BJ_CD\" name=\"WITH_BJ_CD\" class=\"input_form1\" style=\"width:80px\">\r\n\t\t\t\t\t      \t";
  private final static String _jspx_template122 = "\r\n\t\t\t\t\t      </select>\r\n\t\t\t\t          <select id=\"WITH_SPC_CD\" name=\"WITH_SPC_CD\" class=\"input_form1\" style=\"width:75px\">\r\n\t\t\t\t          \t";
  private final static String _jspx_template123 = "\r\n\t\t\t\t          </select>\r\n\t\t\t\t          <p style=\"font-size: 8px\"></p>\r\n\t\t\t\t          <input id=\"WITH_BONBUN\" name=\"WITH_BONBUN\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t  - <input id=\"WITH_BUBUN\" name=\"WITH_BUBUN\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t  번지\r\n\t\t\t\t\t\t  <img src=\"/img/add_icon.gif\" alt=\"추가\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:addWithAddrList();\" style=\"CURSOR: Hand;vertical-align: middle;\">\r\n\t\t\t\t\t\t  <img src=\"/img/loca_icon.gif\" alt=\"위치확인\" id=\"LocReg\" width=\"64\" height=\"18\" border=\"0\" onClick=\"javascript:goViewJibunMap('price');\" style=\"vertical-align: middle;CURSOR:pointer;\">\r\n\t\t\t\t\t  </td>\t\t\t\t\t\t  \r\n\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" colspan=\"1\">공시지가<br>적용지번<br>목록</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  <div style=\"height: 60px;overflow-y:scroll;\">\r\n\t\t\t\t\t\t  <table width=\"90%\">\r\n\t\t\t\t\t\t  <tbody id=\"WITH_ADDR_LIST\" >\r\n\t\t\t\t\t\t  </tbody>\r\n\t\t\t\t\t\t  </table>\r\n\t\t\t\t\t\t  </div>\r\n\t\t\t\t\t  </td>\t\t\t\t\t\t  \r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t  \t<td colspan=\"3\" bgcolor=\"eaeaea\" ><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"26\" src=\"/jsp/common/purposeCode/purposeCode.jsp?SectionCode=";
  private final static String _jspx_template124 = "&PURPOSE_CD=";
  private final static String _jspx_template125 = "&essential=1\"></iframe>\r\n\t\t\t\t\t  \t</table></td>\r\n\t\t\t\t    </tr>\t\t\t    \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t\t\t<td id=\"MUL\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t  \t\t<div id=\"MUL_DIV\">\r\n\t\t\t\t\t  \t\t\t<table id=\"MUL_TABLE\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr id=\"MulDateSection\">\r\n\t\t\t\t\t\t\t\t\t\t<td id=\"UseSection\" style=\"display:block\">\r\n\t\t\t\t\t\t\t\t\t\t  \t<input id=\"MUL_FROMDATE\" name=\"MUL_FROMDATE\" type=\"text\" class=\"essential\" style=\"width:70px\" value=\"";
  private final static String _jspx_template126 = "\" readonly><img onclick=\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')\" src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" style=\"vertical-align:middle;CURSOR: pointer ;\">\r\n\t\t\t\t\t\t\t\t\t\t  \t ~ <input id=\"MUL_TODATE\" name=\"MUL_TODATE\" type=\"text\" class=\"essential\" style=\"width:70px\" value=\"";
  private final static String _jspx_template127 = "\"  readonly><img onclick=\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')\" src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" style=\"vertical-align:middle;CURSOR: pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t  \t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t\t  \t<td height=\"26\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"AREA_SIZE\" name=\"AREA_SIZE\" type=\"text\" class=\"essential\" style=\"width:50px\" value=\"";
  private final static String _jspx_template128 = "\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" onKeyPress=\"nr_num_float(this);\" maxlength=\"17\"> ㎡ / 개\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"PERCENT_RATE\" name=\"PERCENT_RATE\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:right\" value=\"";
  private final static String _jspx_template129 = "\" onKeyDown=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" onKeyPress=\"nr_num_float(this);\" maxlength=\"6\">%\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  \t\t<input id=\"PERCENT_REASON\" name=\"PERCENT_REASON\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template130 = "\" maxlength=\"200\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"REDUCTION_RATE\" name=\"REDUCTION_RATE\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:right\" value=\"";
  private final static String _jspx_template131 = "\" onKeyDown=\"nr_num_float(this);\" onKeyUp=\"nr_num_float(this);\" onKeyPress=\"nr_num_float(this);\" maxlength=\"6\">%\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  \t\t<input id=\"REDUCTION_REASON\" name=\"REDUCTION_REASON\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template132 = "\" maxlength=\"200\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<textarea id=\"PLACE_REFERENCE\" name=\"PLACE_REFERENCE\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template133 = "\" maxlength=\"500\"></textarea>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t    </tr>\r\n\t\t\t\t\t\r\n\t\t\t\t    <tr>\r\n\t\t\t\t\t  \t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t \t\t<td><span class=\"sub_stan_blue\">* 공사(굴착) 정보</span></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t  \t</table></td>\r\n\t\t\t\t    </tr>\r\n\t\t\t\t    \r\n\t\t\t\t    <tr>\r\n\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사기간 </td>\r\n\t\t\t\t\t  \t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  \t<td><input id=\"WORK_FROMDATE\" name=\"WORK_FROMDATE\" value=\"";
  private final static String _jspx_template134 = "\" type=\"text\" class=\"input_form1\" style=\"width:65px\" readonly></td>\r\n\t\t\t\t\t\t  \t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('WORK_FROMDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t  \t<td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t\t\t  \t<td><input id=\"WORK_TODATE\" name=\"WORK_TODATE\" value=\"";
  private final static String _jspx_template135 = "\" type=\"text\" class=\"input_form1\" style=\"width:65px\" readonly></td>\r\n\t\t\t\t\t\t  \t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('WORK_TODATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t  \t</table></td>\r\n\t\t\t\t    </tr>\r\n\t\t\t\t    \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사내용</td>\r\n\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<input id=\"EXE_INFO\" name=\"EXE_INFO\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template136 = "\"  maxlength=\"100\">\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t    </tr>\r\n                </table></td>\r\n\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t</div>\r\n\t\t\t\r\n\t\t</div>\r\n\t\t\r\n\t\t</td>\r\n\t\t</tr>\r\n \t\r\n\t</table></td>\r\n\t</tr>\r\n\r\n</table>\r\n</form>\r\n\r\n</body>\r\n</html>\r\n<script>\r\n\tparent.getSearchData(document.form.NAME_MIN.value, document.form.min_ssn1.value, document.form.min_ssn2.value);\r\n</script>\r\n";
}
