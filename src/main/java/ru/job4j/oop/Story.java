package ru.job4j.oop;

import java.time.Period;

/**
 * Класс интересных историй
 *
 * @author RinZ26
 */
public class Story {
    public static void main(String[] args) {
	Pioneer petya = new Pioneer();
	Girl redHeat = new Girl();
	Wolf wolf = new Wolf();

	redHeat.help(petya);
	wolf.eat(redHeat);
	petya.kill(wolf);
    }
}
