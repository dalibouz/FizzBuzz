package com.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<= 100; i++) {
            if (isFizz(i) && isBuzz(i)) {
                System.out.println("FizzBuzz");
            } else if (isFizz(i)) {
                System.out.println("Fizz");
            } else if (isBuzz(i)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    protected static Boolean isFizz(int value) {
        return isDividedBy(value, 3) || containsDigit(value, "3");
    }

    protected static Boolean isBuzz(int value) {
        return isDividedBy(value, 5) || containsDigit(value, "5");
    }

    protected static Boolean isDividedBy(int value, int divisibleBy) {
        return value % divisibleBy == 0;
    }

    protected static Boolean containsDigit(int value, String digit) {
        return String.valueOf(value).contains(digit);
    }
}
