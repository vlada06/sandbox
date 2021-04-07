package com.vld.fibonacci;

import java.util.stream.Stream;

/**
 * Obtaining fibonacci function of a given number using Java8 Stream.
 * Works for any long, with minimum impact on performance.
 * date: 07/04/2021
 * time: 22:07
 */

public class StreamFibonacciSingle {

    /**
     * Obtain fibonacci function of a given number using Java8 Stream.
     *
     * @param max the number of which we obtain the corresponding Fibonacci number
     * @return Fibonacci function
     */
    public long getFibonacciFunction(long max) {
        return Stream.iterate(new long[]{0, 1}, n -> new long[]{n[1], n[0] + n[1]})
                .limit(max)
                .mapToLong(l -> l[1])
                .max()
                .orElseThrow(NoSuchFieldError::new);
    }
}
