package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input) {
        Integer numberOfPalindromes = 0;
        Object[] getStrings = getAllStrings(input);

        for (Object string : getStrings) {
            String testString = string.toString();
            if (Palindrome.isPalindromic(testString)) {
                numberOfPalindromes++;
            }
        }
        return numberOfPalindromes;
    }


    public static Object[] getAllStrings(String input) {
        ArrayList<String> allStrings = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                allStrings.add(input.substring(i,j));
            }
        }
        return allStrings.toArray();
    }

    public static boolean isPalindromic(String toTest) {

        String reversed = BasicStringUtils.reverse(toTest);
        return toTest.equals(reversed);
        }


    }

