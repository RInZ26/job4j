package ru.job4j.array;

/**
 * Класс для поиска в массивах
 *
 * @author RinZ25
 */
public class FindLoop {
    /**
     * Метод для поиска индекса заданного элемента в массиве
     *
     * @param data массив, в котором производится поиск элемента
     * @param el   элемент, индекс которого ищется
     * @return результат индекс - элемент есть /   -1 - элемента нет
     */
    public int indexOf(int[] data, int el) {
	int index = -1;
	for (int c = 0; c < data.length; c++) {
	    if (data[c] == el) {
		index = c;
		break;
	    }
	}
	return index;
    }

    /**
     * Поиск индекса в диапаазоне
     *
     * @param data   исходный массив
     * @param el     элемент, индекс которого ищется
     * @param start  начало диапазона поиска
     * @param finish конец диапазона поиска
     * @return индекс - элемент есть, -1  - элемента нет в данном диапазоне
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
	int index = -1;
	for (int c = start; c <= finish; c++) {
	    if (data[c] == el) {
		index = c;
		break;
	    }
	}
	return index;
    }

    /**
     * Сортировка выборкой
     *
     * @param data исходный массив
     * @return отсортированный массив (исходный)
     */
    public static int[] sort(int[] data) {
	for (int i = 0; i < data.length; i++) {
	    int temp = data[i];
	    int min = MinDiapason.findMin(data, i, data.length - 1);
	    int index = indexOf(data, min, i, data.length - 1);
	    data[i] = min;
	    data[index] = temp;
	}
	return data;
    }
}
