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
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script>

function getId(value1)
{
	return document.getElementById(value1).value;
}

	function submitClick()
	{
	
		var s1 = 0;
	
		if(getId("ORGANIZATION") == "" && getId("MANAGE_DEPT") == "" 
		&& getId("MANAGER") == "" && getId("TEL1") == "" && getId("HP1") == "" && getId("CONF_COMMENT") == "" )
		{ 
			if(confirm("입력 항목이 없습니다. 그래도 저장하시겠습니까?"))
			{
				s1 = 1;
			}
		}else
		{
			s1 = 1;
		}
		if(document.getElementById("CONF_COMMENT").maxlength < document.getElementById("CONF_COMMENT").value.length){
			alert(document.getElementById("CONF_COMMENT").maxlength+"자 이상 내용을 넣을 수 없습니다.");
			return;
		}
		
		if(s1 == 1)		//저장변수가 1(저장함)이면 
		{
			var confForm = document.confForm;		
			var mode = document.getElementById("mode").value;
			
			var hp1 ="";
			var hp2 ="";
			var hp3 ="";
			
			var tel1 ="";
			var tel2 ="";
			var tel3 ="";
	
			hp1 = document.getElementById("HP1").value;		
			tel1 = document.getElementById("TEL1").value;
			
			if(mode == "add")
			{
				hp2 = document.getElementById("HP2").value;
				hp3 = document.getElementById("HP3").value;				
				
				tel2 = document.getElementById("TEL2").value;
				tel3 = document.getElementById("TEL3").value;			
			}
	
			document.getElementById("HP").value =  removeDash(hp1+hp2+hp3);
			document.getElementById("TEL").value =  removeDash(tel1+tel2+tel3);
			confForm.submit();		
		}
		
	}
	
	
	
	
	function InitPage()
	{	
		
		if(document.getElementById("mode").value == "add"  )
		{	
			if("${SECTION}"!="4")
			document.getElementById("cancel_edit").style.display = "none";
			document.getElementById("edit").style.display = "block";
			document.getElementById("view").style.display = "none";
		
		}else if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
		{			
			document.getElementById("edit").style.display = "block";
			document.getElementById("view").style.display = "none";
		}else
		{
			document.getElementById("edit").style.display = "none";
			document.getElementById("view").style.display = "block";
		}

	}
	// 등록폼 체크
	function checkForm(){
		var form1 = document.form1;


		form1.submit();
		//	특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴
		//		w.content.value = w.content.value+' '+'\n';	
		
	}
	
	function onlyNumberInput()
	{
		
		
	 var code = window.event.keyCode;
	 
	 if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110|| code == 189|| code == 109)
	 {
	  	window.event.returnValue = true;
		return;
	 }else 
	 {	 
	 	window.event.returnValue = false;
	 	return;
 	 }
	}
	
	
	function removeDash(num)
	{	
		return num.split('-').join("");
	}
	
	//confirm 을 확인,취소-> 예,아니오.
	function window.confirm(str) {

	 execScript('n = msgbox("'+str+'","4132")',"vbscript");
	 return(n == 6);
	}
	
		function goDel(seq)
	{
		var admin_no = "${no}";
	
		if(confirm("정말 삭제하시겠습니까?"))
			location.href("/gapan/jumyong/confDel.do?admin_no="+admin_no+"&seq="+seq);
	}
	

		
	
</script>

</head>

<body onload="InitPage();" >



<form name="confForm" id="confForm" method="post" action = "/gapan/jumyong/confEdit.do" >
<input name="no" value="${no}" type="hidden" >
<input name="mode"  id = "mode" value="${mode}" type="hidden" >
<input name="seq"  id = "seq" value="${seq}" type="hidden" >
<input name="gp_typ"  id = "seq" value="${gp_typ}" type="hidden" >

<div id="view" style="width:100%;">
<table width="780" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			  <td background="/img/tab_line_blue.gif">
				  <img id="conf_img" name="conf_img" src="/img/sub_petition_title6_on.gif" alt="검토협의" width="110" height="22" border="0"  >
  			  </td>
	  	  </tr>           
          <tr>
          	 <td align="center" class="contborder_purple">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
			              <tr>
			                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			                  <tr>
			                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">협의기관</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">협의일자</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화 </td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">협의내용 </td>   
			                    <!-- <td align="center" bgcolor="e5eff8" class="sub_table_b">삭제여부 </td> -->
			                    </tr>
			                   <c:forEach items="${CList}" var="board" varStatus="idx">	                      
			                     <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >
			                        <td height="26" align="center">${idx.count}</td>
			                        <td align="center"
			                      onclick="javascript:location.href('/gapan/jumyong/confEdit.do?no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}');" style="cursor:pointer" >                     
			                        ${board.ORGANIZATION}</td>
			                        <td align="center">${rnic:addDash(board.CONF_DATE)}</td>
			                        <td align="center">${board.MANAGE_DEPT}</td>                        
			                        <td align="center">${board.MANAGER}</td>                                                
			                        <td align="center">${board.TEL}</td>
			                        <td align="center">${board.HP}</td>
			                        <td align="center">${board.CONF_COMMENT}</td>
									<!-- <td align="center"  onclick="javascript:goDel('${board.SEQ}')";" style="cursor:pointer" >
							                        삭제</td>-->
			                      </tr>
							  </c:forEach>             
			                </table></td>
			              </tr>
			              <tr>
			                <td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
			                    <tr>
			                      <td align="center"><table border="0" cellpadding="0" cellspacing="0">
			                        <tr>
			                        <!-- ${strPageDivideForm} -->
			                        </tr>
			                        
			                      </table></td>
			
			                    </tr>
			                    <tr>
			
			
			                    </tr>
			                  </table></td>
			              </tr>
			              
			              <tr>
			                <td>
			                
			                
			                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			                  <tr>
			                    <td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">협의기관</td>
			                    <td width="35%" bgcolor="eaeaea" class="table_bl_left"  align="left">${conf.ORGANIZATION}</td>  
								<td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">협의일자</td>
								<td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left">${conf.CONF_DATE}</td>
			                  </tr>          
			                  <tr>
			                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
			                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">${conf.MANAGE_DEPT}</td>  
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
			                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">${conf.MANAGER}</td>                    
			                  </tr>    
			                  <tr>
			                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
			                    
			                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
			    	                <!-- input name="TEL11" id="TEL11" type="text" class="input_form1" style="width:40px" disabled="true">	-
									<input name="TEL12" id="TEL12" type="text" class="input_form1" style="width:40px" disabled="true">	-
									<input name="TEL13" id="TEL13" type="text" class="input_form1" style="width:40px" disabled="true"-->
									${conf.TEL}
									</td>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" >휴대전화</td>
								<td bgcolor="eaeaea" class="table_bl_left" align="left">
									<!-- input name="HP11" id="HP11" type="text" class="input_form1" style="width:40px" disabled="true">	-
									<input name="HP12" id="HP12" type="text" class="input_form1" style="width:40px" disabled="true">	-
									<input name="HP13" id="HP13" type="text" class="input_form1" style="width:40px" disabled="true"-->
									${conf.HP}
								</td>
							  </tr>
			                  <tr>
			                    <td width="100" height="90" align="center" bgcolor="e5eff8" class="sub_table_b">협의내용</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">${conf.CONF_COMMENT}</td>  
			                  </tr>                       
			                                           
			                </table>
			                
			                
			                
			                </td>
			              </tr>
			             <tr>              
			                <td height="40" align="right">
				                <table border="0" width="100%">
				                	<tr>
				                	<!-- <td >
						                <a href="/gapan/jumyong/confEdit.do?no=${no}&mode=add&currentPage=${currentPage}&countPerPage=${countPerPage}">
						                	<img src="/img/add_icon.gif" alt="추가" border="0">
						                </a>
					                </td>	-->
					                <c:if test="${listSize != '0'}"> 					                
					                <td align="right">
						                <a href="/gapan/jumyong/confEdit.do?no=${no}&mode=edit&seq=${seq}&currentPage=${currentPage}&countPerPage=${countPerPage}">
						                	<img src="/img/mod_icon.gif" alt="수정" border="0">
						                </a>	 		                
					                </td>
					                </c:if>
					                </tr>
					             </table>
							</td>
						</tr>
						</table>
	            </td>
	          </tr>
	</table>
</div>



<div id="edit" style="width:100%;display:none;">

<table width="780" border="0" cellspacing="0" cellpadding="0">   
<tr>
		<td background="/img/tab_line_blue.gif">
			<img id="conf_img" name="conf_img" src="/img/sub_petition_title6_on.gif" alt="검토협의" width="110" height="22" border="0"  >
		</td>
	</tr>       
          <tr>
            <td align="center" class="contborder_purple">

				<table width="100%" border="0" cellspacing="0" cellpadding="0">			            
			              <tr>
			                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			                  <tr>
			                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">협의기관</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">협의일자</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화 </td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">협의내용 </td>   
			                    <!-- <td align="center" bgcolor="e5eff8" class="sub_table_b">삭제여부 </td>-->
			                    </tr>
			                   <c:forEach items="${CList}" var="board" varStatus="idx">	                      
			                     <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >
			                        <td height="26" align="center">${idx.count}</td>
			                        <td align="center"
			                      onclick="javascript:location.href('/gapan/jumyong/confEdit.do?no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}');" style="cursor:pointer" >                     
			                        ${board.ORGANIZATION}</td>
			                        <td align="center">${rnic:addDash(board.CONF_DATE)}</td>
			                        <td align="center">${board.MANAGE_DEPT}</td>                        
			                        <td align="center">${board.MANAGER}</td>                                                
			                        <td align="center">${board.TEL}</td>
			                        <td align="center">${board.HP}</td>
			                        <td align="center">${board.CONF_COMMENT}</td>
								<!-- <td align="center"  onclick="javascript:goDel('${board.SEQ}')";" style="cursor:pointer" >
							                        삭제</td>-->
			                      </tr>
							  </c:forEach>             
			                </table></td>
              </tr>
              <tr>
                <td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td align="center"><table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                        <!-- ${strPageDivideForm} -->
                        </tr>
                        
                      </table></td>

                    </tr>
                    <tr>


                    </tr>
                  </table></td>
              </tr>
              
              <tr>
                <td>
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">협의기관</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
						<spring:bind path="conf.ORGANIZATION">
                    		<input name="ORGANIZATION" id="ORGANIZATION" type="text" class="input_form1" style="width:120px" value="${conf.ORGANIZATION}" maxlength="10">
                    	</spring:bind>
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">협의일자</td>
					<td bgcolor="eaeaea" class="table_bl_left">
	                    <table border="0" cellpadding="0" cellspacing="0" class="sub_stan" align="left">
	                    	<tr>
	                    		<td>
									<spring:bind path="conf.CONF_DATE">                    
										<input name="CONF_DATE" id="CONF_DATE" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${conf.CONF_DATE}" onKeyDown="onlyNumberInput();" maxlength=10 readonly>
									</spring:bind>
								</td>
	                    		<td>	                    			
	                    			<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('CONF_DATE'), 'yyyymmdd');" style="cursor:pointer">
	                    		</td>
	                    	</tr>
	                    </table>
	                </td>      
                  </tr>          
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
						<spring:bind path="conf.MANAGE_DEPT">                    
							<input name="MANAGE_DEPT" id="MANAGE_DEPT" type="text" class="input_form1" style="width:120px" value="${conf.MANAGE_DEPT}"  maxlength="10">
						</spring:bind>
					</td>  
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
                    <td bgcolor="eaeaea" class="table_bl_left"  align="left">
						<spring:bind path="conf.MANAGER">                    
							<input name="MANAGER" id="MANAGER" type="text" class="input_form1" style="width:120px" value="${conf.MANAGER}" maxlength="10">
						</spring:bind>
					</td>                    
                  </tr>
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
                    
                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                    
                    <c:choose>
						<c:when test="${mode == 'add'}">
							<input name="TEL1" id="TEL1" type="text" class="input_form1" style="width:40px;ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=3 onKeyUp="count_check(this, TEL2, 3);">	
							- <input name="TEL2" id="TEL2" type="text" class="input_form1" style="width:40px;ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=4 onKeyUp="count_check(this, TEL3, 4);">		
							- <input name="TEL3" id="TEL3" type="text" class="input_form1" style="width:40px;ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=4>	
						</c:when> 
						<c:otherwise>
							<input name="TEL1" id="TEL1" type="text" class="input_form1" value="${conf.TEL}" 
							style="width:120px;ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=12>	
						</c:otherwise>
					</c:choose>
                    
					<spring:bind path="conf.TEL">
						<input name="TEL" id="TEL" type="hidden" class="input_form1" value="${conf.TEL}" >
					</spring:bind>
						
					</td>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left" align="left">	
						<c:choose>
							<c:when test="${mode == 'add'}">
								<input name="HP1" id="HP1" type="text" class="input_form1" style="width:40px;ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=3  onKeyUp="count_check(this, HP2, 3);">
								- <input name="HP2" id="HP2" type="text" class="input_form1" style="width:40px;ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=4  onKeyUp="count_check(this, HP3, 4);">
								- <input name="HP3" id="HP3" type="text" class="input_form1" style="width:40px;ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=4>
							</c:when> 
							<c:otherwise>
								<input name="HP1" id="HP1" type="text" class="input_form1" value="${conf.HP}" style="width:120px;ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=13>
							</c:otherwise>
						</c:choose>
					

						<spring:bind path="conf.HP">
							<input name="HP" id="HP" type="hidden" class="input_form1" style="width:120px;ime-mode:disabled;" value="${conf.HP}" onKeyDown="onlyNumberInput();" maxlength=11>
						</spring:bind>
						
					</td>
				  </tr>
                  <tr>
                    <td width="100" height="80" align="center" bgcolor="e5eff8" class="sub_table_b">협의내용</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3"  align="left">
						<spring:bind path="conf.CONF_COMMENT">
							<textarea name="CONF_COMMENT" id="CONF_COMMENT" class="input_form1" style="width:600px"  cols="70" rows="5" wrap="VIRTUAL" maxlength="250" style="ime-mode:active;" >${conf.CONF_COMMENT}</textarea>
						</spring:bind>                         
					</td>
                  </tr>                       
                                           
                </table></td>
              </tr>
            
                <tr>
                <td height="40" align="right">
                <c:if test="${SECTION != '4'}">
					<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer; display:" id="cancel_edit">
					<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();"  style="cursor:pointer">
				</c:if>
                </td>
              </tr>
              
            </table>
            
            
            </td>
          </tr>
	</table>            
            
            
</div>

</form>

</body>
</html>

