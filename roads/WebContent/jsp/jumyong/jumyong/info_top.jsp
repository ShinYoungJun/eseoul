<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

<script>
	
	
	function subTabClick(hiddenSubTabName,visibleSubTabName)
	{					
	//	document.getElementById(hiddenSubTabName).style.visibility = 'hidden';	
	//	document.getElementById(visibleSubTabName).style.visibility = 'visible';	
		
		
		document.getElementById(hiddenSubTabName).style.display = 'none';	
		document.getElementById(visibleSubTabName).style.display = 'block';	
		
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


    <div id="topTapDiv1" style="width:100%;">
    
        <table width="780" border="0" cellspacing="0" cellpadding="0" border="1" > 
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">            
	            <table width="100%" border="0" cellpadding="0" cellspacing="0">
    	            <tr>
    	                        
                
                      
        	          <td width="111" onclick="subTabClick('topTapDiv1','topTapDiv1');">       	          <img src="/img/sub_petition_title9_on.gif" alt="�ο�����1" width="110" height="22" border="0" style="cursor:pointer" ></td>
            	      <td width="111" onclick="subTabClick('topTapDiv1','topTapDiv2');"><img src="/img/sub_petition_title2_off_b.gif" alt="������ ����" width="110" height="22" border="0" style="cursor:pointer" ></td>
                	  <td width="111" onclick="subTabClick('topTapDiv1','topTapDiv3');">
                	  		<img src="/img/sub_petition_title3_off_b.gif" alt="������ ����" width="110" height="22" border="0" style="cursor:pointer" ></td>
	                  <td align="right" class="sub_stan">������ȣ : ******_*_***** </td>
	                  
	            
					</tr>
				</table>
			<td>
		</tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                      <tr>
                        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22229" type="text" class="input_form1" style="width:120px"></td>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ο�����</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22229" type="text" class="input_form1" style="width:120px"></td>
                      </tr>
                      <tr>
                        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
                         <td bgcolor="eaeaea" class="table_bl_left">
                         	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                        	<tr>
		                          <td><input name="textfield22224" type="text" class="input_form1" style="width:80px"></td>
		                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>		                         
		                        </tr>
	                    	</table>
	                    </td>

						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">ó������</td>                                               
                         <td bgcolor="eaeaea" class="table_bl_left">
                         	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                        	<tr>
		                          <td><input name="textfield22224" type="text" class="input_form1" style="width:80px"></td>
		                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>		                          
		                        </tr>
	                    	</table>
	                    </td>
	                  </tr>
                      <tr>
                        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�����μ�</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22229" type="text" class="input_form1" style="width:120px"></td>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���μ�</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22229" type="text" class="input_form1" style="width:120px"></td>
                      </tr>
                      
                       <tr>
                        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڸ�</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22229" type="text" class="input_form1" style="width:120px"></td>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����ڸ�</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22229" type="text" class="input_form1" style="width:120px"></td>
                      </tr>
                      
                      <tr>
                        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ο�����</td>
                        <td bgcolor="eaeaea" class="table_bl_left" colspan="3"><input name="textfield22229" type="text" class="input_form1" style="width:500px"></td>
                      </tr>
                      
                      <tr>
                        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��û��</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22229" type="text" class="input_form1" style="width:120px"></td>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��û�� ����ó</td>
						
						<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227222342" type="text" class="input_form1" style="width:40px">
							-
							  <input name="textfield222272222252" type="text" class="input_form1" style="width:40px">
							-
							<input name="textfield2222722222222" type="text" class="input_form1" style="width:40px"></td>
                        </tr>
                     
                     
                  </table></td>
                </tr>
                <tr>
                  <td height="40" align="right"><a href="#"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a></td>
                </tr>
            </table></td>
          </tr>          
          
        </table>
        
        </div>          


        <div id="topTapDiv2" style="width:100%;display:none;">
     <table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="111" onclick="subTabClick('topTapDiv2','topTapDiv1');"><img src="/img/sub_petition_title9_off.gif" alt="�ο�����" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <td width="111" onclick="subTabClick('topTapDiv2','topTapDiv2');"><img src="/img/sub_petition_title2_on_b.gif" alt="������ ����" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <td width="111" onclick="subTabClick('topTapDiv2','topTapDiv3');"><img src="/img/sub_petition_title3_off_b.gif" alt="������ ����" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <td align="right" class="sub_stan">������ȣ : ******_*_***** </td>

                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
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
                          <td width="16" align="center">-</td>
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
                  <td height="40" align="right"><a href="#"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a></td>
                </tr>
            </table></td>
          </tr>          
          
        </table>
        
        </div>  
        
        <div id="topTapDiv3" style="width:100%;display:none;">
        
        
		<table width="780" border="0" cellspacing="0" cellpadding="0" >
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="111" onclick="subTabClick('topTapDiv3','topTapDiv1');"><img src="/img/sub_petition_title9_off.gif" alt="�ο�����" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <td width="111" onclick="subTabClick('topTapDiv3','topTapDiv2');"><img src="/img/sub_petition_title2_off_b.gif" alt="������ ����" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <td width="111" onclick="subTabClick('topTapDiv3','topTapDiv3');"><img src="/img/sub_petition_title3_on_b.gif" alt="������ ����" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <td align="right" class="sub_stan">������ȣ : ******_*_***** </td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><select name="select" class="input_form1" style="width:130px">
                        <option>�����ϼ���</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                                            </select></td>
                      <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><select name="select4" class="input_form1" style="width:130px">
                        <option>�����ϼ���</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                      </select></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><select name="select2" class="input_form1" style="width:130px">
                        <option>�����ϼ���</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                      </select></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><select name="select3" class="input_form1" style="width:130px">
                        <option>�����ϼ���</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                      </select></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ���� </td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td width="72"><input name="textfield222232322222" type="text" class="input_form1" style="width:50px">�� </td>
                          <td width="72"><select name="select5" class="input_form1" style="width:70px">
                            <option>����</option>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                                                    </select></td>
                          <td><select name="select6" class="input_form1" style="width:70px">
                            <option>����</option>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                                                                              </select></td>
                          <td width="20" align="right">��</td>
                          <td width="30"><input name="checkbox2" type="checkbox" value="checkbox" checked></td>
                          <td><input name="textfield222272332" type="text" class="input_form1" style="width:40px">
                            -
                              <input name="textfield2222723322" type="text" class="input_form1" style="width:40px">
                              ����
                              <input name="textfield2222722252" type="text" class="input_form1" style="width:30px">
��
<input name="textfield22227222242" type="text" class="input_form1" style="width:30px"> 
��
</td>
                          </tr>
                      </table></td>
                      </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield222232322222" type="text" class="input_form1" style="width:50px"></td>
                          <td width="16" align="center">-</td>
                          <td><input name="textfield2222223322222" type="text" class="input_form1" style="width:50px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">�ǹ�(��) ���� </td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227233" type="text" class="input_form1" style="width:120px">
                          <input name="textfield222272225" type="text" class="input_form1" style="width:30px">
                        ��
                        <input name="textfield2222722224" type="text" class="input_form1" style="width:30px">
                        ȣ</td>
                    </tr>
                    <tr>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272322" type="text" class="input_form1" style="width:100px">
                        <input name="textfield2222722242" type="text" class="input_form1" style="width:40px">
							-
						<input name="textfield22227222232" type="text" class="input_form1" style="width:40px"></td>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield2222323222222" type="text" class="input_form1" style="width:100px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                      
                    </tr>
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
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield222232" type="text" class="input_form1" style="width:70px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          <td width="16" align="center">~</td>
                          <td><input name="textfield2222222" type="text" class="input_form1" style="width:70px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          <td width="20"></td>
                          <td width="74">(�� �����ϼ�)</td>
                          <td><input name="textfield2222322" type="text" class="input_form1" style="width:100px"></td>
                          <td><a href="#"><img src="/img/detail_icon.gif" alt="��" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                      </tr>
                    <tr>
                      <td height="34" colspan="2" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><span class="sub_stan_blue">* ������ ���� </span></td>
                          </tr>
                      </table></td>
                      <td height="34" colspan="2" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><span class="sub_stan_blue">* ����(����) ���� </span></td>
                        </tr>
                      </table></td>
                      </tr>
                    
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                          <tr>
                            <td><input name="textfield22223232222" type="text" class="input_form1" style="width:50px"></td>
                            <td width="16" align="center">-</td>
                            <td><input name="textfield222222332222" type="text" class="input_form1" style="width:50px"></td>
                            <td><a href="#"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
                          </tr>
                      </table></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield22223" type="text" class="input_form1" style="width:70px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          <td width="16" align="center">~</td>
                          <td><input name="textfield222222" type="text" class="input_form1" style="width:70px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                        </tr>
                      </table></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227252" type="text" class="input_form1" style="width:100px">
                        <input name="textfield222272242" type="text" class="input_form1" style="width:100px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">���系�� </td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222922" type="text" class="input_form1" style="width:120px"></td>
                    </tr>
                    
                </table></td>
              </tr>
              <tr>
                  <td height="40" align="right"><a href="#"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a></td>
              </tr>
            </table></td>
          </tr>
          
        </table>
        </div>
        
        
        
        
        



</body>
</html>

