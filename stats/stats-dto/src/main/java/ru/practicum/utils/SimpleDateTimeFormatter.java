package ru.practicum.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.experimental.UtilityClass;


@UtilityClass
public class SimpleDateTimeFormatter {
    public static final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String toString(LocalDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern(PATTERN));
    }
}