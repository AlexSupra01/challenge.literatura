package com.challenge.literatura.config;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.challenge.literatura.config.iConfig.convertirDatos;

public class ConvertirDatos implements convertirDatos {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T convertirDatosJsonAJava(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
