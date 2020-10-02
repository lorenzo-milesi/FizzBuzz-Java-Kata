package com.fizzbuzz;

public class FizzBuzz {
    public String generate(int number) {
        if (3 == number) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
