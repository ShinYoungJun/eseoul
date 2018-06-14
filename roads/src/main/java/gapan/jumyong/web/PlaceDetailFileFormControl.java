package main.java.gapan.jumyong.web;


import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.FileUploadUtil2;



import java.text.SimpleDateFormat;
import java.util.*;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.validation.BindException;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.ServletRequestUtils;


import main.java.gapan.jumyong.model.PlaceFileBean;
import main.java.gapan.jumyong.service.*;


public class PlaceDetailFileFormControl extends SimpleFormController {	
	
  	/**
  	 * inspect ����Ʈ ��ȸ
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;
	private	CommonCodeService	commonCode		= null;		
	
	public void setGapan_jumyongService(IJumyongService newObjJumyongService) {
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
		
		String strFormView = null;
		
		
		String adminNo = ServletRequestUtils.getStringParameter(request,"no");		
		String mode = ServletRequestUtils.getStringParameter(request,"mode");
		String seq = ServletRequestUtils.getStringParameter(request,"seq","");		
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "3");
		String strFormview = "/gapan/jumyong/info_placeFile";
		String strSuccessView = "redirect:/gapan/jumyong/placeFileEdit.do?no="+adminNo+"&currentPage="+strCurrentPage;
		
		if(mode == null)
			mode = "view";
		
		request.setAttribute("no", adminNo);
		request.setAttribute("mode", mode);		
		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		
		PlaceFileBean pb = new PlaceFileBean();
		
//		��� ����Ʈ ȭ��		
		List FileList = objJumyongService.retrieveFileList( Integer.parseInt(strCurrentPage) ,3,adminNo);	
		
		
		int listNum = objJumyongService.getFileListCount(adminNo);
		request.setAttribute("listNum", String.valueOf(listNum));
		
//		����Ʈ�� ����¡ html 
		String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage)
				,Integer.parseInt(strCountPerPage), "", "no="+adminNo, "/gapan/jumyong/placeFileEdit.do",listNum);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		
		request.setAttribute("Llist", FileList);
		request.setAttribute("seq",seq);
		
				
//		����ȭ�� �϶�.. jsp ������ �ٲ�		
		
		if(mode.equals("edit"))
		{
			strFormview = "/gapan/jumyong/info_placeFileEdit";				// edit�϶� formview�� ȭ���� �ٲ�. 
		}else if(mode.equals("add"))
			strSuccessView = "redirect:/gapan/jumyong/placeFileEdit.do?no="+adminNo;	//add �϶��� �߰� �� ����Ʈ ���� ó������
				
		String strData_type_name = "";
		for(int i=0;i<FileList.size();i++)
		{
			PlaceFileBean pb1 = new PlaceFileBean();
			
			pb1 = (PlaceFileBean)FileList.get(i);
			
			if(seq.equals(String.valueOf(pb1.getSEQ())))
				strData_type_name = pb1.getDATA_TYPE();
		}

		request.setAttribute("attatched_type", commonCode.executeCommonCode("attatched_type",strData_type_name, "����"));
		
		
		
		
		System.out.println("success"+strSuccessView);
		setFormView(strFormview);
		setSuccessView(strSuccessView);
		
		System.out.println("=========================");
		
		return pb;
	}

	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {
		try
		{	
			PlaceFileBean objFileBean = (PlaceFileBean)command;
			String adminNo = ServletRequestUtils.getStringParameter(request,"no","");
			String mode = ServletRequestUtils.getStringParameter(request,"mode","");
			String seq = ServletRequestUtils.getStringParameter(request,"seq","");
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			
			objFileBean.setADMIN_NO(adminNo);
			
			if( !seq.equals(""))			
				objFileBean.setSEQ( Integer.parseInt(seq) );
			
			
			if(mode.equals("add"))
			{
//				 ���� ���
				String strSavedFileName = "";
				//���� ���� ���� , ����� �������� �̸� �������� 
				strSavedFileName = uploadImageFiles(request);
				
				//������� ����
				Calendar cal = Calendar.getInstance();				
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // ������ ��� ���� ����
				String toDay = sdf.format (cal.getTime());      // ���� ��¥ ������ ����
				objFileBean.setREGDATE(toDay);
				//����� �����̸� set
				if(strSavedFileName.equals(""))
					objFileBean.setATTACH_SAVED_FILE(objFileBean.getATTACH_SAVED_FILE());
				else
					objFileBean.setATTACH_SAVED_FILE(strSavedFileName);
				//db�� ����
				objJumyongService.insertFile(objFileBean);
			}
			else if(mode.equals("edit"))
			{
				
				
//				 ���� ���
				String strSavedFileName = "";
				//���� ���� ���� , ����� �������� �̸� �������� 
				//System.out.println("                  [[["+objFileBean.getATTACH_FILE()+"  "+strSavedFileName );
				strSavedFileName = uploadImageFiles(request);
				
				
				//������� ����
				Calendar cal = Calendar.getInstance();	
				
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // ������ ��� ���� ����
				String toDay = sdf.format (cal.getTime());      // ���� ��¥ ������ ����
//				����� �����̸� set
				if(strSavedFileName.equals(""))
					objFileBean.setATTACH_SAVED_FILE(objFileBean.getATTACH_SAVED_FILE());
				else
					objFileBean.setATTACH_SAVED_FILE(strSavedFileName);
				objJumyongService.updateFile(objFileBean);
			}
		}catch(Exception err)
		{
			System.out.println("File�Է� control���� "+err.toString());
		}
		return new ModelAndView(getSuccessView());
	}
	
	
	public String uploadImageFiles(HttpServletRequest request){
		List listBoardFiles	=	new ArrayList();
		
		//���� ���
		MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
		Iterator fileNameIterator = mpRequest.getFileNames();
		
		String strFileName = "";
		
		 while (fileNameIterator.hasNext()) {
			  MultipartFile multiFile = mpRequest.getFile((String) fileNameIterator.next());
			  if (multiFile.getSize() > 0) {
				  strFileName = FileUploadUtil2.uploadFormFile(multiFile,Globals.IMAGEFILEUPLOADPATH_GAPAN);				  
			  }
		}
		 
		 
		 return strFileName;
	}
	
	
}