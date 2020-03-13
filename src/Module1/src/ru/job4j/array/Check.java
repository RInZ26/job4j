package ru.job4j.array;

/**
 * Класс для проверок массивов
 *
 * @author RinZ26
 */
public class Check {
    /**
     * Массив заполнен однородно или нет
     *
     * @param data исходный массив
     * @return true - массив однороден / false - нет
     */
    public static boolean mono(boolean[] data) {
	boolean model = data[0];
	for (boolean temp : data) {
	    if (temp != model) {
		return false;
	    }
	}
	return true;
    }
}
