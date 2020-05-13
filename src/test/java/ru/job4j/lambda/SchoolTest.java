package ru.job4j.lambda;

import org.junit.Test;


import java.util.*;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void roadToClassC() {
	List<Student> listOfStudents = Arrays.asList(new Student("Yarkov", 11),
		new Student("Skvorchuk", 99),
		new Student("Panaeva", 56),
		new Student("Ludishev", 39));
	Predicate<Student> predictZeroFifty = student -> student.getScore() <= 50 && student.getScore() >= 0;
	List<Student> result = School.collect(listOfStudents, predictZeroFifty);
	assertThat(result, is(Arrays.asList(listOfStudents.get(0), listOfStudents.get(3))));
    }

    @Test
    public void roadToClassB() {
	List<Student> listOfStudents = Arrays.asList(new Student("Yarkov", 11),
		new Student("Skvorchuk", 99),
		new Student("Panaeva", 56),
		new Student("Ludishev", 39));
	Predicate<Student> predictFiftySeventy = student -> student.getScore() <= 70 && student.getScore() >= 51;
	List<Student> result = School.collect(listOfStudents, predictFiftySeventy);
	assertThat(result, is(Arrays.asList(listOfStudents.get(2))));
    }

    @Test
    public void roadToClassA() {
	List<Student> listOfStudents = Arrays.asList(new Student("Yarkov", 11),
		new Student("Skvorchuk", 99),
		new Student("Panaeva", 56),
		new Student("Ludishev", 39));
	Predicate<Student> predictSeventyOneHundred = student -> student.getScore() <= 100 && student.getScore() >= 71;
	List<Student> result = School.collect(listOfStudents, predictSeventyOneHundred);
	assertThat(result, is(Arrays.asList(listOfStudents.get(1))));
    }

    /**
     * Заполнение вручную, потому что циклы и т.п. в тестах плохо!
     */
    @Test
    public void listToMapSimple() {
	List<Student> listOfStudents = Arrays.asList(new Student("Yarkov", 11),
		new Student("Skvorchuk", 99),
		new Student("Panaeva", 56),
		new Student("Ludishev", 39));
	Map<String, Student> mapOfStudents = School.listToMap(listOfStudents);
	Map<String, Student> expected = new HashMap<>();
	expected.put(listOfStudents.get(0).getSurname(), listOfStudents.get(0));
	expected.put(listOfStudents.get(1).getSurname(), listOfStudents.get(1));
	expected.put(listOfStudents.get(3).getSurname(), listOfStudents.get(3));
	expected.put(listOfStudents.get(2).getSurname(), listOfStudents.get(2));
	assertThat(mapOfStudents, is(expected));
    }
}
