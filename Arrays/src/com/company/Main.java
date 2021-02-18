package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void reverseArray(ArrayList<Integer> intArray) {
        int min = 0;
        int max = intArray.size()-1;

        while(min < max) {
            int val1 = intArray.get(min);
            int val2 = intArray.get(max);
            intArray.set(max, val1);
            intArray.set(min, val2);
            min++;
            max--;
        }
        System.out.println(intArray);
    }

    public static int minInteger(ArrayList<Integer> intArray) {
        // start min value
        int min = intArray.get(0);
        for (int i = 1; i < intArray.size(); i++) {
            int currentVal = intArray.get(i);
            if (currentVal < min) {
                min = currentVal;
            }
        }
        return min;
    }
    public static void printArray(ArrayList<Integer> intArray) {
        for (int i: intArray) {
            System.out.println(i);
        }
    }

    public static void sortIntegers(ArrayList<Integer> intArray) {
        intArray.sort(Collections.reverseOrder());
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter List of Integers: (Press 1 to stop entering numbers)");

        ArrayList<Integer> intArray = new ArrayList<Integer>();
        while(true) {
            // to stop entering numbers
            int num = myObj.nextInt();
            if (num == 1) {
                break;
            }
            intArray.add(num);
        }
        reverseArray(intArray);

        System.out.print("min value is: ");
        System.out.println(minInteger(intArray));
        // sortIntegers(intArray);
        //printArray(intArray);
    }
}
