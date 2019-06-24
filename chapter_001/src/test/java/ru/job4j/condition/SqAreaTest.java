package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Test.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SqAreaTest {
    /**
     * Test sides of rectangle.
     */
    @Test
    public void p4k1s1() {
        SqArea sqArea = new SqArea();
        assertThat(sqArea.square(4, 1), is(1));
    }

    /**
     * Test sides of rectangle.
     */
    @Test
    public void p6k2s2() {
        SqArea sqArea = new SqArea();
        assertThat(sqArea.square(6, 2), is(2));
    }
}
