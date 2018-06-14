
package main.java.facility.saewe.web;

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
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.saewe.model.BugaRegistBean;
import main.java.facility.saewe.model.BugwaSearchBean;
import main.java.facility.saewe.model.SaeweBean;
import main.java.facility.saewe.model.TaxationBean;
import main.java.facility.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SaeweControl	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	ISysConnectService	iSysConnectService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setFacility_saeweService(ISaeweService facility_saeweService) 
	{
		this.iSaeweService = facility_saeweService;
	}
	 
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode = commonCode;
	}
	
	public void setSysConnectService(ISysConnectService sysConnectService)
	{
		this.iSysConnectService = sysConnectService;
	}
	
	//	�ΰ� ��ȸ ȭ��
	public ModelAndView 	Search(HttpServletRequest request,HttpServletResponse response,  String message) throws Exception 
	{	
		HttpSession session 	= request.getSession();
		String 		userId		= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
				
		try{
			if(userId != null){
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				
				try{
					userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				}
				catch (Exception e){
					
					String errReason = e.toString();
					System.out.println(errReason);
				}
				
				// ���� �⵵
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				cal.add(Calendar.DATE, -6);
				String	beforeDay		= formatter.format(cal.getTime());
				
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();		
				bind(request, bugwaSearchBean);
				
				bugwaSearchBean.setSIGUNGU(userBean.getSIGU_CD());
				bugwaSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
				bugwaSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	�˻��� ������ �Ѱ����� �����´�.
				int	iTotalCnt	= iSaeweService.executeCount(bugwaSearchBean);
				
				//	����¡ ó��
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
				
				//	�˻��� �����͸� �����´�.
				list	= iSaeweService.executeSearch(bugwaSearchBean, rowCol, rowCol + 9);
				SaeweBean	Bean	= new SaeweBean();
				int			size	= list.size();
			
				
				
				
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (SaeweBean)list.get(i);
		
					Bean.setTYPE(commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));	//	��������
		//			Bean.setUSE_SECTION(commonCode.executeSearchCommonCode("taxation_part", Bean.getUSE_SECTION()));//	��������
		
				//	System.out.println(Bean.getCAL_CNT() + " : " + Bean.getTAX_CNT() + " : " + Bean.getTAX_YN_CNT());
		        	
					// �ۼ�����
					if(Bean.getCAL_YN().equals("1"))
		        		Bean.setCAL_YN(commonCode.executeSearchCommonCode("calculation_yn", "1"));
		        	else
		        		Bean.setCAL_YN(commonCode.executeSearchCommonCode("calculation_yn", "0"));
		        		
		        	//	�ΰ�����
		        	Bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", Bean.getTAX_YN()));
		        	Bean.setSUM(util.Comma_Paste((Bean.getSUM())));	
		        	
		        	// ���Ա���
		        	Bean.setTAX_SET_NM(commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET().trim()));
		        	
		        	
		        
		      
		        	//	��ϱⰣ
		        	Bean.setREQ_DATE(util.Date_Paste(Bean.getREQ_DATE()));
		        	
		        
				}
		
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", bugwaSearchBean.getTYPE(), "��ü"));						//	��������
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("taxation_part", bugwaSearchBean.getSECTION(), "��ü"));			//	��������
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", bugwaSearchBean.getTAX_SET(), "��ü"));	//	���Ա���	
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", bugwaSearchBean.getTAX_YN(), "��ü"));				//	�ΰ�����
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("NAME", bugwaSearchBean.getNAME());
				request.setAttribute("currentPage", String.valueOf(currentPage));
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("message", message);
				
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/saewe/search", "blist", list);
	}
	
	//	�ΰ� ��ȸ ȭ��(Excel)
	public ModelAndView 	Excel_Search(HttpServletRequest request,HttpServletResponse response,  String message) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		
		try{
			if(userId != null){
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
				
				// ���� �⵵
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				cal.add(Calendar.DATE, -6);
				String	beforeDay		= formatter.format(cal.getTime());
				
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();		
				bind(request, bugwaSearchBean);
				
				bugwaSearchBean.setSIGUNGU(userBean.getSIGU_CD());
				bugwaSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
				bugwaSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	�˻��� ������ �Ѱ����� �����´�.
				int	iTotalCnt	= iSaeweService.executeCount(bugwaSearchBean);
				
				//	����¡ ó��
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
				
				//	�˻��� �����͸� �����´�.
				list	= iSaeweService.executeSearch(bugwaSearchBean, 1, iTotalCnt);
				SaeweBean	Bean	= new SaeweBean();
				int			size	= list.size();
			
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (SaeweBean)list.get(i);
		
					Bean.setTYPE(commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));	//	��������
					Bean.setUSE_SECTION(commonCode.executeSearchCommonCode("taxation_part", Bean.getUSE_SECTION()));//	��������
			
					// �ۼ�����
					if(Bean.getCAL_YN().equals("1"))
		        		Bean.setCAL_YN(commonCode.executeSearchCommonCode("calculation_yn", "1"));
		        	else
		        		Bean.setCAL_YN(commonCode.executeSearchCommonCode("calculation_yn", "0"));
		        		
		        	//	�ΰ�����
		        	Bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", Bean.getTAX_YN()));
		        	Bean.setSUM(util.Comma_Paste((Bean.getSUM())));	
		        	
		        	// ���Ա���
		        	Bean.setTAX_SET(commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
		        	
		        	//	��ϱⰣ
		        	Bean.setREQ_DATE(util.Date_Paste(Bean.getREQ_DATE()));
				}
		
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", bugwaSearchBean.getTYPE(), "��ü"));						//	��������
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("taxation_part", bugwaSearchBean.getSECTION(), "��ü"));			//	��������
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", bugwaSearchBean.getTAX_SET(), "��ü"));	//	���Ա���	
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", bugwaSearchBean.getTAX_YN(), "��ü"));				//	�ΰ�����
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("NAME", bugwaSearchBean.getNAME());
				request.setAttribute("currentPage", String.valueOf(currentPage));
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("message", message);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
	
		return new ModelAndView("/facility/saewe/excel_search", "blist", list);
	}	
	
	//	�˻� ������ �Ҹ��� �����ϱ� ����  �����͸� ������ �ִ´�.
	public ModelAndView 	View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 	GU_CODE 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 	CORP_CD 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");		
		String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
		String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
		String 	currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", "1");
		String ADMIN_NO =  ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String TAX_SET    =  ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
		
		BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
		bind(request, bugwaSearchBean);
		
		request.setAttribute("NAME", bugwaSearchBean.getNAME());		
		request.setAttribute("GU_CODE", GU_CODE);
		request.setAttribute("CORP_CD", CORP_CD);
		
		request.setAttribute("SEQ",SEQ);
		request.setAttribute("SECTION", bugwaSearchBean.getSECTION());		//	���뱸��
		//request.setAttribute("TAX_SET", bugwaSearchBean.getTAX_SET());		//	���Ա���
		request.setAttribute("TAX_SET", TAX_SET);		//	���Ա���
		request.setAttribute("TAX_YN", bugwaSearchBean.getTAX_YN());		//	�ΰ�����
		request.setAttribute("GIGAN1", GIGAN1);
		request.setAttribute("GIGAN2", GIGAN2);
		request.setAttribute("currentPage", String.valueOf(currentPage));
		request.setAttribute("ADMIN_NO", ADMIN_NO);
		
		return new ModelAndView("/facility/saewe/view");
	}

	
	//	���ܼ��Ժΰ�
	public ModelAndView 	Saewesuipbugwa(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		System.out.println("!! ���ܼ��Ժΰ� ");
		
		BugaWebControl	bugaWebControl	= new BugaWebControl();
		
		String 	guCode 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 	corpCd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		String 	adminNo 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String  seq 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");

		System.out.println("---------------------------�ΰ��׽�Ʈ-----------------------------");
		//System.out.println("List Paramater ==> " + guCode +" || "+ corpCd +" || "+ requestNo +" || "+ seq);
		//	�����͸� �����´�.
		List	list 	= iSaeweService.executeBugwa_View(guCode, corpCd, adminNo, seq);
		
		String	message	= "";
		String	TAX_YN	= "";
		String  result = "";	
		
		
		TaxationBean	Bean			= new TaxationBean();
		TaxationBean	Bean2			= new TaxationBean();
		TaxationBean	Bean3			= new TaxationBean();
		TaxationBean	userInfoBean	= new TaxationBean();
		BugaRegistBean	bugaRegistBean	= new BugaRegistBean();
		TaxationBean Bean4 = new TaxationBean();
		
		
		Bean4 = iSaeweService.executeMinObjBunji(adminNo);
		
		
		if(seq != null && !seq.equals("")) seq  = seq.trim();
		
		if(list.size()	>=	0)
		{
			
			Bean	= (TaxationBean)list.get(0);
			List list_p = iSaeweService.executePurpose(corpCd,guCode,adminNo,Bean.getTAX_SET().trim());
			
			
			Bean2 = (TaxationBean)list_p.get(0);
			Bean.setPURPOSE_NM(Bean2.getPURPOSE_NM());
			List list_q= iSaeweService.executeGetSumQuantity(seq);
			
			Bean3 = (TaxationBean)list_q.get(0);
			Bean.setAREA(Bean3.getAREA());
			Bean.setSIDO("11");
			TAX_YN	= Bean.getTAX_YN();//String.valueOf(list.get(0));
			
			Bean.setADMIN_NO(adminNo);
			
			
			/*System.out.println("tax_yn : "+TAX_YN);
			System.out.println("ADMIN_NO :" + admin_no);
			System.out.println("Bean.getADD_SET() : "+Bean.getADD_SET());
			System.out.println("Bean.getADD_YN() : "+Bean.getADD_YN());
			System.out.println("Bean.getADDR1()"+Bean.getADDR1());
			System.out.println("Bean.getADDR2()"+Bean.getADDR2());
			System.out.println("Bean.getADMIN_NO()"+Bean.getADMIN_NO());
			System.out.println("Bean.getAREA()"+Bean.getAREA());
			System.out.println("Bean.getBAN()"+Bean.getBAN());
			System.out.println("Bean.getBD_DONG()"+Bean.getBD_DONG());
			System.out.println("Bean.getBD_HO()"+Bean.getBD_HO());
			System.out.println("Bean.getBD_NM()"+Bean.getBD_NM());
			System.out.println("Bean.getBJ_CD()"+Bean.getBJ_CD());
			System.out.println("Bean.getBONBUN()"+Bean.getBONBUN());
			System.out.println("Bean.getBONSE()"+Bean.getBONSE());
			System.out.println("Bean.getBUBUN()"+Bean.getBUBUN());
			System.out.println("Bean.getBUNNAP_NO()"+Bean.getBUNNAP_NO());
			System.out.println("Bean.getCORP_CD()"+Bean.getCORP_CD());
			System.out.println("Bean.getVAT()"+Bean.getVAT());
			System.out.println("Bean.getYEAR()"+Bean.getYEAR());
			System.out.println("Bean.getDeptcd : "+Bean.getDEPT_CD());
			System.out.println("Bean.getSIGU_CD() : "+Bean.getSIGU_CD());*/
			
	
		System.out.println("Bean.getSIGU_CD() : "+Bean.getSIGU_CD());						//�ñ��ڵ�  
        System.out.println("Bean.getTAX_CD() : "+Bean.getTAX_CD());							//�����ڵ�
        System.out.println("Bean.getTAX_YM() : "+Bean.getTAX_YM());							//�������
        System.out.println("getTAX_GUBUN() : "+Bean.getTAX_GUBUN());					//��������
        System.out.println("Bean.getTAX_SET() : "+Bean.getTAX_SET());						//�ü�/����
        System.out.println("Bean.getDEPT_CD() : "+Bean.getDEPT_CD());						//�μ��ڵ�
        System.out.println("Bean.getTAX_NO() : "+Bean.getTAX_NO());							//������ȣ
        System.out.println("Bean.getSIDO() : "+Bean.getSIDO());								//�õ��ڵ�
        System.out.println("Bean.getTAXPAYER_ID() : "+Bean.getTAXPAYER_ID());				//������ID
        System.out.println("Bean.getTAXPAYER_NM() : "+Bean.getTAXPAYER_NM());						//�����ڸ�
        System.out.println("Bean.getTAXPAYER_get() : "+Bean.getTAXPAYER_SET());				//�����ڱ���
        System.out.println("Bean.getSUBUSEO_CD() : "+Bean.getSUBUSEO_CD());					//�����μ��ڵ�
        System.out.println("Bean.getTAX_DATE() : "+Bean.getTAX_DATE());						//��������
		System.out.println("Bean.getINDATE() : "+Bean.getINDATE());							//��������
		System.out.println("Bean.getOVERDATE() : "+Bean.getOVERDATE());						//����������
//		System.out.println("Bean.getNAPBU_YMD(("TAX_DATE"));					//��������
		System.out.println("Bean.getBONSE() : "+Bean.getBONSE());			//�����ݾ�
		System.out.println("Bean.getSISE() : "+Bean.getSISE());								//�ü�
		System.out.println("Bean.getGUSE() : "+Bean.getGUSE());								//����
		System.out.println("Bean.getGUKSE() : "+Bean.getGUKSE());						    //����
		System.out.println("Bean.getGIGUM() : "+Bean.getGIGUM());							//���
		System.out.println("Bean.getHP() : "+Bean.getHP());									//�������޴�����ȣ
		System.out.println("Bean.getTEL() : "+Bean.getTEL());								//��������ȭ��ȣ
//		System.out.println("Bean.getEMAIL(("EMAIL"));							//������EMAIL
		System.out.println("Bean.getPOST() : "+Bean.getPOST());								//�����ڿ����ȣ
		System.out.println("Bean.getADDR1() : "+Bean.getADDR1());							//�����ڿ����ȣ�ּ�
		System.out.println("Bean.getADDR2() : "+Bean.getADDR2());							//�����ڻ��ּ�
		System.out.println("Bean.getROAD_ADD() : "+Bean.getROAD_ADD());						//�����ڵ��θ��ּ�
		System.out.println("Bean.getLIVE() : "+Bean.getLIVE());								//���ֻ���
		System.out.println("Bean.getOBJ_SET() : "+Bean.getOBJ_SET());						//���Ǳ���
		System.out.println("Bean.getBD_NM() : "+Bean.getBD_NM());							//���Ǹ�
		System.out.println("Bean.getSIGUNGU() : "+Bean.getSIGUNGU());						//����OCR�ñ��ڵ�
		System.out.println("Bean.getBJ_CD() : "+Bean.getBJ_CD());							//���ǹ��������ڵ�
		System.out.println("Bean.getSPC_CD() : "+Bean.getSPC_CD());							//����Ư�����ڵ�
		System.out.println("Bean.getBONBUN() : "+Bean.getBONBUN());							//���Ǻ���
		System.out.println("Bean.getBUBUN() : "+Bean.getBUBUN());							//���Ǻι�
		System.out.println("Bean.getTONG() : "+Bean.getTONG());								//������
		System.out.println("Bean.getBAN() : "+Bean.getBAN());								//���ǹ�
//		System.out.println("Bean.getMUL_APT_NM(("BD_NM"));						//���Ǿ���Ʈ��
		System.out.println("Bean.getBD_DONG() : "+Bean.getBD_DONG());						//���ǵ�
		System.out.println("Bean.getBD_HO() : "+Bean.getBD_HO());							//����ȣ
		System.out.println("Bean.getMUL_POST() : "+Bean.getMUL_POST());						//���ǿ����ȣ
		System.out.println("Bean.getNEAR_ADDR1() : "+Bean.getNEAR_ADDR1());					//���ǿ����ȣ�ּ�
		System.out.println("Bean.getNEAR_ADDR2() : "+Bean.getNEAR_ADDR2());					//���ǻ��ּ�
		System.out.println("Bean.getHJ_CD() : "+Bean.getHJ_CD());							//�������ڵ�
		System.out.println("Bean.getFORM_ADJUST() �׸�1 : "+Bean.getFORM_ADJUST());				//�׸�1(���������)
		System.out.println("Bean.getPURPOSE_NM(() �׸�2 : "+Bean.getPURPOSE_NM());					//�׸�2(�������)+
		Bean.setTYPE_NM("����");
		System.out.println("Bean.getTYPE_NM() �׸�3 : "+Bean.getTYPE_NM());						//�׸�3(����)+
		System.out.println("Bean.getUSE_DATE() �׸�4 : "+Bean.getUSE_DATE());//�׸�4(���Ⱓ)
		System.out.println("Bean.getAREA() �׸�5: "+Bean.getAREA());							    //�׸�5(�������)+
		System.out.println("Bean.getADMIN_NO() �׸�6: "+Bean.getADMIN_NO()); // ������ȣ �׸�6
		System.out.println("Bean.getADD_SET() : "+Bean.getADD_SET());                       //����������
		System.out.println("Bean.getRATE() : "+Bean.getRATE());			    //Ư������ 		
		System.out.println("Bean.getRATE_CAUSE() : "+Bean.getRATE_CAUSE());					//Ư�������������
		System.out.println("Bean.getNOTES() : "+Bean.getNOTES());						    //���
		System.out.println("Bean.getOCR_SIGU_CD() : "+Bean.getOCR_SIGU_CD());				//OCR�ñ��ڵ�
		System.out.println("Bean.getOCR_BUSEO_CD() : "+Bean.getOCR_BUSEO_CD());				//OCR�μ��ڵ�
		System.out.println("Bean.getVAT() : "+Bean.getVAT());				//�ΰ�����ü�ݾ�
		System.out.println("Bean.getADD_YN() : "+Bean.getADD_YN());							//����ݸ�������	
		
		System.out.println("Bean.getTAX_CD_GU() : "+Bean.getTAX_CD_GU());
		System.out.println("Bean.getTAX_CD_SE() : "+Bean.getTAX_CD_SE());
		System.out.println("Bean.getLIMIT_SUM() : "+Bean.getLIMIT_SUM());
		System.out.println("Bean.getLIMIT_CNT() : "+Bean.getLIMIT_CNT());
		System.out.println("Bean.getINTAX() : "+Bean.getINTAX());
		System.out.println("Bean.getOVERTAX() : "+Bean.getOVERTAX());
		System.out.println("Bean.getFORM1() : "+Bean.getFORM1());
		System.out.println("Bean.getFORM2() : "+Bean.getFORM2());
		System.out.println("Bean.getGU_CODE() : "+Bean.getGU_CODE());
		System.out.println("Bean.getBUNNAP_NO() : "+Bean.getBUNNAP_NO());
		System.out.println("Bean.getYEAR() : "+Bean.getYEAR());
		System.out.println("Bean.getSUSI_NO() : "+Bean.getSUSI_NO());
		System.out.println("Bean.getTAX_YN() : "+Bean.getTAX_YN());
		System.out.println("Bean.getGU_NM() : "+Bean.getGU_NM());
		System.out.println("Bean4.getBONBUN() : "+Bean4.getBONBUN());
		System.out.println("Bean4.getBUBUN() : "+Bean4.getBUBUN());
		System.out.println("Bean4.getBJ_CD() : "+Bean4.getBJ_CD());
		System.out.println("getTO_LNBR1() : "+Bean.getTO_LNBR1());
		System.out.println("getTO_LNBR2() : "+Bean.getTO_LNBR2());
		System.out.println("TO_SPC_CD() : "+Bean.getTO_SPC_CD());
		
		Bean.setBONBUN(Bean4.getBONBUN());
		Bean.setBUBUN(Bean4.getBUBUN());
		Bean.setBJ_CD(Bean4.getBJ_CD());

			if(Bean.getTAX_YN() == null || !Bean.getTAX_YN().trim().equals("1"))	//	�ΰ��� �� ��������..
			{
				String user_id = util.getSessionID(request, "sessionUserId");	
				String bugwa_id = iSaeweService.executeBugwa_Id(user_id);
				userInfoBean	= bugaWebControl.getUserInfo(bugwa_id);				//�����������ȸ
				System.out.println("user_id ==> " + user_id);
				System.out.println("bugwa_id ==> " + bugwa_id);
				System.out.println("userInfoBean.getDEPT_CD() : "+userInfoBean.getDEPT_CD());
				System.out.println("userInfoBean.getSIGU_CD() : "+userInfoBean.getSIGU_CD());
				
				if(userInfoBean != null)
				{
					System.out.println("########################################################");
					System.out.println("Bean.getDEPT_CD() ==> " + Bean.getDEPT_CD());
					System.out.println("userInfoBean.getDEPT_CD() ==> " + userInfoBean.getDEPT_CD());
					System.out.println("Bean.getSIGU_CD() ==> " + Bean.getSIGU_CD());
					System.out.println("userInfoBean.getSIGU_CD() ==> " + userInfoBean.getSIGU_CD());
					System.out.println("########################################################");
//					if(Bean.getDEPT_CD().equals(userInfoBean.getDEPT_CD()) && Bean.getSIGU_CD().equals(userInfoBean.getSIGU_CD()))
//					{
						bugaRegistBean	= bugaWebControl.insertBugaRegist(Bean, request,bugwa_id, commonCode); 
						
						if(bugaRegistBean != null && bugaRegistBean.getErrorMsg()== null)	//	�ΰ� ����
						{
							iSaeweService.SaeweSuipBugwa_Taxation_Info(guCode, corpCd,  seq, bugaRegistBean.getInsertKey());
							iSaeweService.SaeweSuipBugwa_Cal_Sum_Info(guCode, corpCd, seq);
							result = "1";
							
							if(bugaRegistBean.getInsertKey().equals("") || bugaRegistBean.getInsertKey() == null)
								message = "������ȣ������ �����Ͽ����ϴ�.";
							else
								message	= "�ΰ� �Ǿ����ϴ�.";	//	�ΰ�����
						}
						else
						{
							message	= "�ΰ���Ͽ� �����Ͽ����ϴ�";
							message += "\n"+bugaRegistBean.getErrorMsg();
							result = "0";
						}
						
						iSysConnectService.Sys_Connect_Info(adminNo,"2",user_id, "3",result);	//�����̷µ��
//					}
//					else
//						message = "�ñ��ڵ�/�μ��ڵ� ����ġ";  // �ñ��ڵ�,�μ��ڵ� ����ġ
				}
				else
					message = "�����������ȸ����";   //�����������ȸ ����
			}
			else
				message	= "�ΰ��� �����Դϴ�.";	//	�ΰ��Ǿ�����
		}
		else
			message	= "�ΰ������� ������ �����ϴ�.";	//	������ ����
		
		System.out.println(message);
		response.setCharacterEncoding("EUC-KR");
		response.getWriter().write(message);
		//request.setAttribute("SAEWESUIPBUGWA", message);
		
		return null;
	}

	//	���ܼ��Ժΰ�_�ϰ�
	public ModelAndView 	Saewesuipbugwa_Ilgwal(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		System.out.println("!! ���ܼ��Ժΰ� _�ϰ�");
		
		//	���ǿ���  �����´�.
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
	
		bugwaSearchBean.setSIGUNGU(userBean.getSIGU_CD());	
		bugwaSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
		bugwaSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
			
		//	�˻��� �����͸� �����´�.
		List		list	= iSaeweService.executeSearch_Ilgwal(bugwaSearchBean);
	
		String	message	= "0";
		String  guCode = "";
		String  corpCd = "";
		String  requestNo = "";
		String  result = "";	
		String  seq = "";
		String	admin_no = ""; 
		int  reqCount = 0;
		int  failCount = 0;
		
		TaxationBean	Bean			= new TaxationBean();
		TaxationBean	Bean2			= new TaxationBean();
		BugaRegistBean	bugaRegistBean	= new BugaRegistBean();	
		BugaWebControl	bugaWebControl	= new BugaWebControl();
		System.out.println("=== �ϰ��ΰ� �׽�Ʈ ===" );
		
		if(list.size()	>	0)
		{	
			String bugwa_id = "";
			
			for(int i=0; list.size() > i; i++)
			{
				Bean	  = (TaxationBean)list.get(i);
				guCode 	  = Bean.getGU_CODE();
				corpCd    = Bean.getCORP_CD();
				requestNo = Bean.getREQUEST_NO();
				seq 	  = Bean.getSEQ();
				admin_no  = guCode+"_"+corpCd+"_"+requestNo;
				//	String user_id = "1111111400049";
				bugwa_id = iSaeweService.executeBugwa_Id(user_id);
				System.out.println("user_id ==> " + user_id);
				System.out.println("bugwa_id ==> " + bugwa_id);
				System.out.println("Bean.getTAX_SET() : "+Bean.getTAX_SET());
				System.out.println("guCode+corpCd+requestNo : "+guCode+"_"+corpCd+"_"+requestNo);
				
				List list_p = iSaeweService.executePurpose(corpCd,guCode,requestNo,Bean.getTAX_SET().trim());
				if(list_p.size()>0){
				Bean2 = (TaxationBean)list_p.get(0);
				Bean.setPURPOSE_NM(Bean2.getPURPOSE_NM());
				}
				
				System.out.println("seq : "+seq);
				//int area = iSaeweService.executeGetSumQuantity(seq);
				//Bean.setAREA(Integer.toString(area));
				Bean.setSIDO("11");
				
				
				
				System.out.println("i = "+i);
				System.out.println("Bean.getSIGU_CD() : "+Bean.getSIGU_CD());						//�ñ��ڵ� 
		        System.out.println("Bean.getTAX_CD() : "+Bean.getTAX_CD());							//�����ڵ�
		        System.out.println("Bean.getTAX_YM() : "+Bean.getTAX_YM());							//�������
		        System.out.println("getTAX_GUBUN() : "+Bean.getTAX_GUBUN());					//��������
		        System.out.println("Bean.getTAX_SET() : "+Bean.getTAX_SET());						//�ü�/����
		        System.out.println("Bean.getDEPT_CD() : "+Bean.getDEPT_CD());						//�μ��ڵ�
		        System.out.println("Bean.getTAX_NO() : "+Bean.getTAX_NO());							//������ȣ
		        System.out.println("Bean.getSIDO() : "+Bean.getSIDO());								//�õ��ڵ�
		        System.out.println("Bean.getTAXPAYER_ID() : "+Bean.getTAXPAYER_ID());				//������ID
		        System.out.println("Bean.getTAXPAYER_NM() : "+Bean.getTAXPAYER_NM());						//�����ڸ�
		        System.out.println("Bean.getTAXPAYER_get() : "+Bean.getTAXPAYER_SET());				//�����ڱ���
		        System.out.println("Bean.getSUBUSEO_CD() : "+Bean.getSUBUSEO_CD());					//�����μ��ڵ�
		        System.out.println("Bean.getTAX_DATE() : "+Bean.getTAX_DATE());						//��������
				System.out.println("Bean.getINDATE() : "+Bean.getINDATE());							//��������
				System.out.println("Bean.getOVERDATE() : "+Bean.getOVERDATE());						//����������
//				System.out.println("Bean.getNAPBU_YMD(("TAX_DATE"));					//��������
				System.out.println("Bean.getBONSE() : "+Bean.getBONSE());			//�����ݾ�
				System.out.println("Bean.getSISE() : "+Bean.getSISE());								//�ü�
				System.out.println("Bean.getGUSE() : "+Bean.getGUSE());								//����
				System.out.println("Bean.getGUKSE() : "+Bean.getGUKSE());						    //����
				System.out.println("Bean.getGIGUM() : "+Bean.getGIGUM());							//���
				System.out.println("Bean.getHP() : "+Bean.getHP());									//�������޴�����ȣ
				System.out.println("Bean.getTEL() : "+Bean.getTEL());								//��������ȭ��ȣ
//				System.out.println("Bean.getEMAIL(("EMAIL"));							//������EMAIL
				System.out.println("Bean.getPOST() : "+Bean.getPOST());								//�����ڿ����ȣ
				System.out.println("Bean.getADDR1() : "+Bean.getADDR1());							//�����ڿ����ȣ�ּ�
				System.out.println("Bean.getADDR2() : "+Bean.getADDR2());							//�����ڻ��ּ�
				System.out.println("Bean.getROAD_ADD() : "+Bean.getROAD_ADD());						//�����ڵ��θ��ּ�
				System.out.println("Bean.getLIVE() : "+Bean.getLIVE());								//���ֻ���
				System.out.println("Bean.getOBJ_SET() : "+Bean.getOBJ_SET());						//���Ǳ���
				System.out.println("Bean.getBD_NM() : "+Bean.getBD_NM());							//���Ǹ�
				System.out.println("Bean.getSIGUNGU() : "+Bean.getSIGUNGU());						//����OCR�ñ��ڵ�
				System.out.println("Bean.getBJ_CD() : "+Bean.getBJ_CD());							//���ǹ��������ڵ�
				System.out.println("Bean.getSPC_CD() : "+Bean.getSPC_CD());							//����Ư�����ڵ�
				System.out.println("Bean.getBONBUN() : "+Bean.getBONBUN());							//���Ǻ���
				System.out.println("Bean.getBUBUN() : "+Bean.getBUBUN());							//���Ǻι�
				System.out.println("Bean.getTONG() : "+Bean.getTONG());								//������
				System.out.println("Bean.getBAN() : "+Bean.getBAN());								//���ǹ�
//				System.out.println("Bean.getMUL_APT_NM(("BD_NM"));						//���Ǿ���Ʈ��
				System.out.println("Bean.getBD_DONG() : "+Bean.getBD_DONG());						//���ǵ�
				System.out.println("Bean.getBD_HO() : "+Bean.getBD_HO());							//����ȣ
				System.out.println("Bean.getMUL_POST() : "+Bean.getMUL_POST());						//���ǿ����ȣ
				System.out.println("Bean.getNEAR_ADDR1() : "+Bean.getNEAR_ADDR1());					//���ǿ����ȣ�ּ�
				System.out.println("Bean.getNEAR_ADDR2() : "+Bean.getNEAR_ADDR2());					//���ǻ��ּ�
				System.out.println("Bean.getHJ_CD() : "+Bean.getHJ_CD());							//�������ڵ�
				System.out.println("Bean.getFORM_ADJUST() �׸�1 : "+Bean.getFORM_ADJUST());				//�׸�1(���������)
				System.out.println("Bean.getPURPOSE_NM(() �׸�2 : "+Bean.getPURPOSE_NM());					//�׸�2(�������)+
				Bean.setTYPE_NM("����");
				System.out.println("Bean.getTYPE_NM() �׸�3 : "+Bean.getTYPE_NM());						//�׸�3(����)+
				System.out.println("Bean.getUSE_DATE() �׸�4 : "+Bean.getUSE_DATE());//�׸�4(���Ⱓ)
				System.out.println("Bean.getAREA() �׸�5: "+Bean.getAREA());							    //�׸�5(�������)+
				System.out.println("Bean.getADMIN_NO() �׸�6: "+Bean.getADMIN_NO()); // ������ȣ �׸�6
				System.out.println("Bean.getADD_SET() : "+Bean.getADD_SET());                       //����������
				System.out.println("Bean.getRATE() : "+Bean.getRATE());			    //Ư������ 		
				System.out.println("Bean.getRATE_CAUSE() : "+Bean.getRATE_CAUSE());					//Ư�������������
				System.out.println("Bean.getNOTES() : "+Bean.getNOTES());						    //���
				System.out.println("Bean.getOCR_SIGU_CD() : "+Bean.getOCR_SIGU_CD());				//OCR�ñ��ڵ�
				System.out.println("Bean.getOCR_BUSEO_CD() : "+Bean.getOCR_BUSEO_CD());				//OCR�μ��ڵ�
				System.out.println("Bean.getVAT() : "+Bean.getVAT());				//�ΰ�����ü�ݾ�
				System.out.println("Bean.getADD_YN() : "+Bean.getADD_YN());							//����ݸ�������	
				
				System.out.println("Bean.getTAX_CD_GU() : "+Bean.getTAX_CD_GU());
				System.out.println("Bean.getTAX_CD_SE() : "+Bean.getTAX_CD_SE());
				System.out.println("Bean.getLIMIT_SUM() : "+Bean.getLIMIT_SUM());
				System.out.println("Bean.getLIMIT_CNT() : "+Bean.getLIMIT_CNT());
				System.out.println("Bean.getINTAX() : "+Bean.getINTAX());
				System.out.println("Bean.getOVERTAX() : "+Bean.getOVERTAX());
				System.out.println("Bean.getFORM1() : "+Bean.getFORM1());
				System.out.println("Bean.getFORM2() : "+Bean.getFORM2());
				System.out.println("Bean.getGU_CODE() : "+Bean.getGU_CODE());
				System.out.println("Bean.getBUNNAP_NO() : "+Bean.getBUNNAP_NO());
				System.out.println("Bean.getYEAR() : "+Bean.getYEAR());
				System.out.println("Bean.getSUSI_NO() : "+Bean.getSUSI_NO());
				System.out.println("Bean.getTAX_YN() : "+Bean.getTAX_YN());
				System.out.println("Bean.getGU_NM() : "+Bean.getGU_NM());
				System.out.println("Bean.getDEPT_NM() : "+Bean.getDEPT_NM());
				
				
				System.out.println("Bean.getTOHP() : "+Bean.getTOHP());
				System.out.println("Bean.getTO_LNBR1() : "+Bean.getTO_LNBR1());
				System.out.println("Bean.getTO_LNBR2() : "+Bean.getTO_LNBR2());
				
				
				
				
				
				
				bugaRegistBean	= bugaWebControl.insertBugaRegist(Bean, request, bugwa_id, commonCode);
				
				if(bugaRegistBean != null && bugaRegistBean.getErrorMsg()== null)	//	�ΰ� ����
				{	
					if(bugaRegistBean.getInsertKey().equals("") || bugaRegistBean.getInsertKey() == null)
					{
						message = "������ȣ������ �����Ͽ����ϴ�.";
					}
					else
					{
						iSaeweService.SaeweSuipBugwa_Taxation_Info(guCode, corpCd,  seq, bugaRegistBean.getInsertKey());
						iSaeweService.SaeweSuipBugwa_Cal_Sum_Info(guCode, corpCd, seq);
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
				
				iSysConnectService.Sys_Connect_Info(admin_no,"2",user_id, "1",result);	//�����̷µ��
			}
			
			if(reqCount != 0 && list.size() != reqCount)
				message = "�ΰ������ �����Ѱ��� �ֽ��ϴ�.";
		}
		else
			message	= "�ΰ������� ������ �����ϴ�.";	//	������ ����
		
		if(reqCount > 0 || failCount > 0)
			message += "\n����:"+ reqCount + "��  " +"����:"+failCount+ "��";
		
		return Search( request, response, message);
	}
}
