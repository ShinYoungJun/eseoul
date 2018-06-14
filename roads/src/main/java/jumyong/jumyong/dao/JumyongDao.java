package main.java.jumyong.jumyong.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.*;
import main.java.common.util.catUtil.Util;
//import gov.mogaha.rnic.common.model.RnicBoardBean;

import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.initCalBean;
import main.java.jumyong.jumyong.model.jumyongBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyong.model.placeWithAddrBean;

import org.apache.derby.tools.sysinfo;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class JumyongDao extends RoadsJdbcDaoSupport implements IJumyongDao {
	private OracleLobHandler oracleLobHandler = null;
	// 점용조회
	// ////////////////////////////////////////////////////////////////////////////////////////
	// 점용조회
	private RetrieveBoardListQuery objRetrieveQuery = null;

	// 점용조회
	private RetrieveBoardListExcelQuery objRetrieveExcelQuery = null;

	// 산출물 개별 정보
	private ProductInfoQuery objProductInfoQuery = null;
	// 검토여부 설정
	private SetCheckYN objSetCheckYN;

	// 검토여부 설정
	private SetTaxYN objSetTaxYN;

	private Util util = new Util();

	// 현장조사//////////////////////////////////////////////////////////////////////////////////////////
	private InspectInsert objInspectInsert;
	private RetrieveInspectListQuery objInspectListQuery = null;
	private InspectInfoQuery objInspectInfoQuery = null;
	private InspectUpdate objInspectUpdate;

	// 검토협의//////////////////////////////////////////////////////////////////////////////////////////

	private RetrieveConfListQuery objConfListQuery = null;
	private ConfInfoQuery objConfInfoQuery = null;
	private ConfInsert objConfInsert;
	private ConfUpdate objConfUpdate;

	// 위치정보//////////////////////////////////////////////////////////////////////////////////////////
	private RetrieveLocationListQuery objLocationListQuery = null;
	private LocationfInsert objLocationInsert;
	private LocationUpdate objLocationUpdate;

	// 파일정보//////////////////////////////////////////////////////////////////////////////////////////
	private RetrieveFileListQuery objFileListQuery = null;
	private FileInsert objFileInsert;
	private FileUpdate objFileUpdate;

	// 첨부파일//////////////////////////////////////////////////////////////////////////////////////////

	// 해지정보//////////////////////////////////////////////////////////////////////////////////////////
	private DisUseInfoQuery objDisUseInfo = null;
	private DisUseUpdate objDisUseUpdate = null;
	private DisUseDelete objDisUseDelete = null;

	// 감소분 정할 산출 리스트
	private productSubListQuery objProductSubList = null;

	// CAL_SUM_INFO 수정
	private CalSumUpdate2 objCalSumUpdate2;

	// CAL_SUM_INFO
	private CalSumInfoInfo objCalSumInfoInfo;

	// FORM_ADJUST CAL_SUM_SEQ로 가져오기
	private FormAdjustListQuery objFormAdjustListQuery;

	// ADMIN_BASE UPDATE
	private Admin_baseUp_dateUpdateQuery objAdmin_baseUp_dateUpdateQuery;

	// 현장조사 삭제
	private Delete_InspectQuery objDelete_InspectQuery;

	// 검토 협의 삭제
	private Delete_ConfQuery objDelete_ConfQuery;

	// 이력정보 list
	private GetHistoryList objGetHistoryList;
	private InsertHistoryInfo objInsertHistoryInfo;
	private GetHistoryView objGetHistoryView;
	private UpdateHistoryInfo objUpdateHistoryInfo;

	// 무단점용총액
	private GetTotalSumQuery objGetTotalSumQuery;

	private AdminBaseCheckYN objAdminBaseCheckYN = null;

	// 산출내역 삭제
	private DeleteCalSumInfoQuery objDeleteCalSumInfoQuery;
	private DeleteCalculationInfoQuery objDeleteCalculationInfoQuery;
	private DeleteTaxationInfoQuery objDeleteTaxationInfoQuery;

	protected void initDao() throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
		// 점용조회
		// ////////////////////////////////////////////////////////////////////////////////////////
		// 점용조회
		objRetrieveQuery = new RetrieveBoardListQuery(getDataSource());

		// 점용조회
		// ////////////////////////////////////////////////////////////////////////////////////////
		// 점용조회 Excel
		objRetrieveExcelQuery = new RetrieveBoardListExcelQuery(getDataSource());

		// 산출물 개별 정보
		objProductInfoQuery = new ProductInfoQuery(getDataSource());
		// 검토여부 설정
		objSetCheckYN = new SetCheckYN(getDataSource());
		objSetTaxYN = new SetTaxYN(getDataSource());

		// 현장조사//////////////////////////////////////////////////////////////////////////////////////////
		objInspectInsert = new InspectInsert(getDataSource());
		objInspectListQuery = new RetrieveInspectListQuery(getDataSource());
		objInspectInfoQuery = new InspectInfoQuery(getDataSource());
		objInspectUpdate = new InspectUpdate(getDataSource());

		// 검토협의//////////////////////////////////////////////////////////////////////////////////////////
		objConfListQuery = new RetrieveConfListQuery(getDataSource());
		objConfInfoQuery = new ConfInfoQuery(getDataSource());
		objConfInsert = new ConfInsert(getDataSource());
		objConfUpdate = new ConfUpdate(getDataSource());

		// 위치정보//////////////////////////////////////////////////////////////////////////////////////////
		objLocationListQuery = new RetrieveLocationListQuery(getDataSource());
		objLocationInsert = new LocationfInsert(getDataSource());
		objLocationUpdate = new LocationUpdate(getDataSource());

		// 위치정보//////////////////////////////////////////////////////////////////////////////////////////
		objFileListQuery = new RetrieveFileListQuery(getDataSource());
		objFileInsert = new FileInsert(getDataSource());
		objFileUpdate = new FileUpdate(getDataSource());

		// 해지정보//////////////////////////////////////////////////////////////////////////////////////////
		objDisUseInfo = new DisUseInfoQuery(getDataSource());
		objDisUseUpdate = new DisUseUpdate(getDataSource());
		objDisUseDelete = new DisUseDelete(getDataSource());

		// 감소분 정할 산출 리스트
		objProductSubList = new productSubListQuery(getDataSource());
		// CAL_SUM_INFO 수정
		objCalSumUpdate2 = new CalSumUpdate2(getDataSource());
		// CAL_SUM_INFO
		objCalSumInfoInfo = new CalSumInfoInfo(getDataSource());

		// FORM_ADJUST CAL_SUM_SEQ로 가져오기
		objFormAdjustListQuery = new FormAdjustListQuery(getDataSource());

		// ADMIN_BASE UPDATE
		objAdmin_baseUp_dateUpdateQuery = new Admin_baseUp_dateUpdateQuery(
				getDataSource());

		// 현장조사 삭제
		objDelete_InspectQuery = new Delete_InspectQuery(getDataSource());

		// 검토 협의 삭제
		objDelete_ConfQuery = new Delete_ConfQuery(getDataSource());

		// 이력정보 list
		objGetHistoryList = new GetHistoryList(getDataSource());
		// 이력정보 insert
		objInsertHistoryInfo = new InsertHistoryInfo(getDataSource());
		objGetHistoryView = new GetHistoryView(getDataSource());
		objUpdateHistoryInfo = new UpdateHistoryInfo(getDataSource());
		// 무단점용 총액
		objGetTotalSumQuery = new GetTotalSumQuery(getDataSource());
		// 산출 삭제
		objDeleteCalSumInfoQuery = new DeleteCalSumInfoQuery(getDataSource());
		objDeleteCalculationInfoQuery = new DeleteCalculationInfoQuery(
				getDataSource());
		objDeleteTaxationInfoQuery = new DeleteTaxationInfoQuery(
				getDataSource());

		// admin_base checkyn 업데이트
		objAdminBaseCheckYN = new AdminBaseCheckYN(getDataSource());
	}

	// SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별
	public int SumBysumSeq(String admin_no, String seq) {
		Object[] values = { admin_no, new Integer(seq)};
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.jumyong.getSumBysumseq");
		int returnNum = 0;
		returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// CAL_SUM_INFO 테이블 면적 추가 업데이트
	public int CalSumAddUpdate(ProductBean objProductBean) {

		System.out.println("sum_adjust=" + objProductBean.getSUM_ADJUST());
		int i = 0;
		try {
			
			CalSumAddUpdate objCalSumAddUpdate = new CalSumAddUpdate(getDataSource());

			Object[] values = { 
					new Float(objProductBean.getAREA_AFTER()),
					new Integer(objProductBean.getSUM_ADJUST()),
					new Long(objProductBean.getVAT()),
					new Long(objProductBean.getREDUCTION_SUM()),
					objProductBean.getREDUCTION_FORM(),
					new Float(objProductBean.getREDUCTION_RATE()),
					objProductBean.getREDUCTION_REASON(),
					new Float(objProductBean.getPERCENT_RATE()),
					objProductBean.getPERCENT_REASON(),
					objProductBean.getSEQ(), objProductBean.getADMIN_NO(),
					objProductBean.getSEQ(), objProductBean.getADMIN_NO(),
					objProductBean.getYEAR(), objProductBean.getSEQ(),
					objProductBean.getADMIN_NO() 
					};

			i = objCalSumAddUpdate.update(values);

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return i;
	}
	class CalSumAddUpdate extends SqlUpdate {
		public CalSumAddUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.cal_sum_addUpdate"));
			declareParameter(new SqlParameter(Types.FLOAT)); // area
			declareParameter(new SqlParameter(Types.INTEGER)); // sum_adjust
			declareParameter(new SqlParameter(Types.INTEGER)); // vat
			declareParameter(new SqlParameter(Types.INTEGER)); // sum_adjust
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM_ADJUST
			declareParameter(new SqlParameter(Types.FLOAT)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_form
			declareParameter(new SqlParameter(Types.FLOAT)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_form
			declareParameter(new SqlParameter(Types.VARCHAR)); // seq
			declareParameter(new SqlParameter(Types.VARCHAR)); // admin_no
			declareParameter(new SqlParameter(Types.VARCHAR)); // seq
			declareParameter(new SqlParameter(Types.VARCHAR)); // admin_no
			declareParameter(new SqlParameter(Types.VARCHAR)); // year
			declareParameter(new SqlParameter(Types.VARCHAR)); // seq
			declareParameter(new SqlParameter(Types.VARCHAR)); // admin_no
		}
	}

	// 점용조회
	// ////////////////////////////////////////////////////////////////////////////////////////
	// 점용 조회
	public List retrieveBoardList(SearchBean objectSearchBean) {

		if (objectSearchBean.getTYPE().equals("")) {
			objectSearchBean.setTYPE("%");
		}
		if (objectSearchBean.getSECTION().equals("")) {
			objectSearchBean.setSECTION("%");
		}
		if (objectSearchBean.getTAX_SET().equals("")) {
			objectSearchBean.setTAX_SET("%");
		}
		if (objectSearchBean.getCHECK_YN().equals("")) {
			objectSearchBean.setCHECK_YN("%");
		}
		if (objectSearchBean.getBJ_CD().equals("")) {
			objectSearchBean.setBJ_CD("%");
		}
		if (objectSearchBean.getHJ_CD().equals("")) {
			objectSearchBean.setHJ_CD("%");
		}
		if (objectSearchBean.getBONBUN().equals("")) {
			objectSearchBean.setBONBUN("%");
		}
		if (objectSearchBean.getBUBUN().equals("")) {
			objectSearchBean.setBUBUN("%");
		}
		if (objectSearchBean.getNUMBERVALUE().equals("")) {
			objectSearchBean.setNUMBERVALUE("%");
		}
		if (objectSearchBean.getJUMYONGNAME().equals("")) {
			objectSearchBean.setJUMYONGNAME("%");
		}
		if (objectSearchBean.getPURPOSE().equals("")) {
			objectSearchBean.setPURPOSE("%");
		}
		if (objectSearchBean.getGU_CODE().equals("")) {
			objectSearchBean.setGU_CODE("%");
		}
		if (objectSearchBean.getFROMDATE().equals("0")) {
			objectSearchBean.setFROMDATE("99999999");
		}
		;

		Object[] values = { objectSearchBean.getFROMDATE(),
				objectSearchBean.getTODATE(), objectSearchBean.getTYPE(),
				objectSearchBean.getSECTION(), objectSearchBean.getSECTION(), objectSearchBean.getSECTION(), 
				objectSearchBean.getTAX_SET(),
				objectSearchBean.getCHECK_YN(), 
				objectSearchBean.getBJ_CD(), objectSearchBean.getHJ_CD(),
				objectSearchBean.getBONBUN(), objectSearchBean.getBUBUN(),
				objectSearchBean.getBONBUN(), objectSearchBean.getBUBUN(),
				objectSearchBean.getNUMBERVALUE(),
				objectSearchBean.getJUMYONGNAME(),
				objectSearchBean.getPURPOSE(), objectSearchBean.getGU_CODE(),
				new Integer(objectSearchBean.getINTCURPAGE()), new Integer(10),
				new Integer(10) };
		//System.out.println("이게 view??/검색 안되는 점용이냐??");
		return objRetrieveQuery.execute(values);
	}

	// 점용조회
	// ////////////////////////////////////////////////////////////////////////////////////////
	// 점용 조회
	public List retrieveBoardList_Excel(SearchBean objectSearchBean) {
		

		if (objectSearchBean.getTYPE().equals("")) {
			objectSearchBean.setTYPE("%");
		}
		if (objectSearchBean.getSECTION().equals("")) {
			objectSearchBean.setSECTION("%");
		}
		if (objectSearchBean.getTAX_SET().equals("")) {
			objectSearchBean.setTAX_SET("%");
		}
		if (objectSearchBean.getCHECK_YN().equals("")) {
			objectSearchBean.setCHECK_YN("%");
		}
		if (objectSearchBean.getBJ_CD().equals("")) {
			objectSearchBean.setBJ_CD("%");
		}
		if (objectSearchBean.getHJ_CD().equals("")) {
			objectSearchBean.setHJ_CD("%");
		}
		if (objectSearchBean.getBONBUN().equals("")) {
			objectSearchBean.setBONBUN("%");
		}
		if (objectSearchBean.getBUBUN().equals("")) {
			objectSearchBean.setBUBUN("%");
		}
		if (objectSearchBean.getNUMBERVALUE().equals("")) {
			objectSearchBean.setNUMBERVALUE("%");
		}
		if (objectSearchBean.getJUMYONGNAME().equals("")) {
			objectSearchBean.setJUMYONGNAME("%");
		}
		if (objectSearchBean.getPURPOSE().equals("")) {
			objectSearchBean.setPURPOSE("%");
		}
		if (objectSearchBean.getGU_CODE().equals("")) {
			objectSearchBean.setGU_CODE("%");
		}
		if (objectSearchBean.getFROMDATE().equals("0")) {
			objectSearchBean.setFROMDATE("99999999");
		};
		
		System.out.println("retrieveBoardList_Excel 검색 안되는 점용엑셀이냐.??");
		
		Object[] values = { objectSearchBean.getFROMDATE(),
				objectSearchBean.getTODATE(), objectSearchBean.getTYPE(),
				objectSearchBean.getSECTION(), objectSearchBean.getSECTION(), objectSearchBean.getSECTION(), 
				objectSearchBean.getTAX_SET(),
				objectSearchBean.getCHECK_YN(), 
				objectSearchBean.getBJ_CD(), objectSearchBean.getHJ_CD(),
				objectSearchBean.getBONBUN(), objectSearchBean.getBUBUN(),
				objectSearchBean.getBONBUN(), objectSearchBean.getBUBUN(),
				objectSearchBean.getNUMBERVALUE(),
				objectSearchBean.getJUMYONGNAME(),
				objectSearchBean.getPURPOSE(), objectSearchBean.getGU_CODE() };

		List ll_result = objRetrieveExcelQuery.execute(values);
		
		System.out.println("Dao 결과 "+ll_result.size());
		
		System.out.println("sql 결과 ="+objRetrieveExcelQuery.getSql());
		
		return ll_result;
	}

	// 점용 조회 개수
	public int getProductListCount(SearchBean objectSearchBean) {
		System.out.println("getProductListCount!!!!!!!!!!");
		if (objectSearchBean.getFROMDATE().equals(""))
			objectSearchBean.setFROMDATE("0");
		if (objectSearchBean.getTODATE().equals(""))
			objectSearchBean.setTODATE("99999999");
		if (objectSearchBean.getTYPE().equals("0")
				|| objectSearchBean.getTYPE().equals(""))
			objectSearchBean.setTYPE("%");
		if (objectSearchBean.getSECTION().equals("0")
				|| objectSearchBean.getSECTION().equals(""))
			objectSearchBean.setSECTION("%");
		if (objectSearchBean.getTAX_SET().equals("0")
				|| objectSearchBean.getTAX_SET().equals(""))
			objectSearchBean.setTAX_SET("%");
		if (objectSearchBean.getCHECK_YN().equals(""))
			objectSearchBean.setCHECK_YN("%");

		// 표준공시지가
		if (objectSearchBean.getBJ_CD().equals("")
				|| objectSearchBean.getBJ_CD().equals("00000"))
			objectSearchBean.setBJ_CD("%");
		if (objectSearchBean.getHJ_CD().equals("")
				|| objectSearchBean.getHJ_CD().equals("00000"))
			objectSearchBean.setHJ_CD("%");
		if (objectSearchBean.getBONBUN().equals(""))
			objectSearchBean.setBONBUN("%");
		if (objectSearchBean.getBUBUN().equals(""))
			objectSearchBean.setBUBUN("%");

		int under_var = 0;
		List numberValueList = new ArrayList();
		int j = 0;

		if (objectSearchBean.getNUMBERVALUE().equals(""))
			objectSearchBean.setNUMBERVALUE("%");
		else { // 쿼리상에서 _를 처리해주기 위해
			for (int i = 0; i < objectSearchBean.getNUMBERVALUE().length(); i++) {

				if (String.valueOf(objectSearchBean.getNUMBERVALUE().charAt(i))
						.equals("_")) {
					under_var = 1;
					numberValueList.add(j, "@");
					j++;
				}
				numberValueList.add(j, String.valueOf(objectSearchBean
						.getNUMBERVALUE().charAt(i)));
				j++;
			}

			if (under_var == 0) {
				objectSearchBean.setNUMBERVALUE("%"
						+ objectSearchBean.getNUMBERVALUE() + "%");
			} else {
				String numberValue = "";

				for (int i = 0; i < numberValueList.size(); i++) {
					numberValue = numberValue
							+ numberValueList.get(i).toString();
				}

				objectSearchBean.setNUMBERVALUE("%" + numberValue + "%");
			}
		}

		if (objectSearchBean.getJUMYONGNAME().equals(""))
			objectSearchBean.setJUMYONGNAME("%");
		else
			objectSearchBean.setJUMYONGNAME("%"
					+ objectSearchBean.getJUMYONGNAME() + "%");

		String str1 = "";
		String str2 = "";
		String str3 = "";
		if (objectSearchBean.getPURPOSE().length() > 1) {
			str1 = objectSearchBean.getPURPOSE().substring(0, 1);
			str2 = objectSearchBean.getPURPOSE().substring(1, 2);
			str3 = objectSearchBean.getPURPOSE().substring(2, 3);
		}

		if (objectSearchBean.getPURPOSE().equals("")
				|| objectSearchBean.getPURPOSE() == null) {
			objectSearchBean.setPURPOSE("%");
		} else if (str3.equals("0")) {
			if (str2.equals("0")) {
				objectSearchBean.setPURPOSE(str1 + "%");
			} else {
				objectSearchBean.setPURPOSE(str1 + str2 + "%");
			}
		}

		Object[] values = { objectSearchBean.getFROMDATE(),
				objectSearchBean.getTODATE(), objectSearchBean.getTYPE(),
				objectSearchBean.getSECTION(), objectSearchBean.getSECTION(), objectSearchBean.getSECTION(), 
				objectSearchBean.getTAX_SET(),
				objectSearchBean.getCHECK_YN(),
				objectSearchBean.getBJ_CD(), objectSearchBean.getHJ_CD(),
				objectSearchBean.getBONBUN(), objectSearchBean.getBUBUN(),
				objectSearchBean.getBONBUN(), objectSearchBean.getBUBUN(),
				objectSearchBean.getNUMBERVALUE(),
				objectSearchBean.getJUMYONGNAME(),
				objectSearchBean.getPURPOSE(), objectSearchBean.getGU_CODE() };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.ocupancyListCount");

		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		System.out.println("객체수는?" + returnNum);
		return returnNum;

	}

	// 부과여부 확인

	public boolean define_tax_yn(String adminNo, String seq) {

		Object[] values = { adminNo, seq };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.defineTaxYN");
		System.out.println("@@@@ adminNO : " + adminNo);
		System.out.println("@@@@ seq : " + seq);

		try {
			Map returnVal = getJdbcTemplate().queryForMap(sql, values);
			System.out.println("@@@@ returnVal : " + returnVal.toString());
			String val = returnVal.get("RESULT").toString();
			if (val.equals("TRUE")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception err) {
			return false;

		}

	}

	// 산출물 리스트
	public List ProductList(int intCurPage, int intCount, String adminNo) throws DataAccessException {
		
		productListQuery productList = new productListQuery(getDataSource());
		
		Object[] values = { adminNo, new Integer(intCurPage),
				new Integer(intCount), new Integer(intCount) };
		return productList.execute(values);
	}
	
	protected class productListQuery extends MappingSqlQuery {
		protected productListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.ocucupancy.productList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();

			objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
			objProductBean.setRATE(rs.getFloat("RATE"));
			objProductBean.setLICENSE_TAX(rs.getInt("LICENSE_TAX"));
			objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setPERIOD(rs.getInt("PERIOD"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setPRICE(rs.getLong("PRICE"));
			objProductBean.setFROMDATE(rs.getString("FROMDATE"));
			objProductBean.setTODATE(rs.getString("TODATE"));
			objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
			objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
			objProductBean.setSUM(rs.getInt("SUM"));
			objProductBean.setUP_DATE(rs.getString("UP_DATE"));
			objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			objProductBean.setPRICE(rs.getLong("PRICE"));
			objProductBean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));

			return objProductBean;
		}
	}

	// 산출물 개수
	public int getProductListCount(String adminNum) throws DataAccessException {

		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.productCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);

		return returnNum;
	}

	// 산출물 개별 정보
	public ProductBean productInfo(String seq) {
		Object[] values = { seq };

		ProductBean pb = new ProductBean();
		try {
			pb = (ProductBean) objProductInfoQuery.execute(values).get(0);

		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return pb;
	}

	// 산출물 작년도 점용료
	public int getSum_LastYear(String adminNum, String year)
			throws DataAccessException {
		Object[] values = { adminNum, year };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.ocucupancy.getSum_LastYear");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);

		return returnNum;
	}

	// 년도별 점용허가증 가능한지 카운트
	public int getLicenseYnCount(String adminNum, String year)
			throws DataAccessException {
		Object[] values = { adminNum, year, adminNum, year };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.getLicenceYnCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);

		return returnNum;
	}

	// 년도별 점용허가증 가능한지 카운트
	public int getProductYnCount(String adminNum, String year)
			throws DataAccessException {
		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.getProductYnCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// 산출물 입력
	public ProductBean insertProduct(ProductBean objProductBean) {
		try {
			CalInsert objCalInsert = new CalInsert(getDataSource());
			CalInsert2 objCalInsert2 = new CalInsert2(getDataSource());
			
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

			if (objProductBean.getPREV_SEQ() == null
					|| objProductBean.getPREV_SEQ().equals(""))
				objProductBean.setCAL_STATUS("2"); // 1. 산출전 2. 산출후

			
			if (objProductBean.getFIRST_SEQ().equals("")) {
				Object[] values = {
						objProductBean.getADMIN_NO(),
						objProductBean.getYEAR(),
						new Long(objProductBean.getPRICE()),
						objProductBean.getFROMDATE(),
						objProductBean.getTODATE(),
						new Float(objProductBean.getAREA_AFTER()),
						new Float(objProductBean.getAREA_AFTER()),
						new Float(objProductBean.getRATE()),
						new Integer(objProductBean.getSUM_LASTYEAR()),
						new Integer(objProductBean.getSUM_YEAR()),
						new Long(objProductBean.getSUM_ADJUST()),
						objProductBean.getFORM_ADJUST(),
						objProductBean.getFORM(),
						new Integer(objProductBean.getLICENSE_TAX()),
						new Integer(objProductBean.getPERIOD()),
						new Integer(objProductBean.getVAT()),
						new Float(objProductBean.getADJUSTMENT()),
						new Float(objProductBean.getREDUCTION_RATE()),
						objProductBean.getREDUCTION_REASON(),
						new Float(objProductBean.getPERCENT_RATE()),
						objProductBean.getPERCENT_REASON(),
						new Float(objProductBean.getSURCHARGE_RATE()),
						objProductBean.getUSE_SECTION() // 2수시(USE_SECTION)/1계속
						, new Integer(objProductBean.getCAL_SUM_SEQ()),
						new Integer(objProductBean.getPREV_SEQ()),
						objProductBean.getUP_DATE() };

				i = objCalInsert2.update(values);
			} else {

				Object[] values = {
						objProductBean.getADMIN_NO(),
						objProductBean.getYEAR(),
						new Long(objProductBean.getPRICE()),
						objProductBean.getFROMDATE(),
						objProductBean.getTODATE(),
						new Float(objProductBean.getAREA_AFTER()),
						new Float(objProductBean.getAREA_AFTER()),
						new Float(objProductBean.getRATE()),
						new Integer(objProductBean.getSUM_LASTYEAR()),
						new Integer(objProductBean.getSUM_YEAR()),
						new Long(objProductBean.getSUM_ADJUST()),
						objProductBean.getFORM_ADJUST(),
						objProductBean.getFORM(),
						new Integer(objProductBean.getLICENSE_TAX()),
						new Integer(objProductBean.getPERIOD()),
						new Long(objProductBean.getVAT()),
						new Float(objProductBean.getADJUSTMENT()),
						new Float(objProductBean.getREDUCTION_RATE()),
						objProductBean.getREDUCTION_REASON(),
						new Float(objProductBean.getPERCENT_RATE()),
						objProductBean.getPERCENT_REASON(),
						new Float(objProductBean.getSURCHARGE_RATE()),
						objProductBean.getUSE_SECTION() // 2수시(USE_SECTION)/1계속
						, new Integer(objProductBean.getFIRST_SEQ()),
						new Integer(objProductBean.getCAL_SUM_SEQ()),
						new Integer(objProductBean.getPREV_SEQ()),
						objProductBean.getUP_DATE() };
				i = objCalInsert.update(values);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objProductBean;
	}
	class CalInsert extends SqlUpdate {
		public CalInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.calInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // getADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // getYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPRICE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getTODATE
			declareParameter(new SqlParameter(Types.FLOAT)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.FLOAT)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.FLOAT)); // getRATE
			declareParameter(new SqlParameter(Types.INTEGER)); // getSUM_LASTYEAR
			declareParameter(new SqlParameter(Types.INTEGER)); // getSUM_YEAR
			declareParameter(new SqlParameter(Types.INTEGER)); // getSUM_ADJUST
			// declareParameter(new SqlParameter(Types.INTEGER)); //getMaxSeq
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM
			declareParameter(new SqlParameter(Types.INTEGER)); // getLICENSE_TAX
			declareParameter(new SqlParameter(Types.INTEGER)); // getPERIOD
			declareParameter(new SqlParameter(Types.INTEGER)); // VAT
			declareParameter(new SqlParameter(Types.FLOAT)); // ADJUSTMENT
			declareParameter(new SqlParameter(Types.FLOAT)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.FLOAT)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.FLOAT)); // SURCHARGE_RATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION(정기,수시)
			declareParameter(new SqlParameter(Types.VARCHAR)); // FIRST_SEQ
			declareParameter(new SqlParameter(Types.INTEGER)); // CAL_SUM_SEQ
			declareParameter(new SqlParameter(Types.INTEGER)); // PREV_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // UP_DATE

		}
	}
	class CalInsert2 extends SqlUpdate {
		public CalInsert2(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.calInsert2"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // getADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // getYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPRICE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getTODATE
			declareParameter(new SqlParameter(Types.FLOAT)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.FLOAT)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.FLOAT)); // getRATE
			declareParameter(new SqlParameter(Types.INTEGER)); // getSUM_LASTYEAR
			declareParameter(new SqlParameter(Types.INTEGER)); // getSUM_YEAR
			declareParameter(new SqlParameter(Types.INTEGER)); // getSUM_ADJUST
			// declareParameter(new SqlParameter(Types.INTEGER)); //getMaxSeq
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM
			declareParameter(new SqlParameter(Types.INTEGER)); // getLICENSE_TAX
			declareParameter(new SqlParameter(Types.INTEGER)); // getPERIOD
			declareParameter(new SqlParameter(Types.INTEGER)); // VAT
			declareParameter(new SqlParameter(Types.FLOAT)); // ADJUSTMENT
			declareParameter(new SqlParameter(Types.FLOAT)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.FLOAT)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.FLOAT)); // SURCHARGE_RATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION(정기,수시)
			declareParameter(new SqlParameter(Types.INTEGER)); // CAL_SUM_SEQ
			declareParameter(new SqlParameter(Types.INTEGER)); // PREV_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // UP_DATE
		}
	}

	// 산출물 최대seq 구하기
	public int getMaxSeq(String admin_no, String year)
			throws DataAccessException {

		Object[] values = { admin_no, year };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.ocucupancy.getMaxSeq");

		try {
			return getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			return 1;
		}
	}

	// 산출물 수정
	public ProductBean updateProduct(ProductBean objProductBean) {
		try {
			ProductUpdate objProductUpdate = new ProductUpdate(getDataSource());

			if (objProductBean.getFROMDATE() == null
					|| objProductBean.getFROMDATE().equals(""))
				objProductBean.setFROMDATE(" ");

			if (objProductBean.getTODATE() == null
					|| objProductBean.getTODATE().equals(""))
				objProductBean.setTODATE(" ");


			Object[] values = {
					objProductBean.getYEAR(),
					new Long(objProductBean.getPRICE()),
					objProductBean.getFROMDATE(),
					objProductBean.getTODATE(),
					new Float(objProductBean.getAREA_AFTER()),
					
					new Float(objProductBean.getRATE()),
					new Integer(objProductBean.getSUM_LASTYEAR()),
					new Integer(objProductBean.getSUM_YEAR()),
					new Integer(objProductBean.getSUM_ADJUST()),
					new Integer(objProductBean.getVAT()),
					
					objProductBean.getFORM_ADJUST(),
					objProductBean.getFORM(),
					new Integer(objProductBean.getPERIOD()),
					new Float(objProductBean.getADJUSTMENT()),
					new Integer(objProductBean.getLICENSE_TAX()), 
					
					new Float(objProductBean.getREDUCTION_RATE()),
					objProductBean.getREDUCTION_REASON(),
					new Float(objProductBean.getPERCENT_RATE()),
					objProductBean.getPERCENT_REASON(),
					new Float(objProductBean.getSURCHARGE_RATE()), 
					
					objProductBean.getUP_DATE(),
					objProductBean.getSEQ(), 
					objProductBean.getADMIN_NO() // admin_no

			};

			objProductUpdate.update(values);

		} catch (Exception e) {
			System.out.println("에러는=" + e.toString());
			e.printStackTrace();
		}
		return objProductBean;
	}
	// 산출물 수정
	class ProductUpdate extends SqlUpdate {
		public ProductUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.productUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR = ?, \
			declareParameter(new SqlParameter(Types.INTEGER)); // PRICE = ?, \
			declareParameter(new SqlParameter(Types.VARCHAR)); // FROMDATE = ?,
			declareParameter(new SqlParameter(Types.VARCHAR)); // TODATE = ?, \
			declareParameter(new SqlParameter(Types.FLOAT)); // AREA_AFTER = ?,
			
			declareParameter(new SqlParameter(Types.FLOAT)); // RATE = ?, \
			declareParameter(new SqlParameter(Types.INTEGER)); // SUM_LASTYEAR =
			declareParameter(new SqlParameter(Types.INTEGER)); // SUM_YEAR = ?,
			declareParameter(new SqlParameter(Types.INTEGER)); // SUM_ADJUST =
			declareParameter(new SqlParameter(Types.INTEGER)); // VAT = ?, \
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM_ADJUST =
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM = ? , \
			declareParameter(new SqlParameter(Types.INTEGER)); // PERIOD= ? \
			declareParameter(new SqlParameter(Types.FLOAT)); // ADJUSTMENT
			declareParameter(new SqlParameter(Types.INTEGER)); // LICENSE_TAX
			
			declareParameter(new SqlParameter(Types.FLOAT)); // AND
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND
			declareParameter(new SqlParameter(Types.FLOAT)); // AND
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND
			declareParameter(new SqlParameter(Types.FLOAT)); // AND
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND UP_DATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND SEQ = ?
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND ADMIN_NO =
																// ?

		}
	}

	public String getProductRate(String add_sum) throws DataAccessException {
		Object[] values = { add_sum };
		System.out.println("getProductRate : : : add_sum : : " + add_sum);
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.getProductRate");
		Map returnNum = getJdbcTemplate().queryForMap(sql, values);
		return returnNum.get("CNT").toString();
	}

	// 면허세 구하기
	public int getLicenseTax(float area) throws DataAccessException {
		Object[] values = { new Float(area), new Float(area) };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.getLicenseTax");
		Map returnNum = getJdbcTemplate().queryForMap(sql, values);
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// 요율 구하기
	public String getYoyul(String adminNo) throws DataAccessException {
		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.ocucupancy.getYoyul");
		Map returnNum = null;

		String strYoyul = "";

		try {
			Map yoyul = getJdbcTemplate().queryForMap(sql, values);
			strYoyul = yoyul.get("YOYUL").toString();
		} catch (Exception err) {
		}
		return strYoyul;
	}

	// 점용면적 구하기
	public String getAreaSize(String adminNo) throws DataAccessException {
		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.ocucupancy.getAreaSize");
		Map returnNum = null;

		String strAreaSize = "0";

		try {
			Map areaSize = getJdbcTemplate().queryForMap(sql, values);
			strAreaSize = areaSize.get("AREA_SIZE").toString();
		} catch (Exception err) {
		}
		return strAreaSize;
	}

	// 점용구분 구하기
	public Map getSection(String admin_no) throws DataAccessException {
		Object[] values = { admin_no };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.ocucupancy.getSection");

		Map returnNum = getJdbcTemplate().queryForMap(sql, values);

		return returnNum;
	}

	// 검토여부 설정
	public void SetCheckYn(String adminNo) {
		Object[] values = { adminNo };
		objSetCheckYN.update(values);
	}

	// 검토여부 설정
	public void SetTaxYn(String adminNo) {
		Object[] values = { adminNo };
		objSetTaxYN.update(values);
	}

	// 무단점용 총액
	public int getTotalSum(String adminNo, String seq)
			throws DataAccessException {
		Object[] values = { adminNo, seq };

		List list = objGetTotalSumQuery.execute(values);

		ProductBean objProductBean = new ProductBean();
		objProductBean = (ProductBean) list.get(0);

		int returnNum = objProductBean.getSUM();

		return returnNum;
	}

	// 현장조사 상세정보
	protected class GetTotalSumQuery extends MappingSqlQuery {
		protected GetTotalSumQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.ocucupancy.getTotalSum"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			ProductBean objProductBean = new ProductBean();

			objProductBean.setSUM(rs.getInt("SUM"));

			return objProductBean;
		}
	}

	// 무단 점용 넓이
	public float getMudanArea(String adminNo) throws DataAccessException {
		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.getMudanArea");
		float returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// 현장조사//////////////////////////////////////////////////////////////////////////////////////////
	// 현장조사 입력
	public InspectBean insertInspect(InspectBean objInspectBean) {
		try {
			Object[] values = { objInspectBean.getADMIN_NO(),
					new Integer(objInspectBean.getSEQ()),
					objInspectBean.getRESULT(), objInspectBean.getINSPECTOR(),
					objInspectBean.getINSPECT_DATE(),
					objInspectBean.getINSPECT_OPINION(),
					objInspectBean.getMANAGER_OPINION(),
					objInspectBean.getAPPROVAL_CONDITION() };

			objInspectInsert.update(values);
		} catch (Exception e) {
			System.out.println("현장조사입력에러=" + e.toString());
			e.printStackTrace();
		}
		return objInspectBean;
	}

	// 현장조사 리스트 카운트
	public int getInspectListCount(String adminNum) throws DataAccessException {
		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.inspectListCount");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// 현장조사 상세정보
	public List InspectInfo(String adminNo, String seq) {
		Object[] values = { adminNo, seq };
		return objInspectInfoQuery.execute(values);
	}

	// 현장조사 수정
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

			objInspectUpdate.update(values);
		} catch (Exception e) {
			System.out.println("에러는=" + e.toString());
			e.printStackTrace();
		}
		return objInspectBean;
	}

	// 검토협의//////////////////////////////////////////////////////////////////////////////////////////
	// 검토협의 리스트
	public List retrieveConfList(int intCurPage, int intCount, String adminNo,
			String seq) throws DataAccessException {
		Object[] values = { adminNo, new Integer(seq), new Integer(intCurPage),
				new Integer(intCount), new Integer(intCount) };
		return objConfListQuery.execute(values);
	}

	// 검토협의 카운트
	public int getConfListCount(String adminNum) throws DataAccessException {
		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.confListCount");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// 검토협의 상세정보
	public List ConfInfo(String adminNo, String seq) {
		Object[] values = { adminNo, seq };
		return objConfInfoQuery.execute(values);
	}

	// 검토협의 입력
	public ConfBean insertConf(ConfBean objConfBean) {
		try {
			Object[] values = { objConfBean.getADMIN_NO(),
					new Integer(objConfBean.getSEQ()),
					objConfBean.getORGANIZATION(), objConfBean.getCONF_DATE(),
					objConfBean.getMANAGE_DEPT(), objConfBean.getMANAGER(),
					objConfBean.getTEL(), objConfBean.getHP(),
					objConfBean.getCONF_COMMENT() };
			objConfInsert.update(values);

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objConfBean;
	}

	// 검토협의 수정
	public ConfBean updateConf(ConfBean objConfBean) {
		try {

			Object[] values = { objConfBean.getORGANIZATION(),
					objConfBean.getMANAGE_DEPT(), objConfBean.getMANAGER(),
					objConfBean.getTEL(), objConfBean.getHP(),
					objConfBean.getCONF_COMMENT(), objConfBean.getCONF_DATE(),
					objConfBean.getADMIN_NO(),
					new Integer(objConfBean.getSEQ()) };
			objConfUpdate.update(values);
		} catch (Exception e) {
			System.out.println("에러는=" + e.toString());
			e.printStackTrace();
		}
		return objConfBean;
	}

	// 무단 해당 연도 자료 있는지.
	public int get_calculationCount_mudan(String adminNum, String year)
			throws DataAccessException {
		Object[] values = { adminNum, year };
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.jumyong.get_calculationCount_mudan");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// 점용지 위치조회
	// ////////////////////////////////////////////////////////////////////////////////////////
	// 위치 조회
	public List retrieveLocatonList(int intCurPage, int intCount, String adminNo)
			throws DataAccessException {
		Object[] values = { adminNo, new Integer(intCurPage),
				new Integer(intCount), new Integer(intCount) };
		return objLocationListQuery.execute(values);
	}

	// 위치조회카운트
	public int getLocationListCount(String adminNum) throws DataAccessException {
		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.locationListCount");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// 위치 입력
	public PlaceLocationBean insertLocation(PlaceLocationBean objLocationBean) {
		// (ADMIN_NO,SEQ,LOCATE_X,LOCATE_Y,WIDTH,HEIGHT,AREA,EXPLAIN)
		Object[] values = { objLocationBean.getADMIN_NO(),
				objLocationBean.getLOCATE_X(), objLocationBean.getLOCATE_Y(),
				objLocationBean.getWIDTH(), objLocationBean.getHEIGHT(),
				objLocationBean.getAREA(), objLocationBean.getEXPLAIN() };

		objLocationInsert.update(values);
		return objLocationBean;
	}

	// 위치 정보 수정
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
			System.out.println("에러는=" + e.toString());
			e.printStackTrace();
		}
		return objLocationBean;
	}

	// 위치정보 삭제
	public boolean deleteLocation(int intNum) throws DataAccessException {
		LocationDelete objLocationDelete = new LocationDelete(getDataSource());

		int result = objLocationDelete.update(intNum);

		if (result == -1)
			return false;
		return true;
	}

	// 점용지 파일조회
	// ////////////////////////////////////////////////////////////////////////////////////////
	// 파일 조회
	public List retrieveFileList(int intCurPage, int intCount, String adminNo)
			throws DataAccessException {
		Object[] values = { adminNo, new Integer(intCurPage),
				new Integer(intCount), new Integer(intCount) };
		return objFileListQuery.execute(values);
	}

	// 파일조회카운트
	public int getFileListCount(String adminNum) throws DataAccessException {
		Object[] values = { adminNum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.fileListCount");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// 파일 입력
	public PlaceFileBean insertFile(PlaceFileBean objFileBean) {
		Object[] values = { objFileBean.getADMIN_NO(),
				objFileBean.getDATA_TYPE(), objFileBean.getDATA_EXPLAIN(),
				objFileBean.getATTACH_FILE(), objFileBean.getATTACH_SIZE(),
				objFileBean.getREGDATE(), objFileBean.getATTACH_SAVED_FILE() };

		objFileInsert.update(values);
		return objFileBean;
	}

	// 파일 정보 수정
	public PlaceFileBean updateFile(PlaceFileBean objFileBean) {
		try {
			// DATA_TYPE=?,DATA_EXPLAIN=?,ATTACH_FILE=?,ATTAHC_SIZE=? \
			Object[] values = { objFileBean.getDATA_TYPE(),
					objFileBean.getDATA_EXPLAIN(),
					objFileBean.getATTACH_FILE(), objFileBean.getATTACH_SIZE(),
					new Integer(objFileBean.getSEQ()) };
			objFileUpdate.update(values);
		} catch (Exception e) {
			System.out.println("에러는=" + e.toString());
			e.printStackTrace();
		}
		return objFileBean;
	}

	// 파일정보 삭제
	public boolean deleteFile(int intNum) throws DataAccessException {

		FileDelete objFileDelete = new FileDelete(getDataSource());

		int result = objFileDelete.update(intNum);

		if (result == -1)
			return false;
		return true;
	}

	// 해지////////////////////////////////////////////////////////////////////////////////////////////
	// 해지정보
	public DisUseBean disUseInfo(String admin_no) {
		Object[] values = { admin_no };
		DisUseBean disUseBean = new DisUseBean();
		disUseBean = (DisUseBean) objDisUseInfo.execute(values).get(0);
		return disUseBean;
	}

	// 해지 업데이트
	public boolean disUseUpdate(DisUseBean disUseBean) {
		Object[] values = { disUseBean.getSECTION(),
				util.Date_Cut(disUseBean.getDISUSE_DATE()),
				disUseBean.getDISUSE_REASON(), disUseBean.getDISUSE_MANAGER(),
				disUseBean.getOLD_SECTION(), disUseBean.getADMIN_NO() };

		int returnVal = objDisUseUpdate.update(values);

		if (returnVal == 1)
			return (true);
		else
			return (false);
	}

	// 해지 업데이트
	protected class DisUseUpdate extends SqlUpdate {
		public DisUseUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.disUseUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 폐쇄 해지
	public boolean disUseDelete(String adminNo) {
		Object[] values = { adminNo };

		int returnVal = objDisUseDelete.update(values);

		if (returnVal == 1)
			return (true);
		else
			return (false);
	}

	protected class DisUseDelete extends SqlUpdate {
		public DisUseDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.disUseDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// CALCULATION_INFO 시퀀스 증가값
	public int getCalculationSequence() {

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.GetCalculationSequence");

		int result = getJdbcTemplate().queryForInt(sql);

		return result;
	}

	// 현장조사 리스트
	public List retrieveInspectList(int intCurPage, int intCount,
			String adminNo, String seq) throws DataAccessException {

		Object[] values = { adminNo, new Integer(seq), new Integer(intCurPage),
				new Integer(intCount), new Integer(intCount) };
		return objInspectListQuery.execute(values);
	}

	// 감소분 년도 선택 리스트
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

	// /////////////////////////////////////////////산출물 부과
	// 산출물 입력
	public int Cal_Sum_InfoInsert(ProductBean objProductBean) {
		int i = 0;
		try {
			
			Cal_Sum_InfoInsert objCal_Sum_InfoInsert = new Cal_Sum_InfoInsert(getDataSource());

			Object[] values = { 
					objProductBean.getADMIN_NO() // ADMIN_NO
					, new Integer(objProductBean.getSEQ()) // SEQ
					, objProductBean.getYEAR() // YEAR
					, new Float(objProductBean.getAREA_AFTER()) // AREA
					, new Integer(objProductBean.getSUM_ADJUST()) // SUM_ADJUST
					
					, new Long(objProductBean.getVAT()) // VAT
					, new Float(objProductBean.getREDUCTION_RATE()) // REDUCTION_RATE
					, objProductBean.getREDUCTION_REASON() // REDUCTION_REASON
					, new Float(objProductBean.getPERCENT_RATE()) // PERCENT_RATE
					, objProductBean.getPERCENT_REASON() // PERCENT_REASON
					
					, new Long(objProductBean.getREDUCTION_SUM()) // SUM
					, objProductBean.getUSE_SECTION() // 2수시(USE_SECTION)/1계속
					, new Long(objProductBean.getPRICE()) // price(공시지가)
					, new Float(objProductBean.getRATE()) // 요율
					, objProductBean.getREDUCTION_FORM() // 산출식
					
					, objProductBean.getFROMDATE() // fromdate
					, objProductBean.getTODATE() // todate
					, objProductBean.getTAX_SEQ() // TAX_SEQ
			};

			i = objCal_Sum_InfoInsert.update(values);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	class Cal_Sum_InfoInsert extends SqlUpdate {
		public Cal_Sum_InfoInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.jumyong.cal_sum_infoInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // getADMIN_NO
			declareParameter(new SqlParameter(Types.INTEGER)); // seq
			declareParameter(new SqlParameter(Types.VARCHAR)); // getYEAR
			declareParameter(new SqlParameter(Types.FLOAT)); // getAREA
			declareParameter(new SqlParameter(Types.INTEGER)); // SUM_ADJUST
			
			declareParameter(new SqlParameter(Types.INTEGER)); // VAT
			declareParameter(new SqlParameter(Types.FLOAT)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.FLOAT)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			
			declareParameter(new SqlParameter(Types.INTEGER)); // SUM
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION(정기1,수시2)
			declareParameter(new SqlParameter(Types.INTEGER)); // price
			declareParameter(new SqlParameter(Types.FLOAT)); // rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // form_adjust
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // fromdate
			declareParameter(new SqlParameter(Types.VARCHAR)); // todate
			declareParameter(new SqlParameter(Types.VARCHAR)); // TAX_SEQ
		}
	}


	// CAL_SUM_INFO 시퀀스 증가값
	public int getCal_Sum_Seq() {

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.GetCAL_SUM_SEQ");
		int result = getJdbcTemplate().queryForInt(sql);
		return result;
	}

	// CAL_SUM_INFO 수정
	public int CalSumUpdate(ProductBean objProductBean) {
		
		CalSumUpdate objCalSumUpdate = new CalSumUpdate(getDataSource());
		
		Object[] values = { objProductBean.getYEAR() // YEAR
				, new Float(objProductBean.getAREA_AFTER()) // AREA
				, new Integer(objProductBean.getSUM_ADJUST()) // SUM_ADJUST
				, new Long(objProductBean.getVAT()) // VAT
				, new Long(objProductBean.getREDUCTION_SUM()) // SUM
				, new Float(objProductBean.getREDUCTION_RATE()) // reduction_rate
				, objProductBean.getREDUCTION_REASON() // reduction_reason
				, new Float(objProductBean.getPERCENT_RATE()) // reduction_rate
				, objProductBean.getPERCENT_REASON() // reduction_reason
				, objProductBean.getUSE_SECTION() // USE_SECTION
				, new Long(objProductBean.getPRICE()) // PRICE
				, new Float(objProductBean.getRATE()) // RATE
				, objProductBean.getREDUCTION_FORM() // FORM_ADJUST
				, objProductBean.getFROMDATE() // FROMDATE
				, objProductBean.getTODATE() // TODATE
				, new Integer(objProductBean.getCAL_SUM_SEQ()) // SEQ
				, objProductBean.getADMIN_NO() // ADMIN_NO
		};

		int i = objCalSumUpdate.update(values);
		return i;
	}
	class CalSumUpdate extends SqlUpdate {
		public CalSumUpdate(DataSource dataSource) {
			// UPDATE CAL_SUM_INFO SET AREA = ?, SUM_ADJUST= ?, VAT = ?,
			// REDUCTION_RATE = ?, SUM = ?, REDUCTION_REASON = ? \
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.cal_sum_infoUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.FLOAT)); // AREA
			declareParameter(new SqlParameter(Types.INTEGER)); // SUM_ADJUST
			declareParameter(new SqlParameter(Types.INTEGER)); // VAT
			declareParameter(new SqlParameter(Types.INTEGER)); // SUM
			declareParameter(new SqlParameter(Types.FLOAT)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.FLOAT)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION
			declareParameter(new SqlParameter(Types.INTEGER)); // PRICE
			declareParameter(new SqlParameter(Types.FLOAT)); // RATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // FROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // TODATE
			declareParameter(new SqlParameter(Types.INTEGER)); // SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADMIN_NO
		}
	}

	// CAL_SUM_INFO 수정
	public int CalSumUpdate2(ProductBean objProductBean) {
		Object[] values = { new Float(objProductBean.getAREA_AFTER()) // AREA
				, new Integer(objProductBean.getSUM_ADJUST()) // SUM_ADJUST
				, new Integer(objProductBean.getSUM_ADJUST()) // VAT
				, new Integer(objProductBean.getSUM_ADJUST()) // SUM
				, objProductBean.getUSE_SECTION() // USE_SECTION
				, new Long(objProductBean.getPRICE()) // PRICE
				, new Float(objProductBean.getRATE()) // RATE
				, objProductBean.getREDUCTION_FORM() // FORM_ADJUST
				, new Integer(objProductBean.getCAL_SUM_SEQ()) // SEQ
				, objProductBean.getADMIN_NO() // ADMIN_NO
				, new Integer(objProductBean.getCAL_SUM_SEQ()) // SEQ
				, objProductBean.getADMIN_NO() // ADMIN_NO
				, new Integer(objProductBean.getCAL_SUM_SEQ()) // SEQ
				, objProductBean.getADMIN_NO() // ADMIN_NO
		};

		int i = objCalSumUpdate2.update(values);
		return i;
	}

	// CAL_SUM_INFO
	public ProductBean CalSumInfoInfo(int seq) {
		Object[] values = { new Integer(seq) };

		ProductBean pb = (ProductBean) objCalSumInfoInfo.execute(values).get(0);

		return pb;
	}

	// 년도별 first_seq별 seq
	public int getCalSeqbyFirstSeq(String year, String first_seq)
			throws DataAccessException {
		Object[] values = { year, first_seq };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.getCalSeqbyFirstSeq");
		int returnNum = 0;
		try {
			returnNum = getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}

	// FORM_ADJUST CAL_SUM_SEQ로 가져오기
	public List FormAdjustList(int seq) {
		Object[] values = { new Integer(seq) };

		List a1 = objFormAdjustListQuery.execute(values);

		return a1;

	}

	// 무단 점용 cal_sum_seq
	public int get_cal_sum_seq(String year) throws DataAccessException {
		Object[] values = { year };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.get_cal_sum_seq");
		int returnNum = 0;
		try {
			returnNum = getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}

	// cal_sum_seq 구하기
	public int get_cal_sum_seq2(String adminNo, String seq, String year)
			throws DataAccessException {
		Object[] values = { adminNo, new Integer(seq), year };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.get_cal_sum_seq2");
		int returnNum = 0;
		try {
			returnNum = getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}

	// 공시지가 구하기.
	public Map get_Price(String admin_no) throws DataAccessException {
		Object[] values = { admin_no };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.get_Price");
		Map returnNum = null;
		try {
			returnNum = getJdbcTemplate().queryForMap(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}

	// ADMIN_BASE UPDATE
	public void Admin_baseUp_dateUpdateQuery(String update, String admin_no) {
		Object[] values = { update, admin_no };
		objAdmin_baseUp_dateUpdateQuery.update(values);
	}

	// 현장조사 삭제
	public void Delete_Inspect(int seq) {
		Object[] values = { new Integer(seq) };
		objDelete_InspectQuery.update(values);
	}

	// 검토 협의 삭제
	public void Delete_Conf(int seq) {
		Object[] values = { new Integer(seq) };
		objDelete_ConfQuery.update(values);
	}

	// 일반 점용 일수 가져오기
	public int getTotalPeriod(String admin_no) throws DataAccessException {
		Object[] values = { admin_no };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.getTotalPeriod");
		int returnNum = 0;
		try {
			returnNum = getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}

	// 점용 조회 및 관리 - 점용 조회
	protected class RetrieveBoardListQuery extends MappingSqlQuery {
		protected RetrieveBoardListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.ocupancyList"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // FROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // TODATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // TYPE
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // TAX_SET
			declareParameter(new SqlParameter(Types.VARCHAR)); // CHECK_TYPE
			declareParameter(new SqlParameter(Types.VARCHAR)); // BJ_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // BONBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // BUBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // ROAD_BONBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // ROAD_BUBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // NUMBERVALUE
			declareParameter(new SqlParameter(Types.VARCHAR)); // JUMYONGNAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // PURPOSE
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUCODE
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUCODE
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER)); 
			
			System.out.println("RetrieveBoardListQuery !!!!!!!!!!!!!! "+getMessageSourceAccessor().toString());

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			jumyongBean objJumyongBean = new jumyongBean();

			objJumyongBean.setNO(rs.getString("R_ID"));
			objJumyongBean.setADMIN_NO(rs.getString("ADMIN_NO"));
			objJumyongBean.setADMIN_NO2(rs.getString("ADMIN_NO2"));
			objJumyongBean.setTYPE_NAME(rs.getString("TYPE_NAME"));
			objJumyongBean.setSECTION_NAME(rs.getString("SECTION_NAME"));
			objJumyongBean.setNAME(rs.getString("NAME"));
			objJumyongBean.setBJ_NM(rs.getString("BJ_NM"));
			objJumyongBean.setBONBUN(rs.getString("BONBUN"));
			objJumyongBean.setBUBUN(rs.getString("BUBUN"));
			objJumyongBean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			objJumyongBean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			objJumyongBean.setCHECK_NAME(rs.getString("CHECK_NAME"));
			objJumyongBean.setREGDATE(rs.getString("REGDATE"));
			objJumyongBean.setUP_DATE(rs.getString("UP_DATE"));
			objJumyongBean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
			objJumyongBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			objJumyongBean.setPURPOSE_CLASSNM(rs.getString("CLASS_NM"));
			objJumyongBean.setSECTION(rs.getString("SECTION"));
			String temp = rs.getString("ROAD_ADDR");
			if (temp.length() < 2) {
				temp = "-";
			}
			objJumyongBean.setROAD_ADDR(temp);

			objJumyongBean
					.setAREA_SIZE(String.valueOf(rs.getFloat("AREA_SIZE")));

			objJumyongBean.setOWNER_SET(rs.getString("OWNER_SET"));
			objJumyongBean.setBIZSSN(rs.getString("BIZSSN"));
			objJumyongBean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
			objJumyongBean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
			objJumyongBean.setADDR(rs.getString("ADDR")); 
			objJumyongBean.setADDR_NEW(rs.getString("ADDR_NEW"));  
			//System.out.println("Querys.jumyong.ocupancyList??? 미치겠다.");
			//objJumyongBean.setND_RI_NM(rs.getString("TO_RI"));// added by Sam Lee 2012.01.02
			objJumyongBean.setSI(rs.getString("SI"));// added by Sam Lee 2012.01.02
			objJumyongBean.setGUN(rs.getString("GUN"));// added by Sam Lee 2012.01.02
			objJumyongBean.setDORO_NM(rs.getString("DORO_NM"));// added by Sam Lee 2012.01.02
			objJumyongBean.setBD_BON(rs.getString("BD_BON"));// added by Sam Lee 2012.01.02
			objJumyongBean.setBD_NM(rs.getString("BD_NM"));// added by Sam Lee 2012.01.02
			
			/*System.out.println("1.mapRow SI ="+rs.getString("SI"));
			System.out.println("1 mapRow GUN ="+rs.getString("GUN"));
			System.out.println("1 mapRow DORO_NM ="+rs.getString("DORO_NM"));
			System.out.println("1 mapRow BD_NM ="+rs.getString("BD_NM")); 
			*/
			objJumyongBean.setBD_BU(rs.getString("BD_BU"));// added by Sam Lee 2012.01.02
			
			objJumyongBean.setTOSI(rs.getString("TOSI"));// added by Sam Lee 2012.01.26
			//********** BEGIN_현진_20120316
			//objJumyongBean.setBD_BU(rs.getString("TOGUN"));// added by Sam Lee 2012.01.26
			//objJumyongBean.setBD_BU(rs.getString("TO_DORO_NM"));// added by Sam Lee 2012.01.26
			//objJumyongBean.setBD_BU(rs.getString("TO_BD_NM"));// added by Sam Lee 2012.01.26

			objJumyongBean.setTOGUN(rs.getString("TOGUN"));// added by Sam Lee 2012.01.26
			objJumyongBean.setTO_DORO_NM(rs.getString("TO_DORO_NM"));// added by Sam Lee 2012.01.26
			objJumyongBean.setTO_BD_NM(rs.getString("TO_BD_NM"));// added by Sam Lee 2012.01.26

			//********** END_현진_20120316

			
			objJumyongBean.setPOST(rs.getString("POST"));
			objJumyongBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			objJumyongBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));

			objJumyongBean.setSONGDALGI(rs.getString("SONGDALGI"));
			objJumyongBean.setJUMYONGJI_DORO_ADDR(rs.getString("JUMYONGJI_DORO_ADDR"));
			
			// 20151001 mihong
			if(rs.getString("TOPOST") != null) {
				objJumyongBean.setTOPOST(rs.getString("TOPOST"));
			}
			
			return objJumyongBean;
		}
	}

	// 점용 조회 및 관리 - 점용 조회 Excel
	protected class RetrieveBoardListExcelQuery extends MappingSqlQuery {
		protected RetrieveBoardListExcelQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.ocupancyList_Excel"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // FROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // TODATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // TYPE
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // TAX_SET
			declareParameter(new SqlParameter(Types.VARCHAR)); // CHECK_TYPE
			declareParameter(new SqlParameter(Types.VARCHAR)); // BJ_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // HJ_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // BONBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // BUBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // ROAD_BONBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // ROAD_BUBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // NUMBERVALUE
			declareParameter(new SqlParameter(Types.VARCHAR)); // JUMYONGNAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // PURPOSE
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUCODE
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			jumyongBean objJumyongBean = new jumyongBean();

			System.out.println("점용?? 엑셀??Querys.jumyong.ocupancyList_Excel");
			
			objJumyongBean.setNO(rs.getString("R_ID"));
			objJumyongBean.setADMIN_NO(rs.getString("ADMIN_NO"));
			objJumyongBean.setADMIN_NO2(rs.getString("ADMIN_NO2"));
			objJumyongBean.setTYPE_NAME(rs.getString("TYPE_NAME"));
			objJumyongBean.setSECTION_NAME(rs.getString("SECTION_NAME"));
			objJumyongBean.setNAME(rs.getString("NAME"));
			objJumyongBean.setBJ_NM(rs.getString("BJ_NM"));
			objJumyongBean.setBONBUN(rs.getString("BONBUN"));
			objJumyongBean.setBUBUN(rs.getString("BUBUN"));
			objJumyongBean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			objJumyongBean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			objJumyongBean.setCHECK_NAME(rs.getString("CHECK_NAME"));
			objJumyongBean.setREGDATE(rs.getString("REGDATE"));
			objJumyongBean.setUP_DATE(rs.getString("UP_DATE"));
			objJumyongBean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
			objJumyongBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			objJumyongBean.setPURPOSE_CLASSNM(rs.getString("CLASS_NM"));
			objJumyongBean.setSECTION(rs.getString("SECTION"));
			String temp = rs.getString("ROAD_ADDR");
			if (temp.length() < 4) {
				temp = "-";
			}
			objJumyongBean.setROAD_ADDR(temp);

			objJumyongBean.setAREA_SIZE(String.valueOf(rs.getFloat("AREA_SIZE")));
			objJumyongBean.setSSN(rs.getString("SSN"));
			objJumyongBean.setADDR(rs.getString("ADDR"));
			objJumyongBean.setADDR_NEW(rs.getString("ADDR_NEW"));// added by Sam Lee 2012.01.02
			if (objJumyongBean.getSECTION_NAME().equals("일시")) {
				objJumyongBean.setGIGAN(rs.getString("PARTLY_PERIOD"));
			} else {
				objJumyongBean.setGIGAN(rs.getString("GIGAN"));
			}

			objJumyongBean.setBEFORE_PERMISSION(rs.getString("B_PERMISSION"));

			objJumyongBean.setOWNER_SET(rs.getString("OWNER_SET"));
			objJumyongBean.setBIZSSN(rs.getString("BIZSSN"));
			objJumyongBean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
			objJumyongBean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
			objJumyongBean.setPOST(rs.getString("POST"));
			objJumyongBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			objJumyongBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			
			objJumyongBean.setPERCENT_RATE(rs.getString("PERCENT_RATE"));
			objJumyongBean.setPERCENT_REASON(rs.getString("PERCENT_REASON"));

			objJumyongBean.setAPPEAL_REFERENCE(rs.getString("APPEAL_REFERENCE"));
			objJumyongBean.setPLACE_REFERENCE(rs.getString("PLACE_REFERENCE"));
			objJumyongBean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));

			objJumyongBean.setTEL(rs.getString("TEL"));
			objJumyongBean.setEMAIL(rs.getString("EMAIL"));
			objJumyongBean.setHP(rs.getString("HP"));

			//********** BEGIN_KANG_20120710
			objJumyongBean.setEXPONENT(rs.getString("EXPONENT"));
			objJumyongBean.setBUSINESSADDR(rs.getString("BUSINESSADDR"));
			objJumyongBean.setCOMPANY_NAME(rs.getString("COMPANY_NAME"));
			//********** END_KANG_20120710
			
			objJumyongBean.setBD_NM(rs.getString("BD_NM"));
			objJumyongBean.setSONGDALGI(rs.getString("SONGDALGI"));
			objJumyongBean.setJUMYONGJI_DORO_ADDR(rs.getString("JUMYONGJI_DORO_ADDR"));
			
			// 20151001 mihong
			if(rs.getString("TOPOST") != null) {
				objJumyongBean.setTOPOST(rs.getString("TOPOST"));
			}
			
			return objJumyongBean;
		}
		
	}

	// 산출물 개별 정보
	protected class ProductInfoQuery extends MappingSqlQuery {
		protected ProductInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.calSelectbyYear"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			ProductBean objProductBean = new ProductBean();

			objProductBean.setADMIN_NO(rs.getString("ADMIN_NO"));

			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setPRICE(rs.getLong("PRICE"));
			objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
			objProductBean.setRATE(rs.getFloat("RATE"));
			objProductBean.setFROMDATE(rs.getString("FROMDATE"));
			objProductBean.setTODATE(rs.getString("TODATE"));
			objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
			objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));
			objProductBean.setFORM(rs.getString("FORM"));
			objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			objProductBean.setSUM_ADJUST(rs.getInt(("SUM_ADJUST")));
			objProductBean.setLICENSE_TAX(rs.getInt("LICENSE_TAX"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setPERIOD(rs.getInt("PERIOD"));
			objProductBean.setADJUSTMENT(rs.getFloat("ADJUSTMENT"));
			objProductBean.setREDUCTION_RATE(rs.getFloat("REDUCTION_RATE"));
			objProductBean
					.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			objProductBean.setSURCHARGE_RATE(rs.getFloat("SURCHARGE_RATE"));
			objProductBean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
			objProductBean.setPREV_SEQ(rs.getString("PREV_SEQ"));
			objProductBean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
			objProductBean.setTAX_SEQ(rs.getString("TAX_SEQ"));
			objProductBean.setCHECK_YN(rs.getString("CHECK_YN"));
			objProductBean.setMOMEY(rs.getLong("MOMEY"));
			objProductBean.setYOYUL(rs.getFloat("YOYUL"));
			objProductBean.setTAX_YN(rs.getString("TAX_YN"));

			return objProductBean;

		}
	}

	

	

	// 검토여부 설정
	class SetCheckYN extends SqlUpdate {
		public SetCheckYN(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.ocucupancy.setCheck_Yn"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 부과여부 설정
	class SetTaxYN extends SqlUpdate {
		public SetTaxYN(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.ocucupancy.setTax_Yn"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 현장조사//////////////////////////////////////////////////////////////////////////////////////////
	// 현장조사 입력
	class InspectInsert extends SqlUpdate {
		public InspectInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.inspectInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 현장조사 리스트
	protected class RetrieveInspectListQuery extends MappingSqlQuery {
		protected RetrieveInspectListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.inspectList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			InspectBean objInspectBean = new InspectBean();

			objInspectBean.setADMIN_NO(rs.getString("ADMIN_NO"));
			objInspectBean.setRESULT(rs.getString("RESULT"));
			objInspectBean.setINSPECT_DATE(rs.getString("INSPECT_DATE"));
			objInspectBean.setINSPECTOR(rs.getString("INSPECTOR"));
			objInspectBean.setINSPECT_OPINION(rs.getString("INSPECT_OPINION"));
			objInspectBean.setMANAGER_OPINION(rs.getString("MANAGER_OPINION"));
			objInspectBean.setAPPROVAL_CONDITION(rs
					.getString("APPROVAL_CONDITION"));
			objInspectBean.setNAME(rs.getString("NAME"));
			objInspectBean.setSEQ(rs.getInt("SEQ"));

			return objInspectBean;
		}
	}

	// 현장조사 상세정보
	protected class InspectInfoQuery extends MappingSqlQuery {
		protected InspectInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.inspectInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			InspectBean objInspectBean = new InspectBean();

			objInspectBean.setADMIN_NO(rs.getString("ADMIN_NO"));
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

	// 현장조사 수정
	class InspectUpdate extends SqlUpdate {
		public InspectUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.inspectUpdate"));
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

	// 검토협의//////////////////////////////////////////////////////////////////////////////////////////
	// 검토협의 리스트
	protected class RetrieveConfListQuery extends MappingSqlQuery {
		protected RetrieveConfListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.confList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ConfBean objConfBean = new ConfBean();

			objConfBean.setADMIN_NO(rs.getString("ADMIN_NO"));
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

	// 검토협의 상세정보
	protected class ConfInfoQuery extends MappingSqlQuery {
		protected ConfInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.confInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ConfBean objConfBean = new ConfBean();
			objConfBean.setADMIN_NO(rs.getString("ADMIN_NO"));
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

	// 검토협의 입력
	class ConfInsert extends SqlUpdate {
		public ConfInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.confInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 검토협의 수정
	class ConfUpdate extends SqlUpdate {
		public ConfUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.confUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
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

	// 위치정보//////////////////////////////////////////////////////////////////////////////////////////
	// 위치정보 리스트
	protected class RetrieveLocationListQuery extends MappingSqlQuery {
		protected RetrieveLocationListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.locationList"));
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

	// 검토협의 입력
	class LocationfInsert extends SqlUpdate {
		public LocationfInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.locationInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 위치정보 수정
	class LocationUpdate extends SqlUpdate {
		public LocationUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.locationUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
		}
	}

	// 위치정보 삭제
	class LocationDelete extends SqlUpdate {
		public LocationDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.locationDelete"));

			declareParameter(new SqlParameter(Types.INTEGER));
		}
	}

	// 파일정보//////////////////////////////////////////////////////////////////////////////////////////
	// 파일정보 리스트
	protected class RetrieveFileListQuery extends MappingSqlQuery {
		protected RetrieveFileListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.fileList"));
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

			return objFileBean;
		}
	}

	// 파일 입력
	class FileInsert extends SqlUpdate {
		public FileInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.fileInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 파일 수정
	class FileUpdate extends SqlUpdate {
		public FileUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.fileUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
		}
	}

	// 파일 삭제
	class FileDelete extends SqlUpdate {
		public FileDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.fileDelete"));
			declareParameter(new SqlParameter(Types.INTEGER));
		}
	}

	// 해지정보//////////////////////////////////////////////////////////////////////////////////////////

	protected class DisUseInfoQuery extends MappingSqlQuery {
		protected DisUseInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.disUseInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			DisUseBean objDisUseBean = new DisUseBean();

			objDisUseBean.setDISUSE_DATE(rs.getString("DISUSE_DATE"));
			objDisUseBean.setDISUSE_MANAGER(rs.getString("DISUSE_MANAGER"));
			objDisUseBean.setDISUSE_REASON(rs.getString("DISUSE_REASON"));
			objDisUseBean.setSECTION(rs.getString("SECTION"));

			return objDisUseBean;
		}
	}

	// 감소분 정할 산출물 리스트

	protected class productSubListQuery extends MappingSqlQuery {
		protected productSubListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.productSubList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();
			objProductBean.setCAL_YEAR(rs.getString("CAL_YEAR"));
			objProductBean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
			objProductBean.setAREA(rs.getFloat("AREA"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setUSE_SECTIONNAME(rs.getString("NAME"));
			objProductBean.setTAX_YNNAME(rs.getString("TAX_YNNAME"));

			return objProductBean;
		}
	}



	// /////////////////////////////////////////////CAL_SUM_INFO
	// CAL_SUM_INFO 수정
	class CalSumUpdate2 extends SqlUpdate {
		public CalSumUpdate2(DataSource dataSource) {
			// UPDATE CAL_SUM_INFO SET AREA = ?, SUM_ADJUST= ?, VAT = ?,
			// REDUCTION_RATE = ?, SUM = ?, REDUCTION_REASON = ? \
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.cal_sum_infoUpdate2"));
			declareParameter(new SqlParameter(Types.FLOAT)); // AREA
			declareParameter(new SqlParameter(Types.INTEGER)); // SUM_ADJUST
			declareParameter(new SqlParameter(Types.INTEGER)); // VAT
			declareParameter(new SqlParameter(Types.INTEGER)); // SUM
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION
			declareParameter(new SqlParameter(Types.INTEGER)); // PRICE
			declareParameter(new SqlParameter(Types.FLOAT)); // RATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM_ADJUST
			declareParameter(new SqlParameter(Types.INTEGER)); // SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADMIN_NO
			declareParameter(new SqlParameter(Types.INTEGER)); // SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADMIN_NO
			declareParameter(new SqlParameter(Types.INTEGER)); // SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADMIN_NO
		}
	}

	// CAL_SUM_INFO
	protected class CalSumInfoInfo extends MappingSqlQuery {
		protected CalSumInfoInfo(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.cal_sum_infoInfo"));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		// SELECT
		// ADMIN_NO,SEQ,YEAR,AREA,SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON
		// \
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();
			objProductBean.setADMIN_NO(rs.getString("ADMIN_NO"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setAREA(rs.getInt("AREA"));
			objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
			objProductBean.setREDUCTION_RATE(rs.getFloat("REDUCTION_RATE"));
			objProductBean.setSUM(rs.getInt("SUM"));
			objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
			objProductBean
					.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			objProductBean.setCAL_SUM_SEQ(rs.getString(("SEQ")));

			return objProductBean;
		}
	}

	// FORM_ADJUST CAL_SUM_SEQ로 가져오기
	protected class FormAdjustListQuery extends MappingSqlQuery {
		protected FormAdjustListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.form_adjustListbyCalSumInfo"));
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
					"Querys.jumyong.ocucupancy.admin_baseUp_dateUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // up_date
			declareParameter(new SqlParameter(Types.VARCHAR)); // admin_no
		}
	}

	// 현장조사 삭제
	protected class Delete_InspectQuery extends SqlUpdate {
		public Delete_InspectQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.delete_inspect"));
			declareParameter(new SqlParameter(Types.INTEGER)); // int
		}
	}

	// 검토 협의 삭제
	protected class Delete_ConfQuery extends SqlUpdate {
		public Delete_ConfQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.delete_conf"));
			declareParameter(new SqlParameter(Types.INTEGER)); // int
		}
	}

	// 이력정보 list
	public List getHistoryList(String adminNo, int currentPage, int countPerPage) {

		if ("".equals(adminNo))
			adminNo = "%";

		Object[] values = { adminNo, new Integer(currentPage),
				new Integer(countPerPage) };

		return objGetHistoryList.execute(values);
	}

	protected class GetHistoryList extends MappingSqlQuery {
		protected GetHistoryList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.historyList"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();

			objProductBean.setR_ID(String.valueOf(rs.getInt("R_ID")));
			objProductBean.setSEQ(String.valueOf(rs.getInt("SEQ")));
			objProductBean.setADMIN_NO(rs.getString("ADMIN_NO"));
			objProductBean.setGUBUN(rs.getString("GUBUN"));
			objProductBean.setWRITEDATE(rs.getString("WRITEDATE"));
			objProductBean.setGUNGE(rs.getString("GUNGE"));
			objProductBean.setSAYU(rs.getString("SAYU"));
			objProductBean.setWORK_ID(rs.getString("WORK_ID"));
			objProductBean.setGU_CODE(rs.getString("GU_CODE"));

			return objProductBean;
		}
	}

	// 이력정보 list count
	public int getHistoryListCount(String adminNo) throws DataAccessException {

		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.historyListCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);

		return returnNum;
	}

	// 이력정보 insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean) {
		try {
			Object[] values = { objProductBean.getADMIN_NO(),
					objProductBean.getSEQ(), objProductBean.getGUBUN(),
					objProductBean.getWRITEDATE(), objProductBean.getGUNGE(),
					objProductBean.getSAYU(), objProductBean.getWORK_ID(),
					objProductBean.getGU_CODE(), objProductBean.getWORK_NM() };

			objInsertHistoryInfo.update(values);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objProductBean;
	}

	class InsertHistoryInfo extends SqlUpdate {
		public InsertHistoryInfo(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.historyInsert"));

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

	// 이력내역 상세
	public ProductBean getHistoryView(String ADMIN_NO, String SEQ) {

		Object[] values = { ADMIN_NO, SEQ };

		ProductBean pb = new ProductBean();

		try {
			pb = (ProductBean) objGetHistoryView.execute(values).get(0);

		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return pb;
	}

	protected class GetHistoryView extends MappingSqlQuery {
		protected GetHistoryView(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.historyView"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			ProductBean objProductBean = new ProductBean();

			objProductBean.setSEQ(String.valueOf(rs.getInt("SEQ")));
			objProductBean.setADMIN_NO(rs.getString("ADMIN_NO"));
			objProductBean.setGUBUN(rs.getString("GUBUN"));
			objProductBean.setWRITEDATE(rs.getString("WRITEDATE"));
			objProductBean.setGUNGE(rs.getString("GUNGE"));
			objProductBean.setSAYU(rs.getString("SAYU"));
			objProductBean.setWORK_ID(rs.getString("WORK_ID"));
			objProductBean.setGU_CODE(rs.getString("GU_CODE"));
			objProductBean.setUP_DATE(rs.getString("UP_DATE"));
			objProductBean.setWORK_NM(rs.getString("WORK_NM"));

			return objProductBean;
		}
	}

	// 수거물품정보 수정
	public ProductBean updateHistoryInfo(ProductBean objProductBean) {

		try {

			Object[] values = { objProductBean.getGUBUN(),
					objProductBean.getGUNGE(), objProductBean.getSAYU(),
					objProductBean.getWORK_NM(), objProductBean.getGU_CODE(),
					objProductBean.getUP_DATE(), objProductBean.getWRITEDATE(),
					objProductBean.getADMIN_NO(), objProductBean.getSEQ() };

			for (int i = 0; i < values.length; i++)
				System.out.println("updateHistoryInfo : : :" + values[i]);

			objUpdateHistoryInfo.update(values);

		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}

		return objProductBean;
	}

	public class UpdateHistoryInfo extends SqlUpdate {
		public UpdateHistoryInfo(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.historyUpdate"));

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

	// 이력내역 seq 가져오기
	public String getHistoryMaxSeq(ProductBean objProductBean)
			throws DataAccessException {

		Object[] values = { objProductBean.getADMIN_NO() };

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

	// 이력정보 삭제
	public boolean deleteHistoryInfo(String adminNo, String seq)
			throws DataAccessException {

		Object[] values = {adminNo,seq};
		DeleteHistoryInfo objDeleteHistoryInfo = new DeleteHistoryInfo(getDataSource());

		int result = objDeleteHistoryInfo.update(values);

		if (result == -1)
			return false;
		
		return true;
	}
	
	protected class DeleteHistoryInfo extends SqlUpdate {
		public DeleteHistoryInfo(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.deleteHistoryInfo"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}


	// 요율 구하기
	public String getCheck_yn(String adminNo) throws DataAccessException {

		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.ocucupancy.getCheck_yn");

		String strCHECK_YN = "";
		try {

			Map CHECK_YN = getJdbcTemplate().queryForMap(sql, values);
			strCHECK_YN = CHECK_YN.get("CHECK_YN").toString();
		} catch (Exception err) {
			System.out.println(err.toString());
		}

		return strCHECK_YN;
	}

	// 인접지 정보 합계 구하기
	public String getWITH_SUM_PRICE(String adminNo) throws DataAccessException {
		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.ocucupancy.getWITH_SUM_PRICE");

		String strWITH_SUM_PRICE = "";
		try {
			Map WITH_SUM_PRICE = getJdbcTemplate().queryForMap(sql, values);
			strWITH_SUM_PRICE = WITH_SUM_PRICE.get("WITH_SUM_PRICE").toString();

		} catch (Exception e) {
		}

		return strWITH_SUM_PRICE;
	}

	//calculation 정보 조회
	public ProductBean productInfo_Admin(String seq, String adminNo) {
		ProductInfoQuery_Admin objProductInfoQuery_Admin = new ProductInfoQuery_Admin(getDataSource());
		Object[] values = { seq, adminNo };

		ProductBean pb = new ProductBean();
		try {
			pb = (ProductBean) objProductInfoQuery_Admin.execute(values).get(0);

		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return pb;
	}
	
	protected class ProductInfoQuery_Admin extends MappingSqlQuery {
		protected ProductInfoQuery_Admin(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.calSelectbyYear_Admin"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			ProductBean objProductBean = new ProductBean();

			objProductBean.setADMIN_NO(rs.getString("ADMIN_NO"));

			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setPRICE(rs.getLong("PRICE"));
			objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
			objProductBean.setRATE(rs.getFloat("RATE"));
			objProductBean.setFROMDATE(rs.getString("FROMDATE"));
			objProductBean.setTODATE(rs.getString("TODATE"));
			objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
			objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));
			objProductBean.setFORM(rs.getString("FORM"));
			objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			objProductBean.setSUM_ADJUST(rs.getInt(("SUM_ADJUST")));
			objProductBean.setLICENSE_TAX(rs.getInt("LICENSE_TAX"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setPERIOD(rs.getInt("PERIOD"));
			objProductBean.setADJUSTMENT(rs.getFloat("ADJUSTMENT"));
			objProductBean.setREDUCTION_RATE(rs.getFloat("REDUCTION_RATE"));
			objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			objProductBean.setPERCENT_RATE(rs.getFloat("PERCENT_RATE"));
			objProductBean.setPERCENT_REASON(rs.getString("PERCENT_REASON"));
			
			objProductBean.setSURCHARGE_RATE(rs.getFloat("SURCHARGE_RATE"));
			objProductBean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
			objProductBean.setPREV_SEQ(rs.getString("PREV_SEQ"));
			objProductBean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
			objProductBean.setTAX_SEQ(rs.getString("TAX_SEQ"));
			objProductBean.setCHECK_YN(rs.getString("CHECK_YN"));
			objProductBean.setMOMEY(rs.getLong("MOMEY"));
			objProductBean.setYOYUL(rs.getFloat("YOYUL"));
			objProductBean.setTAX_YN(rs.getString("TAX_YN"));
			objProductBean.setWITH_SUM_PRICE(rs.getString("WITH_SUM_PRICE"));

			objProductBean.setREDUCTION_SUM(rs.getInt("REDUCTION_SUM"));
			objProductBean.setREDUCTION_FORM(rs.getString("REDUCTION_FORM"));

			return objProductBean;

		}
	}



	// 산출합계 삭제
	public void DeleteCalSumInfo(String adminNo, String Cal_Sum_Seq, String Year) {
		Object[] values = { adminNo, new Integer(Cal_Sum_Seq), Year };
		objDeleteCalSumInfoQuery.update(values);

	}

	// 산출 삭제
	public void DeleteCalculatioInfo(String adminNo, String Seq, String Year) {
		Object[] values = { adminNo, new Integer(Seq), Year };
		objDeleteCalculationInfoQuery.update(values);

	}

	// 산출합계 삭제
	public void DeleteTaxationInfo(String adminNo, String Cal_Sum_Seq,
			String Year) {
		Object[] values = { adminNo, new Integer(Cal_Sum_Seq), Year };
		objDeleteTaxationInfoQuery.update(values);

	}

	// 산출합계 삭제
	protected class DeleteCalSumInfoQuery extends SqlUpdate {
		public DeleteCalSumInfoQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.deleteCalSumInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
		}
	}

	// 산출합계 삭제
	protected class DeleteTaxationInfoQuery extends SqlUpdate {
		public DeleteTaxationInfoQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.deleteTaxationInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
		}
	}

	// 산출 삭제
	protected class DeleteCalculationInfoQuery extends SqlUpdate {
		public DeleteCalculationInfoQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.deleteCalculationInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
		}
	}

	// 산출식들 구하기
	public List getFormAdjust(String adminNo, String calSumSeq)
			throws DataAccessException {
		Object[] values = { adminNo, new Integer(calSumSeq) };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.getFormAdjust");

		List returnVal = getJdbcTemplate().queryForList(sql, values);

		return returnVal;
	}

	// 점용 조회 개수
	public int getCountCalculationInfo(String adminNo, String cal_sum_seq) {

		Object[] values = { adminNo, new Integer(cal_sum_seq) };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.get_Count_Calculation_info");

		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// 점용목적 구하기
	public String getPurposeCd(String adminNo) throws DataAccessException {

		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.get_purpose_cd");

		String retVal = "";

		Map map = getJdbcTemplate().queryForMap(sql, values);
		retVal = map.get("PURPOSE_CD").toString();

		return retVal;
	}

	// 삭제시 admin_base check_yn 변화
	public void updateAdminBaseCheckYN(String adminNo) {

		try {
			Object[] values = { adminNo, adminNo };

			for (int j = 0; j < values.length; j++)
				System.out.println(j + ":" + values[j]);

			objAdminBaseCheckYN.update(values);

			System.out.println("updateAdminBaseCheckYN complate ::");

		} catch (Exception e) {
			System.out.println("updateAdminBaseCheckYN Error ::");
			e.printStackTrace();
		}

	}

	// 삭제시 admin_base check_yn UPDATE
	class AdminBaseCheckYN extends SqlUpdate {
		public AdminBaseCheckYN(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.checkAdminBase"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // admin_no
			declareParameter(new SqlParameter(Types.VARCHAR)); // admin_no
		}
	}

	// 점용 구분 구하기
	public String getUseType(String adminNo) throws DataAccessException {

		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.get_use_type");

		String retVal = "";

		Map map = getJdbcTemplate().queryForMap(sql, values);
		retVal = map.get("TYPE").toString();

		return retVal;
	}

	// 감면율, 지분율 구하기
	public Map getReduction(String adminNo) throws DataAccessException {

		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.get_reduction");

		Map map = getJdbcTemplate().queryForMap(sql, values);

		return map;
	}

	// 인접지 평균공시지가 위한 기본정보 구하기
	public Map getWithAddrInfo(String adminNo) {
		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.getWithAddrInfo");

		Map map = getJdbcTemplate().queryForMap(sql, values);

		return map;
	}

	// 산출합계중 max year 가져오기
	public String getMaxYear(String adminNo, String cal_sum_seq) {
		Object[] values = { adminNo, cal_sum_seq };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.get_max_year");

		String retVal = "";

		Map map = getJdbcTemplate().queryForMap(sql, values);
		retVal = map.get("YEAR").toString();

		return retVal;
	}
	
	
	
	// 산출 초기데이터 구하기
	public initCalBean getInitCalData(String adminNo) throws DataAccessException {
		GetInitCalDataQuery objGetInitCalDataQuery = new GetInitCalDataQuery(getDataSource());
		Object[] values = { adminNo };
		List list = objGetInitCalDataQuery.execute(values);

		initCalBean bean = (initCalBean) list.get(0);

		return bean;
	}
	
	protected class GetInitCalDataQuery extends MappingSqlQuery {
		protected GetInitCalDataQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.getInitCalData"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			initCalBean Bean = new initCalBean();
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setAREA_SIZE(String.valueOf(rs.getFloat("AREA_SIZE")));
			Bean.setREDUCTION_RATE(String.valueOf(rs.getFloat("REDUCTION_RATE")));
			Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			Bean.setPERCENT_RATE(String.valueOf(rs.getFloat("PERCENT_RATE")));
			Bean.setPERCENT_REASON(rs.getString("PERCENT_REASON"));
			Bean.setCHECK_YN(rs.getString("CHECK_YN"));
			Bean.setYOYUL(String.valueOf(rs.getFloat("YOYUL")));

			return Bean;
		}
	}
	
	
	// 공시지가 주소리스트 불러오기
	public List getPriceList(String adminNo,String year) throws DataAccessException {
		GetPriceListQuery getPriceListQuery = new GetPriceListQuery(getDataSource());
		Object[] values = {year, adminNo };
		return getPriceListQuery.execute(values);
	}
	
	protected class GetPriceListQuery extends MappingSqlQuery {
		protected GetPriceListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.jumyong.jumyong.getPriceList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			placeWithAddrBean bean = new placeWithAddrBean();
			
			bean.setSEQ(rs.getString("SEQ"));
			bean.setPNU(rs.getString("PNU"));
			bean.setADDR(rs.getString("ADDR"));
			bean.setJIGA(rs.getString("JIGA"));
			
			return bean;
		}
	}

}
