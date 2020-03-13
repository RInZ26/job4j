package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Класс Точки обновленный
 *
 * @author RinZ26
 */
public class Point {
    private int x;

    private int y;

    private int z;

    /**
     * Конструктор для двумерки
     *
     * @param first  x
     * @param second y
     */
    public Point(int first, int second) {
	this.x = first;
	this.y = second;
    }

    /**
     * Конструктор для трехмерки
     *
     * @param x x
     * @param y y
     * @param z z
     */
    public Point(int x, int y, int z) {
	this.x = x;
	this.y = y;
	this.z = z;
    }

    /**
     * Вычисление расстояния между двумя точками в двухмерном пространстве
     * @param that дргугая точка
     * @return расстояние
     */
    public double distance(Point that) {
	return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Вычисление расстояния между двумя точками в трехмерном пространстве
     * @param that другая точка
     * @return расстояние
     */
    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }
    public static void main(String[] args) {
    }
}
