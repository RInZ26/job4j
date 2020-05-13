package ru.job4j.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Класс для работы со Student и stream
 *
 * @author RinZ26
 */
public class School {
    static List<Student> collect(List<Student> students, Predicate<Student> predict) {
	return students.stream().filter(predict).collect(Collectors.toList());
    }
}
