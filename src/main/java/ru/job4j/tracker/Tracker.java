package ru.job4j.tracker;

import com.sun.source.tree.LiteralTree;

import java.util.Arrays;
import java.util.Random;

/**
 * Класс обертка над массива - храналище заявок
 *
 * @author RinZ26
 */
public class Tracker {
    /**
     * Массив для хранения заявок
     */
    private Item[] items = new Item[100];
    /**
     * Указатель для новой записи
     */
    private int position = 0;

    /**
     * Добавление заявки в наш массив, вообще не помешала бы проверка на заполненность и копирование в новый массив при переполнении,
     * чтоб уж полностью скопировать ArrayList
     *
     * @param item добавляемая заявка
     */
    public void add(Item item) {
	item.setId(generateId());
	items[position++] = item;
    }

    /**
     * Метод для создания Item.id на основе текущей даты и ГСЧ
     *
     * @return полученный id
     */
    private String generateId() {
	Random rnd = new Random();
	return String.valueOf(rnd.nextLong() + System.currentTimeMillis());
    }

    /**
     * Возвращает копию массива без null элементов, а у нас не NULL элементы лежат как раз от [0; position -1]
     * то есть можно даже не проверять внутренние элементы
     *
     * @return массив без null
     */
    public Item[] findAll() {
	return Arrays.copyOf(items, position);
    }

    /**
     * Возвращает массив, элементы Item.name == key
     *
     * @param key ключ
     * @return отфильттрованный массив
     */
    public Item[] fidByName(String key) {
	Item[] items = new Item[this.position];
	int size = 0;
	for (int c = 0; c < position; c++) {
	    if (this.items[c].getName().equals(key)) {
		items[size++] = this.items[c];
	    }
	}
	return Arrays.copyOf(items, size);
    }

    /**
     * Поиск элемента по id
     *
     * @param id id
     * @return элемент есть ? id : null
     */
    public Item findById(String id) {
	int index = indexOf(id);
	return index == -1 ? null : items[index];
    }

    /**
     * Замена ячеек по id
     *
     * @param id   id ячейки, которой меняем
     * @param item заявка, на которую меняем
     * @return id есть ? поменяли true : false
     */
    public boolean replace(String id, Item item) {
	boolean result = false;
	int index = indexOf(id);
	if (index != -1) {
	    items[index] = item;
	    items[index].setId(id);
	    result = true;
	}
	return result;
    }

    /**
     * Возвращает индекс заявки в items, если нашли такой id
     *
     * @param id id
     * @return индекс
     */
    private int indexOf(String id) {
	int result = -1;
	for (int c = 0; c < position; c++) {
	    if (items[c].getId().equals(id)) {
		result = c;
		break;
	    }
	}
	return result;
    }


}
