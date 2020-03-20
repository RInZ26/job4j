package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

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
}