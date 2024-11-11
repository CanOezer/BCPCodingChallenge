package de.bcxp.challenge.service.data_import;

import de.bcxp.challenge.data_parser.DataParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericDataImport<T> implements DataImport<T> {

    private final DataParser<T> parser;
    private final boolean isJson;

    public GenericDataImport(DataParser<T> parser, boolean isJson) {
        this.parser = parser;
        this.isJson = isJson;
    }

    @Override
    public List<T> readData(String filePath) {
        if (isJson) {
            //for json-data
            return (List<T>) parser.parse(filePath);
        } else {
            // for csv-data
            List<T> dataList = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line = br.readLine(); // Überspringe die Kopfzeile
                while ((line = br.readLine()) != null) {
                    T data = parser.parse(line);
                    dataList.add(data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return dataList;
        }
    }
}