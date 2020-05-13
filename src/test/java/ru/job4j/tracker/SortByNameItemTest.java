package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortByNameItemTest {

    @Test
    public void simpleSort() {
        Item[] items = {new Item("Z"), new Item("B"), new Item("K"), new Item("N")};
        List<Item> expected = new ArrayList<>(Arrays.asList(items[1], items[2], items[3], items[0]));
        List<Item> actual = new ArrayList<>(Arrays.asList(items[0], items[1], items[2], items[3]));
        Collections.sort(actual, new SortByNameItem());
        assertThat(actual, is(expected));
    }

    @Test
    public void simpleReverseSort() {
        Item[] items = {new Item("Z"), new Item("B"), new Item("K"), new Item("N")};
        List<Item> expected = new ArrayList<>(Arrays.asList(items[0], items[3], items[2], items[1]));
        List<Item> actual = new ArrayList<>(Arrays.asList(items[0], items[1], items[2], items[3]));
        Collections.sort(actual, new ReverseSortByNameItem());
        assertThat(actual, is(expected));
    }
}
