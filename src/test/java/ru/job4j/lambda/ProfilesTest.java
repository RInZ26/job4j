package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ProfilesTest {
    @Test
    public void simpleList(){
	List<Profile> listOfProflies = Arrays.asList(new Profile(new Address("Yekat")), new Profile(new Address("Moscow")), new Profile(new Address("Minsk")));
	List<Address> actual = Profiles.collect(listOfProflies);
	assertTrue(actual.contains(new Address("Moscow")));
    }
}
