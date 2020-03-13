package ru.job4j.loop;

public class Fitness {
    public static int calcCountOfMonths(int ivan, int nic) {
	int countOfMonths = 0;
	while (ivan <= nic) {
	    ivan *= 3;
	    nic *= 2;
	    countOfMonths++;
	}
	return countOfMonths;
    }
}
