package ru.job4j.condition;

/**
 * The program finds largest of three numbers using Ternary Operator
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class MultiMax {
    public int max(int first, int second, int third) {
        int twoNumbers = first > second ? first : second;
        int result = third > twoNumbers ? third : twoNumbers;
        return result;
    }
}

/*
 * if statement version
 * public int max(int first, int second, int third) {
 * int result = first;
 * if (second > first && second > third) {
 * result = second;
 * } else {
 * if ((third > first && third > second)) {
 * result = third;
 * }
 * }
 * return result;
 */