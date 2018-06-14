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

@Controller("file.JumyongFileController")
public class JumyongFileController {
	// DAO ��ü ���� ���� �߰�
	@Resource(name = "dao")
	private CommonDAO dao;

	@Resource(name = "fileManager")
	private FileManager fileManager;
	
	@RequestMapping(value = "/bbs/jumyong_upload_list.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String uploadlist(FileCommand command, HttpServletResponse res,
			HttpServletRequest req) throws Exception {
			Map<String, Object> hMap = new HashMap<String, Object>();
			hMap.put("user_id", command.getUser_id());
			FileCommand namedata = (FileCommand) dao.getReadData("loginsearch.nameSearch",hMap);
			req.setAttribute("namedata", namedata);
			return "/jsp/jumyong/bbs/register.jsp";
		}
	
	@RequestMapping(value = "/bbs/jumyong_upload.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String upload(FileCommand command, HttpServletResponse res,
				HttpServletRequest req) throws Exception {
		if (!command.getUpload().isEmpty()) {
			HttpSession session = req.getSession();

			String root = session.getServletContext().getRealPath("/");
			//********** BEGIN_����_20120219
			//String path = root + "\\pds\\saveFile";
			String path =  "E:\\roads\\BBS";
			//********** END_����_20120219

			command.setFileSize(command.getUpload().getSize());
			command.setOriginalFileName(command.getUpload().getOriginalFilename());

			InputStream is = command.getUpload().getInputStream();
			String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName(), path);
			command.setSaveFileName(newFileName);

		}else{
			//���Ͼ�����
			command.setSaveFileName("");
			command.setOriginalFileName("");
		}

		// �� �۹�ȣ ��� �κ� �߰�
		int div = 1;
		int maxDiv_sid = dao.getIntValue("total_bbs.div_sidMax", div);
		int maxSid = dao.getIntValue("total_bbs.sidMax");
		command.setDiv_sid(maxDiv_sid + 1);
		command.setSid(maxSid + 1);
		
		//�Խ��� ���й�ȣ
		command.setDiv(div);
		
		//�ۼ��� �̸��� ȣ��
		command.getName();

		// �����ͺ��̽� �׼��� ���� �߰�
		dao.insertData("total_bbs.insertData", command);
		// �����̷�Ʈ ����
		return "redirect:/bbs/jumyong_list.action";

	}

	@RequestMapping(value = "/bbs/jumyong_download.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String download(FileCommand command, HttpServletResponse res,
			HttpServletRequest req) throws Exception {

		HttpSession session = req.getSession();
		String root = session.getServletContext().getRealPath("/");
		//********** BEGIN_����_20120219
		//String path = root + "\\pds\\saveFile";
		String path =  "E:\\roads\\BBS";
		//********** END_����_20120219
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

	//�Խ��� ����Ʈ ȣ��
	@RequestMapping(value = "/bbs/jumyong_list.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String list(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		//�Խ��� ����Ʈ ȣ��
		//�Խ��� ����¡
		MyUtil myUtil = new MyUtil();
		
		int numPerPage = 10; //�� �������� �Խù� ��
		int total_page = 0; //��ü ������ �� �ʱ�ȭ
		int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
		int div = 1;		//�Խù� ���й�ȣ
		
		//���� �޴� ������ ��ȣ
		String pageNum = req.getParameter("pageNum");
		int current_page = 1; //���� �������� ������ ������ ��ȣ
		
		//���� ���� ������ ��ȣ�� �ִ� ���
		//���� �������� ����
		if(pageNum != null) current_page = Integer.parseInt(pageNum);
		
		//��ü ������ �� ���
		total_dataCount = dao.getIntValue("total_bbs.countData", div);
		if (total_dataCount != 0)
			total_page = myUtil.getPageCount(numPerPage, total_dataCount);
		
		//���� �������� ��ü ���������� ū ���
		//���� �������� ������ �������� ����
		if(current_page > total_page)
			current_page = total_page;
		
		//Ư�� ������ �۸�� ��������
		int start=(current_page-1)*numPerPage+1;
		int end=current_page*numPerPage;
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("start", start);
		hMap.put("end", end);
		hMap.put("div", div);
		List<Object> lists = dao.getListData("total_bbs.listData2", hMap);
		req.setAttribute("lists", lists);
		
		//Ư�� ������ �۸�� ������
		req.setAttribute("lists", lists);
		
		//�������� ������ ����Ʈ��
		Map<String, Integer> h2Map = new HashMap<String, Integer>();
		h2Map.put("start", 1);
		h2Map.put("end", 5);
		h2Map.put("div", div);
		List<Object> noticelists = dao.getListData("total_bbs.noticeList", h2Map);
		req.setAttribute("noticelists", noticelists);
		
		//������ ��ȣ ���ڿ� ������
		String urlList = "/bbs/jumyong_list.action";
		req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
		
		return "/jsp/jumyong/bbs/view.jsp";
	}
	
	//�Խù� ���� ȣ��
	@RequestMapping(value="/bbs/jumyong_content.action"
		, method={RequestMethod.GET, RequestMethod.POST})
	public String content(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("sid", command.getSid());
		//����ī��Ʈ
		int nextHit = dao.getIntValue("total_bbs.hitNext",hMap);
		hMap.put("hitcount", nextHit+1);
		dao.updateData("total_bbs.hitUpdate", hMap);
		FileCommand dto = 	(FileCommand) dao.getReadData("total_bbs.getContent", hMap);
		req.setAttribute("dto", dto);
		return "/jsp/jumyong/bbs/contentview.jsp";
	}
	
	//�Խù� ����
	@RequestMapping(value="/bbs/jumyong_delete.action"
		, method={RequestMethod.GET, RequestMethod.POST})
	public String delete(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		HttpSession session = req.getSession();
		String root = session.getServletContext().getRealPath("/");
		//********** BEGIN_����_20120219
		//String path = root + "\\pds\\saveFile";
		String path =  "E:\\roads\\BBS";
		//********** END_����_20120219
		fileManager.doFileDelete(command.getSaveFileName(), path);
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("sid", command.getSid());
		dao.deleteData("total_bbs.deleteContent", hMap);
		return "redirect:/bbs/jumyong_list.action";
	}
	
	//������ �Խù� ������Ʈ
	@RequestMapping(value="/bbs/jumyong_update.action"
			, method={RequestMethod.GET, RequestMethod.POST})
	public String update(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		if (command == null || command.getMode() == null || command.getMode().equals("")) {
			Map<String, Integer> hMap = new HashMap<String, Integer>();
			hMap.put("sid", command.getSid());
			FileCommand dto = (FileCommand) dao.getReadData("total_bbs.getModify", hMap);
			req.setAttribute("dto", dto);
			return "/jsp/jumyong/bbs/modify.jsp";
		}
		Map<String, Object> hMap = new HashMap<String, Object>();
		if (!command.getUpload().isEmpty()) {
			HttpSession session = req.getSession();

			String root = session.getServletContext().getRealPath("/");
			//********** BEGIN_����_20120219
			//String path = root + "\\pds\\saveFile";
			String path =  "E:\\roads\\BBS";
			//********** END_����_20120219

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
			return "redirect:/bbs/jumyong_list.action";
		}
	
	//�Խù� �˻� ���
	@RequestMapping(value = "/bbs/jumyong_search.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String search(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
			int numPerPage = 10; //�� �������� �Խù� ��
			int total_page = 0; //��ü ������ �� �ʱ�ȭ
			int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
			int div = 1;		//�Խù� ���й�ȣ
			String title = command.getTitleSearch();
			String name = command.getNameSearch();
		
			Map<String, Object> hMap = new HashMap<String, Object>();
			hMap.put("title", "%"+command.getTitleSearch()+"%");
			hMap.put("name", "%"+command.getNameSearch()+"%");
			hMap.put("div", div);
			
			//�Խù� �˻� ������ ����Ʈ ȣ��
			MyUtil myUtil = new MyUtil();
			
			//���� �޴� ������ ��ȣ
			String pageNum = req.getParameter("pageNum");
			int current_page = 1; //���� �������� ������ ������ ��ȣ
			
			//���� ���� ������ ��ȣ�� �ִ� ���
			//���� �������� ����
			if(pageNum != null) current_page = Integer.parseInt(pageNum);
			
			//��ü ������ �� ���
			total_dataCount = dao.getIntValue("total_bbs.searchCountData", hMap);
			if (total_dataCount != 0)
				total_page = myUtil.getPageCount(numPerPage, total_dataCount);
			
			//���� �������� ��ü ���������� ū ���
			//���� �������� ������ �������� ����
			if(current_page > total_page)
				current_page = total_page;
			
			//Ư�� ������ �۸�� ��������
			int start=(current_page-1)*numPerPage+1;
			int end=current_page*numPerPage;
			hMap.put("start", start);
			hMap.put("end", end);
			hMap.put("div", div);
			List<Object> lists = dao.getListData("total_bbs.searchData", hMap);
			req.setAttribute("lists", lists);
			
			//Ư�� ������ �۸�� ������
			req.setAttribute("lists", lists);
			
			//������ ��ȣ ���ڿ� ������
			String urlList = "/bbs/jumyong_search.action?name="+name+"&title="+title+"&";
			req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
			
			return "/jsp/jumyong/bbs/view.jsp";
		}
	
	/*����ó ����*/
	//����ó ����Ʈ ȣ��
	@RequestMapping(value = "/bbs/jumyong_adlist.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String adlist(HttpServletResponse res, HttpServletRequest req) throws Exception {	
		//�Խ��� ����Ʈ ȣ��
		//�Խ��� ����¡
		MyUtil myUtil = new MyUtil();
		
		int numPerPage = 10; //�� �������� �Խù� ��
		int total_page = 0; //��ü ������ �� �ʱ�ȭ
		int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
		int div = 1;		//�Խù� ���й�ȣ
		
		//���� �޴� ������ ��ȣ
		String pageNum = req.getParameter("pageNum");
		int current_page = 1; //���� �������� ������ ������ ��ȣ
		
		//���� ���� ������ ��ȣ�� �ִ� ���
		//���� �������� ����
		if(pageNum != null) current_page = Integer.parseInt(pageNum);
		
		//��ü ������ �� ���
		total_dataCount = dao.getIntValue("total_adress.countData", div);
		if (total_dataCount != 0)
			total_page = myUtil.getPageCount(numPerPage, total_dataCount);
		
		//���� �������� ��ü ���������� ū ���
		//���� �������� ������ �������� ����
		if(current_page > total_page)
			current_page = total_page;
		
		//Ư�� ������ �۸�� ��������
		int start=(current_page-1)*numPerPage+1;
		int end=current_page*numPerPage;
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("start", start);
		hMap.put("end", end);
		hMap.put("div", div);
		List<Object> adlists = dao.getListData("total_adress.listData2", hMap);
		req.setAttribute("adlists", adlists);
		
		//Ư�� ������ �۸�� ������
		req.setAttribute("adlists", adlists);
		
		//������ ��ȣ ���ڿ� ������
		String urlList = "/bbs/jumyong_adlist.action";
		req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
		
		return "/jsp/jumyong/adress/view.jsp";
	}
	
	@RequestMapping(value = "/bbs/jumyong_adupload.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String adupload(FileCommand command, HttpServletResponse res,
			HttpServletRequest req) throws Exception {
		if (command == null || command.getMode() == null || command.getMode().equals("")) {
			return "/jsp/jumyong/adress/register.jsp";
		}
		
		// �� �۹�ȣ ��� �κ� �߰�
		int div = 1;
		int maxSid = dao.getIntValue("total_adress.sidMax");
		command.setSid(maxSid + 1);
		
		//�Խ��� ���й�ȣ
		command.setDiv(div);
		
		// �����ͺ��̽� �׼��� ���� �߰�
		dao.insertData("total_adress.insertData", command);
		// �����̷�Ʈ ����
		return "redirect:/bbs/jumyong_adlist.action";

	}

	//����ó ����
	@RequestMapping(value="/bbs/jumyong_addelete.action"
		, method={RequestMethod.GET, RequestMethod.POST})
	public String addelete(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("sid", command.getSid());
		dao.deleteData("total_adress.deleteContent", hMap);
		return "redirect:/bbs/jumyong_adlist.action";
	}
	
	//����ó �˻� ���
	@RequestMapping(value = "/bbs/jumyong_adsearch.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String adsearch(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
			//�Խù� �˻� ������ ����Ʈ ȣ��
			MyUtil myUtil = new MyUtil();
			
			int numPerPage = 10; //�� �������� �Խù� ��
			int total_page = 0; //��ü ������ �� �ʱ�ȭ
			int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
			int div = 1;		//�Խù� ���й�ȣ
			String gu = command.getGu_nm();
			String or = command.getOr_nm();
			String te = command.getT_nm();
			String dam = command.getDam_nm();
			
			//����ó �˻� ������ ����Ʈ ȣ��
			Map<String, Object> hMap = new HashMap<String, Object>();
			hMap.put("gu_nm", "%"+command.getGu_nm()+"%");
			hMap.put("or_nm", "%"+command.getOr_nm()+"%");
			hMap.put("t_nm", "%"+command.getT_nm()+"%");
			hMap.put("dam_nm", "%"+command.getDam_nm()+"%");
			hMap.put("div", div);
			
			//���� �޴� ������ ��ȣ
			String pageNum = req.getParameter("pageNum");
			int current_page = 1; //���� �������� ������ ������ ��ȣ
			
			//���� ���� ������ ��ȣ�� �ִ� ���
			//���� �������� ����
			if(pageNum != null) current_page = Integer.parseInt(pageNum);
			
			//��ü ������ �� ���
			total_dataCount = dao.getIntValue("total_adress.searchCountData", hMap);
			if (total_dataCount != 0)
				total_page = myUtil.getPageCount(numPerPage, total_dataCount);
			
			//���� �������� ��ü ���������� ū ���
			//���� �������� ������ �������� ����
			if(current_page > total_page)
				current_page = total_page;
			
			//Ư�� ������ �۸�� ��������
			int start=(current_page-1)*numPerPage+1;
			int end=current_page*numPerPage;
			hMap.put("start", start);
			hMap.put("end", end);
			List<Object> adlists = dao.getListData("total_adress.searchData", hMap);
			req.setAttribute("adlists", adlists);
			
			//Ư�� ������ �۸�� ������
			req.setAttribute("adlists", adlists);
			
			//������ ��ȣ ���ڿ� ������
			String urlList = "/bbs/jumyong_adsearch.action?gu_nm="+gu+"&or_nm="+or+"&t_nm="+te+"&dam_nm="+dam+"&";
			req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
			
			return "/jsp/jumyong/adress/view.jsp";
		}
	//������ ����ó ������Ʈ
	@RequestMapping(value="/bbs/jumyong_adupdate.action"
			, method={RequestMethod.GET, RequestMethod.POST})
	public String adupdate(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		if (command == null || command.getMode() == null || command.getMode().equals("")) {
			Map<String, Integer> hMap = new HashMap<String, Integer>();
			hMap.put("sid", command.getSid());
			FileCommand dto = (FileCommand) dao.getReadData("total_adress.getModify", hMap);
			req.setAttribute("dto", dto);
			return "/jsp/jumyong/adress/modify.jsp";
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
			return "redirect:/bbs/jumyong_adlist.action";
		}
	
	
///////////////////////////////// inquiry /////////////////////////////////////
	
	@RequestMapping(value = "/bbs/jumyong_upload_list_inquiry.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String uploadlist_inquiry(FileCommand command, HttpServletResponse res,
			HttpServletRequest req) throws Exception {
			Map<String, Object> hMap = new HashMap<String, Object>();
			hMap.put("user_id", command.getUser_id());
			FileCommand namedata = (FileCommand) dao.getReadData("loginsearch.nameSearch",hMap);
			req.setAttribute("namedata", namedata);
			return "/jsp/jumyong/inquiry/register.jsp";
		}
	
	@RequestMapping(value = "/bbs/jumyong_upload_inquiry.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String upload_inquiry(FileCommand command, HttpServletResponse res,
				HttpServletRequest req) throws Exception {
		
		HttpSession session = req.getSession();
		String root = session.getServletContext().getRealPath("/");
		//********** BEGIN_����_20120219
		//String path = root + "\\pds\\saveFile";
		String path =  "E:\\roads\\BBS";
		//********** END_����_20120219
		
		if(command.getUpload1() != null) {
			command.setFileSize1(command.getUpload1().getSize());
			String fileName = command.getUpload1().getOriginalFilename();
			System.out.println("fileName_1: " + fileName);
			
			command.setOriginalFileName1(command.getUpload1().getOriginalFilename());

			InputStream is = command.getUpload1().getInputStream();
			String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName1(), path);
			command.setSaveFileName1(newFileName);
		}
		

		if(command.getUpload2() != null) {
			command.setFileSize2(command.getUpload2().getSize());
			String fileName = command.getUpload2().getOriginalFilename();
			System.out.println("fileName_2: " + fileName);
			
			command.setOriginalFileName2(command.getUpload2().getOriginalFilename());

			InputStream is = command.getUpload2().getInputStream();
			String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName2(), path);
			command.setSaveFileName2(newFileName);
		}
		
		if(command.getUpload3() != null) {
			command.setFileSize3(command.getUpload3().getSize());
			String fileName = command.getUpload3().getOriginalFilename();
			System.out.println("fileName_3: " + fileName);
			
			command.setOriginalFileName3(command.getUpload3().getOriginalFilename());

			InputStream is = command.getUpload3().getInputStream();
			String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName3(), path);
			command.setSaveFileName3(newFileName);
		}
		
		System.out.println(command.getUpload1());
		System.out.println(command.getUpload2());
		System.out.println(command.getUpload3());
		
		if(command.getUpload()!=null) {
		//if(!command.getUpload().isEmpty()) {
			//if (!command.getUpload().isEmpty()) {
				/*HttpSession session = req.getSession();
	
				String root = session.getServletContext().getRealPath("/");
				//********** BEGIN_����_20120219
				//String path = root + "\\pds\\saveFile";
				String path =  "E:\\roads\\BBS";
				//********** END_����_20120219
	*/
				command.setFileSize(command.getUpload().getSize());
				String fileName = command.getUpload().getOriginalFilename();
				
				command.setOriginalFileName(command.getUpload().getOriginalFilename());
	
				InputStream is = command.getUpload().getInputStream();
				String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName(), path);
				command.setSaveFileName(newFileName);
			//}
		}else{
			//���Ͼ�����
			command.setSaveFileName("");
			command.setOriginalFileName("");
		}
		
		// �� �۹�ȣ ��� �κ� �߰�
		int div = 1;
		int maxDiv_sid = dao.getIntValue("total_inquiry.div_sidMax", div);
		int maxSid = dao.getIntValue("total_inquiry.sidMax");
		command.setDiv_sid(maxDiv_sid + 1);
		command.setSid(maxSid + 1);
		
		//�Խ��� ���й�ȣ
		command.setDiv(div);
		
		//�ۼ��� �̸��� ȣ��
		command.getName();

		// �����ͺ��̽� �׼��� ���� �߰�
		dao.insertData("total_inquiry.insertData", command);

		
		// �����̷�Ʈ ����
		return "redirect:/bbs/jumyong_list_inquiry.action";

	}

	@RequestMapping(value = "/bbs/jumyong_download_inquiry.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String download_inquiry(FileCommand command, HttpServletResponse res,
			HttpServletRequest req) throws Exception {

		HttpSession session = req.getSession();
		String root = session.getServletContext().getRealPath("/");
		//********** BEGIN_����_20120219
		//String path = root + "\\pds\\saveFile";
		String path =  "E:\\roads\\BBS";
		//********** END_����_20120219
		FileCommand dto = (FileCommand) command;

		
		String fileName = new String(dto.getOriginalFileName().getBytes("utf-8"), "iso-8859-1");
		String fileName2 = new String(dto.getOriginalFileName().getBytes("utf-8"), "euc-kr");
		String fileName3= new String(dto.getOriginalFileName().getBytes("euc-kr"), "iso-8859-1");
		String fileName4 = new String(dto.getOriginalFileName().getBytes("euc-kr"), "utf-8");

		System.out.println("fileName" + fileName);
		System.out.println("fileName2" + fileName2);
		System.out.println("fileName3" + fileName3);
		System.out.println("fileName4" + fileName4);
		
		boolean flag = fileManager.doFileDownload(dto.getSaveFileName(),
				dto.getOriginalFileName(), path, res);
		
		System.out.println("!" + fileName + ", " + dto.getSaveFileName());
		
		if (!flag) {
			try {
				PrintWriter out = res.getWriter();
				out.println("<script>alert('Download Error!');history.back();</script>");
			} catch (Exception e) {
			}
		}
		return null;
	}
	
	@RequestMapping(value="/bbs/jumyong_term_inquiry.action", method={RequestMethod.GET, RequestMethod.POST})
	public String term_inquiry(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		//�Խ��� ����Ʈ ȣ��
		//�Խ��� ����¡
		MyUtil myUtil = new MyUtil();
		
		int numPerPage = 10; //�� �������� �Խù� ��
		int total_page = 0; //��ü ������ �� �ʱ�ȭ
		int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
		int div = 1;		//�Խù� ���й�ȣ
		
		//���� �޴� ������ ��ȣ
		String pageNum = req.getParameter("pageNum");
		int current_page = 1; //���� �������� ������ ������ ��ȣ
		
		String fromTerm = req.getParameter("from");
		String toTerm = req.getParameter("to");
		String isTerm = req.getParameter("isTerm");
		
		if(isTerm != null) {
			if(isTerm.equals("false")){
				return "/bbs/jumyong_list_inquiry.action";
			}
		}
		
		if(toTerm == null)
			toTerm = fromTerm;
		
		System.out.println("*** fromTerm ***: " + fromTerm);
		System.out.println("***  toTerm  ***: " + toTerm);
		
		Map<String, Object> termMap = new HashMap<String, Object>();
		termMap.put("div", div);
		termMap.put("fromTerm", fromTerm);
		termMap.put("toTerm", toTerm);
		
		
		//���� ���� ������ ��ȣ�� �ִ� ���
		//���� �������� ����
		if(pageNum != null) current_page = Integer.parseInt(pageNum);
		
		//��ü ������ �� ���
		//total_dataCount = dao.getIntValue("total_inquiry.countDataTerm", div, toTerm);
		total_dataCount = dao.getIntValue("total_inquiry.countDataTerm", termMap);
		if (total_dataCount != 0)
			total_page = myUtil.getPageCount(numPerPage, total_dataCount);
		
		//���� �������� ��ü ���������� ū ���
		//���� �������� ������ �������� ����
		if(current_page > total_page)
			current_page = total_page;
		
		System.out.println("total_dataCount: " + total_dataCount);
		
		//Ư�� ������ �۸�� ��������
		int start=(current_page-1)*numPerPage+1;
		int end=current_page*numPerPage;
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("fromTerm", fromTerm);
		hMap.put("toTerm", toTerm);
		hMap.put("start", start);
		hMap.put("end", end);
		hMap.put("div", div);
		List<Object> lists = dao.getListData("total_inquiry.listDataTerm", hMap);
		req.setAttribute("lists", lists);
		
		//Ư�� ������ �۸�� ������
		req.setAttribute("lists", lists);
		
		//�������� ������ ����Ʈ��
		Map<String, Integer> h2Map = new HashMap<String, Integer>();
		h2Map.put("start", 1);
		h2Map.put("end", 5);
		h2Map.put("div", div);
		List<Object> noticelists = dao.getListData("total_inquiry.noticeList", h2Map);
		req.setAttribute("noticelists", noticelists);
		
		//������ ��ȣ ���ڿ� ������
		String urlList = "/bbs/jumyong_list_inquiry.action";
		req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
		
		req.setAttribute("term", true);
		req.setAttribute("fromTerm", fromTerm);
		req.setAttribute("toTerm", toTerm);
		
		return "/jsp/jumyong/inquiry/inquiry.jsp";
	}
	
	

	//�Խ��� ����Ʈ ȣ��
	//@RequestMapping(value = "/bbs/jumyong_list_inquiry.action", method = { RequestMethod.GET, RequestMethod.POST })
	@RequestMapping(value = "/bbs/jumyong_list_inquiry.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String list_inquiry(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		//�Խ��� ����Ʈ ȣ��
		//�Խ��� ����¡
		MyUtil myUtil = new MyUtil();
		
		int numPerPage = 10; //�� �������� �Խù� ��
		int total_page = 0; //��ü ������ �� �ʱ�ȭ
		int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
		int div = 1;		//�Խù� ���й�ȣ
		
		//���� �޴� ������ ��ȣ
		String pageNum = req.getParameter("pageNum");
		int current_page = 1; //���� �������� ������ ������ ��ȣ
		
		String term = req.getParameter("term");
		System.out.println("term: " + term);
		
		//���� ���� ������ ��ȣ�� �ִ� ���
		//���� �������� ����
		if(pageNum != null) current_page = Integer.parseInt(pageNum);
		
		//��ü ������ �� ���
		total_dataCount = dao.getIntValue("total_inquiry.countData", div);
		if (total_dataCount != 0)
			total_page = myUtil.getPageCount(numPerPage, total_dataCount);
		
		//���� �������� ��ü ���������� ū ���
		//���� �������� ������ �������� ����
		if(current_page > total_page)
			current_page = total_page;
		
		//Ư�� ������ �۸�� ��������
		int start=(current_page-1)*numPerPage+1;
		int end=current_page*numPerPage;
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("start", start);
		hMap.put("end", end);
		hMap.put("div", div);
		List<Object> lists = dao.getListData("total_inquiry.listData2", hMap);
		req.setAttribute("lists", lists);
		
		//Ư�� ������ �۸�� ������
		req.setAttribute("lists", lists);
		
		//�������� ������ ����Ʈ��
		Map<String, Integer> h2Map = new HashMap<String, Integer>();
		h2Map.put("start", 1);
		h2Map.put("end", 5);
		h2Map.put("div", div);
		List<Object> noticelists = dao.getListData("total_inquiry.noticeList", h2Map);
		req.setAttribute("noticelists", noticelists);
		
		//������ ��ȣ ���ڿ� ������
		String urlList = "/bbs/jumyong_list_inquiry.action";
		req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
		req.setAttribute("term", false);
		return "/jsp/jumyong/inquiry/inquiry.jsp";
	}
	
	//�Խù� ���� ȣ��
	@RequestMapping(value="/bbs/jumyong_content_inquiry.action"
		, method={RequestMethod.GET, RequestMethod.POST})
	public String content_inquiry(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("sid", command.getSid());
		//����ī��Ʈ
		int nextHit = dao.getIntValue("total_inquiry.hitNext",hMap);
		hMap.put("hitcount", nextHit+1);
		dao.updateData("total_inquiry.hitUpdate", hMap);
		FileCommand dto = 	(FileCommand) dao.getReadData("total_inquiry.getContent", hMap);
		req.setAttribute("dto", dto);
		req.setAttribute("isTerm", req.getParameter("isTerm"));
		return "/jsp/jumyong/inquiry/inquirycontent.jsp";
	}
	
	//�Խù� ����
	@RequestMapping(value="/bbs/jumyong_delete_inquiry.action"
		, method={RequestMethod.GET, RequestMethod.POST})
	public String delete_inquiry(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		HttpSession session = req.getSession();
		String root = session.getServletContext().getRealPath("/");
		//********** BEGIN_����_20120219
		//String path = root + "\\pds\\saveFile";
		String path =  "E:\\roads\\BBS";
		//********** END_����_20120219
		fileManager.doFileDelete(command.getSaveFileName(), path);
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("sid", command.getSid());
		dao.deleteData("total_inquiry.deleteContent", hMap);
		return "redirect:/bbs/jumyong_list_inquiry.action";
	}
	
	//������ �Խù� ������Ʈ
	@RequestMapping(value="/bbs/jumyong_update_inquiry.action"
			, method={RequestMethod.GET, RequestMethod.POST})
	public String update_inquiry(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		if (command == null || command.getMode() == null || command.getMode().equals("")) {
			Map<String, Integer> hMap = new HashMap<String, Integer>();
			hMap.put("sid", command.getSid());
			FileCommand dto = (FileCommand) dao.getReadData("total_inquiry.getModify", hMap);
			req.setAttribute("dto", dto);
			return "/jsp/jumyong/inquiry/inquirymodify.jsp";
		}
		Map<String, Object> hMap = new HashMap<String, Object>();
		
		/*
		if (!command.getUpload().isEmpty()) {
			HttpSession session = req.getSession();

			String root = session.getServletContext().getRealPath("/");
			//String path = root + "\\pds\\saveFile";
			String path =  "E:\\roads\\BBS";

			fileManager.doFileDelete(command.getSaveFileName(), path);
			
			command.setFileSize(command.getUpload().getSize());
			command.setOriginalFileName(command.getUpload().getOriginalFilename());

			InputStream is = command.getUpload().getInputStream();
			String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName(), path);
			command.setSaveFileName(newFileName);
			hMap.put("saveFileName", command.getSaveFileName());
			hMap.put("originalFileName", command.getOriginalFileName());
			*/
		
		HttpSession session = req.getSession();
		String root = session.getServletContext().getRealPath("/");
		//********** BEGIN_����_20120219
		//String path = root + "\\pds\\saveFile";
		String path =  "E:\\roads\\BBS";
		//********** END_����_20120219
		
		if(command.getUpload1() != null) {
			command.setFileSize1(command.getUpload1().getSize());
			String fileName = command.getUpload1().getOriginalFilename();
			System.out.println("fileName_1: " + fileName);
			
			command.setOriginalFileName1(command.getUpload1().getOriginalFilename());

			InputStream is = command.getUpload1().getInputStream();
			String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName1(), path);
			command.setSaveFileName1(newFileName);
			
			hMap.put("saveFileName1", command.getSaveFileName1());
			hMap.put("originalFileName1", command.getOriginalFileName1());
		}
		

		if(command.getUpload2() != null) {
			command.setFileSize2(command.getUpload2().getSize());
			String fileName = command.getUpload2().getOriginalFilename();
			System.out.println("fileName_2: " + fileName);
			
			command.setOriginalFileName2(command.getUpload2().getOriginalFilename());

			InputStream is = command.getUpload2().getInputStream();
			String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName2(), path);
			command.setSaveFileName2(newFileName);
			
			hMap.put("saveFileName2", command.getSaveFileName2());
			hMap.put("originalFileName2", command.getOriginalFileName2());
			
		}
		
		if(command.getUpload3() != null) {
			command.setFileSize3(command.getUpload3().getSize());
			String fileName = command.getUpload3().getOriginalFilename();
			System.out.println("fileName_3: " + fileName);
			
			command.setOriginalFileName3(command.getUpload3().getOriginalFilename());

			InputStream is = command.getUpload3().getInputStream();
			String newFileName = fileManager.doFileUpload(is, command.getOriginalFileName3(), path);
			command.setSaveFileName3(newFileName);
			
			hMap.put("saveFileName3", command.getSaveFileName3());
			hMap.put("originalFileName3", command.getOriginalFileName3());
		}
		
		System.out.println(command.getUpload1());
		System.out.println(command.getUpload2());
		System.out.println(command.getUpload3());
	
		if(command.getUpload1() == null){
			hMap.put("saveFileName1", command.getSaveFileName1());
			hMap.put("originalFileName1", command.getOriginalFileName1());
			hMap.put("saveFileName2", command.getSaveFileName1());
			hMap.put("originalFileName2", command.getOriginalFileName1());
			hMap.put("saveFileName3", command.getSaveFileName1());
			hMap.put("originalFileName3", command.getOriginalFileName1());
			}
			hMap.put("sid", command.getSid());
			hMap.put("title", command.getTitle());
			hMap.put("content", command.getContent());
			
			hMap.put("docnum", command.getDocnum());
			hMap.put("term", command.getTerm());
			hMap.put("reception", command.getReception());
			 
			dao.updateData("total_inquiry.updateData", hMap);
			return "redirect:/bbs/jumyong_list_inquiry.action";
	}
	
	//�Խù� �˻� ���
	@RequestMapping(value = "/bbs/jumyong_search_inquiry.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String search_inquiry(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
			int numPerPage = 10; //�� �������� �Խù� ��
			int total_page = 0; //��ü ������ �� �ʱ�ȭ
			int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
			int div = 1;		//�Խù� ���й�ȣ
			String title = command.getTitleSearch();
			String name = command.getNameSearch();
			String term = command.getTerm();
		
			Map<String, Object> hMap = new HashMap<String, Object>();
			hMap.put("title", "%"+command.getTitleSearch()+"%");
			hMap.put("name", "%"+command.getNameSearch()+"%");
			hMap.put("div", div);
			hMap.put("term", term);
			
			//�Խù� �˻� ������ ����Ʈ ȣ��
			MyUtil myUtil = new MyUtil();
			
			//���� �޴� ������ ��ȣ
			String pageNum = req.getParameter("pageNum");
			int current_page = 1; //���� �������� ������ ������ ��ȣ
			
			//���� ���� ������ ��ȣ�� �ִ� ���
			//���� �������� ����
			if(pageNum != null) current_page = Integer.parseInt(pageNum);
			
			//��ü ������ �� ���
			total_dataCount = dao.getIntValue("total_inquiry.searchCountData", hMap);
			if (total_dataCount != 0)
				total_page = myUtil.getPageCount(numPerPage, total_dataCount);
			
			//���� �������� ��ü ���������� ū ���
			//���� �������� ������ �������� ����
			if(current_page > total_page)
				current_page = total_page;
			
			//Ư�� ������ �۸�� ��������
			int start=(current_page-1)*numPerPage+1;
			int end=current_page*numPerPage;
			hMap.put("start", start);
			hMap.put("end", end);
			hMap.put("div", div);
			List<Object> lists = dao.getListData("total_inquiry.searchData", hMap);
			req.setAttribute("lists", lists);
			
			//Ư�� ������ �۸�� ������
			req.setAttribute("lists", lists);
			
			//������ ��ȣ ���ڿ� ������
			String urlList = "/bbs/jumyong_search_inquiry.action?name="+name+"&title="+title+"&term="+term;
			req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
			
			return "/jsp/jumyong/inquiry/inquiry.jsp";
		}	
	
	
	@RequestMapping(value = "/bbs/jumyong_searchTerm_inquiry.action", method = { RequestMethod.GET, RequestMethod.POST })
	public String searchTerm_inquiry(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		int numPerPage = 10; //�� �������� �Խù� ��
		int total_page = 0; //��ü ������ �� �ʱ�ȭ
		int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
		int div = 1;		//�Խù� ���й�ȣ
		String title = command.getTitleSearch();
		String name = command.getNameSearch();
		String term = command.getTerm();
	
		String fromTerm = req.getParameter("fromTerm");
		String toTerm = req.getParameter("toTerm");
		
		if(toTerm == null)
			toTerm = fromTerm;
		
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("title", "%"+command.getTitleSearch()+"%");
		hMap.put("name", "%"+command.getNameSearch()+"%");
		hMap.put("div", div);
		hMap.put("term", term);
		
		//�Խù� �˻� ������ ����Ʈ ȣ��
		MyUtil myUtil = new MyUtil();
		
		//���� �޴� ������ ��ȣ
		String pageNum = req.getParameter("pageNum");
		int current_page = 1; //���� �������� ������ ������ ��ȣ
		
		//���� ���� ������ ��ȣ�� �ִ� ���
		//���� �������� ����
		if(pageNum != null) current_page = Integer.parseInt(pageNum);
		
		//��ü ������ �� ���
		total_dataCount = dao.getIntValue("total_inquiry.searchCountData", hMap);
		if (total_dataCount != 0)
			total_page = myUtil.getPageCount(numPerPage, total_dataCount);
		
		//���� �������� ��ü ���������� ū ���
		//���� �������� ������ �������� ����
		if(current_page > total_page)
			current_page = total_page;
		
		//Ư�� ������ �۸�� ��������
		int start=(current_page-1)*numPerPage+1;
		int end=current_page*numPerPage;
		hMap.put("start", start);
		hMap.put("end", end);
		hMap.put("div", div);
		hMap.put("fromTerm", fromTerm);
		hMap.put("toTerm", toTerm);
		List<Object> lists = dao.getListData("total_inquiry.searchDataTerm", hMap);
		req.setAttribute("lists", lists);
		
		System.out.println(start);
		System.out.println(end);
		System.out.println(fromTerm);
		System.out.println(toTerm);
		
		//Ư�� ������ �۸�� ������
		req.setAttribute("lists", lists);
		
		//������ ��ȣ ���ڿ� ������
		String urlList = "/bbs/jumyong_search_inquiry.action?name="+name+"&title="+title+"&term="+term;
		req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
		
		System.out.println("term search%%%%%%");
		req.setAttribute("term", true);
		req.setAttribute("fromTerm", fromTerm);
		req.setAttribute("toTerm", toTerm);
		
		return "/jsp/jumyong/inquiry/inquiry.jsp";
		
	}
	
}