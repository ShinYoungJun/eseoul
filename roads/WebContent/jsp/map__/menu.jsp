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
			top.map.winMap.setOffLayer('�����ǹ���','����Ʈ�ǹ���','�б��ǹ���','�Ϲݰǹ���','��õȣ��','��õ�߽ɼ�','������õ','��õ���','����õ���','ȣ��������','�ε�','Ⱦ�ܺ���','���ϻ󰡿�����','���ϻ󰡿ܰ���','���ϻ����Ա�','���ϻ�ȯ�ⱸ','����ö�°���','����ö���󱸰�','����ö���ϱ���','����ö���Ա�','����öȯ�ⱸ','����ö����','����ö����','ö��','ö�����','ö���߽ɼ�','����','���� ','�ͳ�','�ͳ��Ա�','����Ʈ�ǹ�','�б��ǹ�','������','������ ','�Ϲݰǹ�');
			top.map.winMap.setOnLayer('�������_�ð�','�������_����','�������_������','�������_������','���ΰ�輱','����1','����2','����3','���νü�(��)','�ڵ������뵵��','�����߽ɼ�','���α���','��ü������','���κи���','���κμӹ�','������','����','�������(��)_poi','��������_poi','��������_poi','����̸�_poi','����ö���_poi','����_poi','�ͳ�_poi','������_poi','��ü������_poi','����_poi','�б�_poi','����Ʈ_poi','�Ϲ�_poi','����_poi');
			
			
		}
		else{
			top.map.winMap.setOnLayer('��������','�����ɵ�','������','�����Ȧ','����ɵ�','���濭����','����_�ɵ�','����_���߸�Ȧ','����_���߰���','����_���߸�Ȧ','����_�������±�','����_���߰���','����_���߽ɵ�','���ϻ󰡴ܸ�󼼵�','���ϻ�_������','���ϻ�_�ܰ���','���ϻ�_���Ա�','���ϻ�_ȯ�ⱸ','����ö_���Ա�','����ö_�°���','����ö_ȯ�ⱸ','��Ÿ�Ȧ','��Žɵ�','��Ű���','����ö_���󱸰�','����ö_���ϱ���');
		}
	}
	
	else{
	
		top.map.document.getElementById(n).checked = false;

		if(n == '0'){
			top.map.winMapLayersView('1','1');
			
			for(i=1;i<39;i++){
				top.map.document.getElementById(i).checked = true;
			}
			top.map.winMap.setOnLayer('�������_�ð�','�������_����','�������_������','�������_������','���ΰ�輱','����1','����2','����3','���νü�(��)','�ڵ������뵵��','�����߽ɼ�','���α���','��ü������','���κи���','���κμӹ�','������','����','�������(��)_poi','��������_poi','��������_poi','����̸�_poi','����ö���_poi','����_poi','�ͳ�_poi','������_poi','��ü������_poi','����_poi','�б�_poi','����Ʈ_poi','�Ϲ�_poi','����_poi','�����ǹ���','����Ʈ�ǹ���','�б��ǹ���','�Ϲݰǹ���','��õȣ��','��õ�߽ɼ�','������õ','��õ���','����õ���','ȣ��������','�ε�','Ⱦ�ܺ���','���ϻ󰡿�����','���ϻ󰡿ܰ���','���ϻ����Ա�','���ϻ�ȯ�ⱸ','����ö�°���','����ö���󱸰�','����ö���ϱ���','����ö���Ա�','����öȯ�ⱸ','����ö����','����ö����','ö��','ö�����','ö���߽ɼ�','����','���� ','�ͳ�','�ͳ��Ա�','����Ʈ�ǹ�','�б��ǹ�','������','������ ','�Ϲݰǹ�');
		}
		else{
			top.map.winMap.setOffLayer('��������','�����ɵ�','������','�����Ȧ','����ɵ�','���濭����','����_�ɵ�','����_���߸�Ȧ','����_���߰���','����_���߸�Ȧ','����_�������±�','����_���߰���','����_���߽ɵ�','���ϻ󰡴ܸ�󼼵�','���ϻ�_������','���ϻ�_�ܰ���','���ϻ�_���Ա�','���ϻ�_ȯ�ⱸ','����ö_���Ա�','����ö_�°���','����ö_ȯ�ⱸ','��Ÿ�Ȧ','��Žɵ�','��Ű���','����ö_���󱸰�','����ö_���ϱ���');
		}
	}
	top.map.winMap.reFlush(); 
}

//'��������','�����ɵ�','������','�����Ȧ','����ɵ�','���濭����','����_�ɵ�','����_���߸�Ȧ','����_���߰���','����_���߸�Ȧ','����_�������±�','����_���߰���','����_���߽ɵ�','���ϻ󰡴ܸ�󼼵�','���ϻ� ������','���ϻ� �ܰ���','���ϻ� ���Ա�','���ϻ� ȯ�ⱸ','����ö ���Ա�','����ö �°���','��Ÿ�Ȧ','��Žɵ�','��Ű�',"
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
                <td><a href="javascript:top.map.winMapFit()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image7','','/img/mapImg/maptool1_on.gif',1)"><img src="/img/mapImg/maptool1_off.gif" alt="��ü" name="Image7" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapMove()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image22','','/img/mapImg/maptool15_on.gif',1)"><img src="/img/mapImg/maptool15_off.gif" alt="�̵�" name="Image22" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapZoomIn()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','/img/mapImg/maptool2_on.gif',1)"><img src="/img/mapImg/maptool2_off.gif" alt="Ȯ��" name="Image8" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapZoomOut()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','/img/mapImg/maptool3_on.gif',1)"><img src="/img/mapImg/maptool3_off.gif" alt="���" name="Image9" width="38" height="48" border="0"></a></td>
                <!-- td><a href="javascript:top.map.winMapPrev()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','/img/mapImg/maptool4_on.gif',1)"><img src="/img/mapImg/maptool4_off.gif" alt="����" name="Image10" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapNext()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image11','','/img/mapImg/maptool5_on.gif',1)"><img src="/img/mapImg/maptool5_off.gif" alt="����" name="Image11" width="38" height="48" border="0"></a></td -->
                <td><a href="javascript:top.map.winMapDistance()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image12','','/img/mapImg/maptool6_on.gif',1)"><img src="/img/mapImg/maptool6_off.gif" alt="�Ÿ�" name="Image12" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.winMapArea()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image13','','/img/mapImg/maptool7_on.gif',1)"><img src="/img/mapImg/maptool7_off.gif" alt="����" name="Image13" width="38" height="48" border="0"></a></td>
                <!-- td><a href="#" onMouseOut="MM_swapImgRestore()" onFocus="this.blur()" onMouseOver="MM_swapImage('Image14','','/img/mapImg/maptool8_on.gif',1)"><img src="/img/mapImg/maptool8_off.gif" alt="���θ�" name="Image14" width="38" height="48" border="0"></a></td>
                <td><a href="#" onMouseOut="MM_swapImgRestore()" onFocus="this.blur()" onMouseOver="MM_swapImage('Image15','','/img/mapImg/maptool9_on.gif',1)"><img src="/img/mapImg/maptool9_off.gif" alt="����" name="Image15" width="38" height="48" border="0"></a></td -->
                <td><a href="javascript:top.map.winMapPrint()" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image16','','/img/mapImg/maptool10_on.gif',1)"><img src="/img/mapImg/maptool10_off.gif" alt="�μ�" name="Image16" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:top.map.downImgFile();" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image17','','/img/mapImg/maptool11_on.gif',1)"><img src="/img/mapImg/maptool11_off.gif" alt="����" name="Image17" width="38" height="48" border="0"></a></td>
                <td><a href="javascript:showdiv();" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image19','','/img/mapImg/maptool12_on.gif',1)"><img src="/img/mapImg/maptool12_off.gif" alt="���̾�" name="Image19" width="41" height="48" border="0"></a></td>
                <td><a href="javascript:onOff('0');" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image20','','/img/mapImg/maptool13_on.gif',1)"><img src="/img/mapImg/maptool13_off.gif" alt="�װ�����" name="Image20" width="48" height="48" border="0"></a></td>
                <td><a href="javascript:onOff('39');" onFocus="this.blur()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image21','','/img/mapImg/maptool14_on.gif',1)"><img src="/img/mapImg/maptool14_off.gif" alt="���ϸż�" name="Image21" width="46" height="48" border="0"></a></td>
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