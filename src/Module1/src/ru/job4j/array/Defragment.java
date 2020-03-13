package ru.job4j.array;

/**
 * Клаcc для работы с массивами
 *
 * @author RinZ26
 */
public class Defragment {
    /**
     * Дефрагментация массива
     *
     * @param array исходный массив
     * @return скомпресованный массив
     */
    public static String[] compress(String[] array) {
	for (int index = 0; index < array.length; index++) {
	    if (array[index] == null) {
		for (int i = index; i < array.length; i++) {
		    if (array[i] != null) {
			array[index] = array[i];
			array[i] = null;
			break;
		    }
		}
	    }
	    System.out.print(array[index] + " ");
	}
	return array;
    }
}
