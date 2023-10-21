package com.demo.pri.demo.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonStringUtil {

    public static <T> T jsonStringToObject(final String payload, final Class<T> clazz) throws JsonMappingException, JsonProcessingException{
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        return objectMapper.readValue(payload,clazz);
    }

    public static  Object objectToJsonString(final Object o) throws JsonMappingException, JsonProcessingException{
        final ObjectMapper objectMapper = new ObjectMapper();
       objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        return objectMapper.writeValueAsString(o);
    }
}
