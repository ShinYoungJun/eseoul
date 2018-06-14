package main.java.admin.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.admin.model.GradeCodeBean;
import main.java.admin.service.ICommCodeService;

import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class CommCodeFormControl extends SimpleFormController {

	/**
	 * 등급코드 INSERT
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */

	private ICommCodeService objCommCodeService = null;

	public void setCommCodeService(ICommCodeService newObjCommCodeService) {
		this.objCommCodeService = newObjCommCodeService;
	}

	public CommCodeFormControl() {
		setBindOnNewForm(true);
	}

	protected Object formBackingObject(HttpServletRequest request)
			throws ServletException {
		
		GradeCodeBean objGradeCodeBean = new GradeCodeBean();
	
		return objGradeCodeBean;
	}

	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		String strModeType = ServletRequestUtils.getStringParameter(request, "modeType","");
		String strCode = ServletRequestUtils.getStringParameter(request, "code","");
		String strCodeName = ServletRequestUtils.getStringParameter(request, "codeName","");
		
		request.setAttribute("modeType", strModeType);
		request.setAttribute("code", strCode);
		request.setAttribute("codeName", strCodeName);
				
		try {
			GradeCodeBean objGradeCodeBean = (GradeCodeBean) command;
			
			objGradeCodeBean.setGRADE_CODE(strCode);
			objGradeCodeBean.setGRADE_NAME(strCodeName);
			
			if(strModeType.equals("edit")){
			
				objGradeCodeBean = objCommCodeService.modifyGradeCode(objGradeCodeBean);
			
			}else {
				
				objGradeCodeBean = objCommCodeService.deleteGradeCode(objGradeCodeBean);
			}
			
			setSuccessView("redirect:/admin/commCode/gradeCode.do");
			
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return new ModelAndView(getSuccessView());
	}
}