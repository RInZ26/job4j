package ru.job4j.inheritance;

/**
 * Класс тигр
 *
 * @author RinZ26
 */
public class Tiger extends Predator {
    /**
     * Конструктор по умолчанию
     */
    Tiger() {
	super();
	System.out.println(Tiger.class.getName());
    }

    /**
     * Конструктор с именем
     */
    Tiger(String name) {
	super(name);
	System.out.println(Tiger.class.getName());
    }
}