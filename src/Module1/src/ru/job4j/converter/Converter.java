package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
	return value / 70;
    }

    public static int rubleToDollar(int value) {
	return -2;
    }

    public static void main(String[] args) {
	int euro = Converter.rubleToEuro(140);
	int dollar = Converter.rubleToDollar(140);
	System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
