package ru.job4j.array;

/**
 * Класс для заполнения массива элементами
 * @author RinZ26
 */
public class ArrayLoop {
    /**
     * Заполнение массива
     * @param args args
    * */
    public static void main(String[] args) {
        int[] numbers = new int[5];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i * 2 + 3;
            }
    }
}
