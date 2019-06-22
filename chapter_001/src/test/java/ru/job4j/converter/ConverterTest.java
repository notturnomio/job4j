package ru.job4j.converter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when383TengeToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.tengeToDollar(383);
        assertThat(result, is(1));
    }

    @Test
    public void when424TengeToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.tengeToEuro(424);
        assertThat(result, is(1));
    }

    @Test
    public void when100dollarToTengeThen38300() {
        Converter converter = new Converter();
        int result = converter.dollarToTenge(100);
        assertThat(result, is(38300));
    }

    @Test
    public void when200EuroToTengeThen84800() {
        Converter converter = new Converter();
        int result = converter.euroToTenge(200);
        assertThat(result, is(84800));
    }
}