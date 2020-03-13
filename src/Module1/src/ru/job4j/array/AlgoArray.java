package ru.job4j.array;

/**
 * Класс для отработки алгоритмов
 *
 * @author RinZ26
 */
public class AlgoArray {
    public static void main(String[] args) {
	int[] array = new int[]{5, 3, 2, 1, 4};
	for (int i = 0; i < array.length - 1; i++) {
	    if (array[i] > array[i + 1]) {
		int temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
		i = -1;
	    }
	}
	for (int value : array) {
	    System.out.println(value);
	}
    }
}
