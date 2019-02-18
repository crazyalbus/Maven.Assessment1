package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for (Object value : objectArray) {
            if (value.equals(objectToCount)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Integer> newArray = new ArrayList<>();

        for (Object value : objectArray) {
            if (!value.equals(objectToRemove)) {
                newArray.add((int)value);
            }
        }
        Integer[] updatedArray = updateArray(newArray);
//        Integer[] updatedArray = new Integer[newArray.size()];
//        for (int i = 0; i< newArray.size(); i++) {
//            updatedArray[i] = newArray.get(i);
//        }

        return updatedArray;
    }

    public static Integer[] updateArray(ArrayList<Integer> integerArray) {
        Integer[] newArray = new Integer[integerArray.size()];

        for (int i = 0; i< integerArray.size(); i++) {
            newArray[i] = integerArray.get(i);
        }
        return newArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
        HashMap<Integer, Integer> countOfNumbers = countFrequency(objectArray);
        Integer currentGreatestKey = 0;
        Integer currentGreatestCount = 0;
        for (Integer number : countOfNumbers.keySet()) {
            if(currentGreatestCount < countOfNumbers.get(number)) {
                currentGreatestKey = number;
                currentGreatestCount = countOfNumbers.get(number);
            }
        }

        return currentGreatestKey;
    }

    public static HashMap<Integer, Integer> countFrequency(Integer[] input) {
        HashMap<Integer, Integer> countNumbers = new HashMap<>();
        for (Integer number : input) {
            if(!countNumbers.containsKey(number)) {
                countNumbers.put(number, 1);
            } else {
                int count = countNumbers.get(number);
                countNumbers.put(number, count + 1);
            }
        }
        return countNumbers;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Integer[] objectArray) {
        HashMap<Integer, Integer> countOfNumbers = countFrequency(objectArray);
        Integer currentLeastKey = 0;
        Integer currentLeastCount = Integer.MAX_VALUE;
        for (Integer number : countOfNumbers.keySet()) {
            if(currentLeastCount > countOfNumbers.get(number)) {
                currentLeastKey = number;
                currentLeastCount = countOfNumbers.get(number);
            }
        }

        return currentLeastKey;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Integer> mergedArray = new ArrayList<>();

        for (Object element:objectArray) {
            mergedArray.add((int) element);
        }

        for (Object element:objectArrayToAdd) {
            mergedArray.add((int)element);
        }

        Integer[] updatedArray = updateArray(mergedArray);

        return updatedArray;
    }
}
