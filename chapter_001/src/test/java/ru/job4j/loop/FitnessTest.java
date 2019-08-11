package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Fitness;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FitnessTest {

    @Test
    public void whenJohnOvertakeMike() {
        Fitness fit = new Fitness();
        int days = fit.calc(95, 90);
        assertThat(days, is(0));
    }

    @Test
    public void whenMikeOvertakeJohn() {
        Fitness fit = new Fitness();
        int days = fit.calc(90, 95);
        assertThat(days, is(1));
    }

    @Test
    public void whenMikeOvertakeJohnTwice() {
        Fitness fit = new Fitness();
        int days = fit.calc(50, 90);
        assertThat(days, is(2));
    }
}
