package ru.job4j.loop;

public class Fitness {
    public int calc(int john, int mike) {
        int month = 0;
        while (john < mike) {
            john *= 3;
            mike *= 2;
            month++;
        }
        return month;
    }
}
