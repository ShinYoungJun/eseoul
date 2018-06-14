<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>:::::   :::::</title>
<link href="/css/Mroads.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/mapImg/map_back.gif);
}
-->
</style>

<style type="text/css">
    #container {
        position:relative;
        width:100%;
        height:100%;
    }
    
    #leftMenu {
        position:absolute;
        top:0px;
        left:0px;
        width:260px;
        height:100%;
         z-index:98;
     }
     
     #layerdiv {
        position:absolute;
        top:0px;
        right:0px;
        width:120px;
        height:100%;
         z-index:98;
     }
    

    #map {
        position:absolute;
        top:0px;
        left:15px;
        width:100%;
        height:100%;
         z-index:3;
     }

    </style>
    
          	 <script>
function layer(s){

var v = "";
//alert(document.getElementById(s).value);
//alert(document.getElementById(s).checked);

	y = document.getElementById(s).value.split(",")

	for(var i =0;i<y.length;i++) {
	
		if(document.getElementById(s).checked == false){
		
			winMap.setOffLayer(y[i]);
	
		}
		else{
		
			winMap.setOnLayer(y[i]);
		
		}
				
	}

	winMap.reFlush();
}

function layerbgAll(){

	if(document.f.bg[0].checked == true){
		chk = true;
		top.map.winMap.setOnLayer('행정경계_시계','행정경계_구계','행정경계_법정계','행정경계_행정계','도로경계선','도로1','도로2','도로3','도로시설(면)','자동차전용도로','도로중심선','도로구간','입체교차부','도로분리대','도로부속물','교차로','지적','공원건물군','아파트건물군','학교건물군','일반건물군','하천호수','하천중심선','실폭하천','하천경계','소하천경계','호수저수지','인도','횡단보도','지하상가연결계단','지하상가외곽선','지하상가출입구','지하상가환기구','지하철승강장','지하철지상구간','지하철지하구간','지하철출입구','지하철환기구','지하철선로','지하철역사','철도','철도경계','철도중심선','교량','육교 ','터널','터널입구','아파트건물','학교건물','주유소','주차장 ','일반건물');	
	}
	else{
		chk = false;
		top.map.winMap.setOffLayer('행정경계_시계','행정경계_구계','행정경계_법정계','행정경계_행정계','도로경계선','도로1','도로2','도로3','도로시설(면)','자동차전용도로','도로중심선','도로구간','입체교차부','도로분리대','도로부속물','교차로','지적','공원건물군','아파트건물군','학교건물군','일반건물군','하천호수','하천중심선','실폭하천','하천경계','소하천경계','호수저수지','인도','횡단보도','지하상가연결계단','지하상가외곽선','지하상가출입구','지하상가환기구','지하철승강장','지하철지상구간','지하철지하구간','지하철출입구','지하철환기구','지하철선로','지하철역사','철도','철도경계','철도중심선','교량','육교 ','터널','터널입구','아파트건물','학교건물','주유소','주차장 ','일반건물');
	}
			
	for(i=0;i<document.f.bg.length;i++){

		document.f.bg[i].checked = chk;
	}
	winMap.reFlush(); 

}

function layerpoiAll(){

	if(document.f.poi[0].checked == true){
		chk = true;
		
		top.map.winMap.setOnLayer('행정경계(구)_poi','법정동계_poi','행정동계_poi','산맥이름_poi','지하철명사_poi','교량_poi','터널_poi','교차로_poi','입체교차부_poi','도로_poi','학교_poi','아파트_poi','일반_poi','지적_poi');
			
	}
	else{
		chk = false;
		top.map.winMap.setOffLayer('행정경계(구)_poi','법정동계_poi','행정동계_poi','산맥이름_poi','지하철명사_poi','교량_poi','터널_poi','교차로_poi','입체교차부_poi','도로_poi','학교_poi','아파트_poi','일반_poi','지적_poi');	
	}
			
	for(i=0;i<document.f.poi.length;i++){

		document.f.poi[i].checked = chk;
	}
	winMap.reFlush(); 
}

function wisungonoff(n){

	if(top.map.document.getElementById(n).checked == true){

		top.map.winMapLayersView('1','1');
		
		for(i=1;i<39;i++){
		
			if(i == '5' || i == '6' || i == '8' || i == '9' || i == '11' || i == '12' || i == '13' || i == '14' || i == '15' || i == '16' || i == '17' || i == '18' || i == '19' || i == '20' || i == '21' || i == '37')
			{
				top.map.document.getElementById(i).checked = false;
			}
			else
			{
				top.map.document.getElementById(i).checked = true;
			}
		}
		top.map.winMap.setOffLayer('공원건물군','아파트건물군','학교건물군','일반건물군','하천호수','하천중심선','실폭하천','하천경계','소하천경계','호수저수지','인도','횡단보도','지하상가연결계단','지하상가외곽선','지하상가출입구','지하상가환기구','지하철승강장','지하철지상구간','지하철지하구간','지하철출입구','지하철환기구','지하철선로','지하철역사','철도','철도경계','철도중심선','교량','육교 ','터널','터널입구','아파트건물','학교건물','주유소','주차장 ','일반건물');
		top.map.winMap.setOnLayer('행정경계_시계','행정경계_구계','행정경계_법정계','행정경계_행정계','도로경계선','도로1','도로2','도로3','도로시설(면)','자동차전용도로','도로중심선','도로구간','입체교차부','도로분리대','도로부속물','교차로','지적','행정경계(구)_poi','법정동계_poi','행정동계_poi','산맥이름_poi','지하철명사_poi','교량_poi','터널_poi','교차로_poi','입체교차부_poi','도로_poi','학교_poi','아파트_poi','일반_poi','지적_poi');		
	}
	else{

			top.map.winMapLayersView('1','1');		
	}
	
winMap.reFlush(); 
}
</script>

<script type="text/javascript" src="http://98.33.1.87:8080/kMap_base/common"></script>
<script type="text/javascript" src="/js/newWinMap.js"></script>
<script type="text/javascript" src="/js/commMap.js"></script>

</head>
<body>

    <div id="container" >    
      <div id='leftMenu'  oncontextmenu='return false' http-equiv='imagetoolbar' content='no'>
               <iframe src='/map/search.do' width='260' height='100%' frameborder='0'  name='left' scrolling='no' noresize id='left'>               </iframe>
      </div>
      
      <div id='map' oncontextmenu='return false' http-equiv='imagetoolbar' content='no'>
      </div>
    </div>

      <script>
      
      	var winW = screen.availWidth-10;	
  		var winH = screen.availHeight-50;

      	createWinMap("map",0,0,winW,winH);
      	//winMapFit();

      	//window.onresize = winMap.winMapAfterDraw;
   	

      </script>
      
      

      <div id='ctrl' width='500px' height='100px'>
      </div>
      
      <div name = 'layerdiv' id = 'layerdiv' style="display:none;overflow-y:scroll;scrollbar-face-color: #FFFFFF; scrollbar-highlight-color: #FFFFFF; scrollbar-3dlight-color: #F2F2F2; scrollbar-shadow-color: #999CC; scrollbar-darkshadow-color: #F2F2F2; scrollbar-track-color: #FFFFFF; scrollbar-arrow-color: #9999CC;">
		<form name = 'f'>
		<table height="100%" width="100%" border="0" cellspacing="0" cellpadding="0" valign="top">
	      	<tr><td width="100%" height="100%" bgcolor="f9f9f9" class="M_leftborder">
					<table width="100%" border="0" cellspacing="0" cellpadding="0" class="sub_table">
						<tr><td colspan="2"><input type="checkbox" checked onclick="layerbgAll()" name = "bg" id = "37" value="">배경전체선택</td></tr>		                                                                    
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "1" value="행정경계_시계">시도경계</td></tr>                                                   
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "2" value="행정경계_구계">시군구경계</td></tr>                                                   
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "3" value="행정경계_법정계">법정동경계</td></tr>                                                         
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "4" value="행정경계_행정계">행정동경계</td></tr>                                                         
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "5" value="공원건물군,아파트건물군,학교건물군,일반건물군">공원건물군</td></tr>                                                                                  
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "6" value="하천호수,하천중심선,실폭하천,하천경계,소하천경계,호수저수지">하천호수</td></tr>                                                                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "7" value="도로경계선,도로1,도로2,도로3,도로시설(면),자동차전용도로,도로중심선,도로구간,입체교차부,도로분리대,도로부속물">도로경계선</td></tr>                                                                                                         
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "8" value="인도">인도</td></tr>                                                                                    
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "9" value="횡단보도">횡단보도</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "10" value="교차로">교차로</td></tr>                                                                               
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "11" value="지하상가연결계단,지하상가외곽선,지하상가출입구,지하상가환기구">지하상가</td></tr>                                                                                                   
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "12" value="지하철승강장,지하철지상구간,지하철지하구간,지하철출입구,지하철환기구,지하철선로,지하철역사">지하철</td></tr>                                                                                                                             
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "13" value="철도,철도경계,철도중심선">철도</td></tr>                                                                               
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "14" value="교량">교량</td></tr>                                                                                    
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "15" value="육교">육교</td></tr>                                                                            
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "16" value="터널,터널입구">터널</td></tr>                                                                              
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "17" value="아파트건물">아파트건물</td></tr>                                                                  
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "18" value="학교건물">학교건물</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "19" value="주유소">주유소</td></tr>                                                                              
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "20" value="주차장">주차장</td></tr>                                                                              
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "21" value="일반건물">일반건물</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "22" value="지적">지적</td></tr> 
						<tr><td colspan="2"><input type="checkbox" checked onclick="layerpoiAll()" name = "poi" id = "38" value="">명칭전체선택</td></tr>	                                             
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "23" value="행정경계(구)_poi">시군구명</td></tr>                                                 
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "24" value="법정동계_poi">법정동명</td></tr>                                                            
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "25" value="행정동계_poi">행정동명</td></tr>                                                            
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "26" value="산맥이름_poi">산맥명</td></tr>                                                            
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "27" value="지하철명사_poi">지하철명</td></tr>                                                      
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "28" value="교량_poi">교량명</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "29" value="터널_poi">터널명</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "30" value="교차로_poi">교차로명</td></tr>                                                                  
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "31" value="입체교차부_poi">입체교차부명</td></tr>                                                      
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "32" value="도로_poi">도로명</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "33" value="학교_poi">학교명</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "34" value="아파트_poi">아파트명</td></tr>                                                                  
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "35" value="일반_poi">일반명</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "36" value="지적_poi">지적명</td></tr> 
						<tr><td colspan="2"><input type="checkbox" onclick="wisungonoff(this.id)" name = "wisung" id = "0" value="항공사진">항공사진</td></tr>                                                                       
						<tr><td colspan="2"><input type="checkbox" onclick="layer(this.id)" name = "jiha" id = "39" value="가스관로,가스심도,공동구,난방맨홀,난방심도,난방열관로,배전_심도,배전_지중맨홀,배전_지중관로,송전_지중맨홀,송전_지중전력구,송전_지중관로,송전_지중심도,지하상가단면상세도,지하상가_연결계단,지하상가_외곽선,지하상가_출입구,지하상가_환기구,지하철_출입구,지하철_승강장,지하철_환기구,통신맨홀,통신심도,통신관로,지하철_지상구간,지하철_지하구간">지하매설</td></tr>                                                                                                                                             
					</table></td></tr>
		</table>
		</form>
      </div>
      
<script> 

	//top.map.winMapLayerView('1:10000 도곽경계');
	//top.map.layerOnOff('1:5000 도곽경계');
	//top.map.winMapLayerView('1:1000 도곽경계');
	//top.map.winMapLayerView('1:500 도곽경계');
	//winMap.layerOnOff("image1");
	//alert();
	//top.map.winMapLayersView("3","1"); 
	//winMap.reFlush(); 
	top.map.winMapLayersView("1","0"); 
	//winMap.setGroupLayerOnOff("1","off");
	//winMap.reFlush(); 
	//alert("2");
	winMap.setOffLayer('도곽경계_10000', '도곽경계_5000', '도곽경계_1000', '도곽경계_500','행정경계_시','행정경계_구','행정경계_행정동','행정경계_법정동','가스관로','가스심도','공동구','난방맨홀','난방심도','난방열관로','배전_심도','배전_지중맨홀','배전_지중관로','송전_지중맨홀','송전_지중전력구','송전_지중관로','송전_지중심도','지하상가단면상세도','지하상가_연결계단','지하상가_외곽선','지하상가_출입구','지하상가_환기구','지하철_출입구','지하철_승강장','지하철_환기구','통신맨홀','통신심도','통신관로','지하철_지상구간','지하철_지하구간','플랫폼의지붕','플랫폼');
	winMap.reFlush(); 
	
	//winMap.setLocation(180000,182500,40);
	//winMap.reFlush();
	
	//<MinX>162000.09000000</MinX>
	//	<MinY>170000.79000000</MinY>
	//	<MaxX>208000.96000000</MaxX>
	//	<MaxY>198600.32000000</MaxY>
	
	//alert(decodeURI(encodeURI('도곽경계_10000')));
	//alert('도곽경계');
	//winMap.setViewLayer('도곽경계_10000');
</script>
</body>
</html>