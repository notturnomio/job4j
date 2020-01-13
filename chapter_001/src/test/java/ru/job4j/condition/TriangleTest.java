package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 2);
        Point c = new Point(2, 0);
        // Creating a triangle object.
        Triangle triangle = new Triangle(a, b, c);
        // Calculating the area.
        double result = triangle.area();
        // Setting the expected result.
        double expected = 2D;
        // Checking the result and the expected value.
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenTriangleNotExist() {
        Point a = new Point(0, 1);
        Point b = new Point(1, 0);
        Point c = new Point(1, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result, closeTo(expected, 0.1));
    }
}
