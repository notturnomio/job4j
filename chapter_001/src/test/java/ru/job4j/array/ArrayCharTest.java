package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    /**
     * Testing if word starts with Hel.
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.StartsWith("Hello", "Hel");
        assertThat(result, is(true));
    }

    /**
     * Testing if word starts with Hil.
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.StartsWith("Hello", "Hol");
        assertThat(result, is(false));
    }
}
