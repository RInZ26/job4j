package ru.job4j.poly;

/**
 * Транспорт
 *
 * @author RinZ26
 */
public interface Transport {
    /**
     * Езда
     */
    void ride();

    /**
     * Забор пассажиров
     *
     * @param countOfPassengers количество пассажиров
     */
    void getPassengers(int countOfPassengers);

    /**
     * Заправка
     *
     * @param fuel количество топлива
     * @return цена за fuel
     */
    int refill(int fuel);
}
