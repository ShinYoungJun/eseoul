<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
    
<%@ include file="/jsp/common/include.jsp" %>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


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

		iFrm.style.height = the_height;
	}

	function 	TabUp_Img(Tab_Value)
	{
		var	img1	= document.getElementById("jumin_img");
		var	img2	= document.getElementById("jumji_img");
	
		img1.src	= "/img/sub_petition_title2_off.gif";
		img2.src	= "/img/sub_petition_title3_off.gif";

		if(Tab_Value	== "jumin")
		{
			img1.src		= "/img/sub_petition_title2_on_b.gif";
		}
		else if(Tab_Value	== "jumji")
		{
			img2.src		= "/img/sub_petition_title3_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABUP");
		tab.value	= Tab_Value;
	}
	
	function 	TabDown_Img(Tab_Value)
	{
		var	img1	= document.getElementById("bugwa_img");
//		var	img2	= document.getElementById("sunap_img");

		img1.src	= "/img/sub_periodi_title5_off.gif";
//		img2.src	= "/img/sub_petition_title8_off.gif";
		
		if(Tab_Value	== "gigan")
		{
			img1.src		= "/img/sub_periodi_title5_on.gif";
		}
		else if(Tab_Value	== "sunap")
		{
			img2.src		= "/img/sub_petition_title8_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;
	}


	function Tab_Jumin(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumin")
			return;
		else
			tab.value	= "jumin";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/jumyong/gigan/jumin_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Jumji(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumji")
			return;
		else
			tab.value	= "jumji";

		var tabs	= document.getElementById("tabUp");
		tabs.src	= "/jumyong/gigan/jumji_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Gigan(adminno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "gigan")
			return;
		else
			tab.value	= "gigan";

	//	var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq	= document.getElementById("SEQ").value;
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/gigan/gigan_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;
	}

	function Tab_Sunap(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "sunap")
			return;
		else
			tab.value	= "sunap";
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/gigan/sunap_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Ireok(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "ireok")
			return;
		else
			tab.value	= "ireok";
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/gigan/sunap_view.do?ADMIN_NO=" + adminno;
	}

	function 	Init()
	{
	//	var tab		= document.getElementById("CURRENT_TAB");
	//	tab.value	= "back";
		
	}

	function	BugwaCatch(year, seq)
	{
		document.getElementById("YEAR").value 		= year;
	
	//	alert(document.getElementById("TAX_NO").value);
	}

	function	BugwaView(seq)	//	�������� Ŭ���� �ΰ����� ������ ���� (Sanchul_view.jsp ȣ��)
	{
		var	adminno		= document.getElementById("ADMIN_NO").value;
		
		document.getElementById("SEQ").value 	= seq;
		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	!= "bugwa")
			return;
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/gigan/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;
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

		sendRequest("/jumyong/gigan/saewesuipbugwa.do", param, "GET", Result_SaeweSuipBugwa);
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
	function	nr_Adminno_Cut(adminno){
		if(adminno.length != 20)
			return	adminno
	
		adminno	= adminno.substr(9, 11);
		
		return	adminno;
	}
	
	function fnOccupancyLicense()
	{

		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// �ɼ� - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000");
		
		if('${POP_SECTION}' == '2'){	//���뱸�� : �Ͻ�
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "license_ilsi");
		}
		else							//���뱸�� : ����, ����
		{
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "license_gigan1");
		}

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// �ɼ� - �Ķ���� ����
		var form 	= document.form;
		
		oRptMainParam.put("ADMIN_NO" ,form.ADMIN_NO.value);
		oRptMainParam.put("USER_ID" ,form.userId.value);
	
		// preview �˾� ����
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;	
	}

	function fnOccupancyLicense2()
	{

		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// �ɼ� - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000");
		
		if('${POP_SECTION}' == '2'){	//���뱸�� : �Ͻ�
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "license_ilsi_doro_151008");
		}
		else							//���뱸�� : ����, ����
		{
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "license_gigan1_doro_151008");
		}

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// �ɼ� - �Ķ���� ����
		var form 	= document.form;
		
		oRptMainParam.put("ADMIN_NO" ,form.ADMIN_NO.value);
		oRptMainParam.put("USER_ID" ,form.userId.value);
	
		// preview �˾� ����
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;	
	}
//]]>
</script>

<body onload="Init();">
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}">

<input type="hidden" id="CURRENT_TABUP" name="CURRENT_TABUP" value="jumin">
<input type="hidden" id="CURRENT_TABDOWN" name="CURRENT_TABDOWN" value="gigan">

<input type="hidden" id="GIGAN1" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" id="GIGAN2" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" id="BONBUN" name="BONBUN" value="${BONBUN}">
<input type="hidden" id="BUBUN" name="BUBUN" value="${BUBUN}">
<input type="hidden" id="NAME" name="NAME" value="${NAME}">
<input type="hidden" id="ADMINNO" name="ADMINNO" value="${ADMINNO}">
<input type="hidden" id="TYPE" name="TYPE" value="${TYPE}">

<input type="hidden" id="OWNER_SET" name="OWNER_SET" value="${OWNER_SET}">
<input type="hidden" id="TAX_SET" name="TAX_SET" value="${TAX_SET}">
<input type="hidden" id="BJ_CD" name="BJ_CD" value="${BJ_CD}">
<input type="hidden" id="HJ_CD" name="HJ_CD" value="${HJ_CD}">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
<input type="hidden" id="userId" name="userId" value="${userId}">

  <tr>
    <td height="43"><img src="/img/jumyong_gigan_title.gif" width="800" height="43"></td>
  </tr>
  
  <tr>
    <td align="center">
    <table width="780" border="0" cellspacing="0" cellpadding="0">

      
      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
 
      <tr>
        <td height="14"></td>
      </tr>
           
      <td align="right" class="sub_table_b">������ȣ : <script>var adminno = nr_Adminno_Cut("${ADMIN_NO}"); document.write(adminno);</script></td>
      
      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_Jumin('${ADMIN_NO}')"><img id="jumin_img" name="jumin_img" src="/img/sub_petition_title2_on_b.gif" alt="������ ����" width="110" height="22" border="0"></a></td>
                  <td><a href="javascript:Tab_Jumji('${ADMIN_NO}')"><img id="jumji_img" name="jumji_img" src="/img/sub_petition_title3_off.gif" alt="������ ����" width="110" height="22" border="0"></a></td>
                </tr>
            </table>
            </td>
		</tr>
		
		<td>
		  	<iframe width="100%" height="100%" id="tabUp" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/gigan/jumin_view.do?ADMIN_NO=${ADMIN_NO}"></iframe>
		</td>

      <tr>
        <td height="30"></td>
      </tr>

      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_Gigan('${ADMIN_NO}')"><img id="bugwa_img" name="bugwa_img" src="/img/sub_periodi_title5_on.gif" alt="�Ⱓ ����" width="110" height="22" border="0"></a></td>
                  <!-- td width="111"><a href="#"><img name="sunap_img" src="/img/sub_petition_title8_off.gif" alt="�̷� ����" width="110" height="22" border="0"></a></td -->
                </tr>
            </table></td>
          </tr>
		  
          <tr>
  			<TD>
  				<iframe width="100%" height="150" id="tabDown" name="tabDown" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/gigan/gigan_view.do?ADMIN_NO=${ADMIN_NO}"></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=${ADMIN_NO} -->
  			</TD>
          </tr>
          
        </table>
        </td>
      </tr>

		<tr>
			<td height="40" align="right">
	<!-- 		<a href="javascript:SaeweSuipBugwa()"><img src="/img/levy_icon.gif" alt="���ܼ��Ժΰ�" width="94" height="22" border="0"></a> -->
			<img src="/img/occu_icon.gif" alt="�����㰡��" width="84" height="22" onclick="javascript:fnOccupancyLicense();"  border="0" style="cursor:pointer">
			<img src="/img/occu_icon2.gif" alt="�����㰡��(���ι�)" width="84" height="22" onclick="javascript:fnOccupancyLicense2();"  border="0" style="cursor:pointer">
			<a href="javascript:Search()"><img src="/img/list_icon.gif" alt="����Ʈ" width="66" height="22" border="0"></a></td>
		</tr>
		
		</table>
		</td>
	</tr>
	
	</table>
  </td>
 </tr>
	
</table>

</body>
</html>