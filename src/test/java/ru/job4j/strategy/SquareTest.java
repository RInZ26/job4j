package ru.job4j.strategy;


import org.junit.Assert;
import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
	Square square = new Square();
	int size = 8;
	StringJoiner sj = new StringJoiner(System.lineSeparator());
	Assert.assertThat(square.draw(), is(sj.add("***************").add("***************").add("***************").add("***************")
						.add("***************").add("***************").add("***************").add("***************").toString()));
    }
}