package ru.job4j.inheritance;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class JSONReportTest {
    @Test
    public void testSimpleReport() {
        String expected = "{\n" +
		"\n" +
		"   name : name,\n" +
		"   body : body\n" +
		"\n" +
		"}";
        TextReport report = new JSONReport(); // осознанно сделал! вызовется метод у JSON ;)
        String actual = report.generate("name", "body");
	Assert.assertThat(actual, Is.is(expected));
    }
}
