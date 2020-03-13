package ru.job4j.inheritance;

import java.util.Date;

/**
 * Базовый класс профессии
 *
 * @author RinZ26
 */
public class Profession {
    /**
     * Имя
     */
    String name;

    /**
     * Фамилия
     */
    String surname;

    /**
     * образование
     */
    String education;

    /**
     * Дата рождения
     */
    Date birthday;

    /**
     * Базовый конструктор
     * @param name ~
     * @param surname ~
     * @param education ~
     * @param birthday ~
     */
    public Profession(String name, String surname, String education, Date birthday) {
	this.name = name;
	this.surname = surname;
	this.education = education;
	this.birthday = birthday;
    }

    public String getName() {
	return name;
    }
}
