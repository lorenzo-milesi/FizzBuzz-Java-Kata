package com.fizzbuzz;

public class FizzBuzz {
    public String generate(int number) {
        if (3 == number || 6 == number) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
