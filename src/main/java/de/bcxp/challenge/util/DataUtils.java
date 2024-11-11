package de.bcxp.challenge.util;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class DataUtils {

    // average value
    public static <T> double calculateAverage(List<T> list, Function<T, Double> valueExtractor) {
        return list.stream()
                .mapToDouble(valueExtractor::apply)
                .average()
                .orElse(0.0);
    }

    // highest value
    public static <T> T findMax(List<T> list, Function<T, Double> valueExtractor) {
        return list.stream()
                .max(Comparator.comparing(valueExtractor))
                .orElse(null);
    }

    // lowest value
    public static <T> T findMin(List<T> list, Function<T, Double> valueExtractor) {
        return list.stream()
                .min(Comparator.comparing(valueExtractor))
                .orElse(null);
    }
}
