package com.vld.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamFibonacciListTest {

    StreamFibonacciList streamFibonacciList;

    @BeforeEach
    void setUp(){
        streamFibonacciList = new StreamFibonacciList();
    }

    @Test
    @DisplayName("getFibonacciFunction tested, returns corresponding fibonacci function of a number")
    void getFibonacciFunctionTest(){
        long max = 7;

        long expected = 8;
        List<Long> actual = streamFibonacciList.getFibonacciFunction(max);
        assertEquals(expected, actual.size());
        assertTrue(actual.contains(13L));
    }
}