package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
	Comparator<Job> cmpNamePriority = new JobDecByName().thenComparing(new JobDecByPriority());
	int rsl = cmpNamePriority.compare(
		new Job("Impl task", 0),
		new Job("Fix bug", 1)
	);
	assertThat(rsl, lessThan(0));
    }

    // Test only IncByName
    @Test
    public void whenComparatorByIncName() {
        Comparator<Job> cmpIncName = new JobIncByName();
        int rsl = cmpIncName.compare(new Job("A", 0), new Job("B", 1));
        assertThat(rsl, lessThan(0));
    }

    // Test only DecByName
    @Test
    public void whenComparatorByDecName() {
	Comparator<Job> cmpDecName = new JobDecByName();
	int rsl = cmpDecName.compare(new Job("A", 1), new Job("B", 0));
	assertThat(rsl, greaterThan(0));
    }

    // Test DecByName then DecPriority
    @Test
    public void whenComparatorByDecNameThenDecPriority() {
	Comparator<Job> cmpDecName = new JobDecByName().thenComparing(new JobDecByPriority());
	int rsl = cmpDecName.compare(new Job("A", 1), new Job("A", 0));
	assertThat(rsl, lessThan(0));
    }
    // Test IncByPriority then DecByName
    @Test
    public void whenComparatorByIncPriorityThenDecByName() {
	Comparator<Job> cmpDecName = new JobIncByPriority().thenComparing(new JobDecByName());
	int rsl = cmpDecName.compare(new Job("A", 1), new Job("B", 1));
	assertThat(rsl, greaterThan(0));
    }
}