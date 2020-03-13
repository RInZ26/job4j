package ru.job4j.array;

/**
 * Табличка умножения
 *
 * @author RinZ26
 */
public class Matrix {
    /**
     * Возвращаем таблицу умножения размера size
     *
     * @param size размер таблицы умножения
     * @return матрица - таблица умножения
     */
    public int[][] multiple(int size) {
	int[][] matrix = new int[size][size];
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		matrix[i][j] = (i + 1) * (j + 1);
	    }
	}
	return matrix;
    }
}
