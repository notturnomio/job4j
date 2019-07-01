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
public class TruckDriver {
    private char license = 'N';

    /**
     * Checks if a driver has a license.
     */
    public void passExamOn(char category) {
        this.license = category;
    }

    /**
     * Checks the category of license.
     *
     * @return type of category.
     */
    public boolean hasLicense() {
        return this.license == 'A' || this.license == 'B' || this.license == 'C';
    }

    /**
     * Checks what transport a driver can work on.
     *
     * @return type of transport.
     */
    public boolean canDrive(char category) {
        return this.license == category;
    }
}
