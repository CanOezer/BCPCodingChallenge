package de.bcxp.challenge.data_parser;

public interface DataParser<T> {
    T parse(String line);
}
