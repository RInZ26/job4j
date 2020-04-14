package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Класс для демонатстрации HashSet
 * @author RinZ26
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        for (String str : Arrays.asList("Lada", "BMW", "Volvo", "Toyota", "Lada")) {
            autos.add(str);
        }

        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
