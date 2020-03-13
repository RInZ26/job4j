package ru.job4j.inheritance;

import java.util.Date;

/**
 * Класс дантист
 *
 * @author RinZ26
 */
public class Dentist extends Doctor {
    /**
     * у каждого дантиста есть жестокость
     */
    int cruelty;

    /**
     * Конструктор
     *
     * @param name       ~
     * @param surname    ~
     * @param education  ~
     * @param birthday   ~
     * @param isPractice ~
     * @param cruelty    ~
     */
    public Dentist(String name, String surname, String education, Date birthday, boolean isPractice, int cruelty) {
	super(name, surname, education, birthday, isPractice);
	this.cruelty = cruelty;
    }

    /**
     * Метод а-ля операция
     *
     * @param heWillSuffer жертва
     */
    public void makeAnOperation(Profession heWillSuffer) {
	while (cruelty < 100) {
	    makeThePain(heWillSuffer);
	    heal(heWillSuffer);
	}
    }

    /**
     * Метод смысл жизни дантиста
     *
     * @param heWillSuffer жертва
     */
    public void makeThePain(Profession heWillSuffer) {
	heWillSuffer.name = heWillSuffer.getName() + "<";
	cruelty += heWillSuffer.getName().length();
    }
}
