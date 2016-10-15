package pl.kody.ekstremalne;

import static pl.kody.ekstremalne.utils.MessageBuilder.build;

/**
 * Created by Wojtek Przechodzen.
 */
public class SimpleLogger {
    private String name;

    SimpleLogger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void debug(String msg, Object... objects) {
        log(msg, Level.DEBUG, objects);
    }

    public void info(String msg, Object... objects) {
        log(msg, Level.INFO, objects);
    }

    public void warn(String msg, Object... objects) {
        log(msg, Level.WARN, objects);
    }

    public void error(String msg, Object... objects) {
        log(msg, Level.ERROR, objects);
    }

    private void log(String msg, Level level, Object... objects) {
        System.out.println(build(name, msg, level, objects));
    }
}
