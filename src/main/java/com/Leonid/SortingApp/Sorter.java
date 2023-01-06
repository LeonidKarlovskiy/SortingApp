package com.Leonid.SortingApp;



import org.apache.log4j.Logger;


import java.util.Arrays;


public class Sorter {

    static Logger logger = Logger.getLogger(Sorter.class);


    public  int[] convert(String[] args) {
        logger.info("Start of Convertor method");


        if (args.length == 0) {
            logger.error("no element ");
            throw new IllegalArgumentException("no element in command line!");
        } else if (args.length > 10) {
            logger.error("more then 10 elements ");
            throw new IllegalArgumentException("more then 10 elements in command line");
        } else {
            int[] convertedArray;
            convertedArray = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                convertedArray[i] = Integer.parseInt(args[i]);
            }
            return convertedArray;
        }
    }


    public int[] sort(int[] array){
       logger.info("Start of testing method");
        if (array.length == 0) {
            logger.error("nullable array");
            throw new IllegalArgumentException("Cant be null");
        }else if (array.length > 10) {
            throw new IllegalArgumentException("more then 10 digits in command line");
           }
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

        return array;
    }


    public void printSortedList(int[] array) {
        logger.info("Start of printing method");
        System.out.println(Arrays.toString(array));
    }



}
