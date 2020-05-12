package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.greaterThan;

public class DepDecCompTest {

    @Test
    public void compare() {
	int rsl = new DepDecComp().compare(
		"K2/SK1/SSK2",
		"K2/SK1/SSK1"
	);
	assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
	int rsl = new DepDecComp().compare(
		"K2",
		"K2/SK1"
	);
	assertThat(rsl, lessThan(0));
    }

}