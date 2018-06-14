<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/jsp/common/environment_setting.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>::::: ����� ������������ý��� :::::</title>
<link href="css/Mroads.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--

body {
	margin: 0px;
	background-image: url(/img/mapImg/map_back.gif)
	margin: 0px;
}

#container {
        position:relative;
        width:820px;
    }
    
#map {
        position:absolute;
        top:0px;
        left:0px;
        width:100%;
        height:100%;
         z-index:3;

.M_leftborder {
	border-bottom: 2px #dbdbdb solid;
	border-left: 2px #dbdbdb solid;
	border-right: 2px #dbdbdb solid;
}


.M_leftborder2 {
	border-left: 1px #dbdbdb solid;
	border-right: 1px #dbdbdb solid;
}



.input_form1 {
	font-family: "����", "����ü";
	border: 1px #cccccc solid; 
	font-size: 11px; 
	color: #848484;
	PADDING-left: 3px; 
	text-decoration: none;
}

A.inqu {
	CURSOR: hand
}
A.inqu:visited {
	FONT-SIZE: 11px; COLOR: #858585; font-family: "����", "����ü"; TEXT-DECORATION: none;
}
A.inqu:link {
	FONT-SIZE: 11px; COLOR: #858585; font-family: "����", "����ü"; TEXT-DECORATION: none;
}
A.inqu:hover {
	FONT-SIZE: 11px; COLOR: #c5c5c5; font-family: "����", "����ü"; TEXT-DECORATION: underline;
}




A.list {
	CURSOR: hand
}
A.list:visited {
	FONT-SIZE: 11px; COLOR: #8e8e8e; font-family: "����", "����ü"; TEXT-DECORATION: none;
}
A.list:link {
	FONT-SIZE: 11px; COLOR: #8e8e8e; font-family: "����", "����ü"; TEXT-DECORATION: none;
}
A.list:hover {
	FONT-SIZE: 11px; COLOR: #bebebe; font-family: "����", "����ü"; BACKGROUND-COLOR: #dfebf4; TEXT-DECORATION: underline
}



.Map_stan{
	font-family: "����", "����ü"; 
	font-size: 11px; 
	color: #7d7d7d;
	text-decoration: none;
}


.Map_stan_b{
	font-family: "����", "����ü"; 
	font-size: 11px; 
	color: #7d7d7d;
	FONT-WEIGHT: bold;
	text-decoration: none;
}


.table_bl_left {
	PADDING-left: 5px; 
}


.sub_stan_blue{
	font-family: "����", "����ü"; 
	font-size: 11px; 
	color: #4376b5;
	FONT-WEIGHT: bold;
	text-decoration: none;
}


.sub_table{
	font-family: "����", "����ü"; 
	font-size: 11px; 
	color: #757575;
	text-decoration: none;
}


.sub_table_b{
	font-family: "����", "����ü"; 
	font-size: 11px; 
	color: #757575;
	FONT-WEIGHT: bold;
	text-decoration: none;
}


.mapborder {
	border: 3px #e5e5e5 solid;   
}



.bbs_bl_left {
	PADDING: 6px; 
}

     }

     
     
-->
</style>
<script type="text/javascript" src="<%=MapServerURL%>/kMap_base/common"></script>
<script type="text/javascript" src="/js/newWinMap.js"></script>
<script type="text/javascript" src="/js/commMap.js"></script>
<script type="text/JavaScript">
<!--
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
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


function clickxy() {

	if(_click == null){
		alert("�ش���ġ�� Ŭ���ϼ���.");
		winMapUserMode('userSelect');
		_click = 1;
	}
	else{
		_click = null;
		winMapUserMode('');
	}
  	
}

function setMapxy(xx,yy) {
	f = document.form;
	f.xx.value = xx;
	f.yy.value = yy;
	
}

function setOpenerxy() {
	
  	if(document.form.xx.value==null || document.form.xx.value.length==0 || document.form.yy.value==null || document.form.yy.value.length==0){
  	  	alert("��ġ ������ �����ϴ�.\n��ġ�� ������ �ּ���");
  	  	return;
  	}
  	
  	document.form.xx.value = parseInt(document.form.xx.value*100000)/100000
  	document.form.yy.value = parseInt(document.form.yy.value*100000)/100000
  	
  	if("${FLAG}" == "GAPAN"){
	 	f = opener.document.form;
	 	
	 	f.X_COORD.value = document.form.xx.value; 
	 	f.Y_COORD.value = document.form.yy.value; 
	}
     else{
     	f = opener.document.placeLocationForm

		f.Locate_x.value = document.form.xx.value;
	    f.Locate_y.value = document.form.yy.value;
     }
  
     if(confirm("��ġ������ ��ϵǾ����ϴ�. â�� �����ðڽ��ϱ�?"))
	{
		window.close();
	}
   
}

//-->
</script>

</head>
<body onLoad="MM_preloadImages('/img/mapImg/maptool2_on.gif','/img/mapImg/maptool3_on.gif','/img/mapImg/maptool15_on.gif','/img/mapImg/maptool4_on.gif','/img/mapImg/maptool5_on.gif','/img/mapImg/maptool16_on.gif','/img/mapImg/maptool17_on.gif')">
<form name="form">
<input type="hidden" name="xx" value="${miniMap.XX_COORD}">
<input type="hidden" name="yy" value="${miniMap.YY_COORD}">
<table width="820" height="780" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="12"><img src="/img/mapImg/box_top_left.gif" width="12" height="12"></td>
    <td background="/img/mapImg/box_top_mid.gif"></td>
    <td><img src="/img/mapImg/box_top_right.gif" width="12" height="12"></td>
  </tr>
  <tr>
    <td width="12" background="/img/mapImg/box_left.gif"></td>
    <td align="center" valign="top"><table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="48"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="15"><img src="/img/mapImg/menu_left2.gif" width="15" height="48"></td>
              <td background="/img/mapImg/menu_back.gif"><table border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td><a href="javascript:winMapZoomIn()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','/img/mapImg/maptool2_on.gif',1)"><img src="/img/mapImg/maptool2_off.gif" alt="Ȯ��" name="Image8" width="38" height="48" border="0"></a></td>
                  <td><a href="javascript:winMapZoomOut()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','/img/mapImg/maptool3_on.gif',1)"><img src="/img/mapImg/maptool3_off.gif" alt="���" name="Image9" width="38" height="48" border="0"></a></td>
                  <td><a href="javascript:winMapMove()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','/img/mapImg/maptool15_on.gif',1)"><img src="/img/mapImg/maptool15_off.gif" alt="�̵�" name="Image10" width="38" height="48" border="0"></a></td>
                  <!--td><a href="javascript:winMapPrev()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image11','','/img/mapImg/maptool4_on.gif',1)"><img src="/img/mapImg/maptool4_off.gif" alt="����" name="Image11" width="38" height="48" border="0"></a></td>
                  <td><a href="javascript:winMapNext()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image12','','/img/mapImg/maptool5_on.gif',1)"><img src="/img/mapImg/maptool5_off.gif" alt="����" name="Image12" width="38" height="48" border="0"></a></td-->
                  <td><img src="/img/mapImg/maptool_line2.gif" width="9" height="48"></td>
                  <c:choose>
              		<c:when test="${CHECK == '1'}"><td></td><td></td></c:when>
              		<c:when test="${CHECK == '0'}">
              			<td><a href="javascript:clickxy();" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image13','','/img/mapImg/maptool16_on.gif',1)"><img src="/img/mapImg/maptool16_off.gif" name="Image13" width="90" height="48" border="0"></a></td>
                  		<td><a href="javascript:setOpenerxy();" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image14','','/img/mapImg/maptool17_on.gif',1)"><img src="/img/mapImg/maptool17_off.gif" name="Image14" width="90" height="48" border="0"></a></td>
              		</c:when>
              	</c:choose>                  
                </tr>
              </table></td>
              <td width="22" height="48" align="right" background="/img/mapImg/menu_back.gif"><a href="#"><img src="/img/mapImg/close.gif" alt="�ݱ�" width="22" height="17" border="0" onclick="self.close();" style="cursor:pointer;" /></a></td>
              <td width="17"><img src="/img/mapImg/menu_right2.gif" width="17" height="48"></td>
            </tr>
        </table></td>
      </tr>
      <tr>
        <td class="mapborder" valign="top">
    
     <div id="container" >   
      <div id='minimap' oncontextmenu='return false' http-equiv='imagetoolbar' content='no'>
      </div>
      
      </div>
  

      <script>
      	createWinMap("minimap",0,0,820,620)
      	winMap.setRevisionLeftTop(20,70); 
      </script>

      <div id='ctrl' width='500px' height='100px'>
      </div>
      <script> 
      	winMapLayersView("1","0");
      	winMap.setOffLayer('�������_10000', '�������_5000', '�������_1000', '�������_500','�������_��','�������_��','�������_������','�������_������','��������','�����ɵ�','������','�����Ȧ','����ɵ�','���濭����','����_�ɵ�','����_���߸�Ȧ','����_���߰���','����_���߸�Ȧ','����_�������±�','����_���߰���','����_���߽ɵ�','���ϻ󰡴ܸ�󼼵�','���ϻ�_������','���ϻ�_�ܰ���','���ϻ�_���Ա�','���ϻ�_ȯ�ⱸ','����ö_���Ա�','����ö_�°���','����ö_ȯ�ⱸ','��Ÿ�Ȧ','��Žɵ�','��Ű���','����ö_���󱸰�','����ö_���ϱ���','�÷���������','�÷���');
		winMap.reFlush();
		
		xx = null;
		yy = null;
		
		flag = true;

		 if("${FLAG}" == "GAPAN"){

		 	f = opener.document.form;		 	

		 	if("${miniMap.XX_COORD}" == "" || "${miniMap.YY_COORD}" == ""){
		 	
			 	if(f.X_COORD.value == "" || f.Y_COORD.value ==  ""){
			 	}
				else{
					 xx = f.X_COORD.value;
				     yy = f.Y_COORD.value;
			    }
			}
			else {
			 	if(f.X_COORD.value == "" || f.Y_COORD.value ==  ""){
			 		flag = false;
					xx = "${miniMap.XX_COORD}";
				 	yy = "${miniMap.YY_COORD}";
			 	}
				else{	
					 xx = f.X_COORD.value;
				     yy = f.Y_COORD.value;
			    }
			}
	     }
	     else{
	     
	     	f = opener.document.placeLocationForm

	     	if("${X}" == "" || "${Y}" == ""){
		     	if("${miniMap.XX_COORD}" == "" || "${miniMap.YY_COORD}" == ""){
			 	
				 	if(f.Locate_x.value == "" || f.Locate_y.value ==  ""){

				 	}
					else{	
						 xx = f.Locate_x.value;
			   			 yy = f.Locate_y.value;
				    }
				}
				else {
					xx = "${miniMap.XX_COORD}";
				 	yy = "${miniMap.YY_COORD}";
				}
	     	}
	     	else {
	     		xx = "${X}";
			 	yy = "${Y}";
	     	}
	     }
		 
	    if(xx != null || yy != null){
	    	if(flag){
	     		setLocation(xx,yy,0.5,"","","");
	    	}else{
	    		
	    		setLocation(xx,yy,0.2,"","","bj");
	    	}
	    }
	    else if("${miniMap.POINT_X}" != "" || "${miniMap.POINT_Y}" != ""){

	    	setLocation("${miniMap.POINT_X}","${miniMap.POINT_Y}",3.0,"","","bj");
	    }

	</script>    
      
      </td>
      </tr>
      <tr>
        <td height="56"><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
            <tr>
              <td width="15%" height="28" bgcolor="e5eff8" class="bbs_bl_left"><strong>������/<br>
                ���θ�</strong></td>
              <td bgcolor="eaeaea" class="table_bl_left">
              	<c:choose>
              		<c:when test="${FLAG == 'JUMYONG'}">${NAME}</c:when>
              		<c:when test="${FLAG == 'GAPAN'}">${OWNER_NAME}</c:when>
              	</c:choose></td>
            </tr>
            <tr>
              <td height="28" bgcolor="e5eff8" class="bbs_bl_left"><strong>������ <br>
                �ּ�</strong></td>
              <td bgcolor="eaeaea" class="table_bl_left">${ADDR}</td>
            </tr>
        </table></td>
      </tr>
    </table></td>
    <td width="12" background="/img/mapImg/box_right.gif"></td>
  </tr>
  <tr>
    <td height="12"><img src="/img/mapImg/box_bottom_left.gif" width="12" height="12"></td>
    <td background="/img/mapImg/box_bottom_mid.gif"></td>
    <td><img src="/img/mapImg/box_bottom_right.gif" width="12" height="12"></td>
  </tr>
</table>
</form>
</body>
</html>
