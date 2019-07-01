package ru.job4j.condition;

/**
 * The TruckDriver program implements an application
 * that checks a condition of what transport a driver
 * can drive depending on his license category
 * and prints the output on the screen.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class TruckerJob {

    /**
     * This is the main method which makes use of TruckDriver class.
     *
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {
        TruckDriver steve = new TruckDriver();
        System.out.println("Steve wants a trucker job.");
        if (!steve.hasLicense()) {
            System.out.println("Steve needs a license!");
            steve.passExamOn('A');
        }
        if (steve.canDrive('C')) {
            System.out.println("Steve can drive a truck!");
        } else if (steve.canDrive('B')) {
            System.out.println("Steve can drive a taxi!");
        } else {
            System.out.println("Steve does not have a job, but can ride a motorbike.");
        }
    }
}
