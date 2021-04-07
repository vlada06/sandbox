package com.vld.binary.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchExampleTest {
    BinarySearchExample binarySearchExample;

    @BeforeEach
    void setUp() {
        binarySearchExample = new BinarySearchExample();
    }

    @Test
    void testBinarySearch() {
        int arraySize = 10;
        int array[] = new int[arraySize];

        int searchTerm = 12;

        for (int i = 0; i < arraySize; i++) {
            array[i] = (i+2) *2;
        }
        assertEquals(binarySearchExample.binarySearch(array, 0, arraySize -1, searchTerm), 4);
    }
}