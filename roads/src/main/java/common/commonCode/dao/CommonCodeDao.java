//	2009		Kim Yun Seo

package main.java.common.commonCode.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import main.java.common.commonCode.model.CommonCodeBean;
import main.java.common.commonCode.model.ContactSysInfoBean;
import main.java.common.commonCode.model.DongCodeBean;
import main.java.common.commonCode.model.HistoryBean;
import main.java.common.commonCode.model.RefDeptCodeBean;
import main.java.common.commonCode.model.RefGuCodeBean;
import main.java.common.commonCode.model.TaxCodeBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.Debug;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
//********** BEGIN_현진_20120312
import main.java.admin.model.PurposeCodeBean;
import main.java.admin.model.SectionBean; 
//********** END_현진_20120312
//********** BEGIN_현진_20120314
import main.java.admin.model.RefSectionMappingBean;
//********** END_현진_20120314
//********** BEGIN_KANG_20120409
import main.java.admin.model.OfficeCodeBean;
//********** END_KANG_20120409


//	공통코드
public class CommonCodeDao	extends RoadsJdbcDaoSupport{

//	private OracleLobHandler 	oracleLobHandler 	= null;
	
//	private	CommonCode	commonCode	= null;
	
//	private	BJDongCode	bjdongCode	= null;
//	private	HJDongCode	hjdongCode	= null;
	private HttpServletRequest request = null;
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
    }

//  해당 admin_no로 PNU 값과 주소 추출
	public List executeGetAddrPNU(String admin_no){
		ExecutegetAddrPNUQuery	executegetAddrPNUQuery	= new ExecutegetAddrPNUQuery(getDataSource());
				
		Object[] values = {admin_no};
		System.out.println("!!admin_no:"+admin_no);
		return executegetAddrPNUQuery.execute(values);	
	}
	
    public	List	executeCommonCode(String Type)
	{
    	CommonCode	commonCode	= new CommonCode(getDataSource());
    	
    	Object[] values = {Type};
    	
    	return commonCode.execute(values);
	}
    
    public	List	executeGapanCode(String Type)
	{
    	GapanCode	gapanCode	= new GapanCode(getDataSource());
    	
    	Object[] values = {Type};
    	
    	return gapanCode.execute(values);
	}
    
    public	List	executeBJDongCode(String SI_NM, String GU_NM)
	{
    	BJDongCode	bjdongCode	= new BJDongCode(getDataSource());
    	
    	Object[] values = {SI_NM, GU_NM};
    	
    	return bjdongCode.execute(values);
	}
    /**
     * 서울시 전체구간 정보 가져오기
     * @return
     */
    public	List	executeGapanSeoulGuganCode()
   	{
       	SeoulGapanGuganCode	seoulgapanGuganCode	= new SeoulGapanGuganCode(getDataSource());
       	
       	return seoulgapanGuganCode.execute();
   	} 
  //********** BEGIN_현진_20120312
  // 서울시 구간 정보 가져오기 
    public	List	executeGapanGuganCode(String GU_CD)
	{
    	GapanGuganCode	gapanGuganCode	= new GapanGuganCode(getDataSource());
    	
    	Object[] values = {GU_CD};
    	
    	return gapanGuganCode.execute(values);
	}
    
    public	List	executeGapanGuganCodeName(String GU_CD, String SURVEY_YEAR)
	{
    	GapanGuganRegName	gapanGuganRegName	= new GapanGuganRegName(getDataSource());
    	
    	Object[] values = {GU_CD, SURVEY_YEAR};
    	
    	return gapanGuganRegName.execute(values);
	}
    
  //********** END_현진_20120312
    
    public	List	executeBJDongCode_NM(String SI_NM, String GU_NM)
	{
    	BJDongCode_NM	bjdongCode	= new BJDongCode_NM(getDataSource());
    	
    	Object[] values = {SI_NM, GU_NM};
    	
    	return bjdongCode.execute(values);
	}
    
    //시 이름을 가져온다.
    public	String	getCommonSiName(String SI_NM)
	{
    	Object[] values = {SI_NM};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.CommonCode.getCommonSiName");	
    	Map Request_Map =getJdbcTemplate().queryForMap(sql, values);
    	String si_nm = Request_Map.get("SI_NM").toString();
    	return si_nm;
	}
    
    public	List	executeHJDongCode(String SI_NM, String GU_NM)
	{
    	HJDongCode	hjdongCode	= new HJDongCode(getDataSource());
    	
    	Object[] values = {SI_NM, GU_NM};
    	
    	return hjdongCode.execute(values);
	}
    
    
    public	List	executeTaxCode(String TAXACC)
	{
    	TaxCode	taxCode	= new TaxCode(getDataSource());
    	
    	Object[] values = {TAXACC};
    	
    	return taxCode.execute(values);
	}
    
    //	관리자의 정보를 가져온다.
    public	List	executeUserSearch(String USERID)
	{
    	UserSearch	userSearch	= new UserSearch(getDataSource());
    	
    	Object[] values = {USERID};
    	
    	return userSearch.execute(values);
	}
    //********** BEGIN_현진_20120228
    //	관리자의 정보를 가져온다.
    public	List	executeUserDeptSearch(String orgCd)
	{
    	UserDeptSearch	userDeptSearch	= new UserDeptSearch(getDataSource());
    	
    	Object[] values = {orgCd};
    	
    	return userDeptSearch.execute(values);
	}    
    
    protected	class	UserDeptSearch	extends	MappingSqlQuery
    {
        protected 	UserDeptSearch(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.UserDeptSearch"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	UserBean	Bean	= new UserBean();

        	Bean.setORG_CD(rs.getString("ORG_CD"));
  			Bean.setGU_NM(rs.getString("GU_NM"));
  			Bean.setDEPT_CD(rs.getString("DEPT_CD"));
  			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
  			Bean.setSIGU_CD(rs.getString("SIGU_CD"));

        	return	Bean;
        }
    }
    //********** END_현진_20120228


    //	관리자의 정보를 가져온다.
    public	List	executeContactsys_Info(String sido_cd, String sigu_cd)
	{
    	ContactSysInfoSearch	contactSysInfoSearch	= new ContactSysInfoSearch(getDataSource());
    	
    	Object[] values = {sido_cd, sigu_cd};
    	
    	return contactSysInfoSearch.execute(values);
	}
    
    //	구 이름을 가져온다.
    public	List	executeSearchGuName(String SI_CD, String GU_CD)
	{
    	SearchGuName	searchGuName	= new SearchGuName(getDataSource());
    	
    	Object[] values = {SI_CD, GU_CD};
    	
    	return searchGuName.execute(values);
	}
    
//  해당 admin_no로 PNU 값과 주소 추출	
    protected class ExecutegetAddrPNUQuery extends MappingSqlQuery {
        
    	protected ExecutegetAddrPNUQuery(DataSource ds) {
	      	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.getAddrPNUQuery"));	      	
		  		declareParameter(new SqlParameter(Types.VARCHAR));	  		
        }
        
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	
        	UserBean objUserBean = new UserBean();
        	        	        	        
        	objUserBean.setADDR(rs.getString("ADDR"));
        	objUserBean.setPNU(rs.getString("PNU")); 
        	objUserBean.setNAME(rs.getString("NAME"));
        	
            return objUserBean;
            
          }
      }
    
    protected	class	CommonCode	extends	MappingSqlQuery
    {
        protected 	CommonCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.CommonCode"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CommonCodeBean	Bean	= new CommonCodeBean();

        	Bean.setCODE(NullCheck(rs.getString("CODE")));
  			Bean.setNAME(NullCheck(rs.getString("NAME")));

        	return	Bean;
        }
    }
    
    protected	class	GapanCode	extends	MappingSqlQuery
    {
        protected 	GapanCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.GapanCode"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	CommonCodeBean	Bean	= new CommonCodeBean();

        	Bean.setCODE(NullCheck(rs.getString("CODE")));
  			Bean.setNAME(NullCheck(rs.getString("NAME")));

        	return	Bean;
        }
    }
    
    protected	class	ContactSysInfoSearch	extends	MappingSqlQuery
    {
        protected 	ContactSysInfoSearch(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.ContactSysInfoSearch"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	ContactSysInfoBean	contactSysInfoBean	= new ContactSysInfoBean();

        	contactSysInfoBean.setSI_CD(rs.getString("SI_CD"));
        	contactSysInfoBean.setGU_CD(rs.getString("GU_CD"));
        	contactSysInfoBean.setSAEALL_IP(rs.getString("SAEALL_IP"));
        	contactSysInfoBean.setSAEALL_PATH(rs.getString("SAEALL_PATH"));
        	contactSysInfoBean.setSAEALL_PORT(rs.getString("SAEALL_PORT"));

        	return	contactSysInfoBean;
        }
    }
    
    protected	class	BJDongCode	extends	MappingSqlQuery
    {
        protected 	BJDongCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.DongCode.BJDongCode"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	DongCodeBean	Bean	= new DongCodeBean();

        	Bean.setBJ_CD(NullCheck(rs.getString("BJ_CD")));
  			Bean.setBJ_NM(NullCheck(rs.getString("BJ_NM")));

        	return	Bean;
        }
    }
    /**
     * 서울시 전체구간 정보 가져오기
     * @author Administrator
     *
     */
    protected	class	SeoulGapanGuganCode	extends	MappingSqlQuery
    {
        protected 	SeoulGapanGuganCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.AllGapanGuganCode"));
          	
	    //    declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SectionBean	Bean	= new SectionBean();

        	Bean.setGU_CD(rs.getString("GU_CD"));
        	Bean.setGU_NM(rs.getString("GU_NM"));
        	Bean.setGUGAN_CD(rs.getString("GUGAN_CD"));
        	Bean.setGUGAN_NAME(rs.getString("GUGAN_NAME"));

        	return	Bean;
        }
    } 
    
  //********** BEGIN_현진_20120312
    protected	class	GapanGuganCode	extends	MappingSqlQuery
    {
        protected 	GapanGuganCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.GapanGuganCode"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SectionBean	Bean	= new SectionBean();

        	Bean.setGU_CD(rs.getString("GU_CD"));
        	Bean.setGU_NM(rs.getString("GU_NM"));
        	Bean.setGUGAN_CD(rs.getString("GUGAN_CD"));
        	Bean.setGUGAN_NAME(rs.getString("GUGAN_NAME"));

        	return	Bean;
        }
    }
    
    protected	class	GapanGuganRegName	extends	MappingSqlQuery
    {
        protected 	GapanGuganRegName(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.GapanGuganRegSeq"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	String REG_SEQ = rs.getString("REG_SEQ");

        	return	REG_SEQ;
        }
    }
  //********** END_현진_20120312

    protected	class	BJDongCode_NM	extends	MappingSqlQuery
    {
        protected 	BJDongCode_NM(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.DongCode.BJDongCode_NM"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	DongCodeBean	Bean	= new DongCodeBean();

        	Bean.setBJ_CD(NullCheck(rs.getString("BJ_CD")));
  			Bean.setBJ_NM(NullCheck(rs.getString("BJ_NM")));

        	return	Bean;
        }
    }
 
    protected	class	HJDongCode	extends	MappingSqlQuery
    {
        protected 	HJDongCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.DongCode.HJDongCode"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	DongCodeBean	Bean	= new DongCodeBean();

        	Bean.setHJ_CD(NullCheck(rs.getString("HJ_CD")));
  			Bean.setHJ_NM(NullCheck(rs.getString("HJ_NM")));

        	return	Bean;
        }
    }
    
    protected	class	TaxCode	extends	MappingSqlQuery
    {
        protected 	TaxCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.TaxCode"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	TaxCodeBean	Bean	= new TaxCodeBean();

        	Bean.setTAXNAME(rs.getString("TAXNAME"));
  			Bean.setTAXCODE(rs.getString("TAXCODE"));

        	return	Bean;
        }
    }
    
    
    protected	class	UserSearch	extends	MappingSqlQuery
    {
        protected 	UserSearch(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.UserSearch"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	UserBean	Bean	= new UserBean();

        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setORG_CD(rs.getString("ORG_CD"));
  			Bean.setGU_NM(rs.getString("GU_NM"));
  			Bean.setDEPT_CD(rs.getString("DEPT_CD"));
  			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
  			Bean.setSIGU_CD(rs.getString("SIGU_CD"));
  			Bean.setTEL(rs.getString("TEL"));

        	return	Bean;
        }
    }
    
    
    protected	class	SearchGuName	extends	MappingSqlQuery
    {
        protected 	SearchGuName(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.SearchGuName"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	UserBean	Bean	= new UserBean();

        	Bean.setSIGU_CD(rs.getString("GU_NM"));

        	return	Bean;
        }
    }
    
    // 부서코드 조회
    public List executeRef_DeptCode(String siguCode) {
    	DeptCodeList	deptCodeList	= new DeptCodeList(getDataSource());
    	
		Object[] values = {siguCode};
		
		logger.debug("query ::: " + Debug.toQueryString(deptCodeList.getSql(), values));
		return deptCodeList.execute(values);
	} 
    
    protected class DeptCodeList extends MappingSqlQuery
    {
        protected DeptCodeList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.DeptCode"));
          	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RefDeptCodeBean Bean = new RefDeptCodeBean();
        	
        	Bean.setDEPT_CD(NullCheck(rs.getString("DEPT_CD")));
  			Bean.setDEPT_NM(NullCheck(rs.getString("DEPT_NM")));
  			Bean.setORG_CD(NullCheck(rs.getString("ORG_CD")));
  			Bean.setGU_NM(NullCheck(rs.getString("GU_NM")));
  			Bean.setMANAGE_WORK(NullCheck(rs.getString("MANAGE_WORK")));
  			Bean.setSIGU_CD(NullCheck(rs.getString("SIGU_CD")));
  			
        	return	Bean;
        }
    }  
    
    protected	String	NullCheck(String str)
    {
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }
    
    public String executeBJDongName(String SI_CD, String GU_CD, String BJ_CD){
    	Object[] values = {SI_CD,GU_CD,BJ_CD};
    	String sql = getMessageSourceAccessor().getMessage("Querys.CommonCode.getBjDongName");
    	String retVal = "";
    	
    	Map temp = getJdbcTemplate().queryForMap(sql, values);
    	retVal = temp.get("BJ_NM").toString();
    	
    	
    	return retVal;
	}
    
    public String executeRegYear(String ADMIN_NO){
    	Object[] values = {ADMIN_NO};
    	String sql = getMessageSourceAccessor().getMessage("Querys.CommonCode.getRegYear");
    	String retVal = "";
    	
    	Map temp = getJdbcTemplate().queryForMap(sql, values);
    	retVal = temp.get("YEAR").toString();
    	
    	
    	return retVal;
	}
    
    
    
    
    // 부가가치세 반영 여부 판단
    public boolean inquiryVatYN(String ADMIN_NO){
    	
    	Object[] values = {ADMIN_NO};
    	String sql = getMessageSourceAccessor().getMessage("Querys.CommonCode.getInquiryVatYN");
    	String retVal = "";
    	
    	Map temp = getJdbcTemplate().queryForMap(sql, values);
    	retVal = temp.get("SECTION_TYPE_PURPOSE").toString();
    	
    	// 무단일때 
    	if(retVal.substring(0,1).equals("3")){
    		System.out.println("부가세 체크 무단.");
    		return false;
    	// 무단 아닐때
    	}else{
    		// 무단 아니면서 특정 목정일떄
    		if(
    				retVal.substring(1,5).equals("1010") ||
    				retVal.substring(1,5).equals("1030") ||
    				retVal.substring(1,5).equals("1040") ||
    				//retVal.substring(1,5).equals("1921") ||
    				//retVal.substring(1,5).equals("1922") ||
    				retVal.substring(1,5).equals("1B20") ||	// 2016.02. kny 농업및식물재배..와 주택 부가세 점용목적코드 변경 반영
    				retVal.substring(1,5).equals("1B50") ||
    				retVal.substring(1,5).equals("2011") ||
    				retVal.substring(1,5).equals("2013") ||
    				retVal.substring(1,5).equals("2014") ||
    				retVal.substring(1,5).equals("2021") ||
    				retVal.substring(1,5).equals("2127") ||
        			retVal.substring(1,5).equals("2227") ||
        			retVal.substring(1,5).equals("2327") ||
        			retVal.substring(1,5).equals("2427") ||
        			retVal.substring(1,5).equals("2121") ||
        			retVal.substring(1,5).equals("2221") ||
        			retVal.substring(1,5).equals("2321") ||
        			retVal.substring(1,5).equals("2421") ||
        			retVal.substring(1,5).equals("3011") ||
        			retVal.substring(1,5).equals("3013") ||
        			retVal.substring(1,5).equals("3014") ||
        			retVal.substring(1,5).equals("3021") ||
        			retVal.substring(1,5).equals("3128")){
    			
    			return false;
    		// vat 그대로
    		}else{
    			return true;
    		}
    	}
    }
    
    
    // 구코드 조회
    public List executeGuCdList() {
    	
    	GuCodeList	guCodeList	= new GuCodeList(getDataSource());
    	
    	return guCodeList.execute();
	} 
    
    protected class GuCodeList extends MappingSqlQuery
    {
        protected GuCodeList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.GuCdList"));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RefGuCodeBean Bean = new RefGuCodeBean();
        	Bean.setGU_CD(rs.getString("GU_CD"));
        	Bean.setGU_NM(rs.getString("GU_NM"));

  			
        	return	Bean;
        }
    }
    
  //********** BEGIN_현진_20120314
    public List executeSectionUsing() {
    	
    	SectionUsing	ectionUsing	= new SectionUsing(getDataSource());

    	return ectionUsing.execute();
	} 
    
    protected class SectionUsing extends MappingSqlQuery
    {
        protected SectionUsing(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.refSEctionMapping.usingList"));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RefSectionMappingBean Bean = new RefSectionMappingBean();

        	Bean.setUSING_MODE(rs.getString("USING_MODE"));
  			
        	return	Bean;
        }
    }
    
    public List executeSectionList(String USING_MODE) {
    	
    	SectionList	sectionList	= new SectionList(getDataSource());
    	
    	if(USING_MODE.equals("")||USING_MODE == null){
    		USING_MODE = "%";
    	}
    	Object[] values = { USING_MODE };
    	
    	return sectionList.execute(values);
	} 
  //********** BEGIN_KANG_20120409
    public List executeOfficeList(String gu_code, String office) {
    	
    	OfficeList	officeList	= new OfficeList(getDataSource());
    	
    	Object[] values = { gu_code, office};
    	
    	return officeList.execute(values);
	} 

    protected class OfficeList extends MappingSqlQuery
    {
        protected OfficeList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.facility.adminbiz.CompanyJijumList"));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	OfficeCodeBean Bean = new OfficeCodeBean();

        	Bean.setOFFICE_NM(rs.getString("OFFICE_NM"));
        	Bean.setOFFICE_CD(rs.getString("OFFICE_CD"));
        	Bean.setJIJUM_NM(rs.getString("JIJUM_NM"));
        	Bean.setJIJUM_CD(rs.getString("JIJUM_CD"));
        	Bean.setJIJUM_CK(rs.getString("JIJUM_CK"));
        	Bean.setGU_CD(rs.getString("GU_CD"));
  			
        	return	Bean;
        }
    }

  //********** END_KANG_20120409

    
    protected class SectionList extends MappingSqlQuery
    {
        protected SectionList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.refSEctionMapping.list"));
          	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	RefSectionMappingBean Bean = new RefSectionMappingBean();

        	Bean.setSECTION(rs.getString("SECTION"));
        	Bean.setSECTION_NAME(rs.getString("SECTION_NAME"));
        	Bean.setUSING_MODE(rs.getString("USING_MODE"));
  			
        	return	Bean;
        }
    }
  //********** END_현진_20120314
  //********** BEGIN_현진_20120319
    
    public boolean executePurposeCodeDetailModify(PurposeCodeBean bean) {
    	try{
    		PurposeCodeDetailModify	purposeCodeDetailModify	= new PurposeCodeDetailModify(getDataSource());
        	
        	Object[] values = { 
    			bean.getYOYUL(),
    			bean.getCHECK_YN(),
    			bean.getGIGAN(),
    			bean.getDANWII(),
    			bean.getMOMEY(),
    			bean.getSECTION(),
    			bean.getCLASS_CD(),
    			bean.getSORT_CD(),
    			bean.getKIND_CD(),
    			bean.getCODE()
        	};
        	for(int i = 0; i < values.length; i++){
        		System.out.println(values[i]);
        	}
        	purposeCodeDetailModify.update(values);
    	}catch(Exception e){
			e.printStackTrace();
			return false;
		}

    	return true;
    }
    
    protected class PurposeCodeDetailModify extends SqlUpdate
    {
        protected PurposeCodeDetailModify(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.purposeCodeNew.detailUpdate"));

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
    
    
    public List executePurposeCodeDetailSelect(PurposeCodeBean bean) {
    	
    	ExecutePurposeCodeDetailSelect	executePurposeCodeDetailSelect	= new ExecutePurposeCodeDetailSelect(getDataSource());
    	
    	Object[] values = {
			bean.getSECTION(),
			bean.getCLASS_CD(),
			bean.getSORT_CD(),
			bean.getKIND_CD(),
			bean.getCODE()
    	};
    	for(int i = 0; i < values.length; i++){
    		System.out.println(values[i]);
    	}
    	return executePurposeCodeDetailSelect.execute(values);
	} 
    
    protected class ExecutePurposeCodeDetailSelect extends MappingSqlQuery
    {
        protected ExecutePurposeCodeDetailSelect(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.purposeCodeNew.detailList"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PurposeCodeBean Bean = new PurposeCodeBean();

        	Bean.setSECTION_NAME(rs.getString("SECTION_NAME"));
        	Bean.setSECTION(rs.getString("SECTION"));
        	Bean.setCLASS_CD(rs.getString("CLASS_CD"));
        	Bean.setCLASS_NM(rs.getString("CLASS_NM"));
        	Bean.setSORT_CD(rs.getString("SORT_CD"));
        	Bean.setSORT_NM(rs.getString("SORT_NM"));
        	Bean.setKIND_CD(rs.getString("KIND_CD"));
        	Bean.setKIND_NM(rs.getString("KIND_NM"));
        	Bean.setDANWII(rs.getString("DANWII"));
        	Bean.setGIGAN(rs.getString("GIGAN"));
        	Bean.setMOMEY(rs.getInt("MOMEY"));
        	Bean.setYOYUL(rs.getFloat("YOYUL"));
        	Bean.setCODE(rs.getString("CODE"));
        	Bean.setCHECK_YN(rs.getString("CHECK_YN"));
        	Bean.setTHEME(rs.getString("THEME"));

  			
        	return	Bean;
        }
    }
  //********** END_현진_20120319
  //********** BEGIN_현진_20120320
    
    public String executePurposeNewInsertList(PurposeCodeBean bean) {
      	String SECTION_NAME = "";
    	Object[] values = {
			bean.getSECTION()
    	};
    	String sql = getMessageSourceAccessor().getMessage("Querys.purposeCodeNew.newInsertListSectionNm");
    	Map temp = getJdbcTemplate().queryForMap(sql, values);
    	SECTION_NAME = temp.get("SECTION_NAME").toString();

    	return	SECTION_NAME;
	} 
    
    
    public List executePurposeNewInsertListClassCd(PurposeCodeBean bean) {
    	
    	ExecutePurposeNewInsertListClassCd	executePurposeNewInsertListClassCd	= new ExecutePurposeNewInsertListClassCd(getDataSource());
    	
    	Object[] values = {
			bean.getSECTION(),
			bean.getCLASS_CD()
    	};
    	return executePurposeNewInsertListClassCd.execute(values);
	} 
    
    protected class ExecutePurposeNewInsertListClassCd extends MappingSqlQuery
    {
        protected ExecutePurposeNewInsertListClassCd(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.purposeCodeNew.newInsertListClassCd"));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PurposeCodeBean Bean = new PurposeCodeBean();
        	Bean.setCLASS_CD(rs.getString("CLASS_CD"));
        	Bean.setCLASS_NM(rs.getString("CLASS_NM"));
        	return	Bean;
        }
    }
    
    public List executePurposeNewInsertListSortCd(PurposeCodeBean bean) {
    	
    	ExecutePurposeNewInsertListSortCd	executePurposeNewInsertListSortCd	= new ExecutePurposeNewInsertListSortCd(getDataSource());
    	
    	Object[] values = {
			bean.getSECTION(),
			bean.getCLASS_CD(),
			bean.getSORT_CD()
    	};
    	return executePurposeNewInsertListSortCd.execute(values);
	} 
    
    protected class ExecutePurposeNewInsertListSortCd extends MappingSqlQuery
    {
        protected ExecutePurposeNewInsertListSortCd(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.purposeCodeNew.newInsertListSortCd"));
          	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PurposeCodeBean Bean = new PurposeCodeBean();
        	Bean.setSORT_CD(rs.getString("SORT_CD"));
        	Bean.setSORT_NM(rs.getString("SORT_NM"));
        	return	Bean;
        }
    }
    
    public String executePurposeNewClassCd(PurposeCodeBean bean) {
      	String ClassCd = "";
    	Object[] values = {
			bean.getSECTION()
    	};

    	String sql = getMessageSourceAccessor().getMessage("Querys.purposeCodeNew.newClassCd");
    	Map temp = getJdbcTemplate().queryForMap(sql, values);
    	ClassCd = temp.get("CLASS_CD").toString();
    	System.out.println("temp.get(CLASS_CD).toString(): " + temp.get("CLASS_CD").toString());
    	return	ClassCd;
	} 
    
    
    public String executePurposeNewSortCd(PurposeCodeBean bean) {
      	String SortCd = "";
    	Object[] values = {
			bean.getSECTION(),
			bean.getCLASS_CD()
    	};
    	String sql = getMessageSourceAccessor().getMessage("Querys.purposeCodeNew.newSortCd");
    	Map temp = getJdbcTemplate().queryForMap(sql, values);
    	SortCd = temp.get("SORT_CD").toString();

    	return	SortCd;
	} 

    public String executePurposeNewKindCd(PurposeCodeBean bean) {
      	String KindCd = "";
    	Object[] values = {
			bean.getSECTION(),
			bean.getCLASS_CD(),
			bean.getSORT_CD()
    	};
    	String sql = getMessageSourceAccessor().getMessage("Querys.purposeCodeNew.newKindCd");
    	Map temp = getJdbcTemplate().queryForMap(sql, values);
    	KindCd = temp.get("KIND_CD").toString();

    	return	KindCd;
	} 
    
    
    public boolean purposeCodeNewListInsert(PurposeCodeBean bean){
    	PurposeCodeNewListInsert	purposeCodeNewListInsert	= new PurposeCodeNewListInsert(getDataSource());
    	
		Object[] values = {
				bean.getSECTION(),
				bean.getCLASS_CD(),
				bean.getCLASS_NM(),
				bean.getSORT_CD(),
				bean.getSORT_NM(),
				
				bean.getKIND_CD(),
				bean.getKIND_NM(),
				bean.getCODE()
		};
		
		try{
			purposeCodeNewListInsert.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	} 
    
	protected class PurposeCodeNewListInsert extends SqlUpdate
    {
        protected PurposeCodeNewListInsert(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.purposeCodeNew.listInsert"));
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
	
	public boolean purposeCodeNewListDelete(PurposeCodeBean bean){
		try{
			PurposeCodeNewListDelete purposeCodeNewListDelete = new PurposeCodeNewListDelete(getDataSource());
			Object[] values = {
					bean.getSECTION(),
					bean.getCODE()
			};
			purposeCodeNewListDelete.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	
	protected class PurposeCodeNewListDelete extends SqlUpdate {
		public PurposeCodeNewListDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.purposeCodeNew.listDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
		}

	}	
	
	public boolean purposeCodeNewListUpdateClassNm(PurposeCodeBean bean, String modySECTION, String modyCODE){
		try{
			PurposeCodeNewListUpdateClassNm purposeCodeNewListUpdateClassNm = new PurposeCodeNewListUpdateClassNm(getDataSource());
			String CLASS_CD = modyCODE.substring(0,1);
			Object[] values = {
					bean.getCLASS_NM(),
					modySECTION,
					CLASS_CD
			};
			purposeCodeNewListUpdateClassNm.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	protected class PurposeCodeNewListUpdateClassNm extends SqlUpdate {
		public PurposeCodeNewListUpdateClassNm(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.purposeCodeNew.listUpdate.classNm"));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
		}

	}
	
	public boolean purposeCodeNewListUpdateSortNm(PurposeCodeBean bean, String modySECTION, String modyCODE){
		try{
			PurposeCodeNewListUpdateSortNm purposeCodeNewListUpdateSortNm = new PurposeCodeNewListUpdateSortNm(getDataSource());
			String CLASS_CD = modyCODE.substring(0,1);
			String SORT_CD = modyCODE.substring(1,2);
			Object[] values = {
					bean.getSORT_NM(),
					modySECTION,
					CLASS_CD,
					SORT_CD
			};
			purposeCodeNewListUpdateSortNm.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	protected class PurposeCodeNewListUpdateSortNm extends SqlUpdate {
		public PurposeCodeNewListUpdateSortNm(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.purposeCodeNew.listUpdate.sortNm"));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
		}

	}
	
	public boolean purposeCodeNewListUpdateKindNm(PurposeCodeBean bean, String modySECTION, String modyCODE){
		try{
			PurposeCodeNewListUpdateKindNm purposeCodeNewListUpdateKindNm = new PurposeCodeNewListUpdateKindNm(getDataSource());
			String CLASS_CD = modyCODE.substring(0,1);
			String SORT_CD = modyCODE.substring(1,2);
			String KIND_CD = modyCODE.substring(2,3);
			Object[] values = {
					bean.getKIND_NM(),
					modySECTION,
					CLASS_CD,
					SORT_CD,
					KIND_CD
			};
			purposeCodeNewListUpdateKindNm.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	protected class PurposeCodeNewListUpdateKindNm extends SqlUpdate {
		public PurposeCodeNewListUpdateKindNm(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.purposeCodeNew.listUpdate.kindNm"));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
		}

	}
  //********** END_현진_20120320
    
    //이력정보 등록
  //이력정보 추가
	public boolean insertHistoryInfo(HistoryBean bean){
		InsertHistoryInfo	insertHistoryInfo	= new InsertHistoryInfo(getDataSource());
    	
		Object[] values = {
				bean.getADMIN_NO(),
				bean.getADMIN_NO(),
				bean.getGUBUN(),
				bean.getGUNGE(),
				bean.getSAYU(),
				
				bean.getUP_DATE(),
				bean.getWORK_ID(),
				bean.getGU_CODE(),
				bean.getWORK_NM(),
				bean.getGP_TYP()
		};
		
		try{
			insertHistoryInfo.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}

		return true;
	} 
    
	protected class InsertHistoryInfo extends SqlUpdate
    {
        protected InsertHistoryInfo(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.CommonCode.InsertHistoryInfo"));
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

    
}
