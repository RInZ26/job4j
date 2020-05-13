package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Класс - телефонный справочник
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
	this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
	BiPredicate<Person, String> predicateByName = (person, str) -> person.getName().contains(str);
	BiPredicate<Person, String> predicateBySurname = (person, str) -> person.getSurname().contains(str);
	BiPredicate<Person, String> predicateByAddress = (person, str) -> person.getAddress().contains(str);
	BiPredicate<Person, String> predicateByPhone = (person, str) -> person.getPhone().contains(str);
	BiPredicate<Person, String> combine = predicateByName.or(predicateBySurname).or(predicateByAddress).or(predicateByPhone);

	ArrayList<Person> result = new ArrayList<>();
	for (Person person : persons) {
	    if (combine.test(person, key)) {
		result.add(person);
	    }
	}
	return result;
    }
}