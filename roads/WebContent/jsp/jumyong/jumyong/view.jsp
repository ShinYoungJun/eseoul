<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
<style type="text/css">

<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/Check_inputbox.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>

<script type="text/javascript">
//<![CDATA[

	function	Search()
	{
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}

	function iFrameResize(obj)
	{
		var iFrm = obj;
		var the_height = iFrm.contentWindow.document.body.scrollHeight;
		iFrm.style.height = the_height + "px";
	}

	function 	TabUp_Img(Tab_Value)
	{
		var	img1	= document.getElementById("minwon_img");
		var	img2	= document.getElementById("jumin_img");
		var	img3	= document.getElementById("jumji_img");
	
		img1.src	= "/img/sub_petition_title9_off.gif";
		img2.src	= "/img/sub_petition_title2_off.gif";
		img3.src	= "/img/sub_petition_title3_off.gif";
		
		if(Tab_Value	== "minwon")
		{
			img1.src		= "/img/sub_petition_title9_on.gif";
		}
		else if(Tab_Value	== "jumin")
		{
			img2.src		= "/img/sub_petition_title2_on.gif";
		}
		else if(Tab_Value	== "jumji")
		{
			img3.src		= "/img/sub_petition_title3_on.gif";
		}		

		var tab	= document.getElementById("CURRENT_TABUP");
		tab.value	= Tab_Value;
	}
	
	function 	Tab_Img(Tab_Value)
	{
		var	img1	= document.getElementById("minwon_img");
		var	img2	= document.getElementById("jumin_img");
		var	img3	= document.getElementById("jumji_img");
	
		img1.src	= "/img/sub_petition_title9_off.gif";
		img2.src	= "/img/sub_petition_title2_off_b.gif";
		img3.src	= "/img/sub_petition_title3_off.gif";
		
		if(Tab_Value	== "minwon")
		{
			img1.src		= "/img/sub_petition_title9_on.gif";
		}
		else if(Tab_Value	== "jumin")
		{
			img2.src		= "/img/sub_petition_title2_on_b.gif";
		}
		else if(Tab_Value	== "jumji")
		{
			img3.src		= "/img/sub_petition_title3_on.gif";
		}		

		var tab	= document.getElementById("CURRENT_TABUP");
		tab.value	= Tab_Value;
	}
	
	function 	TabDown_Img(Tab_Value)
	{
		var	img1	= document.getElementById("product_img");
//		var	img2	= document.getElementById("inspect_img");
//		var	img3	= document.getElementById("conf_img");
		var	img2	= document.getElementById("place_img");		
		var	img3	= document.getElementById("history_img");				
		


		img1.src	= "/img/sub_petition_title4_off.gif";
//		img2.src	= "/img/sub_petition_title5_off.gif";
//		img3.src	= "/img/sub_petition_title6_off.gif";		
		img2.src	= "/img/sub_petition_title7_off.gif";				
		img3.src	= "/img/sub_petition_title8_off.gif";						
		
		
		
		
		if(Tab_Value	== "product")
		{
			img1.src		= "/img/sub_petition_title4_on.gif";
		}
/*		else if(Tab_Value	== "inspect")
		{
			img2.src		= "/img/sub_petition_title5_on.gif";
		}else if(Tab_Value	== "conf")
		{
			img3.src		= "/img/sub_petition_title6_on.gif";
		}
*/		else if(Tab_Value	== "place")
		{
			img2.src		= "/img/sub_petition_title7_on.gif";
		}else if(Tab_Value	== "history")
		{
			img3.src		= "/img/sub_petition_title8_on.gif";
		}
		

		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;

	}

	
	function Tab_Minwon(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		var section = document.getElementById("SECTION").value;
		if(tab.value	== "minwon")
			return;
		else
			tab.value	= "minwon";

		var tabs 	= document.getElementById("tabUp");
		TabUp_Img("minwon");
//		tabs.src	= "/jumyong/jumyong/minwon.do?ADMIN_NO=" + adminno;
		tabs.src	= "/jumyong/jumyonginfo/minwon_view.do?ADMIN_NO=" + adminno + "&SECTION="+section;
		//
		
		
	}

	function Tab_Jumin(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		var section = document.getElementById("SECTION").value;
		if(tab.value	== "jumin")
			return;
		else
			tab.value	= "jumin";
		
		var tabs 	= document.getElementById("tabUp");
		//tabs.src	= "/jumyong/jumyong/jumin.do?ADMIN_NO=" + adminno;
		tabs.src	= "/jumyong/jumyonginfo/jumin_view.do?ADMIN_NO=" + adminno + "&SECTION="+section;
	}

	function Tab_Jumji(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		var section = document.getElementById("SECTION").value;
		if(tab.value	== "jumji")
			return;
		else
			tab.value	= "jumji";

		var tabs	= document.getElementById("tabUp");
//		tabs.src	= "/jumyong/jumyong/jumji.do?ADMIN_NO=" + adminno;
		tabs.src	= "/jumyong/jumyonginfo/jumji_view.do?ADMIN_NO=" + adminno + "&SECTION="+section;
	}

	function Tab_Product(adminno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		var section = document.getElementById("SECTION").value;
		if(tab.value	== "product")
			return;
		else
			tab.value	= "product";

	//	var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq	= document.getElementById("SEQ").value;

		TabDown_Img("product");		
		var tabs	= document.getElementById("tabDown");
//		tabs.src	= "/jumyong/saewe/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;
		tabs.src	= "/jumyong/productInsert.do?no=" + adminno + "&SEQ=" + seq + "&SECTION="+section;
		
	}
	
	function Tab_Inspect(adminno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "inspect")
			return;
		else
			tab.value	= "inspect";
		
		TabDown_Img("inspect");
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/inspectEdit.do?no=" + adminno;
	}
	
	function Tab_Conf(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		
		if(tab.value	== "conf")
			return;
		else if(tab.value == null)
			tab.value	= "conf";
		
		TabDown_Img("conf");
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/confEdit.do?no=" + adminno;

	}

	function Tab_Place(adminno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		var section = document.getElementById("SECTION").value;
		if(tab.value	== "place")
			return;
		else
			tab.value	= "place";
		
		TabDown_Img("place");
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jsp/jumyong/jumyong/info_place.jsp?no=" + adminno + "&SECTION="+section;
	}
	
	function Tab_History(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		var section = document.getElementById("SECTION").value;
		if(tab.value	== "history")
			return;
		else
			tab.value	= "history";
		
		TabDown_Img("history");		
		var tabs	= document.getElementById("tabDown");
		
		tabs.src = "/jumyong/jumyong/history_view.do?ADMIN_NO=" + adminno + "&SECTION="+section;
	}

	function Tab_Sunap(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "sunap")
			return;
		else
			tab.value	= "sunap";
		
		var tabs	= document.getElementById("tabDown");
		
//		tabs.src	= "/jumyong/saewe/sunap_view.do?ADMIN_NO=" + adminno;
	}

	function 	Init()
	{	
	//	var tab		= document.getElementById("CURRENT_TAB");
	//	tab.value	= "back";
		

		/*var iFrm = document.getElementById("tabUp1");
		var the_height = 0;
		iFrm.style.height = the_height;*/


	

	}

	function	BugwaCatch(year, seq)
	{
		document.getElementById("YEAR").value 		= year;
	
	//	alert(document.getElementById("TAX_NO").value);
	}

	function	BugwaView(seq)	//	�������� Ŭ���� �ΰ����� ������ ���� (Minwon_view.jsp ȣ��)
	{

		var	adminno		= document.getElementById("ADMIN_NO").value;
		
		document.getElementById("SEQ").value 	= seq;
		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	!= "bugwa")
			return;
		 
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/saewe/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;
		tabs.src	= "/jumyong/junggi/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;		
	}
	
	function	SaeweSuipBugwa()
	{
		var	child	= tabDown.document.getElementById("VIEWPAGE");

		if(!child)	//	��ȭ���� �ƴ� ���..
		{
			alert("���� ȭ���� ������ �ּ���.");
			return;
		}
		
		//	alert(child.value);
		
		var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq		= document.getElementById("SEQ").value;
		var	param	= "ADMIN_NO=" + adminno + "&SEQ=" + seq;

		sendRequest("/jumyong/saewe/saewesuipbugwa.do", param, "GET", Result_SaeweSuipBugwa);
	}

	function	Result_SaeweSuipBugwa(obj)
	{
		if(obj == "0")			
			alert("�����Ͱ� �����ϴ�.");
		else if(obj == "1")			
			alert("�ΰ� �Ǿ����ϴ�.");
		else if(obj == "2")			
			alert("�ΰ��� �����Դϴ�.");
	}
	
	function goSearch()
	{
		var toDate = document.getElementById("searchToDate").value;
		var fromDate = document.getElementById("searchFromDate").value;
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SEARCH_SECTION").value;
		var purpose = document.getElementById("PURPOSE_CD").value;		
		var tax_set = document.getElementById("TAX_SET").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var hj_cd = document.getElementById("HJ_CD").value;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var check_type = document.getElementById("check_type").value;
		var numberValue = document.getElementById("numberValue").value;				

		location.href="/jumyong/jumyong/search.do?tDate="+toDate+"&fDate="+fromDate+"&type="+type+"&section="+section
		+"&tax_set="+tax_set+"&purpose="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd
		+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="+jumyongName+"&check_yn="+check_type+"&numberValue="+numberValue+"&currentPage=${currentPage}";
	}
	
	function fnPreView()
	{	
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// �ɼ� - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000");
		
		if('${POP_SECTION}' == '2'){	//���뱸�� : �Ͻ�
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "examination3_ilsi");
		}
		else							//���뱸�� : ����, ����
		{
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "examination3");
		}

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// �ɼ� - �Ķ���� ����
		var form 	= document.form;
		
		oRptMainParam.put("ADMIN_NO" ,form.ADMIN_NO.value);
		oRptMainParam.put("SEQ" ,form.SEQ.value);
	
		// preview �˾� ����
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;			
	}

	function fnPreView_pay()
	{
		var section = document.getElementById("SECTION").value;
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// �ɼ� - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000");
		
		// �ʼ� - ����Ʈ��
		oRptMainParam.put("rex_rptname", "examination_pay");

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// �ɼ� - �Ķ���� ����
		var form 	= document.form;
		var mudanForm  = tabDown.productForm.mudanForm.value;
		var mudanPrice = tabDown.productForm.mudanPrice.value;
		var mudanTotalSum = tabDown.productForm.mudanTotalSum.value;
			mudanForm = mudanForm.split('-').join("\n -");
			//mudanPrice = mudanPrice.split('-').join("\n");
			//mudanPrice = mudanPrice.split(',');
			mudanPrice = document.getElementById('GONGSI_PRICE').value;

		oRptMainParam.put("ADMIN_NO" ,form.ADMIN_NO.value);
		oRptMainParam.put("SEQ" ,form.SEQ.value);
		oRptMainParam.put("CAL_INFO" ,mudanForm);
		oRptMainParam.put("PRICE" ,mudanPrice);
		oRptMainParam.put("TOTAL_SUM" ,mudanTotalSum);
	
		// preview �˾� ����
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;			
	}
	
	function fnOccupancyLicense()
	{

		var oRptMainParam;
	  	var winW = screen.availWidth-10;	
  		var winH = screen.availHeight-50;
  		
		oRptMainParam = rex_GetgoDictionay(); 

		// �ɼ� - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width="+winW+",height="+winH);

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// �ɼ� - �Ķ���� ����
		var form 	= document.form;

		oRptMainParam.put("ADMIN_NO" ,form.ADMIN_NO.value);
		oRptMainParam.put("YEAR" ,form.year.value);
		oRptMainParam.put("SEQ" ,form.SEQ.value);
		oRptMainParam.put("USER_ID" ,form.USER_ID.value);

		
		if('${POP_SECTION}' == '2'){	//���뱸�� : �Ͻ�
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "examination3_ilsi");
		}
		
		if('${useType}' == '��õ' && '${purpose_cd}'.substr(0,2) != '02')
		{	//�������� : ��õ
		// �ʼ� - ����Ʈ��			
			alert("���� �㰡���� ���ȭ�鿡�� �Է��� �ּ���.");
			
			oRptMainParam.put("rex_rptname", "river_license");

			// �ɼ� - �Ķ���� ����
			oRptMainParam.put("PARAM" ,"�㰡�Ⱓ�� �Է��� �ּ���");
			oRptMainParam.put("rex_init_end", "javaInitEndFunction") // javaInitEndFunction ������ (���ڴ� oRexCtl)
		}
		else if('${use_type}' != '1' && '${purpose_cd}'.substr(0,2) == '02')
		{	//�������� : ��õ,����,�������
			// �ʼ� - ����Ʈ��
			alert("������� ���� / �ǽð�ȹ�ΰ� / �㰡������ ���ȭ�鿡�� �Է��� �ּ���.");
			
			oRptMainParam.put("rex_rptname", "river_public_license");

			// �ɼ� - �Ķ���� ����
			oRptMainParam.put("PARAM1" ,"��������� ������ �Է��� �ּ���");
			oRptMainParam.put("PARAM2" ,"�ǽð�ȹ�ΰ� / �Ű��� ���θ� �Է��� �ּ���");
			oRptMainParam.put("PARAM3" ,"�㰡������ �Է��� �ּ���");
		}
		else							//���뱸�� : ����, ����
		{
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "license");
		}

		// preview �˾� ����
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;	
	}

	function fnOccupancyLicense2()
	{

		var oRptMainParam;
	  	var winW = screen.availWidth-10;	
  		var winH = screen.availHeight-50;
  		
		oRptMainParam = rex_GetgoDictionay(); 

		// �ɼ� - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width="+winW+",height="+winH);

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// �ɼ� - �Ķ���� ����
		var form 	= document.form;

		oRptMainParam.put("ADMIN_NO" ,form.ADMIN_NO.value);
		oRptMainParam.put("YEAR" ,form.year.value);
		oRptMainParam.put("SEQ" ,form.SEQ.value);
		oRptMainParam.put("USER_ID" ,form.USER_ID.value);

		
		if('${POP_SECTION}' == '2'){	//���뱸�� : �Ͻ�
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "examination3_ilsi");
		}
		
		if('${useType}' == '��õ' && '${purpose_cd}'.substr(0,2) != '02')
		{	//�������� : ��õ
		// �ʼ� - ����Ʈ��			
			alert("���� �㰡���� ���ȭ�鿡�� �Է��� �ּ���.");
			
			oRptMainParam.put("rex_rptname", "river_license");

			// �ɼ� - �Ķ���� ����
			oRptMainParam.put("PARAM" ,"�㰡�Ⱓ�� �Է��� �ּ���");
			oRptMainParam.put("rex_init_end", "javaInitEndFunction") // javaInitEndFunction ������ (���ڴ� oRexCtl)
		}
		else if('${use_type}' != '1' && '${purpose_cd}'.substr(0,2) == '02')
		{	//�������� : ��õ,����,�������
			// �ʼ� - ����Ʈ��
			alert("������� ���� / �ǽð�ȹ�ΰ� / �㰡������ ���ȭ�鿡�� �Է��� �ּ���.");
			
			oRptMainParam.put("rex_rptname", "river_public_license");

			// �ɼ� - �Ķ���� ����
			oRptMainParam.put("PARAM1" ,"��������� ������ �Է��� �ּ���");
			oRptMainParam.put("PARAM2" ,"�ǽð�ȹ�ΰ� / �Ű��� ���θ� �Է��� �ּ���");
			oRptMainParam.put("PARAM3" ,"�㰡������ �Է��� �ּ���");
		}
		else							//���뱸�� : ����, ����
		{
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "license_doro_151008");
		}

		// preview �˾� ����
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;	
	}
	
	var i = 0;
	
	function resizeTabup(value)
	{
		if(i%2 == 0)
		iFrameResize(document.getElementById(value));	
		else
		{		
			var iFrm = document.getElementById("tabUp1");
			var the_height = 0;
			iFrm.style.height = the_height;
		}	
		i=i+1;
	}

	// rex_init_end ���ǽ� ����Ǵ� ���ν���
	function javaInitEndFunction(oRexCtl) {
		oRexCtl.Zoom("100");
	}
	
	
//]]>
</script>

<body onload="Init();">
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type=hidden id="SEQ" name="SEQ"  value="${SEQ}">
<input type=hidden id="USER_ID" name="USER_ID"  value="${userId}">

<input type="hidden" id="CURRENT_TABUP" name="CURRENT_TABUP" value="minwon">
<input type="hidden" id="CURRENT_TABDOWN" name="CURRENT_TABDOWN" value="product">
<input type="hidden" id="year" name="year" value="">
<input type="hidden" id = "searchToDate" name="searchToDate" value="${toDate}">
<input type="hidden" id = "searchFromDate" name="searchFromDate" value="${fromDate}">
<input type="hidden" id = "TYPE" name="TYPE"  value="${use_type}">
<input type="hidden" id = "SECTION" name="SECTION" value="${use_section}">
<input type="hidden" id = "SEARCH_SECTION" name="SEARCH_SECTION" value="${section}">
<input type="hidden" id = "PURPOSE_CD" name="PURPOSE_CD" value="${purpose_cd}">
<input type="hidden" id = "TAX_SET" name="TAX_SET" value="${taxation_section}">
<input type="hidden" id = "BJ_CD" name="BJ_CD" value="${bjdong_code}">
<input type="hidden" id = "HJ_CD" name="HJ_CD" value="${hjdong_code}">
<input type="hidden" id = "BONBUN" name="BONBUN" value="${bonbun}">
<input type="hidden" id = "BUBUN" name="BUBUN" value="${bubun}">
<input type="hidden" id = "jumyongName" name="jumyongName" value="${jumyongName}">
<input type="hidden" id = "check_type" name="check_type" value="${check_yn}">
<input type="hidden" id = "numberValue" name="numberValue" value="${numberValue}">

<input type="hidden" id="GONGSI_PRICE" name="GONGSI_PRICE" value="">
  <tr>
    <td height="43"><img src="/img/sub1_cont2_title.gif" width="800" height="43"></td>
  </tr>
  
  <tr>
    <td align="center">
    <table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="40" align="right">
	<!--��� ��ȹ����,���� �޴�-->
		<!--<table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="8" colspan="2"></td>
            </tr>
          <tr>
            <td><a href="#"><img src="/img/report_icon.gif" alt="��ȹ� ���" width="92" height="18" border="0"></a></td>
            <td><a href="#"><img src="/img/help_icon.gif" alt="����" width="65" height="18" border="0"></a></td>
            </tr>
        </table>-->
	<!--��� ��ȹ����,���� �޴�-->		
		</td>
      </tr>
      
     <!-- <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>  
 
      <tr>
        <td height="14"></td>
      </tr>-->
           
      <td align="right" class="sub_table_b">������ȣ : ${view_admin_no}</td>
      
      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_Minwon('${ADMIN_NO}')"><img id="minwon_img" name="minwon_img" src="/img/sub_petition_title9_on.gif" alt="�ο� ����" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_Jumin('${ADMIN_NO}')"><img id="jumin_img" name="jumin_img" src="/img/sub_petition_title2_off_b.gif" alt="������ ����" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_Jumji('${ADMIN_NO}')"><img id="jumji_img" name="jumji_img" src="/img/sub_petition_title3_off.gif" alt="������ ����" width="110" height="22" border="0"></a></td>
                </tr>
            </table>
            </td>
		</tr>
	  <tr>
		<td>
		  	<iframe width="100%" height="100%" id="tabUp" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/jumyonginfo/minwon_view.do?ADMIN_NO=${ADMIN_NO}&SECTION=${use_section}"></iframe>
		</td>
	  </tr>
      <tr>
        <td height="30"></td>
      </tr>
      <tr>
		<td>
			<!--
		  	<font class="sub_table">���ó��</font>
		  	-->
		  	<img id="conduct_img" name="conduct_img" src="/img/closing_conduct.gif" alt="���ó��"  border="0">
		</td>
	  </tr>
      <tr>
		<td>
		  	<iframe width="100%" height="100%" id="tabUp1" name="tabUp1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/disUse.do?ADMIN_NO=${ADMIN_NO}&SECTION=${use_section}"></iframe>
		</td>
	  </tr>
	  
	   <tr>
        <td height="30"></td>
      </tr>

      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="javascript:Tab_Product('${ADMIN_NO}')"><img id="product_img" name="product_img" src="/img/sub_petition_title4_on.gif" alt="���⳻��" width="110" height="22" border="0" style="cursor:pointer" ></td>
		          <td width="111" onclick ="javascript:Tab_Place('${ADMIN_NO}')"><img id="place_img"  name="place_img" src="/img/sub_petition_title7_off.gif" alt="÷���ڷ�" width="110" height="22" border="0" style="cursor:pointer" ></td>
		          <td width="111" onclick ="javascript:Tab_History('${ADMIN_NO}')"><img id="history_img" name="history_img" src="/img/sub_petition_title8_off.gif" alt="�̷�����" width="110" height="22" border="0" style="cursor:pointer" ></td>
                </tr>
            </table></td>
          </tr>		  
          <tr>
  			<td>
  				<iframe width="100%" height="150" id = "tabDown" name="tabDown" frameborder="0" onload="iFrameResize(this);" scrolling="no" src="/jumyong/productInsert.do?no=${ADMIN_NO}"></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=${ADMIN_NO} -->
  			</td>
          </tr>
        </table>
        </td>
      </tr>		
		
		</table>
		</td>
	</tr>
	<tr>
      <td height="40" align="right">
      	<c:if test="${use_section != '4'}">
		    <c:if test="${showMudanExamination == 'true'}"> 								                	
					<span  class="myButton" onclick="javascript:fnPreView_pay();">����� �������缭</span>
				</c:if>
	     	<c:if test="${showExamination == 'true'}">				                	
					<span class="myButton" onclick="javascript:fnPreView();">�������缭</span>
				</c:if>				
					<span class="myButton" onclick="javascript:fnOccupancyLicense();">�����㰡��</span>
					<span class="myButton" onclick="javascript:fnOccupancyLicense2();">�����㰡��(���ι�)</span>
				</c:if>
	      <span class="myButton" onclick="javascript:goSearch();">����Ʈ</span>
      </td>
	</tr>
	<tr>
      <td height="20" ></td>
	</tr>
	
	</table>
  </td>
 </tr>
	
</table>
</body>
</html> 