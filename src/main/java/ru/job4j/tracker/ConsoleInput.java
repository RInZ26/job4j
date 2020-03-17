package ru.job4j.tracker;

/**
 * Класс замена Scanner
 *
 * @author RinZ26
 */
public class ConsoleInput implements Input {
    /**
     * Аналог Scanner.nextLine()
     *
     * @param question строка перед запросом ввода от пользовалея
     * @return пользовательская строка
     */
    @Override
    public String askStr(String question) {
	return null;
    }

    /**
     * Аналог askStr, только с числов
     *
     * @param question строка перед запросом ввода от пользовалея
     * @return пользовательское число
     */
    @Override
    public int askInt(String question) {
	return 0;
    }

}
