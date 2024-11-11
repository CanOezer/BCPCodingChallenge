package de.bcxp.challenge.data_parser;

import de.bcxp.challenge.model.Country;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class CountryDataParser implements DataParser<Country> {

    private DataParser<Country> parser;

    @Override
    public Country parse(String line) {
        String[] values = line.split(";");
        String countryName = values[0].trim();
        String capital = values[1].trim();
        String accession = values[2].trim();
        int population = parsePopulation(values[3].trim());
        double area = Double.parseDouble(values[4].trim());

        return new Country(countryName, capital, accession, population, area);
    }

    private int parsePopulation(String populationString) {
        NumberFormat format = NumberFormat.getInstance(Locale.GERMAN);
        try {
            return format.parse(populationString).intValue();
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid format for population: " + populationString);
        }
    }

}
