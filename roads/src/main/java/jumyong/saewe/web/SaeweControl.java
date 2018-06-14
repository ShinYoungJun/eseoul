//	2009		Kim Yun Seo

package main.java.jumyong.saewe.web;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.sysConnect.service.ISysConnectService;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.minwoninfo.model.PlaceBean;
import main.java.jumyong.saewe.model.BugaRegistBean;
import main.java.jumyong.saewe.model.BugwaSearchBean;
import main.java.jumyong.saewe.model.SaeweBean;
import main.java.jumyong.saewe.model.TaxationBean;
import main.java.jumyong.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SaeweControl	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	ISysConnectService	iSysConnectService	= null;
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
	
	public void setSysConnectService(ISysConnectService sysConnectService)
	{
		this.iSysConnectService = sysConnectService;
	}
	
	//	�ΰ� ��ȸ ȭ��
	public ModelAndView 	Search(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		List	list	=	null;
		System.out.println("userId ==> " + userId);
		
		try
		{
			if(userId != null)
			{
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				
				try{
					userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				}
				catch (Exception e)
				{
					String errReason = e.toString();
					System.out.println(errReason);
				}
				
				//	���� �⵵
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				cal.add(Calendar.DATE, -14);
				String	beforeDay		= formatter.format(cal.getTime());
				String gu_cd = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				String  YearVal		= ServletRequestUtils.getStringParameter(request, "YEAR", today.substring(0, 4));
				int totalcnt = 	Integer.parseInt(ServletRequestUtils.getStringParameter(request, "TOTALCNT", "0"));
				
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
				
				bind(request, bugwaSearchBean);
				
				bugwaSearchBean.setSIDO(SIDO_CD);
				bugwaSearchBean.setSIGUNGU(gu_cd);
				
				//2018-05-24 서울시 전체 검색
				String doSearch = ServletRequestUtils.getStringParameter(request, "doSearch", "");
				
				System.out.println("doSearch: " + doSearch);
				
				if(gu_cd.equals("000"))
					bugwaSearchBean.setSIGUNGU("%");
				
				
				
				
				bugwaSearchBean.setYEAR(YearVal);
				bugwaSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
				bugwaSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
			
				request.setAttribute("PURPOSE_CD", bugwaSearchBean.getPURPOSE_CD());
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	�˻��� ������ �Ѱ����� �����´�.
				
				
				int iTotalCnt = 0;
				if(totalcnt == 0){
					iTotalCnt	= iSaeweService.executeCount(bugwaSearchBean);
				}else{
					iTotalCnt = totalcnt;
				}
				
				//	����¡ ó��
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
				
				//	�˻��� �����͸� �����´�.
				list	= iSaeweService.executeSearch(bugwaSearchBean, rowCol, rowCol + 9);
				SaeweBean	bean	= new SaeweBean();
				int			size	= list.size();
				
				for(int i = 0	;	i < size	;	i++)
				{
					bean	= (SaeweBean)list.get(i);
					
					bean.setRN(String.valueOf(rowCol+i));
					
					bean.setTYPE(commonCode.executeSearchCommonCode("use_type", bean.getTYPE()));	//	��������
			
					//Bean.setSECTION(commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));	//	���뱸��
					bean.setSECTION_NAME(commonCode.executeSearchCommonCode("occupancy_type", bean.getSECTION()));	//	���뱸��
				
					// �ۼ�����
					if(bean.getCAL_YN() != null && "1".equals(bean.getCAL_YN()))
		        		bean.setCAL_YN(commonCode.executeSearchCommonCode("calculation_yn", "1"));
		        	else
		        		bean.setCAL_YN(commonCode.executeSearchCommonCode("calculation_yn", "0"));
		        		
		        	//	�ΰ�����
					if(bean.getTAX_YN() != null && "1".equals(bean.getTAX_YN()))
						bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", bean.getTAX_YN()));
		        	else
		        		bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", "0"));
		        	
					
					
					// �ΰ� �Ⱓ
					if(bean.getTAX_DATE() == null || bean.getTAX_DATE() == ""){
				 		bean.setTAX_DATE("-");
					}
					else{
						bean.setTAX_DATE(util.Date_Paste(bean.getTAX_DATE()));
					}
					
					if(bean.getSUNAP_DATE() == null || bean.getSUNAP_DATE() == ""){
				 		bean.setSUNAP_DATE("-");
					}
					else{
						bean.setSUNAP_DATE(util.Date_Paste(bean.getSUNAP_DATE()));
					}
				 	
				 	if(bean.getBONSE() == null || bean.getBONSE() == "")
				 		bean.setBONSE("-");
				 	
				 	if(bean.getVAT() == null || bean.getVAT() == "")
				 		bean.setVAT("-");
				 	
				 	
				 	if(bean.getTAXCODE_NM() == null || bean.getTAXCODE_NM() == "")
				 		bean.setTAXCODE_NM("-");
		        	
				 	// [2013.05.02 yjmoon] api�� ����.��ϱⰣ
		        	bean.setBASE_UPDATED(util.Date_Paste(bean.getBASE_UPDATED()));
		        	
		        	if(bean.getMUL_FROMDATE() != null)	//	����Ⱓ
		        		bean.setJUMGIGAN(util.Date_Paste(bean.getMUL_FROMDATE()) + " ~ " + util.Date_Paste(bean.getMUL_TODATE()));
		
		        	if(bean.getSECTION() != null)
		        		if(bean.getSECTION().equals("�Ͻ�"))
		        	        bean.setJUMGIGAN(bean.getPARTLY_PERIOD());
				}
				
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", bugwaSearchBean.getTYPE(), "��ü"));						//	��������
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", bugwaSearchBean.getSECTION(), "��ü"));		//	���뱸��
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", bugwaSearchBean.getOWNER_SET(), "��ü"));		//	������
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", bugwaSearchBean.getTAX_SET(), "��ü"));	//	���Ա���
				request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getBJ_CD()));	//	������
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getHJ_CD()));	//	������
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", bugwaSearchBean.getTAX_YN(), "��ü"));				//	�ΰ�����
				request.setAttribute("cal_yn", commonCode.executeCommonCode("calculation_yn", bugwaSearchBean.getCAL_YN(), "��ü"));					//	�ۼ�����	
		 
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("YearVal", YearVal);
				request.setAttribute("TYPE", bugwaSearchBean.getTYPE());
				
				if(bugwaSearchBean.getBONBUN().equals("%")){
					bugwaSearchBean.setBONBUN("");
				}
				if(bugwaSearchBean.getBUBUN().equals("%")){
					bugwaSearchBean.setBUBUN("");
				}
				
				
				request.setAttribute("BONBUN", bugwaSearchBean.getBONBUN());
				request.setAttribute("BUBUN", bugwaSearchBean.getBUBUN());
				request.setAttribute("NAME", bugwaSearchBean.getNAME());
				request.setAttribute("ADMINNO", bugwaSearchBean.getADMINNO());
				request.setAttribute("REFUND_YN", bugwaSearchBean.getREFUND_YN());
				request.setAttribute("CAL_YN", bugwaSearchBean.getCAL_YN());
				request.setAttribute("currentPage", String.valueOf(currentPage));
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("message", message);
				
				request.setAttribute("bugwa_id", util.nullTo(iSaeweService.executeBugwa_Id(userId),""));
			}
		} 
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return new ModelAndView("/jumyong/saewe/search", "blist", list);
	}
	
	//	�ΰ� ��ȸ ȭ��(excel)
	public ModelAndView 	Excel_Search(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		List	list	=	null;
		System.out.println("userId ==> " + userId);
		
		try
		{
			if(userId != null)
			{
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				
				try{
					userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				}
				catch (Exception e)
				{
					String errReason = e.toString();
					System.out.println(errReason);
				}
				
				//	���� �⵵
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				cal.add(Calendar.DATE, -14);
				String	beforeDay		= formatter.format(cal.getTime());
				String gu_cd = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				String  YearVal		= ServletRequestUtils.getStringParameter(request, "YEAR", today.substring(0, 4));
				int totalcnt = 	Integer.parseInt(ServletRequestUtils.getStringParameter(request, "TOTALCNT", "0"));
				System.out.println("@TOTAL@@TOTAL@@TOTAL@ : " + totalcnt);
				
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
				
				bind(request, bugwaSearchBean);
				
				bugwaSearchBean.setSIDO(SIDO_CD);
				bugwaSearchBean.setSIGUNGU(gu_cd);
				
				//2018-05-24 서울시 전체 검색
				if(gu_cd.equals("000"))
					bugwaSearchBean.setSIGUNGU("%");
				
				bugwaSearchBean.setYEAR(YearVal);
				bugwaSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
				bugwaSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
			
				request.setAttribute("PURPOSE_CD", bugwaSearchBean.getPURPOSE_CD());
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	�˻��� ������ �Ѱ����� �����´�.
				
				
				int iTotalCnt = 0;
				if(totalcnt == 0){
					iTotalCnt	= iSaeweService.executeCount(bugwaSearchBean);
				}else{
					iTotalCnt = totalcnt;
				}
				
				//	����¡ ó��
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
				
				//	�˻��� �����͸� �����´�.
				list	= iSaeweService.executeSearch(bugwaSearchBean, 1, iTotalCnt);
				SaeweBean	Bean	= new SaeweBean();
				int			size	= list.size();
				
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (SaeweBean)list.get(i);
					
					Bean.setRN(String.valueOf(rowCol+i));
					
					Bean.setTYPE(commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));	//	��������
			
					
					// 2013.04.01 yjmoon �ֹ�/���� ��ȣ �ʵ� �߰�.
					if (Bean.getSSN().length() == 13) {
						Bean.setSSN(String.format("%s-%s", Bean.getSSN().substring(0, 6), Bean.getSSN().substring(6, 13)));						
					} else {
						Bean.setSSN("-");
					}
					//Bean.setSECTION(commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));	//	���뱸��
					Bean.setSECTION_NAME(commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));	//	���뱸��
				
					// �ۼ�����
					if(Bean.getCAL_YN() != null && "1".equals(Bean.getCAL_YN()))
		        		Bean.setCAL_YN(commonCode.executeSearchCommonCode("calculation_yn", "1"));
		        	else
		        		Bean.setCAL_YN(commonCode.executeSearchCommonCode("calculation_yn", "0"));
		        		
		        	//	�ΰ�����
					if(Bean.getTAX_YN() != null && "1".equals(Bean.getTAX_YN()))
						Bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", Bean.getTAX_YN()));
		        	else
		        		Bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", "0"));
		        	
					
					
					// �ΰ� �Ⱓ
					if(Bean.getTAX_DATE() == null || Bean.getTAX_DATE() == ""){
				 		Bean.setTAX_DATE("-");

					}					
					else{
						//********** BEGIN_����_20120321
						// ��½� yyyymmdd �������� ��ȯ
						//Bean.setTAX_DATE(util.Date_Paste(Bean.getTAX_DATE()));
						//********** END_����_20120321
						Bean.setTAX_DATE_DD(Bean.getTAX_DATE().substring(6,8));						
					}
					
					
					
					if(Bean.getSUNAP_DATE() == null || Bean.getSUNAP_DATE() == ""){
				 		Bean.setSUNAP_DATE("-");
					}
					else{
						Bean.setSUNAP_DATE(util.Date_Paste(Bean.getSUNAP_DATE()));
					}
				 	
				 	if(Bean.getBONSE() == null || Bean.getBONSE() == "")
				 		Bean.setBONSE("-");
				 	
				 	if(Bean.getVAT() == null || Bean.getVAT() == "")
				 		Bean.setVAT("-");
				 	
				 	
				 	if(Bean.getTAXCODE_NM() == null || Bean.getTAXCODE_NM() == "")
				 		Bean.setTAXCODE_NM("-");
		        	
		           	//	[2013.05.02 yjmoon] api�� ����. ��ϱⰣ
		        	Bean.setBASE_UPDATED(util.Date_Paste(Bean.getBASE_UPDATED()));
		        	
		        	if(Bean.getMUL_FROMDATE() != null)	//	����Ⱓ
		        		Bean.setJUMGIGAN(util.Date_Paste(Bean.getMUL_FROMDATE()) + " ~ " + util.Date_Paste(Bean.getMUL_TODATE()));
		
		        	if(Bean.getSECTION() != null)
		        		if(Bean.getSECTION().equals("�Ͻ�"))
		        	        Bean.setJUMGIGAN(Bean.getPARTLY_PERIOD());
				}
				
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", bugwaSearchBean.getTYPE(), "��ü"));						//	��������
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", bugwaSearchBean.getSECTION(), "��ü"));		//	���뱸��
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", bugwaSearchBean.getOWNER_SET(), "��ü"));		//	������
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", bugwaSearchBean.getTAX_SET(), "��ü"));	//	���Ա���
				request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getBJ_CD()));	//	������
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getHJ_CD()));	//	������
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", bugwaSearchBean.getTAX_YN(), "��ü"));				//	�ΰ�����
				request.setAttribute("cal_yn", commonCode.executeCommonCode("calculation_yn", bugwaSearchBean.getCAL_YN(), "��ü"));					//	�ۼ�����	
		 
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("YearVal", YearVal);
				request.setAttribute("TYPE", bugwaSearchBean.getTYPE());
				
				if(bugwaSearchBean.getBONBUN().equals("%")){
					bugwaSearchBean.setBONBUN("");
				}
				if(bugwaSearchBean.getBUBUN().equals("%")){
					bugwaSearchBean.setBUBUN("");
				}
				
				
				request.setAttribute("BONBUN", bugwaSearchBean.getBONBUN());
				request.setAttribute("BUBUN", bugwaSearchBean.getBUBUN());
				request.setAttribute("NAME", bugwaSearchBean.getNAME());
				request.setAttribute("ADMINNO", bugwaSearchBean.getADMINNO());
				request.setAttribute("REFUND_YN", bugwaSearchBean.getREFUND_YN());
				request.setAttribute("CAL_YN", bugwaSearchBean.getCAL_YN());
				request.setAttribute("currentPage", String.valueOf(currentPage));
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("message", message);
				
				request.setAttribute("bugwa_id", util.nullTo(iSaeweService.executeBugwa_Id(userId),""));
			}
		} 
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/jumyong/saewe/excel_search", "blist", list);
	}	
	
	//	�˻� ������ �Ҹ��� �����ϱ� ����  �����͸� ������ �ִ´�.
	public ModelAndView 	View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");				
		
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	SEQ 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
		String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
		String 	currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", "1");
		String 	SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
		// sungh83 �˻����� ���� �Ҹ���� ������ ���Ա��� ����⵵//
		String TAX_SET = ServletRequestUtils.getStringParameter(request, "TAX_SET", ""); 	  // ���Ա���
		String YEAR = ServletRequestUtils.getStringParameter(request, "YEAR", "");			  // ����⵵
		// sungh83 �˻����� ���� �Ҹ���� ������ ���Ա��� ����⵵//
		try{
			if(userId != null){
				
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
				
				bind(request, bugwaSearchBean);
				
				System.out.println("**************jumyong.saewe.juminview***********");
				
				request.setAttribute("TYPE", bugwaSearchBean.getTYPE());			//	��������
				request.setAttribute("SECTION", bugwaSearchBean.getSECTION());		//	���뱸��
				request.setAttribute("OWNER_SET", bugwaSearchBean.getOWNER_SET());	//	������
				request.setAttribute("TAX_SET", bugwaSearchBean.getTAX_SET());		//	���Ա���	
				request.setAttribute("BJ_CD", bugwaSearchBean.getBJ_CD());			//	������
				request.setAttribute("HJ_CD", bugwaSearchBean.getHJ_CD());			//	������
				request.setAttribute("TAX_YN", bugwaSearchBean.getTAX_YN());		//	�ΰ�����
		
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("PURPOSE_CD", bugwaSearchBean.getPURPOSE_CD());
				request.setAttribute("BONBUN", bugwaSearchBean.getBONBUN());
				request.setAttribute("BUBUN", bugwaSearchBean.getBUBUN());
				request.setAttribute("NAME", bugwaSearchBean.getNAME());
				request.setAttribute("ADMINNO", bugwaSearchBean.getADMINNO());
				request.setAttribute("SEQ", bugwaSearchBean.getSEQ());
				
				request.setAttribute("currentPage", String.valueOf(currentPage));
				request.setAttribute("SECTION", SECTION);
				// sungh83 ���� �Ҹ���� ������ ���Ա��� ����⵵ //
				request.setAttribute("TAX_SET", bugwaSearchBean.getTAX_SET());	 // 	���Ա���
				request.setAttribute("YEAR", bugwaSearchBean.getYEAR()); 		 // 	����⵵
				// sungh83 ���� �Ҹ���� ������ ���Ա��� ����⵵ //
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/saewe/view", "ADMIN_NO", ADMIN_NO);
	}

	
	//	���ܼ��Ժΰ�
	public ModelAndView 	Saewesuipbugwa(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		try{
			
			System.out.println("!! ���ܼ��Ժΰ� ");
			BugaWebControl	bugaWebControl	= new BugaWebControl();
			
			String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			String 	SEQ			= ServletRequestUtils.getStringParameter(request, "SEQ", "");
			
			System.out.println("!! Saewesuipbugwa " + ADMIN_NO + ", " + SEQ);
			
			//	�����͸� �����´�.
			List	list 	= iSaeweService.executeBugwa_View(ADMIN_NO, SEQ);
			
			String	message	= "";
			String	TAX_YN	= "";
			String  admin_no = "";
			String  result = "";	
			
			TaxationBean	Bean			= new TaxationBean();
			TaxationBean	userInfoBean	= new TaxationBean();
			BugaRegistBean	bugaRegistBean	= new BugaRegistBean();
	
			if(list.size()	>	0)
			{
				Bean	= (TaxationBean)list.get(0);
				
				if(Bean.getTAX_YN() == null){
					Bean.setTAX_YN("0");//String.valueOf(list.get(0));
				}
				
				if(!Bean.getTAX_YN().trim().equals("1"))	//	�ΰ��� �� ��������..
				{
					String user_id = util.getSessionID(request, "sessionUserId");	
					String bugwa_id = iSaeweService.executeBugwa_Id(user_id);

					userInfoBean	= bugaWebControl.getUserInfo(bugwa_id);				//�����������ȸ
					
					if(userInfoBean != null)
					{
						if(Bean.getDEPT_CD().equals(userInfoBean.getDEPT_CD()) && Bean.getSIGU_CD().equals(userInfoBean.getSIGU_CD()))
						{
							String ret;
							if(Long.parseLong(Bean.getSUM_ADJUST()) < 1000 && !Bean.getTYPE_NM().equals("����")){
								ret = "��õ����";
							}else if(Long.parseLong(Bean.getSUM_ADJUST()) < 5000 && Bean.getTYPE_NM().equals("����") && Bean.getREDUCTION_RATE().equals("0")){
								ret = "���ν���";
							}else{
								ret = "���";
							}
								if(ret.equals("���")){						
									bugaRegistBean	= bugaWebControl.insertBugaRegist(Bean, request, bugwa_id, commonCode);
									if(bugaRegistBean != null && bugaRegistBean.getErrorMsg()== null)	//	�ΰ� ����
									{
											if(bugaRegistBean.getInsertKey().equals("") || bugaRegistBean.getInsertKey() == null)
											{
												message = "������ȣ������ �����Ͽ����ϴ�.";
											}
											else
											{
												iSaeweService.SaeweSuipBugwa_Taxation_Info(ADMIN_NO, SEQ, bugaRegistBean.getInsertKey());
												result = "1";
												message	= "�ΰ� �Ǿ����ϴ�.";	//	�ΰ�����
											}
									}
									else
									{
										message	= "�ΰ���Ͽ� �����Ͽ����ϴ�";
										message += "\n"+bugaRegistBean.getErrorMsg();
										result = "0";
									}
									iSysConnectService.Sys_Connect_Info(ADMIN_NO,"2",user_id, "1",result);	//�����̷µ��
								
								}else{
									if(ret.equals("��õ����")){
										message = "��õ/���Ŵ�  ����ᰡ 2õ�� �̸��� ��쿡�� �ΰ����� �ʽ��ϴ�.";
									}else{
										message = "��42���� ���� ����Ḧ ������, ����ᰡ 5õ�� �̸��� ��쿡�� �ΰ����� �ʽ��ϴ�.";
									}
								}
						}
						else
							message = "�ñ��ڵ�/�μ��ڵ� ����ġ";  // �ñ��ڵ�,�μ��ڵ� ����ġ
					}
					else
						message = "�����������ȸ����";   //�����������ȸ ����
				}
				else
					message	= "�ΰ��� �����Դϴ�.";	//	�ΰ��Ǿ�����
			}
			else
				message	= "�ΰ������� ������ �����ϴ�.";	//	������ ����
			
			response.setCharacterEncoding("EUC-KR");
			response.getWriter().write(message);
			//request.setAttribute("SAEWESUIPBUGWA", message);
			
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		
		return null;
	}
	
	//	���ܼ��Ժΰ�_�ϰ�
	public ModelAndView 	Saewesuipbugwa_Ilgwal(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String	message	= "0";
		
		try
		{
			System.out.println("!! ���ܼ��Ժΰ� _�ϰ�");
			
			//	���ǿ��� �õ� �ڵ带 �����´�.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
			String user_id = util.getSessionID(request, "sessionUserId");	
			
			//	������ �����͸� �����´�.
			UserBean	userBean	= new UserBean();
			
			try{
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			}
			catch (Exception e){
				String errReason = e.toString();
				System.out.println(errReason);
			}
			
			//	���� �⵵
			SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
			Calendar 			cal 		= Calendar.getInstance();
			String	today		= formatter.format(cal.getTime());
			cal.add(Calendar.DATE, -6);
			String	beforeDay		= formatter.format(cal.getTime());
			
			String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
			String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
			
			BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
			
			bind(request, bugwaSearchBean);
			
			bugwaSearchBean.setSIDO(SIDO_CD);
			bugwaSearchBean.setSIGUNGU(userBean.getSIGU_CD());
			
			bugwaSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
			bugwaSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
			
			System.out.println("LIST �� �������� �� ...");
			//	�˻��� �����͸� �����´�.
			List		list	= iSaeweService.executeSearch_Ilgwal(bugwaSearchBean);
			System.out.println("LIST �� ������ ��...");
			String  admin_no = "";
			String  result = "";	
			String  seq = "";
			int  reqCount = 0;
			int  failCount = 0;
			
			TaxationBean	Bean			= new TaxationBean();
			BugaRegistBean	bugaRegistBean	= new BugaRegistBean();	
			BugaWebControl	bugaWebControl	= new BugaWebControl();
			
			if(list.size()	>	0)
			{
				String bugwa_id = "";
				System.out.println("for�� ����~!!!!!!!!!!!!!!!!!!!!!!!!!!");
				for(int i=0; i < list.size(); i++)
				{
					System.out.println("########## list.size() == > " + list.size());
					
					Bean	= (TaxationBean)list.get(i);
					admin_no = Bean.getADMIN_NO();
					seq = Bean.getSEQ();
					//	String user_id = "1111111400049";
					bugwa_id = iSaeweService.executeBugwa_Id(user_id);
	//				System.out.println("user_id ==> " + user_id);
	//				System.out.println("bugwa_id ==> " + bugwa_id);
					
						bugaRegistBean	= bugaWebControl.insertBugaRegist(Bean, request, bugwa_id, commonCode);
					
						if(bugaRegistBean != null && bugaRegistBean.getErrorMsg()== null)	//	�ΰ� ����
						{	
							if(bugaRegistBean.getInsertKey().equals("") || bugaRegistBean.getInsertKey() == null)
							{
								message = "������ȣ������ �����Ͽ����ϴ�.";
							}
							else
							{
		//						System.out.println("admin_no="+admin_no+"::seq="+seq+"::InsertKey="+ bugaRegistBean.getInsertKey());
								iSaeweService.SaeweSuipBugwa_Taxation_Info(admin_no, seq, bugaRegistBean.getInsertKey());
								//iSaeweService.SaeweSuipBugwa_Admin_Base(admin_no, seq);
								result = "1";
								message	= "�ΰ� �Ǿ����ϴ�.";	//	�ΰ�����
								reqCount++;
							}
						}
						else
						{	
							message	= "�ΰ���Ͽ� �����Ͽ����ϴ�";
							message += "\n"+bugaRegistBean.getErrorMsg();
							result = "0";
							failCount++;
						}
					System.out.println("########## �ΰ����� ���� == > " + i);
					iSysConnectService.Sys_Connect_Info(admin_no,"2",user_id, "1",result);	//�����̷µ��
				}
				System.out.println("for�� ����~!!!!!!!!!!!!!!!!!!!!!!!!!!");
				if(reqCount != 0 && list.size() != reqCount)
					message = "�ΰ������ �����Ѱ��� �ֽ��ϴ�.";
			}
			else
				message	= "�ΰ������� ������ �����ϴ�.";	//	������ ����
			
			if(reqCount > 0 || failCount > 0)
				message += "\n����:"+ reqCount + "��  " +"����:"+failCount+ "��";
			
		}
		catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		
		return Search( request, response, message);
	}

	// ����� �ϰ��ΰ�
	public ModelAndView 	Saewesuipbugwa_Ilgwal_junggi(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String	message	= "0";
		String param = "";
		
		try
		{
			System.out.println("!! ����� ���ܼ��Ժΰ� _�ϰ�");
			
			//	���ǿ��� �õ� �ڵ带 �����´�.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
			String user_id = util.getSessionID(request, "sessionUserId");	
			
			//	������ �����͸� �����´�.
			UserBean	userBean	= new UserBean();
			
			try{
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			}
			catch (Exception e){
				String errReason = e.toString();
				System.out.println(errReason);
			}
			
			//	���� �⵵
			SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
			Calendar 			cal 		= Calendar.getInstance();
			String	today		= formatter.format(cal.getTime());
			cal.add(Calendar.DATE, -6);
			String	beforeDay		= formatter.format(cal.getTime());
			String thisYear = today.substring(0,4);
			
			String sigu_cd = userBean.getSIGU_CD();			 
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			String year = ServletRequestUtils.getStringParameter(request,"YEAR", "");
			String type = ServletRequestUtils.getStringParameter(request,"TYPE","");
			String tax_set = ServletRequestUtils.getStringParameter(request,"TAX_SET","");
			String tax_yn = ServletRequestUtils.getStringParameter(request,"TAX_YN","");
			String mul_fromdate = ServletRequestUtils.getStringParameter(request,"mul_fromdate",thisYear+"-01-01");
			String mul_todate = ServletRequestUtils.getStringParameter(request,"mul_todate",thisYear+"-12-31");
			String purpose = ServletRequestUtils.getStringParameter(request,"PURPOSE_CD","");
			String bj_cd = ServletRequestUtils.getStringParameter(request,"BJ_CD", "");
			String hj_cd = ServletRequestUtils.getStringParameter(request,"HJ_CD", "");
			String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
			String cal_status = ServletRequestUtils.getStringParameter(request,"cal_status","");
			String SECTION = ServletRequestUtils.getStringParameter(request,"SECTION","");
			String search = ServletRequestUtils.getStringParameter(request,"search","0");
			
			// ��¥ �˻� ������ '-' ���� 
			if(mul_fromdate != null && !"".equals(mul_fromdate) ) {
				mul_fromdate = util.Date_Cut(mul_fromdate);
			}
			if(mul_todate != null && !"".equals(mul_todate) ) {
				mul_todate = util.Date_Cut(mul_todate);
			}
			request.setAttribute("use_type", commonCode.executeCommonCode("use_type", type, "��ü"));		
			request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", tax_set, "��ü"));
			request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", tax_yn, "��ü"));
			request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bj_cd));	//	������
			request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), hj_cd));	//	������
			request.setAttribute("cal_status", commonCode.executeCommonCode("cal_status", cal_status, "��ü"));
			request.setAttribute("tax_yn", tax_yn);
			request.setAttribute("currentPage", strCurrentPage);
			request.setAttribute("year", year);
			request.setAttribute("mul_fromdate", util.Date_Paste(mul_fromdate));
			request.setAttribute("mul_todate", util.Date_Paste(mul_todate));
			request.setAttribute("TYPE", type);
			request.setAttribute("PURPOSE_CD", purpose);
			request.setAttribute("jumyongName", jumyongName);
			request.setAttribute("SECTION", SECTION);
			request.setAttribute("search", search);
			
			param = "currentPage="+strCurrentPage+"&year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+util.Date_Paste(mul_fromdate)+"&mul_todate="+util.Date_Paste(mul_todate)
					+"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status+"&SECTION="+SECTION+"&search="+search;
			
			System.out.println("LIST �� �������� �� ...");
			//	�˻��� �����͸� �����´�.
			List list = iSaeweService.executeSearch_Ilgwal_junggi(sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, hj_cd, jumyongName, cal_status, SECTION);
			System.out.println("LIST �� ������ ��...");
			
			String  admin_no = "";
			String  result = "";	
			String  seq = "";
			int  reqCount = 0;
			int  failCount = 0;


			TaxationBean	Bean			= new TaxationBean();
			BugaRegistBean	bugaRegistBean	= new BugaRegistBean();	
			BugaWebControl	bugaWebControl	= new BugaWebControl();
			
			System.out.println("########## list.size() == > " + list.size());
			if(list.size()	>	0)
			{
				String bugwa_id = "";
				
				System.out.println("for�� ����~!!!!!!!!!!!!!!!!!!!!!!!!!!");
				for(int i=0; i < list.size(); i++)
				{
					
					Bean	= (TaxationBean)list.get(i);
									
					
					admin_no = Bean.getADMIN_NO();
					seq = Bean.getSEQ();
					//	String user_id = "1111111400049";
					bugwa_id = iSaeweService.executeBugwa_Id(user_id);
					System.out.println("user_id ==> " + user_id);
					System.out.println("bugwa_id ==> " + bugwa_id);
					
					
					String ret;
					if(Long.parseLong(Bean.getSUM_ADJUST()) < 1000 && !Bean.getTYPE_NM().equals("����")){
						ret = "��õ����";
					}else if(Long.parseLong(Bean.getSUM_ADJUST()) < 5000 && Bean.getTYPE_NM().equals("����") && Bean.getREDUCTION_RATE().equals("0")){
						ret = "���ν���";
					}else{
						ret = "���";
					}
						if(ret.equals("���")){
						
							bugaRegistBean	= bugaWebControl.insertBugaRegist(Bean, request, bugwa_id, commonCode);
							
							if(bugaRegistBean != null && bugaRegistBean.getErrorMsg()== null)	//	�ΰ� ����
							{	
								if(bugaRegistBean.getInsertKey().equals("") || bugaRegistBean.getInsertKey() == null)
								{
									message = "������ȣ������ �����Ͽ����ϴ�.";
								}
								else
								{
									//System.out.println("admin_no="+admin_no+"::seq="+seq+"::InsertKey="+ bugaRegistBean.getInsertKey());
									iSaeweService.SaeweSuipBugwa_Taxation_Info(admin_no, seq, bugaRegistBean.getInsertKey());
									result = "1";
									message	= "�ΰ� �Ǿ����ϴ�.";	//	�ΰ�����
									reqCount++;
								}
							}
							else
							{	
								message	= "�ΰ���Ͽ� �����Ͽ����ϴ�.  " + bugaRegistBean.getErrorMsg();
								//message += "\n"+bugaRegistBean.getErrorMsg();
								result = "0";
								failCount++;
							}
							
						}else{
							if(ret.equals("��õ����")){
								message = "��õ/������ ��� ����ᰡ 2õ�� �̸��� ��쿡�� �ΰ����� �ʽ��ϴ�.";
								result = "0";
								failCount++;
							}else{
								message = "��42���� ���� ����Ḧ ������, ����ᰡ 5õ�� �̸��� ��쿡�� �ΰ����� �ʽ��ϴ�.";
								result = "0";
								failCount++;
							}
						}
						

					System.out.println("########## �ΰ���� ���� == > " + i);
					iSysConnectService.Sys_Connect_Info(admin_no,"2",user_id, "1",result);	//�����̷µ��
					

				}
				System.out.println("for�� ����~!!!!!!!!!!!!!!!!!!!!!!!!!!");
				
				if(reqCount != 0 && list.size() != reqCount){
					message = "�ΰ������ �����Ѱ��� �ֽ��ϴ�. (����:"+ reqCount + "��  " +"����:"+failCount+ "��)";
				}else if(reqCount != 0 && list.size() == reqCount){
					message = "�ΰ������ ��� �����Ͽ����ϴ�.(����:"+reqCount+"�� )";
				
				}
					
			}
			else
				message	= "�ΰ������� ������ �����ϴ�.";	//	������ ����
			
			//if(reqCount > 0 || failCount > 0)
				//message += "\n����:"+ reqCount + "��  " +"����:"+failCount+ "��";
				
		}
		catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		System.out.println(" message === " + message);
		return new ModelAndView("redirect:/jumyong/junggi/search.do?"+param+"&message="+message);
	}

}