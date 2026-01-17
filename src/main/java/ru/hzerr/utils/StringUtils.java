package ru.hzerr.utils;

public class StringUtils {

    public static boolean isEmpty(String value) {
        return value == null || value.isEmpty();
    }

    public static boolean isNotEmpty(String value) {
        return value != null && !value.isEmpty();
    }
}
