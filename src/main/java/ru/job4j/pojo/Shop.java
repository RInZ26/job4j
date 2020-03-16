package ru.job4j.pojo;

import java.sql.SQLOutput;

/**
 * Класс тестировщик для класса product
 */
public class Shop {
    public static void main(String[] args) {
	Product[] products = new Product[5];
	products[0] = new Product("Milk", 10);
	products[1] = new Product("Bread", 4);
	products[2] = new Product("Egg", 19);
	showArray(products, "До изменений");
	products[1] = null;
	showArray(products, "После удаления элемента");
	for (int c = 0; c < products.length; c++) {
	    if (products[c] == null) {
		deleteEmptyCells(products, c + 1); // здесь можно и не присваивать products результат работы метода, он все равно поменяется
	    }
	}
	showArray(products, "После обработки методом delete");
    }

    /**
     * Метод для редактирования массива так, чтобы все значимые ячейки шли друг за другом без null'ом между собой
     * Я сначала сделал его, а потом прочитал, что у нас сдвиг по индексу #genius
     *
     * @param arrayOfProducts редактируемый массив
     * @return непонятный return, ведь можно было оставить void,все равно мы не создаем в методе новый массив => массив в параметре тоже поменяется
     */
    public static Product[] deleteEmptyCells(Product[] arrayOfProducts) {
	for (int c = 0, pointerOfLastNotNullCell = -1; c < arrayOfProducts.length; c++) {
	    if (arrayOfProducts[c] != null) {
		arrayOfProducts[++pointerOfLastNotNullCell] = arrayOfProducts[c];
		arrayOfProducts[c] = null;
	    }
	}
	return arrayOfProducts;
    }

    /**
     * Метод - судя по всему демонстрация работы удаления в ArrayList
     *
     * @param arrayOfProducts изменяемый массив
     * @param index           индекс, с которого мы сдвигаем влево массив
     * @return
     */
    public static Product[] deleteEmptyCells(Product[] arrayOfProducts, int index) {
	for (int c = index; c < arrayOfProducts.length; c++) {
	    arrayOfProducts[c - 1] = arrayOfProducts[c];
	    arrayOfProducts[arrayOfProducts.length - 1] = null;
	}
	return arrayOfProducts;
    }

    /**
     * Для вывода на экран, чтоб не плодить миллиард форов
     *
     * @param arrayOfProducts массив на показ
     * @param message         Сообщение перед фором
     */
    public static void showArray(Product[] arrayOfProducts, String message) {
	System.out.println(System.lineSeparator() +  message);
	for (Product product : arrayOfProducts) {
	    System.out.println(product == null ? product : product.getName() + "  " + product.getCount());
	}
    }
}
