package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс для выкрутасов с матрицами и потоками
 *
 * @author RinZ26
 */
public class MatrToList {
    /**
     * Преобразование матрицы в список через stream
     *
     * @param matrix - матрица
     * @return - list
     */
   static List<Integer> doIt(Integer[][] matrix) {
	return Arrays.stream(matrix).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
