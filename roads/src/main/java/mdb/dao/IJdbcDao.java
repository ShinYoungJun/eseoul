package main.java.mdb.dao;

import java.util.List;

import main.java.mdb.model.GapanBaseBean;
import main.java.mdb.model.GapanHeadBean;
import main.java.mdb.model.GapanInfoBean;
import main.java.mdb.model.GapanUserBean;

public interface IJdbcDao {
	public List mdbGapanInfoList(String gu_code,String year);
	public List mdbGapanHeadList(String gu_code,String year);
	public List mdbGapanBaseList(String gu_code,String year);
	public List mdbGapanUserList(String gp_typ);
	
	public int mdbGapanInfoUpdate(GapanInfoBean bean);
	public int mdbGapanHeadUpdate(GapanHeadBean bean);
	public int mdbGapanBaseUpdate(GapanBaseBean bean);
	public int mdbGapanUserUpdate(GapanUserBean bean);
	
	public int mdbGapanInfoInsert(GapanInfoBean bean);
	public int mdbGapanHeadInsert(GapanHeadBean bean);
	public int mdbGapanBaseInsert(GapanBaseBean bean);
	
	public int mdbGapanDelete(GapanInfoBean bean);
	
	public List mdbGapanUserName(String user_id);
	
	public	String	executeCheck_Gapanno(String gapanNo);
	
	public void rollbackInsert();
}
