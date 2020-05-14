package ru.job4j.collection;

/**
 * Класс - для работы со списками, который может восстнавливаться и поддерживать сортировку
 *
 * @author RinZ26
 */

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {

	Set<String> rsl = new HashSet<>();
	for (String record : deps) {
	    record = record.toLowerCase();
	    String[] splittedString = record.split("/");
	    String partOfRecord = "";
	    for (int c = 0; c < splittedString.length; c++) {
		partOfRecord += c != 0 ? "/" : "";
		partOfRecord += splittedString[c];
		rsl.add(partOfRecord);
	    }
	}
	return new ArrayList<>(rsl);
    }

    public static void sortAsc(List<String> orgs) {
	Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
	Collections.sort(orgs, new DepDecComp());
    }

}