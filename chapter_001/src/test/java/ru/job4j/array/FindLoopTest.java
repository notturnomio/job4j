package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    /**
     * Testing if 5 is in array.
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Testing if 6 is in array.
     */
    @Test
    public void whenArrayHas6ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    /**
     * Testing if 7 is in array between 3 and 5.
     */
    @Test
    public void whenArrayHas7Between3And5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{6, 12, 4, 2, 7, 9, 10};
        int value = 7;
        int start = 3;
        int finish = 5;
        int result = find.indexOfRange(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }

    /**
     * Testing if 6 is in array outside of 4 and 7 range.
     */
    @Test
    public void whenArrayHas6Outside4And8ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{6, 14, 3, 8, 11, 5, 2, 0};
        int value = 6;
        int start = 4;
        int finish = 7;
        int result = find.indexOfRange(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}