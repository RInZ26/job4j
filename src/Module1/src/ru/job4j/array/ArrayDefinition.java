package ru.job4j.array;

/**
 * Класс для определения массивов!
 *
 * @author RinZ26
 */
public class ArrayDefinition {
    /**
     * Создание различных массивов и вывод на экран
     * @param args -  args
     */
    public static void main(String[] args) {
	short[] ages = new short[10];
	String[] surnames = new String[100500];
	float[] prices = new float[40];
	String[] names = new String[4];
	for (int i = 0; i < names.length; i++) {
	    names[i] = "Name № " + i;
	}
	for (String name : names) {
	    System.out.println(name);
	}
    }
}
