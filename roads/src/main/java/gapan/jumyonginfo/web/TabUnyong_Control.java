//	2009		Kim Yun Seo

package main.java.gapan.jumyonginfo.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.FileUploadUtil2;
import main.java.common.util.FileUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;
import main.java.gapan.jumyonginfo.model.AppealBean;
import main.java.gapan.jumyonginfo.model.GapanHeadBean;
import main.java.gapan.jumyonginfo.service.IJumyonginfoService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class TabUnyong_Control	extends MultiActionController 
{
	private	IJumyonginfoService	iJumyonginfoService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	
	
	public void setGapan_jumyonginfoService(IJumyonginfoService gapan_jumyonginfoService) 
	{
		this.iJumyonginfoService = gapan_jumyonginfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}

	
	//	���������� ����
	public ModelAndView		Unyong_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 		gapanno 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
		String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 		section	 	= ServletRequestUtils.getStringParameter(request, "SECTION", "");

		List		list 	= iJumyonginfoService.executeJumin_View(gapanno);
		GapanHeadBean	Bean	= new GapanHeadBean();
		
		if(list.size()<=0)
			Bean	= null;
		else
		{
			Bean	= (GapanHeadBean)list.get(0);
			
			//	OWNER_SSN
			List	owner_ssn	= util.SubString_SSN(Bean.getOWNER_SSN());
			if(!owner_ssn.get(0).equals(""))
				Bean.setOWNER_SSN(owner_ssn.get(0) + "-" + owner_ssn.get(1));
			
			//	owner_post
			String	owner_post	= util.Post_Paste(Bean.getOWNER_POST());
			Bean.setOWNER_POST(owner_post);
			
			//	owner_topost
			String	owner_topost	= util.Post_Paste(Bean.getOWNER_TOPOST());
			Bean.setOWNER_TOPOST(owner_topost);			
		}
		
		// ���ϰ���
		String filePath = Globals.IMAGEFILEPATH;
		
		request.setAttribute("filePath", filePath );
		request.setAttribute("GAPAN_NO", gapanno);
		request.setAttribute("GU_CODE", gu_code);
		request.setAttribute("SECTION", section);
		
		
		return new ModelAndView("/gapan/jumyonginfo/tab/unyong_view", "board", Bean);
	}
	
	//	���������� ����
	public ModelAndView		Unyong_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 		gapanno 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
		String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");

		List		list 	= iJumyonginfoService.executeJumin_View(gapanno);
		GapanHeadBean	Bean	= new GapanHeadBean();
		
		if(list.size()<=0)
			Bean	= null;
		else
		{
			Bean	= (GapanHeadBean)list.get(0);
			
			//	OWNER_SSN
			List	owner_ssn	= util.SubString_SSN(Bean.getOWNER_SSN());
			if(!owner_ssn.get(0).equals("") || !owner_ssn.get(1).equals("")){
				Bean.setOWNER_SSN1((String)owner_ssn.get(0)); 
				Bean.setOWNER_SSN2((String)owner_ssn.get(1));
			}
			
			List	owner_tel	= util.StringToken_Three(Bean.getOWNER_TEL());
			if(!owner_tel.get(0).equals("") || !owner_tel.get(1).equals("") || !owner_tel.get(2).equals("")){
				Bean.setOWNER_TEL1((String)owner_tel.get(0));
				Bean.setOWNER_TEL2((String)owner_tel.get(1));
				Bean.setOWNER_TEL3((String)owner_tel.get(2));
			}
			
			List	owner_hp	= util.StringToken_Three(Bean.getOWNER_HP());
			if(!owner_hp.get(0).equals("") || !owner_hp.get(1).equals("") || !owner_hp.get(2).equals("")){
				Bean.setOWNER_HP1((String)owner_hp.get(0));
				Bean.setOWNER_HP2((String)owner_hp.get(1));
				Bean.setOWNER_HP3((String)owner_hp.get(2));
			}
			
			Bean.setOWNER_POST(util.Post_Paste(Bean.getOWNER_POST()));
			Bean.setOWNER_TOPOST(util.Post_Paste(Bean.getOWNER_TOPOST()));
			
			List owner_jibun = util.StringToken_Two(Bean.getOWNER_JIBUN());
			if(owner_jibun != null){
				if(!owner_jibun.get(0).equals("") || !owner_jibun.get(1).equals("")){
					Bean.setOWNER_BONBUN((String)owner_jibun.get(0));
					Bean.setOWNER_BUBUN((String)owner_jibun.get(1));
				}
			}
			
			List owner_tojibun = util.StringToken_Two(Bean.getOWNER_TOJIBUN());
			if(owner_tojibun != null){
				if(!owner_tojibun.get(0).equals("") || !owner_tojibun.get(1).equals("")){
					Bean.setOWNER_TOBONBUN((String)owner_tojibun.get(0));
					Bean.setOWNER_TOBUBUN((String)owner_tojibun.get(1));
				}
			}
			
			request.setAttribute("rt_sel", commonCode.executeGapanCode("RT_SEL", Bean.getRT_SEL(), "����"));
			request.setAttribute("lc_sel", commonCode.executeGapanCode("LC_SEL", Bean.getLC_SEL(), "����"));
			
		}
		
		request.setAttribute("GAPAN_NO", gapanno);
		request.setAttribute("GU_CODE", gu_code);
		//********** BEGIN_����_20120330
		request.setAttribute("TRI", Bean.getT_RI());
		//********** END_����_20120330
		return new ModelAndView("/gapan/jumyonginfo/tab/unyong_modify", "board", Bean);
	}
	
	//	���������� ���� ó��
	public ModelAndView		Unyong_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{		
		String 		gapanno = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
		String OWNER_IMG_NAME = ServletRequestUtils.getStringParameter(request, "OWNER_IMG_NAME", "");
		//System.out.println("������--- " + OWNER_IMG_NAME);
		
		// ���Ͼ��ε� ����
		MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
		MultipartFile OWNER_IMG = mpRequest.getFile("OWNER_IMG");
		
		if (OWNER_IMG.getSize() > 0) {
			
			// �������� ���� 
			FileUtil.delete(Globals.IMAGEFILEUPLOADPATH_GAPAN+OWNER_IMG_NAME); 
			
			
			OWNER_IMG_NAME = FileUploadUtil2.uploadFormFile(OWNER_IMG,Globals.IMAGEFILEUPLOADPATH_GAPAN);			
			System.out.println("������ ==> " + OWNER_IMG_NAME);
		}
		
		Unyong_Modify_Execute(request, response, gapanno , OWNER_IMG_NAME);
		
		return	Unyong_View(request, response);
		
	}	
	
	
	//	������ ����  ����
	public void		Unyong_Modify_Execute(HttpServletRequest request,HttpServletResponse response, String gapanno, String OWNER_IMG_NAME) throws Exception 
	{
		GapanHeadBean gapanHeadBean = new GapanHeadBean();

		bind(request, gapanHeadBean);
		
		//��� �ź��� Ȯ�� ����
		String OWNER_IDCHK = ServletRequestUtils.getStringParameter(request, "OWNER_IDCHK", "0");
		
		
		//��� �ֹι�ȣ
		String	owner_ssn		= "";
		String owner_ssn1 = ServletRequestUtils.getStringParameter(request, "OWNER_SSN1", "");
		String owner_ssn2 = ServletRequestUtils.getStringParameter(request, "OWNER_SSN2", "");
		
		if(!owner_ssn1.equals("") && !owner_ssn2.equals(""))
			owner_ssn		= owner_ssn1 + owner_ssn2;
		
		//��� ��ȭ��ȣ
		String owner_tel	= 	"";
		String owner_tel1	=	ServletRequestUtils.getStringParameter(request, "OWNER_TEL1", "");
		String owner_tel2	=	ServletRequestUtils.getStringParameter(request, "OWNER_TEL2", "");
		String owner_tel3	=	ServletRequestUtils.getStringParameter(request, "OWNER_TEL3", "");
		
		if(!owner_tel1.equals("") && !owner_tel2.equals("") && !owner_tel3.equals(""))
			owner_tel		= owner_tel1 + "-" + owner_tel2  + "-" + owner_tel3;
		
		//��� �޴��� ��ȣ
		String owner_hp		=	"";
		String owner_hp1	=	ServletRequestUtils.getStringParameter(request, "OWNER_HP1", "");
		String owner_hp2	=	ServletRequestUtils.getStringParameter(request, "OWNER_HP2", "");
		String owner_hp3	=	ServletRequestUtils.getStringParameter(request, "OWNER_HP3", "");
		
		if(!owner_hp1.equals("") && !owner_hp2.equals("") && !owner_hp3.equals(""))
			owner_hp		= owner_hp1 + "-" + owner_hp2 + "-" + owner_hp3;
		
		//��� ���� OWNER_BONBUN + OWNER_BUBUN
		String owner_jibun	=	"";
		String owner_bonbun	=	ServletRequestUtils.getStringParameter(request, "OWNER_BONBUN", "");
		String owner_bubun	=	ServletRequestUtils.getStringParameter(request, "OWNER_BUBUN", "");
		
		if(!owner_bonbun.equals("") && !owner_bubun.equals(""))
		{
			owner_jibun 	= owner_bonbun + "-" + owner_bubun;
		}else if(!owner_bonbun.equals("") && owner_bubun.equals("")){
			owner_jibun 	= owner_bonbun ;
		}
		//��� ���� OWNER_BONBUN + OWNER_BUBUN
		String owner_tojibun	=	"";
		String owner_tobonbun	=	ServletRequestUtils.getStringParameter(request, "OWNER_TOBONBUN", "");
		String owner_tobubun	=	ServletRequestUtils.getStringParameter(request, "OWNER_TOBUBUN", "");
		
		if(!owner_tobonbun.equals("") && !owner_tobubun.equals(""))
		{
			owner_tojibun 	= owner_tobonbun + "-" + owner_tobubun;
		}else if(!owner_tobonbun.equals("") && owner_tobubun.equals("")){
			owner_tojibun 	= owner_tobonbun ;
		}
		String owner_post = ServletRequestUtils.getStringParameter(request, "OWNER_POST", "");
		String owner_topost = ServletRequestUtils.getStringParameter(request, "OWNER_TOPOST", "");
		
		String OWNER_TOADDR2 = ServletRequestUtils.getStringParameter(request, "OWNER_TOADDR2", "");
		String OWNER_ADDR2 = ServletRequestUtils.getStringParameter(request, "OWNER_ADDR2", "");
		
		String SI = ServletRequestUtils.getStringParameter(request, "SI", "");
		String GUN = ServletRequestUtils.getStringParameter(request, "GUN", "");
		String DORO_NM = ServletRequestUtils.getStringParameter(request, "DORO_NM", "");
		String BD_BON = ServletRequestUtils.getStringParameter(request, "BD_BON", "");
		String BD_BU = ServletRequestUtils.getStringParameter(request, "BD_BU", "");
		String BD_NM = ServletRequestUtils.getStringParameter(request, "BD_NM", "");
		String BD_DET_NM = ServletRequestUtils.getStringParameter(request, "BD_DET_NM", "");
		
		String TOSI = ServletRequestUtils.getStringParameter(request, "TOSI", "");
		String TOGUN = ServletRequestUtils.getStringParameter(request, "TOGUN", "");
		String TODORO_NM = ServletRequestUtils.getStringParameter(request, "TODORO_NM", "");
		String TOBD_BON = ServletRequestUtils.getStringParameter(request, "TOBD_BON", "");
		String TOBD_BU = ServletRequestUtils.getStringParameter(request, "TOBD_BU", "");
		String TOBD_NM = ServletRequestUtils.getStringParameter(request, "TOBD_NM", "");
		String TOBD_DET_NM = ServletRequestUtils.getStringParameter(request, "TOBD_DET_NM", "");
		
		
		gapanHeadBean.setOWNER_IDCHK(OWNER_IDCHK);
		gapanHeadBean.setGAPAN_NO(gapanno);
		gapanHeadBean.setOWNER_SSN(owner_ssn);
		gapanHeadBean.setOWNER_TEL(owner_tel);
		gapanHeadBean.setOWNER_HP(owner_hp);
		gapanHeadBean.setOWNER_JIBUN(owner_jibun);
		gapanHeadBean.setOWNER_TOJIBUN(owner_tojibun);
		gapanHeadBean.setOWNER_POST(util.Post_Cut(owner_post));		//�����ȣ "-" ����.
		gapanHeadBean.setOWNER_TOPOST(util.Post_Cut(owner_topost));	//�����ȣ "-" ����.
		gapanHeadBean.setOWNER_ADDR2(OWNER_ADDR2);
		gapanHeadBean.setOWNER_TOADDR2(OWNER_TOADDR2);
		
		gapanHeadBean.setSI(SI);
		gapanHeadBean.setGUN(GUN);
		gapanHeadBean.setDORO_NM(DORO_NM);
		gapanHeadBean.setBD_BON(BD_BON);
		gapanHeadBean.setBD_BU(BD_BU);
		gapanHeadBean.setBD_NM(BD_NM);
		gapanHeadBean.setBD_DET_NM(BD_DET_NM);
		
		
		gapanHeadBean.setTOSI(TOSI);
		gapanHeadBean.setTOGUN(TOGUN);
		gapanHeadBean.setTODORO_NM(TODORO_NM);
		gapanHeadBean.setTOBD_BON(TOBD_BON);
		gapanHeadBean.setTOBD_BU(TOBD_BU);
		gapanHeadBean.setTOBD_NM(TOBD_NM);
		gapanHeadBean.setTOBD_DET_NM(TOBD_DET_NM);
		 
		//********** BEGIN_����_20120330
		gapanHeadBean.setBON(owner_bonbun);
		gapanHeadBean.setBU(owner_bubun);
		gapanHeadBean.setTBON(owner_tobonbun);
		gapanHeadBean.setTBU(owner_tobubun);
		//********** END_����_20120330
		
		 
		//���� ���� ���� , ����� �������� �̸� �������� 
		if( OWNER_IMG_NAME != null && !"".equals(OWNER_IMG_NAME) ){
			gapanHeadBean.setOWNER_IMG_NAME(OWNER_IMG_NAME);
		}else{
			gapanHeadBean.setOWNER_IMG_NAME(gapanHeadBean.getOWNER_IMG_NAME());
		}
		
		//GAPAN_HEAD  ���̺� �����Ѵ�.
		iJumyonginfoService.executeUnyong_Gapan_Head_Modify(gapanHeadBean);
	}
}
