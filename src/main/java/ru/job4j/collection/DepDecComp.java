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
     * @param o1 первая строка
     * @param o2 вторая строка
     * @return результат сравнения
     */
    @Override
    public int compare(String o1, String o2) {
	String[] splittedO1 = o1.split("/");
	String[] splittedO2 = o2.split("/");
	String firstPartOfO1 = splittedO1.length == 0 ? o1 : splittedO1[0];
	String secondPartOfO1 = splittedO2.length == 0 ? o2 : splittedO2[0];
	return secondPartOfO1.compareTo(firstPartOfO1) == 0 ? o1.compareTo(o2) : o2.compareTo(o1);
    }
}
