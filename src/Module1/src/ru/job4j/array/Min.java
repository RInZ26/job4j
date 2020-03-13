package ru.job4j.array;

/**
 * Ищем и находим минимум
 *
 * @author RinZ26
 */
public class Min {
    /**
     * Поиск минимума в массиве
     *
     * @param array исходный массив
     * @return минимум
     */
    public static int findMin(int[] array) {
	int min = array[0];
	for (int value : array) {
	    if (min > value) {
		min = value;
	    }
	}
	return min;
    }
}
