package ru.job4j.lambda;

import ru.job4j.oop.College;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Класс - группировка по интересам для класса Student
 */
public class Group {
    /**
     * Выбиваем из студента лист интересов, далее бьём этот лист интересов на потоки, в каждом из которых собираем новый объект Holder, затем всё группируем
     * @param students
     * @return
     */
    public static Map<String, Set<String>> sections(List<InterestedStudent> students) {
	return students.stream().flatMap(student -> student.getUnits().stream().map(unit -> new Holder(unit, student.getName())))
		.collect(Collectors.groupingBy(Holder::getKey, Collectors.mapping(Holder::getValue, Collectors.toSet())));
    }

    /**
     * Наш статический класс для хранения пары имя секции - имя студента
     */
    static class Holder {
	String key, value;

	public String getKey() {
	    return key;
	}

	public void setKey(String key) {
	    this.key = key;
	}

	public String getValue() {
	    return value;
	}

	public void setValue(String value) {
	    this.value = value;
	}

	Holder(String key, String value) {
	    this.key = key;
	    this.value = value;
	}
    }
}