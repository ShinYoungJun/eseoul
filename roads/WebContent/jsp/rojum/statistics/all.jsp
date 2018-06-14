<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
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
		<script language="javascript" src="/js/common.js"></script>
		<script language="javascript" src="/js/PopupCalendar.js"></script>
		<script language="javascript" src="/js/Check_inputbox.js"></script>
		<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
		<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>
		<script language="javascript">
		function fnPreView0()
		{	
			 var oRptMainParam;
             oRptMainParam = rex_GetgoDictionay(); 
             
             var screenHeight = screen.availHeight;
             var screenWidth = 1024;

             // �ɼ� - viewer	
             oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width="+screenWidth+",height="+screenHeight);
	
             // �ʼ� - ������ Ÿ�� ����
             oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

             // �ɼ� - �ٸ� DB�� �����
             oRptMainParam.put("rex_userservice", "oracle_jndi");

			
			var toDate = nr_Date_Cut(document.getElementById("TODATE").value);
			var fix_siguCd = document.getElementById("fix_guCd").value;
	
			
			if(fix_siguCd == '000'){
				fix_siguCd = '';
				// �ʼ� - ����Ʈ��
				oRptMainParam.put("rex_rptname", "rojum_fix_stat");
	
			}else{
				// �ʼ� - ����Ʈ��
				oRptMainParam.put("rex_rptname", "rojum_fix_stat");
			}
	
			oRptMainParam.put("TODATE", toDate);
			oRptMainParam.put("SIGU_CD", fix_siguCd);
	
            // preview �˾� ����
            rex_gfRexRptOpen("popup", oRptMainParam);
	
            return oRptMainParam;
		}
		
		
		function fnPreView1()
		{	
			var isPickup = document.getElementById('pickupChk').checked; //�������� üũ�Ǿ��ִ���
			var oRptMainParam;
            oRptMainParam = rex_GetgoDictionay(); 

            var screenHeight = screen.availHeight;
            var screenWidth = 1024;

            // �ɼ� - viewer	
            oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width="+screenWidth+",height="+screenHeight);
            // �ʼ� - ������ Ÿ�� ����
            oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

            // �ɼ� - �ٸ� DB�� �����
            oRptMainParam.put("rex_userservice", "oracle_jndi");
			// �ɼ� - �Ķ���� ����
			
			var fromDate = document.getElementById("fromDate").value;
			//********** BEGIN_����_20120201_����_1
			// INPUTBOX ID �� toDate ��  �ߺ������Ǿ��ִ� ���� ����
			var toDate = document.getElementById("toDate2").value;
			//********** END_����_20120201_����_1 
			var siguCd = document.getElementById("guCd").value;

			var pickup_fromdate = nr_Date_Cut(document.getElementById("pickup_fromDate").value);
			var pickup_todate = nr_Date_Cut(document.getElementById("pickup_toDate2").value);
						
			var obj = document.getElementsByName("SEARCH_TYPE");
			var searchType;
			for(var i = 0 ;i < obj.length ; i++){
				if(obj[i].checked){
					searchType = obj[i].value;
				}
			}
	
			var quarter = document.getElementById("QUARTER").value;
			var year  = document.getElementById("YEAR").value;
			//********** BEGIN_����_20120201_����_2
			// PERIOD �Ķ���Ϳ� ��¥ �ѱ� �� - ���� �ѱ�� ���ؼ� ������ ������
			// PERIOD �Ķ���Ϳ� �б� �Ǵ� ��¥�����͸� �ѱ�
			var fromDate2 = fromDate;
			var toDate2 = toDate;	
			fromDate = nr_Date_Cut(fromDate);	
			toDate   = nr_Date_Cut(toDate);
			//********** END_����_20120201_����_2 
			
			if(isPickup) {
				if(siguCd == '000'){
					siguCd = '';
					// �ʼ� - ����Ʈ��
					oRptMainParam.put("rex_rptname", "rojum_pickup_all");
		
				}else{
					// �ʼ� - ����Ʈ��
					oRptMainParam.put("rex_rptname", "rojum_pickup");
				}
			} else {
				if(siguCd == '000'){
					siguCd = '';
					// �ʼ� - ����Ʈ��
					oRptMainParam.put("rex_rptname", "rojum_statics_all");
		
				}else{
					// �ʼ� - ����Ʈ��
					oRptMainParam.put("rex_rptname", "rojum_statics");
				}
			}

			if(searchType == '0'){				
				if(quarter == '1'){
					oRptMainParam.put("TOTAL_FROM_DATE", year+"0101");
					oRptMainParam.put("FROM_DATE", year+"0101");
					oRptMainParam.put("TO_DATE", year+"0331");		
				}else if(quarter == '2'){
					oRptMainParam.put("TOTAL_FROM_DATE", year+"0101");
					oRptMainParam.put("FROM_DATE", year+"0401");
					oRptMainParam.put("TO_DATE", year+"0630");
				}else if(quarter == '3'){
					oRptMainParam.put("TOTAL_FROM_DATE", year+"0101");
					oRptMainParam.put("FROM_DATE", year+"0701");
					oRptMainParam.put("TO_DATE", year+"0930");
				}else if(quarter == '4'){
					oRptMainParam.put("TOTAL_FROM_DATE", year+"0101");
					oRptMainParam.put("FROM_DATE", year+"1001");
					oRptMainParam.put("TO_DATE", year+"1231");
				}
				//********** BEGIN_����_20120201_����_2_1
				oRptMainParam.put("PERIOD","("+quarter+"/4�б�"+")");
				//********** END_����_20120201_����_2_1
			}else if(searchType == '1'){
				//********** BEGIN_����_20120201_����_2_2
				// TOTAL_FROM_DATE �� �ʿ��� year�� fromDate���� ������
				if(fromDate.length >= 4){
					year	= fromDate.substr(0, 4);
				}				
				//********** END_����_20120201_����_2_2
				oRptMainParam.put("TOTAL_FROM_DATE", year+"0101");
				oRptMainParam.put("FROM_DATE", fromDate);
				oRptMainParam.put("TO_DATE", toDate);
				//********** BEGIN_����_20120201_����_2_3
				oRptMainParam.put("PERIOD", "(" +fromDate2 + "~" +toDate2+ ")");
				//********** END_����_20120201_����_2_3
			}else if(searchType == '2'){
				//********** BEGIN_����_20120201_����_2_2
				// TOTAL_FROM_DATE �� �ʿ��� year�� fromDate���� ������

				if(fromDate.length >= 4){
					year	= pickup_fromdate.substr(0, 4);
				}
				
				oRptMainParam.put("TOTAL_FROM_DATE", year+"0101");

				oRptMainParam.put("FROM_DATE", '');
				oRptMainParam.put("TO_DATE", '');
				
				/* 201401007 kny �ܼӱⰣ �˻� */
				oRptMainParam.put("PICKUP_FROM_DATE", pickup_fromdate);
				oRptMainParam.put("PICKUP_TO_DATE", pickup_todate);
			}


			oRptMainParam.put("SIGU_CD", siguCd);
	
            // preview �˾� ����
            rex_gfRexRptOpen("popup", oRptMainParam);
	
            return oRptMainParam;
					
		}
	
		function fnPreView2()
		{	
			var oRptMainParam;
            oRptMainParam = rex_GetgoDictionay(); 

            var screenHeight = screen.availHeight;
            var screenWidth = 1024;

            // �ɼ� - viewer	
            oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width="+screenWidth+",height="+screenHeight);
            // �ʼ� - ������ Ÿ�� ����
            oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

            // �ɼ� - �ٸ� DB�� �����
            oRptMainParam.put("rex_userservice", "oracle_jndi");
            
			var siguCd = document.getElementById("guCd").value;
			//********** BEGIN_����_20120317
			var SURVEY_YEAR = document.getElementById("SURVEY_YEAR").value;
			//********** END_����_20120317
			
			if(siguCd == '000')
				siguCd = '';
			
			oRptMainParam = rex_GetgoDictionay(); 
		
			// �ʼ� - ����Ʈ��
			oRptMainParam.put("rex_rptname", "rojum_owner_sum");
			//********** BEGIN_����_20120317
			oRptMainParam.put("SURVEY_YEAR", SURVEY_YEAR);
			//********** END_����_20120317
			
            // preview �˾� ����
            rex_gfRexRptOpen("popup", oRptMainParam);
	
            return oRptMainParam;
				
		}
		
		function fn_search(obj)
		{
			if(obj == '0'){
				fnPreView0();
			}else if(obj == '1'){
				fnPreView1();
			}else if(obj == '2'){
				fnPreView2();
			}		
		}
	
		function init()
		{
			setYear();
			
			setSelectedOption(document.getElementById("guCd"),'${siguCode}');
			setSelectedOption(document.getElementById("fix_guCd"),'${siguCode}');
	
			if('${siguCode}' != '000'){
				document.getElementById("guCd").disabled="disabled";
				document.getElementById("fix_guCd").disabled="disabled";
			}
			//********** BEGIN_����_20120317
	        setYear2(document.getElementById("SURVEY_YEAR"),"${YearVal}");
	        //********** END_����_20120317
			
		}
	
	  	function setYear()
	    {
	        now = new Date();
	        Y = now.getFullYear();
	
	        var strYear = "${YearVal}";
	
	        for(var i = 0 ; i < 10 ; i++){
	            newItem = new Option(i);
	            document.getElementById("YEAR").options[i]  = newItem;
	            document.getElementById("YEAR").options[i].text = Y-i;
	            document.getElementById("YEAR").options[i].value = Y-i;
	            if(strYear == Y-i) document.getElementById("YEAR").options[i].selected = true;
	        }
	
	        document.getElementById("YEAR").options.value = strYear;
	      
	    }

	  //********** BEGIN_����_20120317
	  function setYear2(obj,strYear)
		{
		    now = new Date();
		    Y = now.getFullYear();
		    
		    if(strYear == '' || strYear == null){
		    	strYear = Y;
		    }
		
		    for(var i = 0 ; i < 10 ; i++){
		        newItem = new Option(i);
		        obj.options[i]  = newItem;
		        obj.options[i].text = Y+1-i;
		        obj.options[i].value = Y+1-i;
		        if(strYear == Y+1-i) obj.options[i].selected = true;
		    }
		}
	  //********** END_����_20120317
	  
	    function changeSearchType(val)
	    {
	        if(val == '0'){
				document.getElementById("TYPE_QUARTER").style.display = "block";
				document.getElementById("TYPE_GIGAN").style.display = "none";
				document.getElementById("TYPE_PICKUP").style.display = "none";
	        }else if(val == '1'){
				document.getElementById("TYPE_QUARTER").style.display = "none";
				document.getElementById("TYPE_GIGAN").style.display = "block";
				document.getElementById("TYPE_PICKUP").style.display = "none";
	        }else if(val == '2'){
	        	document.getElementById("TYPE_QUARTER").style.display = "none";
				document.getElementById("TYPE_GIGAN").style.display = "none";
				document.getElementById("TYPE_PICKUP").style.display = "block";
	        }
	    }
</script>
</head>

<body onload="init();">
<form name="form" method="post">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/sub4_cont1_title.gif" width="800" height="43"></td>
	</tr>
	<tr>
		<td align="left">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
			<tr>
				<td height="14"></td>
			</tr>
			<tr>
				<td>
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="22" background="/img/tab_line_blue.gif">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td><img src="/img/sub_stat_title1.gif" alt="��輳��" width="110" height="22"></td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td align="left" class="contborder_blue">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
									<tr>
	                                    <td height="26" align="left" colspan="4">
	                                        <span class="sub_stan_blue">&nbsp; * ����ȯ����� �� ������� </span>
	                                    </td>
									</tr>
									<tr>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�˻�����</td>
										<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
											<input id="TODATE" name="TODATE" type="text" class="input_form1" style="width: 70px" value="${fromDate}">
											<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd')" style="CURSOR: Hand;">
										</td>
									</tr>

									<tr>
										<td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ñ�����</td>
										<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
											<select id="fix_guCd" name="fix_guCd" class="input_form1" style="width: 100px">
												<c:forEach items="${guCdList}" var="list">
													<option value="${list.GU_CD}">${list.GU_NM}</option>
												</c:forEach>
											</select>
										</td>
									</tr>
									<tr>
	                                    <td height="26" align="right" colspan="4">
		                                    <img src="/img/inquiry_icon2.gif" alt="�˻�" width="56" height="18" onclick="fn_search(0);"  border="0" style="cursor:pointer;">
	                                    </td>
									</tr>
									
									<tr>
	                                    <td height="26" align="left" colspan="4">
	                                        <span class="sub_stan_blue">&nbsp; * ����� ��ȸ </span>
	                                    </td>
									</tr>
									<tr>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�˻����</td>
										<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
											<input name="SEARCH_TYPE" type="radio" value="1" onclick="changeSearchType(this.value)" checked>�Ⱓ�� �˻�
											<input name="SEARCH_TYPE" type="radio" value="0" onclick="changeSearchType(this.value)">�б⺰ �˻�
											<input id="pickupChk" name="SEARCH_TYPE" type="radio" value="2" onclick="changeSearchType(this.value)">�����Ϻ� �˻�
										</td>
									</tr>

									<tr>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�˻�����</td>
										<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
										<div id="TYPE_QUARTER" name="TYPE_QUARTER" style="width: 100%; display:none;">
											<select name="YEAR" id="YEAR" class="input_form1" style="width: 130px">
											</select>
											&nbsp;
											<select name="QUARTER" id="QUARTER" class="input_form1" style="width: 130px">
												<option value="1">1/4�б�</option>
												<option value="2">2/4�б�</option>
												<option value="3">3/4�б�</option>
												<option value="4">4/4�б�</option>
											</select>
										</div>

										<div id="TYPE_GIGAN" name="TYPE_GIGAN" style="width: 100%; display:block;">
											<input id="fromDate" name="fromDate" type="text" class="input_form1" style="width: 70px" value="${fromDate}">
											<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd')" style="CURSOR: Hand;">
											 ~ <!-- //********** BEGIN_����_20120201_����_1_1 --><input id="toDate2" name="toDate2" type="text" class="input_form1" style="width: 70px" value="${toDate}">
											<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('toDate2'), 'yyyymmdd')" style="CURSOR: Hand;">
										     <!-- //********** END_����_20120201_����_1_1 -->
										</div>
										
										<div id="TYPE_PICKUP" name="TYPE_PICKUP" style="width: 100%; display:none;">
											<input id="pickup_fromDate" name="pickup_fromDate" type="text" class="input_form1" style="width: 70px" value="${fromDate}">
											<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('pickup_fromDate'), 'yyyymmdd')" style="CURSOR: Hand;">
											 ~ <input id="pickup_toDate2" name="pickup_toDate2" type="text" class="input_form1" style="width: 70px" value="${toDate}">
											<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('pickup_toDate2'), 'yyyymmdd')" style="CURSOR: Hand;">
										</div>
										</td>
									</tr>

									<tr>
										<td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ñ�����</td>
										<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
											<select id="guCd" name="guCd" class="input_form1" style="width: 100px">
												<c:forEach items="${guCdList}" var="list">
													<option value="${list.GU_CD}">${list.GU_NM}</option>
												</c:forEach>
											</select>
										</td>
									</tr>
									<tr>
	                                    <td height="26" align="right" colspan="4">
		                                    <img src="/img/inquiry_icon2.gif" alt="�˻�" width="56" height="18" onclick="fn_search(1);"  border="0" style="cursor:pointer;">
	                                    </td>
									</tr>
									<tr>
	                                    <td height="26" align="left" colspan="2" style="border-right:0px">
	                                        <span class="sub_stan_blue">&nbsp; * �Ÿ����� ���� ��� ��ȸ </span>
	                                    </td>
	                                </tr>
									<!--  //********** BEGIN_����_20120317 -->
									<tr>
										<td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����⵵</td>
										<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
											<select  id="SURVEY_YEAR" name="SURVEY_YEAR" class="input_form1" style="width:130px">
	                                   		</select>
										</td>
									</tr>
									<!--   //********** END_����_20120317 -->
									<tr>
										<td height="26" align="right" style="border-left:0px;" colspan="4">
		                                    <img src="/img/inquiry_icon2.gif" alt="�˻�" width="56" height="18" onclick="fn_search(2);"  border="0" style="cursor:pointer;">
	                                    </td>
									</tr>
								</table>
								</td>
							</tr>

						</table>
						</td>
					</tr>

				</table>
				</td>
			</tr>
			<tr>
				<td height="30"></td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>

