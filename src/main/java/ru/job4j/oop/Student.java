package ru.job4j.oop;

/**
 * Класс студент
 *
 * @author RinZ26
 */
public class Student {
    /**
     * Метод тра-та-та!
     */
    public void music() {
	System.out.println("Tra tra tra");
    }

    /**
     * Метод пения
     */
    public void song() {
	System.out.println("I believe i can fly");
    }

    public static void main(String[] args) {
	Student petya = new Student();
	for (int c = 0; c < 3; c++) {
	    petya.music();
	}
	for (int c = 0; c < 3; c++) {
	    petya.song();
	}
    }
}
