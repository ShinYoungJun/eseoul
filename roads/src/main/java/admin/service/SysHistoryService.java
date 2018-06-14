package main.java.admin.service;

import java.util.List;
import main.java.admin.dao.ISysHistoryDao;

public class SysHistoryService implements ISysHistoryService {

	private ISysHistoryDao objSysHistoryDao = null;

	public void setSysHistoryDao(ISysHistoryDao newSysHistoryDao) {
		this.objSysHistoryDao = newSysHistoryDao;
	}

	public List retrieveSysHistoryList(int intCurrentPage,int intCountPerPage, String section,String fromDate,String toDate,String userName,String eventType ) {
	
		return objSysHistoryDao.retrieveSysHistoryList(intCurrentPage, intCountPerPage,section, fromDate, toDate, userName, eventType ); 
	}

	public int getTotalCount(String section, String fromDate, String toDate, String userName, String eventType) {
		
		return objSysHistoryDao.getTotalCount(section, fromDate, toDate, userName, eventType ); 
	}
	
	public List retrieveSysConnectList(int intCurrentPage,int intCountPerPage, String systemSet,String fromDate,String toDate,String userName,String result ) {
		
		return objSysHistoryDao.retrieveSysConnectList(intCurrentPage, intCountPerPage, systemSet, fromDate, toDate, userName, result ); 
	}

	public int getTotalCount1(String systemSet, String fromDate, String toDate, String userName, String result) {
		
		return objSysHistoryDao.getTotalCount1(systemSet, fromDate, toDate, userName, result ); 
	}	
}