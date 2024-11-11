package de.bcxp.challenge.service.data_processor;

import de.bcxp.challenge.model.Country;
import de.bcxp.challenge.model.CountryDensity;

import java.util.List;
public class DensityProcessor implements DataProcessor<Country, CountryDensity> {

    @Override
    public CountryDensity process(List<Country> countryDataList) {
        Country highestDensCountry = null;
        double highestDensity = 0;

        for (Country country : countryDataList) {
            // calculate the density
            double density = (double) country.getPopulation() / country.getAreaSize();

            // check, if density is the highest
            if (density > highestDensity) {
                highestDensity = density;
                highestDensCountry = country;
            }
        }

        return new CountryDensity(highestDensCountry, highestDensity);
    }
}