package main.java.admin.service;

import java.util.List;

import main.java.admin.model.UserRegBean;

public interface ISysHistoryService {

	public List retrieveSysHistoryList(int intCurrentPage,int intCountPerPage, String section,String fromDate,String toDate,String userName,String eventType );
	public int getTotalCount(String section,String fromDate,String toDate,String userName,String eventType );
	public List retrieveSysConnectList(int intCurrentPage,int intCountPerPage, String systemSet,String fromDate,String toDate,String userName,String result );
	public int getTotalCount1(String systemSet, String fromDate, String toDate, String userName, String result);
}