package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {
    /**
     * Test distance between two points.
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 10);
        double result = a.distance(b);
        assertThat(result, is(10D));
    }
}
