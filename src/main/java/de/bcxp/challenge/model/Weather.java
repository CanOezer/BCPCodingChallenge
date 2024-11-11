package de.bcxp.challenge.model;

public class Weather {

    private int day;
    private int maxTemp;
    private int minTemp;
    private double avgTemp;
    private double avgDewPoint;

    public Weather(int day, int maxTemp, int minTemp, double avgTemp, double avgDewPoint) {
        this.day = day;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.avgTemp = avgTemp;
        this.avgDewPoint = avgDewPoint;
    }

    public double getAverageTemp() {
        return (maxTemp + minTemp) / 2.0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgDewPoint() {
        return avgDewPoint;
    }

    public void setAvgDewPoint(double avgDewPoint) {
        this.avgDewPoint = avgDewPoint;
    }

    @Override
    public String toString() {
        return "Day " + day + ": MaxTemp=" + maxTemp + ", MinTemp=" + minTemp +
                ", AvgTemp=" + avgTemp + ", AvgDewPoint=" + avgDewPoint;
    }
}
