package java.forum.stream.world;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final String nameCountries;

    private final BigDecimal quanityPeople;
    private final Set<Continent> listCountry = new HashSet<>();


    public Continent(String nameCountries, BigDecimal quanityPeople) {
        this.nameCountries = nameCountries;
        this.quanityPeople = quanityPeople;
    }

    public String getNameCountries() {
        return nameCountries;
    }

    public BigDecimal getQuanityPeople() {
        return quanityPeople;
    }

    public void addCountry(Continent country) {
        listCountry.add(country);
    }
    @Override
    public String toString() {
        return "Continent{" +
                "nameCountries='" + nameCountries + '\'' +
                '}';
    }

}


