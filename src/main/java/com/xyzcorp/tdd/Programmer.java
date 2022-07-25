package com.xyzcorp.tdd;

import java.time.LocalDate;
import java.util.function.Supplier;

import static java.time.temporal.ChronoUnit.YEARS;

public class Programmer {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Supplier<LocalDate> dateSupplier;

    protected Programmer(String firstName, String lastName,
                      LocalDate birthDate, Supplier<LocalDate> dateSupplier) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.dateSupplier = dateSupplier;
    }

    public static Programmer of(String firstName,
                                String lastName,
                                LocalDate birthDate) {
        return new Programmer(firstName,
            lastName, birthDate,
            LocalDate::now);
    }

    public int getAge() {
        return (int) YEARS.between(birthDate, dateSupplier.get());
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
