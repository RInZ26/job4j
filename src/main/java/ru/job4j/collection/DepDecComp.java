package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс-компаратор по убыванию для Departments
 *
 * @author RinZ26
 */
public class DepDecComp implements Comparator<String> {
    /**
     *
     * @param first  первая строка
     * @param second вторая строка
     * @return результат сравнения
     */
    @Override
    public int compare(String first, String second) {
	String[] splittedFirst = first.split("/");
	String[] splittedSecond = second.split("/");
	int result = splittedSecond[0].compareTo(splittedFirst[0]);
	return result == 0 ? first.compareTo(second) : result;
    }
}
