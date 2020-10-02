package com.fizzbuzz;

public class FizzBuzz {
    public String generate(int number) {
        if (0 == number % 15) {
            return "FizzBuzz";
        }
        if (0 == number % 3) {
            return "Fizz";
        }
        if (0 == number % 5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
