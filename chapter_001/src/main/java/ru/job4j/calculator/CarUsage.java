package ru.job4j.calculator;

/**
 * The CarUsage program implements an application that
 * makes use of Car class to calculate how many kilometers
 * you can drive after filling some number of gas
 * and print the output on the screen.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CarUsage {

    /**
     * This is the main method which makes use of Car class.
     *
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {
        Car bmw = new Car();
        boolean driving = bmw.canDrive();
        System.out.println("Can you drive? " + driving);
        System.out.println("I'm going to a gas station.");
        int gas = 25;
        bmw.fill(gas);
        driving = bmw.canDrive();
        System.out.println("Can you drive now? " + driving);
        System.out.print("Now I'm going to mountains.");
        System.out.println(" It is 10 kilometers from here.");
        int distance = 10;
        bmw.drive(distance);
        bmw.gasInfo();
        System.out.println();
        Car audi = new Car();
        if (!audi.canDrive()) {
            audi.fill(10);
        }
        int km = 0;
        while (audi.canDrive()) {
            audi.drive(1);
            km++;
            if (km == 4) {
                audi.drive(1);
                continue;
            }
            if (km == 6) {
                break;
            }
        }
        System.out.print("On Audi ");
        audi.gasInfo();
    }
}
