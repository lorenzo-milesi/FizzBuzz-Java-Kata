package com.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    public void shouldReturn1When1() {
        assertEquals("1", new FizzBuzz().generate(1));
    }

    @Test
    public void shouldReturn2When2() {
        assertEquals("2", new FizzBuzz().generate(2));
    }

    @Test
    public void shouldReturnFizzWhen3() {
        assertEquals("Fizz", new FizzBuzz().generate(3));
    }
}