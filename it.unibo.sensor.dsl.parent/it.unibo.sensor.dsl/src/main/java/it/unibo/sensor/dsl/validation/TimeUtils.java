package it.unibo.sensor.dsl.validation;

public class TimeUtils {
    public static boolean isHourValid(final String hour) {
        return isValid(hour, 0, 24);
    }

    public static boolean isMinuteValid(final String minute) {
        return isValid(minute, 0, 60);
    }

    private static boolean isValid(final String value, final int lowerBound, final int upperBound) {
        try {
            if (value.equals("*")) {
                return true;
            }
            final int valueInt = Integer.parseInt(value);
            return valueInt >= lowerBound && valueInt < upperBound;
        }catch (Exception e) {
            return false;
        }
    }
}
