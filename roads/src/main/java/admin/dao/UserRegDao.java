package main.java.admin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import main.java.admin.model.DongCodeBean;
import main.java.admin.model.UserRegBean;
import main.java.admin.model.BoardBean;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.SHA;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class UserRegDao extends RoadsJdbcDaoSupport implements IUserRegDao {

	private OracleLobHandler oracleLobHandler = null;
	private RetrieveUserListQuery objRetrieveQuery;
	private RetrieveUserDetailQuery objUserDetailQuery;
	private RetrieveAuthorityList objAuthorityQuery;
	private CalInsert objCalInsert;	
	private CalModify objCalModify;	
	private CalDelete objCalDelete;	
	private UpdateConfirm objUserConfirm;	
	private UpdateAuthority objUpdateAuthority;	
	private GuCode objGuCodeQuery;
	private NewGuCode objNewGuCodeQuery;
	private DeptCodeList objDeptCodeQuery;
	private NoticeList objNoticeListQuery;
	private NoticeList2 objNoticeListQuery2;
	private SetPwNum setPwNum;
	private SetNewPwd setNewPwd;
	private setLoginDate setLoginDate;
	
	protected void initDao() throws Exception {
		super.initDao();
		
		oracleLobHandler = new OracleLobHandler();
		objRetrieveQuery = new RetrieveUserListQuery(getDataSource());
		objUserDetailQuery = new RetrieveUserDetailQuery(getDataSource());
		objAuthorityQuery = new RetrieveAuthorityList(getDataSource());
		objCalInsert = new CalInsert(getDataSource());
		objCalModify = new CalModify(getDataSource());
		objCalDelete = new CalDelete(getDataSource());
		objUserConfirm = new UpdateConfirm(getDataSource());
		objUpdateAuthority = new UpdateAuthority(getDataSource());
		objGuCodeQuery = new GuCode(getDataSource());
		objNewGuCodeQuery = new NewGuCode(getDataSource());
		objDeptCodeQuery = new DeptCodeList(getDataSource());
		objNoticeListQuery = new NoticeList(getDataSource());
		objNoticeListQuery2 = new NoticeList2(getDataSource());
		setPwNum = new SetPwNum(getDataSource());
		setNewPwd = new SetNewPwd(getDataSource());
		setLoginDate = new setLoginDate(getDataSource());
	}
	//User_id를 통해 Grade_menu값을 가져옴
	public int getGrade_menu(String u_id)
	{			    	    
    	if(u_id.equals(""))
    		u_id = "%";
    	
    	Object[] values = {u_id};	
    	String sql = getMessageSourceAccessor().getMessage("Querys.userreg.user.select2");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
    	
	}
	
	//사용자List 조회
	public List retrieveUserList(int intCurrentPage,int intCountPerPage, String userGrade,String siguCode,String deptCode,String userName,String certYN) {
	
		String strUserGrade = "%";
		String strSiguCode = "%";
		String strDeptCode = "%";
		String strUserName = "%";
		String strCertYN = "N";		
	
		if(!userGrade.equals(""))
			strUserGrade = "%"+userGrade+"%";
		if(!siguCode.equals(""))
			strSiguCode = "%"+siguCode+"%";
		if(!deptCode.equals(""))
			strDeptCode = "%"+deptCode+"%";
		if(!userName.equals(""))
			strUserName = "%"+userName+"%";
		
		if(certYN.equals("Y"))
			strCertYN = "Y";
		else if(certYN.equals("N"))
			strCertYN = "N";
				
		Object[] values = {strUserGrade, strSiguCode,strDeptCode, strUserName, strCertYN, new Integer(intCurrentPage),new Integer(intCountPerPage),new Integer(intCountPerPage)};
		
		System.out.println("strUserGrade"+strUserGrade + "strSiguCode" +strSiguCode +"strDeptCode"+ strDeptCode+"strUserName"+strUserName+ "strCertYN"+strCertYN);
		
		return objRetrieveQuery.execute(values);
	}

	/**
	 * 게시물 리스트를 조회해 List 형태로 리턴
	 * 
	 * @param int
	 *            intCurPage 현재 조회할 페이지 번호
	 * @param int
	 *            intCount 한페이지에 조회될 게시물 수
	 * @return List 게시물 리스트
	 */
	protected class RetrieveUserListQuery extends MappingSqlQuery {
		protected RetrieveUserListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.userreg.user.select1"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			UserRegBean objUserRegBean = new UserRegBean();

			objUserRegBean.setSECTION(rs.getString("SECTION"));
			objUserRegBean.setSIGU_CD(rs.getString("ORG_CD"));
			objUserRegBean.setDEPT_CD(rs.getString("DEPT_CD"));
			objUserRegBean.setDEPT_NM(rs.getString("DEPT_NM"));
			objUserRegBean.setNAME(rs.getString("NAME"));
			objUserRegBean.setUSER_ID(rs.getString("USER_ID"));
			objUserRegBean.setREQUEST_DATE(rs.getString("REQUEST_DATE"));
			objUserRegBean.setAPPROVAL_DATE (rs.getString("APPROVAL_DATE"));
			objUserRegBean.setSECTION_NAME(rs.getString("SECTION_NAME"));
			objUserRegBean.setGU_NM(rs.getString("GU_NM"));
			objUserRegBean.setPOSITION(rs.getString("POSITION"));
			objUserRegBean.setLAST_CONN_DATE(rs.getString("LAST_CONN_DATE"));
			
			return objUserRegBean;
		}
	}
	
	public String getSHA_PW(String oriPW) {
		String pw_sha = "";
		
		pw_sha = SHA.SHA(oriPW, "SHA-256");
		System.out.println("oriPW : " + oriPW + ", pw_sha : " + pw_sha);
		System.out.println("oriPW : " + oriPW + ", pw_sha : " + pw_sha);
		
		return pw_sha;
	}

	//사용자정보 등록
	public boolean insertUserInfo(UserRegBean objUserRegBean) {
    	
		String pw_sha = getSHA_PW(objUserRegBean.getPW());
		System.out.println("pw_sha : " + pw_sha);
			
			Object[] values = {		
				objUserRegBean.getUSER_ID()
				, objUserRegBean.getPW()
				, objUserRegBean.getUSER_ID()
				, objUserRegBean.getNAME()
				, objUserRegBean.getSIGU_CD()
				
				, objUserRegBean.getDEPT_CD()
				, objUserRegBean.getSECTION()
				, objUserRegBean.getTEL()
				, objUserRegBean.getHP()
				, objUserRegBean.getTEL_EXT()
				
				, objUserRegBean.getEMAIL()
				, objUserRegBean.getIP()
				, objUserRegBean.getPOSITION()
				, objUserRegBean.getPW_DATE()
				, "1"
				
				, objUserRegBean.getAPPROVAL_DATE()
				, objUserRegBean.getWORK_ID()
				, objUserRegBean.getBUKWA_ID()
				, objUserRegBean.getELEC_ID()
				, objUserRegBean.getSAEALL_ID()
			
				, pw_sha
				, objUserRegBean.getPW()
			};				
	
	try{	
			objCalInsert.update(values);	
			

		} catch (Exception e) {
			System.out.println("error:"+e.toString());

			//e.printStackTrace();
			return false;
		}
		
		return 	true;
	}

    public class CalInsert extends SqlUpdate {
        public CalInsert(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.userInfo.insert"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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

    //사용자정보 totalcount
	public int getUserTotalCount(String userGrade, String siguCode, String deptCode, String userName, String certYN) {

		String strUserGrade = "%";
		String strSiguCode = "%";
		String strDeptCode = "%";
		String strUserName = "%";
		String strCertYN = "N";		
	
		if(!userGrade.equals(""))
			strUserGrade = "%"+userGrade+"%";
		if(!siguCode.equals(""))
			strSiguCode = "%"+siguCode+"%";
		if(!deptCode.equals(""))
			strDeptCode = "%"+deptCode+"%";
		if(!userName.equals(""))
			strUserName = "%"+userName+"%";
		
		if(certYN.equals("Y"))
			strCertYN = "Y";
		else if(certYN.equals("N"))
			strCertYN = "N";
		
		Object[] values = {strUserGrade, strSiguCode, strDeptCode, strUserName, strCertYN}; 
		
        String sql = getMessageSourceAccessor().getMessage("Querys.user.totalCount");
     
        return getJdbcTemplate().queryForInt(sql,values);		
	}
	
  	/**
  	 * 전달받은 USER_ID에 해당하는 USER_INFO을 조회해 리턴
	* @param	int seq	게시물 번호
	* @return	BoardBean	조회된 게시물 bean
	*/
	public UserRegBean getUserDetail(String userId) {

		UserRegBean objUserRegBean = null;
		objUserRegBean = (UserRegBean) objUserDetailQuery.findObject(userId);
		System.out.println("UserRegDao"+objUserRegBean);
		return objUserRegBean;
	}

	protected class RetrieveUserDetailQuery extends MappingSqlQuery {
		protected RetrieveUserDetailQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.User.selectbyUserId"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			UserRegBean objUserRegBean = new UserRegBean();

			objUserRegBean.setUSER_ID(rs.getString("USER_ID"));
			objUserRegBean.setPW(rs.getString("PASS_WORD"));
			objUserRegBean.setNAME(rs.getString("NAME"));
			objUserRegBean.setSIGU_CD(rs.getString("ORG_CD"));
			objUserRegBean.setGU_CD(rs.getString("SIGU_CD"));	
			objUserRegBean.setGU_NM(rs.getString("GU_NM"));
			objUserRegBean.setDEPT_CD(rs.getString("DEPT_CD"));
			objUserRegBean.setSECTION(rs.getString("SECTION"));
			objUserRegBean.setTEL(rs.getString("TEL"));
			objUserRegBean.setHP(rs.getString("HP"));
			objUserRegBean.setTEL_EXT(rs.getString("TEL_EXT"));
			objUserRegBean.setEMAIL(rs.getString("EMAIL"));
			objUserRegBean.setIP(rs.getString("IP"));
			objUserRegBean.setPOSITION(rs.getString("POSITION"));
			objUserRegBean.setPW_DATE(rs.getString("PW_DATE"));
			objUserRegBean.setPW_NUM(rs.getInt("PW_NUM"));
			objUserRegBean.setERROR_NUM(rs.getInt("ERROR_NUM"));
			objUserRegBean.setREQUEST_DATE(rs.getString("REQUEST_DATE"));
			objUserRegBean.setAPPROVAL_DATE(rs.getString("APPROVAL_DATE"));
			objUserRegBean.setREG_DATE(rs.getString("REG_DATE"));
			objUserRegBean.setUP_DATE(rs.getString("UP_DATE"));
			objUserRegBean.setGrade(rs.getString("GRADE_MENU"));
			objUserRegBean.setWORK_ID(rs.getString("WORK_ID"));
			objUserRegBean.setBUKWA_ID(rs.getString("BUKWA_ID"));
			objUserRegBean.setELEC_ID(rs.getString("ELEC_ID"));
			objUserRegBean.setSAEALL_ID(rs.getString("SAEALL_ID"));		
			objUserRegBean.setINSARANGKEY(rs.getString("INSARANGKEY"));
			
			return objUserRegBean;
		}
	}

  	/**
  	 * 메뉴사용권한 List 조회
	*/
	/*public List userAuthorityList(String userGrade) {
		
		return objAuthorityQuery.execute(userGrade);
	}*/
	
	public List userAuthorityList() {
		
		return objAuthorityQuery.execute();
	}
	
	protected class RetrieveAuthorityList extends MappingSqlQuery {
		protected RetrieveAuthorityList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.User.authorityList"));
		
			//declareParameter(new SqlParameter(Types.VARCHAR));
			
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			UserRegBean objUserRegBean = new UserRegBean();

			objUserRegBean.setMENU_NM(rs.getString("NAME"));
			objUserRegBean.setMENU_CD(rs.getString("MENU_CD"));
			//objUserRegBean.setCHK(rs.getString("CHK"));

			return objUserRegBean;
		}
	}

	
  	/**
  	 * USER_INFO 수정
	* @param	UserRegBean	
	* @return	UserRegBean	
	*/
	public boolean updateUserInfo(UserRegBean objUserRegBean) {
		String pw_sha = getSHA_PW(objUserRegBean.getPW());
		System.out.println("pw_sha : " + pw_sha);
    	
		try{			
			Object[] values = {		
					objUserRegBean.getPW()
					, objUserRegBean.getUSER_ID()
					, objUserRegBean.getNAME()
					, objUserRegBean.getSIGU_CD()
					, objUserRegBean.getDEPT_CD()
					
					, objUserRegBean.getSECTION()					
					, objUserRegBean.getTEL()
					, objUserRegBean.getHP()
					, objUserRegBean.getTEL_EXT()
					, objUserRegBean.getEMAIL()
					
					, objUserRegBean.getIP()
					, objUserRegBean.getPOSITION()
					, objUserRegBean.getPW_DATE()
					, new Integer(objUserRegBean.getPW_NUM())					
					, objUserRegBean.getWORK_ID()
					
					, objUserRegBean.getBUKWA_ID()
					, objUserRegBean.getELEC_ID()
					, objUserRegBean.getSAEALL_ID()
					, objUserRegBean.getERROR_NUM()
					, pw_sha
					
					, objUserRegBean.getPW()
					, objUserRegBean.getINSARANGKEY()
					, objUserRegBean.getUSER_ID()					
			};
			
			objCalModify.update(values);	
		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
			return false;
		}
		
		return true;
	}
		
    public class CalModify extends SqlUpdate {
        public CalModify(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.userInfo.update"));
           
      		declareParameter(new SqlParameter(Types.VARCHAR));
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
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));		//인사대체키 추가
        }
    }

  	/**
  	 * USER_INFO 삭제
	* @param	UserRegBean	
	* @return	UserRegBean	
	*/	
	public UserRegBean deleteUserInfo(UserRegBean objUserRegBean) {
    	
		try{	
			System.out.println("objUserRegBean.getUSER_ID()"+objUserRegBean.getUSER_ID());
			Object[] values = {objUserRegBean.getUSER_ID()};
			objCalDelete.update(values);			
			
		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
		
		return objUserRegBean;
	}
		
    public class CalDelete extends SqlUpdate {
        public CalDelete(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.UserReg.delete"));
           
            declareParameter(new SqlParameter(Types.VARCHAR));
 
        }
    }

  	/**
  	 * USER_INFO 승인
	* @param	UserRegBean	
	* @return	UserRegBean	
	*/	
	public UserRegBean updateConfirm(UserRegBean objUserRegBean) {
    	
		try{	
			Object[] values = {objUserRegBean.getUSER_ID()};
			objUserConfirm.update(values);			
			
		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
		
		return objUserRegBean;
	}
		
    public class UpdateConfirm extends SqlUpdate {
        public UpdateConfirm(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.UserReg.userConfirm"));
           
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }    

  	/**
  	* 메뉴사용권한 update
	* @param	UserRegBean	
	* @return	UserRegBean	
	*/	
	public void updateAuthority(String user_id, int grade, String userGrade) {
    						
		Object[] values = {new Integer(grade), userGrade, user_id };
					
		objUpdateAuthority.update(values);			
					
	}
		
    public class UpdateAuthority extends SqlUpdate {
        public UpdateAuthority(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.UserReg.updateAuthority"));
           
            declareParameter(new SqlParameter(Types.INTEGER));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
                        
        }
    }    
    
    //구코드 조회
    public List getGuCode() {
    	
    	List a= objGuCodeQuery.execute();
    	try {
			
			System.out.println("크기는="+a.size());
		}catch(Exception err){
			System.out.println("에러1는"+err.toString());
		}
    	return objGuCodeQuery.execute();
	} 
    
    //구코드 조회
    public List getNewGuCode() {
    	
    	List a= objNewGuCodeQuery.execute();
    	try {
			
			System.out.println("크기는="+a.size());
		}catch(Exception err){
			System.out.println("에러1는"+err.toString());
		}
    	return objNewGuCodeQuery.execute();
	} 
    
    protected	class	GuCode	extends	MappingSqlQuery
    {
        protected 	GuCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.DongCode.GuCode"));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	DongCodeBean	Bean	= new DongCodeBean();

        	Bean.setGU_CD(NullCheck(rs.getString("ORG_CD")));
  			Bean.setGU_NM(NullCheck(rs.getString("GU_NM")));

        	return	Bean;
        }
    }
    
    protected	class	NewGuCode	extends	MappingSqlQuery
    {
        protected 	NewGuCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.DongCode.NewGuCode"));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	DongCodeBean	Bean	= new DongCodeBean();

        	Bean.setGU_CD(NullCheck(rs.getString("SIGU_CD")));
  			Bean.setGU_NM(NullCheck(rs.getString("GU_NM")));

        	return	Bean;
        }
    }
    
    //부서코드 조회
    public List getDeptCode(String siguCode) {
    		
		Object[] values = {siguCode};
		System.out.println("siguCode"+siguCode);
    	return objDeptCodeQuery.execute(values);
	} 
    
    protected class DeptCodeList extends MappingSqlQuery
    {
        protected DeptCodeList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.DongCode.DeptCode"));
          	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	DongCodeBean Bean = new DongCodeBean();
        	
        	Bean.setDEPT_CD(NullCheck(rs.getString("DEPT_CD")));
  			Bean.setDEPT_NM(NullCheck(rs.getString("DEPT_NM")));
  			
        	return	Bean;
        }
    }  

    //공지예약 List 조회
    public List retrieveNoticeList(String popup) {
    		
		Object[] values = {};
		
		if(popup.equals("0"))
			return objNoticeListQuery.execute();
		else
			return objNoticeListQuery2.execute();
	} 
    
    protected class NoticeList extends MappingSqlQuery
    {
        protected NoticeList(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.board.NoticeList"));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	BoardBean objBoardBean = new BoardBean();
        	
        	objBoardBean.setBOARD_ID(rs.getInt("BOARD_ID"));
        	objBoardBean.setTITLE(rs.getString("TITLE"));
        	objBoardBean.setREGDATE(rs.getString("REGDATE"));
        	objBoardBean.setCONTENT(rs.getString("CONTENT"));
        	objBoardBean.setNOTICE_TODATE(rs.getString("NOTICE_TODATE"));
        	System.out.println("BOARD_ID:"+rs.getInt("BOARD_ID"));
        	System.out.println("TITLE:"+rs.getString("TITLE"));
        	System.out.println("REGDATE:"+rs.getString("REGDATE"));
        	System.out.println("CONTENT:"+rs.getString("CONTENT"));
  			
        	return	objBoardBean;
        }
    }  
    
    protected class NoticeList2 extends MappingSqlQuery
    {
        protected NoticeList2(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.board.NoticeList2"));
        }
        
        protected Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	BoardBean objBoardBean = new BoardBean();
        	
        	objBoardBean.setBOARD_ID(rs.getInt("BOARD_ID"));
        	objBoardBean.setTITLE(rs.getString("TITLE"));
        	objBoardBean.setREGDATE(rs.getString("REGDATE"));
        	objBoardBean.setCONTENT(rs.getString("CONTENT"));
        	objBoardBean.setNOTICE_TODATE(rs.getString("NOTICE_TODATE"));
        	System.out.println("BOARD_ID:"+rs.getInt("BOARD_ID"));
        	System.out.println("TITLE:"+rs.getString("TITLE"));
        	System.out.println("REGDATE:"+rs.getString("REGDATE"));
        	System.out.println("CONTENT:"+rs.getString("CONTENT"));
  			
        	return	objBoardBean;
        }
    } 
    
    protected	String	NullCheck(String str){
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }

    //사용자ID 중복체크
	public int checkUserId(String userId) {

		Object[] values = {userId}; 
        String sql = getMessageSourceAccessor().getMessage("Querys.user.checkUserId");
 
        return getJdbcTemplate().queryForInt(sql,values);	
	}
	@Override
	public int getPwNum(String id) {
		Object[] values = {id};
		String sql = getMessageSourceAccessor().getMessage("Querys.user.getErrorNum");
		int errorNum = getJdbcTemplate().queryForInt(sql, values);
		return errorNum;
	}
	
	@Override
	public void setPwNum(String id, int count) {
		Object[] values = {count, id};
		setPwNum.update(values);	
		
	}
	protected class SetPwNum extends SqlUpdate {
		public SetPwNum(DataSource dataSource){
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.user.updateErrorNum"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
		}
	}

	@Override
	public String checkPwd(String userId) {
		Object[] values = {userId};
		String sql = getMessageSourceAccessor().getMessage("Querys.user.checkPwd");
		Map pw = getJdbcTemplate().queryForMap(sql, values);
		System.out.println("pw: " + pw.get("PW").toString());
		return pw.get("PW").toString();
	}
	@Override
	public void setNewPwd(UserRegBean userBean) {
		Object[] values = {
				userBean.getPW(),
				userBean.getUSER_ID(),
				userBean.getPW_SHA(),
				userBean.getPW_DATE(),
				userBean.getUSER_ID()
		};
		setNewPwd.update(values);
	}
	
	protected class SetNewPwd extends SqlUpdate {
		public SetNewPwd(DataSource dataSource){
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.user.setNewPwd"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}  
	
	
	@Override
	public void setLoginDate(String todate, String id) {
		Object[] values = {
				todate, id
		};
		setLoginDate.update(values);
	}	
	
	protected class setLoginDate extends SqlUpdate{
		public setLoginDate(DataSource dataSource){
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.user.setLoginDate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
}