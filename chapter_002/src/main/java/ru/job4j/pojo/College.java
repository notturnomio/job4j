package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Peter Arsentev");
        student.setCourse("culinary");
        student.setStartDate(new Date());

        System.out.println(student.getName() + " is the student of the " + student.getCourse()
                + " course starting from: " + student.getStartDate());
    }
}
