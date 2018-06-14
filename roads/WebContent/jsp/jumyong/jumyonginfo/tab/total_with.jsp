<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

        <title>::::: 서울시 도로점용관리시스템 :::::</title>
        <style type="text/css">
            <!--
            body {
                margin: 0px;
                background-image: url/img/left_back.gif);
            }
            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
    </head>

    <script language="javascript" src="/js/PopupCalendar.js"></script>
    <script language='JavaScript' src='/js/Check_inputbox.js'></script>
    <script language="javascript" src="/js/calculation.js"></script> 
    <script language="javascript" src="/js/Ajax_request.js"></script>

    <script type="text/javascript">

        function init(){

            MakeXML();

            if(opener.document.getElementById("WITH_XML").value != ""){
                document.getElementById("WITH_XML").value = opener.document.getElementById("WITH_XML").value;
            }
            //else{
            //	<c:forEach items="${blist}" var="board" varStatus="idx">
            //		insertNodeVal('${BJ_NM}','${board.BONBUN}','${board.BUBUN}','${board.PRICE}');
            //	</c:forEach>
            //
            //}

            makeList();
        }

        //xml 초기화

        function 	MakeXML()
        {

            var xmlDom = new ActiveXObject("Microsoft.XMLDOM");

            var objRoot = xmlDom.createElement("ROOT");
            xmlDom.appendChild(objRoot);

            document.getElementById("WITH_XML").value = xmlDom.xml;
        }

        //노드수대로 리스트 맹글기

        function	makeList()
        {
            var	obj		= document.getElementById("WITH_XML").value;
            var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
            var form 	= document.form;

            xmlDom.async	= false;
            xmlDom.loadXML(obj);

            var objRoot	= xmlDom.documentElement;
            var	length	= objRoot.childNodes.length;
            var Child 	= objRoot.firstChild;

            var	blist	= document.getElementById("blist");
            var	tag		= "";
            var	BJ_NM		= "";
            var	BONBUN		= "";
            var	BUBUN		= "";
            var	PRICE		= "";
            var	method			= "";
            var TOTAL_PRICE = 0;

            var	top	= "<table width='100%' border='1' bordercolor='#c9dfed' style='border-collapse:collapse;' cellpadding='0' cellspacing='0'  class='sub_table'>" +
                "<tr><td width = '40'  height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>번호</td>" +
                "<td width = '80'  align='center' bgcolor='e5eff8' class='sub_table_b'>법정동명</td>" +
                "<td width = '50'  align='center' bgcolor='e5eff8' class='sub_table_b'>본번</td>" +
                "<td width = '50'  align='center' bgcolor='e5eff8' class='sub_table_b'>부번</td>" +
                "<td width = '80'  align='center' bgcolor='e5eff8' class='sub_table_b'>공시지가</td>" +
                "<td align='center' bgcolor='e5eff8' class='sub_table_b'>삭제</td></tr>";

            if(length	> 0)
            {
                for(i = 0	;	i < length	;	i++)
                {
                    BJ_NM		= Child.getElementsByTagName("BJ_NM").item(0).text;
                    BONBUN		= Child.getElementsByTagName("BONBUN").item(0).text;
                    BUBUN		= Child.getElementsByTagName("BUBUN").item(0).text;
                    PRICE		= Child.getElementsByTagName("PRICE").item(0).text;
                    TOTAL_PRICE += parseInt(PRICE);
                    method		= "view_list(" + (i + 1) + ")";

                    tag	+= "<tr onClick=" + method + " onMouseOver=this.style.backgroundColor='#f6f7f8' onMouseOut=this.style.backgroundColor='' style='CURSOR: Hand;'>" +
                        "<td width = '40' height='24' align='center'>" + (i + 1) + "</td>" +
                        "<td width = '80' align='center'>" + BJ_NM + "</td>" +
                        "<td width = '50' align='center'>" + BONBUN + "</td>" +
                        "<td width = '50' align='center'>" + BUBUN + "</td>" +
                        "<td width = '80' align='center'>" + Set_Comma(PRICE) + "</td>" +
                        "<td align=center><img src='/img/del_icon2.gif' alt='삭제' border='0' onclick='javaScript:Delete(" + (i + 1) + ");' style='CURSOR:Hand;'></td></tr>";
                    Child	= Child.nextSibling;
                }
            }
            else
            {
                tag	+= "<tr><td align='center' class='sub_table' colspan='6' height='26'>인접지정보를 추가해 주세요</td></tr>";
            }

            if(TOTAL_PRICE != 0){
                TOTAL_PRICE = parseInt(TOTAL_PRICE/length);
            }

            var	bottom	="<tr>"
                         +"<td colspan = '6' height='5' ></td>"
        				 +"</tr>"
                	     +"<tr>"
            			 +"<td align='center' bgcolor='e5eff8' class='sub_table_b' height='26'>개수</td>"
            			 +"<td align='center' class='sub_table'>"+length
            			 +"</td>"
            			 +"<td align='center' bgcolor='e5eff8' class='sub_table_b' colspan='2' height='26'>표준공시지가</td>"
            			 +"<td align='center' class='sub_table' colspan='2'>"+Set_Comma(TOTAL_PRICE) + " 원"
            			 +"</td>"
            			 +"</tr>"+"</table>";

            blist.innerHTML	= top + tag + bottom;
        }

        //콤마 찍기
        function Set_Comma(n){ 
  			return Number(String(n).replace(/\..*|[^\d]/g,"")).toLocaleString().slice(0,-3); 
		} 
        

        //상세 보기

        function	view_list(num)
        {
            var	obj		= document.getElementById("WITH_XML").value;
            var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
            var form 	= document.form;

            xmlDom.async	= false;
            xmlDom.loadXML(obj);

            var objRoot	= xmlDom.documentElement;//xmlDom.documentElement("ROOT").cloneNode(true);

            var	fChild	= getCheckChild(objRoot, num);

            //form.BJ_CD.value			= fChild.getElementsByTagName("BJ_NM").item(0).text;
            form.BONBUN.value		= fChild.getElementsByTagName("BONBUN").item(0).text;
            form.BUBUN.value		= fChild.getElementsByTagName("BUBUN").item(0).text;
            form.PRICE.value		= fChild.getElementsByTagName("PRICE").item(0).text;
        }

        //지우기 실행

        function	Delete(num)
        {
            deleteNode(num);
            makeList();
            clear();

        }

        // 노드 지우기

        function 	deleteNode(num)
        {
            var	obj	= document.getElementById("WITH_XML").value;

            var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
            var form 	= document.form;

            xmlDom.async	= false;
            xmlDom.loadXML(obj);

            var objRoot	= xmlDom.documentElement;
            var fChild	= getCheckChild(objRoot, num);

            objRoot.removeChild(fChild);

            document.getElementById("WITH_XML").value = xmlDom.xml;
        }

        //노드 찾기

        function	getCheckChild(root, num)
        {
            var fChild 	= root.firstChild;
            var	length	= root.childNodes.length;

            num--;

            for(i = 0	;	i < num	;	i++)
            {
                fChild	= fChild.nextSibling;
            }
            return fChild;
        }

        //추가 버튼 클릭
        function insertPrc(){
            if(checkList(document.getElementById("BONBUN").value,document.getElementById("BUBUN").value)){

                if(document.getElementById("BONBUN").value.length < 1){
                    alert("본번을 입력하세요");
                    return;
                }else{
                	if(document.getElementById("PRICE").value.length < 1){
                		document.getElementById("PRICE").value = 0;
                    }                
                	insertNode();
                	makeList();
                }
            	
            }else{
				alert("동일한 주소가 이미 있습니다.");
            }
            clear();
        }

        // 동일값 체크
		function checkList(bonbun,bubun)
        {
            var	obj		= document.getElementById("WITH_XML").value;
            var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
            var form 	= document.form;

            xmlDom.async	= false;
            xmlDom.loadXML(obj);

            var objRoot	= xmlDom.documentElement;
            var	length	= objRoot.childNodes.length;
            var Child 	= objRoot.firstChild;

            var	BONBUN		= bonbun;
            var	BUBUN		= bubun;

        	if(length	> 0)
            {
                for(i = 0	;	i < length	;	i++)
                {
                    if(BONBUN == Child.getElementsByTagName("BONBUN").item(0).text && BUBUN == Child.getElementsByTagName("BUBUN").item(0).text){
                        return false;
                    }
                        Child	= Child.nextSibling;
                }
            }

            return true;
        }

        //    	데이터 추가
        function 	insertNode()
        {

            var	obj		= document.getElementById("WITH_XML").value;
            var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
            var form 	= document.form;
            var	Node;
            var	value;

            xmlDom.async	= false;
            xmlDom.loadXML(obj);

            var objRoot	= xmlDom.documentElement;

            var objNode = xmlDom.createElement("DATA");
            objRoot.appendChild(objNode);

            objNode.appendChild(setNode(xmlDom, "BJ_NM"));
            objNode.appendChild(setNode(xmlDom, "BONBUN"));
            objNode.appendChild(setNode(xmlDom, "BUBUN"));
            objNode.appendChild(setNode(xmlDom, "PRICE"));

            document.getElementById("WITH_XML").value = xmlDom.xml;
        }

        function	setNode(xmlDom, Name)
        {
            var	Node 	= xmlDom.createElement(Name);
            Node.text	= document.getElementById(Name).value;

            return	Node;
        }

        //값 직접입력
        function 	insertNodeVal(BjNM, Bonbun, Bubun, Price)
        {

            var	obj		= document.getElementById("WITH_XML").value;
            var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
            var form 	= document.form;
            var	Node;
            var	value;

            xmlDom.async	= false;
            xmlDom.loadXML(obj);

            var objRoot	= xmlDom.documentElement;

            var objNode = xmlDom.createElement("DATA");
            objRoot.appendChild(objNode);

            objNode.appendChild(setNodeValue(xmlDom, "BJ_NM",BjNM));
            objNode.appendChild(setNodeValue(xmlDom, "BONBUN",Bonbun));
            objNode.appendChild(setNodeValue(xmlDom, "BUBUN",Bubun));
            objNode.appendChild(setNodeValue(xmlDom, "PRICE",Price));

            document.getElementById("WITH_XML").value = xmlDom.xml;
        }

        function	setNodeValue(xmlDom, Name, value)
        {
            var	Node 	= xmlDom.createElement(Name);
            Node.text	= value;

            return	Node;
        }

        // 클리어
        function	clear()
        {
            var form 	= document.form;

            //form.BJ_CD.value			= "";
            form.BONBUN.value			= "";
            form.BUBUN.value			= "";
            form.PRICE.value			= "";
        }

        //공시지가 팝업
        function openLandPricePopUp()
        {
            var winW = 320;
            var winH = 133;
            var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0"


            var admin_no = document.getElementById("ADMIN_NO").value;
            var year = document.getElementById("YEAR").value;
            var bonbun = document.getElementById("BONBUN").value;
            var bubun = document.getElementById("BUBUN").value;
            window.open('/jumyong/jumyonginfo/officialLandPrice.do?ADMIN_NO='+admin_no+'&YEAR='+year+'&BONBUN='+bonbun+'&BUBUN='+bubun, 'win', status);
        }

        function save(){

            var pBONBUN = opener.document.getElementById("BONBUN").value;
            var pBUBUN = opener.document.getElementById("BUBUN").value;

            opener.document.getElementById("WITH_XML").value = document.getElementById("WITH_XML").value;
            opener.totalWithAdd(true);
            self.close();

        }




    </script>


    <body onload="init()">
        <form id="form" name="form" method="post">

            <input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
            <input type="hidden" id="GU_CD" name="GU_CD" value="${GU_CD}">
            <input type="hidden" id="BJ_CD" name="BJ_CD" value="${BJ_CD}">
            <input type="hidden" id="YEAR" name="YEAR" value="${YEAR}">
            <input type="hidden" id="WITH_XML"name="WITH_XML">
            <table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td height="12"><img src="/img/box_top_left.gif" width="12" height="12"></td>
                    <td background="/img/box_top_mid.gif"></td>
                    <td><img src="/img/box_top_right.gif" width="12" height="12"></td>
                </tr>
                <tr>
                    <td width="12" background="/img/box_left.gif"></td>
                    <td align="center" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="admin_w">
                                        <tr>
                                            <td width="40"><img src="/img/admin_pop_left.gif" width="40" height="40"></td>
                                            <td background="/img/admin_pop_cen.gif" class="admin_w_b" style="padding-top:3">인접지 추가</td>
                                            <td width="33"><img src="/img/close.gif" alt="닫기" width="33" height="40" border="0" onClick="self.close();" style="cursor:pointer" /></td>
                                        </tr>
                                        <tr>
                                            <td height="5" colspan="3"></td>
                                        </tr>
                                    </table></td>
                            </tr>
                            <tr>
                            	<td height="10"></td>
                            </tr>
                            <tr>
                                <td align="center">
                                    <table width="350" border="0" cellpadding="0" cellspacing="0" style="border-collapse:collapse;" >
                                        <tr>
                                            <td >
                                            	<table width="100%" border='1' bordercolor='#c9dfed' style='border-collapse:collapse;' cellpadding='0' cellspacing='0'  class='sub_table'>
                                                	<tr >
                										<td height= "28"  width = '60'  align='center' bgcolor='e5eff8' class='sub_table_b'>법정동명</td>
          											    <td width = '52'  align='center' bgcolor='e5eff8' class='sub_table_b'>본번</td>
        										        <td width = '52'  align='center' bgcolor='e5eff8' class='sub_table_b'>부번</td>
        										        <td align='center' bgcolor='e5eff8' class='sub_table_b'>공시지가</td>
                									</tr>
                									<tr>
                										<td>
                										  <input align="middle" type="text" id="BJ_NM" name="BJ_NM" value="${BJ_NM}"  class="essential" style="width:50px" readonly="readonly">
                                               
                										</td>
                										
                										<td>
                										<input align="middle" type="text" id="BONBUN" name="BONBUN" value="" class="input_form1" style="width:42px" maxlength="4" onKeyDown="onlyNumberInput();" >
                                               
                										</td>
                										<td>
                										  <input align="middle" type="text" id="BUBUN" name="BUBUN" value="" class="input_form1" style="width:42px" maxlength="4" onKeyDown="onlyNumberInput();">
                                              
                										</td>
                										<td>
                										 <input align="middle" type="text" id="PRICE" name="PRICE" value="" class="input_form1" style="width:80px" onKeyDown="onlyNumberInput();" ><img src="/img/landPrice.gif" alt="공시지가조회" height="18" border="0" style="vertical-align:middle;cursor:pointer" onclick="javascript:openLandPricePopUp();" align="absmiddle">
                                        				</td>
                									
                									</tr>

                                                </table>
                                                 </td>
                                        </tr>
                                        <tr>
                                            <td align="center" height="40">    
                                                <img src="/img/add_icon.gif" alt="추가" height="18" border="0" style="cursor:pointer" onclick="javascript:insertPrc();" align="absmiddle">
                                            </td>

                                        </tr>
                                        <tr>
                                            <td >							            
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td>
                                                            <div id="blist"></div></td>
                                                    </tr>
                                                    <tr>
                                                    </tr>

                                                </table>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right" height="40">
                                                <img src="/img/apply_icon.gif" alt="적용" height="18" border="0" style="cursor:pointer" onclick="javascript:save();" align="absmiddle">
                                            </td>
                                        </tr>
                                    </table>

                                </td>
                            </tr>
                        </table></td>
                    <td width="12" background="/img/box_right.gif"></td>
                </tr>
                <tr>
                    <td height="12"><img src="/img/box_bottom_left.gif" width="12" height="12"></td>
                    <td background="/img/box_bottom_mid.gif"></td>
                    <td><img src="/img/box_bottom_right.gif" width="12" height="12"></td>
                </tr>
            </table>
        </form>
    </body>
</html>

