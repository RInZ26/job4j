package ru.job4j.loop;

import ru.job4j.condition.StringEq;

public class Board {
    public static void paint(int width, int height) {
	for (int i = 0; i < height; i++) {
	    for (int j = 0; j < width; j++) {
		System.out.print(((i + j) % 2 == 0 ? 'X' : ' '));
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args) {
	paint(3, 3);
	System.out.println();
	paint(4, 4);
    }

}
