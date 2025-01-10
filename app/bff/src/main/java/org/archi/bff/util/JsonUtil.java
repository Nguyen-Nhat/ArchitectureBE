package org.archi.bff.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.util.JsonFormat;
import org.archi.common.core.GetWinItemResponse;
import org.archi.common.quiz.QuizPlayerAnswerDTO;

import java.io.IOException;

public final class JsonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    private JsonUtil() {}

    public static String convertObjectToJson(Object message) throws JsonProcessingException {
        return objectMapper.writeValueAsString(message);
    }

    public static QuizPlayerAnswerDTO convertJsonToAnswer(String message) throws JsonProcessingException {
        return objectMapper.readValue(message, QuizPlayerAnswerDTO.class);
    }

    public static String convertWinItemToJson(GetWinItemResponse response) throws IOException {
        JsonFormat.Printer printer = JsonFormat.printer();
        return printer.print(response);
    }
}
