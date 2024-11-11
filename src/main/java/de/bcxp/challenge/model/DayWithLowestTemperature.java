package de.bcxp.challenge.model;

public class DayWithLowestTemperature {
    private Weather weatherData;
    private double lowestAverageTemp;

    public DayWithLowestTemperature(Weather weatherData, double lowestAverageTemp) {
        this.weatherData = weatherData;
        this.lowestAverageTemp = lowestAverageTemp;
    }

    public Weather getWeatherData() {
        return weatherData;
    }

    public double getLowestAverageTemp() {
        return lowestAverageTemp;
    }

    @Override
    public String toString() {
        return "Day: " + weatherData.getDay() +
                ", lowest average temperature: " + String.format("%.2f°C", lowestAverageTemp);
    }
}