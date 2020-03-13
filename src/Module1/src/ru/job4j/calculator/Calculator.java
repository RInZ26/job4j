package ru.job4j.calculator;

/**
 * Class Класс для вычисления арифметических операций + - * / ^.
 *
 * @author RinZ26
 */
public class Calculator {
    /**
     * Main
     *
     * @param args - args
     */
    public static void main(String[] args) {
	int numberOne = 1;
	int numberTwo = 2;
	int result = numberOne + numberTwo;
	System.out.println(result);
	System.out.println(result);
    }

    /**
     * Сложение
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public static double add(double first, double second) {
	return first + second;
    }
}