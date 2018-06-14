/**
 * 이 소스는 Spring 프레임워크 워크북에서 사용한 예제 소스입니다. 
 * 이 소스는 모든 개발자들이 자유롭게 수정 및 배포할 수 있습니다. 
 * 단, 이 소스를 기반으로 새로운 애플리케이션을 개발할 경우 출처를 명시해 주시면 됩니다. 
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
