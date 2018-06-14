<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
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
	<!--상단 기안문상신,도움말 메뉴-->
		<table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="8" colspan="2"></td>
            </tr>
          <tr>
            <td><a href="#"><img src="/img/report_icon.gif" alt="기안문 상신" width="92" height="18" border="0"></a></td>
            <td><a href="#"><img src="/img/help_icon.gif" alt="도움말" width="65" height="18" border="0"></a></td>
            </tr>
        </table>
	<!--상단 기안문상신,도움말 메뉴-->		</td>
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


    <div id="topTapDiv1" style="position:absolute;left:20px;top:80px;width:100%;background-color:#ffffff;z-index:3">
    <table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick="subTabClick('topTapDiv1','topTapDiv1');"><a href="#"><img src="/img/sub_periodi_title2.gif" alt="부과정보" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick="subTabClick('topTapDiv1','topTapDiv2');"><a href="#"><img src="/img/sub_petition_title2_off_b.gif" alt="점용인 정보" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick="subTabClick('topTapDiv1','topTapDiv3');"><a href="#"><img src="/img/sub_petition_title3_off_b.gif" alt="점용지 정보" width="110" height="22" border="0"></a></td>
                  <td align="right" class="sub_stan">관리번호 : ******_*_***** </td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">기준연도</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">요율</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료 </td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료 </td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조종 점용료 </td>
                    </tr>
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center"><a href="#" class="inqu">107</a></td>
                    <td align="center"><a href="#" class="inqu">2008년</a></td>
                    <td align="center"><a href="#" class="inqu">8,500,000원</a></td>
                    <td align="center"><a href="#" class="inqu">8㎡</a></td>
                    <td align="center"><a href="#" class="inqu">0.0025</a></td>
                    <td align="center"><a href="#" class="inqu">2008-01-01~2008-12-31</a></td>
                    <td align="center"><a href="#" class="inqu">1,335,100원</a></td>
                    <td align="center"><a href="#" class="inqu">1,335,100원</a></td>
                    <td align="center"><a href="#" class="inqu">1,335,100원</a></td>
                    </tr>
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
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
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    </tr>
                </table></td>
              </tr>
              <tr>
                <td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
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
                      <td align="right"><a href="#"><img src="/img/excel_icon3.gif" alt="EXCEL" width="64" height="18" border="0"></a></td>
                    </tr>
                  </table></td>
              </tr>
              
              
              
              
              
              
              
              
              
              
              
              
              
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  
                  
                   <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
                    <td bgcolor="eaeaea" class="table_bl_left" align="center">
	                    <select name="select" class="input_form1" style="width:130px">
	                        <option>선택하세요</option>
    	                    <option>1</option>
        	                <option>2</option>
            	            <option>3</option>
                	        <option>4</option>
                    	    <option>5</option>
                       </select>
					</td>                     
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
                    <td bgcolor="eaeaea" class="table_bl_left" align="center">
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
	                   <a href="#"><img src="/img/inquiry_icon2.gif" alt="상세" width="56" height="18" border="0"></a>
	                   
	                   
					</td> 
                  </tr> 
                  
                   <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
                    <td bgcolor="eaeaea" class="table_bl_left" align="center">
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                     
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출요율</td>
                    <td bgcolor="eaeaea" class="table_bl_left" align="center">
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td> 
                  </tr> 
                  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
                    <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield22224" type="text" class="input_form1" style="width:80px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          <td width="16" align="center">~</td>
                          <td><input name="textfield222222" type="text" class="input_form1" style="width:80px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                        </tr>
                    </table></td>
                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
                    <td bgcolor="eaeaea" class="table_bl_left">
                    	<input name="textfield22224" type="text" class="input_form1" style="width:100px">
					</td>
                  </tr>
                  
                   <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
                    <td bgcolor="eaeaea" class="table_bl_left" align="center">
	                   <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
                    <td bgcolor="eaeaea" class="table_bl_left" align="center">
	                    <select name="select" class="input_form1" style="width:130px">
		                        <option>선택하세요</option>
		                        <option>1</option>
		                        <option>2</option>
		                        <option>3</option>
		                        <option>4</option>
		                        <option>5</option>
		                       </select>
					</td>                   
                  </tr>  
                  <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과세년월</td>
                    <td bgcolor="eaeaea" class="table_bl_left" align="center">
	                   <select name="select" class="input_form1" style="width:70px">
		                        <option>선택하세요</option>
		                        <option>2001</option>
		                        <option>2002</option>
		                        <option>2003</option>
		                        <option>2004</option>
		                        <option>2005</option>
		                       </select>년
		                        <select name="select" class="input_form1" style="width:70px">
		                        <option>선택하세요</option>
		                        <option>1</option>
		                        <option>2</option>
		                        <option>3</option>
		                        <option>4</option>
		                        <option>5</option>
		                       </select>월
					</td>                     
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
                    <td bgcolor="eaeaea" class="table_bl_left" align="center">
	                    <select name="select" class="input_form1" style="width:130px">
		                        <option>선택하세요</option>
		                        <option>1</option>
		                        <option>2</option>
		                        <option>3</option>
		                        <option>4</option>
		                        <option>5</option>
		                       </select>
					</td> 
                  </tr> 
                  
                </table></td>
              </tr>
              
            
              <tr>              
                <td height="40" align="right">
                

                <a href="#"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a></td>
              </tr>
            </table></td>
          </tr>
         
        </table></td>
      </tr>
</table>
        </div>          

        <div id="topTapDiv2" style="position:absolute;left:20px;top:80px;width:100%;background-color:#ffffff;visibility:hidden;z-index:2">
     <table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="111" onclick="subTabClick('topTapDiv2','topTapDiv1');"><a href="#"><img src="/img/sub_periodi_title2_off.gif" alt="부과정보" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick="subTabClick('topTapDiv2','topTapDiv2');"><a href="#"><img src="/img/sub_petition_title2_on_b.gif" alt="점용인 정보" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick="subTabClick('topTapDiv2','topTapDiv3');"><a href="#"><img src="/img/sub_petition_title3_off_b.gif" alt="점용지 정보" width="110" height="22" border="0"></a></td>
                  <td align="right" class="sub_stan">관리번호 : ******_*_***** </td>

                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22229" type="text" class="input_form1" style="width:120px"></td>
                      <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222722232" type="text" class="input_form1" style="width:60px">
-
  <input name="textfield22227222223" type="text" class="input_form1" style="width:60px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272223" type="text" class="input_form1" style="width:60px">
-
  <input name="textfield2222722222" type="text" class="input_form1" style="width:60px">
-
<input name="textfield22227222222" type="text" class="input_form1" style="width:60px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">업종/업태</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222722233" type="text" class="input_form1" style="width:60px">
/
  <input name="textfield22227222224" type="text" class="input_form1" style="width:100px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield222232322" type="text" class="input_form1" style="width:50px"></td>
                          <td width="16" align="center">-</td>
                          <td><input name="textfield2222223322" type="text" class="input_form1" style="width:50px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                          </tr>
                      </table></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 주소</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272" type="text" class="input_form1" style="width:100px">
                        <input name="textfield2222722" type="text" class="input_form1" style="width:100px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222283" type="text" class="input_form1" style="width:120px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222723" type="text" class="input_form1" style="width:100px">
                        <input name="textfield22227222" type="text" class="input_form1" style="width:40px">
                        -
                        <input name="textfield222272222" type="text" class="input_form1" style="width:40px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222722234" type="text" class="input_form1" style="width:40px">
-
  <input name="textfield22227222225" type="text" class="input_form1" style="width:40px">
-
<input name="textfield222272222222" type="text" class="input_form1" style="width:40px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
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
                            <td><span class="sub_stan_blue">* 우편물 송달지</span> : </td>
                            <td width="16"><input name="checkbox" type="checkbox" value="checkbox" checked></td>
                            <td width="110">점용인 정보와 동일 </td>
                            </tr>
                        </table>
                        </td>
                      </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편물 수령인 </td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="textfield2223" type="text" class="input_form1" style="width:120px"></td>
                      </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield2222323222" type="text" class="input_form1" style="width:50px"></td>
                          <td width="16" align="center">-</td>
                          <td><input name="textfield22222233222" type="text" class="input_form1" style="width:50px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222724" type="text" class="input_form1" style="width:100px">
                        <input name="textfield22227223" type="text" class="input_form1" style="width:100px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222832" type="text" class="input_form1" style="width:120px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227232" type="text" class="input_form1" style="width:100px">
                        <input name="textfield222272224" type="text" class="input_form1" style="width:40px">
-
<input name="textfield2222722223" type="text" class="input_form1" style="width:40px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227222344" type="text" class="input_form1" style="width:40px">
-
  <input name="textfield222272222254" type="text" class="input_form1" style="width:40px">
-
<input name="textfield2222722222224" type="text" class="input_form1" style="width:40px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227222345" type="text" class="input_form1" style="width:40px">
-
  <input name="textfield222272222255" type="text" class="input_form1" style="width:40px">
-
<input name="textfield2222722222225" type="text" class="input_form1" style="width:40px"></td>
				</tr>
                  </table></td>
                </tr>
                <tr>
                  <td height="40" align="right"><a href="#"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a></td>
                </tr>
            </table></td>
          </tr>          
          
        </table>
        
        </div>  
        
        
        
        <div id="topTapDiv3" style="position:absolute;left:20px;top:80px;width:100%;background-color:#ffffff;visibility:hidden;;z-index:1">
        
        
		<table width="780" border="0" cellspacing="0" cellpadding="0" >
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="111" onclick="subTabClick('topTapDiv3','topTapDiv1');"><a href="#"><img src="/img/sub_periodi_title2_off.gif" alt="부과정보" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick="subTabClick('topTapDiv3','topTapDiv2');"><a href="#"><img src="/img/sub_petition_title2_off_b.gif" alt="점용인 정보" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick="subTabClick('topTapDiv3','topTapDiv3');"><a href="#"><img src="/img/sub_petition_title3_on_b.gif" alt="점용지 정보" width="110" height="22" border="0"></a></td>
                  <td align="right" class="sub_stan">관리번호 : ******_*_***** </td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><select name="select" class="input_form1" style="width:130px">
                        <option>선택하세요</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                                            </select></td>
                      <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><select name="select4" class="input_form1" style="width:130px">
                        <option>선택하세요</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                      </select></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
                      <td bgcolor="eaeaea" class="table_bl_left"> <input name="textfield2222723322" type="text" class="input_form1" style="width:40px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
                      <td bgcolor="eaeaea" class="table_bl_left"> <input name="textfield2222723322" type="text" class="input_form1" style="width:40px"></td>
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번 </td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td width="72"><input name="textfield222232322222" type="text" class="input_form1" style="width:50px">구 </td>
                          <td width="72"><select name="select5" class="input_form1" style="width:70px">
                            <option>법정</option>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                                                    </select></td>
                          <td><select name="select6" class="input_form1" style="width:70px">
                            <option>행정</option>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                                                                              </select></td>
                          <td width="20" align="right">산</td>
                          <td width="30"><input name="checkbox2" type="checkbox" value="checkbox" checked></td>
                          <td><input name="textfield222272332" type="text" class="input_form1" style="width:40px">
                            -
                              <input name="textfield2222723322" type="text" class="input_form1" style="width:40px">
                              번지
                              <input name="textfield2222722252" type="text" class="input_form1" style="width:30px">
통
<input name="textfield22227222242" type="text" class="input_form1" style="width:30px"> 
반
</td>
                          </tr>
                      </table></td>
                      </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield222232322222" type="text" class="input_form1" style="width:50px"></td>
                          <td width="16" align="center">-</td>
                          <td><input name="textfield2222223322222" type="text" class="input_form1" style="width:50px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보 </td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227233" type="text" class="input_form1" style="width:120px">
                          <input name="textfield222272225" type="text" class="input_form1" style="width:30px">
                        동
                        <input name="textfield2222722224" type="text" class="input_form1" style="width:30px">
                        호</td>
                    </tr>
                    <tr>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272322" type="text" class="input_form1" style="width:100px">
                        <input name="textfield2222722242" type="text" class="input_form1" style="width:40px">
							-
						<input name="textfield22227222232" type="text" class="input_form1" style="width:40px"></td>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주차면수</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield2222323222222" type="text" class="input_form1" style="width:100px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                      
                    </tr>
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td width="54"><input name="textfield222232322223" type="text" class="input_form1" style="width:50px"></td>
                          <td><input name="textfield2222223322223" type="text" class="input_form1" style="width:350px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                      </tr>
                    
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield222232" type="text" class="input_form1" style="width:70px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          <td width="16" align="center">~</td>
                          <td><input name="textfield2222222" type="text" class="input_form1" style="width:70px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          <td width="20"></td>
                          <td width="74">(총 점용일수)</td>
                          <td><input name="textfield2222322" type="text" class="input_form1" style="width:100px"></td>
                          <td><a href="#"><img src="/img/detail_icon.gif" alt="상세" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                      </tr>
                    <tr>
                      <td height="34" colspan="2" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><span class="sub_stan_blue">* 인접지 정보 </span></td>
                          </tr>
                      </table></td>
                      <td height="34" colspan="2" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><span class="sub_stan_blue">* 공사(굴착) 정보 </span></td>
                        </tr>
                      </table></td>
                      </tr>
                    
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                          <tr>
                            <td><input name="textfield22223232222" type="text" class="input_form1" style="width:50px"></td>
                            <td width="16" align="center">-</td>
                            <td><input name="textfield222222332222" type="text" class="input_form1" style="width:50px"></td>
                            <td><a href="#"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                          </tr>
                      </table></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">공사기간</td>
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
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227252" type="text" class="input_form1" style="width:100px">
                        <input name="textfield222272242" type="text" class="input_form1" style="width:100px"></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">공사내용 </td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222922" type="text" class="input_form1" style="width:120px"></td>
                    </tr>
                    
                </table></td>
              </tr>
              <tr>
                  <td height="40" align="right"><a href="#"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a></td>
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
                  <td width="111" onclick ="subTabClick('divSub1','divSub1')"><a href="#"><img src="/img/sub_petition_title3.gif" alt="정기분 부과" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick ="subTabClick('divSub1','divSub2')"><a href="#"><img src="/img/sub_petition_title8_off.gif" alt="이력정보" width="110" height="22" border="0"></a></td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
            
              
              
              <tr><td class="sub_table_b" align="left"><span class="sub_stan_blue">* 정기분 산출 </span> </td></tr>
              <tr>
              
              
              <tr><td>
              
                
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left" colspan="3">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					                 
                  </tr>    
                    <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>   
                    <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>       
                    
                         
                </table></td>
              </tr>
              
              
              <tr>
                <td height="40" align="right">                <a href="#"><img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0"></a>                </td>
              </tr>
              
              
              
              
              <tr><td class="sub_table_b" align="left"><span class="sub_stan_blue">* 정기분 부과</span> </td></tr>
              <tr>
              
              
              <tr><td>
              
                
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                 <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">본세(점용료)</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left" colspan="3">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					                 
                  </tr>    
                    <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
					
					 <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
                    	 <a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a>
					</td> 
					
					
                  
                    <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기내금액</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기내일자</td>
                     <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
                    	 <a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a>
					</td>                 
                  </tr>             
                    
                    <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
                     <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
                    	 <a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a>
					</td>                   
                  </tr>             
                    
                             
                    
                    <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">가산율구분</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">가산금면제 여부</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>             
                    
                    <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left" colspan="3">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:480px">
					</td>  
                  </tr>             
                    
                    <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">적용 상한율</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">상한회수</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>       
                    <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">특별이율</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">특별이율 사유</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                    	 <input name="textfield22224" type="text" class="input_form1" style="width:120px">
					</td>                    
                  </tr>                
                                                  
                </table></td>
              </tr>
              
            
              <tr>
                <td height="40" align="right">
                 <a href="#"><img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0"></a>             
                <a href="#"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a></td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="40" align="right">
            	<a href="#"><img src="/img/levy_icon.gif" alt="세외수입부과" width="94" height="22" border="0"></a>
            	<a href="#"><img src="/img/notice_icon.gif" alt="고지서발급" width="84" height="22" border="0"></a>
            	<a href="#"><img src="/img/save_icon.gif" alt="전체저장" width="74" height="22" border="0"></a>
            	<a href="#"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>




<div id="divSub2" style="position:absolute;left:20px;top:500px;width:100%;visibility:hidden;;z-index:4">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="subTabClick('divSub2','divSub1')"><a href="#"><img src="/img/sub_petition_title3_off.gif" alt="정기분 부과" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick ="subTabClick('divSub2','divSub2')"><a href="#"><img src="/img/sub_petition_title8_on.gif" alt="이력정보" width="110" height="22" border="0"></a></td>
				</tr>
            </table></td>
          </tr>
          
          <tr>
            <td height="40" align="right">
            	<a href="#"><img src="/img/levy_icon.gif" alt="세외수입부과" width="94" height="22" border="0"></a>
            	<a href="#"><img src="/img/" alt="고지서발급" width="84" height="22" border="0"></a>
            	<a href="#"><img src="/img/save_icon.gif" alt="전체저장" width="74" height="22" border="0"></a>
            	<a href="#"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>

</body>
</html>

