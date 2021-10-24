package com.adebayoabdulbasit.challenge;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

class TestController {

    @org.junit.jupiter.api.Test
    void smallestPositive() {
        SmallestPositive smallestTest = new SmallestPositive();
        Assertions.assertEquals(4, smallestTest.smallestMissingNo(new int[]{1, 2, 3}));
        Assertions.assertEquals(1, smallestTest.smallestMissingNo(new int[]{-1, -3}));
        Assertions.assertEquals(5, smallestTest.smallestMissingNo(new int[]{1, 2, 3, 4, 6, 7}));
    }

    @org.junit.jupiter.api.Test
    void primes() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        List<Integer> actual = Arrays.asList(97, 89, 83, 79, 73, 71, 67, 61, 59, 53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2);
        Assertions.assertEquals(actual, primeNumbers.primes());
    }

    @org.junit.jupiter.api.Test
    void fibonacci() {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        List<Integer> actual = Arrays.asList(0, 1, 1);
        List<Integer> actualSeven = Arrays.asList(0, 1, 1, 2, 3, 5, 8);
        Assertions.assertEquals(actual, fibonacciSeries.fibonacciNumbers(3));
        Assertions.assertEquals(actualSeven, fibonacciSeries.fibonacciNumbers(7));
    }
}