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

    public void debug(String msg) {
        log(msg, Level.DEBUG);
    }

    public void info(String msg) {
        log(msg, Level.INFO);
    }

    public void warn(String msg) {
        log(msg, Level.WARN);
    }

    public void error(String msg) {
        log(msg, Level.ERROR);
    }

    private void log(String msg, Level level) {
        System.out.println(build(name, msg, level));
    }
}
