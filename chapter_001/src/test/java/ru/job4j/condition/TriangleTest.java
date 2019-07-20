package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Creating a triangle object.
        Triangle triangle = new Triangle();
        // Calculating the area.
        double result = triangle.area(0, 0, 0, 2, 2, 0);
        // Setting the expected result.
        double expected = 2D;
        // Checking the result and the expected value.
        assertThat(result, closeTo(expected, 0.1));
    }

}
