package com.si.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HMILogger {

	//private static final String LOG_PATH = "logs/log4j.xml";
	// public static final org.apache.log4j.Logger logger =
	// org.apache.log4j.Logger.getLogger(HMILogger.class);

	private static final Logger LOGGER = LogManager.getLogger(HMILogger.class.getName());

	public static void trace(Exception e) {

		LOGGER.trace(getLoggerMessage(e));
	}

	public static void debug(Exception e) {
		LOGGER.debug(getLoggerMessage(e));
	}

	public static void info(Exception e) {
		// DOMConfigurator.configure(LOG_PATH);
		LOGGER.info(getLoggerMessage(e));
	}

	public static void warn(Exception e) {
		LOGGER.warn(getLoggerMessage(e));
	}

	public static void error(Exception e) {
		// DOMConfigurator.configure("logs/log4j.xml");
		LOGGER.error(getLoggerMessage(e));
	}

	public static void fatal(Exception e) {
		LOGGER.fatal(getLoggerMessage(e));
	}

	private static String getLoggerMessage(Exception e) {
		String loggerMessage = "Exception occurred in " + e.getStackTrace()[0].getClassName() + " at line: "
				+ e.getStackTrace()[0].getLineNumber() + " and the exception type is " + e.getClass();
		return loggerMessage;
	}
}
