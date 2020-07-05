package com.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void isFizzTest() throws DividedByZeroException {
        assertTrue(Main.isFizz(3));
        assertTrue(Main.isFizz(13));
        assertFalse(Main.isFizz(5));
    }

    @Test
    public void isBuzzTest() throws DividedByZeroException {
        assertTrue(Main.isBuzz(5));
        assertTrue(Main.isBuzz(15));
        assertFalse(Main.isBuzz(3));
    }

    @Test
    public void isDivisibleByTest() throws DividedByZeroException {
        assertTrue(Main.isDividedBy(5, 5));
        assertTrue(Main.isDividedBy(15, 5));
        assertTrue(Main.isDividedBy(15, 3));
        assertFalse(Main.isDividedBy(15, 2));
        assertFalse(Main.isDividedBy(3, 2));
    }

    @Test
    public void isDivisibleByExceptionTest() {
        assertThrows(DividedByZeroException.class, () -> Main.isDividedBy(5, 0));
        assertDoesNotThrow(() -> Main.isDividedBy(5, 2));
    }

    @Test
    public void containsDigitTest() {
        assertTrue(Main.containsDigit(31, "1"));
        assertFalse(Main.containsDigit(31, "2"));
        assertFalse(Main.containsDigit(53, "1"));
        assertFalse(Main.containsDigit(7, null));
        assertFalse(Main.containsDigit(99, ""));
    }
}