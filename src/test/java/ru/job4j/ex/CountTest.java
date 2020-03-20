package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import org.junit.Assert;
public class CountTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Count.add(10, 2);
    }

    @Test
    public void when0to2then3() {
        int rsl = Count.add(0, 3);
        Assert.assertThat(rsl, is(3));
    }
}