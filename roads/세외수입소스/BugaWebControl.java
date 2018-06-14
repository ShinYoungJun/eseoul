package main.java.test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	public ModelAndView getSemokInfo(HttpServletRequest request,
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
				System.out.println("프록시 서버 생성 실패");
			}else{
				
				System.out.println("프록시 서버 생성");
				
				Bu04SemokWSDTO rs = ws.getSemokInfo(sigu_cd ,buseo_cd ,semok_cd);
	        	
	        	if(rs != null){
	        		
	        		System.out.println("결과값 리턴");
	        		
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
	        		
					request.setAttribute("gasanRateGubun", gasanRateGubun);
					request.setAttribute("vatYn", vatYn);
					request.setAttribute("ocrBuseoCd", ocrBuseoCd);
					request.setAttribute("ocrSiguCd", ocrSiguCd);
					request.setAttribute("suBuseoCd", suBuseoCd);
					request.setAttribute("gasanRate", String.valueOf(gasanRate));
		
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
	 * 과세번호 생성 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public ModelAndView getNewTaxNo(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		//getNewTaxNo 입력파라메터
		String sigu_cd = "";
		if( request.getParameter("sigu_cd") != null && !(request.getParameter("sigu_cd")).equals("") ){
			sigu_cd = request.getParameter("sigu_cd");
		}

		String semok_cd = "";
		if( request.getParameter("semok_cd") != null && !(request.getParameter("semok_cd")).equals("") ){
			semok_cd = request.getParameter("semok_cd");
		}
		
		String tax_ym = "";
		if( request.getParameter("tax_ym") != null && !(request.getParameter("tax_ym")).equals("") ){
			tax_ym = request.getParameter("tax_ym");
		}
		
		String tax_gubun = "";
		if( request.getParameter("tax_gubun") != null && !(request.getParameter("tax_gubun")).equals("") ){
			tax_gubun = request.getParameter("tax_gubun");
		}
		
		//리턴 파라메터
		String tax_no = "";
				
		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//프록시 서버 생성 실패
				System.out.println("프록시 서버 생성 실패");
	
			}else{
				
				tax_no = ws.getNewTaxNo(sigu_cd, semok_cd, tax_ym, tax_gubun);
		    	
		    	if(tax_no != null){
		    		
		    		request.setAttribute("taxNo", tax_no);
					request.setAttribute("resCode", "1");

		    	}else{
		    		
		    		request.setAttribute("resCode", "2");
		    		request.setAttribute("Result", "tax_no가 존재하지 않습니다");  		
		    	}	      	
			}   
			
		}catch(Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
			
			request.setAttribute("resCode", "2");
			request.setAttribute("Result", errReason);
		}
	
		return new ModelAndView("/sampleBugaWSProxy/testOutput");
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
	
	public ModelAndView insertBugaRegist(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		String bigo = "";
		if( request.getParameter("bigo") != null && !(request.getParameter("bigo")).equals("") ){
			bigo = request.getParameter("bigo");
		}
		
		String bookNo = "";
		if( request.getParameter("bookNo") != null && !(request.getParameter("bookNo")).equals("") ){
			bookNo = request.getParameter("bookNo");
		}
		
		long bunhalCnt = 0;
		if( request.getParameter("bunhalCnt") != null && !(request.getParameter("bunhalCnt")).equals("") ){
			bunhalCnt = Integer.parseInt(request.getParameter("bunhalCnt"));
		}
		
		String buseoCd = "";
		if( request.getParameter("buseoCd") != null && !(request.getParameter("buseoCd")).equals("") ){
			buseoCd = request.getParameter("buseoCd");
		}
		
		String etc1 = "";
		if( request.getParameter("etc1") != null && !(request.getParameter("etc1")).equals("") ){
			etc1 = request.getParameter("etc1");
		}
				
		String gasanAmtSkipGubun = "";
		if( request.getParameter("gasanAmtSkipGubun") != null && !(request.getParameter("gasanAmtSkipGubun")).equals("") ){
			gasanAmtSkipGubun = request.getParameter("gasanAmtSkipGubun");
		}
		
		String gasanRateGubun = "";
		if( request.getParameter("gasanRateGubun") != null && !(request.getParameter("gasanRateGubun")).equals("") ){
			gasanRateGubun = request.getParameter("gasanRateGubun");
		}
		
		long gigum = 0;
		if( request.getParameter("gigum") != null && !(request.getParameter("gigum")).equals("") ){
			gigum =  Integer.parseInt(request.getParameter("gigum"));
		}
		
		long gigumGasanAmt = 0;
		if( request.getParameter("gigumGasanAmt") != null && !(request.getParameter("gigumGasanAmt")).equals("") ){
			gigumGasanAmt = Integer.parseInt(request.getParameter("gigumGasanAmt"));
		}
		
		long gigumIja = 0;
		if( request.getParameter("gigumIja") != null && !(request.getParameter("gigumIja")).equals("") ){
			gigumIja = Integer.parseInt(request.getParameter("gigumIja"));
		}
		
		long gukse = 0;
		if( request.getParameter("gukse") != null && !(request.getParameter("gukse")).equals("") ){
			gukse = Integer.parseInt(request.getParameter("gukse"));
		}
		
		long gukseGasanAmt = 0;
		if( request.getParameter("gukseGasanAmt") != null && !(request.getParameter("gukseGasanAmt")).equals("") ){
			gukseGasanAmt = Integer.parseInt(request.getParameter("gukseGasanAmt"));
		}
		
		long gukseIja = 0;
		if( request.getParameter("gukseIja") != null && !(request.getParameter("gukseIja")).equals("") ){
			gukseIja = Integer.parseInt(request.getParameter("gukseIja"));
		}
		
		long guse = 0;
		if( request.getParameter("guse") != null && !(request.getParameter("guse")).equals("") ){
			guse = Integer.parseInt(request.getParameter("guse"));
		}
		
		long guseGasanAmt = 0;
		if( request.getParameter("guseGasanAmt") != null && !(request.getParameter("guseGasanAmt")).equals("") ){
			guseGasanAmt = Integer.parseInt(request.getParameter("guseGasanAmt"));
		}
		
		long guseIja = 0;
		if( request.getParameter("guseIja") != null && !(request.getParameter("guseIja")).equals("") ){
			guseIja = Integer.parseInt(request.getParameter("guseIja"));
		}
		
		String hangmok1 = "";
		if( request.getParameter("hangmok1") != null && !(request.getParameter("hangmok1")).equals("") ){
			hangmok1 = request.getParameter("hangmok1");
		}
		
		String hangmok2 = "";
		if( request.getParameter("hangmok2") != null && !(request.getParameter("hangmok2")).equals("") ){
			hangmok2 = request.getParameter("hangmok2");
		}
		
		String hangmok3 = "";
		if( request.getParameter("hangmok3") != null && !(request.getParameter("hangmok3")).equals("") ){
			hangmok3 = request.getParameter("hangmok3");
		}
		
		String hangmok4 = "";
		if( request.getParameter("hangmok4") != null && !(request.getParameter("hangmok4")).equals("") ){
			hangmok4 = request.getParameter("hangmok4");
		}
		
		String hangmok5 = "";
		if( request.getParameter("hangmok5") != null && !(request.getParameter("hangmok5")).equals("") ){
			hangmok5 = request.getParameter("hangmok5");
		}
		
		String hangmok6 = "";
		if( request.getParameter("hangmok6") != null && !(request.getParameter("hangmok6")).equals("") ){
			hangmok6 = request.getParameter("hangmok6");
		}
		
		String hdongCd = "";
		if( request.getParameter("hdongCd") != null && !(request.getParameter("hdongCd")).equals("") ){
			hdongCd = request.getParameter("hdongCd");
		}
		
		String lastWorkDate = "";
		if( request.getParameter("lastWorkDate") != null && !(request.getParameter("lastWorkDate")).equals("") ){
			lastWorkDate = request.getParameter("lastWorkDate");
		}
		
		String lastWorkId = "";
		if( request.getParameter("lastWorkId") != null && !(request.getParameter("lastWorkId")).equals("") ){
			lastWorkId = request.getParameter("lastWorkId");
		}
		
		String mulAptNm = "";
		if( request.getParameter("mulAptNm") != null && !(request.getParameter("mulAptNm")).equals("") ){
			mulAptNm = request.getParameter("mulAptNm");
		}
		
		String mulBan = "";
		if( request.getParameter("mulBan") != null && !(request.getParameter("mulBan")).equals("") ){
			mulBan = request.getParameter("mulBan");
		}
		
		String mulBdongriCd = "";
		if( request.getParameter("mulBdongriCd") != null && !(request.getParameter("mulBdongriCd")).equals("") ){
			mulBdongriCd = request.getParameter("mulBdongriCd");
		}
		
		String mulBon = "";
		if( request.getParameter("mulBon") != null && !(request.getParameter("mulBon")).equals("") ){
			mulBon = request.getParameter("mulBon");
		}
		
		String mulBu = "";
		if( request.getParameter("mulBu") != null && !(request.getParameter("mulBu")).equals("") ){
			mulBu = request.getParameter("mulBu");
		}
		
		String mulDong = "";
		if( request.getParameter("mulDong") != null && !(request.getParameter("mulDong")).equals("") ){
			mulDong = request.getParameter("mulDong");
		}
		
		String mulDtlAddr = "";
		if( request.getParameter("mulDtlAddr") != null && !(request.getParameter("mulDtlAddr")).equals("") ){
			mulDtlAddr = request.getParameter("mulDtlAddr");
		}
		
		String mulGubun = "";
		if( request.getParameter("mulGubun") != null && !(request.getParameter("mulGubun")).equals("") ){
			mulGubun = request.getParameter("mulGubun");
		}
		
		String mulHosu = "";
		if( request.getParameter("mulHosu") != null && !(request.getParameter("mulHosu")).equals("") ){
			mulHosu = request.getParameter("mulHosu");
		}
		
		String mulNm = "";
		if( request.getParameter("mulNm") != null && !(request.getParameter("mulNm")).equals("") ){
			mulNm = request.getParameter("mulNm");
		}
		
		String mulOcrSiguCd = "";
		if( request.getParameter("mulOcrSiguCd") != null && !(request.getParameter("mulOcrSiguCd")).equals("") ){
			mulOcrSiguCd = request.getParameter("mulOcrSiguCd");
		}
		
		String mulSpcCd = "";
		if( request.getParameter("mulSpcCd") != null && !(request.getParameter("mulSpcCd")).equals("") ){
			mulSpcCd = request.getParameter("mulSpcCd");
		}
		
		String mulTong = "";
		if( request.getParameter("mulTong") != null && !(request.getParameter("mulTong")).equals("") ){
			mulTong = request.getParameter("mulTong");
		}
		
		String mulZipAddr = "";
		if( request.getParameter("mulZipAddr") != null && !(request.getParameter("mulZipAddr")).equals("") ){
			mulZipAddr = request.getParameter("mulZipAddr");
		}
		
		String mulZipCd = "";
		if( request.getParameter("mulZipCd") != null && !(request.getParameter("mulZipCd")).equals("") ){
			mulZipCd = request.getParameter("mulZipCd");
		}
		
		String napDoroAddr = "";
		if( request.getParameter("napDoroAddr") != null && !(request.getParameter("napDoroAddr")).equals("") ){
			napDoroAddr = request.getParameter("napDoroAddr");
		}
		
		String napDtlAddr = "";
		if( request.getParameter("napDtlAddr") != null && !(request.getParameter("napDtlAddr")).equals("") ){
			napDtlAddr = request.getParameter("napDtlAddr");
		}
		
		String napEmail = "";
		if( request.getParameter("napEmail") != null && !(request.getParameter("napEmail")).equals("") ){
			napEmail = request.getParameter("napEmail");
		}
		
		String napGubun = "";
		if( request.getParameter("napGubun") != null && !(request.getParameter("napGubun")).equals("") ){
			napGubun = request.getParameter("napGubun");
		}
		
		String napId = "";
		if( request.getParameter("napId") != null && !(request.getParameter("napId")).equals("") ){
			napId = request.getParameter("napId");
		}
		
		String napMobilNo = "";
		if( request.getParameter("napMobilNo") != null && !(request.getParameter("napMobilNo")).equals("") ){
			napMobilNo = request.getParameter("napMobilNo");
		}
		
		String napNm = "";
		if( request.getParameter("napNm") != null && !(request.getParameter("napNm")).equals("") ){
			napNm = request.getParameter("napNm");
		}
		
		String napTelNo = "";
		if( request.getParameter("napTelNo") != null && !(request.getParameter("napTelNo")).equals("") ){
			napTelNo = request.getParameter("napTelNo");
		}
		
		String napZipAddr = "";
		if( request.getParameter("napZipAddr") != null && !(request.getParameter("napZipAddr")).equals("") ){
			napZipAddr = request.getParameter("napZipAddr");
		}
		
		String napZipCd = "";
		if( request.getParameter("napZipCd") != null && !(request.getParameter("napZipCd")).equals("") ){
			napZipCd = request.getParameter("napZipCd");
		}
		
		String napbuYmd = "";
		if( request.getParameter("napbuYmd") != null && !(request.getParameter("napbuYmd")).equals("") ){
			napbuYmd = request.getParameter("napbuYmd");
		}
		
		String napgiAftYmd = "";
		if( request.getParameter("napgiAftYmd") != null && !(request.getParameter("napgiAftYmd")).equals("") ){
			napgiAftYmd = request.getParameter("napgiAftYmd");
		}
		
		String napgiYmd = "";
		if( request.getParameter("napgiYmd") != null && !(request.getParameter("napgiYmd")).equals("") ){
			napgiYmd = request.getParameter("napgiYmd");
		}
		
		String ocrBuseoCd = "";
		if( request.getParameter("ocrBuseoCd") != null && !(request.getParameter("ocrBuseoCd")).equals("") ){
			ocrBuseoCd = request.getParameter("ocrBuseoCd");
		}
		
		String ocrSiguCd = "";
		if( request.getParameter("ocrSiguCd") != null && !(request.getParameter("ocrSiguCd")).equals("") ){
			ocrSiguCd = request.getParameter("ocrSiguCd");
		}
		
		String resideStatus = "";
		if( request.getParameter("resideStatus") != null && !(request.getParameter("resideStatus")).equals("") ){
			resideStatus = request.getParameter("resideStatus");
		}
			
		String semokCd = "";
		if( request.getParameter("semokCd") != null && !(request.getParameter("semokCd")).equals("") ){
			semokCd = request.getParameter("semokCd");
		}
		
		String sendYmd = "";
		if( request.getParameter("sendYmd") != null && !(request.getParameter("sendYmd")).equals("") ){
			sendYmd = request.getParameter("sendYmd");
		}
		
		String sidoCd = "";
		if( request.getParameter("sidoCd") != null && !(request.getParameter("sidoCd")).equals("") ){
			sidoCd = request.getParameter("sidoCd");
		}
		
		String siguCd = "";
		if( request.getParameter("siguCd") != null && !(request.getParameter("siguCd")).equals("") ){
			siguCd = request.getParameter("siguCd");
		}
		
		long sise = 0;
		if( request.getParameter("sise") != null && !(request.getParameter("sise")).equals("") ){
			sise = Integer.parseInt(request.getParameter("sise"));
		}
		
		long siseGasanAmt = 0;
		if( request.getParameter("siseGasanAmt") != null && !(request.getParameter("siseGasanAmt")).equals("") ){
			siseGasanAmt = Integer.parseInt(request.getParameter("siseGasanAmt"));
		}
		
		long siseIja = 0;
		if( request.getParameter("siseIja") != null && !(request.getParameter("siseIja")).equals("") ){
			siseIja = Integer.parseInt(request.getParameter("siseIja"));
		}
		
		String sokwanBuseoCd = "";
		if( request.getParameter("sokwanBuseoCd") != null && !(request.getParameter("sokwanBuseoCd")).equals("") ){
			sokwanBuseoCd = request.getParameter("sokwanBuseoCd");
		}
		
		String sokwanMgrNm = "";
		if( request.getParameter("sokwanMgrNm") != null && !(request.getParameter("sokwanMgrNm")).equals("") ){
			sokwanMgrNm = request.getParameter("sokwanMgrNm");
		}
		
		String sokwanTelNo = "";
		if( request.getParameter("sokwanTelNo") != null && !(request.getParameter("sokwanTelNo")).equals("") ){
			sokwanTelNo = request.getParameter("sokwanTelNo");
		}
		
		double specialRate = 0;
		if( request.getParameter("specialRate") != null && !(request.getParameter("specialRate")).equals("") ){
			specialRate = Double.parseDouble(request.getParameter("specialRate"));
		}
		
		long specialRateApplyCnt = 0;
		if( request.getParameter("specialRateApplyCnt") != null && !(request.getParameter("specialRateApplyCnt")).equals("") ){
			specialRateApplyCnt = Integer.parseInt(request.getParameter("specialRateApplyCnt"));
		}
		
		String specialRateApplySayu = "";
		if( request.getParameter("specialRateApplySayu") != null && !(request.getParameter("specialRateApplySayu")).equals("") ){
			specialRateApplySayu = request.getParameter("specialRateApplySayu");
		}
		
		double specialRateHighRate = 0;
		if( request.getParameter("specialRateHighRate") != null && !(request.getParameter("specialRateHighRate")).equals("") ){
			specialRateHighRate = Double.parseDouble(request.getParameter("specialRateHighRate"));
		}
		
		String suBuseoCd = "";
		if( request.getParameter("suBuseoCd") != null && !(request.getParameter("suBuseoCd")).equals("") ){
			suBuseoCd = request.getParameter("suBuseoCd");
		}
		
		String sysGubun = "";
		if( request.getParameter("sysGubun") != null && !(request.getParameter("sysGubun")).equals("") ){
			sysGubun = request.getParameter("sysGubun");
		}
		
		long taxAmt = 0;
		if( request.getParameter("taxAmt") != null && !(request.getParameter("taxAmt")).equals("") ){
			taxAmt = Integer.parseInt(request.getParameter("taxAmt"));
		}
		
		String taxGubun = "";
		if( request.getParameter("taxGubun") != null && !(request.getParameter("taxGubun")).equals("") ){
			taxGubun = request.getParameter("taxGubun");
		}
		
		String taxNo = "";
		if( request.getParameter("taxNo") != null && !(request.getParameter("taxNo")).equals("") ){
			taxNo = request.getParameter("taxNo");
		}
		
		String taxYm = "";
		if( request.getParameter("taxYm") != null && !(request.getParameter("taxYm")).equals("") ){
			taxYm = request.getParameter("taxYm");
		}
		
		String taxYmd = "";
		if( request.getParameter("taxYmd") != null && !(request.getParameter("taxYmd")).equals("") ){
			taxYmd = request.getParameter("taxYmd");
		}
		
		long vatAmt = 0;
		if( request.getParameter("vatAmt") != null && !(request.getParameter("vatAmt")).equals("") ){
			vatAmt = Integer.parseInt(request.getParameter("vatAmt"));
		}
			
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
			issue.setBookNo(bookNo);
			issue.setBunhalCnt(bunhalCnt);
			issue.setBuseoCd(buseoCd);
			issue.setEtc1(etc1);
			issue.setGasanAmtSkipGubun(gasanAmtSkipGubun);
			issue.setGasanRateGubun(gasanRateGubun);
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
			issue.setLastWorkId(lastWorkId);
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
			issue.setNapZipAddr(napZipAddr);
			issue.setNapZipCd(napZipCd);
			issue.setNapbuYmd(napbuYmd);
			issue.setNapgiAftYmd(napgiAftYmd);
			issue.setNapgiYmd(napgiYmd);
			issue.setOcrBuseoCd(ocrBuseoCd);
			issue.setOcrSiguCd(ocrSiguCd);
			issue.setResideStatus(resideStatus);
			issue.setSemokCd(semokCd);
			issue.setSendYmd(sendYmd);
			issue.setSidoCd(sidoCd);
			issue.setSiguCd(siguCd);
			issue.setSise(sise);
			issue.setSiseGasanAmt(siseGasanAmt);
			issue.setSiseIja(siseIja);
			issue.setSokwanBuseoCd(sokwanBuseoCd);
			issue.setSokwanMgrNm(sokwanMgrNm);
			issue.setSokwanTelNo(sokwanTelNo);
			issue.setSpecialRate(specialRate);
			issue.setSpecialRateApplyCnt(specialRateApplyCnt);
			issue.setSpecialRateApplySayu(specialRateApplySayu);
			issue.setSpecialRateHighRate(specialRateHighRate);
			issue.setSuBuseoCd(suBuseoCd);
			issue.setSysGubun(sysGubun);
			issue.setTaxAmt(taxAmt);
			issue.setTaxGubun(taxGubun);
			issue.setTaxNo(taxNo);
			issue.setTaxYm(taxYm);
			issue.setTaxYmd(taxYmd);
			issue.setVatAmt(vatAmt);
			
			if(ws == null){
				//프록시 서버 생성 실패
				System.out.println("프록시 서버 생성 실패");
			}else{
				
	        	System.out.println("프록시 서버 생성 성공");
	        	//여기서 원격 함수 호출
	        	System.out.println("   insert합니다   ");
	        	StatusCodeWSDTO rs = ws.insertBugaRegist(issue);
	        	System.out.println("   rs  = "+rs+"   ;   ");
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
	
	/**
	 * 사용자정보조회 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public ModelAndView getUserInfo(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		//getNewTaxNo 입력파라메터
		String user_id = "";
	
		//리턴파라메터
		String buseoCd = "";
	    String rowStatus = "";
	    String siguCd = "";

		if( request.getParameter("user_id") != null && !(request.getParameter("user_id")).equals("") ){
			user_id=  request.getParameter("user_id");
		}
		
		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//프록시 서버 생성 실패
				System.out.println("프록시 서버 생성 실패");
	
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
	        		
	        		request.setAttribute("resCode", "1");
		    		request.setAttribute("buseoCd", buseoCd);
		    		request.setAttribute("rowStatus", rowStatus);
		    		request.setAttribute("siguCd", siguCd);
					
		    	}	      	
			}   
			
		}catch(Exception e){
			
			String errReason = e.toString();
			System.out.println(errReason);
			
			request.setAttribute("resCode", "2");
			request.setAttribute("Result", errReason);
		}
	
		return new ModelAndView("/sampleBugaWSProxy/testOutput");
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
				System.out.println("프록시 서버 생성 실패");
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
				System.out.println("프록시 서버 생성 실패");
			}else{
				
				System.out.println("프록시 서버 생성");
				
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
				System.out.println("프록시 서버 생성 실패");
			}else{
				
	        	System.out.println("프록시 서버 생성 성공");
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