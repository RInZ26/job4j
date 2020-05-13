package ru.job4j.lambda;

/**
 * Класс-модель данных для работы с stream
 * @author RinZ26
 */
public class Student {
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

}
