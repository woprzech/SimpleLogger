package pl.kody.ekstremalne;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wojtek Przechodzen.
 */
public class SimpleLoggerFactory {

    private static Map<String, SimpleLogger> loggers = new HashMap<>();

    public static SimpleLogger getLogger(String name) {
        if (loggers.containsKey(name)) {
            return loggers.get(name);
        } else {
            SimpleLogger logger = new SimpleLogger(name);
            loggers.put(name, logger);
            return logger;
        }
    }

}
