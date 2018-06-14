package main.java.jumyong.jumyong.web;


import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.model.BoardFileBean;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.UUID;
import main.java.common.util.FileUploadUtil2;



import java.text.SimpleDateFormat;
import java.util.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;

import main.java.common.util.*;

import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.service.*;

import main.java.common.util.*;

public class PlaceDetailFileFormControl extends SimpleFormController {	
	
  	/**
  	 * inspect 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
	private	CommonCodeService	commonCode		= null;		
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public PlaceDetailFileFormControl() {
		setBindOnNewForm(true);
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}

	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		PlaceFileBean pb = new PlaceFileBean();
		
		try{
			if(userId != null)
			{
				String strFormView = null;		
				
				String adminNo = ServletRequestUtils.getStringParameter(request,"no");		
				String mode = ServletRequestUtils.getStringParameter(request,"mode");
				String seq = ServletRequestUtils.getStringParameter(request,"seq","");		
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "3");
				String SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
				String strFormview = "/jumyong/jumyong/info_placeFile";
				
				if(mode == null)
					mode = "view";
				
				request.setAttribute("no", adminNo);
				request.setAttribute("mode", mode);		
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);	
				request.setAttribute("SECTION", SECTION);
				
		//		상단 리스트 화면		
				List FileList = objJumyongService.retrieveFileList( Integer.parseInt(strCurrentPage) ,3,adminNo);	
				
				
				int listNum = objJumyongService.getFileListCount(adminNo);
				request.setAttribute("listNum", String.valueOf(listNum));
				
		//		리스트의 페이징 html 
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
						,Integer.parseInt(strCountPerPage), "", "no="+adminNo+"&mode="+mode+"&SECTION="+SECTION, "/jumyong/placeFileEdit.do",listNum);
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				
				request.setAttribute("Llist", FileList);
				request.setAttribute("seq",seq);
				
						
		//		수정화면 일때.. jsp 페이지 바꿈		
				
				if(mode.equals("edit"))
				{
					strFormview = "/jumyong/jumyong/info_placeFileEdit";				// edit일때 formview의 화면을 바꿈. 
				}
				String strData_type_name = "";
				for(int i=0;i<FileList.size();i++)
				{
					PlaceFileBean pb1 = new PlaceFileBean();
					
					pb1 = (PlaceFileBean)FileList.get(i);
					
					if(seq.equals(String.valueOf(pb1.getSEQ())))
						strData_type_name = pb1.getDATA_TYPE();
				}
		
				request.setAttribute("attatched_type", commonCode.executeCommonCode("attatched_type",strData_type_name, "선택"));
				
				setFormView(strFormview);
			
		}
	}catch(Exception e){
		System.out.println("error:"+e.toString());
	}
		return pb;
	}

	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException exception) throws Exception	 {
		try	{	
			PlaceFileBean objFileBean = (PlaceFileBean)command;
			String adminNo = ServletRequestUtils.getStringParameter(request,"no","");
			String mode = ServletRequestUtils.getStringParameter(request,"mode","add").trim();
			String seq = ServletRequestUtils.getStringParameter(request,"seq","");
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			String strSuccessView = "redirect:/jumyong/placeFileEdit.do?no="+adminNo+"&currentPage="+strCurrentPage;
			//System.out.println("미쳐"+mode+"11");
			objFileBean.setADMIN_NO(adminNo);
			
			if( !seq.equals(""))			
				objFileBean.setSEQ( Integer.parseInt(seq) );
			
			
			if(mode.equals("add"))
			{
//				 파일 등록
				String strSavedFileName = "";
				//System.out.println("미쳐2");
				//파일 실제 저장 , 저장된 실제파일 이름 가져오기 
				//strSavedFileName = uploadImageFiles(request);
				
				//System.out.println("도대체");
				//System.out.println("도대체0.01");
				//파일 등록
				MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
				//System.out.println("도대체0.5");
				Iterator fileNameIterator = mpRequest.getFileNames();
				//System.out.println("도대체1");		
				String strFileName = "";
				
				 while (fileNameIterator.hasNext()) {
					  MultipartFile multiFile = mpRequest.getFile((String) fileNameIterator.next());
						//System.out.println("도대체2");
					  if (multiFile.getSize() > 0) {
						  strFileName = FileUploadUtil2.uploadFormFile(multiFile,Globals.IMAGEFILEUPLOADPATH);				  
					  }
						//System.out.println("도대체3");
				}
				//System.out.println("미쳐3");				
				//등록일자 저장
				Calendar cal = Calendar.getInstance();				
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
				String toDay = sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
				objFileBean.setREGDATE(toDay);
				//저장된 파일이름 set
				if(strFileName.equals(""))
					objFileBean.setATTACH_SAVED_FILE(objFileBean.getATTACH_SAVED_FILE());
				else
					objFileBean.setATTACH_SAVED_FILE(strFileName);
				//db에 저장
				objJumyongService.insertFile(objFileBean);
			}
			else if(mode.equals("edit"))
			{
				
				
//				 파일 등록
				String strSavedFileName = "";
				//파일 실제 저장 , 저장된 실제파일 이름 가져오기 
				//System.out.println("[[["+objFileBean.getATTACH_FILE()+"  "+strSavedFileName );
				strSavedFileName = uploadImageFiles(request);
				
				
				//등록일자 저장
				Calendar cal = Calendar.getInstance();	
				
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
				String toDay = sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
//				저장된 파일이름 set
				if(strSavedFileName.equals(""))
					objFileBean.setATTACH_SAVED_FILE(objFileBean.getATTACH_SAVED_FILE());
				else
					objFileBean.setATTACH_SAVED_FILE(strSavedFileName);
				objJumyongService.updateFile(objFileBean);
			}
			setSuccessView(strSuccessView);
		}catch(Exception err){
			System.out.println("error:"+err.toString());
		}		
		//System.out.println("미쳐3");
		return new ModelAndView(getSuccessView());
	}
	
	
	public String uploadImageFiles(HttpServletRequest request){
		List listBoardFiles	=	new ArrayList();
		//System.out.println("도대체");
		//System.out.println("도대체0.01");
		//파일 등록
		MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
		//System.out.println("도대체0.5");
		Iterator fileNameIterator = mpRequest.getFileNames();
		//System.out.println("도대체1");		
		String strFileName = "";
		
		 while (fileNameIterator.hasNext()) {
			  MultipartFile multiFile = mpRequest.getFile((String) fileNameIterator.next());
				//System.out.println("도대체2");
			  if (multiFile.getSize() > 0) {
				  strFileName = FileUploadUtil2.uploadFormFile(multiFile,Globals.IMAGEFILEUPLOADPATH);				  
			  }
				//System.out.println("도대체3");
		}
		 
		 
		 return strFileName;
	}
	
	
}