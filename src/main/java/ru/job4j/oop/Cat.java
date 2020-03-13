package ru.job4j.oop;

/**
 * Класс котиков!
 *
 * @author RinZ26
 */
public class Cat {
    /**
     * Имя котика
     */
    private String name;
    /**
     *  Еда, которую он ел
     */
    private String food;

    public void giveNick(String name) {
	this.name = name;
    }

    public void eat(String food) {
	this.food = food;
    }

    /**
     * Вывод на экран
     */
    public void show() {
	System.out.printf("%s кушал %s\n", name, food);
    }
    /**
     * Мяу-мяу
     *
     * @return мяу
     */
    public String sound() {
	return "may-may";
    }

    public static void main(String[] args) {
	System.out.println("There are gav's food.");
	Cat gav = new Cat();
	gav.giveNick("gav");
	gav.eat("kotleta");
	gav.show();
	System.out.println("There are black's food.");
	Cat black = new Cat();
	black.giveNick("black");
	black.eat("fish");
	black.show();
    }
}
