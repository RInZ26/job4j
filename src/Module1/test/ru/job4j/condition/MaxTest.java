package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxFirst() {
        int first = 4, second = 2;
        int actual = Max.max(first, second);
        int expected = first;
        assertThat(actual, is(expected));
    }

    @Test
    public void whenMaxSecond() {
        int first = 2, second = 4;
        int actual = Max.max(first, second);
        int expected = second;
        assertThat(actual, is(expected));
    }

    @Test
    public void whenBothEquals() {
        int first = 4, second = 4;
        int actual = Max.max(first, second);
        int expected = second;
        assertThat(actual, is(expected));
    }
}
