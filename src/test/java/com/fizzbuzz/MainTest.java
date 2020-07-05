package com.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void isFizzTest() {
        assertTrue(Main.isFizz(3));
        assertTrue(Main.isFizz(13));
        assertFalse(Main.isFizz(5));
    }

    @Test
    public void isBuzzTest() {
        assertTrue(Main.isBuzz(5));
        assertTrue(Main.isBuzz(15));
        assertFalse(Main.isBuzz(3));
    }

    @Test
    public void isDivisibleByTest() {
        assertTrue(Main.isDividedBy(5, 5));
        assertTrue(Main.isDividedBy(15, 5));
        assertTrue(Main.isDividedBy(15, 3));
        assertFalse(Main.isDividedBy(15, 2));
        assertFalse(Main.isDividedBy(3, 2));
    }
}