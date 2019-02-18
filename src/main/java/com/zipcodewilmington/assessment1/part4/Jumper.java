package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        int sum = 0;
        int jumps = 0;
        while (sum < k) {
            sum += j;
            jumps++;
        }

        return jumps;
    }
}
