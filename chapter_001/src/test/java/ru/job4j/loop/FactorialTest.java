package ru.job4j.loop;


import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The test that checks a factorial with for loop.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class FactorialTest {

    /**
     * Test n = 5.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    /**
     * Test n = 0.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}
