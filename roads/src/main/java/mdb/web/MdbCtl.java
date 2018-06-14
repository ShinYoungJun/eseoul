package main.java.mdb.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.util.catUtil.Util;
import main.java.mdb.dao.MdbConnection;
import main.java.mdb.dao.MdbDao;
import main.java.mdb.model.GapanBaseBean;
import main.java.mdb.model.GapanHeadBean;
import main.java.mdb.model.GapanInfoBean;
import main.java.mdb.model.GapanNameBean;
import main.java.mdb.model.GapanUserBean;
import main.java.mdb.service.IJdbcService;
import main.java.mdb.util.FileUploadUtil2;
import main.java.common.util.Globals;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MdbCtl extends MultiActionController { 
	
	private IJdbcService objJdbcService = null;
	
	private final static String filePath_up = Globals.FILEPATH_UP;
	private final static String filePath_down =Globals.FILEPATH_DOWN;
	
	public void setJdbcService(IJdbcService newObjJdbcService) {
		this.objJdbcService = newObjJdbcService;
	}
	
	
	public ModelAndView TestIndex(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		
		
		
		return new ModelAndView("/mdb/testindex");
		
	}
	
	
	public ModelAndView executeUpload(HttpServletRequest request,HttpServletResponse response) throws Exception {
	     
		String OWNER_FILE_NAME = "";
	
		//현년도 계산
	    Calendar cal = Calendar.getInstance();
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    
	    String toDate = formatter.format(cal.getTime());
	    cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)-2, cal.get(Calendar.DATE));
	    String fromDate = formatter.format(cal.getTime());
				
	    
		HttpSession session = request.getSession();
		String userId = session.getAttribute("sessionUserId").toString(); 
		
			MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
			MultipartFile mdbFile = mpRequest.getFile("mdbFile");
			
			if (mdbFile.getSize() > 0) {
				OWNER_FILE_NAME =FileUploadUtil2.uploadFormFile(mdbFile,filePath_up,userId);
			}
		
		
		MdbConnection dbConn = new MdbConnection();	
		dbConn.setFilename(filePath_up+OWNER_FILE_NAME);
		List infoList = new ArrayList();
		List userList = new ArrayList();
		
	try{     
		
		
		MdbDao dao = new MdbDao();
		
		infoList = dao.GetUploadInit(dbConn);
		userList = dao.GetGapanUser(dbConn);
		
	}catch(Exception e){   
	    e.printStackTrace();   
	}
	
		request.setAttribute("userList", userList);
		request.setAttribute("list", infoList);
		request.setAttribute("listCount", Integer.toString(infoList.size()));
		request.setAttribute("FILE_NAME", filePath_up+OWNER_FILE_NAME);
		request.setAttribute("OWNER_FILE_NAME", OWNER_FILE_NAME);
		request.setAttribute("year", toDate.substring(0,4));
		
		
		return new ModelAndView("/mdb/upload_init");
	}

	public ModelAndView uploadInputData(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
		String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO");
		String[] MODIFY_YN_ARR = request.getParameterValues("MODIFY_YN");
		String FILE_NAME = request.getParameter("FILE_NAME");

		String YEAR = ServletRequestUtils.getStringParameter(request, "YEAR", "");

		List infoList = new ArrayList();
		List headList = new ArrayList();
		List baseList = new ArrayList();
		List userList = new ArrayList();

		MdbConnection dbConn = new MdbConnection();
		dbConn.setFilename(FILE_NAME);
		MdbDao dao = new MdbDao();

		int a[] = new int[3];

		try {

			// gapan_user의 수정 데이터부터 업데이트한다.
			userList = dao.GetGapanUser(dbConn);

			for (int i = 0; i < userList.size(); i++) {
				GapanUserBean bean = (GapanUserBean) userList.get(i);
				objJdbcService.mdbGapanUserUpdate(bean);
			}
			
			// 현장조사 업로드 시작
			for (int i = 0; i < GAPAN_NO_ARR.length; i++) {
				if (ITEM_CHECK_ARR[i].equals("true")) {

					infoList = dao.GetGapanInfo(dbConn, GAPAN_NO_ARR[i]);
					GapanInfoBean infoBean = (GapanInfoBean) infoList.get(0);

					headList = dao.GetGapanHead(dbConn, GAPAN_NO_ARR[i]);
					GapanHeadBean headBean = (GapanHeadBean) headList.get(0);

					baseList = dao.GetGapanBase(dbConn, GAPAN_NO_ARR[i]);
					GapanBaseBean baseBean = (GapanBaseBean) baseList.get(0);

					// 현장 조사 시스템 에서는 정비대상이 2, 도로점용시스템에서는 0으로 인식하기 때문에 업로드 시 바꿔줘야함
					if (infoBean.getMAINTN_OB().equals("2")){
						infoBean.setMAINTN_OB("0");
					}
					
					infoBean.setSURVEY_YEAR(YEAR);
					infoBean.setMANAGE_TYP("0");

					//수정
					if (MODIFY_YN_ARR[i].equals("u") || MODIFY_YN_ARR[i].equals("U")) {

						a[0] = objJdbcService.mdbGapanInfoUpdate(infoBean);
						a[1] = objJdbcService.mdbGapanHeadUpdate(headBean);
						a[2] = objJdbcService.mdbGapanBaseUpdate(baseBean);
					//신규
					} else if (MODIFY_YN_ARR[i].equals("i") || MODIFY_YN_ARR[i].equals("I")) {

						String gapan_no = objJdbcService.executeCheck_Gapanno(infoBean.getGAPAN_NO().substring(0, 6));

						infoBean.setGAPAN_NO(gapan_no);
						headBean.setGAPAN_NO(gapan_no);
						baseBean.setGAPAN_NO(gapan_no);

						a[0] = objJdbcService.mdbGapanInfoInsert(infoBean);
						a[1] = objJdbcService.mdbGapanHeadInsert(headBean);
						a[2] = objJdbcService.mdbGapanBaseInsert(baseBean);
					//폐쇄
					} else if (MODIFY_YN_ARR[i].equals("d") || MODIFY_YN_ARR[i].equals("D")) {

						List list = new ArrayList();
						HttpSession session = request.getSession();
						String userId = (String) session.getAttribute("sessionUserId");

						list = objJdbcService.mdbGapanUserName(userId);

						GapanNameBean name = (GapanNameBean) list.get(0);

						infoBean.setDISUSE_DATE(baseBean.getCLOSE_DATE());
						infoBean.setDISUSE_MANAGER(name.getNAME()); // 담당자 이름 셋팅
						infoBean.setDISUSE_REASON("현장조사삭제");
						infoBean.setSECTION("4");

						a[0] = objJdbcService.mdbGapanInfoUpdate(infoBean);
						a[1] = objJdbcService.mdbGapanHeadUpdate(headBean);
						a[2] = objJdbcService.mdbGapanBaseUpdate(baseBean);
					}

				}

			}

			// 업로드파일 삭제 시작

			File aFile = new File(FILE_NAME); // File 객체 생성
			boolean c = aFile.delete();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/rojum/survey/search.do?MSG=처리되었습니다.");
	}



	//실서버에 파일을 적용하지 않고 그냥 리스트로 돌아갈때 업로드된 mdb파일을 지우기 위한 메소드 
	public ModelAndView upRedirectSurvey(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		  
		try{
			String FILE_NAME = request.getParameter("FILE_NAME");
	    
			//업로드파일 삭제 시작
	
				File aFile = new File(FILE_NAME);    //File 객체 생성
					
				boolean c = aFile.delete();	
				
				//System.out.println("파일삭제 여부 : "+c);
			    
				// 끝
		}catch(Exception e){
			e.printStackTrace();
		}
				
		return new ModelAndView("redirect:/rojum/survey/search.do");
	}

	public ModelAndView executeDownLoad(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		int read = 0;
		HttpSession session = request.getSession();
		String userId = session.getAttribute("sessionUserId").toString(); 
		String guCd = ServletRequestUtils.getStringParameter(request,"GU_CD",session.getAttribute("sigu_cd").toString());
		String year = ServletRequestUtils.getStringParameter(request,"YEAR","");
		
		
		String fileName = "GAPAN_"+userId+".mdb";
		
		FileInputStream fis = new FileInputStream(filePath_down+"GAPAN_Init.mdb");
		FileOutputStream fos = new FileOutputStream(filePath_down+fileName);
		
		// 복사
		    
		    while((read = fis.read()) != -1){
		    fos.write(read);
		    }
		    fis.close();
		    fos.close();
		 
		
		
		MdbConnection dbConn = new MdbConnection();
	
		dbConn.setFilename(filePath_down+fileName);
		List list = new ArrayList();
			    
		MdbDao dao = new MdbDao();
		
		list = objJdbcService.mdbGapanInfoList(guCd,year);
		
		dao.InsertGapanInfo(dbConn, list);
		
		list = objJdbcService.mdbGapanHeadList(guCd,year);
		
		dao.InsertGapanHead(dbConn, list);
		
		list = objJdbcService.mdbGapanBaseList(guCd,year);
		
		dao.InsertGapanBase(dbConn, list);
		
		list = objJdbcService.mdbGapanUserList("002");
			
		dao.InsertGapanUser(dbConn, list);
		
		request.setAttribute("fileName", fileName);    
		    
		return new ModelAndView("/mdb/download_init");
	}

}