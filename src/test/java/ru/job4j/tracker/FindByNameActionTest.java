package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindByNameActionTest {
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
        Item item1 = new Item("fix bug");
        Item item2 = new Item("fix bug");
        tracker.add(item1);
        tracker.add(item2);
        UserAction act = new FindItemsByKeyAction();
        act.execute(new StubInput(new String[] {"fix bug"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item1.toString()).add(item2.toString())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }
}
