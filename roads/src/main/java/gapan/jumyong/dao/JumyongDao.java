package main.java.gapan.jumyong.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.BeanUtil;
import main.java.common.util.Debug;
import main.java.common.util.catUtil.Util; //import gov.mogaha.rnic.common.model.RnicBoardBean;
import main.java.gapan.jumyong.model.ConfBean;
import main.java.gapan.jumyong.model.GapanBaseBean;
import main.java.gapan.jumyong.model.GapanHeadBean;
import main.java.gapan.jumyong.model.GapanInfoBean;
import main.java.gapan.jumyong.model.InspectBean;
import main.java.gapan.jumyong.model.ProductBean;
import main.java.gapan.jumyong.model.SaleBean;
import main.java.gapan.jumyong.model.jumyongBean;
import main.java.gapan.jumyong.model.PlaceLocationBean;
import main.java.gapan.jumyong.model.PlaceFileBean;
import main.java.gapan.jumyong.model.DisUseBean;
import main.java.gapan.jumyong.model.SearchBean;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class JumyongDao extends RoadsJdbcDaoSupport implements IJumyongDao {
	private OracleLobHandler oracleLobHandler = null;

	private Util util = new Util();
	
	//Ω≈±‘µÓ∑œ gapan_base insert
	private Gapan_Base_Register objGapan_Base_Register;
	//Ω≈±‘µÓ∑œ gapan_head insert
	private Gapan_Head_Register objGapan_Head_Register;
	//Ω≈±‘µÓ∑œ gapan_info insert
	private Gapan_Info_Register objGapan_Info_Register;

	//º≠øÔΩ√∏∏ Ω≈±‘µÓ∑œ
	private Gapan_Info_Register_Seoulonly objGapan_Info_Register_Seoulonly;
	
	// ¿Ã∑¬¡§∫∏ ¿‘∑¬
	private InsertHistoryInfo objInsertHistoryInfo;

	// ¡°øÎ¡∂»∏
	// ////////////////////////////////////////////////////////////////////////////////////////
	// ¡°øÎ¡∂»∏
	private RetrieveBoardListQuery objRetrieveQuery = null;
	// ¡°øÎ¡∂»∏ ø¢ºø ∫Ø»Ø
	private RetrieveBoardListExcelQuery objRetrieveExcelQuery = null;
	// ªÍ√‚π∞
	// //////////////////////////////////////////////////////////////////////////////////////////
	// ªÍ√‚π∞ ∏ÆΩ∫∆Æ
	private productListQuery objProductList = null;

	// ªÍ√‚π∞ ∞≥∫∞ ¡§∫∏
	private ProductInfoQuery objProductInfoQuery = null;

	// ¿‘∑¬
	private CalInsert objCalInsert;

	// ¿‘∑¬ ºˆΩ√∫–
	private CalInsert2 objCalInsert2;

	// ºˆ¡§
	private ProductUpdate objProductUpdate;

	// ∞À≈‰ø©∫Œ º≥¡§
	private SetCheckYN objSetCheckYN;

	// ∞À≈‰ø©∫Œ º≥¡§
	private SetTaxYN objSetTaxYN;

	// «ˆ¿Â¡∂ªÁ//////////////////////////////////////////////////////////////////////////////////////////
	private InspectInsert objInspectInsert;

	private RetrieveInspectListQuery objInspectListQuery = null;

	private InspectInfoQuery objInspectInfoQuery = null;

	private InspectUpdate objInspectUpdate;

	// ∞À≈‰«˘¿«//////////////////////////////////////////////////////////////////////////////////////////

	private RetrieveConfListQuery objConfListQuery = null;

	private ConfInfoQuery objConfInfoQuery = null;

	private ConfInsert objConfInsert;

	private ConfUpdate objConfUpdate;

	// ¿ßƒ°¡§∫∏//////////////////////////////////////////////////////////////////////////////////////////
	private RetrieveLocationListQuery objLocationListQuery = null;

	private LocationfInsert objLocationInsert;

	private LocationUpdate objLocationUpdate;

	// ∆ƒ¿œ¡§∫∏//////////////////////////////////////////////////////////////////////////////////////////
	private RetrieveFileListQuery objFileListQuery = null;

	private FileInsert objFileInsert;

	private FileUpdate objFileUpdate;

	// √∑∫Œ∆ƒ¿œ//////////////////////////////////////////////////////////////////////////////////////////

	// «ÿ¡ˆ¡§∫∏//////////////////////////////////////////////////////////////////////////////////////////
	private DisUseInfoQuery objDisUseInfo = null;

	private DisUseUpdate objDisUseUpdate = null;

	// ∞®º“∫– ¡§«“ ªÍ√‚ ∏ÆΩ∫∆Æ
	private productSubListQuery objProductSubList = null;

	// /////////////////////////////////////////////ªÍ√‚π∞ ∫Œ∞˙
	// ªÍ√‚π∞ ¿‘∑¬
	private Cal_Sum_InfoInsert objCal_Sum_InfoInsert;

	// CAL_SUM_INFO ºˆ¡§
	private CalSumUpdate objCalSumUpdate;

	// CAL_SUM_INFO
	private CalSumInfoInfo objCalSumInfoInfo;

	// FORM_ADJUST CAL_SUM_SEQ∑Œ ∞°¡Æø¿±‚
	private FormAdjustListQuery objFormAdjustListQuery;

	// ADMIN_BASE UPDATE
	private Admin_baseUp_dateUpdateQuery objAdmin_baseUp_dateUpdateQuery;

	// «ˆ¿Â¡∂ªÁ ªË¡¶
	private Delete_InspectQuery objDelete_InspectQuery;

	// ∞À≈‰ «˘¿« ªË¡¶
	private Delete_ConfQuery objDelete_ConfQuery;

	// ¿ßπ›ªÁ«◊≥ªø™
	private GetVioTotalList objGetVioTotalList;

	private ViolationRegisterPrc objViolationRegisterPrc;

	private GetViolationView objGetViolationView;
	
	private GetViolationAddInfo objGetViolationAddInfo;

	private ViolationUpdate objViolationUpdate;
	
	//¿œ∞˝ªÍ√‚
	private BatchProductListQuery objBatchProductListQuery;
	
	//ººø‹ºˆ¿‘ ∫Œ∞˙¡§∫∏ ¿‘∑¬
	private ExecuteBugwaRegister objExecuteBugwaRegister;

	/**
	 * ¡°øÎ∑· ¿œ∞˝ ªÍ√‚ ≥ªøÎ ≥‚µµ∫∞ ¿œ∞˝ ªË¡¶∏¶  ªÍ≠x≥ªø™ ¡∂»∏ query
	 */
	private GetCalculationItemQuery objGetCalculationItemQuery;
	
	//ººø‹ºˆ¿‘ ∫Œ∞˙¡§∫∏ ºˆ¡§
	private UpdateBugwaRegister objUpdateBugwaRegister;
	
	//ªË¡¶
	private ExecuteDeleteCalculationQuery objExecuteDeleteCalculationQuery;
	private ExecuteDeleteCalSumQuery objExecuteDeleteCalSumQuery;
	private ExecuteDeleteTaxationQuery objExecuteDeleteTaxationQuery;
	
	private GetCalculationDate objGetCalculationDate;
	
	// ∆Û±‚ ∏≈∞¢
	private ProductSaleListQuery objProductSaleListQuery = null;
	
	private ExecuteDeleteProductSaleQuery objExecuteDeleteProductSaleQuery = null;
	
	//∆Û±‚∏≈∞¢ µÓ∑œ
	private ExecuteSale_RegisterQuery objExecuteSale_RegisterQuery = null;
	
	//∆Û±‚∏≈∞¢ ºˆ¡§
	private UpdateSale_RegisterQuery objUpdateSale_RegisterQuery = null;
	
	// ¿ßπ›¡∂ƒ°≥ªø™ ªË¡¶
	private DeleteViolationInfoQuery objDeleteViolationInfoQuery = null;
	
	// ¿œ∞˝ ±‚∞¸ ø¨¿Â
	private ExecuteGiganUpdateQuery objExecuteGiganUpdateQuery = null;

	protected void initDao() throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
		
		//Ω≈±‘µÓ∑œ gapan_base insert
		objGapan_Base_Register = new Gapan_Base_Register(getDataSource());
		
		//Ω≈±‘µÓ∑œ gapan_head insert
		objGapan_Head_Register = new Gapan_Head_Register(getDataSource());
		//Ω≈±‘µÓ∑œ gapan_info insert
		objGapan_Info_Register = new Gapan_Info_Register(getDataSource());
		
		// º≠øÔΩ√∏∏ Ω≈±‘µÓ∑œ
		objGapan_Info_Register_Seoulonly = new Gapan_Info_Register_Seoulonly(getDataSource());
		
		// ¿Ã∑¬¡§∫∏ insert
		objInsertHistoryInfo = new InsertHistoryInfo(getDataSource());
		// ¡°øÎ¡∂»∏
		// ////////////////////////////////////////////////////////////////////////////////////////
		// ¡°øÎ¡∂»∏
		objRetrieveQuery = new RetrieveBoardListQuery(getDataSource());
		// ¡°øÎ¡∂»∏ Excel ∫Ø»Ø
		objRetrieveExcelQuery = new RetrieveBoardListExcelQuery(getDataSource());
		// ªÍ√‚π∞
		// //////////////////////////////////////////////////////////////////////////////////////////
		// ªÍ√‚π∞ ∏ÆΩ∫∆Æ
		objProductList = new productListQuery(getDataSource());
		// ªÍ√‚π∞ ∞≥∫∞ ¡§∫∏
		objProductInfoQuery = new ProductInfoQuery(getDataSource());
		// ¿‘∑¬
		objCalInsert = new CalInsert(getDataSource());
		// ¿‘∑¬ ºˆΩ√∫–
		objCalInsert2 = new CalInsert2(getDataSource());

		// ºˆ¡§
		objProductUpdate = new ProductUpdate(getDataSource());
		// ∞À≈‰ø©∫Œ º≥¡§
		objSetCheckYN = new SetCheckYN(getDataSource());
		objSetTaxYN = new SetTaxYN(getDataSource());

		// «ˆ¿Â¡∂ªÁ//////////////////////////////////////////////////////////////////////////////////////////
		objInspectInsert = new InspectInsert(getDataSource());
		objInspectListQuery = new RetrieveInspectListQuery(getDataSource());
		objInspectInfoQuery = new InspectInfoQuery(getDataSource());
		objInspectUpdate = new InspectUpdate(getDataSource());

		// ∞À≈‰«˘¿«//////////////////////////////////////////////////////////////////////////////////////////
		objConfListQuery = new RetrieveConfListQuery(getDataSource());
		objConfInfoQuery = new ConfInfoQuery(getDataSource());
		objConfInsert = new ConfInsert(getDataSource());
		objConfUpdate = new ConfUpdate(getDataSource());

		// ¿ßƒ°¡§∫∏//////////////////////////////////////////////////////////////////////////////////////////
		objLocationListQuery = new RetrieveLocationListQuery(getDataSource());
		objLocationInsert = new LocationfInsert(getDataSource());
		objLocationUpdate = new LocationUpdate(getDataSource());

		// ¿ßƒ°¡§∫∏//////////////////////////////////////////////////////////////////////////////////////////
		objFileListQuery = new RetrieveFileListQuery(getDataSource());
		objFileInsert = new FileInsert(getDataSource());
		objFileUpdate = new FileUpdate(getDataSource());

		// «ÿ¡ˆ¡§∫∏//////////////////////////////////////////////////////////////////////////////////////////
		objDisUseInfo = new DisUseInfoQuery(getDataSource());
		objDisUseUpdate = new DisUseUpdate(getDataSource());

		// ∞®º“∫– ¡§«“ ªÍ√‚ ∏ÆΩ∫∆Æ
		objProductSubList = new productSubListQuery(getDataSource());
		// /////////////////////////////////////////////ªÍ√‚π∞ ∫Œ∞˙
		// ªÍ√‚π∞ ¿‘∑¬
		objCal_Sum_InfoInsert = new Cal_Sum_InfoInsert(getDataSource());

		// CAL_SUM_INFO ºˆ¡§
		objCalSumUpdate = new CalSumUpdate(getDataSource());
		// CAL_SUM_INFO
		objCalSumInfoInfo = new CalSumInfoInfo(getDataSource());

		// FORM_ADJUST CAL_SUM_SEQ∑Œ ∞°¡Æø¿±‚
		objFormAdjustListQuery = new FormAdjustListQuery(getDataSource());

		// ADMIN_BASE UPDATE
		objAdmin_baseUp_dateUpdateQuery = new Admin_baseUp_dateUpdateQuery(
				getDataSource());

		// «ˆ¿Â¡∂ªÁ ªË¡¶
		objDelete_InspectQuery = new Delete_InspectQuery(getDataSource());

		// ∞À≈‰ «˘¿« ªË¡¶
		objDelete_ConfQuery = new Delete_ConfQuery(getDataSource());

		// ¿ßπ›ªÁ«◊≥ªø™
		objGetVioTotalList = new GetVioTotalList(getDataSource());

		objViolationRegisterPrc = new ViolationRegisterPrc(getDataSource());

		objGetViolationView = new GetViolationView(getDataSource());
		
		objGetViolationAddInfo = new GetViolationAddInfo(getDataSource()); 

		objViolationUpdate = new ViolationUpdate(getDataSource());
		
		objBatchProductListQuery = new BatchProductListQuery(getDataSource());
		
		objGetCalculationItemQuery = new GetCalculationItemQuery(getDataSource());
		
		//ººø‹ºˆ¿‘ ∫Œ∞˙
		objExecuteBugwaRegister = new ExecuteBugwaRegister(getDataSource()); 
		//ººø‹ºˆ¿‘ ∫Œ∞˙¡§∫∏ ºˆ¡§
		objUpdateBugwaRegister = new UpdateBugwaRegister(getDataSource()); 
		
		//ªË¡¶
		objExecuteDeleteCalculationQuery = new ExecuteDeleteCalculationQuery(getDataSource());
		objExecuteDeleteCalSumQuery = new ExecuteDeleteCalSumQuery(getDataSource());
		objExecuteDeleteTaxationQuery =  new ExecuteDeleteTaxationQuery(getDataSource());
		
		//∆Û±‚ / ∏≈∞¢ 
		objProductSaleListQuery = new ProductSaleListQuery(getDataSource());
		
		//∆Û±‚ / ∏≈∞¢ ªË¡¶
		objExecuteDeleteProductSaleQuery = new ExecuteDeleteProductSaleQuery(getDataSource());
		
		// ∆Û±‚ / ∏≈∞¢ µÓ∑œ
		objExecuteSale_RegisterQuery = new ExecuteSale_RegisterQuery(getDataSource());
		
		// ∆Û±‚/∏≈∞¢ ºˆ¡§
		objUpdateSale_RegisterQuery = new UpdateSale_RegisterQuery(getDataSource());
	
		objGetCalculationDate = new GetCalculationDate(getDataSource());
		
		objDeleteViolationInfoQuery = new DeleteViolationInfoQuery(getDataSource());
		
		// ¿œ∞˝ ±‚∞¸ ø¨¿Â
		objExecuteGiganUpdateQuery = new ExecuteGiganUpdateQuery(getDataSource());
		
	}

	
	public	String	executeCheck_Gapanno(String gapanNo){
    	Object[] values = {gapanNo};

    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.getGapanno");	
    	
    	//∞≠≥≤±∏, ≥Îø¯±∏
    	String[] gangnamBj = {"680101", "680106", "680107", "680108", "680118", "350105"};
    	for(int i=0; i<gangnamBj.length; i++){
    		if(gapanNo.contains(gangnamBj[i])){
    			System.out.println("gangnamBj: "  + gangnamBj);
    			sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.getGapanno_gangNam");
    		}
    	}
    	
    	Map Request_Map =getJdbcTemplate().queryForMap(sql, values);							//'_4_0001'¿« «¸Ωƒ¿∏∑Œ ∞°¡Æø¬¥Ÿ.
    	gapanNo = gapanNo + Request_Map.get("GAPAN_NO").toString();							//(±∏ƒ⁄µÂ+π˝¡§µøƒ⁄µÂ) + '_4_0001'
    	return gapanNo;
	}
	
	
	 //	GAPAN_BASE ¡§∫∏ µÓ∑œ
    public	boolean	executeGapan_Base_Register(GapanBaseBean Bean)
	{
    	try
		{
    		Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getREG_DATE(),
					Bean.getUP_DATE(),
					Bean.getMANAGER(),
					Bean.getFINISH_ID(),
					Bean.getCLOSE_DATE(),
					Bean.getGP_TYPE()
			};
    		
    		for(int i = 0 ; i < values.length ; i ++){
    			System.out.println(": executeGapan_Base_Register??? :" + values[i]);
    		}

    		objGapan_Base_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    
    class Gapan_Base_Register extends SqlUpdate {
		public Gapan_Base_Register(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.gapan.Gapan_Base_Register"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		

		}
	}
    
    //¡°øÎ ªÍ√‚ π◊ ¡§±‚∫– ªÍ√‚Ω√ ªÍ√‚µ» ∏Ò∑œ ∞°¡Æø¿±‚
    public List getCalculationDate(String gapanNo,String calMode){
    
    		Object[] values = {
    				gapanNo,
    				calMode
    		};
    		  				
    		return objGetCalculationDate.execute(values);
    }
    
    protected class GetCalculationDate extends MappingSqlQuery{
    	public GetCalculationDate (DataSource dataSource){
    		super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.GetCalculationDateQuery"));
    		
    		declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
    	}
    	
    	protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();
	
			objProductBean.setFROMDATE(rs.getString("FROMDATE"));
			objProductBean.setTODATE(rs.getString("TODATE"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
			objProductBean.setPRICE(rs.getString("PRICE"));
			objProductBean.setRATE(rs.getString("RATE"));
			objProductBean.setYEAR(rs.getString("YEAR"));

			return objProductBean;
		}
    }
    
    
    
    //∞°∆« øÓøµ¿⁄, µøæ˜¿⁄ ¡§∫∏ µÓ∑œ
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean)
	{
		try
		{
			Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getOWNER_NAME(),
					Bean.getOWNER_IDCHK(),
					Bean.getOWNER_SSN(),
					Bean.getOWNER_IMG_NAME(),
					
					Bean.getOWNER_GENDER(),
					Bean.getOWNER_AGE(),
					Bean.getOWNER_TEL(),
					Bean.getOWNER_HP(),
					Bean.getOWNER_POST(),
					
					Bean.getOWNER_ADDR1(),
					Bean.getOWNER_ADDR2(),
					Bean.getOWNER_TOPOST(),        
					Bean.getOWNER_TOADDR1(),       
					Bean.getOWNER_TOADDR2(),       
					
					Bean.getLC_SEL(),              
					Bean.getLC_TXT(),              
					Bean.getRT_SEL(),              
					Bean.getRT_TXT(),              
					Bean.getESTATE_MOVE(),         
					
					Bean.getESTATE_REAL(),         
					Bean.getGP_TYP(),
					Bean.getPARTN_NAME(),          
					Bean.getPT_SEL(),              
					Bean.getPARTN_SSN(),           
					
					Bean.getPARTN_IMG_NAME(),           
					Bean.getPARTN_GENDER(),        
					Bean.getPARTN_AGE(),           
					Bean.getPARTN_TEL(),           
					Bean.getPARTN_HP(),            
					
					Bean.getPARTN_POST(),          
					Bean.getPARTN_ADDR1(),         
					Bean.getPARTN_ADDR2(),         
					Bean.getPARTN_TOPOST(),        
					Bean.getPARTN_TOADDR1(),       
					
					Bean.getPARTN_TOADDR2(),
					Bean.getOWNER_JIBUN(),
					Bean.getOWNER_SAN(),
					Bean.getOWNER_TOJIBUN(),
					Bean.getOWNER_TOSAN(),
					
					Bean.getPARTN_JIBUN(),
					Bean.getPARTN_SAN(),
					Bean.getPARTN_TOJIBUN(),
					Bean.getPARTN_TOSAN(),
					Bean.getADDR_CHECK1(),
					
					Bean.getADDR_CHECK2(),
					Bean.getNOTE(),
					
					Bean.getSI(),
					Bean.getGUN(),
					Bean.getDORO_NM(),
					Bean.getBD_BON(),
					Bean.getBD_BU(),
					Bean.getBD_NM(),
					Bean.getBD_DET_NM(),
					Bean.getTOSI(),
					Bean.getTOGUN(),
					Bean.getTODORO_NM(),
					Bean.getTOBD_BON(),
					Bean.getTOBD_BU(),
					Bean.getTOBD_NM(),
					Bean.getTOBD_DET_NM()
			};
			
    		for(int i = 0 ; i < values.length ; i ++){
    			System.out.println(": executeGapan_Head_Register :" + values[i]);
    		}

			objGapan_Head_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    class Gapan_Head_Register extends SqlUpdate {
		public Gapan_Head_Register(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.gapan.Gapan_Head_Register"));

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
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            //declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            
            ///////////
            
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
	
    public	boolean	executeGapan_Info_Register_Seoulonly(GapanInfoBean Bean){
    	try
		{

			System.out.println("*********************** JumyongDao executeGapan_Info_Register_seoulonly **********");
			Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getGP_TYP(),
					Bean.getPURPOSE_CD(),
					Bean.getFT_TYP(),
					
					Bean.getSECTION(),
					Bean.getWITH_PNU()
			};
			
    		for(int i = 0 ; i < values.length ; i ++){
    			System.out.println(": executeGapan_Info_Register_seoulonly :" + values[i]);
    		}

			objGapan_Info_Register_Seoulonly.update(values);

			System.out.println("?êÎãπ");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    class Gapan_Info_Register_Seoulonly extends SqlUpdate {
		public Gapan_Info_Register_Seoulonly(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.gapan.Gapan_Info_Register_Seoulonly"));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
	
    //	GAPAN_INFO  ≈◊¿Ã∫Ìø° µÓ∑œ
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean){
		try
		{

			System.out.println("***********************JumyongDao executeGapan_Info_Register.+++++++++++");
			Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getX_COORD(),
					Bean.getY_COORD(),
					Bean.getGP_TYP(),
					Bean.getPURPOSE_CD(),

					Bean.getWITH_PNU(),
					Bean.getWITH_ADDR(),
					Bean.getSHOP_IMG_NAME(),
					Bean.getWITH_INFO(),
					Bean.getROAD_INFO(),

					Bean.getAR_SEL(),
					Bean.getAR_TXT(),
					Bean.getFOUND_DATE(),
					Bean.getUC_SEL(),
					Bean.getUC_TXT(),

					Bean.getFT_TYP(),
					Bean.getFT_SEL(),
					Bean.getFACIL_L(),
					Bean.getFACIL_W(),
					Bean.getFACIL_H(),

					Bean.getPLACE_L(),
					Bean.getPLACE_H(),
					Bean.getPLACE_A(),
					Bean.getDP_SEL(),
					Bean.getDP_TXT(),

					Bean.getSPECIAL_ST(),
					Bean.getMAINTN_OB(),
					Bean.getMT_SEL(),
					Bean.getSG_TYP(),
					Bean.getLIQUOR_SL(),

					Bean.getLPGAS_US(),
					Bean.getSG_ITM(),
					Bean.getSG_SEL(),
					Bean.getMEM_NUM(),
					Bean.getOPEN_TIME(),

					Bean.getCLOSE_TIME(),
					Bean.getPERMIT_DATE(),
					Bean.getDAY_SALES(),
					Bean.getUN_TYP(),
					Bean.getUN_TXT(),

					Bean.getNOTES(),
					Bean.getTAXTATION_AT(),
					Bean.getTYPE(),
					Bean.getSECTION(),
					Bean.getOWNER_SET(),
					
					Bean.getTAX_SET(),
					Bean.getMUL_FROMDATE(),
					Bean.getMUL_TODATE(),
					Bean.getHJ_CD(),
					
					Bean.getWITH_DORO_NM(),
					Bean.getWITH_BD_BON(),
					Bean.getWITH_BD_BU()
			};
    		for(int i = 0 ; i < values.length ; i ++){
    			System.out.println(": executeGapan_Info_Register :" + values[i]);
    		}

			objGapan_Info_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    class Gapan_Info_Register extends SqlUpdate {
		public Gapan_Info_Register(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.gapan.Gapan_Info_Register"));
            
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
	
    // ¿Ã∑¬≥ªø™ seq ∞°¡Æø¿±‚
	public String getHistoryMaxSeq(ProductBean objProductBean)
			throws DataAccessException {

		Object[] values = { objProductBean.getGAPAN_NO() };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.getHistoryMaxSeq");
		Map returnNum = null;
		String MaxSeq = "";
		try {
			returnNum = getJdbcTemplate().queryForMap(sql, values);
			MaxSeq = returnNum.get("MAX_SEQ").toString();
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return MaxSeq;
	}

	// ¿Ã∑¬¡§∫∏ insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean) {
		try {

			System.out.println("objProductBean.getADMIN_NO() == "
					+ objProductBean.getGAPAN_NO());
			System.out.println("objProductBean.getSEQ()      == "
					+ objProductBean.getSEQ());
			System.out.println("objProductBean.getGUBUN()    == "
					+ objProductBean.getGUBUN());
			System.out.println("objProductBean.getWRITEDATE()== "
					+ objProductBean.getWRITEDATE());
			System.out.println("objProductBean.getGUNGE()    == "
					+ objProductBean.getGUNGE());
			System.out.println("objProductBean.getSAYU()     == "
					+ objProductBean.getSAYU());
			System.out.println("objProductBean.getWORK_ID()  == "
					+ objProductBean.getWORK_ID());
			System.out.println("objProductBean.getGU_CODE()  == "
					+ objProductBean.getGU_CODE());
			System.out.println("objProductBean.getWORK_NM()  == "
					+ objProductBean.getWORK_NM());

			Object[] values = { objProductBean.getGAPAN_NO(),
					objProductBean.getSEQ(), objProductBean.getGUBUN(),
					objProductBean.getWRITEDATE(), objProductBean.getGUNGE()

					, objProductBean.getSAYU(), objProductBean.getWORK_ID(),
					objProductBean.getGU_CODE(), objProductBean.getWORK_NM()};

			objInsertHistoryInfo.update(values);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objProductBean;
	}

	class InsertHistoryInfo extends SqlUpdate {
		public InsertHistoryInfo(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.historyInsert"));

			declareParameter(new SqlParameter(Types.VARCHAR)); // ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // WRITEDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUNGE

			declareParameter(new SqlParameter(Types.VARCHAR)); // SAYU
			declareParameter(new SqlParameter(Types.VARCHAR)); // WORK_ID
			declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CODE
			declareParameter(new SqlParameter(Types.VARCHAR)); // WORK_NM

		}
	}

	// ¡°øÎ¡∂»∏
	// ////////////////////////////////////////////////////////////////////////////////////////
	// ¡°øÎ ¡∂»∏
	public List retrieveBoardList(SearchBean objectSearchBean) {

			if (objectSearchBean.getTYPE().equals("0") || objectSearchBean.getTYPE().equals(""))
				objectSearchBean.setTYPE("%");
			if (objectSearchBean.getSECTION().equals("0") || objectSearchBean.getSECTION().equals(""))
				objectSearchBean.setSECTION("%");
			if (objectSearchBean.getTAX_SET().equals("0")|| objectSearchBean.getTAX_SET().equals(""))
				objectSearchBean.setTAX_SET("%");
			if (objectSearchBean.getBJ_CD().equals("") || objectSearchBean.getBJ_CD().equals("00000"))
				objectSearchBean.setBJ_CD("%");
			if (objectSearchBean.getBONBUN().equals(""))
				objectSearchBean.setBONBUN("%");
			if (objectSearchBean.getBUBUN().equals(""))
				objectSearchBean.setBUBUN("%");
			
			//********** BEGIN_KANG_20120423
			if (objectSearchBean.getFacility_No().equals(""))
				objectSearchBean.setFacility_No("%");
			//********** END_KANG_20120423
			
			if (objectSearchBean.getNUMBERVALUE().equals(""))
				objectSearchBean.setNUMBERVALUE("%");
			else
				objectSearchBean.setNUMBERVALUE(objectSearchBean.getNUMBERVALUE()+ "%");

			if (objectSearchBean.getJUMYONGNAME().equals(""))
				objectSearchBean.setJUMYONGNAME("%");
			else
				objectSearchBean.setJUMYONGNAME(objectSearchBean.getJUMYONGNAME()+ "%");

			Object[] values = { objectSearchBean.getSECTION(),
								objectSearchBean.getTAX_SET(),
								objectSearchBean.getBJ_CD(),
								objectSearchBean.getBONBUN(), 
								objectSearchBean.getBUBUN(),
								
								objectSearchBean.getNUMBERVALUE(),
								objectSearchBean.getJUMYONGNAME(),
								objectSearchBean.getFT_TYP(), 
								//********** BEGIN_KANG_20120423
								objectSearchBean.getFacility_No(),
								//********** END_KANG_20120423
								objectSearchBean.getGU_CODE() 
			};
			logger.debug("query ::: " +Debug.toQueryString( objRetrieveQuery.getSql(), values));
			return objRetrieveQuery.execute(values);

	}
	
	// ¡°øÎ ¡∂»∏ π◊ ∞¸∏Æ - ¡°øÎ ¡∂»∏
	protected class RetrieveBoardListQuery extends MappingSqlQuery {
		protected RetrieveBoardListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.ocupancyList"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // TAX_SET
			declareParameter(new SqlParameter(Types.VARCHAR)); // BJ_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // BONBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // BUBUN
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // NUMBERVALUE
			declareParameter(new SqlParameter(Types.VARCHAR)); // JUMYONGNAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // FT_TYP
			//********** BEGIN_KANG_20120423
			declareParameter(new SqlParameter(Types.VARCHAR)); // Facility_No
			//********** END_KANG_20120423
		    declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CODE
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			jumyongBean objJumyongBean = new jumyongBean();

			BeanUtil.mappingBean(objJumyongBean, rs);

            objJumyongBean.setVIO_CD_NAME(getViolationNameJumyong(objJumyongBean,"VIO_SEL"));
			objJumyongBean.setVIO_ACTCD_NAME(getViolationNameJumyong(objJumyongBean,"VIO_ACTSEL"));

			//System.out.println("3π¯ ∏ﬁ¥∫ RetrieveBoardListQuery :: (retrieveBoardList«‘ºˆ) Querys.gapan.jumyong.ocupancyList");
			/*
			objJumyongBean.setNO(rs.getString("R_ID"));

			objJumyongBean.setGP_TYP(rs.getString("GP_TYP"));
			objJumyongBean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			objJumyongBean.setSECTION(rs.getString("SECTION"));
			objJumyongBean.setSECTION_NAME(rs.getString("SECTION_NAME"));
			objJumyongBean.setTAX_SET_NAME(rs.getString("TAX_SET"));
			objJumyongBean.setNAME(rs.getString("OWNER_NAME"));
			objJumyongBean.setADDR(rs.getString("ADDR"));
			objJumyongBean.setFT_TYP(rs.getString("FT_TYP"));
			objJumyongBean.setUP_DATE(rs.getString("UP_DATE"));	
			objJumyongBean.setPLACE_A(rs.getString("PLACE_A"));
			
			objJumyongBean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			objJumyongBean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			objJumyongBean.setVIO_ACCPOINTS(rs.getString("VIO_ACCPOINTS"));
			
/*			objJumyongBean.setSI(rs.getString("SI"));
			objJumyongBean.setGUN(rs.getString("GUN"));
			objJumyongBean.setDORO_NM(rs.getString("DORO_NM"));
			objJumyongBean.setBD_BON(rs.getString("BD_BON"));
			objJumyongBean.setBD_BU(rs.getString("BD_BU"));
			objJumyongBean.setBD_NM(rs.getString("BD_NM"));
			objJumyongBean.setBD_DET_NM(rs.getString("BD_DET_NM"));*/
			/*
			objJumyongBean.setVIO_SEL1(rs.getString("VIO_SEL1"));
			objJumyongBean.setVIO_SEL2(rs.getString("VIO_SEL2"));
			objJumyongBean.setVIO_SEL3(rs.getString("VIO_SEL3"));
			objJumyongBean.setVIO_SEL4(rs.getString("VIO_SEL4"));
			objJumyongBean.setVIO_SEL5(rs.getString("VIO_SEL5"));
			objJumyongBean.setVIO_SEL6(rs.getString("VIO_SEL6"));
			objJumyongBean.setVIO_SEL7(rs.getString("VIO_SEL7"));
			
			objJumyongBean.setVIO_ACTSEL1(rs.getString("VIO_ACTSEL1"));
			objJumyongBean.setVIO_ACTSEL2(rs.getString("VIO_ACTSEL2"));
			objJumyongBean.setVIO_ACTSEL3(rs.getString("VIO_ACTSEL3"));
			objJumyongBean.setVIO_ACTSEL4(rs.getString("VIO_ACTSEL4"));
			objJumyongBean.setVIO_ACTSEL5(rs.getString("VIO_ACTSEL5"));
			
			objJumyongBean.setVIO_CD_NAME(getViolationNameJumyong(objJumyongBean,"VIO_SEL"));
			objJumyongBean.setVIO_ACTCD_NAME(getViolationNameJumyong(objJumyongBean,"VIO_ACTSEL"));
			
			//********** BEGIN_KANG_20120420
			objJumyongBean.setOWNER_TEL(rs.getString("OWNER_TEL"));
			objJumyongBean.setOWNER_HP(rs.getString("OWNER_HP"));
			//********** END_KANG_20120420
			//********** BEGIN_KANG_20120423
			objJumyongBean.setFacility_No(rs.getString("Facility_No"));	
			 */
			//********** END_KANG_20120423
			return objJumyongBean;
		}
	}

	public List retrieveBoardListExcel(SearchBean objectSearchBean) {
		if (objectSearchBean.getTYPE().equals("0") || objectSearchBean.getTYPE().equals(""))
			objectSearchBean.setTYPE("%");
		if (objectSearchBean.getSECTION().equals("0") || objectSearchBean.getSECTION().equals(""))
			objectSearchBean.setSECTION("%");
		if (objectSearchBean.getTAX_SET().equals("0")|| objectSearchBean.getTAX_SET().equals(""))
			objectSearchBean.setTAX_SET("%");
		if (objectSearchBean.getBJ_CD().equals("") || objectSearchBean.getBJ_CD().equals("00000"))
			objectSearchBean.setBJ_CD("%");
		if (objectSearchBean.getBONBUN().equals(""))
			objectSearchBean.setBONBUN("%");
		if (objectSearchBean.getBUBUN().equals(""))
			objectSearchBean.setBUBUN("%");
		
		//********** BEGIN_KANG_20120423
		if (objectSearchBean.getFacility_No().equals(""))
			objectSearchBean.setFacility_No("%");
		//********** END_KANG_20120423
		
		if (objectSearchBean.getNUMBERVALUE().equals(""))
			objectSearchBean.setNUMBERVALUE("%");
		else
			objectSearchBean.setNUMBERVALUE(objectSearchBean.getNUMBERVALUE()+ "%");

		if (objectSearchBean.getJUMYONGNAME().equals(""))
			objectSearchBean.setJUMYONGNAME("%");
		else
			objectSearchBean.setJUMYONGNAME(objectSearchBean.getJUMYONGNAME()+ "%");
		
		Object[] values = { objectSearchBean.getSECTION(),
				objectSearchBean.getTAX_SET(),
				objectSearchBean.getBJ_CD(),
				objectSearchBean.getBONBUN(), 
				objectSearchBean.getBUBUN(),
				objectSearchBean.getNUMBERVALUE(),
				objectSearchBean.getJUMYONGNAME(),
				objectSearchBean.getFT_TYP(), 
				//********** BEGIN_KANG_20120423
				objectSearchBean.getFacility_No(),
				//********** END_KANG_20120423
				objectSearchBean.getGU_CODE() 
		};
		logger.debug("query ::: " + Debug.toQueryString( objRetrieveExcelQuery.getSql(), values));
		return objRetrieveExcelQuery.execute(values);
	}

	// ¡°øÎ ¡∂»∏ ∞≥ºˆ
	public int getProductListCount(SearchBean objectSearchBean) {
		if (objectSearchBean.getTYPE().equals("0") || objectSearchBean.getTYPE().equals(""))
			objectSearchBean.setTYPE("%");
		if (objectSearchBean.getSECTION().equals("0") || objectSearchBean.getSECTION().equals(""))
			objectSearchBean.setSECTION("%");
		if (objectSearchBean.getTAX_SET().equals("0")|| objectSearchBean.getTAX_SET().equals(""))
			objectSearchBean.setTAX_SET("%");
		if (objectSearchBean.getBJ_CD().equals("") || objectSearchBean.getBJ_CD().equals("00000"))
			objectSearchBean.setBJ_CD("%");
		if (objectSearchBean.getBONBUN().equals(""))
			objectSearchBean.setBONBUN("%");
		if (objectSearchBean.getBUBUN().equals(""))
			objectSearchBean.setBUBUN("%");		

		//********** BEGIN_KANG_20120423
		if (objectSearchBean.getFacility_No().equals(""))
			objectSearchBean.setFacility_No("%");
		//********** END_KANG_20120423
	
		if (objectSearchBean.getNUMBERVALUE().equals(""))
			objectSearchBean.setNUMBERVALUE("%");
		else
			objectSearchBean.setNUMBERVALUE(objectSearchBean.getNUMBERVALUE()+ "%");

		if (objectSearchBean.getJUMYONGNAME().equals(""))
			objectSearchBean.setJUMYONGNAME("%");
		else
			objectSearchBean.setJUMYONGNAME(objectSearchBean.getJUMYONGNAME()+ "%");

		Object[] values = { objectSearchBean.getSECTION(),
							objectSearchBean.getTAX_SET(),
							objectSearchBean.getBJ_CD(),
							objectSearchBean.getBONBUN(), 
							objectSearchBean.getBUBUN(),
							
							objectSearchBean.getNUMBERVALUE(),
							objectSearchBean.getJUMYONGNAME(),
							objectSearchBean.getFT_TYP(), 
							//********** BEGIN_KANG_20120423
							objectSearchBean.getFacility_No(),
							//********** END_KANG_20120423
							objectSearchBean.getGU_CODE() 
		};
		
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.ocupancyListCount");
	
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;

	}

	// ªÍ√‚π∞
	// //////////////////////////////////////////////////////////////////////////////////////////
	/*
	 * public List retrieveProductList(String adminNo) { Object[] values =
	 * {adminNo}; return objProductListQuery.execute(values); }
	 */

	// ªÍ√‚π∞ ∏ÆΩ∫∆Æ
	public List ProductList(int intCurPage, int intCount, String adminNo, String cal_mode) throws DataAccessException {
		Object[] values = { 
				adminNo,
				cal_mode,
				new Integer(intCurPage),
				new Integer(intCount),
				new Integer(intCount)
				};
		
		for(int i = 0 ; i < values.length ; i++){
			System.out.println("::ProductList::" + values[i]);
		}
		
		return objProductList.execute(values);
	}
	
	// ªÍ√‚π∞ ∏ÆΩ∫∆Æ

	protected class productListQuery extends MappingSqlQuery {
		protected productListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.productList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			
		

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();

			objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
			objProductBean.setRATE(String.valueOf(rs.getFloat("RATE")));
			objProductBean.setLICENSE_TAX(rs.getString("LICENSE_TAX"));
			objProductBean.setSUM_YEAR(rs.getString("SUM_YEAR"));
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setPERIOD(rs.getString("PERIOD"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setPRICE(rs.getString("PRICE"));
			objProductBean.setFROMDATE(rs.getString("FROMDATE"));
			objProductBean.setTODATE(rs.getString("TODATE"));
			objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
			objProductBean.setSUM(rs.getString("SUM"));
			objProductBean.setUP_DATE(rs.getString("UP_DATE"));
			objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			objProductBean.setPRICE(rs.getString("PRICE"));
			
			System.out.println("***********************gapan JumyongDao productListQuery.+++++++++++");
			
			return objProductBean;
		}
	}
	

	// ªÍ√‚π∞ ∞≥ºˆ
	public int getProductListCount(String adminNum,String cal_mode) throws DataAccessException {

		Object[] values = { adminNum,cal_mode };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.productCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		// System.out.println("count2=" + returnNum + " " + adminNum);

		return returnNum;
	}
	
	
	

	// ªÍ√‚π∞ ∞≥∫∞ ¡§∫∏
	public ProductBean productInfo(String adminNo, String seq) {
		Object[] values = { adminNo, seq };
		
		System.out.println("productInfo : : "+adminNo);
		System.out.println("productInfo : : "+seq);

		ProductBean pb = new ProductBean();
		try {
			pb = (ProductBean) objProductInfoQuery.execute(values).get(0);

		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return pb;
	}
	
	// ªÍ√‚π∞ ∞≥∫∞ ¡§∫∏
	protected class ProductInfoQuery extends MappingSqlQuery {
		protected ProductInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.calSelectbyYear"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			System.out.println("Querys.gapan.jumyong.calSelectbyYear::Querys.gapan.jumyong.calSelectbyYear");
			ProductBean objProductBean = new ProductBean();
			
			objProductBean.setBUGWA_YN(rs.getString("BUGWA_YN"));
			objProductBean.setTAX_YN(rs.getString("TAX_YN"));
			objProductBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objProductBean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setPRICE(rs.getString("PRICE"));
			objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
			objProductBean.setRATE(String.valueOf(rs.getFloat("RATE")));
			objProductBean.setFROMDATE(rs.getString("FROMDATE"));
			objProductBean.setTODATE(rs.getString("TODATE"));
			objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
			objProductBean.setSUM_YEAR(rs.getString("SUM_YEAR"));
			objProductBean.setFORM(rs.getString("FORM"));
			objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			objProductBean.setLICENSE_TAX(rs.getString("LICENSE_TAX"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setPERIOD(rs.getString("PERIOD"));
			objProductBean.setADJUSTMENT(rs.getString("ADJUSTMENT"));
			objProductBean.setSURCHARGE_RATE(rs.getString("SURCHARGE_RATE"));
			objProductBean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
			objProductBean.setPREV_SEQ(rs.getString("PREV_SEQ"));
			objProductBean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
			objProductBean.setSUM(rs.getString("SUM"));
			objProductBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			objProductBean.setVAT(rs.getString("VAT"));
			objProductBean.setTAX_SEQ(rs.getString("TAX_SEQ"));
			objProductBean.setTAX_YN(rs.getString("TAX_YN"));
			objProductBean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
			objProductBean.setTAX_CD(rs.getString("TAX_CD"));
			objProductBean.setLIVE(rs.getString("LIVE"));
			objProductBean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));
			objProductBean.setOBJ_SET(rs.getString("OBJ_SET"));
			objProductBean.setSIGU_CD(rs.getString("SIGU_CD"));
			objProductBean.setDEPT_CD(rs.getString("DEPT_CD"));
			objProductBean.setADD_SET(rs.getString("ADD_SET"));
			objProductBean.setADD_YN(rs.getString("ADD_YN"));
			objProductBean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
			objProductBean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));
			objProductBean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));
			
			objProductBean.setTAX_DATE(rs.getString("TAX_DATE"));
			objProductBean.setINDATE(rs.getString("INDATE"));
			objProductBean.setOVERDATE(rs.getString("OVERDATE"));
			
			System.out.println("***********************gapan JumyongDao ProductInfoQuery.+++++++++++");
			
			return objProductBean;

		}
	}
	
	

	// ªÍ√‚π∞ ¿€≥‚µµ ¡°øÎ∑·
	public int getSum_LastYear(String adminNum, String year)
			throws DataAccessException {
		Object[] values = { adminNum, year };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getSum_LastYear");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		// System.out.println("count=" + returnNum + adminNum);
		return returnNum;
	}

	// ≥‚µµ∫∞ ¡°øÎ¡ˆ «ˆ¿Â¡∂ªÁ ∂«¥¬ ∞À≈‰«˘¿« ƒ´øÓ∆Æ
	public int getLicenseYnCount(String adminNum, String year)
			throws DataAccessException {
		Object[] values = { adminNum, year, adminNum, year };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getLicenceYnCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		// System.out.println("count=" + returnNum + adminNum);
		return returnNum;
	}

	// ¿¸≥‚µµ ªÍ√‚ ƒ´øÓ∆Æ
	public int getProductYnCount(String adminNum, String year)
			throws DataAccessException {
		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getProductYnCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// ªÍ√‚π∞ ¿‘∑¬
	public ProductBean insertProduct(ProductBean objProductBean) {
		try {
			if (objProductBean.getFROMDATE() == null
					|| objProductBean.getFROMDATE().equals(""))
				objProductBean.setFROMDATE(" ");

			if (objProductBean.getTODATE() == null
					|| objProductBean.getTODATE().equals(""))
				objProductBean.setTODATE(" ");

			if (objProductBean.getPREV_SEQ() == null
					|| objProductBean.getPREV_SEQ().equals(""))
				objProductBean.setPREV_SEQ("0");

			int i;

			if (objProductBean.getPREV_SEQ() == null|| objProductBean.getPREV_SEQ().equals(""))
				objProductBean.setCAL_STATUS("2"); // 1. ªÍ√‚¿¸ 2. ªÍ√‚»ƒ

				Object[] values = {
						objProductBean.getGAPAN_NO(),
						objProductBean.getYEAR(),
						objProductBean.getPRICE(),
						objProductBean.getFROMDATE(),
						objProductBean.getTODATE(),
						
						objProductBean.getAREA_AFTER(),
						objProductBean.getAREA_AFTER(),
						objProductBean.getRATE(),
						objProductBean.getSUM_LASTYEAR(),
						objProductBean.getSUM_YEAR(),
						
						objProductBean.getSUM_ADJUST(),
						objProductBean.getFORM_ADJUST(),
						objProductBean.getFORM(),
						objProductBean.getLICENSE_TAX(),
						objProductBean.getPERIOD(),
						
						objProductBean.getVAT(),
						objProductBean.getADJUSTMENT(),
						objProductBean.getREDUCTION_RATE(),
						objProductBean.getREDUCTION_REASON(),
						objProductBean.getSURCHARGE_RATE(),
						
						objProductBean.getUSE_SECTION(),
						objProductBean.getCAL_SUM_SEQ(),
						objProductBean.getPREV_SEQ(),
						objProductBean.getUP_DATE(),
						objProductBean.getCAL_MODE()
						};

				for (int j = 0; j < values.length; j++)
					System.out.println(j + ":" + values[j]);

				i = objCalInsert2.update(values);
				

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objProductBean;
	}
	
	// ªÍ√‚π∞ ¿‘∑¬
	class CalInsert2 extends SqlUpdate {
		public CalInsert2(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.calInsert2"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // getADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // getYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPRICE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getTODATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.VARCHAR)); // getRATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_LASTYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_YEAR
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM
			declareParameter(new SqlParameter(Types.VARCHAR)); // getLICENSE_TAX
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPERIOD
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADJUSTMENT
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.VARCHAR)); // SURCHARGE_RATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION(¡§±‚,ºˆΩ√)
			declareParameter(new SqlParameter(Types.VARCHAR)); // CAL_SUM_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // PREV_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // UP_DATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // CAL_MODE
		}
	}


	// ªÍ√‚π∞ √÷¥Îseq ±∏«œ±‚
	public int getMaxSeq(String admin_no, String year)
			throws DataAccessException {

		Object[] values = { admin_no, year };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getMaxSeq");

		try {
			return getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			return 1;
		}
	}

	// ªÍ√‚π∞ ºˆ¡§
	public ProductBean updateProduct(ProductBean objProductBean) {
		try {

			if (objProductBean.getFROMDATE() == null
					|| objProductBean.getFROMDATE().equals(""))
				objProductBean.setFROMDATE(" ");

			if (objProductBean.getTODATE() == null
					|| objProductBean.getTODATE().equals(""))
				objProductBean.setTODATE(" ");

			Object[] values = {
					objProductBean.getYEAR(), // year
					objProductBean.getPRICE(), // price
					objProductBean.getFROMDATE(), // fromdate
					objProductBean.getTODATE(), // todate
					objProductBean.getAREA_AFTER(), // area_after
					
					objProductBean.getRATE(), // rate
					objProductBean.getSUM_LASTYEAR(), // sum_lastyear
					objProductBean.getSUM_YEAR(), // sum_year
					objProductBean.getSUM_ADJUST(), // sum_adjust
					objProductBean.getVAT(), // vat
					
					objProductBean.getFORM_ADJUST(), // form_adjust
					objProductBean.getFORM(), // form
					objProductBean.getPERIOD(), // period
					objProductBean.getADJUSTMENT(), // adjustment
					objProductBean.getLICENSE_TAX(), // license_tax
					
					objProductBean.getREDUCTION_RATE(),
					objProductBean.getREDUCTION_REASON(), //
					objProductBean.getSURCHARGE_RATE(), // surcharge_rate
					objProductBean.getUP_DATE(),
					objProductBean.getGAPAN_NO(),
					
					objProductBean.getSEQ() // seq

			};

			objProductUpdate.update(values);

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objProductBean;
	}
	
	// ªÍ√‚π∞ ºˆ¡§
	class ProductUpdate extends SqlUpdate {
		public ProductUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.productUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR = ?, \
			declareParameter(new SqlParameter(Types.VARCHAR)); // PRICE = ?, \
			declareParameter(new SqlParameter(Types.VARCHAR)); // FROMDATE = ?,
			declareParameter(new SqlParameter(Types.VARCHAR)); // TODATE = ?, \
			declareParameter(new SqlParameter(Types.VARCHAR)); // AREA_AFTER =
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // RATE = ?, \
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM_LASTYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM_YEAR = ?,
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM_ADJUST =
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT = ?, \
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM_ADJUST =
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM = ? , \
			declareParameter(new SqlParameter(Types.VARCHAR)); // PERIOD= ? \
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADJUSTMENT
			declareParameter(new SqlParameter(Types.VARCHAR)); // LICENSE_TAX
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND UP_DATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND GAPAN_NO = ?
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND SEQ = ?

		}
	}

	public String getProductRate(String add_sum) throws DataAccessException {
		Object[] values = { add_sum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getProductRate");
		Map returnNum = getJdbcTemplate().queryForMap(sql, values);
		return returnNum.get("CNT").toString();
	}

	// ∏È«„ºº ±∏«œ±‚
	public int getLicenseTax(float area) throws DataAccessException {
		Object[] values = { new Float(area), new Float(area) };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getLicenseTax");
		Map returnNum = getJdbcTemplate().queryForMap(sql, values);
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// √ ±‚»≠ µ•¿Ã≈∏ ±∏«œ±‚
	public Map getInitCal(String gapanNo,String cal_mode) throws DataAccessException {

		Object[] values = {cal_mode,cal_mode,cal_mode,gapanNo};
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.getInitCal");
		
		Map retVal = null;
		try {
			retVal = getJdbcTemplate().queryForMap(sql, values);
		} catch (Exception err) {
			err.printStackTrace();
		}
		
		return retVal;
	}
	
	// ¡°øÎ±∏∫– ±∏«œ±‚
	public Map getSection(String admin_no)
			throws DataAccessException {

		Object[] values = { admin_no};
		Map returnNum = null;
		try {

			String sql = getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.getSection");
			returnNum = getJdbcTemplate().queryForMap(sql, values);

		} catch (Exception e) {
			System.out.println("getSection ERROR ERROR :" + e.toString());

		}

		return returnNum;
	}

	// ∞À≈‰ø©∫Œ º≥¡§
	public void SetCheckYn(String adminNo) {
		Object[] values = { adminNo };
		objSetCheckYN.update(values);
	}

	// ∞À≈‰ø©∫Œ º≥¡§
	public void SetTaxYn(String adminNo) {
		Object[] values = { adminNo };
		objSetTaxYN.update(values);
	}

	// π´¥‹¡°øÎ √—æ◊
	public int getTotalSum(String adminNo) throws DataAccessException {
		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getTotalSum");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// π´¥‹ ¡°øÎ ≥–¿Ã
	public int getMudanArea(String adminNo) throws DataAccessException {
		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getMudanArea");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// «ˆ¿Â¡∂ªÁ//////////////////////////////////////////////////////////////////////////////////////////
	// «ˆ¿Â¡∂ªÁ ¿‘∑¬
	public InspectBean insertInspect(InspectBean objInspectBean) {
		try {
			Object[] values = { objInspectBean.getADMIN_NO(),
					objInspectBean.getRESULT(), objInspectBean.getINSPECTOR(),
					objInspectBean.getINSPECT_DATE(),
					objInspectBean.getINSPECT_OPINION(),
					objInspectBean.getMANAGER_OPINION(),
					objInspectBean.getAPPROVAL_CONDITION(),
					String.valueOf(objInspectBean.getSEQ()) };

			/*
			 * System.out.println("inputvalue=" + objInspectBean.getADMIN_NO() +
			 * "  " + objInspectBean.getRESULT() + "  " +
			 * objInspectBean.getINSPECTOR() + "  " +
			 * objInspectBean.getINSPECT_DATE() + "  " +
			 * objInspectBean.getINSPECT_OPINION() + "  " +
			 * objInspectBean.getMANAGER_OPINION() + "  " +
			 * objInspectBean.getAPPROVAL_CONDITION());
			 */
			objInspectInsert.update(values);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objInspectBean;
	}

	// «ˆ¿Â¡∂ªÁ ∏ÆΩ∫∆Æ ƒ´øÓ∆Æ
	public int getInspectListCount(String adminNum) throws DataAccessException {
		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.inspectListCount");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// «ˆ¿Â¡∂ªÁ ªÛºº¡§∫∏
	public List InspectInfo(String adminNo, String seq) {
		// Object[] values = { adminNo, seq }; // «ˆ¿Â ¡∂ªÁ¥¬ gapan_no¥Á 1∞≥¿Ã∂Û seq±Ó¡ˆ ∞Àªˆ
		// ¡∂∞«ø° ≥÷¿ª « ø‰∞° æ¯¥Ÿ.
		Object[] values = { adminNo };
		return objInspectInfoQuery.execute(values);
	}

	// «ˆ¿Â¡∂ªÁ ºˆ¡§
	public InspectBean updateInspect(InspectBean objInspectBean) {
		try {
			Object[] values = { objInspectBean.getRESULT(),
					objInspectBean.getINSPECTOR(),
					objInspectBean.getINSPECT_DATE(),
					objInspectBean.getINSPECT_OPINION(),
					objInspectBean.getMANAGER_OPINION(),
					objInspectBean.getAPPROVAL_CONDITION(),
					objInspectBean.getADMIN_NO(),
					new Integer(objInspectBean.getSEQ()) };

			/*
			 * System.out.println(objInspectBean.getRESULT() + "  " +
			 * objInspectBean.getINSPECTOR() + "  " +
			 * objInspectBean.getINSPECT_DATE() + "  " +
			 * objInspectBean.getINSPECT_OPINION() + "  " +
			 * objInspectBean.getMANAGER_OPINION() + "  " +
			 * objInspectBean.getAPPROVAL_CONDITION() + "  " +
			 * objInspectBean.getADMIN_NO() + "  " + objInspectBean.getSEQ());
			 */

			objInspectUpdate.update(values);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objInspectBean;
	}

	// ∞À≈‰«˘¿«//////////////////////////////////////////////////////////////////////////////////////////
	// ∞À≈‰«˘¿« ∏ÆΩ∫∆Æ
	public List retrieveConfList(int intCurPage, int intCount, String adminNo,
			String gp_typ) throws DataAccessException {
		Object[] values = { adminNo, gp_typ, new Integer(intCurPage),
				new Integer(intCount), new Integer(intCount) };
		return objConfListQuery.execute(values);
	}

	// ∞À≈‰«˘¿« ƒ´øÓ∆Æ
	public int getConfListCount(String adminNum) throws DataAccessException {
		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.confListCount");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// ∞À≈‰«˘¿« ªÛºº¡§∫∏
	public List ConfInfo(String adminNo, String seq, String gp_typ) {
		Object[] values = { adminNo, seq, gp_typ };

		List list = objConfInfoQuery.execute(values);

		return list;
	}

	// ∞À≈‰«˘¿« ¿‘∑¬
	public ConfBean insertConf(ConfBean objConfBean) {
		try {
			Object[] values = { objConfBean.getADMIN_NO(),
					objConfBean.getORGANIZATION(), objConfBean.getCONF_DATE(),
					objConfBean.getMANAGE_DEPT(), objConfBean.getMANAGER(),
					objConfBean.getTEL(), objConfBean.getHP(),
					objConfBean.getCONF_COMMENT(),
					String.valueOf(objConfBean.getSEQ()),
					objConfBean.getGP_TYP() };
			objConfInsert.update(values);

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objConfBean;
	}

	// ∞À≈‰«˘¿« ºˆ¡§
	public ConfBean updateConf(ConfBean objConfBean) {
		try {

			Object[] values = { objConfBean.getORGANIZATION(),
					objConfBean.getMANAGE_DEPT(), objConfBean.getMANAGER(),
					objConfBean.getTEL(), objConfBean.getHP(),
					objConfBean.getCONF_COMMENT(), objConfBean.getCONF_DATE(),
					objConfBean.getADMIN_NO(), objConfBean.getGP_TYP(),
					new Integer(objConfBean.getSEQ()), objConfBean.getGP_TYP() };
			objConfUpdate.update(values);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objConfBean;
	}

	// π´¥‹ «ÿ¥Á ø¨µµ ¿⁄∑· ¿÷¥¬¡ˆ.
	public int get_calculationCount_mudan(String adminNum, String year)
			throws DataAccessException {
		Object[] values = { adminNum, year };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.get_calculationCount_mudan");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// ¡°øÎ¡ˆ ¿ßƒ°¡∂»∏
	// ////////////////////////////////////////////////////////////////////////////////////////
	// ¿ßƒ° ¡∂»∏
	public List retrieveLocatonList(int intCurPage, int intCount, String adminNo)
			throws DataAccessException {
		Object[] values = { adminNo, new Integer(intCurPage),
				new Integer(intCount), new Integer(intCount) };
		return objLocationListQuery.execute(values);
	}

	// ¿ßƒ°¡∂»∏ƒ´øÓ∆Æ
	public int getLocationListCount(String adminNum) throws DataAccessException {
		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.locationListCount");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// ¿ßƒ° ¿‘∑¬
	public PlaceLocationBean insertLocation(PlaceLocationBean objLocationBean) {
		// (ADMIN_NO,SEQ,LOCATE_X,LOCATE_Y,WIDTH,HEIGHT,AREA,EXPLAIN)
		Object[] values = { objLocationBean.getADMIN_NO(),
				objLocationBean.getLOCATE_X(), objLocationBean.getLOCATE_Y(),
				objLocationBean.getWIDTH(), objLocationBean.getHEIGHT(),
				objLocationBean.getAREA(), objLocationBean.getEXPLAIN() };

		/*
		 * System.out.println(objLocationBean.getADMIN_NO() + "  " +
		 * objLocationBean.getLOCATE_X() + "  " + objLocationBean.getLOCATE_Y()
		 * + "  " + objLocationBean.getWIDTH() + "  " +
		 * objLocationBean.getHEIGHT() + "  " + objLocationBean.getAREA() + "  "
		 * + objLocationBean.getEXPLAIN());
		 */
		objLocationInsert.update(values);
		return objLocationBean;
	}

	// ¿ßƒ° ¡§∫∏ ºˆ¡§
	public PlaceLocationBean updateLocation(PlaceLocationBean objLocationBean) {
		try {
			// UPDATE PLACEDETAIL_INFO SET
			// LOCATE_X=?,LOCATE_Y=?,WIDTH=?,HEIGHT=?,AREA=?,EXPLAIN=? WHERE SEQ
			// = ?
			Object[] values = { objLocationBean.getLOCATE_X(),
					objLocationBean.getLOCATE_Y(), objLocationBean.getWIDTH(),
					objLocationBean.getHEIGHT(), objLocationBean.getAREA(),
					objLocationBean.getEXPLAIN(),
					new Integer(objLocationBean.getSEQ()) };
			objLocationUpdate.update(values);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objLocationBean;
	}

	// ¿ßƒ°¡§∫∏ ªË¡¶
	public boolean deleteLocation(int intNum) throws DataAccessException {
		LocationDelete objLocationDelete = new LocationDelete(getDataSource());

		int result = objLocationDelete.update(intNum);

		if (result == -1)
			return false;
		return true;
	}

	// ¡°øÎ¡ˆ ∆ƒ¿œ¡∂»∏
	// ////////////////////////////////////////////////////////////////////////////////////////
	// ∆ƒ¿œ ¡∂»∏
	public List retrieveFileList(int intCurPage, int intCount, String adminNo)
			throws DataAccessException {
		Object[] values = { adminNo, new Integer(intCurPage),
				new Integer(intCount), new Integer(intCount) };
		return objFileListQuery.execute(values);
	}

	// ∆ƒ¿œ¡∂»∏ƒ´øÓ∆Æ
	public int getFileListCount(String adminNum) throws DataAccessException {
		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.fileListCount");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// ∆ƒ¿œ ¿‘∑¬
	public PlaceFileBean insertFile(PlaceFileBean objFileBean) {
		Object[] values = { objFileBean.getADMIN_NO(),
				objFileBean.getDATA_TYPE(), objFileBean.getDATA_EXPLAIN(),
				objFileBean.getATTACH_FILE(), objFileBean.getATTACH_SIZE(),
				objFileBean.getREGDATE(), objFileBean.getATTACH_SAVED_FILE() };

		objFileInsert.update(values);
		return objFileBean;
	}

	// ∆ƒ¿œ ¡§∫∏ ºˆ¡§
	public PlaceFileBean updateFile(PlaceFileBean objFileBean) {
		try {
			// DATA_TYPE=?,DATA_EXPLAIN=?,ATTACH_FILE=?,ATTAHC_SIZE=? \
			Object[] values = { objFileBean.getDATA_TYPE(),
					objFileBean.getDATA_EXPLAIN(),
					objFileBean.getATTACH_FILE(), objFileBean.getATTACH_SIZE(),
					new Integer(objFileBean.getSEQ()) };
			objFileUpdate.update(values);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objFileBean;
	}

	// ∆ƒ¿œ¡§∫∏ ªË¡¶
	public boolean deleteFile(int intNum) throws DataAccessException {

		FileDelete objFileDelete = new FileDelete(getDataSource());

		int result = objFileDelete.update(intNum);

		if (result == -1)
			return false;
		return true;
	}

	// «ÿ¡ˆ////////////////////////////////////////////////////////////////////////////////////////////
	// «ÿ¡ˆ¡§∫∏
	public DisUseBean disUseInfo(String admin_no) {
		Object[] values = { admin_no};
		DisUseBean disUseBean = new DisUseBean();
		try {

			System.out.println("disUseInfo:admin_no : " + admin_no);

			disUseBean = (DisUseBean) objDisUseInfo.execute(values).get(0);

			System.out.println("disUseInfo:disUseBean : "
					+ disUseBean.getDISUSE_REASON());

		} catch (Exception e) {
			System.out.println("disUseInfo Error : " + e.toString());
		}
		return disUseBean;
	}

	// «ÿ¡ˆ æ˜µ•¿Ã∆Æ
	public boolean disUseUpdate(DisUseBean disUseBean) {
		Object[] values = { disUseBean.getSECTION(),
				util.Date_Cut(disUseBean.getDISUSE_DATE()),
				disUseBean.getDISUSE_REASON(), disUseBean.getDISUSE_MANAGER(),
				disUseBean.getOLD_SECTION(), disUseBean.getGAPAN_NO()};

		int returnVal = objDisUseUpdate.update(values);

		if (returnVal == 1)
			return (true);
		else
			return (false);
	}

	// CALCULATION_INFO Ω√ƒˆΩ∫ ¡ı∞°∞™
	public int getCalculationSequence() {

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.GetCalculationSequence");

		int result = getJdbcTemplate().queryForInt(sql);

		// System.out.println(result);

		return result;
	}

	// «ˆ¿Â¡∂ªÁ ∏ÆΩ∫∆Æ
	public List retrieveInspectList(int intCurPage, int intCount, String adminNo)
			throws DataAccessException {
		Object[] values = { adminNo, new Integer(intCurPage),
				new Integer(intCount), new Integer(intCount) };
		return objInspectListQuery.execute(values);
	}

	// ∞®º“∫– ≥‚µµ º±≈√ ∏ÆΩ∫∆Æ
	public List productSubList(String adminNo, String year)
			throws DataAccessException {
		Object[] values = { adminNo, year };

		List a1 = null;

		try {
			a1 = objProductSubList.execute(values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}

		return a1;
	}

	// /////////////////////////////////////////////ªÍ√‚π∞ ∫Œ∞˙
	// ªÍ√‚π∞ ¿‘∑¬
	public int Cal_Sum_InfoInsert(ProductBean objProductBean) {
		// (ADMIN_NO, SEQ, YEAR, AREA,
		// SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
		int i = 0;
		try {
			Object[] values = { 
					objProductBean.getGAPAN_NO() // ADMIN_NO
					, objProductBean.getSEQ() // SEQ
					, objProductBean.getTAX_SEQ() // TAX_SEQ
					, objProductBean.getYEAR() // YEAR
					, objProductBean.getAREA_AFTER() // AREA
					, objProductBean.getSUM_ADJUST() // SUM_ADJUST
					, objProductBean.getVAT() // VAT
					, objProductBean.getREDUCTION_RATE() // REDUCTION_RATE
					, objProductBean.getSUM() // SUM
					, objProductBean.getUSE_SECTION() // 2ºˆΩ√(USE_SECTION)/1∞Ëº”
					, objProductBean.getREDUCTION_REASON() // REDUCTION_REASON
					, objProductBean.getPRICE() // price(∞¯Ω√¡ˆ∞°)
					, objProductBean.getRATE() // ø‰¿≤
					, objProductBean.getFORM_ADJUST() // ªÍ√‚Ωƒ
					, objProductBean.getFROMDATE() // fromdate
					, objProductBean.getTODATE() // todate
					, objProductBean.getCAL_MODE()
			};
			System.out.println("---ƒÆº∂¿Œ∆˜---");
			System.out.println("ƒÆ∏µÂ : "+objProductBean.getCAL_MODE());

			i = objCal_Sum_InfoInsert.update(values);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		// objCalTaxInsert = new CalTaxInsert(getDataSource());
		return i;
	}
	
	// /////////////////////////////////////////////ªÍ√‚π∞ ∫Œ∞˙
	// ªÍ√‚π∞ ¿‘∑¬
	class Cal_Sum_InfoInsert extends SqlUpdate {
		public Cal_Sum_InfoInsert(DataSource dataSource) {
			// (ADMIN_NO, SEQ, YEAR, AREA,
			// SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.cal_sum_infoInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // getADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // seq
			declareParameter(new SqlParameter(Types.VARCHAR)); // tax_seq
			declareParameter(new SqlParameter(Types.VARCHAR)); // getYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION(¡§±‚1,ºˆΩ√2)
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.VARCHAR)); // price
			declareParameter(new SqlParameter(Types.VARCHAR)); // rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // form_adjust
			declareParameter(new SqlParameter(Types.VARCHAR)); // fromdate
			declareParameter(new SqlParameter(Types.VARCHAR)); // todate
			declareParameter(new SqlParameter(Types.VARCHAR)); // CAL_MODE
		}
	}
	

	// CAL_SUM_INFO Ω√ƒˆΩ∫ ¡ı∞°∞™
	public int getCal_Sum_Seq() {

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.GetCAL_SUM_SEQ");
		int result = getJdbcTemplate().queryForInt(sql);
		return result;
	}

	// CAL_SUM_INFO ºˆ¡§
	public int CalSumUpdate(ProductBean objProductBean) {
		Object[] values = {
				objProductBean.getYEAR(), // YEAR
				objProductBean.getAREA_AFTER(), // AREA
				objProductBean.getSUM_ADJUST(), // SUM_ADJUST
				objProductBean.getVAT(), // VAT
				objProductBean.getSUM_ADJUST(), // SUM
				objProductBean.getUSE_SECTION(), // USE_SECTION
				objProductBean.getPRICE(), // PRICE
				objProductBean.getRATE(), // RATE
				objProductBean.getFORM_ADJUST(), // FORM_ADJUST
				objProductBean.getFROMDATE(), // FROMDATE
				objProductBean.getTODATE(), // TODATE
				objProductBean.getGAPAN_NO(),
				objProductBean.getCAL_SUM_SEQ() // SEQ
				
		};

		int i = objCalSumUpdate.update(values);
		return i;
	}
	
	// /////////////////////////////////////////////CAL_SUM_INFO
	// CAL_SUM_INFO ºˆ¡§
	class CalSumUpdate extends SqlUpdate {
		public CalSumUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.cal_sum_infoUpdate"));
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // AREA
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // PRICE
			declareParameter(new SqlParameter(Types.VARCHAR)); // RATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // FROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // TODATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // GAPAN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // SEQ
		}
	}

	// CAL_SUM_INFO
	public ProductBean CalSumInfoInfo(int seq) {
		Object[] values = { new Integer(seq) };

		ProductBean pb = (ProductBean) objCalSumInfoInfo.execute(values).get(0);

		return pb;
	}

	// ≥‚µµ∫∞ first_seq∫∞ seq
	public int getCalSeqbyFirstSeq(String year, String first_seq)
			throws DataAccessException {
		Object[] values = { year, first_seq };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getCalSeqbyFirstSeq");
		int returnNum = 0;
		try {
			returnNum = getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}

	// FORM_ADJUST CAL_SUM_SEQ∑Œ ∞°¡Æø¿±‚
	public List FormAdjustList(int seq) {
		Object[] values = { new Integer(seq) };

		List a1 = objFormAdjustListQuery.execute(values);

		return a1;

	}

	// π´¥‹ ¡°øÎ cal_sum_seq
	public int get_cal_sum_seq(String year) throws DataAccessException {
		Object[] values = { year };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.get_cal_sum_seq");
		int returnNum = 0;
		try {
			returnNum = getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}

	// ∞¯Ω√¡ˆ∞° ±∏«œ±‚.
	public Map get_Price(String gapanNo)
			throws DataAccessException {
		Object[] values = {gapanNo};

		System.out.println("gapanNo :" + gapanNo);

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.get_Price");
		Map returnNum = null;
		try {
			returnNum = getJdbcTemplate().queryForMap(sql, values);
		} catch (Exception err) {
			System.out.println("GET_PRICE ERROR  : " + err.toString());
		}
		return returnNum;
	}

	// ADMIN_BASE UPDATE
	public void Admin_baseUp_dateUpdateQuery(String update, String admin_no) {
		Object[] values = { update, admin_no};
		System.out.println("Admin_baseUp_dateUpdateQuery");
		for (int i = 0; i < values.length; i++)
			System.out.println(i + ":::" + values[i]);
		objAdmin_baseUp_dateUpdateQuery.update(values);
	}

	// «ˆ¿Â¡∂ªÁ ªË¡¶
	public void Delete_Inspect(int seq) {
		Object[] values = { new Integer(seq) };
		objDelete_InspectQuery.update(values);
	}

	// ∞À≈‰ «˘¿« ªË¡¶
	public void Delete_Conf(int seq) {
		Object[] values = { new Integer(seq) };
		objDelete_ConfQuery.update(values);
	}

	// ¿œπ› ¡°øÎ ¿œºˆ ∞°¡Æø¿±‚
	public int getTotalPeriod(String admin_no) throws DataAccessException {
		Object[] values = { admin_no };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getTotalPeriod");
		int returnNum = 0;
		try {
			returnNum = getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}

	// ////////////query ±∏«ˆ
	// ////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////////////

	

	// ¡°øÎ ¡∂»∏ π◊ ∞¸∏Æ - ¡°øÎ ¡∂»∏ Excel ∫Ø»Ø
	protected class RetrieveBoardListExcelQuery extends MappingSqlQuery {
		protected RetrieveBoardListExcelQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.ocupancyList2Excel"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // TAX_SET
			declareParameter(new SqlParameter(Types.VARCHAR)); // BJ_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // BONBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // BUBUN
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // NUMBERVALUE
			declareParameter(new SqlParameter(Types.VARCHAR)); // JUMYONGNAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // FT_TYP
			//********** BEGIN_KANG_20120423
			declareParameter(new SqlParameter(Types.VARCHAR)); // Facility_No
			//********** END_KANG_20120423
		    declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CODE

			/*
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.ocupancyList_Excel"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // TYPE
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // TAX_SET
			declareParameter(new SqlParameter(Types.VARCHAR)); // CHECK_TYPE

			declareParameter(new SqlParameter(Types.VARCHAR)); // NUMBERVALUE
			declareParameter(new SqlParameter(Types.VARCHAR)); // JUMYONGNAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUCODE
			declareParameter(new SqlParameter(Types.VARCHAR)); // BJ_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // BONBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // BUBUN
			*/
			
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			jumyongBean objJumyongBean = new jumyongBean();

			BeanUtil.mappingBean(objJumyongBean, rs);
			
            objJumyongBean.setVIO_CD_NAME(getViolationNameJumyong(objJumyongBean,"VIO_SEL"));
			objJumyongBean.setVIO_ACTCD_NAME(getViolationNameJumyong(objJumyongBean,"VIO_ACTSEL"));

			/*
			objJumyongBean.setPLACE_A(rs.getString("PLACE_A"));
			objJumyongBean.setNO(rs.getString("R_ID"));
			objJumyongBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objJumyongBean.setTYPE_NAME(rs.getString("TYPE"));
			objJumyongBean.setSECTION_NAME(rs.getString("SECTION_NAME"));
			objJumyongBean.setSECTION(rs.getString("SECTION"));
			objJumyongBean.setNAME(rs.getString("OWNER_NAME"));
			objJumyongBean.setADDR(rs.getString("ADDR"));
			objJumyongBean.setCHECK_NAME(rs.getString("CHECK_YN"));
			objJumyongBean.setUP_DATE(rs.getString("UP_DATE"));
			objJumyongBean.setTAX_SET_NAME(rs.getString("TAX_SET"));
			objJumyongBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			objJumyongBean.setGP_TYP(rs.getString("GP_TYP"));
			
			System.out.println("***********************gapan JumyongDao RetrieveBoardListExcelQuery.+++++++++++");
			*/
			return objJumyongBean;
		}
	}



	

	// ªÍ√‚π∞ ¿‘∑¬
	class CalInsert extends SqlUpdate {
		public CalInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.calInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // getADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // getYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPRICE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getTODATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.VARCHAR)); // getRATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_LASTYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_YEAR
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM
			declareParameter(new SqlParameter(Types.VARCHAR)); // getLICENSE_TAX
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPERIOD
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADJUSTMENT
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.VARCHAR)); // SURCHARGE_RATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION(¡§±‚,ºˆΩ√)
			declareParameter(new SqlParameter(Types.VARCHAR)); // CAL_SUM_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // PREV_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // UP_DATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // GP_TYP

		}
	}

	


	// ∞À≈‰ø©∫Œ º≥¡§
	class SetCheckYN extends SqlUpdate {
		public SetCheckYN(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.setCheck_Yn"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// ∫Œ∞˙ø©∫Œ º≥¡§
	class SetTaxYN extends SqlUpdate {
		public SetTaxYN(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.setTax_Yn"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// «ˆ¿Â¡∂ªÁ//////////////////////////////////////////////////////////////////////////////////////////
	// «ˆ¿Â¡∂ªÁ ¿‘∑¬
	class InspectInsert extends SqlUpdate {
		public InspectInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.inspectInsert"));
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

	// «ˆ¿Â¡∂ªÁ ∏ÆΩ∫∆Æ
	protected class RetrieveInspectListQuery extends MappingSqlQuery {
		protected RetrieveInspectListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.inspectList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			InspectBean objInspectBean = new InspectBean();

			objInspectBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objInspectBean.setRESULT(rs.getString("RESULT"));
			objInspectBean.setINSPECT_DATE(rs.getString("INSPECT_DATE"));
			objInspectBean.setINSPECTOR(rs.getString("INSPECTOR"));
			objInspectBean.setINSPECT_OPINION(rs.getString("INSPECT_OPINION"));
			objInspectBean.setMANAGER_OPINION(rs.getString("MANAGER_OPINION"));
			objInspectBean.setAPPROVAL_CONDITION(rs
					.getString("APPROVAL_CONDITION"));
			objInspectBean.setNAME(rs.getString("NAME"));
			objInspectBean.setSEQ(rs.getInt("SEQ"));

				
			System.out.println("***********************gapan JumyongDao RetrieveInspectListQuery.(Querys.gapan.jumyong.inspectList)+++++++++++");
			
			return objInspectBean;
		}
	}

	// «ˆ¿Â¡∂ªÁ ªÛºº¡§∫∏
	protected class InspectInfoQuery extends MappingSqlQuery {
		protected InspectInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.inspectInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			// declareParameter(new SqlParameter(Types.INTEGER));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			InspectBean objInspectBean = new InspectBean();

			objInspectBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objInspectBean.setRESULT(rs.getString("RESULT"));
			objInspectBean.setINSPECT_DATE(rs.getString("INSPECT_DATE"));
			objInspectBean.setINSPECTOR(rs.getString("INSPECTOR"));
			objInspectBean.setINSPECT_OPINION(rs.getString("INSPECT_OPINION"));
			objInspectBean.setMANAGER_OPINION(rs.getString("MANAGER_OPINION"));
			objInspectBean.setAPPROVAL_CONDITION(rs
					.getString("APPROVAL_CONDITION"));
			objInspectBean.setSEQ(rs.getInt("SEQ"));

			return objInspectBean;
		}
	}

	// «ˆ¿Â¡∂ªÁ ºˆ¡§
	class InspectUpdate extends SqlUpdate {
		public InspectUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.inspectUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
		}
	}

	// ∞À≈‰«˘¿«//////////////////////////////////////////////////////////////////////////////////////////
	// ∞À≈‰«˘¿« ∏ÆΩ∫∆Æ
	protected class RetrieveConfListQuery extends MappingSqlQuery {
		protected RetrieveConfListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.confList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ConfBean objConfBean = new ConfBean();

			objConfBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objConfBean.setORGANIZATION(rs.getString("ORGANIZATION"));
			objConfBean.setCONF_DATE(rs.getString("CONF_DATE"));
			objConfBean.setMANAGE_DEPT(rs.getString("MANAGE_DEPT"));
			objConfBean.setMANAGER(rs.getString("MANAGER"));
			objConfBean.setTEL(rs.getString("TEL"));
			objConfBean.setHP(rs.getString("HP"));
			objConfBean.setCONF_COMMENT(rs.getString("CONF_COMMENT"));
			objConfBean.setSEQ(rs.getInt("SEQ"));

			return objConfBean;
		}
	}

	// ∞À≈‰«˘¿« ªÛºº¡§∫∏
	protected class ConfInfoQuery extends MappingSqlQuery {
		protected ConfInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.confInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ConfBean objConfBean = new ConfBean();
			objConfBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objConfBean.setORGANIZATION(rs.getString("ORGANIZATION"));
			objConfBean.setCONF_DATE(rs.getString("CONF_DATE"));
			objConfBean.setMANAGE_DEPT(rs.getString("MANAGE_DEPT"));
			objConfBean.setMANAGER(rs.getString("MANAGER"));
			objConfBean.setTEL(rs.getString("TEL"));
			objConfBean.setHP(rs.getString("HP"));
			objConfBean.setCONF_COMMENT(rs.getString("CONF_COMMENT"));
			objConfBean.setSEQ(rs.getInt("SEQ"));

			return objConfBean;
		}
	}

	// ∞À≈‰«˘¿« ¿‘∑¬
	class ConfInsert extends SqlUpdate {
		public ConfInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.confInsert"));
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

	// ∞À≈‰«˘¿« ºˆ¡§
	class ConfUpdate extends SqlUpdate {
		public ConfUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.confUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// ¿ßƒ°¡§∫∏//////////////////////////////////////////////////////////////////////////////////////////
	// ¿ßƒ°¡§∫∏ ∏ÆΩ∫∆Æ
	protected class RetrieveLocationListQuery extends MappingSqlQuery {
		protected RetrieveLocationListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.locationList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			PlaceLocationBean objLocationBean = new PlaceLocationBean();

			objLocationBean.setSEQ(rs.getInt("SEQ"));
			objLocationBean.setLOCATE_X(rs.getString("LOCATE_X"));
			objLocationBean.setLOCATE_Y(rs.getString("LOCATE_Y"));
			objLocationBean.setWIDTH(rs.getString("WIDTH"));
			objLocationBean.setHEIGHT(rs.getString("HEIGHT"));
			objLocationBean.setAREA(rs.getString("AREA"));
			objLocationBean.setEXPLAIN(rs.getString("EXPLAIN"));
			return objLocationBean;
		}
	}

	// ∞À≈‰«˘¿« ¿‘∑¬
	class LocationfInsert extends SqlUpdate {
		public LocationfInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.locationInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// ¿ßƒ°¡§∫∏ ºˆ¡§
	class LocationUpdate extends SqlUpdate {
		public LocationUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.locationUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
		}
	}

	// ¿ßƒ°¡§∫∏ ªË¡¶
	class LocationDelete extends SqlUpdate {
		public LocationDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.locationDelete"));

			declareParameter(new SqlParameter(Types.INTEGER));
		}
	}

	// ∆ƒ¿œ¡§∫∏//////////////////////////////////////////////////////////////////////////////////////////
	// ∆ƒ¿œ¡§∫∏ ∏ÆΩ∫∆Æ
	protected class RetrieveFileListQuery extends MappingSqlQuery {
		protected RetrieveFileListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.fileList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			// ATTACH_SEQ,DATA_TYPE,DATA_EXPLAIN,ATTACH_FILE,ATTACH_NM,ATTACH_SIZE

			PlaceFileBean objFileBean = new PlaceFileBean();

			objFileBean.setSEQ(rs.getInt("SEQ"));
			objFileBean.setDATA_TYPE(rs.getString("DATA_TYPE"));
			objFileBean.setDATA_EXPLAIN(rs.getString("DATA_EXPLAIN"));
			objFileBean.setATTACH_FILE(rs.getString("ATTACH_FILE"));
			objFileBean.setATTACH_SIZE(rs.getString("ATTACH_SIZE"));
			objFileBean.setDATA_TYPE_NAME(rs.getString("DATA_TYPE_NAME"));
			objFileBean.setREGDATE(rs.getString("REGDATE"));
			objFileBean.setATTACH_SAVED_FILE(rs.getString("ATTACH_SAVED_FILE"));
			// System.out.println(rs.getString("ATTACH_SAVED_FILE"));
			
			System.out.println("***********************gapan JumyongDao RetrieveInspectListQuery.(Querys.gapan.jumyong.fileList)+++++++++++");
			
			
			return objFileBean;
		}
	}

	// ∆ƒ¿œ ¿‘∑¬
	class FileInsert extends SqlUpdate {
		public FileInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.fileInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// ∆ƒ¿œ ºˆ¡§
	class FileUpdate extends SqlUpdate {
		public FileUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.fileUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
		}
	}

	// ∆ƒ¿œ ªË¡¶
	class FileDelete extends SqlUpdate {
		public FileDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.fileDelete"));
			declareParameter(new SqlParameter(Types.INTEGER));
		}
	}

	// «ÿ¡ˆ¡§∫∏//////////////////////////////////////////////////////////////////////////////////////////

	protected class DisUseInfoQuery extends MappingSqlQuery {
		protected DisUseInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.disUseInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			DisUseBean objDisUseBean = new DisUseBean();

			objDisUseBean.setDISUSE_DATE(rs.getString("DISUSE_DATE"));
			objDisUseBean.setDISUSE_MANAGER(rs.getString("DISUSE_MANAGER"));
			objDisUseBean.setDISUSE_REASON(rs.getString("DISUSE_REASON"));

			System.out.println("DisUseInfoQuery : "
					+ rs.getString("DISUSE_DATE"));
			System.out.println("DisUseInfoQuery : "
					+ rs.getString("DISUSE_MANAGER"));
			System.out.println("DisUseInfoQuery : "
					+ rs.getString("DISUSE_REASON"));

			return objDisUseBean;
		}
	}

	// «ÿ¡ˆ æ˜µ•¿Ã∆Æ
	class DisUseUpdate extends SqlUpdate {
		public DisUseUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.disUseUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// ∞®º“∫– ¡§«“ ªÍ√‚π∞ ∏ÆΩ∫∆Æ

	protected class productSubListQuery extends MappingSqlQuery {
		protected productSubListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.productSubList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();
			objProductBean.setCAL_YEAR(rs.getString("CAL_YEAR"));
			objProductBean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
			objProductBean.setAREA(rs.getString("AREA"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setUSE_SECTIONNAME(rs.getString("NAME"));
			objProductBean.setTAX_YNNAME(rs.getString("TAX_YNNAME"));
			System.out.println("***********************gapan JumyongDao productSubListQuery.(Querys.gapan.jumyong.productSubList)+++++++++++");
			return objProductBean;
		}
	}

	

	

	// CAL_SUM_INFO
	protected class CalSumInfoInfo extends MappingSqlQuery {
		protected CalSumInfoInfo(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.cal_sum_infoInfo"));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		// SELECT
		// ADMIN_NO,SEQ,YEAR,AREA,SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON
		// \
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();
			objProductBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setAREA(rs.getString("AREA"));
			objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			objProductBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			objProductBean.setSUM(rs.getString("SUM"));
			objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
			objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			objProductBean.setCAL_SUM_SEQ(rs.getString(("SEQ")));

			System.out.println("***********************gapan JumyongDao CalSumInfoInfo.(Querys.gapan.jumyong.cal_sum_infoInfo)+++++++++++");
			
			return objProductBean;
		}
	}

	// FORM_ADJUST CAL_SUM_SEQ∑Œ ∞°¡Æø¿±‚
	protected class FormAdjustListQuery extends MappingSqlQuery {
		protected FormAdjustListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.form_adjustListbyCalSumInfo"));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();
			objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			return objProductBean;
		}
	}

	// ADMIN_BASE UPDATE
	protected class Admin_baseUp_dateUpdateQuery extends SqlUpdate {
		public Admin_baseUp_dateUpdateQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.admin_baseUp_dateUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // up_date
			declareParameter(new SqlParameter(Types.VARCHAR)); // admin_no
		}
	}

	// «ˆ¿Â¡∂ªÁ ªË¡¶
	protected class Delete_InspectQuery extends SqlUpdate {
		public Delete_InspectQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.delete_inspect"));
			declareParameter(new SqlParameter(Types.INTEGER)); // int
		}
	}

	// ∞À≈‰ «˘¿« ªË¡¶
	protected class Delete_ConfQuery extends SqlUpdate {
		public Delete_ConfQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.delete_conf"));
			declareParameter(new SqlParameter(Types.INTEGER)); // int
		}
	}

	// ¿ßπ›¡∂ƒ°≥ªø™
	public int getVioTotalCount(ProductBean objProductBean)
			throws DataAccessException {

		Object[] values = { objProductBean.getGAPAN_NO()};
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.getVioTotalCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		// System.out.println("count2=" + returnNum + " " + adminNum);

		return returnNum;
	}

	public List getVioTotalList(ProductBean objProductBean, int intCurPage,
			int intCount) throws DataAccessException {

		Object[] values = { objProductBean.getGAPAN_NO(),
				new Integer(intCurPage),
				new Integer(intCount) };
		return objGetVioTotalList.execute(values);
	}

	protected class GetVioTotalList extends MappingSqlQuery {
		protected GetVioTotalList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.getVioTotalList"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();

			objProductBean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			objProductBean.setGP_TYP(rs.getString("GP_TYP"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setVIO_DEG(rs.getString("VIO_DEG"));
			objProductBean.setVIO_DATE(rs.getString("VIO_DATE"));
			objProductBean.setVIO_ACTDATE(rs.getString("VIO_ACTDATE"));
			objProductBean.setVIO_CONTENT(rs.getString("VIO_CONTENT"));
			objProductBean.setVIO_ACTCONTENT(rs.getString("VIO_ACTCONTENT"));
			objProductBean.setVIO_POINTS(rs.getString("VIO_POINTS"));
			objProductBean.setVIO_ACCPOINTS(rs.getString("VIO_ACCPOINTS"));
			objProductBean.setVIO_ACTCD(rs.getString("VIO_ACTCD"));
			objProductBean.setVIO_CD(rs.getString("VIO_CD"));
			objProductBean.setVIO_IMG1_NAME(rs.getString("VIO_IMG1"));
			objProductBean.setVIO_IMG2_NAME(rs.getString("VIO_IMG2"));
			objProductBean.setVIO_ACTIMG1_NAME(rs.getString("VIO_ACTIMG1"));
			objProductBean.setVIO_ACTIMG2_NAME(rs.getString("VIO_ACTIMG2"));
			objProductBean.setVIO_DEPT(rs.getString("VIO_DEPT"));
			
			objProductBean.setVIO_SEL1(rs.getString("VIO_SEL1"));
			objProductBean.setVIO_SEL2(rs.getString("VIO_SEL2"));
			objProductBean.setVIO_SEL3(rs.getString("VIO_SEL3"));
			objProductBean.setVIO_SEL4(rs.getString("VIO_SEL4"));
			objProductBean.setVIO_SEL5(rs.getString("VIO_SEL5"));
			objProductBean.setVIO_SEL6(rs.getString("VIO_SEL6"));
			objProductBean.setVIO_SEL7(rs.getString("VIO_SEL7"));
			objProductBean.setVIO_ACTSEL1(rs.getString("VIO_ACTSEL1"));
			objProductBean.setVIO_ACTSEL2(rs.getString("VIO_ACTSEL2"));
			objProductBean.setVIO_ACTSEL3(rs.getString("VIO_ACTSEL3"));
			objProductBean.setVIO_ACTSEL4(rs.getString("VIO_ACTSEL4"));
			objProductBean.setVIO_ACTSEL5(rs.getString("VIO_ACTSEL5"));
			
			objProductBean.setVIO_NAME(getViolationNameProduct(objProductBean,"VIO_SEL"));
			objProductBean.setVIO_ACTNAME(getViolationNameProduct(objProductBean,"VIO_ACTSEL"));
			
			System.out.println("***********************gapan JumyongDao GetVioTotalList.(Querys.gapan.jumyong.getVioTotalList)+++++++++++");
			
			
			return objProductBean;
		}
	}

	// ¿ßπ›ªÁ«◊ µÓ∑œ
	public ProductBean violationRegisterPrc(ProductBean objProductBean) {
		try {
			
			if(objProductBean.getVIO_POINTS() == null || objProductBean.getVIO_POINTS().equals(""))
				objProductBean.setVIO_POINTS("0.0");
			
			

			Object[] values = { 
					objProductBean.getGAPAN_NO(), 		// GAPAN_NO
					objProductBean.getGP_TYP(), 		// GP_TYP
					objProductBean.getVIO_DEG(), 		// VIO_DEG
					objProductBean.getVIO_DATE(), 		// VIO_DATE
					objProductBean.getVIO_ACTDATE(), 	// VIO_ACTDATE
					
					objProductBean.getVIO_CONTENT(), 			// VIO_CONTENT
					objProductBean.getVIO_ACTCONTENT(), 		// VIO_ACTCONTENT
					new Float(objProductBean.getVIO_POINTS()),  // VIO_POINTS
					objProductBean.getVIO_ACTCD(), 				// VIO_ACTCD
					objProductBean.getVIO_CD(),
					
					objProductBean.getVIO_DEPT(),
					objProductBean.getVIO_IMG1_NAME(),
					objProductBean.getVIO_IMG2_NAME(),
					objProductBean.getVIO_ACTIMG1_NAME(),
					objProductBean.getVIO_ACTIMG2_NAME(),
					
					objProductBean.getVIO_SEL1(),
					objProductBean.getVIO_SEL2(),
					objProductBean.getVIO_SEL3(),
					objProductBean.getVIO_SEL4(),
					objProductBean.getVIO_SEL5(),
					objProductBean.getVIO_SEL6(),
					objProductBean.getVIO_SEL7(),
					
					objProductBean.getVIO_ACTSEL1(),
					objProductBean.getVIO_ACTSEL2(),
					objProductBean.getVIO_ACTSEL3(),
					objProductBean.getVIO_ACTSEL4(),
					objProductBean.getVIO_ACTSEL5()
			};
			
			for(int i = 0 ; i < values.length ; i++)
				System.out.println(":::::::::"+values[i]+"::::::::::::");

			objViolationRegisterPrc.update(values);

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objProductBean;
	}

	class ViolationRegisterPrc extends SqlUpdate {
		public ViolationRegisterPrc(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.violationRegisterPrc"));

			declareParameter(new SqlParameter(Types.VARCHAR)); // GAPAN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // GP_TYP
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_DEG
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_DATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_ACTDATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_CONTENT
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_ACTCONTENT
			declareParameter(new SqlParameter(Types.FLOAT)); // VIO_POINTS
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_ACTCD
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_CD
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_DEPT
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_IMG1_NAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_IMG2_NAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_ACTIMG1_NAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // VIO_ACTIMG2_NAME
			
			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_SEL1(),
			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_SEL2(),
			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_SEL3(),
			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_SEL4(),
			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_SEL5(),

			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_SEL6(),
			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_SEL7(),
			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_ACTSEL1(),
			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_ACTSEL2(),
			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_ACTSEL3(),

			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_ACTSEL4(),
			declareParameter(new SqlParameter(Types.VARCHAR)); //VIO_ACTSEL5()
		}
	}

	// ¿ßπ›ªÁ«◊ ªÛºº≥ªø™
	public ProductBean getViolationView(String gapanNo, String seq) {

		ProductBean pb = new ProductBean();

		try {

			Object[] values = {gapanNo,seq};

			pb = (ProductBean) objGetViolationView.execute(values).get(0);

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return pb;
	}

	protected class GetViolationView extends MappingSqlQuery {
		protected GetViolationView(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.getViolationView"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			ProductBean objProductBean = new ProductBean();

			objProductBean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			objProductBean.setGP_TYP(rs.getString("GP_TYP"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setVIO_DEG(rs.getString("VIO_DEG"));
			objProductBean.setVIO_DATE(rs.getString("VIO_DATE"));

			objProductBean.setVIO_ACTDATE(rs.getString("VIO_ACTDATE"));
			objProductBean.setVIO_CONTENT(rs.getString("VIO_CONTENT"));
			objProductBean.setVIO_ACTCONTENT(rs.getString("VIO_ACTCONTENT"));
			
			objProductBean.setVIO_POINTS(rs.getString("VIO_POINTS"));
			
			objProductBean.setVIO_ACCPOINTS(rs.getString("VIO_ACCPOINTS"));
			objProductBean.setVIO_DEPT(rs.getString("VIO_DEPT"));
			objProductBean.setVIO_ACTCD(rs.getString("VIO_ACTCD"));
			objProductBean.setVIO_CD(rs.getString("VIO_CD"));
			objProductBean.setVIO_IMG1_NAME(rs.getString("VIO_IMG1"));
			objProductBean.setVIO_IMG2_NAME(rs.getString("VIO_IMG2"));
			objProductBean.setVIO_ACTIMG1_NAME(rs.getString("VIO_ACTIMG1"));
			objProductBean.setVIO_ACTIMG2_NAME(rs.getString("VIO_ACTIMG2"));
			
	        objProductBean.setVIO_SEL1(rs.getString("VIO_SEL1"));
	        objProductBean.setVIO_SEL2(rs.getString("VIO_SEL2"));
	        objProductBean.setVIO_SEL3(rs.getString("VIO_SEL3"));
	        objProductBean.setVIO_SEL4(rs.getString("VIO_SEL4"));
	        objProductBean.setVIO_SEL5(rs.getString("VIO_SEL5"));
	        objProductBean.setVIO_SEL6(rs.getString("VIO_SEL6"));
	        objProductBean.setVIO_SEL7(rs.getString("VIO_SEL7"));
	        objProductBean.setVIO_ACTSEL1(rs.getString("VIO_ACTSEL1"));
	        objProductBean.setVIO_ACTSEL2(rs.getString("VIO_ACTSEL2"));
	        objProductBean.setVIO_ACTSEL3(rs.getString("VIO_ACTSEL3"));
	        objProductBean.setVIO_ACTSEL4(rs.getString("VIO_ACTSEL4"));
	        objProductBean.setVIO_ACTSEL5(rs.getString("VIO_ACTSEL5"));

			return objProductBean;
		}
	}

	// ¿ßπ›ªÁ«◊ ¡ﬂ∫π√º≈©
	public int violationCheck(ProductBean objProductBean)
			throws DataAccessException {

		Object[] values = { objProductBean.getGAPAN_NO(), objProductBean.getVIO_DEG() };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.violationCheck");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);

		return returnNum;
	}

	// ¿ßπ›≥ªø™ update
	public ProductBean violationUpdate(ProductBean objProductBean) {
		
		if(objProductBean.getVIO_POINTS() == null || objProductBean.getVIO_POINTS().equals("")){
			objProductBean.setVIO_POINTS("0.0");
		}

		try {

			Object[] values = {
					objProductBean.getVIO_DATE(), 		// VIO_DATE
					objProductBean.getVIO_ACTDATE(), 	// VIO_ACTDATE
					objProductBean.getVIO_CONTENT(), 			// VIO_CONTENT
					objProductBean.getVIO_ACTCONTENT(), 		// VIO_ACTCONTENT
					new Float(objProductBean.getVIO_POINTS()),  // VIO_POINTS
					
					objProductBean.getVIO_ACTCD(), 				// VIO_ACTCD
					objProductBean.getVIO_CD(),
					objProductBean.getVIO_DEPT(),
					objProductBean.getVIO_IMG1_NAME(),
					objProductBean.getVIO_IMG2_NAME(),
					
					objProductBean.getVIO_ACTIMG1_NAME(),
					objProductBean.getVIO_ACTIMG2_NAME(),
					objProductBean.getVIO_SEL1(),
					objProductBean.getVIO_SEL2(),
					objProductBean.getVIO_SEL3(),

					objProductBean.getVIO_SEL4(),
					objProductBean.getVIO_SEL5(),
					objProductBean.getVIO_SEL6(),
					objProductBean.getVIO_SEL7(),
					objProductBean.getVIO_ACTSEL1(),
					
					objProductBean.getVIO_ACTSEL2(),
					objProductBean.getVIO_ACTSEL3(),
					objProductBean.getVIO_ACTSEL4(),
					objProductBean.getVIO_ACTSEL5(),
					objProductBean.getGAPAN_NO(), 		// GAPAN_NO
					
					objProductBean.getSEQ()
			};

			objViolationUpdate.update(values);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return objProductBean;
	}

	class ViolationUpdate extends SqlUpdate {
		public ViolationUpdate(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.violationUpdate"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.FLOAT));
			
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
	
	
	// ¿œ∞˝ªÍ√‚¿ß«ÿ ¡§∫∏∫“∑Øø¿±‚
    public ProductBean getBatchCalculationProductList(String gapan_no,String year){
    	
		Object[] values = {year,year,year,year,gapan_no};

		return (ProductBean) objBatchProductListQuery.execute(values).get(0);
	}
    
	protected class BatchProductListQuery extends MappingSqlQuery {
		protected BatchProductListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.BatchProductList"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // GAPAN_NO
			
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();
			
			objProductBean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			objProductBean.setTAX_SET(rs.getString("TAX_SET"));
			objProductBean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			objProductBean.setLAST_AREA_AFTER(rs.getString("LAST_AREA_AFTER"));
			objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
			objProductBean.setADDR(rs.getString("ADDR"));
			objProductBean.setPRICE(rs.getString("PRICE"));
			objProductBean.setRATE(String.valueOf(rs.getFloat("RATE")));
			objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
			objProductBean.setREDUCTION_RATE(String.valueOf(rs.getFloat("REDUCTION_RATE")));
			objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			objProductBean.setSF_VALUE(rs.getString("SF_VALUE"));
			
	
			return objProductBean;
		}
	}
	
	public ProductBean getCalculationItem(String year, String gapanNo) {
		Object[] values = {year, gapanNo};
		@SuppressWarnings("unchecked")
		List<ProductBean> list = objGetCalculationItemQuery.execute(values);
//		logger.info("size = " + list.size() + ", year = " + year + ", gapanNo" + gapanNo);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null ;
	}
	
	protected class GetCalculationItemQuery extends MappingSqlQuery {

		protected GetCalculationItemQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.GetCalculationItem"));
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // GAPAN_NO
			
		}
		
		@Override
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
//			logger.error("test query");
			ProductBean bean = new ProductBean();
			
			BeanUtil.mappingBean(bean, rs);
			
			return bean;
		}
		
	}
	
	//≥‚µµ∫∞ ªÍ√‚ ¿Øπ´ ø©∫Œ
	// ªÍ√‚π∞ ¿€≥‚µµ ¡°øÎ∑·
	public int cal_sum_exist(String gapan_no,String year, String cal_mode) throws DataAccessException {
		Object[] values = { gapan_no, year, cal_mode };
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.Cal_sum_exist");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}
	
	
    //	∫Œ∞˙¡§∫∏ ¿‘∑¬
    public	boolean	executeBugwa_Register(ProductBean Bean)
	{
    	try
		{
			Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getSIGU_CD(),
					Bean.getBJ_CD(),
					Bean.getTAX_NO(),
					Bean.getDEPT_CD(),

					Bean.getTAX_GUBUN(),
					Bean.getTAX_YM(),
					Bean.getOBJ_SET(),
					Bean.getTAXPAYER_ID(),
					Bean.getTAXPAYER_SET(),

					Bean.getLIVE(),
					Bean.getINDATE(),
					Bean.getOVERDATE(),
					Bean.getTAX_DATE(),
					Bean.getADD_SET(),

					Bean.getADD_YN(),
					Bean.getNOTES(),
					Bean.getLIMIT_SUM(),
					Bean.getLIMIT_CNT(),
					Bean.getRATE(),

					Bean.getRATE_CAUSE(),
					Bean.getBONSE(),
					Bean.getGIGUM(),
					Bean.getGUKSE(),
					Bean.getSISE(),

					Bean.getGUSE(),
					Bean.getVAT(),
					Bean.getINTAX(),
					Bean.getOVERTAX(),
					Bean.getFORM1(),

					Bean.getFORM2(),
					Bean.getYEAR(),
					Bean.getSEQ(),
					Bean.getTAX_YN(),
					Bean.getOCR_SIGU_CD(),

					Bean.getOCR_BUSEO_CD(),
					Bean.getSUBUSEO_CD(),
					Bean.getTAX_CD(),
					Bean.getGP_TYP(),
					Bean.getCAL_SUM_SEQ(),

					Bean.getCAL_MODE()
				};

			for(int i = 0; i < values.length ; i++){
				System.out.println(i+" :executeBugwa_Register: " +  values[i]);
			}
			
			System.out.println("cal_mode : "+Bean.getCAL_MODE());
			System.out.println("***********************gapan JumyongDao executeBugwa_Register.()+++++++++++");
			logger.debug(Debug.toQueryString(objExecuteBugwaRegister.getSql(), values));
			objExecuteBugwaRegister.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
	class ExecuteBugwaRegister extends SqlUpdate {
		public ExecuteBugwaRegister(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().
					getMessage("Querys.gapan.jumyong.Bugwa_Register"));

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
	         declareParameter(new SqlParameter(Types.VARCHAR));
	         declareParameter(new SqlParameter(Types.VARCHAR));
	         declareParameter(new SqlParameter(Types.VARCHAR));
	         declareParameter(new SqlParameter(Types.VARCHAR));
	         
	         declareParameter(new SqlParameter(Types.VARCHAR));

	        
        }
	}
    // ªÍ√‚¡§∫∏ ªË¡¶
    public int executeDeleteCalTax(String gapanNo,String seq){
		Object[] values = {gapanNo,seq};
		
		if (objExecuteDeleteTaxationQuery.update(values) > 0) {
			objExecuteDeleteCalSumQuery.update(values);
			objExecuteDeleteCalculationQuery.update(values);
			return 1;
		}
		return 0;
	
	}
    
	// ªÍ√‚«’∞Ë ªË¡¶
	protected class ExecuteDeleteCalculationQuery extends SqlUpdate {
		public ExecuteDeleteCalculationQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.ExecuteDeleteCalculation"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //SEQ
		}
	}
	
	// ªÍ√‚«’∞Ë ªË¡¶
	protected class ExecuteDeleteCalSumQuery extends SqlUpdate {
		public ExecuteDeleteCalSumQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.ExecuteDeleteCalSum"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //SEQ
		}
	}
	
	// ªÍ√‚«’∞Ë ªË¡¶
	protected class ExecuteDeleteTaxationQuery extends SqlUpdate {
		public ExecuteDeleteTaxationQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.ExecuteDeleteTaxation"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //SEQ
		}
	}
	
	 //	∫Œ∞˙¡§∫∏ ºˆ¡§
	public boolean	updateBugwa_Register(ProductBean Bean) {
		try {

			Object[] values = {
					Bean.getTAX_GUBUN(),
					Bean.getTAX_YM(),
					Bean.getOBJ_SET(),
					Bean.getTAXPAYER_ID(),
					Bean.getTAXPAYER_SET(),
					
					Bean.getLIVE(),
					Bean.getINDATE(),
					Bean.getOVERDATE(),
					Bean.getTAX_DATE(),
					Bean.getADD_SET(),
					
					Bean.getADD_YN(),
					Bean.getNOTES(),
					Bean.getLIMIT_SUM(),
					Bean.getLIMIT_CNT(),
					Bean.getRATE(),
					
					Bean.getRATE_CAUSE(),
					Bean.getBONSE(),
					Bean.getGIGUM(),
					Bean.getGUKSE(),
					Bean.getSISE(),
					
					Bean.getGUSE(),
					
					Bean.getVAT(),
					Bean.getINTAX(),
					Bean.getOVERTAX(),
					Bean.getFORM1(),
					Bean.getFORM2(),

					Bean.getYEAR(),
					Bean.getTAX_YN(),
					Bean.getOCR_SIGU_CD(),
					Bean.getOCR_BUSEO_CD(),
					Bean.getSUBUSEO_CD(),

					Bean.getTAX_CD(),
					Bean.getCAL_SUM_SEQ(),
					Bean.getCAL_MODE(),
					Bean.getGAPAN_NO(),
					Bean.getSEQ()
					
				};
			
				for(int i = 0; i < values.length ; i++){
					logger.fatal(i+" :[lkh]updateBugwa_Register: " +  values[i]);
				}

			logger.fatal("Start db update");
			logger.debug(Debug.toQueryString(objUpdateBugwaRegister.getSql(), values));
  			objUpdateBugwaRegister.update(values);
  			logger.fatal("Stop db update");

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	// ªÍ√‚π∞ ºˆ¡§
	class UpdateBugwaRegister extends SqlUpdate {
		public UpdateBugwaRegister(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.updateBugwa_Register"));
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
	         declareParameter(new SqlParameter(Types.VARCHAR));//SISE
	         
	         declareParameter(new SqlParameter(Types.VARCHAR)); //GUSE
	         
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
	
	
	  //∆Û±‚/∏≈∞¢ ∏ÆΩ∫∆Æ
	public List ProductSaleList(String gapanNo) throws DataAccessException {
		Object[] values = { 
				gapanNo
				};
		
		for(int i = 0 ; i < values.length ; i++){
			System.out.println("::ProductList::" + values[i]);
		}
		
		return objProductSaleListQuery.execute(values);
	}
	
	// ªÍ√‚π∞ ∏ÆΩ∫∆Æ

	protected class ProductSaleListQuery extends MappingSqlQuery {
		protected ProductSaleListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.productSaleList"));
			declareParameter(new SqlParameter(Types.VARCHAR));


		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			SaleBean objSaleBean = new SaleBean();


			objSaleBean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			objSaleBean.setSALE_TYPE(rs.getString("SALE_TYPE"));
			objSaleBean.setSALE_DATE(rs.getString("SALE_DATE"));
			objSaleBean.setSALE_NO(rs.getString("SALE_NO"));
			objSaleBean.setHND_OFFICE(rs.getString("HND_OFFICE"));
			objSaleBean.setHND_TYPE(rs.getString("HND_TYPE"));
			objSaleBean.setHND_DESDATE(rs.getString("HND_DESDATE"));
			objSaleBean.setSALE_STATUS(rs.getString("SALE_STATUS"));
			objSaleBean.setSALE_BIGO(rs.getString("SALE_BIGO"));
			objSaleBean.setHND_BIGO(rs.getString("HND_BIGO"));
			objSaleBean.setHND_OPEDATE(rs.getString("HND_OPEDATE"));

			

			return objSaleBean;
		}
	}
	//∆Û±‚/∏≈∞¢ ∞≥ºˆ
	public int getProductSaleListCount(String gapanNo) throws DataAccessException {

		Object[] values = {gapanNo};
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.jumyong.productSaleCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		// System.out.println("count2=" + returnNum + " " + adminNum);

		return returnNum;
	}
	
	// ∆Û±‚/∏≈∞¢ ªË¡¶
    public void executeDeleteProductSale(String gapanNo){
    	Object[] values = {gapanNo};
	
    	objExecuteDeleteProductSaleQuery.update(values);

	}

	// ªÍ√‚«’∞Ë ªË¡¶
	protected class ExecuteDeleteProductSaleQuery extends SqlUpdate {
		public ExecuteDeleteProductSaleQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.jumyong.ExecuteDeleteProductSale"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
			
		}
	}
	
   
    
    //∆Û±‚∏≈∞¢ µÓ∑œ
    public boolean ExecuteSale_Register(SaleBean objSaleBean) {
	    try	{
			Object[] values = {
					objSaleBean.getGAPAN_NO(),
					objSaleBean.getSALE_TYPE(),
					objSaleBean.getSALE_DATE(),
					objSaleBean.getSALE_NO(),
					objSaleBean.getHND_OFFICE(),
					objSaleBean.getHND_TYPE(),
					objSaleBean.getHND_DESDATE(),
					objSaleBean.getSALE_STATUS(),
					objSaleBean.getSALE_BIGO(),
					objSaleBean.getHND_BIGO(),
					objSaleBean.getHND_OPEDATE()
			};
			
			for(int i = 0 ; i < values.length ; i ++){
				System.out.println(": UpdateSale_Register :" + values[i]);
			}
	
			objExecuteSale_RegisterQuery.update(values);
			
			}catch(Exception e)
			{
				e.printStackTrace();
				return	false;
			}
		
		return	true;
	}


	class ExecuteSale_RegisterQuery extends SqlUpdate {
		public ExecuteSale_RegisterQuery(DataSource dataSource) {
	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.ExecuteSale_RegisterQuery"));
			
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
	
	
	 //∆Û±‚∏≈∞¢ ºˆ¡§
    public boolean UpdateSale_Register(SaleBean objSaleBean){
    	try
		{
    		Object[] values = {
    				objSaleBean.getSALE_TYPE(),
    				objSaleBean.getSALE_DATE(),
    				objSaleBean.getSALE_NO(),
    				objSaleBean.getHND_OFFICE(),
    				objSaleBean.getHND_TYPE(),
    				objSaleBean.getHND_DESDATE(),
    				objSaleBean.getSALE_STATUS(),
    				objSaleBean.getSALE_BIGO(),
    				objSaleBean.getHND_BIGO(),
    				objSaleBean.getHND_OPEDATE(),
    				objSaleBean.getGAPAN_NO()
				
			};
    		
    		for(int i = 0 ; i < values.length ; i ++){
    			System.out.println(": UpdateSale_Register :" + values[i]);
    		}

    		objUpdateSale_RegisterQuery.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    
    class UpdateSale_RegisterQuery extends SqlUpdate {
		public UpdateSale_RegisterQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.UpdateSale_RegisterQuery"));

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
    
    public ProductBean getViolationAddInfo(String gapanNo){
    	
    	ProductBean pb = new ProductBean();

		try {

			Object[] values = {gapanNo};

			pb = (ProductBean) objGetViolationAddInfo.execute(values).get(0);

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return pb;
	}

	protected class GetViolationAddInfo extends MappingSqlQuery {
		protected GetViolationAddInfo(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.getViolationAddInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			ProductBean objProductBean = new ProductBean();

			objProductBean.setVIO_DEG(rs.getString("VIO_DEG"));
			objProductBean.setVIO_ACCPOINTS(rs.getString("VIO_ACCPOINTS"));

			return objProductBean;
		}
	}
	
	
	public Map getGiganPoint(String gapanNo)throws DataAccessException {

		Object[] values = {gapanNo};
		System.out.println("getGiganPoint : : : "+gapanNo);
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.getGiganPoint");
		
		Map retVal = null;
		try {
			retVal = getJdbcTemplate().queryForMap(sql, values);
		} catch (Exception err) {
			err.printStackTrace();
		}
		
		return retVal;
	}
	
	
	public void deleteViolationInfo(String gapanNo, String seq){
		Object[] values = {gapanNo,seq};
    	objDeleteViolationInfoQuery.update(values);
		
	}
	
	// ∞À≈‰ «˘¿« ªË¡¶
	protected class DeleteViolationInfoQuery extends SqlUpdate {
		public DeleteViolationInfoQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.deleteViolationInfoQuery"));
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // 
			declareParameter(new SqlParameter(Types.VARCHAR)); // 
		}
	}
	
	//¿œ∞˝±‚∞¸ø¨¿Â
    public void executeGiganUpdate(String gapanNo, String mul_fromdate, String mul_todate){
    	Object[] values = {mul_fromdate,mul_todate,gapanNo};
    	objExecuteGiganUpdateQuery.update(values);
		
	}
    
	//¿œ∞˝±‚∞¸ø¨¿Â
	protected class ExecuteGiganUpdateQuery extends SqlUpdate {
		public ExecuteGiganUpdateQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.executeGiganUpdateQuery"));
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // 
			declareParameter(new SqlParameter(Types.VARCHAR)); // 
			declareParameter(new SqlParameter(Types.VARCHAR)); // 
		}
	}
	
	
//  √‚∑¬π∞ ¡§∫∏ æÚ±‚
    public Map get_DocInfo(String gapanNo)
    {

		Object[] values = {gapanNo};
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.getDocInfo");
		
		Map retVal = null;
		try {
			retVal = getJdbcTemplate().queryForMap(sql, values);
		} catch (Exception err) {
			err.printStackTrace();
		}
		
		return retVal;
    }
    
    
    
    public String getViolationNameProduct(ProductBean temp, String type){
    	
    	String retVal = "";
    	int countVal = 0;
    	
    		if(type.equals("VIO_SEL")){
    	    	if(temp.getVIO_SEL1() != null && temp.getVIO_SEL1().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "¿¸∏≈/¿¸¥Î";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
    	    	if(temp.getVIO_SEL2() != null && temp.getVIO_SEL2().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "¥Î∏ÆøÓøµ";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
    	    	if(temp.getVIO_SEL3() != null && temp.getVIO_SEL3().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "∫“π˝±§∞Ìπ∞";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
    	    	if(temp.getVIO_SEL4() != null && temp.getVIO_SEL4().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "¿ΩΩƒ¡∂∏Æ";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
    	    	if(temp.getVIO_SEL5() != null && temp.getVIO_SEL5().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "∫“π˝¿˚ƒ°π∞";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
    	    	if(temp.getVIO_SEL6() != null && temp.getVIO_SEL6().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "Ω√º≥π∞»—º’";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
    	    	if(temp.getVIO_SEL7() != null && temp.getVIO_SEL7().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "±‚≈∏";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
        	}else{
        		if(temp.getVIO_ACTSEL1() != null && temp.getVIO_ACTSEL1().equals("1")){
    	    		if(retVal.length() == 0)
        				retVal = "«„∞°√Îº“";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
        		if(temp.getVIO_ACTSEL2() != null && temp.getVIO_ACTSEL2().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "Ω√¡§∏Ì∑…";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
        		if(temp.getVIO_ACTSEL3() != null && temp.getVIO_ACTSEL3().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "∞˙≈¬∑·∫Œ∞˙";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
        		if(temp.getVIO_ACTSEL4() != null && temp.getVIO_ACTSEL4().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "π˙¡°∫Œ∞˙";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
        		if(temp.getVIO_ACTSEL5() != null && temp.getVIO_ACTSEL5().equals("1")){
    	    		if(retVal.length() == 0)
    	    			retVal = "±‚≈∏";
    	    		else{
    	    			countVal += 1;
    	    		}
    	    	}
        	}
    		
    		if(countVal > 0){
    			retVal = retVal +" ø‹ "+countVal+"∞«";
    		}
    	

    	return retVal;
    }
    
    
    public String getViolationNameJumyong(jumyongBean temp, String type){
    	
    	String retVal = "";
    	int countVal = 0;
    	
   		if(type.equals("VIO_SEL")){
	    	if(temp.getVIO_SEL1() != null && temp.getVIO_SEL1().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "¿¸∏≈/¿¸¥Î";
	    		else{
	    			countVal += 1;
	    		}
	    	}
	    	if(temp.getVIO_SEL2() != null && temp.getVIO_SEL2().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "¥Î∏ÆøÓøµ";
	    		else{
	    			countVal += 1;
	    		}
	    	}
	    	if(temp.getVIO_SEL3() != null && temp.getVIO_SEL3().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "∫“π˝±§∞Ìπ∞";
	    		else{
	    			countVal += 1;
	    		}
	    	}
	    	if(temp.getVIO_SEL4() != null && temp.getVIO_SEL4().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "¿ΩΩƒ¡∂∏Æ";
	    		else{
	    			countVal += 1;
	    		}
	    	}
	    	if(temp.getVIO_SEL5() != null && temp.getVIO_SEL5().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "∫“π˝¿˚ƒ°π∞";
	    		else{
	    			countVal += 1;
	    		}
	    	}
	    	if(temp.getVIO_SEL6() != null && temp.getVIO_SEL6().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "Ω√º≥π∞»—º’";
	    		else{
	    			countVal += 1;
	    		}
	    	}
	    	if(temp.getVIO_SEL7() != null && temp.getVIO_SEL7().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "±‚≈∏";
	    		else{
	    			countVal += 1;
	    		}
	    	}
    	}else{
    		if(temp.getVIO_ACTSEL1() != null && temp.getVIO_ACTSEL1().equals("1")){
	    		if(retVal.length() == 0)
    				retVal = "«„∞°√Îº“";
	    		else{
	    			countVal += 1;
	    		}
	    	}
    		if(temp.getVIO_ACTSEL2() != null && temp.getVIO_ACTSEL2().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "Ω√¡§∏Ì∑…";
	    		else{
	    			countVal += 1;
	    		}
	    	}
    		if(temp.getVIO_ACTSEL3() != null && temp.getVIO_ACTSEL3().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "∞˙≈¬∑·∫Œ∞˙";
	    		else{
	    			countVal += 1;
	    		}
	    	}
    		if(temp.getVIO_ACTSEL4() != null && temp.getVIO_ACTSEL4().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "π˙¡°∫Œ∞˙";
	    		else{
	    			countVal += 1;
	    		}
	    	}
    		if(temp.getVIO_ACTSEL5() != null && temp.getVIO_ACTSEL5().equals("1")){
	    		if(retVal.length() == 0)
	    			retVal = "±‚≈∏";
	    		else{
	    			countVal += 1;
	    		}
	    	}
    	}
   		
		if(countVal > 0){
			retVal = retVal +" ø‹ "+countVal+"∞«";
		}
    	
    	return retVal;
    }
    
	// «ÿ¡ˆ«ÿ√º √Îº“
	public void disuseCancel(String gapanNo){
		try{
		Object[] values = {gapanNo};
		System.out.println(":::"+gapanNo);
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.jumyong.disuseCancel");
		getJdbcTemplate().update(sql, values);
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}
