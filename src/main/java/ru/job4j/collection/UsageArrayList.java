package ru.job4j.collection;

import java.util.ArrayList;

/**
 * Класс для работы с ArrayList
 * @author RinZ26
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("petr");
        array.add("ivan");
        array.add("Stepan");
        for (String s : array) {
            System.out.println(s);
        }
    }
}
