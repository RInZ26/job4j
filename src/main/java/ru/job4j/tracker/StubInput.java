package ru.job4j.tracker;

/**
 * Класс для тестирования StartUI
 *
 * @author RinZ26
 */
public class StubInput implements Input {
	private String[] answers;
	private int position = 0;

	public StubInput(String[] answers) {
		this.answers = answers;
	}

	/**
	 * Перегруженный метод, для проверки, что мы не вышли за предел доступных значений
	 *
	 * @param question ~
	 * @param max      ~
	 * @return ~
	 */
	@Override
	public int askInt(String question, int max) {
		boolean invalid = true;
		int value = -1;
		do {
			try {
				value = Integer.parseInt(askStr(question), max);
				invalid = false;
			} catch (IllegalStateException ils) {
				System.out.println(ils.getMessage());
				System.out.println("Please select key from menu.");
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter validate data again.");
			}
		} while (invalid);
		return value;
	}

	@Override
	public String askStr(String question) {
		return answers[position++];
	}

	@Override
	public int askInt(String question) {
		boolean invalid = true;
		int value = -1;
		do {
			try {
				value = Integer.parseInt(askStr(question));
				invalid = false;
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter validate data again.");
			}
		} while (invalid);
		return value;
	}
}