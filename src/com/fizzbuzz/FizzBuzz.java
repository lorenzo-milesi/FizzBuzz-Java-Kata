package com.fizzbuzz;

public class FizzBuzz {
    public String generate(int number) {
        if (0 == number % 3) {
            return "Fizz";
        }
        if (5 == number) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
