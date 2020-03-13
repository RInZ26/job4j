package ru.job4j.array;

/**
 * Класс для метаморфоз с массивами
 *
 * @author RinZ26
 */
public class Turn {
    /**
     * Метод для reverse array
     *
     * @param array заданный массив
     * @return перевернутый массив
     */
    public int[] back(int[] array) {
	for (int c = 0; c < array.length / 2; c++) {
	    int temp = array[c];
	    array[c] = array[array.length - 1 - c];
	    array[array.length - 1 - c] = temp;
	}
	return array;
    }
}
