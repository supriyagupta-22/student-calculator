package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void addsPositiveNumbers() {
        assertEquals(30, App.add(10, 20));
    }

    @Test
    void addsZero() {
        assertEquals(7, App.add(7, 0));
    }

    @Test
    void addsNegativeNumbers() {
        assertEquals(-5, App.add(-2, -3));
    }
}

