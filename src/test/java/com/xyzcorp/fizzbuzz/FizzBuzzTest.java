package com.xyzcorp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    //ZOMBIES
    //Zero
    //One
    //Many
    //Boundary
    //Interface
    //Exceptions
    //Simplicity


    @Test
    void testEmpty() {
        //FizzBuzz.evaluate(0);???
    }

    @Test
    void testFizzBuzzOne() {
       String result = FizzBuzz.evaluate(1);
       assertThat(result).isEqualTo("1");
    }

    @Test
    void testFizzBuzzTwo() {
        String result = FizzBuzz.evaluate(2);
        assertThat(result).isEqualTo("2");
    }

    @Test
    void testFizzBuzzThree() {
        String result = FizzBuzz.evaluate(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void testFizzBuzzFive() {
        String result = FizzBuzz.evaluate(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void testFizzBuzzFifteen() {

    }
}
