package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {
  final String TERRAN = "TERRAN";
  final String ZERG = "ZERG";
  final String PROTOSS = "PROTOSS";

    @Test
    public void sectionsTest() {
	List<InterestedStudent> studentList = List.of(new InterestedStudent("Matvey", Set.of(TERRAN,  PROTOSS)),
		new InterestedStudent("RinKokonoe", Set.of(ZERG, PROTOSS)), new InterestedStudent("ShowTime", Set.of(TERRAN, PROTOSS)), new InterestedStudent("Suno", Set.of(ZERG)));
	var actual = Group.sections(studentList);
	assertThat(actual, is(Map.of(TERRAN, Set.of("Matvey", "ShowTime"), ZERG, Set.of("RinKokonoe", "Suno"), PROTOSS, Set.of("Matvey", "ShowTime", "RinKokonoe"))));
    }
}
