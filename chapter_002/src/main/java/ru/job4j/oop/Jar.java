package ru.job4j.oop;

public class Jar {

    private double value;

    public Jar(double size) {
        this.value = size;
    }

    public void pour(Jar another) {
        this.value = (this.value + another.value) / 2;
        another.value = this.value;
    }

    public static void main(String[] args) {
        Jar big = new Jar(10);
        Jar small = new Jar(5);
        System.out.println("Big jar : " + big.value + ". Small jar : " + small.value);
        big.pour(small);
        System.out.println("Big jar : " + big.value + ". Small jar : " + small.value);
    }
}
