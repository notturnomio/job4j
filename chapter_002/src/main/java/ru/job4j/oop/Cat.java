package ru.job4j.oop;

public class Cat {

    public String sound() {
        return "miao-miao";
    }

    public static void main(String[] args) {
        Cat liza = new Cat();
        String say = liza.sound();
        System.out.println("Liza says: " + say);
    }
}
