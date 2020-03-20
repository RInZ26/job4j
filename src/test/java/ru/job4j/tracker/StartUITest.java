package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void simpleInit() {
        Input stubInput = new StubInput(new String[]{"0"});
        StubAction userAction = new StubAction();
        new StartUI().init(stubInput, new Tracker(), new UserAction[]{userAction});
        Assert.assertThat(userAction.isCall(), is(true));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu:")
                .add("0. Stub action")
                .toString();
        assertEquals(out.toString(), expect);
        System.setOut(def);
    }
}