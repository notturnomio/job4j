package ru.job4j.condition;

public class Triangle {

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
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}