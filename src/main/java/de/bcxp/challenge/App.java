package de.bcxp.challenge;

import de.bcxp.challenge.data_parser.CountryDataParser;
import de.bcxp.challenge.model.Country;
import de.bcxp.challenge.model.CountryDensity;
import de.bcxp.challenge.model.DayWithLowestTemperature;
import de.bcxp.challenge.model.Weather;
import de.bcxp.challenge.data_parser.WeatherDataParser;
import de.bcxp.challenge.service.data_import.GenericDataImport;
import de.bcxp.challenge.service.data_processor.DensityProcessor;
import de.bcxp.challenge.service.data_processor.TemperatureProcessor;
import de.bcxp.challenge.util.DataUtils;

import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …


        // Importiere WeatherData
        GenericDataImport<Weather> weatherImporter = new GenericDataImport<>(new WeatherDataParser(),false);
        List<Weather> weatherDataList = weatherImporter.readData("src/main/resources/data/weather.csv");

        // Data processing
        TemperatureProcessor tempProcessor = new TemperatureProcessor();
        DayWithLowestTemperature dayWithSmallestTempSpread = tempProcessor.process(weatherDataList);

        System.out.println("\nDay with smallest temperature spread:");
        System.out.println(dayWithSmallestTempSpread);


//
        // Importiere CountryData
        GenericDataImport<Country> countryImporter = new GenericDataImport<>(new CountryDataParser(),false);
        List<Country> countries = countryImporter.readData("src/main/resources/data/countries.csv");

//        // JSON-Datei einlesen
//        JsonParser<Country> jsonImporter = new JsonParser<>(Country.class);
//        List<Country> countriesFromJson = jsonImporter.readData("src/main/resources/data/countries.json");


        // Verarbeite die Bevölkerungsdichte
        DensityProcessor densityProcessor = new DensityProcessor();
        CountryDensity countryWithHighestPopulationDensity = densityProcessor.process(countries);

        // Ausgabe der Ergebnisse
        System.out.println("\nCountry with highest population density:");
        System.out.println(countryWithHighestPopulationDensity);

        DataUtils dataUtils = new DataUtils();

//        // country with lowest density
//        Country highestDensityCountry = dataUtils.findMin(countries, country -> (double) country.getPopulation() / country.getAreaSize());

        // Ausgabe
//        System.out.println("\nCountry with the lowest population density:");
//        System.out.println(highestDensityCountry.getCountryName());




//        String dayWithSmallestTempSpread = "Someday";     // Your day analysis function call …
//        System.out.printf("Day with smallest temperature spread: %s%n", dayWithSmallestTempSpread);
//
//        String countryWithHighestPopulationDensity = "Some country"; // Your population density analysis function call …
//        System.out.printf("Country with highest population density: %s%n", countryWithHighestPopulationDensity);
    }

}
