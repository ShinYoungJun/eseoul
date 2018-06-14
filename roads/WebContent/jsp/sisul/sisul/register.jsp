<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
	background-image: url/img/left_back.gif);
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script> 

<script type="text/javascript">
//<![CDATA[

	// getElementsByClassName
	function getElementsByClassName(clsName,parentNode) {
		var arr = new Array();
		var elems;
		
		if (parentNode == null) {
			elems = document.getElementsByTagName("*");
		} else {
			elems = parentNode.getElementsByTagName("*");
		}
		for ( var cls, i = 0; ( elem = elems[i] ); i++ ) {
			if ( elem.className == clsName ) {
				arr[arr.length] = elem;
			}
		}
		return arr;
	}
	function tabDisplay(tab,content,num,type) {
		for (var i=0; i<content.length; i++) {
			var tab_off = tab[i].childNodes[0].getAttribute('src').replace(/_on|_off|_chk/i,'_off');
			var tab_on = tab[num].getElementsByTagName('img')[0].getAttribute('src').replace(/_on|_off|_chk/i,'_off');
			var tab_chk = tab[num].getElementsByTagName('img')[0].getAttribute('src').replace(/_on|_off|_chk/i,'_on');
			tab[i].getElementsByTagName('img')[0].setAttribute('src',tab_off);
			tab[num].getElementsByTagName('img')[0].setAttribute('src',tab_chk);
			content[i].style.display = 'none';
			content[num].style.display = 'block';
		}
	}
	function tabAct(tab,content,num,type) {
		tab[num].onclick = function() {
			tabDisplay(tab,content,num);
			return false;
		}
		if (type == true) {
			var tabimg = tab[num].getElementsByTagName('img')[0];
			var tab_off = tabimg.getAttribute('src').replace(/_on|_off|_chk/i,'_on');
			var tab_on = tabimg.getAttribute('src').replace(/_on|_off|_chk/i,'_off');
			tab[num].onmouseover = function() {
				if (tabimg.getAttribute('src').indexOf('_on') == -1) {
					tabimg.setAttribute('src',tab_on);
				}
			}
			tab[num].onmouseout = function() {
				if (tabimg.getAttribute('src').indexOf('_on') != -1) {
					tabimg.setAttribute('src',tab_off);
				}
			}
		}
	}
	window.onload = tabMenu;
	function tabMenu() {
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class
		var type = true; // �ѿ����� true / false
		for (var i=0; i<tab.length; i++) {
			tabDisplay(tab,content,0,true);
			tabAct(tab,content,i,type);
		}
	}

	function	RegisterPrc()
	{
		var form = document.form;

		form.action = "register_prc.do";
		form.submit();
	}

	function	RegisterPrcAll()
	{
		var form = document.form;

		var	obj	= document.getElementById("SAN_CK");
		
		if(obj.checked	== true)	//	�� üũ
			document.getElementById("SAN_CK").value='1';
		else
			document.getElementById("SAN_CK").value='0';		

		form.action = "register_prc.do";
		form.submit();
	}

	function	Select_UseType(sel)
	{
//		var idx = sel.selectedIndex;

		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel.value == '1')							//	����
			document.getElementById("UseType1").style.display = "block";
		else if(sel.value == '2' || sel.value == '3')	//	��õ, ����
			document.getElementById("UseType2").style.display = "block";
		else if(sel.value == '4')						//	����
			document.getElementById("UseType1").style.display = "block";		
	}

	function	Select_UseSection(sel)
	{
		if(sel.value == '1')
			document.getElementById("UseSection").style.display = "block";
		else
			document.getElementById("UseSection").style.display = "none";
	}

	function	Jumin_toaddr_Check()
	{
		var form = document.form;
		var	chk	= form.checkbox.checked;

		if(chk	== true)
		{
			form.TOPOST_NM.value		= form.NAME.value;
			form.TOPOST.value			= form.POST.value;
			form.TOADDR1.value			= form.ADDR1.value;
			form.TOADDR2.value			= form.ADDR2.value;
			form.TOEMAIL.value			= form.EMAIL.value;
			form.TOTEL.value			= form.TEL.value;
			form.TOHP.value				= form.HP.value;
		}
	}

	function	Select_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel.value == '2' || sel.value == '3')	
			document.getElementById("UseType2").style.display = "block";	//	��õ, ����
		else						
			document.getElementById("UseType1").style.display = "block";	//	����		
	}

	function	Select_UseSection(sel)
	{
		if(sel.value == '1')
			document.getElementById("UseSection").style.display = "block";	//	����
		else
			document.getElementById("UseSection").style.display = "none";
	}

	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "�����ȣ�Է�";
		var width 	= 420;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
	}	

//]]>
</script>

<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="UserType">
<input type="hidden" name="UserSection">
  <tr>
    <td height="43"><img src="/img/sub1_cont1_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td align="center"><table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="40" align="right">
	<!--��� ��ȹ����,���� �޴�-->
		<table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="8" colspan="2"></td>
            </tr>
          <tr>
            <td><a href="#"><img src="/img/report_icon.gif" alt="��ȹ� ���" width="92" height="18" border="0"></a></td>
            <td><a href="#"><img src="/img/help_icon.gif" alt="����" width="65" height="18" border="0"></a></td>
            </tr>
        </table>
	<!--��� ��ȹ����,���� �޴�-->		</td>
      </tr>
      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
      <tr>
        <td height="14"></td>
      </tr>
 
      <tr>
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                <ul id="tabmenu">
                  <td width="111"><a href="tab1"><img src="/img/sub_petition_title2_on.gif" alt="������ ����" width="110" height="22" border="0"></a></td>
                  <td><a href="tab2"><img src="/img/sub_petition_title3_off.gif" alt="������ ����" width="110" height="22" border="0" onclick="Init_PurposeCode();"></a></td>
				</ul>
                </tr>
            </table></td>
		</tr>
          
		<tr>
            <td align="left" class="contborder_purple">

		<div id="tabcontents">
			<div class="tabcontent">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������/���θ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME" type="text" class="input_form1" style="width:120px" value="${board.NAME}"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹ�/���ι�ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_ssn1" type="text" class="input_form1" style="width:60px" value="${jumin_ssn1}">
					  - <input name="jumin_ssn2" type="text" class="input_form1" style="width:60px" value="${jumin_ssn2}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����ڵ�Ϲ�ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_bizssn1" type="text" class="input_form1" style="width:60px" value="${jumin_bizssn1}">
					  - <input name="jumin_bizssn2" type="text" class="input_form1" style="width:60px" value="${jumin_bizssn2}">
					  - <input name="jumin_bizssn3" type="text" class="input_form1" style="width:60px" value="${jumin_bizssn3}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">����/����</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_STATUS" type="text" class="input_form1" style="width:60px" value="${board.BIZ_STATUS}">
					  / <input name="BIZ_TYPES" type="text" class="input_form1" style="width:100px" value="${board.BIZ_TYPES}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input name="POST" type="text" class="input_form1" style="width:120px" value="${board.POST}"></td>
						  <td><a href="javascript:openZipcodePopup('form.POST', 'form.ADDR1');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="ADDR1" type="text" class="input_form1" style="width:100px" value="${board.ADDR1}">
						<input name="ADDR2" type="text" class="input_form1" style="width:100px" value="${board.ADDR2}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="EMAIL" type="text" class="input_form1" style="width:120px" value="${board.EMAIL}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222723" type="text" class="input_form1" style="width:100px">
						<input name="textfield22227222" type="text" class="input_form1" style="width:40px">
					  - <input name="textfield222272222" type="text" class="input_form1" style="width:40px"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TEL" type="text" class="input_form1" style="width:120px" value="${board.TEL}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="HP" type="text" class="input_form1" style="width:120px" value="${board.HP}"></td>
				  </tr>
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* ���� �۴���</span> : </td>
						  <td width="16"><input name="checkbox" type="checkbox" value="false" onclick="javascript:Jumin_toaddr_Check()"></td>
						  <td width="110">������ ������ ���� </td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ������ </td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="TOPOST_NM" type="text" class="input_form1" style="width:120px" value="${board.TOPOST_NM}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input name="TOPOST" type="text" class="input_form1" style="width:120px" value="${board.TOPOST}"></td>
						  <td><a href="javascript:openZipcodePopup('form.TOPOST', 'form.TOADDR1');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�۴��� �ּ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOADDR1" type="text" class="input_form1" style="width:100px" value="${board.TOADDR1}">
						<input name="TOADDR2" type="text" class="input_form1" style="width:100px" value="${board.TOADDR2}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOEMAIL" type="text" class="input_form1" style="width:120px" value="${board.TOEMAIL}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227232" type="text" class="input_form1" style="width:100px" value="">
						<input name="textfield222272224" type="text" class="input_form1" style="width:40px" value="">
					   - <input name="textfield2222722223" type="text" class="input_form1" style="width:40px" value=""></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOTEL" type="text" class="input_form1" style="width:120px" value="${board.TOTEL}">
						</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOHP" type="text" class="input_form1" style="width:120px" value="${board.TOHP}">
						</td>
				  </tr>
                  </table></td>
                </tr>
<!--
                <tr>
                  <td height="40" align="right"><a href="#"><img src="../../../img/mod_icon.gif" alt="����" width="56" height="18" border="0"></a></td>
                </tr>
-->
            </table>
			</div>
			
			<div class="tabcontent">

            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="TYPE" class="input_form1" style="width:130px" OnChange="Select_UseType(this);">
					${use_type}
			      </select></td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="SECTION" class="input_form1" style="width:130px" OnChange="Select_UseSection(this);">
					${occupancy_type}
				  </select></td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="OWNER_SET" class="input_form1" style="width:130px">
					${use_owner_Group}
				  </select></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="TAX_SET" class="input_form1" style="width:130px">
					${taxation_section}
				  </select></td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ���� </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td width="64">������ <span class="sub_stan_b">�� </span> </td>
                          <td width="72"><select name="BJ_CD" class="input_form1" style="width:70px">
                            ${bjdong_code}
                          </select></td>
                          <td><select name="HJ_CD" class="input_form1" style="width:90px">
                            ${hjdong_code}
                          </select></td>
					  <td width="20" align="right">��</td>
					  <td width="30"><input name="SAN_CK" type="checkbox"></td>
					  <td><input name="BONBUN" type="text" class="input_form1" style="width:40px" value="${board.BONBUN}">
						- <input name="BUBUN" type="text" class="input_form1" style="width:40px" value="${board.BUBUN}">
						���� <input name="TONG" type="text" class="input_form1" style="width:30px" value="${board.TONG}">
						�� <input name="BAN" type="text" class="input_form1" style="width:30px" value="${board.BAN}"> 
						�� </td>
					  </tr>
				  </table></td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><input name="MUL_POST" type="text" class="input_form1" style="width:120px" value="${board.MUL_POST}"></td>
					  <td><a href="javascript:openZipcodePopup('form.POST', '');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
					</tr>
				  </table></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">�ǹ�(��) ���� </td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="BD_NM" type="text" class="input_form1" style="width:120px" value="${board.BD_NM}">
					<input name="BD_DONG" type="text" class="input_form1" style="width:30px" value="${board.BD_DONG}">
					�� <input name="BD_HO" type="text" class="input_form1" style="width:30px" value="${board.BD_HO}">
					ȣ </td>
				</tr>
				
                <tr style="display:none" id="UseType1">
                  <td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ�</td>
                  <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272322" type="text" class="input_form1" style="width:100px" value="${board.SAN_CK}">
                    <input name="textfield2222722242" type="text" class="input_form1" style="width:40px" value="${board.SAN_CK}">
					- <input name="textfield22227222232" type="text" class="input_form1" style="width:40px" value="${board.SAN_CK}"></td>
                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                    <tr>
                      <td><input name="PARKING_NUM" type="text" class="input_form1" style="width:100px" value="${board.PARKING_NUM}"></td>
                      <td><a href="#"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
                    </tr>
                  </table></td>
                </tr>
                
                <tr style="display:none" id="UseType2">
                  <td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ�</td>
                  <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272322" type="text" class="input_form1" style="width:100px" value="${board.TYPE}">
                    <input name="textfield2222722242" type="text" class="input_form1" style="width:40px" value="${board.TYPE}">
					- <input name="textfield22227222232" type="text" class="input_form1" style="width:40px" value="${board.TYPE}"></td>
                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����/���Ÿ�</td>
                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                    <tr>
                      <td><input name="RIVER_NM" type="text" class="input_form1" style="width:100px" value="${board.RIVER_NM}"></td>
                      <td><a href="#"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
                    </tr>
                  </table></td>
                </tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<jsp:include page="/jsp/common/purposeCode/purposeCode.jsp" flush="true"/>
					</tr>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					<td>
					  <input name="MUL_FROMDATE" type="text" class="input_form1" style="width:70px" value="${board.MUL_FROMDATE}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
					   ~ <input name="MUL_TODATE" type="text" class="input_form1" style="width:70px" value="${board.MUL_TODATE}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></tr>
					</td>
					
	                <tr style="display:none" id="UseSection">
					  <td>�Ͻ�����<input name="PARTLY_PERIOD" type="text" class="input_form1" style="width:300px" value="${board.PARTLY_PERIOD}">
					  &nbsp;&nbsp;��<input name="TOTAL_PERIOD" type="text" class="input_form1" style="width:30px" value="${board.TOTAL_PERIOD}">��</td>
					</tr>
				  </table></td>
				</tr>

                </table></td>
              </tr>
<!--
              <tr>
                <td height="32" align="right"><a href="#"><img src="../../../img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a></td>
              </tr>
-->
            </table>
			</div>
		</div>
		
		</td>
		</tr>
 		
		<tr>
			<td height="40" align="right"><a href="javascript:RegisterPrcAll()"><img src="/img/save_icon.gif" alt="��ü ����" width="74" height="22" border="0"></a>
			<a href="search.do"><img src="/img/list_icon.gif" alt="����Ʈ" width="66" height="22" border="0"></a></td>
		</tr>
	</table></td>
	</tr>

</table></td>
</body>
</html>