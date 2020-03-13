package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when1Year() {
	Mortgage mortgage = new Mortgage();
	int year = mortgage.getCountOfYears(1000, 1200, 1);
	assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
	Mortgage mortgage = new Mortgage();
	int year = mortgage.getCountOfYears(100, 120, 50);
	assertThat(year, is(2));
    }

    @Test
    public void whenPercentIsInsane() {
	Mortgage mortgage = new Mortgage();
	int expected = 999;
	int actual = mortgage.getCountOfYears(100, 100, 100);
	assertThat(actual, is(expected));
    }
}