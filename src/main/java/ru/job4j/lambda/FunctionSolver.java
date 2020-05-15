package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Класс с функциональным интерфейсом для решения задач
 *
 * @author RinZ26
 */
public class FunctionSolver {
    public static List<Double> diapason(int start, int end, Function<Double, Double> y) {
	List<Double> values = new ArrayList<>();
	for (int c = Math.min(start, end); c < Math.max(start, end); c++) {
	    values.add(y.apply((double) c));
	}
	return values;
    }
}