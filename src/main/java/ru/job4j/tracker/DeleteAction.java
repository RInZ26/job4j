package ru.job4j.tracker;

/**
 * Класс - опция удаления элемента
 *
 * @author RinZ26
 */
public class DeleteAction implements UserAction {
    /**
     * Возвращает название действия
     *
     * @return ~
     */
    @Override
    public String name() {
	return "=== Delete the item by id ===";
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
	    tracker.delete(id);
	    System.out.println("Operation result: " + (tracker.findById(id) == Tracker.EMPTY_ITEM));
	}
	return true;
    }
}
