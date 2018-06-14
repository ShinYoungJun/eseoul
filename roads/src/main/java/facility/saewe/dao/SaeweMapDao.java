
package main.java.facility.saewe.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.facility.saewe.model.AppealBean;
import main.java.facility.saewe.model.TaxationBean;
import main.java.facility.saewe.model.PlaceBean;
import main.java.facility.saewe.model.CalculationBean;
import main.java.facility.saewe.model.SaeweBean;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class SaeweMapDao {

	
    protected	class	Search	extends	MappingSqlQuery
    {
        protected 	Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.saewe.Search"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SaeweBean	Bean	= new SaeweBean();
        	
        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	Bean.setREQ_DATE(rs.getString("UP_DATE"));
        	Bean.setYEAR(rs.getString("YEAR"));
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setGU_CODE(rs.getString("GU_CODE"));
        	Bean.setCORP_CD(rs.getString("CORP_CD"));        	
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setOFFICE(rs.getString("OFFICE"));
        	Bean.setSUM(rs.getString("SUM"));        		
        	Bean.setTAX_YN(rs.getString("TAX_YN"));
        	Bean.setTAX_SET(rs.getString("TAX_SET"));
        	Bean.setCAL_YN(rs.getString("CAL_YN"));
        	Bean.setRN(rs.getString("RN"));
        	
        	return	Bean;
        }
    }
 
    protected	class	Search_Ilgwal	extends	MappingSqlQuery
    {
        protected 	Search_Ilgwal(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.saewe.Search_Ilgwal"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
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
        	Bean.setTAX_SET(rs.getString("TAX_SET"));						//시세/구세
        	Bean.setDEPT_CD(rs.getString("DEPT_CD"));						//부서코드
        	Bean.setTAX_NO(rs.getString("TAX_NO"));							//과세번호
//        	Bean.setSIDO(rs.getString("SIDO"));								//시도코드
        	Bean.setTAXPAYER_ID(rs.getString("TAXPAYER_ID"));				//납세자ID
        	Bean.setTAXPAYER_NM(rs.getString("NAME"));						//납세자명
        	Bean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));				//납세자구분
        	Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));					//수납부서코드
        	Bean.setTAX_DATE(rs.getString("TAX_DATE"));						//과세일자
			Bean.setINDATE(rs.getString("INDATE"));							//납기일자
			Bean.setOVERDATE(rs.getString("OVERDATE"));						//납기후일자
//			Bean.setNAPBU_YMD(rs.getString("TAX_DATE"));					//납부일자
			Bean.setBONSE(Integer.toString(rs.getInt("BONSE")));			//과세금액
			Bean.setSISE(rs.getString("SISE"));								//시세
			Bean.setGUSE(rs.getString("GUSE"));								//구세
			Bean.setGUKSE(rs.getString("GUKSE"));						    //국세
			Bean.setGIGUM(rs.getString("GIGUM"));							//기금
			Bean.setHP(rs.getString("HP"));									//납세자휴대폰번호
			Bean.setTEL(rs.getString("TEL"));								//납세자전화번호
//			Bean.setEMAIL(rs.getString("EMAIL"));							//납세자EMAIL
			Bean.setPOST(rs.getString("POST"));								//납세자우편번호
			Bean.setADDR1(rs.getString("ADDR1"));							//납세자우편번호주소
			Bean.setADDR2(rs.getString("ADDR2"));							//납세자상세주소
			Bean.setROAD_ADD(rs.getString("ROAD_ADDR"));						//납세자도로명주소
			Bean.setLIVE(rs.getString("LIVE"));								//거주상태
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//물건구분
//			Bean.setBD_NM(rs.getString("BD_NM"));							//물건명
//			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//물건OCR시구코드
//			Bean.setBJ_CD(rs.getString("BJ_CD"));							//물건법정동리코드
//			Bean.setSPC_CD(rs.getString("SPC_CD"));							//물건특수지코드
//			Bean.setBONBUN(rs.getString("BONBUN"));							//물건본번
//			Bean.setBUBUN(rs.getString("BUBUN"));							//물건부번
//			Bean.setTONG(rs.getString("TONG"));								//물건통
//			Bean.setBAN(rs.getString("BAN"));								//물건반
//			Bean.setMUL_APT_NM(rs.getString("BD_NM"));						//물건아파트명
//			Bean.setBD_DONG(rs.getString("BD_DONG"));						//물건동
//			Bean.setBD_HO(rs.getString("BD_HO"));							//물건호
//			Bean.setMUL_POST(rs.getString("MUL_POST"));						//물건우편번호
//			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR1"));					//물건우편번호주소
//			Bean.setNEAR_ADDR2(rs.getString("WITH_ADDR2"));					//물건상세주소
//			Bean.setHJ_CD(rs.getString("HJ_CD"));							//행정동코드
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//항목1(조정산출식)
//			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//항목2(점용목적)
//			Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//항목3(지목)
//			Bean.setUSE_DATE(rs.getString("MUL_FROMDATE")+"~"+rs.getString("MUL_TODATE"));//항목4(사용기간)
//			Bean.setAREA(rs.getString("AREA"));							    //항목5(점용면적)
//			Bean.setADMIN_NO(rs.getString("YEAR")+"_"+rs.getString("GU_CODE")+rs.getString("CORP_CD")+"_"+ rs.getString("REQUEST_NO"));	//항목6(관리번호)
			Bean.setADD_SET(rs.getString("ADD_SET"));                       //가산율구분
			Bean.setRATE(Integer.toString(rs.getInt("RATE")));			    //특별이율 		
			Bean.setRATE_CAUSE(rs.getString("RATE_CAUSE"));					//특별이율적용사유
			Bean.setNOTES(rs.getString("NOTES"));						    //비고
			Bean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));				//OCR시구코드
			Bean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));				//OCR부서코드
			Bean.setVAT(Integer.toString(rs.getInt("VAT")));				//부가가시체금액
			Bean.setADD_YN(rs.getString("ADD_YN"));							//가산금면제여부	
			
			Bean.setTAX_CD_GU(rs.getString("TAX_CD_GU"));
			Bean.setTAX_CD_SE(rs.getString("TAX_CD_SE"));
			Bean.setLIMIT_SUM(Integer.toString(rs.getInt("LIMIT_SUM")));
			Bean.setLIMIT_CNT(Integer.toString(rs.getInt("LIMIT_CNT")));
			Bean.setINTAX(Integer.toString(rs.getInt("INTAX")));
			Bean.setOVERTAX(Integer.toString(rs.getInt("OVERTAX")));
			Bean.setFORM1(Integer.toString(rs.getInt("FORM1")));
			Bean.setFORM2(Integer.toString(rs.getInt("FORM2")));
			Bean.setGU_CODE(rs.getString("GU_CODE"));
			Bean.setBUNNAP_NO(rs.getString("BUNNAP_NO"));
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setSUSI_NO(rs.getString("SUSI_NO"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			Bean.setSEQ(rs.getString("SEQ")); // seq
			Bean.setGU_CODE(rs.getString("GU_CODE"));
			Bean.setREQUEST_NO(rs.getString("REQUEST_NO"));
			Bean.setCORP_CD(rs.getString("CORP_CD"));
			Bean.setUSE_DATE(rs.getString("FROMDATE")+" ~ "+rs.getString("TODATE"));
			
			
		
        	
        	return	Bean;
        }
    } 
    
    protected	class	SanchulSearch	extends	MappingSqlQuery
    {
        protected 	SanchulSearch(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.saewe.SanchulSearch"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));	        
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CalculationBean	Bean	= new CalculationBean();

        	Bean.setGU_CODE(rs.getString("GU_CODE"));
        	Bean.setCORP_CD(rs.getString("CORP_CD"));        	
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setYEAR(rs.getString("YEAR"));
        	Bean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
        	Bean.setSUM(rs.getString("SUM"));
        	Bean.setVAT(rs.getString("VAT"));
        	Bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
        	Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
        	Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
        	Bean.setTODATE(NullCheck(rs.getString("TODATE")));
        	Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
        	Bean.setUSE_SECTION(rs.getString("USE_SECTION"));
        	Bean.setTAX_SET(rs.getString("TAX_SET"));
        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	
        	return	Bean;
        }
    }
    
    protected	class	SanchulInfo_View	extends	MappingSqlQuery
    {
        protected 	SanchulInfo_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.saewe.SanchulInfo_View"));
          	
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	
        	CalculationBean	Bean	= new CalculationBean();

        	Bean.setYEAR(NullCheck(rs.getString("YEAR")));
        	Bean.setTAX_SET(NullCheck(rs.getString("TAX_SET")));
        	Bean.setUSE_SECTION(NullCheck(rs.getString("USE_SECTION")));
        	Bean.setSEQ(NullCheck(rs.getString("SEQ")));
        	Bean.setSUM_ADJUST(NullCheck(rs.getString("SUM_ADJUST")));
        	Bean.setSUM(NullCheck(rs.getString("SUM")));
        	Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
        	Bean.setTODATE(NullCheck(rs.getString("TODATE")));
        	Bean.setFORM_ADJUST(NullCheck(rs.getString("FORM_ADJUST")));
        	Bean.setVAT(NullCheck(rs.getString("VAT")));
        	System.out.println("------------------------");
        	System.out.println(rs.getString("VAT"));
        
        	return	Bean;
        }
    }
    
    //	점용인 정보
    protected	class	Jumin_View	extends	MappingSqlQuery
    {
        protected 	Jumin_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.saewe.Jumin_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();
        	
        	Bean.setCORP_CD(rs.getString("CORP_CD"));
  			Bean.setGU_CODE(rs.getString("GU_CODE"));
			Bean.setNAME(rs.getString("NAME"));
			Bean.setOFFICE(rs.getString("OFFICE"));
			Bean.setSSN(rs.getString("SSN"));
			Bean.setBIZSSN(rs.getString("BIZSSN"));
			Bean.setTEL(rs.getString("TEL"));
			Bean.setHP(rs.getString("HP"));
			Bean.setPOST(rs.getString("POST"));
			Bean.setADDR1(rs.getString("ADDR1"));
			Bean.setADDR2(rs.getString("ADDR2"));
			Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
			Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
			Bean.setROAD_ADDR(rs.getString("ROAD_ADDR"));
			Bean.setROAD_BON(rs.getString("ROAD_BON"));
			Bean.setROAD_BU(rs.getString("ROAD_BU"));
			Bean.setADDR_CHECK(rs.getString("ADDR_CHECK"));
			Bean.setTOPOST(rs.getString("TOPOST"));	
			Bean.setTOADDR1(rs.getString("TOADDR1"));
			Bean.setTOADDR2(rs.getString("TOADDR2"));
			Bean.setTOPOST_NM(rs.getString("TOPOST_NM"));
			Bean.setTOTEL(rs.getString("TOTEL"));
			Bean.setTOTEL_EXT(rs.getString("TOTEL_EXT"));
			Bean.setTOHP(rs.getString("TOHP"));
			Bean.setTOFAX(rs.getString("TOFAX"));
			Bean.setREGDATE(rs.getString("REGDATE"));
			Bean.setMANAGER(rs.getString("MANAGER"));
			Bean.setRN(rs.getString("RN"));
			Bean.setADDR_CHECK(rs.getString("ADDR_CHECK"));
			
        	Bean.setCORP_CD(rs.getString("CORP_CD"));
        	Bean.setGU_CODE(rs.getString("GU_CODE"));
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setOFFICE(rs.getString("OFFICE"));
        	Bean.setSSN(rs.getString("SSN"));
        	Bean.setBIZSSN(rs.getString("BIZSSN"));
        	Bean.setTOTEL(rs.getString("TOTEL"));
        	Bean.setTOHP(rs.getString("TOHP"));
        	Bean.setPOST(rs.getString("POST"));
        	Bean.setADDR1(rs.getString("ADDR1"));
        	Bean.setADDR2(rs.getString("ADDR2"));
        	Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
        	Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
        	Bean.setTOPOST(rs.getString("TOPOST"));
        	Bean.setTOADDR1(rs.getString("TOADDR1"));
        	Bean.setTOADDR2(rs.getString("TOADDR2"));
        	Bean.setTOTEL_EXT(rs.getString("TOTEL_EXT"));
        	Bean.setTOFAX(rs.getString("TOFAX"));
        	Bean.setTOPOST_NM(rs.getString("TOPOST_NM"));
        	Bean.setMANAGER(rs.getString("MANAGER"));
        	Bean.setLNBR1(rs.getString("LNBR1"));
        	Bean.setLNBR2(rs.getString("LNBR2"));
        	Bean.setTO_LNBR1(rs.getString("TO_LNBR1"));
        	Bean.setTO_LNBR2(rs.getString("TO_LNBR2"));
        	Bean.setOFFICE_CD(rs.getString("OFFICE_CD"));
        	Bean.setSPC_CD(rs.getString("SPC_CD"));
        	Bean.setTO_SPC_CD(rs.getString("TO_SPC_CD"));
        	Bean.setTEL(rs.getString("TEL"));
        	Bean.setHP(rs.getString("HP"));
        	Bean.setSI(rs.getString("SI"));
        	Bean.setGUN(rs.getString("GUN"));
        	Bean.setDONG(rs.getString("DONG"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setSANGSE(rs.getString("SANGSE"));
        	Bean.setROAD_ADDR(rs.getString("ROAD_ADDR"));
        	Bean.setROAD_BON(rs.getString("ROAD_BON"));
        	Bean.setROAD_BU(rs.getString("ROAD_BU"));
        	Bean.setADDR_CHECK(rs.getString("ADDR_CHECK"));
        	Bean.setTOSI(rs.getString("TOSI"));
        	Bean.setTOGUN(rs.getString("TOGUN"));
        	Bean.setTODONG(rs.getString("TODONG"));
        	Bean.setTOBON(rs.getString("TOBON"));
        	Bean.setTOBU(rs.getString("TOBU"));
        	Bean.setTOSANGSE(rs.getString("TOSANGSE"));
        	Bean.setREGDATE(rs.getString("REGDATE"));
        	Bean.setRI(rs.getString("RI"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
        	Bean.setTORI(rs.getString("TORI"));
        	Bean.setTO_DORO_NM(rs.getString("TO_DORO_NM"));
        	Bean.setTO_BD_BON(rs.getString("TO_BD_BON"));
        	Bean.setTO_BD_BU(rs.getString("TO_BD_BU"));
        	Bean.setTO_BD_NM(rs.getString("TO_BD_NM"));
        	Bean.setTO_BD_DET_NM(rs.getString("TO_BD_DET_NM"));
        	Bean.setREQUEST_NO(rs.getString("REQUEST_NO"));
        	Bean.setJIJUM_CD(rs.getString("JIJUM_CD"));

			return	Bean;
        }
    }
    
    
    //	점용지 정보
    protected	class	Jumji_View	extends	MappingSqlQuery
    {
        protected 	Jumji_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.saewe.Jumji_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceBean	Bean	= new PlaceBean();

			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setSAN_CK(rs.getString("SAN_CK"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setTONG(rs.getString("TONG"));
			Bean.setBAN(rs.getString("BAN"));
			Bean.setMUL_POST(rs.getString("MUL_POST"));
			Bean.setBD_NM(rs.getString("BD_NM"));
			Bean.setBD_DONG(rs.getString("BD_DONG"));
			Bean.setBD_HO(rs.getString("BD_HO"));
			Bean.setROAD_ADD(rs.getString("ROAD_ADD"));
			Bean.setPARKING_NUM(rs.getString("PARKING_NUM"));
			Bean.setRIVER_NM(rs.getString("RIVER_NM"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setWITH_POST(rs.getString("WITH_POST"));
			Bean.setWORK_FROMDATE(rs.getString("WORK_FROMDATE"));
			Bean.setWORK_TODATE(rs.getString("WORK_TODATE"));
			Bean.setWITH_ADDR1(rs.getString("WITH_ADDR1"));
			Bean.setWITH_ADDR2(rs.getString("WITH_ADDR2"));
			Bean.setEXE_INFO(rs.getString("EXE_INFO"));
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
			

			
			Bean.setCORP_CD(rs.getString("CORP_CD"));
			Bean.setGU_CODE(rs.getString("GU_CODE"));
			Bean.setOBJECT_NO(rs.getString("OBJECT_NO"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setSPC_CD(rs.getString("SPC_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setWORK_FROMDATE(rs.getString("WORK_FROMDATE"));
			Bean.setWORK_TODATE(rs.getString("WORK_TODATE"));
			Bean.setFINISH_DATE(rs.getString("FINISH_DATE"));
			Bean.setSTRUTS(rs.getString("STRUTS"));
			Bean.setEXE_INFO(rs.getString("EXE_INFO"));
			Bean.setPURPOSESEBU_CD(rs.getString("PURPOSESEBU_CD"));
			Bean.setSTANDARD(rs.getString("STANDARD"));
			Bean.setQUANTITY(rs.getString("QUANTITY"));
			Bean.setDEPTH_CK(rs.getString("DEPTH_CK"));
			Bean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
			Bean.setCOMPLETION_DATE(rs.getString("COMPLETION_DATE"));
			Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			Bean.setWITH_ADDR_CK(rs.getString("WITH_ADDR_CK"));
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
			Bean.setSISUL_ADDR(rs.getString("SISUL_ADDR"));
			Bean.setADDR_CK(rs.getString("ADDR_CK"));
			Bean.setSISUL_ADDR_CK(rs.getString("SISUL_ADDR_CK"));
			Bean.setSAN_CK(rs.getString("SAN_CK"));
			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setSISUL_POST(rs.getString("SISUL_POST"));
			Bean.setSISUL_ADDR1(rs.getString("SISUL_ADDR1"));
			Bean.setSISUL_ADDR2(rs.getString("SISUL_ADDR2"));
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setROAD_ADDR(rs.getString("ROAD_ADDR"));
			Bean.setROAD_BON(rs.getString("ROAD_BON"));
			Bean.setROAD_BU(rs.getString("ROAD_BU"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setREGDATE(rs.getString("REGDATE"));
		
        	return	Bean;
        }
    }
    
    //	점용지 정보
    protected	class	Jumji_View2	extends	MappingSqlQuery
    {
        protected 	Jumji_View2(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.saewe.Jumji_View2"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceBean	Bean	= new PlaceBean();

			Bean.setCORP_CD(rs.getString("CORP_CD"));
			Bean.setGU_CODE(rs.getString("GU_CODE"));			
			Bean.setOBJECT_NO(rs.getString("OBJECT_NO"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setSPC_CD(rs.getString("SPC_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setWORK_FROMDATE(rs.getString("WORK_FROMDATE"));
			Bean.setWORK_TODATE(rs.getString("WORK_TODATE"));
			Bean.setFINISH_DATE(rs.getString("FINISH_DATE"));
			Bean.setSTRUTS(rs.getString("STRUTS"));
			Bean.setEXE_INFO(rs.getString("EXE_INFO"));
			Bean.setPURPOSESEBU_CD(rs.getString("PURPOSESEBU_CD"));
			Bean.setSTANDARD(rs.getString("STANDARD"));
			Bean.setQUANTITY(rs.getString("QUANTITY"));
			Bean.setDEPTH_CK(rs.getString("DEPTH_CK"));
			Bean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
			Bean.setCOMPLETION_DATE(rs.getString("COMPLETION_DATE"));
			Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			Bean.setWITH_ADDR_CK(rs.getString("WITH_ADDR_CK"));
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
			Bean.setSISUL_ADDR(rs.getString("SISUL_ADDR"));
			Bean.setADDR_CK(rs.getString("ADDR_CK"));
			Bean.setSISUL_ADDR_CK(rs.getString("SISUL_ADDR_CK"));
			Bean.setSAN_CK(rs.getString("SAN_CK"));
			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setSISUL_POST(rs.getString("SISUL_POST"));
			Bean.setSISUL_ADDR1(rs.getString("SISUL_ADDR1"));
			Bean.setSISUL_ADDR2(rs.getString("SISUL_ADDR2"));
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setTAX_SET_NM(rs.getString("TAX_SET_NM"));
			Bean.setPURPOSESEBU_NM(rs.getString("PURPOSESEBU_NM"));
			Bean.setRN(rs.getString("RN"));
			
        	return	Bean;
        }
    }
    
    
    //	부과정보 세부보기
    protected	class	Bugwa_View	extends	MappingSqlQuery
    {
        protected 	Bugwa_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.saewe.Bugwa_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	TaxationBean	Bean	= new TaxationBean();
        	
        	try{

        	Bean.setSIGU_CD(rs.getString("SIGU_CD"));						//시구코드  q
        	Bean.setTAX_CD(rs.getString("TAX_CD"));							//세목코드
        	Bean.setTAX_YM(rs.getString("TAX_YM"));							//과세년월  q
        	Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));					//과세구분   q
        	Bean.setTAX_SET(rs.getString("TAX_SET"));						//시세/구세                    q
        	Bean.setDEPT_CD(rs.getString("DEPT_CD"));						//부서코드  q
        	Bean.setTAX_NO(rs.getString("TAX_NO"));							//과세번호  q
        //	Bean.setSIDO(rs.getString("SIDO"));								//시도코드
        	Bean.setTAXPAYER_ID(rs.getString("SSN"));				//납세자ID q
        	Bean.setTAXPAYER_NM(rs.getString("NAME"));						//납세자명  //q
        	Bean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));				//납세자구분 q
        	Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));					//수납부서코드
        	Bean.setTAX_DATE(rs.getString("TAX_DATE"));						//과세일자 q
			Bean.setINDATE(rs.getString("INDATE"));							//납기일자 q
			Bean.setOVERDATE(rs.getString("OVERDATE"));						//납기후일자 q
//			Bean.setNAPBU_YMD(rs.getString("TAX_DATE"));					//납부일자
			Bean.setBONSE(Integer.toString(rs.getInt("BONSE")));			//과세금액 q
			Bean.setSISE(rs.getString("SISE"));								//시세 q
			Bean.setGUSE(rs.getString("GUSE"));								//구세 q
			Bean.setGUKSE(rs.getString("GUKSE"));						    //국세 q
			Bean.setGIGUM(rs.getString("GIGUM"));							//기금 q		
			Bean.setHP(rs.getString("HP"));									//납세자휴대폰번호
			Bean.setTEL(rs.getString("TEL"));								//납세자전화번호
			Bean.setTOHP(rs.getString("TOHP"));									//납세자휴대폰번호  q
			Bean.setTOTEL(rs.getString("TOTEL"));								//납세자전화번호  q
			Bean.setTOPOST(rs.getString("TOPOST"));								//납세자우편번호  q
			Bean.setTOADDR1(rs.getString("TOADDR1"));                       //납세자 주소
			Bean.setTOADDR2(rs.getString("TOADDR2"));					//납세자 상세주소
//			Bean.setEMAIL(rs.getString("EMAIL"));							//납세자EMAIL
			Bean.setPOST(rs.getString("POST"));								//납세자우편번호 q
			Bean.setADDR1(rs.getString("ADDR1"));							//납세자우편번호주소 q
			Bean.setADDR2(rs.getString("ADDR2"));							//납세자상세주소 q
			Bean.setROAD_ADD(rs.getString("ROAD_ADDR"));						//납세자도로명주소 q
			Bean.setLIVE(rs.getString("LIVE"));								//거주상태   q
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//물건구분  q
//			Bean.setBD_NM(rs.getString("BD_NM"));							//물건명
//			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//물건OCR시구코드
//			Bean.setBJ_CD(rs.getString("BJ_CD"));							//물건법정동리코드
//			Bean.setSPC_CD(rs.getString("SPC_CD"));							//물건특수지코드
//			Bean.setBONBUN(rs.getString("BONBUN"));							//물건본번
//			Bean.setBUBUN(rs.getString("BUBUN"));							//물건부번
//			Bean.setTONG(rs.getString("TONG"));								//물건통
//			Bean.setBAN(rs.getString("BAN"));								//물건반
////			Bean.setMUL_APT_NM(rs.getString("BD_NM"));						//물건아파트명
//			Bean.setBD_DONG(rs.getString("BD_DONG"));						//물건동
//			Bean.setBD_HO(rs.getString("BD_HO"));							//물건호
//			Bean.setMUL_POST(rs.getString("MUL_POST"));						//물건우편번호
//			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR1"));					//물건우편번호주소
//			Bean.setNEAR_ADDR2(rs.getString("WITH_ADDR2"));					//물건상세주소
//			Bean.setHJ_CD(rs.getString("HJ_CD"));							//행정동코드
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//항목1(조정산출식)
	//		Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//항목2(점용목적)
	//		Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//항목3(지목)
	//		Bean.setUSE_DATE(rs.getString("MUL_FROMDATE")+"~"+rs.getString("MUL_TODATE"));//항목4(사용기간)
	//		Bean.setAREA(rs.getString("AREA"));							    //항목5(점용면적)
			

			Bean.setADD_SET(rs.getString("ADD_SET"));                       //가산율구분 q
			Bean.setRATE(Integer.toString(rs.getInt("RATE")));			    //특별이율 		 q
			Bean.setRATE_CAUSE(rs.getString("RATE_CAUSE"));					//특별이율적용사유 q
			Bean.setNOTES(rs.getString("NOTES"));						    //비고   q
			Bean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));				//OCR시구코드
			Bean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));				//OCR부서코드
			Bean.setVAT(Integer.toString(rs.getInt("VAT")));				//부가가시체금액 q
			Bean.setADD_YN(rs.getString("ADD_YN"));							//가산금면제여부	 q
			Bean.setLIMIT_SUM(Integer.toString(rs.getInt("LIMIT_SUM")));   //q
			Bean.setLIMIT_CNT(Integer.toString(rs.getInt("LIMIT_CNT")));  //q
			Bean.setTAX_CD_GU(rs.getString("TAX_CD_GU"));  //q
			Bean.setTAX_CD_SE(rs.getString("TAX_CD_SE"));  //q
			Bean.setBUNNAP_NO(rs.getString("BUNNAP_NO"));  //q
			Bean.setGU_NM(rs.getString("GU_NM"));  // q
			Bean.setDEPT_NM(rs.getString("DEPT_NM"));  // q
		
			//임시로 처리. 나중에 바꿔야 할듯. 
			if(rs.getString("TAX_GUBUN") =="1" || rs.getString("TAX_GUBUN").equals("1")){
			Bean.setFORM1(rs.getString("FORM1")); //q
			Bean.setFORM2(rs.getString("FORM2")); //q
			}
			
			Bean.setINTAX(Integer.toString(rs.getInt("INTAX")));  //q
			Bean.setOVERTAX(Integer.toString(rs.getInt("OVERTAX"))); //q
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setGU_CODE(rs.getString("GU_CODE"));    //q
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setSUSI_NO(rs.getString("SUSI_NO"));
		
			Bean.setUSE_DATE(rs.getString("FROMDATE")+" ~ "+rs.getString("TODATE"));
			Bean.setTO_LNBR1(rs.getString("TO_LNBR1"));
			Bean.setTO_LNBR2(rs.getString("TO_LNBR2"));
			Bean.setTO_SPC_CD(rs.getString("TO_SPC_CD"));
			Bean.setSPC_CD(rs.getString("SPC_CD"));
			
			
			
			

			
			
        	}catch(Exception e){
        		e.printStackTrace();
        	}
        	
				
			
			
        	return	Bean;
        }
    }
    
    //	부과정보 수정
    protected	class	Bugwa_Modify	extends	SqlUpdate
    {
    	protected	Bugwa_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.saewe.Bugwa_Modify"));
         
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
    
    //	부과정보 입력
    protected	class	Bugwa_Register	extends	SqlUpdate
    {
    	protected	Bugwa_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.saewe.Bugwa_Register"));
         
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
          	super(ds, msa.getMessage("Querys.facility.saewe.Bugwa_DataInfo"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SaeweBean	Bean	= new SaeweBean();

    		Bean.setGU_CODE(rs.getString("GU_CODE"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));			
			//Bean.setSUM(rs.getString("SUM"));
			Bean.setSUM_ADJUST(rs.getString("SUM"));
			Bean.setVAT(rs.getString("VAT"));
			Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
			Bean.setTODATE(NullCheck(rs.getString("TODATE")));
			
        	return	Bean;
        }
    }
    
    
    //	세외수입 부과		-	부과정보 테이블에 부과 여부 확인
    protected	class	SaeweSuipBugwa_Check	extends	MappingSqlQuery
    {
        protected 	SaeweSuipBugwa_Check(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.saewe.SaeweSuipBugwa_Check"));
          	
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
            super(ds, msa.getMessage("Querys.facility.saewe.SaeweSuipBugwa_Taxation_Info"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    //	세외수입 부과		-	산출내역합계 테이블에 부과 등록
    protected	class	SaeweSuipBugwa_Cal_Sum_Info	extends	SqlUpdate
    {
    	protected	SaeweSuipBugwa_Cal_Sum_Info(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.saewe.SaeweSuipBugwa_Cal_Sum_Info"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
        }
    }

    //	세외수입 부과		-	산출합계정보테이블에 부과등록여부 '1'세팅
    protected	class	SetCal_Sum_Info_taxseq	extends	SqlUpdate
    {
    	protected	SetCal_Sum_Info_taxseq(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.saewe.SetCal_Sum_Info_taxseq"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    //	세외수입 부과		-	연계이력 등록
    protected	class	SaeweSuipBugwa_History_Info	extends	SqlUpdate
    {
    	protected	SaeweSuipBugwa_History_Info(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.saewe.SaeweSuipBugwa_History_Info"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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
    protected class Purpose extends MappingSqlQuery
	{
		protected 	Purpose(DataSource ds, MessageSourceAccessor msa){
			super(ds, msa.getMessage("Querys.facility.saewe.GetPurpose"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          
		}
		protected	Object mapRow(ResultSet rs, int rownum) throws SQLException{
			TaxationBean	Bean	= new TaxationBean();
			Bean.setPURPOSE_NM(rs.getString("CLASS_NM"));
			
			return Bean;
		}
	}
    
    
    protected class GetSumQuantity extends MappingSqlQuery
	{
		protected 	GetSumQuantity(DataSource ds, MessageSourceAccessor msa){
			super(ds, msa.getMessage("Querys.facility.saewe.GetSumQuantity"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
          	
          
		}
		protected	Object mapRow(ResultSet rs, int rownum) throws SQLException{
			TaxationBean	Bean	= new TaxationBean();
			Bean.setAREA(rs.getString("AREA"));
			
			return Bean;
		}
	}
    //executeMinObjectNo
    
    protected class GetMinObjBunji extends MappingSqlQuery
	{
		protected 	GetMinObjBunji(DataSource ds, MessageSourceAccessor msa){
			super(ds, msa.getMessage("Querys.facility.saewe.GetMinObjBunji"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
          	
          
		}
		protected	Object mapRow(ResultSet rs, int rownum) throws SQLException{
			
			TaxationBean	Bean	= new TaxationBean();
			
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			
			return Bean;
		}
	}
    
}
