package com.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    public void shouldReturn1() {
        assertEquals("1", new FizzBuzz().generate());
    }
}