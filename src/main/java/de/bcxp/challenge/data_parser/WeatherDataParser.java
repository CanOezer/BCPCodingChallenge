package de.bcxp.challenge.data_parser;

import de.bcxp.challenge.model.Weather;

public class WeatherDataParser implements DataParser<Weather> {


    private DataParser<Weather> parser;

    @Override
    public Weather parse(String line) {
        String[] values = line.split(",");
        int day = Integer.parseInt(values[0].trim());
        int maxTemp = Integer.parseInt(values[1].trim());
        int minTemp = Integer.parseInt(values[2].trim());
        double avgTemp = Double.parseDouble(values[3].trim());
        double avgDewPoint = Double.parseDouble(values[4].trim());

        return new Weather(day, maxTemp, minTemp, avgTemp, avgDewPoint);
    }
}