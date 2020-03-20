package ru.job4j.strategy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.StringJoiner;

public class PaintTest {
    /**
     * поле содержит дефолтный вывод в консоль.
     */
    private final PrintStream stdout = System.out;
    /**
     * буфер для хранения результата.
     */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();


    /**
     * Смена потока ввода
     */
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    /**
     * Возврат потока на дефолтный
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method " + this.out.toString());
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        Square square = new Square();
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        Assert.assertThat(square.draw(), is(sj.add("***************").add("***************").add("***************").add("***************")
                .add("***************").add("***************").add("***************").add("***************").toString()));
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        Triangle triangle = new Triangle();
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        Assert.assertThat(triangle.draw(), is(sj.add("   *").add("  ***").add(" *****").add("*******").toString()));
    }
}