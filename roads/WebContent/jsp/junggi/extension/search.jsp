<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
</head>

<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub1_cont1_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td align="left">
    
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
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><img src="/img/sub_periodi_title3.gif" alt="부과조회" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                
					<tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">검색분류</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <select name="select2" class="input_form1" style="width:100px">
                        <option>전체</option>
                      </select></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <select name="select3" class="input_form1" style="width:100px">
                        <option>전체</option>
                      </select></td>
                    </tr>
                    
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조회기간</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
	                      <td width="54">
							<select name="select2" class="input_form1" style="width:100px">
	                        <option>전체</option>
							</select></td>

                          <td>&nbsp;<input name="textfield222232" type="text" class="input_form1" style="width:70px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          <td width="16" align="center">~</td>
                          <td><input name="textfield2222222" type="text" class="input_form1" style="width:70px"></td>
                          <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          <td width="20"></td>
						</tr>
                      </table></td>
                    </tr>
					
                    
					
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <select name="select2" class="input_form1" style="width:100px">
                        <option>전체</option>
                      </select></td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <select name="select3" class="input_form1" style="width:100px">
                        <option>전체</option>
                      </select></td>
                    </tr>
					
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td width="54"><input name="textfield222232322223" type="text" class="input_form1" style="width:50px"></td>
                          <td><input name="textfield2222223322223" type="text" class="input_form1" style="width:350px"></td>
                          <td><a href="#"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                        </tr>
                      </table></td>
                    </tr>
                    
                    
                    
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left">					  
					  <input name="textfield2222722242" type="text" class="input_form1" style="width:130px">
					  </td>
					  
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield2222323222222" type="text" class="input_form1" style="width:130px"></td>
                        </tr>
                      </table></td>
                    </tr>
                    
                    
                    
                    
                    
                    
					
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번 </td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td width="64">ㅇㅇㅇ <span class="sub_stan_b">구</span> </td>
                          <td width="72"><select name="select5" class="input_form1" style="width:70px">
                            <option>법정</option>
                          </select></td>
                          <td><select name="select6" class="input_form1" style="width:70px">
                            <option>행정</option>
							</select></td>
                          <td width="20" align="right">산</td>
                          <td width="30">
                          	<input name="checkbox2" type="checkbox" value="checkbox" checked>
                          </td>
                          <td><input name="textfield222272332" type="text" class="input_form1" style="width:40px"> -
                            <input name="textfield2222723322" type="text" class="input_form1" style="width:40px"> 번지
                            <input name="textfield2222722252" type="text" class="input_form1" style="width:30px"> 통
							<input name="textfield22227222242" type="text" class="input_form1" style="width:30px"> 반
							</td>
                          </tr>
                      </table></td>
                    </tr>
					  
                  
					
               

                </table></td>
              </tr>
 
                <tr>
                  <td height="40" align="right"><a href="#"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0"></a></td>
                </tr>
                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">101</span>건 </td>
                </tr>
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                      <tr>
                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">
                        
                        <a href="#"><img src="/img/select_icon.gif" alt="선택" border="0"></a>
                        </td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">최초등록일</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">최종갱신일</td>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">연장대상</td>                                                
                      </tr>
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >
					  
                        <td height="26" align="center">
                          	<input name="checkbox2" type="checkbox" value="checkbox"></td>
                        <td align="center"><a href="/jsp/junggi/extension/info.jsp">510-1-100</a></td>                        
                        <td align="center">도로</td>
                        <td align="center">&nbsp;양정석</td>
                        <td align="center">&nbsp;역삼제1동 12-5</td>
                        <td align="center">425</td>
                        <td align="center">&nbsp;2008-05-10 ~ 2008-10-02</td>
                        <td align="center">&nbsp;2006-01-05</td>                        
                        <td align="center">&nbsp;-</td>
                        <td align="center">&nbsp;O</td>                        
						
                      </tr>
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                         <td height="26" align="center">
                          	<input name="checkbox2" type="checkbox" value="checkbox"></td>
                        <td align="center"><a href="/jsp/junggi/extension/info.jsp">510-1-101</a></td>                        
                        <td align="center">도로</td>
                        <td align="center">&nbsp;양정석</td>
                        <td align="center">&nbsp;역삼제1동 12-5</td>
                        <td align="center">425</td>
                        <td align="center">&nbsp;2008-05-10 ~ 2008-10-02</td>
                        <td align="center">&nbsp;2006-01-05</td>                        
                        <td align="center">&nbsp;2007-12-25</td>
                        <td align="center">&nbsp;O</td>  
                      </tr>
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                        <td height="26" align="center">
                          	<input name="checkbox2" type="checkbox" value="checkbox"></td>
                        <td align="center"><a href="/jsp/junggi/extension/info.jsp">510-1-102</a></td>                        
                        <td align="center">도로</td>
                        <td align="center">&nbsp;양정석</td>
                        <td align="center">&nbsp;역삼제1동 12-5</td>
                        <td align="center">425</td>
                        <td align="center">&nbsp;2008-05-10 ~ 2008-10-02</td>
                        <td align="center">&nbsp;2006-01-05</td>                        
                        <td align="center">&nbsp;2007-12-25</td>
                        <td align="center">&nbsp;O</td>  
                      </tr>
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                         <td height="26" align="center">
                          	<input name="checkbox2" type="checkbox" value="checkbox"></td>
                        <td align="center"><a href="/jsp/junggi/extension/info.jsp">510-1-103</a></td>                        
                        <td align="center">도로</td>
                        <td align="center">&nbsp;양정석</td>
                        <td align="center">&nbsp;역삼제1동 12-5</td>
                        <td align="center">425</td>
                        <td align="center">&nbsp;2008-05-10 ~ 2008-10-02</td>
                        <td align="center">&nbsp;2006-01-05</td>                        
                        <td align="center">&nbsp;2007-12-25</td>
                        <td align="center">&nbsp;O</td>  
                      </tr>
                  </table></td>
                </tr>
                <tr>
                  <td height="40" align="center"><table border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td><a href="#"><img src="/img/prev_icon2.gif" width="13" height="11" border="0"></a></td>
                        <td><a href="#"><img src="/img/prev_icon.gif" width="12" height="11" border="0"></a></td>
                        <td width="15"></td>
                        <td align="center"><a href="#" class="list">1</a> <a href="#" class="list">2</a> <a href="#" class="list">3</a> <a href="#" class="list">4</a> <a href="#" class="list">5</a> <a href="#" class="list">6</a> <a href="#" class="list">7</a> <a href="#" class="list">8</a> <a href="#" class="list">9</a> </td>
                        <td width="15">&nbsp;</td>
                        <td><a href="#"><img src="/img/next_icon.gif" width="12" height="11" border="0"></a></td>
                        <td><a href="#"><img src="/img/next_icon2.gif" width="13" height="11" border="0"></a></td>
                      </tr>
                  </table></td>
                </tr>
            </table></td>
          </tr>
          
          

         <tr>
            <td height="40" align="right"><a href="/jsp/junggi/extension/batchprocessing.jsp"><img src="/img/levy_icon4.gif" alt="일괄처리" width="74" height="22" border="0"></a><a href="#"><img src="/img/excel_icon.gif" alt="EXCEL 변환" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
      

     
    </table></td>
  </tr>
 
</table>
</body>
</html>

