package ru.hzerr.utils;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class JsonUtils {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T readValue(String content, Class<T> valueType) throws JacksonException {
        return mapper.readValue(content, valueType);
    }
}
