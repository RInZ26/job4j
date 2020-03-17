package ru.job4j.strategy;

import java.util.StringJoiner;

/**
 * Класс квадрата для демонстрации работы шаблона стратегия
 *
 * @author RinZ26
 */
public class Square implements Shape {
    /**
     * Возвращает фигуру в виде строки
     *
     * @return ~
     */
    @Override
    public String draw() {
	int size = 8;
	StringJoiner sj = new StringJoiner(System.lineSeparator());
	for (int c = 0; c < size; c++) {
	    sj.add("***************");
	}
	return sj.toString();
    }
}
