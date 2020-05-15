package ru.job4j.search;

import jdk.jshell.PersistentSnippet;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Класс - телефонный справочник
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

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
	Predicate<Person> predicateByName = (person) -> person.getName().contains(key);
	Predicate<Person> predicateBySurname = (person) -> person.getSurname().contains(key);
	Predicate<Person> predicateByAddress = (person) -> person.getAddress().contains(key);
	Predicate<Person> predicateByPhone = (person) -> person.getPhone().contains(key);
	Predicate<Person> combine = predicateByName.or(predicateBySurname).or(predicateByAddress).or(predicateByPhone);
	var result = new ArrayList<Person>();
	for (Person person : persons) {
	    if (combine.test(person)) {
		result.add(person);
	    }
	}
	return result;
    }
}