package ru.job4j.pojo;

import java.util.Date;

public class Police {

    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Peter Arsentev");
        license.setModel("Toyota Prius");
        license.setCode("o777ooo");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " is the owner of - " + license.getModel() + " : " + license.getCode());
    }
}
