package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс - компаратор Decrement Name для Job
 * @author RinZ26
 */
public class JobDecByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
	return o2.getName().compareTo(o1.getName());
    }
}
