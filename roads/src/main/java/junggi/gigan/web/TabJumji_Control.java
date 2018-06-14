//	2009		Kim Yun Seo

package main.java.junggi.gigan.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;
import main.java.junggi.gigan.model.PlaceBean;
import main.java.junggi.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabJumji_Control	extends MultiActionController{

	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();


	public void setJunggi_giganService(IGiganService junggi_giganService) 
	{
		this.iGiganervice = junggi_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	������ ����
	public ModelAndView 	Jumji_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 		adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");

		List		list 	= iGiganervice.executeJumji_View(adminno);
		PlaceBean	Bean	= new PlaceBean();

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
		
	//	System.out.println(Bean.getSIDO() + ",, " + Bean.getSIGUNGU());
		
		return new ModelAndView("/junggi/gigan/tab/jumji_view", "board", Bean);
	}
}
