package ru.job4j.loop;

public class Factorial {

    public static int calcFactorial(int n) {
	if (n < 0) {
	    return -1; //факториала от отрицательных чисел не бывает
	}
	int factorial = 1;
	for (int c = 1; c < n + 1; c++) {
	    factorial *= c;
	}
	return factorial;
    }
}
