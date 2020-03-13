package ru.job4j.oop;

/**
 * Интересные истории
 *
 * @author RinZ26
 */
public class BallStory {
    public static void main(String[] args) {
	Ball kolobok = new Ball();
	Wolf wolf = new Wolf();
	Fox fox = new Fox();
	Hare hare = new Hare();

	wolf.tryEat(kolobok);
	fox.tryEat(kolobok);
	hare.tryEat(kolobok);
	kolobok.tryEat(kolobok);
    }
}
