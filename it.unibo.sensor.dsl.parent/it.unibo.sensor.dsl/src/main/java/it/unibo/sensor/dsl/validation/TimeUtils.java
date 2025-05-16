package it.unibo.sensor.dsl.validation;

public class TimeUtils {
    public static boolean isHourValid(final int hour) {
        return hour >= 0 && hour < 24;
    }

    public static boolean isMinuteValid(final int minute) {
        return minute >= 0 && minute < 60;
    }
}
