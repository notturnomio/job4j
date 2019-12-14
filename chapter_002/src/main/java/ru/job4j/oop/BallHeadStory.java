package ru.job4j.oop;

public class BallHeadStory {

    public static void main(String[] args) {
        BallHead ballHead = new BallHead();
        Bunny bunny = new Bunny();
        Fox fox = new Fox();
        Bear bear = new Bear();

        bunny.tryEat(ballHead);
        ballHead.rollAway(bunny);
        fox.tryEat(ballHead);
        ballHead.rollAway(fox);
        bear.tryEat(ballHead);
        ballHead.rollAway(bear);

    }
}
