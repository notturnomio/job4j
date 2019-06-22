package ru.job4j.calculator;

/**
 * Basic calculator.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    /**
     * Calculating addition.
     *
     * @param first  number.
     * @param second number.
     * @return first number plus second number.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Calculating subtraction.
     *
     * @param first  number.
     * @param second number.
     * @return first number minus second number.
     */
    public double minus(double first, double second) {
        return first - second;
    }

    /**
     * Calculating multiplication.
     *
     * @param first  number.
     * @param second number.
     * @return first number multiplied by second number.
     */
    public double multi(double first, double second) {
        return first * second;
    }

    /**
     * Calculating division.
     *
     * @param first  number.
     * @param second number.
     * @return first number divided by second number.
     */
    public double div(double first, double second) {
        return first / second;
    }
}
