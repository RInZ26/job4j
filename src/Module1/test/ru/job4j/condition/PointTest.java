package ru.job4j.condition;
import org.junit.Test;
import org.junit.Assert;
public class PointTest {
    @Test
    public void distance1() {
        double expected = Point.distance(1, 0, 4, 4);
        double actual = 5;
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void distance2() {
        double expected = Point.distance(-99, -99, -99, -99);
        double actual = 0;
        Assert.assertEquals(expected, actual, 0.1);
    }
}
