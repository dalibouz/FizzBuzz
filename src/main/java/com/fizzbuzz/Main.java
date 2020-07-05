package main.java.com.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<= 100; i++) {
            if (isDivisableBy(i, 3) && isDivisableBy(i, 5)) {
                System.out.println("FizzBuzz");
            } else if (isDivisableBy(i, 3)) {
                System.out.println("Fizz");
            } else if (isDivisableBy(i, 5)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static Boolean isDivisableBy(int value, int divisibleBy) {
        return value % divisibleBy == 0;
    }
}
