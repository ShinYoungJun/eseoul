<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
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


<script type="text/javascript">
//<![CDATA[


	// ��������, ��ǰ  ��ü����
	function	RegisterPrc()
	{
		var form = document.form;
		
		var	result	= tab1.RegisterPrc_tab1();		
		//var	result	= tab1.DataCheck();
		
		// �ʼ� �׸��� ��� ������ ..
		if(result	==	false ){
			return;
		}		
		
		form.rem_date.value = tab1.document.form.rem_date.value;
		form.rem_date_hh.value = tab1.document.form.rem_date_hh.value;
		form.rem_date_mm.value = tab1.document.form.rem_date_mm.value;
		form.rem_mulcd.value = tab1.document.form.rem_mulcd.value;
		form.rem_mulnm.value = tab1.document.form.rem_mulnm.value;
		form.rem_bjcd.value = tab1.document.form.rem_bjcd.value;
		//form.rem_hjcd.value = tab1.document.form.rem_hjcd.value;
		form.rem_addr.value = tab1.document.form.rem_addr.value;
		form.rem_nm.value = tab1.document.form.rem_nm.value;
		form.rem_area.value = tab1.document.form.rem_area.value;
		form.rem_svfrom.value = tab1.document.form.rem_svfrom.value;
		form.rem_svto.value = tab1.document.form.rem_svto.value;
		form.rem_svplace.value = tab1.document.form.rem_svplace.value;
		form.rem_badfrom.value = tab1.document.form.rem_badfrom.value;
		form.rem_badto.value = tab1.document.form.rem_badto.value;
		form.rem_bigo.value = tab1.document.form.rem_bigo.value;
		form.chg_org.value = tab1.document.form.chg_org.value;
		form.ann_date.value = tab1.document.form.ann_date.value;
		form.chg_nm.value = tab1.document.form.chg_nm.value;
		form.ann_no.value = tab1.document.form.ann_no.value;
		form.goods_nm.value = tab1.document.form.goods_nm.value;
		form.goods_cnt.value = tab1.document.form.goods_cnt.value;
		form.goods_cqyn.value = tab1.document.form.goods_cqyn.value;
		form.goods_svfrom.value = tab1.document.form.goods_svfrom.value;
		form.goods_svto.value = tab1.document.form.goods_svto.value;
		form.goods_svnm.value = tab1.document.form.goods_svnm.value;
		form.goods_status.value = tab1.document.form.goods_status.value;
		form.goods_date.value = tab1.document.form.goods_date.value;
		form.goods_bigo.value = tab1.document.form.goods_bigo.value;
		
		
		if( confirm("����  �Ͻðڽ��ϱ�? ") ){
			//top.frames[1].location="/jsp/menu/left/gapan.jsp?MENU_PARAM=sugeo";	//���� �޴� ��ũ
			//top.frames[2].location="sugeo_registerprc.do";		//������ ������ ��ũ
			//form.action = "/gapan/sugeo/search.do";					// ���Ź�ó�� �������� �̵��ؾ��� 
			form.action = "/gapan/sugeo/sugeo_registerprc.do";
			form.submit();
		}
		
	}
	
	
	function RegisterPrc_bugwa()
	{
		var result = tab1.RegisterPrc_bugwa();
	
		//	�ʼ� �׸��� ��� ������ ..
		if(result == false)
			return;

		var form = document.form;

		top.frames[1].location="/jsp/menu/left/gapan.jsp?MENU_PARAM=sugeo";	//���� �޴� ��ũ
		//top.frames[2].location="/jumyong/search.do";		//������ ������ ��ũ
		form.action = "/jsp/gapan/sugeo/search.jsp";					// ���Ź�ó�� �������� �̵�
		form.submit();
	
	
	}
	
	function	Search()
	{	
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}
	
	
	
//]]>
</script>

<body>
	
<form name="form" method="post">
<!-- ����Ʈ �˻��Ķ���� start -->
<input type="hidden" name="rem_date_from" value="${param.rem_date_from }">
<input type="hidden" name="rem_date_to" value="${param.rem_date_to }">
<input type="hidden" name="rem_mulcd_search" value="${param.rem_mulcd_search }">
<input type="hidden" name="rem_mulnm_search" value="${param.rem_mulnm_search }">
<input type="hidden" name="rem_bjcd_search" value="${param.rem_bjcd_search }">
<!-- input type="hidden" name="rem_hjcd_search" value="${param.rem_hjcd_search }"-->
<input type="hidden" name="rem_addr_search" value="${param.rem_addr_search }">
<input type="hidden" name="rem_nm_search" value="${param.rem_nm_search }">
<!-- ����Ʈ �˻��Ķ���� end -->


<!-- iframe �� submit �ϱ����� hidden�� -->
<input type="hidden" name="rem_date">
<input type="hidden" name="rem_date_hh">
<input type="hidden" name="rem_date_mm">
<input type="hidden" name="rem_mulcd">
<input type="hidden" name="rem_mulnm">
<input type="hidden" name="rem_bjcd"> 
<input type="hidden" name="rem_hjcd"> 
<input type="hidden" name="rem_addr"> 
<input type="hidden" name="rem_nm">
<input type="hidden" name="rem_area">
<input type="hidden" name="rem_svfrom"> 
<input type="hidden" name="rem_svto">
<input type="hidden" name="rem_svplace">
<input type="hidden" name="rem_badfrom">
<input type="hidden" name="rem_badto">
<input type="hidden" name="rem_bigo"> 
<input type="hidden" name="chg_org"> 
<input type="hidden" name="ann_date">
<input type="hidden" name="chg_nm">
<input type="hidden" name="ann_no">
<input type="hidden" name="goods_nm">
<input type="hidden" name="goods_cnt">
<input type="hidden" name="goods_cqyn"> 
<input type="hidden" name="goods_svfrom">
<input type="hidden" name="goods_svto">
<input type="hidden" name="goods_svnm">
<input type="hidden" name="goods_status">
<input type="hidden" name="goods_date">
<input type="hidden" name="goods_bigo">

</form>

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
    	<td height="43"><img src="/img/sugeo_title.gif" width="800" height="43"></td>
  	</tr>
  	<tr>
		<td align="center">
	    	<table width="780" border="0" cellspacing="0" cellpadding="0">
				<tr>
		        	<td height="40" align="right">
					<!--��� ��ȹ����,���� �޴�-->
						<!-- table border="0" cellspacing="0" cellpadding="0">
				          	<tr>
				            <td height="8" colspan="2"></td>
				          	</tr>
				          	<tr>
				            <td><a href="#"><img src="/img/report_icon.gif" alt="��ȹ� ���11" width="92" height="18" border="0"></a></td>
				            <td><a href="#"><img src="/img/help_icon.gif" alt="����" width="65" height="18" border="0"></a></td>
				          	</tr>
				        </table-->
					<!--��� ��ȹ����,���� �޴�-->		
					</td>
				</tr>
		       
				
				<tr>
					<td align="left">
			          	<tr>
			  				<td>
			  				<iframe width="100%" height="100%" name="tab1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/gapan/sugeo/sugeo_register.do"></iframe>
			  				</td>
			          	</tr>
					</td>
				</tr>
				<tr>
					<td height="40" align="right">
						<img src="/img/save_icon.gif" alt="��ü����" border="0" onClick="javascript:RegisterPrc();" style="CURSOR:hand">
						<img src="/img/list_icon.gif" alt="����Ʈ" border="0" onClick="Search()" style="CURSOR:hand">
					</td>
				</tr>
			      
				<tr>
					<td height="30"></td>
				</tr>
			 
				<tr>
			        <td align="left">
				        <tr>
			  				<td>
			  				<!-- ó�� ��Ͻ� �ΰ������� �Է� ���� -->
			  				<!--  
			  				<iframe width="100%" height="100%" name="tab2" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/gapan/sugeo/sugeo_bugwa_register.do"></iframe>
			  				 -->
			  				</td>
			          	</tr>
					</td>
				</tr>
			
				<!-- tr>
					<td height="40" align="right">
						<img src="/img/list_icon.gif" alt="����Ʈ" border="0" onClick="Search()" style="CURSOR:hand">
					</td>
				</tr -->
				
				<tr>
					<td height="30"></td>
				</tr>
				
			</table>
		</td>
	</tr>
	
</table>

</body>
<script type="text/javascript">
//<![CDATA[

	function iFrameResize(obj)
	{
		var iFrm = obj;
		var the_height = iFrm.contentWindow.document.body.scrollHeight;

		iFrm.style.height = the_height;
	}

	function iFrameResizeTab(obj)
	{
		var iFrm = document.getElementById(obj);
		var the_height = iFrm.contentWindow.document.body.scrollHeight;

		iFrm.style.height = the_height;
	}
</script>
</html>