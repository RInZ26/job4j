package ru.job4j.array;

/**
 * Класс для работы с квадратами чисел
 *
 * @author RinZ26
 */
public class Square {
    /**
     * Возведение чисел в квадрат до bound
     *
     * @param bound граница интервала, до которой возводим в квадрат
     * @return массив квадратов чисел
     */
    public static int[] calculate(int bound) {
	int[] array = new int[bound];
	for (int i = 0; i < array.length; i++) {
	    array[i] = (int) Math.pow(i, 2);
	}
	return array;
    }

    public static void main(String[] args) {
	int[] array = calculate(4);
	for (int value : array) {
	    System.out.println(value);
	}
    }
}
