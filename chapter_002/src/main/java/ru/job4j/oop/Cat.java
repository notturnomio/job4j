package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void call() {
        System.out.println(this.name);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public String sound() {
        return "miao-miao";
    }

    public static void main(String[] args) {
        Cat liza = new Cat();
        String say = liza.sound();
        System.out.println("Liza says: " + say);
        System.out.println();

        System.out.print("Here is the food of ");
        Cat gav = new Cat();
        gav.giveNick("Kotyonok Gav");
        gav.call();
        gav.eat("kotleta");
        gav.show();

        System.out.println();

        System.out.print("Here is the food of ");
        Cat blackie = new Cat();
        blackie.giveNick("Chyorniy Kot");
        blackie.call();
        blackie.eat("fish");
        blackie.show();

    }
}
