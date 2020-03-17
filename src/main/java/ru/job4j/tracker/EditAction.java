package ru.job4j.tracker;

/**
 *  * Класс -  Опция редактировать элемент
 */
public class EditAction implements UserAction {
    /**
     * Возвращает название действия
     *
     * @return ~
     */
    @Override
    public String name() {
	return "=== Edit the item by id ===";
    }

    /**
     * Производит заданные операции с tracker
     *
     * @param input   отвечает за ввод данных от пользователя
     * @param tracker коллекция заявок
     * @return true - пользователь в системе false - вышел
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
	String id = input.askStr("Enter the item's id ");
	Item item = tracker.findById(id);
	if (item == Tracker.EMPTY_ITEM) {
	    System.out.println("The item with this id doesn't exist");
	} else {
	    System.out.printf("Changed item's name: %s ", item.getName());
	    System.out.print(System.lineSeparator() + "Enter new name for this item ");
	    String newItemName = input.askStr("");
	    System.out.println("Operation result: " + tracker.replace(id, new Item(newItemName)));
	}
	return true;
    }
}
