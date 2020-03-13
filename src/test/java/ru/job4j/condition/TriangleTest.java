package ru.job4j.condition;

import org.hamcrest.Factory;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
	Triangle triangle = new Triangle(new Point(0, 0), new Point(8, 0), new Point(4, 3));
	double actual = triangle.area();
	double expected = 12;
	Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void whenDoesntExist() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 0), new Point(0, 0));
	double actual = triangle.area();
	double expected = -1;
	Assert.assertEquals(expected, actual, 0.1);
    }
}