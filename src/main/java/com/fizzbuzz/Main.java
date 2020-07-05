package com.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<= 100; i++) {
            try {
                if (isFizz(i) && isBuzz(i)) {
                    System.out.println("FizzBuzz");
                } else if (isFizz(i)) {
                    System.out.println("Fizz");
                } else if (isBuzz(i)) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            } catch (DividedByZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    protected static Boolean isFizz(int value) throws DividedByZeroException {
        return isDividedBy(value, 3) || containsDigit(value, "3");
    }

    protected static Boolean isBuzz(int value) throws DividedByZeroException {
        return isDividedBy(value, 5) || containsDigit(value, "5");
    }

    protected static Boolean isDividedBy(int value, int divisibleBy) throws DividedByZeroException {
        if (divisibleBy == 0) {
            throw new DividedByZeroException(value + " cannot be divided by 0");
        }
        return value % divisibleBy == 0;
    }

    protected static Boolean containsDigit(int value, String digit) {
        return String.valueOf(value).contains(digit);
    }
}
