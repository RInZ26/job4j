package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
	double height = (p / 2.d) / (k + 1);
	return height * k * height;
    }

    public static void main(String[] args) {
	int p = 6, k = 2, s = 2;
	System.out.printf(" p  = %d, k = %d, s = %d, real = %.2f", p, k, s, SqArea.square(p, k));
    }
}
