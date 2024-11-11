package de.bcxp.challenge.service.data_import;

import java.util.List;

//Hiermit wird auf die CSV-Dateien zugegriffen

public interface DataImport<T> {
    List<T> readData(String filePath);
}