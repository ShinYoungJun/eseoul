package main.java.common.util;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Debug {

	private static Logger mLogger = LoggerFactory.getLogger(Debug.class);
	
	public static void printStacks() {
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		mLogger.trace("Start print stack");
		for (int i = 1; i < stacks.length; i++) {
			mLogger.trace(stacks[i].toString());
		}
		mLogger.trace("End   print stack");


	}

	public static void printSql(Log logger, String sql, Object[] values) {
		logger.warn("query :::: " + toQueryString(sql, values));
	}
	
	public static String toQueryString(String sql, Object[] values) {
		String query = sql;
		for (Object item : values) {
			if (item instanceof String) {
				query = query.replaceFirst("\\?", (String)item);				
			} else if (item instanceof Integer) {
				query = query.replaceFirst("\\?", ((Integer)item).toString());
			}
		}
//		mLogger.error("query :::: " + query);
		return query;
	}
	
}
