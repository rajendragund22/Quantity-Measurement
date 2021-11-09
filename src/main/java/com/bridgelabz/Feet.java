package com.bridgelabz;

/**
 * @author -> Rajendra Gund
 * @version -> 1.0
 * @since -> 09/11/2021
 */
public class Feet {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feet)) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}
