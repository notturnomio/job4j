package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Hello, is it me you're looking for?");
        } else if (position == 2) {
            System.out.println("Oooh, you're in the army now!");
        } else {
            System.out.println("The song is not found");
        }
    }

    public static void main(String[] args) {
        Jukebox player = new Jukebox();
        player.music(1);
        player.music(2);
        player.music(3);
    }

}
