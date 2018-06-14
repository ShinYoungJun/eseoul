package main.java.admin.dao;

import java.util.List;

public interface ISysHistoryDao {

	public List retrieveSysHistoryList(int intCurrentPage,int intCountPerPage, String section,String fromDate,String toDate,String userId,String eventType );
	public int getTotalCount(String section, String fromDate, String toDate, String userName, String eventType);
	public List retrieveSysConnectList(int intCurrentPage,int intCountPerPage, String systemSet,String fromDate,String toDate,String userName,String result );
	public int getTotalCount1(String systemSet, String fromDate, String toDate, String userName, String result);
}
