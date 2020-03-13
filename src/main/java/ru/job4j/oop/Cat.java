package ru.job4j.oop;

/**
 * Класс котиков!
 *
 * @author RinZ26
 */
public class Cat {
    /**
     * Мяу-мяу
     *
     * @return мяу
     */
    public String sound() {
	return "may-may";
    }

    public static void main(String[] args) {
	Cat peppy = new Cat();
	Cat sparky = new Cat();
    }
}
