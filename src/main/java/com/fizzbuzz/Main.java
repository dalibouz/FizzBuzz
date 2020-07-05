package main.java.com.fizzbuzz;

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

    private static Boolean isFizz(int value) {
        return isDivisableBy(value, 3) || containsDigit(value, "3");
    }

    private static Boolean isBuzz(int value) {
        return isDivisableBy(value, 5) || containsDigit(value, "5");
    }

    private static Boolean isDivisableBy(int value, int divisibleBy) {
        return value % divisibleBy == 0;
    }

    private static Boolean containsDigit(int value, String digit) {
        return String.valueOf(value).contains(digit);
    }
}
