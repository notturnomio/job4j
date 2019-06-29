package ru.job4j.calculator;

/**
 * The Car program implements an application that
 * calculates how many kilometers you can drive
 * after filling some number of gas
 * and prints the output on the screen.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Car {
    private double volume;

    /**
     * Calculating a range left to drive.
     */
    public void drive(int kilometer) {
        this.volume = this.volume - kilometer;
    }

    /**
     * Calculating how many kilometers you can drive on one fill.
     */
    public void fill(int gas) {
        this.volume = this.volume + 10 * gas;
    }

    /**
     * Calculating if there's any gas to drive.
     *
     * @return can you drive or not.
     */
    public boolean canDrive() {
        boolean result = this.volume > 0;
        return result;
    }

    /**
     * Prints info about how many kilometers you can drive on standard output.
     */
    public void gasInfo() {
        System.out.println("I can drive " + this.volume + " kilometers");
    }
}
