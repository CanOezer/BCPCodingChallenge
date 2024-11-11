package de.bcxp.challenge.service.data_import;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader<T> implements DataImport<T> {
    private final ObjectMapper objectMapper;
    private final Class<T> type;

    public JsonReader(Class<T> type) {
        this.objectMapper = new ObjectMapper();
        this.type = type;
    }

    @Override
    public List<T> readData(String filePath) {
        try {
            return objectMapper.readValue(new File(filePath), objectMapper.getTypeFactory().constructCollectionType(List.class, type));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Fehler beim Einlesen der JSON-Datei: " + filePath, e);
        }
    }
}