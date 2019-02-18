package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String firstLetter = str.substring(0, 1);
        String convertFirstLetter = firstLetter.toUpperCase();
        String remainingString = str.substring(1, str.length());

        return convertFirstLetter + remainingString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String newString = "";

        for (int i=str.length() - 1; i >-1; i--) {
            newString = newString + str.charAt(i);
        }
        return newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversedStr = reverse(str);
        return camelCase(reversedStr);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String invertedStr = "";
        for(int i=0; i<str.length(); i++) {
            String letterToConvert = str.substring(i, i+1);
            if (letterToConvert =)
            String newLetter = convert.
            invertedStr = invertedStr + convert;
        }
        return invertedStr;
    }
}
