package main.java.mdb.model;

import main.java.mdb.util.EncryptData;

public class GapanHeadBean  {
	private String GAPAN_NO	= "";
	private String GP_TYP ="";
	private String OWNER_NAME = "";
	private String OWNER_IDCHK = "";
	private String OWNER_SSN = "";
	private String OWNER_GENDER ="";
	private String OWNER_AGE = "";
	private String OWNER_POST ="";
	private String  OWNER_ADDR1 ="";
	
	private String OWNER_SAN = ""; 
	private String OWNER_JIBUN = "";
	private String OWNER_ADDR2 = "";
	private String OWNER_SAME = "";
	private String OWNER_TOPOST = "";
	private String OWNER_TOADDR1 ="";
	private String OWNER_TOSAN ="";
	private String OWNER_TOJIBUN ="";
	private String OWNER_TOADDR2 ="";
	
	private String OWNER_TEL = "";
	private String OWNER_HP = "";
	private String OWNER_IMG = "";
	private String RT_SEL = "";
	private String RT_TXT = "";
	private String LC_SEL = "";
	private String LC_TXT = "";
	private String ESTATE_MOVE ="";
	private String ESTATE_REAL = "";
	
	private String PARTN_NAME = "";
	private String PT_SEL = "";
	private String PARTN_SSN = "";
	private String PARTN_GENDER = "";
	private String PARTN_AGE ="";
	private String PARTN_OSAM ="";
	private String PARTN_POST = "";
	private String PARTN_ADDR1 = "";
	private String PARTN_SAN ="";
	
	private String PARTN_JIBUN = "";
	private String PARTN_ADDR2 = "";
	private String PARTN_SAME = "";
	private String PARTN_TOPOST = "";
	private String PARTN_TOADDR1 ="";
	private String PARTN_TOSAN = "";
	private String PARTN_TOJIBUN = "";
	private String PARTN_TOADDR2 = "";
	private String PARTN_TEL = "";
	
	private String PARTN_HP ="";
	private String PARTN_IMG = "";
	private String ADDR_CHECK1 = "";
	private String ADDR_CHECK2 = "";
	private String NOTE ="";
	
	EncryptData enc = new EncryptData();
	

	public String getGP_TYP() {
		return GP_TYP;
	}

	public void setGP_TYP(String gPTYP) {
		if(gPTYP==null)  GP_TYP="";
		else GP_TYP = gPTYP;
	}

	public String getOWNER_NAME() {
		return OWNER_NAME;
	}

	public void setOWNER_NAME(String oWNERNAME) {
		if(oWNERNAME==null) OWNER_NAME="";
		else OWNER_NAME = oWNERNAME;
	}

	public String getOWNER_IDCHK() {
		return OWNER_IDCHK;
	}

	public void setOWNER_IDCHK(String oWNERIDCHK) {
		if(oWNERIDCHK==null) OWNER_IDCHK="";
		else OWNER_IDCHK = oWNERIDCHK;
	}

	public String getOWNER_SSN() {
		return OWNER_SSN;
	}

	public void setOWNER_SSN(String oWNERSSN) {
		if(oWNERSSN==null) OWNER_SSN="";
		else OWNER_SSN = oWNERSSN;
	}

	public String getOWNER_GENDER() {
		return OWNER_GENDER;
	}

	public void setOWNER_GENDER(String oWNERGENDER) {
		if(oWNERGENDER==null) OWNER_GENDER="";
		else OWNER_GENDER = oWNERGENDER;
	}

	public String getOWNER_AGE() {
		return OWNER_AGE;
	}

	public void setOWNER_AGE(String oWNERAGE) {
		if(oWNERAGE==null)  OWNER_AGE="";
		else OWNER_AGE = oWNERAGE;
	}

	public String getOWNER_POST() {
		return OWNER_POST;
	}

	public void setOWNER_POST(String oWNERPOST) {
		if(oWNERPOST==null) OWNER_POST="";
		else OWNER_POST = oWNERPOST;
	}

	public String getOWNER_ADDR1() {
		return OWNER_ADDR1;
	}

	public void setOWNER_ADDR1(String oWNERADDR1) {
		if(oWNERADDR1==null) OWNER_ADDR1="";
		else OWNER_ADDR1 = oWNERADDR1;
	}

	public String getOWNER_SAN() {
		return OWNER_SAN;
	}

	public void setOWNER_SAN(String oWNERSAN) {
		if(oWNERSAN==null) OWNER_SAN="";
		else OWNER_SAN = oWNERSAN;
	}

	public String getOWNER_JIBUN() {
		return OWNER_JIBUN;
	}

	public void setOWNER_JIBUN(String oWNERJIBUN) {
		if(oWNERJIBUN==null) OWNER_JIBUN="";
		else OWNER_JIBUN = oWNERJIBUN;
	}

	public String getOWNER_ADDR2() {
		return OWNER_ADDR2;
	}

	public void setOWNER_ADDR2(String oWNERADDR2) {
		if(oWNERADDR2==null) OWNER_ADDR2="";
		else OWNER_ADDR2 = oWNERADDR2;
	}

	public String getOWNER_SAME() {
		return OWNER_SAME;
	}

	public void setOWNER_SAME(String oWNERSAME) {
		if(oWNERSAME==null) OWNER_SAME="";
		else OWNER_SAME = oWNERSAME;
	}

	public String getOWNER_TOPOST() {
		return OWNER_TOPOST;
	}

	public void setOWNER_TOPOST(String oWNERTOPOST) {
		if(oWNERTOPOST==null) OWNER_TOPOST="";
		else OWNER_TOPOST = oWNERTOPOST;
	}

	public String getOWNER_TOADDR1() {
		return OWNER_TOADDR1;
	}

	public void setOWNER_TOADDR1(String oWNERTOADDR1) {
		if(oWNERTOADDR1==null) OWNER_TOADDR1="";
		else OWNER_TOADDR1 = oWNERTOADDR1;
	}

	public String getOWNER_TOSAN() {
		return OWNER_TOSAN;
	}

	public void setOWNER_TOSAN(String oWNERTOSAN) {
		if(oWNERTOSAN==null) OWNER_TOSAN="";
		else OWNER_TOSAN = oWNERTOSAN;
	}

	public String getOWNER_TOJIBUN() {
		return OWNER_TOJIBUN;
	}

	public void setOWNER_TOJIBUN(String oWNERTOJIBUN) {
		if(oWNERTOJIBUN==null) OWNER_TOJIBUN="";
		else OWNER_TOJIBUN = oWNERTOJIBUN;
	}

	public String getOWNER_TOADDR2() {
		return OWNER_TOADDR2;
	}

	public void setOWNER_TOADDR2(String oWNERTOADDR2) {
		if(oWNERTOADDR2==null) OWNER_TOADDR2="";
		else OWNER_TOADDR2 = oWNERTOADDR2;
	}

	public String getOWNER_TEL() {
		return OWNER_TEL;
	}

	public void setOWNER_TEL(String oWNERTEL) {
		if(oWNERTEL==null) OWNER_TEL="";
		else OWNER_TEL = oWNERTEL;
	}

	public String getOWNER_HP() {
		return OWNER_HP;
	}

	public void setOWNER_HP(String oWNERHP) {
		if(oWNERHP==null) OWNER_HP="";
		else OWNER_HP = oWNERHP;
	}

	public String getOWNER_IMG() {
		return OWNER_IMG;
	}

	public void setOWNER_IMG(String oWNERIMG) {
		if(oWNERIMG==null) OWNER_IMG="";
		else OWNER_IMG = oWNERIMG;
	}

	public String getRT_SEL() {
		return RT_SEL;
	}

	public void setRT_SEL(String rTSEL) {
		if(rTSEL==null) RT_SEL="";
		else RT_SEL = rTSEL;
	}

	public String getRT_TXT() {
		return RT_TXT;
	}

	public void setRT_TXT(String rTTXT) {
		if(rTTXT==null) RT_TXT="";
		else RT_TXT = rTTXT;
	}

	public String getLC_SEL() {
		return LC_SEL;
	}

	public void setLC_SEL(String lCSEL) {
		if(lCSEL==null) LC_SEL="";
		else LC_SEL = lCSEL;
	}

	public String getLC_TXT() {
		return LC_TXT;
	}

	public void setLC_TXT(String lCTXT) {
		if(lCTXT==null) LC_TXT="";
		else LC_TXT = lCTXT;
	}

	public String getESTATE_MOVE() {
		return ESTATE_MOVE;
	}

	public void setESTATE_MOVE(String eSTATEMOVE) {
		if(eSTATEMOVE==null) ESTATE_MOVE="";
		else ESTATE_MOVE = eSTATEMOVE;
	}

	public String getESTATE_REAL() {
		return ESTATE_REAL;
	}

	public void setESTATE_REAL(String eSTATEREAL) {
		if(eSTATEREAL==null) ESTATE_REAL="";
		else ESTATE_REAL = eSTATEREAL;
	}

	public String getPARTN_NAME() {
		return PARTN_NAME;
	}

	public void setPARTN_NAME(String pARTNNAME) {
		if(pARTNNAME==null) PARTN_NAME="";
		else PARTN_NAME = pARTNNAME;
	}

	public String getPT_SEL() {
		return PT_SEL;
	}

	public void setPT_SEL(String pTSEL) {
		if(pTSEL==null) PT_SEL="";
		else PT_SEL = pTSEL;
	}

	public String getPARTN_SSN() {
		return PARTN_SSN;
	}

	public void setPARTN_SSN(String pARTNSSN) {
		if(pARTNSSN==null) PARTN_SSN="";
		else PARTN_SSN = pARTNSSN;
	}

	public String getPARTN_GENDER() {
		return PARTN_GENDER;
	}

	public void setPARTN_GENDER(String pARTNGENDER) {
		if(pARTNGENDER==null) PARTN_GENDER="";
		else PARTN_GENDER = pARTNGENDER;
	}

	public String getPARTN_AGE() {
		return PARTN_AGE;
	}

	public void setPARTN_AGE(String pARTNAGE) {
		if(pARTNAGE==null) PARTN_AGE="";
		else PARTN_AGE = pARTNAGE;
	}

	public String getPARTN_OSAM() {
		return PARTN_OSAM;
	}

	public void setPARTN_OSAM(String pARTNOSAM) {
		if(pARTNOSAM==null) PARTN_OSAM="";
		else PARTN_OSAM = pARTNOSAM;
	}

	public String getPARTN_POST() {
		return PARTN_POST;
	}

	public void setPARTN_POST(String pARTNPOST) {
		if(pARTNPOST==null) PARTN_POST="";
		else PARTN_POST = pARTNPOST;
	}

	public String getPARTN_ADDR1() {
		return PARTN_ADDR1;
	}

	public void setPARTN_ADDR1(String pARTNADDR1) {
		if(pARTNADDR1==null) PARTN_ADDR1="";
		else PARTN_ADDR1 = pARTNADDR1;
	}

	public String getPARTN_SAN() {
		return PARTN_SAN;
	}

	public void setPARTN_SAN(String pARTNSAN) {
		if(pARTNSAN==null) PARTN_SAN="";
		else PARTN_SAN = pARTNSAN;
	}

	public String getPARTN_JIBUN() {
		return PARTN_JIBUN;
	}

	public void setPARTN_JIBUN(String pARTNJIBUN) {
		if(pARTNJIBUN==null) PARTN_JIBUN="";
		else PARTN_JIBUN = pARTNJIBUN;
	}

	public String getPARTN_ADDR2() {
		return PARTN_ADDR2;
	}

	public void setPARTN_ADDR2(String pARTNADDR2) {
		if(pARTNADDR2==null) PARTN_ADDR2="";
		else PARTN_ADDR2 = pARTNADDR2;
	}

	public String getPARTN_SAME() {
		return PARTN_SAME;
	}

	public void setPARTN_SAME(String pARTNSAME) {
		if(pARTNSAME==null) PARTN_SAME="";
		else PARTN_SAME = pARTNSAME;
	}

	public String getPARTN_TOPOST() {
		return PARTN_TOPOST;
	}

	public void setPARTN_TOPOST(String pARTNTOPOST) {
		if(pARTNTOPOST==null) PARTN_TOPOST="";
		else PARTN_TOPOST = pARTNTOPOST;
	}

	public String getPARTN_TOADDR1() {
		return PARTN_TOADDR1;
	}

	public void setPARTN_TOADDR1(String pARTNTOADDR1) {
		if(pARTNTOADDR1==null) PARTN_TOADDR1="";
		else PARTN_TOADDR1 = pARTNTOADDR1;
	}

	public String getPARTN_TOSAN() {
		return PARTN_TOSAN;
	}

	public void setPARTN_TOSAN(String pARTNTOSAN) {
		if(pARTNTOSAN==null) PARTN_TOSAN="";
		else PARTN_TOSAN = pARTNTOSAN;
	}

	public String getPARTN_TOJIBUN() {
		return PARTN_TOJIBUN;
	}

	public void setPARTN_TOJIBUN(String pARTNTOJIBUN) {
		if(pARTNTOJIBUN==null) PARTN_TOJIBUN="";
		else PARTN_TOJIBUN = pARTNTOJIBUN;
	}

	public String getPARTN_TOADDR2() {
		return PARTN_TOADDR2;
	}

	public void setPARTN_TOADDR2(String pARTNTOADDR2) {
		if(pARTNTOADDR2==null) PARTN_TOADDR2="";
		else PARTN_TOADDR2 = pARTNTOADDR2;
	}

	public String getPARTN_TEL() {
		return PARTN_TEL;
	}

	public void setPARTN_TEL(String pARTNTEL) {
		if(pARTNTEL==null) PARTN_TEL="";
		else PARTN_TEL = pARTNTEL;
	}

	public String getPARTN_HP() {
		return PARTN_HP;
	}

	public void setPARTN_HP(String pARTNHP) {
		if(pARTNHP==null) PARTN_HP="";
		else PARTN_HP = pARTNHP;
	}

	public String getPARTN_IMG() {
		return PARTN_IMG;
	}

	public void setPARTN_IMG(String pARTNIMG) {
		if(pARTNIMG==null) PARTN_IMG="";
		else PARTN_IMG = pARTNIMG;
	}

	public String getADDR_CHECK1() {
		return ADDR_CHECK1;
	}

	public void setADDR_CHECK1(String aDDRCHECK1) {
		if(aDDRCHECK1==null) ADDR_CHECK1="";
		else ADDR_CHECK1 = aDDRCHECK1;
	}

	public String getADDR_CHECK2() {
		return ADDR_CHECK2;
	}

	public void setADDR_CHECK2(String aDDRCHECK2) {
		if(aDDRCHECK2==null) ADDR_CHECK2="";
		else ADDR_CHECK2 = aDDRCHECK2;
	}

	public String getNOTE() {
		return NOTE;
	}

	public void setNOTE(String nOTE) {
		if(nOTE==null) NOTE = "";
		else{
			if(nOTE.getBytes().length>255){
				System.out.println("length : "+nOTE.length());
				NOTE = nOTE.substring(0, 100);
			}
			else NOTE = nOTE;
		}
	}

	public String getGAPAN_NO() {
		return GAPAN_NO;
	}

	public void setGAPAN_NO(String gAPANNO) {
		if(gAPANNO==null) GAPAN_NO="";
		else GAPAN_NO = gAPANNO;
	}
	
	
	
}