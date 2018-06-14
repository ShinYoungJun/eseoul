package main.java.admin.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;
import main.java.admin.model.BoardBean;
import main.java.admin.service.IBoardService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.common.util.*;

public class BoardControl extends MultiActionController {

	private IBoardService objBoardService = null;
	private	CommonCodeService	commonCode		= null;
	private	Util util = new Util();

	public void setBoardService(IBoardService newObjBoardService) {
		this.objBoardService = newObjBoardService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode = commonCode;
	}

	/**
	 * �Խ��ǰ���ȭ�� �Խñ� list
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int intCurrentPage = 0;
		int intCountPerPage = 0;  
      
		// ���� �⵵
		SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
		Calendar 			cal 		= Calendar.getInstance();
		String	today		= formatter.format(cal.getTime());
		cal.add(Calendar.DATE, -6);
		String	beforeDay		= formatter.format(cal.getTime());

		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);		
		String gubun = ServletRequestUtils.getStringParameter(request,"gubun","");
		String content = ServletRequestUtils.getStringParameter(request,"content","");
		String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate",beforeDay);
		String toDate = ServletRequestUtils.getStringParameter(request,"toDate",today);
		String certYN = ServletRequestUtils.getStringParameter(request,"certYN","");
		String modeType = ServletRequestUtils.getStringParameter(request,"modeType","");
		String strParams ="&gubun="+gubun+"&content="+content+"&fromDate="+fromDate+"&toDate="+toDate+"&certYN="+certYN;		
		String strActionUrl = request.getContextPath();

		System.out.println("&gubun="+gubun+"&content="+content+"&fromDate="+fromDate+"&toDate="+toDate+"&certYN="+certYN);
		
		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);

		int totalCount = objBoardService.getBoardTotalCount(gubun,content,removeDash(fromDate),removeDash(toDate),certYN);
		String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, strParams,"",strActionUrl, totalCount);
		
		List		list	= objBoardService.retrieveBoardList(intCurrentPage,intCountPerPage,gubun,content,removeDash(fromDate),removeDash(toDate),certYN);
		List		blist	= new ArrayList();
		BoardBean	bean	= new BoardBean();
		int			size	= list.size();
	
		for(int i = 0	;	i < size	;	i++)
		{
			bean	= (BoardBean)list.get(i);
			
			if(bean.getREGDATE() != null)	
				bean.setREGDATE(util.Date_Paste(bean.getREGDATE()));
        		
			blist.add(i, bean);
		}
		
		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		request.setAttribute("gubun", gubun);
		request.setAttribute("certYN", commonCode.executeCommonCode("open_yn", certYN, "��ü"));
		request.setAttribute("content",content);
		request.setAttribute("fromDate",fromDate);
		request.setAttribute("toDate",toDate);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request.setAttribute("listSize",String.valueOf(blist.size()));
		request.setAttribute("totalCount",String.valueOf(totalCount));
		
		return new ModelAndView("/admin/board/boardList", "blist", blist);
	}

	/**
	 * �Խñ۸���Ʈ ��ȸ (login ���ѻ��¿� ���̴� ����Ʈ)
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	public ModelAndView noticeBoardList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int intCurrentPage = 0;
		int intCountPerPage = 0;
      
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);		
		String gubun = ServletRequestUtils.getStringParameter(request,"gubun","");
		String content = ServletRequestUtils.getStringParameter(request,"content","");
		String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate","");
		String toDate = ServletRequestUtils.getStringParameter(request,"toDate","");
		String certYN = ServletRequestUtils.getStringParameter(request,"certYN","");
		String modeType = ServletRequestUtils.getStringParameter(request,"modeType","");
		String strParams ="&gubun="+gubun+"&content="+content+"&fromDate="+fromDate+"&toDate="+toDate+"&certYN="+certYN;		
		String strActionUrl = request.getContextPath();

		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);

		int totalCount = objBoardService.getBoardTotalCount(gubun,content,removeDash(fromDate),removeDash(toDate),"3");
		String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, strParams,"",strActionUrl, totalCount);
		
		List		list	= objBoardService.noticeBoardList(intCurrentPage,intCountPerPage,gubun,content,removeDash(fromDate),removeDash(toDate),"3");
		List		blist	= new ArrayList();
		BoardBean	bean	= new BoardBean();
		int			size	= list.size();
	
		for(int i = 0	;	i < size	;	i++)
		{
			bean	= (BoardBean)list.get(i);
			
			if(bean.getREGDATE() != null)	
				bean.setREGDATE(util.Date_Paste(bean.getREGDATE()));
        		
			blist.add(i, bean);
		}
		
		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		request.setAttribute("gubun", gubun);
		request.setAttribute("certYN", certYN);
		request.setAttribute("content",content);
		request.setAttribute("fromDate",fromDate);
		request.setAttribute("toDate",toDate);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request.setAttribute("listSize",String.valueOf(blist.size()));
		request.setAttribute("totalCount",String.valueOf(totalCount));
		
		return new ModelAndView("/admin/user/boardList", "blist", blist);
	}
	
   	/**
   	 * QABoard �� ������ ��ȸ (PORTAL ADMIN �������� �α��� �� ���̴� �󼼳���)
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	public ModelAndView adminView(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int seq = ServletRequestUtils.getIntParameter(request, "seq", 0);
		String modeType = ServletRequestUtils.getStringParameter(request,"modeType","");
		String gubun = ServletRequestUtils.getStringParameter(request,"gubun","");
		String content = ServletRequestUtils.getStringParameter(request,"content","");
		String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate","");
		String toDate = ServletRequestUtils.getStringParameter(request,"toDate","");
		String certYN = ServletRequestUtils.getStringParameter(request,"certYN","");
		
		ModelAndView param;
		
		if(modeType.equals("howhan")){
			//param= new ModelAndView("/admin/user/boardDetail");
			param= new ModelAndView("/admin/user/howhanPop");
			return param;
		}
		
		BoardBean info = objBoardService.getBoardDetail(seq);

		if(info.getNOTICE_FROMDATE() != null)	
			info.setNOTICE_FROMDATE(util.Date_Paste(info.getNOTICE_FROMDATE()));
		
		if(info.getNOTICE_TODATE() != null)	
			info.setNOTICE_TODATE(util.Date_Paste(info.getNOTICE_TODATE()));
		
		request.setAttribute("gubun", gubun);
		request.setAttribute("certYN", certYN);			
		request.setAttribute("content",content);
		request.setAttribute("fromDate",fromDate);
		request.setAttribute("toDate",toDate);
		
		
		if(modeType.equals("login"))	
			param= new ModelAndView("/admin/user/boardDetail", "boardReg", info);
		else if(modeType.equals("noticeList"))
			param= new ModelAndView("/admin/user/boardDetailView", "boardReg", info);
		else
			param= new ModelAndView("/admin/board/boardDetail", "boardReg", info);
		
		return param; 
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