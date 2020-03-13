package ru.job4j.array;

/**
 * Класс для подражания String
 *
 * @author RinZ26
 */
public class ArrayChar {
    /**
     * Проверка на совпадение первых элементов у массива char
     *
     * @param word проверяемое "слово"
     * @param pref проверяемый "префикс"
     * @return true - совпало, false - нет / префикс длиннее слова
     */
    public static boolean startsWith(char[] word, char[] pref) {
	boolean isRight = true;
	for (int c = 0; c < pref.length; c++) {
	    if (word[c] != pref[c]) {
		isRight = false;
		break;
	    }
	}
	return isRight;
    }
}
