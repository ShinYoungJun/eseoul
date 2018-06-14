package main.java.rojum.saewe.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.model.BoardBean;
import main.java.admin.service.IBoardService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.common.util.*;
import main.java.common.util.catUtil.Util;

public class BoardControl extends MultiActionController {

	private IBoardService objBoardService = null;
	private	Util util = new Util();

	public void setBoardService(IBoardService newObjBoardService) {
		this.objBoardService = newObjBoardService;
	}

	/**
	 * 게시판관리화면 게시글 list
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
		
		// 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List		blist	= null;

		try{
			if(userId != null)
			{
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
		
				int totalCount = objBoardService.getBoardTotalCount(gubun,content,removeDash(fromDate),removeDash(toDate),certYN);
				String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, strParams,"",strActionUrl, totalCount);
				
				List		list	= objBoardService.retrieveBoardList(intCurrentPage,intCountPerPage,gubun,content,removeDash(fromDate),removeDash(toDate),certYN);
				blist	= new ArrayList();
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
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/admin/board/boardList", "blist", blist);
	}

	/**
	 * 게시글리스트 조회 (login 안한상태에 보이는 리스트)
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
      
		//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List		blist	= null;

		try{
			if(userId != null)
			{
				
			
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
				blist	= new ArrayList();
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
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/admin/user/boardList", "blist", blist);
	}
	
   	/**
   	 * QABoard 상세 내용을 조회 (PORTAL ADMIN 개정으로 로그인 시 보이는 상세내용)
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	public ModelAndView adminView(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int seq = ServletRequestUtils.getIntParameter(request, "seq", 0);
		String modeType = ServletRequestUtils.getStringParameter(request,"modeType","");
		System.out.println("modeType="+modeType);		
		BoardBean info = objBoardService.getBoardDetail(seq);

		if(info.getNOTICE_FROMDATE() != null)	
			info.setNOTICE_FROMDATE(util.Date_Paste(info.getNOTICE_FROMDATE()));
		
		if(info.getNOTICE_TODATE() != null)	
			info.setNOTICE_TODATE(util.Date_Paste(info.getNOTICE_TODATE()));
		
		ModelAndView param;
		
		if(modeType.equals("login"))	
			param= new ModelAndView("/admin/user/boardDetail", "boardReg", info);
		else if(modeType.equals("noticeList"))
			param= new ModelAndView("/admin/user/boardDetailView", "boardReg", info);
		else
			param= new ModelAndView("/admin/board/boardDetail", "boardReg", info);
		
		return param; 
	}	

   	/**
   	 * DateFormat 변경
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