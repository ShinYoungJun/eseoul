package main.java.mdb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.mdb.model.GapanBaseBean;
import main.java.mdb.model.GapanHeadBean;
import main.java.mdb.model.GapanInfoBean;
import main.java.mdb.model.GapanNameBean;
import main.java.mdb.model.GapanUserBean;
import main.java.mdb.util.EncryptData;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class JdbcDao extends RoadsJdbcDaoSupport	implements	IJdbcDao{
	
	private MdbGapanInfoQuery objMdbGapanInfoQuery;
	private MdbGapanHeadQuery objMdbGapanHeadQuery;
	private MdbGapanBaseQuery objMdbGapanBaseQuery;
	private MdbGapanUserQuery objMdbGapanUserQuery;
	
	private MdbGapanInfoUpdateQuery objMdbGapanInfoUpdateQuery;
	private MdbGapanHeadUpdateQuery objMdbGapanHeadUpdateQuery;
	private MdbGapanBaseUpdateQuery objMdbGapanBaseUpdateQuery;
	private MdbGapanUserUpdateQuery objMdbGapanUserUpdateQuery;
	
	private MdbGapanInfoInsertQuery objMdbGapanInfoInsertQuery;
	private MdbGapanHeadInsertQuery objMdbGapanHeadInsertQuery;
	private MdbGapanBaseInsertQuery objMdbGapanBaseInsertQuery;

	private MdbGapanNameQuery objMdbGapanNameQuery;
	private MdbGapanDeleteQuery objMdbGapanDeleteQuery;
	
	protected void initDao() throws Exception {
		super.initDao();

		
		objMdbGapanInfoQuery = new MdbGapanInfoQuery(getDataSource());
		objMdbGapanHeadQuery = new MdbGapanHeadQuery(getDataSource());
		objMdbGapanBaseQuery = new MdbGapanBaseQuery(getDataSource());
		objMdbGapanUserQuery = new MdbGapanUserQuery(getDataSource());
		
		objMdbGapanInfoUpdateQuery = new MdbGapanInfoUpdateQuery(getDataSource());
		objMdbGapanHeadUpdateQuery = new MdbGapanHeadUpdateQuery(getDataSource());
		objMdbGapanBaseUpdateQuery = new MdbGapanBaseUpdateQuery(getDataSource());
		objMdbGapanUserUpdateQuery = new MdbGapanUserUpdateQuery(getDataSource());
		
		objMdbGapanInfoInsertQuery = new MdbGapanInfoInsertQuery(getDataSource());
		objMdbGapanHeadInsertQuery = new MdbGapanHeadInsertQuery(getDataSource());
		objMdbGapanBaseInsertQuery = new MdbGapanBaseInsertQuery(getDataSource());
		
		objMdbGapanDeleteQuery = new MdbGapanDeleteQuery(getDataSource());
		objMdbGapanNameQuery = new MdbGapanNameQuery(getDataSource());

	
	}
	
	//실서버 데이터 가져옴 
	public List mdbGapanInfoList(String gu_code,String year){
			
		Object[] values = {gu_code,year};
					
		return objMdbGapanInfoQuery.execute(values); 
	}

	protected class MdbGapanInfoQuery extends MappingSqlQuery{
		protected MdbGapanInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.mdb.gapaninfo_list"));			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			GapanInfoBean bean = new GapanInfoBean();
			
			  bean.setGAPAN_NO(rs.getString("GAPAN_NO"));		    	
			  bean.setX_COORD(rs.getString("X_COORD")); 
			   bean.setY_COORD(rs.getString("Y_COORD")); 
			   bean.setGP_TYP(rs.getString("GP_TYP")); 
			   bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));   	
			   bean.setWITH_PNU(rs.getString("WITH_PNU")); 
			   bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			   bean.setWITH_INFO(rs.getString("WITH_INFO")); 
			   bean.setROAD_INFO(rs.getString("ROAD_INFO")); 
			   bean.setAR_SEL(rs.getString("AR_SEL")); 
			   
			   bean.setAR_TXT(rs.getString("AR_TXT")); 
			   bean.setUC_SEL(rs.getString("UC_SEL")); 
			   bean.setUC_TXT(rs.getString("UC_TXT")); 
			   bean.setFOUND_DATE(rs.getString("FOUND_DATE")); 
			   bean.setFT_TYP(rs.getString("FT_TYP")); 		   
			   bean.setFT_SEL(rs.getString("FT_SEL")); 
			   bean.setFACIL_L(rs.getString("FACIL_L")); 
			   bean.setFACIL_W(rs.getString("FACIL_W"));
			   bean.setFACIL_H(rs.getString("FACIL_H")); 
			   bean.setSHOP_IMG(""); 
			   
			   bean.setPLACE_L(rs.getString("PLACE_L")); 
			   bean.setPLACE_H(rs.getString("PLACE_H")); 
			   bean.setPLACE_A(rs.getString("PLACE_A")); 
			   bean.setCAR_NUM(rs.getString("CAR_NUM")); 
			   bean.setCAR_TON(rs.getString("CAR_TON")); 	   
			   bean.setSPECIAL_ST(rs.getString("SPECIAL_ST")); 
			   bean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
			   bean.setMAINTN_OB(rs.getString("MAINTN_OB")); 
			   bean.setMT_SEL(rs.getString("MT_SEL")); 
			   bean.setDP_SEL(rs.getString("DP_SEL")); 
			   
			   bean.setDP_TXT(rs.getString("DP_TXT")); 
			   bean.setSG_TYP(rs.getString("SG_TYP"));
			   bean.setSG_SEL(rs.getString("SG_SEL"));
			   bean.setSG_ITM(rs.getString("SG_ITM"));
			   bean.setLIQUOR_SL(rs.getString("LIQUOR_SL"));
			   bean.setLPGAS_US(rs.getString("LPGAS_US"));
			   bean.setOPEN_TIME(rs.getString("OPEN_TIME")); 
			   bean.setCLOSE_TIME(rs.getString("CLOSE_TIME")); 
			   bean.setMEM_NUM(rs.getString("MEM_NUM")); 
			   bean.setPERMIT_DATE(rs.getString("PERMIT_DATE"));
			   
			   bean.setDAY_SALES(rs.getString("DAY_SALES"));
			   bean.setUN_TYP(rs.getString("UN_TYP")); 
			   bean.setUN_TXT(rs.getString("UN_TXT")); 
			   bean.setNOTES(rs.getString("NOTES"));
			   bean.setTYPE(rs.getString("TYPE"));	   
			   bean.setSECTION(rs.getString("SECTION")); 
			   bean.setOWNER_SET(rs.getString("OWNER_SET")); 
			   bean.setTAX_SET(rs.getString("TAX_SET")); 
			   bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE")); 
			   bean.setMUL_TODATE(rs.getString("MUL_TODATE")); 
			   
			   bean.setHJ_CD(rs.getString("HJ_CD")); 
			   bean.setDISUSE_DATE(rs.getString("DISUSE_DATE")); 
			   bean.setDISUSE_REASON(rs.getString("DISUSE_REASON")); 
			   bean.setDISUSE_MANAGER(rs.getString("DISUSE_MANAGER"));
			   bean.setOLD_SECTION(rs.getString("OLD_SECTION"));   
			   bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			   bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON")); 
			   bean.setPICKUP_DATE(rs.getString("PICKUP_DATE")); 
			   bean.setSHOP_IMG2(""); 
			   bean.setRETURN_DATE(rs.getString("RETURN_DATE")); 
			   
			   bean.setRETURN_YN(rs.getString("RETURN_YN")); 
			   bean.setFT_ETC(rs.getString("FT_ETC"));
			   bean.setPICKUP_YN(rs.getString("PICKUP_YN"));
			   bean.setMODIFY_YN(rs.getString("MODIFY_YN"));
			   bean.setSF_VALUE(rs.getString("SF_VALUE"));    
			   bean.setHISTORY(rs.getString("HISTORY"));
	
			return bean;
		}
		
	}
		public List mdbGapanHeadList(String gu_code,String year){
			
			Object[] values = {gu_code,year};
						
			return objMdbGapanHeadQuery.execute(values); 
		}

		protected class MdbGapanHeadQuery extends MappingSqlQuery{
			protected MdbGapanHeadQuery(DataSource ds) {
				super(ds, getMessageSourceAccessor().getMessage(
						"Querys.rojum.mdb.gapanhead_list"));			
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
			}

			protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
				EncryptData enc = new EncryptData();
				GapanHeadBean bean = new GapanHeadBean();
				 
				  bean.setGAPAN_NO(rs.getString("GAPAN_NO"));		    	
				  bean.setGP_TYP(rs.getString("GP_TYP"));
				  bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
				  bean.setOWNER_IDCHK(rs.getString("OWNER_IDCHK"));
				  bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
				 
					if(bean.getOWNER_SSN().length()==13){
						System.out.println("주민번호자리수 13");
						bean.setOWNER_SSN(bean.getOWNER_SSN().substring(0,6)+"-"+bean.getOWNER_SSN().substring(6));
						}
									  
				  if(bean.getOWNER_SSN()!=null && !bean.getOWNER_SSN().equals("")){
					  //System.out.println("bean.getOWNER_SSN() 암호화전 : "+bean.getOWNER_SSN());
				  bean.setOWNER_SSN(enc.EncryptCode(bean.getOWNER_SSN(),"roadsdb"));
				  	 // System.out.println("bean.getOWNER_SSN() 암호화후 : "+bean.getOWNER_SSN());
				  }				
					 
				  
				  
				  bean.setOWNER_GENDER(rs.getString("OWNER_GENDER"));
				  bean.setOWNER_AGE(rs.getString("OWNER_AGE"));
				  bean.setOWNER_POST(rs.getString("OWNER_POST"));
				  bean.setOWNER_ADDR1(rs.getString("OWNER_ADDR1"));			
				  bean.setOWNER_SAN(rs.getString("OWNER_SAN"));
				  
				  bean.setOWNER_JIBUN(rs.getString("OWNER_JIBUN"));
				  bean.setOWNER_ADDR2(rs.getString("OWNER_ADDR2"));
				  bean.setOWNER_SAME(rs.getString("OWNER_SAME"));
				  bean.setOWNER_TOPOST(rs.getString("OWNER_TOPOST"));
				  bean.setOWNER_TOADDR1(rs.getString("OWNER_TOADDR1"));
				  bean.setOWNER_TOSAN(rs.getString("OWNER_TOSAN"));
				  bean.setOWNER_TOJIBUN(rs.getString("OWNER_TOJIBUN"));
				  bean.setOWNER_TOADDR2(rs.getString("OWNER_TOADDR2"));
				  bean.setOWNER_TEL(rs.getString("OWNER_TEL"));
				  bean.setOWNER_HP(rs.getString("OWNER_HP"));
				  
				  if(bean.getOWNER_HP()!=null && !bean.getOWNER_HP().equals("")){
					  bean.setOWNER_HP(enc.EncryptCode(rs.getString("OWNER_HP"),"roadsdb"));
				  }else{
					  bean.setOWNER_HP(enc.EncryptCode("000-0000-0000","roadsdb"));
				  }
				  
				  bean.setOWNER_IMG("");
				  bean.setRT_SEL(rs.getString("RT_SEL"));
				  bean.setRT_TXT(rs.getString("RT_TXT"));
				  bean.setLC_SEL(rs.getString("LC_SEL"));
				  bean.setLC_TXT(rs.getString("LC_TXT"));
				  bean.setESTATE_MOVE(rs.getString("ESTATE_MOVE"));
				  bean.setESTATE_REAL(rs.getString("ESTATE_REAL"));
				  bean.setPARTN_NAME(rs.getString("PARTN_NAME"));
				  bean.setPT_SEL(rs.getString("PT_SEL"));
				  bean.setPARTN_SSN(rs.getString("PARTN_SSN"));
			
				  if(bean.getPARTN_SSN().length()==13){
						bean.setPARTN_SSN(bean.getPARTN_SSN().substring(0,6)+"-"+bean.getPARTN_SSN().substring(6));
				   }
				  
				  if(bean.getPARTN_SSN()!=null && !bean.getPARTN_SSN().equals("")){
				  bean.setPARTN_SSN(enc.EncryptCode(bean.getPARTN_SSN(),"roadsdb"));
				  }
					   
				  
				  
				  bean.setPARTN_GENDER(rs.getString("PARTN_GENDER"));
				  bean.setPARTN_AGE(rs.getString("PARTN_AGE"));
				  bean.setPARTN_OSAM(rs.getString("PARTN_OSAM"));
				  bean.setPARTN_POST(rs.getString("PARTN_POST"));
				  bean.setPARTN_ADDR1(rs.getString("PARTN_ADDR1"));
				  bean.setPARTN_SAN(rs.getString("PARTN_SAN"));
				  bean.setPARTN_JIBUN(rs.getString("PARTN_JIBUN"));
				  bean.setPARTN_ADDR2(rs.getString("PARTN_ADDR2"));
				  bean.setPARTN_SAME(rs.getString("PARTN_SAME"));
				  bean.setPARTN_TOPOST(rs.getString("PARTN_TOPOST"));
				  
				  bean.setPARTN_TOADDR1(rs.getString("PARTN_TOADDR1"));
				  bean.setPARTN_TOSAN(rs.getString("PARTN_TOSAN"));
				  bean.setPARTN_TOJIBUN(rs.getString("PARTN_TOJIBUN"));
				  bean.setPARTN_TOADDR2(rs.getString("PARTN_TOADDR2"));
				  bean.setPARTN_TEL(rs.getString("PARTN_TEL"));
				  bean.setPARTN_HP(rs.getString("PARTN_HP"));
				  
				  if(bean.getPARTN_HP()!=null && !bean.getPARTN_HP().equals("")){
				  bean.setPARTN_HP(enc.EncryptCode(rs.getString("PARTN_HP"),"roadsdb"));
				  }else{
					  bean.setPARTN_HP(enc.EncryptCode("000-0000-0000","roadsdb"));
				  }
				  
				  bean.setPARTN_IMG("");
				  bean.setADDR_CHECK1(rs.getString("ADDR_CHECK1"));
				  bean.setADDR_CHECK2(rs.getString("ADDR_CHECK2"));
				  bean.setNOTE(rs.getString("NOTE"));
				    
		
				return bean;
			}
		
	}
		
		public List mdbGapanBaseList(String gu_code,String year){
			
			Object[] values = {gu_code,year};
						
			return objMdbGapanBaseQuery.execute(values); 
		}

		protected class MdbGapanBaseQuery extends MappingSqlQuery{
			protected MdbGapanBaseQuery(DataSource ds) {
				super(ds, getMessageSourceAccessor().getMessage(
						"Querys.rojum.mdb.gapanbase_list"));			
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
			}

			protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
				
				GapanBaseBean bean = new GapanBaseBean();
				
				  bean.setGAPAN_NO(rs.getString("GAPAN_NO"));		    	
				  bean.setGP_TYP(rs.getString("GP_TYPE"));
				  bean.setREG_DATE(rs.getString("REG_DATE"));
				  bean.setUP_DATE(rs.getString("UP_DATE"));
				  bean.setMANAGER(rs.getString("MANAGER"));
				  bean.setFINISH_ID(rs.getString("FINISH_ID"));
				  bean.setCLOSE_DATE(rs.getString("CLOSE_DATE"));
				  bean.setCLOSE_ID(rs.getString("CLOSE_ID"));
				  bean.setCLOSE_REASON(rs.getString("CLOSE_REASON"));

				return bean;
			}
	
		}
		
		
		public List mdbGapanUserList(String gp_typ){
			
			Object[] values = {gp_typ};
						
			return objMdbGapanUserQuery.execute(values); 
		}

		protected class MdbGapanUserQuery extends MappingSqlQuery{
			protected MdbGapanUserQuery(DataSource ds) {
				super(ds, getMessageSourceAccessor().getMessage(
						"Querys.rojum.mdb.gapanuser_list"));			
				declareParameter(new SqlParameter(Types.VARCHAR));
			}

			protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
				
				GapanUserBean bean = new GapanUserBean();
				
				bean.setUSER_ID(rs.getString("USER_ID"));
				bean.setUSER_PW(rs.getString("USER_PW"));
				bean.setUSER_NAME(rs.getString("USER_NAME"));
				bean.setSGG_NM(rs.getString("SGG_NM"));
				bean.setDEPT_NM(rs.getString("DEPT_NM"));
				bean.setGP_TYP(rs.getString("GP_TYP"));
				bean.setUSE_MODE(rs.getString("USE_MODE"));
				bean.setUPDATE_YN(rs.getString("UPDATE_YN"));
				

				return bean;
			}
	
		}
		
		
		//mdb자료를 바탕으로 실서버 데이터 수정
		public int mdbGapanInfoUpdate(GapanInfoBean bean){
			int a = 0;
			try{							                                    
				
				bean.setMODIFY_YN("");
				
				if(bean.getAR_TXT() != null && !bean.getAR_TXT().equals("")) bean.setAR_TXT(new String(bean.getAR_TXT().getBytes("8859_1"), "euc-kr")); 
				if(bean.getCAR_NUM() !=null && !bean.getCAR_NUM().equals("")) bean.setCAR_NUM(new String(bean.getCAR_NUM().getBytes("8859_1"), "euc-kr"));
				if(bean.getCAR_TON() != null && !bean.getCAR_TON().equals("")) bean.setCAR_TON(new String(bean.getCAR_TON().getBytes("8859_1"), "euc-kr"));
				if(bean.getDP_TXT() != null && !bean.getDP_TXT().equals("")) bean.setDP_TXT(new String(bean.getDP_TXT().getBytes("8859_1"), "euc-kr"));
				if(bean.getNOTES() !=null && !bean.getNOTES().equals("")) bean.setNOTES(new String(bean.getNOTES().getBytes("8859_1"), "euc-kr"));				
				if(bean.getROAD_INFO()!=null && !bean.getROAD_INFO().equals("")) bean.setROAD_INFO(new String(bean.getROAD_INFO().getBytes("8859_1"), "euc-kr"));
				if(bean.getWITH_ADDR()!=null && !bean.getWITH_ADDR().equals("")) bean.setWITH_ADDR(new String(bean.getWITH_ADDR().getBytes("8859_1"), "euc-kr"));
				if(bean.getWITH_INFO()!=null && !bean.getWITH_INFO().equals("")) bean.setWITH_INFO(new String(bean.getWITH_INFO().getBytes("8859_1"), "euc-kr"));				
				
				
				if(bean.getUC_TXT() != null && !bean.getUC_TXT().equals("")) bean.setUC_TXT(new String(bean.getUC_TXT().getBytes("8859_1"), "euc-kr"));
				if(bean.getUN_TXT() != null && !bean.getUN_TXT().equals("")) bean.setUN_TXT(new String(bean.getUN_TXT().getBytes("8859_1"), "euc-kr"));				
				if(bean.getDISUSE_REASON() != null && !bean.getDISUSE_REASON().equals("")) bean.setDISUSE_REASON(new String(bean.getDISUSE_REASON().getBytes("8859_1"), "euc-kr"));
				if(bean.getDISUSE_MANAGER() != null && !bean.getDISUSE_MANAGER().equals("")) bean.setDISUSE_MANAGER(new String(bean.getDISUSE_MANAGER().getBytes("8859_1"), "euc-kr"));	   
				if(bean.getREDUCTION_REASON() != null && !bean.getREDUCTION_REASON().equals("")) bean.setREDUCTION_REASON(new String(bean.getREDUCTION_REASON().getBytes("8859_1"), "euc-kr"));
				if(bean.getHISTORY() != null && !bean.getHISTORY().equals("")) bean.setHISTORY(new String(bean.getHISTORY().getBytes("8859_1"),"euc-kr"));
				if(bean.getFT_ETC() != null && !bean.getFT_ETC().equals("")) bean.setFT_ETC(new String(bean.getFT_ETC().getBytes("8859_1"),"euc-kr"));
				
				
				
				Object[] values = {		
						   bean.getX_COORD(),
						   bean.getY_COORD(),
						   bean.getGP_TYP(),
						   bean.getPURPOSE_CD(),
						   bean.getWITH_PNU(),
						   bean.getWITH_ADDR(),
						   bean.getWITH_INFO(),
						   bean.getROAD_INFO(),
						   bean.getAR_SEL(),
						   bean.getAR_TXT(),           

						   bean.getUC_SEL(),
						   bean.getUC_TXT(),
						   bean.getFOUND_DATE(),
						   bean.getFT_TYP(),
						   bean.getFT_SEL(),
						   bean.getFACIL_L(),
						   bean.getFACIL_W(),
						   bean.getFACIL_H(),
						   bean.getPLACE_L(),			   						                        
						   bean.getPLACE_H(),

						   bean.getPLACE_A(),
						   bean.getCAR_NUM(),
						   bean.getCAR_TON(),
						   bean.getSPECIAL_ST(),
						   bean.getTAXTATION_AT(),
						   bean.getMAINTN_OB(),
						   bean.getMT_SEL(),
						   bean.getDP_SEL(),
						   bean.getDP_TXT(),			                        
						   bean.getSG_TYP(),

						   bean.getSG_SEL(),
						   bean.getSG_ITM(),
						   bean.getLIQUOR_SL(),
						   bean.getLPGAS_US(),
						   bean.getOPEN_TIME(),
						   bean.getCLOSE_TIME(),
						   bean.getMEM_NUM(),
						   bean.getPERMIT_DATE(),
						   bean.getDAY_SALES(),				   
						   bean.getUN_TYP(),

						   bean.getUN_TXT(),
						   bean.getNOTES(),
						   bean.getTYPE(),
						   bean.getSECTION(),
						   bean.getOWNER_SET(),
						   bean.getTAX_SET(),
						   bean.getMUL_FROMDATE(),
						   bean.getMUL_TODATE(),
						   bean.getHJ_CD(),				  
						   bean.getDISUSE_DATE(),

						   bean.getDISUSE_REASON(),
						   bean.getDISUSE_MANAGER(),
						   bean.getOLD_SECTION(),
						   bean.getREDUCTION_RATE(),
						   bean.getREDUCTION_REASON(),
						   bean.getPICKUP_DATE(),						   
						   bean.getRETURN_DATE(),
						   bean.getRETURN_YN(),					                             		   
						   bean.getFT_ETC(),
						   bean.getPICKUP_YN(),

						   bean.getMODIFY_YN(),
						   bean.getSF_VALUE(),
						   bean.getHISTORY(),
						   bean.getMAKE_YM(),
						   bean.getSURVEY_YEAR(),
						   bean.getMANAGE_TYP(),
						   bean.getGAPAN_NO()
				};                                   
				
				System.out.println("==values==");
				for(int i = 0 ;i<values.length;i++)
				System.out.println("####### "+values[i]);
				
				a = objMdbGapanInfoUpdateQuery.update(values);
				
				
				
				
			} catch (Exception e) {
				System.out.println(e.toString());

				e.printStackTrace();
			}
			
			return a;
		}
		
		public class MdbGapanInfoUpdateQuery extends SqlUpdate {
	        public MdbGapanInfoUpdateQuery(DataSource dataSource) {
	            super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.mdb.gapaninfo_update"));
	           
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));

	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));

	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
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
		
		public int mdbGapanHeadUpdate(GapanHeadBean bean){		
			int a = 0;
			EncryptData enc = new EncryptData();
			
			try{	
				String owner_ssn = "";
				
				if(bean.getOWNER_SSN() != null && !bean.getOWNER_SSN().equals("")) {	
				    owner_ssn = enc.DecryptCode(bean.getOWNER_SSN(), "roadsdb");
				}
				
				if(owner_ssn.length()==13){
					owner_ssn = owner_ssn.substring(0,6)+"-"+owner_ssn.substring(6);
				}
				
				String partn_ssn = "";
				
				if(bean.getPARTN_SSN() != null && !bean.getPARTN_SSN().equals("")) {
					partn_ssn = enc.DecryptCode(bean.getPARTN_SSN(), "roadsdb");
				}
				
				if(partn_ssn.length()==13) {
				partn_ssn = partn_ssn.substring(0,6)+"-"+partn_ssn.substring(6);
				}
				
				String owner_hp = "";
				if(bean.getOWNER_HP()!=null && !bean.getOWNER_HP().equals("")) owner_hp= enc.DecryptCode(bean.getOWNER_HP(), "roadsdb");
				
				String partn_hp = "";
				if(bean.getPARTN_HP()!=null && !bean.getPARTN_HP().equals("")) partn_hp = enc.DecryptCode(bean.getPARTN_HP(), "roadsdb");
				
				if(bean.getESTATE_MOVE() != null && !bean.getESTATE_MOVE().equals("")) bean.setESTATE_MOVE(new String(bean.getESTATE_MOVE().getBytes("8859_1"), "euc-kr"));
				if(bean.getESTATE_REAL() != null && !bean.getESTATE_REAL().equals("")) bean.setESTATE_REAL(new String(bean.getESTATE_REAL().getBytes("8859_1"), "euc-kr"));
				if(bean.getLC_TXT() != null && !bean.getLC_TXT().equals("")) bean.setLC_TXT(new String(bean.getLC_TXT().getBytes("8859_1"), "euc-kr"));
				if(bean.getOWNER_ADDR1() != null && !bean.getOWNER_ADDR1().equals("")) bean.setOWNER_ADDR1(new String(bean.getOWNER_ADDR1().getBytes("8859_1"), "euc-kr"));
				if(bean.getOWNER_ADDR2() !=null && !bean.getOWNER_ADDR2().equals("")) bean.setOWNER_ADDR2(new String(bean.getOWNER_ADDR2().getBytes("8859_1"), "euc-kr"));
				
				
				if(bean.getOWNER_NAME() != null && !bean.getOWNER_NAME().equals("")) bean.setOWNER_NAME(new String(bean.getOWNER_NAME().getBytes("8859_1"), "euc-kr"));
				if(bean.getOWNER_TOADDR1() !=null && !bean.getOWNER_TOADDR1().equals("")) bean.setOWNER_TOADDR1(new String(bean.getOWNER_TOADDR1().getBytes("8859_1"), "euc-kr"));
				
				if(bean.getOWNER_TOADDR2() !=null && !bean.getOWNER_TOADDR2().equals("")) bean.setOWNER_TOADDR2(new String(bean.getOWNER_TOADDR2().getBytes("8859_1"), "euc-kr"));
				if(bean.getPARTN_ADDR1() != null && !bean.getPARTN_ADDR1().equals("")) bean.setPARTN_ADDR1(new String(bean.getPARTN_ADDR1().getBytes("8859_1"), "euc-kr"));
				if(bean.getPARTN_ADDR2() != null && !bean.getPARTN_ADDR2().equals("")) bean.setPARTN_ADDR2(new String(bean.getPARTN_ADDR2().getBytes("8859_1"), "euc-kr"));				
				
				if(bean.getPARTN_TOADDR1() != null && !bean.getPARTN_TOADDR1().equals("")) bean.setPARTN_TOADDR1(new String(bean.getPARTN_TOADDR1().getBytes("8859_1"), "euc-kr"));
				if(bean.getPARTN_TOADDR2() != null && !bean.getPARTN_TOADDR2().equals("")) bean.setPARTN_TOADDR2(new String(bean.getPARTN_TOADDR2().getBytes("8859_1"), "euc-kr"));
				
				if(bean.getRT_TXT() != null && !bean.getRT_TXT().equals("")) bean.setRT_TXT(new String(bean.getRT_TXT().getBytes("8859_1"), "euc-kr"));
				if(bean.getPARTN_NAME() != null && !bean.getPARTN_NAME().equals("")) bean.setPARTN_NAME(new String(bean.getPARTN_NAME().getBytes("8859_1"), "euc-kr"));
				
			
				Object[] values = {								
						bean.getOWNER_NAME(),
						bean.getOWNER_IDCHK(),
						owner_ssn,		
						bean.getOWNER_GENDER(),
						bean.getOWNER_AGE(),
						bean.getOWNER_POST(),
						bean.getOWNER_ADDR1(),
						bean.getOWNER_SAN(),
						bean.getOWNER_JIBUN(),
						bean.getOWNER_ADDR2(),
						
						bean.getOWNER_SAME(),
						bean.getOWNER_TOPOST(),
						bean.getOWNER_TOADDR1(),
						bean.getOWNER_TOSAN(),
						bean.getOWNER_TOJIBUN(),
						bean.getOWNER_TOADDR2(),
						bean.getOWNER_TEL(),
						owner_hp,
						bean.getRT_SEL(),
						bean.getRT_TXT(),
						
						bean.getLC_SEL(),
						bean.getLC_TXT(),
						bean.getESTATE_MOVE(),
						bean.getESTATE_REAL(),
						bean.getPARTN_NAME(),
						bean.getPT_SEL(),
						partn_ssn,
						bean.getPARTN_GENDER(),
						bean.getPARTN_AGE(),
						bean.getPARTN_OSAM(),

						bean.getPARTN_POST(),
						bean.getPARTN_ADDR1(),
						bean.getPARTN_SAN(),
						bean.getPARTN_JIBUN(),
						bean.getPARTN_ADDR2(),
						bean.getPARTN_SAME(),
						bean.getPARTN_TOPOST(),
						bean.getPARTN_TOADDR1(),
						bean.getPARTN_TOSAN(),
						bean.getPARTN_TOJIBUN(),
						
						bean.getPARTN_TOADDR2(),
						bean.getPARTN_TEL(),
						partn_hp,
						bean.getADDR_CHECK1(),
						bean.getADDR_CHECK2(),
						bean.getGAPAN_NO()
				};
				
				a = objMdbGapanHeadUpdateQuery.update(values);								
			} catch (Exception e) {
				System.out.println(e.toString());

				e.printStackTrace();
			}		
			return a;	
		}
		
		public class MdbGapanHeadUpdateQuery extends SqlUpdate{
			  public MdbGapanHeadUpdateQuery(DataSource dataSource) {

				    
		            super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.mdb.gapanhead_update"));
		          
		           
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));

		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
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
		
		public int mdbGapanBaseUpdate(GapanBaseBean bean){
			int a = 0;
			try{	
				
				
				
				if(bean.getMANAGER() != null && !bean.getMANAGER().equals(""))  bean.setMANAGER(new String(bean.getMANAGER().getBytes("8859_1"), "euc-kr"));
				
				System.out.println("------- gapan_base update ---------");
				System.out.println("getMANAGER "+bean.getMANAGER());
				
				
				Object[] values = {						  
						  bean.getREG_DATE(),
						  bean.getUP_DATE(),
						  bean.getMANAGER(),
						  bean.getFINISH_ID(),
						  bean.getCLOSE_DATE(),
						  
						  bean.getCLOSE_ID(),
						  bean.getCLOSE_REASON(),
						  bean.getGAPAN_NO()						  
				};
				
				a = objMdbGapanBaseUpdateQuery.update(values);								
			} catch (Exception e) {
				System.out.println(e.toString());

				e.printStackTrace();
			}		
			return a;	
		}
		
		public class MdbGapanBaseUpdateQuery extends SqlUpdate{
			  public MdbGapanBaseUpdateQuery(DataSource dataSource) {

		            super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.mdb.gapanbase_update"));
		           
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
		
		public int mdbGapanUserUpdate(GapanUserBean bean){
			int a = 0;
			try{	
				// new String(bean.getMANAGER().getBytes("8859_1"), "euc-kr"),
				if(bean.getUSER_NAME() != null && !bean.getUSER_NAME().equals(""))  bean.setUSER_NAME(new String(bean.getUSER_NAME().getBytes("8859_1"), "euc-kr"));
				if(bean.getSGG_NM() != null && !bean.getSGG_NM().equals(""))  bean.setSGG_NM(new String(bean.getSGG_NM().getBytes("8859_1"), "euc-kr"));
				if(bean.getDEPT_NM() != null && !bean.getDEPT_NM().equals(""))  bean.setDEPT_NM(new String(bean.getDEPT_NM().getBytes("8859_1"), "euc-kr"));
				if(bean.getUSER_ID() != null && !bean.getUSER_ID().equals(""))  bean.setUSER_ID(new String(bean.getUSER_ID().getBytes("8859_1"), "euc-kr"));
				
				Object[] values = {						  
						bean.getUSER_PW(),
						bean.getUSER_NAME(), 
						bean.getSGG_NM(), 
						bean.getDEPT_NM(),
						bean.getGP_TYP(),
						bean.getUSE_MODE(),
						bean.getUSER_ID()
				};
				
				a = objMdbGapanUserUpdateQuery.update(values);								
			} catch (Exception e) {
				System.out.println(e.toString());

				e.printStackTrace();
			}		
			return a;	
		}
		
		public class MdbGapanUserUpdateQuery extends SqlUpdate{
			  public MdbGapanUserUpdateQuery(DataSource dataSource) {

		            super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.mdb.userUpdate"));
		           
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		      
		      		
		        }
		}
		
		//mdb데이터를 실서버에 삽입
		
		public int mdbGapanInfoInsert(GapanInfoBean bean){
			
			int a =  0;
			
			bean.setMODIFY_YN("");
		
		
			try{	
				
				if(bean.getAR_TXT() != null && !bean.getAR_TXT().equals("")) bean.setAR_TXT(new String(bean.getAR_TXT().getBytes("8859_1"), "euc-kr")); 
				if(bean.getCAR_NUM() !=null && !bean.getCAR_NUM().equals("")) bean.setCAR_NUM(new String(bean.getCAR_NUM().getBytes("8859_1"), "euc-kr"));
				if(bean.getCAR_TON() != null && !bean.getCAR_TON().equals("")) bean.setCAR_TON(new String(bean.getCAR_TON().getBytes("8859_1"), "euc-kr"));
				if(bean.getDP_TXT() != null && !bean.getDP_TXT().equals("")) bean.setDP_TXT(new String(bean.getDP_TXT().getBytes("8859_1"), "euc-kr"));
				if(bean.getNOTES() !=null && !bean.getNOTES().equals("")) bean.setNOTES(new String(bean.getNOTES().getBytes("8859_1"), "euc-kr"));				
				if(bean.getROAD_INFO()!=null && !bean.getROAD_INFO().equals("")) bean.setROAD_INFO(new String(bean.getROAD_INFO().getBytes("8859_1"), "euc-kr"));
				if(bean.getWITH_ADDR()!=null && !bean.getWITH_ADDR().equals("")) bean.setWITH_ADDR(new String(bean.getWITH_ADDR().getBytes("8859_1"), "euc-kr"));
				if(bean.getWITH_INFO()!=null && !bean.getWITH_INFO().equals("")) bean.setWITH_INFO(new String(bean.getWITH_INFO().getBytes("8859_1"), "euc-kr"));				
				
				if(bean.getUC_TXT() != null && !bean.getUC_TXT().equals("")) bean.setUC_TXT(new String(bean.getUC_TXT().getBytes("8859_1"), "euc-kr"));
				if(bean.getUN_TXT() != null && !bean.getUN_TXT().equals("")) bean.setUN_TXT(new String(bean.getUN_TXT().getBytes("8859_1"), "euc-kr"));				
				if(bean.getDISUSE_REASON() != null && !bean.getDISUSE_REASON().equals("")) bean.setDISUSE_REASON(new String(bean.getDISUSE_REASON().getBytes("8859_1"), "euc-kr"));
				if(bean.getDISUSE_MANAGER() != null && !bean.getDISUSE_MANAGER().equals("")) bean.setDISUSE_MANAGER(new String(bean.getDISUSE_MANAGER().getBytes("8859_1"), "euc-kr"));	   
				if(bean.getREDUCTION_REASON() != null && !bean.getREDUCTION_REASON().equals("")) bean.setREDUCTION_REASON(new String(bean.getREDUCTION_REASON().getBytes("8859_1"), "euc-kr"));
				if(bean.getHISTORY() != null && !bean.getHISTORY().equals("")) bean.setHISTORY(new String(bean.getHISTORY().getBytes("8859_1"),"euc-kr"));
				if(bean.getFT_ETC() != null && !bean.getFT_ETC().equals("")) bean.setFT_ETC(new String(bean.getFT_ETC().getBytes("8859_1"),"euc-kr"));
				
				
				
		    	Object[] values = {
		    			   bean.getGAPAN_NO(),		    	
			  			   bean.getX_COORD(), 
			  			   bean.getY_COORD(), 
			  			   bean.getGP_TYP(), 
			  			   bean.getPURPOSE_CD(),   	
			  			   bean.getWITH_PNU(), 
			  			   bean.getWITH_ADDR(),
						   bean.getWITH_INFO(),
			  			   bean.getROAD_INFO(), 
			  			   bean.getAR_SEL(), 
			  			   
			  			   bean.getAR_TXT(), 
			  			   bean.getUC_SEL(), 
			  			   bean.getUC_TXT(), 
			  			   bean.getFOUND_DATE(), 
			  			   bean.getFT_TYP(), 		   
			  			   bean.getFT_SEL(), 
			  			   bean.getFACIL_L(), 
			  			   bean.getFACIL_W(),
			  			   bean.getFACIL_H(), 
			  			   
			  			   
			  			   bean.getPLACE_L(), 
			  			   bean.getPLACE_H(), 
			  			   bean.getPLACE_A(), 
			  			   bean.getCAR_NUM(), 
			  			   bean.getCAR_TON(), 	   
			  			   bean.getSPECIAL_ST(), 
			  			   bean.getTAXTATION_AT(),
			  			   bean.getMAINTN_OB(), 
			  			   bean.getMT_SEL(), 
			  			   bean.getDP_SEL(), 
			  			   
			  			   bean.getDP_TXT(), 
			  			   bean.getSG_TYP(),
			  			   bean.getSG_SEL(),
			  			   bean.getSG_ITM(),
			  			   bean.getLIQUOR_SL(),
			  			   bean.getLPGAS_US(),
			  			   bean.getOPEN_TIME(), 
			  			   bean.getCLOSE_TIME(), 
			  			   bean.getMEM_NUM(), 
			  			   bean.getPERMIT_DATE(),
			  			   
			  			   bean.getDAY_SALES(),
			  			   bean.getUN_TYP(), 
			  			   bean.getUN_TXT(), 
			  			   bean.getNOTES(),
			  			   bean.getTYPE(),	   
			  			   bean.getSECTION(), 
			  			   bean.getOWNER_SET(), 
			  			   bean.getTAX_SET(), 
			  			   bean.getMUL_FROMDATE(), 
			  			   bean.getMUL_TODATE(), 
			  			   
			  			   bean.getHJ_CD(), 
			  			   bean.getDISUSE_DATE(), 
			  			   bean.getDISUSE_REASON(), 
			  			   bean.getDISUSE_MANAGER(),
			  			   bean.getOLD_SECTION(),   
			  			   bean.getREDUCTION_RATE(),
			  			   bean.getREDUCTION_REASON(), 
			  			   bean.getPICKUP_DATE(), 
			  			   
			  			   bean.getRETURN_DATE(), 
			  			   
			  			   bean.getRETURN_YN(), 
			  			   bean.getFT_ETC(),
			  			   bean.getPICKUP_YN(),
			  			   bean.getMODIFY_YN(),
			  			   bean.getSF_VALUE(),    
			  			   bean.getHISTORY(),
			  			   bean.getMAKE_YM(),
			  			   bean.getSURVEY_YEAR(),
			  			   bean.getMANAGE_TYP()
		    	};
		    	
		    	System.out.println("인서트 안쪽은?");
		    
		    	objMdbGapanInfoInsertQuery.update(values);
	    	} catch (Exception e) {
				System.out.println(e.toString());

				e.printStackTrace();
			}
	    	
	    	return a; 
			
		}
		
		public class MdbGapanInfoInsertQuery extends SqlUpdate{
			  public MdbGapanInfoInsertQuery(DataSource dataSource) {

		            super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.mdb.gapaninfo_insert"));
		            try{
			            dataSource.getConnection().setAutoCommit(false);
			            
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            
		            }catch(Exception e){
		            	
		            }
		      		
		        }
		}
		
		public int mdbGapanHeadInsert(GapanHeadBean bean){
			int a = 0;
			EncryptData enc = new EncryptData();
			
			try{	

				String owner_ssn = ""; 
					
				if(bean.getOWNER_SSN()!=null && !bean.getOWNER_SSN().equals("")) owner_ssn = enc.DecryptCode(bean.getOWNER_SSN(), "roadsdb");
					
				
				if(owner_ssn.length()==13){
				owner_ssn = owner_ssn.substring(0,6)+"-"+owner_ssn.substring(6);
				}
				
				String partn_ssn = "";
				if(bean.getPARTN_SSN()!=null && !bean.getPARTN_SSN().equals("")) partn_ssn = enc.DecryptCode(bean.getPARTN_SSN(), "roadsdb");
				
				if(partn_ssn.length()==13) {
				partn_ssn = partn_ssn.substring(0,6)+"-"+partn_ssn.substring(6);
				}
				
				String owner_hp = "";
				if(bean.getOWNER_HP()!=null && !bean.getOWNER_HP().equals("")) owner_hp= enc.DecryptCode(bean.getOWNER_HP(), "roadsdb");
				
				String partn_hp = "";
				if(bean.getPARTN_HP()!=null && !bean.getPARTN_HP().equals("")) partn_hp = enc.DecryptCode(bean.getPARTN_HP(), "roadsdb");
				
				
			/*	System.out.println("---decoding--");			
				System.out.println(enc.DecryptCode(bean.getOWNER_SSN(), "roadsdb"));
				System.out.println(owner_ssn.substring(0,6)+"-"+owner_ssn.substring(6));

				System.out.println("----");
				System.out.println(bean.getOWNER_SSN());*/
				
				if(bean.getESTATE_MOVE() != null && !bean.getESTATE_MOVE().equals("")) bean.setESTATE_MOVE(new String(bean.getESTATE_MOVE().getBytes("8859_1"), "euc-kr"));
				if(bean.getESTATE_REAL() != null && !bean.getESTATE_REAL().equals("")) bean.setESTATE_REAL(new String(bean.getESTATE_REAL().getBytes("8859_1"), "euc-kr"));
				if(bean.getLC_TXT() != null && !bean.getLC_TXT().equals("")) bean.setLC_TXT(new String(bean.getLC_TXT().getBytes("8859_1"), "euc-kr"));
				if(bean.getOWNER_ADDR1() != null && !bean.getOWNER_ADDR1().equals("")) bean.setOWNER_ADDR1(new String(bean.getOWNER_ADDR1().getBytes("8859_1"), "euc-kr"));
				if(bean.getOWNER_ADDR2() !=null && !bean.getOWNER_ADDR2().equals("")) bean.setOWNER_ADDR2(new String(bean.getOWNER_ADDR2().getBytes("8859_1"), "euc-kr"));
				
				
				if(bean.getOWNER_NAME() != null && !bean.getOWNER_NAME().equals("")) bean.setOWNER_NAME(new String(bean.getOWNER_NAME().getBytes("8859_1"), "euc-kr"));
				if(bean.getOWNER_TOADDR1() !=null && !bean.getOWNER_TOADDR1().equals("")) bean.setOWNER_TOADDR1(new String(bean.getOWNER_TOADDR1().getBytes("8859_1"), "euc-kr"));
				
				if(bean.getOWNER_TOADDR2() !=null && !bean.getOWNER_TOADDR2().equals("")) bean.setOWNER_TOADDR2(new String(bean.getOWNER_TOADDR2().getBytes("8859_1"), "euc-kr"));
				if(bean.getPARTN_ADDR1() != null && !bean.getPARTN_ADDR1().equals("")) bean.setPARTN_ADDR1(new String(bean.getPARTN_ADDR1().getBytes("8859_1"), "euc-kr"));
				if(bean.getPARTN_ADDR2() != null && !bean.getPARTN_ADDR2().equals("")) bean.setPARTN_ADDR2(new String(bean.getPARTN_ADDR2().getBytes("8859_1"), "euc-kr"));				
				
				if(bean.getPARTN_TOADDR1() != null && !bean.getPARTN_TOADDR1().equals("")) bean.setPARTN_TOADDR1(new String(bean.getPARTN_TOADDR1().getBytes("8859_1"), "euc-kr"));
				if(bean.getPARTN_TOADDR2() != null && !bean.getPARTN_TOADDR2().equals("")) bean.setPARTN_TOADDR2(new String(bean.getPARTN_TOADDR2().getBytes("8859_1"), "euc-kr"));
				
				if(bean.getRT_TXT() != null && !bean.getRT_TXT().equals("")) bean.setRT_TXT(new String(bean.getRT_TXT().getBytes("8859_1"), "euc-kr"));
				if(bean.getPARTN_NAME() != null && !bean.getPARTN_NAME().equals("")) bean.setPARTN_NAME(new String(bean.getPARTN_NAME().getBytes("8859_1"), "euc-kr"));
				

		    	Object[] values = {
		    			bean.getGAPAN_NO(),
		    			bean.getGP_TYP(),
		    			bean.getOWNER_NAME(),
						bean.getOWNER_IDCHK      (),
						owner_ssn,		
						bean.getOWNER_GENDER     (),
						bean.getOWNER_AGE        (),
						bean.getOWNER_POST       (),
						bean.getOWNER_ADDR1(),
						bean.getOWNER_SAN        (),
						
						bean.getOWNER_JIBUN      (),
						bean.getOWNER_ADDR2(),						
						bean.getOWNER_SAME       (),
						bean.getOWNER_TOPOST     (),
						bean.getOWNER_TOADDR1(),
						bean.getOWNER_TOSAN      (),
						bean.getOWNER_TOJIBUN    (),
						bean.getOWNER_TOADDR2(),
						bean.getOWNER_TEL        (),
						owner_hp,
						
						
						bean.getRT_SEL           (),						
						bean.getRT_TXT(),
						bean.getLC_SEL           (),
						bean.getLC_TXT(),
						bean.getESTATE_MOVE      (),
						bean.getESTATE_REAL      (),
						bean.getPARTN_NAME       (),
						bean.getPT_SEL           (),
						partn_ssn,
						
						bean.getPARTN_GENDER     (),
						bean.getPARTN_AGE        (),						
						bean.getPARTN_OSAM       (),
						bean.getPARTN_POST       (),
						bean.getPARTN_ADDR1(),
						bean.getPARTN_SAN        (),
						bean.getPARTN_JIBUN      (),
						bean.getPARTN_ADDR2(),
						bean.getPARTN_SAME       (),
						bean.getPARTN_TOPOST     (),
						
						bean.getPARTN_TOADDR1(),
						bean.getPARTN_TOSAN      (),						
						bean.getPARTN_TOJIBUN    (),
						bean.getPARTN_TOADDR2(),
						bean.getPARTN_TEL        (),
						partn_hp,
						
						bean.getADDR_CHECK1      (),
						bean.getADDR_CHECK2      ()		
		    	};
		    	
		    	System.out.println("여기 안찍히는겨?");
		    	objMdbGapanHeadInsertQuery.update(values);
	    	} catch (Exception e) {
				System.out.println(e.toString());

				e.printStackTrace();
			}
	    	
	    	return a; 
		}
		
		public class MdbGapanHeadInsertQuery extends SqlUpdate{
			  public MdbGapanHeadInsertQuery(DataSource dataSource) {

		            super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.mdb.gapanhead_insert"));
		            try{
			            dataSource.getConnection().setAutoCommit(false);
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));

		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));

		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));

		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));

		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            
		            
		            }catch(Exception e){
		            	
		            }
		        }
		}
		
		
		public int mdbGapanBaseInsert(GapanBaseBean bean){
			int a =  0;
						
			 
			try{	
				
				if(bean.getMANAGER() != null && !bean.getMANAGER().equals("")) bean.setMANAGER(new String(bean.getMANAGER().getBytes("8859_1"), "euc-kr"));
				
		    	Object[] values = {
		    			bean.getGAPAN_NO(), 
		    			bean.getGP_TYP(), 
		    			bean.getREG_DATE(), 
		    			bean.getUP_DATE(), 
		    			bean.getMANAGER(), 
		    			bean.getFINISH_ID(), 
		    			bean.getCLOSE_DATE(), 
		    			bean.getCLOSE_ID(), 
		    			bean.getCLOSE_REASON()	  			
		    	};
		    	
	    	
		    	objMdbGapanBaseInsertQuery.update(values);
		    	
	    	} catch (Exception e) {
				System.out.println(e.toString());

				e.printStackTrace();
			}
	    	
	    	return a; 
		}
		
		
		public class MdbGapanBaseInsertQuery extends SqlUpdate{
			  public MdbGapanBaseInsertQuery(DataSource dataSource) {

		            super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.mdb.gapanbase_insert"));
		            try{
			            dataSource.getConnection().setAutoCommit(false);
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            }catch(Exception e){
		            	
		            }
		        }
		}
		
		public int mdbGapanDelete(GapanInfoBean bean){
			
			int a =  0;

			try{	
		    	Object[] values = {			
		    			bean.getDISUSE_MANAGER(),
		    			bean.getDISUSE_REASON(),
		    			bean.getDISUSE_DATE(),
		    			bean.getGAPAN_NO()		    			
		    	};
		    	
	    	
		    	objMdbGapanDeleteQuery.update(values);
		    	
	    	} catch (Exception e) {
				System.out.println(e.toString());

				e.printStackTrace();
			}
	    	
	    	return a; 
		}
		
		public class MdbGapanDeleteQuery extends SqlUpdate{
			  public MdbGapanDeleteQuery(DataSource dataSource) {

		            super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.mdb.gapan_delete"));
		          
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
		            declareParameter(new SqlParameter(Types.VARCHAR));
      		
		        }
		}
		
		public List mdbGapanUserName(String user_id){
			
			Object[] values = {user_id };	        
	        
	        return objMdbGapanNameQuery.execute(values);	
		}

		protected class MdbGapanNameQuery extends MappingSqlQuery{
			protected MdbGapanNameQuery(DataSource ds) {
				super(ds, getMessageSourceAccessor().getMessage(
						"Querys.rojum.mdb.selectbyUserId"));			
				declareParameter(new SqlParameter(Types.VARCHAR));
				
				
			}

			protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
				
				GapanNameBean bean = new GapanNameBean();
				
				 bean.setNAME(rs.getString("NAME"));
		
				return bean;
			}
			
		}
		
		public	String	executeCheck_Gapanno(String gapanNo){
	    	Object[] values = {gapanNo};

	    	String sql = getMessageSourceAccessor().getMessage("Querys.rojum.survey.getGapanno");	
	    	Map Request_Map =getJdbcTemplate().queryForMap(sql, values);							//'_4_0001'의 형식으로 가져온다.
	    	gapanNo = gapanNo + Request_Map.get("GAPAN_NO").toString();							//(구코드+법정동코드) + '_4_0001'
	    	return gapanNo;
		}
		
		public void rollbackInsert(){
			try{
			System.out.println("롤백 고고");
			
			objMdbGapanInfoInsertQuery.getJdbcTemplate().getDataSource().getConnection().rollback();
			objMdbGapanHeadInsertQuery.getJdbcTemplate().getDataSource().getConnection().rollback();
			objMdbGapanBaseInsertQuery.getJdbcTemplate().getDataSource().getConnection().rollback();
			
			}catch(Exception e){
				
			}
			
		}
		
		
}
