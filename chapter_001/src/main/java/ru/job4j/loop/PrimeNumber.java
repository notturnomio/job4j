package ru.job4j.loop;

/**
 * The program counts the number of prime numbers from 1 to x.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PrimeNumber {
    /**
     * Calculating the number of prime numbers to finish.
     *
     * @param finish Final number.
     * @return Number of prime numbers.
     */
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            count++;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
