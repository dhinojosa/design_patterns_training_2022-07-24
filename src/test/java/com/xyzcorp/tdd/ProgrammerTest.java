package com.xyzcorp.tdd;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgrammerTest {
    @Test
    void testBjarneStrousoup() {
        Programmer programmer = new Programmer(
            "Bjarne", "Strousoup", LocalDate.of(1950, 12, 30),
            () -> LocalDate.of(2020, 6, 15));
        String result = programmer.getFullName();
        assertThat(result).isEqualTo("Bjarne Strousoup");
    }

    @Test
    void testBjarneStrousoupAge() {
        Programmer programmer = new Programmer(
            "Bjarne", "Strousoup",
            LocalDate.of(1950, 12, 30),
            () -> LocalDate.of(2020, 6, 15));
        int result = programmer.getAge();
        assertThat(result).isEqualTo(69);
    }

    //This will break soon
    @Test
    void testProgrammerWithTodaysDate() {
        Programmer programmer = Programmer.of(
            "Bjarne", "Strousoup",
            LocalDate.of(1950, 12, 30));
        int result = programmer.getAge();
        assertThat(result).isEqualTo(71);
    }

    //() -> LocalDate.of(2018, 6, 1)
}
