package ru.job4j.condition;

public class Max {

    public int max(int first, int second) {
        return Math.max(first, second);
    }

    public int max(int first, int second, int third) {
        int tmp = max(first, second);
        return Math.max(third, tmp);
    }
}
