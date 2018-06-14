package main.java.common.corpCode.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.model.UserRegBean;
import main.java.common.corpCode.service.ICorpCodeService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CorpCodeControl	extends MultiActionController{

	private	ICorpCodeService		iCorpCodeService	= null;

	public void setCorpCodeService(ICorpCodeService corpCodeService)
	{
		this.iCorpCodeService = corpCodeService;
	}

	public	ModelAndView	CorpCode(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		HttpSession session = request.getSession();

		String userId = (String)session.getAttribute("sessionUserId");	
		UserRegBean info = iCorpCodeService.getUserInfoDetail(userId);
		
		String guCd= info.getGU_CD();
		
		if(guCd != null && !guCd.equals("")){
			request.setAttribute("guCd", guCd);	//지역코드
		}else{
			request.setAttribute("guCd", "");	//지역코드
		}
		
		
		String strCorpNm 		= ServletRequestUtils.getStringParameter(request, "corpNm", "");		//업체명
		String openerCorpNm 	= ServletRequestUtils.getStringParameter(request, "openerCorpNm", "");		//상위화면의 업체명
		String openerOffice 	= ServletRequestUtils.getStringParameter(request, "openerOffice", "");		//상위화면의 지사명
		String openerCorpCd 	= ServletRequestUtils.getStringParameter(request, "openerCorpCd", "");		//상위화면의 법인코드 + 지점코드
		
		request.setAttribute("mode", "result");
		request.setAttribute("corpNm", strCorpNm);
		request.setAttribute("openerCorpNm", openerCorpNm);
		request.setAttribute("openerOffice", openerOffice);
		request.setAttribute("openerCorpCd", openerCorpCd);
		
		if(strCorpNm.equals("")	||	strCorpNm == null)
			return	new ModelAndView("/common/corpCode/CorpCode", "corpCode", iCorpCodeService.executeCorpCodeList("", guCd));

		return	new ModelAndView("/common/corpCode/CorpCode", "corpCode", iCorpCodeService.executeCorpCodeList(strCorpNm, guCd));
	}
}
