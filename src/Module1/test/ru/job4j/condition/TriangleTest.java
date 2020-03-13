package ru.job4j.condition;

import org.hamcrest.Factory;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean actual = Triangle.exist(2.0, 2.0, 2.0);
        boolean expected = true;
        assertThat(actual, is(expected));
    }

    @Test
    public void whenDoesntExist() {
        boolean actual = Triangle.exist(3, 3, 10);
        boolean expected = false;
        assertThat(actual, is(expected));
    }
}
