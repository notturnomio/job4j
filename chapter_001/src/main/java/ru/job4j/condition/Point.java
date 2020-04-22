package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

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

    private int x;

    private int y;

    private int z;

    /**
     * A constructor that takes the initial state of a dot object
     *
     * @param first  x coordinate
     * @param second y coordinate
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 0, 1);
        Point d = new Point(3, 2, 4);
        double dist = a.distance(b);
        double dist3d = c.distance3d(d);

        System.out.println("2d distance is: " + dist);
        System.out.println("3d distance is: " + dist3d);
    }
}
