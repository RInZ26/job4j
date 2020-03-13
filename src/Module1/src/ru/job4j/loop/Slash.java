package ru.job4j.loop;

/**
 * Class Класс длс для отрисовки крестика
 *
 * @author RinZ26
 * @version 1
 * @since 06.03.2020
 */
public class Slash {
    /**
     * Отрисовка.
     *
     * @param size размер квадрата, в котором будет нарисован крестик
     */
    public static void draw(int size) {
	for (int row = 0; row < size; row++) {
	    for (int ceil = 0; ceil < size; ceil++) {
		System.out.print((row == ceil || ceil == (size - 1) - row) ? '0' : ' ');
	    }
	    System.out.println();
	}
    }

    /**
     * Main.
     *
     * @param args - аргументы
     */
    public static void main(String[] args) {
	System.out.println("Draw by 3");
	draw(3);
	System.out.println();
	System.out.println("Draw by 5");
	draw(5);
	System.out.println();
	System.out.println("Draw by 10 (Experement with even size!)");
	draw(10); //вроде бы неужасно
    }
}
