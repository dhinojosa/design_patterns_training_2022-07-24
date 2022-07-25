package com.xyzcorp.builder;

import java.util.Objects;
import java.util.StringJoiner;

public class Flower {
    private int petals;
    private String color;
    private String latinName;

    protected Flower(int petals, String color, String latinName) {
        this.petals = petals;
        this.color = color;
        this.latinName = latinName;
    }

    public int getPetals() {
        return petals;
    }

    public String getColor() {
        return color;
    }

    public String getLatinName() {
        return latinName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return petals == flower.petals && Objects.equals(color, flower.color) && Objects.equals(latinName, flower.latinName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petals, color, latinName);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Flower.class.getSimpleName() + "[", "]")
            .add("petals=" + petals)
            .add("color='" + color + "'")
            .add("latinName='" + latinName + "'")
            .toString();
    }
}
