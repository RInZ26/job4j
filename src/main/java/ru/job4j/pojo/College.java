package ru.job4j.pojo;

import java.util.Calendar;
import java.util.Date;

/**
 * Класс колледж для проверки работы класса Student
 *
 * @author RinZ26
 */
public class College {
    public static void main(String[] args) {
	Student matvey = new Student();
	matvey.setFullName("Матвей Мехабузер");
	matvey.setGroupId("Diamond");
	matvey.setReceiptDate(new Date(2010, Calendar.AUGUST, 14));

	showStudent(matvey);
    }

    public static void showStudent(Student student) {
	System.out.println(student.getFullName() + " " + student.getGroupId() + " " + student.getReceiptDate());
    }
}
