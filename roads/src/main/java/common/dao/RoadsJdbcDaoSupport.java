/**
 * �� �ҽ��� Spring �����ӿ�ũ ��ũ�Ͽ��� ����� ���� �ҽ��Դϴ�. 
 * �� �ҽ��� ��� �����ڵ��� �����Ӱ� ���� �� ������ �� �ֽ��ϴ�. 
 * ��, �� �ҽ��� ������� ���ο� ���ø����̼��� ������ ��� ��ó�� ����� �ֽø� �˴ϴ�. 
 */
package main.java.common.dao;


import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import main.java.common.dao.RoadsDataSource;
import javax.sql.*;


public class RoadsJdbcDaoSupport extends JdbcDaoSupport {
    private MessageSourceAccessor messageSourceAccessor;

    private DataSource ds;
    
	public void setRoadsDataSource (RoadsDataSource newDataSource) throws Exception
    {
		
			ds = newDataSource.getDataSource();			
			super.setDataSource(ds);
    }

   protected final DataSource getRoadsDataSource()	
   {
	   return this.ds;
    }

    public void setMessageSourceAccessor(
            MessageSourceAccessor newMessageSourceAccessor) {
        this.messageSourceAccessor = newMessageSourceAccessor;
    }
    
    protected final MessageSourceAccessor getMessageSourceAccessor() {
        return messageSourceAccessor;
    }
}
