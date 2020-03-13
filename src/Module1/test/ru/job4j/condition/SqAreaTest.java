package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square2() {
        int p = 40;
        int k = 3;
        double expected = SqArea.square(p, k);
        double actual = 75;
        Assert.assertEquals(expected, actual, 0.01);
    }
}
