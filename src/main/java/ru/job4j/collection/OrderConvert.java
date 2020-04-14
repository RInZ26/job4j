package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * Класс для работы с Order
 * @author RinZ26
 */
public class OrderConvert {
    /**
     * Создание HashMap из List с Order
     * @param orders -list
     * @return map
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}