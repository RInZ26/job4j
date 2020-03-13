package ru.job4j.sort;

import java.util.Arrays;

/**
 * Класс для работы с массивами
 *
 * @author RinZ26
 */
public class Merge {
    /**
     * Слияние отсортированных массивов без потери их сортировки
     *
     * @param left  первый массив
     * @param right второй массив
     * @return всеобъемлющий массив
     */
    public int[] merge(int[] left, int[] right) {
	int[] array = new int[left.length + right.length];
	int pointerLeft = 0, pointerRight = 0; // указатель на следующую ячейку
	while (pointerLeft + pointerRight < array.length) {
	    if (pointerLeft < left.length && pointerRight < right.length) {
		array[pointerLeft + pointerRight] = left[pointerLeft] <= right[pointerRight] ? left[pointerLeft++] : right[pointerRight++];
	    } else if (pointerLeft >= left.length) {
		for (int i = pointerLeft + pointerRight; i < array.length; i++) {
		    array[i] = right[pointerRight++];
		}
	    } else if (pointerRight >= right.length) {
		for (int i = pointerRight + pointerLeft; i < array.length; i++) {
		    array[i] = left[pointerLeft++];
		}
	    }
	}
	return array;
    }

    public static void main(String[] args) {
	Merge process = new Merge();
	int[] rsl = process.merge(
		new int[]{1, 3, 5},
		new int[]{2, 4}
	);
	System.out.println(Arrays.toString(rsl));
    }
}
