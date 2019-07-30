package com.kodilla.patterns.builder.bigmac;


import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder  {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder  bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder  burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, sauce, burgers,  ingredients);
        }
    }

    private BigMac(final String bun, final String sauce,final int burgers,final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
