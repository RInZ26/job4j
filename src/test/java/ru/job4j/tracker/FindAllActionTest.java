package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindAllActionTest {
    /**
     * поле содержит дефолтный вывод в консоль.
     */
    private final PrintStream stdout = System.out;
    /**
     * буфер для хранения результата.
     */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Смена потока ввода
     */
    @Before
    public void changeOutput() {
        System.setOut(new PrintStream(out));
    }
    /**
     * Возврат потока ввода на дефолтный
     */
    @After
    public void returnOutputToDefault() {
        System.setOut(stdout);
    }
    @Test
    public void whenCheckOutput() {
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        UserAction act = new FindAllAction();
        act.execute(new StubInput(new String[] {}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.toString())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }
}