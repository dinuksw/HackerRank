package com.kunid.algorithms.recursion;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class RecursiveDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] tokens = scanner.nextLine().trim().split(" ");
        scanner.close();

        final String input = tokens[0];
        final int times     = Integer.parseInt(tokens[1]);

        final String digitString = buildLargeString(input, times);

        long start = System.currentTimeMillis();
        System.out.println(getSuper_digit(digitString));
        System.out.println("phase 2: " + (System.currentTimeMillis() - start) / 1000d);
    }

    private static String getSuper_digit(String digitString) {
        if (digitString.length() == 1) {
            return digitString;
        }
        else {
            final double sumValue = getSumValue(digitString);
            BigInteger sum = new BigInteger(new BigDecimal(sumValue).toPlainString());
            String newDigitString = sum.toString();
            return getSuper_digit(newDigitString);
        }
    }

    private static double getSumValue(String digitString) {
        final DoubleStream chars = digitString.chars().map(Character::getNumericValue).asDoubleStream();
        return chars.sum();
    }

    private static String buildLargeString(final String input, final int times) {
        long start = System.currentTimeMillis();
        double firstPass =  getSumValue(input) * times ;

        final String output = new BigDecimal(firstPass).toPlainString();
        System.out.println("phase 1: " + (System.currentTimeMillis() - start) /1000D);
        return output;
    }
}
