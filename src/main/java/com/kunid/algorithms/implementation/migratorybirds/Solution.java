package com.kunid.algorithms.implementation.migratorybirds;

import java.util.Scanner;

public class Solution {
    static int migratoryBirds(int n, int[] ar) {
        int [] counter = new int [] {0,0,0,0,0};

        for (int i = 0; i < n ; i++) {
            counter[ar[i] -1] ++;
        }

        int type = 1;
        int maxVal = counter[0];
        for (int index = 1; index < counter.length; index++ ) {
            final int currentVal = counter[index];
            if (currentVal > maxVal) {
                maxVal = currentVal;
                type = index + 1;
            }
        }
        return type;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        in.close();
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
