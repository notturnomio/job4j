package loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Testing the program that counts the number of prime numbers.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class PrimeNumberTest {
    /**
     * Testing finding the number of prime numbers from 1 to 5.
     */
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertThat(count, is(3));
    }

    /**
     * Testing finding the number of prime numbers from 1 to 11.
     */
    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(11);
        assertThat(count, is(5));
    }

    /**
     * Testing finding the number of prime numbers from 1 to 2.
     */
    @Test
    public void when1() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(2);
        assertThat(count, is(1));
    }
}
