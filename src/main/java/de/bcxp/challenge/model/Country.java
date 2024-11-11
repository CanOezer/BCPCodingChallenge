package de.bcxp.challenge.model;

public class Country {

    private String countryName;
    private String capitalOfTheCountry;
    private String accession;
    private int population;
    private double areaSize;

    public Country() {
    }

    public Country(String countryName, String capitalOfTheCountry, String accession, int population, double areaSize){

        this.countryName = countryName;
        this.capitalOfTheCountry = capitalOfTheCountry;
        this.accession = accession;
        this. population = population;
        this.areaSize = areaSize;
    }


    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalOfTheCountry() {
        return capitalOfTheCountry;
    }

    public void setCapitalOfTheCountry(String capitalOfTheCountry) {
        this.capitalOfTheCountry = capitalOfTheCountry;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(double area) {
        this.areaSize = area;
    }

    @Override
    public String toString() {
        return
                "countryName='" + countryName + '\'' +
                ", capitalOfTheCountry='" + capitalOfTheCountry + '\'' +
                ", accession='" + accession + '\'' +
                ", population=" + population +
                ", areaSize=" + areaSize;
    }
}
