package ru.job4j.inheritance;

/**
 * Класс животное
 *
 * @author RinZ26
 */
public class Animal {
    /**
     * Конструктор по умолчанию
     */
    Animal() {
        super();
	System.out.println(Animal.class.getName());
    }

    public static void main(String[] args) {
	Tiger tiger = new Tiger();
    }
}
