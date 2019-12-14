package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery phone = new Battery(20);
        Battery charger = new Battery(70);
        System.out.println("Phone's battery: " + phone.load + "%. Charger's load: " + charger.load + "%.");
        phone.exchange(charger);
        System.out.println("Phone's battery: " + phone.load + "%. Charger's load: " + charger.load + "%.");
    }
}
