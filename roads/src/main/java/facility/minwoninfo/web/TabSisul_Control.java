//	2009		Kim Yun Seo

package main.java.facility.minwoninfo.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.facility.minwoninfo.model.PlaceBean;
import main.java.facility.minwoninfo.service.IMinwoninfoService;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;


public class TabSisul_Control	extends MultiActionController {

	private	IMinwoninfoService	iMinwoninfoService	= null;
	private	CommonCodeService	commonCode			= null;
	private	Util				util				= new Util();

	
	public void setFacility_minwoninfoService(IMinwoninfoService facility_minwoninfoService)
	{
		this.iMinwoninfoService = facility_minwoninfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	���������� ����
	public ModelAndView		Sisul_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		PlaceBean	Bean	= new PlaceBean();
		
		try{
			if(userId != null){
				
				String 		adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
				list 	= iMinwoninfoService.executeJumji_View(adminno);
				
		
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (PlaceBean)list.get(0);
					
					request.setAttribute("use_type", commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));
					request.setAttribute("occupancy_type", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));
					request.setAttribute("use_owner_Group", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET()));
					request.setAttribute("taxation_section", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
					
					request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
					request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
				//	request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "����"));
					request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("MUL_SPC_CD", Bean.getSAN_CK()));
					
				
					Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));		//	���������
					Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));			//	����������
					Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	���� ������
					Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	���� ������
					Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	�ذ�����
					
					Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	�� �̸��Է�
					
					//	������ ����
					if(Bean.getBUBUN()	!= null)
					{
						if(!Bean.getBUBUN().trim().equals(""))
							Bean.setBUBUN("-" + Bean.getBUBUN() + "����");
						else	Bean.setBONBUN(Bean.getBONBUN() + "����");
					}
					else	Bean.setBONBUN(Bean.getBONBUN() + "����");
						
					if(Bean.getBAN()	!= null)
						if(!Bean.getBAN().trim().equals(""))
							Bean.setBAN("/" + Bean.getBAN());
					
					//	�ǹ� ����
					if(Bean.getBD_DONG()	!= null)
						if(!Bean.getBD_DONG().trim().equals(""))
							Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_DONG() + "��");
					
					if(Bean.getBD_HO()	!= null)
						if(!Bean.getBD_HO().trim().equals(""))
							Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_HO() + "ȣ");
					
					//	���� �Ⱓ
					if(Bean.getWORK_TODATE()	!= null)
						if(!Bean.getWORK_TODATE().trim().equals(""))
							Bean.setWORK_FROMDATE(Bean.getWORK_FROMDATE() + " ~ " + Bean.getWORK_TODATE());
				}
				
				request.setAttribute("ADMIN_NO", adminno);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/minwoninfo/tab/sisul_view", "board", Bean);
	}
	
	//	���������� ���� (���� �Ұ�)
	public ModelAndView		SisulInfo_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		PlaceBean	Bean	= new PlaceBean();
		
		try{
			if(userId != null){
			String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			
			list 	= iMinwoninfoService.executeJumji_View(ADMIN_NO);
	
			if(list.size()<=0)
				Bean	= null;
			else
			{
				Bean	= (PlaceBean)list.get(0);
				
				request.setAttribute("use_type", commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));
				request.setAttribute("occupancy_type", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));
				request.setAttribute("use_owner_Group", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET()));
				request.setAttribute("taxation_section", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
				
				request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
				request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
			//	request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "����"));
				request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("MUL_SPC_CD", Bean.getSAN_CK()));
				
			
				Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));		//	���������
				Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));			//	����������
				Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	���� ������
				Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	���� ������
				Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	�ذ�����
				
				Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	�� �̸��Է�
				
				//	������ ����
				if(Bean.getBUBUN()	!= null)
				{
					if(!Bean.getBUBUN().trim().equals(""))
						Bean.setBUBUN("-" + Bean.getBUBUN() + "����");
					else	Bean.setBONBUN(Bean.getBONBUN() + "����");
				}
				else	Bean.setBONBUN(Bean.getBONBUN() + "����");
					
				if(Bean.getBAN()	!= null)
					if(!Bean.getBAN().trim().equals(""))
						Bean.setBAN("/" + Bean.getBAN());
				
				//	�ǹ� ����
				if(Bean.getBD_DONG()	!= null)
					if(!Bean.getBD_DONG().trim().equals(""))
						Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_DONG() + "��");
				
				if(Bean.getBD_HO()	!= null)
					if(!Bean.getBD_HO().trim().equals(""))
						Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_HO() + "ȣ");
				
				//	���� �Ⱓ
				if(Bean.getWORK_TODATE()	!= null)
					if(!Bean.getWORK_TODATE().trim().equals(""))
						Bean.setWORK_FROMDATE(Bean.getWORK_FROMDATE() + " ~ " + Bean.getWORK_TODATE());
			}
			
			request.setAttribute("ADMIN_NO", ADMIN_NO);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/minwoninfo/tab/jumjiinfo_view", "board", Bean);
	}
	
	//	���������� ����
	public ModelAndView		Sisul_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
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
				
			//	System.out.println(" !!USER : " + userBean.getNAME());
				
				if(userBean	!= null)
				{
					request.setAttribute("MANAGER_MIN", userBean.getNAME());
					request.setAttribute("SIGUNGU", userBean.getGU_NM());
					request.setAttribute("MANAGE_DEP_MIN", userBean.getDEPT_NM());
				}
		
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", "1", "����"));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", null, "����"));
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", null, "����"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", null, "����"));
		
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "����"));
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/minwoninfo/tab/sisul_modify");
	}
	
	//	������ ���� ���� ó��
	public ModelAndView		Sisul_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 	adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
	
		Sisul_Modify_Execute(request, response, adminno);
		
		request.setAttribute("ADMIN_NO", adminno);

		return	Sisul_View(request, response);
	}

	//	������ ���� ����
	public void		Sisul_Modify_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		PlaceBean	Bean	= new PlaceBean();
		
		bind(request, Bean);
		
		Bean.setMUL_FROMDATE(util.Date_Cut(Bean.getMUL_FROMDATE()));	//	���������
		Bean.setMUL_TODATE(util.Date_Cut(Bean.getMUL_TODATE()));		//	����������
		Bean.setWORK_FROMDATE(util.Date_Cut(Bean.getWORK_FROMDATE()));	//	���� ������
		Bean.setWORK_TODATE(util.Date_Cut(Bean.getWORK_TODATE()));		//	���� ������
		Bean.setFINISH_DATE(util.Date_Cut(Bean.getFINISH_DATE()));		//	�ذ�����
		
		Bean.setADMIN_NO(adminno);
		
//		Bean.setSIDO("11");
//		Bean.setSIGUNGU("680");
		Bean.setSIDO(Bean.getSIDO());
		Bean.setSIGUNGU(Bean.getSIGUNGU());
		
		iMinwoninfoService.executeJumji_Modify(Bean);
	}
}
