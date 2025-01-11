package org.archi.core.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    private JsonUtil() {}

    public static String convertObjectToJson(Object message) throws JsonProcessingException {
        return objectMapper.writeValueAsString(message);
    }
}
