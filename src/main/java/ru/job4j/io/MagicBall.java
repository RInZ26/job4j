package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Я великий оракул. Что ты хочешь узнать? ");
	sc.nextLine();
	int godsWhisper = getprediction();
	System.out.println(godsWhisper == 0 ? "Да" : godsWhisper == 1 ? "Нет" : "Может быть");
    }

    public static int getprediction() {
	Random rnd = new Random();
        return rnd.nextInt(3);
    }
}
