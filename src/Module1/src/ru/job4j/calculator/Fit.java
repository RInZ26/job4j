package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
	return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {
	return (height - 115) * 1.15;
    }

    public static void main(String[] args) {
	double man = Fit.manWeight(180);
	System.out.println("Man 180 is " + man);
	System.out.printf("Woman 180 is " + Fit.womanWeight(180));
    }
}
