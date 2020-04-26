package ru.job4j.tracker.inheritance;

public class JsonReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "name: " + name + "," + System.lineSeparator()
                + "body: " + body;
    }
}
