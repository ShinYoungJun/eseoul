package main.java.admin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import main.java.admin.dao.AdminDao.GetGapanInfo;
import main.java.admin.dao.AdminDao.SectionDelete;
import main.java.admin.dao.AdminDao.SetSectionInsert;
import main.java.admin.model.AreaCodeBean;
import main.java.admin.model.GradeCodeBean;
import main.java.admin.model.JojungCodeBean;
import main.java.admin.model.OfficeCodeBean;
import main.java.admin.model.OfficeRegBean;
import main.java.admin.model.OrgCodeBean;
import main.java.admin.model.PurposeCodeBean;
import main.java.admin.model.SectionBean;
import main.java.admin.model.TaxCodeBean;
import main.java.admin.model.ZipCodeBean;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.Debug;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class CommCodeDao extends RoadsJdbcDaoSupport implements ICommCodeDao {

	private RetrieveAreaCodeListQuery objRetrieveAreaCodeListQuery;
	private RetrieveOrgListQuery objRetrieveOrgListQuery;
	private RetrievePurposeListQuery objRetrievePurposeListQuery;
	private RetrieveTaxListQuery objRetrieveTaxListQuery;
	private RetrieveZipListQuery objRetrieveZipListQuery;
	private RetrieveJojungListQuery objRetrieveJojungListQuery;
	private RetrieveGradeListQuery objRetrieveGradeListQuery;
	private ModifyGradeListQuery objModifyGradeListQuery;
	private DeleteGradeListQuery objDeleteGradeListQuery;
	
	/************************/
	private RetrieveOfficeCodeListQuery objRetrieveOfficeCodeListQuery;

	/************************/
	/************************/
	private InsertOfficeCodeQuery objInsertOfficeCodeQuery;
	
	/************************/
	
	private updateOfficeNmQuery objUpdateOfficeNmQuery;

	private updateJijumNmQuery objUpdateJijumNmQuery;
	private updateOfficeJijumNmQuery objUpdateOfficeJijumNmQuery;
	
	private OracleLobHandler oracleLobHandler = null;

	protected void initDao() throws Exception {
		super.initDao();

		oracleLobHandler = new OracleLobHandler();
		objRetrieveAreaCodeListQuery = new RetrieveAreaCodeListQuery(
				getDataSource());
		objRetrieveOrgListQuery = new RetrieveOrgListQuery(getDataSource());
		objRetrievePurposeListQuery = new RetrievePurposeListQuery(
				getDataSource());
		objRetrieveTaxListQuery = new RetrieveTaxListQuery(getDataSource());
		objRetrieveZipListQuery = new RetrieveZipListQuery(getDataSource());
		objRetrieveJojungListQuery = new RetrieveJojungListQuery(
				getDataSource());
		objRetrieveGradeListQuery = new RetrieveGradeListQuery(getDataSource());
		objModifyGradeListQuery = new ModifyGradeListQuery(getDataSource());
		objDeleteGradeListQuery = new DeleteGradeListQuery(getDataSource());

		/**************************************/
		objRetrieveOfficeCodeListQuery = new RetrieveOfficeCodeListQuery(getDataSource());
		/**************************************/
		/**************************************/
		objInsertOfficeCodeQuery = new InsertOfficeCodeQuery(getDataSource());
		/**************************************/
		objUpdateOfficeNmQuery = new updateOfficeNmQuery(getDataSource());
		objUpdateJijumNmQuery = new updateJijumNmQuery(getDataSource());
		objUpdateOfficeJijumNmQuery = new updateOfficeJijumNmQuery(getDataSource());

	}

	/**
	 * 지역코드 리스트를 조회해 List 형태로 리턴
	 */
	public List retrieveAreaCodeList(int intCurrentPage, int intCountPerPage,
			String siName, String guName, String hdName) {

		String strSiName = "%";
		String strGuName = "%";
		String strHdName = "%";

		if (!siName.equals(""))
			strSiName = "%" + siName + "%";

		if (!guName.equals(""))
			strGuName = "%" + guName + "%";

		if (!hdName.equals(""))
			strHdName = "%" + hdName + "%";

		Object[] values = { strSiName, strGuName, strHdName,
				new Integer(intCurrentPage), new Integer(intCountPerPage),
				new Integer(intCountPerPage) };

		return objRetrieveAreaCodeListQuery.execute(values);
	}

	protected class RetrieveAreaCodeListQuery extends MappingSqlQuery {
		protected RetrieveAreaCodeListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.areaCode.select"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			AreaCodeBean objAreaCodeBean = new AreaCodeBean();

			objAreaCodeBean.setSI_NM(rs.getString("SI_NAME"));
			objAreaCodeBean.setGU_NM(rs.getString("GU_NAME"));
			objAreaCodeBean.setHJ_NM(rs.getString("HJ_NAME"));
			objAreaCodeBean.setSI_CD(rs.getString("SI_CD"));
			objAreaCodeBean.setGU_CD(rs.getString("GU_CD"));
			objAreaCodeBean.setHJ_CD(rs.getString("HJ_CD"));

			return objAreaCodeBean;
		}
	}

	/**
	 * 기관코드 리스트를 조회해 List 형태로 리턴
	 */
	public List retrieveOrgCodeList(int intCurrentPage, int intCountPerPage,
			String guNm) {

		String strGuNm = "%";
		if (!guNm.equals(""))
			strGuNm = guNm + "%";

		Object[] values = { strGuNm };

		return objRetrieveOrgListQuery.execute(values);
	}

	protected class RetrieveOrgListQuery extends MappingSqlQuery {
		protected RetrieveOrgListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.orgCode.select"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			OrgCodeBean objOrgCodeBean = new OrgCodeBean();

			objOrgCodeBean.setORG_CD(rs.getString("ORG_CD"));
			objOrgCodeBean.setORG_NM(rs.getString("GU_NM"));
			objOrgCodeBean.setDEPT_CD(rs.getString("DEPT_CD"));
			objOrgCodeBean.setDEPT_NM(rs.getString("DEPT_NM"));
			return objOrgCodeBean;
		}
	}

	//********** BEGIN_현진_20120313
	public List OrgCodeList(int intCurrentPage, int intCountPerPage,String GU_CD) {
		GetOrgCodeList getOrgCodeList = new GetOrgCodeList(getDataSource());
		
		if(GU_CD.equals("") || GU_CD.equals("000")){
			GU_CD = "%";
		}
		int BEGIN = intCountPerPage * (intCurrentPage-1) + 1;
    	int END = intCountPerPage * intCurrentPage;
    	
    	Object[] values = { 			
 			GU_CD, 			
 			BEGIN,
 			END
     	}; 	

		return getOrgCodeList.execute(values);
	}
	protected class GetOrgCodeList extends MappingSqlQuery {
		protected GetOrgCodeList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.orgCodeNew.list"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			OrgCodeBean Bean = new OrgCodeBean();

			Bean.setORG_CD(rs.getString("ORG_CD"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setDEPT_CD(rs.getString("DEPT_CD"));
			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			Bean.setMANAGE_WORK(rs.getString("MANAGE_WORK"));
			Bean.setSIGU_CD(rs.getString("SIGU_CD"));
			
			return Bean;
		}
	}
	
	
    public int getOrgCodeCount(String gu_cd){
    	String sql = getMessageSourceAccessor().getMessage("Querys.orgCodeNew.count");
    	
    	String GU_CD = gu_cd;
    	if(GU_CD == null || GU_CD.equals("") || GU_CD.equals("000")){
    		GU_CD = "%";
    	}

    	Object[] values = {
    		GU_CD
     	};
    	
    	return getJdbcTemplate().queryForInt(sql,values);	
    }
	
    public List OrgCodeSelectList(OrgCodeBean bean) {
		GetOrgCodeSelectList getOrgCodeSelectList = new GetOrgCodeSelectList(getDataSource());
    	
    	Object[] values = { 		
   			bean.getDEPT_CD(),
   			bean.getORG_CD()
     	}; 	

		return getOrgCodeSelectList.execute(values);
	}
	protected class GetOrgCodeSelectList extends MappingSqlQuery {
		protected GetOrgCodeSelectList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.orgCodeNew.selectListt"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			OrgCodeBean Bean = new OrgCodeBean();

			Bean.setORG_CD(rs.getString("ORG_CD"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setDEPT_CD(rs.getString("DEPT_CD"));
			Bean.setDEPT_NM(rs.getString("DEPT_NM"));
			Bean.setMANAGE_WORK(rs.getString("MANAGE_WORK"));
			Bean.setSIGU_CD(rs.getString("SIGU_CD"));
			
			return Bean;
		}
	}
	
	@Override
	public boolean removeOrgCode(OrgCodeBean bean){
		try{
			OrgCodeDelete orgCodeDelete = new OrgCodeDelete(getDataSource());
			Object[] values = {
					bean.getDEPT_CD(),
		   			bean.getORG_CD()
			};
			orgCodeDelete.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;		
	}
	protected class OrgCodeDelete extends SqlUpdate {
		public OrgCodeDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.orgCodeNew.delete"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUGAN_CD
		}
	}	
	
	@Override
	public boolean addOrgCode(OrgCodeBean bean){
		
		try{
			SetOrgCodeInsert setOrgCodeInsert = new SetOrgCodeInsert(getDataSource());
			Object[] values = {
					bean.getORG_CD(),
					bean.getGU_NM(),
					bean.getDEPT_CD(),
					bean.getDEPT_NM(),
					bean.getMANAGE_WORK(),
					bean.getSIGU_CD()					
			};
			setOrgCodeInsert.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	protected class SetOrgCodeInsert extends SqlUpdate {
		public SetOrgCodeInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.orgCodeNew.insert"));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			
			declareParameter(new SqlParameter(Types.VARCHAR)); 
		}
	}
	
	
	@Override
	public boolean updateOrgCode(OrgCodeBean bean) {
		try{
			SetOrgCodeUpdate update = new SetOrgCodeUpdate(getDataSource());
			Object[] values = {
					bean.getDEPT_NM(),
					bean.getMANAGE_WORK(),
					bean.getORG_CD(),
					bean.getGU_NM(),
					bean.getDEPT_CD(),
					bean.getSIGU_CD()					
			};
			logger.debug("query ::: " +Debug.toQueryString( update.getSql(), values));
			update.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	protected class SetOrgCodeUpdate extends SqlUpdate {
		public SetOrgCodeUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.orgCodeNew.update"));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			
			declareParameter(new SqlParameter(Types.VARCHAR)); 
		}

	}

	//********** END_현진_20120313

	//********** BEGIN_현진_20120313
	   public int getJojungCount(String ADD_SUM){
	    	String sql = getMessageSourceAccessor().getMessage("Querys.jojungCodeNew.count");
	    	
	    	if(ADD_SUM == null || ADD_SUM.equals("") ){
	    		ADD_SUM = "%";
	    	}
	    	Object[] values = {
	    			ADD_SUM
	     	};
	    	
	    	return getJdbcTemplate().queryForInt(sql,values);	
	    }
	    
	    public List getJojungList(String ADD_SUM, int intCurrentPage, int intCountPerPage){		
	    	ExecuteJojungList getJojungList = new ExecuteJojungList(getDataSource());
	    	
	    	int BEGIN = intCountPerPage * (intCurrentPage-1) + 1;
	    	int END = intCountPerPage * intCurrentPage;
	    	
	    	if(ADD_SUM == null || ADD_SUM.equals("") ){
	    		ADD_SUM = "%";
	    	}
	 		Object[] values = { 			
	 			ADD_SUM, 			
	 			BEGIN,
	 			END
	 		}; 		 		
	 		return getJojungList.execute(values); 		
		}
	     
		protected class ExecuteJojungList extends MappingSqlQuery {
			public ExecuteJojungList(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage(
						"Querys.jojungCodeNew.list"));
				declareParameter(new SqlParameter(Types.VARCHAR)); // ADD_SUM
				declareParameter(new SqlParameter(Types.VARCHAR)); // paging
				declareParameter(new SqlParameter(Types.VARCHAR)); // paging
			}
			
			protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
				
				JojungCodeBean Bean = new JojungCodeBean();

				Bean.setADD_SUM(rs.getInt("ADD_SUM"));
				Bean.setCNT(rs.getString("CNT"));

				return Bean;
			}
		}

		public boolean setJojungInsert(JojungCodeBean bean){
			try{
				SetJojungInsert setJojungInsert = new SetJojungInsert(getDataSource());
				Object[] values = {
					bean.getADD_SUM(),
					bean.getCNT()
				};
				setJojungInsert.update(values);
			}catch(Exception e){
				e.printStackTrace();
				return false;
			}
			return true;
		}
		
		protected class SetJojungInsert extends SqlUpdate {
			public SetJojungInsert(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage(
						"Querys.jojungCodeNew.insert"));
				declareParameter(new SqlParameter(Types.VARCHAR)); // GUGAN_CD
				declareParameter(new SqlParameter(Types.VARCHAR)); // GUGAN_NAME
			}
		}
		
		public boolean setJojungUpdate(JojungCodeBean bean, String modyADD_SUM, String modyCNT){
			try{
				SetJojungUpdate setJojungUpdate = new SetJojungUpdate(getDataSource());
				Object[] values = {
						bean.getADD_SUM(),
						bean.getCNT(),
						modyADD_SUM,
						modyCNT
				};
				setJojungUpdate.update(values);
			}catch(Exception e){
				e.printStackTrace();
				return false;
			}
			return true;
		}
		
		protected class SetJojungUpdate extends SqlUpdate {
			public SetJojungUpdate(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage(
						"Querys.jojungCodeNew.update"));
				declareParameter(new SqlParameter(Types.VARCHAR)); 
				declareParameter(new SqlParameter(Types.VARCHAR)); 
				declareParameter(new SqlParameter(Types.VARCHAR)); 
				declareParameter(new SqlParameter(Types.VARCHAR)); 
			}

		}
		
		public boolean jojungDelete(JojungCodeBean bean){
			try{
				JojungDelete jojungDelete = new JojungDelete(getDataSource());
				Object[] values = {
						bean.getADD_SUM(),
						bean.getCNT()
				};
				jojungDelete.update(values);
			}catch(Exception e){
				e.printStackTrace();
				return false;
			}
			return true;
			
		}
		
		protected class JojungDelete extends SqlUpdate {
			public JojungDelete(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage(
						"Querys.jojungCodeNew.delete"));
				declareParameter(new SqlParameter(Types.VARCHAR)); 
				declareParameter(new SqlParameter(Types.VARCHAR)); 
			}

		}	
		
		public List getJojungSelectList(JojungCodeBean bean){		
	    	ExecuteJojungSelectList executeJojungSelectList = new ExecuteJojungSelectList(getDataSource());
	    	
	 		Object[] values = { 			
	 			bean.getADD_SUM(),
	 			bean.getCNT()
	 		}; 		 		
	 		return executeJojungSelectList.execute(values); 		
		}
	     
		protected class ExecuteJojungSelectList extends MappingSqlQuery {
			public ExecuteJojungSelectList(DataSource dataSource) {
				super(dataSource, getMessageSourceAccessor().getMessage(
						"Querys.jojungCodeNew.selectList"));
				declareParameter(new SqlParameter(Types.VARCHAR)); 
				declareParameter(new SqlParameter(Types.VARCHAR)); 

			}
			
			protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
				
				JojungCodeBean Bean = new JojungCodeBean();

				Bean.setADD_SUM(rs.getInt("ADD_SUM"));
				Bean.setCNT(rs.getString("CNT"));

				return Bean;
			}
		}

	
	//********** END_현진_20120313
	
	/**
	 * 점용목적코드 리스트를 조회해 List 형태로 리턴
	 */
	public List retrievePurposeCodeList(int intCurrentPage,
			int intCountPerPage, String section, String code) {

		String strSection = "%";
		String strCode = "%";
		System.out.println("code" + code);
		if (!section.equals(""))
			strSection = "%" + section + "%";

		if (!code.equals(""))
			strCode = code + "%";
		System.out
				.println("strSection=" + strSection + "   strCode=" + strCode);
		Object[] values = { strSection, strCode };

		return objRetrievePurposeListQuery.execute(values);
	}

	protected class RetrievePurposeListQuery extends MappingSqlQuery {
		protected RetrievePurposeListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.purposeCode.select"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			PurposeCodeBean objPurposeCodeBean = new PurposeCodeBean();

			objPurposeCodeBean.setCHECK_YN(rs.getString("CHECK_YN"));
			objPurposeCodeBean.setCLASS_CD(rs.getString("CLASS_CD"));
			objPurposeCodeBean.setCLASS_NM(rs.getString("CLASS_NM"));
			objPurposeCodeBean.setCODE(rs.getString("CODE"));
			objPurposeCodeBean.setDANWII(rs.getString("DANWII"));
			objPurposeCodeBean.setGIGAN(rs.getString("GIGAN"));
			objPurposeCodeBean.setKIND_CD(rs.getString("KIND_CD"));
			objPurposeCodeBean.setKIND_NM(rs.getString("KIND_NM"));
			objPurposeCodeBean.setMOMEY(rs.getInt("MOMEY"));
			objPurposeCodeBean.setSECTION(rs.getString("SECTION"));
			objPurposeCodeBean.setSORT_CD(rs.getString("SORT_CD"));
			objPurposeCodeBean.setSORT_NM(rs.getString("SORT_NM"));
			objPurposeCodeBean.setYOYUL(rs.getFloat("YOYUL"));

			return objPurposeCodeBean;
		}
	}

	/**
	 * 과세구분코드 리스트를 조회해 List 형태로 리턴
	 */
	public List retrieveTaxCodeList(int intCurrentPage, int intCountPerPage,
			String taxCode, String taxName, String taxacc) {

		String strTaxCode = "%";
		String strTaxName = "%";
		String strTaxacc = "%";

		if (!taxCode.equals(""))
			strTaxCode = taxCode + "%";

		if (!taxName.equals(""))
			strTaxName = "%" + taxName + "%";

		if (!taxacc.equals(""))
			strTaxacc = "%" + taxacc + "%";

		Object[] values = { strTaxCode, strTaxName, strTaxacc };

		return objRetrieveTaxListQuery.execute(values);
	}

	protected class RetrieveTaxListQuery extends MappingSqlQuery {
		protected RetrieveTaxListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.taxCode.select"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			TaxCodeBean objTaxCodeBean = new TaxCodeBean();

			objTaxCodeBean.setTAXCODE(rs.getString("TAXCODE"));
			objTaxCodeBean.setTAXNAME(rs.getString("TAXNAME"));
			objTaxCodeBean.setTAXGASAN(rs.getString("TAXGASAN"));
			objTaxCodeBean.setTAXPART(rs.getString("TAXPART"));

			return objTaxCodeBean;
		}
	}

	/**
	 * 우편번호코드 리스트를 조회해 List 형태로 리턴
	 */
	public List retrieveZipCodeList(int intCurrentPage, int intCountPerPage,
			String areaCode) {

		String strAreaCode = "%";

		if (!areaCode.equals(""))
			strAreaCode = "%" + areaCode + "%";

		Object[] values = { strAreaCode, strAreaCode, strAreaCode };

		return objRetrieveZipListQuery.execute(values);
	}

	protected class RetrieveZipListQuery extends MappingSqlQuery {
		protected RetrieveZipListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.zipCode.select"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			ZipCodeBean objZipCodeBean = new ZipCodeBean();

			objZipCodeBean.setZIP_CL(rs.getString("ZIP_CL"));
			objZipCodeBean.setBD_NM(rs.getString("BD_NM"));
			objZipCodeBean.setEMD_NM(rs.getString("EMD_NM"));
			objZipCodeBean.setISLAND_NM(rs.getString("ISLAND_NM"));
			objZipCodeBean.setLNDN_CM(rs.getString("LNDN_CM"));
			objZipCodeBean.setORDER_CN(rs.getString("ORDER_CN"));
			objZipCodeBean.setRI_NM(rs.getString("RI_NM"));
			objZipCodeBean.setSGG_NM(rs.getString("SGG_NM"));
			objZipCodeBean.setSI_NM(rs.getString("SI_NM"));
			//added by Sam Lee.
			objZipCodeBean.setSIDO_NM(rs.getString("SIDO_NM"));
			objZipCodeBean.setSIGUNGU_NM(rs.getString("SIGUNGU_NM"));
			objZipCodeBean.setUMD_NM(rs.getString("UMD_NM"));
			objZipCodeBean.setBD_NM2(rs.getString("BD_NM2"));
				
			return objZipCodeBean;
		}
	}

	/**
	 * 조정계수 리스트를 조회해 List 형태로 리턴
	 */
	public List retrieveJojungCodeList(int intCurrentPage, int intCountPerPage,
			String cnt) {

		String strCnt = "%";
		if (!cnt.equals(""))
			strCnt = cnt + "%";

		Object[] values = { strCnt };

		return objRetrieveJojungListQuery.execute(values);
	}

	protected class RetrieveJojungListQuery extends MappingSqlQuery {
		protected RetrieveJojungListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jojungCode.select"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			JojungCodeBean objJojungCodeBean = new JojungCodeBean();

			objJojungCodeBean.setADD_SUM(rs.getInt("ADD_SUM"));
			objJojungCodeBean.setCNT(rs.getString("CNT"));
			return objJojungCodeBean;
		}
	}

	/**
	 * 지역코드 리스트 페이징처리를 위한 totalcount 조회
	 */
	public int getAreaTotalCount(String strSiName, String strGuName,
			String strHdName) {

		String siName = "%";
		String guName = "%";
		String hdName = "%";

		if (!strSiName.equals(""))
			siName = "%" + strSiName + "%";

		if (!strGuName.equals(""))
			guName = "%" + strGuName + "%";

		if (!strHdName.equals(""))
			hdName = "%" + strHdName + "%";

		Object[] values = { siName, guName, hdName };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.areaCode.count");

		return getJdbcTemplate().queryForInt(sql, values);
	}

	/**
	 * 등급코드 리스트를 조회해 List 형태로 리턴
	 */
	public List retrieveGradeCodeList(int intCurrentPage, int intCountPerPage,
			String gradeName) {

		String strGradeName = "%";

		if (!gradeName.equals(""))
			strGradeName = "%" + gradeName + "%";

		Object[] values = { strGradeName };

		return objRetrieveGradeListQuery.execute(values);
	}

	protected class RetrieveGradeListQuery extends MappingSqlQuery {
		protected RetrieveGradeListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gradeCode.select"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			GradeCodeBean objGradeCodeBean = new GradeCodeBean();

			objGradeCodeBean.setGRADE_CODE(rs.getString("CODE"));
			objGradeCodeBean.setGRADE_NAME(rs.getString("NAME"));

			return objGradeCodeBean;
		}
	}

	/**
	 * 등급코드 등록 및 수정
	 * 
	 * @param objGradeCodeBean
	 * @return objGradeCodeBean
	 */
	public GradeCodeBean modifyGradeCode(GradeCodeBean objGradeCodeBean) {

		try {

			Object[] values = { objGradeCodeBean.getGRADE_CODE(),
					objGradeCodeBean.getGRADE_NAME(),
					objGradeCodeBean.getGRADE_CODE(),
					objGradeCodeBean.getGRADE_NAME() };

			objModifyGradeListQuery.update(values);

		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}

		return objGradeCodeBean;
	}

	public class ModifyGradeListQuery extends SqlUpdate {
		public ModifyGradeListQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.GradeCode.modify"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	/**
	 * 등급코드 삭제
	 * 
	 * @param objGradeCodeBean
	 * @return objGradeCodeBean
	 */
	public GradeCodeBean deleteGradeCode(GradeCodeBean objGradeCodeBean) {

		try {

			Object[] values = { objGradeCodeBean.getGRADE_CODE() };
			objDeleteGradeListQuery.update(values);

		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}

		return objGradeCodeBean;
	}

	public class DeleteGradeListQuery extends SqlUpdate {
		public DeleteGradeListQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.GradeCode.delete"));

			declareParameter(new SqlParameter(Types.VARCHAR));

		}
	}

	/**********************************************/
	/**********************************************/
	/**********************************************/
	/**********************************************/
	/**
	 * 업체코드 리스트 페이징처리를 위한 조회
	 */
	public int getOffceTotalCount(String officeNm, String sigu_cd) {

		String strOfficeNm = "%" + officeNm + "%";

		Object[] values = { strOfficeNm, sigu_cd };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.officeCode.count");

		return getJdbcTemplate().queryForInt(sql, values);
	}

	/**
	 * 업체코드 리스트를 조회해 List 형태로 리턴
	 */
	public List retrieveOfficeCodeList(int intCurrentPage, int intCountPerPage,
			String officeNm, String sigu_cd) {

		String strOfficeNm = "%" + officeNm + "%";

		Object[] values = { strOfficeNm, sigu_cd, new Integer(intCurrentPage),
				new Integer(intCountPerPage), new Integer(intCountPerPage)

		};

		return objRetrieveOfficeCodeListQuery.execute(values);
	}

	protected class RetrieveOfficeCodeListQuery extends MappingSqlQuery {
		protected RetrieveOfficeCodeListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.officeCode.select"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			OfficeCodeBean objOfficeCodeBean = new OfficeCodeBean();

			objOfficeCodeBean.setBOARD_NUM(rs.getInt("RN"));
			objOfficeCodeBean.setGU_CD(rs.getString("GU_CD"));
			objOfficeCodeBean.setJIJUM_CD(rs.getString("JIJUM_CD"));
			objOfficeCodeBean.setJIJUM_CK(rs.getString("JIJUM_CK"));
			objOfficeCodeBean.setJIJUM_NM(rs.getString("JIJUM_NM"));
			objOfficeCodeBean.setOFFICE_CD(rs.getString("OFFICE_CD"));
			objOfficeCodeBean.setOFFICE_NM(rs.getString("OFFICE_NM"));

			return objOfficeCodeBean;
		}
	}

	/*********************************/

	/*********************************/

	public boolean verifyOfficeNm(String officeNm, String sigu_cd) {
		Object[] values = { officeNm, sigu_cd };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.officeCode.selectCountOfficeNm");

		if (getJdbcTemplate().queryForInt(sql, values) >= 1) {
			System.out.println("verifyOfficeNm ++++ true");
			return true;
		} else {

			System.out.println("verifyOfficeNm ++++ false");
			return false;
		}
	}

	public boolean verifyJijumNm(String officeNm, String jijumNm, String sigu_cd) {
		Object[] values = { officeNm, jijumNm, sigu_cd };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.officeCode.selectCountJijumNm");

		if (getJdbcTemplate().queryForInt(sql, values) >= 1) {
			System.out.println("verifyJijumNm ++++ true");
			return true;
		} else {
			System.out.println("verifyJijumNm ++++ false");
			return false;
		}
	}

	public String verifyOfficeCD(String officeNm, String sigu_cd) {
		Object[] values = { officeNm, sigu_cd };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.officeCode.selectOfficeCD");
		String val = "";

		try {
			Map returnVal = getJdbcTemplate().queryForMap(sql, values);
			System.out.println(returnVal.toString());
			val = returnVal.get("OFFICE_CD").toString();
			return val;
		} catch (Exception err) {
			System.out.println("ERRORERRORERROR verifyOfficeCD : " + err);
			return "";

		}

	}

	public String verifyMaxOfficeCD(String sigu_cd) {
		Object[] values = { sigu_cd };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.officeCode.selectMaxOffceCD");

		String val = "";
		try {
			int retVal = getJdbcTemplate().queryForInt(sql, values);
			val = String.valueOf(retVal + 1);
			if (val.length() < 2) {
				return "0" + val;
			} else {
				return val;
			}

		} catch (Exception err) {
			System.out.println("ㄸㄲㄸㄲㄸㄲㄸㄲㄸㄲverifyMaxOfficeCD" + val);
			return "";
		}

	}

	public String verifyMaxJijumCD(String officeNm, String sigu_cd) {
		Object[] values = { officeNm, sigu_cd };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.officeCode.selectMaxJijumCD");

		String val = "";
		try {
			int retVal = getJdbcTemplate().queryForInt(sql, values);
			val = String.valueOf(retVal + 1);

			if (val.length() < 2) {
				return "0" + val;
			} else {
				return val;
			}

		} catch (Exception err) {
			System.out.println("ㄸㄲㄸㄲㄸㄲㄸㄲㄸㄲverifyMaxJijumCD" + val);
			return "";
		}

	}

	public boolean insertOfficeCode(OfficeRegBean bean) {

		Object[] values = { bean.getOFFICE_NM(), bean.getOFFICE_CD(),
				bean.getJIJUM_NM(), bean.getJIJUM_CD(), bean.getJIJUM_CK(),
				bean.getGU_CD() };

		try {
			objInsertOfficeCodeQuery.update(values);

		} catch (Exception e) {
			System.out.println("error:" + e.toString());

			// e.printStackTrace();
			return false;
		}

		return true;
	}

	public class InsertOfficeCodeQuery extends SqlUpdate {
		public InsertOfficeCodeQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.officeCode.insert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	

	/*********************************/

	/******************/
	
	
	public Map selectOfficeJijumNm(String officeCD, String jijumCD, String guCD){
		Object[] values = { officeCD, jijumCD, guCD };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.officeCode.selectOfficeJijumNM");
		try {
			Map returnVal = getJdbcTemplate().queryForMap(sql, values);
			return returnVal;
			
		} catch (Exception err) {
			System.out.println("ERRORERRORERROR selectOfficeJijumNm : " + err);
			return null;
		}
		
	}
	
	public boolean updateOfficeNm(String officeNm, String officeCD, String guCD) {

		Object[] values = { officeNm, officeCD, guCD};

		try {
			objUpdateOfficeNmQuery.update(values);

		} catch (Exception e) {
			System.out.println("error:" + e.toString());

			// e.printStackTrace();
			return false;
		}

		return true;
	}
	
	public class updateOfficeNmQuery extends SqlUpdate {
		public updateOfficeNmQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.officeCode.updateOfficeNM"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	//********** BEGIN_KANG_20120416
	public boolean deleteOffice(String officeCD, String jijumCD, String guCD){

		Object[] values = { officeCD, jijumCD, guCD};
		DeleteOfficeQuery objDeleteOfficeQuery = new DeleteOfficeQuery(getDataSource());
		try {
			objDeleteOfficeQuery.update(values);
		} catch (Exception e) {
			System.out.println("error:" + e.toString());
			return false;
		}

		return true;
	}
	
	public class DeleteOfficeQuery extends SqlUpdate {
		public DeleteOfficeQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.officeCode.deleteOffice"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	//********** END_KANG_20120416
	public boolean updateJijumNm(String jijumNm, String jijumCK, String officeCD, String jijumCD, String guCD) {

		Object[] values = {jijumNm, jijumCK, officeCD, jijumCD, guCD};

		try {
			objUpdateJijumNmQuery.update(values);

		} catch (Exception e) {
			System.out.println("error:" + e.toString());

			// e.printStackTrace();
			return false;
		}

		return true;
	}

	public class updateJijumNmQuery extends SqlUpdate {
		public updateJijumNmQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.officeCode.updateJijumNM"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	public boolean updateOfficeJijumNm(String officeNm, String jijumNm, String jijumCK, String officeCD, String jijumCD, String guCD) {

		Object[] values = {officeNm, jijumNm, jijumCK, officeCD, jijumCD, guCD};

		try {
			objUpdateOfficeJijumNmQuery.update(values);

		} catch (Exception e) {
			System.out.println("error:" + e.toString());

			// e.printStackTrace();
			return false;
		}

		return true;
	}

	public class updateOfficeJijumNmQuery extends SqlUpdate {
		public updateOfficeJijumNmQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.officeCode.updateOfficeJijumNM"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	//********** BEGIN_현진_20120314
	public int getPurposeCodeCount(PurposeCodeBean bean){
    	String sql = getMessageSourceAccessor().getMessage("Querys.purposeCodeNew.selectCount");
    	
    	String SECTION = bean.getSECTION();
    	String CLASS_CD = bean.getCLASS_CD();
    	String SORT_CD = bean.getSORT_CD();
    	String KIND_CD = bean.getKIND_CD();
    	String USING_MODE = bean.getUSING_MODE();

    	if(SECTION == null || SECTION.equals("") || SECTION.equals("0")){
    	    SECTION = "%";
    	}
    	if(CLASS_CD == null || CLASS_CD.equals("") || CLASS_CD.equals("0") ){
    	    CLASS_CD = "%";
    	}
    	if(SORT_CD == null || SORT_CD.equals("") || SORT_CD.equals("0")){
    	    SORT_CD = "%";
    	}
    	if(KIND_CD == null || KIND_CD.equals("") || KIND_CD.equals("0")){
    	    KIND_CD = "%";
    	}
    	if(USING_MODE == null || USING_MODE.equals("") || USING_MODE.equals("0")){
    		USING_MODE = "%";
    	}
    	Object[] values = {
			SECTION,
			CLASS_CD,
			SORT_CD,
			KIND_CD,
			USING_MODE
     	};
    	
    	return getJdbcTemplate().queryForInt(sql,values);	
    }
    
    public List getPurposeCodeList(PurposeCodeBean bean, int intCurrentPage, int intCountPerPage){		
    	ExecutePurposeCodeList getPurposeCodeList = new ExecutePurposeCodeList(getDataSource());
    	
    	String SECTION = bean.getSECTION();
    	String CLASS_CD = bean.getCLASS_CD();
    	String SORT_CD = bean.getSORT_CD();
    	String KIND_CD = bean.getKIND_CD();
    	String USING_MODE = bean.getUSING_MODE();
    	
    	if(SECTION == null || SECTION.equals("") || SECTION.equals("0")){
    	    SECTION = "%";
    	}
    	if(CLASS_CD == null || CLASS_CD.equals("") || CLASS_CD.equals("0") ){
    	    CLASS_CD = "%";
    	}
    	if(SORT_CD == null || SORT_CD.equals("") || SORT_CD.equals("0")){
    	    SORT_CD = "%";
    	}
    	if(KIND_CD == null || KIND_CD.equals("") || KIND_CD.equals("0")){
    	    KIND_CD = "%";
    	}
    	if(USING_MODE == null || USING_MODE.equals("") || USING_MODE.equals("0")){
    		USING_MODE = "%";
    	}

    	int BEGIN = intCountPerPage * (intCurrentPage-1) + 1;
    	int END = intCountPerPage * intCurrentPage;
    	

 		Object[] values = { 			
			SECTION,
			CLASS_CD,
			SORT_CD,
			KIND_CD,
			USING_MODE,
 			BEGIN,
 			END
 		}; 		 		

 		return getPurposeCodeList.execute(values); 		
	}
     
	protected class ExecutePurposeCodeList extends MappingSqlQuery {
		public ExecutePurposeCodeList(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.purposeCodeNew.select"));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
		}
		
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
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

			return Bean;
		}
	}
	//********** END_현진_20120314

	
	
	

}