
package main.java.common.sysConnect.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;


public class SysConnectMapDao {

    //	연계이력 등록
    protected	class	Sys_Connect_Info	extends	SqlUpdate
    {
    	protected	Sys_Connect_Info(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.system.Sys_Connect_Info"));
         
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
}
