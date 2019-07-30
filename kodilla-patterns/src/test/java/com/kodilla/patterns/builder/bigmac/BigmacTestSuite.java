package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        BigMac bigMac = new BigMac.BigmacBuilder()
                .bun("WithSesame")
                .sauce("Spicy")
                .burgers(3)
                .ingredient("Ham")
                .ingredient("Bacon")
                .ingredient("Onion")
                .ingredient("Cheese")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
