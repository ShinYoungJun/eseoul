<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" %>
<%@ include file="/jsp/common/include.jsp"%>
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

<script language="javascript" src="/js/common.js"></script> 
<!--  //********** BEGIN_����_20120319 -->
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<!--   //********** END_����_20120319 -->
<script type="text/javascript">
//<![CDATA[
	           
	function  deleteGapan()
	{
		var w = document.deleteForm;
		if(siguCheck(w.GU_CD.value)){
			//********** BEGIN_KANG_20120420
			/*
			w.action = "/admin/deleteMove/delete.do";	
			w.submit();
			*/
			var year = w.SURVEY_YEAR.value;
			if(confirm(year + "�⵵ �����͸� �����Ͻðڽ��ϱ�?")){
				w.action = "/admin/deleteMove/delete.do";	
				w.submit();
			}
			//********** END_KANG_20120420
		}else{
			w.GU_CD.focus();
			return
		}			
	}

	function  moveGapan()
	{	
		var w = document.moveForm;
		if(siguCheck(w.GU_CD.value)){
			w.action = "/admin/deleteMove/move.do";	
			w.submit();
		}else{
			w.GU_CD.focus();
			return
		}	
	}

	function  changeGapanUpdate()
	{	
		var w = document.changeForm;
		var year = w.YEAR.value;
		var update = w.UPDATE.value;
		if(confirm(year + " ����⵵��  ��������  " + update +"�� �����Ͻðڽ��ϱ�?")){
			w.action = "/admin/deleteMove/changeGapanUpdate.do";	
			w.submit();
		}
	}
	
	function InitPage()
    {		
		if('${MSG}'.length > 0){
            alert('${MSG}');
        }		
		setYear(document.getElementById("SURVEY_YEAR"),"${YEAR}");
		setYear(document.getElementById("BEFORE_SURVEY_YEAR"),"${YEAR-1}");
		setYear(document.getElementById("AFTER_SURVEY_YEAR"),"${YEAR}");
		//********** BEGIN_����_20120319
		setYear(document.getElementById("YEAR"),"${YEAR}");
		//********** END_����_20120319		
    }

	function  siguCheck(gu_cd)
	{	
		if(gu_cd=="000"){
			alert("�ñ������� �������ּ���.");
			return false;
		}else{
			return true;
		}
	}
	
//]]>
</script>

<body onload="javascript:InitPage();">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont3_title.gif"
			width="800" height="43"></td>
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
		</table>

		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td align="left" height="22" background="/img/tab_line_blue.gif">
					<table border="0" cellspacing="0" cellpadding="0">
						<tr>	
							<td width="111"><a href="/admin/section/list.do"><img
								src="/img/sub_admin_section_off.gif " alt="������ ����" width="110"
								height="22" border="0"></a>
							</td>							
							<td width="111"><a href="#"><img
								src="/img/sub_admin_deleteCopy_on.gif" alt="�ϰ���� �� ����" width="110"
								height="22" border="0"></a>
							</td>												
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td align="center" class="contborder_blue">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<!-- �ϰ� ����  -->
					<tr>
						<td align="left" height="20px"><span class="sub_stan_blue">* �ϰ� ����</span></td>
					</tr>
					<tr>
						<td align="left">
						<form name="deleteForm" id="deleteForm">
							<table width="750px" border="1" bordercolor="#c9dfed"
								style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
								class="sub_table">
								<tr>
									<td width="70px" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ñ�����</td>
									<td width="160px" bgcolor="eaeaea" class="table_bl_left">
										<select id="GU_CD" name="GU_CD" class="input_form1" style="width:130px">
											${GU_CODE}
										</select>
									</td>
									<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">����⵵</td>
									<td width="160px" bgcolor="eaeaea" class="table_bl_left">
										<select  id="SURVEY_YEAR" name="SURVEY_YEAR" class="input_form1" style="width:130px">
	                                    </select>
									</td>
									<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
									<td width="220px" bgcolor="eaeaea" class="table_bl_left">
										 <input id="GAPAN_NO" name="GAPAN_NO" type="text" class="input_form1" style="width: 130px" value=""/>
									</td>
								</tr>
							</table>
						</form>
						</td>
					</tr>
					
					<tr>
						<td align="right" height="30">
							<a href="#" id="deleteBtn"><img src="/img/del_icon3.gif" alt="����" border="0" onClick="javascript:deleteGapan();"></a>
						</td>
					</tr>
					<!-- �ϰ�����  -->
					<tr>
						<td height="1" bgcolor="#EAEAEA"></td>
					</tr>
					<tr>
						<td height="30px"></td>
					</tr>
					<tr>
						<td align="left" height="20px"><span class="sub_stan_blue">* �ϰ� ����</span></td>
					</tr>
					<tr>
						<td align="left">
						<form name="moveForm" id="moveForm">
							<table width="750px" border="1" bordercolor="#c9dfed"
								style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
								class="sub_table">
								<tr>
									<td width="70px" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ñ�����</td>
									<td width="150px" bgcolor="eaeaea" class="table_bl_left">
										<select id="GU_CD" name="GU_CD" class="input_form1" style="width:130px">
											${GU_CODE}
										</select>
									</td>
									<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">����⵵</td>
									<td width="120px" bgcolor="eaeaea" class="table_bl_left">
										<select  id="BEFORE_SURVEY_YEAR" name="BEFORE_SURVEY_YEAR" class="input_form1" style="width:100px">
	                                    </select>
									</td>
									<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">����⵵</td>
									<td width="120px" bgcolor="eaeaea" class="table_bl_left">
										<select  id=AFTER_SURVEY_YEAR name="AFTER_SURVEY_YEAR" class="input_form1" style="width:100px">
	                                    </select>
									</td>
									<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
									<td width="140px" bgcolor="eaeaea" class="table_bl_left">
										 <input id="GAPAN_NO" name="GAPAN_NO" type="text" class="input_form1" style="width: 100px" value=""/>
									</td>
								</tr>
							</table>
						</form>
						</td>
					</tr>	
					<tr>
						<td align="right" height="30">
							<a href="#"><img src="/img/copy_icon.gif" alt="����" border="0" onClick="javascript:moveGapan();"></a>
						</td>
					</tr>	
					<!--  //********** BEGIN_����_20120317 -->
					<tr>
						<td height="1" bgcolor="#EAEAEA"></td>
					</tr>
					<tr>
						<td height="30px"></td>
					</tr>
					<tr>
						<td align="left" height="20px"><span class="sub_stan_blue">* �ش� ����⵵ ������ ����</span></td>
					</tr>
					<tr>
						<td align="left">
						<form name="changeForm" id="changeForm">
							<table width="750px" border="1" bordercolor="#c9dfed"
								style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
								class="sub_table">
								<tr>
									<td width="70px"  height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����⵵</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										<select  id="YEAR" name="YEAR" class="input_form1" style="width:100px">
	                                    </select>
									</td>
									<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										<input id="UPDATE" name="UPDATE" type="text" class="input_form1" style="width:80px" value="2012-03-19" readonly>
										<a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('UPDATE'), 'yyyymmdd');" style="CURSOR: Hand;"></a>
									</td>									
								</tr>
							</table>
						</form>
						</td>
					</tr>	
					<tr>
						<td align="right" height="30">
							<a href="#"><img src="/img/register_icon2.gif" alt="���" border="0" onClick="javascript:changeGapanUpdate();"></a>
						</td>
					</tr>	
					<!--   //********** END_����_20120317 -->
						
				</table>
				
				</td>
			</tr>
			
		</table>
		</td>
	</tr>
</table>

</body>


<script type="text/javascript">
var org_cd = "${org_cd}";
//2015.09.21 ����� �����ڰ� �ƴϸ� ������ư ������ �ʰ�
if(org_cd != "0000000"){
	document.getElementById("deleteBtn").style.display="none";
}
</script>


</html>

