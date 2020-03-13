package ru.job4j.array;

/**
 * Поиск минмимума в диапазоне !!!
 *
 * @author RinZ26
 */
public class MinDiapason {
    /**
     * Поиск минимума в диапазоне массива
     *
     * @param array  заданный массив
     * @param start  начало диапазона
     * @param finish конец диапазона
     * @return минимум
     */
    public static int findMin(int[] array, int start, int finish) {
	int min = array[start];
	for (int i = start + 1; i <= finish; i++) {
	    if (min > array[i]) {
		min = array[i];
	    }
	}
	return min;
    }
}
