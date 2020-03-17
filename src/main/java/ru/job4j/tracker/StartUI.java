package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс - консольное приложенеие для работы с  Tracker
 *
 * @author RinZ26
 */
public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
	boolean run = true;
	while (run) {
	    this.showMenu();
	    System.out.print("Select: ");
	    int userDesire = Integer.parseInt(scanner.nextLine());
	    String id, name;
	    Item item;
	    Item[] items;
	    switch (userDesire) {
		case 0:
		    System.out.println(System.lineSeparator() + "=== Create a new item ===");
		    System.out.print("Enter the name: ");
		    name = scanner.nextLine();
		    tracker.add(new Item(name));
		    break;
		case 1:
		    System.out.println("=== Show the all items ===");
		    for (Item item1 : tracker.findAll()) {
			System.out.println(item1);
		    }
		    break;
		case 2:
		    System.out.println("=== Edit the item by id ===");
		    System.out.print("Enter the item's id ");
		    id = scanner.nextLine();
		    item = tracker.findById(id);
		    if (item == null) {
			System.out.println("The item with this id doesn't exist");
		    } else {
			System.out.printf("Changed item's name: %s ", item.getName());
			System.out.print(System.lineSeparator() + "Enter new name for this item ");
			String newItemName = scanner.nextLine();
			System.out.println("Operation result: " + tracker.replace(id, new Item(newItemName)));
		    }
		    break;
		case 3:
		    System.out.println("=== Delete the item by id ===");
		    System.out.print("Enter the item's id ");
		    id = scanner.nextLine();
		    item = tracker.findById(id);
		    if (item == null) {
			System.out.println("The item with this id doesn't exist");
		    } else {
			tracker.delete(id);
			System.out.println("Operation result: " + (tracker.findById(id) == null));
		    }
		    break;
		case 4:
		    System.out.println("=== Find the item by id ===");
		    System.out.print("Enter the item's id ");
		    id = scanner.nextLine();
		    item = tracker.findById(id);
		    System.out.println(item == null ? "The item with this id doesn't exist" : item);
		    break;
		case 5:
		    System.out.println("=== Find the items by name ===");
		    System.out.print("Enter the item's name ");
		    name = scanner.nextLine();
		    items = tracker.findByName(name);
		    if (items.length == 0) {
			System.out.println("Nothing found");
		    } else {
			for (Item i : items) {
			    System.out.println(i);
			}
		    }
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
	testUI.init(new Scanner(System.in), tracker);
    }
}
