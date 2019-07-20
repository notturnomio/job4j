package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void max() {
        SqMax max = new SqMax();
        int out = max.max(5, 8, 17, 9);
        assertThat(out, is(17));
    }
}