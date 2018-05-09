package com.si.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {

	private static Logger LOGGER = LogManager.getLogger(LoggerUtil.class.getName());
	/**
	 * prevent any class to make instance from the LoggerUtil class.
	 */
	private LoggerUtil() {
	}
	
	public static void setLogger(String loggerName) {
		LOGGER = LogManager.getLogger(loggerName);
	}

	public static void trace(String message) {
		LOGGER.trace(message);
	}

	public static void debug(String message) {
		LOGGER.debug(message);

	}

	public static void info(String message) {
		LOGGER.info(message);
	}

	public static void warn(String message) {
		LOGGER.warn(message);
	}

	public static void error(Exception e) {
		LOGGER.error(getLoggerMessage(e));
	}

	public static void fatal(String message) {
		LOGGER.fatal(message);
	}

	private static String getLoggerMessage(Exception e) {
		String loggerMessage = "Exception occurred in " + e.getStackTrace()[0].getClassName() + " at line: "
				+ e.getStackTrace()[0].getLineNumber() + " and the exception type is " + e.getClass();
		return loggerMessage;
	}
}
