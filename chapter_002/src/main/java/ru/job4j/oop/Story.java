package ru.job4j.oop;

public class Story {

    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();

        girl.help(hunter);
        wolf.eat(girl);
        hunter.kill(wolf);
    }
}
