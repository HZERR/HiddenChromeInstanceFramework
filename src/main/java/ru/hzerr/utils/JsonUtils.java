package ru.hzerr.utils;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.util.Optional;

public class JsonUtils {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T readValue(String content, Class<T> valueType) throws JacksonException {
        return mapper.readValue(content, valueType);
    }

    public static <T> T readValue(JsonNode content, Class<T> valueType) throws JacksonException {
        return mapper.treeToValue(content, valueType);
    }

    public static JsonNode readTree(String content) throws JacksonException {
        return mapper.readTree(content);
    }

    public static <T> Optional<T> readValueAsOptional(JsonNode content, Class<T> valueType) {
        try {
            return Optional.of(readValue(content, valueType));
        } catch (JacksonException je) {
            return Optional.empty();
        }
    }
}
