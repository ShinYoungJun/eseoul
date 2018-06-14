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
	// DAO ��ü ���� ���� �߰�
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
		int div = 2;
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
		return "redirect:/bbs/facility_list.action";

	}

	@RequestMapping(value = "/bbs/facility_download.action", method = { RequestMethod.GET,
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
	@RequestMapping(value = "/bbs/facility_list.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String list(HttpServletResponse res, HttpServletRequest req) throws Exception {
		//�Խ��� ����Ʈ ȣ��
		//�Խ��� ����¡
		MyUtil myUtil = new MyUtil();
		
		int numPerPage = 10; //�� �������� �Խù� ��
		int total_page = 0; //��ü ������ �� �ʱ�ȭ
		int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
		int div = 2;		//�Խù� ���й�ȣ
		
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
		String urlList = "/bbs/facility_list.action";
		req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList)); 
		
		return "/jsp/facility/bbs/view.jsp";
	}
	
	//�Խù� ���� ȣ��
	@RequestMapping(value="/bbs/facility_content.action"
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
		return "/jsp/facility/bbs/contentview.jsp";
	}
	
	//�Խù� ����
	@RequestMapping(value="/bbs/facility_delete.action"
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
		return "redirect:/bbs/facility_list.action";
	}
	
	//������ �Խù� ������Ʈ
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
			return "redirect:/bbs/facility_list.action";
		}
	
	//�Խù� �˻� ���
	@RequestMapping(value = "/bbs/facility_search.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String search(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		int numPerPage = 10; //�� �������� �Խù� ��
		int total_page = 0; //��ü ������ �� �ʱ�ȭ
		int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
		int div = 2;		//�Խù� ���й�ȣ
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
			String urlList = "/bbs/facility_search.action?name="+name+"&title="+title+"&";
			req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
			
			return "/jsp/facility/bbs/view.jsp";
		}
	
	
	
	
	/*����ó ����*/
	//����ó ����Ʈ ȣ��
	@RequestMapping(value = "/bbs/facility_adlist.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String adlist(HttpServletResponse res, HttpServletRequest req) throws Exception {	
		//�Խ��� ����Ʈ ȣ��
		//�Խ��� ����¡
		MyUtil myUtil = new MyUtil();
		
		int numPerPage = 10; //�� �������� �Խù� ��
		int total_page = 0; //��ü ������ �� �ʱ�ȭ
		int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
		int div = 2;		//�Խù� ���й�ȣ
		
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
		// �� �۹�ȣ ��� �κ� �߰�
		int div = 2;
		int maxSid = dao.getIntValue("total_adress.sidMax");
		command.setSid(maxSid + 1);
		
		//�Խ��� ���й�ȣ
		command.setDiv(div);
		
		// �����ͺ��̽� �׼��� ���� �߰�
		dao.insertData("total_adress.insertData", command);
		// �����̷�Ʈ ����
		return "redirect:/bbs/facility_adlist.action";

	}

	//����ó ����
	@RequestMapping(value="/bbs/facility_addelete.action"
		, method={RequestMethod.GET, RequestMethod.POST})
	public String addelete(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("sid", command.getSid());
		dao.deleteData("total_adress.deleteContent", hMap);
		return "redirect:/bbs/facility_adlist.action";
	}
	
	//����ó �˻� ���
	@RequestMapping(value = "/bbs/facility_adsearch.action", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String adsearch(FileCommand command, HttpServletResponse res, HttpServletRequest req) throws Exception {
		//�Խù� �˻� ������ ����Ʈ ȣ��
		MyUtil myUtil = new MyUtil();
		
		int numPerPage = 10; //�� �������� �Խù� ��
		int total_page = 0; //��ü ������ �� �ʱ�ȭ
		int total_dataCount = 0; //��ü �Խù� �� �ʱ�ȭ
		int div = 2;		//�Խù� ���й�ȣ
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
			String urlList = "/bbs/facility_adsearch.action?gu_nm="+gu+"&or_nm="+or+"&t_nm="+te+"&dam_nm="+dam+"&";
			req.setAttribute("pageIndexList", myUtil.pageIndexList(current_page, total_page, urlList));
			
			return "/jsp/facility/adress/view.jsp";
		}
	//������ ����ó ������Ʈ
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