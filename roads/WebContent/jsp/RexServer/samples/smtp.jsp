<%
	response.setContentType("text/html;charset=EUC-KR");

	//RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);

	RexUtil.MailUtil.sendMail("mail.clipsoft.co.kr", 25, "�ѱ� title" ,"hsson@clipsoft.co.kr","hsson@clipsoft.co.kr", "�ѱ� test...");

%>
