//	2009		Kim Yun Seo

package main.java.jumyong.minwon.web;


import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.ContactSysInfoBean;
import main.java.common.commonCode.model.RefDeptCodeBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.minwon.model.AppealBean;
import main.java.jumyong.minwon.service.IMinwonService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class MinwonControl	extends MultiActionController {

	private	IMinwonService		iMinwonService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setJumyong_minwonService(IMinwonService jumyong_minwonService) 
	{
		this.iMinwonService = jumyong_minwonService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	//	�ο���ȸ �˻� �� ����Ʈ(���� �����͸� �����´�)
	public ModelAndView 	Search(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{		
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");							
		List list = null;
		
		try{
			if(userId != null){

				SOWNN00214Control	sown00214Control	= new SOWNN00214Control();
					
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today					= formatter.format(cal.getTime());
				cal.add(Calendar.DATE, -2);
				String	beforeDay				= formatter.format(cal.getTime());
				
				
				String 	LISTVIEW	= ServletRequestUtils.getStringParameter(request, "LISTVIEW", "0");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				String 	MIN_NAME 	= ServletRequestUtils.getStringParameter(request, "MIN_NAME", "");
		//		String 	MIN_REQNO 	= ServletRequestUtils.getStringParameter(request, "MIN_REQNO", "");
				String 	MIN_CHECK 	= ServletRequestUtils.getStringParameter(request, "MIN_CHECK", "");
				String 	MIN_PROCESS	= ServletRequestUtils.getStringParameter(request, "MIN_PROCESS", "");
		
				int	 	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				request.setAttribute("check_yn", commonCode.executeCommonCode("check_yn", MIN_CHECK, "��ü"));	//	����
				request.setAttribute("process_flag", commonCode.executeCommonCode("process_flag", MIN_PROCESS, "��ü"));	//	ó��
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("MIN_NAME", MIN_NAME);
		//		request.setAttribute("MIN_REQNO", MIN_REQNO);
				/*
				if(LISTVIEW.trim().equals("0"))	//	�� �������� ó�� �����Ҷ��� ���������� ����� ���� �ٽ� �� �������� ȣ���Ѵ�.
				{
					request.setAttribute("LISTVIEW", "0");
					request.setAttribute("currentPage", "1");
					request.setAttribute("totalcnt", "0");
					return new ModelAndView("/jumyong/minwon/search");
				}
				*/
				//	���� �����͸� �����´�
		//		List	list	= sown00214Control.SaewolList(util.Date_Cut(GIGAN1), util.Date_Cut(GIGAN2), MIN_REQNO, MIN_NAME, currentPage, 10);
		
				//���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String dept_cd = (String)session.getAttribute("dept_cd");
				
				//������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				System.out.println("SIDO_CD== " + SIDO_CD);
				System.out.println("userBean.getSIGU_CD()== " + userBean.getSIGU_CD());
				System.out.println("dept_cd=== " + dept_cd);
				ContactSysInfoBean contactSysInfoBean = commonCode.executeContactsys_Info(SIDO_CD, userBean.getSIGU_CD());
				RefDeptCodeBean refDeptCodeBean = commonCode.getRef_DeptCode(SIDO_CD + userBean.getSIGU_CD());

				int	iTotalCnt = 0;
				
				if(!refDeptCodeBean.getORG_CD().equals("0000000")){

				list	= sown00214Control.SaewolList(util.Date_Cut(GIGAN1), util.Date_Cut(GIGAN2), MIN_NAME, currentPage, 10
						,contactSysInfoBean.getSAEALL_IP(),contactSysInfoBean.getSAEALL_PATH(),contactSysInfoBean.getSAEALL_PORT()
						//,refDeptCodeBean.getDEPT_CD()
						,dept_cd
						,refDeptCodeBean.getORG_CD());
				
				
				iTotalCnt	= sown00214Control._Size;
				}
				
				//	����¡ ó��
				pageing.execute(request, iTotalCnt, currentPage, 10);
		
				AppealBean	Bean	= new AppealBean();
				int			size	= list.size();
			//	String		yn		= "1";
		
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (AppealBean)list.get(i);
		
		     //   	if(Bean.getTODATE() == null	||	Bean.getTODATE().trim().equals(""))
		     //   		yn	= "0";
		
		        	Bean.setREQ_DATE(util.Date_Paste(Bean.getREQ_DATE()));	//	��������
		        	Bean.setTODATE(util.Date_Paste(Bean.getTODATE()));		//	ó������
				}
				
				request.setAttribute("LISTVIEW", "1");
				
				sown00214Control	= null;
				
			}
		}catch(Exception e)
		{
			logger.error(e.getMessage(), e);
		}	
		return new ModelAndView("/jumyong/minwon/search", "blist", list);
	}

	//	�󼼺���
	public ModelAndView		View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");							
		
		try{
			if(userId != null){
				String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
				String 	MIN_NAME 	= ServletRequestUtils.getStringParameter(request, "MIN_NAME", "");
				String 	MIN_REQNO 	= ServletRequestUtils.getStringParameter(request, "MIN_REQNO", "");
				String 	MIN_CHECK 	= ServletRequestUtils.getStringParameter(request, "MIN_CHECK", "");
				String 	MIN_PROCESS	= ServletRequestUtils.getStringParameter(request, "MIN_PROCESS", "");
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("MIN_CHECK", MIN_CHECK);		//	����
				request.setAttribute("MIN_PROCESS", MIN_PROCESS);	//	ó��
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("MIN_NAME", MIN_NAME);
				request.setAttribute("MIN_REQNO", MIN_REQNO);
				
			//	System.out.println("!!!!!!!!!!!!//	�󼼺���!!!!!!!!! : " + ADMIN_NO);
			}
		}catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		return new ModelAndView("/jumyong/minwon/view");
	}

	
	//	�ű� ��� ������
	public ModelAndView		Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		System.out.println("MinwonControl.Register");
		//	 ���� ����
	//	HttpSession session = request.getSession();
	//	session.setAttribute("sessionUserId", "�屸��");
		
		return new ModelAndView("/jumyong/minwon/register");
	}

	
//	//	ADMIN_BASE ���
//	public String	Admin_Base_Register_Execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
//	{
//		//	���ǿ��� �õ� �ڵ带 �����´�.
//		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
//		
//		//	������ �����͸� �����´�.
//		UserBean	userBean	= new UserBean();
//		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
//
//		String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE", "");
//		String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER", "");
//		
//		String 	BJ_CD 	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
//		String 	TYPE 	= ServletRequestUtils.getStringParameter(request, "TYPE", "");
//		String 	SI_CD 	= SIDO_CD;	//	�õ� �ڵ带 �����´�.
//		String 	GU_CD 	= userBean.getSIGU_CD();
//		
//		Admin_BaseBean	Bean	= new Admin_BaseBean();
//
//		//	������ ��ȣ ����
//		String	adminno	= Adminno_Maker(SI_CD, GU_CD, BJ_CD, TYPE);
//		Bean.setADMIN_NO(adminno);
////		Bean.setSEQ("0");
//		Bean.setREGDATE(util.Date_Cut(REGDATE));
//		Bean.setUP_DATE(util.Date_Cut(REGDATE));
//		Bean.setMANAGER(MANAGER);
//		Bean.setFINISH_ID("ADMIN");
//		Bean.setCHECK_YN("0");
//		
//		//	ADMIN_BASE ���̺� �����͸� ����Ѵ�.
//		boolean	result	= iMinwonService.executeAdmin_Base_Register(Bean);
//		
//		if(result == false)
//			return	null;
//		
//		return	adminno;
//	}
	
//	//	�ο���� �߰�
//	public String		Appeal_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
//	{
//		//	���ǿ� �ִ� ������ �����͸� �����´�.
//		UserBean	userBean	= new UserBean();
//		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
//		
//		AppealBean	appealBean	= new AppealBean();
//		bind(request, appealBean);
//		
//		//	"-" �� �����Ѵ�.
//		//	�ֹι�ȣ
//		String	jumin_ssn		= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "").equals(""))
//			jumin_ssn		= ServletRequestUtils.getStringParameter(request, "jumin_ssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "");
//	
//		//	����� ��Ϲ�ȣ
//		String	jumin_bizssn	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "").equals(""))
//			jumin_bizssn	= ServletRequestUtils.getStringParameter(request, "jumin_bizssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn2", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "");
//
//		//	�ο� ��ȭ��ȣ
//		String	min_agent_tel	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "min_agent_tel3", "").equals(""))
//		{
//			min_agent_tel	= ServletRequestUtils.getStringParameter(request, "min_agent_tel1", "") + "-" +
//			ServletRequestUtils.getStringParameter(request, "min_agent_tel2", "") + "-" +
//				ServletRequestUtils.getStringParameter(request, "min_agent_tel3", "");
//		}
//		
//		//	������ ��ȭ��ȣ
//		String	jumin_tel	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_tel3", "").equals(""))
//		{
//			jumin_tel	= ServletRequestUtils.getStringParameter(request, "jumin_tel1", "") + "-" +
//			ServletRequestUtils.getStringParameter(request, "jumin_tel2", "") + "-" +
//				ServletRequestUtils.getStringParameter(request, "jumin_tel3", "");
//		}
//		
//		//	������ �޴���
//		String	jumin_hp	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_hp3", "").equals(""))
//		{
//			jumin_hp	= ServletRequestUtils.getStringParameter(request, "jumin_hp1", "") + "-" +
//			ServletRequestUtils.getStringParameter(request, "jumin_hp2", "") + "-" +
//				ServletRequestUtils.getStringParameter(request, "jumin_hp3", "");
//		}
//		
//		//	������ ������ ��ȭ��ȣ
//		String	jumin_totel	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_totel3", "").equals(""))
//		{
//			jumin_totel	= ServletRequestUtils.getStringParameter(request, "jumin_totel1", "") + "-" +
//			ServletRequestUtils.getStringParameter(request, "jumin_totel2", "") + "-" +
//				ServletRequestUtils.getStringParameter(request, "jumin_totel3", "");
//		}
//		
//		//	������ ������ �޴���
//		String	jumin_tohp	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_tohp3", "").equals(""))
//		{
//			jumin_tohp	= ServletRequestUtils.getStringParameter(request, "jumin_tohp1", "") + "-" +
//			ServletRequestUtils.getStringParameter(request, "jumin_tohp2", "") + "-" +
//				ServletRequestUtils.getStringParameter(request, "jumin_tohp3", "");
//		}
//		
//		appealBean.setSSN(jumin_ssn);
//		appealBean.setBIZSSN(jumin_bizssn);
//		
//		appealBean.setAGENT_TEL(min_agent_tel);
//		appealBean.setTEL(jumin_tel);
//		appealBean.setHP(jumin_hp);
//		appealBean.setTOTEL(jumin_totel);
//		appealBean.setTOHP(jumin_tohp);
//		
//		
//		appealBean.setREQ_DATE(util.Date_Cut(appealBean.getREQ_DATE()));	//	��������
//		appealBean.setPREDATE(util.Date_Cut(appealBean.getPREDATE()));		//	ó����������
//		appealBean.setTODATE(util.Date_Cut(appealBean.getTODATE()));		//	ó����������
//		
//		appealBean.setREQ_CK("1");
//		appealBean.setGU_CODE("IN" + userBean.getSIGU_CD());
//		
//		//	������ ��ȣ ����
//		appealBean.setADMIN_NO(adminno);
//		
//		//	������ ���̺� ����(APPEAL => ���߿� APPEAL_INFO �� ���� ����)
//		iMinwonService.executeAppeal_Register(appealBean);
//		
//
//		return	null;
//	}
	

//	//	�ο���� �߰�
//	public boolean		Place_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
//	{
//		//	���ǿ��� �õ� �ڵ带 �����´�.
//		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
//		
//		//	���ǿ� �ִ� ������ �����͸� �����´�.
//		UserBean	userBean	= new UserBean();
//		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
//
//		PlaceBean	palceBean	= new PlaceBean();
//		bind(request, palceBean);
//		palceBean.setADMIN_NO(adminno);
//		
//		palceBean.setMUL_FROMDATE(util.Date_Cut(palceBean.getMUL_FROMDATE()));		//	���������
//		palceBean.setMUL_TODATE(util.Date_Cut(palceBean.getMUL_TODATE()));			//	����������
//		palceBean.setWORK_FROMDATE(util.Date_Cut(palceBean.getWORK_FROMDATE()));	//	���� ������
//		palceBean.setWORK_TODATE(util.Date_Cut(palceBean.getWORK_TODATE()));		//	���� ������
//		palceBean.setFINISH_DATE(util.Date_Cut(palceBean.getFINISH_DATE()));		//	�ذ�����
//		
//		palceBean.setSIDO(SIDO_CD);
//		palceBean.setSIGUNGU(userBean.getSIGU_CD());
//		
//		//	������ ���� ����(PLACE => ���߿� PLACE_INFO �� ���� ����)
//		return	iMinwonService.executePlace_Register(palceBean);
//	}
	
	//	���� ��ȣ ����
	private	String	Adminno_Maker(String SI_CD, String GU_CD, String BJ_CD, String TYPE)
	{
		String	ADMIN_NO	= null;
		try{
			Calendar 	cal 	= Calendar.getInstance();
				
			String	Year		= Integer.toString(cal.get(Calendar.YEAR));
			String	Si			= SI_CD;
			String	Gu			= GU_CD;
			String	Bj			= BJ_CD.substring(0, 3);
			String	Type		= TYPE;
			String	Seq			= null;
			int		Count		= iMinwonService.executeCheck_AdminnoCount(BJ_CD);
			int		Result		= 0;
			
			//	���ܷ� ���� ������ȣ�� �������, �ٽ� ��ȣ�� �����ϰ� ���� ������ȣ�� �ִ��� Ȯ���Ѵ�.
			for(int i = 0	;	i < 10	;	i++)
			{
				Count	+= (10001 + i);
				Seq		= Integer.toString(Count).substring(1, 5);
				
				ADMIN_NO	= Year + Si + Gu + Bj + "-" + Type + "-" + Seq;
				
				//	���� ������ȣ�� �ִ��� Ȯ��
				Result	= iMinwonService.executeCheck_Adminno(ADMIN_NO);
				
				if(Result	== 0)
					break;
			}
			
			//System.out.println(" �ű� ������ȣ : " + ADMIN_NO);
		}catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		return	ADMIN_NO;
	}
	
	
	
//	//	���ÿ���
//	//	�űԵ�� (�ο�, ������, ������) ���￡�� ������ �����͸� ����Ѵ�.
//	public ModelAndView		RegisterPrc_Saewol(HttpServletRequest request,HttpServletResponse response) throws Exception 
//	{
//		//	���ð� �����ؼ� ������ �����͸� ADMIN_BASE �� �����Ѵ�.
//		String	adminno	= AdminBase_RegisterSaewol_Execute(request, response); 
//		
//		if(adminno	!=	null)
//		{
//			//	���ð� �����ؼ� ������ �����͸� APPEAL �� �����Ѵ�.
//			Appeal_RegisterSaewol_Execute(request, response, adminno);
//	
//			//	���ð� �����ؼ� ������ �����͸� PLACE �� �����Ѵ�.
//			Place_Register_Execute(request, response, adminno);
//		}
//
//		return Search(request, response);
//	}
	
//	//	�ο���� �߰�
//	public String	AdminBase_RegisterSaewol_Execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
//	{
//		//	properties ���Ͽ� �ִ� �õ� �ڵ带 �����´�.
//		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
//		
//		//	������ �����͸� �����´�.
//		UserBean	userBean	= new UserBean();
//		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
//
//		String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE", "");
//		System.out.println(" REGDATE : " + REGDATE);
//		
//		String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER", "");
//		
//		String 	BJ_CD 	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
//		String 	TYPE 	= ServletRequestUtils.getStringParameter(request, "TYPE", "");
//		String 	SI_CD 	= SIDO_CD;	//	�õ� �ڵ带 �����´�.
//		String 	GU_CD 	= userBean.getSIGU_CD();
//		
//		System.out.println(" GU_CD : " + GU_CD);
//		
//		Admin_BaseBean	Bean	= new Admin_BaseBean();
//		
//		//	������ ��ȣ ����
//		String	adminno	= Adminno_Maker(SI_CD, GU_CD, BJ_CD, TYPE);
//		Bean.setADMIN_NO(adminno);
////		Bean.setSEQ("0");
//		Bean.setREGDATE(util.Date_Cut(REGDATE));
//		Bean.setUP_DATE(util.Date_Cut(REGDATE));
//		Bean.setMANAGER(MANAGER);
//		Bean.setFINISH_ID("ADMIN");
//		Bean.setCHECK_YN("0");
//	
//		//	ADMIN_BASE �� �����Ѵ�.
//		boolean	result	= iMinwonService.executeAdmin_Base_Register(Bean);
//		
//		if(result == false)
//			return	null;
//		
//		return	adminno;
//	}
	
	
//	//	�ο���� �߰�
//	public String		Appeal_RegisterSaewol_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
//	{
//		//	������ �����͸� �����´�.
//		UserBean	userBean	= new UserBean();
//		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
//		
//		AppealBean	appealBean	= new AppealBean();
//		bind(request, appealBean);
//		
//		//	"-" �� ���� �Ѵ�.
//		String	jumin_ssn		= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "").equals(""))
//			jumin_ssn		= ServletRequestUtils.getStringParameter(request, "jumin_ssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "");
//	
//		String	jumin_bizssn	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "").equals(""))
//			jumin_bizssn	= ServletRequestUtils.getStringParameter(request, "jumin_bizssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn2", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "");		
//
//		appealBean.setSSN(jumin_ssn);
//		appealBean.setBIZSSN(jumin_bizssn);
//		
//		appealBean.setREQ_DATE(util.Date_Cut(appealBean.getREQ_DATE()));	//	��������
//		appealBean.setPREDATE(util.Date_Cut(appealBean.getPREDATE()));		//	ó����������
//		appealBean.setTODATE(util.Date_Cut(appealBean.getTODATE()));		//	ó����������
//		
//		appealBean.setREQ_CK("1");
//		appealBean.setGU_CODE("IN" + userBean.getSIGU_CD());
//		
//		appealBean.setADMIN_NO(adminno);
//
//		//	������ ������ ����
//		iMinwonService.executeAppeal_Register(appealBean);
//
//		return	null;
//	}
}
