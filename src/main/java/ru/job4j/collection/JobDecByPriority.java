package ru.job4j.collection;

import java.util.Comparator;
/**
 * Класс - компаратор Decrement Priority для Job
 * @author RinZ26
 */
public class JobDecByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
	return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
