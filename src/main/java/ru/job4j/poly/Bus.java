package ru.job4j.poly;


import java.util.Random;

/**
 * Класс автобус
 *
 * @author RinZ26
 */
public class Bus implements Transport {
    /**
     * Количество топлива
     */
    private int countOfFuel;
    /**
     * Количество пассажиров
     */
    private int countOfPassengers;
    /**
     * Количество денег
     */
    private int money;

    /**
     * Цена билета за проезд
     */
    private int costOfTicket;
    /**
     * Цена 1 литра бензина
     */
    private int costOnOneLiter;

    /**
     * Основной конструктор
     *
     * @param costOfTicket   ~
     * @param costOnOneLiter ~
     */
    public Bus(int costOfTicket, int costOnOneLiter) {
	this.costOfTicket = costOfTicket;
	this.costOnOneLiter = costOnOneLiter;
    }

    public int getCountOfFuel() {
	return countOfFuel;
    }

    public int getCostOfTicket() {
	return costOfTicket;
    }

    public void setCostOfTicket(int costOfTicket) {
	this.costOfTicket = costOfTicket;
    }

    public int getCostOnOneLiter() {
	return costOnOneLiter;
    }

    public void setCostOnOneLiter(int costOnOneLiter) {
	this.costOnOneLiter = costOnOneLiter;
    }

    public void setCountOfFuel(int countOfFuel) {
	this.countOfFuel = countOfFuel;
    }

    public int getCountOfPassengers() {
	return countOfPassengers;
    }

    public void setCountOfPassengers(int counfOfPassengers) {
	this.countOfPassengers = counfOfPassengers;
    }

    public int getMoney() {
	return money;
    }

    public void setMoney(int money) {
	this.money = money;
    }

    /**
     * Езда с оплатой
     */
    @Override
    public void ride() {
	while (countOfFuel > 0 && countOfPassengers > 0) {
	    System.out.println("Мы едем-едем-едем в далеееекие края");
	    countOfFuel -= 1;
	    countOfPassengers -= new Random().nextInt(3);
	}
	money += countOfPassengers * costOfTicket;
	countOfPassengers = 0;
    }

    /**
     * Забор пассажиров
     *
     * @param countOfPassengers количество пассажиров
     */
    @Override
    public void getPassengers(int countOfPassengers) {
	this.countOfPassengers += countOfPassengers;
    }

    /**
     * Заправка
     *
     * @param fuel количество топлива
     * @return цена за fuel
     */
    @Override
    public int refill(int fuel) {
	int cost;
	if (money >= fuel * costOnOneLiter) {
	    System.out.println("Заправка прошла успешно!");
	    cost = costOnOneLiter * fuel;
	} else {
	    System.out.println("Нужно больше золота, мы можем купить только " + money / costOnOneLiter + "литров");
	    cost = money / costOnOneLiter * costOnOneLiter;
	}
	return cost;
    }
}
