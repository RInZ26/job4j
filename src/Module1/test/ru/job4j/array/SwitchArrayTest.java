package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 2, 3, 1};
        int[] actual = SwitchArray.swap(input, 0, 3);
        assertThat(actual, is(expected));
    }

    @Test
    public void whenSwapFailedData() {
        int[] input = {1, 2, 3, 4};
        int[] expected = null;
        int[] actual = SwitchArray.swap(input, -1, 3);
        assertThat(actual, is(expected));
    }

    @Test
    public void whenSwap1To2() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 3, 2, 4};
        int[] actual = SwitchArray.swap(input, 2, 1);
        assertThat(actual, is(expected));
    }

}
