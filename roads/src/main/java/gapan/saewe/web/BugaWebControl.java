package main.java.gapan.saewe.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.StringUtil;
import main.java.common.util.catUtil.Util;
import main.java.gapan.saewe.model.BugaRegistBean;
import main.java.gapan.saewe.model.TaxationBean;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import BugaWebService.BugaWSProxy;
import BugaWebService_pkg.Bu04BugaWSDTO;
import BugaWebService_pkg.Bu04SemokWSDTO;
import BugaWebService_pkg.Bu04SemokWSRACSDTO;
import BugaWebService_pkg.Bu04UserInfoWSDTO;
import BugaWebService_pkg.BugaWS;
import BugaWebService_pkg.StatusCodeWSDTO;


public class BugaWebControl extends MultiActionController {

	/**
	 * 세목정보조회 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	private	Util	util	= new Util();
	private	StringUtil	stringUtil	= new StringUtil();
	
	public String	getSemokInfo(String TAX_CD, String SIGU_CD, String DEPT_CD, CommonCodeService commonCode) throws Exception 
	{
		String	Xml	= ""; 
		 
		//getSemokInfo 입력파라메터
		String sigu_cd	= SIGU_CD;
		String buseo_cd = DEPT_CD;
		String semok_cd = TAX_CD;
		
		//리턴 파라메터
		double gasanRate = 0;
	    String gasanRateGubun = "";
	    String gasanRateGubunNm = "";
	    String ocrBuseoCd = "";
	    String ocrSiguCd = "";
	    String suBuseoCd = "";
	    String vatYn = "";
				
		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//프록시 서버 생성 실패
				System.out.println("프록시 서버 생성 실패");
			}else{
				System.out.println("프록시 서버 생성");				
				Bu04SemokWSDTO rs = ws.getSemokInfo(sigu_cd ,buseo_cd ,semok_cd);
	        	
	        	if(rs != null){
	        		
	        		if(rs.getGasanRateGubun() != null){
	        			gasanRateGubun = rs.getGasanRateGubun();
	        			gasanRateGubunNm = commonCode.executeCommonCodeNm("addition_part", gasanRateGubun);
	        		}
	        		
	        		if(rs.getVatYn() != null){
	        			vatYn = rs.getVatYn();
	        		}
	        		
	        		if(rs.getOcrBuseoCd() != null){
	        			ocrBuseoCd = rs.getOcrBuseoCd();
	        		}
	        		
	        		if(rs.getOcrSiguCd() != null){
	        			ocrSiguCd = rs.getOcrSiguCd();
	        		}
	        		
	        		if(rs.getSuBuseoCd() != null){
	        			suBuseoCd = rs.getSuBuseoCd();
	        		}
	        		
	        		if(rs.getGasanRate() != 0){
	        			gasanRate = rs.getGasanRate();
	        		}
					
					//	XML로 만들어서 보낸다.
					Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
					Xml	+= "<lists>";
					
					Xml	+= util.XmlNodeMake("gasanRateGubun", gasanRateGubun);
					Xml	+= util.XmlNodeMake("gasanRateGubunNm", gasanRateGubunNm);
					Xml	+= util.XmlNodeMake("vatYn", vatYn);
					Xml	+= util.XmlNodeMake("suBuseoCd",suBuseoCd);
					Xml	+= util.XmlNodeMake("gasanRate",String.valueOf(gasanRate));
					Xml	+= util.XmlNodeMake("ocrBuseoCd", ocrBuseoCd);
					Xml	+= util.XmlNodeMake("ocrSiguCd", ocrSiguCd);
					
					Xml	+= "</lists>";
	        	}
			}
			
		//	request.setAttribute("resCode", "1");

		}catch(Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
			
		//	request.setAttribute("resCode", "2");
		//	request.setAttribute("Result", errReason);

		}
	
		return Xml;//new ModelAndView("/sampleBugaWSProxy/testOutput");
	}
	
	/**
	 * 과세번호 생성 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public String getNewTaxNo(String sigu_cd, String semok_cd, String tax_ym, String tax_gubun) throws Exception 
	{
		//리턴 파라메터
		String tax_no = "";
		
		try
		{
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//프록시 서버 생성 실패
//				System.out.println("프록시 서버 생성 실패");
			}
			else
			{
				tax_no = ws.getNewTaxNo(sigu_cd, semok_cd, tax_ym, tax_gubun);
		    	
		    	if(tax_no != null){
		    		
		    		return	tax_no;
		    	}	      	
			}   
			
		}catch(Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
			
		//	request.setAttribute("resCode", "2");
		//	request.setAttribute("Result", errReason);
		}
	
		return null;//new ModelAndView("/sampleBugaWSProxy/testOutput");
	}
	
	/**
	 * 부과등록 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public BugaRegistBean insertBugaRegist(TaxationBean Bean, HttpServletRequest request, String bugwa_id, CommonCodeService commonCode) throws Exception 
	{
	System.out.println("!! 부과등록 ");
		
		BugaRegistBean	bugaRegistBean = new BugaRegistBean();
		
		String adminNo = util.nullTo(Bean.getADMIN_NO(),"");
		String siguCd = util.nullTo(Bean.getSIGU_CD(),"");
		String semokCd = util.nullTo(Bean.getTAX_CD(),"");
		String taxYm = util.nullTo(Bean.getTAX_YM(),"");
		String taxGubun = util.nullTo(Bean.getTAX_GUBUN(),"");		//TAX_GUBUN(정기,수시)으로 변경예정
		String buseoCd = util.nullTo(Bean.getDEPT_CD(),"");
		String taxNo = "";
		String sidoCd = util.nullTo(Bean.getSIDO(),"");
		String napId = "";
		if( Bean.getTAXPAYER_ID() != null && !"".equals(Bean.getTAXPAYER_ID()) )
			napId = util.nullTo(Bean.getTAXPAYER_ID().replaceAll("-", ""),"");
			
		String napNm = util.nullTo(Bean.getTAXPAYER_NM(),"");
		String napGubun = util.nullTo(Bean.getTAXPAYER_SET(),"");
		String suBuseoCd = util.nullTo(Bean.getDEPT_CD(),"");
		String taxYmd = util.nullTo(Bean.getTAX_DATE(),"");
		String napgiYmd = util.nullTo(Bean.getINDATE(),"");
		String napgiAftYmd = util.nullTo(Bean.getOVERDATE(),"");
		String napbuYmd = "";
		long taxAmt = 0;
		if(Bean.getBONSE() != null)
			taxAmt = Long.parseLong(Bean.getBONSE());
		long sise = 0;
		if(Bean.getSISE() != null)
			sise = Long.parseLong(Bean.getSISE());
		long siseGasanAmt = 0;
		long siseIja = 0;
		long guse = 0;
		if(Bean.getGUSE() != null)
			guse = Long.parseLong(Bean.getGUSE());
		long guseGasanAmt = 0;
		long guseIja = 0;
		long gukse = 0;
		if(Bean.getGUKSE() != null)gukse = Long.parseLong(Bean.getGUKSE());
		long gukseGasanAmt = 0;
		long gukseIja = 0;
		long gigum = 0;
		if(Bean.getGIGUM() != null)gigum = Long.parseLong(Bean.getGIGUM());	
		long gigumGasanAmt = 0;
		long gigumIja = 0;
		String napMobilNo = util.nullTo(Bean.getHP(),"");
		String napTelNo = util.nullTo(Bean.getTEL(),"");
		String napEmail = util.nullTo(Bean.getEMAIL(),"");
		String napZipCd = util.Post_Cut(Bean.getPOST());
		String napZipAddr = util.nullTo(Bean.getADDR1(),"");
		String napDtlAddr = util.nullTo(Bean.getADDR2(),"");
		//********** BEGIN_현진_20120309
		napZipAddr = napZipAddr.replace("&nbsp;", " ");
		napDtlAddr = napDtlAddr.replace("null", "");
		//********** END_현진_20120309
		String napDoroAddr = util.nullTo(Bean.getROAD_ADD(),"");
		String resideStatus = util.nullTo(Bean.getLIVE(),"");
		String mulGubun = util.nullTo(Bean.getOBJ_SET(),"");
		
		//********** BEGIN_현진_20120213		
		String SI = util.nullTo(Bean.getSI(),"");
		String GUN = util.nullTo(Bean.getGUN(),"");
		String DORO_NM = util.nullTo(Bean.getDORO_NM(),"");
		String BD_BON = util.nullTo(Bean.getBD_BON(),"");
		String BD_BU = util.nullTo(Bean.getBD_BU(),"");
		String BD_NM = util.nullTo(Bean.getBD_NM(),"");
		String BD_DET_NM = util.nullTo(Bean.getBD_DET_NM(),"");
		
		String napDzipCd = util.nullTo(Bean.getPOST(),"");			// 납세자 도로명 우편번호
		String napDzipAddr = SI + " " + GUN + " " + DORO_NM ;		// 납세자도로명 우편주소
		String napDdtlAddr = "";									// 납세자도로명상세주소
		/*
		if(!(BD_BON.equals(""))&&(BD_BON!=null)){
			if(!(BD_BU.equals(""))&&(BD_BU!=null)){
				napDdtlAddr = BD_BON + "-" + BD_BU + " ";
			}else{
				napDdtlAddr = BD_BON + "-";
			}
		}
		*/
		
		if(!(BD_BON.equals(""))&&(BD_BON!=null)){
			if(!(BD_BU.equals(""))&&(BD_BU!=null)){
				napDzipAddr += " " + BD_BON + "-" + BD_BU + " ";
			}else{
				napDzipAddr += " " + BD_BON + " ";
			}
		}
		
		napDdtlAddr += BD_NM + " " + BD_DET_NM;
		if(DORO_NM==null||DORO_NM.equals("")||napDdtlAddr==null||napDdtlAddr.equals(" ")){
			napDzipCd = "";
			napDzipAddr = "";
			napDdtlAddr ="";
		}	
		//********** END_현진_20120213

		String SI_NM = commonCode.executeSiNm(Bean.getSIDO());	//	시 이름입력
		String SIGUNGU = commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU());	//	시 이름입력
		String BJ_NM = commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()+"00");
		String HJ_NM = commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD());
		String BONBUN = util.nullTo(Bean.getBONBUN(),"");
		String BUBUN = util.nullTo(Bean.getBUBUN(),"");
		
		//점용지 지번
		if(BUBUN	!= null)
		{
			if(!"".equals(BUBUN))
				BUBUN = "-" + BUBUN + "번지";
			else	BONBUN = BONBUN + "번지";
		}
		else	BONBUN = BONBUN + "번지";
		
		String MUL_ZIP_ADDR = SI_NM + " " + SIGUNGU + " " + BJ_NM;
		String MUL_DTL_ADDR = "";
		
		if("2".equals(Bean.getSPC_CD()))
		{
				MUL_DTL_ADDR = "산 " + BONBUN + BUBUN;
		}
		else
		{
			MUL_DTL_ADDR = BONBUN + BUBUN;
		}
		String mulZipAddr = util.nullTo(MUL_ZIP_ADDR,"");
		String mulDtlAddr = util.nullTo(MUL_DTL_ADDR,"");
		
		if(!"".equals(HJ_NM))
		{
			HJ_NM = " [행정동 : " + HJ_NM + "]";
		}
		String mulNm = mulZipAddr + " " + mulDtlAddr + HJ_NM;
		
		String mulOcrSiguCd = util.nullTo(Bean.getSIGUNGU(),"");
		String mulBdongriCd = util.nullTo(Bean.getBJ_CD(),"");
		String mulSpcCd = util.nullTo(Bean.getSPC_CD(),"");
		String mulBon = stringUtil.fixLength3(util.nullTo(Bean.getBONBUN(),""), 4, "0");
		String mulBu = stringUtil.fixLength3(util.nullTo(Bean.getBUBUN(),""), 4, "0");
		String mulTong = util.nullTo(Bean.getTONG(),"");
		String mulBan = util.nullTo(Bean.getBAN(),"");
		String mulAptNm = util.nullTo(Bean.getBD_NM(),"");
		String mulDong = util.nullTo(Bean.getBD_DONG(),"");
		String mulHosu = util.nullTo(Bean.getBD_HO(),"");
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		String mulZipCd = util.Post_Cut(Bean.getMUL_POST());	//util에우편번호 '-'삭제 추가 2009.6.4
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		String hdongCd = "";
		
		if( Bean.getHJ_CD() != null && !"".equals(Bean.getHJ_CD()) && Bean.getHJ_CD().length() > 2 ){
			hdongCd = Bean.getHJ_CD().substring(0, 3);
		}
		
		System.out.println("ccccccccccccccccccccccccccccccccccccccccccccccc");
		String bookNo = util.nullTo(Bean.getADMIN_NO(),"");
		System.out.println("dddddddddddddddddddddddddddddddddddddd");
		
		String hangmok1 = "";
		
		hangmok1 = util.nullTo(Bean.getFORM_ADJUST(),"");
		
		String hangmok2 = util.nullTo(Bean.getPURPOSE_NM(),"");
		String hangmok3 = util.nullTo(Bean.getTYPE_NM(),"");
		String hangmok4 = Bean.getFROMDATE() + " ~ " + Bean.getTODATE();
		
		//일시일경우...
//		if("2".equals(Bean.getSECTION()))
//		{
//			hangmok4 = Bean.getPARTLY_PERIOD() + "   총 " + Bean.getTOTAL_PERIOD()+ " 일";
//		}
//		else
//		{
//			hangmok4 = Bean.getMUL_FROMDATE() + " ~ " + Bean.getMUL_TODATE();
//		}
		
		String hangmok5 = util.nullTo(Bean.getAREA(),"");
		String hangmok6 = "";
		
		hangmok6 = Bean.getADMIN_NO();
		
		String gasanRateGubun = util.nullTo(Bean.getADD_SET(),"");
		double specialRate = 0;
		if(Bean.getRATE() != null) specialRate = Long.parseLong(Bean.getRATE());
		String specialRateApplySayu = util.nullTo(Bean.getRATE_CAUSE(),"");
		String bigo = util.nullTo(Bean.getNOTES(),"");
		String gasanAmtSkipGubun = util.nullTo(Bean.getADD_YN(),"");
		String ocrSiguCd = util.nullTo(Bean.getOCR_SIGU_CD(),"");
		String ocrBuseoCd = util.nullTo(Bean.getOCR_BUSEO_CD(),"");
		String lastWorkId = util.nullTo(bugwa_id,"");
		long vatAmt = 0;
		if(Bean.getVAT() != null) vatAmt = Long.parseLong(Bean.getVAT());
		String sysGubun = "ROADS";
		
		//연계항목  제외
		String etc1 = "";	
		String lastWorkDate = "";	
		String sendYmd = "";
		String sokwanBuseoCd = "";
		String sokwanMgrNm = "";
		String sokwanTelNo = "";
		long specialRateApplyCnt = 0;
		double specialRateHighRate = 0;
		long bunhalCnt = 0;
		
		//리턴 파라메터
	    String errorMsg = "";
	    String insertAk = "";
	    String insertKey = "";
	    String resultCnt = "";

		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			Bu04BugaWSDTO issue = new Bu04BugaWSDTO();

			//인수값 셋팅
			issue.setBigo(bigo);
			issue.setBookNo(bookNo);			//필수
			issue.setBunhalCnt(bunhalCnt);
			issue.setBuseoCd(buseoCd);			//필수
			issue.setEtc1(etc1);
			issue.setGasanAmtSkipGubun(gasanAmtSkipGubun);
			issue.setGasanRateGubun(gasanRateGubun);	//필수
			issue.setGigum(gigum);
			issue.setGigumGasanAmt(gigumGasanAmt);
			issue.setGigumIja(gigumIja);
			issue.setGukse(gukse);
			issue.setGukseGasanAmt(gukseGasanAmt);
			issue.setGukseIja(gukseIja);
			issue.setGuse(guse);
			issue.setGuseGasanAmt(guseGasanAmt);
			issue.setGuseIja(guseIja);
			issue.setHangmok1(hangmok1);
			issue.setHangmok2(hangmok2);
			issue.setHangmok3(hangmok3);
			issue.setHangmok4(hangmok4);
			issue.setHangmok5(hangmok5);
			issue.setHangmok6(hangmok6);
			issue.setHdongCd(hdongCd);
			issue.setLastWorkDate(lastWorkDate);
			issue.setLastWorkId(lastWorkId);		//필수
			issue.setMulAptNm(mulAptNm);
			issue.setMulBan(mulBan);
			issue.setMulBdongriCd(mulBdongriCd);
			issue.setMulBon(mulBon);
			issue.setMulBu(mulBu);
			issue.setMulDong(mulDong);
			issue.setMulDtlAddr(mulDtlAddr);
			issue.setMulGubun(mulGubun);
			issue.setMulHosu(mulHosu);
			issue.setMulNm(mulNm);
			issue.setMulOcrSiguCd(mulOcrSiguCd);
			issue.setMulSpcCd(mulSpcCd);
			issue.setMulTong(mulTong);
			issue.setMulZipAddr(mulZipAddr);
			issue.setMulZipCd(mulZipCd);
			issue.setNapDoroAddr(napDoroAddr);
			issue.setNapDtlAddr(napDtlAddr);
			issue.setNapEmail(napEmail);
			issue.setNapGubun(napGubun);
			issue.setNapId(napId);
			issue.setNapMobilNo(napMobilNo);
			issue.setNapNm(napNm);
			issue.setNapTelNo(napTelNo);
			issue.setNapZipAddr(napZipAddr);			//납세자주소필수
			issue.setNapZipCd(napZipCd);				//필수
			issue.setNapbuYmd(napbuYmd);
			issue.setNapgiAftYmd(napgiAftYmd);
			issue.setNapgiYmd(napgiYmd);
			issue.setOcrBuseoCd(ocrBuseoCd);
			issue.setOcrSiguCd(ocrSiguCd);
			issue.setResideStatus(resideStatus);
			issue.setSemokCd(semokCd);
			issue.setSendYmd(sendYmd);
			issue.setSidoCd(sidoCd);
			issue.setSiguCd(siguCd);							//필수
			issue.setSise(sise);
			issue.setSiseGasanAmt(siseGasanAmt);
			issue.setSiseIja(siseIja);
			//issue.setSokwanBuseoCd(sokwanBuseoCd);
			//issue.setSokwanMgrNm(sokwanMgrNm);
			//issue.setSokwanTelNo(sokwanTelNo);
			issue.setSpecialRate(specialRate);					//소수점자리수 체크			
			//issue.setSpecialRateApplyCnt(specialRateApplyCnt);
			issue.setSpecialRateApplySayu(specialRateApplySayu);
			//issue.setSpecialRateHighRate(specialRateHighRate);
			issue.setSuBuseoCd(suBuseoCd);							//필수
			issue.setSysGubun(sysGubun);							//필수 ('RACS'테스트 값, 'ROADS'등록요청하였음)
			issue.setTaxAmt(taxAmt);
			issue.setTaxGubun(taxGubun);
			issue.setTaxNo(taxNo);
			issue.setTaxYm(taxYm);
			issue.setTaxYmd(taxYmd);
			issue.setVatAmt(vatAmt);
			//********** BEGIN_현진_20120212
			issue.setNapDzipCd(napDzipCd);    
			issue.setNapDzipAddr(napDzipAddr);
			issue.setNapDdtlAddr(napDdtlAddr);
			//********** END_현진_20120212

			System.out.println("=======================start==========================");
			System.out.println("issue.getBigo())                 :"+issue.getBigo());
			System.out.println("issue.getBookNo())               :"+issue.getBookNo());
			System.out.println("issue.getBunhalCnt())            :"+issue.getBunhalCnt());
			System.out.println("issue.getBuseoCd())              :"+issue.getBuseoCd());
			System.out.println("issue.getEtc1())                 :"+issue.getEtc1());
			System.out.println("issue.getGasanAmtSkipGubun())    :"+issue.getGasanAmtSkipGubun());
			System.out.println("issue.getGasanRateGubun())       :"+issue.getGasanRateGubun());
			System.out.println("issue.getGigum())                :"+issue.getGigum());
			System.out.println("issue.getGigumGasanAmt())        :"+issue.getGigumGasanAmt());
			System.out.println("issue.getGigumIja())             :"+issue.getGigumIja());
			System.out.println("issue.getGukse())                :"+issue.getGukse());
			System.out.println("issue.getGukseGasanAmt())        :"+issue.getGukseGasanAmt());
			System.out.println("issue.getGukseIja())             :"+issue.getGukseIja());
			System.out.println("issue.getGuse())                 :"+issue.getGuse());
			System.out.println("issue.getGuseGasanAmt())         :"+issue.getGuseGasanAmt());
			System.out.println("issue.getGuseIja())              :"+issue.getGuseIja());
			System.out.println("issue.getHangmok1())             :"+issue.getHangmok1());
			System.out.println("issue.getHangmok2())             :"+issue.getHangmok2());
			System.out.println("issue.getHangmok3())             :"+issue.getHangmok3());
			System.out.println("issue.getHangmok4())             :"+issue.getHangmok4());
			System.out.println("issue.getHangmok5())             :"+issue.getHangmok5());
			System.out.println("issue.getHangmok6())             :"+issue.getHangmok6());
			System.out.println("issue.getHdongCd())              :"+issue.getHdongCd());;
			System.out.println("issue.getLastWorkDate())         :"+issue.getLastWorkDate());
			System.out.println("issue.getLastWorkId())           :"+issue.getLastWorkId());
			System.out.println("issue.getMulAptNm())             :"+issue.getMulAptNm());
			System.out.println("issue.getMulBan())               :"+issue.getMulBan());
			System.out.println("issue.getMulBdongriCd())         :"+issue.getMulBdongriCd());
			System.out.println("issue.getMulBon())               :"+issue.getMulBon());
			System.out.println("issue.getMulBu())                :"+issue.getMulBu());
			System.out.println("issue.getMulDong())              :"+issue.getMulDong());
			System.out.println("issue.getMulDtlAddr())           :"+issue.getMulDtlAddr());
			System.out.println("issue.getMulGubun())             :"+issue.getMulGubun());
			System.out.println("issue.getMulHosu())              :"+issue.getMulHosu());
			System.out.println("issue.getMulNm())                :"+issue.getMulNm());
			System.out.println("issue.getMulOcrSiguCd())         :"+issue.getMulOcrSiguCd());
			System.out.println("issue.getMulSpcCd())             :"+issue.getMulSpcCd());
			System.out.println("issue.getMulTong())              :"+issue.getMulTong());
			System.out.println("issue.getMulZipAddr())           :"+issue.getMulZipAddr());
			System.out.println("issue.getMulZipCd())             :"+issue.getMulZipCd());
			System.out.println("issue.getNapDoroAddr())          :"+issue.getNapDoroAddr());
			System.out.println("issue.getNapDtlAddr())           :"+issue.getNapDtlAddr());
			System.out.println("issue.getNapEmail())             :"+issue.getNapEmail());
			System.out.println("issue.getNapGubun())             :"+issue.getNapGubun());
			System.out.println("issue.getNapId())                :"+issue.getNapId());
			System.out.println("issue.getNapMobilNo())           :"+issue.getNapMobilNo());
			System.out.println("issue.getNapNm())                :"+issue.getNapNm());
			System.out.println("issue.getNapTelNo())             :"+issue.getNapTelNo());
			System.out.println("issue.getNapZipAddr())           :"+issue.getNapZipAddr());
			System.out.println("issue.getNapZipCd())             :"+issue.getNapZipCd());
			System.out.println("issue.getNapbuYmd())             :"+issue.getNapbuYmd());
			System.out.println("issue.getNapgiAftYmd())          :"+issue.getNapgiAftYmd());
			System.out.println("issue.getNapgiYmd())             :"+issue.getNapgiYmd());
			System.out.println("issue.getOcrBuseoCd())           :"+issue.getOcrBuseoCd());
			System.out.println("issue.getOcrSiguCd())            :"+issue.getOcrSiguCd());
			System.out.println("issue.getResideStatus())         :"+issue.getResideStatus());
			System.out.println("issue.getSemokCd())              :"+issue.getSemokCd());
			System.out.println("issue.getSendYmd())              :"+issue.getSendYmd());
			System.out.println("issue.getSidoCd())               :"+issue.getSidoCd());
			System.out.println("issue.getSiguCd())               :"+issue.getSiguCd());
			System.out.println("issue.getSise())                 :"+issue.getSise());
			System.out.println("issue.getSiseGasanAmt())         :"+issue.getSiseGasanAmt());
			System.out.println("issue.getSiseIja())              :"+issue.getSiseIja());
			System.out.println("issue.getSpecialRate())          :"+issue.getSpecialRate());
			System.out.println("issue.getSpecialRateApplySayu()) :"+issue.getSpecialRateApplySayu());
			System.out.println("issue.getSuBuseoCd())            :"+issue.getSuBuseoCd());
			System.out.println("issue.getSysGubun())             :"+issue.getSysGubun());
			System.out.println("issue.getTaxAmt())               :"+issue.getTaxAmt());
			System.out.println("issue.getTaxGubun())             :"+issue.getTaxGubun());
			System.out.println("issue.getTaxNo())                :"+issue.getTaxNo());
			System.out.println("issue.getTaxYm())                :"+issue.getTaxYm());
			System.out.println("issue.getTaxYmd())               :"+issue.getTaxYmd());
			System.out.println("issue.getVatAmt())               :"+issue.getVatAmt());
			//********** BEGIN_현진_20120213
			System.out.println("issue.getNapDzipCd()            :"+issue.getNapDzipCd());      
			System.out.println("issue.getNapDzipAddr()          :"+issue.getNapDzipAddr());       
			System.out.println("issue.getNapDdtlAddr()          :"+issue.getNapDdtlAddr());
			//********** END_현진_20120213
			
			System.out.println("=======================end==========================");
			
			if(ws == null){
				//프록시 서버 생성 실패
				System.out.println("프록시 서버 생성 실패");
			}else{
				
	        	System.out.println("프록시 서버 생성 성공");
	        	//여기서 원격 함수 호출
//	        	System.out.println("   insert합니다   ");
	        	StatusCodeWSDTO rs = ws.insertBugaRegist(issue);
//	        	System.out.println("   rs  = "+rs+"   ;   ");
	        	if(rs != null){
	        		
	        		if(rs.getErrorCode().equals("0")){
	        			
	        			//성공
	        			if(rs.getInsertKey() != null){
	        				insertKey = rs.getInsertKey();
	        			}
	        			
	        			if(rs.getInsertAk() != null){
	        				insertAk = rs.getInsertAk();
	        			}
	        			
	        			if(rs.getResultCnt() != null){
	        				resultCnt = rs.getResultCnt();
	        			}
	        			
	        			System.out.println("insertKey="+insertKey);
	        			System.out.println("insertAk="+insertAk);
	        			System.out.println("resultCnt="+resultCnt);
	        			
	        			bugaRegistBean.setResCode("1");
	        			bugaRegistBean.setInsertKey(insertKey);
	        			bugaRegistBean.setInsertAk(insertAk);
	        			bugaRegistBean.setResultCnt(resultCnt);
	        			bugaRegistBean.setErrorMsg(null);
	        			
	        			return	bugaRegistBean;
	        			
	        		}else{
	        			
	        			System.out.println("rs.getErrorMsg()::"+rs.getErrorMsg()+"::");
	        			//원격 서버의 액션 에러 발생
	        			errorMsg = rs.getErrorMsg();	
	        		
	        			bugaRegistBean.setResultCnt(resultCnt);
	        			bugaRegistBean.setErrorMsg(errorMsg);
	        			return	bugaRegistBean;
	        		}
	        	}
			}
		} catch (Exception e) {
			String errReason = "에러::"+e.toString();
			System.out.println(errReason);
			bugaRegistBean.setErrorMsg(errReason);
			return	bugaRegistBean;
		}
	
		return null;
	}	
	
	/**
	 * 사용자정보조회 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public TaxationBean getUserInfo(String user_id) throws Exception {
	
		TaxationBean	userInfoBean = new TaxationBean();
		
		//리턴파라메터
		String buseoCd = "";
	    String rowStatus = "";
	    String siguCd = "";
		
		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//프록시 서버 생성 실패
//				System.out.println("프록시 서버 생성 실패");
	
			}else{
				
				Bu04UserInfoWSDTO rs = ws.getUserInfo(user_id);
		    	
		    	if(rs != null){

	        		if(rs.getBuseoCd() != null){
	        			buseoCd = rs.getBuseoCd();
	        		}
	        		
	        		if(rs.getRowStatus() != null){
	        			rowStatus = rs.getRowStatus();
	        		}
	        		
	        		if(rs.getSiguCd() != null){
	        			siguCd = rs.getSiguCd();
	        		}
	        		
//	        		request.setAttribute("resCode", "1");
//		    		request.setAttribute("buseoCd", buseoCd);
//		    		request.setAttribute("rowStatus", rowStatus);
//		    		request.setAttribute("siguCd", siguCd);
		 
	        		userInfoBean.setDEPT_CD(buseoCd);
		    		userInfoBean.setSIGU_CD(siguCd);
		    		
		    		return userInfoBean;
		    	}	      	
			}   
			
		}catch(Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
			
//			request.setAttribute("resCode", "2");
//			request.setAttribute("Result", errReason);
		}
	
		return null;
	}
	
	/**
	 * 세목정보목록조회 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public ModelAndView getListSemokInfo(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		//페이징을 위해 받는 변수
		String r_page = "";
		String r_block_page = "";
		String r_searchCause = "";
		String r_SQL = "";
		
		//getSemokInfo 입력파라메터
		String sigu_cd = "";
		if( request.getParameter("sigu_cd") != null && !(request.getParameter("sigu_cd")).equals("") ){
			sigu_cd=  request.getParameter("sigu_cd");
		}

		String buseo_cd = "";
	    if( request.getParameter("buseo_cd") != null && !(request.getParameter("buseo_cd")).equals("") ){
	    	buseo_cd=  request.getParameter("buseo_cd");
		}
	    
		//페이징을 위해 받는 변수값
		if(request.getParameter("page") != null && !(request.getParameter("page")).equals("") ){
			r_page=  request.getParameter("page");
		}
		
		if(request.getParameter("block_page") != null && !(request.getParameter("block_page")).equals("") ){
			r_block_page=  request.getParameter("block_page");
		} 
		
		if(request.getParameter("searchCause") != null && !(request.getParameter("searchCause")).equals("") ){
			r_searchCause=  request.getParameter("searchCause");
		} 
		
		if(request.getParameter("SQL") != null && !(request.getParameter("SQL")).equals("")){
			r_SQL=  request.getParameter("SQL");
		}
			
	    Bu04SemokWSDTO[] rs = {} ;
	    
		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//프록시 서버 생성 실패
//				System.out.println("프록시 서버 생성 실패");
			}else{
					
				rs = ws.getListSemokInfo(sigu_cd, buseo_cd);
	        	
	        	if(rs != null){
	        		
	        		java.util.List list = java.util.Arrays.asList(rs);
	    			int sizeOfList = list.size();
	    			
	    			request.setAttribute("resCode", "1");
					request.setAttribute("sizeOfList", String.valueOf(sizeOfList));
					request.setAttribute("page", r_page);
					request.setAttribute("block_page", r_block_page);
					request.setAttribute("searchCause", r_searchCause);
					request.setAttribute("SQL", r_SQL);	
	        	}     	
			}   
			
		}catch(Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
			
			request.setAttribute("resCode", "2");
			request.setAttribute("Result", errReason);
			request.setAttribute("page", r_page);
			request.setAttribute("block_page", r_block_page);
			request.setAttribute("searchCause", r_searchCause);
			request.setAttribute("SQL", r_SQL);

		}
	
		return new ModelAndView("/sampleBugaWSProxy/testOutput","list",rs);
	}
	
	/**
	 * 세목정보조회 (기존세목정보의확장)
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public ModelAndView getSemokInfoRACS(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		//getSemokInfo 입력파라메터
		String sigu_cd = "";
		String buseo_cd = "";
		String semok_cd = "";
		
		//리턴 파라메터
		double gasanRate = 0;
	    String gasanRateGubun = "";
	    String ocrBuseoCd = "";
	    String ocrSiguCd = "";
	    String suBuseoCd = "";
	    String vatYn = "";
	    
	    String napgiGubun = "";
	    String hangmokcd1 = "";
	    String hangmokcd2 = "";
	    String hangmokcd3 = "";
	    String hangmokcd4 = "";
	    String hangmokcd5 = "";
	    String hangmokcd6 = "";    
		
		if(request.getParameter("sigu_cd") != null && !(request.getParameter("sigu_cd")).equals("") ){
			sigu_cd=  request.getParameter("sigu_cd");
		}
		
		if(request.getParameter("buseo_cd") != null && !(request.getParameter("buseo_cd")).equals("") ){
			buseo_cd=  request.getParameter("buseo_cd");
		}
		
		if(request.getParameter("semok_cd") != null && !(request.getParameter("semok_cd")).equals("") ){
			semok_cd=  request.getParameter("semok_cd");
		}
				
		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//프록시 서버 생성 실패
//				System.out.println("프록시 서버 생성 실패");
			}else{
				
//				System.out.println("프록시 서버 생성");
				
				Bu04SemokWSRACSDTO rs = ws.getSemokInfoRACS(sigu_cd ,buseo_cd ,semok_cd);
	        	
	        	if(rs != null){
		
	        		if(rs.getGasanRateGubun() != null){
	        			gasanRateGubun = rs.getGasanRateGubun();
	        		}
	        		
	        		if(rs.getVatYn() != null){
	        			vatYn = rs.getVatYn();
	        		}
	        		
	        		if(rs.getOcrBuseoCd() != null){
	        			ocrBuseoCd = rs.getOcrBuseoCd();
	        		}
	        		
	        		if(rs.getOcrSiguCd() != null){
	        			ocrSiguCd = rs.getOcrSiguCd();
	        		}
	        		
	        		if(rs.getSuBuseoCd() != null){
	        			suBuseoCd = rs.getSuBuseoCd();
	        		}
	        		
	        		if(rs.getGasanRate() != 0){
	        			gasanRate = rs.getGasanRate();
	        		}
	        		
	        		//추가
	        		if(rs.getNapgiGubun() != null){
	        			napgiGubun = rs.getNapgiGubun();
	        		}
	        		
	        		if(rs.getHangmokcd1() != null){
	        			hangmokcd1 = rs.getHangmokcd1();
	        		}
	        		
	        		if(rs.getHangmokcd2() != null){
	        			hangmokcd2 = rs.getHangmokcd2();
	        		}
	        		
	        		if(rs.getHangmokcd3() != null){
	        			hangmokcd3 = rs.getHangmokcd3();
	        		}
	        		
	        		if(rs.getHangmokcd4() != null){
	        			hangmokcd4 = rs.getHangmokcd4();
	        		}
	        		
	        		if(rs.getHangmokcd5() != null){
	        			hangmokcd5 = rs.getHangmokcd5();
	        		}
	        		
	        		if(rs.getHangmokcd6() != null){
	        			hangmokcd6 = rs.getHangmokcd6();
	        		}
	        		
					request.setAttribute("gasanRateGubun", gasanRateGubun);
					request.setAttribute("vatYn", vatYn);
					request.setAttribute("ocrBuseoCd", ocrBuseoCd);
					request.setAttribute("ocrSiguCd", ocrSiguCd);
					request.setAttribute("suBuseoCd", suBuseoCd);
					request.setAttribute("gasanRate",String.valueOf(gasanRate));
					request.setAttribute("napgiGubun",napgiGubun);	
					request.setAttribute("hangmokcd1",hangmokcd1);
					request.setAttribute("hangmokcd2",hangmokcd2);
					request.setAttribute("hangmokcd3",hangmokcd3);
					request.setAttribute("hangmok4d4",hangmokcd4);
					request.setAttribute("hangmokcd5",hangmokcd5);
					request.setAttribute("hangmokcd6",hangmokcd6);
					
	        	}     	
			}   
			
			request.setAttribute("resCode", "1");

		}catch(Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
			
			request.setAttribute("resCode", "2");
			request.setAttribute("Result", errReason);

		}
	
		return new ModelAndView("/sampleBugaWSProxy/testOutput");
	}	
	
	/**
	 * 비과세등록 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public ModelAndView biGwaSeRegistWS(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		//getNewTaxNo 입력파라메터
		String sigu_cd = "";
		if( request.getParameter("sigu_cd") != null && !(request.getParameter("sigu_cd")).equals("") ){
			sigu_cd=  request.getParameter("sigu_cd");
		}

		String buseo_cd = "";
		if( request.getParameter("buseo_cd") != null && !(request.getParameter("buseo_cd")).equals("") ){
			buseo_cd=  request.getParameter("buseo_cd");
		}
		
		String semok_cd = "";
		if( request.getParameter("semok_cd") != null && !(request.getParameter("semok_cd")).equals("") ){
			semok_cd=  request.getParameter("semok_cd");
		}
		
		String tax_ym = "";
		if( request.getParameter("tax_ym") != null && !(request.getParameter("tax_ym")).equals("") ){
			tax_ym=  request.getParameter("tax_ym");
		}
		
		String tax_gubun = "";
		if( request.getParameter("tax_gubun") != null && !(request.getParameter("tax_gubun")).equals("") ){
			tax_gubun=  request.getParameter("tax_gubun");
		}
		
		String tax_no = "";
		if( request.getParameter("tax_no") != null && !(request.getParameter("tax_no")).equals("") ){
			tax_no=  request.getParameter("tax_no");
		}
		
		String sys_gubun = "";
		if( request.getParameter("sys_gubun") != null && !(request.getParameter("sys_gubun")).equals("") ){
			sys_gubun=  request.getParameter("sys_gubun");
		}	
				
		//리턴 파라메터
	    String errorMsg = "";
	    String insertAk = "";
	    String insertKey = "";
	    String resultCnt = "";
				
		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//프록시 서버 생성 실패
//				System.out.println("프록시 서버 생성 실패");
			}else{
				
//	        	System.out.println("프록시 서버 생성 성공");
	        	StatusCodeWSDTO rs = ws.biGwaSeRegistWS(sigu_cd, buseo_cd, semok_cd, tax_ym, tax_gubun, tax_no, sys_gubun);
	        	
	        	if(rs != null){
	        		
	        		if(rs.getErrorCode().equals("0")){

	        			//성공
	        			if(rs.getInsertKey() != null){
	        				insertKey = rs.getInsertKey();
	        			}
	        			
	        			if(rs.getInsertAk() != null){
	        				insertAk = rs.getInsertAk();
	        			}
	        			
	        			if(rs.getResultCnt() != null){
	        				resultCnt = rs.getResultCnt();
	        			}
	        			
	        			request.setAttribute("resCode", "1");
	        			request.setAttribute("insertKey", insertKey);
	        			request.setAttribute("insertAk", insertAk);
	        			request.setAttribute("resultCnt", resultCnt);
	        			
	        		}else{
	        			
	        			//원격 서버의 액션 에러 발생
	        			errorMsg = rs.getErrorMsg();
	        			
	        			request.setAttribute("resCode", "2");
	        			request.setAttribute("errorMsg", errorMsg);
	        			
	        		}		
	        	}
			}

		} catch (Exception e) { 
			
			String errReason = "에러::"+e.toString();
			System.out.println(errReason);
			request.setAttribute("resCode", "2");
			request.setAttribute("errorMsg", errReason);
		}
	
		return new ModelAndView("/sampleBugaWSProxy/testOutput");
	}		
}