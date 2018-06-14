package main.java.common.dao;


import main.java.common.model.BoardFileBean;
import main.java.common.dao.RoadsJdbcDaoSupport;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.sql.DataSource;
import java.util.Iterator;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.BatchSqlUpdate;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class BoardFileDao extends RoadsJdbcDaoSupport implements IBoardFileDao {

    private GetBoardFilesQuery objGetBoardFilesQuery = null;
    private GetBoardFileByFileNoQuery objGetBoardFileByFileNoQuery = null;
	private GetBoardFileQuery objGetBoardFileQuery = null;	
	private DeleteBoardFilesQuery objDeleteBoardFilesQuery = null;
	private DeleteBoardFileQuery objDeleteBoardFileQuery = null;
	
    protected void initDao() throws Exception {
        super.initDao();
        
        objDeleteBoardFilesQuery = new DeleteBoardFilesQuery(getDataSource());       
        objDeleteBoardFileQuery = new DeleteBoardFileQuery(getDataSource());    
        objGetBoardFilesQuery = new GetBoardFilesQuery(getDataSource());      
        objGetBoardFileQuery  = new GetBoardFileQuery(getDataSource());        
        objGetBoardFileByFileNoQuery  = new GetBoardFileByFileNoQuery(getDataSource());
    }
    
    /**
  	 * �����Խ��� ���� ���� ����
	 * @param	FreeBoardBean	objFreeBoardBean
	 * @return	ó���������� 
	*/
 	public boolean createBoardFiles(int intNum, List objBoardFileList)	throws DataAccessException {

		int intResult = 0;

        BatchSqlUpdate objBoardFileInsert = new BatchSqlUpdate(getDataSource(), getMessageSourceAccessor().getMessage("Querys.common.boardfile.create"));
        objBoardFileInsert.declareParameter(new SqlParameter("REL_NM",Types.VARCHAR));
        objBoardFileInsert.declareParameter(new SqlParameter("NOTICE_MGT_SN",Types.INTEGER));
        objBoardFileInsert.declareParameter(new SqlParameter("FILE_MG",Types.BIGINT));
        objBoardFileInsert.declareParameter(new SqlParameter("FILE_NM",Types.VARCHAR));
        objBoardFileInsert.declareParameter(new SqlParameter("FILE_SR",Types.VARCHAR));
        objBoardFileInsert.declareParameter(new SqlParameter("TEMP_FILE_NM",Types.VARCHAR));        
        objBoardFileInsert.compile();
        
        Iterator boardFileIter = objBoardFileList.iterator();
        
        while (boardFileIter.hasNext()) {
            BoardFileBean objBoardFileBean = (BoardFileBean) boardFileIter.next();
  
            objBoardFileInsert.update(new Object[] {objBoardFileBean.getBoardID(), new Integer(intNum), 
            		new Long(objBoardFileBean.getFileSize()),
					objBoardFileBean.getFileName(), objBoardFileBean.getContentType(), objBoardFileBean.getTempFileName()});
        }
        int result[] = objBoardFileInsert.flush();

        for (int i = 0; i < result.length; i++) {
        	intResult += result[i];
        }

		if (intResult != 0)
			return true;
		else
			return false;
	}
 	
 	 /**
  	 * ���� ���� ����
	 * @param	FreeBoardBean	objFreeBoardBean
	 * @return	ó���������� 
	*/
 	public boolean createBoardFile(int intNum, BoardFileBean objBoardFileBean)	throws DataAccessException {

		int intResult = 0;

		if(objBoardFileBean != null){
	        BatchSqlUpdate objBoardFileInsert = new BatchSqlUpdate(getDataSource(), getMessageSourceAccessor().getMessage("Querys.common.boardfile.create"));
	        objBoardFileInsert.declareParameter(new SqlParameter("REL_NM",Types.VARCHAR));
	        objBoardFileInsert.declareParameter(new SqlParameter("NOTICE_MGT_SN",Types.INTEGER));
	        objBoardFileInsert.declareParameter(new SqlParameter("FILE_MG",Types.BIGINT));
	        objBoardFileInsert.declareParameter(new SqlParameter("FILE_NM",Types.VARCHAR));
	        objBoardFileInsert.declareParameter(new SqlParameter("FILE_SR",Types.VARCHAR));
	        objBoardFileInsert.declareParameter(new SqlParameter("TEMP_FILE_NM",Types.VARCHAR));       
	        objBoardFileInsert.compile();
	        
	
	        objBoardFileInsert.update(new Object[] {objBoardFileBean.getBoardID(), new Integer(intNum), 
	        			new Long(objBoardFileBean.getFileSize()),
						objBoardFileBean.getFileName(), objBoardFileBean.getContentType(), objBoardFileBean.getTempFileName()});
	
	        int result[] = objBoardFileInsert.flush();
	        
	        for (int i = 0; i < result.length; i++) {
	        	intResult += result[i];
	        }
		}
		
		if (intResult != 0)
			return true;
		else
			return false;
	} 	
 
  	/**
  	 * ���޹��� ���� ��ȣ�� �ش��ϴ� ���������� ��ȸ�� ����
	* @param	int intFileNo	���� ��ȣ
	* @return	BoardFileBean	��ȸ�� ����List
	*/
	public BoardFileBean getBoardFile(int intFileNo) throws DataAccessException {
		
		BoardFileBean objBoardFileBean = null;
		objBoardFileBean = (BoardFileBean) objGetBoardFileByFileNoQuery.findObject(intFileNo);
		return objBoardFileBean;
	}
	
  	/**
  	 * ���޹��� �����ȣ�� �Խù���ȣ�� �ش��ϴ� ���������� ��ȸ�� ����
	* @param	
	* @return	BoardFileBean	��ȸ�� ����List
	*/
	public BoardFileBean getBoardFile(String strBoardNo, int intNum) throws DataAccessException {
		
		BoardFileBean objBoardFileBean = null;
		Object[] values = {strBoardNo, new Integer(intNum)};
		objBoardFileBean = (BoardFileBean) objGetBoardFileQuery.findObject(values);
		return objBoardFileBean;
	}
		
	/**
  	 * ��ȣ�� �ش��ϴ� �Խù��� ������ �����Ѵ�
	 * @param	int intNum	�Խù���ȣ
	 * @return	boolean	��� ���� ���� 
	*/
	public  boolean deleteBoardFiles(String strBoardNo, int intNum)  throws DataAccessException {
		Object[] values = {strBoardNo, new Integer(intNum)};	
    	int result = objDeleteBoardFilesQuery.update(values);
    	if (result == -1)
			return false;
		return true;
	}
	
	/**
  	 * ��ȣ�� �ش��ϴ� �Խù��� ������ �����Ѵ�
	 * @param	int intFileNo	���Ϲ�ȣ
	 * @return	boolean	��� ���� ���� 
	*/
	public  boolean deleteBoardFile(int intFileNo) throws DataAccessException {
    	int result = objDeleteBoardFileQuery.update(intFileNo);
		if (result == -1)
			return false;
		return true;
	}

 	/**
  	 * ���޹��� �Խù� ��ȣ�� �ش��ϴ� ���ϸ���Ʈ�� ��ȸ�� ����
	* @param	int intNum	�Խù� ��ȣ
	* @return	List	��ȸ�� ����List
	*/
	public List getBoardFiles(String strBoardNo, int intNum){
		Object[] values = {strBoardNo, new Integer(intNum)};
		return objGetBoardFilesQuery.execute(values);
	}	
	
    protected class GetBoardFilesQuery extends MappingSqlQuery {
        protected GetBoardFilesQuery(DataSource ds) {
            super(ds, getMessageSourceAccessor().getMessage("Querys.common.boardfile.selectall"));
            
            declareParameter(new SqlParameter("REL_NM",Types.VARCHAR));
            declareParameter(new SqlParameter("NOTICE_MGT_SN",Types.INTEGER));
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	BoardFileBean objBoardFileBean = new BoardFileBean();
        	
			objBoardFileBean.setBoardID(rs.getString("REL_NM"));
			objBoardFileBean.setNum(rs.getInt("NOTICE_MGT_SN"));
			objBoardFileBean.setFileNo(rs.getInt("FILE_MGT_SN"));
			objBoardFileBean.setFileSize(rs.getLong("FILE_MG"));
			objBoardFileBean.setFileName(rs.getString("FILE_NM"));
			objBoardFileBean.setContentType(rs.getString("FILE_SR"));
			objBoardFileBean.setTempFileName(rs.getString("TEMP_FILE_NM"));		
            return objBoardFileBean;
        }
    } 
	
    protected class GetBoardFileQuery extends MappingSqlQuery {
        protected GetBoardFileQuery(DataSource ds) {
            super(ds, getMessageSourceAccessor().getMessage("Querys.common.boardfile.selectall"));

            declareParameter(new SqlParameter("REL_NM",Types.VARCHAR));
            declareParameter(new SqlParameter("NOTICE_MGT_SN",Types.INTEGER));
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	BoardFileBean objBoardFileBean = new BoardFileBean();

        	objBoardFileBean.setBoardID(rs.getString("REL_NM"));
			objBoardFileBean.setNum(rs.getInt("NOTICE_MGT_SN"));
			objBoardFileBean.setFileNo(rs.getInt("FILE_MGT_SN"));
			objBoardFileBean.setFileSize(rs.getLong("FILE_MG"));
			objBoardFileBean.setFileName(rs.getString("FILE_NM"));
			objBoardFileBean.setContentType(rs.getString("FILE_SR"));
			objBoardFileBean.setTempFileName(rs.getString("TEMP_FILE_NM"));
            return objBoardFileBean;
        }
    }        
    
	protected class GetBoardFileByFileNoQuery extends MappingSqlQuery {
	    protected GetBoardFileByFileNoQuery(DataSource ds) {
	        super(ds, getMessageSourceAccessor().getMessage("Querys.common.boardfile.selectbyno"));
	        
	        declareParameter(new SqlParameter("FILE_MGT_SN", Types.INTEGER));
	    }

	    protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
	    	BoardFileBean objBoardFileBean = new BoardFileBean();
			
	    	objBoardFileBean.setBoardID(rs.getString("REL_NM"));
			objBoardFileBean.setNum(rs.getInt("NOTICE_MGT_SN"));
			objBoardFileBean.setFileNo(rs.getInt("FILE_MGT_SN"));
			objBoardFileBean.setFileSize(rs.getLong("FILE_MG"));
			objBoardFileBean.setFileName(rs.getString("FILE_NM"));
			objBoardFileBean.setContentType(rs.getString("FILE_SR"));
			objBoardFileBean.setTempFileName(rs.getString("TEMP_FILE_NM"));         	
	        return objBoardFileBean;
	    }
	} 
    
	protected class DeleteBoardFileQuery extends SqlUpdate {
		protected DeleteBoardFileQuery(DataSource dataSource) {
            super(dataSource, getMessageSourceAccessor().getMessage("Querys.common.boardfile.deletebyno"));

            declareParameter(new SqlParameter("FILE_MGT_SN", Types.INTEGER));
          }
    }	      
    
    
	protected class DeleteBoardFilesQuery extends SqlUpdate {
		protected DeleteBoardFilesQuery(DataSource dataSource) {
            super(dataSource, getMessageSourceAccessor().getMessage("Querys.common.boardfile.deleteall"));

            declareParameter(new SqlParameter("REL_NM", Types.VARCHAR));
            declareParameter(new SqlParameter("NOTICE_MGT_SN", Types.INTEGER));
        }
    }
}
