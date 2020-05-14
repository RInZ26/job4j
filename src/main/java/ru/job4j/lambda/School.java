package ru.job4j.lambda;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс для работы со Student и stream
 *
 * @author RinZ26
 */
public class School {
    /**
     * Перераспределение студентов согласно условию
     *
     * @param students Список студентов
     * @param predict  условие
     * @return обработанный лист
     */
    static List<Student> collect(List<Student> students, Predicate<Student> predict) {
	return students.stream().filter(predict).collect(Collectors.toList());
    }

    /**
     * Преобразование List to Map с ключом фамилия, зачение студент
     *
     * @param listOfStudents - исходный List
     * @return Map
     */
    static Map<String, Student> listToMap(List<Student> listOfStudents) {
	return listOfStudents.stream().collect(Collectors.toMap(Student::getSurname, student -> student));
    }

    /**
     *
     Метод должен вернуть список студентов у которых балл аттестата больше bound.

     Во входящем списки могут быть null элементы.
     Порядок действий.
     - Используя метод flatMap убрать null
     - Отсортировать список.
     - Используя метод takeWhile получить нужный поток.
     - Сохранить поток в List.
     * @param students список
     * @param bound оценка
     * @return список
     */
    static List<Student> levelOf(List<Student> students, int bound) {
	return students.stream().flatMap(Stream::ofNullable).sorted().dropWhile(x -> x.getScore() <= bound).collect(Collectors.toList());
    }
}
