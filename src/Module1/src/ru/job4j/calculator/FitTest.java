package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
	double value = 180;
	double expected = Fit.manWeight(value);
	double actual = 92;
	Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void womenWeight() {
	double value = 180;
	double actual = 74.7;
	double expected = Fit.womanWeight(value);
	Assert.assertEquals(expected, actual, 0.1);
    }
}
