package main.java.admin.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.admin.model.BoardBean;
import main.java.admin.service.IBoardService;

import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class BoardFormControl extends SimpleFormController {

	/**
	 * �Խñ� INSERT
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */

	private IBoardService objBoardService = null;

	public void setBoardService(IBoardService newObjBoardService) {
		this.objBoardService = newObjBoardService;
	}

	public BoardFormControl() {
		setBindOnNewForm(true);
	}

	protected Object formBackingObject(HttpServletRequest request)
			throws ServletException {

		String strModeType = ServletRequestUtils.getStringParameter(request, "modeType","");
		int seq = ServletRequestUtils.getIntParameter(request, "seq", 0);

		request.setAttribute("modeType", strModeType);
		
		BoardBean objBoardBean = new BoardBean();
		
		if(strModeType.equals("edit"))
		{	
			objBoardBean = objBoardService.getBoardDetail(seq);		
		}
		
		return objBoardBean;
	}

	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		String strModeType = ServletRequestUtils.getStringParameter(request, "modeType","");
		String fromdate = ServletRequestUtils.getStringParameter(request, "NOTICE_FROMDATE","");
		String todate = ServletRequestUtils.getStringParameter(request, "NOTICE_TODATE","");
		String gubun = ServletRequestUtils.getStringParameter(request,"gubun","");
		String content = ServletRequestUtils.getStringParameter(request,"content","");
		String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate","");
		String toDate = ServletRequestUtils.getStringParameter(request,"toDate","");
		String certYN = ServletRequestUtils.getStringParameter(request,"certYN","");
		String strParams ="?gubun="+gubun+"&content="+content+"&fromDate="+fromDate+"&toDate="+toDate+"&certYN="+certYN;		
		
		try {
			BoardBean objBoardBean = (BoardBean) command;
			
			objBoardBean.setNOTICE_FROMDATE(removeDash(fromdate));
			objBoardBean.setNOTICE_TODATE(removeDash(todate));

			if(strModeType.equals("edit")){
				objBoardBean = objBoardService.modify(objBoardBean);
			
			}else if(strModeType.equals("del")){
				
				String deleteSeq = ServletRequestUtils.getStringParameter(request, "deleteSeq","");
				objBoardBean.setBOARD_ID(Integer.parseInt(deleteSeq));
				objBoardBean = objBoardService.delete(objBoardBean);
			}
			else{
				objBoardBean = objBoardService.insertBoard(objBoardBean);
			}
			setSuccessView("redirect:/admin/board.do"+strParams);
			
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return new ModelAndView(getSuccessView());
	}
	
   	/**
   	 * DateFormat ����
	 */
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
}