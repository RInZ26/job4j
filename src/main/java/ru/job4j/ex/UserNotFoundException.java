package ru.job4j.ex;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
        System.out.println(this.getClass().getName());
    }
}
