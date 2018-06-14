<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/environment_setting.jsp" %> 
<%@ include file="/jsp/common/loginCheck.jsp" %>
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
                background-image: url(/img/left_back.gif);
            }
            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
        
        <script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
		<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>
		<script language="javascript" src="/js/PopupCalendar.js"></script>
		<script language="javascript" src="/js/Check_inputbox.js"></script>


        <script type="text/javascript">

        	function Init(){

        		var d = new Date();
        			  var s =
        			    leadingZeros(d.getFullYear(), 4) + '-' +
        			    leadingZeros(d.getMonth() + 1, 2) + '-' +
        			    leadingZeros(d.getDate(), 2);
        			  document.getElementById("PUBLISH_DATE").value = s;

        			  calculation_Loan(document.getElementById("GAPAN_PRICE"));
        	
        			            	


        	}

        	function leadingZeros(n, digits) {
        		  var zero = '';
        		  n = n.toString();

        		  if (n.length < digits) {
        		    for (i = 0; i < digits - n.length; i++)
        		      zero += '0';
        		  }
        		  return zero + n;
        	}


        	function calculation_Loan(obj){

        		nr_num(obj);

        		var gapan_price = parseInt(document.getElementById("GAPAN_PRICE").value);
        		

        		if(isNaN(gapan_price)){
    				document.getElementById("LOAN_PRICE_TXT").innerHTML = '0'+" * 0.07 = "+'0';
    				document.getElementById("LOAN_PRICE").value = '0';
				}else{
	        		var result = Math.round(parseFloat(gapan_price * 0.07));
	        	  // sungh83 ��η� 100 ���� //
	    	      //	result = Math.floor(result/10)*10;
	            		result = Math.floor(result/100)*100;	 
	    	      // sungh83 ��η� 100 ���� //		
	        		
					document.getElementById("LOAN_PRICE_TXT").innerHTML = gapan_price+" * 0.07 = "+result;
					document.getElementById("LOAN_PRICE").value = result;
				}
        		


        		

            }

        	function publishPrc(val){

        		var form 	= document.form;
        		var	str		= "";
        		// ������ ����
        		


        		if(val =='contract'){
        			if(form.DOC_NO.value.length	< 1)
            		{
            			str	+= "��µ� ������ȣ�� �Է��ϼ���\n";
            			alert(str);
            			form.DOC_NO.focus();
            		}else if(form.SERVICE_ITEM.value.length	< 1)
            		{
            			str	+= "��µ� ���ǰ���� �Է��ϼ���\n";
            			alert(str);
            			form.SERVICE_ITEM.focus();
            		}else if(form.GAPAN_PRICE.value.length	< 1)
            		{
            			str	+= "��η��� �Է��ϼ���\n";
            			alert(str);
            			form.GAPAN_PRICE.focus();
            		}else{
            			fnRojumContract();
                	}
                		

        			
        		}else{

        			if(form.DOC_NO.value.length	< 1)
            		{
            			str	+= "��µ� ������ȣ�� �Է��ϼ���\n";
            			alert(str);
            			form.DOC_NO.focus();
            		}else if(form.SERVICE_ITEM.value.length	< 1)
            		{
            			str	+= "��µ� ���ǰ���� �Է��ϼ���\n";
            			alert(str);
            			form.SERVICE_ITEM.focus();
            		}else{
            			fnRojumCerty();
                	}
            	}
        		
            }

            function fnRojumContract()
            {
                var oRptMainParam;
                oRptMainParam = rex_GetgoDictionay(); 

                // �ɼ� - viewer	
                oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000");
	
                // �ʼ� - ����Ʈ��
                oRptMainParam.put("rex_rptname", "Rojum_contract");

                // �ʼ� - ������ Ÿ�� ����
                oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

                // �ɼ� - �ٸ� DB�� �����
                oRptMainParam.put("rex_userservice", "oracle_jndi");

                // �ɼ� - �Ķ���� ����
                var form 	= document.form;

                oRptMainParam.put("DOC_NO" ,form.DOC_NO.value);
								oRptMainParam.put("GAPAN_NO" ,form.GAPAN_NO.value);
                oRptMainParam.put("GP_TYP" ,form.GP_TYP.value);
                oRptMainParam.put("USER_ID" ,form.USER_ID.value);
                oRptMainParam.put("SERVICE_ITEM" ,form.SERVICE_ITEM.value);
                oRptMainParam.put("LOAN_PRICE" ,form.LOAN_PRICE.value);
                oRptMainParam.put("PUBLISH_DATE" ,form.PUBLISH_DATE.value);
                
                // preview �˾� ����
                rex_gfRexRptOpen("popup", oRptMainParam);
		
                return oRptMainParam;	
            }
            
            function fnRojumCerty()
            {
                var oRptMainParam;
                oRptMainParam = rex_GetgoDictionay(); 

                // �ɼ� - viewer	
                oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000");
	
                // �ʼ� - ����Ʈ��
                oRptMainParam.put("rex_rptname", "Rojum_Certy");

                // �ʼ� - ������ Ÿ�� ����
                oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

                // �ɼ� - �ٸ� DB�� �����
                oRptMainParam.put("rex_userservice", "oracle_jndi");

                // �ɼ� - �Ķ���� ����
                var form 	= document.form;
	
                oRptMainParam.put("DOC_NO" ,form.DOC_NO.value);
				oRptMainParam.put("GAPAN_NO" ,form.GAPAN_NO.value);
                oRptMainParam.put("GP_TYP" ,form.GP_TYP.value);
                oRptMainParam.put("SERVICE_ITEM" ,form.SERVICE_ITEM.value);
                oRptMainParam.put("PUBLISH_DATE" ,form.PUBLISH_DATE.value);
                oRptMainParam.put("PATH" ,'<%=WebServerURL%>'+'/roadsnas/gapan/');
                

                // preview �˾� ����
                rex_gfRexRptOpen("popup", oRptMainParam);
		
                return oRptMainParam;	
            }
        </script>

    </head>
    <body onload="Init()">
    <form id="form" name="form">
    
        <input name="GAPAN_NO" id="GAPAN_NO" value="${GAPAN_NO}" type="hidden" >
        <input name="GP_TYP"  id = "GP_TYP" value="${GP_TYP}" type="hidden" >
        <input name="USER_ID"  id = "USER_ID" value="${USER_ID}" type="hidden" >
        <input name="LOAN_PRICE" id ="LOAN_PRICE" value="" type="hidden" >
        


        <table width="780" border="0" cellpadding="0" cellspacing="0">


            <tr>
                <td align="left" class="contborder_blue">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td>
                            <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                    <tr>
                                        <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                                         <td bgcolor="eaeaea" class="table_bl_left">
                                         	<input id="DOC_NO" name="DOC_NO" type="text" class="input_form1" style="width:160px"  value="${GAPAN_NO}"  maxlength="20">
                                       	 </td>
                                        <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�߱���</td>
                                        <td width="" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td><input id="PUBLISH_DATE"  name="PUBLISH_DATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
                                                    <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('PUBLISH_DATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
                                                </tr>
                                            </table></td>
                                    </tr>

                                    <tr>
                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���ǰ��</td>
                                        <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input id="SERVICE_ITEM"  name="SERVICE_ITEM" type="text" class="input_form1" style="width:300px" value="�㰡���� 3��" maxlength="40"></td>
                                    </tr>

                                    <tr>
                                        <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ü��� ����</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                        <input id="GAPAN_PRICE"  name="GAPAN_PRICE" type="text" class="input_form1" style="width:120px"  value="${SF_VALUE}"  maxlength="15" onkeyup="calculation_Loan(this)" ></td>
                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">��η�</td>
                                        <td bgcolor="eaeaea" class="table_bl_left"><span id="LOAN_PRICE_TXT"></span></td>
                                    </tr>

                                </table></td>
                        </tr>

                        <tr>
                            <td height="40"  align="right">
                                 <img src="/img/loan_contract_icon.gif" alt="��ΰ�༭"  onclick="javascript:publishPrc('contract');" style="cursor:pointer">
                                 <img src="/img/rojum_certy_icon.gif" alt="��� ����" onclick="javascript:publishPrc('certy');" style="cursor:pointer">
                            </td>
                        </tr>

                        <tr>
                            <td height="1" bgcolor="#EAEAEA"></td>
                        </tr>

                    </table>
            	</td>
            </tr>


        </table>
        
        
    	</form>
        

       


    </body>
</html>