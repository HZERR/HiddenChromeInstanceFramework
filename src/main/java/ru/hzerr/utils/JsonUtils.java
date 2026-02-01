package ru.hzerr.utils;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.DeserializationFeature;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.node.ObjectNode;

import java.util.Optional;

public class JsonUtils {

    private static final ObjectMapper mapper = new ObjectMapper().rebuild()
            .enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .build();

    public static <T> T readValue(String content, Class<T> valueType) throws JacksonException {
        return mapper.readValue(content, valueType);
    }

    public static <T> T readValue(JsonNode content, Class<T> valueType) throws JacksonException {
        return mapper.treeToValue(content, valueType);
    }

    public static JsonNode readValueAsJsonNode(String content) throws JacksonException {
        return mapper.readTree(content);
    }

    public static <T> Optional<T> readValueAsOptional(JsonNode content, Class<T> valueType) {
        try {
            return Optional.of(readValue(content, valueType));
        } catch (JacksonException je) {
            return Optional.empty();
        }
    }

    public static <T> ObjectNode readValueAsObjectNode(T value) throws JacksonException {
        return mapper.valueToTree(value);
    }

    public static ObjectNode createObjectNode() {
        return mapper.createObjectNode();
    }

    public static <T> String readValueAsString(T value) {
        return mapper.writeValueAsString(value);
    }
}
