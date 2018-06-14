//	2009		Kim Yun Seo

package main.java.facility.minwon.web;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.facility.adminbiz.model.AdminBizBean;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwon.model.AppealBean;
import main.java.facility.minwon.model.JumjiSearchBean;
import main.java.facility.minwon.model.PlaceBean;
import main.java.facility.minwon.service.IMinwonService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;


public class TabJumin_Control	extends MultiActionController {

	private	IMinwonService		iMinwonService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setFacility_minwonService(IMinwonService facility_minwonService) 
	{
		System.out.println(">> TabJumin_Control-setFacility_minwonService");

		this.iMinwonService = facility_minwonService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		System.out.println(">> TabJumin_Control-setCommonCodeService");

		this.commonCode 	= commonCode;
	}
	
	public	ModelAndView 	Search(HttpServletRequest request, HttpServletResponse response) throws Exception
	{

		System.out.println(">> TabJumin_Control-Search");

		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
				
		UserBean	userBean	= new UserBean();		 
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0, 3);
		List		list	= null;
		int count = 0;
		int	 	currentPage	 = 1;
		
		String currentPageStr = ServletRequestUtils.getStringParameter(request, "currentPage", "1");
		
		if(currentPageStr != null && !currentPageStr.equals("")){		
			System.out.println("error"+currentPageStr);
			currentPage	= Integer.parseInt(currentPageStr);
		}
		System.out.println("currentPaGE : "+currentPage);
		
		String adminBiz = ServletRequestUtils.getStringParameter(request, "adminBiz", "");
		String MIN_NAME = ServletRequestUtils.getStringParameter(request, "MIN_NAME", "");
		
		
		Object obj_adminBiz = request.getAttribute("obj_adminBiz");
		Object obj_MIN_NAME = request.getAttribute("obj_MIN_NAME");
		
		//삭제 후 리스트의 검색조건을 동일하게 표출하기 위한 조건들 
		if(obj_adminBiz != null && !obj_adminBiz.equals("")) adminBiz = obj_adminBiz.toString();		
		if(obj_MIN_NAME != null && !obj_MIN_NAME.equals("")) MIN_NAME = obj_MIN_NAME.toString();
		
		
		int pageSize = 10;
		
		int startPage = (currentPage-1)*pageSize+1;
		int endPage = currentPage*pageSize ;
		
		try{
			
			if(userId != null){
				list = iMinwonService.adminBizSearch(adminBiz,MIN_NAME,gu_code,startPage,endPage);
				count = iMinwonService.adminBizSearchCount(adminBiz, MIN_NAME, gu_code);
				
				
				AdminBizBean bean = new AdminBizBean();	
				bean = (AdminBizBean)list.get(0);
			
				pageing.execute(request, count, currentPage, pageSize);
				
			}
		}catch(Exception e){
			
			
		}
		
		request.setAttribute("gu_code",gu_code);
		request.setAttribute("adminBiz", adminBiz);
		request.setAttribute("MIN_NAME", MIN_NAME);
		request.setAttribute("totalcnt", count);
		
		return new ModelAndView("/facility/minwon/tab/jumin_search", "blist", list);
	}
	
	
	public String JuminAjaxTab(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		System.out.println(">> TabJumin_Control-JuminAjaxTab");
		
		UserBean	userBean	= new UserBean();		 
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0, 3);
		
		String corp_cd = ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		
		String Xml = "";
		
		try{
			
			AdminBizBean Bean  = iMinwonService.adminBizView(gu_code, corp_cd);
			
			System.out.println("관리업체 이름 : "+Bean.getNAME());
			
			String [] jumin_tel = new String[3];		
			String [] jumin_fax = new String[3];		
			String [] jumin_hp = new String[3];
			
			
			//	XML로 만들어서 보낸다.
			Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
			Xml	+= "<lists>";
			
			Xml	+= XmlNodeMake("CORP_CD", Bean.getCORP_CD());
			Xml	+= XmlNodeMake("GU_CODE", Bean.getGU_CODE());
			Xml	+= XmlNodeMake("NAME", Bean.getNAME());
			Xml	+= XmlNodeMake("OFFICE", Bean.getOFFICE());
			
			
			if(Bean.getSSN() != null && !Bean.getSSN().equals("")){		
			Xml	+= XmlNodeMake("jumin_ssn1", Bean.getSSN().substring(0,6));
			Xml	+= XmlNodeMake("jumin_ssn2", Bean.getSSN().substring(6,13));
			
			}else{
			
				Xml	+= XmlNodeMake("jumin_ssn1", "");
				Xml	+= XmlNodeMake("jumin_ssn2", "");
			}
		
			
			if(Bean.getBIZSSN() != null && !Bean.getBIZSSN().equals("")){
				Xml	+= XmlNodeMake("jumin_bizssn1",Bean.getBIZSSN().substring(0,3));
				Xml	+= XmlNodeMake("jumin_bizssn2",Bean.getBIZSSN().substring(3,5));
				Xml	+= XmlNodeMake("jumin_bizssn3",Bean.getBIZSSN().substring(5,10));
			}else{
				Xml	+= XmlNodeMake("jumin_bizssn1","");
				Xml	+= XmlNodeMake("jumin_bizssn2","");
				Xml	+= XmlNodeMake("jumin_bizssn3","");
			}
						
			
			if(Bean.getTOTEL() != null && !Bean.getTOTEL().equals("")){			
			
				jumin_tel =  Bean.getTOTEL().split("-");
				
			}
			
			Xml	+= XmlNodeMake("jumin_tel1",jumin_tel[0]);
			Xml	+= XmlNodeMake("jumin_tel2",jumin_tel[1]);
			Xml	+= XmlNodeMake("jumin_tel3",jumin_tel[2]);
			
			
			if(Bean.getTOFAX() != null && !Bean.getTOFAX().equals("")){
				jumin_fax =Bean.getTOFAX().split("-"); 
			}
				
				Xml	+= XmlNodeMake("jumin_fax1", jumin_fax[0]);
				Xml	+= XmlNodeMake("jumin_fax2", jumin_fax[1]);
				Xml	+= XmlNodeMake("jumin_fax3", jumin_fax[2]);
			
			
			
			if(Bean.getTOHP() != null && !Bean.getTOHP().equals("")){
				jumin_hp = Bean.getTOHP().split("-");		
				
			}
				Xml	+= XmlNodeMake("jumin_hp1", jumin_hp[0]);
				Xml	+= XmlNodeMake("jumin_hp2", jumin_hp[1]);
				Xml	+= XmlNodeMake("jumin_hp3", jumin_hp[2]);
				
			Xml	+= XmlNodeMake("POST",Bean.getPOST());
			Xml	+= XmlNodeMake("ADDR1",Bean.getADDR1());
			Xml	+= XmlNodeMake("ADDR2",Bean.getADDR2());
			Xml	+= XmlNodeMake("BIZ_STATUS",Bean.getBIZ_STATUS());
			Xml	+= XmlNodeMake("BIZ_TYPES",Bean.getBIZ_TYPES());
			Xml	+= XmlNodeMake("TOPOST",Bean.getTOPOST());
			Xml	+= XmlNodeMake("TOADDR1",Bean.getTOADDR1());
			Xml	+= XmlNodeMake("TOADDR2",Bean.getTOADDR2());
			Xml	+= XmlNodeMake("TOTEL_EXT",Bean.getTOTEL_EXT());

			Xml	+= XmlNodeMake("TOPOST_NM",Bean.getTOPOST_NM());
			Xml	+= XmlNodeMake("MANAGER",Bean.getMANAGER());
			Xml	+= XmlNodeMake("LNBR1",Bean.getLNBR1());
			Xml	+= XmlNodeMake("LNBR2",Bean.getLNBR2());
			Xml	+= XmlNodeMake("TO_LNBR1",Bean.getTO_LNBR1());
			Xml	+= XmlNodeMake("TO_LNBR2",Bean.getTO_LNBR2());
			Xml	+= XmlNodeMake("OFFICE_CD",Bean.getOFFICE_CD());
			// hoban 120325 start
			Xml	+= XmlNodeMake("SPC_CD",Bean.getSPC_CD());
			Xml	+= XmlNodeMake("TO_SPC_CD",Bean.getTO_SPC_CD());
//			Xml	+= XmlNodeMake("TEL",Bean.getTEL());
//			Xml	+= XmlNodeMake("HP",Bean.getHP());
//			Xml	+= XmlNodeMake("SI",Bean.getSI());
//			Xml	+= XmlNodeMake("GUN",Bean.getGUN());
//			Xml	+= XmlNodeMake("DONG",Bean.getDONG());
			Xml	+= XmlNodeMake("BON",Bean.getBON());
			Xml	+= XmlNodeMake("BU",Bean.getBU());
			Xml	+= XmlNodeMake("SANGSE",Bean.getSANGSE());
//			Xml	+= XmlNodeMake("ROAD_ADDR",Bean.getROAD_ADDR());
			Xml	+= XmlNodeMake("ROAD_BON",Bean.getROAD_BON());
			Xml	+= XmlNodeMake("ROAD_BU",Bean.getROAD_BU());
			Xml	+= XmlNodeMake("ADDR_CHECK",Bean.getADDR_CHECK());
//			Xml	+= XmlNodeMake("TOSI",Bean.getTOSI());
//			Xml	+= XmlNodeMake("TOGUN",Bean.getTOGUN());
//			Xml	+= XmlNodeMake("TODONG",Bean.getTODONG());
			Xml	+= XmlNodeMake("TOBON",Bean.getTOBON());
			Xml	+= XmlNodeMake("TOBU",Bean.getTOBU());
			Xml	+= XmlNodeMake("TOSANGSE",Bean.getTOSANGSE());
			Xml	+= XmlNodeMake("REGDATE",Bean.getREGDATE());
			Xml	+= XmlNodeMake("RI",Bean.getRI());
			Xml	+= XmlNodeMake("BD_NM",Bean.getBD_NM());
			Xml	+= XmlNodeMake("BD_DET_NM",Bean.getBD_DET_NM());
//			Xml	+= XmlNodeMake("TORI",Bean.getTORI());
//			Xml	+= XmlNodeMake("TO_DORO_NM",Bean.getTO_DORO_NM());
			Xml	+= XmlNodeMake("TO_BD_BON",Bean.getTO_BD_BON());
			Xml	+= XmlNodeMake("TO_BD_BU",Bean.getTO_BD_BU());
			Xml	+= XmlNodeMake("TO_BD_NM",Bean.getTO_BD_NM());
			Xml	+= XmlNodeMake("TO_BD_DET_NM",Bean.getTO_BD_DET_NM());
//			Xml	+= XmlNodeMake("REQUEST_NO",Bean.getREQUEST_NO());
//			Xml	+= XmlNodeMake("JIJUM_CD",Bean.getJIJUM_CD());
			Xml	+= XmlNodeMake("ROAD_ADDR",Bean.getSI()+" "+Bean.getGUN()+" "+Bean.getROAD_ADDR());
			Xml	+= XmlNodeMake("TO_ROAD_ADDR",Bean.getTOSI()+" "+Bean.getTOGUN()+" "+Bean.getTO_DORO_NM());

			// hoban 120325 end
			
			Xml	+= "</lists>";
			
			System.out.println("XML = \n" + Xml);
			
		}catch(Exception e){
			
		}		
		  response.setContentType("text/html;charset=euc-kr");
	      response.setHeader("Cache-Control", "no-cache");
	      response.getWriter().write(Xml);	
	
		return null;
	}
	
	public	String	XmlNodeMake(String NodeName, String Value)
	{
		String	XML	= "";
		
		if(Value == null || Value.equals("")) Value = "";
		
		XML	= "<" + NodeName + ">" + Value + "</" + NodeName + ">";
		
		System.out.println(XML);
		return	XML;
	}
}
