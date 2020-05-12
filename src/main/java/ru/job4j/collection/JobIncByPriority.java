package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс - компаратор Increment Name для Job
 * @author RinZ26
 */
public class JobIncByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
	return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
