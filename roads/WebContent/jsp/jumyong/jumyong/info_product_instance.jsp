<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
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
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript">            
			var savable = 0;
            var savable_v = 0;

            function InitPage()
            {

                var gongyu_yn = '${gongyu_yn}';
                if(gongyu_yn == '0'){
                    if(document.getElementById("CK_DEL").value == 'true'){
                        location.href = "/jumyong/productInsert.do?no=${no}";
                    }

                    setParentYear('${product.YEAR}');
                    var check_yn ="${product.CHECK_YN}";
                    parent.document.getElementById("SEQ").value = document.getElementById("SEQ").value;

                    if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
                    {
                        document.getElementById("view").style.display = "none";

                        document.getElementById("edit").style.display= "block";
                        document.getElementById("edit").style.pixelTop = 0;

                        if(check_yn=="1"){
                            document.getElementById("price_view3").style.display="none";
                        }

                        if(document.getElementById("mode").value == "add")
                        {
                            var date = new Date();
                            var year = date.getFullYear();
                            document.getElementById("YEAR").value = year;
                        }

                    }else
                    {
                        document.getElementById("edit").style.display = "none";
                        document.getElementById("view").style.display = "block";
                        if(check_yn=="1"){
                            document.getElementById("price_view3").style.display="none";
                        }
                    }

                    if(check_yn=="1"){
                        document.getElementById("price_img").style.display="none";
                        document.getElementById("PRICE").value="1";		//�ܰ��ʿ� ���������� ǥ�õǱ� ������ ���������� 1�� ǥ��
                        document.getElementById("price_view2").style.display="none";
                        document.getElementById("price_view3").style.display="none";
                    }

                    var cal_type = "${product.FORM}";		//������ ������� �ϴ��� ������� ���� �˾Ƴ���


                }else{
                    if(document.getElementById("CK_DEL").value == 'true'){
                        location.href = "/jumyong/productInsert.do?no=${no}";
                    }
                    setParentYear('${product.YEAR}');


                    insertComma("SUM_YEAR");
                    insertComma("SUM_LASTYEAR");
                    insertComma("SUM_ADJUST");
                    insertComma("LICENSE_TAX");

                    parent.document.getElementById("SEQ").value = document.getElementById("SEQ").value;

                    if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
                    {
                        document.getElementById("view").style.display = "none";
                        document.getElementById("edit").style.display= "block";

                        var date = new Date();
                        var year = date.getFullYear();

                        document.getElementById("YEAR").value = year;

                    }else
                    {
                        document.getElementById("edit").style.display = "none";
                        document.getElementById("view").style.display = "block";
                    }

                }

            }

            // �Է�, ������ ����
            function submitClick()
            {



                var gongyu_yn = '${gongyu_yn}';
                if(gongyu_yn == '0'){

                    var check_yn ="${product.CHECK_YN}";

                    // �����϶��� ���⳻�� ��꿩�� üũ ���ϵ���..
                    if(document.getElementById("mode").value == "edit"){
                        savable_v = 4;
                    }

                    if(check_yn == "1"){
                        if(savable_v == 3 || savable_v == 4){
                            var productForm = document.productForm;

                            //comma����
                            removeComma2("PRICE");
                            removeComma2("SUM_ADJUST");
                            removeComma2("SUM_YEAR");
                            removeComma2("REDUCTION_SUM");

                            productForm.submit();
                        }else {
                            alert("���� ������ ���� ����� �ֽʽÿ�.");
                            return;
                        }
                    }else if(savable_v == 4){
                        var productForm = document.productForm;

                        //comma����
                        removeComma2("PRICE");
                        removeComma2("SUM_ADJUST");
                        removeComma2("SUM_YEAR");
                        removeComma2("REDUCTION_SUM");

                        productForm.submit();

                        
                    }else {
                        alert("���� ������ ���� ����� �ֽʽÿ�.");
                        return;
                    }
                }else{
                    // �����϶��� ���⳻�� ��꿩�� üũ ���ϵ���..
                    if(document.getElementById("mode").value == "edit"){
                        savable = 4;
                    }

                    var check_yn ="${product.CHECK_YN}";
                    if(check_yn == "1"){
                        if(savable == 3 || savable == 4){
                            var productForm = document.productForm;

                            //comma����
                            removeComma2("LICENSE_TAX");
                            removeComma2("SUM_ADJUST");
                            removeComma2("SUM_YEAR");
                            removeComma2("SUM_LASTYEAR");
                            removeComma2("REDUCTION_SUM");
                            

                            productForm.submit();
                        }else {
                            alert("���� ������ ���� ����� �ֽʽÿ�.");
                            return;
                        }
                    }else if(savable == 4)
                    {
                        var productForm = document.productForm;

                        //comma ó��
                        removeComma2("LICENSE_TAX");
                        removeComma2("SUM_ADJUST");
                        removeComma2("SUM_YEAR");
                        removeComma2("SUM_LASTYEAR");
                        removeComma2("REDUCTION_SUM");
                        

                        productForm.submit();
                    }else
                        alert("���� ������ ���� ����� �ֽʽÿ�.");

                }

            }

            // info �ϴ�  Tab Ŭ��
            function subTabClick(hiddenSubTabName,visibleSubTabName)
            {
                document.getElementById(hiddenSubTabName).style.visibility = 'hidden';
                document.getElementById(visibleSubTabName).style.visibility = 'visible';


                document.getElementById(hiddenSubTabName).style.display = 'none';
                document.getElementById(visibleSubTabName).style.display = 'block';
            }

            //�Ͻ� ���⹰ ���////////////////////////////////////////////////////////////////////////////////////////////////
            function Calculate2()
            {
                savable = 0;
                
                if(document.getElementById("AREA_AFTER").value=="0" || document.getElementById("AREA_AFTER").value=="" || document.getElementById("AREA_AFTER").value=="0.0"){
                    alert("��������� �ٽ� �־��ּ���.");
                    document.getElementById("AREA_AFTER").value="";
                    document.getElementById("AREA_AFTER").focus();
                    return;
                }
                savable++;
                if(document.getElementById("PERIOD").value=="0" || document.getElementById("PERIOD").value==""){
                    alert("�ϼ��� �־��ּ���.");
                    document.getElementById("PERIOD").value="";
                    document.getElementById("PERIOD").focus();
                    return;
                }
                savable++;

                var area = document.getElementById("AREA_AFTER").value;
                if(area.substring(area.indexOf(".")+1, area.indexOf(".")+5).length>3){
                    alert("��������� �Ҽ��� 3�ڸ����� ǥ�� �� �ּ���");
                    document.getElementById("AREA_AFTER").value = "";
                    document.getElementById("AREA_AFTER").focus();
                    return;
                }
                savable++;
                getLicense_TaxAjax(area);	// ���㼼 ���

                var area_after = document.getElementById("AREA_AFTER").value;
                var period = document.getElementById("PERIOD").value;
         
                document.getElementById("FORM").value = area_after+"�� X " + period + "�� X 400��";
                var SUM_YEAR1 = Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(period)*parseFloat("400")));
                
                document.getElementById("SUM_YEAR").value = SUM_YEAR1;
                document.getElementById("SUM_ADJUST").value = SUM_YEAR1;

                insertComma("SUM_YEAR");// ���⵵ ����� �޸� ����
                insertComma("SUM_ADJUST");

                document.getElementById("FORM_ADJUST").value = area_after+"�� X " + period + "�� X 400��";

                if(document.getElementById("SUM_ADJUST").value=="0" || document.getElementById("SUM_ADJUST").value==""){
                    alert("����� �ٽ� ���ּ���.");
                    return;
                }
                
                
                var percentRate = document.getElementById("PERCENT_RATE").value;
                var reductionRate = document.getElementById("REDUCTION_RATE").value;
                
                if(percentRate == '0.0'){
                	percentRate = '100.0';
                }

                // ������ ���
                var reduction_sum = parseFloat(removeComma(document.getElementById("SUM_ADJUST").value)) * ((parseFloat(percentRate))/100) * ((100 - parseFloat(reductionRate))/100);

                //�ε��Ҽ��� ���� ����
                reduction_sum = fixFloatCal(reduction_sum);

        		if(document.getElementById("TYPE").value != '1'){
        			reduction_sum = parseInt(Math.floor(reduction_sum/10)*10); //10�� ����
        		}else{
        			reduction_sum = parseInt(Math.floor(reduction_sum/100)*100); //100�� ����
            	}
                
                document.getElementById("REDUCTION_SUM").value = insertComma2(reduction_sum);
                
				var reductionForm = document.getElementById("FORM_ADJUST").value;
                
                if(percentRate != '0.0' && percentRate != '100.0'){
                	reductionForm += " X (("+percentRate+")/100)";
                }
                if(reductionRate != '0.0'){
                	reductionForm += " X ((100-"+reductionRate+")/100)";
                }
                
                document.getElementById("REDUCTION_FORM").value = reductionForm;
                
                savable++;
                savable_v = savable;

            }


            //  ���� ���� ���/////////////////////////////////////////////////////////////////////
            function getRateAjax2(addSum)
            {
                var params = 'addsum='+addSum;
                var url = "/getRate.do" ;
                var adjust = sendRequest(url, params, rateFromServer, "Post");
            }

            function rateFromServer()
            {
                if(httpRequest.readyState == 4)
                {
                    if(httpRequest.status == 200)
                    {
                        var adjust = httpRequest.responseText;

                        var area_after = document.getElementById("AREA_AFTER").value;
                        var period = document.getElementById("period2").value;
                        var SUM_YEAR1 = parseFloat(area_after)*parseFloat(period)*parseFloat("400");

                        //�ε��Ҽ��� ���� ����
                        SUM_YEAR1 = fixFloatCal(SUM_YEAR1);
                        
                        if(adjust != 0.0)
                            document.getElementById("SUM_ADJUST2").value = adjust*SUM_YEAR1;
                        else
                            document.getElementById("SUM_ADJUST2").value = SUM_YEAR1;

                        delete httpRequest;
                        return null;
                    }else
                    {

                        delete httpRequest;
                        return null;
                    }
                }else
                {

                }
            }
            //  ���� ���� ��곡/////////////////////////////////////////////////////////////////////

            //  ���㼼        ���/////////////////////////////////////////////////////////////////////
            function getLicense_TaxAjax(area)
            {

                //encodeURIComponent�� +��ȣ�� ���� �ڹٽ�ũ��Ʈ�󿡼� ���ڷ� ��޵��� �ʴ� ���ڸ�

                //���ڷ� ��޵ǰ� ���ִ� �Լ��̴�.  document.getElementById("Text1")�� ���� ����������

                //ID���� Text1�� ��Ʈ�� ã�� ����. .Net Ajax������ $get�� ���⵵ �Ѵ�.

                //  var params ="name="+encodeURIComponent(document.getElementById("Text1").value);
                var params = 'area='+area;
                
                var url = "/getLicenseTax.do" ;


                //hello.aspx �������� params ������ Post������� ������ ���������� helloFromServer���� �޴´�.

                var a = sendRequest(url, params, getLicense_TaxfromServer, "Post");
            }

            function getLicense_TaxfromServer()
            {
                if(httpRequest.readyState == 4)
                {
                    if(httpRequest.status == 200)
                    {
                        var LicenseTax = httpRequest.responseText;

                        document.getElementById("LICENSE_TAX").value = LicenseTax;

                        insertComma("LICENSE_TAX");// ���㼼 ����� �޸� ����

                        delete httpRequest;
                    }else
                    {
                        delete httpRequest;
                    }
                }else
                {
                }
            }

            //  ���㼼       ��곡/////////////////////////////////////////////////////////////////////

            //xml js�κ�	//////////////////////////////////////////////////////////////////////////
            function getXMLRequest()
            {
                if(window.ActiveXObject)
                {
                    try
                    {
                        return new ActiveXObject("MSXML2.XMLHttp");
                    }
                    catch(e)
                    {
                        try{
                            return new ActiveXObject("Microsoft.XMLHttp");
                        }
                        catch(e)
                        {
                            return null;
                        }
                    }
                }
                else if(window.XMLHttpRequest)
                {
                    return new XMLHttpRequest();
                }
                else
                {
                    return null;
                }
            }

            var httpRequest = null;

            //�Ű�����: ������ ������, ������ ������, �������� ������ �ڷḦ �޴� �Լ�, ���۹��

            function sendRequest(url, params, callback, method)
            {
                httpRequest = getXMLRequest();

                //������ ���޹���� ������ �Ǿ����� Ȯ���Ѵ�. ���� ������ �ȵǾ��ٸ�
                //GET������� �����ϵ��� �Ѵ�.

                var httpMethod =  method ? method:"GET";

                if(httpMethod != "GET" && httpMethod !="POST")
                {
                    httpMethod = "GET";
                }

                //���� ������ ������ �ּҸ� �޴´�.
                var httpParams = (params==null || params =="")?null:params;
                var httpUrl = url;
                if(httpMethod =="GET" && params !=null)
                {
                    httpUrl =httpUrl +"?"+httpParams;
                }
                httpRequest.open(httpMethod,httpUrl,true);
                httpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");

                //onreadystatechange�� ������ Ŭ����Ʈ�� ���¸� �����Ͽ� ��ȭ�� ������

                httpRequest.onreadystatechange = callback;

                httpRequest.send(httpMethod=="POST" ? httpParams:null);
            }
            //ajax js �� //////////////////////////////////////////////////////////////////////////////





            //�ݾ״���  [ , ] �ڵ� �߰�
            function fn_addComma(chknum){
                num = chknum.value;
                num = num.split(',').join('');
                var arr = num.split('.');
                var num = new Array();
                for (i = 0; i <= arr[0].length-1; i++) {
                    num[i] = arr[0].substr(arr[0].length-1-i,1);
                    if(i%3 == 0 && i != 0) num[i] += ',';
                }
                num = num.reverse().join('');
                if (!arr[1]) chknum.value = num; else chknum.value = num+'.'+arr[1];
            }

            //���ڸ� �Է�
            function onlyNumberInput()
            {
                var code = window.event.keyCode;

                if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110)
                {
                    window.event.returnValue = true;
                    return;
                }else
                {
                    window.event.returnValue = false;
                    return;
                }
            }


            // �޸� ����
            function insertComma(val1)
            {

                value1 = document.getElementById(val1).value;

                var length1 = value1.length;
                var divideNum = length1%3;
                var returnValue2 ="";

                if(divideNum != 0)
                {
                    returnValue2 = value1.substr(0,divideNum)+",";
                }

                if(length1 >3)
                {
                    while(true)
                    {
                        returnValue2 = returnValue2 + value1.substr(divideNum,3)+",";

                        divideNum = divideNum+3;
                        if(length1 <= divideNum)
                            break;
                    }
                }

                if(returnValue2 == "")
                    returnValue2 = value1;
                else
                    returnValue2 = returnValue2.substr(0,returnValue2.length - 1);

                document.getElementById(val1).value = returnValue2;
            }


            function setParentYear(yearVal)
            {
                parent.document.getElementById("year").value = yearVal;
            }

            function iFrameResize(obj)
            {
                var iFrm = obj;
                var the_height = iFrm.contentWindow.document.body.scrollHeight;
                iFrm.style.height = the_height + "px";
            }

            function Tab_Src(adminno, seq)
            {
                var tab1	= document.getElementById("tabUpSub1");
                var tab2	= document.getElementById("tabUpSub2");

                //var tabs	= document.getElementById("tabDown");

                tab1.src	= "/jumyong/inspectEdit.do?no=" + adminno + "&seq=" + seq;
                tab2.src	= "/jumyong/confEdit.do?no=" + adminno + "&seq=" + seq;
                //alert(tab1.src);
            }

            function goDelete()
            {
                var year = '${product.YEAR}';
                var seq = document.getElementById("SEQ").value;

                var result = confirm("���⳻���� �����Ͻðڽ��ϱ�?");
                if(result){
                	location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}&check_yn=${product.CHECK_YN}"
                        +"&mode=del&year="+year+"&seq="+seq+"&section=${section}"+"&TYPE="+document.getElementById("TYPE").value;
                    alert(str);
                    location.href = str;

                }

            }


            function goModify()
            {
                var area = document.getElementById("AREA_AFTER").value;
                var year = '${product.YEAR}';
                var seq = document.getElementById("SEQ").value;
                var sum_adjust = Number(removeComma(document.getElementById("SUM_ADJUST").value));

                location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}&check_yn=${product.CHECK_YN}"
                    +"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
            }

            function Calculate()
            {
                savable = 0;
                
                var check_yn ="${product.CHECK_YN}";
                var area_after = document.getElementById("AREA_AFTER").value;
                var rate = document.getElementById("RATE").value;
                var type = document.getElementById("TYPE").value;
                var price = removeComma(document.getElementById("PRICE").value);

                if(check_yn!="1"){
                    if(document.getElementById("PRICE").value=="0" || document.getElementById("PRICE").value==""){
                        alert("���������� ��������.");
                        document.getElementById("PRICE").value="";
                        document.getElementById("PRICE").focus();
                        document.getElementById("saveCheck").value="0";
                        return;
                    }
                }
                savable++;		//�� ������ ���������� savable�� +1�� ���ش�.
                if(Number(area_after)==0 || area_after==""){
                    alert("��������� �־��ּ���.");
                    document.getElementById("AREA_AFTER").value = "";
                    document.getElementById("AREA_AFTER").focus();
                    document.getElementById("saveCheck").value="0";
                    return;
                }
                savable++;
                if(area_after.substring(area_after.indexOf(".")+1, area_after.indexOf(".")+5).length>3){
                    alert("��������� �Ҽ��� 3�ڸ����� ǥ�� �� �ּ���");
                    document.getElementById("AREA_AFTER").value = "";
                    document.getElementById("AREA_AFTER").focus();
                    document.getElementById("saveCheck").value="0";
                    return;
                }
                savable++;
                savable++;
                var period = document.getElementById("PERIOD").value;

                var leafYear = f_leapyear(document.getElementById("YEAR").value);

                var SUM_YEAR1 = Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(period)*parseFloat("400")));

                var sum_year = Math.floor(fixFloatCal(parseFloat(area_after)*(parseFloat(period)/(365+leafYear))*parseFloat(rate)*parseFloat(price)));

                
                if(check_yn!="1"){
                    document.getElementById("FORM").value = area_after+"�� X " + period + "/"+Number(365+leafYear)+"�� X " +rate +" X " +insertComma2(price);
                }else{
                    document.getElementById("FORM").value = area_after+"�� X " + period + "/"+Number(365+leafYear)+"�� X " +rate;
                }

                var sum = sum_year;


                var strSUM_ADJUST = String( Math.floor(sum_year)); // �Ҽ��� ����
                sum_year = parseInt(strSUM_ADJUST);

        		if(type.value != '1'){
        			sum_year = parseInt(sum_year/10)*10;		//10�� ����
				}else{
        			sum_year = parseInt(sum_year/100)*100;		//100�� ����
				}

                
                
                document.getElementById("SUM_YEAR").value = insertComma2(sum_year);

                document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value;
                document.getElementById("SUM_ADJUST").value = insertComma2(sum_year);
                
                
                
                var percentRate = document.getElementById("PERCENT_RATE").value;
                var reductionRate = document.getElementById("REDUCTION_RATE").value;


                // ������ ���
                var reduction_sum = parseFloat(sum) * ((parseFloat(percentRate))/100) * ((100 - parseFloat(reductionRate))/100);

                //�ε��Ҽ��� ���� ����
                reduction_sum = fixFloatCal(reduction_sum);
                
        		if(type != '1'){
        			reduction_sum = parseInt(Math.floor(reduction_sum/10)*10); //10�� ����
    	        }else{
					reduction_sum = parseInt(Math.floor(reduction_sum/100)*100); //100�� ����
	            }


                document.getElementById("REDUCTION_SUM").value = insertComma2(reduction_sum);
                
				var reductionForm = document.getElementById("FORM_ADJUST").value;
                
                if(percentRate != '0.0' && percentRate != '100.0'){
                	reductionForm += " X (("+percentRate+")/100)";
                }
                if(reductionRate != '0.0'){
                	reductionForm += " X ((100-"+reductionRate+")/100)";
                }
                
                document.getElementById("REDUCTION_FORM").value = reductionForm;



                

                document.getElementById("saveCheck").value="1";

                savable_v = savable;
                savable = 0;
            }




            //�������� �˾�
            function openLandPricePopUp()
            {
                var winW = 320;
                var winH = 240;
                var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0";

                var admin_no = document.getElementById("no").value;
                var year = document.getElementById("YEAR").value;
                window.open('/land_price.do?ADMIN_NO='+admin_no+'&year='+year, 'win', status);
            }

            function ShowMsgJumjiInsert(obj){

                var target = obj;
                if(target.name == 'AREA_AFTER'){
                    alert("��������� ������ �������� �����ϼ���.");
                }else if(target.name == 'PERCENT_RATE'){
                    alert("�������� ������ �������� �����ϼ���.");
                }else if(target.name == 'PERCENT_REASON'){
                    alert("������ ������ ������ �������� �����ϼ���.");
                }else if(target.name == 'REDUCTION_RATE'){
                    alert("�������� ������ �������� �����ϼ���.");
                }else if(target.name == 'REDUCTION_REASON'){
                    alert("������ ������ ������ �������� �����ϼ���.");
                }
            }
        </script>




</head>

<body onload="javascript:InitPage();" border="0">

	<form id="productForm" name="productForm" method="POST" action="/jumyong/productInsert.do">
		<input id="ADMIN_NO" name="ADMIN_NO" value="${no}" type="hidden">
		<input id="no" name="no" value="${no}" type="hidden"> 
		<input id="mode" name="mode" value="${mode}" type="hidden"> 
		<input id="SEQ" name="SEQ" value="${seq}" type="hidden"> 
		<input id="CK_DEL" name="CK_DEL" value="${CK_DEL}" type="hidden"> 
		<input id="saveCheck" name="saveCheck" value="0" type="hidden"> 
		<input id="TYPE" name="TYPE" value="${type}" type="hidden">



		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<c:choose>
					<c:when test="${gongyu_yn == '0'}">
						<td class="contborder_purple">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td>
										<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
											<tr>
												<td height="28" align="center" bgcolor="e5eff8"
													class="sub_table_b">��ȣ</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">���ؿ���</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">����/�ܰ�</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">��ü�Ⱓ(�ϼ�)</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
											</tr>
											<c:forEach items="${productList}" var="board" varStatus="idx">
												<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" onclick="javascript:setParentYear('${board.YEAR}');Tab_Src('${no}','${board.SEQ}');location.href('/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&year=${board.YEAR}&seq=${board.SEQ}&section=${section}');" style="cursor: pointer">
													<td height="26" align="center">${idx.count}</td>
													<td align="center">${board.YEAR}</td>
													<td align="center">
														<c:choose>
															<c:when test="${product.CHECK_YN != '1'}">
                                                        ${rnic:insertComma2(board.PRICE)}
                                                    </c:when>
															<c:otherwise>
															-
                                                    </c:otherwise>
														</c:choose></td>
													<td align="center">${board.AREA_AFTER}</td>
													<td align="center">${board.RATE}</td>
													<td align="center">${board.PERIOD}</td>
													<td align="center">${rnic:insertComma2(board.SUM_ADJUST)}</td>
													<td align="center">${rnic:insertComma2(board.SUM)}</td>

												</tr>
											</c:forEach>
										</table>
									</td>
								</tr>
								<tr>
									<td height="40" align="center">	
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td align="center">
													<table border="0" cellpadding="0" cellspacing="0">
														<tr>${strPageDivideForm}
														</tr>
													</table>
												</td>
											</tr>
											<tr>
											</tr>
										</table>
									</td>
								</tr>

							</table>

							<div id="view" style="width: 100%;">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">

									<tr>
										<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
												<tr>
													<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���س⵵</td>
													<td width="42%" bgcolor="eaeaea" class="table_bl_left">
														${product.YEAR}��</td>
													<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
													<td width="32%" bgcolor="eaeaea" class="table_bl_left">
														<span id="price_view2" style="display: block;">
															${rnic:insertComma2(product.PRICE)}��
														</span>
													</td>
												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.AREA_AFTER}��</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����/�ܰ�</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.RATE}</td>
												</tr>


												<tr>
													<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ü�Ⱓ(�ϼ�)</td>
													<td colspan="3" bgcolor="eaeaea" class="table_bl_left">${product.PERIOD}��</td>
												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.FORM_ADJUST}</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${rnic:insertComma2(product.SUM_ADJUST)} ��
													</td>
												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.PERCENT_REASON}
													</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.PERCENT_RATE} %
													</td>
												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.REDUCTION_REASON}
													</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.REDUCTION_RATE} %
													</td>
												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.REDUCTION_FORM}</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${rnic:insertComma2(product.REDUCTION_SUM)} ��
													</td>
												</tr>
											</table>
										</td>
									</tr>

									<tr>
										<td height="40" align="right">
											<c:if test="${section != '4'}">
												<table border="0" width="100%">
													<tr>
														<td></td>
														<c:if test="${listSize != '0'}">
															<c:if test="${defineTax != 'true'}">
																<td width="50"><img src="/img/mod_icon.gif" alt="����" border="0" onclick="javascript:goModify()" style="cursor: pointer"></td>
																<td width="50"><img src="/img/del_icon3.gif" alt="����" border="0" onclick="javascript:goDelete()" style="cursor: pointer"></td>
															</c:if>
														</c:if>
													</tr>

												</table>
											</c:if></td>
									</tr>
								</table>
							</div>
							<div id="edit" style="width: 100%; display: none;">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
												<tr>
													<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" style="direction: rtl">���س⵵</td>
													<td width="42%" bgcolor="eaeaea" class="table_bl_left">
														<input id="YEAR" name="YEAR" type="text" value="${product.YEAR}" style="width: 50px; ime-mode: disabled;" class="input_form1" onKeyDown="onlyNumberInput();" style="text-align:right">&nbsp��</td>
													<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
														<span id="price_view3" style="display: block;">��������</span>
													</td>
													<td width="32%" bgcolor="eaeaea" class="table_bl_left">
														<table border="0" cellpadding="0" cellspacing="0" class="table_bl_left">
															<tr>
																<td>
																	<span id="price_img" style="display: block;">
																		<input id="PRICE" name="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width: 80px; ime-mode: disabled;" onkeyup="javascript:fn_addComma(this)" onKeyDown="onlyNumberInput();" style="text-align:right">��
                                                                    	<img src="/img/landPrice.gif" alt="����������ȸ" height="18" border="0" style="cursor: pointer" onclick="javascript:openLandPricePopUp();" align="absmiddle">
																	</span>
																</td>
															</tr>
														</table></td>
												</tr>



												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input id="AREA_AFTER" name="AREA_AFTER" type="text" class="essential" style="width: 50px; ime-mode: disabled;" value="${product.AREA_AFTER}" onfocus="javascript:ShowMsgJumjiInsert(this)" style="text-align:right" readonly="readonly"> m / �� / ��
													</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����/�ܰ�</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input id="RATE" name="RATE" type="text" class="input_form1" style="width: 80px; ime-mode: disabled;" value="${product.RATE}" onKeyDown="onlyNumberInput();" style="text-align:right">
													</td>
												</tr>


												<tr>
													<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ü�Ⱓ(�ϼ�)</td>
													<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
														<input id="PERIOD" name="PERIOD" type="text" class="essential" style="width: 80px; ime-mode: disabled;" value="${product.PERIOD}" style="text-align:right" readonly="readonly">����(��)</td>
												</tr>
											</table></td>
									</tr>

									<tr>
										<td height="40" align="right">
											<img src="/img/accou_icon.gif" alt="���" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor: pointer">
										</td>
									</tr>

									<tr>
										<td>
											<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input id="FORM" name="FORM" type="hidden" value="${product.FORM}"> 
														<input id="SUM_YEAR" name="SUM_YEAR" type="hidden" value="${rnic:insertComma2(product.SUM_YEAR)}"> 
														<input id="FORM_ADJUST" name="FORM_ADJUST" type="text" class="input_form1" style="width: 300px" value="${product.FORM_ADJUST}">
													</td>

													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input id="SUM_ADJUST" name="SUM_ADJUST" type="text" class="input_form1" style="width: 80px; ime-mode: disabled;" value="${rnic:insertComma2(product.SUM_ADJUST)}" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">��
													</td>
												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input id="PERCENT_REASON" name="PERCENT_REASON" type="text" class="essential" style="width: 300px" value="${product.PERCENT_REASON}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">
													</td>

													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input id="PERCENT_RATE" name="PERCENT_RATE" type="text" class="essential" style="width: 50px; text-align: right" value="${product.PERCENT_RATE}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">%
													</td>
												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input id="REDUCTION_REASON" name="REDUCTION_REASON" type="text" class="essential" style="width: 300px" value="${product.REDUCTION_REASON}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">
													</td>

													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input id="REDUCTION_RATE" name="REDUCTION_RATE" type="text" class="essential" style="width: 50px; text-align: right" value="${product.REDUCTION_RATE}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">%
													</td>
												</tr>

												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input id="REDUCTION_FORM" name="REDUCTION_FORM" type="text" class="input_form1" style="width: 300px" value="${product.REDUCTION_FORM}">
													</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input id="REDUCTION_SUM" name="REDUCTION_SUM" type="text" class="input_form1" style="width: 80px; ime-mode: disabled;"
														value="${rnic:insertComma2(product.REDUCTION_SUM)}" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">��
													</td>
												</tr>
											</table>
										</td>
									</tr>

									<tr>
										<td height="40" align="right">
											<c:if test="${section != '4'}">
												<img src="/img/can_icon.gif" alt="���" border="0" onclick="javascript:history.back();" style="cursor: pointer">
												<img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0" onClick="javascript:submitClick();" style="cursor: pointer">
											</c:if>
										</td>
									</tr>
								</table>
							</div>
						</td>
					</c:when>

					<c:otherwise>
						<td class="contborder_purple">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td>
										<table width="100%" border="1" bordercolor="#c9dfed"
											style="border-collapse: collapse;" cellpadding="0"
											cellspacing="0" class="sub_table">
											<tr>
												<td height="28" align="center" bgcolor="e5eff8"
													class="sub_table_b">��ȣ</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">���ſ���</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">��ü�Ⱓ(�ϼ�)</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">���㼼</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">�Ͻ������
												</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">���� �Ͻ������</td>
											</tr>

											<c:forEach items="${productList}" var="board" varStatus="idx">
												<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" onclick="javascript:setParentYear('${board.YEAR}');Tab_Src('${no}','${board.SEQ}');location.href('/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${strCountPerPage}&section=${section}&seq=${board.SEQ}');" style="cursor: pointer">
													<td height="26" align="center">${idx.count}</td>
													<td align="center">${rnic:addDash(board.UP_DATE)}</td>
													<td align="center">${board.AREA_AFTER}</td>
													<td align="center">${board.PERIOD}</td>
													<td align="center">${rnic:insertComma2(board.LICENSE_TAX)}</td>
													<td align="center">${rnic:insertComma2(board.SUM_ADJUST)}</td>
													<td align="center">${rnic:insertComma2(board.SUM) }</td>
												</tr>
											</c:forEach>
										</table>
									</td>
								</tr>
								<tr>
									<td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td align="center">
													<table border="0" cellpadding="0" cellspacing="0">
														<tr>
															${strPageDivideForm}
														</tr>
													</table>
												</td>
											</tr>
											<tr>
											</tr>
										</table>
									</td>
								</tr>

							</table>

							<div id="view" style="width: 100%;">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">

									<tr>
										<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
													<td bgcolor="eaeaea" class="table_bl_left">${product.AREA_AFTER}��</td>

													<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ü�Ⱓ(�ϼ�)</td>
													<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
															<tr>
																<td>${product.PERIOD} ��</td>
															</tr>
														</table>
													</td>
												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���㼼</td>
													<td colspan="3" bgcolor="eaeaea" class="table_bl_left">${rnic:insertComma2(product.LICENSE_TAX)}��
													</td>
												</tr>

												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
													<td bgcolor="eaeaea" class="table_bl_left">${product.FORM_ADJUST}</td>


													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
													<td bgcolor="eaeaea" class="table_bl_left">${rnic:insertComma2(product.SUM_ADJUST)}��</td>

												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.PERCENT_REASON}</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.PERCENT_RATE} %
													</td>
												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.REDUCTION_REASON}</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.REDUCTION_RATE} %
													</td>
												</tr>

												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${product.REDUCTION_FORM}
													</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														${rnic:insertComma2(product.REDUCTION_SUM)} ��
													</td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<td height="40" align="right">
											<table border="0" width="100%">
												<tr>
													<td></td>
													<c:if test="${listSize != '0'}">
														<c:if test="${defineTax != 'true'}">
															<td width="50">
																<a href="/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&seq=${seq}&mode=edit">
																	<img src="/img/mod_icon.gif" alt="����" border="0">
																</a>
															</td>
															<td width="50"><img src="/img/del_icon3.gif" alt="����" border="0" onclick="javascript:goDelete()" style="cursor: pointer"></td>
														</c:if>
													</c:if>
												</tr>
											</table></td>
									</tr>
								</table>
							</div>

							<div id="edit" style="width: 100%; display: none;">
									<input name="FROMDATE" ID="FROMDATE" type="hidden" value="${mul_Fromdate}">
									<input name="TODATE" ID="TODATE" type="hidden" value="${mul_Todate}">
									<input name="YEAR" ID="YEAR" type="hidden" value="">
									<input name="PRICE" ID="PRICE" type="hidden" value="0">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
												<tr>
													<td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
													<td bgcolor="eaeaea" class="table_bl_left" width="35%">
														<input name="AREA_AFTER" id="AREA_AFTER" type="text" class="essential" style="width: 60px" value="${product.AREA_AFTER}" style="ime-mode:disabled;direction:rtl;" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">�� / ��
                                            		</td>

													<td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ü�Ⱓ(�ϼ�)</td>
													<td bgcolor="eaeaea" class="table_bl_left" width="35%">
														<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
															<tr>
																<td>
																	<input name="PERIOD" id="PERIOD" type="text" class="essential" style="width: 60px" value="${product.PERIOD}" onKeyDown="onlyNumberInput();" style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();"> ��
                                            					</td>
															</tr>
														</table>
													</td>
												</tr>
											</table>
											</td>
									</tr>


									<tr>
										<td height="40" align="right">
											<img src="/img/accou_icon.gif" alt="���" width="56" height="18" border="0" onclick="javascript:Calculate2();" style="cursor: pointer">
										</td>
									</tr>

									<tr>
										<td>
											<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���㼼</td>
													<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
														<input name="LICENSE_TAX" ID="LICENSE_TAX" type="text" class="input_form1" value="${product.LICENSE_TAX}" style="width: 120px; ime-mode: disabled; direction: rtl;" onclick="javascript:getLicense_TaxAjax(document.getElementById('AREA_AFTER').value);" onkeyup="javascript:fn_addComma(this);" onKeyDown="onlyNumberInput();">��
													</td>
												</tr>

												<input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="hidden" class="input_form1" style="width: 120px" value="${product.SUM_LASTYEAR}" style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this);">
												<input name="SUM_YEAR" id="SUM_YEAR" type="hidden" class="input_form1" style="width: 120px" value="${product.SUM_YEAR}" style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this);">
												<input name="FORM" id="FORM" type="hidden" class="input_form1" style="width: 200px" value="${product.FORM}">
												<input name="ADJUSTMENT" id="ADJUSTMENT" type="hidden" class="input_form1" style="width: 120px" value="${product.ADJUSTMENT}" style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();">
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width: 350px" value="${product.FORM_ADJUST}">
													</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width: 80px; ime-mode: disabled;" value="${product.SUM_ADJUST}" style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this);">��
													</td>
												</tr>

												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input name="PERCENT_REASON" id="PERCENT_REASON" type="text" class="essential" style="width: 350px" value="${product.PERCENT_REASON}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">
													</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input name="PERCENT_RATE" id="PERCENT_RATE" type="text" class="essential" style="width: 50px; text-align: right" value="${product.PERCENT_RATE}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">%
													</td>
												</tr>
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input name="REDUCTION_REASON" id="REDUCTION_REASON" type="text" class="essential" style="width: 350px" value="${product.REDUCTION_REASON}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">
													</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input name="REDUCTION_RATE" id="REDUCTION_RATE" type="text" class="essential" style="width: 50px; text-align: right" value="${product.REDUCTION_RATE}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">%
													</td>
												</tr>

												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input name="REDUCTION_FORM" id="REDUCTION_FORM" type="text" class="input_form1" style="width: 350px" value="${product.REDUCTION_FORM}">
													</td>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
													<td bgcolor="eaeaea" class="table_bl_left">
														<input name="REDUCTION_SUM" id="REDUCTION_SUM" type="text" class="input_form1" style="width: 80px; ime-mode: disabled;" value="${rnic:insertComma2(product.REDUCTION_SUM)}" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">��
													</td>
												</tr>
											</table>
										</td>
									</tr>

									<tr>
										<td height="40" align="right">
											<img src="/img/can_icon.gif" alt="���" border="0" onclick="javascript:history.back();" style="cursor: pointer">
											<img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0" onClick="javascript:submitClick();" style="cursor: pointer">
										</td>
									</tr>
								</table>
							</div></td>
					</c:otherwise>
				</c:choose>

			</tr>
			<tr>
				<td height="10"></td>
			</tr>
			<tr>
				<td>
					<iframe width="100%" height="100%" id="tabUpSub1" name="tabUpSub1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/inspectEdit.do?no=${no}&seq=${seq }&SECTION=${section}"></iframe>
				</td>
			</tr>
			<tr>
				<td height="10"></td>
			</tr>
			<tr>
				<td>
					<iframe width="100%" height="100%" id="tabUpSub2" name="tabUpSub2" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/confEdit.do?no=${no}&seq=${seq }&SECTION=${section}"></iframe>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

