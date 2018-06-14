package main.java.common.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import main.java.gapan.jumyong.model.jumyongBean;

public class BeanUtil {

	/**
	 * ResultSet �� Bean��ü�� �ʵ� ����.
	 * setter �޼ҵ� ���� set[FIELD_NAME]�̰� param Ÿ���� String�̾�� �Ѵ�.
	 * @param instance
	 * @param rs
	 * @throws SQLException
	 */
	public static void mappingBean(Object instance, ResultSet rs) throws SQLException {
		
		ResultSetMetaData meta = rs.getMetaData();
        int colLen = meta.getColumnCount();
		for (int i = 1; i <= colLen; i++) {

			try {
		    	String name = meta.getColumnName(i);
				Method method = instance.getClass().getMethod("set" + name, String.class);
//				Class[] types = method.getParameterTypes();
//					logger.info("method.invoke() ::: " + method.getName());
		    	method.invoke(instance, rs.getString(name));
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			
		}

	}
}
