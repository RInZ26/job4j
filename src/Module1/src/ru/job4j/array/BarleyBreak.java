package ru.job4j.array;

/**
 * Класс для работы с двумерными матрицами
 *
 * @author RinZ26
 */
public class BarleyBreak {
    public static void main(String[] args) {
	int[][] matrix = new int[3][3];
	for (int i = 0, temp = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		matrix[i][j] = ++temp;
	    }
	}
	for (int[] array : matrix) {
	    for (int n : array) {
		System.out.println(n);
	    }
	}
    }
}
