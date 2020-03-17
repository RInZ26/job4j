package ru.job4j.strategy;

/**
 * Класс для прорисовки фигур в консоль. Используется для демонстрации работы шаблона стратегия
 *
 * @author RinZ26
 */
public class Paint {
    public void draw(Shape shape) {
	System.out.println(shape.draw());
    }

    public static void main(String[] args) {
	Paint paint = new Paint();
	paint.draw(new Triangle());
	System.out.println();
	paint.draw(new Square());
    }
}
