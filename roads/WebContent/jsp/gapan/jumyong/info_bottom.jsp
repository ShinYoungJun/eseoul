<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>    

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
	
	function makeYear(){
		var date = new Date();
		var year = date.getFullYear();
		var productYear = getProductYear();
		
		for(var i=0;i<10;i++)
		{
			document.getElementById("year").options[i]= new Option(year-i);			
			document.getElementById("year").options[i].value = year-i;	
			
			if(productYear != null && productYear == year-i)
				document.getElementById("year").options[i].selected = true;				
		}
	}
	
	function getProductYear()
	{
		return  ${product.year};  
	}
	
	function InitPage()
	{
//		makeYear();
	}
	// 등록폼 체크
	function checkForm(){
		var form1 = document.form1;
		alert(form1.year.value);

		form1.submit();
		//	특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴
		//		w.content.value = w.content.value+' '+'\n';	
		
	}
	
	function submitClick(year1)
	{
		var form1 = document.form1;
		form1.submit();
	}
	
</script>

</head>

<body onload="InitPage();">

<form name="form1" method="post" action = "/jumyong/productInsert.do" >

<%String no = request.getParameter("no");%>

<input name="no" value="${no}" type="hidden" >
<div id="divSub1" style="position:absolute;left:20px; width:100%;background-color:#ffffff;">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="subTabClick('divSub1','divSub1')"> <img src="/img/sub_petition_title4_on.gif" alt="산출내역" width="110" height="22" border="0"> </td>
                  <td width="111" onclick ="subTabClick('divSub1','divSub2')"> <img src="/img/sub_petition_title5_off.gif" alt="현장조사" width="110" height="22" border="0"> </td>
                  <td width="111" onclick ="subTabClick('divSub1','divSub3')"><img src="/img/sub_petition_title6_off.gif" alt="검토협의" width="110" height="22" border="0"> </td>
                  <td width="111" onclick ="subTabClick('divSub1','divSub4')"><img src="/img/sub_petition_title7_off.gif" alt="첨부자료" width="110" height="22" border="0"> </td>
                  <td width="111" onclick ="subTabClick('divSub1','divSub5')"><img src="/img/sub_petition_title8_off.gif" alt="이력정보" width="110" height="22" border="0"> </td>
                </tr>
            </table></td>
          </tr>
          <tr>

            <td class="contborder_purple">
		            <iframe frameborder="NO" border="0" framespacing="0" 
	       		src="/jumyong/productInsert.do?no=<%=no%>" width="100%" height="800" ></iframe>
            </td>
          </tr>
          <tr>
            <td height="40" align="right"><a href="#"><img src="/img/produ_icon.gif" alt="산출조사서" width="84" height="22" border="0"></a><a href="#"><img src="/img/occu_icon.gif" alt="점용허가증" width="84" height="22" border="0"></a><a href="#"><img src="/img/save_icon.gif" alt="전체저장" width="74" height="22" border="0"></a><a href="#"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>

<div id="divSub2" style="position:absolute;left:20px; width:100%;visibility:hidden;;z-index:4;background-color:#ffffff;">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="subTabClick('divSub2','divSub1')"><img src="/img/sub_petition_title4_off.gif" alt="산출내역" width="110" height="22" border="0"> </td>
                  <td width="111" onclick ="subTabClick('divSub2','divSub2')"><img src="/img/sub_petition_title5_on.gif" alt="현장조사" width="110" height="22" border="0"> </td>
                  <td width="111" onclick ="subTabClick('divSub2','divSub3')"><img src="/img/sub_petition_title6_off.gif" alt="검토협의" width="110" height="22" border="0"> </td>
                  <td width="111" onclick ="subTabClick('divSub2','divSub4')"><img src="/img/sub_petition_title7_off.gif" alt="첨부자료" width="110" height="22" border="0"> </td>
                  <td width="111" onclick ="subTabClick('divSub2','divSub5')"><img src="/img/sub_petition_title8_off.gif" alt="이력정보" width="110" height="22" border="0"> </td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple">
            
            
             <iframe frameborder="NO" border="0" framespacing="0" 
	       		src="/jumyong/inspectEdit.do?no=<%=no%>" width="100%" height="400" >	       		
       		</iframe>
       		
       		
       		
            </td>
          </tr>
          <tr>
            <td height="40" align="right"><a href="#"><img src="/img/produ_icon.gif" alt="산출조사서" width="84" height="22" border="0"></a><a href="#"><img src="/img/occu_icon.gif" alt="점용허가증" width="84" height="22" border="0"></a><a href="#"><img src="/img/save_icon.gif" alt="전체저장" width="74" height="22" border="0"></a><a href="#"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>

<div id="divSub3" style="position:absolute;left:20px; width:100%;visibility:hidden;;z-index:3;background-color:#ffffff;">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="subTabClick('divSub3','divSub1')"><img src="/img/sub_petition_title4_off.gif" alt="산출내역" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub3','divSub2')"><img src="/img/sub_petition_title5_off.gif" alt="현장조사" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub3','divSub3')"><img src="/img/sub_petition_title6_on.gif" alt="검토협의" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub3','divSub4')"><img src="/img/sub_petition_title7_off.gif" alt="첨부자료" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub3','divSub5')"><img src="/img/sub_petition_title8_off.gif" alt="이력정보" width="110" height="22" border="0"></td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple">
             <iframe frameborder="NO" border="0" framespacing="0" 
	       		src="/jumyong/confEdit.do?no=<%=no%>" width="100%" height="400" >	       		
       		</iframe>
            </td>
          </tr>
          <tr>
            <td height="40" align="right"><a href="#"><img src="/img/produ_icon.gif" alt="산출조사서" width="84" height="22" border="0"></a><a href="#"><img src="/img/occu_icon.gif" alt="점용허가증" width="84" height="22" border="0"></a><a href="#"><img src="/img/save_icon.gif" alt="전체저장" width="74" height="22" border="0"></a><a href="#"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>

<div id="divSub4" style="position:absolute;left:20px; width:100%;visibility:hidden;;z-index:2;background-color:#ffffff;">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="subTabClick('divSub4','divSub1')"><img src="/img/sub_petition_title4_off.gif" alt="산출내역" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub4','divSub2')"><img src="/img/sub_petition_title5_off.gif" alt="현장조사" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub4','divSub3')"><img src="/img/sub_petition_title6_off.gif" alt="검토협의" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub4','divSub4')"><img src="/img/sub_petition_title7_on.gif" alt="첨부자료" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub4','divSub5')"><img src="/img/sub_petition_title8_off.gif" alt="이력정보" width="110" height="22" border="0"></td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td height="28" colspan="7" bgcolor="#FFFFFF" class="table_bl_left"><span class="sub_stan_blue">* 위치정보</span></td>
                      </tr>
                    <tr>
                      <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">세부면적</td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">가로</td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">세로</td>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지 상세설명 </td>
                      <td width="90" align="center" bgcolor="e5eff8" class="sub_table_b">점용위치</td>
                      <td width="90" align="center" bgcolor="e5eff8" class="sub_table_b">기능 </td>
                      </tr>
                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                      <td height="26" align="center"><a href="#" class="inqu">2</a></td>
                      <td align="center"><a href="#" class="inqu">4</a></td>
                      <td align="center"><a href="#" class="inqu">2</a></td>
                      <td align="center"><a href="#" class="inqu">2</a></td>
                      <td align="center"><a href="#" class="inqu">주유소 입구 </a></td>
                      <td align="center"><a href="#" class="inqu"><img src="/img/loca_icon.gif" alt="위치확인" width="64" height="18" border="0"></a></td>
                      <td align="center"><a href="#" class="inqu"><img src="/img/mod_icon2.gif" alt="수정" width="34" height="18" border="0"></a><a href="#" class="inqu"><img src="/img/del_icon.gif" alt="삭제" width="34" height="18" border="0"></a></td>
                      </tr>
                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                      <td height="26" align="center">&nbsp;</td>
                      <td align="center">&nbsp;</td>
                      <td align="center">&nbsp;</td>
                      <td align="center">&nbsp;</td>
                      <td align="center">&nbsp;</td>
                      <td align="center">&nbsp;</td>
                      <td align="center">&nbsp;</td>
                      </tr>
                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                      <td height="26" align="center">-</td>
                      <td align="center"><input name="textfield22223232232" type="text" class="input_form1" style="width:40px"></td>
                      <td align="center"><input name="textfield22223232233" type="text" class="input_form1" style="width:40px"></td>
                      <td align="center"><input name="textfield22223232234" type="text" class="input_form1" style="width:40px"></td>
                      <td align="center"><input name="textfield22223232235" type="text" class="input_form1" style="width:150px"></td>
                      <td align="center"><a href="#" class="inqu"><img src="/img/loca_icon2.gif" alt="위치등록" width="64" height="18" border="0"></a></td>
                      <td align="center"><a href="#" class="inqu"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a></td>
                      </tr>
                </table></td>
              </tr>
              <tr>
                <td height="40" align="center"><table border="0" cellpadding="0" cellspacing="0">
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
              </tr>
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td height="28" colspan="6" bgcolor="#FFFFFF" class="table_bl_left"><span class="sub_stan_blue">* 첨부파일</span></td>
                    </tr>
                  <tr>
                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">자료유형</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">자료설명</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">첨부파일명</td>
                    <td width="90" align="center" bgcolor="e5eff8" class="sub_table_b">파일크기</td>
                    <td width="90" align="center" bgcolor="e5eff8" class="sub_table_b">기능</td>
                    </tr>
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center"><a href="#" class="inqu">2</a></td>
                    <td align="center"><a href="#" class="inqu">현장사진</a></td>
                    <td align="center"><a href="#" class="inqu">점용지 측면사진 </a></td>
                    <td align="center"><a href="#" class="inqu">54511324112345.jpg</a></td>
                    <td align="center"><a href="#" class="inqu">1,024 KB </a></td>
                    <td align="center"><a href="#" class="inqu"><img src="/img/mod_icon2.gif" alt="수정" width="34" height="18" border="0"></a><a href="#" class="inqu"><img src="/img/del_icon.gif" alt="삭제" width="34" height="18" border="0"></a></td>
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
                    <td height="26" align="center">-</td>
                    <td align="center"><span class="table_bl_left">
                      <select name="select7" class="related" style="width:80px" >
                        <option>선택</option>
                                            </select>
                    </span></td>
                    <td align="center"><input name="textfield222232322353" type="text" class="input_form1" style="width:120px"></td>
                    <td align="center"><input name="textfield222232322352" type="text" class="input_form1" style="width:150px"></td>
                    <td align="center"><a href="#" class="inqu"><img src="/img/file_icon.gif" alt="파일찾기" width="64" height="18" border="0"></a></td>
                    <td align="center"><a href="#" class="inqu"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a></td>
                    </tr>
                </table></td>
              </tr>
              <tr>
                <td height="40" align="center"><table border="0" cellpadding="0" cellspacing="0">
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
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="40" align="right"><a href="#"><img src="/img/produ_icon.gif" alt="산출조사서" width="84" height="22" border="0"></a><a href="#"><img src="/img/occu_icon.gif" alt="점용허가증" width="84" height="22" border="0"></a><a href="#"><img src="/img/save_icon.gif" alt="전체저장" width="74" height="22" border="0"></a><a href="#"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>




<div id="divSub5" style="position:absolute;left:20px; width:100%;visibility:hidden;;z-index:1;background-color:#ffffff;">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="subTabClick('divSub5','divSub1')"><img src="/img/sub_petition_title4_off.gif" alt="산출내역" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub5','divSub2')"><img src="/img/sub_petition_title5_off.gif" alt="현장조사" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub5','divSub3')"><img src="/img/sub_petition_title6_off.gif" alt="검토협의" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub5','divSub4')"><img src="/img/sub_petition_title7_off.gif" alt="첨부자료" width="110" height="22" border="0"></td>
                  <td width="111" onclick ="subTabClick('divSub5','divSub5')"><img src="/img/sub_petition_title8_on.gif" alt="이력정보" width="110" height="22" border="0"></td>
                </tr>
            </table></td>
          </tr>

          <tr>
            <td height="40" align="right"><a href="#"><img src="/img/produ_icon.gif" alt="산출조사서" width="84" height="22" border="0"></a><a href="#"><img src="/img/occu_icon.gif" alt="점용허가증" width="84" height="22" border="0"></a><a href="#"><img src="/img/save_icon.gif" alt="전체저장" width="74" height="22" border="0"></a><a href="#"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
</div>


</form>

</body>
</html>

