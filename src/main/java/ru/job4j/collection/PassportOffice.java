package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Класс для работы с Citizen
 *
 * @author RinZ26
 */
public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Добавляет в Map нового citizen
     * @param citizen ~
     * @return результат операции
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Возвращает citizen по паспорту или null, если нет
     * @param passport - key
     * @return - ~
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}