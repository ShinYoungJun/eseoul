
package main.java.facility.gigan.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.gigan.model.GiganBean;
import main.java.facility.gigan.model.GiganSearchBean;
import main.java.facility.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class GiganControl	extends MultiActionController{

	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setFacility_giganService(IGiganService facility_giganService) 
	{
		this.iGiganervice = facility_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	//	����� �˻� 
	public ModelAndView 	Search(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
				
		try{
			if(userId != null){
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
				
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				
				GiganSearchBean	giganSearchBean	= new GiganSearchBean();
				
				//	�˻� ������ ���ε� �Ѵ�.
				bind(request, giganSearchBean);
				
				giganSearchBean.setSIDO(SIDO_CD);
				giganSearchBean.setSIGUNGU(userBean.getSIGU_CD());
				
				giganSearchBean.setGIGAN1(util.Date_Cut(GIGAN1));
				giganSearchBean.setGIGAN2(util.Date_Cut(GIGAN2));
				
				int	 	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	�������� �� ������ �����´�.
				int		iTotalCnt	= iGiganervice.executeCount(giganSearchBean);
				
				//	����¡ ó��
				int		rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
				
				//	�˻��� �����͸� �����´�.
				list	= iGiganervice.executeSearch(giganSearchBean, rowCol, rowCol + 9);
			//	List		blist	= new ArrayList();
				GiganBean	Bean	= new GiganBean();
				int			size	= list.size();
				String		jumyongji	= "";
				
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (GiganBean)list.get(i);
					
		//			Bean.setTYPE(commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));	//	��������
					
					//	������
					jumyongji	= commonCode.executeSearchBJDongCode(SIDO_CD, userBean.getSIGU_CD(), Bean.getBJ_CD());
					
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
					
					Bean.setGIGAN(util.Date_Paste(Bean.getMUL_FROMDATE()) + " ~ " + util.Date_Paste(Bean.getMUL_TODATE()));
				}
				
		//		request.setAttribute("use_type", commonCode.executeCommonCode("use_type", giganSearchBean.getTYPE(), "��ü"));			//	��������
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", giganSearchBean.getOWNER_SET(), "��ü"));		//	������
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", giganSearchBean.getTAX_SET(), "��ü"));	//	���Ա���	
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), giganSearchBean.getBJ_CD()));	//	������
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), giganSearchBean.getHJ_CD()));	//	������
			
				request.setAttribute("GIGAN1", util.Date_Paste(GIGAN1));
				request.setAttribute("GIGAN2", util.Date_Paste(GIGAN2));
		//		request.setAttribute("TYPE", giganSearchBean.getTYPE());
				request.setAttribute("PURPOSE_CD", giganSearchBean.getPURPOSE_CD());
				request.setAttribute("BONBUN", giganSearchBean.getBONBUN());
				request.setAttribute("BUBUN", giganSearchBean.getBUBUN());
				request.setAttribute("NAME", giganSearchBean.getNAME());
				request.setAttribute("CORP_CD", giganSearchBean.getCORP_CD());
				request.setAttribute("GU_CODE", giganSearchBean.getGU_CODE());
			//	request.setAttribute("currentPage", String.valueOf(currentPage));
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/gigan/search", "blist", list);
	}

	
	public ModelAndView 	View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	CORP_CD 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		String 	GU_CODE 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		
		//	�˻� ������ �Ҹ��� ���� ���� ȭ�鿡 �����Ѵ�.
		Search_Date(request, response);
		
		return new ModelAndView("/facility/gigan/view", "CORP_CD", CORP_CD);
	}
	
	//	�ϰ�ó��ȭ��
	public ModelAndView 	View_Ilgwal(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
				
		try{
			if(userId != null){
				String 	ADMINNO 	= ServletRequestUtils.getStringParameter(request, "ADMINNO", "");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
				
				String	PURPOSE_CD	= ServletRequestUtils.getStringParameter(request, "PURPOSE_CD", "");
				String	BONBUN		= ServletRequestUtils.getStringParameter(request, "BONBUN", "");
				String	BUBUN		= ServletRequestUtils.getStringParameter(request, "BUBUN", "");
				String	NAME		= ServletRequestUtils.getStringParameter(request, "NAME", "");
				
				String	TYPE		= ServletRequestUtils.getStringParameter(request, "TYPE", "");
				String	OWNER_SET	= ServletRequestUtils.getStringParameter(request, "OWNER_SET", "");
				String	TAX_SET		= ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
				String	BJ_CD		= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
				String	HJ_CD		= ServletRequestUtils.getStringParameter(request, "HJ_CD", "");
		
				request.setAttribute("TYPE", TYPE);				//	��������
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
		
		return new ModelAndView("/facility/gigan/view_ilgwal");
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
		String 	CORP_CD		= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		String  GU_CODE		= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String  REQUEST_NO		= ServletRequestUtils.getStringParameter(request, "REQUEST_NO", "");
		String  OBJECT_NO		= ServletRequestUtils.getStringParameter(request, "OBJECT_NO", "");
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
		request.setAttribute("CORP_CD", CORP_CD);
		request.setAttribute("GU_CODE", GU_CODE);
		request.setAttribute("REQUEST_NO", REQUEST_NO);
		request.setAttribute("OBJECT_NO", OBJECT_NO);
		request.setAttribute("TYPE", TYPE);
		request.setAttribute("OWNER_SET", OWNER_SET);
		request.setAttribute("TAX_SET", TAX_SET);
		request.setAttribute("BJ_CD", BJ_CD);
		request.setAttribute("HJ_CD", HJ_CD);
		request.setAttribute("currentPage", currentPage);
	}
}
