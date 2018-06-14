
package main.java.rojum.saewe.web;

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
import main.java.rojum.saewe.model.BugaRegistBean;
import main.java.rojum.saewe.model.BugwaSearchBean;
import main.java.rojum.saewe.model.SaeweBean;
import main.java.rojum.saewe.model.SunapPenaltyBean;
import main.java.rojum.saewe.model.TaxationBean;
import main.java.rojum.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
//********** BEGIN_����_20120222
import main.java.rojum.jumyong.model.ProductBean;
import main.java.rojum.jumyong.service.IJumyongService;
import java.text.*;
//********** END_����_20120222

public class SaeweControl	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	ISysConnectService	iSysConnectService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setRojum_saeweService(ISaeweService rojum_saeweService)
	{
		this.iSaeweService = rojum_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	public void setSysConnectService(ISysConnectService sysConnectService)
	{
		this.iSysConnectService = sysConnectService;
	}
	
	//********** BEGIN_����_20120222
	private IJumyongService objJumyongService = null;
	
	public void setRojum_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	//********** END_����_20120222

	
	//	�ΰ� ��ȸ ȭ��
	public ModelAndView Search(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
	{	
		//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List		list	= null;
		
		System.out.println("####################SaeweControl#####################");
		System.out.println("Proceeding......");
		
		try{
			if(userId != null)
			{
		
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
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
				String thisDate = formatter.format(cal.getTime());
				String	YEAR		= thisDate.substring(0,4);
								
				YEAR 		= ServletRequestUtils.getStringParameter(request, "YEAR", YEAR);

				String gu_cd = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
								
				
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
				
				bind(request, bugwaSearchBean);
				
				bugwaSearchBean.setYEAR(YEAR);
				bugwaSearchBean.setSIDO(SIDO_CD);
				bugwaSearchBean.setSIGUNGU(gu_cd);
				
				
				//2018-05-31
				System.out.println("gu_cdgu_cdgu_cdgu_cdgu_cdgu_cdgu_cd: " + gu_cd);
				
				if(gu_cd.equals("000"))
					bugwaSearchBean.setSIGUNGU("%");
				
				
				
				//	�˻��� ������ �Ѱ����� �����´�.
				int	iTotalCnt	= iSaeweService.executeCount(bugwaSearchBean);
				
				
				//	�˻��� �����͸� �����´�.
				list	= iSaeweService.executeSearch(bugwaSearchBean);
				SaeweBean	Bean	= new SaeweBean();
				int			size	= list.size();
			
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (SaeweBean)list.get(i);
					
					//��������
					Bean.setTAX_GUBUN_NM(commonCode.executeSearchCommonCode("taxation_part", Bean.getTAX_GUBUN()));	//	��������
		  			//��������
					Bean.setSUNAP_YN(commonCode.executeSearchCommonCode("sunap_part", Bean.getSUNAP_YN()));
		        	//	�ΰ�����
		        	Bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", Bean.getTAX_YN()));
		        	// �ǰ�����
		        	Bean.setREPLY_GUBUN_NM(commonCode.executeSearchCommonCode("submit_reply", Bean.getREPLY_GUBUN()));
				}
				
				request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", bugwaSearchBean.getTAX_GUBUN(), "��ü"));		//  ��������								
				request.setAttribute("sunap_part", commonCode.executeCommonCode("sunap_part", bugwaSearchBean.getSUNAP_YN(), "��ü"));		//  ��������//
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", bugwaSearchBean.getTAX_SET(), "��ü"));	//	���Ա���
				request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));	//	�ñ���
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getBJ_CD()));	//	������
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getHJ_CD()));	//	������
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", bugwaSearchBean.getTAX_YN(), "��ü"));				//	�ΰ�����
				request.setAttribute("thisDate", thisDate);
				request.setAttribute("YEAR", YEAR);
				request.setAttribute("BONBUN", bugwaSearchBean.getBONBUN());
				request.setAttribute("BUBUN", bugwaSearchBean.getBUBUN());
				request.setAttribute("OWNER_NAME", bugwaSearchBean.getOWNER_NAME());
				request.setAttribute("GAPAN_NO", bugwaSearchBean.getGAPAN_NO());
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("CAL_MODE", bugwaSearchBean.getCAL_MODE());
				request.setAttribute("USER_ID", userId);
				request.setAttribute("message", message);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}

		return new ModelAndView("/rojum/saewe/search", "blist", list);
	}

	//	�ΰ� ��ȸ ȭ��(Excel)
	public ModelAndView 	Excel_Search(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
	{
		//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List		list	= null;
		
		try{
			if(userId != null)
			{
		
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
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
				String thisDate = formatter.format(cal.getTime());
				String	YEAR		= thisDate.substring(0,4);
								
				YEAR 		= ServletRequestUtils.getStringParameter(request, "YEAR", YEAR);

				String gu_cd = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
								
				
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
				
				bind(request, bugwaSearchBean);
				
				bugwaSearchBean.setYEAR(YEAR);
				bugwaSearchBean.setSIDO(SIDO_CD);
				bugwaSearchBean.setSIGUNGU(gu_cd);
				
				
				//2018-05-31
				System.out.println("gu_cdgu_cdgu_cdgu_cdgu_cdgu_cdgu_cd: " + gu_cd);
				
				if(gu_cd.equals("000"))
					bugwaSearchBean.setSIGUNGU("%");
				
				
				
				//	�˻��� ������ �Ѱ����� �����´�.
				int	iTotalCnt	= iSaeweService.executeCount(bugwaSearchBean);
				
				
				//	�˻��� �����͸� �����´�.
				list	= iSaeweService.executeSearch(bugwaSearchBean);
				SaeweBean	Bean	= new SaeweBean();
				int			size	= list.size();
			
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (SaeweBean)list.get(i);
					
					//��������
					Bean.setTAX_GUBUN_NM(commonCode.executeSearchCommonCode("taxation_part", Bean.getTAX_GUBUN()));	//	��������
		  			//��������
					Bean.setSUNAP_YN(commonCode.executeSearchCommonCode("sunap_part", Bean.getSUNAP_YN()));
		        	//	�ΰ�����
		        	Bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", Bean.getTAX_YN()));
		        	// �ǰ�����
		        	Bean.setREPLY_GUBUN_NM(commonCode.executeSearchCommonCode("submit_reply", Bean.getREPLY_GUBUN()));
				}
				
				request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", bugwaSearchBean.getTAX_GUBUN(), "��ü"));		//  ��������								
				request.setAttribute("sunap_part", commonCode.executeCommonCode("sunap_part", bugwaSearchBean.getSUNAP_YN(), "��ü"));		//  ��������//
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", bugwaSearchBean.getTAX_SET(), "��ü"));	//	���Ա���
				request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));	//	�ñ���
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getBJ_CD()));	//	������
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getHJ_CD()));	//	������
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", bugwaSearchBean.getTAX_YN(), "��ü"));				//	�ΰ�����
				request.setAttribute("thisDate", thisDate);
				request.setAttribute("YEAR", YEAR);
				request.setAttribute("BONBUN", bugwaSearchBean.getBONBUN());
				request.setAttribute("BUBUN", bugwaSearchBean.getBUBUN());
				request.setAttribute("OWNER_NAME", bugwaSearchBean.getOWNER_NAME());
				request.setAttribute("GAPAN_NO", bugwaSearchBean.getGAPAN_NO());
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("CAL_MODE", bugwaSearchBean.getCAL_MODE());
				
				request.setAttribute("message", message);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}

		return new ModelAndView("/rojum/saewe/excel_search", "blist", list);
	}
	
	//	�˻� ������ �Ҹ��� �����ϱ� ����  �����͸� ������ �ִ´�.
	public ModelAndView 	View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String 	ADMIN_NO = "";
		
		try{
			if(userId != null)
			{
		
				ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
				String 	currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", "1");
				//********** BEGIN_����_20120222
				String BTNYN = ServletRequestUtils.getStringParameter(request, "BTNYN", "");
				String misunap = ServletRequestUtils.getStringParameter(request, "misunap", "N");
				String tax = ServletRequestUtils.getStringParameter(request, "tax", "2");
				request.setAttribute("BTNYN", BTNYN);	
				request.setAttribute("USER_ID", userId);
				request.setAttribute("misunap", misunap);
				request.setAttribute("tax", tax);
				//********** END_����_20120222
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
				
				bind(request, bugwaSearchBean);

				request.setAttribute("TYPE", bugwaSearchBean.getTYPE());			//	��������
				request.setAttribute("SECTION", bugwaSearchBean.getSECTION());		//	���뱸��
				request.setAttribute("OWNER_SET", bugwaSearchBean.getOWNER_SET());	//	������
				request.setAttribute("TAX_SET", bugwaSearchBean.getTAX_SET());		//	���Ա���	
				request.setAttribute("BJ_CD", bugwaSearchBean.getBJ_CD());			//	������
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
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/rojum/saewe/view", "ADMIN_NO", ADMIN_NO);
	}

	
	//	���ܼ��Ժΰ�
	public ModelAndView 	Saewesuipbugwa(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		try{
			System.out.println("!! ���ܼ��Ժΰ� ");
			BugaWebControl	bugaWebControl	= new BugaWebControl();
			
			String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			String 	SEQ			= ServletRequestUtils.getStringParameter(request, "SEQ", "");
			
	
			//	�����͸� �����´�.
			List	list 	= iSaeweService.executeBugwa_View(ADMIN_NO, SEQ);
			
			
			System.out.println("���ܼ��Ժΰ� ����Ʈ ::"+list.size());
			
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
				System.out.println("Bean.getPOST() : " + Bean.getPOST());
				System.out.println("Bean.getADDR1() : " + Bean.getADDR1());
				System.out.println("Bean.getADDR2() : " +Bean.getADDR2());
				System.out.println("Bean.getROAD_ADD() : " +Bean.getROAD_ADD());
				System.out.println("Bean.getBEFORE_SEQ() : " +Bean.getBEFORE_SEQ());
				System.out.println("Bean.getBEFORE_YEAR() : " +Bean.getBEFORE_YEAR());
				
				
				if(Bean.getTAX_YN() == null){
					Bean.setTAX_YN("0");//String.valueOf(list.get(0));
				}
				
				if(!Bean.getTAX_YN().trim().equals("1"))	//	�ΰ��� �� ��������..
				{
					String user_id = util.getSessionID(request, "sessionUserId");	
					System.out.println("user_id ==> " + user_id);
					String bugwa_id = iSaeweService.executeBugwa_Id(user_id);
					System.out.println("bugwa_id ==> " + bugwa_id);

					userInfoBean	= bugaWebControl.getUserInfo(bugwa_id);				//�����������ȸ
										
					
					if(userInfoBean != null)
					{
						System.out.println("Bean.getDEPT_CD() ==> " + Bean.getDEPT_CD());
						System.out.println("userInfoBean.getDEPT_CD() ==> " + userInfoBean.getDEPT_CD());
						System.out.println("Bean.getSIGU_CD() ==> " + Bean.getSIGU_CD());
						System.out.println("userInfoBean.getSIGU_CD() ==> " + userInfoBean.getSIGU_CD());
						if(Bean.getDEPT_CD().equals(userInfoBean.getDEPT_CD()) && Bean.getSIGU_CD().equals(userInfoBean.getSIGU_CD()))
						{
							bugaRegistBean	= bugaWebControl.insertBugaRegist(Bean, request,bugwa_id, commonCode);

							if(bugaRegistBean != null && bugaRegistBean.getErrorMsg()== null)	//	�ΰ� ����
							{
								if(bugaRegistBean.getInsertKey().equals("") || bugaRegistBean.getInsertKey() == null)
								{
									System.out.println("������ȣ������ �����Ͽ����ϴ�.");
									message = "������ȣ������ �����Ͽ����ϴ�.";
								}
								else
								{
									System.out.println("TAX_YN == > 1�� ������Ʈ");															
									iSaeweService.SaeweSuipBugwa_Taxation_Info(ADMIN_NO, SEQ, bugaRegistBean.getInsertKey());
									iSaeweService.GapanInfoTaxationAt(ADMIN_NO, SEQ);
									//********** BEGIN_KANG_20120705
									iSaeweService.SaeweSuipBugwa_Taxation_Info_Before(ADMIN_NO, Bean.getBEFORE_SEQ(), Bean.getBEFORE_YEAR());
									//********** END_KANG_20120705			
									result = "1";
									System.out.println("�ΰ� �Ǿ����ϴ�.");
									message	= "�ΰ� �Ǿ����ϴ�.";	//	�ΰ�����
								}
							}
							else
							{
								System.out.println("�ΰ���Ͽ� �����Ͽ����ϴ�");
								message	= "�ΰ���Ͽ� �����Ͽ����ϴ�";
								message += "\n"+bugaRegistBean.getErrorMsg();
								result = "0";
							}
							System.out.println("44444444444444444444444444444444");
							iSysConnectService.Sys_Connect_Info(ADMIN_NO,"2",user_id, "1",result);	//�����̷µ��
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

	// ���ܼ��Ժΰ�_�ϰ�
	public ModelAndView Saewesuipbugwa_Ilgwal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ���ǿ��� �õ� �ڵ带 �����´�.
		String SIDO_CD = util.getSidoCode(getMessageSourceAccessor());
		String user_id = util.getSessionID(request, "sessionUserId");

		// ������ �����͸� �����´�.
		UserBean userBean = new UserBean();

		try {
			userBean = commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		String[] gapan_no_arr = request.getParameterValues("GAPAN_NO_ARR");
		String[] select_item = request.getParameterValues("ITEM_CHECK");
		String[] seq_arr = request.getParameterValues("SEQ_ARR");

		String message = "0";
		String admin_no = "";
		String result = "";
		String seq = "";
		int reqCount = 0;
		int failCount = 0;

		for (int j = 0; j < select_item.length; j++) {

			if (select_item[j].equals("true")) {

				// �˻��� �����͸� �����´�.
				admin_no = gapan_no_arr[j];
				seq = seq_arr[j];
				List list = iSaeweService.executeBugwa_View(admin_no,seq);

				System.out.println("list.size -----> " + list.size());

				TaxationBean Bean = new TaxationBean();
				BugaRegistBean bugaRegistBean = new BugaRegistBean();
				BugaWebControl bugaWebControl = new BugaWebControl();

				if (list.size() > 0) {
					String bugwa_id = "";
					
					for (int i = 0; list.size() > i; i++) {
						Bean = (TaxationBean) list.get(i);
						
						System.out.println("rojum.SaeweControl.user_id : " + user_id);

						bugwa_id = iSaeweService.executeBugwa_Id(user_id);

						bugaRegistBean = bugaWebControl.insertBugaRegist(Bean, request, bugwa_id, commonCode);

						if (bugaRegistBean != null
								&& bugaRegistBean.getErrorMsg() == null) // �ΰ�
																			// ����
						{
							if (bugaRegistBean.getInsertKey().equals("") || bugaRegistBean.getInsertKey() == null) {
								message = "������ȣ������ �����Ͽ����ϴ�.";
							} else {
								iSaeweService.SaeweSuipBugwa_Taxation_Info( admin_no, seq, bugaRegistBean .getInsertKey());
								iSaeweService.GapanInfoTaxationAt(admin_no, seq);
								//********** BEGIN_KANG_20120705
								iSaeweService.SaeweSuipBugwa_Taxation_Info_Before(admin_no, Bean.getBEFORE_SEQ(), Bean.getBEFORE_YEAR());
								//********** END_KANG_20120705
								result = "1";
								message = "�ΰ� �Ǿ����ϴ�."; // �ΰ�����
								reqCount++;
							}
						} else {
							message = "�ΰ���Ͽ� �����Ͽ����ϴ�";
							message += "\n" + bugaRegistBean.getErrorMsg();
							result = "0";
							failCount++;
						}

						iSysConnectService.Sys_Connect_Info(admin_no, "2", user_id, "1", result); // �����̷µ��
					}

					if (reqCount != 0 && list.size() != reqCount)
						message = "�ΰ������ �����Ѱ��� �ֽ��ϴ�.";
				} else
					message = "�ΰ������� ������ �����ϴ�."; // ������ ����

			}
		}
		if (reqCount > 0 || failCount > 0)
			message += "\n����:" + reqCount + "��  " + "����:" + failCount + "��";

		return Search(request, response, message);
	}
	
	
	//	���ܼ��Ժΰ�_�ϰ�
	public ModelAndView 	Saewe_Sunap(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//	������ �����͸� �����´�.
		UserBean	userBean	= new UserBean();
		String	message	= "";
		
		try{
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
			bind(request, bugwaSearchBean);
			
			String SunapDate = ServletRequestUtils.getStringParameter(request,"SunapDate","");
			
			String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
	        String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO_ARR");
	        String[] SEQ_ARR = request.getParameterValues("SEQ_ARR");
	        
	            
	        int listCount = 0;
	            
	        
	        for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
	        	if(ITEM_CHECK_ARR[i].equals("true")){
	        		iSaeweService.executeSunapProduct(GAPAN_NO_ARR[i],SEQ_ARR[i],removeDash(SunapDate));
	        		listCount++;
            	}
            }
				
			message = listCount + "�ǿ� ���ؼ� ����ó���Ǿ����ϴ�.";
		
		}
		catch (Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
		}
		
		return Search( request, response, message);
	}
	
	// �̼��� ���·� ��ȸ
	public ModelAndView 	SearchPenaltyIlgwal(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		System.out.println("SearchPenaltyIlgwal");
		
		//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List		list	= null;
		
		try{
			if(userId != null)
			{
		
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				// ���⵵ ���
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
				String thisDate = formatter.format(cal.getTime());		
				
				
				
				String gu_cd = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
								
				//	�˻��� �����͸� �����´�.
				list	= iSaeweService.executeSearchPenaltyIlgwal(gu_cd);
				
				SunapPenaltyBean	Bean	= new SunapPenaltyBean();
				int			size	= list.size();
			
				for(int i = 0; i < size; i++)
				{
					Bean	= (SunapPenaltyBean)list.get(i);
					
					//��������
					Bean.setTAX_GUBUN(commonCode.executeSearchCommonCode("taxation_part", Bean.getTAX_GUBUN()));	//	��������
		  			//��������
					Bean.setSUNAP_YN(commonCode.executeSearchCommonCode("sunap_part", Bean.getSUNAP_YN()));
		        	//	�ΰ�����
		        	Bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", Bean.getTAX_YN()));
				}
				request.setAttribute("listCount", String.valueOf(size));
				request.setAttribute("TAX_DATE", util.Date_Paste(thisDate));
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("SearchPenaltyIlgwal END");

		return new ModelAndView("/rojum/saewe/search_penalty_ilgwal", "blist", list);
	}
	
	
	// �̼��� ���·� ó��
	public ModelAndView SearchPenaltyIlgwalPrc(HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		//	������ �����͸� �����´�.
		UserBean	userBean	= new UserBean();
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String	message	= "";
		
		try{
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
			bind(request, bugwaSearchBean);
			

			String TAX_DATE = removeDash(ServletRequestUtils.getStringParameter(request, "TAX_DATE", ""));
			String INDATE = removeDash(ServletRequestUtils.getStringParameter(request, "INDATE", ""));
			String OVERDATE = removeDash(ServletRequestUtils.getStringParameter(request, "OVERDATE", ""));
			
			String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
	        String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO_ARR");
	        String[] SEQ_ARR = request.getParameterValues("SEQ_ARR");
	        
			String result = "";
			String seq = "";
			int reqCount = 0;
			int failCount = 0;

	        
	        for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
	        	if(ITEM_CHECK_ARR[i].equals("true")){
	        		
	        		String newCalculationSeq = String.valueOf(iSaeweService.getCalculationSequence());
	        		String newCalSumSeq = String.valueOf(iSaeweService.getCal_Sum_Seq());
	        		
	        		iSaeweService.insertReCalculationInfo(newCalculationSeq, newCalSumSeq, GAPAN_NO_ARR[i], SEQ_ARR[i]);
	        		iSaeweService.insertReCalSumInfo(newCalSumSeq, GAPAN_NO_ARR[i], SEQ_ARR[i]);
	        		iSaeweService.insertReTaxationInfo(newCalSumSeq, TAX_DATE, INDATE, OVERDATE, GAPAN_NO_ARR[i], SEQ_ARR[i]);
	        		
	        		String bugwa_id = "";
	        		
	        		List list = iSaeweService.executeBugwa_View(GAPAN_NO_ARR[i],newCalSumSeq);
	    			TaxationBean Bean = new TaxationBean();
	    			BugaRegistBean bugaRegistBean = new BugaRegistBean();
	    			BugaWebControl bugaWebControl = new BugaWebControl();
	    			

						for (int j = 0; list.size() > j; j++) {
							Bean = (TaxationBean) list.get(j);

							bugwa_id = iSaeweService.executeBugwa_Id(userId);

							bugaRegistBean = bugaWebControl.insertBugaRegist(Bean, request, bugwa_id, commonCode);

							if (bugaRegistBean != null
									&& bugaRegistBean.getErrorMsg() == null) // �ΰ�
																				// ����
							{
								if (bugaRegistBean.getInsertKey().equals("") || bugaRegistBean.getInsertKey() == null) {
									message = "������ȣ������ �����Ͽ����ϴ�.";
								} else {
									iSaeweService.SaeweSuipBugwa_Taxation_Info(GAPAN_NO_ARR[i],newCalSumSeq, bugaRegistBean .getInsertKey());
									iSaeweService.GapanInfoTaxationAt(GAPAN_NO_ARR[i],newCalSumSeq);

									reqCount++;
								}
							} else {
								failCount++;
							}

							iSysConnectService.Sys_Connect_Info(GAPAN_NO_ARR[i], "2", userId, "1", result); // �����̷µ��
						}
            	}
            }
	        
	        if(failCount > 0){
	        	message = reqCount + "�ǿ� ���ؼ� ���·� �ΰ�ó���Ǿ�����, "+failCount+"�ǿ� ���ؼ� �ΰ��� �����Ͽ����ϴ�.";
	        }else{
	        	message = reqCount + "�ǿ� ���ؼ� ���·� �ΰ�ó���Ǿ����ϴ�.";
	        }
				
			
		
		}
		catch (Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
		}
		
		return Search( request, response, message);
	}
	
	//�ǰ�����
	public ModelAndView submitReply(HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		//	������ �����͸� �����´�.
		UserBean	userBean	= new UserBean();
		String	message	= "";
		
		try{
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
			bind(request, bugwaSearchBean);
			

			String REPLY_GUBUN = ServletRequestUtils.getStringParameter(request, "REPLY_GUBUN", "");
			String REPLY_MANAGER = ServletRequestUtils.getStringParameter(request, "REPLY_MANAGER", "");
			String REPLY_ETC = ServletRequestUtils.getStringParameter(request, "REPLY_ETC", "");
			
			String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
	        String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO_ARR");
	        String[] SEQ_ARR = request.getParameterValues("SEQ_ARR");
	        
	        
	        for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
	        	if(ITEM_CHECK_ARR[i].equals("true")){
	        		iSaeweService.setSubmitReply(GAPAN_NO_ARR[i],SEQ_ARR[i],REPLY_GUBUN,REPLY_ETC);
	        		message = "������ȣ"+GAPAN_NO_ARR[i]+"�� ���ؼ� �ǰ������� ����Ǿ����ϴ�.";
            	}
            }
		
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return Search(request,response,message);
	}
	
	/**
   	 * DateFormat ����
	 */
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	//********** BEGIN_����_20120222
	
	public ModelAndView misunap(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
	{	
		//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List		list	= null;
		
		System.out.println("####################misunap#####################");
		
		try{
			if(userId != null)
			{		
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
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
				String thisDate = formatter.format(cal.getTime());
				String	YEAR		= thisDate.substring(0,4);
								
				YEAR 		= ServletRequestUtils.getStringParameter(request, "YEAR", YEAR);

				String gu_cd = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				//********** BEGIN_����_20120228
				String taxGubun = ServletRequestUtils.getStringParameter(request,"TAX_GUBUN","3");				
				//********** END_����_20120228
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
				
				bind(request, bugwaSearchBean);
				
				bugwaSearchBean.setYEAR(YEAR);
				bugwaSearchBean.setSIDO(SIDO_CD);
				bugwaSearchBean.setSIGUNGU(gu_cd);
				bugwaSearchBean.setCAL_MODE("3"); // CAl_MODE �� ���·��� ��SUNAP_YN
				bugwaSearchBean.setSUNAP_YN("0");  // �̼����϶�
				//********** BEGIN_KANG_20120704
				bugwaSearchBean.setTAX_YN("1");  //�ΰ��϶�
				//********** END_KANG_20120704
				//	�˻��� ������ �Ѱ����� �����´�.
				int	iTotalCnt	= iSaeweService.executeCount_misunap(bugwaSearchBean);
				
				//	�˻��� �����͸� �����´�.
				list	= iSaeweService.executeSearch_misunap(bugwaSearchBean);
				SaeweBean	Bean	= new SaeweBean();
				int			size	= list.size();
			
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (SaeweBean)list.get(i);
					
					//��������
					Bean.setTAX_GUBUN_NM(commonCode.executeSearchCommonCode("taxation_part", Bean.getTAX_GUBUN()));	//	��������
		  			//��������
					Bean.setSUNAP_YN(commonCode.executeSearchCommonCode("sunap_part", Bean.getSUNAP_YN()));
		        	//	�ΰ�����
		        	Bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", Bean.getTAX_YN()));
		        	// �ǰ�����
		        	Bean.setREPLY_GUBUN_NM(commonCode.executeSearchCommonCode("submit_reply", Bean.getREPLY_GUBUN()));
				}
				
				request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", bugwaSearchBean.getTAX_GUBUN(), "��ü"));		//  ��������								
				request.setAttribute("sunap_part", commonCode.executeCommonCode("sunap_part", bugwaSearchBean.getSUNAP_YN(), "��ü"));		//  ��������//
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", bugwaSearchBean.getTAX_SET(), "��ü"));	//	���Ա���
				request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));	//	�ñ���
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getBJ_CD()));	//	������
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getHJ_CD()));	//	������
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", bugwaSearchBean.getTAX_YN(), "��ü"));				//	�ΰ�����
				request.setAttribute("thisDate", thisDate);
				request.setAttribute("YEAR", YEAR);
				request.setAttribute("BONBUN", bugwaSearchBean.getBONBUN());
				request.setAttribute("BUBUN", bugwaSearchBean.getBUBUN());
				request.setAttribute("OWNER_NAME", bugwaSearchBean.getOWNER_NAME());
				request.setAttribute("GAPAN_NO", bugwaSearchBean.getGAPAN_NO());
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("CAL_MODE", bugwaSearchBean.getCAL_MODE());
				request.setAttribute("USER_ID", userId);
				request.setAttribute("message", message);
				request.setAttribute("TAX_GUBUN", taxGubun);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}

		return new ModelAndView("/rojum/saewe/misunap", "blist", list);
	}

	
	public ModelAndView sanchul(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
	{
		//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String 	ADMIN_NO = "";
	
		try{
			if(userId != null)
			{				
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
		
				ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String gapanNo = ADMIN_NO;
				String SEQ 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
				String GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", "1");
				String BTNYN = ServletRequestUtils.getStringParameter(request, "BTNYN", "");
				String misunap = ServletRequestUtils.getStringParameter(request, "misunap", "N");
				
				request.setAttribute("BTNYN", BTNYN);	
				request.setAttribute("USER_ID", userId);
				request.setAttribute("misunap", misunap);
				
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
				bind(request, bugwaSearchBean);
				//				���� �⵵
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String thisDate = formatter.format(cal.getTime());
				String	YEAR		= thisDate.substring(0,4);

				YEAR 		= ServletRequestUtils.getStringParameter(request, "YEAR", YEAR);

				String gu_cd = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				
				System.out.println("gapanNo : " + gapanNo);
				System.out.println("SEQ : " + SEQ);
				System.out.println("YEAR : " + YEAR);					
				//=========================================================
				
				int calSumSeq = objJumyongService.getCal_Sum_Seq();
				String calsumInfoResult = sanchul_calsuminfoInsert(gapanNo,SEQ, YEAR, calSumSeq+"");
				boolean calculationInfoResult = sanchul_calculationinfoInsert(gapanNo,SEQ, YEAR, calSumSeq+"");
				boolean taxationInfoResult = sanchul_taxationinfoInsert(gapanNo,SEQ, YEAR, calSumSeq+"", calsumInfoResult);
 				
				//=========================================================	
				bugwaSearchBean.setYEAR(YEAR);
				bugwaSearchBean.setSIDO(SIDO_CD);
				bugwaSearchBean.setSIGUNGU(gu_cd);
				bugwaSearchBean.setSEQ(calSumSeq+"");
				
				List list	= iSaeweService.executeSearch(bugwaSearchBean);	
				
				request.setAttribute("TYPE", bugwaSearchBean.getTYPE());			//	��������
				request.setAttribute("SECTION", bugwaSearchBean.getSECTION());		//	���뱸��
				request.setAttribute("OWNER_SET", bugwaSearchBean.getOWNER_SET());	//	������
				request.setAttribute("TAX_SET", bugwaSearchBean.getTAX_SET());		//	���Ա���	
				request.setAttribute("BJ_CD", bugwaSearchBean.getBJ_CD());			//	������
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
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/rojum/saewe/view", "ADMIN_NO", ADMIN_NO);
	}
	
	// GAPAN_CAL_SUM_INFO �Է�
	private String sanchul_calsuminfoInsert(String gapanNo,String SEQ, String YEAR, String calSumSeq){		
		String result = "";
		try{
			List calSum = objJumyongService.gapanCalSumInfoSelect(gapanNo,SEQ, YEAR);
			ProductBean bean = new ProductBean();
			bean = (ProductBean)calSum.get(0);
			
			double sumAdjustCal = Long.parseLong(bean.getSUM_ADJUST())*1.25;
			String strCal = sumAdjustCal + "";
			
			bean.setSEQ(calSumSeq+"");
			bean.setSUM_ADJUST(strCal);
			bean.setREDUCTION_RATE("0");
			bean.setSUM(strCal);
			bean.setUSE_SECTION("2");
			bean.setREDUCTION_REASON("");
			bean.setTAX_SEQ(calSumSeq+"");
			bean.setAREA_AFTER(bean.getAREA());
			DecimalFormat df = new DecimalFormat("#,##0");
			bean.setFORM_ADJUST(df.format(Integer.parseInt(bean.getPRICE()))+" X "+ df.format(Math.floor(Double.parseDouble(bean.getAREA()))));
			result = bean.getFORM_ADJUST();
			objJumyongService.Cal_Sum_InfoInsert(bean);
			
		}catch(Exception e){			
			System.out.println("sanchul_calsuminfoInsert ���� ����"+e);
		}
		return result;				
	}
	
	// GAPAN_CALCULATION_INFO �Է�
	private boolean sanchul_calculationinfoInsert(String gapanNo,String SEQ, String YEAR, String calSumSeq){
		boolean result = true;
		try{
			List calculation = objJumyongService.gapanCalculationSelect(gapanNo,SEQ, YEAR);
			ProductBean bean = new ProductBean();
			bean = (ProductBean)calculation.get(0);			
			
			double sumAdjustCal = Long.parseLong(bean.getSUM_ADJUST())*1.25;
			String strCal = sumAdjustCal + "";
			DecimalFormat df = new DecimalFormat("#,##0");
			String form = df.format(Integer.parseInt(bean.getPRICE())) +" X " + df.format((Math.floor(Double.parseDouble(bean.getAREA_AFTER()))));
			
			bean.setCAL_SUM_SEQ(calSumSeq+"");
			bean.setSUM_YEAR(strCal);
			bean.setSUM_ADJUST(strCal);
			bean.setFORM_ADJUST(form);
			bean.setFORM(form);
			bean.setREDUCTION_RATE("0");
			bean.setREDUCTION_REASON("");
			bean.setUSE_SECTION("2");
			
			objJumyongService.insertProduct(bean);
			
			
		}catch(Exception e){
			result = false;
			System.out.println("sanchul_calculationinfoInsert ���� ����"+e);
		}
		return result;		
	}
	// GAPAN_TAXATION_INFO �Է�
	private boolean sanchul_taxationinfoInsert(String gapanNo,String SEQ, String YEAR, String calSumSeq, String form){
		boolean result = true;
		try{
			List taxation = objJumyongService.gapanTaxationInfoSelect(gapanNo,SEQ, YEAR);
			ProductBean bean = new ProductBean();
			bean = (ProductBean)taxation.get(0);
			
			Calendar 			cal 		= Calendar.getInstance();
			SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyyMMdd", Locale.KOREA );
			String today = formatter.format(cal.getTime());
			String taxym = today.substring(0,6);
			cal.add(cal.DATE, 15);
			String indate = formatter.format(cal.getTime());			
			cal.add(cal.MONTH,1);
			String overdate = formatter.format(cal.getTime());
			
			double bonse = Long.parseLong(bean.getBONSE())*1.25;
			
			String strCal = bonse + "";			
			
			bean.setTAX_NO("");
			bean.setTAX_GUBUN("2");
			bean.setBONSE(strCal);
			bean.setFORM1(form);
			bean.setFORM2(form);
			bean.setSEQ(calSumSeq+"");
			bean.setCAL_SUM_SEQ(calSumSeq+"");	
			bean.setINTAX(strCal);
			bean.setOVERTAX(strCal);
			if((bean.getSISE()!=null)&&(!(bean.getSISE().equals("")))){				
				bean.setSISE((Long.parseLong(bean.getSISE())*1.25)+"");
			}
			if((bean.getGUSE()!=null)&&(!(bean.getGUSE().equals("")))){				
				bean.setGUSE((Long.parseLong(bean.getGUSE())*1.25)+"");
			}			
			
			bean.setTAX_YM(taxym);
			bean.setINDATE(indate);
			bean.setOVERDATE(overdate);
			bean.setTAX_DATE(today);
			//********** BEGIN_KANG_20120705
			bean.setBEFORE_SEQ(SEQ);
			bean.setBEFORE_YEAR(YEAR);
			bean.setTAX_YN("0");
			//********** END_KANG_20120705
			
			objJumyongService.executeBugwa_Register(bean);

		}catch(Exception e){
			result = false;
			System.out.println("sanchul_taxationinfoInsert ���� ����"+e);
		}
		return result;		
	}
	//********** END_����_20120222	
	
	//********** BEGIN_����_20120227
	//	�ΰ�öȸ
	public ModelAndView 	bugwaCancel(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//	������ �����͸� �����´�.
		UserBean	userBean	= new UserBean();
		String	message	= "";
		
		try{
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
			bind(request, bugwaSearchBean);
			
			String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
	        String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO_ARR");
	        String[] SEQ_ARR = request.getParameterValues("SEQ_ARR");
	      //********** BEGIN_����_20120322	      
	        String mode = request.getParameter("mode");
	      //********** END_����_20120322  
	            
	        int listCount = 0;	            
	        
	        for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
	        	if(ITEM_CHECK_ARR[i].equals("true")){
	        		objJumyongService.executebugwaCancel(GAPAN_NO_ARR[i],SEQ_ARR[i]);
	        		listCount++;
            	}
            }
	      //********** BEGIN_����_20120322	      
	        if(mode.equals("bugwa")){
	        	message = listCount + "�ǿ� ���ؼ� �ΰ� öȸ�Ǿ����ϴ�.";	
	        }else if(mode.equals("mibugwa")){
	        	message = listCount + "�ǿ� ���ؼ� �����Ǿ����ϴ�.";
	        }
	      //********** END_����_20120322
		
		}
		catch (Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
		}
		
		return Search( request, response, message);
	}
	//********** END_����_20120227	
	
	
}