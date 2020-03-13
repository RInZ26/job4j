package ru.job4j.loop;

import org.junit.Test;
import org.hamcrest.core.Is;
import org.junit.Assert;

public class FitnessTest {
    @Test
    public void calcCountofMonthsSimple() {
	int expected = 1;
	int actual = Fitness.calcCountOfMonths(90, 100);
	Assert.assertThat(actual, Is.is(expected));
    }

    @Test
    public void whenIvanGreatNik() {
	int month = Fitness.calcCountOfMonths(95, 90);
	Assert.assertThat(month, Is.is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
	int month = Fitness.calcCountOfMonths(90, 95);
	Assert.assertThat(month, Is.is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
	int month = Fitness.calcCountOfMonths(50, 90);
	Assert.assertThat(month, Is.is(2));
    }
}

