package ru.job4j.condition;

/**
 * Класс для определения максимума
 *
 * @author RinZ26
 */
public class Max {
    /**
     * Определение максимума двух чисел
     *
     *
     * @param left первое число
     * @param right второе число
     * @return максимум
     */
    public static int max(int left, int right) {
	return right > left ? right : left;
    }

    /**
     * Определение максимума трёх чисел
     *
     *
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @return максимум
     */
    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    /**
     * Определение максимума четырёх чисел
     *
     *
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @param fourth четвертое число
     * @return максимум
     */
    public static int max(int first, int second, int third, int fourth) {
	return max(max(first, second), max(third, fourth));
    }
}
