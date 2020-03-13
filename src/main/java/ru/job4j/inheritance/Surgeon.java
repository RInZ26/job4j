package ru.job4j.inheritance;

import java.util.Date;

/**
 * Класс хирурга
 *
 * @author RinZ26
 */
public class Surgeon extends Doctor {
    /**
     * Количество зарезанных
     */
    int countOfDeadPacients;

    /**
     * Конструктор
     * @param name ~
     * @param surname ~
     * @param education ~
     * @param birthday ~
     * @param isPractice ~
     * @param countOfDeadPacients ~
     */
    public Surgeon(String name, String surname, String education, Date birthday, boolean isPractice, int countOfDeadPacients) {
	super(name, surname, education, birthday, isPractice);
	this.countOfDeadPacients = countOfDeadPacients;
    }

    /**
     * Меняем профессию (пол)
     * @param victim жертва
     * @return новый ты
     */
    public Profession changeProfessionBySaw(Profession victim) {
        if (victim instanceof Programmer) {
	    System.out.println("Now we can punish people with each other!!! ");
	    return new Surgeon(victim.getName(), victim.surname, victim.education, victim.birthday, false, 0);
	} else {
	    System.out.printf("Die trash haha. U will be my %d fresh meat", ++countOfDeadPacients);
	}
        return null;
    }
}
