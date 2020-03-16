package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.pojo.LicenseTest;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
	Tracker tracker = new Tracker();
	Item item = new Item("test1");
	tracker.add(item);
	Item result = tracker.findById(item.getId());
	assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenDidntFindById() {
	Tracker tracker = new Tracker();
	Item item = new Item("test1");
	tracker.add(item);
	Item result = tracker.findById("testtesttest");
	Assert.assertNull(result);
    }

    @Test
    public void whenFindByName() {
	Tracker tracker = new Tracker();
	String name = "test";
	Item[] array = new Item[] {new Item(name), new Item(name), new Item(name), new Item(name + "1"), new Item(name)};
	for (Item item : array) {
	    tracker.add(item);
	}
	Item[] result = tracker.fidByName(name);
	Assert.assertEquals(result.length, 4);
    }

    @Test
    public void whenReplace() {
	Tracker tracker = new Tracker();
	Item bug = new Item("Bug");
	tracker.add(bug);
	String id = bug.getId();
	Item bugWithDesc = new Item("Bug with description");
	tracker.replace(id, bugWithDesc);
	assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
    @Test
    public void whenDelete() {
	Tracker tracker = new Tracker();
	Item bug = new Item("Bug");
	tracker.add(bug);
	String id = bug.getId();
	tracker.delete(id);
	assertThat(tracker.findById(id), is(nullValue()));
    }
}