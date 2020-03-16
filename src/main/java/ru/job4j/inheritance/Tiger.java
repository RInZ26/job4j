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
    public Tiger() {
	super();
	System.out.println(Tiger.class.getName());
    }

    /**
     * Конструктор с именем
     */
    public Tiger(String name) {
	super(name);
	System.out.println(Tiger.class.getName());
    }
}