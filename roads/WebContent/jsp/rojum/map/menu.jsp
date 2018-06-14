<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />

<link href="/css/roads.css" rel="stylesheet" type="text/css">
<link href="/css/Mroads.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/mapImg/left_background.gif);
}
-->
</style>
<script language="javascript" src="/js/common.js"></script>
<script type="text/JavaScript">
function showdiv(){
  if(top.map.layerdiv.style.display == "block"){
  	top.map.layerdiv.style.display = "none"
  }
  else
  {
  	top.map.layerdiv.style.display = "block"
  }
}
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
                <td><a href="javascript:top.map.Fit();" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image7','','/img/mapImg/maptool1_on.gif',1)"><img src="/img/mapImg/maptool1_off.gif" alt="전체" name="Image7" width="38" height="48" border="0"></a></td>               	
                <td><a href="javascript:top.map.ZoomIn()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','/img/mapImg/maptool2_on.gif',1)"><img src="/img/mapImg/maptool2_off.gif" alt="확대" name="Image8" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.ZoomOut()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','/img/mapImg/maptool3_on.gif',1)"><img src="/img/mapImg/maptool3_off.gif" alt="축소" name="Image9" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.toggleControl('none')" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image22','','/img/mapImg/maptool15_on.gif',1)"><img src="/img/mapImg/maptool15_off.gif" alt="이동" name="Image22" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.toggleControl('line')" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image12','','/img/mapImg/maptool6_on.gif',1)"><img src="/img/mapImg/maptool6_off.gif" alt="거리" name="Image12" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.toggleControl('polygon')" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image13','','/img/mapImg/maptool7_on.gif',1)"><img src="/img/mapImg/maptool7_off.gif" alt="면적" name="Image13" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapPrint()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image16','','/img/mapImg/maptool10_on.gif',1)"><img src="/img/mapImg/maptool10_off.gif" alt="인쇄" name="Image16" width="38" height="48" border="0"></a></td>
				<td><a href="javascript:showdiv();" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image19','','/img/mapImg/maptool12_on.gif',1)"><img src="/img/mapImg/maptool12_off.gif" alt="레이어" name="Image19" width="41" height="48" border="0"></a></td>
				<td><div class="sub_stan_b">
				<img src="/img/mapImg/blueRec.gif" style="vertical-align: middle;">
				관리대상 : <input type="text" id ="mainCount" name="mainCount" value="" size="5" class="essential"  readonly>
				<img src="/img/mapImg/redRec.gif" style="vertical-align: middle;">
				정비대상 : <input type="text" id ="jungbiCount" name="jungbiCount" value="" size="5" class="essential"  readonly>
				점용료부과 : <input type="text" id ="taxCount" name="taxCount" value="" size="5" class="essential"  readonly></div></td>
              	<td></td>
              </tr>
            </table>
        	</td>
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