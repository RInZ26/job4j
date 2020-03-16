package ru.job4j.pojo;

/**
 * Класс тестировщик для класса Book
 *
 * @author RinZ26
 */
public class Library {
    public static void main(String[] args) {
	Book[] array = new Book[4];
	String[] bookNames = new String[]{"Капитанская дочка", "Ребекка", "Поющие в терновнике", "Clean code"};
	for (int c = 0; c < array.length; c++) {
	    array[c] = new Book();
	    array[c].setName(bookNames[c]);
	    array[c].setCountOfPages(array[c].getName().length() * (c + 10));
	}

	System.out.println(System.lineSeparator() + "Изначальное содержимое " + System.lineSeparator());
	for (Book book : array) {
	    System.out.println(book.getName() + "  " + book.getCountOfPages());
	}

	System.out.println(System.lineSeparator() + "После перстановки 0 и 3 книги" + System.lineSeparator());
	Book temp = array[0];
	array[0] = array[3];
	array[3] = temp;
	temp = null;

	for (Book book : array) {
	    System.out.println(book.getName() + "  " + book.getCountOfPages());
	}

	System.out.println(System.lineSeparator() + "Вывод на экран Clean Code" + System.lineSeparator());
	for (Book book : array) {
	    if (book.getName().equals("Clean code")) {
		System.out.println(book.getName() + "  " + book.getCountOfPages());
	    }
	}
    }
}
