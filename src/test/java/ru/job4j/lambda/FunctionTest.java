package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
	List<Double> result = FunctionSolver.diapason(5, 8, x -> 2 * x + 1);
	List<Double> expected = Arrays.asList(11D, 13D, 15D);
	assertThat(result, is(expected));
    }
    @Test
    public void whenQuadraticFunction() {
	List<Double> result = FunctionSolver.diapason(2, 5, x -> Math.pow(x, 3));
	List<Double> expected = Arrays.asList(8D, 27D, 64D);
	assertThat(result, is(expected));
    }
    @Test
    public void whenExponentialFunction() {
	List<Double> result = FunctionSolver.diapason(2, 5, x -> Math.pow(3, x));
	List<Double> expected = Arrays.asList(9D, 27D, 81D);
	assertThat(result, is(expected));
    }
}
