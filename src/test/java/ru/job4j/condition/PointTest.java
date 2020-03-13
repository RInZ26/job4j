package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.core.Is;

public class PointTest {
    @Test
    public void check2dDistance() {
	Point firstPoint = new Point(1, 1);
	Point secondPoint = new Point(4, 5);
	double expected = 5;
	double actual = firstPoint.distance(secondPoint);
	Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void chech3dDistance() {
	Point firstPoint = new Point(1, 1,1 );
	Point secondPoint = new Point(3, 3, 2);
	double expected = 3;
	double actual = firstPoint.distance3d(secondPoint);
	Assert.assertEquals(expected, actual, 0.1);
    }
}
