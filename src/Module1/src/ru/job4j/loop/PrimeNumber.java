package ru.job4j.loop;

public class PrimeNumber {
    public int countOfPrimeNumbers(int number) {
	int countOfPrimeNumbers = 0;
	for (int i = 2; i < number + 1; i++) {
	    if (CheckPrimeNumber.check(i)) {
		countOfPrimeNumbers++;
	    }
	}
	return countOfPrimeNumbers;
    }
}
