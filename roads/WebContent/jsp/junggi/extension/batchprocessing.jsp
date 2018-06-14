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

<script>
	function subTabClick(hiddenSubTabName,visibleSubTabName)
	{					
		document.getElementById(hiddenSubTabName).style.visibility = 'hidden';	
		document.getElementById(visibleSubTabName).style.visibility = 'visible';	
	}
	
	
</script>
</head>

<body>
<table>
<tr>
<td>
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
                  <td><img src="/img/sub_periodi_title4.gif" alt="일괄처리" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
             
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                      <tr>
                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">최초등록일</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">최종갱신일</td>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">기능</td>                                                
                      </tr>
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >
					  
                        <td height="26" align="center">1</td>
                        <td align="center"><a href="/jsp/junggi/extension/info.jsp">510-1-100</a></td>                        
                        <td align="center">도로</td>
                        <td align="center">&nbsp;양정석</td>
                        <td align="center">&nbsp;역삼제1동 12-5</td>
                        <td align="center">425</td>
                        <td align="center">&nbsp;2008-05-10 ~ 2008-10-02</td>
                        <td align="center">&nbsp;2006-01-05</td>                        
                        <td align="center">&nbsp;-</td>
                        <td align="center">&nbsp;<a href="#"><img src="/img/del_icon.gif" border="0"></a></td>                        
						
                      </tr>
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                         <td height="26" align="center">2</td>
                        <td align="center"><a href="/jsp/junggi/extension/info.jsp">510-1-101</a></td>                        
                        <td align="center">도로</td>
                        <td align="center">&nbsp;양정석</td>
                        <td align="center">&nbsp;역삼제1동 12-5</td>
                        <td align="center">425</td>
                        <td align="center">&nbsp;2008-05-10 ~ 2008-10-02</td>
                        <td align="center">&nbsp;2006-01-05</td>                        
                        <td align="center">&nbsp;2007-12-25</td>
                        <td align="center">&nbsp;<a href="#"><img src="/img/del_icon.gif" border="0"></a></td>                        
                      </tr>
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                        <td height="26" align="center">3</td>
                        <td align="center"><a href="/jsp/junggi/extension/info.jsp">510-1-102</a></td>                        
                        <td align="center">도로</td>
                        <td align="center">&nbsp;양정석</td>
                        <td align="center">&nbsp;역삼제1동 12-5</td>
                        <td align="center">425</td>
                        <td align="center">&nbsp;2008-05-10 ~ 2008-10-02</td>
                        <td align="center">&nbsp;2006-01-05</td>                        
                        <td align="center">&nbsp;2007-12-25</td>
                        <td align="center">&nbsp;<a href="#"><img src="/img/del_icon.gif"  border="0"></a></td>                        
                      </tr>
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                         <td height="26" align="center">4</td>
                        <td align="center"><a href="/jsp/junggi/extension/info.jsp">510-1-103</a></td>                        
                        <td align="center">도로</td>
                        <td align="center">&nbsp;양정석</td>
                        <td align="center">&nbsp;역삼제1동 12-5</td>
                        <td align="center">425</td>
                        <td align="center">&nbsp;2008-05-10 ~ 2008-10-02</td>
                        <td align="center">&nbsp;2006-01-05</td>                        
                        <td align="center">&nbsp;2007-12-25</td>
                        <td align="center">&nbsp;<a href="#"><img src="/img/del_icon.gif"  border="0"></a></td>                        
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
            <td height="40" align="right">
            <a href="#"><img src="/img/excel_icon3.gif" alt="EXCEL 변환" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
      

     
    </table></td>
  </tr>
  



 
</table>
</td></tr>
<tr><td>
 <div id="divSub1" style="position:absolute;top:380px;width:100%;background-color:#ffffff;z-index:1">
 <!-- 
<div id="divSub1" style="position:absolute;left:20px;top:380px;width:100%;background-color:#ffffff;z-index:1">
 -->
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                 <td width="111" onclick ="subTabClick('divSub1','divSub1')"><a href="#"><img src="/img/sub_periodi_title6_on.gif" alt="안내문" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick ="subTabClick('divSub1','divSub2')"><a href="#"><img src="/img/sub_periodi_title5_off.gif" alt="기간연장" width="110" height="22" border="0"></a></td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_blue">
            
            <table width="100%" border="0" cellspacing="0" cellpadding="0">

                
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">통보년월</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield222232322222" type="text" class="input_form1" style="width:70px"></td>
                          <td width="16" align="center">년</td>
                          <td><input name="textfield2222223322222" type="text" class="input_form1" style="width:50px"></td>
						  <td width="16" align="center">월</td>
                        </tr>
                      </table></td>
                    </tr>
					
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현재 점용기간</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222922" type="text" class="input_form1" style="width:120px"></td>

                      <td align="center" bgcolor="e5eff8" class="sub_table_b">연장 점용기간</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222922" type="text" class="input_form1" style="width:120px"></td>
                    </tr>
					
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222922" type="text" class="input_form1" style="width:120px"></td>

                      <td align="center" bgcolor="e5eff8" class="sub_table_b">연락처</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222922" type="text" class="input_form1" style="width:120px"></td>
                    </tr>
					
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">신청기간</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                          <tr>
                            <td><input name="textfield222242" type="text" class="input_form1" style="width:70px"></td>
                            <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                            <td width="16" align="center">~</td>
                            <td><input name="textfield2222222" type="text" class="input_form1" style="width:70px"></td>
                            <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          </tr>
                      </table></td>

                      <td align="center" bgcolor="e5eff8" class="sub_table_b">신청장소</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222922" type="text" class="input_form1" style="width:120px"></td>
                    </tr>

                  </table></td>
                </tr>
				
		        <tr>
				  <td height="40" align="right">
				  <a href="#"><img src="/img/print_icon4.gif" alt="일괄 출력" width="65" height="18" border="0"></a></td>
		        </tr>	
				
				
            </table>
            </td>
			
          </tr>
          <tr>
            <td height="40" align="right"><a href="#"><img src="/img/occu_icon.gif" alt="점용허가증" width="94" height="22" border="0"></a><a href="#"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>

        
        

<!-- 
<div id="divSub2" style="position:absolute;left:20px;top:380px;width:100%;background-color:#ffffff;visibility:hidden;;z-index:1">
 -->
 <div id="divSub2"  style="position:absolute;top:380px;width:100%;background-color:#ffffff;z-index:1;visibility:hidden">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="subTabClick('divSub2','divSub1')"><a href="#"><img src="/img/sub_periodi_title6_off.gif" alt="안내문" width="110" height="22" border="0"></a></td>
                  <td width="111" onclick ="subTabClick('divSub2','divSub2')"><a href="#"><img src="/img/sub_periodi_title5_on.gif" alt="기간연장" width="110" height="22" border="0"></a></td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_blue">
            
            <table width="100%" border="0" cellspacing="0" cellpadding="0">

                

				
                <tr>
                  <td>
                  
                  <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                      <tr>
                      <td height="26" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">등록일자</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="textfield222232322222" type="text" class="input_form1" style="width:70px">
                          <a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a>
                          
                          </td>
                          
                          
                        </tr>
                      </table></td>
                    </tr>
           
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">연장기간</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					 <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                          <tr>
                            <td><input name="textfield222242" type="text" class="input_form1" style="width:70px"></td>
                            <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                            <td width="16" align="center">~</td>
                            <td><input name="textfield2222222" type="text" class="input_form1" style="width:70px"></td>
                            <td><a href="#"><img src="/img/calendar_icon.gif" width="19" height="16" border="0"></a></td>
                          </tr>
                      </table></td>
                    </tr>
                    			
					<tr>
                      <td height="55" align="center" bgcolor="e5eff8" class="sub_table_b" >비고</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left">

	                      <textarea name="josaOpinion" id="josaOpinion" cols="80" rows="2" wrap="VIRTUAL" style="ime-mode:active;" >
                         </textarea>                    	 
                      
                      </td>
                    </tr>
                    
                    <tr>
                  <td height="40" align="right" width="100%" colspan="4"><a href="#"><img src="/img/save_icon3.gif" alt="일괄저장" width="65" height="18" border="0"></a></td>
              </tr>
					
                    </table>
                  
                  
                  
                  
                  
                  </table></td>
                </tr>
				
               
				
            </table>
            </td>
			
          </tr>
          <tr>
            <td height="40" align="right"><a href="#"><img src="/img/occu_icon.gif" alt="점용허가증" width="94" height="22" border="0"></a><a href="#"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table></div>

</td></tr></table>
</body>
</html>

