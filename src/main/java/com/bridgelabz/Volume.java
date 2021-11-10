package com.bridgelabz;

public class Volume {
    enum Unit {GALLON, LITER}

    private static final double GALLON_TO_LITER = 3.78;
    private final double value;
    private final Unit unit;

    public Volume(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Volume that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITER))
            return Double.compare(this.value * GALLON_TO_LITER, that.value) == 0;
        if (this.unit.equals(Unit.LITER) && that.unit.equals(Unit.GALLON))
            return Double.compare(this.value, that.value * GALLON_TO_LITER) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volume)) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }

}
