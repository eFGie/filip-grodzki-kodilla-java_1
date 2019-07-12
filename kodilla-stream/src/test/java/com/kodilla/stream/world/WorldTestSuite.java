package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        World world = new World();

        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");

        Country kenya = new Country("Kenya", new BigDecimal("33423523"));
        Country uganda = new Country("Uganda", new BigDecimal("8667555"));
        Country ghana = new Country("Ghana", new BigDecimal("463446634"));

        Country afghanistan = new Country("Afghanistan", new BigDecimal("11111112"));
        Country israel = new Country("Israel", new BigDecimal("87576685"));
        Country vietnam = new Country("Vietnam", new BigDecimal("12889434"));

        Country spain = new Country("Spain", new BigDecimal("8888886"));
        Country portugal = new Country("Portugal", new BigDecimal("7777755"));
        Country greece = new Country("Greece", new BigDecimal("57456453"));

        africa.addCountry(kenya);
        africa.addCountry(uganda);
        africa.addCountry(ghana);

        asia.addCountry(afghanistan);
        asia.addCountry(israel);
        asia.addCountry(vietnam);

        europe.addCountry(spain);
        europe.addCountry(portugal);
        europe.addCountry(greece);

        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(europe);

        BigDecimal expectedPeopleQuantity = new BigDecimal("691238037");
        BigDecimal actualPeopleQuantity = world.getPeopleQuantity();

        Assert.assertEquals(expectedPeopleQuantity,actualPeopleQuantity);
    }

}
