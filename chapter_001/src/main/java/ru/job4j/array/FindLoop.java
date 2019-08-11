package ru.job4j.array;

/**
 * Searches for an element in an array.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class FindLoop {
    /**
     * Method returns element's index.
     *
     * @param data array size.
     * @param el   element to find.
     * @return element's index.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}