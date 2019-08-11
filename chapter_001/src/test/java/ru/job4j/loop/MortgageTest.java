package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MortgageTest {
    /**
     * Testing the number of years when payment is 100 with 1%.
     */
    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 100, 1);
        assertThat(year, is(1));
    }

    /**
     * Testing the number of years when payment is 10 with 50%.
     */
    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 10, 50);
        assertThat(year, is(2));
    }
}
