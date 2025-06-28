// Class for manage exception and log that using logger
package exception;

import java.util.logging.*;

public class ExceptionHandler {
    private static final Logger logger = Logger.getLogger("DentalCareLogger");
    static {
        try {
            LogManager.getLogManager().reset();
            logger.setLevel(Level.ALL);
            ConsoleHandler ch = new ConsoleHandler();
            ch.setLevel(Level.INFO);
            logger.addHandler(ch);
            FileHandler fh = new FileHandler("logs/app.log", true);
            fh.setLevel(Level.ALL);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        } catch (Exception e) {
            System.err.println("Logger init error: " + e.getMessage());
        }
    }
    public static void log(Exception e, String contesto) {
        logger.log(Level.SEVERE, contesto + ": " + e.getMessage(), e);
    }
}
