package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.core.Is.is;

public class CounterTest {
    @Test
    public void sumByEvenBetweenZeroAndTen() {
	int expected = 30;
	int actual = Counter.sumByEven(0, 10);
	Assert.assertThat(actual, is(expected));
    }

    @Test
    public void sumByEvenBetweenOneAndOne() {
	int expected = 0;
	int actual = Counter.sumByEven(1, 1);
	Assert.assertThat(actual, is(expected));
    }

    @Test
    public void sumByEvenBetweenPositiveAndNegative() {
	int expected = 0;
	int actual = Counter.sumByEven(6, 6);
	Assert.assertThat(actual, is(expected));
    }
}
