package main.java.admin.web;


import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.model.UserRegBean;
import main.java.admin.service.IUserRegService;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;

import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class UserEditControl extends SimpleFormController {	
	
	/**
	 * USER_INFO INSERT
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	private IUserRegService objUserRegService = null;
		
	public void setUserRegService(IUserRegService newObjUserRegService) {
		this.objUserRegService = newObjUserRegService;
	}
	
	public UserEditControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request)
		throws ServletException {
		HttpSession session = request.getSession();				
		
		String strModeType = ServletRequestUtils.getStringParameter(request, "modeType","");
		String strUserId = ServletRequestUtils.getStringParameter(request, "userId","");
		String strResult = ServletRequestUtils.getStringParameter(request, "result","");
		String strCheckResult = ServletRequestUtils.getStringParameter(request, "checkResult","");
		String input_type = ServletRequestUtils.getStringParameter(request,"input_type","");
		String guCheck = ServletRequestUtils.getStringParameter(request,"guCheck","");
		String org_cd = "";
		
		System.out.println("result="+strResult);
		if(guCheck.equals("1")){	// 구코드를 넘겨야 하는지 여부
			org_cd = (String)session.getAttribute("org_cd");
		}
		
		List guCdList = objUserRegService.getGuCode();
		request.setAttribute("guCdList",guCdList);
		request.setAttribute("modeType", strModeType);
		request.setAttribute("result", strResult);
		request.setAttribute("checkResult", strCheckResult);
		request.setAttribute("input_type", input_type);
		request.setAttribute("org_cd", org_cd);
		
		UserRegBean objUserRegBean = new UserRegBean();
	
		if(strModeType.equals("edit"))
		{	
			objUserRegBean = objUserRegService.getUserDetail(strUserId);
		}
					
		return objUserRegBean;
	}
	
	protected ModelAndView onSubmit(HttpServletRequest request,
		HttpServletResponse response, Object command, BindException errors)
		throws Exception {

		String strModeType = ServletRequestUtils.getStringParameter(request, "modeType","");
		String strDeptCode = ServletRequestUtils.getStringParameter(request, "deptCode","");
		String input_type = ServletRequestUtils.getStringParameter(request, "input_type","");
		
		try {
			
			UserRegBean objUserRegBean = (UserRegBean) command;
			String sigu_cd = ServletRequestUtils.getStringParameter(request, "sigu_code","");
			String userId = objUserRegBean.getUSER_ID();
			if(objUserRegBean.getSIGU_CD().equals("") || objUserRegBean.getSIGU_CD()==null)
				objUserRegBean.setSIGU_CD(sigu_cd);
			
			System.out.println("UserEditControl Submit ::"+strModeType);
			
			if(strModeType.equals("edit")){
			
				objUserRegBean.setDEPT_CD(strDeptCode);
				
				boolean result = objUserRegService.updateUserInfo(objUserRegBean);	
				request.setAttribute("modeType", strModeType);
				
				setSuccessView("redirect:/admin/user/userReg.do?result="+result);
			
			}
			else if(strModeType.equals("del")){
				
				String deleteSeq = ServletRequestUtils.getStringParameter(request, "deleteSeq","");
				objUserRegBean.setUSER_ID(deleteSeq);
				
				objUserRegBean = objUserRegService.deleteUserInfo(objUserRegBean);
				setSuccessView("redirect:/admin/user/user.do");
			}
			else if(strModeType.equals("confirm")){
			
				String deleteSeq = ServletRequestUtils.getStringParameter(request, "deleteSeq","");
				objUserRegBean.setUSER_ID(deleteSeq);
				
				objUserRegBean = objUserRegService.updateConfirm(objUserRegBean);
				setSuccessView("redirect:/admin/user/user.do");		
			}
			else if(strModeType.equals("updateAuthority")){
		
				int listSize = Integer.parseInt(request.getParameter("listSize"));
				
				int grade = 0;
				int square = 1;
				String userGrade = ServletRequestUtils.getStringParameter(request, "userGrade","");
				String user_id = ServletRequestUtils.getStringParameter(request, "user_id","");
				
				UserRegBean objUserRegBean2 = new UserRegBean();
				objUserRegBean2.setSECTION(userGrade);
				
				for(int i=1; i<=listSize; i++)
				{	
										
					objUserRegBean2.setMENU_CD(ServletRequestUtils.getStringParameter(request, "menuCd"+i,""));
					objUserRegBean2.setCHK(ServletRequestUtils.getStringParameter(request, "checkbox"+i,""));					
					
					if(objUserRegBean2.getCHK().equals("1")){
						for(int j=0; j < i;j++){		//해당메뉴 번호의 2제곱값을 구한다.
							square =  square*2;
						}						
						grade = grade + square;						
					}					
					square = 1;
				
				}	
				
				objUserRegService.updateAuthority(user_id, grade, userGrade);				
				
				setSuccessView("redirect:/admin/user/userAuthority.do?result=true&user_id="+user_id+"&userGrade="+userGrade);		
			}
			else{ 
				
				int check = objUserRegService.checkUserId(userId);
				boolean result = false;
				String checkResult = "true";
				
				if(check > 0){
					checkResult= "false";
				}
				else{	
					result = objUserRegService.insertUserInfo(objUserRegBean);	
				}
				
				request.setAttribute("modeType", strModeType);
				setSuccessView("redirect:/admin/user/userReg.do?result="+result+"&checkResult="+checkResult+"&input_type="+input_type);
			}
			
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return new ModelAndView(getSuccessView());
	}
}