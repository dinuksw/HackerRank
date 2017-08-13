package com.kunid.algorithms.sorting;

import java.util.*;

public class BigSorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = scanner.next();
        }
        scanner.close();

        Arrays.sort(unsorted, (a, b) -> {
            final int aLength = a.length();
            final int bLength = b.length();
            if (aLength > bLength) {
                return 1;
            }
            else if (aLength == bLength){
                return a.compareTo(b);
            }
            else {
                return -1;
            }
        });

        for(String str: unsorted) {
            System.out.println(str);
        }
    }
}

