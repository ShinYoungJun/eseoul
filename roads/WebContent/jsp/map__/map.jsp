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
		top.map.winMap.setOnLayer('�������_�ð�','�������_����','�������_������','�������_������','���ΰ�輱','����1','����2','����3','���νü�(��)','�ڵ������뵵��','�����߽ɼ�','���α���','��ü������','���κи���','���κμӹ�','������','����','�����ǹ���','����Ʈ�ǹ���','�б��ǹ���','�Ϲݰǹ���','��õȣ��','��õ�߽ɼ�','������õ','��õ���','����õ���','ȣ��������','�ε�','Ⱦ�ܺ���','���ϻ󰡿�����','���ϻ󰡿ܰ���','���ϻ����Ա�','���ϻ�ȯ�ⱸ','����ö�°���','����ö���󱸰�','����ö���ϱ���','����ö���Ա�','����öȯ�ⱸ','����ö����','����ö����','ö��','ö�����','ö���߽ɼ�','����','���� ','�ͳ�','�ͳ��Ա�','����Ʈ�ǹ�','�б��ǹ�','������','������ ','�Ϲݰǹ�');	
	}
	else{
		chk = false;
		top.map.winMap.setOffLayer('�������_�ð�','�������_����','�������_������','�������_������','���ΰ�輱','����1','����2','����3','���νü�(��)','�ڵ������뵵��','�����߽ɼ�','���α���','��ü������','���κи���','���κμӹ�','������','����','�����ǹ���','����Ʈ�ǹ���','�б��ǹ���','�Ϲݰǹ���','��õȣ��','��õ�߽ɼ�','������õ','��õ���','����õ���','ȣ��������','�ε�','Ⱦ�ܺ���','���ϻ󰡿�����','���ϻ󰡿ܰ���','���ϻ����Ա�','���ϻ�ȯ�ⱸ','����ö�°���','����ö���󱸰�','����ö���ϱ���','����ö���Ա�','����öȯ�ⱸ','����ö����','����ö����','ö��','ö�����','ö���߽ɼ�','����','���� ','�ͳ�','�ͳ��Ա�','����Ʈ�ǹ�','�б��ǹ�','������','������ ','�Ϲݰǹ�');
	}
			
	for(i=0;i<document.f.bg.length;i++){

		document.f.bg[i].checked = chk;
	}
	winMap.reFlush(); 

}

function layerpoiAll(){

	if(document.f.poi[0].checked == true){
		chk = true;
		
		top.map.winMap.setOnLayer('�������(��)_poi','��������_poi','��������_poi','����̸�_poi','����ö���_poi','����_poi','�ͳ�_poi','������_poi','��ü������_poi','����_poi','�б�_poi','����Ʈ_poi','�Ϲ�_poi','����_poi');
			
	}
	else{
		chk = false;
		top.map.winMap.setOffLayer('�������(��)_poi','��������_poi','��������_poi','����̸�_poi','����ö���_poi','����_poi','�ͳ�_poi','������_poi','��ü������_poi','����_poi','�б�_poi','����Ʈ_poi','�Ϲ�_poi','����_poi');	
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
		top.map.winMap.setOffLayer('�����ǹ���','����Ʈ�ǹ���','�б��ǹ���','�Ϲݰǹ���','��õȣ��','��õ�߽ɼ�','������õ','��õ���','����õ���','ȣ��������','�ε�','Ⱦ�ܺ���','���ϻ󰡿�����','���ϻ󰡿ܰ���','���ϻ����Ա�','���ϻ�ȯ�ⱸ','����ö�°���','����ö���󱸰�','����ö���ϱ���','����ö���Ա�','����öȯ�ⱸ','����ö����','����ö����','ö��','ö�����','ö���߽ɼ�','����','���� ','�ͳ�','�ͳ��Ա�','����Ʈ�ǹ�','�б��ǹ�','������','������ ','�Ϲݰǹ�');
		top.map.winMap.setOnLayer('�������_�ð�','�������_����','�������_������','�������_������','���ΰ�輱','����1','����2','����3','���νü�(��)','�ڵ������뵵��','�����߽ɼ�','���α���','��ü������','���κи���','���κμӹ�','������','����','�������(��)_poi','��������_poi','��������_poi','����̸�_poi','����ö���_poi','����_poi','�ͳ�_poi','������_poi','��ü������_poi','����_poi','�б�_poi','����Ʈ_poi','�Ϲ�_poi','����_poi');		
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
						<tr><td colspan="2"><input type="checkbox" checked onclick="layerbgAll()" name = "bg" id = "37" value="">�����ü����</td></tr>		                                                                    
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "1" value="�������_�ð�">�õ����</td></tr>                                                   
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "2" value="�������_����">�ñ������</td></tr>                                                   
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "3" value="�������_������">���������</td></tr>                                                         
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "4" value="�������_������">���������</td></tr>                                                         
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "5" value="�����ǹ���,����Ʈ�ǹ���,�б��ǹ���,�Ϲݰǹ���">�����ǹ���</td></tr>                                                                                  
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "6" value="��õȣ��,��õ�߽ɼ�,������õ,��õ���,����õ���,ȣ��������">��õȣ��</td></tr>                                                                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "7" value="���ΰ�輱,����1,����2,����3,���νü�(��),�ڵ������뵵��,�����߽ɼ�,���α���,��ü������,���κи���,���κμӹ�">���ΰ�輱</td></tr>                                                                                                         
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "8" value="�ε�">�ε�</td></tr>                                                                                    
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "9" value="Ⱦ�ܺ���">Ⱦ�ܺ���</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "10" value="������">������</td></tr>                                                                               
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "11" value="���ϻ󰡿�����,���ϻ󰡿ܰ���,���ϻ����Ա�,���ϻ�ȯ�ⱸ">���ϻ�</td></tr>                                                                                                   
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "12" value="����ö�°���,����ö���󱸰�,����ö���ϱ���,����ö���Ա�,����öȯ�ⱸ,����ö����,����ö����">����ö</td></tr>                                                                                                                             
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "13" value="ö��,ö�����,ö���߽ɼ�">ö��</td></tr>                                                                               
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "14" value="����">����</td></tr>                                                                                    
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "15" value="����">����</td></tr>                                                                            
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "16" value="�ͳ�,�ͳ��Ա�">�ͳ�</td></tr>                                                                              
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "17" value="����Ʈ�ǹ�">����Ʈ�ǹ�</td></tr>                                                                  
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "18" value="�б��ǹ�">�б��ǹ�</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "19" value="������">������</td></tr>                                                                              
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "20" value="������">������</td></tr>                                                                              
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "21" value="�Ϲݰǹ�">�Ϲݰǹ�</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "bg" id = "22" value="����">����</td></tr> 
						<tr><td colspan="2"><input type="checkbox" checked onclick="layerpoiAll()" name = "poi" id = "38" value="">��Ī��ü����</td></tr>	                                             
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "23" value="�������(��)_poi">�ñ�����</td></tr>                                                 
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "24" value="��������_poi">��������</td></tr>                                                            
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "25" value="��������_poi">��������</td></tr>                                                            
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "26" value="����̸�_poi">��Ƹ�</td></tr>                                                            
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "27" value="����ö���_poi">����ö��</td></tr>                                                      
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "28" value="����_poi">������</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "29" value="�ͳ�_poi">�ͳθ�</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "30" value="������_poi">�����θ�</td></tr>                                                                  
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "31" value="��ü������_poi">��ü�����θ�</td></tr>                                                      
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "32" value="����_poi">���θ�</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "33" value="�б�_poi">�б���</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "34" value="����Ʈ_poi">����Ʈ��</td></tr>                                                                  
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "35" value="�Ϲ�_poi">�Ϲݸ�</td></tr>                                                                        
						<tr><td width="10"></td><td><input type="checkbox" checked onclick="layer(this.id)" name = "poi" id = "36" value="����_poi">������</td></tr> 
						<tr><td colspan="2"><input type="checkbox" onclick="wisungonoff(this.id)" name = "wisung" id = "0" value="�װ�����">�װ�����</td></tr>                                                                       
						<tr><td colspan="2"><input type="checkbox" onclick="layer(this.id)" name = "jiha" id = "39" value="��������,�����ɵ�,������,�����Ȧ,����ɵ�,���濭����,����_�ɵ�,����_���߸�Ȧ,����_���߰���,����_���߸�Ȧ,����_�������±�,����_���߰���,����_���߽ɵ�,���ϻ󰡴ܸ�󼼵�,���ϻ�_������,���ϻ�_�ܰ���,���ϻ�_���Ա�,���ϻ�_ȯ�ⱸ,����ö_���Ա�,����ö_�°���,����ö_ȯ�ⱸ,��Ÿ�Ȧ,��Žɵ�,��Ű���,����ö_���󱸰�,����ö_���ϱ���">���ϸż�</td></tr>                                                                                                                                             
					</table></td></tr>
		</table>
		</form>
      </div>
      
<script> 

	//top.map.winMapLayerView('1:10000 �������');
	//top.map.layerOnOff('1:5000 �������');
	//top.map.winMapLayerView('1:1000 �������');
	//top.map.winMapLayerView('1:500 �������');
	//winMap.layerOnOff("image1");
	//alert();
	//top.map.winMapLayersView("3","1"); 
	//winMap.reFlush(); 
	top.map.winMapLayersView("1","0"); 
	//winMap.setGroupLayerOnOff("1","off");
	//winMap.reFlush(); 
	//alert("2");
	winMap.setOffLayer('�������_10000', '�������_5000', '�������_1000', '�������_500','�������_��','�������_��','�������_������','�������_������','��������','�����ɵ�','������','�����Ȧ','����ɵ�','���濭����','����_�ɵ�','����_���߸�Ȧ','����_���߰���','����_���߸�Ȧ','����_�������±�','����_���߰���','����_���߽ɵ�','���ϻ󰡴ܸ�󼼵�','���ϻ�_������','���ϻ�_�ܰ���','���ϻ�_���Ա�','���ϻ�_ȯ�ⱸ','����ö_���Ա�','����ö_�°���','����ö_ȯ�ⱸ','��Ÿ�Ȧ','��Žɵ�','��Ű���','����ö_���󱸰�','����ö_���ϱ���','�÷���������','�÷���');
	winMap.reFlush(); 
	
	//winMap.setLocation(180000,182500,40);
	//winMap.reFlush();
	
	//<MinX>162000.09000000</MinX>
	//	<MinY>170000.79000000</MinY>
	//	<MaxX>208000.96000000</MaxX>
	//	<MaxY>198600.32000000</MaxY>
	
	//alert(decodeURI(encodeURI('�������_10000')));
	//alert('�������');
	//winMap.setViewLayer('�������_10000');
</script>
</body>
</html>