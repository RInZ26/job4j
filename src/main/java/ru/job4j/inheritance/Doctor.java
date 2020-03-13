package ru.job4j.inheritance;

import java.util.Date;

/**
 * Класс доктор
 *
 * @author RinZ26
 */
public class Doctor extends Profession {
    /**
     * Имеет ли доктор опыт практики
     */
    boolean practice;

    public Doctor(String name, String surname, String education, Date birthday, boolean practice) {
	super(name, surname, education, birthday);
	this.practice = practice;
    }

    public void heal(Profession man) {
        System.out.printf(practice ?  "I heal u dude %s !!! Wait a minute" : "Lol, u died dude %s", man.getName());
    }
    public boolean getPractice() {
	return practice;
    }
}
