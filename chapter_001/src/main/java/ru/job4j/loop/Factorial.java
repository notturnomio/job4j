package ru.job4j.loop;

/**
 * The program that calculates a factorial with for loop.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Finding factorial.
     *
     * @param n - factorial value.
     * @return - factorial result.
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
