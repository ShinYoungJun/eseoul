<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link href="/css/Mroads.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/mapImg/left_background.gif);
}
-->
</style>

<script type="text/JavaScript">
<!--
function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
function showdiv()
{
  if(top.map.layerdiv.style.display == "block"){
  	top.map.layerdiv.style.display = "none"
  }
  else
  {
  	top.map.layerdiv.style.display = "block"
  }
}

function onOff(n)
{

	if(top.map.document.getElementById(n).checked == false){
	
		top.map.document.getElementById(n).checked = true;
		
		if(n == '0'){
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
			top.map.winMap.setOnLayer('가스관로','가스심도','공동구','난방맨홀','난방심도','난방열관로','배전_심도','배전_지중맨홀','배전_지중관로','송전_지중맨홀','송전_지중전력구','송전_지중관로','송전_지중심도','지하상가단면상세도','지하상가_연결계단','지하상가_외곽선','지하상가_출입구','지하상가_환기구','지하철_출입구','지하철_승강장','지하철_환기구','통신맨홀','통신심도','통신관로','지하철_지상구간','지하철_지하구간');
		}
	}
	
	else{
	
		top.map.document.getElementById(n).checked = false;

		if(n == '0'){
			top.map.winMapLayersView('1','1');
			
			for(i=1;i<39;i++){
				top.map.document.getElementById(i).checked = true;
			}
			top.map.winMap.setOnLayer('행정경계_시계','행정경계_구계','행정경계_법정계','행정경계_행정계','도로경계선','도로1','도로2','도로3','도로시설(면)','자동차전용도로','도로중심선','도로구간','입체교차부','도로분리대','도로부속물','교차로','지적','행정경계(구)_poi','법정동계_poi','행정동계_poi','산맥이름_poi','지하철명사_poi','교량_poi','터널_poi','교차로_poi','입체교차부_poi','도로_poi','학교_poi','아파트_poi','일반_poi','지적_poi','공원건물군','아파트건물군','학교건물군','일반건물군','하천호수','하천중심선','실폭하천','하천경계','소하천경계','호수저수지','인도','횡단보도','지하상가연결계단','지하상가외곽선','지하상가출입구','지하상가환기구','지하철승강장','지하철지상구간','지하철지하구간','지하철출입구','지하철환기구','지하철선로','지하철역사','철도','철도경계','철도중심선','교량','육교 ','터널','터널입구','아파트건물','학교건물','주유소','주차장 ','일반건물');
		}
		else{
			top.map.winMap.setOffLayer('가스관로','가스심도','공동구','난방맨홀','난방심도','난방열관로','배전_심도','배전_지중맨홀','배전_지중관로','송전_지중맨홀','송전_지중전력구','송전_지중관로','송전_지중심도','지하상가단면상세도','지하상가_연결계단','지하상가_외곽선','지하상가_출입구','지하상가_환기구','지하철_출입구','지하철_승강장','지하철_환기구','통신맨홀','통신심도','통신관로','지하철_지상구간','지하철_지하구간');
		}
	}
	top.map.winMap.reFlush(); 
}

//'가스관로','가스심도','공동구','난방맨홀','난방심도','난방열관로','배전_심도','배전_지중맨홀','배전_지중관로','송전_지중맨홀','송전_지중전력구','송전_지중관로','송전_지중심도','지하상가단면상세도','지하상가 연결계단','지하상가 외곽선','지하상가 출입구','지하상가 환기구','지하철 출입구','지하철 승강장','통신맨홀','통신심도','통신관',"
//-->
</script>
</head>
<body>
<table width="100%" height="62" border="0" cellpadding="0" cellspacing="0" background="/img/mapImg/top_back.gif">
  <tr>
    <td width="260"><img src="/img/mapImg/logo.gif" width="260" height="62"></td>
    <td><table width="100%" height="62" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="10"><img src="/img/mapImg/menu_back2.gif" width="220" height="10"></td>
      </tr>
      <tr>
        <td background="/img/mapImg/menu_back.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="15"><img src="/img/mapImg/menu_left.gif" width="15" height="48"></td>
            <td width="6"></td>
            <td><table border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><a href="javascript:top.map.winMapFit()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image7','','/img/mapImg/maptool1_on.gif',1)"><img src="/img/mapImg/maptool1_off.gif" alt="전체" name="Image7" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapMove()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image22','','/img/mapImg/maptool15_on.gif',1)"><img src="/img/mapImg/maptool15_off.gif" alt="이동" name="Image22" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapZoomIn()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','/img/mapImg/maptool2_on.gif',1)"><img src="/img/mapImg/maptool2_off.gif" alt="확대" name="Image8" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapZoomOut()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','/img/mapImg/maptool3_on.gif',1)"><img src="/img/mapImg/maptool3_off.gif" alt="축소" name="Image9" width="38" height="48" border="0"></a></td>
                <!-- td><a href="javascript:top.map.winMapPrev()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','/img/mapImg/maptool4_on.gif',1)"><img src="/img/mapImg/maptool4_off.gif" alt="이전" name="Image10" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapNext()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image11','','/img/mapImg/maptool5_on.gif',1)"><img src="/img/mapImg/maptool5_off.gif" alt="이후" name="Image11" width="38" height="48" border="0"></a></td -->
                <td><a href="javascript:top.map.winMapDistance()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image12','','/img/mapImg/maptool6_on.gif',1)"><img src="/img/mapImg/maptool6_off.gif" alt="거리" name="Image12" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapArea()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image13','','/img/mapImg/maptool7_on.gif',1)"><img src="/img/mapImg/maptool7_off.gif" alt="면적" name="Image13" width="38" height="48" border="0"></a></td>
                <!-- td><a href="#" onMouseOut="MM_swapImgRestore()" onFocus="this.blur()" onMouseOver="MM_swapImage('Image14','','/img/mapImg/maptool8_on.gif',1)"><img src="/img/mapImg/maptool8_off.gif" alt="색인맵" name="Image14" width="38" height="48" border="0"></a></td>
                <td><a href="#" onMouseOut="MM_swapImgRestore()" onFocus="this.blur()" onMouseOver="MM_swapImage('Image15','','/img/mapImg/maptool9_on.gif',1)"><img src="/img/mapImg/maptool9_off.gif" alt="범례" name="Image15" width="38" height="48" border="0"></a></td -->
                <td><a href="javascript:top.map.winMapPrint()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image16','','/img/mapImg/maptool10_on.gif',1)"><img src="/img/mapImg/maptool10_off.gif" alt="인쇄" name="Image16" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.downImgFile();" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image17','','/img/mapImg/maptool11_on.gif',1)"><img src="/img/mapImg/maptool11_off.gif" alt="저장" name="Image17" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:showdiv();" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image19','','/img/mapImg/maptool12_on.gif',1)"><img src="/img/mapImg/maptool12_off.gif" alt="레이어" name="Image19" width="41" height="48" border="0"></a></td>
                <td><a href="javascript:onOff('0');" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image20','','/img/mapImg/maptool13_on.gif',1)"><img src="/img/mapImg/maptool13_off.gif" alt="항공사진" name="Image20" width="48" height="48" border="0"></a></td>
                <td><a href="javascript:onOff('39');" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image21','','/img/mapImg/maptool14_on.gif',1)"><img src="/img/mapImg/maptool14_off.gif" alt="지하매설" name="Image21" width="46" height="48" border="0"></a></td>
              </tr>
            </table></td>
            <td width="17"><img src="/img/mapImg/menu_right.gif" width="17" height="48"></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="4"><img src="/img/mapImg/menu_back3.gif" width="220" height="4"></td>
      </tr>
    </table></td>
    <td width="10"></td>
  </tr>
</table>
</body>
</html>