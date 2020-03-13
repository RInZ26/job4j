package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.core.Is;

public class MaxTest {

    @Test
    public void maxBetween3(){
        int expected = 3;
        int actual = Max.max(1,2, 3);
    	Assert.assertThat(actual, Is.is(expected));
    }

    @Test
    public void maxBetween4(){
	int expected = 10;
	int actual = Max.max(1,2, 3, 10);
	Assert.assertEquals(expected, actual);
    }
}
