package ru.job4j.inheritance;

/**
 * Класс хищник
 *
 * @author RinZ26
 */
public class Predator extends Animal {
    /**
     * Конструктор по умолчанию
     */
    public Predator() {
	super();
	System.out.println(Predator.class.getName());
    }

    /**
     * Конструктор с именем
     */
    public Predator(String name) {
	super(name);
	System.out.println(Predator.class.getName());
    }
}