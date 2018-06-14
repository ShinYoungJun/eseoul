//	2009		Kim Yun Seo

package main.java.jumyong.gigan.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.jumyong.gigan.model.GiganBean;
import main.java.jumyong.gigan.model.GiganSearchBean;
import main.java.jumyong.gigan.service.IGiganService;
import main.java.jumyong.jumyong.model.SearchBean;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class GiganControl	extends MultiActionController{

	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setJumyong_giganService(IGiganService jumyong_giganService) 
	{
		this.iGiganervice = jumyong_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	//	����� �˻� 
	public ModelAndView 	Search(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{		
//		 ���� ����
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	list	=	null;
		
		try{
			if(userId != null)
			{
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//	�˻��Ⱓ�� ���ú��� ������ ������ �����Ѵ�.
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				cal.add(Calendar.DATE, -6);
				String	beforeDay		= formatter.format(cal.getTime());
				
				String 	check_gigan = ServletRequestUtils.getStringParameter(request, "check_gigan", "0");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				String 	AfterGigan1 = ServletRequestUtils.getStringParameter(request, "AfterGigan1", "");
				String 	AfterGigan2 = ServletRequestUtils.getStringParameter(request, "AfterGigan2", "");
				String 	giganRegdate = ServletRequestUtils.getStringParameter(request, "giganRegdate", "");
				String 	SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
				
				
				GiganSearchBean	giganSearchBean	= new GiganSearchBean();
				
				//	�˻� ������ ���ε� �Ѵ�.
				bind(request, giganSearchBean);
				
				giganSearchBean.setSIDO(SIDO_CD);
				giganSearchBean.setSIGUNGU(userBean.getSIGU_CD());
				
				giganSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
				giganSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
				giganSearchBean.setAfterGigan1(util.Date_Cut(AfterGigan1));
				giganSearchBean.setAfterGigan2(util.Date_Cut(AfterGigan2));
				giganSearchBean.setGiganRegdate(giganRegdate);
				
				request.setAttribute("PURPOSE_CD", giganSearchBean.getPURPOSE_CD());
				
				int	 	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				int		iTotalCnt	= 0;
				//	�������� �� ������ �����´�.
				if(check_gigan.equals("0")){
					iTotalCnt	= iGiganervice.executeCount(giganSearchBean);
				}else{
					iTotalCnt	= iGiganervice.executeBeforeCount(giganSearchBean);
				}
				
				//	����¡ ó��
				int		rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
				
				//	�˻��� �����͸� �����´�.
				if(check_gigan.equals("0")){
					list	= iGiganervice.executeSearch(giganSearchBean, rowCol, rowCol + 9);
				}else{
					list	= iGiganervice.executeBeforeSearch(giganSearchBean, rowCol, rowCol + 9);
				}
				
				System.out.println("::::: list.size : : : "+list.size());
				
				GiganBean	Bean	= new GiganBean();
				String		jumyongji	= "";
				Iterator ir = list.iterator();
				
				while(ir.hasNext()){
					
					Bean	= (GiganBean)ir.next();
					Bean.setTYPE(commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));	//	��������
					
					//	������
					jumyongji	= commonCode.executeSearchBJDongCode(SIDO_CD, userBean.getSIGU_CD(), Bean.getBJ_CD());
					
		        	String post = Bean.getPOST();
		        	String ssn = Bean.getSSN();
		        	
		        	post = post.substring(0, 3)+"-"+post.substring(3);
		        	if(ssn != null)
		        		ssn = ssn.substring(0,8)+"******";
		        	
		        	Bean.setPOST(post);
		        	Bean.setSSN(ssn);
					
					
					if(Bean.getSAN_CK()	!= null)
						if(Bean.getSAN_CK().trim().equals("2"))
							jumyongji += " ��";
					
					if(Bean.getBONBUN()	!= null)
						if(!Bean.getBONBUN().trim().equals(""))
							jumyongji	+= " " + Bean.getBONBUN();
					
					if(Bean.getBUBUN()	!= null)
						if(!Bean.getBUBUN().trim().equals(""))
							jumyongji	+= "-" + Bean.getBUBUN();
					Bean.setCUT_ADMIN_NO(Bean.getADMIN_NO().substring(9));
					Bean.setJUMYONGJI(jumyongji);
					
					//	������� KIND
					if(Bean.getPURPOSE_KIND()	!= null)
						if(!Bean.getPURPOSE_KIND().trim().equals(""))
							Bean.setPURPOSE_KIND("(" + Bean.getPURPOSE_KIND() + ")");
					
					Bean.setGIGAN(util.Date_Paste(Bean.getMUL_FROMDATE()) + " ~ " + util.Date_Paste(Bean.getMUL_TODATE()));
				}
				
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", giganSearchBean.getTYPE(), "��ü"));			//	��������
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", giganSearchBean.getOWNER_SET(), "��ü"));		//	������
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", giganSearchBean.getTAX_SET(), "��ü"));	//	���Ա���	
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), giganSearchBean.getBJ_CD()));	//	������
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), giganSearchBean.getHJ_CD()));	//	������
				request.setAttribute("GIGAN1", util.Date_Paste(GIGAN1));
				request.setAttribute("GIGAN2", util.Date_Paste(GIGAN2));
				request.setAttribute("TYPE", giganSearchBean.getTYPE());				
				request.setAttribute("BONBUN", giganSearchBean.getBONBUN());
				request.setAttribute("BUBUN", giganSearchBean.getBUBUN());
				request.setAttribute("NAME", giganSearchBean.getNAME());
				request.setAttribute("ADMINNO", giganSearchBean.getADMINNO());
				request.setAttribute("AfterGigan1", util.Date_Paste(AfterGigan1));
				request.setAttribute("AfterGigan2", util.Date_Paste(AfterGigan2));
				request.setAttribute("giganRegdate", giganRegdate);
				request.setAttribute("check_gigan", check_gigan);
				request.setAttribute("userId", userId);
				request.setAttribute("SIDO", SIDO_CD);
				request.setAttribute("SIGUNGU", userBean.getSIGU_CD());
				request.setAttribute("SECTION", SECTION);
				
				//������� Ŭ�����ڵ� ����Ʈ�ڽ��� �������� �Ǿ� ������...search_flag���� 1��... 
				if("%".equals(giganSearchBean.getPURPOSE_CD())){
					request.setAttribute("search_flag", "1");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
			
		return new ModelAndView("/jumyong/gigan/search", "blist", list);
	}
	
	//	����� �˻�(EXCEL) 
	public ModelAndView 	Excel_Search(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		
		
		List list = null;
		try{
		//	���ǿ��� �õ� �ڵ带 �����´�.
		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
		
		//	������ �����͸� �����´�.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));		
		
		System.out.println("UserBean.name : "+userBean.getNAME());
		
		//	�˻��Ⱓ�� ���ú��� ������ ������ �����Ѵ�.
		SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
		Calendar 			cal 		= Calendar.getInstance();
		String	today		= formatter.format(cal.getTime());
		cal.add(Calendar.DATE, -6);
		String	beforeDay		= formatter.format(cal.getTime());
		
		String 	check_gigan = ServletRequestUtils.getStringParameter(request, "check_gigan", "0");
		String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
		String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
		String 	AfterGigan1 = ServletRequestUtils.getStringParameter(request, "AfterGigan1", "");
		String 	AfterGigan2 = ServletRequestUtils.getStringParameter(request, "AfterGigan2", "");
		String 	giganRegdate = ServletRequestUtils.getStringParameter(request, "giganRegdate", "");

		GiganSearchBean	giganSearchBean	= new GiganSearchBean();
		
//		�˻� ������ ���ε� �Ѵ�.
		bind(request, giganSearchBean);
		
		giganSearchBean.setSIDO(SIDO_CD);
		giganSearchBean.setSIGUNGU(userBean.getSIGU_CD());
		
		giganSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
		giganSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
		giganSearchBean.setAfterGigan1(util.Date_Cut(AfterGigan1));
		giganSearchBean.setAfterGigan2(util.Date_Cut(AfterGigan2));
		giganSearchBean.setGiganRegdate(giganRegdate);
		
		int iTotalCnt = 0;
		//	�������� �� ������ �����´�.
		if(check_gigan.equals("0")){
			iTotalCnt	= iGiganervice.executeCount(giganSearchBean);
		}else{
			iTotalCnt	= iGiganervice.executeBeforeCount(giganSearchBean);
		}
		
		//	�˻��� �����͸� �����´�.
		if(check_gigan.equals("0")){
			list	= iGiganervice.executeSearch(giganSearchBean, 1, iTotalCnt);
		}else{
			list	= iGiganervice.executeBeforeSearch(giganSearchBean, 1, iTotalCnt);
		}
		
		GiganBean	Bean	= new GiganBean();
		String		jumyongji	= "";
		
		Iterator ir = list.iterator();
		
		while(ir.hasNext()){

			Bean	= (GiganBean)ir.next();
			
			Bean.setTYPE(commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));	//	��������
			
			//	������
			jumyongji	= commonCode.executeSearchBJDongCode(SIDO_CD, userBean.getSIGU_CD(), Bean.getBJ_CD());
			
        	String post = Bean.getPOST().trim();
        	post = post.substring(0, 3)+"-"+post.substring(3);
        	Bean.setPOST(post);
        	
			if(Bean.getSAN_CK()	!= null)
				if(Bean.getSAN_CK().trim().equals("2"))
					jumyongji += " ��";
			
			if(Bean.getBONBUN()	!= null)
				if(!Bean.getBONBUN().trim().equals(""))
					jumyongji	+= " " + Bean.getBONBUN();
			
			if(Bean.getBUBUN()	!= null)
				if(!Bean.getBUBUN().trim().equals(""))
					jumyongji	+= "-" + Bean.getBUBUN();
			
			Bean.setJUMYONGJI(jumyongji);
			
			//	������� KIND
			if(Bean.getPURPOSE_KIND()	!= null)
				if(!Bean.getPURPOSE_KIND().trim().equals(""))
					Bean.setPURPOSE_KIND("(" + Bean.getPURPOSE_KIND() + ")");
			Bean.setADMIN_NO(Bean.getADMIN_NO().substring(9));
			Bean.setGIGAN(util.Date_Paste(Bean.getMUL_FROMDATE()) + " ~ " + util.Date_Paste(Bean.getMUL_TODATE()));
		}
		
		System.out.println("EXCEL��ġ ����");
		
		request.setAttribute("use_type", commonCode.executeCommonCode("use_type", giganSearchBean.getTYPE(), "��ü"));			//	��������
		request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", giganSearchBean.getOWNER_SET(), "��ü"));		//	������
		request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", giganSearchBean.getTAX_SET(), "��ü"));	//	���Ա���	
		request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), giganSearchBean.getBJ_CD()));	//	������
		request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), giganSearchBean.getHJ_CD()));	//	������
	
		request.setAttribute("GIGAN1", util.Date_Paste(GIGAN1));
		request.setAttribute("GIGAN2", util.Date_Paste(GIGAN2));
		request.setAttribute("TYPE", giganSearchBean.getTYPE());
		request.setAttribute("PURPOSE_CD", giganSearchBean.getPURPOSE_CD());
		request.setAttribute("BONBUN", giganSearchBean.getBONBUN());
		request.setAttribute("BUBUN", giganSearchBean.getBUBUN());
		request.setAttribute("NAME", giganSearchBean.getNAME());
		request.setAttribute("ADMINNO", giganSearchBean.getADMINNO());
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return new ModelAndView("/jumyong/gigan/excel_search", "blist", list);
	}	

	
	public ModelAndView 	View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		try{
			if(userId != null)
			{						
				//	�˻� ������ �Ҹ��� ���� ���� ȭ�鿡 �����Ѵ�.
				Search_Date(request, response);
				
				request.setAttribute("userId", userId);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		return new ModelAndView("/jumyong/gigan/view", "ADMIN_NO", ADMIN_NO);
	}
	
	//	�ϰ�ó��ȭ��
	public ModelAndView 	View_Ilgwal(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		
		try{
			if(userId != null)
			{
				String 	ADMINNO 	= ServletRequestUtils.getStringParameter(request, "ADMINNO", "");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
				
				String	PURPOSE_CD	= ServletRequestUtils.getStringParameter(request, "PURPOSE_CD", "");
				String	BONBUN		= ServletRequestUtils.getStringParameter(request, "BONBUN", "");
				String	BUBUN		= ServletRequestUtils.getStringParameter(request, "BUBUN", "");
				String	NAME		= ServletRequestUtils.getStringParameter(request, "NAME", "");
				
				String	TYPE		= ServletRequestUtils.getStringParameter(request, "TYPE", "");
				String	SECTION		= ServletRequestUtils.getStringParameter(request, "SECTION", "");
				String	OWNER_SET	= ServletRequestUtils.getStringParameter(request, "OWNER_SET", "");
				String	TAX_SET		= ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
				String	BJ_CD		= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
				String	HJ_CD		= ServletRequestUtils.getStringParameter(request, "HJ_CD", "");
				
				request.setAttribute("TYPE", TYPE);				//	��������
				request.setAttribute("SECTION", SECTION);				//	��������
				request.setAttribute("OWNER_SET", OWNER_SET);	//	������
				request.setAttribute("TAX_SET", TAX_SET);		//	���Ա���	
				request.setAttribute("BJ_CD", BJ_CD);			//	������
				request.setAttribute("HJ_CD", HJ_CD);			//	������
		
				request.setAttribute("GIGAN1", util.Date_Cut(GIGAN1));
				request.setAttribute("GIGAN2", util.Date_Cut(GIGAN2));
				request.setAttribute("PURPOSE_CD", PURPOSE_CD);
				request.setAttribute("BONBUN", BONBUN);
				request.setAttribute("BUBUN", BUBUN);
				request.setAttribute("NAME", NAME);
				request.setAttribute("ADMINNO", ADMINNO);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	//	System.out.println("!View_Ilgwal!!!!!! " + GIGAN1 + ", " + GIGAN2);
		
		return new ModelAndView("/jumyong/gigan/view_ilgwal");
	}
	
	//	�˻������� �Ҹ��� ���� ���� ���� �������� �̵��Ҷ� �����͸� ������.
	public void	 	Search_Date(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	GIGAN1	 	= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
		String 	GIGAN2	 	= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
		String 	PURPOSE_CD 	= ServletRequestUtils.getStringParameter(request, "PURPOSE_CD", "");
		String 	BONBUN	 	= ServletRequestUtils.getStringParameter(request, "BONBUN", "");
		String 	BUBUN	 	= ServletRequestUtils.getStringParameter(request, "BUBUN", "");
		String 	NAME	 	= ServletRequestUtils.getStringParameter(request, "NAME", "");
		String 	ADMINNO	= ServletRequestUtils.getStringParameter(request, "ADMINNO", "");
		String 	TYPE	 	= ServletRequestUtils.getStringParameter(request, "TYPE", "");
		String 	OWNER_SET	= ServletRequestUtils.getStringParameter(request, "OWNER_SET", "");
		String 	TAX_SET	 	= ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
		String 	BJ_CD	 	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
		String 	HJ_CD	 	= ServletRequestUtils.getStringParameter(request, "HJ_CD", "");
		String 	currentPage	 	= ServletRequestUtils.getStringParameter(request, "currentPage", "1");
		
		request.setAttribute("GIGAN1", GIGAN1);
		request.setAttribute("GIGAN2", GIGAN2);
		request.setAttribute("PURPOSE_CD", PURPOSE_CD);
		request.setAttribute("BONBUN", BONBUN);
		request.setAttribute("BUBUN", BUBUN);
		request.setAttribute("NAME", NAME);
		request.setAttribute("ADMINNO", ADMINNO);
		request.setAttribute("TYPE", TYPE);
		request.setAttribute("OWNER_SET", OWNER_SET);
		request.setAttribute("TAX_SET", TAX_SET);
		request.setAttribute("BJ_CD", BJ_CD);
		request.setAttribute("HJ_CD", HJ_CD);
		request.setAttribute("currentPage", currentPage);
	}
}
