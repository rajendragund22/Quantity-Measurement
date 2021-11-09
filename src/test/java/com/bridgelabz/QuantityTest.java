package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetRefAreSame_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        boolean result = feet1 == feet1;
        Assert.assertTrue(result);
    }

    @Test
    public void given0FeetAnd1FeetFromDiffType_ShouldReturnNotSame() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchandNullInch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchandInchFromSameRefAreEqual_ShouldReturnTrue() {
        Inch inch1 = new Inch(0);
        boolean result = inch1 == inch1;
        Assert.assertTrue(result);
    }

    @Test
    public void given0Inchand0InchFromDifferentType_ShouldReturnNotSame() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0);
        Assert.assertNotSame(inch1, inch2);
    }
}
