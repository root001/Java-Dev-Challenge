package com.adebayoabdulbasit.challenge;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumbers {
    public List<Integer> primes() {
        int numbers = 99;
        List<Integer> primeNumbers = new LinkedList<>();
        if (numbers >= 2) {
            primeNumbers.add(2);
        }
        for (int i = 3; i <= numbers; i += 2) {
            if (isPrimeBruteForce(i)) {
                primeNumbers.add(i);
            }
        }
        Collections.reverse(primeNumbers);
        return primeNumbers;
    }

    private static boolean isPrimeBruteForce(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
