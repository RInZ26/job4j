package ru.job4j.inheritance;

/**
 * Класс для обертки репортов в JSON
 *
 * @author RinZ26
 */
public class JSONReport extends TextReport {
    /**
     * Обертка в Json формат
     * @param name имя
     * @param body тело
     * @return строка вывода
     */
    @Override
    public String generate(String name, String body) {
	return String.format("{\n\n   %s : %s,\n   %s : %s\n\n}", name, name, body, body);
    }
}
