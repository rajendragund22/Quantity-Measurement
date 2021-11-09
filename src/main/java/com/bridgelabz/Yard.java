package com.bridgelabz;

public class Yard {
    private final double yard;

    public Yard(double yard) {
        this.yard = yard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Yard)) return false;
        Yard yard1 = (Yard) o;
        return Double.compare(yard1.yard, yard) == 0;
    }
}
