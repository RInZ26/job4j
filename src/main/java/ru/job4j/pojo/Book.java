package ru.job4j.pojo;

/**
 * Класс модель данных - Книга
 *
 * @author RinZ26
 */
public class Book {
    /**
     * Название книги
     */
    private String name;
    /**
     * Количество страниц
     */
    private int countOfPages;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getCountOfPages() {
	return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
	this.countOfPages = countOfPages;
    }

}
