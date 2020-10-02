package com.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    private FizzBuzz _fizzBuzz;

    @BeforeEach
    public void setUp() {
        _fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturn1When1() {
        assertEquals("1", _fizzBuzz.generate(1));
    }

    @Test
    public void shouldReturn2When2() {
        assertEquals("2", _fizzBuzz.generate(2));
    }

    @Test
    public void shouldReturnFizzWhen3() {
        assertEquals("Fizz", _fizzBuzz.generate(3));
    }

    @Test
    public void shouldReturnFizzWhen6() {
        assertEquals("Fizz", _fizzBuzz.generate(6));
    }
}