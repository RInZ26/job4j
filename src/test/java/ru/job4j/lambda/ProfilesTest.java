package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ProfilesTest {
    @Test
    public void simpleList() {
	List<Profile> listOfProflies = Arrays.asList(new Profile(new Address("Yekat")), new Profile(new Address("Moscow")), new Profile(new Address("Minsk")));
	List<Address> actual = Profiles.collect(listOfProflies);
	assertTrue(actual.contains(new Address("Moscow")));
    }

    @Test
    public void hardTestWithSameAddresses() {
	List<Profile> listOfProflies = Arrays.asList(new Profile(new Address("Yekat")), new Profile(new Address("Moscow")), new Profile(new Address("Minsk")),
		new Profile(new Address("Moscow")), new Profile(new Address("Moscow")), new Profile(new Address("Minsk")), new Profile(new Address("Moscow")));
	List<Address> actual = Profiles.collect(listOfProflies);
	List<Address> expected = new ArrayList(Arrays.asList(new Address("Yekat"), new Address("Moscow"), new Address("Minsk")));
	Comparator<Address> cmpByCity = (first, second) -> first.getCity().compareTo(second.getCity());
	Collections.sort(expected, cmpByCity);
	assertThat(actual, is(expected));
    }
}
