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

    /**
     * Method returns element's index inside of given range.
     *
     * @param data   array size.
     * @param el     element to find.
     * @param start  first index of range.
     * @param finish last index of range.
     * @return element's index.
     */
    public int indexOfRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Method method sorts the elements of an array in ascending order.
     *
     * @param data array size.
     * @return sorted array.
     */
    public int[] sort(int[] data) {
        for (int i = 0; i != data.length; i++) {
            int min = data[i];
            int min_index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    min_index = j;
                }
            }
            if (i != min_index) {
                int temp = data[i];
                data[i] = data[min_index];
                data[min_index] = temp;
            }
        }
        return data;
    }
}

