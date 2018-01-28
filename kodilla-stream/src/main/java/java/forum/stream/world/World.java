package java.forum.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World implements People {

    private String nameContinent;
    private final Set<World> listContinents = new HashSet<>();

    public World(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public void addContinent(World continent) {
listContinents.add(continent);
    }

    public String getNameContinent() {
        return nameContinent;
    }

    @Override
    public String toString() {
        return "World{" +
                "nameContinent='" + nameContinent + '\'' +
                '}';
    }

    @Override
    public BigDecimal getPeopleQuantity() {
        return null;
    }

    }

