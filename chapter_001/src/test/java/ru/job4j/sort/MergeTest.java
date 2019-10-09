package ru.job4j.sort;


import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MergeTest {

    /**
     * Testing merging empty arrays.
     */
    @Test
    public void whenBothEmpty() {
        Merge algo = new Merge();
        int[] expect = new int[0];
        int[] result = algo.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    /**
     * Testing merging arrays with ascending order of elements.
     */
    @Test
    public void whenAscOrder() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[]{1, 2},
                new int[]{3, 4}
        );
        assertThat(result, is(expect));
    }

    /**
     * Testing merging arrays when second array has less elements.
     */
    @Test
    public void whenRightLess() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(
                new int[]{1, 2, 3},
                new int[]{3, 4}
        );
        assertThat(result, is(expect));
    }

    /**
     * Testing merging arrays when second array has more elements.
     */
    @Test
    public void whenRightGreat() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.merge(
                new int[]{1, 2},
                new int[]{3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    /**
     * Testing merging arrays when first array is empty.
     */
    @Test
    public void whenLeftEmpty() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[]{},
                new int[]{1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }
}
