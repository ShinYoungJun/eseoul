package com.file;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.common.FileManager;
import com.spring.common.MyUtil;
import com.spring.dao.CommonDAO;

@Controller("file.FacilityFileController")
public class FacilityFileController {
	// DAO 객체 연결 과정 추가
	@Resource(name = "dao")
	private CommonDAO dao;

	@Resource(name = "fileManager")
	private FileManager fileManager;
	
	@RequestMapping(value = "/bbs/facility_upload_list.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String uploadlist(FileCommand command, HttpServletResponse res,
			HttpServletRequest req) throws Exception {
			Map<String, Object> hMap = new HashMap<String, Object>();
			hMap.put("user_id", command.getUser_id());
			FileCommand namedata = (FileCommand) dao.getReadData("loginsearch.nameSearch",hMap);
			req.setAttribute("namedata", namedata);
			return "/jsp/facility/bbs/register.jsp";
		}
	
	@RequestMapping(value = "/bbs/facility_upload.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String upload(FileCommand command, HttpServletResponse res,
			HttpServletRequest req) throws Exception {
		if (!command.getUpload().isEmpty()) {
			HttpSession session = req.getSession();

			String root = session.getServletContext().getRealPath("/");
			//********** BEGIN_현진_20120219
			//String path = root + "\\pds\\saveFile";
			String path =  "E:\\roads\\BBS";
			//********** END_현진_20120219

			command.setFileSize(command.getUpload().getSize());
			command.setOriginalFileName(command.getUpload().getOriginalFilename());

			InputStream is = command.getUpload().getInputStream();
			String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName(), path);
			command.setSaveFileName(newFileName);

		}else{
			//파일없을때
			command.setSaveFileName("");
			command.setOriginalFileName("");
		}

		// 새 글번호 얻는 부분 추가
		int div = 2;
		int maxDiv_sid = dao.getIntValue("total_bbs.div_sidMax", div);
		int maxSid = dao.getIntValue("total_bbs.sidMax");
		command.setDiv_sid(maxDiv_sid + 1);
		command.setSid(maxSid + 1);
		
		//게시판 구분번호
		command.setDiv(div);
		
		//작성자 이름값 호출
		command.getName();

		// 데이터베이스 액세스 과정 추가
		dao.insertData("total_bbs.insertData", command);
		// 리다이렉트 지정
		return "redirect:/bbs/facility_list.action";

	}

	@RequestMapping(value = "/bbs/facility_download.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String download(FileCommand command, HttpServletResponse res,
			HttpServletRequest req) throws Exception {

		HttpSession session = req.getSession();
		String root = session.getServletContext().getRealPath("/");
		//********** BEGIN_현진_20120219
		//String path = root + "\\pds\\saveFile";
		String path =  "E:\\roads\\BBS";
		//********** END_현진_20120219
		FileCommand dto = (FileCommand) command;

		boolean flag = fileManager.doFileDownload(dto.getSaveFileName(),
				dto.getOriginalFileName(), path, res);
		if (!flag) {
			try {
				PrintWriter out = res.getWriter();
				out.println("<script>alert('Download Error!');history.back();</script>");
			} catch (Exception e) {
			}
		}
		return null;
	}

	//게시판 리스트 호출
	@RequestMapping(value = "/bbs/facility_list.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String list(HttpServletResponse res, HttpServletRequest req) throws Exception {
		//게시판 리스트 호출
		//게시판 페이징
		MyUtil myUtil = new MyUtil();
		
		int numPerPage = 10; //한 페이지당 게시물 수
		int total_page = 0; //전체 페이지 수 초기화
		int total_dataCount = 0; //전체 게시물 수 초기화
		int div = 2;		//게시물 구분번호
		
		//전달 받는 페이지 번호
		String pageNum = req.getParameter("pageNum");
		int current_page = 1; //현재 페이지로 지정할 페이지 번호
		
		//절달 받을 페이지 번호가 있는 경우
		//현재 페이지로 설정
		if(pageNum != null) current_page = Integer.parseInt(pageNum);
		
		//전체 페이지 수 계산
		total_dataCount = dao.getIntValue("total_bbs.countData", div);
		if (total_dataCount != 0)
			total_page = myUtil.getPageCount(numPerPage, total_dataCount);
		
		//현재 페이지가 전체 페이지보다 큰 경우
		//현재 페이지를 마지막 페이지로 지정
		if(current_page > total_page)
			current_page = total_page;
		
		//특정 페이지 글목록 가져오기
		int start=(current_page-1)*numPerPage+1;
		int end=current_page*numPerPage;
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("start", start);
		hMap.put("end", end);
		hMap.put("div", div);
		List<Object> lists = dao.getListData("total_bbs.listData2", hMap);
		req.setAttribute("lists", lists);
		
		//특정 페이지 글목록 재전송
		req.setAttribute("lists", lists);
		
		//공지사항 페이지 리스트업
		Map<String, Integer> h2Map = new HashMap<String, Integer>();
		h2Map.put("start", 1);
		h2Map.put("end", 5);
		h2Map.put("div", div);
		List<Object> noticelists = dao.getListData("total_bbs.noticeList", h2Map);
		req.setAttribute("noticelists", noticelists);
		
		//페이지 번호 문자열 재전송
		String urlList = "/bbs/facility_list.action";
		req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList)); 
		
		return "/jsp/facility/bbs/view.jsp";
	}
	
	//게시물 내용 호출
	@RequestMapping(value="/bbs/facility_content.action"
		, method={RequestMethod.GET, RequestMethod.POST})
	public String content(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("sid", command.getSid());
		//다음카운트
		int nextHit = dao.getIntValue("total_bbs.hitNext",hMap);
		hMap.put("hitcount", nextHit+1);
		dao.updateData("total_bbs.hitUpdate", hMap);
		FileCommand dto = 	(FileCommand) dao.getReadData("total_bbs.getContent", hMap);
		req.setAttribute("dto", dto);
		return "/jsp/facility/bbs/contentview.jsp";
	}
	
	//게시물 삭제
	@RequestMapping(value="/bbs/facility_delete.action"
		, method={RequestMethod.GET, RequestMethod.POST})
	public String delete(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		HttpSession session = req.getSession();
		String root = session.getServletContext().getRealPath("/");
		//********** BEGIN_현진_20120219
		//String path = root + "\\pds\\saveFile";
		String path =  "E:\\roads\\BBS";
		//********** END_현진_20120219
		fileManager.doFileDelete(command.getSaveFileName(), path);
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("sid", command.getSid());
		dao.deleteData("total_bbs.deleteContent", hMap);
		return "redirect:/bbs/facility_list.action";
	}
	
	//수정한 게시물 업데이트
	@RequestMapping(value="/bbs/facility_update.action"
			, method={RequestMethod.GET, RequestMethod.POST})
	public String update(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		if (command == null || command.getMode() == null || command.getMode().equals("")) {
			Map<String, Integer> hMap = new HashMap<String, Integer>();
			hMap.put("sid", command.getSid());
			FileCommand dto = (FileCommand) dao.getReadData("total_bbs.getModify", hMap);
			req.setAttribute("dto", dto);
			return "/jsp/facility/bbs/modify.jsp";
		}
		Map<String, Object> hMap = new HashMap<String, Object>();
		if (!command.getUpload().isEmpty()) {
			HttpSession session = req.getSession();

			String root = session.getServletContext().getRealPath("/");
			//********** BEGIN_현진_20120219
			//String path = root + "\\pds\\saveFile";
			String path =  "E:\\roads\\BBS";
			//********** END_현진_20120219

			fileManager.doFileDelete(command.getSaveFileName(), path);
			
			command.setFileSize(command.getUpload().getSize());
			command.setOriginalFileName(command.getUpload().getOriginalFilename());

			InputStream is = command.getUpload().getInputStream();
			String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName(), path);
			command.setSaveFileName(newFileName);
			hMap.put("saveFileName", command.getSaveFileName());
			hMap.put("originalFileName", command.getOriginalFileName());
			
		}else{
			hMap.put("saveFileName", command.getSaveFileName());
			hMap.put("originalFileName", command.getOriginalFileName());
			}
			hMap.put("sid", command.getSid());
			hMap.put("title", command.getTitle());
			hMap.put("content", command.getContent());
			dao.updateData("total_bbs.updateData", hMap);
			return "redirect:/bbs/facility_list.action";
		}
	
	//게시물 검색 기능
	@RequestMapping(value = "/bbs/facility_search.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String search(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		int numPerPage = 10; //한 페이지당 게시물 수
		int total_page = 0; //전체 페이지 수 초기화
		int total_dataCount = 0; //전체 게시물 수 초기화
		int div = 2;		//게시물 구분번호
		String title = command.getTitleSearch();
		String name = command.getNameSearch();
	
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("title", "%"+command.getTitleSearch()+"%");
		hMap.put("name", "%"+command.getNameSearch()+"%");
		hMap.put("div", div);
		
		//게시물 검색 데이터 리스트 호출
		MyUtil myUtil = new MyUtil();
		
		//전달 받는 페이지 번호
		String pageNum = req.getParameter("pageNum");
		int current_page = 1; //현재 페이지로 지정할 페이지 번호
		
		//절달 받을 페이지 번호가 있는 경우
		//현재 페이지로 설정
		if(pageNum != null) current_page = Integer.parseInt(pageNum);
		
		//전체 페이지 수 계산
		total_dataCount = dao.getIntValue("total_bbs.searchCountData", hMap);
		if (total_dataCount != 0)
			total_page = myUtil.getPageCount(numPerPage, total_dataCount);
		
		//현재 페이지가 전체 페이지보다 큰 경우
		//현재 페이지를 마지막 페이지로 지정
		if(current_page > total_page)
			current_page = total_page;
		
		//특정 페이지 글목록 가져오기
		int start=(current_page-1)*numPerPage+1;
		int end=current_page*numPerPage;
		hMap.put("start", start);
		hMap.put("end", end);
		hMap.put("div", div);
		List<Object> lists = dao.getListData("total_bbs.searchData", hMap);
		req.setAttribute("lists", lists);
		
		//특정 페이지 글목록 재전송
		req.setAttribute("lists", lists);
			
			//페이지 번호 문자열 재전송
			String urlList = "/bbs/facility_search.action?name="+name+"&title="+title+"&";
			req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
			
			return "/jsp/facility/bbs/view.jsp";
		}
	
	
	
	
	/*연락처 영역*/
	//연락처 리스트 호출
	@RequestMapping(value = "/bbs/facility_adlist.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String adlist(HttpServletResponse res, HttpServletRequest req) throws Exception {	
		//게시판 리스트 호출
		//게시판 페이징
		MyUtil myUtil = new MyUtil();
		
		int numPerPage = 10; //한 페이지당 게시물 수
		int total_page = 0; //전체 페이지 수 초기화
		int total_dataCount = 0; //전체 게시물 수 초기화
		int div = 2;		//게시물 구분번호
		
		//전달 받는 페이지 번호
		String pageNum = req.getParameter("pageNum");
		int current_page = 1; //현재 페이지로 지정할 페이지 번호
		
		//절달 받을 페이지 번호가 있는 경우
		//현재 페이지로 설정
		if(pageNum != null) current_page = Integer.parseInt(pageNum);
		
		//전체 페이지 수 계산
		total_dataCount = dao.getIntValue("total_adress.countData", div);
		if (total_dataCount != 0)
			total_page = myUtil.getPageCount(numPerPage, total_dataCount);
		
		//현재 페이지가 전체 페이지보다 큰 경우
		//현재 페이지를 마지막 페이지로 지정
		if(current_page > total_page)
			current_page = total_page;
		
		//특정 페이지 글목록 가져오기
		int start=(current_page-1)*numPerPage+1;
		int end=current_page*numPerPage;
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("start", start);
		hMap.put("end", end);
		hMap.put("div", div);
		List<Object> adlists = dao.getListData("total_adress.listData2", hMap);
		req.setAttribute("adlists", adlists);
		
		//특정 페이지 글목록 재전송
		req.setAttribute("adlists", adlists);
		
		//페이지 번호 문자열 재전송
		String urlList = "/bbs/facility_adlist.action";
		req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
		
		return "/jsp/facility/adress/view.jsp";
	}
	
	@RequestMapping(value = "/bbs/facility_adupload.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String adupload(FileCommand command, HttpServletResponse res,
			HttpServletRequest req) throws Exception {
		if (command == null || command.getMode() == null || command.getMode().equals("")) {
			return "/jsp/facility/adress/register.jsp";
		}
		// 새 글번호 얻는 부분 추가
		int div = 2;
		int maxSid = dao.getIntValue("total_adress.sidMax");
		command.setSid(maxSid + 1);
		
		//게시판 구분번호
		command.setDiv(div);
		
		// 데이터베이스 액세스 과정 추가
		dao.insertData("total_adress.insertData", command);
		// 리다이렉트 지정
		return "redirect:/bbs/facility_adlist.action";

	}

	//연락처 삭제
	@RequestMapping(value="/bbs/facility_addelete.action"
		, method={RequestMethod.GET, RequestMethod.POST})
	public String addelete(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("sid", command.getSid());
		dao.deleteData("total_adress.deleteContent", hMap);
		return "redirect:/bbs/facility_adlist.action";
	}
	
	//연락처 검색 기능
	@RequestMapping(value = "/bbs/facility_adsearch.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String adsearch(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		//게시물 검색 데이터 리스트 호출
		MyUtil myUtil = new MyUtil();
		
		int numPerPage = 10; //한 페이지당 게시물 수
		int total_page = 0; //전체 페이지 수 초기화
		int total_dataCount = 0; //전체 게시물 수 초기화
		int div = 2;		//게시물 구분번호
		String gu = command.getGu_nm();
		String or = command.getOr_nm();
		String te = command.getT_nm();
		String dam = command.getDam_nm();
		
		//연락처 검색 데이터 리스트 호출
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("gu_nm", "%"+command.getGu_nm()+"%");
		hMap.put("or_nm", "%"+command.getOr_nm()+"%");
		hMap.put("t_nm", "%"+command.getT_nm()+"%");
		hMap.put("dam_nm", "%"+command.getDam_nm()+"%");
		hMap.put("div", div);
		
		//전달 받는 페이지 번호
		String pageNum = req.getParameter("pageNum");
		int current_page = 1; //현재 페이지로 지정할 페이지 번호
		
		//절달 받을 페이지 번호가 있는 경우
		//현재 페이지로 설정
		if(pageNum != null) current_page = Integer.parseInt(pageNum);
		
		//전체 페이지 수 계산
		total_dataCount = dao.getIntValue("total_adress.searchCountData", hMap);
		if (total_dataCount != 0)
			total_page = myUtil.getPageCount(numPerPage, total_dataCount);
		
		//현재 페이지가 전체 페이지보다 큰 경우
		//현재 페이지를 마지막 페이지로 지정
		if(current_page > total_page)
			current_page = total_page;
		
		//특정 페이지 글목록 가져오기
		int start=(current_page-1)*numPerPage+1;
		int end=current_page*numPerPage;
		hMap.put("start", start);
		hMap.put("end", end);
		List<Object> adlists = dao.getListData("total_adress.searchData", hMap);
		req.setAttribute("adlists", adlists);
		
		//특정 페이지 글목록 재전송
		req.setAttribute("adlists", adlists);
			
			//페이지 번호 문자열 재전송
			String urlList = "/bbs/facility_adsearch.action?gu_nm="+gu+"&or_nm="+or+"&t_nm="+te+"&dam_nm="+dam+"&";
			req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
			
			return "/jsp/facility/adress/view.jsp";
		}
	//수정할 연락처 업데이트
	@RequestMapping(value="/bbs/facility_adupdate.action"
			, method={RequestMethod.GET, RequestMethod.POST})
	public String adupdate(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		if (command == null || command.getMode() == null || command.getMode().equals("")) {
			Map<String, Integer> hMap = new HashMap<String, Integer>();
			hMap.put("sid", command.getSid());
			FileCommand dto = (FileCommand) dao.getReadData("total_adress.getModify", hMap);
			req.setAttribute("dto", dto);
			return "/jsp/facility/adress/modify.jsp";
		}
			Map<String, Object> hMap = new HashMap<String, Object>();
			hMap.put("sid", command.getSid());
			hMap.put("gu_nm", command.getGu_nm());
			hMap.put("or_nm", command.getOr_nm());
			hMap.put("t_nm", command.getT_nm());
			hMap.put("dam_nm", command.getDam_nm());
			hMap.put("dam_ph", command.getDam_ph());
			hMap.put("dam_em", command.getDam_em());
			hMap.put("teem_nm", command.getTeem_nm());
			hMap.put("teem_ph", command.getTeem_ph());
			hMap.put("goa_nm", command.getGoa_nm());
			hMap.put("goa_ph", command.getGoa_ph());
			hMap.put("fax", command.getFax());
			hMap.put("memo", command.getMemo());
			dao.updateData("total_adress.updateData", hMap);
			return "redirect:/bbs/facility_adlist.action";
		}
}