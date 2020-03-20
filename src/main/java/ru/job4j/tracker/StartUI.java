package ru.job4j.tracker;

/**
 * Класс - консольное приложенеие для работы с  Tracker
 *
 * @author RinZ26
 */
public class StartUI {

    /**
     * Инициализируем работу UI
     *
     * @param input   отвечает за ввод данных
     * @param tracker коллекция заявок
     */
    public void init(Input input, Tracker tracker, UserAction[] userActions) {
	boolean run = true;
	while (run) {
	    this.showMenu(userActions);
	    int userDesire = input.askInt("Select: ");
	    run = userActions[userDesire].execute(input, tracker);
	}
    }

    /**
     * Вывод меню на экран
     */
    public void showMenu(UserAction[] userActions) {
	System.out.println("Menu:");
	for (int c = 0; c < userActions.length; c++) {
	    System.out.println(c + ". " + userActions[c].name());
	}
    }

    public static void main(String[] args) {
	StartUI testUI = new StartUI();
	Tracker tracker = new Tracker();
	Input input = new ConsoleInput();
	UserAction[] userActions = new UserAction[]{new CreateAction(), new FindAllAction(), new EditAction(), new DeleteAction(), new FindItemsByIdAction(), new FindItemsByKeyAction(), new ExitAction()};
	testUI.init(input, tracker, userActions);
    }
}
