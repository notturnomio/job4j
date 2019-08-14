package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {
    /**
     * Testing if word ends with lo.
     */
    @Test
    public void whenEndsWithPrefixThenTrue() {
        EndsWith word = new EndsWith();
        boolean result = word.endsWith("Hello", "lo");
        assertThat(result, is(true));
    }

    /**
     * Testing if word ends with le.
     */
    @Test
    public void whenNotEndsWithPrefixThenTrue() {
        EndsWith word = new EndsWith();
        boolean result = word.endsWith("Hello", "le");
        assertThat(result, is(true));
    }
}
