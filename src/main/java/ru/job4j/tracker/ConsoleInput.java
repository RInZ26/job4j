package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс замена Scanner
 *
 * @author RinZ26
 */
public class ConsoleInput implements Input {
    /**
     * Взаимодействие со Scanner
     */
    public static Scanner scanner = new Scanner(System.in);
    /**
     * Аналог Scanner.nextLine()
     *
     * @param question строка перед запросом ввода от пользовалея
     * @return пользовательская строка
     */
    @Override
    public String askStr(String question) {
	System.out.println(question);
	return scanner.nextLine();
    }

    /**
     * Аналог askStr, только с числов
     *
     * @param question строка перед запросом ввода от пользовалея
     * @return пользовательское число / -1 ошибка парсинга
     */
    @Override
    public int askInt(String question) {
	System.out.println(question);
        return scanner.hasNextInt() ? Integer.parseInt(scanner.nextLine()) : -1;
    }

}
