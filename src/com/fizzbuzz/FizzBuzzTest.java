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

    @Test
    public void shouldReturnBuzzWhen5() {
        assertEquals("Buzz", _fizzBuzz.generate(5));
    }

    @Test
    public void shouldReturnBuzzWhen10() {
        assertEquals("Buzz", _fizzBuzz.generate(10));
    }

    @Test
    public void shouldReturnBuzzWhen15() {
        assertEquals("FizzBuzz", _fizzBuzz.generate(15));
    }

    @Test
    public void shouldReturnBuzzWhen30() {
        assertEquals("FizzBuzz", _fizzBuzz.generate(30));
    }

    @Test
    public void shouldReturn12StringWhen1And2() {
        assertEquals("12", _fizzBuzz.generateBetween(1, 2));
    }

    @Test
    public void shouldReturn21StringWhen2and1() {
        assertEquals("21", _fizzBuzz.generateBetween(2, 1));
    }

    @Test
    public void shouldReturn12Fizz() {
        assertEquals("12Fizz", _fizzBuzz.generateBetween(1, 3));
    }

    @Test
    public void shouldReturnFizz21() {
        assertEquals("Fizz21", _fizzBuzz.generateBetween(3, 1));
    }

    @Test
    public void shouldReturn1To5() {
        assertEquals("12Fizz4Buzz", _fizzBuzz.generateBetween(1, 5));
    }

    @Test
    public void shouldReturn1To15() {
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", _fizzBuzz.generateBetween(1, 15));
    }
}