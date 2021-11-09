package com.bridgelabz;

/**
 * @author -> Rajendra Gund
 * @version -> 1.0
 * @since -> 09/11/2021
 */
public class Length {
    enum Unit {FEET, INCH}

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length feet = (Length) o;
        return Double.compare(feet.value, value) == 0;
    }
}
