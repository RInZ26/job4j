package ru.job4j.array;

import org.junit.Test;
import org.hamcrest.core.Is;
import org.junit.Assert;

public class FindLoopTest {
    @Test
    public void indexOfElementTrue() {
        int[] array = new int[] {1, 2, 3, 5, 9, 2};
        FindLoop findLoop = new FindLoop();
        int actual = findLoop.indexOf(array, 9);
        int expected = 4;
        Assert.assertThat(actual, Is.is(expected));
    }

    @Test
    public void indexOfElementFalse() {
        int[] array = new int[] {1, 2, 3, 5, 9, 2};
        FindLoop findLoop = new FindLoop();
        int actual = findLoop.indexOf(array, 10);
        int expected = -1;
        Assert.assertThat(actual, Is.is(expected));
    }


    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expected = 3;
        Assert.assertThat(result, Is.is(expected));
    }

    @Test
    public void whenFindFalse() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 666;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expected = -1;
        Assert.assertThat(result, Is.is(expected));
    }

    @Test
    public void whenIndexesAreIncorrect() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 666;
        int start = 2;
        int finish = 10;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expected = -2;
        Assert.assertThat(result, Is.is(expected));
    }

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] actual = FindLoop.sort(input);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertThat(actual, Is.is(expected));
    }

    @Test
    public void whenSort3Numbers() {
        int[] input = new int[] {1, 0, 0};
        int[] actual = FindLoop.sort(input);
        int[] expected = new int[] {0, 0, 1};
        Assert.assertThat(actual, Is.is(expected));
    }

}
