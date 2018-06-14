
package main.java.gapan.saewe.web;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.sysConnect.service.ISysConnectService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.gapan.saewe.model.BugaRegistBean;
import main.java.gapan.saewe.model.BugwaSearchBean;
import main.java.gapan.saewe.model.SaeweBean;
import main.java.gapan.saewe.model.TaxationBean;
import main.java.gapan.saewe.service.ISaeweService;
import main.java.gapan.saewe.web.BugaWebControl;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
//********** BEGIN_����_20120228
// rojumJumyongService ��
import main.java.rojum.jumyong.service.IJumyongService; 
//********** END_����_20120228

public class SaeweControl	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	ISysConnectService	iSysConnectService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setGapan_saeweService(ISaeweService gapan_saeweService) 
	{
		this.iSaeweService = gapan_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	public void setSysConnectService(ISysConnectService sysConnectService)
	{
		this.iSysConnectService = sysConnectService;
	}
	//********** BEGIN_����_20120228
	// �ΰ� öȸ�� ������ ���� ���̺��� �����ϱ� ������ �������� ����ϴ� Bean�� ȣ���Ͽ� �ΰ� öȸ ��
	private IJumyongService objJumyongService = null;
	
	public void setRojum_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	//********** END_����_20120228
	//	�ΰ� ��ȸ ȭ��
	public ModelAndView Search(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
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
				String	today		= formatter.format(cal.getTime());
				cal.add(Calendar.MONTH, -3);
				String	beforeDay		= formatter.format(cal.getTime());
				
				String	YEAR		= ServletRequestUtils.getStringParameter(request, "YEAR", today.substring(0,4));
				String  FT_TYP 		= ServletRequestUtils.getStringParameter(request,"FT_TYP","");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				String 	CAL_MODE 	= ServletRequestUtils.getStringParameter(request, "CAL_MODE", "");
				String	GU_CD		= ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				
				
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
				
				bind(request, bugwaSearchBean);
				
				bugwaSearchBean.setSIDO(SIDO_CD);
				bugwaSearchBean.setSIGUNGU(GU_CD);
				
				//2018-05-25
				if(GU_CD.equals("000"))
					bugwaSearchBean.setSIGUNGU("%");	
				
				bugwaSearchBean.setYEAR(YEAR);
				bugwaSearchBean.setFT_TYP(FT_TYP);
				
				bugwaSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
				bugwaSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
				bugwaSearchBean.setCAL_MODE(CAL_MODE);
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	�˻��� ������ �Ѱ����� �����´�.
				int	iTotalCnt	= iSaeweService.executeCount(bugwaSearchBean);
				
				//	�˻��� �����͸� �����´�.
				list	= iSaeweService.executeSearch(bugwaSearchBean);
				SaeweBean	Bean	= new SaeweBean();
				int			size	= list.size();
			
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (SaeweBean)list.get(i);
					
					//	�ΰ�����
		        	Bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", Bean.getTAX_YN()));
		        	
		        	//********** BEGIN_KANG_20120404
		        	Bean.setSUNAP_YN(commonCode.executeSearchCommonCode("sunap_part", Bean.getSUNAP_YN()));
		        	//********** END_KANG_20120404
		        	
		        	//	��ϱⰣ
		        	Bean.setREQ_DATE(util.Date_Paste(Bean.getREQ_DATE()));
		        			
		           	if(Bean.getFROMDATE() != null)	//	����Ⱓ
		        		Bean.setSANCHULGIGAN(util.Date_Paste(Bean.getFROMDATE()) + " ~ " + util.Date_Paste(Bean.getTODATE()));
				}
				
				request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", bugwaSearchBean.getUSE_SECTION(), "��ü"));		//  ��������								//	��������
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", "1", "��ü"));						//	��������
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", bugwaSearchBean.getSECTION(), "��ü"));		//	���뱸��
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", bugwaSearchBean.getOWNER_SET(), "��ü"));		//	������
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", bugwaSearchBean.getTAX_SET(), "��ü"));	//	���Ա���
				request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getBJ_CD()));	//	������
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getHJ_CD()));	//	������
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", bugwaSearchBean.getTAX_YN(), "��ü"));				//	�ΰ�����
				request.setAttribute("refund_yn", commonCode.executeCommonCode("refund_yn", bugwaSearchBean.getREFUND_YN(), "��ü"));				//	ȯ�ҿ���
				request.setAttribute("CAL_MODE", CAL_MODE);
				//********** BEGIN_KANG_20120404
				request.setAttribute("sunap_part", commonCode.executeCommonCode("sunap_part", bugwaSearchBean.getSUNAP_YN(), "��ü"));		//  ��������//
				//********** END_KANG_20120404
				request.setAttribute("YEAR", YEAR);
				request.setAttribute("FT_TYP", FT_TYP);
		 
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("USE_SECTION", bugwaSearchBean.getUSE_SECTION());
				request.setAttribute("TYPE", bugwaSearchBean.getTYPE());

				if(bugwaSearchBean.getBONBUN().equals("%")){
					request.setAttribute("BONBUN", "");
				}else{
					request.setAttribute("BONBUN", bugwaSearchBean.getBONBUN());
				}
				if(bugwaSearchBean.getBUBUN().equals("%")){
					request.setAttribute("BUBUN", "");
				}else{
					request.setAttribute("BUBUN", bugwaSearchBean.getBUBUN());
				}
				
				request.setAttribute("NAME", bugwaSearchBean.getNAME());
				request.setAttribute("ADMINNO", bugwaSearchBean.getADMINNO());
				request.setAttribute("CAL_YN", bugwaSearchBean.getCAL_YN());
				request.setAttribute("currentPage", String.valueOf(currentPage));
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("message", message);
			}
		} catch(Exception e){
			logger.error(e.getMessage(), e);
		}
		//********** BEGIN_KANG_20120404
		//return new ModelAndView("/gapan/saewe/search", "blist", list);
		if(message.equals("Excel")){
			return new ModelAndView("/gapan/saewe/excel_search", "blist", list);
		}else{
			return new ModelAndView("/gapan/saewe/search", "blist", list);
		}		
		//********** END_KANG_20120404
		
	}
	
	//********** BEGIN_KANG_20120404
	/*
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
				String	today		= formatter.format(cal.getTime());
				cal.add(Calendar.MONTH, -3);
				String	beforeDay		= formatter.format(cal.getTime());
				
				String	YEAR		= ServletRequestUtils.getStringParameter(request, "YEAR", today.substring(0,4));
				String  FT_TYP 		= ServletRequestUtils.getStringParameter(request,"FT_TYP","");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				String 	CAL_MODE 	= ServletRequestUtils.getStringParameter(request, "CAL_MODE", "");
				String	GU_CD		= ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				
				BugwaSearchBean	bugwaSearchBean	= new BugwaSearchBean();
				
				bind(request, bugwaSearchBean);
				
				bugwaSearchBean.setSIDO(SIDO_CD);
				bugwaSearchBean.setSIGUNGU(GU_CD);
				
				bugwaSearchBean.setYEAR(YEAR);
				bugwaSearchBean.setFT_TYP(FT_TYP);
				
				bugwaSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
				bugwaSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
				bugwaSearchBean.setCAL_MODE(CAL_MODE);
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	�˻��� ������ �Ѱ����� �����´�.
				int	iTotalCnt	= iSaeweService.executeCount(bugwaSearchBean);
				
				//	�˻��� �����͸� �����´�.
				list	= iSaeweService.executeSearch(bugwaSearchBean);
				SaeweBean	Bean	= new SaeweBean();
				int			size	= list.size();
			
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (SaeweBean)list.get(i);
					
					//	�ΰ�����
		        	Bean.setTAX_YN(commonCode.executeSearchCommonCode("taxation_yn", Bean.getTAX_YN()));
		        	
		        	//	��ϱⰣ
		        	Bean.setREQ_DATE(util.Date_Paste(Bean.getREQ_DATE()));
		        			
		           	if(Bean.getFROMDATE() != null)	//	����Ⱓ
		        		Bean.setSANCHULGIGAN(util.Date_Paste(Bean.getFROMDATE()) + " ~ " + util.Date_Paste(Bean.getTODATE()));
				}
				
				request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", bugwaSearchBean.getUSE_SECTION(), "��ü"));		//  ��������								//	��������
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", "1", "��ü"));						//	��������
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", bugwaSearchBean.getSECTION(), "��ü"));		//	���뱸��
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", bugwaSearchBean.getOWNER_SET(), "��ü"));		//	������
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", bugwaSearchBean.getTAX_SET(), "��ü"));	//	���Ա���
				request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getBJ_CD()));	//	������
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bugwaSearchBean.getHJ_CD()));	//	������
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", bugwaSearchBean.getTAX_YN(), "��ü"));				//	�ΰ�����
				request.setAttribute("refund_yn", commonCode.executeCommonCode("refund_yn", bugwaSearchBean.getREFUND_YN(), "��ü"));				//	ȯ�ҿ���
				request.setAttribute("CAL_MODE", CAL_MODE);
				
				request.setAttribute("YEAR", YEAR);
				request.setAttribute("FT_TYP", FT_TYP);
		 
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("USE_SECTION", bugwaSearchBean.getUSE_SECTION());
				request.setAttribute("TYPE", bugwaSearchBean.getTYPE());

				if(bugwaSearchBean.getBONBUN().equals("%")){
					request.setAttribute("BONBUN", "");
				}else{
					request.setAttribute("BONBUN", bugwaSearchBean.getBONBUN());
				}
				if(bugwaSearchBean.getBUBUN().equals("%")){
					request.setAttribute("BUBUN", "");
				}else{
					request.setAttribute("BUBUN", bugwaSearchBean.getBUBUN());
				}
				
				request.setAttribute("NAME", bugwaSearchBean.getNAME());
				request.setAttribute("ADMINNO", bugwaSearchBean.getADMINNO());
				request.setAttribute("CAL_YN", bugwaSearchBean.getCAL_YN());
				request.setAttribute("currentPage", String.valueOf(currentPage));
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("message", message);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/saewe/excel_search", "blist", list);
	}
	*/
	//	�ΰ� ��ȸ ȭ��(Excel)
	public ModelAndView Excel_Search(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
	{
		return Search(request,response,"Excel");
	}
	//********** END_KANG_20120404
	//	�˻� ������ �Ҹ��� �����ϱ� ����  �����͸� ������ �ִ´�.
	public ModelAndView 	View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String 	GAPAN_NO = "";
		String	SEQ		= "";
		
		try{
			if(userId != null)
			{
		
				GAPAN_NO 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				SEQ 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				
				request.setAttribute("GAPAN_NO", GAPAN_NO);
				request.setAttribute("SEQ", SEQ);
				
				/* [20130417] yjmoon �˻� �ɼ�  Param */
				Map<String, Object> maps = new HashMap<String, Object>();
				maps.put("GIGAN1", ServletRequestUtils.getStringParameter(request, "GIGAN1", ""));
				maps.put("GIGAN2", ServletRequestUtils.getStringParameter(request, "GIGAN2", ""));
				maps.put("PURPOSE_CD", ServletRequestUtils.getStringParameter(request, "PURPOSE_CD", ""));
				maps.put("BONBUN", ServletRequestUtils.getStringParameter(request, "BONBUN", ""));
				maps.put("BUBUN", ServletRequestUtils.getStringParameter(request, "BUBUN", ""));
				maps.put("NAME", ServletRequestUtils.getStringParameter(request, "NAME", ""));
				maps.put("ADMINNO", ServletRequestUtils.getStringParameter(request, "ADMINNO", ""));
				maps.put("TYPE", ServletRequestUtils.getStringParameter(request, "TYPE", ""));
				maps.put("SECTION", ServletRequestUtils.getStringParameter(request, "SECTION", ""));
				maps.put("OWNER_SET", ServletRequestUtils.getStringParameter(request, "OWNER_SET", ""));
				maps.put("BJ_CD", ServletRequestUtils.getStringParameter(request, "BJ_CD", ""));
				maps.put("HJ_CD", ServletRequestUtils.getStringParameter(request, "HJ_CD", ""));
				maps.put("TAX_YN", ServletRequestUtils.getStringParameter(request, "TAX_YN", ""));
				maps.put("currentPage", ServletRequestUtils.getIntParameter(request, "currentPage", 1));
				
				request.setAttribute("SEARCH_OPTIONS", maps);
//				logger.info("view::: req.params = " + maps);
			}	
		} catch(Exception e){
			logger.error(e.getMessage(), e);
		}
		
		return new ModelAndView("/gapan/saewe/view", "GAPAN_NO", GAPAN_NO);
	}

	
	//	���ܼ��Ժΰ�
	public ModelAndView 	Saewesuipbugwa(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		try{
			System.out.println("!! ���ܼ��Ժΰ� ");
			BugaWebControl	bugaWebControl	= new BugaWebControl();
			
			String 	GAPAN_NO	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
			String 	SEQ			= ServletRequestUtils.getStringParameter(request, "SEQ", "");
			
	
			//	�����͸� �����´�.
			List	list 	= iSaeweService.executeBugwa_View_GpTyp(GAPAN_NO, SEQ);
			
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
						System.out.println("Bean.getSIGU_CD() ==> " + Bean.getTAXPAYER_ID());
						System.out.println("Bean.getSIGU_CD() ==> " + Bean.getHJ_CD());
//						if(Bean.getDEPT_CD().equals(userInfoBean.getDEPT_CD()) && Bean.getSIGU_CD().equals(userInfoBean.getSIGU_CD()))
//						{
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
									iSaeweService.SaeweSuipBugwa_Taxation_Info(GAPAN_NO, SEQ, bugaRegistBean.getInsertKey());
									//iSaeweService.SaeweSuipBugwa_Admin_Base(ADMIN_NO, SEQ);
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
							iSysConnectService.Sys_Connect_Info(GAPAN_NO,"2",user_id, "1",result);	//�����̷µ��
//						}
//						else
//							message = "�ñ��ڵ�/�μ��ڵ� ����ġ";  // �ñ��ڵ�,�μ��ڵ� ����ġ
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
		String result = "";
		int reqCount = 0;
		int failCount = 0;

		for (int j = 0; j < select_item.length; j++) {
			System.out.println("gapan_no_arr ------> " + gapan_no_arr[j]);
			System.out.println("search_seq ------> " + seq_arr[j]);
			
			String GAPAN_NO = gapan_no_arr[j];
			String SEQ = seq_arr[j];

			if (select_item[j].equals("true")) {

				BugwaSearchBean bugwaSearchBean = new BugwaSearchBean();

				bugwaSearchBean.setADMINNO(gapan_no_arr[j]);
				bugwaSearchBean.setSIDO(SIDO_CD);
				bugwaSearchBean.setSIGUNGU(userBean.getSIGU_CD());
				bugwaSearchBean.setSEQ(seq_arr[j]);

				// �˻��� �����͸� �����´�.
				List list = iSaeweService.executeBugwa_View_GpTyp(GAPAN_NO,SEQ);

				System.out.println("list.size -----> " + list.size());

				TaxationBean Bean = new TaxationBean();
				BugaRegistBean bugaRegistBean = new BugaRegistBean();
				BugaWebControl bugaWebControl = new BugaWebControl();

				if (list.size() > 0) {
					String bugwa_id = "";

						Bean = (TaxationBean) list.get(0);

						// String user_id = "1111111400049";
						bugwa_id = iSaeweService.executeBugwa_Id(user_id);
						System.out.println("user_id ==> " + user_id);
						System.out.println("bugwa_id ==> " + bugwa_id);

						bugaRegistBean = bugaWebControl.insertBugaRegist(Bean, request, bugwa_id, commonCode);

						if (bugaRegistBean != null
								&& bugaRegistBean.getErrorMsg() == null) // �ΰ�
																			// ����
						{
							if (bugaRegistBean.getInsertKey().equals("") || bugaRegistBean.getInsertKey() == null) {
								message = "������ȣ������ �����Ͽ����ϴ�.";
							} else {
								iSaeweService.SaeweSuipBugwa_Taxation_Info(GAPAN_NO, SEQ, bugaRegistBean.getInsertKey());

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

						iSysConnectService.Sys_Connect_Info(GAPAN_NO, "2", user_id, "1", result); // �����̷µ��

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
	
	//********** BEGIN_����_20120228
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
	        
	            
	        int listCount = 0;	            
	        
	        for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
	        	if(ITEM_CHECK_ARR[i].equals("true")){
	        		objJumyongService.executebugwaCancel(GAPAN_NO_ARR[i],SEQ_ARR[i]);
	        		listCount++;
            	}
            }
				
			message = listCount + "�ǿ� ���ؼ� �ΰ� öȸ�Ǿ����ϴ�.";
		
		}
		catch (Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
		}
		
		return Search( request, response, message);
	}
	//********** END_����_20120228	
}