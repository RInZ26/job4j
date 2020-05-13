package ru.job4j.lambda;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Класс для работы со Student и stream
 *
 * @author RinZ26
 */
public class School {
    /**
     * Перераспределение студентов согласно условию
     * @param students Список студентов
     * @param predict условие
     * @return обработанный лист
     */
    static List<Student> collect(List<Student> students, Predicate<Student> predict) {
	return students.stream().filter(predict).collect(Collectors.toList());
    }

    /**
     * Преобразование List to Map с ключом фамилия, зачение студент
     * @param listOfStudents - исходный List
     * @return Map
     */
    static Map<String, Student> listToMap(List<Student> listOfStudents) {
	return listOfStudents.stream().collect(Collectors.toMap(Student::getSurname, student -> student));
    }
}
