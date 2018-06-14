
package main.java.rojum.saewe.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.StringUtil;
import main.java.common.util.catUtil.Util;
import main.java.rojum.saewe.model.AppealBean;
import main.java.rojum.saewe.model.BugwaSearchBean;
import main.java.rojum.saewe.model.CalculationBean;
import main.java.rojum.saewe.model.PlaceBean;
import main.java.rojum.saewe.model.SaeweBean;
import main.java.rojum.saewe.model.SunapPenaltyBean;
import main.java.rojum.saewe.model.TaxationBean;


public class SaeweDao	extends RoadsJdbcDaoSupport	implements	ISaeweDao{
	
	private	Util				util			= new Util();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    //	검색
    public	List	executeSearch(BugwaSearchBean Bean)
	{
    	Search	search	= new Search(getDataSource(), getMessageSourceAccessor());
    	
    	if(Bean.getTAX_GUBUN().equals("")	||	Bean.getTAX_GUBUN() == null)
    		Bean.setTAX_GUBUN("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	if(Bean.getTAX_YN().equals("")	||	Bean.getTAX_YN() == null)
    		Bean.setTAX_YN("%");
    	if(Bean.getSUNAP_YN().equals("")	||	Bean.getSUNAP_YN() == null)
    		Bean.setSUNAP_YN("%");
    	if(Bean.getCAL_MODE().equals("")	||	Bean.getCAL_MODE() == null)
    		Bean.setCAL_MODE("%");
    	
    	String bonbun = Bean.getBONBUN();
    	String bubun = Bean.getBUBUN();
    	
    	if(bonbun.equals("")	||	bonbun == null)
    		bonbun = "%";
    	if(bubun.equals("")	||	bubun == null)
    		bubun = "%";

    	Object[] values = {
    			Bean.getYEAR(),
    			Bean.getTAX_GUBUN(),
    			Bean.getTAX_SET(),
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			
    			bonbun,
    			bubun,
    			"%" + Bean.getOWNER_NAME() + "%",
    			"%" + Bean.getGAPAN_NO() + "%",
    			Bean.getTAX_YN(),
    			
    			Bean.getSUNAP_YN(),
    			Bean.getSIGUNGU(),
    			Bean.getCAL_MODE()
    	};
    	
    	return search.execute(values);
	}
    protected	class	Search	extends	MappingSqlQuery
    {
        protected 	Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.Search"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR)); //YEAR
          	declareParameter(new SqlParameter(Types.VARCHAR)); //TAX_GUBUN
          	declareParameter(new SqlParameter(Types.VARCHAR)); //TAX_SET
         	declareParameter(new SqlParameter(Types.VARCHAR)); //BJ_CD
         	declareParameter(new SqlParameter(Types.VARCHAR)); //HJ_CD
         	
          	declareParameter(new SqlParameter(Types.VARCHAR)); //BONBUN
          	declareParameter(new SqlParameter(Types.VARCHAR)); //BUBUN
          	declareParameter(new SqlParameter(Types.VARCHAR)); //OWNER_NAME
          	declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
          	declareParameter(new SqlParameter(Types.VARCHAR)); //TAX_YN
          	
          	declareParameter(new SqlParameter(Types.VARCHAR)); //SUNAP
          	declareParameter(new SqlParameter(Types.VARCHAR)); //GU_CD
         	declareParameter(new SqlParameter(Types.VARCHAR)); //cal_mode
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SaeweBean	Bean	= new SaeweBean();
        	
        	/*System.out.println("Querys.rojum.saewe.Search");
        	System.out.println("Querys.rojum.saewe.Search");
        	System.out.println("Querys.rojum.saewe.Search");
        	System.out.println("Querys.rojum.saewe.Search");
        	System.out.println("Querys.rojum.saewe.Search");*/
        	
        	Bean.setADMIN_NO(rs.getString("GAPAN_NO"));
        	Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
        	Bean.setYEAR(rs.getString("YEAR"));
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
        	Bean.setNAME(rs.getString("OWNER_NAME"));
        	
        	Bean.setTAX_CD_NM(rs.getString("TAX_CD_NM"));
        	Bean.setTAX_YN(rs.getString("TAX_YN"));
        	Bean.setSUNAP_YN(rs.getString("SUNAP_YN"));
        	Bean.setTAX_NO(rs.getString("TAX_NO"));
        	Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
        	Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
        	
        	//Bean.setNAP_DZIP_CD(rs.getString("ZIP_CODE"));
        	//Bean.setNAP_DZIP_ADDR(rs.getString("SI")+" "+rs.getString("GUN")+" "+rs.getString("DORO_NM"));
        	//Bean.setNAP_DDTL_ADDR(rs.getString("BD_BON")+" "+rs.getString("BD_BU")+" "+rs.getString("BD_NM")+" "+rs.getString("BD_DET_NM"));
        	//Bean.setNAP_DREF_ADDR("");
        	
        	
        	Bean.setGP_TYP(rs.getString("GP_TYP"));
        	Bean.setFROMDATE(rs.getString("FROMDATE"));
        	Bean.setTODATE(rs.getString("TODATE"));
        	Bean.setTAX_SET(rs.getString("TAX_SET"));
        	Bean.setADDR(rs.getString("ADDR"));
        	
        	Bean.setSI(rs.getString("SI"));
        	Bean.setGUN(rs.getString("GUN"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
        	Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
        	
        	
        	Bean.setAREA_SIZE(rs.getString("AREA_SIZE"));
        	Bean.setTAX_CD(rs.getString("TAX_CD"));
        	Bean.setCAL_MODE(rs.getString("CAL_MODE"));
        	Bean.setSUM(rs.getString("SUM"));
        	Bean.setREPLY_GUBUN(rs.getString("REPLY_GUBUN"));
        	Bean.setREPLY_ETC(rs.getString("REPLY_ETC"));
        	Bean.setREPLY_DATE(StringUtil.addDash(rs.getString("REPLY_DATE")));
        	Bean.setREPLY_MANAGER(rs.getString("REPLY_MANAGER"));
        	
        	Bean.setINDATE(StringUtil.addDash(rs.getString("INDATE")));
        	Bean.setOVERDATE(StringUtil.addDash(rs.getString("OVERDATE")));
        	Bean.setSUNAP_DATE(StringUtil.addDash(rs.getString("SUNAP_DATE")));
       	
        	//********** BEGIN_KANG_20120704
        	Bean.setTAX_DATE(StringUtil.addDash(rs.getString("TAX_DATE")));
        	//********** END_KANG_20120704

        	return	Bean;
        }
    }
    
    //	전체 건수
    public	int		executeCount(BugwaSearchBean Bean)
	{
    	String	PURPOSE_CD	= Bean.getPURPOSE_CD();
    	
    	if(Bean.getTAX_GUBUN().equals("")	||	Bean.getTAX_GUBUN() == null)
    		Bean.setTAX_GUBUN("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	if(Bean.getTAX_YN().equals("")	||	Bean.getTAX_YN() == null)
    		Bean.setTAX_YN("%");
    	if(Bean.getSUNAP_YN().equals("")	||	Bean.getSUNAP_YN() == null)
    		Bean.setSUNAP_YN("%");
    	if(Bean.getCAL_MODE().equals("")	||	Bean.getCAL_MODE() == null)
    		Bean.setCAL_MODE("%");
    	
    	String bonbun = Bean.getBONBUN();
    	String bubun = Bean.getBUBUN();
    	 
    	if(bonbun.equals("")	||	bonbun == null)
    		bonbun = "%";
    	if(bubun.equals("")	||	bubun == null)
    		bubun = "%";
    	
    	Object[] values = {
    			Bean.getYEAR(),
    			Bean.getTAX_GUBUN(),
    			Bean.getTAX_SET(),
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			bonbun,
    			bubun,
    			"%" + Bean.getOWNER_NAME() + "%",
    			"%" + Bean.getGAPAN_NO() + "%",
    			Bean.getTAX_YN(),
    			Bean.getSUNAP_YN(),
    			Bean.getSIGUNGU(),
    			Bean.getCAL_MODE()
    	};
    	
    	for(int i =0;i<values.length;i++){
    		System.out.println("executeCount :::" + values[i]);
    	}
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.saewe.Count");
	
		return 	getJdbcTemplate().queryForInt(sql, values);
	}

    
    //	일괄부과를위한 부과정보조회
    public	List	executeSearch_Ilgwal(BugwaSearchBean Bean)
	{
    	Search_Ilgwal	searchIlgwal = new Search_Ilgwal(getDataSource(), getMessageSourceAccessor());
    	
    	String	PURPOSE_CD	= Bean.getPURPOSE_CD();
    	
    	Object[] values = {
    			Bean.getADMINNO(),
    			Bean.getSIDO(),
    			Bean.getSIGUNGU(),
    			Bean.getSEQ()
    	};
    	
    	for(int i =0;i<values.length;i++){
    		System.out.println("executeSearch_Ilgwal :::" + values[i]);
    	}

    	return searchIlgwal.execute(values);
	}
    protected	class	Search_Ilgwal	extends	MappingSqlQuery
    {
        protected 	Search_Ilgwal(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.Search_Ilgwal"));
          	
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
			Bean.setBONSE(Integer.toString(rs.getInt("BONSE")));			//과세금액
			Bean.setSISE(Integer.toString(rs.getInt("SISE")));				//시세
			Bean.setGUSE(Integer.toString(rs.getInt("GUSE")));				//구세
			Bean.setGUKSE(Integer.toString(rs.getInt("GUKSE")));			//국세
			Bean.setGIGUM(Integer.toString(rs.getInt("GIGUM")));			//기금
			Bean.setHP(rs.getString("OWNER_HP"));									//납세자휴대폰번호
			Bean.setTEL(rs.getString("OWNER_TEL"));								//납세자전화번호
			Bean.setPOST(rs.getString("OWNER_POST"));								//납세자우편번호
			Bean.setADDR1(rs.getString("OWNER_ADDR1"));							//납세자우편번호주소
			Bean.setADDR2(rs.getString("OWNER_ADDR2"));							//납세자상세주소
			Bean.setROAD_ADD(rs.getString("ROAD_INFO"));					//납세자도로명주소
			Bean.setLIVE(rs.getString("LIVE"));								//거주상태
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//물건구분
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//물건OCR시구코드
			Bean.setBJ_CD(rs.getString("BJ_CD"));							//물건법정동리코드
			Bean.setSPC_CD(rs.getString("SPC_CD"));							//물건특수지코드
			Bean.setBONBUN(rs.getString("BONBUN"));							//물건본번
			Bean.setBUBUN(rs.getString("BUBUN"));							//물건부번
			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR"));					//물건우편번호주소
			Bean.setHJ_CD(rs.getString("HJ_CD"));							//행정동코드
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//항목1(조정산출식)
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//항목2(점용목적)
			Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//항목3(지목)
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
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			
			Bean.setSEQ(rs.getString("SEQ"));
			
			Bean.setFROMDATE(util.Date_Paste(rs.getString("FROMDATE")));	//항목4-산출기간으로 수정
			Bean.setTODATE(util.Date_Paste(rs.getString("TODATE")));		//항목4-산출기간으로 수정
        	
        	return	Bean;
        }
    }
    
  //********** BEGIN_현진_20120227
    public	List	executeSearch_misunap(BugwaSearchBean Bean)
	{
    	Search_misunap	search = new Search_misunap(getDataSource(), getMessageSourceAccessor());
    	
    	if(Bean.getTAX_GUBUN().equals("")	||	Bean.getTAX_GUBUN() == null)
    		Bean.setTAX_GUBUN("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	if(Bean.getTAX_YN().equals("")	||	Bean.getTAX_YN() == null)
    		Bean.setTAX_YN("%");
    	if(Bean.getSUNAP_YN().equals("")	||	Bean.getSUNAP_YN() == null)
    		Bean.setSUNAP_YN("%");
    	if(Bean.getCAL_MODE().equals("")	||	Bean.getCAL_MODE() == null)
    		Bean.setCAL_MODE("%");
    	
    	String bonbun = Bean.getBONBUN();
    	String bubun = Bean.getBUBUN();
    	
    	if(bonbun.equals("")	||	bonbun == null)
    		bonbun = "%";
    	if(bubun.equals("")	||	bubun == null)
    		bubun = "%";

    	Object[] values = {
    			//********** BEGIN_KANG_20120704
    			//Bean.getYEAR(),
    			//********** END_KANG_20120704
    			
    			Bean.getTAX_GUBUN(),
    			Bean.getTAX_SET(),
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			
    			bonbun,
    			bubun,
    			"%" + Bean.getOWNER_NAME() + "%",
    			"%" + Bean.getGAPAN_NO() + "%",
    			Bean.getTAX_YN(),
    			
    			Bean.getSUNAP_YN(),
    			Bean.getSIGUNGU(),
    			Bean.getCAL_MODE()
    	};
    	
    	return search.execute(values);
	}
    protected	class	Search_misunap	extends	MappingSqlQuery
    {
        protected 	Search_misunap(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.misunap.Search"));
          	
          //********** BEGIN_KANG_20120704
          	//declareParameter(new SqlParameter(Types.VARCHAR)); //YEAR
          //********** END_KANG_20120704
          	
          	declareParameter(new SqlParameter(Types.VARCHAR)); //TAX_GUBUN
          	declareParameter(new SqlParameter(Types.VARCHAR)); //TAX_SET
         	declareParameter(new SqlParameter(Types.VARCHAR)); //BJ_CD
         	declareParameter(new SqlParameter(Types.VARCHAR)); //HJ_CD
         	
          	declareParameter(new SqlParameter(Types.VARCHAR)); //BONBUN
          	declareParameter(new SqlParameter(Types.VARCHAR)); //BUBUN
          	declareParameter(new SqlParameter(Types.VARCHAR)); //OWNER_NAME
          	declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
          	declareParameter(new SqlParameter(Types.VARCHAR)); //TAX_YN
          	
          	declareParameter(new SqlParameter(Types.VARCHAR)); //SUNAP
          	declareParameter(new SqlParameter(Types.VARCHAR)); //GU_CD
         	declareParameter(new SqlParameter(Types.VARCHAR)); //cal_mode
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SaeweBean	Bean	= new SaeweBean();
        	
        	Bean.setADMIN_NO(rs.getString("GAPAN_NO"));
        	Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
        	Bean.setYEAR(rs.getString("YEAR"));
        	
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
        	Bean.setNAME(rs.getString("OWNER_NAME"));
        	
        	Bean.setTAX_CD_NM(rs.getString("TAX_CD_NM"));
        	Bean.setTAX_YN(rs.getString("TAX_YN"));
        	Bean.setSUNAP_YN(rs.getString("SUNAP_YN"));
        	Bean.setTAX_NO(rs.getString("TAX_NO"));
        	Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
        	Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
        	
        	Bean.setGP_TYP(rs.getString("GP_TYP"));
        	Bean.setFROMDATE(rs.getString("FROMDATE"));
        	Bean.setTODATE(rs.getString("TODATE"));
        	Bean.setTAX_SET(rs.getString("TAX_SET"));
        	Bean.setADDR(rs.getString("ADDR"));
        	
        	Bean.setSI(rs.getString("SI"));
        	Bean.setGUN(rs.getString("GUN"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
        	Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
        	
        	
        	Bean.setAREA_SIZE(rs.getString("AREA_SIZE"));
        	Bean.setTAX_CD(rs.getString("TAX_CD"));
        	Bean.setCAL_MODE(rs.getString("CAL_MODE"));
        	Bean.setSUM(rs.getString("SUM"));
        	Bean.setREPLY_GUBUN(rs.getString("REPLY_GUBUN"));
        	Bean.setREPLY_ETC(rs.getString("REPLY_ETC"));
        	Bean.setREPLY_DATE(StringUtil.addDash(rs.getString("REPLY_DATE")));
        	Bean.setREPLY_MANAGER(rs.getString("REPLY_MANAGER"));
        	
        	Bean.setINDATE(StringUtil.addDash(rs.getString("INDATE")));
        	Bean.setOVERDATE(StringUtil.addDash(rs.getString("OVERDATE")));
        	Bean.setSUNAP_DATE(StringUtil.addDash(rs.getString("SUNAP_DATE")));

        	//********** BEGIN_KANG_20120704
        	Bean.setTAX_DATE(StringUtil.addDash(rs.getString("TAX_DATE")));
        	//********** END_KANG_20120704
        	return	Bean;
        }
    }
    
    //	전체 건수
    public	int		executeCount_misunap(BugwaSearchBean Bean)
	{
    	String	PURPOSE_CD	= Bean.getPURPOSE_CD();
    	
    	if(Bean.getTAX_GUBUN().equals("")	||	Bean.getTAX_GUBUN() == null)
    		Bean.setTAX_GUBUN("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	if(Bean.getTAX_YN().equals("")	||	Bean.getTAX_YN() == null)
    		Bean.setTAX_YN("%");
    	if(Bean.getSUNAP_YN().equals("")	||	Bean.getSUNAP_YN() == null)
    		Bean.setSUNAP_YN("%");
    	if(Bean.getCAL_MODE().equals("")	||	Bean.getCAL_MODE() == null)
    		Bean.setCAL_MODE("%");
    	
    	String bonbun = Bean.getBONBUN();
    	String bubun = Bean.getBUBUN();
    	 
    	if(bonbun.equals("")	||	bonbun == null)
    		bonbun = "%";
    	if(bubun.equals("")	||	bubun == null)
    		bubun = "%";
    	
    	Object[] values = {

    			//********** BEGIN_KANG_20120705
    			//Bean.getYEAR(),
    			//********** END_KANG_20120705    			
    			Bean.getTAX_GUBUN(),
    			Bean.getTAX_SET(),
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			bonbun,
    			bubun,
    			"%" + Bean.getOWNER_NAME() + "%",
    			"%" + Bean.getGAPAN_NO() + "%",
    			Bean.getTAX_YN(),
    			Bean.getSUNAP_YN(),
    			Bean.getSIGUNGU(),
    			Bean.getCAL_MODE()
    	};
    	
    	for(int i =0;i<values.length;i++){
    		System.out.println("executeCount :::" + values[i]);
    	}
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.saewe.misunap.Count");
	
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
  //********** END_현진_20120227
    //	산출내역 검색
    public	List	executeSanchulSearch(String strAdmin_no, String strSeq, int intRn1,int intRn2)
	{
    	SanchulSearch	sanchulSearch	= new SanchulSearch(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq,
        	new Integer(intRn1),
        	new Integer(intRn2)
    	};
    	
    	for(int i = 0;i<values.length;i++){
    		System.out.println(" : executeSanchulSearch : "+values[i]);
    	}
    	
    	return sanchulSearch.execute(values);
	}
    protected	class	SanchulSearch	extends	MappingSqlQuery
    {
        protected 	SanchulSearch(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.SanchulSearch"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.INTEGER));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CalculationBean	Bean	= new CalculationBean();

        	Bean.setADMIN_NO(rs.getString("GAPAN_NO"));
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
    
    //	산출내역 전체 건수
    public	int		executeSanchulCount(String strAdmin_no, String strSeq)
	{
    	Object[] values = {
    			strAdmin_no,
    			strSeq
            };
    	
    	
    	for(int i = 0;i<values.length;i++){
    		System.out.println(" : executeSanchulCount : "+values[i]);
    	}
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.saewe.SanchulCount");
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    
    //	산출정보 자세히 보기
    public	List	executeSanchulInfo_View(String strAdmin_no, String strSeq)
	{
    	SanchulInfo_View	sanchulInfo_View	= new SanchulInfo_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	return sanchulInfo_View.execute(values);
	}
    protected	class	SanchulInfo_View	extends	MappingSqlQuery
    {
        protected 	SanchulInfo_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.SanchulInfo_View"));
          	
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
        	Bean.setAREA_AFTER(NullCheck(rs.getString("AREA")));
        	Bean.setRATE(String.valueOf(rs.getFloat("RATE")));
        	Bean.setSUM_ADJUST(NullCheck(rs.getString("SUM")));
        	Bean.setFROMDATE(NullCheck(rs.getString("FROMDATE")));
        	Bean.setTODATE(NullCheck(rs.getString("TODATE")));
        	Bean.setFORM_ADJUST(NullCheck(rs.getString("FORM_ADJUST")));
        
        	return	Bean;
        }
    }
    
    //	점용인정보 보기
    public	List	executeJumin_View(String strAdmin_no)
	{
    	Jumin_View	jumin_View	= new Jumin_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumin_View.execute(values);
	}
    protected	class	Jumin_View	extends	MappingSqlQuery
    {
        protected 	Jumin_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.Jumin_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();
        	
        	Bean.setADMIN_NO(rs.getString("GAPAN_NO"));
  			Bean.setNAME(rs.getString("OWNER_NAME"));
			Bean.setSSN(rs.getString("OWNER_SSN"));
			Bean.setPOST(rs.getString("OWNER_POST"));
			Bean.setADDR1(rs.getString("OWNER_ADDR1"));
			Bean.setADDR2(rs.getString("OWNER_ADDR2"));
			Bean.setTEL(rs.getString("OWNER_TEL"));
			Bean.setHP(rs.getString("OWNER_HP"));
			Bean.setTOPOST(rs.getString("OWNER_HP"));
			Bean.setTOADDR1(rs.getString("OWNER_TOADDR1"));
			Bean.setTOADDR2(rs.getString("OWNER_TOADDR2"));
			
        	return	Bean;
        }
    }
    
    //	점용지정보 보기
    public	List	executeJumji_View(String strAdmin_no)
	{
    	Jumji_View	jumji_View	= new Jumji_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumji_View.execute(values);
	}
    
    protected	class	Jumji_View	extends	MappingSqlQuery
    {
        protected 	Jumji_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.Jumji_View"));
          	
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
			Bean.setROAD_ADD(rs.getString("ROAD_INFO"));
			Bean.setWITH_ADDR1(rs.getString("WITH_ADDR"));
			
        	return	Bean;
        }
    }
    
    //	부과정보 상세보기
    public	List	executeBugwa_View(String strAdmin_no, String strSeq)
	{
    	Bugwa_View	bugwa_View	= new Bugwa_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	for(int i = 0;i<values.length;i++){
    		System.out.println("executeBugwa_View"+values[i]);
    	}
    	
    	return bugwa_View.execute(values);
	}
    protected	class	Bugwa_View	extends	MappingSqlQuery
    {
        protected 	Bugwa_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.Bugwa_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	TaxationBean	Bean	= new TaxationBean();
        	
        	System.out.println(rownum);
        	
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
			Bean.setBONSE(Integer.toString(rs.getInt("BONSE")));			//과세금액
			Bean.setSISE(Integer.toString(rs.getInt("SISE")));				//시세
			Bean.setGUSE(Integer.toString(rs.getInt("GUSE")));				//구세
			Bean.setGUKSE(Integer.toString(rs.getInt("GUKSE")));			//국세
			Bean.setGIGUM(Integer.toString(rs.getInt("GIGUM")));			//기금
			Bean.setHP(rs.getString("OWNER_HP"));							//납세자휴대폰번호
			Bean.setTEL(rs.getString("OWNER_TEL"));							//납세자전화번호
			Bean.setPOST(rs.getString("OWNER_TOPOST"));						//납세자우편번호
			Bean.setADDR1(rs.getString("OWNER_TOADDR1"));						//납세자우편번호주소
			if(rs.getString("OWNER_TOSAN") == null|| !rs.getString("OWNER_TOSAN").equals("1")){
				Bean.setADDR2(rs.getString("OWNER_TOJIBUN"));						//납세자상세주소
			}else{
				Bean.setADDR2("산 " + rs.getString("OWNER_TOJIBUN"));		
			}
			
			if(rs.getString("OWNER_TOADDR2") == null){
			}else{
				Bean.setADDR2(Bean.getADDR2() + " " + rs.getString("OWNER_TOADDR2"));	
			}
			
			Bean.setROAD_ADD(rs.getString("ROAD_INFO"));					//납세자도로명
			//********** BEGIN_현진_20120213									// 납세자 우편물 도로명주소
			Bean.setSI(rs.getString("TSI"));
			Bean.setGUN(rs.getString("TGUN"));
			Bean.setDORO_NM(rs.getString("TDORO_NM"));
			Bean.setBD_NM(rs.getString("TBD_NM"));
			Bean.setBD_DET_NM(rs.getString("TBD_DET_NM"));
			Bean.setBD_BON(rs.getString("TBD_BON"));
			Bean.setBD_BU(rs.getString("TBD_BU"));			
			//********** END_현진_20120213

			Bean.setLIVE(rs.getString("LIVE"));								//거주상태
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//물건구분
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//물건OCR시구코드
			Bean.setBJ_CD(rs.getString("BJ_CD"));							//물건법정동리코드
			Bean.setSPC_CD(rs.getString("SPC_CD"));							//물건특수지코드
			Bean.setBONBUN(rs.getString("BONBUN"));							//물건본번
			Bean.setBUBUN(rs.getString("BUBUN"));							//물건부번
			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR"));					//물건우편번호주소
			Bean.setHJ_CD(rs.getString("HJ_CD"));							//행정동코드
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//항목1(조정산출식)
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//항목2(점용목적)
			Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//항목3(지목)
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
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			
			Bean.setFROMDATE(util.Date_Paste(rs.getString("FROMDATE")));	//항목4-산출기간으로 수정
			Bean.setTODATE(util.Date_Paste(rs.getString("TODATE")));		//항목4-산출기간으로 수정
			//********** BEGIN_KANG_20120705
			Bean.setBEFORE_SEQ(rs.getString("BEFORE_SEQ"));
			Bean.setBEFORE_YEAR(rs.getString("BEFORE_YEAR"));
			//********** END_KANG_20120705
        	return	Bean;
        }
    }
    
    
    //	부과정보 수정
    public	boolean	executeBugwa_Modify(TaxationBean Bean)
	{
    	Bugwa_Modify	bugwa_Modify	= new Bugwa_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{	
			Object[] values = {
					Bean.getTAX_NO(),
					Bean.getTAX_GUBUN(),
					Bean.getTAX_YM(),
					Bean.getTAX_CD(),
					Bean.getSIGU_CD(),
					Bean.getDEPT_CD(),
					Bean.getTAXPAYER_SET(),
					Bean.getLIVE(),
					Bean.getOBJ_SET(),
					Bean.getBONSE(),
					Bean.getVAT(),
					Bean.getTAX_DATE(),
					Bean.getINTAX(),
					Bean.getINDATE(),
					Bean.getOVERTAX(),
					Bean.getOVERDATE(),
					Bean.getADD_SET(),
					Bean.getADD_YN(),
					Bean.getNOTES(),
					Bean.getLIMIT_SUM(),
					Bean.getLIMIT_CNT(),
					Bean.getRATE(),
					Bean.getRATE_CAUSE(),
					Bean.getSISE(),
					Bean.getGIGUM(),
					Bean.getGUKSE(),
					Bean.getGUSE(),
					
					Bean.getSUBUSEO_CD(),
					Bean.getOCR_SIGU_CD(),
					Bean.getOCR_BUSEO_CD(),	
					
					Bean.getADMIN_NO(),
					Bean.getSEQ()
			};

			bugwa_Modify.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    protected	class	Bugwa_Modify	extends	SqlUpdate
    {
    	protected	Bugwa_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.Bugwa_Modify"));
         
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
    public	boolean	executeBugwa_Register(TaxationBean Bean)
	{
    	Bugwa_Register	bugwa_Register	= new Bugwa_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getADMIN_NO(),
					Bean.getTAX_NO(),
					Bean.getTAX_GUBUN(),
					Bean.getTAX_YM(),
					Bean.getTAX_CD(),
					Bean.getSIGU_CD(),
					Bean.getDEPT_CD(),
					Bean.getTAXPAYER_SET(),
					Bean.getLIVE(),
					Bean.getOBJ_SET(),
					Bean.getBONSE(),
					Bean.getVAT(),
					Bean.getTAX_DATE(),
					Bean.getINTAX(),
					Bean.getINDATE(),
					Bean.getOVERTAX(),
					Bean.getOVERDATE(),
					Bean.getADD_SET(),
					Bean.getADD_YN(),
					Bean.getNOTES(),
					Bean.getLIMIT_SUM(),
					Bean.getLIMIT_CNT(),
					Bean.getRATE(),
					Bean.getRATE_CAUSE(),
					Bean.getYEAR(),
					Bean.getSEQ(),
					Bean.getSISE(),
					Bean.getGIGUM(),
					Bean.getGUKSE(),
					Bean.getGUSE(),
					Bean.getSUBUSEO_CD(),
					Bean.getOCR_SIGU_CD(),
					Bean.getOCR_BUSEO_CD()
				};
			//system.out.println("values="+values);
			bugwa_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    protected	class	Bugwa_Register	extends	SqlUpdate
    {
    	protected	Bugwa_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.Bugwa_Register"));
         
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
    public	List	executeBugwa_DataInfo(String strAdmin_no, String strSeq)
	{
    	Bugwa_DataInfo	bugwa_DataInfo	= new Bugwa_DataInfo(getDataSource(), getMessageSourceAccessor());
    	System.out.println("strAdmin_no -=->" + strAdmin_no);
    	System.out.println("strSeq -=->" + strSeq);
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	return bugwa_DataInfo.execute(values);
	}
    
    protected	class	Bugwa_DataInfo	extends	MappingSqlQuery
    {
        protected 	Bugwa_DataInfo(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.Bugwa_DataInfo"));
          	
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
    

    //	세외수입 부과		-	부과정보 테이블에 부과 여부 확인
    public	List	SaeweSuipBugwa_Check(String strAdmin_no, String strSeq)
	{
    	SaeweSuipBugwa_Check	saeweSuipBugwa_Check	= new SaeweSuipBugwa_Check(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    	return saeweSuipBugwa_Check.execute(values);
	}
    
    protected	class	SaeweSuipBugwa_Check	extends	MappingSqlQuery
    {
        protected 	SaeweSuipBugwa_Check(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.SaeweSuipBugwa_Check"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	return	rs.getString("TAX_YN");
        }
    }
    
    
    //	세외수입 부과		-	부과정보 테이블에 부과 등록
    public	boolean	SaeweSuipBugwa_Taxation_Info(String strAdmin_no, String strSeq, String InsertKey)
	{
    	SaeweSuipBugwa_Taxation_Info	saeweSuipBugwa_Taxation_Info	= new SaeweSuipBugwa_Taxation_Info(getDataSource(), getMessageSourceAccessor());	
    	
		try
		{
	    	Object[] values = {
	    			InsertKey,
	        		strAdmin_no,
	        		strSeq
	        	};
	    	System.out.println("InsertKey ==>"+InsertKey);
	    	System.out.println("strAdmin_no ==>"+strAdmin_no);
	    	System.out.println("strSeq ==>"+strSeq);
	    	saeweSuipBugwa_Taxation_Info.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    protected	class	SaeweSuipBugwa_Taxation_Info	extends	SqlUpdate
    {
    	protected	SaeweSuipBugwa_Taxation_Info(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.SaeweSuipBugwa_Taxation_Info"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
  //********** BEGIN_KANG_20120705
    //	세외수입 부과		-	부과정보 테이블에 부과 등록
    public	boolean	SaeweSuipBugwa_Taxation_Info_Before(String strAdmin_no, String strBeforeSeq, String BeforeYear)
	{
    	SaeweSuipBugwa_Taxation_Info_Before	saeweSuipBugwa_Taxation_Info_Before	= new SaeweSuipBugwa_Taxation_Info_Before(getDataSource(), getMessageSourceAccessor());	
    	
		try
		{
	    	Object[] values = {
	    			strAdmin_no,
	    			strBeforeSeq,
	    			BeforeYear
	        	};
	    	System.out.println("strAdmin_no ==>"+strAdmin_no);
	    	System.out.println("strBeforeSeq ==>"+strBeforeSeq);
	    	System.out.println("BeforeYear ==>"+BeforeYear);
	    	saeweSuipBugwa_Taxation_Info_Before.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    protected	class	SaeweSuipBugwa_Taxation_Info_Before	extends	SqlUpdate
    {
    	protected	SaeweSuipBugwa_Taxation_Info_Before(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.SaeweSuipBugwa_Taxation_Info_Before"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    
  //********** END_KANG_20120705

    
    
    //	세외수입 부과		-	어드민정보 테이블에 부과 등록
    public	boolean	SaeweSuipBugwa_Admin_Base(String strAdmin_no, String strSeq)
	{
    	SaeweSuipBugwa_Admin_Base	saeweSuipBugwa_Admin_Base	= new SaeweSuipBugwa_Admin_Base(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
	    	Object[] values = {
	        	strAdmin_no	
	    	};

	    	saeweSuipBugwa_Admin_Base.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}

    protected	class	SaeweSuipBugwa_Admin_Base	extends	SqlUpdate
    {
    	protected	SaeweSuipBugwa_Admin_Base(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.SaeweSuipBugwa_Admin_Base"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    //	세외수입 부과		-	cal_sum_info tax_seq를 seq로 set
    public	boolean	SetCal_Sum_Info_taxseq(String strSeq)
	{
    	SetCal_Sum_Info_taxseq	SetCal_Sum_Info_taxseq	= new SetCal_Sum_Info_taxseq(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
	    	Object[] values = {
	    			strSeq,
	    			strSeq
	        	};

	    	SetCal_Sum_Info_taxseq.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    //	세외수입 부과		-	cal_sum_info tax_seq를 1로 set
    protected	class	SetCal_Sum_Info_taxseq	extends	SqlUpdate
    {
    	protected	SetCal_Sum_Info_taxseq(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.SetCal_Sum_Info_taxseq"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    public	String	executeBugwa_Id(String user_id)
	{
    	Object[] values = {user_id};
  	
    	String sql = getMessageSourceAccessor().getMessage("Querys.rojum.saewe.Bugwa_Id");

		Map Request_Map =  getJdbcTemplate().queryForMap(sql, values);
		return Request_Map.get("INSARANGKEY").toString();
	}
    
    //	부과정보 상세보기
    public	List	executeBugwa_View_GpTyp(String strAdmin_no, String strSeq)
	{
    	Bugwa_View_GpTyp	bugwa_View	= new Bugwa_View_GpTyp(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    		strAdmin_no,
    		strSeq
    	};
    	
    		return bugwa_View.execute(values);
    }
    
    protected	class	Bugwa_View_GpTyp	extends	MappingSqlQuery
    {
        protected 	Bugwa_View_GpTyp(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.Bugwa_View_GpTyp"));
          	
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
        	Bean.setTAXPAYER_ID(rs.getString("TAXPAYER_ID"));				//납세자ID
        	Bean.setTAXPAYER_NM(rs.getString("OWNER_NAME"));				//납세자명
        	Bean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));				//납세자구분
        	Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));					//수납부서코드
			Bean.setTAX_DATE(rs.getString("TAX_DATE"));						//과세일자
			Bean.setINDATE(rs.getString("INDATE"));							//납기일자
			Bean.setOVERDATE(rs.getString("OVERDATE"));						//납기후일자
			Bean.setBONSE(Integer.toString(rs.getInt("BONSE")));			//과세금액
			Bean.setSISE(Integer.toString(rs.getInt("SISE")));				//시세
			Bean.setGUSE(Integer.toString(rs.getInt("GUSE")));				//구세
			Bean.setGUKSE(Integer.toString(rs.getInt("GUKSE")));			//국세
			Bean.setGIGUM(Integer.toString(rs.getInt("GIGUM")));			//기금
			Bean.setHP(rs.getString("OWNER_HP"));							//납세자휴대폰번호
			Bean.setTEL(rs.getString("OWNER_TEL"));							//납세자전화번호
			Bean.setPOST(rs.getString("OWNER_POST"));						//납세자우편번호
			Bean.setADDR1(rs.getString("OWNER_ADDR1"));						//납세자우편번호주소
			Bean.setADDR2(rs.getString("OWNER_ADDR2"));						//납세자상세주소
			Bean.setROAD_ADD(rs.getString("ROAD_INFO"));					//납세자도로명주소
			Bean.setLIVE(rs.getString("LIVE"));								//거주상태
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));						//물건구분
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));						//물건OCR시구코드
			Bean.setBJ_CD(rs.getString("BJ_CD"));							//물건법정동리코드
			Bean.setSPC_CD(rs.getString("SPC_CD"));							//물건특수지코드
			Bean.setBONBUN(rs.getString("BONBUN"));							//물건본번
			Bean.setBUBUN(rs.getString("BUBUN"));							//물건부번
			Bean.setNEAR_ADDR1(rs.getString("WITH_ADDR"));					//물건우편번호주소
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));				//항목1(조정산출식)
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));					//항목2(점용목적)
			Bean.setTYPE_NM(rs.getString("TYPE_NM"));						//항목3(지목)
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
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			
			Bean.setFROMDATE(util.Date_Paste(rs.getString("FROMDATE")));	//항목4-산출기간으로 수정
			Bean.setTODATE(util.Date_Paste(rs.getString("TODATE")));		//항목4-산출기간으로 수정
			
        	return	Bean;
        }
    }
    
    public	List executeBugwa_DataInfo_GpTyp(String strAdmin_no, String strSeq)
	{
    	Bugwa_DataInfo_GpTyp	bugwa_DataInfo	= new Bugwa_DataInfo_GpTyp(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no,strSeq};
    	
    	for(int i = 0 ; i < values.length ; i++){
    		System.out.println(" : : : "+values[i]);
    	}
    	
    	return bugwa_DataInfo.execute(values);
	}
    
    protected	class	Bugwa_DataInfo_GpTyp	extends	MappingSqlQuery
    {
        protected 	Bugwa_DataInfo_GpTyp(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.Bugwa_DataInfo_GpTyp"));
          	
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
    
    //	수납정보 업데이트
    public boolean executeSunapProduct(String gapanNo, String seq, String returnDate){
    	ExecuteSunapProduct	objExecuteSunapProduct	= new ExecuteSunapProduct(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
	    	Object[] values = {returnDate,gapanNo,seq};

	    	objExecuteSunapProduct.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
		

	}
    

    protected	class	ExecuteSunapProduct	extends	SqlUpdate
    {
    	protected	ExecuteSunapProduct(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.ExecuteSunapProduct"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
           
        }
    }
    
	public void GapanInfoTaxationAt(String gapanNo, String seq){
		try{
			Object[] values = {gapanNo,seq,gapanNo};
			String sql = getMessageSourceAccessor().getMessage("Querys.rojum.saewe.GapanInfoTaxationAt");
			getJdbcTemplate().update(sql, values);
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	
	public List executeSearchPenaltyIlgwal(String gu_cd){
		
		System.out.println("executeSearchPenaltyIlgwal START");
		
    	SearchPenaltyIlgwal	objSearchPenaltyIlgwal	= new SearchPenaltyIlgwal(getDataSource(), getMessageSourceAccessor());
    	
    	List retVal = null;
    	
		try
		{
			Object[] values = {gu_cd};

			retVal = objSearchPenaltyIlgwal.execute(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("executeSearchPenaltyIlgwal END");
		
		return retVal;
    	
    	
	}
	
    protected	class	SearchPenaltyIlgwal	extends	MappingSqlQuery
    {
        protected 	SearchPenaltyIlgwal(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.rojum.saewe.SearchPenaltyIlgwal"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SunapPenaltyBean Bean	= new SunapPenaltyBean();
        	Bean.setFAILTOPAY(rs.getString("FAILTOPAY"));
        	Bean.setROJUM_ADDR(rs.getString("ROJUM_ADDR"));
        	Bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
        	Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
        	Bean.setAREA_AFTER(rs.getString("AREA_AFTER"));
        	Bean.setPRICE(rs.getString("PRICE"));
        	Bean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
        	Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
        	Bean.setSIGU_CD(rs.getString("SIGU_CD"));
        	Bean.setBJ_CD(rs.getString("BJ_CD"));
        	Bean.setTAX_NO(rs.getString("TAX_NO"));
        	Bean.setDEPT_CD(rs.getString("DEPT_CD"));
        	Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
        	Bean.setTAX_YM(rs.getString("TAX_YM"));
        	Bean.setINDATE(rs.getString("INDATE"));
        	Bean.setOVERDATE(rs.getString("OVERDATE"));
        	Bean.setTAX_DATE(rs.getString("TAX_DATE"));
        	Bean.setADD_SET(rs.getString("ADD_SET"));
        	Bean.setADD_YN(rs.getString("ADD_YN"));
        	Bean.setBONSE(rs.getString("BONSE"));
        	Bean.setVAT(rs.getString("VAT"));
        	Bean.setOVERTAX(rs.getString("OVERTAX"));
        	Bean.setFORM1(rs.getString("FORM1"));
        	Bean.setFORM2(rs.getString("FORM2"));
        	Bean.setYEAR(rs.getString("YEAR"));
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));
        	Bean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));
        	Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
        	Bean.setTAX_CD(rs.getString("TAX_CD"));
        	Bean.setCAL_MODE(rs.getString("CAL_MODE"));
        	Bean.setSUNAP_YN(rs.getString("SUNAP_YN"));
        	Bean.setSUNAP_DATE(rs.getString("SUNAP_DATE"));
        	Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
        	Bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
        	Bean.setOWNER_HP(rs.getString("OWNER_HP"));
        	Bean.setGP_TYP(rs.getString("GP_TYP"));
        	Bean.setWITH_PNU(rs.getString("WITH_PNU"));
        	Bean.setSECTION(rs.getString("SECTION"));
        	Bean.setLT_SEL_YN(rs.getString("LT_SEL_YN"));
        	Bean.setORG_PRICE(rs.getString("ORG_PRICE"));
        	Bean.setLT_SEL_NM(rs.getString("LT_SEL_NM"));
        	
        	return	Bean;
        }
    }
	
	// CALCULATION_INFO 시퀀스 증가값
	public int getCalculationSequence() {

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.GetCalculationSequence");

		int result = getJdbcTemplate().queryForInt(sql);

		// System.out.println(result);

		return result;
	}
	
	// CAL_SUM_INFO 시퀀스 증가값
	public int getCal_Sum_Seq() {

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.GetCAL_SUM_SEQ");
		int result = getJdbcTemplate().queryForInt(sql);
		return result;
	}

	public boolean insertReCalculationInfo(String calSeq, String calSumSeq, String gapanNo, String orgSeq) {
    	InsertReCalculationInfo	objInsertReCalculationInfo	= new InsertReCalculationInfo(getDataSource(), getMessageSourceAccessor());	
    	
		try
		{
	    	Object[] values = {
	    			calSeq,
	    			calSeq,
	    			calSumSeq,
	    			gapanNo,
	    			orgSeq
	        	};
	    	
	    	objInsertReCalculationInfo.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
	
    protected	class	InsertReCalculationInfo	extends	SqlUpdate
    {
    	protected	InsertReCalculationInfo(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.InsertReCalculationInfo"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
	
    // 새 산출정보 생성 Cal_Sum_Info
	public boolean insertReCalSumInfo(String calSumSeq, String gapanNo, String orgSeq) {
    	InsertReCalSumInfo	objInsertReCalSumInfo	= new InsertReCalSumInfo(getDataSource(), getMessageSourceAccessor());	
    	
		try
		{
	    	Object[] values = {
	    			calSumSeq,
	    			calSumSeq,
	    			gapanNo,
	    			orgSeq
	        	};
	    	
	    	objInsertReCalSumInfo.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}

    protected	class	InsertReCalSumInfo extends SqlUpdate
    {
    	protected	InsertReCalSumInfo(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.InsertReCalSumInfo"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }

    // 새 산출정보 생성 Taxation_Info
	public boolean insertReTaxationInfo(String calSumSeq, String taxDate, String inDate, String overDate, String gapanNo, String orgSeq) {
		
    	InsertReTaxationInfo	objInsertReTaxationInfo	= new InsertReTaxationInfo(getDataSource(), getMessageSourceAccessor());	
    	
		try
		{
	    	Object[] values = {
	    			taxDate,
	    			inDate,
	    			overDate,
	    			taxDate,
	    			calSumSeq,
	    			calSumSeq,
	    			gapanNo,
	    			orgSeq,
	    			calSumSeq
	        	};
	    	
	    	objInsertReTaxationInfo.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
	
    protected	class	InsertReTaxationInfo extends SqlUpdate
    {
    	protected	InsertReTaxationInfo(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.InsertReTaxationInfo"));
         
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
	
	
	public boolean setSubmitReply(String gapanNo,String seq,String replyGubun,String reply_etc) {
		
    	SetSubmitReply	setSubmitReply	= new SetSubmitReply(getDataSource(), getMessageSourceAccessor());	
    	
		try
		{
	    	Object[] values = {replyGubun, reply_etc, gapanNo, seq};
	    	
	    	setSubmitReply.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
	
	protected	class	SetSubmitReply extends SqlUpdate
    {
    	protected	SetSubmitReply(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.rojum.saewe.SetSubmitReply"));
         
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
}
