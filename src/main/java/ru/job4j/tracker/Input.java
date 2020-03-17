package ru.job4j.tracker;

/**
 * Определяет работу получения данных от пользователя в консоли
 *
 * @author RinZ26
 */
public interface Input {
    String askStr(String question);

    int askInt(String question);
}
