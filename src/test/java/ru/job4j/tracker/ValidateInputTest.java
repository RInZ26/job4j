package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    /**
     * поле содержит дефолтный вывод в консоль.
     */
    private final PrintStream out = System.out;
    /**
     * буфер для хранения результата.
     */
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();

    @Before
    public void changeOutputBefore() {
        System.setOut(new PrintStream(mem));
    }

    @After
    public void changeOutputAfter() {
        System.setOut(out);
    }

    @Test
    public void whenInvalidInput() {
        String[] data = {"one", "1"};
        Input input = new ValidateStubInput(data);
        input.askInt("Enter");
        assertThat(
                mem.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
    }

    @Test
    public void whenNumberIsHigherThenArrayLength() {
        //System.out.println("abba");
        String[] data = {"Enter", "102", "Enter", "2"};
        Input input = new ValidateStubInput(data);
        input.askInt("Enter", 10);
        assertThat(
                mem.toString(),
                is(String.format("Out of about 102 > [0, 10]%nPlease select key from menu.%n"))
        );
    }
}