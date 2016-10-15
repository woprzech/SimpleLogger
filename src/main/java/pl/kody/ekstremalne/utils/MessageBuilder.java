package pl.kody.ekstremalne.utils;

import pl.kody.ekstremalne.Level;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Wojtek Przechodzen.
 */
public class MessageBuilder {

    public static String build(String loggerName, String msg, Level level) {
        Date now = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("E dd.MM.yyyy hh:mm:ss");
        return ft.format(now) + " " + loggerName + " [" + level + "]: " + msg;
    }
}
