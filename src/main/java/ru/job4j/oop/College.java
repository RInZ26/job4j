package ru.job4j.oop;

/**
 * Класс колледж для теста полиморфизма классов Object - Student Freshman
 *
 * @author RinZ26
 */
public class College {

    public static void main(String[] args) {
	Object object = new Object();
	Student student = new Student();
	Freshman freshman = new Freshman();
	student = freshman;
	object = freshman;
    }

}
