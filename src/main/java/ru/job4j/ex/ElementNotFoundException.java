package ru.job4j.ex;

/**
 * Моё исключение для демонстрации try catch
 */
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
