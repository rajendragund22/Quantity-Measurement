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
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchandNullInch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchandInchFromSameRefAreEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 0);
        boolean result = inch1 == inch1;
        Assert.assertTrue(result);
    }

    @Test
    public void given0Inchand0InchFromDifferentType_ShouldReturnNotSame() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0);
        Assert.assertNotSame(inch1, inch2);
    }

    @Test
    public void given1InchAnd2Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        Length inch2 = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenYardAndNull_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = null;
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 0.0);
        Assert.assertEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd1Yard_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenYardAndYardFromSameRef_WhenEqual_ShouldReturnTure() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        boolean result = yard1 == yard1;
        Assert.assertTrue(result);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 3.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturntrue() {
        Length inch = new Length(Length.Unit.INCH, 36.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YarAnd36Inch_WhenCompared_ShouldReturn() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length inch = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        Length cm1 = new Length(Length.Unit.CENTI_METER, 0.0);
        Length cm2 = new Length(Length.Unit.CENTI_METER, 0.0);
        Assert.assertEquals(cm1, cm2);
    }

    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnEqualLength() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTI_METER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given5CmAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
        Length cm = new Length(Length.Unit.CENTI_METER, 5.0);
        Length inch = new Length(Length.Unit.INCH, 2.0);
        boolean compareCheck = cm.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        Length expectedResult = new Length(Length.Unit.INCH, 14.0);
        Length actualResult = inch1.sumOfLength(inch2);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length expectedSum = new Length(Length.Unit.INCH, 14.0);
        Length actualSum = feet.sumOfLength(inch);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Length expectedSum = new Length(Length.Unit.INCH, 24.0);
        Length actualSum = feet1.sumOfLength(feet2);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given2Inch2$5Cm_WhenAdded_ShouldReturn3Inch() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTI_METER, 2.5);
        Length expectedSum = new Length(Length.Unit.INCH, 3.0);
        Length actualSum = inch.sumOfLength(cm);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given12Inch5Cm_WhenAdded_ShouldReturn3Inch() {
        Length inch = new Length(Length.Unit.INCH, 12.0);
        Length cm = new Length(Length.Unit.CENTI_METER, 5.0);
        Length expectedSum = new Length(Length.Unit.INCH, 14.0);
        Length actualSum = inch.sumOfLength(cm);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        Assert.assertEquals(gallon1, gallon2);
    }

    @Test
    public void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 0.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 0.0);
        Assert.assertEquals(liter1, liter2);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3$78LiterAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        boolean compareCheck = liter.compare(gallon);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenAdded_ShouldReturn7$57Liter() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        Volume expectedSum = new Volume(Volume.Unit.LITER, 7.56);
        Volume actualSum = gallon.sumOfVolume(liter);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenAdded_ShouldReturn2Liter() {
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        Volume expectedSum = new Volume(Volume.Unit.LITER, 2.0);
        Volume actualSum = liter.sumOfVolume(ml);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GramAnd0Gram_ShouldReturnEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assert.assertEquals(gram1, gram2);
    }
}
