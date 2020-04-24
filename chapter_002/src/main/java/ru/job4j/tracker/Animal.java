package ru.job4j.tracker;

public class Animal {

    String name;

    public Animal() {
        System.out.println(getClass().getSimpleName());
    }

    public Animal(String name) {
        this.name = name;
        System.out.print(this.name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Predator predator = new Predator();
        Tiger tiger = new Tiger();

        Animal animalName = new Animal("Animals > ");
        Predator predatorName = new Predator("Predators > ");
        Tiger tigerName = new Tiger("Tigers");
    }
}
