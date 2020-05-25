package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book schildt = new Book("The Complete Reference", 1250);
        Book sierra = new Book("Head First Java", 720);
        Book bloch = new Book("Effective Java", 390);
        Book martin = new Book("Clean Code", 830);

        Book[] print = new Book[4];

        print[0] = schildt;
        print[1] = sierra;
        print[2] = bloch;
        print[3] = martin;

        for (int index = 0; index < print.length; index++) {
            Book book = print[index];
            System.out.println(book.getName() + ", " + book.getPages() + " pages.");
        }

        System.out.println("Replace 2 books on a shelf");
        Book eckel = new Book("Thinking in Java", 1150);
        Book horstmann = new Book("Core Java", 930);
        print[0] = eckel;
        print[2] = horstmann;

        for (int index = 0; index < print.length; index++) {
            Book book = print[index];
            System.out.println(book.getName() + ", " + book.getPages() + " pages.");
        }

        System.out.println("Show only book.name - clean code");
        for (int index = 0; index < print.length; index++) {
            Book book = print[index];
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName() + " - " + book.getPages() + " pages.");
            }
        }
    }
}
