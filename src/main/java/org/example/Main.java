package org.example;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        LoggerDemo loggerDemo = new LoggerDemo();
        loggerDemo.makeSomeLog();

        // logManager now contains a reference to the log manager.
        LogManager logManager = LogManager.getLogManager();

        // Getting the global application level logger from the Java Log Manager
        Logger log = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);

        // Create a log message to be displayed. The message has a level of Info.
        log.log(Level.INFO, "Another log message");
    }
}