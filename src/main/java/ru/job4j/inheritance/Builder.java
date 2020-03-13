package ru.job4j.inheritance;

import java.util.Date;

/**
 * Класс строитель
 *
 * @author RinZ26
 */
public class Builder extends Engineer {
    /**
     * параметр мощи
     */
    int power;

    @SuppressWarnings("checkstyle:ParameterNumber")
    public Builder(String name, String surname, String education, Date birthday, boolean heart, boolean brain, Profession girl, int power) {
	super(name, surname, education, birthday, heart, brain, girl);
	this.power = power;
    }

    public void showAbilities() {
	System.out.printf("I have only %d and this is all", power);
    }
}
