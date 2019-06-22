package ru.job4j.converter;

/**
 * Currency converter.
 */
public class Converter {

    /**
     * Converting KZT to USD.
     *
     * @param value tenge.
     * @return dollar.
     */
    public int tengeToDollar(int value) {
        return value / 383;
    }

    /**
     * Converting KZT to EURO.
     *
     * @param value tenge.
     * @return EURO
     */
    public int tengeToEuro(int value) {
        return value / 424;
    }

    /**
     * Converting USD to KZT.
     *
     * @param value dollar.
     * @return tenge.
     */
    public int dollarToTenge(int value) {
        return value * 383;
    }

    /**
     * Converting EURO to KZT.
     *
     * @param value euro.
     * @return tenge
     */
    public int euroToTenge(int value) {
        return value * 424;
    }
}
