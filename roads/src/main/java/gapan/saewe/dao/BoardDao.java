package main.java.gapan.saewe.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.admin.dao.BoardDao.CalInsert;
import main.java.admin.model.BoardBean;
import main.java.common.dao.RoadsJdbcDaoSupport;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class BoardDao extends RoadsJdbcDaoSupport implements IBoardDao {

	private RetrieveBoardListQuery objRetrieveQuery;
	private NoticeBoardListQuery objNoticeBoardListQuery;
	private CalInsert objCalInsert;	
	private CalModify objCalModify;
	private CalDelete objCalDelete;
	private OracleLobHandler oracleLobHandler = null;
	private BoardDetailQuery objBoardDetailQuery;

	protected void initDao() throws Exception {
		super.initDao();
		
		oracleLobHandler = new OracleLobHandler();
		objRetrieveQuery = new RetrieveBoardListQuery(getDataSource());
		objNoticeBoardListQuery = new NoticeBoardListQuery(getDataSource());
		objCalInsert = new CalInsert(getDataSource());
		objCalModify = new CalModify(getDataSource());
		objCalDelete = new CalDelete(getDataSource());
		objBoardDetailQuery  = new BoardDetailQuery(getDataSource());  
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
	public List retrieveBoardList(int intCurrentPage, int intCountPerPage,String gubun,String content,String fromDate,String toDate,String openYN) {

		String strContent = "%";
		String strSubject = "%";
		String strRegName = "%";
		String strFileName = "%";
		
		System.out.println("main.java.gapan.saewe.dao.BoardDao.retrieveBoardList");
	
		if(gubun.equals("1"))
			strContent = "%"+content+"%";
		else if(gubun.equals("2"))
			strSubject = "%"+content+"%";
		else if(gubun.equals("3"))
			strRegName = "%"+content+"%";
		else if(gubun.equals("4"))
			strFileName = "%"+content+"%";
		else;
				
		if(openYN.equals("")){
			openYN = "%";
		}	
		
		if(fromDate.equals("")){
			fromDate = "19000101";
		}
		
		if(toDate.equals("")){
			toDate = "99999999";
		}
			
		Object[] values = {strContent, strSubject, strRegName, fromDate, toDate, openYN, strFileName, new Integer(intCurrentPage),new Integer(intCountPerPage),new Integer(intCountPerPage)};
					
		return objRetrieveQuery.execute(values); 
	}

	protected class RetrieveBoardListQuery extends MappingSqlQuery {
		protected RetrieveBoardListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.board.select"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			System.out.println("RetrieveBoardListQuery::Querys.board.select");
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			BoardBean objBoardBean = new BoardBean();

			objBoardBean.setTITLE(rs.getString("TITLE"));
			objBoardBean.setUSER_ID(rs.getString("USER_ID"));
			objBoardBean.setREGDATE(rs.getString("REGDATE"));
			objBoardBean.setPUBLIC_YN(rs.getString("PUBLIC_YN"));
			objBoardBean.setPUBLIC_NM(rs.getString("PUBLIC_NM"));
			objBoardBean.setFILE_NAME(rs.getString("FILE_NAME"));
			objBoardBean.setBOARD_ID(rs.getInt("BOARD_ID"));
			objBoardBean.setNOTICE_FROMDATE(rs.getString("NOTICE_FROMDATE"));
			objBoardBean.setNOTICE_TODATE(rs.getString("NOTICE_TODATE"));
			
			System.out.println("RetrieveBoardListQuery::Querys.board.select");
			
			return objBoardBean;
		}
	}
	
	/**
	 * 공지사항 리스트를 조회해 List 형태로 리턴
	 * 
	 * @param int
	 *            intCurPage 현재 조회할 페이지 번호
	 * @param int
	 *            intCount 한페이지에 조회될 게시물 수
	 * @return List 게시물 리스트
	 */
	public List noticeBoardList(int intCurrentPage, int intCountPerPage,String gubun,String content,String fromDate,String toDate,String openYN) {

		String strContent = "%";
		String strSubject = "%";
		String strRegName = "%";
		String strFileName = "%";
	
		if(gubun.equals("1"))
			strContent = "%"+content+"%";
		else if(gubun.equals("2"))
			strSubject = "%"+content+"%";
		else if(gubun.equals("3"))
			strRegName = "%"+content+"%";
		else if(gubun.equals("4"))
			strFileName = "%"+content+"%";
		else;
				
		if(openYN.equals("")){
			openYN = "%";
		}	
		
		if(fromDate.equals("")){
			fromDate = "19000101";
		}
		
		if(toDate.equals("")){
			toDate = "99999999";
		}
			
		Object[] values = {strContent, strSubject, strRegName, fromDate, toDate, openYN, strFileName, new Integer(intCurrentPage),new Integer(intCountPerPage),new Integer(intCountPerPage)};
					
		return objNoticeBoardListQuery.execute(values); 
	}

	protected class NoticeBoardListQuery extends MappingSqlQuery {
		protected NoticeBoardListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.board.select"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			BoardBean objBoardBean = new BoardBean();

			objBoardBean.setTITLE(rs.getString("TITLE"));
			objBoardBean.setUSER_ID(rs.getString("USER_ID"));
			objBoardBean.setREGDATE(rs.getString("REGDATE"));
			objBoardBean.setPUBLIC_YN(rs.getString("PUBLIC_YN"));
			objBoardBean.setPUBLIC_NM(rs.getString("PUBLIC_NM"));
			objBoardBean.setFILE_NAME(rs.getString("FILE_NAME"));
			objBoardBean.setBOARD_ID(rs.getInt("BOARD_ID"));
			objBoardBean.setNOTICE_FROMDATE(rs.getString("NOTICE_FROMDATE"));
			objBoardBean.setNOTICE_TODATE(rs.getString("NOTICE_TODATE"));
			
			return objBoardBean;
		}
	}	

	public BoardBean insertBoard(BoardBean objBoardBean) {
    	
		try{	
			//system.out.println("?="+objBoardBean.getTITLE());
			
			Object[] values = {		
					objBoardBean.getTITLE()
					, objBoardBean.getUSER_ID()
					, objBoardBean.getPUBLIC_YN()
					, objBoardBean.getCONTENT()
					, objBoardBean.getFILE_NAME()
					, objBoardBean.getNOTICE_FROMDATE()
					, objBoardBean.getNOTICE_TODATE()};
			objCalInsert.update(values);	
	
		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
		
		return objBoardBean;
	}
	
    public class CalInsert extends SqlUpdate  {
        public CalInsert(DataSource dataSource) throws SQLException{

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.BoardReg.insert"));
           
            declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR)); 
      		declareParameter(new SqlParameter(Types.VARCHAR)); 
      		declareParameter(new SqlParameter(Types.VARCHAR)); 
      		declareParameter(new SqlParameter(Types.VARCHAR)); 
        }
    }
  	/**
  	 * 전달받은 게시물 번호에 해당하는 게시물을 조회해 리턴
	* @param	int seq	게시물 번호
	* @return	BoardBean	조회된 게시물 bean
	*/
	public BoardBean getBoardDetail(int seq) {

		BoardBean objBoardBean = null;
		objBoardBean = (BoardBean) objBoardDetailQuery.findObject(seq);
		
		return objBoardBean;
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
	protected class BoardDetailQuery extends MappingSqlQuery {
		protected BoardDetailQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.Board.selectbySeq"));
			
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			BoardBean objBoardBean = new BoardBean();

			objBoardBean.setTITLE(rs.getString("TITLE"));
			objBoardBean.setUSER_ID(rs.getString("USER_ID"));
			objBoardBean.setREGDATE(rs.getString("REGDATE"));
			objBoardBean.setPUBLIC_YN(rs.getString("PUBLIC_YN"));
			objBoardBean.setCONTENT(rs.getString("CONTENT"));
			objBoardBean.setFILE_NAME(rs.getString("FILE_NAME"));
			objBoardBean.setBOARD_ID(rs.getInt("BOARD_ID"));
			objBoardBean.setNOTICE_FROMDATE(rs.getString("NOTICE_FROMDATE"));
			objBoardBean.setNOTICE_TODATE(rs.getString("NOTICE_TODATE"));
			
			return objBoardBean;
		}
	}

  	/**
  	* 게시글 수정
	* @param	objBoardBean
	* @return	objBoardBean
	*/
	public BoardBean modify(BoardBean objBoardBean) {
    	
		try{	
			//system.out.println("objBoardBean"+objBoardBean);
			Object[] values = {		
					objBoardBean.getTITLE()
					, objBoardBean.getUSER_ID()
					, objBoardBean.getPUBLIC_YN()
					, objBoardBean.getCONTENT()
					, objBoardBean.getFILE_NAME()
					, objBoardBean.getNOTICE_FROMDATE()
					, objBoardBean.getNOTICE_TODATE()
					, new Integer(objBoardBean.getBOARD_ID())};
			objCalModify.update(values);	
			
			
		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
		
		return objBoardBean;
	}
		
    public class CalModify extends SqlUpdate {
        public CalModify(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.BoardReg.modify"));
           
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

	public BoardBean delete(BoardBean objBoardBean) {
    	
		try{	
			//system.out.println("일련번호"+objBoardBean.getBOARD_ID());
			Object[] values = {new Integer(objBoardBean.getBOARD_ID())};
			objCalDelete.update(values);			
			
		} catch (Exception e) {
			System.out.println(e.toString());

			e.printStackTrace();
		}
		
		return objBoardBean;
	}
		
    public class CalDelete extends SqlUpdate {
        public CalDelete(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.BoardReg.delete"));
           
            declareParameter(new SqlParameter(Types.VARCHAR));
 
        }
    }

  	/**
  	 * 공고 전체 게시물수를 리턴한다
	 * @return	int	전체 게시물 수 
	*/
	public int getBoardTotalCount(String gubun,String content,String fromDate,String toDate,String certYN){
		
		String strContent = "%";
		String strSubject = "%";
		String strRegName = "%";
		String strFileName = "%";
	
		if(gubun.equals("1"))
			strContent = "%"+content+"%";
		else if(gubun.equals("2"))
			strSubject = "%"+content+"%";
		else if(gubun.equals("3"))
			strRegName = "%"+content+"%";
		else if(gubun.equals("4"))
			strFileName = "%"+content+"%";
		else;
				
		if(certYN.equals("")){
			certYN = "%";
		}	
		
		if(fromDate.equals("")){
			fromDate = "19000101";
		}
		
		if(toDate.equals("")){
			toDate = "99999999";
		}
		Object[] values = {strContent, strSubject, strRegName, strFileName, fromDate, toDate, certYN}; 
		
        String sql = getMessageSourceAccessor().getMessage("Querys.board.count");
        //system.out.println("sql"+sql);
        return getJdbcTemplate().queryForInt(sql,values);		
	}
}