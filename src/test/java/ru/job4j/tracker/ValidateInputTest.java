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
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"one", "1"})
        );
        input.askInt("Enter");
        assertThat(
                mem.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
    }

    @Test
    public void whenNumberIsHigherThenArrayLength() {
        String[] data = {"Enter", "102", "Enter", "2"};
        Input input =  new ValidateInput(
                new StubInput(data));
        input.askInt("Enter", 10);
        assertThat(
                mem.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
    }
}