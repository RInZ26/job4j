package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    /**
     * Сравниваем разницу чаров, при первом несовпадении возвращаем разницу
     * В конце, если в цикле разница не проявилась и result == 0, сравниваем длину строк
     * @param left - первая строка
     * @param right - вторая строка
     * @return результат сравнения
     */
    public int compare(String left, String right) {
	int result = 0;
	for (int leftCounter = 0, rightCounter = 0; leftCounter < left.length() && rightCounter < right.length(); leftCounter++, rightCounter++) {
	    int diff = Character.compare(left.charAt(leftCounter), right.charAt(rightCounter));
	    if (diff != 0) {
		result = diff;
		break;
	    }
	}
	result = result == 0 ? left.length() - right.length() : result;
	return result;
    }
}