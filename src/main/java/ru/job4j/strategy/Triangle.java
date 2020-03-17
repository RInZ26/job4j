package ru.job4j.strategy;

import java.util.StringJoiner;

public class Triangle implements Shape {
    /**
     * Возвращает фигуру в виде строки
     *
     * @return ~
     */
    @Override
    public String draw() {
        int size = 7;
	StringJoiner sj = new StringJoiner(System.lineSeparator());
	for (int c = 0; c < size; c += 2) {
	    StringJoiner tempSJ = new StringJoiner("");
	    for (int i = 0; i < (size - c) / 2; i++) {
		tempSJ.add(" ");
	    }
	    for (int i = 0; i < c + 1; i++) {
		tempSJ.add("*");
	    }
	    sj.add(tempSJ.toString());
	}
	return sj.toString();
    }
}
