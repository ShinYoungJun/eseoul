<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

<script>
	function subTabClick(hiddenSubTabName,visibleSubTabName)
	{					
		document.getElementById(hiddenSubTabName).style.visibility = 'hidden';	
		document.getElementById(visibleSubTabName).style.visibility = 'visible';	
	}
	
	
</script>
</head>

<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub1_cont2_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td align="center">
    <table width="780" border="0" cellspacing="0" cellpadding="0">
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
        <td>
        </td>
      </tr>
    

    </table></td>
  </tr>
  <tr>
    <td height="30"></td>
  </tr>
</table>


    
        <div id="topTapDiv1" style="position:absolute;left:20px;top:80px;width:100%;background-color:#ffffff;z-index:2">
     <table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>

                  <td width="111" onclick="subTabClick('topTapDiv1','topTapDiv1');"><a href="#"><img src="/img/sub_petition_title2_on_b.gif" alt="������ ����" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick="subTabClick('topTapDiv1','topTapDiv2');"><a href="#"><img src="/img/sub_facility_title2_off.gif" alt="���� ����" width="110" height="22" border="0"></a></td>
                  <td align="right" class="sub_stan">������ȣ : ******_*_***** </td>

                </tr>
            </table></td>
          </tr>
          <tr>
            <td  class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������/���θ�</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22229" type="text" class="input_form1" style="width:120px"></td>
                      <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹ�/���ι�ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222722232" type="text" class="input_form1" style="width:60px">
-
  <input name="textfield22227222223" type="text" class="input_form1" style="width:60px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����ڵ�Ϲ�ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272223" type="text" class="input_form1" style="width:60px">
-
  <input name="textfield2222722222" type="text" class="input_form1" style="width:60px">
-
<input name="textfield22227222222" type="text" class="input_form1" style="width:60px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">����/����</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222722233" type="text" class="input_form1" style="width:60px">
/
  <input name="textfield22227222224" type="text" class="input_form1" style="width:100px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield222232322" type="text" class="input_form1" style="width:50px"></td>
                          <td width="16" >-</td>
                          <td><input name="textfield2222223322" type="text" class="input_form1" style="width:50px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
                          </tr>
                      </table></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">������ �ּ�</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272" type="text" class="input_form1" style="width:100px">
                        <input name="textfield2222722" type="text" class="input_form1" style="width:100px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222283" type="text" class="input_form1" style="width:120px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222723" type="text" class="input_form1" style="width:100px">
                        <input name="textfield22227222" type="text" class="input_form1" style="width:40px">
                        -
                        <input name="textfield222272222" type="text" class="input_form1" style="width:40px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222722234" type="text" class="input_form1" style="width:40px">
-
  <input name="textfield22227222225" type="text" class="input_form1" style="width:40px">
-
<input name="textfield222272222222" type="text" class="input_form1" style="width:40px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227222342" type="text" class="input_form1" style="width:40px">
-
  <input name="textfield222272222252" type="text" class="input_form1" style="width:40px">
-
<input name="textfield2222722222222" type="text" class="input_form1" style="width:40px"></td>
                    </tr>
                    <tr>
                      <td height="34" colspan="4" align="right" bgcolor="#FFFFFF" class="table_bl_left">
					   <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                          <tr>
                            <td><span class="sub_stan_blue">* ���� �۴���</span> : </td>
                            <td width="16"><input name="checkbox" type="checkbox" value="checkbox" checked></td>
                            <td width="110">������ ������ ���� </td>
                            </tr>
                        </table>
                        </td>
                      </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ������ </td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="textfield2223" type="text" class="input_form1" style="width:120px"></td>
                      </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield2222323222" type="text" class="input_form1" style="width:50px"></td>
                          <td width="16" align="center">-</td>
                          <td><input name="textfield22222233222" type="text" class="input_form1" style="width:50px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">�۴��� �ּ�</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222724" type="text" class="input_form1" style="width:100px">
                        <input name="textfield22227223" type="text" class="input_form1" style="width:100px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222832" type="text" class="input_form1" style="width:120px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227232" type="text" class="input_form1" style="width:100px">
                        <input name="textfield222272224" type="text" class="input_form1" style="width:40px">
-
<input name="textfield2222722223" type="text" class="input_form1" style="width:40px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227222344" type="text" class="input_form1" style="width:40px">
-
  <input name="textfield222272222254" type="text" class="input_form1" style="width:40px">
-
<input name="textfield2222722222224" type="text" class="input_form1" style="width:40px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227222345" type="text" class="input_form1" style="width:40px">
-
  <input name="textfield222272222255" type="text" class="input_form1" style="width:40px">
-
<input name="textfield2222722222225" type="text" class="input_form1" style="width:40px"></td>
				</tr>
                  </table></td>
                </tr>
                <tr>
                  <td height="40" align="right"><a href="#">
                  
                  <img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a></td>
                </tr>
            </table></td>
          </tr>          
          
        </table>
        
        </div>  
        
        
        
        <div id="topTapDiv2" style="position:absolute;left:20px;top:80px;width:100%;background-color:#ffffff;visibility:hidden;;z-index:1">
        
        
		<table width="780" border="0" cellspacing="0" cellpadding="0" >
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="111" onclick="subTabClick('topTapDiv2','topTapDiv1');"><a href="#"><img src="/img/sub_petition_title2_off_b.gif" alt="������ ����" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick="subTabClick('topTapDiv2','topTapDiv2');"><a href="#"><img src="/img/sub_facility_title2_on.gif" alt="���� ����" width="110" height="22" border="0"></a></td>
                  <td align="right" class="sub_stan">������ȣ : ******_*_***** </td>
                </tr>
            </table></td>
          </tr>
          
          <tr>
            <td class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr><td>
            <table width="100%"  class="sub_table">
            	<tr align="left">
            			<td >* �ΰ��⵵ </td>
            			<td class="table_bl_left">
	            			<select name="select" class="input_form1" style="width:130px">
		                        <option>�����ϼ���</option>
		                        <option>1</option>
		                        <option>2</option>
		                        <option>3</option>
		                        <option>4</option>
		                        <option>5</option>
							</select>
            			</td>
            			<td >*���Ա���</td>
            			<td class="table_bl_left">
	            			<select name="select" class="input_form1" style="width:130px">
		                        <option>�����ϼ���</option>
		                        <option>1</option>
		                        <option>2</option>
		                        <option>3</option>
		                        <option>4</option>
		                        <option>5</option>
							</select>
            			</td>
            	</tr>
            </table></td></tr>
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                <tr>
                <td colspan="4"><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ����(�ڵ�)</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">�۳⵵ ����� </td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ ����� </td>
                    </tr>
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center"><a href="#" class="inqu">3</a></td>
                    <td align="center"><a href="#" class="inqu">635 ���Ͻü����� ������Žü�, �������</a></td>
                    <td align="center"><a href="#" class="inqu">4</a></td>
                    <td align="center"><a href="#" class="inqu">2008-01-01~2008-12-31</a></td>
                    <td align="center"><a href="#" class="inqu">1,335,100��</a></td>
                    <td align="center"><a href="#" class="inqu">1,335,100��</a></td>
                    </tr>
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    </tr>
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    </tr>
                </table></td>
              </tr>
              <tr>
                <td height="40" align="center" colspan = "4"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td align="center"><table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                          <td><a href="#"><img src="/img/prev_icon2.gif" width="13" height="11" border="0"></a></td>
                          <td><a href="#"><img src="/img/prev_icon.gif" width="12" height="11" border="0"></a></td>
                          <td width="15"></td>
                          <td align="center"><a href="#" class="list">1</a> <a href="#" class="list">2</a> <a href="#" class="list">3</a> <a href="#" class="list">4</a> <a href="#" class="list">5</a> <a href="#" class="list">6</a> <a href="#" class="list">7</a> <a href="#" class="list">8</a> <a href="#" class="list">9</a> </td>
                          <td width="15">&nbsp;</td>
                          <td><a href="#"><img src="/img/next_icon.gif" width="12" height="11" border="0"></a></td>
                          <td><a href="#"><img src="/img/next_icon2.gif" width="13" height="11" border="0"></a></td>
                          <td align="right"><a href="#"></a></td>
                        </tr>
                      </table></td>
                      <td align="right">
                      <a href="#"><img src="/img/" alt="��ü����" width="64" height="18" border="0"></a>
                      <a href="#"><img src="/img/excel_icon3.gif" alt="EXCEL" width="64" height="18" border="0"></a>
                      </td>
                    </tr>
                  </table></td>
              </tr>
                
                
                
                <tr><td height="20"></td></tr>
                
                   
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td width="54"><input name="textfield222232322223" type="text" class="input_form1" style="width:50px"></td>
                          <td><input name="textfield2222223322223" type="text" class="input_form1" style="width:350px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                      </tr>
                   <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����(����)</td>
                    <td bgcolor="eaeaea" class="table_bl_left" >
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">��(�Ǵ� m)
					</td>                     
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                    <td bgcolor="eaeaea" class="table_bl_left" >
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td> 
                  </tr> 
                      
                 
                      
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
                      <td  bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield222232" type="text" class="input_form1" style="width:70px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          <td width="16" >~</td>
                          <td><input name="textfield2222222" type="text" class="input_form1" style="width:70px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>                          
                        </tr>
                      </table></td>
                      	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �����</td>
                    <td bgcolor="eaeaea" class="table_bl_left" >
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
	                  
	                   
	                   
					</td> 
                      </tr>
                    <tr>
                      <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�۳⵵ �����</td>
                      <td bgcolor="eaeaea" class="table_bl_left" >
	                     <input name="textfield22224" type="text" class="input_form1" style="width:120px">
		    		  </td>                     
					  <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ �����</td>
                      <td bgcolor="eaeaea" class="table_bl_left" >
	                     <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					  </td> 
                    </tr>   
                      
                    
                </table></td>
              </tr>
              <tr>
                  <td height="40" align="right">
                  
                   <a href="#"><img src="/img/accou_icon.gif" alt="���" width="56" height="18" border="0"></a>
                  <a href="#"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a></td>
              </tr>
            </table></td>
          </tr>
          
        </table>
        </div>
        
        
        
        
        
        
<div id="divSub1" style="position:absolute;left:20px;top:500px;width:100%;background-color:#ffffff;;z-index:5">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="subTabClick('divSub1','divSub1')"><a href="#"><img src="/img/sub_petition_title4_on.gif" alt="���⳻��" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub1','divSub2')"><a href="#"><img src="/img/sub_petition_title12_off.gif" alt="�ΰ�����" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub1','divSub3')"><a href="#"><img src="/img/sub_petition_title14_off.gif" alt="��������" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub1','divSub4')"><a href="#"><img src="/img/sub_petition_title8_off.gif" alt="�̷�����" width="110" height="22" border="0"></a></td>
               </tr>
            </table></td>
          </tr>
          <tr>
            <td class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
              <td width="100%" height="26" align="left" colspan="3"><span class="sub_stan_blue">* ������⳻��</span></td>
              </tr>        
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  
                  
                   <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������հ�</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  colspan="3">
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                   
                  </tr> 
                  
                   <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  >
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                     
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
                    <td bgcolor="eaeaea" class="table_bl_left" >
	                   <input name="textfield22224" type="text" class="input_form1" style="width:80px"><input name="checkbox" type="checkbox" value="checkbox" checked>
					</td> 
                  </tr> 


                   <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
                    <td bgcolor="eaeaea" class="table_bl_left"   colspan="3">
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                     
                  </tr> 


				 
                  <tr>
              <td width="100%" height="26" align="left" colspan="3">
                                <span class="sub_stan_blue">* �⺻���⳻��</span>
              </td>
              </tr>   
                   <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�۳⵵ �����</td>
                    <td bgcolor="eaeaea" class="table_bl_left"   colspan="3">
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                   
                  </tr> 
                  
                   <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  >
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                     
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  >
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td> 
                  </tr> 


                   <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
                    <td bgcolor="eaeaea" class="table_bl_left"   colspan="3">
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                     
                  </tr> 
                


                  
               
                  
                </table></td>
              </tr>
              
            
              <tr>              
                <td height="40" align="right">
                
                <a href="#"><img src="/img/accou_icon.gif" alt="���" width="56" height="18" border="0"></a>                
                <a href="#"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a></td>
              </tr>
            </table></td>
          </tr>
          <tr>    
            <td height="40" align="right">
            <a href="#"><img src="/img/levy_icon5.gif" alt="�ΰ��⵵����" height="22" border="0"></a>            
            <a href="#"><img src="/img/levy_icon.gif" alt="���ܼ��Ժΰ�"  height="22" border="0"></a>
            <a href="#"><img src="/img/occu_icon.gif" alt="�����㰡��"  height="22" border="0"></a>
            <a href="#"><img src="/img/notice_icon.gif" alt="�������߱�"  height="22" border="0"></a>            
            <a href="#"><img src="/img/save_icon.gif" alt="��ü����"  height="22" border="0"></a>
            <a href="#"><img src="/img/list_icon.gif" alt="����Ʈ"  height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>


       
<div id="divSub2" style="position:absolute;left:20px;top:500px;width:100%;z-index:4;visibility:hidden;">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"  onclick ="subTabClick('divSub2','divSub1')"><a href="#"><img src="/img/sub_petition_title4_off.gif" alt="���⳻��" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub2','divSub2')"><a href="#"><img src="/img/sub_petition_title12_on.gif" alt="�ΰ�����" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub2','divSub3')"><a href="#"><img src="/img/sub_petition_title14_off.gif" alt="��������" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub2','divSub4')"><a href="#"><img src="/img/sub_petition_title8_off.gif" alt="�̷�����" width="110" height="22" border="0"></a></td>
               </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td>
                
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
						<select name="select" class="input_form1" style="width:130px">
	                        <option>�����ϼ���</option>
	                        <option>1</option>
	                        <option>2</option>
	                        <option>3</option>
	                        <option>4</option>
	                        <option>5</option>
						</select>
					</td>                    
                  </tr>          
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <select name="select" class="input_form1" style="width:80px">
	                        <option>�����ϼ���</option>
	                        <option>1</option>
	                        <option>2</option>
	                        <option>3</option>
	                        <option>4</option>
	                        <option>5</option>
						</select>��
						<select name="select" class="input_form1" style="width:80px">
	                        <option>�����ϼ���</option>
	                        <option>1</option>
	                        <option>2</option>
	                        <option>3</option>
	                        <option>4</option>
	                        <option>5</option>
						</select>��
						
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڵ�</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
						<select name="select" class="input_form1" style="width:130px">
	                        <option>�����ϼ���</option>
	                        <option>1</option>
	                        <option>2</option>
	                        <option>3</option>
	                        <option>4</option>
	                        <option>5</option>
						</select>
					</td>                    
                  </tr> 
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ñ����ڵ�</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�μ��ڵ�</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڱ���</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left" colspan="3">
						<select name="select" class="input_form1" style="width:400px">
	                        <option>�����ϼ���</option>
	                        <option>1</option>
	                        <option>2</option>
	                        <option>3</option>
	                        <option>4</option>
	                        <option>5</option>
						</select>
					</td>                    
                  </tr>  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���ֻ���</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
						<select name="select" class="input_form1" style="width:130px">
	                        <option>�����ϼ���</option>
	                        <option>1</option>
	                        <option>2</option>
	                        <option>3</option>
	                        <option>4</option>
	                        <option>5</option>
						</select>
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���Ǳ���</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
						<select name="select" class="input_form1" style="width:130px">
	                        <option>�����ϼ���</option>
	                        <option>1</option>
	                        <option>2</option>
	                        <option>3</option>
	                        <option>4</option>
	                        <option>5</option>
						</select>
					</td>                    
                  </tr>  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����(�����)</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�����μ�</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>                                                                         

                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ���ġ��</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">                    	
	                    <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                        <tr>
	                          <td><input name="textfield22224" type="text" class="input_form1" style="width:80px"></td>
	                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
	                        </tr>
	                    </table>
					</td>                    
                  </tr>  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���⳻�ݾ�</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���⳻����</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                        <tr>
	                          <td><input name="textfield22224" type="text" class="input_form1" style="width:80px"></td>
	                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
	                        </tr>
	                    </table>
					</td>                    
                  </tr>  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�����ıݾ�</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                        <tr>
	                          <td><input name="textfield22224" type="text" class="input_form1" style="width:80px"></td>
	                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
	                        </tr>
	                    </table>
					</td>                    
                  </tr>  
                  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����ݸ��� ����</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>  
                  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left" colspan="3">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					                 
                  </tr>  
                  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���� ������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����ȸ��</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">Ư������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">Ư������ ����</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>                                                                                                      
                  
                  
                                                                               
                </table>
                
                
                </td>
              </tr>
              
              <tr>                
                <td height="40" align="right">
                	<a href="#"><img src="/img/accou_icon.gif" alt="���" width="56" height="18" border="0"></a>
                	<a href="#"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a>
                </td>
              </tr>
              
              
            </table></td>
          </tr>
          <tr>    
            <td height="40" align="right">
            <a href="#"><img src="/img/levy_icon5.gif" alt="�ΰ��⵵����" height="22" border="0"></a>            
            <a href="#"><img src="/img/levy_icon.gif" alt="���ܼ��Ժΰ�"  height="22" border="0"></a>
            <a href="#"><img src="/img/occu_icon.gif" alt="�����㰡��"  height="22" border="0"></a>
            <a href="#"><img src="/img/notice_icon.gif" alt="�������߱�"  height="22" border="0"></a>            
            <a href="#"><img src="/img/save_icon.gif" alt="��ü����"  height="22" border="0"></a>
            <a href="#"><img src="/img/list_icon.gif" alt="����Ʈ"  height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>



<div id="divSub3" style="position:absolute;left:20px;top:500px;width:100%;visibility:hidden;;z-index:4">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>                
                  <td width="111"  onclick ="subTabClick('divSub3','divSub1')"><a href="#"><img src="/img/sub_petition_title4_off.gif" alt="���⳻��" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub3','divSub2')"><a href="#"><img src="/img/sub_petition_title12_off.gif" alt="�ΰ�����" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub3','divSub3')"><a href="#"><img src="/img/sub_petition_title14_on.gif" alt="��������" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub3','divSub4')"><a href="#"><img src="/img/sub_petition_title8_off.gif" alt="�̷�����" width="110" height="22" border="0"></a></td>
               </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr><td class="sub_table_b" align="left">*�ΰ����� </td></tr>
            
              <tr>
                <td>
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                 

                  <tr>
                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ���</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �� �ݾ�</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �� �ݾ� </td>
                  </tr>
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    </tr>                                
             
                </table></td>
              </tr>
              
              <tr>
                <td height="20" ></td>
              </tr>
              
              <tr><td class="sub_table_b" align="left">*�������� </td></tr>
              <tr>
                <td>
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���α���</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">ó������</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ���</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">������ </td>
                  </tr>
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    <td align="center" bgcolor="eaeaea"><a href="#" class="inqu"></a></td>
                    </tr>                                
             
                </table></td>
              </tr>
              
              <tr>
                <td height="20" ></td>
              </tr>
              
              
              
              <tr><td class="sub_table_b" align="left">*��/�������� </td></tr>
              <tr>
                <td>
                
                
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>   
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��/��������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
					 <td width="100" height="45" align="center" bgcolor="e5eff8" class="sub_table_b"  >��/��������</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="1" align="left">
                         <textarea name="josaOpinion" id="josaOpinion" cols="50" rows="2" wrap="VIRTUAL" style="ime-mode:active;" >
                         </textarea>                    	 
					</td>  
                  </tr>             

 
                  
                   </table></td>
              </tr>
                  
                  <tr>
                <td>
                
                <tr>
                <td height="20" ></td>
              </tr>
              
              
              <tr><td class="sub_table_b" align="left">*�������� </td></tr>
              <tr>
              
              
              <tr><td>
              
                
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���ױ���</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>        
                  <tr>   
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����ݾ�</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
					 <td width="100" height="45" align="center" bgcolor="e5eff8" class="sub_table_b"  >���׻���</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="1" align="left">
                         <textarea name="josaOpinion" id="josaOpinion" cols="50" rows="2" wrap="VIRTUAL" style="ime-mode:active;" >
                         </textarea>                    	 
					</td>  
                  </tr>     
                         
                </table></td>
              </tr>
              
              <tr>
                <td height="40" align="right"><a href="#"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a></td>
              </tr>
            </table></td>
          </tr>
           <tr>    
            <td height="40" align="right">
            <a href="#"><img src="/img/levy_icon5.gif" alt="�ΰ��⵵����" height="22" border="0"></a>            
            <a href="#"><img src="/img/levy_icon.gif" alt="���ܼ��Ժΰ�"  height="22" border="0"></a>
            <a href="#"><img src="/img/occu_icon.gif" alt="�����㰡��"  height="22" border="0"></a>
            <a href="#"><img src="/img/notice_icon.gif" alt="�������߱�"  height="22" border="0"></a>            
            <a href="#"><img src="/img/save_icon.gif" alt="��ü����"  height="22" border="0"></a>
            <a href="#"><img src="/img/list_icon.gif" alt="����Ʈ"  height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>




<div id="divSub4" style="position:absolute;left:20px;top:500px;width:100%;visibility:hidden;;z-index:3;">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"  onclick ="subTabClick('divSub4','divSub1')"><a href="#"><img src="/img/sub_petition_title4_off.gif" alt="���⳻��" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub4','divSub2')"><a href="#"><img src="/img/sub_petition_title12_off.gif" alt="�ΰ�����" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub4','divSub3')"><a href="#"><img src="/img/sub_petition_title14_off.gif" alt="��������" width="110" height="22" border="0"></a></td>
                  <td width="111"  onclick ="subTabClick('divSub4','divSub4')"><a href="#"><img src="/img/sub_petition_title8_on.gif" alt="�̷�����" width="110" height="22" border="0"></a></td>
               </tr>
            </table></td>
          </tr>
          
           <tr>    
            <td height="40" align="right">
            <a href="#"><img src="/img/levy_icon5.gif" alt="�ΰ��⵵����" height="22" border="0"></a>            
            <a href="#"><img src="/img/levy_icon.gif" alt="���ܼ��Ժΰ�"  height="22" border="0"></a>
            <a href="#"><img src="/img/occu_icon.gif" alt="�����㰡��"  height="22" border="0"></a>
            <a href="#"><img src="/img/notice_icon.gif" alt="�������߱�"  height="22" border="0"></a>            
            <a href="#"><img src="/img/save_icon.gif" alt="��ü����"  height="22" border="0"></a>
            <a href="#"><img src="/img/list_icon.gif" alt="����Ʈ"  height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>

</body>
</html>

