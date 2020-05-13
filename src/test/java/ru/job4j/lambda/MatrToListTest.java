package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrToListTest {
    @Test
    public void simpleConvert() {
	Integer[][] matr = new Integer[3][3];
	for (int c = 0; c < matr.length; c++) {
	    for (int i = 0; i < matr[0].length; i++) {
		matr[c][i] = c + i;
	    }
	}
	List<Integer> expected = List.of(0, 1, 2, 1, 2, 3, 2, 3, 4);
	assertThat(MatrToList.doIt(matr), is(expected));
    }
}
