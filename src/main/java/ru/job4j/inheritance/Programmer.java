package ru.job4j.inheritance;

import java.util.Date;

/**
 * Класс программиста
 *
 * @author RinZ26
 */
public class Programmer extends Engineer {
    /**
     * крутость программиста
     */
    boolean cool;

    /**
     * Конструктор
     * @param name ~
     * @param surname ~
     * @param education ~
     * @param birthday ~
     * @param heart ~
     * @param brain ~
     */
    public Programmer(String name, String surname, String education, Date birthday, boolean heart, boolean brain) {
	super(name, surname, education, birthday, heart, brain);
	cool = true;
    }

    /**
     * Перегруженный метод для проверки раздражимости
     * @return ~
     */
    @Override
    public boolean isAnnoying() {
	return !cool;
    }
}
