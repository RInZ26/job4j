package ru.job4j.oop;

/**
 * Класс батареи
 *
 * @author RinZ26
 */
public class Battery {
    /**
     * Заряд
     */
    private int load;

    public Battery(int load) {
	this.load = load;
    }

    /**
     * Переливание заряда
     *
     * @param another другая батарея
     */
    public void exchange(Battery another) {
	another.load += this.load;
	this.load = 0;
    }

    public static void main(String[] args) {
	Battery first = new Battery(10);
	Battery second = new Battery(5);
	System.out.println("first : " + first.load + ". second : " + second.load);
	first.exchange(second);
	System.out.println("first : " + first.load + ". second : " + second.load);
    }
}
