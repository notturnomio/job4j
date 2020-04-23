package ru.job4j.max;

public class Reduce {
    private int[] arrayField;

    public void to(int[] array) {
        arrayField = array;
    }

    public void print() {
        for (int index = 0; index < arrayField.length; index++) {
            System.out.println(arrayField[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
