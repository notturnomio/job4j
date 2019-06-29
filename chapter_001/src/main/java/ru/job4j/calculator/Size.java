package ru.job4j.calculator;

/**
 * The Size program implements an application that
 * simply finds a median of two given integer numbers
 * and prints the output on the screen.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Size {
    /**
     * Calculating median size.
     *
     * @param first  one pair of shoes.
     * @param second another pair of shoes.
     * @return median size of two pairs of shoes.
     */
    public int median(int first, int second) {
        int result = (first + second) / 2;
        return result;
    }

    /**
     * Prints info about your size on standard output.
     */
    public void info(int size) {
        System.out.println("Your size is " + size);
    }

    /**
     * This is the main method which makes use of median method.
     *
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {
        Size size = new Size();
        int nike = 42;
        int puma = 44;
        int value = size.median(nike, puma);
        size.info(value);
    }
}
