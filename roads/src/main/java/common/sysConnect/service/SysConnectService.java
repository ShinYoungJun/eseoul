
package main.java.common.sysConnect.service;

import main.java.common.sysConnect.dao.ISysConnectDao;

public class SysConnectService	implements	ISysConnectService{
	
	private ISysConnectDao iSysConnectDao = null;
	
	public void setSysConnectDao(ISysConnectDao sysConnectDao) {
		this.iSysConnectDao = sysConnectDao;
	}
	
	public boolean Sys_Connect_Info(String admin_no, String system_set, String user_id, String work_type,String result)
	{	
		return iSysConnectDao.Sys_Connect_Info(admin_no,system_set,user_id,work_type,result);
	}
}
 