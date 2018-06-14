//	2009		Kim Yun Seo

package main.java.facility.minwoninfo.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;
import main.java.facility.minwoninfo.model.PlaceBean;
import main.java.facility.minwoninfo.service.IMinwoninfoService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class TabJumji_Control	extends MultiActionController {

	private	IMinwoninfoService	iMinwoninfoService	= null;
	private	CommonCodeService	commonCode			= null;
	private	Util				util				= new Util();

	
	public void setFacility_minwoninfoService(IMinwoninfoService facility_minwoninfoService)
	{
		System.out.println(">> TabJumji_Control.setFacility_minwoninfoService");

		this.iMinwoninfoService = facility_minwoninfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		System.out.println(">> TabJumji_Control.setCommonCodeService");

		this.commonCode 	= commonCode;
	}
	
	
	//	���������� ����
	public ModelAndView		Jumji_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		System.out.println(">> TabJumji_Control.Jumji_Modify_Prc");

		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		String 		adminno 	= "";
		PlaceBean	Bean	= new PlaceBean();
		
		try{
			if(userId != null){
				
				adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
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
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		request.setAttribute("ADMIN_NO", adminno);
		
		return new ModelAndView("/facility/minwoninfo/tab/jumji_view", "board", Bean);
	}
	
	//	���������� ���� (���� �Ұ�)
	public ModelAndView		JumjiInfo_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		System.out.println(">> TabJumji_Control.JumjiInfo_View");

		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
		List		list 	= iMinwoninfoService.executeJumji_View(ADMIN_NO);
		PlaceBean	Bean	= new PlaceBean();

		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
				
		try{
			if(userId != null){
				
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
	public ModelAndView		Jumji_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{

		System.out.println(">> TabJumji_Control.Jumji_Modify");

		HttpSession 	session 	= request.getSession();
		String 			userId		= (String)session.getAttribute("sessionUserId");		
		List			list		= null;
		PlaceBean	Bean	= new PlaceBean();
		
		try{
			if(userId != null){
				
				String 		adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
				list 	= iMinwoninfoService.executeJumji_View(adminno);
				
				Bean	= (PlaceBean)list.get(0);
				
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", Bean.getTYPE(), null));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", Bean.getSECTION(), null));
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", Bean.getOWNER_SET(), null));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", Bean.getTAX_SET(), null));
				
				//	������
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", Bean.getSAN_CK(), null));
				
				Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	�� �̸��Է�
				
				Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));		//	���������
				Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));			//	����������
				Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	���� ������
				Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	���� ������
				Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	�ذ�����
				
				request.setAttribute("ADMIN_NO", adminno);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/minwoninfo/tab/jumji_modify", "board", Bean);
	}
	
	//	������ ���� ���� ó��
	public ModelAndView		Jumji_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		System.out.println(">> TabJumji_Control.Jumji_Modify_Prc");

		String 	adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
	
		Jumji_Modify_Execute(request, response, adminno);
		
		request.setAttribute("ADMIN_NO", adminno);

		return	Jumji_View(request, response);
	}

	//	������ ���� ����
	public void		Jumji_Modify_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		System.out.println(">> TabJumji_Control.Jumji_Modify_Execute");

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
