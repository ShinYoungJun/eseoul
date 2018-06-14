
package main.java.common.sysConnect.dao;

import main.java.common.dao.RoadsJdbcDaoSupport;


public class SysConnectDao	extends RoadsJdbcDaoSupport	implements	ISysConnectDao{
	
	private	SysConnectMapDao	sysConnectMap	= new SysConnectMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}

    //	연계이력 등록
    public	boolean	Sys_Connect_Info(String admin_no, String system_set, String user_id, String work_type,String result)
	{
    	SysConnectMapDao.Sys_Connect_Info	sys_Connect_Info	= sysConnectMap.new Sys_Connect_Info(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
	    	Object[] values = {
	    	    admin_no,
	    	    system_set,
    			user_id,
    			work_type,
    			result
	    	};

	    	sys_Connect_Info.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}	
}
