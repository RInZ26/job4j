package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс-компаратор по убыванию для Departments
 *
 * @author RinZ26
 */
public class DepDecComp implements Comparator<String> {
    /**
     * Сначала нужно проверить, что строка сплитуется
     * Если нет, значит это одиночный K  и мы его кидаем в неотсплитованный массив
     * Потом просто сортировка обычная
     *
     * @param first первая строка
     * @param second вторая строка
     * @return результат сравнения
     */
    @Override
    public int compare(String first, String second) {
	String[] splittedFirst = first.split("/");
	String[] splittedSecond = second.split("/");
	String firstPartOfO1 = splittedFirst.length == 0 ? first : splittedFirst[0];
	String secondPartOfO1 = splittedSecond.length == 0 ? second : splittedSecond[0];
	return secondPartOfO1.compareTo(firstPartOfO1) == 0 ? first.compareTo(second) : second.compareTo(first);
    }
}
