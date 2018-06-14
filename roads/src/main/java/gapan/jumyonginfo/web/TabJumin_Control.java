//	2009		Kim Yun Seo

package main.java.gapan.jumyonginfo.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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


public class TabJumin_Control	extends MultiActionController 
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

	
	//	점용인정보 보기
	public ModelAndView		Jumin_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		// 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		GapanHeadBean	Bean	= null;
		
		try{
			if(userId != null)
			{
		
				String 		gapanno 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 		section		= ServletRequestUtils.getStringParameter(request, "SECTION", "");
		
				List		list 	= iJumyonginfoService.executeJumin_View(gapanno);
				Bean	= new GapanHeadBean();
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (GapanHeadBean)list.get(0);
					
					//	partn_ssn
					List	partn_ssn	= util.SubString_SSN(Bean.getPARTN_SSN());
					if(!partn_ssn.get(0).equals(""))
						Bean.setPARTN_SSN(partn_ssn.get(0) + "-" + partn_ssn.get(1));
					
					//	partn_post
					String	partn_post	= util.Post_Paste(Bean.getPARTN_POST());
					Bean.setPARTN_POST(partn_post);
					
					//	partn_topost
					String	partn_topost	= util.Post_Paste(Bean.getPARTN_TOPOST());
					Bean.setPARTN_TOPOST(partn_topost);
					
					System.out.println("partn_ssn"+partn_ssn.toString());
					System.out.println("partn_post"+partn_post.toString());
					System.out.println("partn_topost"+partn_topost.toString());
				}
				
				request.setAttribute("GAPAN_NO", gapanno);
				request.setAttribute("GU_CODE", gu_code);
				request.setAttribute("SECTION", section);
				
				// 파일관련
				String filePath = Globals.IMAGEFILEPATH;		
				request.setAttribute("filePath", filePath );
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		System.out.println("TabJumin_Control.Jumin_View");		
		System.out.println("TabJumin_Control.Jumin_View");		
		System.out.println("TabJumin_Control.Jumin_View");		
			
		return new ModelAndView("/gapan/jumyonginfo/tab/jumin_view", "board", Bean);
	}
	
	//	점용인정보 수정
	public ModelAndView		Jumin_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{

		//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		GapanHeadBean	Bean	= null;
		try{
			if(userId != null)
			{
				String 		gapanno 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		
				List		list 	= iJumyonginfoService.executeJumin_View(gapanno);
				Bean	= new GapanHeadBean();
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (GapanHeadBean)list.get(0);
					
					//	SSN
					List	partn_ssn	= util.SubString_SSN(Bean.getPARTN_SSN());
					if(!partn_ssn.get(0).equals("") || !partn_ssn.get(1).equals("")){
						Bean.setPARTN_SSN1((String)partn_ssn.get(0)); 
						Bean.setPARTN_SSN2((String)partn_ssn.get(1));
					}
					
					List	partn_tel	= util.StringToken_Three(Bean.getPARTN_TEL());
					if(!partn_tel.get(0).equals("") || !partn_tel.get(1).equals("") || !partn_tel.get(2).equals("")){
						Bean.setPARTN_TEL1((String)partn_tel.get(0));
						Bean.setPARTN_TEL2((String)partn_tel.get(1));
						Bean.setPARTN_TEL3((String)partn_tel.get(2));
					}
					
					List	partn_hp	= util.StringToken_Three(Bean.getPARTN_HP());
					if(!partn_hp.get(0).equals("") || !partn_hp.get(1).equals("") || !partn_hp.get(2).equals("")){
						Bean.setPARTN_HP1((String)partn_hp.get(0));
						Bean.setPARTN_HP2((String)partn_hp.get(1));
						Bean.setPARTN_HP3((String)partn_hp.get(2));
					}
					
					Bean.setPARTN_POST(util.Post_Paste(Bean.getPARTN_POST()));
					Bean.setPARTN_TOPOST(util.Post_Paste(Bean.getPARTN_TOPOST()));
					
					List partn_jibun = util.StringToken_Two(Bean.getPARTN_JIBUN());
					//********** BEGIN_현진_20120402
					//if(partn_jibun != null){
					if(partn_jibun != null && !partn_jibun.equals("-")){
					//********** END_현진_20120402
						if(!partn_jibun.get(0).equals("") || !partn_jibun.get(1).equals("")){
							Bean.setPARTN_BONBUN((String)partn_jibun.get(0));
							Bean.setPARTN_BUBUN((String)partn_jibun.get(1));
						}
					}
					
					List partn_tojibun = util.StringToken_Two(Bean.getPARTN_TOJIBUN());
					//********** BEGIN_현진_20120402					
					//if(partn_tojibun != null){
					if(partn_tojibun != null && !partn_tojibun.equals("-")){
					//********** END_현진_20120402
						if(!partn_tojibun.get(0).equals("") || !partn_tojibun.get(1).equals("")){
							Bean.setPARTN_TOBONBUN((String)partn_tojibun.get(0));
							Bean.setPARTN_TOBUBUN((String)partn_tojibun.get(1));
						}
					}
					
					request.setAttribute("pt_sel", commonCode.executeGapanCode("PT_SEL", Bean.getPT_SEL(), "선택"));
					
					
		//			//	BIZSSN
		//			List	bizssn	= util.SubString_BIZSSN(Bean.getBIZSSN());
		//			if(!bizssn.get(0).equals(""))
		//				Bean.setBIZSSN(bizssn.get(0) + "-" + bizssn.get(1) + "-" + bizssn.get(2));
		//			
		//			Bean.setREGDATE(util.Date_Paste(Bean.getREGDATE()));
				}
				
				request.setAttribute("GAPAN_NO", gapanno);
				request.setAttribute("GU_CODE", gu_code);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}				 
		return new ModelAndView("/gapan/jumyonginfo/tab/jumin_modify", "board", Bean);
	}
	
	//	점용인정보 수정 처리
	public ModelAndView		Jumin_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{		
		String 		gapanno = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
		String PARTN_IMG_NAME = ServletRequestUtils.getStringParameter(request, "PARTN_IMG_NAME", "");
		//System.out.println("수정전--- " + PARTN_IMG_NAME);
		
		// 파일업로드 관련
		MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
		MultipartFile PARTN_IMG = mpRequest.getFile("PARTN_IMG");
		
		if (PARTN_IMG.getSize() > 0) {
			
			// 기존파일 삭제 
			FileUtil.delete(Globals.IMAGEFILEUPLOADPATH_GAPAN+PARTN_IMG_NAME); 
			
			PARTN_IMG_NAME = FileUploadUtil2.uploadFormFile(PARTN_IMG,Globals.IMAGEFILEUPLOADPATH_GAPAN);			
			//System.out.println("수정후 ==> " + PARTN_IMG_NAME);
		}
		

		Jumin_Modify_Execute(request, response, gapanno, PARTN_IMG_NAME);
		
		return	Jumin_View(request, response);
		
	}	
	
	
	//	점용인 정보  수정
	public void		Jumin_Modify_Execute(HttpServletRequest request,HttpServletResponse response, String gapanno, String PARTN_IMG_NAME) throws Exception 
	{
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				GapanHeadBean gapanHeadBean = new GapanHeadBean();
		
				bind(request, gapanHeadBean);
				
				//운영자 주민번호
				String partn_ssn		= "";
				String partn_ssn1 = ServletRequestUtils.getStringParameter(request, "PARTN_SSN1", "");
				String partn_ssn2 = ServletRequestUtils.getStringParameter(request, "PARTN_SSN2", "");
				
				if(!partn_ssn1.equals("") && !partn_ssn2.equals(""))
					partn_ssn		= partn_ssn1 + partn_ssn2;
				
				//운영자 전화번호
				String partn_tel	= 	"";
				String partn_tel1	=	ServletRequestUtils.getStringParameter(request, "PARTN_TEL1", "");
				String partn_tel2	=	ServletRequestUtils.getStringParameter(request, "PARTN_TEL2", "");
				String partn_tel3	=	ServletRequestUtils.getStringParameter(request, "PARTN_TEL3", "");
				
				if(!partn_tel1.equals("") && !partn_tel2.equals("") && !partn_tel3.equals(""))
					partn_tel		= partn_tel1 + "-" + partn_tel2  + "-" + partn_tel3;
				
				//운영자 휴대폰 번호
				String partn_hp		=	"";
				String partn_hp1	=	ServletRequestUtils.getStringParameter(request, "PARTN_HP1", "");
				String partn_hp2	=	ServletRequestUtils.getStringParameter(request, "PARTN_HP2", "");
				String partn_hp3	=	ServletRequestUtils.getStringParameter(request, "PARTN_HP3", "");
				
				if(!partn_hp1.equals("") && !partn_hp2.equals("") && !partn_hp3.equals(""))
					partn_hp		= partn_hp1 + "-" + partn_hp2 + "-" + partn_hp3;
		
				
				//운영자 지번 PARTN_BONBUN + PARTN_BUBUN
				String partn_jibun	=	"";
				String partn_bonbun	=	ServletRequestUtils.getStringParameter(request, "PARTN_BONBUN", "");
				String partn_bubun	=	ServletRequestUtils.getStringParameter(request, "PARTN_BUBUN", "");
				
				//********** BEGIN_현진_20120330
				/*
				if(!partn_bonbun.equals("") && !partn_bubun.equals(""))
				{
					partn_jibun 	= partn_bonbun + "-" + partn_bubun;
				}
				*/				
				if(partn_bonbun != null && !partn_bonbun.equals("")){
					partn_jibun  = partn_bonbun;
					if(partn_bonbun != null && !partn_bonbun.equals("")){
						partn_jibun += "-" + partn_bubun;
					}
				}
				//********** END_현진_20120330
		
				
				//운영자 지번 PARTN_BONBUN + PARTN_BUBUN
				String partn_tojibun	=	"";
				String partn_tobonbun	=	ServletRequestUtils.getStringParameter(request, "PARTN_TOBONBUN", "");
				String partn_tobubun	=	ServletRequestUtils.getStringParameter(request, "PARTN_TOBUBUN", "");

				//********** BEGIN_현진_20120330
				/*
				if(!partn_tobonbun.equals("") && !partn_tobubun.equals(""))
				{
					partn_tojibun 	= partn_tobonbun + "-" + partn_tobubun;
				}
				*/				
				if(partn_tobonbun != null && !partn_tobonbun.equals("")){
					partn_tojibun  = partn_tobonbun;
					if(partn_tobubun != null && !partn_tobubun.equals("")){
						partn_tojibun += "-" + partn_tobubun;
					}
				}
				//********** END_현진_20120330
				
				String partn_post = ServletRequestUtils.getStringParameter(request, "PARTN_POST", "");
				String partn_topost = ServletRequestUtils.getStringParameter(request, "PARTN_TOPOST", "");
				
				gapanHeadBean.setGAPAN_NO(gapanno);
				gapanHeadBean.setPARTN_SSN(partn_ssn);
				gapanHeadBean.setPARTN_TEL(partn_tel);
				gapanHeadBean.setPARTN_HP(partn_hp);
				gapanHeadBean.setPARTN_JIBUN(partn_jibun);
				gapanHeadBean.setPARTN_TOJIBUN(partn_tojibun);
				gapanHeadBean.setPARTN_POST(util.Post_Cut(partn_post));		//우편번호 "-" 뺀다.
				gapanHeadBean.setPARTN_TOPOST(util.Post_Cut(partn_topost));	//우편번호 "-" 뺀다.
				
				//********** BEGIN_현진_20120330
				gapanHeadBean.setPBON(partn_bonbun);
				gapanHeadBean.setPBU(partn_bubun);
				gapanHeadBean.setPTBON(partn_tobonbun);
				gapanHeadBean.setPTBU(partn_tobubun);
				
				//********** END_현진_20120330
				
				//파일 실제 저장 , 저장된 실제파일 이름 가져오기 
				if( PARTN_IMG_NAME != null && !"".equals(PARTN_IMG_NAME) ){
					gapanHeadBean.setPARTN_IMG_NAME(PARTN_IMG_NAME);
				}else{
					gapanHeadBean.setPARTN_IMG_NAME(gapanHeadBean.getPARTN_IMG_NAME());
				}
				//strSavedFileName = uploadImageFiles(request);
				//GAPAN_HEAD  테이블에 저장한다.
				iJumyonginfoService.executeJumin_Gapan_Head_Modify(gapanHeadBean);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
