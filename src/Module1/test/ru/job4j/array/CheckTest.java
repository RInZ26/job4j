package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean actual = Check.mono(input);
        assertThat(actual, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean actual = Check.mono(input);
        assertThat(actual, is(false));
    }

    @Test
    public void whenDataHasEvenLength() {
        boolean[] input = new boolean[] {false, false, false, true};
        boolean actual = Check.mono(input);
        assertThat(actual, is(false));
    }

    @Test
    public void whenDataHasOddLength() {
        boolean[] input = new boolean[] {false, false, false};
        boolean actual = Check.mono(input);
        assertThat(actual, is(true));
    }
}