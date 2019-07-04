package ru.job4j.condition;

/**
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * This bot can answer questions.
     *
     * @param question Your question.
     * @return Bot's answer.
     */
    public String answer(String question) {
        String rsl = "It baffles me. Ask another question.";
        if ("Hi, Bot!".equals(question)) {
            rsl = "Nice to meet you!";
        } else if ("Bye, Bot!".equals(question)) {
            rsl = "See you next time!";
        }
        return rsl;
    }
}
