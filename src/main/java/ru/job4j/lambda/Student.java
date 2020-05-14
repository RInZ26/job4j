package ru.job4j.lambda;

import java.util.Comparator;

/**
 * Класс-модель данных для работы с stream
 * @author RinZ26
 */
public class Student implements Comparable<Student> {
    String surname;
    int score;

    public String getSurname() {
	return surname;
    }

    public void setSurname(String surname) {
	this.surname = surname;
    }

    public int getScore() {
	return score;
    }

    public void setScore(int score) {
	this.score = score;
    }

    public Student(String surname, int score) {
	this.surname = surname;
	this.score = score;
    }


    @Override
    public int compareTo(Student o) {
	return Integer.compare(this.getScore(), o.getScore());
    }
}
