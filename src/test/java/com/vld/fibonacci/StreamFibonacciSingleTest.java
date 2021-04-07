package com.vld.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamFibonacciSingleTest {
    StreamFibonacciSingle streamFibonacciSingle;

    @BeforeEach
    void setUp(){
        streamFibonacciSingle = new StreamFibonacciSingle();
    }

    @Test
    @DisplayName("getFibonacciFunction tested, returns corresponding fibonacci function of a number")
    void getFibonacciFunctionTest(){
        long max = 7;

        long expected = 13;
        long actual = streamFibonacciSingle.getFibonacciFunction(max);
        assertEquals(expected, actual);
    }
}