package ru.job4j.inheritance;

import java.util.Date;

/**
 * Класс инженера
 *
 * @author RinZ26
 */
public class Engineer extends Profession {
    /**
     * Сердце инженера
     */
    boolean heart;
    /**
     * мозги инженера
     */
    boolean brain;
    /**
     * мечта инженера
     */
    Profession girl;

    /**
     * Реальный конструктор
     * @param name ~
     * @param surname ~
     * @param education ~
     * @param birthday ~
     * @param heart ~
     * @param brain ~
     */
    public Engineer(String name, String surname, String education, Date birthday, boolean heart, boolean brain) {
	super(name, surname, education, birthday);
	this.heart = heart;
	this.brain = brain;
    }

    /**
     * Нереальный конструктор (girl)
     * @param name ~
     * @param surname ~
     * @param education ~
     * @param birthday ~
     * @param heart ~
     * @param brain ~
     * @param girl ~
     */
    public Engineer(String name, String surname, String education, Date birthday, boolean heart, boolean brain, Profession girl) {
	super(name, surname, education, birthday);
	this.heart = heart;
	this.brain = brain;
	this.girl = girl;
    }

    /**
     * Проверка на раздражимость
     * @return ~
     */
    public boolean isAnnoying() {
        return heart || brain;
    }
}
