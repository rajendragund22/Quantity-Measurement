package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetRefAreSame_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        boolean result = feet1 == feet1;
        Assert.assertTrue(result);
    }

    @Test
    public void given0FeetAnd1FeetFromDiffType_ShouldReturnNotSame() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchandNullInch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchandInchFromSameRefAreEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH,0);
        boolean result = inch1 == inch1;
        Assert.assertTrue(result);
    }

    @Test
    public void given0Inchand0InchFromDifferentType_ShouldReturnNotSame() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0);
        Assert.assertNotSame(inch1, inch2);
    }
    @Test
    public void given1InchAnd2Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length inch2 = new Length(Length.Unit.INCH,2.0);
        Assert.assertNotEquals(inch1, inch2);
    }

}
