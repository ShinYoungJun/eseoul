
package main.java.gapan.saewe.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.common.util.BeanUtil;
import main.java.common.util.catUtil.Util;
import main.java.gapan.saewe.model.AppealBean;
import main.java.gapan.saewe.model.TaxationBean;
import main.java.gapan.saewe.model.PlaceBean;
import main.java.gapan.saewe.model.CalculationBean;
import main.java.gapan.saewe.model.SaeweBean;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class SaeweMapDao {
	private	Util				util			= new Util();
	
    protected	class	Search	extends	MappingSqlQuery
    {
        protected 	Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.Search"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
         	declareParameter(new SqlParameter(Types.VARCHAR));
         	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          //********** BEGIN_KANG_20120404
          	declareParameter(new SqlParameter(Types.VARCHAR));          	
          //********** END_KANG_20120404

          	
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SaeweBean	bean	= new SaeweBean();
        	BeanUtil.mappingBean(bean, rs);
        	/*
        	Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
        	Bean.setUSE_SECTION(rs.getString("USE_SECTION"));
        	Bean.setTYPE(rs.getString("TYPE"));
        	Bean.setSECTION(rs.getString("SECTION"));
        	Bean.setNAME(rs.getString("OWNER_NAME"));
        	Bean.setREQ_DATE(rs.getString("UP_DATE"));
        	Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
        	Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
        	Bean.setTAX_YN(rs.getString("TAX_YN"));
        	Bean.setCAL_YN(rs.getString("CAL_YN"));
        	Bean.setRN(rs.getString("RN"));
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setSUM_YEAR(rs.getString("YEAR"));
        	Bean.setTAX_NO(rs.getString("TAX_NO"));
        	Bean.setFROMDATE(rs.getString("FROMDATE"));
        	Bean.setTODATE(rs.getString("TODATE"));
        	Bean.setGP_TYP(rs.getString("GP_TYP"));
        	
        	
        	//새로추가
        	Bean.setADDR(rs.getString("ADDR"));
        	Bean.setAREA_SIZE(rs.getString("AREA_SIZE"));
        	Bean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
        	Bean.setSUM(rs.getString("SUM"));
        	Bean.setFT_TYP(rs.getString("FT_TYP"));
        	Bean.setCAL_NAME(rs.getString("CAL_NAME"));
        	Bean.setTAX_SET(rs.getString("TAX_SET"));
        	
        	Bean.setSI(rs.getString("SI"));
        	Bean.setGUN(rs.getString("GUN"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
        	//********** BEGIN_KANG_20120404
        	Bean.setSUNAP_YN(rs.getString("SUNAP_YN"));
        	Bean.setSUNAP_DATE(rs.getString("SUNAP_DATE"));
        	//********** END_KANG_20120404
        	*/
        	return	bean;
        }
    }

    protected	class	Search_Ilgwal	extends	MappingSqlQuery
    {
        protected 	Search_Ilgwal(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.Search_Ilgwal"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
       
	     }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {	
        	TaxationBean	Bean	= new TaxationBean();

        	Bean.setSIGU_CD(rs.getString("SIGU_CD"));						//시구코드 
        	Bean.setTAX_CD(rs.getString("TAX_CD"));							//세목코드
        	Bean.setTAX_YM(rs.getString("TAX_YM"));							//과세년월
        	Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));					//과세구분
        	Bean.setTAX_SET(rs.getString("TAX_SET"));						//세입구분
        	Bean.setDEPT_CD(rs.getString("DEPT_CD"));						//부서코드
			Bean.setTAX_NO(rs.getString("TAX_NO"));							//과세번호
        	Bean.setSIDO(rs.getString("SIDO"));								//시도코드
        	Bean.setTAXPAYER_ID(rs.getString("OWNER_SSN"));				//납세자ID
        	Bean.setTAXPAYER_NM(rs.getString("OWNER_NAME"));						//납세자명
        	Bean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));				//납세자구분
        	Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));					//수납부서코드
			Bean.setTAX_DATE(rs.getString("TAX_DATE"));						//과세일자
			Bean.setINDATE(rs.getString("INDATE"));							//납기일자
			Bean.setOVERDATE(rs.getString("OVERDATE"));						//납기후일자
//			Bean.setNAPBU_YMD(rs.getString("TAX_DATE"));					//납부일자
			Bean.setBONSE(Integer.toString(rs.getInt("BONSE")));			//과세금액
			Bean.setSISE(Integer.toString(rs.getInt("SISE")));				//시세
			Bean.setGUSE(Integer.toString(rs.getInt("GUSE")));				//구세
			Bean.setGUKSE(Integer.toString(rs.getInt("GUKSE")));			//국세
			Bean.setGIGUM(Integer.toString(rs.getInt("GIGUM")));			//기금
			Bean.setHP(rs.getString("OWNER_HP"));									//납세자휴대폰번호
			Bean.setTEL(rs.getString("OWNER_TEL"));								//납세자전화번호
//			Bean.setEMAIL(rs.getString("EMAIL"));							//납세자EMAIL
			Bean.setPOST(rs.getString("OWNER_POST"));								//납세자우편번호
			Bean.setADDR1(rs.getString("OWNER_ADDR1"));							//납세자우편번호주소
			Bean.setADDR2(rs.getString("OWNER_ADDR2"));							//납세자상세주소
			Bean.setROAD_ADD(rs.getString("ROAD_INFO"));					//납세자도로명주소
			Bean.setLIVE(rs.getString("LIVE"));								//거주상태
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//물건구분
//			Bean.setBD_NM(rs.getString("BD_NM"));							//물건명
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//물건OCR시구코드
			Bean.setBJ_CD(rs.getString("BJ_CD"));							//물건법정동리코드
			Bean.setSPC_CD(rs.getString("SPC_CD"));							//물건특수지코드
			Bean.setBONBUN(rs.getString("BONBUN"));							//물건본번
			Bean.setBUBUN(rs.getString("BUBUN"));							//물건부번
//			Bean.setTONG(rs.getString("TONG"));								//물건통
//			Bean.setBAN(rs.getString("BAN"));								//물건반
//			Bean.setMUL_APT_NM(rs.getString("BD_NM"));						//물건아파트명
//			Bean.setBD_DONG(rs.getString("BD_DONG"));						//물건동
//			Bean.setBD_HO(rs.getString("BD_HO"));							//물건호
//			Bean.setMUL_POST(rs.getString("MUL_POST"));						//물건우편번호
			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR"));					//물건우편번호주소
//			Bean.setNEAR_ADDR2(rs.getString("WITH_ADDR2"));					//물건상세주소
			Bean.setHJ_CD(rs.getString("HJ_CD"));							//행정동코드
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//항목1(조정산출식)
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//항목2(점용목적)
			Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//항목3(지목)
//			Bean.setUSE_DATE(rs.getString("MUL_FROMDATE")+"~"+rs.getString("MUL_TODATE"));//항목4(사용기간)
			Bean.setAREA(rs.getString("AREA"));							    //항목5(점용면적)
			Bean.setADMIN_NO(rs.getString("GAPAN_NO"));						//항목6(관리번호)
			Bean.setADD_SET(rs.getString("ADD_SET"));                       //가산율구분
			Bean.setRATE(Integer.toString(rs.getInt("RATE")));			    //특별이율 		
			Bean.setRATE_CAUSE(rs.getString("RATE_CAUSE"));					//특별이율적용사유
			Bean.setNOTES(rs.getString("NOTES"));						    //비고
			Bean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));				//OCR시구코드
			Bean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));				//OCR부서코드
			Bean.setVAT(Integer.toString(rs.getInt("VAT")));				//부가가시체금액
			Bean.setADD_YN(rs.getString("ADD_YN"));							//가산금면제여부	
			
			Bean.setLIMIT_SUM(Integer.toString(rs.getInt("LIMIT_SUM")));
			Bean.setLIMIT_CNT(Integer.toString(rs.getInt("LIMIT_CNT")));
			Bean.setINTAX(Integer.toString(rs.getInt("INTAX")));
			Bean.setOVERTAX(Integer.toString(rs.getInt("OVERTAX")));
			Bean.setFORM1(rs.getString("FORM1"));
			Bean.setFORM2(rs.getString("FORM2"));
			Bean.setGU_CODE(rs.getString("SIGUNGU"));
//			Bean.setBUNNAP_NO(rs.getString("BUNNAP_NO"));
			Bean.setYEAR(rs.getString("YEAR"));
//			Bean.setSUSI_NO(rs.getString("SUSI_NO"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			
			Bean.setSEQ(rs.getString("SEQ"));
			
			Bean.setFROMDATE(util.Date_Paste(rs.getString("FROMDATE")));	//항목4-산출기간으로 수정
			Bean.setTODATE(util.Date_Paste(rs.getString("TODATE")));		//항목4-산출기간으로 수정
        	
        	return	Bean;
        }
    } 
    
    protected	class	SanchulSearch	extends	MappingSqlQuery
    {
        protected 	SanchulSearch(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.SanchulSearch"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CalculationBean	Bean	= new CalculationBean();

        	Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
        	Bean.setYEAR(rs.getString("YEAR"));
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setPRICE(rs.getString("PRICE"));
        	Bean.setAREA_AFTER(rs.getString("AREA"));
        	Bean.setRATE(String.valueOf(rs.getFloat("RATE")));
        	Bean.setSUM_ADJUST(rs.getString("SUM"));			//감면적용 점용료
        	Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
        	Bean.setTODATE(NullCheck(rs.getString("TODATE")));
        	
        	return	Bean;
        }
    }
    
    protected	class	SanchulInfo_View	extends	MappingSqlQuery
    {
        protected 	SanchulInfo_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.SanchulInfo_View"));
          	
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CalculationBean	Bean	= new CalculationBean();

        	Bean.setADMIN_NO(NullCheck(rs.getString("GAPAN_NO")));
        	Bean.setYEAR(NullCheck(rs.getString("YEAR")));
        	Bean.setSEQ(NullCheck(rs.getString("SEQ")));
        	Bean.setPRICE(NullCheck(rs.getString("PRICE")));
        	//Bean.setAREA_AFTER(NullCheck(rs.getString("AREA_AFTER")));
        	Bean.setAREA_AFTER(NullCheck(rs.getString("AREA")));
        	Bean.setRATE(String.valueOf(rs.getFloat("RATE")));
        	//Bean.setSUM_LASTYEAR(NullCheck(rs.getString("SUM_LASTYEAR")));
        	//Bean.setSUM_YEAR(NullCheck(rs.getString("SUM_YEAR")));
        	Bean.setSUM_ADJUST(NullCheck(rs.getString("SUM")));
        	Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
        	Bean.setTODATE(NullCheck(rs.getString("TODATE")));
        	Bean.setFORM_ADJUST(NullCheck(rs.getString("FORM_ADJUST")));
        	//Bean.setFORM(NullCheck(rs.getString("FORM")));
        	//Bean.setADJUSTMENT(String.valueOf(rs.getFloat("ADJUSTMENT")));
             	
        //	System.out.println(rs.getFloat("RATE"));
        //	System.out.println(String.valueOf(rs.getFloat("RATE")));
        
        	return	Bean;
        }
    }
    
    //	점용인 정보
    protected	class	Jumin_View	extends	MappingSqlQuery
    {
        protected 	Jumin_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.Jumin_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();
        	
        	Bean.setADMIN_NO(rs.getString("GAPAN_NO"));
  			Bean.setNAME(rs.getString("OWNER_NAME"));
			Bean.setSSN(rs.getString("OWNER_SSN"));
//			Bean.setBIZSSN(rs.getString("BIZSSN"));
//			Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
//			Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
			Bean.setPOST(rs.getString("OWNER_POST"));
			Bean.setADDR1(rs.getString("OWNER_ADDR1"));
			Bean.setADDR2(rs.getString("OWNER_ADDR2"));
//			Bean.setEMAIL(rs.getString("EMAIL"));
			Bean.setTEL(rs.getString("OWNER_TEL"));
			Bean.setHP(rs.getString("OWNER_HP"));
			Bean.setTOPOST(rs.getString("OWNER_HP"));
			Bean.setTOADDR1(rs.getString("OWNER_TOADDR1"));
			Bean.setTOADDR2(rs.getString("OWNER_TOADDR2"));
//			Bean.setTOPOST_NM(rs.getString("TONM"));
//			Bean.setTOTEL(rs.getString("TOTEL"));
//			Bean.setTOHP(rs.getString("TOHP"));	
//			Bean.setTOEMAIL(rs.getString("TOMAIL"));
			
        	return	Bean;
        }
    }
    
    
    //	점용지 정보
    protected	class	Jumji_View	extends	MappingSqlQuery
    {
        protected 	Jumji_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.Jumji_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceBean	Bean	= new PlaceBean();

			Bean.setADMIN_NO(rs.getString("GAPAN_NO"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setSAN_CK(rs.getString("SPC_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
//			Bean.setTONG(rs.getString("TONG"));
//			Bean.setBAN(rs.getString("BAN"));
//			Bean.setMUL_POST(rs.getString("MUL_POST"));
//			Bean.setBD_NM(rs.getString("BD_NM"));
//			Bean.setBD_DONG(rs.getString("BD_DONG"));
//			Bean.setBD_HO(rs.getString("BD_HO"));
			Bean.setROAD_ADD(rs.getString("ROAD_INFO"));
//			Bean.setPARKING_NUM(rs.getString("PARKING_NUM"));
//			Bean.setRIVER_NM(rs.getString("RIVER_NM"));
//			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
//			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
//			Bean.setWITH_POST(rs.getString("WITH_POST"));
//			Bean.setWORK_FROMDATE(rs.getString("WORK_FROMDATE"));
//			Bean.setWORK_TODATE(rs.getString("WORK_TODATE"));
			Bean.setWITH_ADDR1(rs.getString("WITH_ADDR"));
//			Bean.setWITH_ADDR2(rs.getString("WITH_ADDR2"));
//			Bean.setEXE_INFO(rs.getString("EXE_INFO"));
//			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
//			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
			
        	return	Bean;
        }
    }
    
    
    //	부과정보 세부보기
    protected	class	Bugwa_View	extends	MappingSqlQuery
    {
        protected 	Bugwa_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.Bugwa_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	TaxationBean	Bean	= new TaxationBean();
        	
        	Bean.setSIGU_CD(rs.getString("SIGU_CD"));						//시구코드 
        	Bean.setTAX_CD(rs.getString("TAX_CD"));							//세목코드
        	Bean.setTAX_YM(rs.getString("TAX_YM"));							//과세년월
        	Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));					//과세구분
        	Bean.setTAX_SET(rs.getString("TAX_SET"));						//세입구분
        	Bean.setDEPT_CD(rs.getString("DEPT_CD"));						//부서코드
			Bean.setTAX_NO(rs.getString("TAX_NO"));							//과세번호
        	Bean.setSIDO(rs.getString("SIDO"));								//시도코드
        	Bean.setTAXPAYER_ID(rs.getString("OWNER_SSN"));				//납세자ID
        	Bean.setTAXPAYER_NM(rs.getString("OWNER_NAME"));				//납세자명
        	Bean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));				//납세자구분
        	Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));					//수납부서코드
			Bean.setTAX_DATE(rs.getString("TAX_DATE"));						//과세일자
			Bean.setINDATE(rs.getString("INDATE"));							//납기일자
			Bean.setOVERDATE(rs.getString("OVERDATE"));						//납기후일자
//			Bean.setNAPBU_YMD(rs.getString("TAX_DATE"));					//납부일자
			Bean.setBONSE(Integer.toString(rs.getInt("BONSE")));			//과세금액
			Bean.setSISE(Integer.toString(rs.getInt("SISE")));				//시세
			Bean.setGUSE(Integer.toString(rs.getInt("GUSE")));				//구세
			Bean.setGUKSE(Integer.toString(rs.getInt("GUKSE")));			//국세
			Bean.setGIGUM(Integer.toString(rs.getInt("GIGUM")));			//기금
			Bean.setHP(rs.getString("OWNER_HP"));							//납세자휴대폰번호
			Bean.setTEL(rs.getString("OWNER_TEL"));							//납세자전화번호
//			Bean.setEMAIL(rs.getString("EMAIL"));							//납세자EMAIL
			Bean.setPOST(rs.getString("OWNER_POST"));						//납세자우편번호
			Bean.setADDR1(rs.getString("OWNER_ADDR1"));						//납세자우편번호주소
			if(rs.getString("OWNER_SAN") == null|| !rs.getString("OWNER_SAN").equals("1")){
				Bean.setADDR2(rs.getString("OWNER_JIBUN"));						//납세자상세주소
			}else{
				Bean.setADDR2("산 " + rs.getString("OWNER_JIBUN"));		
			}
			
			if(rs.getString("OWNER_ADDR2") == null || rs.getString("OWNER_ADDR2").equals("") || rs.getString("OWNER_ADDR2").equals("null")){
			}else{
				Bean.setADDR2(Bean.getADDR2() + " " + rs.getString("OWNER_ADDR2"));	
			}
			
			Bean.setROAD_ADD(rs.getString("ROAD_INFO"));					//납세자도로명주소
			Bean.setLIVE(rs.getString("LIVE"));								//거주상태
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//물건구분
//			Bean.setBD_NM(rs.getString("BD_NM"));							//물건명
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//물건OCR시구코드
			Bean.setBJ_CD(rs.getString("BJ_CD"));							//물건법정동리코드
			Bean.setSPC_CD(rs.getString("SPC_CD"));							//물건특수지코드
			Bean.setBONBUN(String.valueOf(rs.getInt("BONBUN")));							//물건본번
			Bean.setBUBUN(String.valueOf(rs.getInt("BUBUN")));							//물건부번
//			Bean.setTONG(rs.getString("TONG"));								//물건통
//			Bean.setBAN(rs.getString("BAN"));								//물건반
//			Bean.setMUL_APT_NM(rs.getString("BD_NM"));						//물건아파트명
//			Bean.setBD_DONG(rs.getString("BD_DONG"));						//물건동
//			Bean.setBD_HO(rs.getString("BD_HO"));							//물건호
//			Bean.setMUL_POST(rs.getString("MUL_POST"));						//물건우편번호
			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR"));					//물건우편번호주소
//			Bean.setNEAR_ADDR2(rs.getString("WITH_ADDR2"));					//물건상세주소
			Bean.setHJ_CD(rs.getString("HJ_CD"));							//행정동코드
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//항목1(조정산출식)
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//항목2(점용목적)
			Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//항목3(지목)
//			Bean.setUSE_DATE(rs.getString("MUL_FROMDATE")+"~"+rs.getString("MUL_TODATE"));//항목4(사용기간)
			Bean.setAREA(rs.getString("AREA"));							    //항목5(점용면적)
			Bean.setADMIN_NO(rs.getString("GAPAN_NO"));						//항목6(관리번호)
			Bean.setADD_SET(rs.getString("ADD_SET"));                       //가산율구분
			Bean.setRATE(Integer.toString(rs.getInt("RATE")));			    //특별이율 		
			Bean.setRATE_CAUSE(rs.getString("RATE_CAUSE"));					//특별이율적용사유
			Bean.setNOTES(rs.getString("NOTES"));						    //비고
			Bean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));				//OCR시구코드
			Bean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));				//OCR부서코드
			Bean.setVAT(Integer.toString(rs.getInt("VAT")));				//부가가시체금액
			Bean.setADD_YN(rs.getString("ADD_YN"));							//가산금면제여부	
			
			Bean.setLIMIT_SUM(Integer.toString(rs.getInt("LIMIT_SUM")));
			Bean.setLIMIT_CNT(Integer.toString(rs.getInt("LIMIT_CNT")));
			Bean.setINTAX(Integer.toString(rs.getInt("INTAX")));
			Bean.setOVERTAX(Integer.toString(rs.getInt("OVERTAX")));
			Bean.setFORM1(rs.getString("FORM1"));
			Bean.setFORM2(rs.getString("FORM2"));
			Bean.setGU_CODE(rs.getString("SIGUNGU"));
//			Bean.setBUNNAP_NO(rs.getString("BUNNAP_NO"));
			Bean.setYEAR(rs.getString("YEAR"));
//			Bean.setSUSI_NO(rs.getString("SUSI_NO"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			
			Bean.setFROMDATE(util.Date_Paste(rs.getString("FROMDATE")));	//항목4-산출기간으로 수정
			Bean.setTODATE(util.Date_Paste(rs.getString("TODATE")));		//항목4-산출기간으로 수정
			
			System.out.println("Bean.getSIGU_CD"+Bean.getSIGU_CD());						
			System.out.println("Bean.getTAX_CD"+Bean.getTAX_CD());							
			System.out.println("Bean.getTAX_YM"+Bean.getTAX_YM());							
			System.out.println("Bean.getTAX_GUBUN"+Bean.getTAX_GUBUN());				
			System.out.println("Bean.getTAX_SET"+Bean.getTAX_SET());						
			System.out.println("Bean.getDEPT_CD"+Bean.getDEPT_CD());						
			System.out.println("Bean.getTAX_NO"+Bean.getTAX_NO());							
			System.out.println("Bean.getSIDO"+Bean.getSIDO());								
			System.out.println("Bean.getTAXPAYER_ID"+Bean.getTAXPAYER_ID());		
			System.out.println("Bean.getTAXPAYER_NM"+Bean.getTAXPAYER_NM());		
			System.out.println("Bean.getTAXPAYER_SET"+Bean.getTAXPAYER_SET());	
			System.out.println("Bean.getSUBUSEO_CD"+Bean.getSUBUSEO_CD());			
			System.out.println("Bean.getTAX_DATE"+Bean.getTAX_DATE());					
			System.out.println("Bean.getINDATE"+Bean.getINDATE());							
			System.out.println("Bean.getOVERDATE"+Bean.getOVERDATE());					
			System.out.println("Bean.getBONSE"+Bean.getBONSE());
			System.out.println("Bean.getSISE"+Bean.getSISE());	
			System.out.println("Bean.getGUSE"+Bean.getGUSE());	
			System.out.println("Bean.getGUKSE"+Bean.getGUKSE());
			System.out.println("Bean.getGIGUM"+Bean.getGIGUM());
			System.out.println("Bean.getHP"+Bean.getHP());						
			System.out.println("Bean.getTEL"+Bean.getTEL());					
			System.out.println("Bean.getPOST"+Bean.getPOST());				
			System.out.println("Bean.getADDR1"+Bean.getADDR1());			
			System.out.println("Bean.getADDR2"+Bean.getADDR2());			
			System.out.println("Bean.getROAD_ADD"+Bean.getROAD_ADD());		
			System.out.println("Bean.getLIVE"+Bean.getLIVE());							
			System.out.println("Bean.getOBJ_SET"+Bean.getOBJ_SET());				
			System.out.println("Bean.getSIGUNGU"+Bean.getSIGUNGU());				
			System.out.println("Bean.getBJ_CD"+Bean.getBJ_CD());						
			System.out.println("Bean.getSPC_CD"+Bean.getSPC_CD());					
			System.out.println("Bean.getBONBUN"+Bean.getBONBUN());					
			System.out.println("Bean.getBUBUN"+Bean.getBUBUN());						
			System.out.println("Bean.getNEAR_ADDR1"+Bean.getNEAR_ADDR1());	
			System.out.println("Bean.getFORM_ADJUST"+Bean.getFORM_ADJUST());		
			System.out.println("Bean.getPURPOSE_NM"+Bean.getPURPOSE_NM());			
			System.out.println("Bean.getTYPE_NM"+Bean.getTYPE_NM());						
			System.out.println("Bean.getAREA"+Bean.getAREA());							    
			System.out.println("Bean.getADMIN_NO"+Bean.getADMIN_NO());					
			System.out.println("Bean.getADD_SET"+Bean.getADD_SET());           
			System.out.println("Bean.getRATE"+Bean.getRATE());	
			System.out.println("Bean.getRATE_CAUSE"+Bean.getRATE_CAUSE());			
			System.out.println("Bean.getNOTES"+Bean.getNOTES());						    
			System.out.println("Bean.getOCR_SIGU_CD"+Bean.getOCR_SIGU_CD());		
			System.out.println("Bean.getOCR_BUSEO_C"+Bean.getOCR_BUSEO_CD());	
			System.out.println("Bean.getVAT"+Bean.getVAT());		
			System.out.println("Bean.getADD_YN"+Bean.getADD_YN());							
			System.out.println("Bean.getLIMIT_SUM"+Bean.getLIMIT_SUM());
			System.out.println("Bean.getLIMIT_CNT"+Bean.getLIMIT_CNT());
			System.out.println("Bean.getINTAX"+Bean.getINTAX());
			System.out.println("Bean.getOVERTAX"+Bean.getOVERTAX());
			System.out.println("Bean.getFORM1"+Bean.getFORM1());
			System.out.println("Bean.getFORM2"+Bean.getFORM2());
			System.out.println("Bean.getGU_CODE"+Bean.getGU_CODE());
			System.out.println("Bean.getYEAR"+Bean.getYEAR());
			System.out.println("Bean.getTAX_YN"+Bean.getTAX_YN());
			System.out.println("Bean.getGU_NM"+Bean.getGU_NM());
			System.out.println("Bean.getDEPT_NM"+Bean.getDEPT_NM());
			System.out.println("Bean.getFROMDATE"+Bean.getFROMDATE());
			System.out.println("Bean.getTODATE"+Bean.getTODATE());		
			
        	return	Bean;
        }
    }
    
    //	부과정보 수정
    protected	class	Bugwa_Modify	extends	SqlUpdate
    {
    	protected	Bugwa_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.saewe.Bugwa_Modify"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));            
        }
    }
    
    //	부과정보 입력
    protected	class	Bugwa_Register	extends	SqlUpdate
    {
    	protected	Bugwa_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.saewe.Bugwa_Register"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));            
        }
    }
    
    
    //	부과정보에 필요한 점용인, 점용지 정보를 가져온다.
    protected	class	Bugwa_DataInfo	extends	MappingSqlQuery
    {
        protected 	Bugwa_DataInfo(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.Bugwa_DataInfo"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SaeweBean	Bean	= new SaeweBean();

    		//	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			//Bean.setGU_CODE(rs.getString("GU_CODE"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));			//세입구분
			Bean.setSUM_ADJUST(rs.getString("SUM"));
			Bean.setVAT(rs.getString("VAT"));
			Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
			Bean.setTODATE(NullCheck(rs.getString("TODATE")));
			Bean.setYEAR(rs.getString("YEAR"));
			
        	return	Bean;
        }
    }
    
    
    //	세외수입 부과		-	부과정보 테이블에 부과 여부 확인
    protected	class	SaeweSuipBugwa_Check	extends	MappingSqlQuery
    {
        protected 	SaeweSuipBugwa_Check(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.SaeweSuipBugwa_Check"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        //	SaeweBean	Bean	= new SaeweBean();

		//	Bean.setTAX_YN(rs.getString("TAX_YN"));
			
        	return	rs.getString("TAX_YN");
        }
    }
    
    //	세외수입 부과		-	부과정보 테이블에 부과 등록
    protected	class	SaeweSuipBugwa_Taxation_Info	extends	SqlUpdate
    {
    	protected	SaeweSuipBugwa_Taxation_Info(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.saewe.SaeweSuipBugwa_Taxation_Info"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    //	세외수입 부과		-	어드민정보 테이블에 부과 등록
    protected	class	SaeweSuipBugwa_Admin_Base	extends	SqlUpdate
    {
    	protected	SaeweSuipBugwa_Admin_Base(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.saewe.SaeweSuipBugwa_Admin_Base"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }

    //	세외수입 부과		-	cal_sum_info tax_seq를 1로 set
    protected	class	SetCal_Sum_Info_taxseq	extends	SqlUpdate
    {
    	protected	SetCal_Sum_Info_taxseq(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.saewe.SetCal_Sum_Info_taxseq"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    protected	String	NullCheck(String str)
    {
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }
    
    
//	부과정보 세부보기
    protected	class	Bugwa_View_GpTyp	extends	MappingSqlQuery
    {
        protected 	Bugwa_View_GpTyp(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.Bugwa_View_GpTyp"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	TaxationBean	Bean	= new TaxationBean();
        	
        	Bean.setSIGU_CD(rs.getString("SIGU_CD"));						//시구코드 
        	Bean.setTAX_CD(rs.getString("TAX_CD"));							//세목코드
        	Bean.setTAX_YM(rs.getString("TAX_YM"));							//과세년월
        	Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));					//과세구분
        	Bean.setTAX_SET(rs.getString("TAX_SET"));						//세입구분
        	Bean.setDEPT_CD(rs.getString("DEPT_CD"));						//부서코드
			Bean.setTAX_NO(rs.getString("TAX_NO"));							//과세번호
        	Bean.setSIDO(rs.getString("SIDO"));								//시도코드
        	Bean.setTAXPAYER_ID(rs.getString("OWNER_SSN"));				//납세자ID
        	Bean.setTAXPAYER_NM(rs.getString("OWNER_NAME"));				//납세자명
        	Bean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));				//납세자구분
        	Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));					//수납부서코드
			Bean.setTAX_DATE(rs.getString("TAX_DATE"));						//과세일자
			Bean.setINDATE(rs.getString("INDATE"));							//납기일자
			Bean.setOVERDATE(rs.getString("OVERDATE"));						//납기후일자
//			Bean.setNAPBU_YMD(rs.getString("TAX_DATE"));					//납부일자
			Bean.setBONSE(rs.getString("BONSE"));			//과세금액
			Bean.setSISE(rs.getString("SISE"));				//시세
			Bean.setGUSE(rs.getString("GUSE"));				//구세
			Bean.setGUKSE(rs.getString("GUKSE"));			//국세
			Bean.setGIGUM(rs.getString("GIGUM"));			//기금
			Bean.setHP(rs.getString("OWNER_HP"));							//납세자휴대폰번호
			Bean.setTEL(rs.getString("OWNER_TEL"));							//납세자전화번호
//			Bean.setEMAIL(rs.getString("EMAIL"));							//납세자EMAIL
			Bean.setPOST(rs.getString("OWNER_POST"));						//납세자우편번호
			Bean.setADDR1(rs.getString("OWNER_ADDR1"));						//납세자우편번호주소
			if(rs.getString("OWNER_SAN") == null|| !rs.getString("OWNER_SAN").equals("1")){
				Bean.setADDR2(rs.getString("OWNER_JIBUN"));						//납세자상세주소
			}else{
				Bean.setADDR2("산 " + rs.getString("OWNER_JIBUN"));		
			}
			
			if(rs.getString("OWNER_ADDR2") == null || rs.getString("OWNER_ADDR2").equals("") || rs.getString("OWNER_ADDR2").equals("null")){
			}else{
				Bean.setADDR2(Bean.getADDR2() + " " + rs.getString("OWNER_ADDR2"));	
			}						//납세자상세주소
			Bean.setROAD_ADD(rs.getString("ROAD_INFO"));					//납세자도로명주소
			
			//********** BEGIN_현진_20120213
			Bean.setSI(rs.getString("SI"));
			Bean.setGUN(rs.getString("GUN"));
			Bean.setDORO_NM(rs.getString("DORO_NM"));
			Bean.setBD_NM(rs.getString("BD_NM"));
			Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
			Bean.setBD_BON(rs.getString("BD_BON"));
			Bean.setBD_BU(rs.getString("BD_BU"));			
			//********** END_현진_20120213
			
			Bean.setLIVE(rs.getString("LIVE"));								//거주상태
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//물건구분
//			Bean.setBD_NM(rs.getString("BD_NM"));							//물건명
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//물건OCR시구코드
			Bean.setBJ_CD(rs.getString("BJ_CD"));							//물건법정동리코드
			Bean.setSPC_CD(rs.getString("SPC_CD"));							//물건특수지코드
			Bean.setBONBUN(String.valueOf(rs.getInt("BONBUN")));							//물건본번
			Bean.setBUBUN(String.valueOf(rs.getInt("BUBUN")));						//물건부번
//			Bean.setTONG(rs.getString("TONG"));								//물건통
//			Bean.setBAN(rs.getString("BAN"));								//물건반
//			Bean.setMUL_APT_NM(rs.getString("BD_NM"));						//물건아파트명
//			Bean.setBD_DONG(rs.getString("BD_DONG"));						//물건동
//			Bean.setBD_HO(rs.getString("BD_HO"));							//물건호
//			Bean.setMUL_POST(rs.getString("MUL_POST"));						//물건우편번호
			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR"));					//물건우편번호주소
//			Bean.setNEAR_ADDR2(rs.getString("WITH_ADDR2"));					//물건상세주소
			Bean.setHJ_CD(rs.getString("HJ_CD"));							//행정동코드
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//항목1(조정산출식)
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//항목2(점용목적)
			Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//항목3(지목)
//			Bean.setUSE_DATE(rs.getString("MUL_FROMDATE")+"~"+rs.getString("MUL_TODATE"));//항목4(사용기간)
			Bean.setAREA(rs.getString("AREA"));							    //항목5(점용면적)
			Bean.setADMIN_NO(rs.getString("GAPAN_NO"));						//항목6(관리번호)
			Bean.setADD_SET(rs.getString("ADD_SET"));                       //가산율구분
			Bean.setRATE(Integer.toString(rs.getInt("RATE")));			    //특별이율 		
			Bean.setRATE_CAUSE(rs.getString("RATE_CAUSE"));					//특별이율적용사유
			Bean.setNOTES(rs.getString("NOTES"));						    //비고
			Bean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));				//OCR시구코드
			Bean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));				//OCR부서코드
			Bean.setVAT(Integer.toString(rs.getInt("VAT")));				//부가가시체금액
			Bean.setADD_YN(rs.getString("ADD_YN"));							//가산금면제여부	
			
			Bean.setLIMIT_SUM(rs.getString("LIMIT_SUM"));
			Bean.setLIMIT_CNT(rs.getString("LIMIT_CNT"));
			Bean.setINTAX(rs.getString("INTAX"));
			Bean.setOVERTAX(rs.getString("OVERTAX"));
			Bean.setFORM1(rs.getString("FORM1"));
			Bean.setFORM2(rs.getString("FORM2"));
			Bean.setGU_CODE(rs.getString("SIGUNGU"));
//			Bean.setBUNNAP_NO(rs.getString("BUNNAP_NO"));
			Bean.setYEAR(rs.getString("YEAR"));
//			Bean.setSUSI_NO(rs.getString("SUSI_NO"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			
			Bean.setFROMDATE(util.Date_Paste(rs.getString("FROMDATE")));	//항목4-산출기간으로 수정
			Bean.setTODATE(util.Date_Paste(rs.getString("TODATE")));		//항목4-산출기간으로 수정
			
			System.out.println("Bean.getSIGU_CD"+Bean.getSIGU_CD());						
			System.out.println("Bean.getTAX_CD"+Bean.getTAX_CD());							
			System.out.println("Bean.getTAX_YM"+Bean.getTAX_YM());							
			System.out.println("Bean.getTAX_GUBUN"+Bean.getTAX_GUBUN());				
			System.out.println("Bean.getTAX_SET"+Bean.getTAX_SET());						
			System.out.println("Bean.getDEPT_CD"+Bean.getDEPT_CD());						
			System.out.println("Bean.getTAX_NO"+Bean.getTAX_NO());							
			System.out.println("Bean.getSIDO"+Bean.getSIDO());								
			System.out.println("Bean.getTAXPAYER_ID"+Bean.getTAXPAYER_ID());		
			System.out.println("Bean.getTAXPAYER_NM"+Bean.getTAXPAYER_NM());		
			System.out.println("Bean.getTAXPAYER_SET"+Bean.getTAXPAYER_SET());	
			System.out.println("Bean.getSUBUSEO_CD"+Bean.getSUBUSEO_CD());			
			System.out.println("Bean.getTAX_DATE"+Bean.getTAX_DATE());					
			System.out.println("Bean.getINDATE"+Bean.getINDATE());							
			System.out.println("Bean.getOVERDATE"+Bean.getOVERDATE());					
			System.out.println("Bean.getBONSE"+Bean.getBONSE());
			System.out.println("Bean.getSISE"+Bean.getSISE());	
			System.out.println("Bean.getGUSE"+Bean.getGUSE());	
			System.out.println("Bean.getGUKSE"+Bean.getGUKSE());
			System.out.println("Bean.getGIGUM"+Bean.getGIGUM());
			System.out.println("Bean.getHP"+Bean.getHP());						
			System.out.println("Bean.getTEL"+Bean.getTEL());					
			System.out.println("Bean.getPOST"+Bean.getPOST());				
			System.out.println("Bean.getADDR1"+Bean.getADDR1());			
			System.out.println("Bean.getADDR2"+Bean.getADDR2());			
			System.out.println("Bean.getROAD_ADD"+Bean.getROAD_ADD());		
			System.out.println("Bean.getLIVE"+Bean.getLIVE());							
			System.out.println("Bean.getOBJ_SET"+Bean.getOBJ_SET());				
			System.out.println("Bean.getSIGUNGU"+Bean.getSIGUNGU());				
			System.out.println("Bean.getBJ_CD"+Bean.getBJ_CD());						
			System.out.println("Bean.getSPC_CD"+Bean.getSPC_CD());					
			System.out.println("Bean.getBONBUN"+Bean.getBONBUN());					
			System.out.println("Bean.getBUBUN"+Bean.getBUBUN());						
			System.out.println("Bean.getNEAR_ADDR1"+Bean.getNEAR_ADDR1());	
			System.out.println("Bean.getFORM_ADJUST"+Bean.getFORM_ADJUST());		
			System.out.println("Bean.getPURPOSE_NM"+Bean.getPURPOSE_NM());			
			System.out.println("Bean.getTYPE_NM"+Bean.getTYPE_NM());						
			System.out.println("Bean.getAREA"+Bean.getAREA());							    
			System.out.println("Bean.getADMIN_NO"+Bean.getADMIN_NO());					
			System.out.println("Bean.getADD_SET"+Bean.getADD_SET());           
			System.out.println("Bean.getRATE"+Bean.getRATE());	
			System.out.println("Bean.getRATE_CAUSE"+Bean.getRATE_CAUSE());			
			System.out.println("Bean.getNOTES"+Bean.getNOTES());						    
			System.out.println("Bean.getOCR_SIGU_CD"+Bean.getOCR_SIGU_CD());		
			System.out.println("Bean.getOCR_BUSEO_C"+Bean.getOCR_BUSEO_CD());	
			System.out.println("Bean.getVAT"+Bean.getVAT());		
			System.out.println("Bean.getADD_YN"+Bean.getADD_YN());							
			System.out.println("Bean.getLIMIT_SUM"+Bean.getLIMIT_SUM());
			System.out.println("Bean.getLIMIT_CNT"+Bean.getLIMIT_CNT());
			System.out.println("Bean.getINTAX"+Bean.getINTAX());
			System.out.println("Bean.getOVERTAX"+Bean.getOVERTAX());
			System.out.println("Bean.getFORM1"+Bean.getFORM1());
			System.out.println("Bean.getFORM2"+Bean.getFORM2());
			System.out.println("Bean.getGU_CODE"+Bean.getGU_CODE());
			System.out.println("Bean.getYEAR"+Bean.getYEAR());
			System.out.println("Bean.getTAX_YN"+Bean.getTAX_YN());
			System.out.println("Bean.getGU_NM"+Bean.getGU_NM());
			System.out.println("Bean.getDEPT_NM"+Bean.getDEPT_NM());
			System.out.println("Bean.getFROMDATE"+Bean.getFROMDATE());
			System.out.println("Bean.getTODATE"+Bean.getTODATE());		
			
        	return	Bean;
        }
    }
    
    
    protected	class	Bugwa_DataInfo_GpTyp	extends	MappingSqlQuery
    {
        protected 	Bugwa_DataInfo_GpTyp(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.saewe.Bugwa_DataInfo_GpTyp"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SaeweBean	Bean	= new SaeweBean();

			Bean.setTAX_SET(rs.getString("TAX_SET"));			//세입구분
			Bean.setSUM_ADJUST(rs.getString("SUM"));
			Bean.setVAT(rs.getString("VAT"));
			Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
			Bean.setTODATE(NullCheck(rs.getString("TODATE")));
			Bean.setYEAR(rs.getString("YEAR"));
			
        	return	Bean;
        }
    }
}
