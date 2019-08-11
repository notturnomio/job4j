package ru.job4j.array;

/**
 * Generates array of square numbers from 1 to bound.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Square {
    /**
     * Method calculate creates and fills array with squares.
     *
     * @param bound highest number to use.
     * @return array of square numbers.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}
