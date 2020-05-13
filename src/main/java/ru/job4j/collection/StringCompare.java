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
	for (int c = 0; c < Math.min(left.length(), right.length()); c++) {
	    int diff = Character.compare(left.charAt(c), right.charAt(c));
	    if (diff != 0) {
		result = diff;
		break;
	    }
	}
	return result == 0 ? Integer.compare(left.length(), right.length()) : result;
    }
}