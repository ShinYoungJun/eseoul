/**
 * Bu04BugaWSDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package BugaWebService_pkg;

public class Bu04BugaWSDTO  implements java.io.Serializable {
    private java.lang.String bigo;

    private java.lang.String bookNo;

    private long bunhalCnt;

    private java.lang.String buseoCd;

    private java.lang.String etc1;

    private java.lang.String gasanAmtSkipGubun;

    private java.lang.String gasanRateGubun;

    private long gigum;

    private long gigumGasanAmt;

    private long gigumIja;

    private long gukse;

    private long gukseGasanAmt;

    private long gukseIja;

    private long guse;

    private long guseGasanAmt;

    private long guseIja;

    private java.lang.String hangmok1;

    private java.lang.String hangmok2;

    private java.lang.String hangmok3;

    private java.lang.String hangmok4;

    private java.lang.String hangmok5;

    private java.lang.String hangmok6;

    private java.lang.String hdongCd;

    private java.lang.String lastWorkDate;

    private java.lang.String lastWorkId;

    private java.lang.String mulAptNm;

    private java.lang.String mulBan;

    private java.lang.String mulBdongriCd;

    private java.lang.String mulBon;

    private java.lang.String mulBu;

    private java.lang.String mulDong;

    private java.lang.String mulDtlAddr;

    private java.lang.String mulGubun;

    private java.lang.String mulHosu;

    private java.lang.String mulNm;

    private java.lang.String mulOcrSiguCd;

    private java.lang.String mulSpcCd;

    private java.lang.String mulTong;

    private java.lang.String mulZipAddr;

    private java.lang.String mulZipCd;

    private java.lang.String napBldBon;
    private java.lang.String napBldBu;
    private java.lang.String napDdtlAddr;
    
    private java.lang.String napDoroAddr;

    private java.lang.String napDoroCd;
    
    private java.lang.String napDtlAddr;

    private java.lang.String napEmail;

    private java.lang.String napGubun;

    private java.lang.String napId;

    private java.lang.String napMobilNo;

    private java.lang.String napNm;

    private java.lang.String napTelNo;

    private java.lang.String napUndYn;
    
    private java.lang.String napZipAddr;

    private java.lang.String napZipCd;

    private java.lang.String napbuYmd;

    private java.lang.String napgiAftYmd;

    private java.lang.String napgiYmd;

    private java.lang.String ocrBuseoCd;

    private java.lang.String ocrSiguCd;

    private java.lang.String resideStatus;

    private java.lang.String rowStatus;

    private java.lang.String semokCd;

    private java.lang.String sendYmd;

    private java.lang.String sidoCd;

    private java.lang.String siguCd;

    private long sise;

    private long siseGasanAmt;

    private long siseIja;

    private java.lang.String sokwanBuseoCd;

    private java.lang.String sokwanMgrNm;

    private java.lang.String sokwanTelNo;

    private double specialRate;

    private long specialRateApplyCnt;

    private java.lang.String specialRateApplySayu;

    private double specialRateHighRate;

    private java.lang.String suBuseoCd;

    private java.lang.String sysGubun;

    private long taxAmt;

    private java.lang.String taxGubun;

    private java.lang.String taxNo;

    private java.lang.String taxYm;

    private java.lang.String taxYmd;
    

  //********** BEGIN_����_20120212
    private java.lang.String napDzipCd;
    private java.lang.String napDzipAddr;
    //private java.lang.String napDdtlAddr;
    private java.lang.String napDrefAddr;
    
    public java.lang.String getNapDzipCd() {
		return napDzipCd;
	}

	public void setNapDzipCd(java.lang.String napDzipCd) {
		this.napDzipCd = napDzipCd;
	}

	public java.lang.String getNapDzipAddr() {
		return napDzipAddr;
	}

	public void setNapDzipAddr(java.lang.String napDzipAddr) {
		this.napDzipAddr = napDzipAddr;
	}

	public java.lang.String getNapDdtlAddr() {
		return napDdtlAddr;
	}

	public void setNapDdtlAddr(java.lang.String napDdtlAddr) {
		this.napDdtlAddr = napDdtlAddr;
	}

	public java.lang.String getNapDrefAddr() {
		return napDrefAddr;
	}

	public void setNapDrefAddr(java.lang.String napDrefAddr) {
		this.napDrefAddr = napDrefAddr;
	}
    
  //********** END_����_20120212    

	private long vatAmt;

    public Bu04BugaWSDTO() {
    }

    public Bu04BugaWSDTO(
           java.lang.String bigo,
           java.lang.String bookNo,
           long bunhalCnt,
           java.lang.String buseoCd,
           java.lang.String etc1,
           java.lang.String gasanAmtSkipGubun,
           java.lang.String gasanRateGubun,
           long gigum,
           long gigumGasanAmt,
           long gigumIja,	//10
           long gukse,
           long gukseGasanAmt,
           long gukseIja,
           long guse,
           long guseGasanAmt,
           long guseIja,
           java.lang.String hangmok1,
           java.lang.String hangmok2,
           java.lang.String hangmok3,
           java.lang.String hangmok4,	//20
           java.lang.String hangmok5,
           java.lang.String hangmok6,
           java.lang.String hdongCd,
           java.lang.String lastWorkDate,
           java.lang.String lastWorkId,
           java.lang.String mulAptNm,
           java.lang.String mulBan,
           java.lang.String mulBdongriCd,
           java.lang.String mulBon,
           java.lang.String mulBu,	//30
           java.lang.String mulDong,
           java.lang.String mulDtlAddr,
           java.lang.String mulGubun,
           java.lang.String mulHosu,
           java.lang.String mulNm,
           java.lang.String mulOcrSiguCd,
           java.lang.String mulSpcCd,
           java.lang.String mulTong,
           java.lang.String mulZipAddr,
           java.lang.String mulZipCd,	//40
           java.lang.String napBldBon,		// 2014.11
           java.lang.String napBldBu,		// 2014.11
           java.lang.String napDdtlAddr,	// 2014.11
           java.lang.String napDoroAddr,
           java.lang.String napDoroCd,		// 2014.11
           java.lang.String napDrefAddr,	// 2014.11
           java.lang.String napDtlAddr,
           java.lang.String napDzipAddr,	// 2014.11
           java.lang.String napDzipCd,		// 2014.11
           java.lang.String napEmail,	//50
           java.lang.String napGubun,
           java.lang.String napId,
           java.lang.String napMobilNo,
           java.lang.String napNm,
           java.lang.String napTelNo,
           java.lang.String napUndYn,		// 2014.11
           java.lang.String napZipAddr,
           java.lang.String napZipCd,	
           java.lang.String napbuYmd,
           java.lang.String napgiAftYmd,	//60	
           java.lang.String napgiYmd,
           java.lang.String ocrBuseoCd,
           java.lang.String ocrSiguCd,
           java.lang.String resideStatus,
           java.lang.String rowStatus,
           java.lang.String semokCd,
           java.lang.String sendYmd,
           java.lang.String sidoCd,
           java.lang.String siguCd,
           long sise,	//70
           long siseGasanAmt,
           long siseIja,
           java.lang.String sokwanBuseoCd,
           java.lang.String sokwanMgrNm,
           java.lang.String sokwanTelNo,
           double specialRate,
           long specialRateApplyCnt,
           java.lang.String specialRateApplySayu,
           double specialRateHighRate,
           java.lang.String suBuseoCd,	//80
           java.lang.String sysGubun,	
           long taxAmt,
           java.lang.String taxGubun,
           java.lang.String taxNo,
           java.lang.String taxYm,
           java.lang.String taxYmd,	
           long vatAmt) {	//87
           this.bigo = bigo;
           this.bookNo = bookNo;
           this.bunhalCnt = bunhalCnt;
           this.buseoCd = buseoCd;
           this.etc1 = etc1;
           this.gasanAmtSkipGubun = gasanAmtSkipGubun;
           this.gasanRateGubun = gasanRateGubun;
           this.gigum = gigum;
           this.gigumGasanAmt = gigumGasanAmt;
           this.gigumIja = gigumIja;
           this.gukse = gukse;
           this.gukseGasanAmt = gukseGasanAmt;
           this.gukseIja = gukseIja;
           this.guse = guse;
           this.guseGasanAmt = guseGasanAmt;
           this.guseIja = guseIja;
           this.hangmok1 = hangmok1;
           this.hangmok2 = hangmok2;
           this.hangmok3 = hangmok3;
           this.hangmok4 = hangmok4;
           this.hangmok5 = hangmok5;
           this.hangmok6 = hangmok6;
           this.hdongCd = hdongCd;
           this.lastWorkDate = lastWorkDate;
           this.lastWorkId = lastWorkId;
           this.mulAptNm = mulAptNm;
           this.mulBan = mulBan;
           this.mulBdongriCd = mulBdongriCd;
           this.mulBon = mulBon;
           this.mulBu = mulBu;
           this.mulDong = mulDong;
           this.mulDtlAddr = mulDtlAddr;
           this.mulGubun = mulGubun;
           this.mulHosu = mulHosu;
           this.mulNm = mulNm;
           this.mulOcrSiguCd = mulOcrSiguCd;
           this.mulSpcCd = mulSpcCd;
           this.mulTong = mulTong;
           this.mulZipAddr = mulZipAddr;
           this.mulZipCd = mulZipCd;
           this.napBldBon = napBldBon;		// 2014.11
           this.napBldBu = napBldBu;		// 2014.11
           this.napDdtlAddr = napDdtlAddr;	// 2014.11
           this.napDoroAddr = napDoroAddr;
           this.napDrefAddr = napDrefAddr;	// 2014.11
           this.napDtlAddr = napDtlAddr;
           this.napDzipAddr = napDzipAddr;	// 2014.11
           this.napEmail = napEmail;
           this.napGubun = napGubun;
           this.napId = napId;
           this.napMobilNo = napMobilNo;
           this.napNm = napNm;
           this.napTelNo = napTelNo;
           this.napZipAddr = napZipAddr;
           this.napZipCd = napZipCd;
           this.napbuYmd = napbuYmd;
           this.napgiAftYmd = napgiAftYmd;
           this.napgiYmd = napgiYmd;
           this.ocrBuseoCd = ocrBuseoCd;
           this.ocrSiguCd = ocrSiguCd;
           this.resideStatus = resideStatus;
           this.rowStatus = rowStatus;
           this.semokCd = semokCd;
           this.sendYmd = sendYmd;
           this.sidoCd = sidoCd;
           this.siguCd = siguCd;
           this.sise = sise;
           this.siseGasanAmt = siseGasanAmt;
           this.siseIja = siseIja;
           this.sokwanBuseoCd = sokwanBuseoCd;
           this.sokwanMgrNm = sokwanMgrNm;
           this.sokwanTelNo = sokwanTelNo;
           this.specialRate = specialRate;
           this.specialRateApplyCnt = specialRateApplyCnt;
           this.specialRateApplySayu = specialRateApplySayu;
           this.specialRateHighRate = specialRateHighRate;
           this.suBuseoCd = suBuseoCd;
           this.sysGubun = sysGubun;
           this.taxAmt = taxAmt;
           this.taxGubun = taxGubun;
           this.taxNo = taxNo;
           this.taxYm = taxYm;
           this.taxYmd = taxYmd;
           this.vatAmt = vatAmt;
    }

	public java.lang.String getNapBldBon() {
		return napBldBon;
	}

	public void setNapBldBon(java.lang.String napBldBon) {
		this.napBldBon = napBldBon;
	}

	public java.lang.String getNapBldBu() {
		return napBldBu;
	}

	public void setNapBldBu(java.lang.String napBldBu) {
		this.napBldBu = napBldBu;
	}

	public java.lang.String getNapDoroCd() {
		return napDoroCd;
	}

	public void setNapDoroCd(java.lang.String napDoroCd) {
		this.napDoroCd = napDoroCd;
	}

	public java.lang.String getNapUndYn() {
		return napUndYn;
	}

	public void setNapUndYn(java.lang.String napUndYn) {
		this.napUndYn = napUndYn;
	}

	/**
     * Gets the bigo value for this Bu04BugaWSDTO.
     * 
     * @return bigo
     */
    public java.lang.String getBigo() {
        return bigo;
    }


    /**
     * Sets the bigo value for this Bu04BugaWSDTO.
     * 
     * @param bigo
     */
    public void setBigo(java.lang.String bigo) {
        this.bigo = bigo;
    }


    /**
     * Gets the bookNo value for this Bu04BugaWSDTO.
     * 
     * @return bookNo
     */
    public java.lang.String getBookNo() {
        return bookNo;
    }


    /**
     * Sets the bookNo value for this Bu04BugaWSDTO.
     * 
     * @param bookNo
     */
    public void setBookNo(java.lang.String bookNo) {
        this.bookNo = bookNo;
    }


    /**
     * Gets the bunhalCnt value for this Bu04BugaWSDTO.
     * 
     * @return bunhalCnt
     */
    public long getBunhalCnt() {
        return bunhalCnt;
    }


    /**
     * Sets the bunhalCnt value for this Bu04BugaWSDTO.
     * 
     * @param bunhalCnt
     */
    public void setBunhalCnt(long bunhalCnt) {
        this.bunhalCnt = bunhalCnt;
    }


    /**
     * Gets the buseoCd value for this Bu04BugaWSDTO.
     * 
     * @return buseoCd
     */
    public java.lang.String getBuseoCd() {
        return buseoCd;
    }


    /**
     * Sets the buseoCd value for this Bu04BugaWSDTO.
     * 
     * @param buseoCd
     */
    public void setBuseoCd(java.lang.String buseoCd) {
        this.buseoCd = buseoCd;
    }


    /**
     * Gets the etc1 value for this Bu04BugaWSDTO.
     * 
     * @return etc1
     */
    public java.lang.String getEtc1() {
        return etc1;
    }


    /**
     * Sets the etc1 value for this Bu04BugaWSDTO.
     * 
     * @param etc1
     */
    public void setEtc1(java.lang.String etc1) {
        this.etc1 = etc1;
    }


    /**
     * Gets the gasanAmtSkipGubun value for this Bu04BugaWSDTO.
     * 
     * @return gasanAmtSkipGubun
     */
    public java.lang.String getGasanAmtSkipGubun() {
        return gasanAmtSkipGubun;
    }


    /**
     * Sets the gasanAmtSkipGubun value for this Bu04BugaWSDTO.
     * 
     * @param gasanAmtSkipGubun
     */
    public void setGasanAmtSkipGubun(java.lang.String gasanAmtSkipGubun) {
        this.gasanAmtSkipGubun = gasanAmtSkipGubun;
    }


    /**
     * Gets the gasanRateGubun value for this Bu04BugaWSDTO.
     * 
     * @return gasanRateGubun
     */
    public java.lang.String getGasanRateGubun() {
        return gasanRateGubun;
    }


    /**
     * Sets the gasanRateGubun value for this Bu04BugaWSDTO.
     * 
     * @param gasanRateGubun
     */
    public void setGasanRateGubun(java.lang.String gasanRateGubun) {
        this.gasanRateGubun = gasanRateGubun;
    }


    /**
     * Gets the gigum value for this Bu04BugaWSDTO.
     * 
     * @return gigum
     */
    public long getGigum() {
        return gigum;
    }


    /**
     * Sets the gigum value for this Bu04BugaWSDTO.
     * 
     * @param gigum
     */
    public void setGigum(long gigum) {
        this.gigum = gigum;
    }


    /**
     * Gets the gigumGasanAmt value for this Bu04BugaWSDTO.
     * 
     * @return gigumGasanAmt
     */
    public long getGigumGasanAmt() {
        return gigumGasanAmt;
    }


    /**
     * Sets the gigumGasanAmt value for this Bu04BugaWSDTO.
     * 
     * @param gigumGasanAmt
     */
    public void setGigumGasanAmt(long gigumGasanAmt) {
        this.gigumGasanAmt = gigumGasanAmt;
    }


    /**
     * Gets the gigumIja value for this Bu04BugaWSDTO.
     * 
     * @return gigumIja
     */
    public long getGigumIja() {
        return gigumIja;
    }


    /**
     * Sets the gigumIja value for this Bu04BugaWSDTO.
     * 
     * @param gigumIja
     */
    public void setGigumIja(long gigumIja) {
        this.gigumIja = gigumIja;
    }


    /**
     * Gets the gukse value for this Bu04BugaWSDTO.
     * 
     * @return gukse
     */
    public long getGukse() {
        return gukse;
    }


    /**
     * Sets the gukse value for this Bu04BugaWSDTO.
     * 
     * @param gukse
     */
    public void setGukse(long gukse) {
        this.gukse = gukse;
    }


    /**
     * Gets the gukseGasanAmt value for this Bu04BugaWSDTO.
     * 
     * @return gukseGasanAmt
     */
    public long getGukseGasanAmt() {
        return gukseGasanAmt;
    }


    /**
     * Sets the gukseGasanAmt value for this Bu04BugaWSDTO.
     * 
     * @param gukseGasanAmt
     */
    public void setGukseGasanAmt(long gukseGasanAmt) {
        this.gukseGasanAmt = gukseGasanAmt;
    }


    /**
     * Gets the gukseIja value for this Bu04BugaWSDTO.
     * 
     * @return gukseIja
     */
    public long getGukseIja() {
        return gukseIja;
    }


    /**
     * Sets the gukseIja value for this Bu04BugaWSDTO.
     * 
     * @param gukseIja
     */
    public void setGukseIja(long gukseIja) {
        this.gukseIja = gukseIja;
    }


    /**
     * Gets the guse value for this Bu04BugaWSDTO.
     * 
     * @return guse
     */
    public long getGuse() {
        return guse;
    }


    /**
     * Sets the guse value for this Bu04BugaWSDTO.
     * 
     * @param guse
     */
    public void setGuse(long guse) {
        this.guse = guse;
    }


    /**
     * Gets the guseGasanAmt value for this Bu04BugaWSDTO.
     * 
     * @return guseGasanAmt
     */
    public long getGuseGasanAmt() {
        return guseGasanAmt;
    }


    /**
     * Sets the guseGasanAmt value for this Bu04BugaWSDTO.
     * 
     * @param guseGasanAmt
     */
    public void setGuseGasanAmt(long guseGasanAmt) {
        this.guseGasanAmt = guseGasanAmt;
    }


    /**
     * Gets the guseIja value for this Bu04BugaWSDTO.
     * 
     * @return guseIja
     */
    public long getGuseIja() {
        return guseIja;
    }


    /**
     * Sets the guseIja value for this Bu04BugaWSDTO.
     * 
     * @param guseIja
     */
    public void setGuseIja(long guseIja) {
        this.guseIja = guseIja;
    }


    /**
     * Gets the hangmok1 value for this Bu04BugaWSDTO.
     * 
     * @return hangmok1
     */
    public java.lang.String getHangmok1() {
        return hangmok1;
    }


    /**
     * Sets the hangmok1 value for this Bu04BugaWSDTO.
     * 
     * @param hangmok1
     */
    public void setHangmok1(java.lang.String hangmok1) {
        this.hangmok1 = hangmok1;
    }


    /**
     * Gets the hangmok2 value for this Bu04BugaWSDTO.
     * 
     * @return hangmok2
     */
    public java.lang.String getHangmok2() {
        return hangmok2;
    }


    /**
     * Sets the hangmok2 value for this Bu04BugaWSDTO.
     * 
     * @param hangmok2
     */
    public void setHangmok2(java.lang.String hangmok2) {
        this.hangmok2 = hangmok2;
    }


    /**
     * Gets the hangmok3 value for this Bu04BugaWSDTO.
     * 
     * @return hangmok3
     */
    public java.lang.String getHangmok3() {
        return hangmok3;
    }


    /**
     * Sets the hangmok3 value for this Bu04BugaWSDTO.
     * 
     * @param hangmok3
     */
    public void setHangmok3(java.lang.String hangmok3) {
        this.hangmok3 = hangmok3;
    }


    /**
     * Gets the hangmok4 value for this Bu04BugaWSDTO.
     * 
     * @return hangmok4
     */
    public java.lang.String getHangmok4() {
        return hangmok4;
    }


    /**
     * Sets the hangmok4 value for this Bu04BugaWSDTO.
     * 
     * @param hangmok4
     */
    public void setHangmok4(java.lang.String hangmok4) {
        this.hangmok4 = hangmok4;
    }


    /**
     * Gets the hangmok5 value for this Bu04BugaWSDTO.
     * 
     * @return hangmok5
     */
    public java.lang.String getHangmok5() {
        return hangmok5;
    }


    /**
     * Sets the hangmok5 value for this Bu04BugaWSDTO.
     * 
     * @param hangmok5
     */
    public void setHangmok5(java.lang.String hangmok5) {
        this.hangmok5 = hangmok5;
    }


    /**
     * Gets the hangmok6 value for this Bu04BugaWSDTO.
     * 
     * @return hangmok6
     */
    public java.lang.String getHangmok6() {
        return hangmok6;
    }


    /**
     * Sets the hangmok6 value for this Bu04BugaWSDTO.
     * 
     * @param hangmok6
     */
    public void setHangmok6(java.lang.String hangmok6) {
        this.hangmok6 = hangmok6;
    }


    /**
     * Gets the hdongCd value for this Bu04BugaWSDTO.
     * 
     * @return hdongCd
     */
    public java.lang.String getHdongCd() {
        return hdongCd;
    }


    /**
     * Sets the hdongCd value for this Bu04BugaWSDTO.
     * 
     * @param hdongCd
     */
    public void setHdongCd(java.lang.String hdongCd) {
        this.hdongCd = hdongCd;
    }


    /**
     * Gets the lastWorkDate value for this Bu04BugaWSDTO.
     * 
     * @return lastWorkDate
     */
    public java.lang.String getLastWorkDate() {
        return lastWorkDate;
    }


    /**
     * Sets the lastWorkDate value for this Bu04BugaWSDTO.
     * 
     * @param lastWorkDate
     */
    public void setLastWorkDate(java.lang.String lastWorkDate) {
        this.lastWorkDate = lastWorkDate;
    }


    /**
     * Gets the lastWorkId value for this Bu04BugaWSDTO.
     * 
     * @return lastWorkId
     */
    public java.lang.String getLastWorkId() {
        return lastWorkId;
    }


    /**
     * Sets the lastWorkId value for this Bu04BugaWSDTO.
     * 
     * @param lastWorkId
     */
    public void setLastWorkId(java.lang.String lastWorkId) {
        this.lastWorkId = lastWorkId;
    }


    /**
     * Gets the mulAptNm value for this Bu04BugaWSDTO.
     * 
     * @return mulAptNm
     */
    public java.lang.String getMulAptNm() {
        return mulAptNm;
    }


    /**
     * Sets the mulAptNm value for this Bu04BugaWSDTO.
     * 
     * @param mulAptNm
     */
    public void setMulAptNm(java.lang.String mulAptNm) {
        this.mulAptNm = mulAptNm;
    }


    /**
     * Gets the mulBan value for this Bu04BugaWSDTO.
     * 
     * @return mulBan
     */
    public java.lang.String getMulBan() {
        return mulBan;
    }


    /**
     * Sets the mulBan value for this Bu04BugaWSDTO.
     * 
     * @param mulBan
     */
    public void setMulBan(java.lang.String mulBan) {
        this.mulBan = mulBan;
    }


    /**
     * Gets the mulBdongriCd value for this Bu04BugaWSDTO.
     * 
     * @return mulBdongriCd
     */
    public java.lang.String getMulBdongriCd() {
        return mulBdongriCd;
    }


    /**
     * Sets the mulBdongriCd value for this Bu04BugaWSDTO.
     * 
     * @param mulBdongriCd
     */
    public void setMulBdongriCd(java.lang.String mulBdongriCd) {
        this.mulBdongriCd = mulBdongriCd;
    }


    /**
     * Gets the mulBon value for this Bu04BugaWSDTO.
     * 
     * @return mulBon
     */
    public java.lang.String getMulBon() {
        return mulBon;
    }


    /**
     * Sets the mulBon value for this Bu04BugaWSDTO.
     * 
     * @param mulBon
     */
    public void setMulBon(java.lang.String mulBon) {
        this.mulBon = mulBon;
    }


    /**
     * Gets the mulBu value for this Bu04BugaWSDTO.
     * 
     * @return mulBu
     */
    public java.lang.String getMulBu() {
        return mulBu;
    }


    /**
     * Sets the mulBu value for this Bu04BugaWSDTO.
     * 
     * @param mulBu
     */
    public void setMulBu(java.lang.String mulBu) {
        this.mulBu = mulBu;
    }


    /**
     * Gets the mulDong value for this Bu04BugaWSDTO.
     * 
     * @return mulDong
     */
    public java.lang.String getMulDong() {
        return mulDong;
    }


    /**
     * Sets the mulDong value for this Bu04BugaWSDTO.
     * 
     * @param mulDong
     */
    public void setMulDong(java.lang.String mulDong) {
        this.mulDong = mulDong;
    }


    /**
     * Gets the mulDtlAddr value for this Bu04BugaWSDTO.
     * 
     * @return mulDtlAddr
     */
    public java.lang.String getMulDtlAddr() {
        return mulDtlAddr;
    }


    /**
     * Sets the mulDtlAddr value for this Bu04BugaWSDTO.
     * 
     * @param mulDtlAddr
     */
    public void setMulDtlAddr(java.lang.String mulDtlAddr) {
        this.mulDtlAddr = mulDtlAddr;
    }


    /**
     * Gets the mulGubun value for this Bu04BugaWSDTO.
     * 
     * @return mulGubun
     */
    public java.lang.String getMulGubun() {
        return mulGubun;
    }


    /**
     * Sets the mulGubun value for this Bu04BugaWSDTO.
     * 
     * @param mulGubun
     */
    public void setMulGubun(java.lang.String mulGubun) {
        this.mulGubun = mulGubun;
    }


    /**
     * Gets the mulHosu value for this Bu04BugaWSDTO.
     * 
     * @return mulHosu
     */
    public java.lang.String getMulHosu() {
        return mulHosu;
    }


    /**
     * Sets the mulHosu value for this Bu04BugaWSDTO.
     * 
     * @param mulHosu
     */
    public void setMulHosu(java.lang.String mulHosu) {
        this.mulHosu = mulHosu;
    }


    /**
     * Gets the mulNm value for this Bu04BugaWSDTO.
     * 
     * @return mulNm
     */
    public java.lang.String getMulNm() {
        return mulNm;
    }


    /**
     * Sets the mulNm value for this Bu04BugaWSDTO.
     * 
     * @param mulNm
     */
    public void setMulNm(java.lang.String mulNm) {
        this.mulNm = mulNm;
    }


    /**
     * Gets the mulOcrSiguCd value for this Bu04BugaWSDTO.
     * 
     * @return mulOcrSiguCd
     */
    public java.lang.String getMulOcrSiguCd() {
        return mulOcrSiguCd;
    }


    /**
     * Sets the mulOcrSiguCd value for this Bu04BugaWSDTO.
     * 
     * @param mulOcrSiguCd
     */
    public void setMulOcrSiguCd(java.lang.String mulOcrSiguCd) {
        this.mulOcrSiguCd = mulOcrSiguCd;
    }


    /**
     * Gets the mulSpcCd value for this Bu04BugaWSDTO.
     * 
     * @return mulSpcCd
     */
    public java.lang.String getMulSpcCd() {
        return mulSpcCd;
    }


    /**
     * Sets the mulSpcCd value for this Bu04BugaWSDTO.
     * 
     * @param mulSpcCd
     */
    public void setMulSpcCd(java.lang.String mulSpcCd) {
        this.mulSpcCd = mulSpcCd;
    }


    /**
     * Gets the mulTong value for this Bu04BugaWSDTO.
     * 
     * @return mulTong
     */
    public java.lang.String getMulTong() {
        return mulTong;
    }


    /**
     * Sets the mulTong value for this Bu04BugaWSDTO.
     * 
     * @param mulTong
     */
    public void setMulTong(java.lang.String mulTong) {
        this.mulTong = mulTong;
    }


    /**
     * Gets the mulZipAddr value for this Bu04BugaWSDTO.
     * 
     * @return mulZipAddr
     */
    public java.lang.String getMulZipAddr() {
        return mulZipAddr;
    }


    /**
     * Sets the mulZipAddr value for this Bu04BugaWSDTO.
     * 
     * @param mulZipAddr
     */
    public void setMulZipAddr(java.lang.String mulZipAddr) {
        this.mulZipAddr = mulZipAddr;
    }


    /**
     * Gets the mulZipCd value for this Bu04BugaWSDTO.
     * 
     * @return mulZipCd
     */
    public java.lang.String getMulZipCd() {
        return mulZipCd;
    }


    /**
     * Sets the mulZipCd value for this Bu04BugaWSDTO.
     * 
     * @param mulZipCd
     */
    public void setMulZipCd(java.lang.String mulZipCd) {
        this.mulZipCd = mulZipCd;
    }


    /**
     * Gets the napDoroAddr value for this Bu04BugaWSDTO.
     * 
     * @return napDoroAddr
     */
    public java.lang.String getNapDoroAddr() {
        return napDoroAddr;
    }


    /**
     * Sets the napDoroAddr value for this Bu04BugaWSDTO.
     * 
     * @param napDoroAddr
     */
    public void setNapDoroAddr(java.lang.String napDoroAddr) {
        this.napDoroAddr = napDoroAddr;
    }


    /**
     * Gets the napDtlAddr value for this Bu04BugaWSDTO.
     * 
     * @return napDtlAddr
     */
    public java.lang.String getNapDtlAddr() {
        return napDtlAddr;
    }


    /**
     * Sets the napDtlAddr value for this Bu04BugaWSDTO.
     * 
     * @param napDtlAddr
     */
    public void setNapDtlAddr(java.lang.String napDtlAddr) {
        this.napDtlAddr = napDtlAddr;
    }


    /**
     * Gets the napEmail value for this Bu04BugaWSDTO.
     * 
     * @return napEmail
     */
    public java.lang.String getNapEmail() {
        return napEmail;
    }


    /**
     * Sets the napEmail value for this Bu04BugaWSDTO.
     * 
     * @param napEmail
     */
    public void setNapEmail(java.lang.String napEmail) {
        this.napEmail = napEmail;
    }


    /**
     * Gets the napGubun value for this Bu04BugaWSDTO.
     * 
     * @return napGubun
     */
    public java.lang.String getNapGubun() {
        return napGubun;
    }


    /**
     * Sets the napGubun value for this Bu04BugaWSDTO.
     * 
     * @param napGubun
     */
    public void setNapGubun(java.lang.String napGubun) {
        this.napGubun = napGubun;
    }


    /**
     * Gets the napId value for this Bu04BugaWSDTO.
     * 
     * @return napId
     */
    public java.lang.String getNapId() {
        return napId;
    }


    /**
     * Sets the napId value for this Bu04BugaWSDTO.
     * 
     * @param napId
     */
    public void setNapId(java.lang.String napId) {
        this.napId = napId;
    }


    /**
     * Gets the napMobilNo value for this Bu04BugaWSDTO.
     * 
     * @return napMobilNo
     */
    public java.lang.String getNapMobilNo() {
        return napMobilNo;
    }


    /**
     * Sets the napMobilNo value for this Bu04BugaWSDTO.
     * 
     * @param napMobilNo
     */
    public void setNapMobilNo(java.lang.String napMobilNo) {
        this.napMobilNo = napMobilNo;
    }


    /**
     * Gets the napNm value for this Bu04BugaWSDTO.
     * 
     * @return napNm
     */
    public java.lang.String getNapNm() {
        return napNm;
    }


    /**
     * Sets the napNm value for this Bu04BugaWSDTO.
     * 
     * @param napNm
     */
    public void setNapNm(java.lang.String napNm) {
        this.napNm = napNm;
    }


    /**
     * Gets the napTelNo value for this Bu04BugaWSDTO.
     * 
     * @return napTelNo
     */
    public java.lang.String getNapTelNo() {
        return napTelNo;
    }


    /**
     * Sets the napTelNo value for this Bu04BugaWSDTO.
     * 
     * @param napTelNo
     */
    public void setNapTelNo(java.lang.String napTelNo) {
        this.napTelNo = napTelNo;
    }


    /**
     * Gets the napZipAddr value for this Bu04BugaWSDTO.
     * 
     * @return napZipAddr
     */
    public java.lang.String getNapZipAddr() {
        return napZipAddr;
    }


    /**
     * Sets the napZipAddr value for this Bu04BugaWSDTO.
     * 
     * @param napZipAddr
     */
    public void setNapZipAddr(java.lang.String napZipAddr) {
        this.napZipAddr = napZipAddr;
    }


    /**
     * Gets the napZipCd value for this Bu04BugaWSDTO.
     * 
     * @return napZipCd
     */
    public java.lang.String getNapZipCd() {
        return napZipCd;
    }


    /**
     * Sets the napZipCd value for this Bu04BugaWSDTO.
     * 
     * @param napZipCd
     */
    public void setNapZipCd(java.lang.String napZipCd) {
        this.napZipCd = napZipCd;
    }


    /**
     * Gets the napbuYmd value for this Bu04BugaWSDTO.
     * 
     * @return napbuYmd
     */
    public java.lang.String getNapbuYmd() {
        return napbuYmd;
    }


    /**
     * Sets the napbuYmd value for this Bu04BugaWSDTO.
     * 
     * @param napbuYmd
     */
    public void setNapbuYmd(java.lang.String napbuYmd) {
        this.napbuYmd = napbuYmd;
    }


    /**
     * Gets the napgiAftYmd value for this Bu04BugaWSDTO.
     * 
     * @return napgiAftYmd
     */
    public java.lang.String getNapgiAftYmd() {
        return napgiAftYmd;
    }


    /**
     * Sets the napgiAftYmd value for this Bu04BugaWSDTO.
     * 
     * @param napgiAftYmd
     */
    public void setNapgiAftYmd(java.lang.String napgiAftYmd) {
        this.napgiAftYmd = napgiAftYmd;
    }


    /**
     * Gets the napgiYmd value for this Bu04BugaWSDTO.
     * 
     * @return napgiYmd
     */
    public java.lang.String getNapgiYmd() {
        return napgiYmd;
    }


    /**
     * Sets the napgiYmd value for this Bu04BugaWSDTO.
     * 
     * @param napgiYmd
     */
    public void setNapgiYmd(java.lang.String napgiYmd) {
        this.napgiYmd = napgiYmd;
    }


    /**
     * Gets the ocrBuseoCd value for this Bu04BugaWSDTO.
     * 
     * @return ocrBuseoCd
     */
    public java.lang.String getOcrBuseoCd() {
        return ocrBuseoCd;
    }


    /**
     * Sets the ocrBuseoCd value for this Bu04BugaWSDTO.
     * 
     * @param ocrBuseoCd
     */
    public void setOcrBuseoCd(java.lang.String ocrBuseoCd) {
        this.ocrBuseoCd = ocrBuseoCd;
    }


    /**
     * Gets the ocrSiguCd value for this Bu04BugaWSDTO.
     * 
     * @return ocrSiguCd
     */
    public java.lang.String getOcrSiguCd() {
        return ocrSiguCd;
    }


    /**
     * Sets the ocrSiguCd value for this Bu04BugaWSDTO.
     * 
     * @param ocrSiguCd
     */
    public void setOcrSiguCd(java.lang.String ocrSiguCd) {
        this.ocrSiguCd = ocrSiguCd;
    }


    /**
     * Gets the resideStatus value for this Bu04BugaWSDTO.
     * 
     * @return resideStatus
     */
    public java.lang.String getResideStatus() {
        return resideStatus;
    }


    /**
     * Sets the resideStatus value for this Bu04BugaWSDTO.
     * 
     * @param resideStatus
     */
    public void setResideStatus(java.lang.String resideStatus) {
        this.resideStatus = resideStatus;
    }


    /**
     * Gets the rowStatus value for this Bu04BugaWSDTO.
     * 
     * @return rowStatus
     */
    public java.lang.String getRowStatus() {
        return rowStatus;
    }


    /**
     * Sets the rowStatus value for this Bu04BugaWSDTO.
     * 
     * @param rowStatus
     */
    public void setRowStatus(java.lang.String rowStatus) {
        this.rowStatus = rowStatus;
    }


    /**
     * Gets the semokCd value for this Bu04BugaWSDTO.
     * 
     * @return semokCd
     */
    public java.lang.String getSemokCd() {
        return semokCd;
    }


    /**
     * Sets the semokCd value for this Bu04BugaWSDTO.
     * 
     * @param semokCd
     */
    public void setSemokCd(java.lang.String semokCd) {
        this.semokCd = semokCd;
    }


    /**
     * Gets the sendYmd value for this Bu04BugaWSDTO.
     * 
     * @return sendYmd
     */
    public java.lang.String getSendYmd() {
        return sendYmd;
    }


    /**
     * Sets the sendYmd value for this Bu04BugaWSDTO.
     * 
     * @param sendYmd
     */
    public void setSendYmd(java.lang.String sendYmd) {
        this.sendYmd = sendYmd;
    }


    /**
     * Gets the sidoCd value for this Bu04BugaWSDTO.
     * 
     * @return sidoCd
     */
    public java.lang.String getSidoCd() {
        return sidoCd;
    }


    /**
     * Sets the sidoCd value for this Bu04BugaWSDTO.
     * 
     * @param sidoCd
     */
    public void setSidoCd(java.lang.String sidoCd) {
        this.sidoCd = sidoCd;
    }


    /**
     * Gets the siguCd value for this Bu04BugaWSDTO.
     * 
     * @return siguCd
     */
    public java.lang.String getSiguCd() {
        return siguCd;
    }


    /**
     * Sets the siguCd value for this Bu04BugaWSDTO.
     * 
     * @param siguCd
     */
    public void setSiguCd(java.lang.String siguCd) {
        this.siguCd = siguCd;
    }


    /**
     * Gets the sise value for this Bu04BugaWSDTO.
     * 
     * @return sise
     */
    public long getSise() {
        return sise;
    }


    /**
     * Sets the sise value for this Bu04BugaWSDTO.
     * 
     * @param sise
     */
    public void setSise(long sise) {
        this.sise = sise;
    }


    /**
     * Gets the siseGasanAmt value for this Bu04BugaWSDTO.
     * 
     * @return siseGasanAmt
     */
    public long getSiseGasanAmt() {
        return siseGasanAmt;
    }


    /**
     * Sets the siseGasanAmt value for this Bu04BugaWSDTO.
     * 
     * @param siseGasanAmt
     */
    public void setSiseGasanAmt(long siseGasanAmt) {
        this.siseGasanAmt = siseGasanAmt;
    }


    /**
     * Gets the siseIja value for this Bu04BugaWSDTO.
     * 
     * @return siseIja
     */
    public long getSiseIja() {
        return siseIja;
    }


    /**
     * Sets the siseIja value for this Bu04BugaWSDTO.
     * 
     * @param siseIja
     */
    public void setSiseIja(long siseIja) {
        this.siseIja = siseIja;
    }


    /**
     * Gets the sokwanBuseoCd value for this Bu04BugaWSDTO.
     * 
     * @return sokwanBuseoCd
     */
    public java.lang.String getSokwanBuseoCd() {
        return sokwanBuseoCd;
    }


    /**
     * Sets the sokwanBuseoCd value for this Bu04BugaWSDTO.
     * 
     * @param sokwanBuseoCd
     */
    public void setSokwanBuseoCd(java.lang.String sokwanBuseoCd) {
        this.sokwanBuseoCd = sokwanBuseoCd;
    }


    /**
     * Gets the sokwanMgrNm value for this Bu04BugaWSDTO.
     * 
     * @return sokwanMgrNm
     */
    public java.lang.String getSokwanMgrNm() {
        return sokwanMgrNm;
    }


    /**
     * Sets the sokwanMgrNm value for this Bu04BugaWSDTO.
     * 
     * @param sokwanMgrNm
     */
    public void setSokwanMgrNm(java.lang.String sokwanMgrNm) {
        this.sokwanMgrNm = sokwanMgrNm;
    }


    /**
     * Gets the sokwanTelNo value for this Bu04BugaWSDTO.
     * 
     * @return sokwanTelNo
     */
    public java.lang.String getSokwanTelNo() {
        return sokwanTelNo;
    }


    /**
     * Sets the sokwanTelNo value for this Bu04BugaWSDTO.
     * 
     * @param sokwanTelNo
     */
    public void setSokwanTelNo(java.lang.String sokwanTelNo) {
        this.sokwanTelNo = sokwanTelNo;
    }


    /**
     * Gets the specialRate value for this Bu04BugaWSDTO.
     * 
     * @return specialRate
     */
    public double getSpecialRate() {
        return specialRate;
    }


    /**
     * Sets the specialRate value for this Bu04BugaWSDTO.
     * 
     * @param specialRate
     */
    public void setSpecialRate(double specialRate) {
        this.specialRate = specialRate;
    }


    /**
     * Gets the specialRateApplyCnt value for this Bu04BugaWSDTO.
     * 
     * @return specialRateApplyCnt
     */
    public long getSpecialRateApplyCnt() {
        return specialRateApplyCnt;
    }


    /**
     * Sets the specialRateApplyCnt value for this Bu04BugaWSDTO.
     * 
     * @param specialRateApplyCnt
     */
    public void setSpecialRateApplyCnt(long specialRateApplyCnt) {
        this.specialRateApplyCnt = specialRateApplyCnt;
    }


    /**
     * Gets the specialRateApplySayu value for this Bu04BugaWSDTO.
     * 
     * @return specialRateApplySayu
     */
    public java.lang.String getSpecialRateApplySayu() {
        return specialRateApplySayu;
    }


    /**
     * Sets the specialRateApplySayu value for this Bu04BugaWSDTO.
     * 
     * @param specialRateApplySayu
     */
    public void setSpecialRateApplySayu(java.lang.String specialRateApplySayu) {
        this.specialRateApplySayu = specialRateApplySayu;
    }


    /**
     * Gets the specialRateHighRate value for this Bu04BugaWSDTO.
     * 
     * @return specialRateHighRate
     */
    public double getSpecialRateHighRate() {
        return specialRateHighRate;
    }


    /**
     * Sets the specialRateHighRate value for this Bu04BugaWSDTO.
     * 
     * @param specialRateHighRate
     */
    public void setSpecialRateHighRate(double specialRateHighRate) {
        this.specialRateHighRate = specialRateHighRate;
    }


    /**
     * Gets the suBuseoCd value for this Bu04BugaWSDTO.
     * 
     * @return suBuseoCd
     */
    public java.lang.String getSuBuseoCd() {
        return suBuseoCd;
    }


    /**
     * Sets the suBuseoCd value for this Bu04BugaWSDTO.
     * 
     * @param suBuseoCd
     */
    public void setSuBuseoCd(java.lang.String suBuseoCd) {
        this.suBuseoCd = suBuseoCd;
    }


    /**
     * Gets the sysGubun value for this Bu04BugaWSDTO.
     * 
     * @return sysGubun
     */
    public java.lang.String getSysGubun() {
        return sysGubun;
    }


    /**
     * Sets the sysGubun value for this Bu04BugaWSDTO.
     * 
     * @param sysGubun
     */
    public void setSysGubun(java.lang.String sysGubun) {
        this.sysGubun = sysGubun;
    }


    /**
     * Gets the taxAmt value for this Bu04BugaWSDTO.
     * 
     * @return taxAmt
     */
    public long getTaxAmt() {
        return taxAmt;
    }


    /**
     * Sets the taxAmt value for this Bu04BugaWSDTO.
     * 
     * @param taxAmt
     */
    public void setTaxAmt(long taxAmt) {
        this.taxAmt = taxAmt;
    }


    /**
     * Gets the taxGubun value for this Bu04BugaWSDTO.
     * 
     * @return taxGubun
     */
    public java.lang.String getTaxGubun() {
        return taxGubun;
    }


    /**
     * Sets the taxGubun value for this Bu04BugaWSDTO.
     * 
     * @param taxGubun
     */
    public void setTaxGubun(java.lang.String taxGubun) {
        this.taxGubun = taxGubun;
    }


    /**
     * Gets the taxNo value for this Bu04BugaWSDTO.
     * 
     * @return taxNo
     */
    public java.lang.String getTaxNo() {
        return taxNo;
    }


    /**
     * Sets the taxNo value for this Bu04BugaWSDTO.
     * 
     * @param taxNo
     */
    public void setTaxNo(java.lang.String taxNo) {
        this.taxNo = taxNo;
    }


    /**
     * Gets the taxYm value for this Bu04BugaWSDTO.
     * 
     * @return taxYm
     */
    public java.lang.String getTaxYm() {
        return taxYm;
    }


    /**
     * Sets the taxYm value for this Bu04BugaWSDTO.
     * 
     * @param taxYm
     */
    public void setTaxYm(java.lang.String taxYm) {
        this.taxYm = taxYm;
    }


    /**
     * Gets the taxYmd value for this Bu04BugaWSDTO.
     * 
     * @return taxYmd
     */
    public java.lang.String getTaxYmd() {
        return taxYmd;
    }


    /**
     * Sets the taxYmd value for this Bu04BugaWSDTO.
     * 
     * @param taxYmd
     */
    public void setTaxYmd(java.lang.String taxYmd) {
        this.taxYmd = taxYmd;
    }


    /**
     * Gets the vatAmt value for this Bu04BugaWSDTO.
     * 
     * @return vatAmt
     */
    public long getVatAmt() {
        return vatAmt;
    }


    /**
     * Sets the vatAmt value for this Bu04BugaWSDTO.
     * 
     * @param vatAmt
     */
    public void setVatAmt(long vatAmt) {
        this.vatAmt = vatAmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bu04BugaWSDTO)) return false;
        Bu04BugaWSDTO other = (Bu04BugaWSDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bigo==null && other.getBigo()==null) || 
             (this.bigo!=null &&
              this.bigo.equals(other.getBigo()))) &&
            ((this.bookNo==null && other.getBookNo()==null) || 
             (this.bookNo!=null &&
              this.bookNo.equals(other.getBookNo()))) &&
            this.bunhalCnt == other.getBunhalCnt() &&
            ((this.buseoCd==null && other.getBuseoCd()==null) || 
             (this.buseoCd!=null &&
              this.buseoCd.equals(other.getBuseoCd()))) &&
            ((this.etc1==null && other.getEtc1()==null) || 
             (this.etc1!=null &&
              this.etc1.equals(other.getEtc1()))) &&
            ((this.gasanAmtSkipGubun==null && other.getGasanAmtSkipGubun()==null) || 
             (this.gasanAmtSkipGubun!=null &&
              this.gasanAmtSkipGubun.equals(other.getGasanAmtSkipGubun()))) &&
            ((this.gasanRateGubun==null && other.getGasanRateGubun()==null) || 
             (this.gasanRateGubun!=null &&
              this.gasanRateGubun.equals(other.getGasanRateGubun()))) &&
            this.gigum == other.getGigum() &&
            this.gigumGasanAmt == other.getGigumGasanAmt() &&
            this.gigumIja == other.getGigumIja() &&
            this.gukse == other.getGukse() &&
            this.gukseGasanAmt == other.getGukseGasanAmt() &&
            this.gukseIja == other.getGukseIja() &&
            this.guse == other.getGuse() &&
            this.guseGasanAmt == other.getGuseGasanAmt() &&
            this.guseIja == other.getGuseIja() &&
            ((this.hangmok1==null && other.getHangmok1()==null) || 
             (this.hangmok1!=null &&
              this.hangmok1.equals(other.getHangmok1()))) &&
            ((this.hangmok2==null && other.getHangmok2()==null) || 
             (this.hangmok2!=null &&
              this.hangmok2.equals(other.getHangmok2()))) &&
            ((this.hangmok3==null && other.getHangmok3()==null) || 
             (this.hangmok3!=null &&
              this.hangmok3.equals(other.getHangmok3()))) &&
            ((this.hangmok4==null && other.getHangmok4()==null) || 
             (this.hangmok4!=null &&
              this.hangmok4.equals(other.getHangmok4()))) &&
            ((this.hangmok5==null && other.getHangmok5()==null) || 
             (this.hangmok5!=null &&
              this.hangmok5.equals(other.getHangmok5()))) &&
            ((this.hangmok6==null && other.getHangmok6()==null) || 
             (this.hangmok6!=null &&
              this.hangmok6.equals(other.getHangmok6()))) &&
            ((this.hdongCd==null && other.getHdongCd()==null) || 
             (this.hdongCd!=null &&
              this.hdongCd.equals(other.getHdongCd()))) &&
            ((this.lastWorkDate==null && other.getLastWorkDate()==null) || 
             (this.lastWorkDate!=null &&
              this.lastWorkDate.equals(other.getLastWorkDate()))) &&
            ((this.lastWorkId==null && other.getLastWorkId()==null) || 
             (this.lastWorkId!=null &&
              this.lastWorkId.equals(other.getLastWorkId()))) &&
            ((this.mulAptNm==null && other.getMulAptNm()==null) || 
             (this.mulAptNm!=null &&
              this.mulAptNm.equals(other.getMulAptNm()))) &&
            ((this.mulBan==null && other.getMulBan()==null) || 
             (this.mulBan!=null &&
              this.mulBan.equals(other.getMulBan()))) &&
            ((this.mulBdongriCd==null && other.getMulBdongriCd()==null) || 
             (this.mulBdongriCd!=null &&
              this.mulBdongriCd.equals(other.getMulBdongriCd()))) &&
            ((this.mulBon==null && other.getMulBon()==null) || 
             (this.mulBon!=null &&
              this.mulBon.equals(other.getMulBon()))) &&
            ((this.mulBu==null && other.getMulBu()==null) || 
             (this.mulBu!=null &&
              this.mulBu.equals(other.getMulBu()))) &&
            ((this.mulDong==null && other.getMulDong()==null) || 
             (this.mulDong!=null &&
              this.mulDong.equals(other.getMulDong()))) &&
            ((this.mulDtlAddr==null && other.getMulDtlAddr()==null) || 
             (this.mulDtlAddr!=null &&
              this.mulDtlAddr.equals(other.getMulDtlAddr()))) &&
            ((this.mulGubun==null && other.getMulGubun()==null) || 
             (this.mulGubun!=null &&
              this.mulGubun.equals(other.getMulGubun()))) &&
            ((this.mulHosu==null && other.getMulHosu()==null) || 
             (this.mulHosu!=null &&
              this.mulHosu.equals(other.getMulHosu()))) &&
            ((this.mulNm==null && other.getMulNm()==null) || 
             (this.mulNm!=null &&
              this.mulNm.equals(other.getMulNm()))) &&
            ((this.mulOcrSiguCd==null && other.getMulOcrSiguCd()==null) || 
             (this.mulOcrSiguCd!=null &&
              this.mulOcrSiguCd.equals(other.getMulOcrSiguCd()))) &&
            ((this.mulSpcCd==null && other.getMulSpcCd()==null) || 
             (this.mulSpcCd!=null &&
              this.mulSpcCd.equals(other.getMulSpcCd()))) &&
            ((this.mulTong==null && other.getMulTong()==null) || 
             (this.mulTong!=null &&
              this.mulTong.equals(other.getMulTong()))) &&
            ((this.mulZipAddr==null && other.getMulZipAddr()==null) || 
             (this.mulZipAddr!=null &&
              this.mulZipAddr.equals(other.getMulZipAddr()))) &&
            ((this.mulZipCd==null && other.getMulZipCd()==null) || 
             (this.mulZipCd!=null &&
              this.mulZipCd.equals(other.getMulZipCd()))) &&
            ((this.napDoroAddr==null && other.getNapDoroAddr()==null) || 
             (this.napDoroAddr!=null &&
              this.napDoroAddr.equals(other.getNapDoroAddr()))) &&
            ((this.napDtlAddr==null && other.getNapDtlAddr()==null) || 
             (this.napDtlAddr!=null &&
              this.napDtlAddr.equals(other.getNapDtlAddr()))) &&
            ((this.napEmail==null && other.getNapEmail()==null) || 
             (this.napEmail!=null &&
              this.napEmail.equals(other.getNapEmail()))) &&
            ((this.napGubun==null && other.getNapGubun()==null) || 
             (this.napGubun!=null &&
              this.napGubun.equals(other.getNapGubun()))) &&
            ((this.napId==null && other.getNapId()==null) || 
             (this.napId!=null &&
              this.napId.equals(other.getNapId()))) &&
            ((this.napMobilNo==null && other.getNapMobilNo()==null) || 
             (this.napMobilNo!=null &&
              this.napMobilNo.equals(other.getNapMobilNo()))) &&
            ((this.napNm==null && other.getNapNm()==null) || 
             (this.napNm!=null &&
              this.napNm.equals(other.getNapNm()))) &&
            ((this.napTelNo==null && other.getNapTelNo()==null) || 
             (this.napTelNo!=null &&
              this.napTelNo.equals(other.getNapTelNo()))) &&
            ((this.napZipAddr==null && other.getNapZipAddr()==null) || 
             (this.napZipAddr!=null &&
              this.napZipAddr.equals(other.getNapZipAddr()))) &&
            ((this.napZipCd==null && other.getNapZipCd()==null) || 
             (this.napZipCd!=null &&
              this.napZipCd.equals(other.getNapZipCd()))) &&
            ((this.napbuYmd==null && other.getNapbuYmd()==null) || 
             (this.napbuYmd!=null &&
              this.napbuYmd.equals(other.getNapbuYmd()))) &&
            ((this.napgiAftYmd==null && other.getNapgiAftYmd()==null) || 
             (this.napgiAftYmd!=null &&
              this.napgiAftYmd.equals(other.getNapgiAftYmd()))) &&
            ((this.napgiYmd==null && other.getNapgiYmd()==null) || 
             (this.napgiYmd!=null &&
              this.napgiYmd.equals(other.getNapgiYmd()))) &&
            ((this.ocrBuseoCd==null && other.getOcrBuseoCd()==null) || 
             (this.ocrBuseoCd!=null &&
              this.ocrBuseoCd.equals(other.getOcrBuseoCd()))) &&
            ((this.ocrSiguCd==null && other.getOcrSiguCd()==null) || 
             (this.ocrSiguCd!=null &&
              this.ocrSiguCd.equals(other.getOcrSiguCd()))) &&
            ((this.resideStatus==null && other.getResideStatus()==null) || 
             (this.resideStatus!=null &&
              this.resideStatus.equals(other.getResideStatus()))) &&
            ((this.rowStatus==null && other.getRowStatus()==null) || 
             (this.rowStatus!=null &&
              this.rowStatus.equals(other.getRowStatus()))) &&
            ((this.semokCd==null && other.getSemokCd()==null) || 
             (this.semokCd!=null &&
              this.semokCd.equals(other.getSemokCd()))) &&
            ((this.sendYmd==null && other.getSendYmd()==null) || 
             (this.sendYmd!=null &&
              this.sendYmd.equals(other.getSendYmd()))) &&
            ((this.sidoCd==null && other.getSidoCd()==null) || 
             (this.sidoCd!=null &&
              this.sidoCd.equals(other.getSidoCd()))) &&
            ((this.siguCd==null && other.getSiguCd()==null) || 
             (this.siguCd!=null &&
              this.siguCd.equals(other.getSiguCd()))) &&
            this.sise == other.getSise() &&
            this.siseGasanAmt == other.getSiseGasanAmt() &&
            this.siseIja == other.getSiseIja() &&
            ((this.sokwanBuseoCd==null && other.getSokwanBuseoCd()==null) || 
             (this.sokwanBuseoCd!=null &&
              this.sokwanBuseoCd.equals(other.getSokwanBuseoCd()))) &&
            ((this.sokwanMgrNm==null && other.getSokwanMgrNm()==null) || 
             (this.sokwanMgrNm!=null &&
              this.sokwanMgrNm.equals(other.getSokwanMgrNm()))) &&
            ((this.sokwanTelNo==null && other.getSokwanTelNo()==null) || 
             (this.sokwanTelNo!=null &&
              this.sokwanTelNo.equals(other.getSokwanTelNo()))) &&
            this.specialRate == other.getSpecialRate() &&
            this.specialRateApplyCnt == other.getSpecialRateApplyCnt() &&
            ((this.specialRateApplySayu==null && other.getSpecialRateApplySayu()==null) || 
             (this.specialRateApplySayu!=null &&
              this.specialRateApplySayu.equals(other.getSpecialRateApplySayu()))) &&
            this.specialRateHighRate == other.getSpecialRateHighRate() &&
            ((this.suBuseoCd==null && other.getSuBuseoCd()==null) || 
             (this.suBuseoCd!=null &&
              this.suBuseoCd.equals(other.getSuBuseoCd()))) &&
            ((this.sysGubun==null && other.getSysGubun()==null) || 
             (this.sysGubun!=null &&
              this.sysGubun.equals(other.getSysGubun()))) &&
            this.taxAmt == other.getTaxAmt() &&
            ((this.taxGubun==null && other.getTaxGubun()==null) || 
             (this.taxGubun!=null &&
              this.taxGubun.equals(other.getTaxGubun()))) &&
            ((this.taxNo==null && other.getTaxNo()==null) || 
             (this.taxNo!=null &&
              this.taxNo.equals(other.getTaxNo()))) &&
            ((this.taxYm==null && other.getTaxYm()==null) || 
             (this.taxYm!=null &&
              this.taxYm.equals(other.getTaxYm()))) &&
            ((this.taxYmd==null && other.getTaxYmd()==null) || 
             (this.taxYmd!=null &&
              this.taxYmd.equals(other.getTaxYmd()))) &&
            this.vatAmt == other.getVatAmt();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBigo() != null) {
            _hashCode += getBigo().hashCode();
        }
        if (getBookNo() != null) {
            _hashCode += getBookNo().hashCode();
        }
        _hashCode += new Long(getBunhalCnt()).hashCode();
        if (getBuseoCd() != null) {
            _hashCode += getBuseoCd().hashCode();
        }
        if (getEtc1() != null) {
            _hashCode += getEtc1().hashCode();
        }
        if (getGasanAmtSkipGubun() != null) {
            _hashCode += getGasanAmtSkipGubun().hashCode();
        }
        if (getGasanRateGubun() != null) {
            _hashCode += getGasanRateGubun().hashCode();
        }
        _hashCode += new Long(getGigum()).hashCode();
        _hashCode += new Long(getGigumGasanAmt()).hashCode();
        _hashCode += new Long(getGigumIja()).hashCode();
        _hashCode += new Long(getGukse()).hashCode();
        _hashCode += new Long(getGukseGasanAmt()).hashCode();
        _hashCode += new Long(getGukseIja()).hashCode();
        _hashCode += new Long(getGuse()).hashCode();
        _hashCode += new Long(getGuseGasanAmt()).hashCode();
        _hashCode += new Long(getGuseIja()).hashCode();
        if (getHangmok1() != null) {
            _hashCode += getHangmok1().hashCode();
        }
        if (getHangmok2() != null) {
            _hashCode += getHangmok2().hashCode();
        }
        if (getHangmok3() != null) {
            _hashCode += getHangmok3().hashCode();
        }
        if (getHangmok4() != null) {
            _hashCode += getHangmok4().hashCode();
        }
        if (getHangmok5() != null) {
            _hashCode += getHangmok5().hashCode();
        }
        if (getHangmok6() != null) {
            _hashCode += getHangmok6().hashCode();
        }
        if (getHdongCd() != null) {
            _hashCode += getHdongCd().hashCode();
        }
        if (getLastWorkDate() != null) {
            _hashCode += getLastWorkDate().hashCode();
        }
        if (getLastWorkId() != null) {
            _hashCode += getLastWorkId().hashCode();
        }
        if (getMulAptNm() != null) {
            _hashCode += getMulAptNm().hashCode();
        }
        if (getMulBan() != null) {
            _hashCode += getMulBan().hashCode();
        }
        if (getMulBdongriCd() != null) {
            _hashCode += getMulBdongriCd().hashCode();
        }
        if (getMulBon() != null) {
            _hashCode += getMulBon().hashCode();
        }
        if (getMulBu() != null) {
            _hashCode += getMulBu().hashCode();
        }
        if (getMulDong() != null) {
            _hashCode += getMulDong().hashCode();
        }
        if (getMulDtlAddr() != null) {
            _hashCode += getMulDtlAddr().hashCode();
        }
        if (getMulGubun() != null) {
            _hashCode += getMulGubun().hashCode();
        }
        if (getMulHosu() != null) {
            _hashCode += getMulHosu().hashCode();
        }
        if (getMulNm() != null) {
            _hashCode += getMulNm().hashCode();
        }
        if (getMulOcrSiguCd() != null) {
            _hashCode += getMulOcrSiguCd().hashCode();
        }
        if (getMulSpcCd() != null) {
            _hashCode += getMulSpcCd().hashCode();
        }
        if (getMulTong() != null) {
            _hashCode += getMulTong().hashCode();
        }
        if (getMulZipAddr() != null) {
            _hashCode += getMulZipAddr().hashCode();
        }
        if (getMulZipCd() != null) {
            _hashCode += getMulZipCd().hashCode();
        }
        
        if (getNapBldBon() != null) {
            _hashCode += getNapBldBon().hashCode();
        }
        
        if (getNapBldBu() != null) {
            _hashCode += getNapBldBu().hashCode();
        }
        
        if (getNapDdtlAddr() != null) {
            _hashCode += getNapDdtlAddr().hashCode();
        }
        
        if (getNapDoroAddr() != null) {
            _hashCode += getNapDoroAddr().hashCode();
        }
        
        if (getNapDrefAddr() != null) {
            _hashCode += getNapDrefAddr().hashCode();
        }
        
        if (getNapDtlAddr() != null) {
            _hashCode += getNapDtlAddr().hashCode();
        }
        
        if (getNapDzipAddr() != null) {
            _hashCode += getNapDzipAddr().hashCode();
        }
        
        if (getNapDzipCd() != null) {
            _hashCode += getNapDzipCd().hashCode();
        }
        
        if (getNapEmail() != null) {
            _hashCode += getNapEmail().hashCode();
        }
        if (getNapGubun() != null) {
            _hashCode += getNapGubun().hashCode();
        }
        if (getNapId() != null) {
            _hashCode += getNapId().hashCode();
        }
        if (getNapMobilNo() != null) {
            _hashCode += getNapMobilNo().hashCode();
        }
        if (getNapNm() != null) {
            _hashCode += getNapNm().hashCode();
        }
        if (getNapTelNo() != null) {
            _hashCode += getNapTelNo().hashCode();
        }
        
        if (getNapUndYn() != null) {
            _hashCode += getNapUndYn().hashCode();
        }
        
        if (getNapZipAddr() != null) {
            _hashCode += getNapZipAddr().hashCode();
        }
        if (getNapZipCd() != null) {
            _hashCode += getNapZipCd().hashCode();
        }
        if (getNapbuYmd() != null) {
            _hashCode += getNapbuYmd().hashCode();
        }
        if (getNapgiAftYmd() != null) {
            _hashCode += getNapgiAftYmd().hashCode();
        }
        if (getNapgiYmd() != null) {
            _hashCode += getNapgiYmd().hashCode();
        }
        if (getOcrBuseoCd() != null) {
            _hashCode += getOcrBuseoCd().hashCode();
        }
        if (getOcrSiguCd() != null) {
            _hashCode += getOcrSiguCd().hashCode();
        }
        if (getResideStatus() != null) {
            _hashCode += getResideStatus().hashCode();
        }
        if (getRowStatus() != null) {
            _hashCode += getRowStatus().hashCode();
        }
        if (getSemokCd() != null) {
            _hashCode += getSemokCd().hashCode();
        }
        if (getSendYmd() != null) {
            _hashCode += getSendYmd().hashCode();
        }
        if (getSidoCd() != null) {
            _hashCode += getSidoCd().hashCode();
        }
        if (getSiguCd() != null) {
            _hashCode += getSiguCd().hashCode();
        }
        _hashCode += new Long(getSise()).hashCode();
        _hashCode += new Long(getSiseGasanAmt()).hashCode();
        _hashCode += new Long(getSiseIja()).hashCode();
        if (getSokwanBuseoCd() != null) {
            _hashCode += getSokwanBuseoCd().hashCode();
        }
        if (getSokwanMgrNm() != null) {
            _hashCode += getSokwanMgrNm().hashCode();
        }
        if (getSokwanTelNo() != null) {
            _hashCode += getSokwanTelNo().hashCode();
        }
        _hashCode += new Double(getSpecialRate()).hashCode();
        _hashCode += new Long(getSpecialRateApplyCnt()).hashCode();
        if (getSpecialRateApplySayu() != null) {
            _hashCode += getSpecialRateApplySayu().hashCode();
        }
        _hashCode += new Double(getSpecialRateHighRate()).hashCode();
        if (getSuBuseoCd() != null) {
            _hashCode += getSuBuseoCd().hashCode();
        }
        if (getSysGubun() != null) {
            _hashCode += getSysGubun().hashCode();
        }
        _hashCode += new Long(getTaxAmt()).hashCode();
        if (getTaxGubun() != null) {
            _hashCode += getTaxGubun().hashCode();
        }
        if (getTaxNo() != null) {
            _hashCode += getTaxNo().hashCode();
        }
        if (getTaxYm() != null) {
            _hashCode += getTaxYm().hashCode();
        }
        if (getTaxYmd() != null) {
            _hashCode += getTaxYmd().hashCode();
        }
        _hashCode += new Long(getVatAmt()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bu04BugaWSDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:BugaWebService", "Bu04BugaWSDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bigo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "bigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "bookNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bunhalCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "bunhalCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buseoCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "buseoCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etc1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "etc1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gasanAmtSkipGubun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gasanAmtSkipGubun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gasanRateGubun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gasanRateGubun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gigum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gigum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gigumGasanAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gigumGasanAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gigumIja");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gigumIja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gukse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gukse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gukseGasanAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gukseGasanAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gukseIja");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "gukseIja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "guse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guseGasanAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "guseGasanAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guseIja");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "guseIja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hangmok1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "hangmok1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hangmok2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "hangmok2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hangmok3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "hangmok3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hangmok4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "hangmok4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hangmok5");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "hangmok5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hangmok6");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "hangmok6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hdongCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "hdongCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastWorkDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "lastWorkDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastWorkId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "lastWorkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulAptNm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulAptNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulBan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulBan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulBdongriCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulBdongriCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulBon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulBon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulBu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulBu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulDong");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulDong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulDtlAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulDtlAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulGubun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulGubun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulHosu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulHosu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulNm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulOcrSiguCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulOcrSiguCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulSpcCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulSpcCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulTong");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulTong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulZipAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulZipAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mulZipCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "mulZipCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napBldBon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napBldBon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napBldBu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napBldBu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napDdtlAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napDdtlAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napDoroAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napDoroAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napDoroCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napDoroCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napDrefAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napDrefAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napDtlAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napDtlAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napDzipAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napDzipAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napDzipCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napDzipCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napGubun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napGubun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napMobilNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napMobilNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napNm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napTelNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napTelNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napUndYn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napUndYn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napZipAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napZipAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napZipCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napZipCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napbuYmd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napbuYmd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napgiAftYmd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napgiAftYmd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("napgiYmd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "napgiYmd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocrBuseoCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "ocrBuseoCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocrSiguCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "ocrSiguCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resideStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "resideStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "rowStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semokCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "semokCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendYmd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "sendYmd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sidoCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "sidoCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siguCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "siguCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sise");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "sise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siseGasanAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "siseGasanAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siseIja");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "siseIja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sokwanBuseoCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "sokwanBuseoCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sokwanMgrNm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "sokwanMgrNm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sokwanTelNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "sokwanTelNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "specialRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialRateApplyCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "specialRateApplyCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialRateApplySayu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "specialRateApplySayu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialRateHighRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "specialRateHighRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suBuseoCd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "suBuseoCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysGubun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "sysGubun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "taxAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxGubun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "taxGubun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "taxNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxYm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "taxYm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxYmd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "taxYmd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:BugaWebService", "vatAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}