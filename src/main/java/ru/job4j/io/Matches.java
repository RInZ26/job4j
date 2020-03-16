package ru.job4j.io;

import java.util.Scanner;

/**
 * Класс для игр в спички!
 *
 * @author RinZ26
 */
public class Matches {
    public static void main(String[] args) {
	int currentCountOfMatches = 11;
	Scanner scanner = new Scanner(System.in);
	boolean whichTurn = false; // true - 1, false - 2
	while (currentCountOfMatches > 0) {
	    whichTurn = !whichTurn;
	    System.out.printf(System.lineSeparator() + "Ход %s игрока: " + System.lineSeparator(), whichTurn ? "первого" : "второго");
	    showCurrentCountOfMatches(currentCountOfMatches);
	    int playerDesire = -1;
	    while (playerDesire < 1 || playerDesire > 3) {
		System.out.println("Введите кол-во спичек, которые хотите забрать (от 1 до 3)");
		playerDesire = scanner.nextInt();
	    }
	    currentCountOfMatches -= playerDesire;
	    showCurrentCountOfMatches(currentCountOfMatches);
	}
	System.out.printf("Победил %s игрок!!!", whichTurn ? "первый" : "второй");
    }

    /**
     * следуем DRY и выводим на экран
     *
     * @param countOfMatches количество спичек
     */
    public static void showCurrentCountOfMatches(int countOfMatches) {
	System.out.println("Текущее количество спичек: " + (countOfMatches >= 0 ? countOfMatches : "меньше ноля!"));
    }
}
