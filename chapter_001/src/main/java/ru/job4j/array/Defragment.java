package ru.job4j.array;

/**
 * Program moves null cells to the end of the array.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Defragment {
    /**
     * Method swaps null cells of array.
     *
     * @param array cells in array.
     * @return swapped array.
     */
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String cell = array[i];
            if (cell == null) {
                int j = i;
                while (j < array.length - 1) {
                    if (array[++j] != null) {
                        array[i] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
            System.out.println(array[i] + " ");
        }
        return array;
    }

    /**
     * Main method prints out swapped array.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.println(compressed[i] + " ");
        }
    }
}
