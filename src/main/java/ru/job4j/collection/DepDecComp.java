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
     * Далее сравниваем подстроки между собой до тех пор, пока их количество совпадает в обоих массивах.
     * Если разницы не выявлено, проверяем одиноково ли в строках символов
     *
     * @param left первая строка
     * @param right вторая строка
     * @return результат сравнения
     */
    @Override
    public int compare(String left, String right) {
	int diff = 0;
	String[] splittedLeft = left.split("/");
	String[] splittedRight = right.split("/");
	if (splittedLeft.length == 0) {
	    splittedLeft = new String[]{left};
	}
	if (splittedRight.length == 0) {
	    splittedRight = new String[]{right};
	}

	for (int c = 0; c < splittedLeft.length && c < splittedRight.length; c++) {
	    diff = c == 0 ? splittedRight[c].compareTo(splittedLeft[c]) : splittedLeft[c].compareTo(splittedRight[c]);
	    if (diff != 0) {
		break;
	    }
	}
	if (diff == 0 && left.length() != right.length()) {
	    diff = left.length() - right.length();
	}

	return diff;
    }
}
