package stardust;

public class Location {
    private String country;
    private String airportCode;
    private String city;

    public Location(String country, String airportCode, String city) {
        this.country = country;
        this.airportCode = airportCode;
        this.city = city;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Country must not be empty");
        }
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public void setAirportCode(String airportCode) {
        if (airportCode == null || airportCode.isEmpty()) {
            throw new IllegalArgumentException("Airportcode must not be empty");
        }
        this.airportCode = airportCode;
    }

    public String getAirportCode() {
        return this.airportCode;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("City must not be empty.");
        }
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }
}
