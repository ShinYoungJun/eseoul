package main.java.gapan.gapan.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.commonCode.model.ContactSysInfoBean;
import main.java.common.commonCode.model.RefDeptCodeBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.gapan.gapan.model.OperatorBean;
import main.java.gapan.gapan.model.FamilyBean;
import main.java.gapan.gapan.model.BloomBean;
import main.java.gapan.gapan.model.OperBean;
import main.java.gapan.gapan.service.IGapanService;
import main.java.jumyong.minwon.model.AppealBean;
import main.java.jumyong.minwon.web.SOWNN00214Control;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class GapanControl	extends MultiActionController{

	private	IGapanService		iGapanservice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	public void setGapanService(IGapanService gapanService) 
	{
		this.iGapanservice = gapanService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode = commonCode;
	}
	
	public ModelAndView Search(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		SOWNN00214Control	sown00214Control	= null;
		List	list	= null;
		
		try{
			
			if(userId != null)
			{

				sown00214Control	= new SOWNN00214Control();
				
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				cal.add(Calendar.DATE, -2);
				String	beforeDay	= formatter.format(cal.getTime());
				
				String 	LISTVIEW	= ServletRequestUtils.getStringParameter(request, "LISTVIEW", "0");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				String 	MIN_NAME 	= ServletRequestUtils.getStringParameter(request, "MIN_NAME", "");
				String 	MIN_CHECK 	= ServletRequestUtils.getStringParameter(request, "MIN_CHECK", "");
				String 	MIN_PROCESS	= ServletRequestUtils.getStringParameter(request, "MIN_PROCESS", "");
		
				int	 	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				request.setAttribute("check_yn", commonCode.executeCommonCode("check_yn", MIN_CHECK, "��ü"));	//	����
				request.setAttribute("process_flag", commonCode.executeCommonCode("process_flag", MIN_PROCESS, "��ü"));	//	ó��
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("MIN_NAME", MIN_NAME);
				
				if(LISTVIEW.trim().equals("0"))	//	�� �������� ó�� �����Ҷ��� ���������� ����� ���� �ٽ� �� �������� ȣ���Ѵ�.
				{
					request.setAttribute("LISTVIEW", "0");
					request.setAttribute("currentPage", "1");
					request.setAttribute("totalcnt", "0");
					return new ModelAndView("/gapan/gapan/search");
				}
				
				//	���� �����͸� �����´�
//				List	list	= sown00214Control.SaewolList(util.Date_Cut(GIGAN1), util.Date_Cut(GIGAN2), MIN_REQNO, MIN_NAME, currentPage, 10);
//				���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String dept_cd = (String)session.getAttribute("dept_cd");
				
				//������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				ContactSysInfoBean contactSysInfoBean = commonCode.executeContactsys_Info(SIDO_CD, userBean.getSIGU_CD());
				RefDeptCodeBean refDeptCodeBean = commonCode.getRef_DeptCode(SIDO_CD + userBean.getSIGU_CD());
				list	= sown00214Control.SaewolList(util.Date_Cut(GIGAN1), util.Date_Cut(GIGAN2), MIN_NAME, currentPage, 10
						,contactSysInfoBean.getSAEALL_IP(),contactSysInfoBean.getSAEALL_PATH(),contactSysInfoBean.getSAEALL_PORT()
						//,refDeptCodeBean.getDEPT_CD()
						,dept_cd
						,refDeptCodeBean.getORG_CD());
				
				int	iTotalCnt	= sown00214Control._Size;
				
				//	����¡ ó��
				pageing.execute(request, iTotalCnt, currentPage, 10);
		
				AppealBean	Bean	= new AppealBean();
				int			size	= list.size();
//				String		yn		= "1";
		
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (AppealBean)list.get(i);
		
//		        	if(Bean.getTODATE() == null	||	Bean.getTODATE().trim().equals(""))
//		        		yn	= "0";
		
		        	Bean.setREQ_DATE(util.Date_Paste(Bean.getREQ_DATE()));	//	��������
		        	Bean.setTODATE(util.Date_Paste(Bean.getTODATE()));		//	ó������
				}
				
				request.setAttribute("LISTVIEW", "1");
				
				sown00214Control	= null;
			
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
				
		return new ModelAndView("/gapan/gapan/search", "blist", list);
	}

	//	�ű� ��� ������
	public ModelAndView		Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		return new ModelAndView("/gapan/gapan/register");
	}
	
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		try{
			if(userId != null)
			{
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
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		return new ModelAndView("/gapan/gapan/view");
	}
	
	public ModelAndView operator_view(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		OperatorBean Bean = null;
		
		try{
			if(userId != null)
			{
				String gapanNo = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
					
				List list = iGapanservice.getOperatorInfo(gapanNo);
				Bean = new OperatorBean();
				
				if(list.size()<=0)
					Bean = null;
				else
				{
					Bean = (OperatorBean)list.get(0);
				}
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}

		return new ModelAndView("/gapan/gapan/tab/operator_view", "info", Bean);
	}
	
	
	public ModelAndView family_view(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		FamilyBean info = null;
		
		try{
			if(userId != null)
			{
				String gapanNo = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				
				info = iGapanservice.getFamilyInfo(gapanNo);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/gapan/gapan/tab/family_view", "info", info);
	}
	
	public ModelAndView bloom_view(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		BloomBean info = null;
		
		try{
			if(userId != null)
			{
				String gapanNo = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				
				info = iGapanservice.getBloomInfo(gapanNo);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/gapan/tab/bloom_view", "info", info);
	}
	
	public ModelAndView oper_view(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		OperBean info = null;
		
		try{
			if(userId != null)
			{
				String gapanNo = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				
				info = iGapanservice.getOperInfo(gapanNo); 
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/gapan/tab/oper_view", "info", info);
	}	
}
