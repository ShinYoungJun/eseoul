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
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>

<script type="text/javascript">
//<![CDATA[
	
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.action = "search.do?currentPage=" + page;
		form.submit();
	}

	function	View(mul_no)
	{
		var form = document.form;
	
		form.action = "view.do?mul_no=" + mul_no;
		form.submit();
	}

	function	Search()
	{
		var form = document.form;
		form.currentPage.value	= 1;

		form.action = "search.do";
		form.submit();
	}
	
	function	excel_Search()
	{
		var form = document.form;

		form.currentPage.value	= 1;

		form.action = "excel_search.do";
		form.submit();
	}

	function	Select_UseType(sel)
	{

		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value;
	}

	function	Init()
	{	
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
	}

	function checkKeySearch()
	{
		if(event.keyCode == 13) Search();
	}
		
	function SaeweSuipBugwa_Ilgwal()
	{
		var form = document.form;
		
		if(form.TOTALCNT.value <= 0)
		{
			alert("일괄처리할 데이터가 없습니다");
			return;
		}
		
		if(!confirm("일괄처리 하시겠습니까?"))
			return;
		
		form.action = "/gapan/saewe/saeweSuipBugwa_ilgwal.do";
		form.submit();
	}
		
	function	Register()
	{
		var form = document.form;

		form.action = "register.do";
		form.submit();
	}
	
//]]>
</script>

<body onload="Init();">
<form name="form" method="post" action="search.jsp">
<input type="hidden" name="currentPage" value="${currentPage}">
<input type="hidden" name="TOTALCNT" value="${totalcnt }">
<input type="hidden" name="excel" value="">
<input type="hidden" name="message" value="${message}">



<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
    	<td height="43"><img src="/img/sugeo_title.gif" width="800" height="43"></td>
	</tr>
	<tr>
    	<td align="center">
    		<table width="780" border="0" cellspacing="0" cellpadding="0">
<!--    sub7_cont2_title.gif
      <tr>
        <td height="40" align="right">
		<table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="8" colspan="2"></td>
            </tr>
          <tr>
            <td><a href="#"><img src="/img/report_icon.gif" alt="기안문 상신" width="92" height="18" border="0"></a></td>
            <td><a href="#"><img src="/img/help_icon.gif" alt="도움말" width="65" height="18" border="0"></a></td>
            </tr>
        </table>
		</td>
      </tr>
-->
      			<tr>
        			<td height="1" bgcolor="eaeaea"></td>
      			</tr>
      			<tr>
        			<td height="14"></td>
      			</tr>
      
      			<tr>
        			<td align="left">
        				<table width="780" border="0" cellspacing="0" cellpadding="0">
			          		<tr>
			            		<td height="22" background="/img/tab_line_blue.gif">
			            			<table border="0" cellspacing="0" cellpadding="0">
					                	<tr>
					                  		<td><img src="/img/sugeo_on.gif" width="110" height="22"></td>
					                	</tr>
					            	</table>
					            </td>
					    	</tr>
			          
					       	<tr>
				           		<td class="contborder_blue">
				           			<table width="100%" border="0" cellspacing="0" cellpadding="0">
						                <tr>
                  							<td>
                  								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  
				    								<tr>
					  									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">수거일자</td>
					  									<td  bgcolor="eaeaea" class="table_bl_left">
					  										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  											<tr><td>
																<input name="rem_date_from" type="text" class="input_form1" style="width:70px" value="${rem_date_from }"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('rem_date_from'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
																~ <input name="rem_date_to" type="text" class="input_form1" style="width:70px" value="${rem_date_to }"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('rem_date_to'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
																</td></tr>
					  										</table>
					  									</td>
					  									<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">수거물품</td>
					  									<td bgcolor="eaeaea" class="table_bl_left">
					  										<select name="rem_mulcd_search" class="input_form1" style="width:100px" >
																${re_typ }
					  										</select>
					  										<input type="text" class="input_form1" style="width:100px" name="rem_mulnm_search" value="${rem_mulnm_search }">
					  									</td>
				    								</tr>
                  	
													<tr>
					  									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">수거위치</td>
	                  									<td bgcolor="eaeaea" class="table_bl_left">
	                  										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                  											<tr>
	                  												<td>${gu_nm } &nbsp;</td>
	                  												<td>
	                  													<select name="rem_bjcd_search" class="input_form1" style="width:100px">
	                           												${bjdong_code }
	                        											</select>
	                        										</td>
												               		<td>&nbsp;
												               			<!-- select name="rem_hjcd_search" class="input_form1" style="width:100px">
											                            	${hjdong_code}
												                        </select-->
												                    </td>
	                    										</tr>
															</table>
														</td>
					  									<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
					  									<td bgcolor="eaeaea" class="table_bl_left">
					  										<input type="text" class="input_form1" style="width:100px" name="rem_addr_search" value="${rem_addr_search }">
					  									</td>
													</tr>
                    
													<tr>
								<!-- 				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
													  <td bgcolor="eaeaea" class="table_bl_left"><select name="OWNER_SET" class="input_form1" style="width:70px">
														${use_owner_Group}
													  </select></td>  -->
												  		<td td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자명</td>
												  		<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
												  			<input type="text" class="input_form1" style="width:100px" name="rem_nm_search" value="${rem_nm_search }">
					  									</td>					  
													  	<!--  td align="center" bgcolor="e5eff8" class="sub_table_b">처리상태</td>
								                      	<td bgcolor="eaeaea" class="table_bl_left">
								                      		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                      										<tr>
																	<td>
																		<select name="goods_status" class="input_form1" style="width:100px">
																			${gd_sta }
																		</select>
																	</td>
	                      										</tr>
                      										</table>
                      									</td-->					  
													</tr>
				
                  								</table>
                  							</td>
					                	</tr>
					                	<tr>
					                  		<td height="32" align="right"><a href="javascript:Search()"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0"></a></td>
					                	</tr>
					
					                	<tr>
					                  		<td height="1" bgcolor="#EAEAEA"></td>
					                	</tr>
					                	<tr>
					                  		<td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue"></span>${totalcnt } 건 </td>
					                	</tr>
                						<tr>
                  							<td>
                  								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							                    	<tr>
								                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">수거일자</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">수거위치</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">소유자명</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">수거물품</td>
								                        <!-- td align="center" bgcolor="e5eff8" class="sub_table_b">처리상태</td-->
							                      	</tr>
							                                           
													<c:choose>
													<c:when test='${blist != null && !empty blist}'>
														<c:forEach items="${blist}" var="board" varStatus="idx">
														<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer"
															onclick="View('${board.mul_no }')">
															<td height="26" align="center">${board.RN}</td>
															<td align="center">${board.rem_date}</td>
															<td align="center">${board.rem_bjcd}</td>
															<td align="center">${board.rem_addr}</td>
															<td align="center">${board.rem_nm}</td>
															<td align="center">${board.rem_mulnm}</td>
															<!-- td align="center"></td-->
														</tr>
														</c:forEach>
													</c:when>
													<c:otherwise>
														<tr>
															<td align="center" class="sub_table" colspan="7" height="85"> 내용이 없습니다</td>
														</tr>
													</c:otherwise>
													</c:choose>
												 
												</table>
					 						</td>
                						</tr>
				
                						<tr>
                  							<td height="30" align="center">
                  								<table border="0" cellspacing="0" cellpadding="0">
				                      				<tr>
														${pageing }
				                      				</tr>
				                  				</table>
				                  			</td>
						                </tr>
				
						            </table>
						   		</td>
					      	</tr>
				          	<tr>
				            	<td height="40" align="right">
				            		<!-- a href="javascript:"><img src="../../../img/levy_icon.gif" alt="세외수입부과" border="0"></a>
				            		<a href="javascript:SaeweSuipBugwa_Ilgwal()"><img src="../../../img/print_icon2.gif" alt="허가증출력" border="0"></a-->
				            		
				            		<a href="javascript:Register()"><img src="../../../img/newregi_icon.gif" alt="신규등록" border="0"></a>
				           			<img src="../../../img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:hand">
				            	</td>
				          	</tr>
				        </table>
				    </td>
				</tr>

  				<tr>
  					<td>
  					</td>
 	 			</tr>
			</table>
		</td>         


</body>
<script language="javascript">
<!--
	//select의 option을 선택된 값으로 지정
	function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	}
	setSelectedOption(document.form.rem_mulcd_search, '${param.rem_mulcd_search}');
	setSelectedOption(document.form.rem_bjcd_search, '${param.rem_bjcd_search}');
	//setSelectedOption(document.form.rem_hjcd_search, '${param.rem_hjcd_search}');
	//setSelectedOption(document.form.goods_status, '${param.goods_status}');
//-->
</script>
</html>