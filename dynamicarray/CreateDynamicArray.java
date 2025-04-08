package com.dynamicarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CreateDynamicArray {
    public static void main(String[] args) {
        System.out.print("Enter Count to Create An Array: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] numberArray = new int[count];
        System.out.println(Arrays.toString(numberArray));

        System.out.print("Enter a bond number: ");
        int boundNumber = scanner.nextInt();

        Random rand = new Random();

        for (int i = 0; i < numberArray.length; i++) {
            int randomNumber = rand.nextInt(boundNumber);
            numberArray[i] = rand.nextInt(boundNumber);
        }
        System.out.println(Arrays.toString(numberArray));
    }
}
