package com.fizzbuzz;

import org.jetbrains.annotations.NotNull;

public class FizzBuzz {
    public String generate(int number) {
        StringBuilder result = new StringBuilder();
        if (0 == number % 3) {
            result.append("Fizz");
        }
        if (0 == number % 5) {
            result.append("Buzz");
        }
        return result.length() == 0 ? String.valueOf(number) : result.toString();
    }

    public String generateBetween(int from, int to) {
        if (from > to) {
            return chromaticInverse(from, to);
        }

        return chromatic(from, to);
    }

    @NotNull
    private String chromatic(int from, int to) {
        StringBuilder result = new StringBuilder();

        for (int p = from; p <= to; p++) {
            result.append(this.generate(p));
        }

        return result.toString();
    }

    @NotNull
    private String chromaticInverse(int from, int to) {
        StringBuilder result = new StringBuilder();

        for (int p = from; p >= to; p--) {
            result.append(this.generate(p));
        }

        return result.toString();
    }
}
