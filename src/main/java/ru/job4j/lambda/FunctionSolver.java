package ru.job4j.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 * Класс с функциональным интерфейсом для решения задач
 *
 * @author RinZ26
 */
public class FunctionSolver {
    public static List<Double> diapason(int start, int end, Function<Double, Double> y) {
	double step = 1;
	return DoubleStream.iterate(start, (x) -> x + step).takeWhile((x) -> x < end).map(y::apply).boxed().collect(Collectors.toList());
    }
}
