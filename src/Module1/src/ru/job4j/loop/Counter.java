package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
	int sum = 0;
	for (int c = start; c <= finish; c++) {
	    sum += c;
	}
	return sum;
    }

    public static int sumByEven(int start, int finish) {
	int sum = 0;
	for (int c = start; c < finish + 1; c++) {
	    if (c % 2 == 0) {
		sum += c;
	    }
	}
	return sum;
    }

    public static void main(String[] args) {
	System.out.println(sum(0, 10));
	System.out.println(sum(3, 8));
	System.out.println(sum(1, 1));
    }
}
