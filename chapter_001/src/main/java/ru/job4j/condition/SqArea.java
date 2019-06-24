package ru.job4j.condition;

/**
 * Sides of rectangle.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SqArea {
    /**
     * Calculating sides of rectangle.
     *
     * @param p perimeter of a rectangle.
     * @param k coefficient - width is more than height in k times.
     * @return rectangle area.
     */
    public int square(int p, int k) {
        int height = (p * k) / (2 * (1 + k));
        int width = height / k;
        return height * width;

    }
}
