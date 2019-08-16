package ru.job4j.array;

/**
 * Checks if word starts with prefix.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayChar {
    /**
     * Method checks if prefix equals to words first letters.
     *
     * @param word   given word to check.
     * @param prefix first letters.
     * @return result.
     */
    public boolean StartsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = 0; i < prefix.length(); i++) {
            if (wrd[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
