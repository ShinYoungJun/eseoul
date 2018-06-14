

/*********************************************************************************************************
 				*�����ۼ��� : 2006.06.
				*�����ۼ��� : ������
				*�ֿ�ó������ : 
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/


package main.java.common.dao;

import java.io.Serializable;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.sql.SQLException;
import javax.naming.NamingException;
import main.java.common.util.Globals;


public class RoadsDataSource implements Serializable{
	
	public RoadsDataSource() {

	}

	public DataSource getDataSource()

        throws NamingException, SQLException {

		Context envCtx = null;
		DataSource ds = null;

	    try {
	        envCtx = new InitialContext();        
	        ds = (DataSource) envCtx.lookup(Globals.JDBCENVIRONMENT_EXPORTNAME);
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
        return ds;
    }
}