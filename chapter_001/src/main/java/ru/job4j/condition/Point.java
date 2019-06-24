package ru.job4j.condition;

/**
 * Find a distance between two points.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    /**
     * Calculating addition.
     *
     * @param x1 of first point.
     * @param y1 of first point.
     * @param x2 of second point.
     * @param y2 of second point.
     * @return distance between first and second points.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }
}
