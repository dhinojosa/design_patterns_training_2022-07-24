package com.xyzcorp.builder;

public class FlowerBuilder {
    private int petals;
    private String color;
    private String latinName;

    public FlowerBuilder setPetals(int petals) {
        this.petals = petals;
        return this;
    }

    public FlowerBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public FlowerBuilder setLatinName(String latinName) {
        this.latinName = latinName;
        return this;
    }

    public Flower createFlower() {
        return new Flower(petals, color, latinName);
    }
}
