package ru.job4j.array;

/**
 * Checks if all elements of array are true or false.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Check {
    /**
     * Method checks all elements in array.
     *
     * @param data array elements.
     * @return result.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                result = false;
            }
        }
        return result;
    }
}