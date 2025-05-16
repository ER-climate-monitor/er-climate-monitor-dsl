package it.unibo.sensor.dsl.validation;

import it.unibo.sensor.dsl.sensorDSL.DAY;

import java.util.List;

public class DayUtils {
    private static List<DAY> days = List.of(DAY.values());
    public static Integer getIndex(final DAY day) {
        return days.indexOf(day);
    }

    public static String dayRange(final DAY from, final DAY to) {
        final Integer startIdx = DayUtils.getIndex(from);
        final Integer endIdx = DayUtils.getIndex(to);
        if (startIdx == 0 && endIdx == DAY.values().length - 1) {
            return "*";
        }
        return startIdx + "-" + endIdx;
    }
}
