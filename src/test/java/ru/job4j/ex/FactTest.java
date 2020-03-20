package ru.job4j.ex;

import org.junit.Assert;
import org.hamcrest.core.Is;
import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThen1() {
        new Fact().calc(-1);
    }

    @Test
    public void whenNmoreThen1() {
        Assert.assertThat(new Fact().calc(5), Is.is(120));
    }
}
