package ru.job4j.loop;

/**
 * Mortage program calculates number of years needed to pay a credit.
 */
public class Mortgage {
    /**
     * Method year calculates number of years.
     *
     * @param amount  of credit.
     * @param payment payed monthly.
     * @param percent yearly
     * @return number of years.
     */
    public int year(int amount, int payment, double percent) {
        int year = 0;
        while (amount > 0) {
            int interest = (int) (amount * percent / 100);
            int annual = payment * 12;
            amount = (amount + interest) - annual;
            year++;
        }
        return year;
    }
}

