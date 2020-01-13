package ru.job4j.condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * The method of calculating the semi-perimeter of the sides.
     * (a+b+c) / 2
     *
     * @param a a distance between points a & b.
     * @param b a distance between points a & c.
     * @param c a distance between points b & c.
     * @return semi-perimeter.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * The method checks whether it is possible to construct a triangle with given lengths of the sides.
     *
     * @param a a distance between points a & b.
     * @param b a distance between points a & c.
     * @param c a distance between points b & c.
     * @return is it possible to construct a triangle.
     */
    private boolean exist(double a, double b, double c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }

    /**
     * The method calculates the area of the triangle.
     * √ p *(p - a) * (p - b) * (p - c)
     *
     * @return rsl area if triangle exists or -1.
     */

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = second.distance(third);
        double c = third.distance(first);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}