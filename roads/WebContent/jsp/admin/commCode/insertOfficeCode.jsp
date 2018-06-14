<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
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
            html {overflow-x : hidden;}
            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
    </head>

    <script language="javascript" src="/js/common.js"></script>
    <script language="javascript" src="/js/Check_inputbox.js"></script>
    <script type="text/javascript">
//<![CDATA[
        //�ʱ�ȭ
        function init(){
            if(document.getElementById("mode").value == "reg"){
                document.getElementById("mode_reg").style.display = "block";
                document.getElementById("mode_modify").style.display = "none";
            }
          //********** BEGIN_KANG_20120416
          //   else if(document.getElementById("mode").value == "modify"){
             else if(document.getElementById("mode").value == "modify" || document.getElementById("mode").value == "delete"){
            	 
          //********** END_KANG_20120416
                document.getElementById("mode_reg").style.display = "none";
                document.getElementById("mode_modify").style.display = "block";
            }else{
                alert("�� ��尪 ����");
            }
        }

        //����ó��
        function fn_insert()
        {
            var w = document.regForm;
            w.action = "/admin/commCode/insertOfficeCodePrc.do";
            w.submit();

        }

        //����ó��
        function fn_modify()
        {
            var result = confirm("��ü��� �������� �����Ͻǰ�� ���� DATA�� ����˴ϴ�. �����Ͻðڽ��ϱ�?");
            if(result){
            	var w = document.regForm;
                w.action = "/admin/commCode/modifyOfficeCodePrc.do";
                w.submit();
            }
        }

      //********** BEGIN_KANG_20120416
      function fn_del()
      {
            var result = confirm("��ü��� �������� �����Ͻǰ�� ���� DATA���� ������ ��ĥ �� �ֽ��ϴ�. �����Ͻðڽ��ϱ�?");
            if(result){
            	var w = document.regForm;
                w.action = "/admin/commCode/deleteOfficeCodePrc.do";
                w.submit();
            }
        }
      //********** END_KANG_20120416
        

        //ó�� �� ��������ó��
        function fn_callBack()
        {
            var fm = document.regForm;
        	//********** BEGIN_KANG_20120416
            /*
			 if(fm.result.value != "")
            {
                if(fm.result.value == 'true')
                {
                    alert("�����Ǿ����ϴ�.");
                    window.close();
                    var searchOfficeName = opener.document.getElementById("searchOfficeName").value;

                    opener.location.href = "/admin/commCode/officeCode.do?searchOfficeName="+searchOfficeName;

                }
              else{
                    alert(fm.result.value);
                }
            }

            */
            if(fm.result.value != "")
            {
                if(fm.result.value == 'true' || fm.result.value == 'delete' || fm.result.value == 'insert')
                {
                    var msg = "";
                    if(fm.result.value == 'true') msg = "�����Ǿ����ϴ�.";
                    if(fm.result.value == 'delete') msg = "�����Ǿ����ϴ�.";
                    if(fm.result.value == 'insert') msg = "�ԷµǾ����ϴ�.";
                    alert(msg);
                    window.close();
                    var searchOfficeName = opener.document.getElementById("searchOfficeName").value;

                    opener.location.href = "/admin/commCode/officeCode.do?searchOfficeName="+searchOfficeName;

                }
              else{
                    alert(fm.result.value);
                }
            }
            
            //********** END_KANG_20120416
		}



    //]]>
</script>

    <body onload="init(),fn_callBack()">

        <form name="regForm" id="regForm" method="post" action="">

            <input name="result" type="hidden" value="${result}">
            <input name="mode" type="hidden" value="${mode}">
            <input name="office_cd" type="hidden" value="${office_cd}">
            <input name="jijum_cd" type="hidden" value="${jijum_cd}">



            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td height="13" colspan="3"></td>
                </tr>
                <tr>
                    <td height="47"width="15"></td>
                   <td>
                        <table width="100%" border="0" cellpadding="0" cellspacing="0"
                               class="admin_w">
                            <tr>
                                <td width="33"><img src="/img/admin_pop_left.gif" width="33"
                                                    height="47"></td>
                                <td background="/img/admin_pop_cen.gif">��ü ���� �Է�</td>
                                <td width="33"><img src="/img/admin_pop_right.gif" width="33"
                                                    height="47"></td>
                            </tr>
                        </table>
                    </td>
                    <td width="15"></td>
                </tr>

                <tr>
                    <td height="47">
                    </td>
                    <td>
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td height="20"></td>
                            </tr>
                            <tr>
                                <td width="48%" valign="top" bgcolor="#FFFFFF" class="admin_bl_left">
                                    <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
                                        <tr>
                                            <td width="100" height="28" align="center" bgcolor="e5eff8"
                                                class="sub_table_b">����</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b"
                                                colspan="3">����</td>
                                        </tr>
                                        <tr>
                                            <td height="26" align="center" >��ü��</td>
                                            <td class="table_bl_left">
                                                <input name="office_nm" type="text" class="input_form1" maxlength="50"
                                                       style="width:160px" value="${office_nm}">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td height="26" align="center" >������</td>
                                            <td class="table_bl_left">
                                                <input name="jijum_nm" type="text" class="input_form1" maxlength="50"
                                                       style="width:160px" value="${jijum_nm}">
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td></td>
                </tr>
            </table>
            <div id="mode_reg" style="display:none">
                <table align="center">
                    <tr>
                        <td height="50" colspan="3" align="center">
                            <a href="#">
                                <img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0" onClick="javascript:fn_insert()"/></a>
                            <a href="#">
                                <img src="/img/can_icon.gif" alt="���" width="56" height="18" border="0" onClick="javascript:window.close()"/></a>
                        </td>
                    </tr>
                </table>
            </div>
            <div id="mode_modify" style="display:none">
                <table align="center">
                    <tr>
                        <td height="50" colspan="3" align="center">
                            <a href="#">
                                <img src="/img/mod_icon2.gif" alt="����" width="34" height="18" border="0" onClick="javascript:fn_modify()"/></a>
							<!--  //********** BEGIN_KANG_20120416 -->
							<a href="#">
                                <img src="/img/del_icon3.gif" alt="����" width="56" height="18" border="0" onClick="javascript:fn_del()"/></a>
							<!--   //********** END_KANG_20120416 -->                               
                            <a href="#">
                                <img src="/img/can_icon.gif" alt="���" width="56" height="18" border="0" onClick="javascript:window.close()"/></a>
                        </td>
                    </tr>
                </table>

            </div>
        </form>
    </body>
</html>

