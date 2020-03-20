package ru.job4j.strategy;


import org.junit.Assert;
import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
	Triangle triangle = new Triangle();
	StringJoiner sj = new StringJoiner(System.lineSeparator());
	Assert.assertThat(triangle.draw(), is(sj.add("   *").add("  ***").add(" *****").add("*******").toString()));
    }
}