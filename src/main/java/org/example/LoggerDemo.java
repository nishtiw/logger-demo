package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {

    // Get the Logger from the log manager which corresponds
    // to the given name <Logger.GLOBAL_LOGGER_NAME here>
    // static so that it is linked to the class and not to
    // a particular log instance because LogManager is universal
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void makeSomeLog() {

        // A log of INFO level with the message
        LOGGER.log(Level.INFO, "My first log message on the console");
    }
}
