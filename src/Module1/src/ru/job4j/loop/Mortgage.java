package ru.job4j.loop;

public class Mortgage {
    public int getCountOfYears(int amount, int salary, double percent) {
	int countOfYears = 0;
	double debt = amount;
	while (debt > 0) {
	    debt = debt + debt * percent / 100 - salary;
	    if (debt >= amount) {
		return 999; // бесконечный долг ;(
	    }
	    countOfYears++;
	}
	return countOfYears;
    }
}
