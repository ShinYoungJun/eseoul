//	2009		Kim Yun Seo

package main.java.jumyong.saewe.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.HistoryBean;
import main.java.common.commonCode.model.RefDeptCodeBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.jumyong.saewe.model.AppealBean;
import main.java.jumyong.saewe.model.PlaceBean;
import main.java.jumyong.saewe.model.CalculationBean;
import main.java.jumyong.saewe.model.SaeweBean;
import main.java.jumyong.saewe.model.TaxationBean;
import main.java.jumyong.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabBugwa_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setJumyong_saeweService(ISaeweService jumyong_saeweService) 
	{
		this.iSaeweService = jumyong_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	�ΰ����� �� ȭ��
	public ModelAndView 	Bugwa_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{	
		HttpSession session = request.getSession();
		String 		user_id	= (String)session.getAttribute("sessionUserId");	
		TaxationBean	taxBean	= new TaxationBean();

		try{
			if(user_id != null){
				String ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
				String MSG	=  ServletRequestUtils.getStringParameter(request, "MSG", "");
								
				if(SEQ == null	||	SEQ.trim().equals(""))	//	���������� �ϳ��� ������� ��ȭ�� ���
					return new ModelAndView("/jumyong/saewe/tab/bugwa_view_sample");
				
				List		list 	= iSaeweService.executeBugwa_View(ADMIN_NO, SEQ);
//				System.out.println("user_id ==> " + user_id);
				String		bukwa_id	= iSaeweService.executeBugwa_Id(user_id);								

				if(list.size()<=0)
					return	Bugwa_Register(request, response);//Bean	= null;
				
				else
				{
					taxBean	= (TaxationBean)list.get(0);
					
					//	�ΰ������� �ʿ��� ������, ������ ������ �����´�.
					List	data	= iSaeweService.executeBugwa_DataInfo(ADMIN_NO, SEQ);
					SaeweBean	saeweBean	= new SaeweBean();
					saeweBean	= (SaeweBean)data.get(0);
					
					request.setAttribute("TAX_GUBUN", commonCode.executeSearchCommonCode("taxation_part", taxBean.getTAX_GUBUN()));
					request.setAttribute("TAX_CD", commonCode.executeSearchTaxCode(saeweBean.getTAX_SET(), taxBean.getTAX_CD())); //	�����ڵ�
					request.setAttribute("LIVE", commonCode.executeSearchCommonCode("taxpayer_residence", taxBean.getLIVE()));
					request.setAttribute("OBJ_SET", commonCode.executeSearchCommonCode("object_type", taxBean.getOBJ_SET()));
					request.setAttribute("TAXPAYER_SET", commonCode.executeSearchCommonCode("taxpayer_group", taxBean.getTAXPAYER_SET()));
					request.setAttribute("TAX_YN", taxBean.getTAX_YN());			//	�ΰ�����
					//System.out.println("############### View   Bean.getADD_SET() ==> " + Bean.getADD_SET());
					//System.out.println("############### commonCode.executeCommonCodeNm(addition_part, Bean.getADD_SET() ==> " + commonCode.executeCommonCodeNm("addition_part", Bean.getADD_SET()));
					request.setAttribute("ADD_SET_NM", commonCode.executeCommonCodeNm("addition_part", taxBean.getADD_SET()));
					
					taxBean.setBONSE(util.Comma_Paste(taxBean.getBONSE()));			//	����
					taxBean.setVAT(util.Comma_Paste(taxBean.getVAT()));				//	�ΰ���ġ��
					taxBean.setINTAX(util.Comma_Paste(taxBean.getINTAX()));			//	���⳻�ݾ�
					taxBean.setOVERTAX(util.Comma_Paste(taxBean.getOVERTAX()));		//	�����ıݾ�
					taxBean.setLIMIT_SUM(util.Comma_Paste(taxBean.getLIMIT_SUM()));	//	���� ������
					taxBean.setRATE(util.Comma_Paste(taxBean.getRATE()));				//	Ư������			
					taxBean.setSISE(util.Comma_Paste(taxBean.getSISE()));				//	�ü�
					taxBean.setGIGUM(util.Comma_Paste(taxBean.getGIGUM()));			//	���
					taxBean.setGUKSE(util.Comma_Paste(taxBean.getGUKSE()));			//	����
					taxBean.setGUSE(util.Comma_Paste(taxBean.getGUSE()));				//	����
					
					taxBean.setTAX_DATE(util.Date_Paste(taxBean.getTAX_DATE()));		//	��������
					taxBean.setINDATE(util.Date_Paste(taxBean.getINDATE()));			//	���⳻����
					taxBean.setOVERDATE(util.Date_Paste(taxBean.getOVERDATE()));		//	����������
					if(taxBean.getSUNAP_DATE() == null || taxBean.getSUNAP_DATE() == ""){
				 		taxBean.setSUNAP_DATE("-");
					}
					else{
						taxBean.setSUNAP_DATE(util.Date_Paste(taxBean.getSUNAP_DATE()));
					}
				
					if(taxBean.getADD_YN()	!=	null){		//	����ݸ�������
						if(taxBean.getADD_YN().trim().equals("1"))
							taxBean.setADD_YN("����� ����");
						else{
							taxBean.setADD_YN("����� �����");
						}
					}
					
					//	��, ��
					if(taxBean.getTAX_YM()	!= null)
					{
						String	ym	= taxBean.getTAX_YM();
						if(taxBean.getTAX_YM().length() == 6)
						{
							request.setAttribute("tax_year", ym.substring(0, 4));
							
							int	month	= Integer.parseInt(ym.substring(4, 6));
							
							request.setAttribute("tax_month", String.valueOf(month));
						}
					}
				}
		
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("SEQ", SEQ);
				request.setAttribute("SECTION", SECTION);
				request.setAttribute("MSG", MSG);
				
				request.setAttribute("semok_cd", taxBean.getTAX_CD());
				request.setAttribute("tax_ym", taxBean.getTAX_YM());
				request.setAttribute("tax_gubun", taxBean.getTAX_GUBUN());
				request.setAttribute("user_id", user_id);
				request.setAttribute("bukwa_id", bukwa_id);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/saewe/tab/bugwa_view", "board", taxBean);
	}
	
	
	//	�ΰ����� ���� ȭ��
	public ModelAndView 	Bugwa_Modify(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		TaxationBean	Bean	= new TaxationBean();
		
		try{
			if(userId != null){
				
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ		 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		
				//	�ΰ� ���� �� �����͸� �����´�.
				List list 	= iSaeweService.executeBugwa_View(ADMIN_NO, SEQ);
				
				if(list.size()<=0)//	�����Ͱ� ������ ���� �߰�
					return	Bugwa_Register(request, response);//Bean	= null;
				else
				{
					Bean	= (TaxationBean)list.get(0);
					
					//	������, ������ ������ �����´�.
					String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
					List	data	= iSaeweService.executeBugwa_DataInfo(ADMIN_NO, SEQ);
					List<RefDeptCodeBean> depts = commonCode.getRefDepts(SIDO_CD + Bean.getSIGUNGU(), Bean.getSIGU_CD(), Bean.getDEPT_CD());
					SaeweBean	saeweBean	= new SaeweBean();
					saeweBean	= (SaeweBean)data.get(0);
					
					request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", Bean.getTAX_GUBUN(), null));
					request.setAttribute("taxcode", commonCode.executeTaxCode(saeweBean.getTAX_SET(), null, "����"));
					request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", Bean.getLIVE(), null));
					request.setAttribute("object_type", commonCode.executeCommonCode("object_type", Bean.getOBJ_SET(), null));
					request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", Bean.getTAXPAYER_SET(), null));
					
					Bean.setBONSE(util.Comma_Paste(Bean.getBONSE()));			//	����
					Bean.setVAT(util.Comma_Paste(Bean.getVAT()));				//	�ΰ���ġ��
					Bean.setINTAX(util.Comma_Paste(Bean.getINTAX()));			//	���⳻�ݾ�
					Bean.setOVERTAX(util.Comma_Paste(Bean.getOVERTAX()));		//	�����ıݾ�
					Bean.setLIMIT_SUM(util.Comma_Paste(Bean.getLIMIT_SUM()));	//	���� ������
					Bean.setRATE(util.Comma_Paste(Bean.getRATE()));				//	Ư������
					Bean.setSISE(util.Comma_Paste(Bean.getSISE()));				//	�ü�
					Bean.setGIGUM(util.Comma_Paste(Bean.getGIGUM()));			//	���
					Bean.setGUKSE(util.Comma_Paste(Bean.getGUKSE()));			//	����
					Bean.setGUSE(util.Comma_Paste(Bean.getGUSE()));				//	����
					
					Bean.setTAX_DATE(util.Date_Paste(Bean.getTAX_DATE()));		//	��������
					Bean.setINDATE(util.Date_Paste(Bean.getINDATE()));			//	���⳻����
					Bean.setOVERDATE(util.Date_Paste(Bean.getOVERDATE()));		//	����������
					//System.out.println("#### Modify Bean.getADD_SET() ==> " + Bean.getADD_SET());
					request.setAttribute("ADD_SET_NM", commonCode.executeCommonCodeNm("addition_part", Bean.getADD_SET()));
					request.setAttribute("BONSE", saeweBean.getSUM_ADJUST());
					
					request.setAttribute("SUM_ADJUST", util.Comma_Paste(saeweBean.getSUM_ADJUST()));	// ����� cal_sum_info ������ ����
					
					System.out.println("#### Modify getVAT() ==> " + Bean.getVAT());
					
					
					//********** BEGIN_����_20120229
					UserBean userbean = commonCode.executeUserSearch(userId);
					List<UserBean> userList = commonCode.executeUserDeptSearch(userbean.getORG_CD());
					UserBean returnBean = userList.get(0);
					
					//********** BEGIN_����_20120308
					/*
					request.setAttribute("SIGU_CD", returnBean.getORG_CD());
					request.setAttribute("GU_NM", returnBean.getGU_NM());
					request.setAttribute("DEPT_CD",returnBean.getDEPT_CD());
					request.setAttribute("DEPT_NM", returnBean.getDEPT_NM());	
					*/
					logger.info(String.format("Bugwa_Modify() ::: depts.size = %d", depts != null ? depts.size() : -1));
					if (depts != null && depts.size() == 1) {
						RefDeptCodeBean deptBean = depts.get(0);
						request.setAttribute("SIGU_CD", deptBean.getORG_CD());
						request.setAttribute("GU_NM", deptBean.getGU_NM());
						request.setAttribute("DEPT_CD", deptBean.getDEPT_CD());
						request.setAttribute("DEPT_NM", deptBean.getDEPT_NM());
						request.setAttribute("DEPT_LIST", commonCode.genRefDeptList2Html(deptBean.getSIGU_CD(), Bean.getDEPT_CD()));
					}
					//********** END_����_20120308
							
					
					//********** END_����_20120229
					
					request.setAttribute("VAT", util.Comma_Paste(saeweBean.getVAT()));					// �ΰ��� cal_sum_info ������ ����
					
					//	�ϳ��� ������� ��,����  ���� �и���Ų��.
					if(Bean.getTAX_YM()	!= null)
					{
						String	ym	= Bean.getTAX_YM();
						if(Bean.getTAX_YM().length() == 6)
						{
							request.setAttribute("tax_year", ym.substring(0, 4));
							request.setAttribute("tax_month", ym.substring(4, 6));
						}
					}
				}
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("SEQ", SEQ);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/saewe/tab/bugwa_modify", "board", Bean);
	}
	
	//	�ΰ����� ����
	public ModelAndView 	Bugwa_Modify_Prc(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		try{
			
			String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			String 	tax_year	= ServletRequestUtils.getStringParameter(request, "tax_year", "");
			String 	tax_month	= ServletRequestUtils.getStringParameter(request, "tax_month", "");
			
			String 	ADD_YN	= ServletRequestUtils.getStringParameter(request, "ADD_YN", "0");
			
			TaxationBean	Bean	= new TaxationBean();
			
			bind(request, Bean);
			
			Bean.setBONSE(util.Comma_Cut(Bean.getBONSE()));			//	����
			Bean.setVAT(util.Comma_Cut(Bean.getVAT()));				//	�ΰ���ġ��
			Bean.setINTAX(util.Comma_Cut(Bean.getINTAX()));			//	���⳻�ݾ�
			Bean.setOVERTAX(util.Comma_Cut(Bean.getOVERTAX()));		//	�����ıݾ�
			Bean.setLIMIT_SUM(util.Comma_Cut(Bean.getLIMIT_SUM()));	//	���� ������
			Bean.setRATE(util.Comma_Cut(Bean.getRATE()));			//	Ư������
			Bean.setSISE(util.Comma_Cut(Bean.getSISE()));			//	�ü�
			Bean.setGIGUM(util.Comma_Cut(Bean.getGIGUM()));			//	���
			Bean.setGUKSE(util.Comma_Cut(Bean.getGUKSE()));			//	����
			Bean.setGUSE(util.Comma_Cut(Bean.getGUSE()));			//	����
			
			Bean.setTAX_DATE(util.Date_Cut(Bean.getTAX_DATE()));		//	��������
			Bean.setINDATE(util.Date_Cut(Bean.getINDATE()));			//	���⳻����
			Bean.setOVERDATE(util.Date_Cut(Bean.getOVERDATE()));		//	����������
			
			
			if(Bean.getGIGUM() == null || Bean.getGIGUM().equals("")){
				Bean.setGIGUM("0");
			}
			
			if(Bean.getGUKSE() == null || Bean.getGUKSE().equals("")){
				Bean.setGUKSE("0");
			}
			
			int	month	= Integer.parseInt(tax_month);
			if(month <= 9)	//	0~9�� 01~09 �� �����. 
				tax_month	= "0" + tax_month;
			
		//	System.out.println(tax_year + tax_month);
			
			Bean.setTAX_YM(tax_year + tax_month);
			Bean.setADMIN_NO(ADMIN_NO);
			Bean.setADD_YN(ADD_YN);
			
			//	�ΰ� ���� ����
			iSaeweService.executeBugwa_Modify(Bean);
			
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return Bugwa_View(request, response);
	}
	
	//	�ΰ����� �Է� ȭ��
	public ModelAndView 	Bugwa_Register(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");						
		
		try{
			if(userId != null){
							
				String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String 	SECTION 	= ServletRequestUtils.getStringParameter(request, "SECTION", "");
				System.out.println("################# IN ADMIN_NO ==>" + ADMIN_NO);
				System.out.println("################# IN SEQ ==>" + SEQ);
				System.out.println("################# IN SECTION ==>" + SECTION);
				//	�����Ͱ� ������ ����ȭ������ �̵�
				if(SEQ == null	||	"".equals(SEQ))	//	ERROR
				{
					return new ModelAndView("/jumyong/saewe/tab/bugwa_register");
				}
				
				//	�ΰ������� �ʿ��� ������, ������ ������ �����´�.
				List	list	= iSaeweService.executeBugwa_DataInfo(ADMIN_NO, SEQ);
				
				SaeweBean	Bean	= new SaeweBean();
		
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (SaeweBean)list.get(0);
					
					request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", null, "����"));				//	��������
					request.setAttribute("taxcode", commonCode.executeTaxCode(Bean.getTAX_SET(), null, "����"));						//	�����ڵ�
					request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", null, "����"));	//	���ֻ���
					request.setAttribute("object_type", commonCode.executeCommonCode("object_type", null, "����"));					//	���Ǳ���
					request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", null, "����"));			//	������ ����	
					request.setAttribute("SUM_ADJUST", util.Comma_Paste(Bean.getSUM_ADJUST()));
					request.setAttribute("BONSE", Bean.getSUM_ADJUST());
					System.out.println("::::::::::::::::::VAT::::"+Bean.getVAT());
					request.setAttribute("VAT", util.Comma_Paste(Bean.getVAT()));
				}
			
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("SEQ", SEQ);
				request.setAttribute("YEAR", Bean.getYEAR());
				request.setAttribute("TAX_SET", Bean.getTAX_SET());	//���Ա���
				request.setAttribute("SECTION", SECTION);
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//���� �⵵
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				
				if(userBean	!= null)
				{
					String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
					String orgCd = userBean.getORG_CD();
					String deptCd = userBean.getDEPT_CD();
					request.setAttribute("ORG_CD", orgCd);
					request.setAttribute("GU_NM", userBean.getGU_NM());
					request.setAttribute("DEPT_CD", deptCd);
					request.setAttribute("DEPT_NM", userBean.getDEPT_NM());
					request.setAttribute("TAX_DATE", today);
					request.setAttribute("DEPT_LIST", commonCode.genRefDeptList2Html(SIDO_CD + userBean.getSIGU_CD(), deptCd));
				}
//				logger.info(String.format("DEPT_LIST : %s", util.nullTo(request.getAttribute("DEPT_LIST").toString(), "null")));
			
			}
		}catch(Exception e){
			logger.error("Bugwa_Register()", e);
		}	
		
		return new ModelAndView("/jumyong/saewe/tab/bugwa_register");
	}
	
	
	//	�ΰ����� �Է��ϱ�
	public ModelAndView 	Bugwa_Register_Prc(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{										
		try{
			
				BugaWebControl	bugaWebControl	= new BugaWebControl();
				
				String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ			= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String 	tax_year	= ServletRequestUtils.getStringParameter(request, "tax_year", "");
				String 	tax_month	= ServletRequestUtils.getStringParameter(request, "tax_month", "");
				String 	ADD_YN	= ServletRequestUtils.getStringParameter(request, "ADD_YN", "0");
				
				TaxationBean	Bean	= new TaxationBean();
				
				bind(request, Bean);
				
				Bean.setBONSE(util.Comma_Cut(Bean.getBONSE()));			//	����
				Bean.setVAT(util.Comma_Cut(Bean.getVAT()));				//	�ΰ���ġ��
				Bean.setINTAX(util.Comma_Cut(Bean.getINTAX()));			//	���⳻�ݾ�
				Bean.setOVERTAX(util.Comma_Cut(Bean.getOVERTAX()));		//	�����ıݾ�
				Bean.setLIMIT_SUM(util.Comma_Cut(Bean.getLIMIT_SUM()));	//	���� ������
				Bean.setRATE(util.Comma_Cut(Bean.getRATE()));			//	Ư������
				Bean.setSISE(util.Comma_Cut(Bean.getSISE()));			//	�ü�
				Bean.setGIGUM("0");			//	���
				Bean.setGUKSE("0");			//	����
				
				TaxationBean addInfoBean = (TaxationBean)iSaeweService.getAddInfo(ADMIN_NO).get(0);
				Bean.setFORM1(addInfoBean.getFORM1());
				Bean.setFORM2(addInfoBean.getFORM2());
				Bean.setTAXPAYER_ID(addInfoBean.getTAXPAYER_ID());
				
				
				Bean.setGUSE(util.Comma_Cut(Bean.getGUSE()));			//	����
				
				Bean.setTAX_DATE(util.Date_Cut(Bean.getTAX_DATE()));		//	��������
				Bean.setINDATE(util.Date_Cut(Bean.getINDATE()));			//	���⳻����
				Bean.setOVERDATE(util.Date_Cut(Bean.getOVERDATE()));		//	����������
				
				int	month	= Integer.parseInt(tax_month);
				if(month <= 9)
					tax_month	= "0" + tax_month;
				
				Bean.setTAX_YM(tax_year + tax_month);
				Bean.setADMIN_NO(ADMIN_NO);
				Bean.setSEQ(SEQ);
				Bean.setADD_YN(ADD_YN);
				
				//	������ȣ ����
			//	String	TAX_NO	= bugaWebControl.getNewTaxNo(Bean.getSIGU_CD(), Bean.getTAX_CD(), Bean.getTAX_YM(), Bean.getTAX_SET());
			//	Bean.setTAX_NO(TAX_NO);
				
				//	�����͸� �����Ѵ�.
				
				iSaeweService.executeBugwa_Register(Bean);
				iSaeweService.SetCal_Sum_Info_taxseq(Bean.getSEQ());	//�����հ��������̺� �ΰ���Ͽ��� 'TAX_SEQ'����
				
				//	��ȭ������ �̵�
			
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return Bugwa_View(request, response);
	}
	
	
	//	�����ڵ�
	public ModelAndView 	SemokInfo(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		try{
					
			BugaWebControl	bugaWebControl	= new BugaWebControl();
			
			String 	TAX_CD	= ServletRequestUtils.getStringParameter(request, "TAX_CD", "");
			String 	SIGU_CD	= ServletRequestUtils.getStringParameter(request, "SIGU_CD", "");
			String 	DEPT_CD	= ServletRequestUtils.getStringParameter(request, "DEPT_CD", "");
			
			String	Xml		= bugaWebControl.getSemokInfo(TAX_CD, SIGU_CD, DEPT_CD, commonCode);
			
	        response.setContentType("text/html;charset=utf-8");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(Xml);
	        
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	null;
	}
	
	//�ΰ����� ����
	//BugwaDelete
	public ModelAndView BugwaDelete(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		
		String 	ADMIN_NO = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	SEQ	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		String 	SECTION	= ServletRequestUtils.getStringParameter(request, "SECTION", "");
		
		String 	semok_cd	= ServletRequestUtils.getStringParameter(request, "semok_cd", "");
		String 	tax_ym	= ServletRequestUtils.getStringParameter(request, "tax_ym", "");
		String 	tax_gubun	= ServletRequestUtils.getStringParameter(request, "tax_gubun", "");
		String 	tax_no	= ServletRequestUtils.getStringParameter(request, "tax_no", "");
		
		try{
			if(userId != null){
				iSaeweService.deleteBugwaDataInfo(ADMIN_NO, SEQ);
				
				
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				String name = userBean.getNAME();
				
				HistoryBean hisBean = new HistoryBean();
				hisBean.setADMIN_NO(ADMIN_NO);
				hisBean.setGUNGE("�ΰ�öȸ");
				hisBean.setSAYU("�����ڵ� : "+semok_cd+" ������� : " + tax_ym + " ������ȣ : " + tax_no);
				hisBean.setWORK_NM(name);
				hisBean.setGU_CODE(ADMIN_NO.substring(6,9));
				
				commonCode.insertHistoryInfo(hisBean);
			}
			
			
				
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("redirect:/jumyong/saewe/bugwa_view.do?ADMIN_NO="+ADMIN_NO+"&SEQ="+SEQ+"&SECTION="+SECTION+"&MSG=�ΰ�öȸ�Ǿ����ϴ�");
	}
}
