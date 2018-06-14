
package main.java.gapan.jumyong.web;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.FileUploadUtil2;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.gapan.jumyong.service.IJumyongService;
import main.java.gapan.sugeo.model.SugeoBean;
import main.java.gapan.jumyong.model.ProductBean;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class ViolationControl	extends MultiActionController {

	private	IJumyongService		iJumyongService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setGapan_jumyongService(IJumyongService jumyongService) 
	{
		this.iJumyongService = jumyongService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	// ������ġ���� 
	public	ModelAndView getViolationList(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				
				//System.out.println("***** ������ġ���� list start ******");
				// ����
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				
				String GAPAN_NO	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				request.setAttribute("GAPAN_NO", GAPAN_NO);
				
				String SEQ	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String message	= ServletRequestUtils.getStringParameter(request, "message", "");
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "5");
				int intCurrentPage = 0;
				int intCountPerPage = 0;
				
				intCurrentPage = Integer.parseInt(strCurrentPage);
				intCountPerPage = Integer.parseInt(strCountPerPage);
				
				
				ProductBean bean = new ProductBean();
				bean.setGAPAN_NO(GAPAN_NO);
				bean.setSEQ(SEQ);
				
				int totalCount = iJumyongService.getVioTotalCount(bean);
				
				// ����¡ ó��
				List		list	= iJumyongService.getVioTotalList(bean, ((intCurrentPage-1)*5)+1, intCurrentPage*5);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),5, 
						"&GAPAN_NO="+GAPAN_NO+"&SEQ="+SEQ+"&currentPage="+strCurrentPage
						+"&countPerPage="+strCountPerPage, "", "/gapan/jumyong/info_violation.do", totalCount);
				request.setAttribute("strPageDivideForm", strPageDivideForm );
				
				
				System.out.println("list.size() == " + list.size());
				if( list.size() > 0 ){
				
					for( int i = 0; i < list.size(); i++ ){
						bean = (ProductBean) list.get(i);
						
						if( bean.getVIO_DATE() != null && !"".equals(bean.getVIO_DATE()) ){
							bean.setVIO_DATE(addDash(bean.getVIO_DATE()));
						}
						if( bean.getVIO_ACTDATE()!= null && !"".equals(bean.getVIO_ACTDATE()) ){
							bean.setVIO_ACTDATE(addDash(bean.getVIO_ACTDATE()));
						}
						if( bean.getVIO_ACTCONTENT() != null && !"".equals(bean.getVIO_ACTCONTENT()) && bean.getVIO_ACTCONTENT().length() > 15 ){
							bean.setVIO_ACTCONTENT(bean.getVIO_ACTCONTENT().substring(0, 12) + "...");
						}
						
					}
				}
				
				request.setAttribute("VI_SEL", commonCode.executeGapanCode("VI_SEL", null, "��ü"));	// ��ġ����
				
				Map retVal = iJumyongService.getGiganPoint(GAPAN_NO);
				request.setAttribute("MUL_FROMDATE", retVal.get("MUL_FROMDATE").toString());
				request.setAttribute("MUL_TODATE", retVal.get("MUL_TODATE").toString());
				request.setAttribute("VIO_ACCPOINTS", retVal.get("VIO_ACCPOINTS").toString());
				
				
				// ���糯¥
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("today", today);
				
				
				System.out.println(":::::::::::::::"+GAPAN_NO+":::::::::::::");
				request.setAttribute("SEQ", SEQ);
				request.setAttribute("message", message);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("list", list);
				
				//System.out.println("***** ������ġ���� list end ******");
			}	
			
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/jumyong/violation_view");
	}
	
	
	
	// ���ݻ��� ���form
	public ModelAndView	register(HttpServletRequest request, HttpServletResponse response, String rem_bjcd_param) throws Exception 
	{
		
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String message = ServletRequestUtils.getStringParameter(request, "message", "");
				String GAPAN_NO = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String SEQ	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String mode	= ServletRequestUtils.getStringParameter(request, "mode", "");
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				
				
				request.setAttribute("message",message);
				request.setAttribute("GAPAN_NO",GAPAN_NO);
				request.setAttribute("SEQ", SEQ);
				request.setAttribute("mode", mode);
				request.setAttribute("currentPage", strCurrentPage);
				ProductBean bean = new ProductBean();
				
				if( SEQ != null && !"".equals(SEQ) ){
						// edit �϶�
						bean = iJumyongService.getViolationView(GAPAN_NO,SEQ);
						if( bean.getVIO_DATE() != null && !"".equals(bean.getVIO_DATE()) ){
							bean.setVIO_DATE(addDash(bean.getVIO_DATE()));
						}
						if( bean.getVIO_ACTDATE()!= null && !"".equals(bean.getVIO_ACTDATE()) ){
							bean.setVIO_ACTDATE(addDash(bean.getVIO_ACTDATE()));
						}
						
						//IMG PATH �߰�
						if(bean.getVIO_IMG1_NAME() != null && !bean.getVIO_IMG1_NAME().equals("")){
							bean.setVIO_IMG1_NAME(Globals.IMAGEFILEPATH+bean.getVIO_IMG1_NAME());
						}else{
							bean.setVIO_IMG1_NAME("");
						}
						
						if(bean.getVIO_IMG2_NAME() != null && !bean.getVIO_IMG2_NAME().equals("")){
							bean.setVIO_IMG2_NAME(Globals.IMAGEFILEPATH+bean.getVIO_IMG2_NAME());
						}else{
							bean.setVIO_IMG2_NAME("");
						}
						
						//IMG PATH �߰�
						if(bean.getVIO_ACTIMG1_NAME() != null && !bean.getVIO_ACTIMG1_NAME().equals("")){
							bean.setVIO_ACTIMG1_NAME(Globals.IMAGEFILEPATH+bean.getVIO_ACTIMG1_NAME());
						}else{
							bean.setVIO_ACTIMG1_NAME("");
						}
						
						if(bean.getVIO_ACTIMG2_NAME() != null && !bean.getVIO_ACTIMG2_NAME().equals("")){
							bean.setVIO_ACTIMG2_NAME(Globals.IMAGEFILEPATH+bean.getVIO_ACTIMG2_NAME());
						}else{
							bean.setVIO_ACTIMG2_NAME("");
						}
						
					request.setAttribute("VI_SEL", commonCode.executeGapanCode("VI_SEL", bean.getVIO_CD(), "��ü"));	// ���ݱ���
					request.setAttribute("AT_SEL", commonCode.executeGapanCode("AT_SEL", bean.getVIO_ACTCD(), "��ü"));	// ��ġ����
				
				}else{
					// add �ϋ�
					bean = iJumyongService.getViolationAddInfo(GAPAN_NO);

					request.setAttribute("VI_SEL", commonCode.executeGapanCode("VI_SEL", null, "��ü"));	// ���ݱ���
					request.setAttribute("AT_SEL", commonCode.executeGapanCode("AT_SEL", null, "��ü"));	// ��ġ����
				}
				
				
				request.setAttribute("violation", bean);
				
			}
				
		} catch(Exception e){
			e.printStackTrace();
		}
			
		return new ModelAndView("/gapan/jumyong/violation_register");
	}
	
	
	
	// ���ݻ��� ����ϱ�
	public ModelAndView	registerPrc(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String GAPAN_NO = "";
		String message = "";
		String mode = "";
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		request.setAttribute("currentPage", strCurrentPage);
		
		
		System.out.println("���ݻ��� ����ϱ�");
		
		try{
			if(userId != null)
			{
				
				ProductBean bean = new ProductBean();
				bind(request, bean);
				
				GAPAN_NO = bean.getGAPAN_NO();
				mode = ServletRequestUtils.getStringParameter(request, "mode", "");
				
				String VIO_IMG1_NAME = "";
				String VIO_IMG2_NAME = "";
				String VIO_ACTIMG1_NAME = "";
				String VIO_ACTIMG2_NAME = "";
				
				System.out.println("�̹���ó�� ����ϱ�");
				
				MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
				MultipartFile VIO_IMG1 = mpRequest.getFile("VIO_IMG1");
				MultipartFile VIO_IMG2 = mpRequest.getFile("VIO_IMG2");
				MultipartFile VIO_ACTIMG1 = mpRequest.getFile("VIO_ACTIMG1");
				MultipartFile VIO_ACTIMG2 = mpRequest.getFile("VIO_ACTIMG2");
				
				if (VIO_IMG1.getSize() > 0) {
					VIO_IMG1_NAME = FileUploadUtil2.uploadFormFile(VIO_IMG1,Globals.IMAGEFILEUPLOADPATH_GAPAN);
					bean.setVIO_IMG1_NAME(VIO_IMG1_NAME);
				}
				if(VIO_IMG2.getSize() > 0){
					VIO_IMG2_NAME = FileUploadUtil2.uploadFormFile(VIO_IMG2,Globals.IMAGEFILEUPLOADPATH_GAPAN);
					bean.setVIO_IMG2_NAME(VIO_IMG2_NAME);
				}
				if (VIO_ACTIMG1.getSize() > 0) {
					VIO_ACTIMG1_NAME = FileUploadUtil2.uploadFormFile(VIO_ACTIMG1,Globals.IMAGEFILEUPLOADPATH_GAPAN);
					bean.setVIO_ACTIMG1_NAME(VIO_ACTIMG1_NAME);
				}
				if(VIO_ACTIMG2.getSize() > 0){
					VIO_ACTIMG2_NAME = FileUploadUtil2.uploadFormFile(VIO_ACTIMG2,Globals.IMAGEFILEUPLOADPATH_GAPAN);
					bean.setVIO_ACTIMG2_NAME(VIO_ACTIMG2_NAME);
				}
				
				String[] VIO_SEL= request.getParameterValues("VIO_SEL");
				
				String[] VIO_ACTSEL = request.getParameterValues("VIO_ACTSEL");
				

				//1.��������,2.�븮�,3.�ҹ�����,4.��������,5.�ҹ���ġ��,6.�ü����Ѽ�,7.��Ÿ
				for(int i = 0 ; i < VIO_SEL.length ; i++){
					Field _field = bean.getClass().getDeclaredField("VIO_SEL"+VIO_SEL[i]);
					_field.setAccessible(true);
					_field.set(bean, "1");
				}
				
				//1.�㰡���,2.�������,3.���·�ΰ�,4.�����ΰ�,5.��Ÿ
				for(int i = 0 ; i < VIO_ACTSEL.length ; i++){
					Field _field = bean.getClass().getDeclaredField("VIO_ACTSEL"+VIO_ACTSEL[i]);
					_field.setAccessible(true);
					_field.set(bean, "1");
				}
				
				bean.setVIO_IMG1_NAME(replaceImgPath(bean.getVIO_IMG1_NAME()));
				bean.setVIO_IMG2_NAME(replaceImgPath(bean.getVIO_IMG2_NAME()));
				bean.setVIO_ACTIMG1_NAME(replaceImgPath(bean.getVIO_ACTIMG1_NAME()));
				bean.setVIO_ACTIMG2_NAME(replaceImgPath(bean.getVIO_ACTIMG2_NAME()));
				
				if( "add".equals(mode) ){
					
					// ���� �ߺ�üũ 
					int chk = iJumyongService.violationCheck(bean);
					
					if( chk < 1 ){
					
						bean.setVIO_DATE(removeDash(bean.getVIO_DATE()));
						bean.setVIO_ACTDATE(removeDash(bean.getVIO_ACTDATE()));
						bean.setVIO_CONTENT(bean.getVIO_CONTENT().replaceAll("\r\n", "<br>"));
						bean.setVIO_ACTCONTENT(bean.getVIO_ACTCONTENT().replaceAll("\r\n", "<br>"));
						iJumyongService.violationRegisterPrc(bean);
						
						message = "����Ǿ����ϴ�.";
					}
					else{
						message = "�ߺ��� ������ �ֽ��ϴ�. Ȯ�����ּ���. ";
					}
				}
				else{
					bean.setVIO_DATE(removeDash(bean.getVIO_DATE()));
					bean.setVIO_ACTDATE(removeDash(bean.getVIO_ACTDATE()));
					bean.setVIO_CONTENT(bean.getVIO_CONTENT().replaceAll("\r\n", "<br>"));
					bean.setVIO_ACTCONTENT(bean.getVIO_ACTCONTENT().replaceAll("\r\n", "<br>"));
					iJumyongService.violationUpdate(bean);
					
					message = "�����Ǿ����ϴ�.";
					
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/gapan/jumyong/info_violation.do?&message="+message+"&GAPAN_NO="+GAPAN_NO);		
		
	}
	
	
	public String replaceImgPath(String fileName){
		
		String realPath = Globals.IMAGEFILEPATH;
		
		if(fileName.lastIndexOf(realPath) != -1){
			fileName = fileName.substring(realPath.length(),fileName.length());
		}else{
			
		}
		
		return fileName;
		
	}
	
	
	// ���ݻ��� �� view
	public ModelAndView	getViolationView(HttpServletRequest request, HttpServletResponse response, String rem_bjcd_param) throws Exception 
	{
		
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String message = ServletRequestUtils.getStringParameter(request, "message", "");
				String mode = ServletRequestUtils.getStringParameter(request, "mode", "");
				String GAPAN_NO = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String SEQ	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "5");
				int intCurrentPage = Integer.parseInt(strCurrentPage);
				int intCountPerPage = Integer.parseInt(strCountPerPage);
				
				if(mode.equals("del")){
					//del �ϋ�
					iJumyongService.deleteViolationInfo(GAPAN_NO,SEQ);
					return new ModelAndView("redirect:/gapan/jumyong/info_violation.do?GAPAN_NO="+GAPAN_NO+"&GP_TYP=001");
				}
				
				
				ProductBean bean = new ProductBean();
				//bind(request, bean);
				
				// **** ���� ����Ʈ start *** //
				bean.setGAPAN_NO(GAPAN_NO);
				bean.setSEQ(SEQ);
				
				int totalCount = iJumyongService.getVioTotalCount(bean);
				
				// ����¡ ó��
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),5, 
						"&GAPAN_NO="+GAPAN_NO+"&SEQ="+SEQ+"&currentPage="+strCurrentPage
						+"&countPerPage="+strCountPerPage, "", "/gapan/jumyong/info_violation.do", totalCount);
				request.setAttribute("strPageDivideForm", strPageDivideForm );
				
				List		list	= iJumyongService.getVioTotalList(bean, ((intCurrentPage-1)*5)+1, intCurrentPage*5);
				if( list.size() > 0 ){
					for( int i = 0; i < list.size(); i++ ){
						bean = (ProductBean) list.get(i);
						
						if( bean.getVIO_DATE() != null && !"".equals(bean.getVIO_DATE()) ){
							bean.setVIO_DATE(addDash(bean.getVIO_DATE()));
						}
						if( bean.getVIO_ACTDATE()!= null && !"".equals(bean.getVIO_ACTDATE()) ){
							bean.setVIO_ACTDATE(addDash(bean.getVIO_ACTDATE()));
						}
						if( bean.getVIO_ACTCONTENT() != null && !"".equals(bean.getVIO_ACTCONTENT()) && bean.getVIO_ACTCONTENT().length() > 15 ){
							bean.setVIO_ACTCONTENT(bean.getVIO_ACTCONTENT().substring(0, 12) + "...");
						}
					}
				}
				// **** ���� ����Ʈ end *** //
				
				Map retVal = iJumyongService.getGiganPoint(GAPAN_NO);
				request.setAttribute("MUL_FROMDATE", retVal.get("MUL_FROMDATE").toString());
				request.setAttribute("MUL_TODATE", retVal.get("MUL_TODATE").toString());
				request.setAttribute("VIO_ACCPOINTS", retVal.get("VIO_ACCPOINTS").toString());
				
				
				// **** �Ʒ� ��  view start *** //
				bean = new ProductBean();
				
				bean = iJumyongService.getViolationView(GAPAN_NO,SEQ);
				
				if( bean != null ){
					if( bean.getVIO_DATE() != null && !"".equals(bean.getVIO_DATE()) ){
						bean.setVIO_DATE(addDash(bean.getVIO_DATE()));
					}
					if( bean.getVIO_ACTDATE()!= null && !"".equals(bean.getVIO_ACTDATE()) ){
						bean.setVIO_ACTDATE(addDash(bean.getVIO_ACTDATE()));
					}
				}
				// **** �Ʒ� �� view end *** //
				request.setAttribute("message",message);
				request.setAttribute("GAPAN_NO",GAPAN_NO);
				request.setAttribute("SEQ", SEQ);
				request.setAttribute("violation", bean);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("list", list);
				
				String filePath = Globals.IMAGEFILEPATH;		
				request.setAttribute("filePath", filePath );
			}
				
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/jumyong/violation_view");
	}
	
	

	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	public String addDash(String val1)
	{	
		if(val1.length() >= 8)
			val1 = val1.substring(0,4)+"-"+val1.substring(4,6)+"-"+val1.substring(6,8);
		else if(val1.length() >= 6)
			val1 = val1.substring(0,4)+"-"+val1.substring(4,6);
		
		return val1;
	}
	
	
}

