package ru.job4j.condition;

public class Max {

    public int max(int first, int second) {
        int result = (first > second) ? first : second;
        return result;
    }

    public int max(int first, int second, int third) {
        int tmp = max(first, second);
        int result = (tmp > third) ? tmp : third;
        return result;
    }
}
