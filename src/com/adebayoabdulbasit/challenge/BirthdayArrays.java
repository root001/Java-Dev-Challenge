package com.adebayoabdulbasit.challenge;

import java.util.Arrays;

public class BirthdayArrays {

    private static final int DECODER = 0b00000000000000001111111111111111;
    private static final int MAX_LENGTH = 10000;

    public static void solveForArrays(int case_number) {
        int arrayA[] = new int[MAX_LENGTH];
        int arrayB[] = new int[MAX_LENGTH];
        int numberOfElements = 4;
        int i;
        int num = 32;

        for (i = 0; i < numberOfElements; i++) {
            arrayB[i] = num >> 16; //First 16 digits
            arrayA[i] = num & DECODER; //Last 16 digits
        }

        //Output
        System.out.println("Case :" + case_number);
        for (i = 0; i < numberOfElements; i++)
            System.out.println("Array A numbers :" + arrayA[i]);

        for (i = 0; i < numberOfElements; i++)
            System.out.println("Array B numbers :" + arrayB[i]);
    }

    public static void main(String[] args) {
        int noOfTestCases = 2;
        int caseI;
        System.out.println("No of Cases :" + noOfTestCases);

        for (caseI = 1; caseI <= noOfTestCases; caseI++)
            solveForArrays(caseI);

    }
}
