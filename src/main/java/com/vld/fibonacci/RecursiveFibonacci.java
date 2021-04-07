package com.vld.fibonacci;

/**
 * Recursive way of obtaining fibonacci function. Only works for numbers up to 40, beyond that becomes too :slow.
 * date: 07/04/2021
 * time: 21:43
 */

public class RecursiveFibonacci {

    /**
     * Recursively obtain fibonacci function of a given number.
     *
     * @param max the number of which we obtain the corresponding Fibonacci number
     * @return Fibonacci function
     */
    public long getFibonacciFunction(long max) {
        if (max < 2) {
            return max;
        } else {
            return getFibonacciFunction(max - 1) + getFibonacciFunction(max - 2);
        }
    }
}
