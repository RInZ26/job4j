package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
	if (number <= 1) {
	    return false;
	}
	int countOfFactors = 0;
	for (int i = 1; i < number; i++) {
	    countOfFactors += number % i == 0 ? 1 : 0;
	    if (countOfFactors > 1) {
		return false;
	    }
	}
	return true;
    }
}
