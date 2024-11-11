package de.bcxp.challenge.model;

public class CountryDensity {
    private Country country;
    private double density;

    public CountryDensity(Country country, double density) {
        this.country = country;
        this.density = density;
    }

    public Country getCountry() {
        return country;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return "Country: " + country.getCountryName() +
                ", Capital: " + country.getCapitalOfTheCountry() +
                ", Density: " + String.format("%.2f people/km²", density);
    }
}