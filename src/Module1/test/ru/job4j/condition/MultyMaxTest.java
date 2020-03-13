package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static  org.hamcrest.core.Is.is;

public class MultyMaxTest {

    @Test
    public void whenSecondMax() {
        MultyMax check = new MultyMax();
        int actual = check.max(1, 4, 2);
        int expected = 4;
        Assert.assertThat(actual, is(expected));
    }

    @Test
    public void whenFirstMax() {
        MultyMax check = new MultyMax();
        int actual = check.max(10, -2, 9);
        int expected = 10;
        assertThat(actual, is(expected));
    }

    @Test
    public void whenThirdMax() {
        MultyMax check = new MultyMax();
        int actual = check.max(-5, 3, 1000);
        int expected = 1000;
        assertThat(actual, is(expected));
    }

    @Test
    public void whenAllEquals() {
        MultyMax check = new MultyMax();
        int actual = check.max(1, 1, 1);
        int expected = 1;
        assertThat(expected, is(actual));
    }
}
