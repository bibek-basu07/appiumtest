package com.app.ebay.logger;

import java.io.IOException;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
   Log class provides all the methods to show and save the logs in LogFile.txt of each run.
 */
public class Log {
    private static final Logger LOGGER = Logger.getLogger("logger");
    private static PatternLayout layout = new PatternLayout("%d{dd MMM yyyy HH:mm:ss} %5p %c{1} - %m%n");
    private static FileAppender appender;
    private static ConsoleAppender consoleAppender;
    static {
        try {
            consoleAppender = new ConsoleAppender(layout, "System.out");
            appender = new FileAppender(layout, "LogFile.txt", true);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }
     /**
	     logError method to display errors in log
     */
    public static void logError(String className, String methodName, String exception) {
        LOGGER.addAppender(appender);
        LOGGER.setLevel((Level) Level.INFO);
        LOGGER.info("ClassName :" + className);
        LOGGER.info("MethodName :" + methodName);
        LOGGER.info("Exception :" + exception);
        LOGGER.info("--------------------------------------------------------------");
    }
    /**
       info method to display information in logs
     */
    public static void info(String message) {
        consoleAppender.setName("Console");
        LOGGER.addAppender(consoleAppender);
        LOGGER.addAppender(appender);
        LOGGER.setLevel((Level) Level.INFO);
        LOGGER.info(message);
    }
}