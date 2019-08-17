package ru.job4j.array;

/**
 * Checks if word ends with post.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class EndsWith {
    /**
     * Method checks if post equals to words last letters.
     *
     * @param word given word to check.
     * @param post last letters.
     * @return result.
     */
    public boolean endsWith(String word, String post) {
        boolean result = true;
        char[] pst = post.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = 0; i < pst.length; i++) {
            if (wrd[wrd.length - i - 1] != pst[pst.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
