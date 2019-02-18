package com.zipcodewilmington.assessment1.part5;

import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input){
        String[] array = toStringArray(input);
        Integer numberOfPalindromes = 0;
        if(isPalindromic(toStringArray(input))) {
            numberOfPalindromes++;
        }



        return numberOfPalindromes;
    }

    public static String[] toStringArray(String input) {
        String[] newArray = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            newArray[i] = input.substring(i, i+1);
        }
        return newArray;
    }

    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = new String[array.length];

        for (int i=0; i<array.length; i++)
        {
            reversedArray[array.length - (i + 1)] = array[i];
        }

        return Arrays.equals(array, reversedArray);
    }
}
