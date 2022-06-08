package ui;

import pojo.Actor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Actor peterHajas = new Actor("Peter", "Hajas", "slovak", LocalDate.of(1992, 8, 23));
        Actor matejHajas = new Actor();
        matejHajas.setFirstName("Matej");
        matejHajas.setLastName("Hajas");
        matejHajas.setNationality("slovak");
        matejHajas.setDateOfBirth(LocalDate.of(1987,10,2));
        System.out.println(peterHajas);
        System.out.println();
        System.out.println(matejHajas);

    }
}
