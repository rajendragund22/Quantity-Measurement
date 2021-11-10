package com.bridgelabz;

public class Weight {
    enum Unit {GRAM, KILOGRAM}
    private static final double KILO_GRAM_TO_GRAM =1000.0 ;
    private final Unit unit;
    private final double value;

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Weight that) {
        if (this.unit.equals(Unit.KILOGRAM) && that.unit.equals(Unit.GRAM))
            return Double.compare(this.value * KILO_GRAM_TO_GRAM, that.value) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weight)) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 && unit == weight.unit;
    }
}