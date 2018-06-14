<%
	String 		userId	= (String)session.getAttribute("sessionUserId");
	
	if(userId == null)
	{
%>
		<script language="javascript">
			alert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');
			parent.parent.parent.parent.location.href="/admin/user/login.do";
		</script>
<%
	}
%>
