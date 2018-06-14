package main.java.mdb.service;

import java.util.List;

import main.java.mdb.dao.IJdbcDao;
import main.java.mdb.model.GapanBaseBean;
import main.java.mdb.model.GapanHeadBean;
import main.java.mdb.model.GapanInfoBean;
import main.java.mdb.model.GapanUserBean;

public class JdbcService implements IJdbcService{

	private IJdbcDao iJdbcDao = null;
	
	public void setJdbcDao(IJdbcDao jdbcDao)
	{
	    this.iJdbcDao = jdbcDao;
	}
	
	//리스트 
	public List mdbGapanInfoList(String gu_code,String year){
		return iJdbcDao.mdbGapanInfoList(gu_code,year);
	}
	
	public List mdbGapanHeadList(String gu_code,String year){
		return iJdbcDao.mdbGapanHeadList(gu_code,year);
	}
	
	public List mdbGapanBaseList(String gu_code,String year){
		return iJdbcDao.mdbGapanBaseList(gu_code,year);
	}
	public List mdbGapanUserList(String gp_typ){
		return iJdbcDao.mdbGapanUserList(gp_typ);
	}
	
	//업데이트
	public int mdbGapanInfoUpdate(GapanInfoBean bean){
		return iJdbcDao.mdbGapanInfoUpdate(bean);
	}
	
	public int mdbGapanHeadUpdate(GapanHeadBean bean){
		return iJdbcDao.mdbGapanHeadUpdate(bean);
	}
	
	public int mdbGapanBaseUpdate(GapanBaseBean bean){
		return iJdbcDao.mdbGapanBaseUpdate(bean);
	}
	
	public int mdbGapanUserUpdate(GapanUserBean bean){
		return iJdbcDao.mdbGapanUserUpdate(bean);
	}
	
	//삽입
	public int mdbGapanInfoInsert(GapanInfoBean bean){
		return iJdbcDao.mdbGapanInfoInsert(bean);
	}
	public int mdbGapanHeadInsert(GapanHeadBean bean){
		return iJdbcDao.mdbGapanHeadInsert(bean);
		
	}
	public int mdbGapanBaseInsert(GapanBaseBean bean){
		return iJdbcDao.mdbGapanBaseInsert(bean);
	}
	
	
	
	public	String	executeCheck_Gapanno(String gapanNo){
		return iJdbcDao.executeCheck_Gapanno(gapanNo);
	}
	
	public int mdbGapanDelete(GapanInfoBean bean){
		return iJdbcDao.mdbGapanDelete(bean);
	}
	
	public List mdbGapanUserName(String user_id){
		return iJdbcDao.mdbGapanUserName(user_id);
	}
	
	public void rollbackInsert(){
		
	}
	
}
