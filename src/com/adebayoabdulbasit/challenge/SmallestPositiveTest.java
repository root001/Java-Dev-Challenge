package com.adebayoabdulbasit.challenge;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SmallestPositiveTest {

    @org.junit.jupiter.api.Test
    void main() {
        SmallestPositive smallestTest = new SmallestPositive();
        Assertions.assertEquals(4, smallestTest.smallestMissingNo(new int[]{1,2,3}));
        Assertions.assertEquals(1, smallestTest.smallestMissingNo(new int[]{-1,-3}));
        Assertions.assertEquals(5, smallestTest.smallestMissingNo(new int[]{1,2,3,4,6,7}));
    }
}