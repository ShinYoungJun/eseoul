<%
	String 		userId	= (String)session.getAttribute("sessionUserId");
	
	if(userId == null)
	{
%>
		<script language="javascript">
			alert('������� ���ð��� ����Ǿ����ϴ�. �ٽ� ���� ���ֽñ� �ٶ��ϴ�.');
			parent.parent.parent.parent.location.href="/admin/user/login.do";
		</script>
<%
	}
%>
