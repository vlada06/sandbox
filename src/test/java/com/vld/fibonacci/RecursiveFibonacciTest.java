package com.vld.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveFibonacciTest {

    RecursiveFibonacci recursiveFibonacci;

    @BeforeEach
    void setUp(){
        recursiveFibonacci = new RecursiveFibonacci();
    }

    @Test
    @DisplayName("getFibonacciFunction() test")
    void getFibonacciFunctionTest(){
        int max = 7;
        List<Long> fibonacciNumbers = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            fibonacciNumbers.add(recursiveFibonacci.getFibonacciFunction(i));
        }

        assertEquals(13L, fibonacciNumbers.get(max));
        assertTrue(fibonacciNumbers.size()==8);
    }

}