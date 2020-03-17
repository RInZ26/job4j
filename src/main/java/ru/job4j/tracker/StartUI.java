package ru.job4j.tracker;

import ru.job4j.poly.Transport;

import javax.sound.midi.Track;
import java.util.Scanner;

/**
 * Класс - консольное приложенеие для работы с  Tracker
 *
 * @author RinZ26
 */
public class StartUI {
    /**
     * Опция создать элемент
     *
     * @param input   отвечает за ввод данных от пользователя
     * @param tracker коллекция заявок
     */
    public static void createItem(Input input, Tracker tracker) {
	System.out.println(System.lineSeparator() + "=== Create a new item ===");
	System.out.print("Enter the name: ");
	String name = input.askStr("");
	tracker.add(new Item(name));
    }

    /**
     * Оппция показа всех элементов
     *
     * @param input   отвечает за ввод данных от пользователя
     * @param tracker коллекция заявок
     */
    public static void showItems(Input input, Tracker tracker) {
	System.out.println("=== Show the all items ===");
	for (Item item1 : tracker.findAll()) {
	    System.out.println(item1);
	}
    }

    /**
     * опция редактирования заявкки, аналог Tracker.replace
     *
     * @param input   отвечает за ввод данных от пользователя
     * @param tracker коллекция заявок
     */
    public static void editItem(Input input, Tracker tracker) {
	System.out.println("=== Edit the item by id ===");
	System.out.print("Enter the item's id ");
	String id = input.askStr("");
	Item item = tracker.findById(id);
	if (item == Tracker.EMPTY_ITEM) {
	    System.out.println("The item with this id doesn't exist");
	} else {
	    System.out.printf("Changed item's name: %s ", item.getName());
	    System.out.print(System.lineSeparator() + "Enter new name for this item ");
	    String newItemName = input.askStr("");
	    System.out.println("Operation result: " + tracker.replace(id, new Item(newItemName)));
	}
    }

    /**
     * Опция удаления элемента
     *
     * @param input   отвечает за ввод данных от пользователя
     * @param tracker коллекция заявок
     */
    public static void deleteItem(Input input, Tracker tracker) {
	System.out.println("=== Delete the item by id ===");
	System.out.print("Enter the item's id ");
	String id = input.askStr("");
	Item item = tracker.findById(id);
	if (item == Tracker.EMPTY_ITEM) {
	    System.out.println("The item with this id doesn't exist");
	} else {
	    tracker.delete(id);
	    System.out.println("Operation result: " + (tracker.findById(id) == Tracker.EMPTY_ITEM));
	}
    }

    /**
     * Опция поиска элемента из tracker по id
     *
     * @param input   отвечает за ввод данных от пользователя
     * @param tracker коллекция заявок
     * @return найденный элемент
     */
    public static Item findItemById(Input input, Tracker tracker) {
	System.out.println("=== Find the item by id ===");
	System.out.print("Enter the item's id ");
	String id = input.askStr("");
	Item item = tracker.findById(id);
	System.out.println(item == null ? "The item with this id doesn't exist" : item);
	return item;
    }

    /**
     * Опция поиска заявок по ключу
     *
     * @param input   отвечает за ввод данных от пользователя
     * @param tracker коллекция заявок
     * @return возвращает отфильтрованный массив
     */
    public static Item[] findItemsByKey(Input input, Tracker tracker) {
	System.out.println("=== Find the items by name ===");
	System.out.print("Enter the item's name ");
	String name = input.askStr("");
	Item[] items = tracker.findByName(name);
	if (items.length == 0) {
	    System.out.println("Nothing found");
	    items = null;
	} else {
	    for (Item i : items) {
		System.out.println(i);
	    }
	}
	return items;
    }

    /**
     * Инициализируем работу UI
     *
     * @param input   отвечает за ввод данных
     * @param tracker коллекция заявок
     */
    public void init(Input input, Tracker tracker) {
	boolean run = true;
	while (run) {
	    this.showMenu();
	    System.out.print("Select: ");
	    int userDesire = Integer.parseInt(input.askStr(""));
	    String id, name;
	    Item item;
	    Item[] items;
	    switch (userDesire) {
		case 0:
		    StartUI.createItem(input, tracker);
		    break;
		case 1:
		    StartUI.showItems(input, tracker);
		    break;
		case 2:
		    StartUI.editItem(input, tracker);
		    break;
		case 3:
		    StartUI.deleteItem(input, tracker);
		    break;
		case 4:
		    StartUI.findItemById(input, tracker);
		    break;
		case 5:
		    StartUI.findItemsByKey(input, tracker);
		    break;
		case 6:
		    run = false;
		    break;
		default:
		    break;
	    }
	}
    }

    /**
     * Вывод меню на экран
     */
    public void showMenu() {
	System.out.println(System.lineSeparator());
	System.out.println("MENU: ");
	System.out.println("0. Add new item");
	System.out.println("1. Show all items");
	System.out.println("2. Edit item (replace)");
	System.out.println("3. Delete item");
	System.out.println("4. Find item by id");
	System.out.println("5. Find items by name");
	System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
	StartUI testUI = new StartUI();
	Tracker tracker = new Tracker();
	String name = "test";
	Item[] array = new Item[]{new Item(name), new Item(name), new Item(name), new Item(name + "1"), new Item(name)};
	for (Item item : array) {
	    tracker.add(item);
	}
	Input input = new ConsoleInput();
	testUI.init(input, tracker);
    }
}
