package main.java.jumyong.saewe.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.StringUtil;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.saewe.model.BugaRegistBean;
import main.java.jumyong.saewe.model.TaxationBean;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import BugaWebService.BugaWSProxy;
import BugaWebService_pkg.Bu04BugaWSDTO;
import BugaWebService_pkg.Bu04SemokWSDTO;
import BugaWebService_pkg.Bu04SemokWSRACSDTO;
import BugaWebService_pkg.Bu04UserInfoWSDTO;
import BugaWebService_pkg.BugaWS;
import BugaWebService_pkg.StatusCodeWSDTO;

//********** BEGIN_����_20120308
import main.java.jumyong.saewe.model.semokBean;
import java.util.List;
//********** END_����_20120308


public class BugaWebControl extends MultiActionController {
	/**
	 * ����������ȸ 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	private	Util			util	= new Util();
	private	StringUtil	stringUtil	= new StringUtil();
	
	public String	getSemokInfo(String TAX_CD, String SIGU_CD, String DEPT_CD, CommonCodeService commonCode) throws Exception 
	{
		String	Xml	= ""; 
		 
		//getSemokInfo �Է��Ķ����
		String sigu_cd	= SIGU_CD;
		String buseo_cd = DEPT_CD;
		String semok_cd = TAX_CD;
		
		//���� �Ķ����
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
				//���Ͻ� ���� ���� ����
				System.out.println("���Ͻ� ���� ���� ����");
			}else{
				System.out.println("���Ͻ� ���� ����");
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

					//	XML�� ���� ������.
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
    
	//********** BEGIN_����_20120308
	public semokBean getSemokInfoList(String TAX_CD, String SIGU_CD, String DEPT_CD) throws Exception 
	{
		semokBean  semokInfoBean = new semokBean (); 
		 
		semokInfoBean.setSigu_cd(SIGU_CD);
		semokInfoBean.setBuseo_cd(DEPT_CD);
		semokInfoBean.setSemok_cd(TAX_CD);

		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//���Ͻ� ���� ���� ����
				System.out.println("���Ͻ� ���� ���� ����");
			}else{
				System.out.println("���Ͻ� ���� ����");
				Bu04SemokWSDTO rs = ws.getSemokInfo(SIGU_CD,DEPT_CD,TAX_CD);
	        	
	        	if(rs != null){        		
	        		if(rs.getGasanRateGubun() != null){
	        			semokInfoBean.setGasanRateGubun(rs.getGasanRateGubun());
	        		}
	        		
	        		if(rs.getVatYn() != null){
	        			semokInfoBean.setVatYn(rs.getVatYn());
	        		}
	        		
	        		if(rs.getOcrBuseoCd() != null){
	        			semokInfoBean.setOcrBuseoCd(rs.getOcrBuseoCd());
	        		}
	        		
	        		if(rs.getOcrSiguCd() != null){
	        			semokInfoBean.setOcrSiguCd(rs.getOcrSiguCd());
	        		}
	        		
	        		if(rs.getSuBuseoCd() != null){
	        			semokInfoBean.setSuBuseoCd(rs.getSuBuseoCd());
	        		}
	        		
	        		if(rs.getGasanRate() != 0){
	        			semokInfoBean.setGasanRate(rs.getGasanRate());
	        		}
	        	}
			}

		}catch(Exception e){
			String errReason = e.toString();
			System.out.println(errReason);
		}
	
		return semokInfoBean;
	}
	
	public BugaWS getBugaWS() throws Exception 
	{
		BugaWS ws = null;
		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			ws = proxy.getBugaWS();
		        
			if(ws == null){
				//���Ͻ� ���� ���� ����
				System.out.println("���Ͻ� ���� ���� ����");
			}else{
				System.out.println("���Ͻ� ���� ����");
			}

		}catch(Exception e){
			String errReason = e.toString();
			System.out.println(errReason);
		}
	
		return ws;
	}
	
	public semokBean getSemokInfoList(BugaWS ws, String TAX_CD, String SIGU_CD, String DEPT_CD) throws Exception 
	{
		semokBean  semokInfoBean = new semokBean (); 
		 
		semokInfoBean.setSigu_cd(SIGU_CD);
		semokInfoBean.setBuseo_cd(DEPT_CD);
		semokInfoBean.setSemok_cd(TAX_CD);

		try{
			if(ws == null){
				System.out.println("���Ͻ� ���� ���µ�??");
			}else{
				System.out.println("���Ͻ� ���� �Ѿ����!!");
				Bu04SemokWSDTO rs = ws.getSemokInfo(SIGU_CD,DEPT_CD,TAX_CD);
	        	
	        	if(rs != null){        		
	        		if(rs.getGasanRateGubun() != null){
	        			semokInfoBean.setGasanRateGubun(rs.getGasanRateGubun());
	        		}
	        		
	        		if(rs.getVatYn() != null){
	        			semokInfoBean.setVatYn(rs.getVatYn());
	        		}
	        		
	        		if(rs.getOcrBuseoCd() != null){
	        			semokInfoBean.setOcrBuseoCd(rs.getOcrBuseoCd());
	        		}
	        		
	        		if(rs.getOcrSiguCd() != null){
	        			semokInfoBean.setOcrSiguCd(rs.getOcrSiguCd());
	        		}
	        		
	        		if(rs.getSuBuseoCd() != null){
	        			semokInfoBean.setSuBuseoCd(rs.getSuBuseoCd());
	        		}
	        		
	        		if(rs.getGasanRate() != 0){
	        			semokInfoBean.setGasanRate(rs.getGasanRate());
	        		}
	        	}
			}

		}catch(Exception e){
			String errReason = e.toString();
			System.out.println(errReason);
		}
	
		return semokInfoBean;
	}
	//********** END_����_20120308
	
	/**
	 * ������ȣ ���� 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public String getNewTaxNo(String sigu_cd, String semok_cd, String tax_ym, String tax_gubun) throws Exception 
	{
		//���� �Ķ����
		String tax_no = "";
		
		try
		{
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//���Ͻ� ���� ���� ����
				System.out.println("���Ͻ� ���� ���� ����");
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
	 * �ΰ���� 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public BugaRegistBean insertBugaRegist(TaxationBean Bean, HttpServletRequest request, String bugwa_id, CommonCodeService commonCode) throws Exception 
	{
		System.out.println("!! �ΰ���� ");
		
		BugaRegistBean	bugaRegistBean = new BugaRegistBean();
		
		String adminNo = util.nullTo(Bean.getADMIN_NO(),"");
		String siguCd = util.nullTo(Bean.getSIGU_CD(),"");
		String semokCd = util.nullTo(Bean.getTAX_CD(),"");
		String taxYm = util.nullTo(Bean.getTAX_YM(),"");
		String taxGubun = util.nullTo(Bean.getTAX_GUBUN(),"");		//TAX_GUBUN(����,����)���� ���濹��
		String buseoCd = util.nullTo(Bean.getDEPT_CD(),"");
		String taxNo = "";
		String sidoCd = util.nullTo(Bean.getSIDO(),"");
		String napId = "";
		if( Bean.getSSN() != null && !"".equals(Bean.getSSN()) )
			napId = util.nullTo(Bean.getSSN().replaceAll("-", ""),"");
			
		String napNm = util.nullTo(Bean.getTAXPAYER_NM(),"");
		String napGubun = util.nullTo(Bean.getTAXPAYER_SET(),"");
		String suBuseoCd = util.nullTo(Bean.getDEPT_CD(),"");
		String taxYmd = util.nullTo(Bean.getTAX_DATE(),"");
		String napgiYmd = util.nullTo(Bean.getINDATE(),"");
		String napgiAftYmd = util.nullTo(Bean.getOVERDATE(),"");
		String napbuYmd = "";
		long taxAmt = 0;
		if(Bean.getBONSE() != null)taxAmt = Long.parseLong(Bean.getBONSE());
		
		long sise = 0;
		long guse = 0;
		
		
		if(semokCd.equals("10212807") || semokCd.equals("10212808") || semokCd.equals("10211201") ){						
			long sum = Math.round(taxAmt*0.5);
			String sumTemp = Long.toString(sum);
			long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
			
			sise = sum+partOne;
			guse = sum-partOne;
		}else if(semokCd.equals("10228202")){
			long siseBak = Math.round(taxAmt*0.6);
			long guseBak = Math.round(taxAmt*0.4);
			
			String sumTemp = Long.toString(guseBak);
			long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
												
			sise = siseBak+partOne;
			guse = guseBak-partOne;
		}else{
			sise = taxAmt;
			guse = 0;
		}
		
		
		long siseGasanAmt = 0;
		long siseIja = 0;
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
		//********** BEGIN_����_20120309
		napZipAddr = napZipAddr.replace("&nbsp;", " ");
		napDtlAddr = napDtlAddr.replace("null", "");
		//********** END_����_20120309
		//String napDoroAddr = util.nullTo(Bean.getROAD_ADD(),"");
		String napDoroAddr = "";
		String resideStatus = util.nullTo(Bean.getLIVE(),"");
		String mulGubun = util.nullTo(Bean.getOBJ_SET(),"");

		//********** BEGIN_����_20120216		
		String SI = util.nullTo(Bean.getSI(),"");
		String GUN = util.nullTo(Bean.getGUN(),"");
		String DORO_NM = util.nullTo(Bean.getDORO_NM(),"");
		String BD_BON = util.nullTo(Bean.getBD_BON(),"");
		String BD_BU = util.nullTo(Bean.getBD_BU(),"");
		String ABD_NM = util.nullTo(Bean.getABD_NM(),"");
		String BD_DET_NM = util.nullTo(Bean.getBD_DET_NM(),"");
		
		String napDzipCd = util.nullTo(Bean.getPOST(),"");			// ������ ���θ� �����ȣ
		String napDzipAddr = SI + " " + GUN + " " + DORO_NM ;		// �����ڵ��θ� �����ּ�
		String napDdtlAddr = "";									// �����ڵ��θ���ּ�
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
		
		napDdtlAddr += ABD_NM + " " + BD_DET_NM;		
		//********** END_����_20120216
		//********** BEGIN_����_20120316
		/*if(DORO_NM==null||DORO_NM.equals("")||napDdtlAddr==null||napDdtlAddr.equals(" ")){
			napDzipCd = "";
			napDzipAddr = "";
			napDdtlAddr ="";
		}		*/
		//********** END_����_20120316
		
		if(DORO_NM==null||DORO_NM.equals("")){	// 2016.02.26 kny(�����ּҿ� ���θ��ּ� �� �� �ϳ��� null�̰�)
			System.out.println("===== ���θ��ּ� ���� =====");
			napZipCd = Bean.getPOST();
			
			napDzipCd = "";
			napDzipAddr = "";
			napDdtlAddr ="";
			
		}else{
			//System.out.println("===== ���θ��ּ� ���� =====");
			napDzipCd = Bean.getPOST();
			
			napZipCd = "";
			napZipAddr = "";
			napDtlAddr ="";
		}
		
		// 2016.02
		/*if(Bean.getPOST().length() > 5){	// 5�̻��̸� �������ȣ
			napZipCd = Bean.getPOST();
			napDzipCd = Bean.getPOST();
		}else{								// 5�ڸ� �������ȣ�� napZipCd�� ���� �ȵǹǷ� null�� �ִ´�
			napZipCd = null;
			napDzipCd = Bean.getPOST();
		}
		*/
		String SI_NM = commonCode.executeSiNm(Bean.getSIDO());	//	�� �̸��Է�
		String SIGUNGU = commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU());	//	�� �̸��Է�
		String BJ_NM = commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD());
		String HJ_NM = commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD());
		//String SPC_NM = commonCode.executeSearchCommonCode("MUL_SPC_CD", Bean.getSPC_CD());	�Ϲݹ���, ����� ���ڸ� �������� �κ�...
		String BONBUN = util.nullTo(Bean.getBONBUN(),"");
		String BUBUN = util.nullTo(Bean.getBUBUN(),"");
		String ROAD_BON = util.nullTo(Bean.getROAD_BON(),"");
		String ROAD_BU = util.nullTo(Bean.getROAD_BU(),"");
		
		//System.out.println("BONBUN== " + BONBUN);
		//System.out.println("BUBUN== " + BUBUN);
		//System.out.println("ROAD_BON== " + ROAD_BON);
		//System.out.println("ROAD_BU == " + ROAD_BU);
		// ROAD_BON, ROAD_BU �� �ִ� ��� ��,�ι��� ROAD_BON, ROAD_BU �� ���
		if( ROAD_BON != null && !"".equals(ROAD_BON) && ROAD_BU != null && !"".equals(ROAD_BU) ){
			if(null != Bean.getROAD_ADD() && !BJ_NM.equals(Bean.getROAD_ADD())){
			BJ_NM = Bean.getROAD_ADD();		// 2016.02 
		}									// '�������'�� '��������'�� ǥ�� �ǰ�..
			BONBUN = Bean.getROAD_BON();
			BUBUN = Bean.getROAD_BU();
		}
		
		//������ ����
		if(BUBUN	!= null)
		{
			if(!"".equals(BUBUN))
				BUBUN = "-" + BUBUN + "����";
			else	BONBUN = BONBUN + "����";
		}
		else	BONBUN = BONBUN + "����";
		
		String MUL_ZIP_ADDR = SI_NM + " " + SIGUNGU + " " + BJ_NM;
		String MUL_DTL_ADDR = "";	// MulDtlAddr �� ������ BONBUN, BUBUN ���
		String MUL_DTL_ADDR2 = "";	// MulNm �� ROAD_BON, ROAD_BU ���ο� ���� �޶���
		String mulAptNm = util.nullTo(Bean.getBD_NM(),"");
		String mulDong = util.nullTo(Bean.getBD_DONG(),"");
		String mulHosu = util.nullTo(Bean.getBD_HO(),"");
		
		if("2".equals(Bean.getSPC_CD()))
		{
				MUL_DTL_ADDR = "�� " + util.nullTo(Bean.getBONBUN(),"") +"-"+ util.nullTo(Bean.getBUBUN(),"");
				MUL_DTL_ADDR2 = "�� " + BONBUN + BUBUN;
		}
		else
		{
			//MUL_DTL_ADDR = util.nullTo(Bean.getBONBUN(),"") +"-"+ util.nullTo(Bean.getBUBUN(),"");
			//2016.02 kny
			if(null == Bean.getBUBUN()){
				MUL_DTL_ADDR = util.nullTo(Bean.getBONBUN(),"");
			}else{
				MUL_DTL_ADDR = util.nullTo(Bean.getBONBUN(),"") +"-"+ util.nullTo(Bean.getBUBUN(),"");
			}
			MUL_DTL_ADDR2 = BONBUN + BUBUN;
		}
		
		String mulZipAddr = util.nullTo(MUL_ZIP_ADDR,"");
		String mulDtlAddr = util.nullTo(MUL_DTL_ADDR,"");
		String mulDtlAddr2 = util.nullTo(MUL_DTL_ADDR2,"");
		
		
		
		if(!"".equals(HJ_NM))
		{
			HJ_NM = " [������ : " + HJ_NM + "]";
		}
		
		//String mulNm = mulZipAddr + " " + mulDtlAddr + HJ_NM;
		String mulNm = mulZipAddr + " " + mulDtlAddr2;
		
		// �ǹ���, ��,ȣ�� ������ mulDtlAddr�� �ּ� �����ֱ�
		if( mulAptNm != null && !"".equals(mulAptNm) ){
			mulDtlAddr = util.nullTo(MUL_DTL_ADDR,"")+ " ("+mulAptNm+" " + mulDong+"�� " + mulHosu+"ȣ)";
			mulDtlAddr2 = util.nullTo(MUL_DTL_ADDR2,"")+ " ("+mulAptNm+" " + mulDong+"�� " + mulHosu+"ȣ)";
		}
		
		String mulOcrSiguCd = util.nullTo(Bean.getSIGUNGU(),"");
		String mulBdongriCd = util.nullTo(Bean.getBJ_CD(),"");
		String mulSpcCd = util.nullTo(Bean.getSPC_CD(),"");
		String mulBon = stringUtil.fixLength3(util.nullTo(Bean.getBONBUN(),""), 4, "0");
		String mulBu = stringUtil.fixLength3(util.nullTo(Bean.getBUBUN(),""), 4, "0");
		String mulTong = util.nullTo(Bean.getTONG(),"");
		String mulBan = util.nullTo(Bean.getBAN(),"");
		
		String mulZipCd = util.Post_Cut(Bean.getMUL_POST());	//util�������ȣ '-'���� �߰� 2009.6.4
		String hdongCd = "";
		
		if( Bean.getHJ_CD() != null && !"".equals(Bean.getHJ_CD()) && Bean.getHJ_CD().length() > 2 ){
			hdongCd = Bean.getHJ_CD().substring(0, 3);
		}
		
		String bookNo = siguCd+"_"+util.nullTo(Bean.getYEAR(),"")+"_"+util.nullTo(Bean.getSEQ(),""); // �ñ��ڵ�_�⵵_������ �����ϱ�
		
		String hangmok1 = "";
		
		if("3".equals(Bean.getSECTION())){	//�����ϰ��...
			
			hangmok1 = util.nullTo(Bean.getFORM_ADJUST(),"");
			
			if( Bean.getFORM_ADJUST() != null && !"".equals(Bean.getFORM_ADJUST()) ){
			
				byte[] b = Bean.getFORM_ADJUST().getBytes();				
				if(b.length > 100){
					//hangmok1 = new String(b,0,100);
					hangmok1 = "����  X �ش�⵵�������� X ���� X ��¡�� X �ش�⵵ X �Ⱓ";
				}
			}			

		}
		else
		{
			hangmok1 = util.nullTo(Bean.getFORM_ADJUST(),"");
		}
		
		
		String hangmok2 = util.nullTo(Bean.getPURPOSE_NM(),"");
		String hangmok3 = util.nullTo(Bean.getTYPE_NM(),"");
		String hangmok4 = Bean.getFROMDATE() + " ~ " + Bean.getTODATE();
		
		// �Ͻ��ϰ��...
		if("2".equals(Bean.getSECTION()))
		{
			hangmok4 = Bean.getPARTLY_PERIOD() + "   �� " + Bean.getTOTAL_PERIOD()+ " ��";
		}
//		else
//		{
//			hangmok4 = Bean.getMUL_FROMDATE() + " ~ " + Bean.getMUL_TODATE();
//		}
		
		String hangmok5 = util.nullTo(Bean.getAREA(),"");
		String hangmok6 = "";
		
		if(!adminNo.equals(""))
		{
			if(adminNo.length() > 9)
			{
				hangmok6 = adminNo.substring(9,Bean.getADMIN_NO().length());
			}
		}
		
		String gasanRateGubun = util.nullTo(Bean.getADD_SET(),""); //����������
		double specialRate = 0;
		//if(Bean.getRATE() != null) specialRate = Long.parseLong(Bean.getRATE());
		String specialRateApplySayu = util.nullTo(Bean.getRATE_CAUSE(),"");
		String bigo = util.nullTo(Bean.getNOTES(),"");
		String gasanAmtSkipGubun = util.nullTo(Bean.getADD_YN(),""); //����ݸ��� ����
		String ocrSiguCd = util.nullTo(Bean.getOCR_SIGU_CD(),"");
		String ocrBuseoCd = util.nullTo(Bean.getOCR_BUSEO_CD(),"");
		String lastWorkId = util.nullTo(bugwa_id,"");
		long vatAmt = 0;
		if(Bean.getVAT() != null) vatAmt = Long.parseLong(Bean.getVAT());
		if("3".equals(Bean.getSECTION())){	vatAmt = 0;	}
		String sysGubun = "ROADS";
		
		//�����׸�  ����
		String etc1 = "";	
		String lastWorkDate = "";	
		String sendYmd = "";
		String sokwanBuseoCd = "";
		String sokwanMgrNm = "";
		String sokwanTelNo = "";
		long specialRateApplyCnt = 0;
		double specialRateHighRate = 0;
		long bunhalCnt = 0;
		
		//���� �Ķ����
	    String errorMsg = "";
	    String insertAk = "";
	    String insertKey = "";
	    String resultCnt = "";

		try{
			
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			Bu04BugaWSDTO issue = new Bu04BugaWSDTO();

			//�μ��� ����
			issue.setBigo(bigo);
			issue.setBookNo(bookNo);			//�ʼ�
			issue.setBunhalCnt(bunhalCnt);
			issue.setBuseoCd(buseoCd);			//�ʼ�
			issue.setEtc1(etc1);
			issue.setGasanAmtSkipGubun(gasanAmtSkipGubun);
			issue.setGasanRateGubun(gasanRateGubun);	//�ʼ�
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
			issue.setLastWorkId(lastWorkId);		//�ʼ�
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
			issue.setNapZipAddr(napZipAddr);			//�������ּ��ʼ�
			issue.setNapZipCd(napZipCd);				//�ʼ�
			issue.setNapbuYmd(napbuYmd);
			issue.setNapgiAftYmd(napgiAftYmd);
			issue.setNapgiYmd(napgiYmd);
			issue.setOcrBuseoCd(ocrBuseoCd);
			issue.setOcrSiguCd(ocrSiguCd);
			issue.setResideStatus(resideStatus);
			issue.setSemokCd(semokCd);
			issue.setSendYmd(sendYmd);
			issue.setSidoCd(sidoCd);
			issue.setSiguCd(siguCd);							//�ʼ�
			issue.setSise(sise);
			issue.setSiseGasanAmt(siseGasanAmt);
			issue.setSiseIja(siseIja);
			//issue.setSokwanBuseoCd(sokwanBuseoCd);
			//issue.setSokwanMgrNm(sokwanMgrNm);
			//issue.setSokwanTelNo(sokwanTelNo);
			issue.setSpecialRate(specialRate);					//�Ҽ����ڸ��� üũ			
			//issue.setSpecialRateApplyCnt(specialRateApplyCnt);
			issue.setSpecialRateApplySayu(specialRateApplySayu);
			//issue.setSpecialRateHighRate(specialRateHighRate);
			issue.setSuBuseoCd(suBuseoCd);							//�ʼ�
			issue.setSysGubun(sysGubun);							//�ʼ� ('RACS'�׽�Ʈ ��, 'ROADS'��Ͽ�û�Ͽ���)
			issue.setTaxAmt(taxAmt);
			issue.setTaxGubun(taxGubun);
			issue.setTaxNo(taxNo);
			issue.setTaxYm(taxYm);
			issue.setTaxYmd(taxYmd);
			issue.setVatAmt(vatAmt);
			//********** BEGIN_����_20120212
			issue.setNapDzipCd(napDzipCd);    
			issue.setNapDzipAddr(napDzipAddr);
			issue.setNapDdtlAddr(napDdtlAddr);
			//********** END_����_20120212

			
			System.out.println("=======================start==========================");
			System.out.println("Bigo="+issue.getBigo());
			System.out.println("BookNo="+issue.getBookNo());
			System.out.println("BunhalCnt="+issue.getBunhalCnt());
			System.out.println("BuseoCd="+issue.getBuseoCd());
			System.out.println("Etc1="+issue.getEtc1());
			System.out.println("GasanAmtSkipGubun="+issue.getGasanAmtSkipGubun());
			System.out.println("GasanRateGubun="+issue.getGasanRateGubun());
			System.out.println("Gigum="+issue.getGigum());
			System.out.println("GigumGasanAmt="+issue.getGigumGasanAmt());
			System.out.println("GigumIja="+issue.getGigumIja());
			System.out.println("Gukse="+issue.getGukse());
			System.out.println("GukseGasanAmt="+issue.getGukseGasanAmt());
			System.out.println("GukseIja="+issue.getGukseIja());
			System.out.println("Guse="+issue.getGuse());
			System.out.println("GuseGasanAmt="+issue.getGuseGasanAmt());
			System.out.println("GuseIja="+issue.getGuseIja());
			System.out.println("Hangmok1="+issue.getHangmok1());
			System.out.println("Hangmok2="+issue.getHangmok2());
			System.out.println("Hangmok3="+issue.getHangmok3());
			System.out.println("Hangmok4="+issue.getHangmok4());
			System.out.println("Hangmok5="+issue.getHangmok5());
			System.out.println("Hangmok6="+issue.getHangmok6());
			System.out.println("HdongCd="+issue.getHdongCd());
			System.out.println("LastWorkDate="+issue.getLastWorkDate());
			System.out.println("LastWorkId="+issue.getLastWorkId());
			System.out.println("MulAptNm="+issue.getMulAptNm());
			System.out.println("MulBan="+issue.getMulBan());
			System.out.println("MulBdongriCd="+issue.getMulBdongriCd());
			System.out.println("MulBon="+issue.getMulBon());
			System.out.println("MulBu="+issue.getMulBu());
			System.out.println("MulDong="+issue.getMulDong());
			System.out.println("MulDtlAddr="+issue.getMulDtlAddr());
			System.out.println("MulGubun="+issue.getMulGubun());
			System.out.println("MulHosu="+issue.getMulHosu());
			System.out.println("MulNm="+issue.getMulNm());
			System.out.println("MulOcrSiguCd="+issue.getMulOcrSiguCd());
			System.out.println("MulSpcCd="+issue.getMulSpcCd());
			System.out.println("MulTong="+issue.getMulTong());
			System.out.println("MulZipAddr="+issue.getMulZipAddr());
			System.out.println("MulZipCd="+issue.getMulZipCd());
			System.out.println("NapDoroAddr="+issue.getNapDoroAddr());
			System.out.println("NapDtlAddr="+issue.getNapDtlAddr());
			System.out.println("NapEmail="+issue.getNapEmail());
			System.out.println("NapGubun="+issue.getNapGubun());
			System.out.println("NapId="+issue.getNapId());
			System.out.println("NapMobilNo="+issue.getNapMobilNo());
			System.out.println("NapNm="+issue.getNapNm());
			System.out.println("NapTelNo="+issue.getNapTelNo());
			System.out.println("NapZipAddr="+issue.getNapZipAddr());
			System.out.println("NapZipCd="+issue.getNapZipCd());
			System.out.println("NapbuYmd="+issue.getNapbuYmd());
			System.out.println("NapgiAftYmd="+issue.getNapgiAftYmd());
			System.out.println("NapgiYmd="+issue.getNapgiYmd());
			System.out.println("OcrBuseoCd="+issue.getOcrBuseoCd());
			System.out.println("OcrSiguCd="+issue.getOcrSiguCd());
			System.out.println("ResideStatus="+issue.getResideStatus());
			System.out.println("SemokCd="+issue.getSemokCd());
			System.out.println("SendYmd="+issue.getSendYmd());
			System.out.println("SidoCd="+issue.getSidoCd());
			System.out.println("SiguCd="+issue.getSiguCd());
			System.out.println("Sise="+issue.getSise());
			System.out.println("SiseGasanAmt="+issue.getSiseGasanAmt());
			System.out.println("SiseIja="+issue.getSiseIja());
			System.out.println("SokwanBuseoCd="+issue.getSokwanBuseoCd());
			System.out.println("SokwanMgrNm="+issue.getSokwanMgrNm());
			System.out.println("SokwanTelNo="+issue.getSokwanTelNo());
			System.out.println("SpecialRate="+issue.getSpecialRate());
			System.out.println("SpecialRateApplyCnt="+issue.getSpecialRateApplyCnt());
			System.out.println("SpecialRateApplySayu="+issue.getSpecialRateApplySayu());
			System.out.println("SpecialRateHighRate="+issue.getSpecialRateHighRate());
			System.out.println("SuBuseoCd="+issue.getSuBuseoCd());
			System.out.println("SysGubun="+issue.getSysGubun());
			System.out.println("TaxAmt="+issue.getTaxAmt());
			System.out.println("TaxGubun="+issue.getTaxGubun());
			System.out.println("TaxNo="+issue.getTaxNo());
			System.out.println("TaxYm="+issue.getTaxYm());
			System.out.println("TaxYmd="+issue.getTaxYmd());
			System.out.println("VatAmt="+issue.getVatAmt());
			//********** BEGIN_����_20120216
			System.out.println("issue.getNapDzipCd()            :"+issue.getNapDzipCd());      
			System.out.println("issue.getNapDzipAddr()          :"+issue.getNapDzipAddr());       
			System.out.println("issue.getNapDdtlAddr()          :"+issue.getNapDdtlAddr());
			//********** END_����_20120216

			System.out.println("=======================end==========================");
			
			if(ws == null){
				//���Ͻ� ���� ���� ����
				System.out.println("���Ͻ� ���� ���� ����");
			}else{
				
	        	System.out.println("���Ͻ� ���� ���� ����");
	        	//���⼭ ���� �Լ� ȣ��
//	        	System.out.println("   insert�մϴ�   ");
	        	StatusCodeWSDTO rs = ws.insertBugaRegist(issue);
//	        	System.out.println("   rs  = "+rs+"   ;   ");
	        	if(rs != null){
	        		
	        		if(rs.getErrorCode().equals("0")){
	        			
	        			//����
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
	        			//���� ������ �׼� ���� �߻�
	        			errorMsg = rs.getErrorMsg();	
	        		
	        			bugaRegistBean.setResultCnt(resultCnt);
	        			bugaRegistBean.setErrorMsg(errorMsg);
	        			return	bugaRegistBean;
	        		}
	        	}
			}
		} catch (Exception e) {
			String errReason = "����::"+e.toString();
			System.out.println(errReason);
			bugaRegistBean.setErrorMsg(errReason);
			return	bugaRegistBean;
		}
	
		return null;
	}	
	
	/**
	 * �����������ȸ 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public TaxationBean getUserInfo(String user_id) throws Exception {
	
		TaxationBean	userInfoBean = new TaxationBean();
		
		System.out.println("�ΰ����̵� : " + user_id);
		
		//�����Ķ����
		String buseoCd = "";
	    String rowStatus = "";
	    String siguCd = "";
		
		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//���Ͻ� ���� ���� ����
				System.out.println("���Ͻ� ���� ���� ����");
	
			}else{
				
				Bu04UserInfoWSDTO rs = ws.getUserInfo(user_id.trim());
//		    	System.out.println("rs ==> " + rs);
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
//		    		System.out.println("buseoCd ==> " + buseoCd);
//		    		System.out.println("siguCd ==> " + siguCd);
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
	 * �������������ȸ 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public ModelAndView getListSemokInfo(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		//����¡�� ���� �޴� ����
		String r_page = "";
		String r_block_page = "";
		String r_searchCause = "";
		String r_SQL = "";
		
		//getSemokInfo �Է��Ķ����
		String sigu_cd = "";
		if( request.getParameter("sigu_cd") != null && !(request.getParameter("sigu_cd")).equals("") ){
			sigu_cd=  request.getParameter("sigu_cd");
		}

		String buseo_cd = "";
	    if( request.getParameter("buseo_cd") != null && !(request.getParameter("buseo_cd")).equals("") ){
	    	buseo_cd=  request.getParameter("buseo_cd");
		}
	    
		//����¡�� ���� �޴� ������
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
				//���Ͻ� ���� ���� ����
				System.out.println("���Ͻ� ���� ���� ����");
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
	 * ����������ȸ (��������������Ȯ��)
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public ModelAndView getSemokInfoRACS(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		//getSemokInfo �Է��Ķ����
		String sigu_cd = "";
		String buseo_cd = "";
		String semok_cd = "";
		
		//���� �Ķ����
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
				//���Ͻ� ���� ���� ����
				System.out.println("���Ͻ� ���� ���� ����");
			}else{
				
				System.out.println("���Ͻ� ���� ����");
				
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
	        		
	        		//�߰�
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
	 * �������� 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	
	public ModelAndView biGwaSeRegistWS(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
		//getNewTaxNo �Է��Ķ����
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
				
		//���� �Ķ����
	    String errorMsg = "";
	    String insertAk = "";
	    String insertKey = "";
	    String resultCnt = "";
				
		try{
						
			BugaWSProxy proxy = new BugaWSProxy();
			BugaWS ws = proxy.getBugaWS();
		        
			if(ws == null){
				//���Ͻ� ���� ���� ����
				System.out.println("���Ͻ� ���� ���� ����");
			}else{
				
	        	System.out.println("���Ͻ� ���� ���� ����");
	        	StatusCodeWSDTO rs = ws.biGwaSeRegistWS(sigu_cd, buseo_cd, semok_cd, tax_ym, tax_gubun, tax_no, sys_gubun);
	        	
	        	if(rs != null){
	        		
	        		if(rs.getErrorCode().equals("0")){

	        			//����
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
	        			
	        			//���� ������ �׼� ���� �߻�
	        			errorMsg = rs.getErrorMsg();
	        			
	        			request.setAttribute("resCode", "2");
	        			request.setAttribute("errorMsg", errorMsg);
	        			
	        		}		
	        	}
			}

		} catch (Exception e) { 
			
			String errReason = "����::"+e.toString();
			System.out.println(errReason);
			request.setAttribute("resCode", "2");
			request.setAttribute("errorMsg", errReason);
		}
	
		return new ModelAndView("/sampleBugaWSProxy/testOutput");
	}		
}