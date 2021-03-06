package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {
    /**
     * Testing if word ends with ello.
     */
    @Test
    public void whenEndsWithPrefixThenTrue() {
        EndsWith word = new EndsWith();
        boolean result = word.endsWith("Hello", "ello");
        assertThat(result, is(true));
    }

    /**
     * Testing if word ends with la.
     */
    @Test
    public void whenNotEndsWithPrefixThenFalse() {
        EndsWith word = new EndsWith();
        boolean result = word.endsWith("Hello", "la");
        assertThat(result, is(false));
    }
}
