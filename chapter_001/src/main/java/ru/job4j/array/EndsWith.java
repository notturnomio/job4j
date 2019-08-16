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
        boolean result = false;
        char[] pst = post.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = post.length() - 2; i < post.length(); i++) {
            if (wrd[i] != pst[i]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
