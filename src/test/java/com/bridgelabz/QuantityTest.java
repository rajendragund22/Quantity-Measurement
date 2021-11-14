package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetRefAreSame_ShouldReturnTrue() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        boolean result = feet1 == feet1;
        Assert.assertTrue(result);
    }

    @Test
    public void given0FeetAnd1FeetFromDiffType_ShouldReturnNotSame() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchandNullInch_ShouldReturnNotEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchandInchFromSameRefAreEqual_ShouldReturnTrue() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0);
        boolean result = inch1 == inch1;
        Assert.assertTrue(result);
    }

    @Test
    public void given0Inchand0InchFromDifferentType_ShouldReturnNotSame() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 0);
        Assert.assertNotSame(inch1, inch2);
    }

    @Test
    public void given1InchAnd2Inch_ShouldReturnNotEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 1.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 2.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnNotEqual() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 0.0);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 12.0);
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqual() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqual() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 12.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 12.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 12.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenYardAndNull_ShouldReturnNotEqual() {
        QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        QuantityMeasurementSystem yard2 = null;
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnEqual() {
        QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        QuantityMeasurementSystem yard2 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        Assert.assertEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd1Yard_ShouldReturnNotEqual() {
        QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        QuantityMeasurementSystem yard2 = new QuantityMeasurementSystem(Length.YARD, 1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenYardAndYardFromSameRef_WhenEqual_ShouldReturnTure() {
        QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        boolean result = yard1 == yard1;
        Assert.assertTrue(result);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 3.0);
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturntrue() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 36.0);
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YarAnd36Inch_WhenCompared_ShouldReturn() {
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        QuantityMeasurementSystem cm1 = new QuantityMeasurementSystem(Length.CENTI_METER, 0.0);
        QuantityMeasurementSystem cm2 = new QuantityMeasurementSystem(Length.CENTI_METER, 0.0);
        Assert.assertEquals(cm1, cm2);
    }

    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTI_METER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given5CmAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTI_METER, 5.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        boolean compareCheck = cm.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 12.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem expectedResult = new QuantityMeasurementSystem(Length.INCH, 14.0);
        QuantityMeasurementSystem actualResult = inch1.sumOfQuantity(inch2, Length.INCH);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 14.0);
        QuantityMeasurementSystem actualSum = feet.sumOfQuantity(inch, Length.INCH);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 24.0);
        QuantityMeasurementSystem actualSum = feet1.sumOfQuantity(feet2, Length.INCH);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given2Inch2$5Cm_WhenAdded_ShouldReturn3Inch() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTI_METER, 2.5);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 3.0);
        QuantityMeasurementSystem actualSum = inch.sumOfQuantity(cm, Length.INCH);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given12Inch5Cm_WhenAdded_ShouldReturn3Inch() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 12.0);
        QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTI_METER, 5.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 14.0);
        QuantityMeasurementSystem actualSum = inch.sumOfQuantity(cm, Length.INCH);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        QuantityMeasurementSystem gallon2 = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        Assert.assertEquals(gallon1, gallon2);
    }

    @Test
    public void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem liter1 = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        QuantityMeasurementSystem liter2 = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        Assert.assertEquals(liter1, liter2);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3$78LiterAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        boolean compareCheck = liter.compare(gallon);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenAdded_ShouldReturn7$57Liter() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Volume.LITER, 7.56);
        QuantityMeasurementSystem actualSum = gallon.sumOfQuantity(liter, Volume.LITER);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenAdded_ShouldReturn2Liter() {
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Volume.LITER, 2.0);
        QuantityMeasurementSystem actualSum = liter.sumOfQuantity(ml, Volume.LITER);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GramAnd0Gram_ShouldReturnEqualWeight() {
        QuantityMeasurementSystem gram1 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem gram2 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        Assert.assertEquals(gram1, gram2);
    }

    @Test
    public void given1KGAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurementSystem kg = new QuantityMeasurementSystem(Weight.KILOGRAM, 1.0);
        QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000KG_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
        QuantityMeasurementSystem kg = new QuantityMeasurementSystem(Weight.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kg);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001KG() {
        QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
        QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 1000.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Weight.KILOGRAM, 1001.0);
        QuantityMeasurementSystem actualSum = tonne.sumOfQuantity(gram, Weight.KILOGRAM);
        Assert.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqualTemperature() {
        QuantityMeasurementSystem temp1 = new QuantityMeasurementSystem(Temperature.DEG_F, 0.0);
        QuantityMeasurementSystem temp2 = new QuantityMeasurementSystem(Temperature.DEG_F, 0.0);
        Assert.assertEquals(temp1, temp2);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompared_ShouldReturnEqualTemp() {
        QuantityMeasurementSystem fahrenheit = new QuantityMeasurementSystem(Temperature.DEG_F, 212.0);
        QuantityMeasurementSystem celsius = new QuantityMeasurementSystem(Temperature.DEG_C, 100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assert.assertTrue(compareCheck);
    }
}
