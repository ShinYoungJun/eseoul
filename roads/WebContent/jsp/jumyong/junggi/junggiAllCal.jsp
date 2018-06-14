<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
            #tr_fixed_header
            {
                position: relative;
                top: expression(this.offsetParent.scrollTop);
                z-index: 20;
            }

            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
        <script language="javascript" src="/js/PopupCalendar.js"></script>
        <script language="javascript" src="/js/Ajax_request.js"></script>
        <script language="javascript" src="/js/calculation.js"></script>
        <script>
		
            function checkKeySearch()
            {
                if(event.keyCode == 13) goSearch();
            }



            function InitPage()
            {

                var taxdate = document.getElementById("TAX_DATE").value;
                var taxdate_year = Number(taxdate.substr(0,4));
                var taxdate_month = Number(taxdate.substr(5,2));
                var indate_f = new Date(new Date(taxdate_year, taxdate_month, 1)-86400000).getDate();

                document.getElementById("INDATE").value = taxdate.substr(0,4)+"-"+taxdate.substr(5,2)+"-"+indate_f;

                var indate = document.getElementById("INDATE").value;

                var indate_year = Number(indate.substr(0,4));
                var indate_month = Number(indate.substr(5,2));
                if(indate_month==12){
                    indate_year = indate_year+1;
                    indate_month = 1;
                }else{
                    indate_month++;
                }

                if(indate_month<10){
                    indate_month = "0"+indate_month;
                }
                var over_date = new Date(new Date(indate_year, indate_month, 1)-86400000).getDate();

                document.getElementById("OVERDATE").value = indate_year+"-"+indate_month+"-"+over_date;

             	// 2016.02.05 kny ������ �ش� �������� ��� �ȳ��޼��� ���
                var chk1 = "${sigu_cd}";	// ������ �ñ��� �ڵ�
                var chk2 = "${SECTION}";	// ���� ����(1: ���)
                var isGangseo = false;
                var nameList = new Array();
                
                if(chk1 == "500" && chk2 == "1"){
					var listInfo =  document.getElementsByName("ADMIN_NO2");
					var nameInfo =  document.getElementsByName("NAME");
					var i2;
					for (i2 = 0; i2 < listInfo.length; i2++) {
					    if (listInfo[i2].value == "110_1_11704" || listInfo[i2].value == "110_1_11705" || listInfo[i2].value == "110_1_11935" || 
					         listInfo[i2].value == "110_1_12517" || listInfo[i2].value == "110_1_12537" || listInfo[i2].value == "119_1_00001") {
				  	    	isGangseo = true;
					    	nameList.push(listInfo[i2].value+"("+nameInfo[i2].value+")");
					    }
					}
					
					if(isGangseo){
						var messageGimpo = "������ȣ�� \n";
						messageGimpo +="[ ";
						
						for(i3=0; i3 < nameList.length; i3++){
							if(i3!=0){
								messageGimpo += ", " + nameList[i3];
							}else{
								messageGimpo += nameList[i3];									
							}
						}
						
	                	messageGimpo += " ]\n";
	                	messageGimpo += "�� ����� ����� ���λ��Ḧ �ΰ��� ��쿡��,\n";
	                	messageGimpo += "�ݵ�� �ش� �ΰ��ڷ��� ���λ��� ��������� ���� �ΰ��Ͻñ� �ٶ��ϴ�.";
					}
					alert(messageGimpo);
                }
                
            }




            // �ΰ��⵵ �˻� ����
            function change_value(val)
            {
                if(val.value.length == 4)
                {

                    document.frm.FROMDATE.value = val.value + "-01-01";
                    document.frm.TODATE.value = val.value + "-12-31";

                }
            }


            // ���
            function Calculate(){

                var f = document.frm;

                if(f.TOTALCNT.value <= 0){
                    alert("ó���� �����Ͱ� �����ϴ�. ");
                    return;
                }

                junggi_calDate();

                var check_yn = document.getElementsByName("CHECK_YN");
                var price = document.getElementsByName("PRICE");
                var allCnt = 0;

                for( var i = 0; i < check_yn.length; i++ ){
                    if( check_yn[i].value == '2' ){
                        if(price[i].value == '0' || price[i].value == ''){
                            alert("���������� �ְ� ������ּ���. ");
                            price[i].focus();
                            return;
                        }
                    }
                }
                var area_after = document.getElementsByName("AREA_AFTER");
                var period = document.getElementById("PERIOD").value;


                if(Number(period) > 12){
                    alert("�Ⱓ�� 12������ �ʰ��Ҽ� �����ϴ�.");
                    f.PERIOD.focus();
                    return;
                }

                if(Number(period) < 0){
                    alert("�Ⱓ�� �Է��� �߸��Ǿ����ϴ�.");
                    f.PERIOD.focus();
                    return;
                }

                var rate = document.getElementsByName("RATE");
                var section = '${SECTION}';
                var surcharge_rate = "";
                if( section == '3' ){
                    surcharge_rate = document.getElementById("SURCHARGE_RATE").value;

                    if( surcharge_rate == '' ){
                        surcharge_rate = 1.2;
                        document.getElementById("SURCHARGE_RATE").value = surcharge_rate;
                    }
                }

                var price = document.getElementsByName("PRICE");
                var form = document.getElementsByName("FORM");
                var sum_year = document.getElementsByName("SUM_YEAR");
                var sum_lastyear = document.getElementsByName("SUM_LASTYEAR");		// �۳⵵ �����
                var form_adjust = document.getElementsByName("FORM_ADJUST");
                var adjustment = document.getElementsByName("ADJUSTMENT");
                var sum_adjust = document.getElementsByName("SUM_ADJUST");
                var reduction_sum = document.getElementsByName("REDUCTION_SUM");
                var reduction_form = document.getElementsByName("REDUCTION_FORM");
                var test = document.getElementsByName("TEST");
                var rate_val = document.getElementsByName("RATE_VAL");
                var overtax = document.getElementsByName("OVERTAX");
                var purpose_cd_l = document.getElementsByName("PURPOSE_CD_L");
                
                var vat = document.getElementsByName("VAT");
              	var old_rate = document.getElementsByName("OLD_RATE");
                var old_price = document.getElementsByName("OLD_PRICE");
                var old_area_size = document.getElementsByName("OLD_AREA_SIZE");


                for( var i = 0; i < check_yn.length; i++){

                    var type_name = document.getElementsByName("TYPE_NAME");



                    /******************    1    **************************/
                    // ������, ������ �� �� �� �ʱ� ����
                    
                    var percent_rate = document.getElementsByName("PERCENT_RATE");
                    var reduction_rate = document.getElementsByName("REDUCTION_RATE");

                    var percent_rate_cal = 0; // ��꿡 ����� ������
                    var reduction_rate_cal = 0; // ��꿡 ����� ������
                    var reduction_rate_form = "";
                    
                    if( percent_rate[i].value == '' || percent_rate[i].value == '0' || percent_rate[i].value == '0.0'){
                    	percent_rate_cal = '100.0';
                    }else{
                    	percent_rate_cal = parseFloat(percent_rate[i].value);
                    }
                    
                    if( reduction_rate[i].value == '' || reduction_rate[i].value == '0' || reduction_rate[i].value == '0.0'){
                        reduction_rate_cal = '0.0';
	                }else{
	                	reduction_rate_cal = parseFloat(reduction_rate[i].value);
	                }
                    
                    
                    if(percent_rate_cal != '' && percent_rate_cal != '0.0' && percent_rate_cal != '100.0'){
                    	reduction_rate_form += " X (("+percent_rate_cal+")/100)";
                    }
                    if(reduction_rate_cal != '0.0' && reduction_rate_cal != '0.0'){
                    	reduction_rate_form += " X ((100-"+reduction_rate_cal+")/100)";
                    }

                    var price_cal = removeComma(price[i].value);
                    var sum_lastyear_cal = removeComma(sum_lastyear[i].value);
                    /****************** 1�ܰ� �� ***************************/


                    /******************    2    **************************/
                    // ���⵵ �� �� �� ����

                    var sum_year_cal = "";	// �� �����ϱ��� ���� �ʿ��� ���� ���� ����

                    if( check_yn[i].value == '2' ){

                        form[i].value = area_after[i].value+"��  X " + rate[i].value +" X " +insertComma2(price_cal) +" X " + period + "/12 ���� ";

                        if( section == '3' ){
                            sum_year_cal = fixFloatCal(parseFloat(area_after[i].value)*parseFloat(period)/12*parseFloat(rate[i].value)*parseFloat(price_cal)*(surcharge_rate));
                        }else{
                            sum_year_cal = fixFloatCal(parseFloat(area_after[i].value)*parseFloat(period)/12*parseFloat(rate[i].value)*parseFloat(price_cal));
                        }

                    }else{

                        form[i].value = area_after[i].value+"��  X " + rate[i].value +" X " + period + "/12 ���� ";

                        if( section == '3' ){
                            sum_year_cal = fixFloatCal(parseFloat(area_after[i].value)*parseFloat(period)/12*parseFloat(rate[i].value)*(surcharge_rate));
                        }else{
                            sum_year_cal = fixFloatCal(parseFloat(area_after[i].value)*parseFloat(period)/12*parseFloat(rate[i].value));
                        }

                    }

                    // ����� ���з� ���� ������� ���⵵ �� ���
                    var bak_sum = sum_year_cal;

                    var strSUM_ADJUST = String(Math.floor(parseFloat(sum_year_cal))); // �Ҽ��� ����


                    var gongyu = purpose_cd_l[i].value.charAt(0); // �������̸� 0���� ����
                    
                    
                    if(section != '3'){
                        if(type_name[i].value != '����'){
                            sum_year_cal = (Math.floor(parseFloat(strSUM_ADJUST)/10))* 10; //10�� ����
                        }else{
                        	if(gongyu == '0'){	// ����&������ ������ 10�� ����
                            	sum_year_cal = (Math.floor(parseFloat(strSUM_ADJUST)/10))* 10; //10�� ����
                        	}else{
                        		sum_year_cal = (Math.floor(parseFloat(strSUM_ADJUST)/100))* 100; //100�� ����
                        	}
                        }
                    }else{
                        sum_year_cal = (Math.floor(Number(strSUM_ADJUST)));
                    }


                    sum_year[i].value = insertComma2(sum_year_cal);	// ���⵵ �����


                    /****************** 2�ܰ� �� ***************************/


                    /******************    3    **************************/
                    // ������� �������� �˻��Ͽ� ���



                    var tempval = 0;

                    //�۳⵵ ����ᰡ ������ (������ ���� ���� ����� �������)
                    if(section != '3' )
                    {
                        continueProduct(i);
                        tempval = 1;
                    }

                    // �۳⵵ ����ᰡ ���ų� ������ �ش����� ������
                    if(tempval == 0 || section == '3' )
                    {

						form_adjust[i].value = form[i].value+" X "+surcharge_rate;
                        reduction_form[i].value = form[i].value+" X "+surcharge_rate + reduction_rate_form;


                        sum_adjust[i].value = insertComma2(sum_year_cal);


                        if(type_name[i].value != '����'){
                            //10�� ����
                            if( section == '3' ){
                                reduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/10))*10);
                            }else{
                                reduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/10))*10);
                            }
                        }else{
                            //100�� ����
                            if( '${SECTION}' == '3' ){
                                if(gongyu == '0'){	// ������ ������ 10�� ����
                                	reduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/10))*10);
                                }else{
                                	reduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/100))*100);
                                }
                            }else{
                                if(gongyu == '0'){	// ������ ������ 10�� ����
                                	reduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/10))*10);
                                }else{
                                	reduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/100))*100);
                                }
                            }
                        }


                        // ������ �ݾ�
                       if(type_name[i].value != '����' && purpose_cd_l[i].value.substr(0,2) == '02'){
                    	   var overtax1 =  parseFloat(removeComma(reduction_sum[i].value));
                       }else{
                       		var overtax1 =  fixFloatCal(parseFloat(removeComma(reduction_sum[i].value))*3.0/100 + parseFloat(removeComma(reduction_sum[i].value)));
                       }
                       
                        
                        overtax1 = Math.floor(overtax1/10)*10;
                        overtax[i].value = insertComma2(overtax1);


                       	// �ΰ���ġ��
                       	var type;
                       	if(type_name[i].value == '����'){
                           	type = 1;
                       	}else if(type_name[i].value == '��õ'){
                           	type = 2;
                       	}else if(type_name[i].value == '����'){
                           	type = 3;
                       	}
                       	
                       	var vat1 = inquiryVatYN('${SECTION}',type,purpose_cd_l[i].value,removeComma(reduction_sum[i].value));
                       	vat[i].value = insertComma2(vat1);
                            
                    }


                    /****************** 3�ܰ� �� ***************************/


                } // for�� end

                alert("����� �Ϸ�Ǿ����ϴ�. ");
            }


            function continueProduct(idx)
            {

                var price = document.getElementsByName("PRICE");
                var form = document.getElementsByName("FORM");
                var sum_year = document.getElementsByName("SUM_YEAR");
                var sum_lastyear = document.getElementsByName("SUM_LASTYEAR");		// �۳⵵ �����
                var form_adjust = document.getElementsByName("FORM_ADJUST");
                var adjustment = document.getElementsByName("ADJUSTMENT");
                var sum_adjust = document.getElementsByName("SUM_ADJUST");
                var reduction_sum = document.getElementsByName("REDUCTION_SUM");
                var reduction_form = document.getElementsByName("REDUCTION_FORM");
                var rate_val = document.getElementsByName("RATE_VAL");
                var overtax = document.getElementsByName("OVERTAX");

                var area_after = document.getElementsByName("AREA_AFTER");
                var period = document.getElementById("PERIOD").value;
                var rate = document.getElementsByName("RATE");

                var old_rate = document.getElementsByName("OLD_RATE");
                var old_price = document.getElementsByName("OLD_PRICE");
                var old_area_size = document.getElementsByName("OLD_AREA_SIZE");

                var type_name = document.getElementsByName("TYPE_NAME");
                var purpose_cd_l = document.getElementsByName("PURPOSE_CD_L");
                var vat = document.getElementsByName("VAT");

                var check_yn = document.getElementsByName("CHECK_YN");
                
                
                var percent_rate = document.getElementsByName("PERCENT_RATE");
                var reduction_rate = document.getElementsByName("REDUCTION_RATE");


                var percent_rate_cal = 0; // ��꿡 ����� ������
                var reduction_rate_cal = 0; // ��꿡 ����� ������
                var reduction_rate_form = "";

                
                


                if( percent_rate[idx].value == '' || percent_rate[idx].value == '0' || percent_rate[idx].value == '0.0'){
                	percent_rate_cal = '100.0';
                }else{
                	percent_rate_cal = parseFloat(percent_rate[idx].value);
                }
                
                if( reduction_rate[idx].value == '' || reduction_rate[idx].value == '0' || reduction_rate[idx].value == '0.0'){
                    reduction_rate_cal = '0.0';
                }else{
                	reduction_rate_cal = parseFloat(reduction_rate[idx].value);
                }
                
                
                if(percent_rate_cal != '' && percent_rate_cal != '0.0' && percent_rate_cal != '100.0'){
                	reduction_rate_form += " X (("+percent_rate_cal+")/100)";
                }
                if(reduction_rate_cal != '' && reduction_rate_cal != '0.0'){
                	reduction_rate_form += " X ((100-"+reduction_rate_cal+")/100)";
                }


                var price_cal = setFROMTO(removeComma(price[idx].value),0,1);
                var rate_cal = setFROMTO(rate[idx].value,0,1);
                var old_price_cal = setFROMTO(removeComma(old_price[idx].value),0,1);
                var old_rate_cal = setFROMTO(old_rate[idx].value,0,1);


               	var rateSumyear = fixFloatCal(parseFloat(old_area_size[idx].value)*parseFloat(rate_cal)*parseFloat(price_cal));
                var rateLastyear = removeComma(sum_lastyear[idx].value);

                var gongyu = purpose_cd_l[idx].value.charAt(0); // �������. �������̸� 0���� ����
                var jojung_rate = Math.floor((rateSumyear - rateLastyear ) / rateLastyear *100 ); // ���⵵ �۳⵵ ����� ����


                if(gongyu == 0 && jojung_rate >= 5 && jojung_rate <=3000 && check_yn[idx].value == '2' && type_name[idx].value == '����'){

	                //var gongyu_adjust = (rateSumyear - rateLastyear) * 0.7;	// jojung_rate�� 5�̻��̸� �������� 70%�� ��������� ��
	                var gongyu_adjust = (rateSumyear - (rateLastyear + (rateLastyear * 0.05))) * 0.3;
               	 	adjustment[idx].value = gongyu_adjust;
	               	//console.log("gongyu: " + gongyu);
	 				//console.log("jojung_rate: " + 	jojung_rate);
                    //console.log("�������: " + gongyu_adjust);
				}
                else if( jojung_rate >= 10 && jojung_rate <=3000 && check_yn[idx].value == '2' && type_name[idx].value == '����' )//������ ��� �������� ������
                {
                    //adjustment[idx].value = calJojung(jojung_rate);
                	//adjustment[idx].value = calJojungNew(jojung_rate);
                	adjustment[idx].value = calJojung2015(jojung_rate); //�����69�������� ���� #ny(2016.01.)
                }else if(jojung_rate >= 5 && check_yn[idx].value == '2' && type_name[idx].value != '����'){
                	//adjustment[idx].valque = 1.05;
                	if(gongyu != 0){
                    	// 2016.02.12 kny
						if(jojung_rate < 5) {
							adjustment[idx].value = 1;
						}else{
							adjustment[idx].value = 1.05;
						}
                    	
                    	
                    }else{
                        /*if(purpose_cd_l[idx].value.charAt(1) == '1'){
                        	//var gongyu_adjust = (rateSumyear - rateLastyear) * 0.7;	// jojung_rate�� 5�̻��̸� �������� 70%�� ��������� ��
                        	var gongyu_adjust = (rateSumyear - (rateLastyear + (rateLastyear * 0.05))) * 0.3;	// jojung_rate�� 5�̻��̸� �������� 70%�� ��������� ��
                       	 	adjustment[idx].value = gongyu_adjust;
                       	 	//console.log("gongyu: " + gongyu);
         					//console.log("jojung_rate: " + 	jojung_rate);
                            //console.log("��õ �������: " + gongyu_adjust);
                        }else if(purpose_cd_l[idx].value.charAt(1) == '2'){
                        	//adjustment[idx].value = calJojungHachun(jojung_rate);
                        	adjustment[idx].value = 1.05;
                        }*/
                    	if(10 > jojung_rate){
							adjustment[idx].value = 1.0;
						}else if(10 <= jojung_rate && jojung_rate < 20){
                			adjustment[idx].value = 1.1;
                    	}else if(20 <= jojung_rate && jojung_rate < 50){
                    		adjustment[idx].value = 1.13;
                    	}else if(50 <= jojung_rate && jojung_rate < 100){
                    		adjustment[idx].value = 1.16;                    		
                    	}else if(100 <= jojung_rate && jojung_rate < 200){
                    		adjustment[idx].value = 1.19;
                    	}else if(200 <= jojung_rate && jojung_rate < 500){
                    		adjustment[idx].value = 1.22;
                    	}else{
                    		adjustment[idx].value = 1.25;
                    	}
                    	
                    }
                }else{
                    adjustment[idx].value = 1;
                }

				var isAreaChange = false;
                if(old_area_size[idx].value != area_after[idx].value){
                	isAreaChange = true;
                }
                if(isAreaChange){
                	adjustment[idx].value = 1;
                }

                var adjust = adjustment[idx].value;
                var sum_lastyear = sum_lastyear[idx].value;


                if(adjust == 1){

                    var SUM_ADJUST = fixFloatCal( parseFloat(area_after[idx].value)*parseFloat(rate_cal)*parseFloat(price_cal)*parseFloat(period)/12*parseFloat(adjust));
                    var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate_cal)/100)*((100-reduction_rate_cal)/100));

                    if(type_name[idx].value != '����'){
                        var SUM_ADJUST = Math.floor( SUM_ADJUST / 10 ) * 10 ; //10�� ����
                        var REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10�� ����

                    }else{
                    	if(gongyu != 0){	// ������ 10�� ���� ����
                    		var SUM_ADJUST = Math.floor( SUM_ADJUST / 100 ) * 100 ; //100�� ����
                            var REDUCTION_SUM = Math.floor( REDUCTION_SUM / 100 ) * 100 ; //100�� ����
                    	}else{
                    		var SUM_ADJUST = Math.floor( SUM_ADJUST / 10 ) * 10 ; //10�� ����
                            var REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10�� ����
                    	}
                    }

                    sum_adjust[idx].value = insertComma2(SUM_ADJUST);
                    reduction_sum[idx].value = insertComma2(REDUCTION_SUM);

                    if(check_yn[idx].value == '2'){
                        form_adjust[idx].value = area_after[idx].value+"��  X " + rate_cal +" X " + insertComma2(price_cal) + " X " + adjust + " X " + period + "/12 ����";
                    }else{
                        form_adjust[idx].value = area_after[idx].value+"��  X " + rate_cal +" X " + period + "/12 ����";
                    }

                    reduction_form[idx].value = form_adjust[idx].value + reduction_rate_form;



                }else{

                	if(gongyu != 0){
	                    var SUM_ADJUST = fixFloatCal( parseFloat( removeComma(sum_lastyear))*parseFloat(period)/12*parseFloat(adjust)*(parseFloat(area_after[idx].value)/parseFloat(old_area_size[idx].value)) );
	                    var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate_cal)/100)*((100-reduction_rate_cal)/100));
	
	                    if(type_name[idx].value != '����'){
	                        var SUM_ADJUST = Math.floor( SUM_ADJUST / 10 ) * 10 ; //10�� ����
	                        var REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10�� ����
	
	                    }else{
	                        var SUM_ADJUST = Math.floor( SUM_ADJUST / 100 ) * 100 ; //100�� ����
	                        var REDUCTION_SUM = Math.floor( REDUCTION_SUM / 100 ) * 100 ; //100�� ����
	                    }
	
	                    //sum_adjust[idx].value = insertComma2(SUM_ADJUST);
	                    //reduction_sum[idx].value = insertComma2(REDUCTION_SUM);
	                    
	                    var formAdujst = sum_lastyear + "�� X "+ adjust+ " X " + period + "/12 ����";
	                    if(area_after[idx].value != old_area_size[idx].value){
	                    	formAdujst += "  X " + area_after[idx].value + "��/"+old_area_size[idx].value + "��";
	                    }
	
	                    form_adjust[idx].value = formAdujst;
	                    reduction_form[idx].value = form_adjust[idx].value + reduction_rate_form;
                	}else{	// ������ ����
                		//var SUM_ADJUST = fixFloatCal((parseFloat(removeComma(sum_lastyear))  + parseFloat(adjust)) * (parseFloat(area_after[idx].value)/parseFloat(old_area_size[idx].value)));
                		var SUM_ADJUST = fixFloatCal((parseFloat(removeComma(sum_lastyear) + (removeComma(sum_lastyear)*0.05))  + parseFloat(adjust)) * (parseFloat(area_after[idx].value)/parseFloat(old_area_size[idx].value)));
	                    var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate_cal)/100)*((100-reduction_rate_cal)/100));
	                    //console.log("sum_lastyear :" + removeComma(sum_lastyear));
	                	//console.log("adjust :" + adjust);
	                	//console.log("SUM_ADJUST :" + SUM_ADJUST);
	                	//console.log("REDUCTION_SUM :" + REDUCTION_SUM);
						var tempSum = parseFloat(removeComma(sum_lastyear) + (removeComma(sum_lastyear)*0.05));
						tempSum = Math.floor( tempSum / 10 ) * 10 ; //10�� ����
                        SUM_ADJUST = Math.floor( SUM_ADJUST / 10 ) * 10 ; //10�� ����
                        REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10�� ����
                        if(adjustment[idx].value > 1.0){
                        	formAdujst = sum_lastyear + "�� X ( "+ adjustment[idx].value + " )";
                        }else{
                       		formAdujst = tempSum + "�� + "+ Math.floor(adjust);
                		}
	                    //if(area_after[idx].value != old_area_size[idx].value){
	                    //	formAdujst = "( " + formAdujst + ")  X " + area_after[idx].value + "��/"+old_area_size[idx].value + "��";
	                    //}
	                    form_adjust[idx].value = formAdujst;
	                    //console.log("form: " + reduction_rate_form);
	                    if(reduction_rate_form != ""){
	                    	reduction_form[idx].value = "(" + form_adjust[idx].value + ")" + reduction_rate_form;
	                    }else{
	                    	reduction_form[idx].value = form_adjust[idx].value;
	                    }
                	}
                	sum_adjust[idx].value = insertComma2(SUM_ADJUST);
                    reduction_sum[idx].value = insertComma2(REDUCTION_SUM);
                }

                if(type_name[idx].value != '����' && purpose_cd_l[idx].value.substr(0,2) == '02'){
                	 var overtax1 =  parseFloat(REDUCTION_SUM);
                }else{
                    var overtax1 =  fixFloatCal(parseFloat(REDUCTION_SUM)*3.0/100+parseFloat(REDUCTION_SUM));
                }
                
                overtax1 = Math.floor(overtax1/10)*10;

                overtax[idx].value = insertComma2(overtax1);

               	// �ΰ���ġ��
               	var type;
               	if(type_name[idx].value == '����'){
                   	type = 1;
               	}else if(type_name[idx].value == '��õ'){
                   	type = 2;
               	}else if(type_name[idx].value == '����'){
                   	type = 3;
               	}
               	
               	var vat1 = inquiryVatYN('${SECTION}',type,purpose_cd_l[idx].value,parseFloat(REDUCTION_SUM));
               	vat[idx].value = insertComma2(vat1);
            }




            // ����
            function submitClick(){

                var f = document.frm;
                var year = document.getElementById("YEAR").value;

                if(f.TOTALCNT.value <= 0){
                    alert("ó���� �����Ͱ� �����ϴ�. ");
                    return;
                }
                if( document.getElementById("YEAR").value == '' ){
                    alert("�ΰ��⵵�� �־��ּ���. ");
                    document.getElementById("YEAR").focus();
                    return;
                }
                if(	document.getElementById("FROMDATE").value == '' ){
                    alert("����Ⱓ�� �־��ּ���.");
                    document.getElementById("FROMDATE").focus();
                    return;
                }
                if(document.getElementById("TODATE").value == '' ){
                    alert("����Ⱓ�� �־��ּ���.");
                    document.getElementById("TODATE").focus();
                    return;
                }
                if(	document.getElementById("TAX_DATE").value == '' ){
                    alert("�ΰ����ڸ� �־��ּ���.");
                    document.getElementById("TAX_DATE").focus();
                    return;
                }

                var sum_lastyear = document.getElementsByName("SUM_LASTYEAR");
                var sum_year = document.getElementsByName("SUM_YEAR");
                var sum_adjust = document.getElementsByName("SUM_ADJUST");
                var reduction_sum = document.getElementsByName("REDUCTION_SUM");
                var overtax = document.getElementsByName("OVERTAX");
                var form_adjust = document.getElementsByName("FORM_ADJUST");
                var check_yn = document.getElementsByName("CHECK_YN");
                var price = document.getElementsByName("PRICE");


                for( var i = 0 ; i < sum_adjust.length ; i++) {

	                if(Number(removeComma(sum_year[i].value)) > 2000000000 ||
	                		Number(removeComma(sum_adjust[i].value)) > 2000000000 ||
	                		Number(removeComma(reduction_sum[i].value)) > 2000000000 ||
	                		Number(removeComma(overtax[i].value)) > 2000000000 ||
	                		Number(removeComma(price[i].value)) > 2000000000 ||
	                		Number(removeComma(sum_lastyear[i].value)) > 2000000000){
                        alert("�ش� �ǿ� �۳⵵�����,��������,���⵵������� 20���� �ʰ��ϴ� �ݾ��� �ֽ��ϴ�. \n\n ���� �� �����ϼ���. ");
                        reduction_sum[i].focus();
                        return;
		             }
                }
                

                for( var i = 0 ; i < sum_adjust.length ; i++) {

                    if( sum_year[i].value == '' ){
                        alert("���⵵����Ḧ �ٽ� ������ּ���. ");
                        sum_year[i].focus();
                        return;
                    }else{
                        sum_year[i].value = removeComma(sum_year[i].value);
                    }
                    if( sum_adjust[i].value == '' ){
                        alert("��������Ḧ �ٽ� ������ּ���. ");
                        sum_adjust[i].focus();
                        return;
                    }else{
                        sum_adjust[i].value = removeComma(sum_adjust[i].value);
                    }
                    if( reduction_sum[i].value == '' ){
                        alert("��������Ḧ �ٽ� ������ּ���. ");
                        reduction_sum[i].focus();
                        return;
                    }else{
                        reduction_sum[i].value = removeComma(reduction_sum[i].value);
                    }
                    if( overtax[i].value == '' ){
                        alert("������ �ݾ��� �ٽ� ������ּ���. ");
                        overtax[i].focus();
                        return;
                    }else{
                        overtax[i].value = removeComma(overtax[i].value);
                    }
                    if( form_adjust[i].value == '' ){
                        alert("����� �ٽ� ���ּ���. ");
                        form_adjust[i].focus();
                        return;
                    }
                    if( check_yn[i].value == '2' ){
                        if(	price[i].value == '0' || price[i].value == '' ){
                            alert("���������� �ְ� ������ּ���. ");
                            price[i].focus();
                            return;
                        }
                    }
                    price[i].value = removeComma(price[i].value);
                    sum_lastyear[i].value = removeComma(sum_lastyear[i].value);
                }


                if(!confirm("�����Ͻñ� ���� ��Ȯ�ϰ� ���� �� �ԷµǾ����� Ȯ���ϼž� �մϴ�."))
                    return;

                if(!confirm("�����Ͻñ� ���� �ΰ�����,���⳻����, �����ı����� ��Ȯ�ϰ� �ԷµǾ����� Ȯ���ϼž� �մϴ�. \n\n �ش� �ǵ鿡 ���Ͽ� ���� �Ͻðڽ��ϱ�?"))
                    return;

                f.action = "/jumyong/junggi/junggiAllCal_Prc.do?year="+year;
                f.submit();
            }


            function 	openPriceValue(obj)
            {
            	
            	var priceList = document.getElementsByName("PRICE_BTN");
            	var targetIdx;
            	for(var i = 0 ; i < priceList.length ; i++){
            		if(priceList[i] == obj){
            			targetIdx = i;
            		} 
            	}
            	
                var admin_no = document.getElementsByName("ADMIN_NO")[targetIdx].value;
                var year = document.getElementById("YEAR").value;
                
                var winW = 320;
                var winH = 240;
                var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0";

                window.open('/land_price.do?ADMIN_NO='+admin_no+'&year='+year+'&idx='+targetIdx, 'win', status);
            }



            function setPriceValue(idx,price){
                document.getElementsByName("PRICE")[idx].value = price;
            }

            function viewResultExcel(){

                var frm = document.getElementById("frm");

                frm.action = "/jumyong/junggi/excel_junggiAllCal.do";
                frm.submit();

            }



        </script>
    </head>

    <body onload="InitPage()">
        <form id="frm" name="frm" method="post">

            <input type="hidden" id="search"  name="search" value="${search }">
            <input type="hidden" id="toDateValue" name="toDateValue" value="${toDate}" >
            <input type="hidden" id="fromDateValue" name="fromDateValue" value="${fromDate}">
            <input type="hidden" id="jumyongNameValue" name="jumyongNameValue" value="${jumyongName}">
            <input type="hidden" id="numberValueValue" name="numberValueValue" value="${numberValue}">
            <input type="hidden" id="yearVal" name="yearVal" value="${year}">
            <input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
            <input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${PURPOSE_CD}">
            <input type="hidden" id="search_flag" name="search_flag" value="${search_flag}">
            <input type="hidden" id="TOTALCNT" name="TOTALCNT" value="${listCount}">
            <input type="hidden" id="gubun" name="gubun" value="junggi">
            <input type="hidden" id = "RATE1" name="RATE1" value="" >
            <input type="hidden" id="adjust111" name="adjust111" value="">

            <!-- ����Ʈ �˻� hidden �� -->
            <input type="hidden" id="YEAR_search" name="YEAR_search" value="${year}">
            <input type="hidden" id="TYPE" name="TYPE" value="${TYPE}">
            <input type="hidden" id="TAX_SET" name="TAX_SET" value="${TAX_SET}">
            <input type="hidden" id="TAX_YN" name="TAX_YN" value="${TAX_YN}">
            <input type="hidden" id="BJ_CD" name="BJ_CD" value="${BJ_CD}">
            <input type="hidden" id="HJ_CD" name="HJ_CD" value="${HJ_CD}">
            <input type="hidden" id="jumyongName" name="jumyongName" value="${jumyongName}">
            <input type="hidden" id="SECTION" name="SECTION" value="${SECTION}">
            <input type="hidden" id="search" name="search" value="${search}">
            <input type="hidden" id="mul_fromdate" name="mul_fromdate" value="${mul_fromdate }">
            <input type="hidden" id="mul_todate" name="mul_todate" value="${mul_todate }">

            <table width="780" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td height="43"><img src="/img/jumyong_junggi_title.gif" width="800" height="43"></td>
                </tr>
                <tr>
                    <td >
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
                                            <td align="left" height="22" background="/img/tab_line_blue.gif">
                                                <table border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td><img src="/img/sub_petition_title15.gif" width="110" height="22"></td>
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td  class="contborder_purple">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td height="34" class="sub_stan">
                                                        	��ü�Ǽ� : <span class="sub_stan_blue">${listCount}</span>��

                                                        </td>

                                                        <td height="34" align="right">
                                                            <img src="/img/excel_icon.gif" alt="EXCEL ��ȯ" border="0" onclick="javascript:viewResultExcel();" style="cursor:hand">
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
                                                            <div style="width:780px;height:500px; padding:10px;overflow:scroll; scrollbar-face-color:#EEF8FB;  scrollbar-3dlight-color:#BBBDB6;scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;  scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6;">
                                                                <table width="3200" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

                                                                    <tr>
                                                                        <td width="70px" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                                                                        <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">������<br/>/���θ�</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������<br/>����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������<br/>�ּ�</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����(��õ)<br/>�ּ�</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b"></td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>�������</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>����(�ܰ�)</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>��������</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>���������</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b"></td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>�������</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>����(�ܰ�)</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>��������</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>�����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���������</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ���ġ��</td>
																		<td align="center" bgcolor="e5eff8" class="sub_table_b">�����ıݾ�</td>
                                                                        
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>���</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
                                                                        <td align="center" bgcolor="e5eff8" class="sub_table_b"></td>

                                                                    </tr>

                                                                    <c:choose>
                                                                        <c:when test='${blist != null && !empty blist}'>
                                                                            <c:forEach items="${blist}" var="board" varStatus="idx">

                                                                                <c:if test="${board.TAX_NO == board.MAX_TAX_NO}">
                                                                                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                                                                                        <td width="70px" height="28" align="center">${board.ADMIN_NO2}</td>
                                                                                        <td width="150px" align="center">${board.NAME}</td>
                                                                                        <td width="50px" align="center">${board.SECTION_NAME}</td>
                                                                                        <td width="50px" align="center">${board.SECTION}</td>
                                                                                        <td width="50px" align="center">${board.TYPE}</td>
                                                                                        <td width="50px" align="center">${board.TAX_SET}</td>
                                                                                        <td width="50px" align="center">${board.OWNER_SET_NM}</td>
                                                                                        <td align="center">${board.BJ_NM} ${board.BONBUN }</td>
                                                                                        <td align="center">${board.ROAD_ADDR}</td>
                                                                                        <td align="center">${board.PURPOSE_CLASSNM}</td>

                                                                                    <td align="center">

                                                                                    </td>

                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="OLD_AREA_SIZE" value="${board.OLD_AREA_SIZE}" style="width:70px;border:0px;text-align:center" readonly="readonly">
                                                                                    </td>
                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="OLD_RATE" value="${board.OLD_RATE}" style="width:60px;border:0px;text-align:center"  readonly="readonly">
                                                                                    </td>
                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="OLD_PRICE" value="${rnic:insertComma2(board.OLD_PRICE)}" style="width:60px;border:0px;text-align:center"  readonly="readonly">
                                                                                    </td>



                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="SUM_LASTYEAR" value="${rnic:insertComma2(board.SUM_ADJUST)}" style="width:70px;text-align:center" onkeyup="javascript:fn_addComma(this)">
                                                                                    </td>
                                                                                    <td align="center"></td>

                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="AREA_AFTER" value="${board.AREA}" style="width:70px;border:0px;text-align:center"  readonly="readonly">
                                                                                    </td>

                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="RATE" value="${board.RATE}" style="width:70px;text-align:center" onKeyDown="onlyNumberInput();">
                                                                                    </td>


                                                                                    <td width="100px" align="center">
                                                                                    
                                                                                    <c:choose>
                                                                                        <c:when test="${board.CHECK_YN == '2'}">
		                                                                                    	<input type="text" class="input_form1" name="PRICE" value="${rnic:insertComma2(board.PRICE)}" style="width:70px" onkeyup="javascript:fn_addComma(this)">
		                                                                                    	<img src="/img/stat_arr.gif" name="PRICE_BTN" onclick="javascript:openPriceValue(this);"  style="vertical-align:middle;cursor:pointer;width: 12px;height: 11px" >
                                                                                        </c:when>
                                                                                        <c:otherwise>
                                                                                            <input type="text" class="input_form1" name="PRICE" value="1" style="width:70px;border:0px;"  readonly="readonly">
                                                                                        </c:otherwise>
                                                                                    </c:choose>
                                                                                    </td>

                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="SUM_YEAR" value="" style="width:70px" onkeyup="javascript:fn_addComma(this)">
                                                                                    </td>

                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="SUM_ADJUST" value="" style="width:70px" onkeyup="javascript:fn_addComma(this)">
                                                                                    </td>
                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="REDUCTION_SUM" value="" style="width:70px" onkeyup="javascript:fn_addComma(this)">
                                                                                    </td>
                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="VAT" value="0" style="width:70px" readonly="readonly">
                                                                                    </td>
                                                                                    <td width="80px" align="center">
                                                                                        <input type="text" class="input_form1" name="OVERTAX" value="" style="width:70px" onkeyup="javascript:fn_addComma(this)">
                                                                                    </td>
                                                                                    
                                                                                    <td width="50px" align="center">
                                                                                        <input type="text" class="input_form1" name="ADJUSTMENT" value="" style="width:40px">
                                                                                    </td>
                                                                                    <td width="280px" align="center">
                                                                                        <input type="text" class="input_form1" name="FORM" value="" style="width:270px">
                                                                                    </td>
                                                                                    <td width="310px" align="center">
                                                                                        <input type="text" class="input_form1" name="FORM_ADJUST" value="" style="width:300px">
                                                                                    </td>
                                                                                    <td width="310px" align="center">
                                                                                        <input type="text" class="input_form1" name="REDUCTION_FORM" value="" style="width:300px">
                                                                                    </td>
                                                                                    <td width="50px" align="center">
                                                                                        <input type="text" class="input_form1" name="PERCENT_RATE" value="${board.PERCENT_RATE}" style="width:40px" readonly="readonly">
                                                                                    </td>
                                                                                    <td width="100px" align="center">
                                                                                        <input type="text" class="input_form1" name="PERCENT_REASON" value="${board.PERCENT_REASON}" style="width:90px" readonly="readonly">
                                                                                    </td>
                                                                                    <td width="50px" align="center">
                                                                                        <input type="text" class="input_form1" name="REDUCTION_RATE" value="${board.REDUCTION_RATE}" style="width:40px" readonly="readonly">
                                                                                    </td>
                                                                                    <td width="100px" align="center">
                                                                                        <input type="text" class="input_form1" name="REDUCTION_REASON" value="${board.REDUCTION_REASON}" style="width:90px" readonly="readonly">
                                                                                    </td>

                                                                                    <td>
                                                                                        <!-- ���� �ʿ��� ���� -->
                                                                                        <input type="hidden" name="ADMIN_NO" value="${board.ADMIN_NO}">
                                                                                        <input type="hidden" name="CHECK_YN" value="${board.CHECK_YN}">
                                                                                        <input type="hidden" name="SUM" value="">
                                                                                        <input type="hidden" name="TYPE_NAME" value="${board.TYPE}">

                                                                                        <!-- ��� �Է½� �ʿ��� ���� -->
                                                                                        <input type="hidden" name="SIGU_CD" value="${board.SIGU_CD}">
                                                                                        <input type="hidden" name="BJ_CD" value="${board.BJ_CD}">
                                                                                        <input type="hidden" name="DEPT_CD" value="${board.DEPT_CD}">
                                                                                        <input type="hidden" name="TAX_GUBUN" value="${board.TAX_GUBUN}">
                                                                                        <input type="hidden" name="OBJ_SET" value="${board.OBJ_SET}">
                                                                                        <input type="hidden" name="TAXPAYER_ID" value="${board.TAXPAYER_ID}">
                                                                                        <input type="hidden" name="TAXPAYER_SET" value="${board.TAXPAYER_SET}">
                                                                                        <input type="hidden" name="OCR_SIGU_CD" value="${board.OCR_SIGU_CD}">
                                                                                        <input type="hidden" name="OCR_BUSEO_CD" value="${board.OCR_BUSEO_CD}">
                                                                                        <input type="hidden" name="TAX_CD" value="${board.TAX_CD}">
                                                                                        <input type="hidden" name="LIVE" value="${board.LIVE}">
                                                                                        <input type="hidden" name="ADD_SET" value="${board.ADD_SET}">
                                                                                        <input type="hidden" name="ADD_YN" value="${board.ADD_YN}">
                                                                                        <input type="hidden" name="SUBUSEO_CD" value="${board.SUBUSEO_CD}">
                                                                                        <input type="hidden" name="PURPOSE_CD_L" value="${board.PURPOSE_CD}">

                                                                                        <!--���� ������ ���� �߰� ���� -->
                                                                                        <input type="hidden" name="ADMIN_NO2" value="${board.ADMIN_NO2}">
                                                                                        <input type="hidden" name="NAME" value="${board.NAME}">
                                                                                        <input type="hidden" name="TAX_SET_NAME" value="${board.TAX_SET}">
                                                                                        <input type="hidden" name="SECTION_NAME" value="${board.SECTION_NAME}">
                                                                                        <input type="hidden" name="ADDR" value="${board.BJ_NM} ${board.BONBUN }">
                                                                                         <input type="hidden" name="ROAD_ADDR" value="${board.ROAD_ADDR}">
                                                                                        <input type="hidden" name="PURPOSE_CLASSNM" value="${board.PURPOSE_CLASSNM}">
                                                                                        <input type="hidden" name="OWNER_SET_NM" value="${board.OWNER_SET_NM}">




                                                                                    </td>



                                                                                    </tr>
                                                                                </c:if>
                                                                            </c:forEach>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <tr>
                                                                                <td align="center" class="sub_table" colspan="18" height="85"> ������ �����ϴ�</td>
                                                                            </tr>
                                                                        </c:otherwise>
                                                                    </c:choose>

                                                                </table>
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr height="20">
                                                        <td>

                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td align="center" colspan="2">
                                                            <table width="100%" border="0" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                                                <tr>
                                                                    <td>���� ���� ���� ���� ������ ������� �� �� �� Ȯ���Ͻñ� �ٶ��ϴ�.(������깰ǰ������)
                                                                        <table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
                                                                            <tr>
                                                                                <td width="10%" height="26" align="left"  class="sub_table_b">&nbsp;* ���� ����</td>
                                                                            </tr>
                                                                        </table>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                            <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                                                <tr>
                                                                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ��⵵</td>
                                                                    <td width="100%" class="table_bl_left" colspan="3" align="left">
                                                                        <input id="YEAR"  name="YEAR" type="text" style="width:80px;ime-mode:disabled;" class="input_form1"  onKeyDown="onlyNumberInput();" value="${YEAR }" maxlength="4" onKeyUp="change_value(this)">
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
                                                                    <td class="table_bl_left" colspan="3" align="left">
                                                                        <input name="FROMDATE" id="FROMDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${FROMDATE }"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
                                                                        <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"  style="vertical-align:middle;cursor:pointer" >
                                                                        <input name="TODATE" id="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;"  value="${TODATE }"  onKeyDown="onlyNumberInput();" maxlength=10>
                                                                        <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');"  style="vertical-align:middle;cursor:pointer" >
                                                                        &nbsp;&nbsp; �޼� :
                                                                        <input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value = "${PERIOD}"   onKeyDown="onlyNumberInput();" >
                                                                        <img src="/img/cal_month.gif" align="absmiddle" alt="��¥ ���" width="64" height="18" border="0" style="vertical-align:middle;cursor:pointer" onClick="javascript:junggi_calDate();">

                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
                                                                    <td width="25%" class="table_bl_left" align="left">
                                                                        <input name="TAX_DATE" id="TAX_DATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${TAX_DATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
                                                                        <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd');"  style="vertical-align:middle;cursor:pointer" >
                                                                    </td>
                                                                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���⳻����</td>
                                                                    <td width="" class="table_bl_left" align="left">
                                                                        <input name="INDATE" id="INDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${TODATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
                                                                        <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd');"  style="vertical-align:middle;cursor:pointer" >
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
			                                                                <c:if test="${SECTION == '3'}">
			                                                                        	��¡��(����)
			                                                                </c:if>
			                                                        </td>
                                                        <td width="42%" class="table_bl_left" align="left">
                                                    <c:if test="${SECTION == '3'}">
                                                        <input id="SURCHARGE_RATE" name="SURCHARGE_RATE" type="text" style="width:80px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();" value="1.2">
                                                    </c:if>
                                            </td>
                                            <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
                                            	����������
                                            </td>
                                            <td width="" class="table_bl_left" align="left">
                                                <input name="OVERDATE" id="OVERDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value=""  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
                                                <!--  //********** BEGIN_����_20120227 -->
												<!-- 
												<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd');"  style="vertical-align:middle;cursor:pointer" >
												-->
												<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd');"  style="vertical-align:middle;cursor:pointer" >
												<!--   //********** END_����_20120227 -->
                                                
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td height="40" align="right" colspan="2">
                                    <table border="0" width="100%">
                                        <tr>
                                            <td height="40" align="right">
                                                <img src="/img/accou_icon.gif" alt="���" width="56" height="18" border="0" onclick="javascript:Calculate();" style="vertical-align:middle;cursor:pointer">
                                                <img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0" onClick="javascript:submitClick();" style="vertical-align:middle;cursor:pointer">
                                                <img src="/img/can_icon.gif" alt="���" border="0" onclick="javascript:history.back();" style="vertical-align:middle;cursor:pointer">
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
        <td height="30">

        </td>
    </tr>
</table>

</td>
</tr>
</table>
</form>
</body>
</html>

