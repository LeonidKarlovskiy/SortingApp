package com.Leonid.SortingApp;

import java.util.Arrays;

public class Sorter {




    public  int[] convert(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("no element in command line!");
        } else if (args.length > 10) {
            throw new IllegalArgumentException("more then 10 digits in command line");
        } else {
            int[] convertedArray;
            convertedArray = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                convertedArray[i] = Integer.parseInt(args[i]);
            }
            return convertedArray;
        }
    }


    public int[] sorter(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Cant be null");
        } else {
            boolean isSorted = true;
            while (isSorted) {
                isSorted = false;
                int temp;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = temp;
                        isSorted = true;
                    }
                }
            }
        }
        return array;
    }


    public void printSortedList(int[] array) {
        System.out.println(Arrays.toString(array));
    }



}
