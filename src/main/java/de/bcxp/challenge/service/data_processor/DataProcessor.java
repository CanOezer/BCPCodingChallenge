package de.bcxp.challenge.service.data_processor;

import java.util.List;

public interface DataProcessor<I, O> {
    O process(List<I> dataList);
}