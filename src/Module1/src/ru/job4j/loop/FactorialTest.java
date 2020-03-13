package ru.job4j.loop;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.hamcrest.core.Is.*;
import org.junit.Assert;

public class FactorialTest {
    @Test
    public void calcFactorialPositive() {
	int expected = 120;
	int actual = Factorial.calcFactorial(5);
	Assert.assertThat(actual, Is.is(expected));
    }

    @Test
    public void calcFactorialOne() {
	int expected = 1;
	int actual = Factorial.calcFactorial(1);
	Assert.assertThat(actual, Is.is(expected));
    }

    @Test
    public void calcFactorialZero() {
	int expected = 1;
	int actual = Factorial.calcFactorial(0);
	Assert.assertThat(actual, Is.is(expected));
    }

    @Test
    public void calcFactorialNegative() {
	int expected = -1;
	int actual = Factorial.calcFactorial(-100);
	Assert.assertThat(actual, Is.is(expected));
    }
}
