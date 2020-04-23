package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;

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

    /**
     * Test distance between two points in 3d.
     */
    @Test
    public void when3DimensionalDistance() {
        Point c = new Point(0, 2, 4);
        Point d = new Point(2, 12, 5);
        double result = c.distance3d(d);
        assertEquals(result, 10, 0.3);
    }
}