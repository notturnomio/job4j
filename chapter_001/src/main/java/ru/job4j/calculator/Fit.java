package ru.job4j.calculator;

/**
 * Calculator of ideal weight.
 */
public class Fit {
    /**
     * Ideal weight for men.
     *
     * @param height man's height.
     * @return ideal weight.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Ideal weight for women.
     *
     * @param height woman's height.
     * @return ideal weight.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

}
