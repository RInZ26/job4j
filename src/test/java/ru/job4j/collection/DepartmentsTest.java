package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
	List<String> input = List.of("k1/sk1");
	List<String> expect = List.of("k1", "k1/sk1");
	List<String> result = Departments.fillGaps(input);
	Departments.sortAsc(result);
	assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
	List<String> input = List.of("k1", "k1/sk1");
	List<String> expect = List.of("k1", "k1/sk1");
	List<String> result = Departments.fillGaps(input);
	Collections.sort(result);
	assertThat(result, is(expect));
    }

    @Test
    public void manyRecords() {
	List<String> input = List.of("K1/SK1",
		"K1/SK2",
		"K1/SK1/SSK1",
		"K1/SK1/SSK2",
		"K2",
		"K2/SK1/SSK1",
		"K2/SK1/SSK2");
	List<String> expect = List.of("K1",
		"K1/SK1",
		"K1/SK1/SSK1",
		"K1/SK1/SSK2",
		"K1/SK2",
		"K2",
		"K2/SK1",
		"K2/SK1/SSK1",
		"K2/SK1/SSK2");
	List<String> result = Departments.fillGaps(input);
	Departments.sortAsc(result);
	assertThat(result, is(expect));
    }

    @Test
    public void reversedSort() {
	List<String> actual = Arrays.asList(
		"K1/SK1",
		"K2/SK1",
		"K1",
		"K1/SK1/SSK1",
		"K1/SK2",
		"K2/SK1/SSK1",
		"K1/SK1/SSK2",
		"K2",
		"K2/SK1/SSK2");
	List<String> expected = List.of("K2",
		"K2/SK1",
		"K2/SK1/SSK1",
		"K2/SK1/SSK2",
		"K1",
		"K1/SK1",
		"K1/SK1/SSK1",
		"K1/SK1/SSK2",
		"K1/SK2"
		);
	Departments.sortDesc(actual);
	assertThat(actual, is(expected));
    }
}