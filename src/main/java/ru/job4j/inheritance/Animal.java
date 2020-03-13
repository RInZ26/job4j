package ru.job4j.inheritance;

/**
 * Класс животное
 *
 * @author RinZ26
 */
public class Animal {
    /**
     * Имя
     */
    String name;
    /**
     * Конструктор по умолчанию
     */
    Animal() {
	super();
	System.out.println(Animal.class.getName());
    }

    /**
     * Конструктор с именем
     * @param name имя
     */
    Animal(String name) {
	super();
	this.name = name;
	System.out.println(Animal.class.getName() + "  " + this.name);
    }
    public static void main(String[] args) {
	Tiger tiger = new Tiger("Matvey");
	System.out.println(tiger.name);
    }
}
