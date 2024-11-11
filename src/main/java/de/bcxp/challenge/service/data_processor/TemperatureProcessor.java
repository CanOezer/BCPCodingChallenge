package de.bcxp.challenge.service.data_processor;

import de.bcxp.challenge.model.DayWithLowestTemperature;
import de.bcxp.challenge.model.Weather;

import java.util.List;

public class TemperatureProcessor implements DataProcessor<Weather, DayWithLowestTemperature> {

    @Override
    public DayWithLowestTemperature process(List<Weather> weatherDataList) {
        Weather minAvgTempDay = null;
        double lowestAverageTemp = Double.MAX_VALUE;

        for (Weather data : weatherDataList) {
            double averageTemp = data.getAverageTemp();
            if (averageTemp < lowestAverageTemp) {
                lowestAverageTemp = averageTemp;
                minAvgTempDay = data;
            }
        }

        return new DayWithLowestTemperature(minAvgTempDay, lowestAverageTemp);
    }
}