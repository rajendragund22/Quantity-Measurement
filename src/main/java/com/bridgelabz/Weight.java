package com.bridgelabz;

public class Weight {
    enum Unit {GRAM}

    private final Unit unit;
    private final double value;

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weight)) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 && unit == weight.unit;
    }
}