package com.leonid.sorting_app;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        System.out.println(Arrays.toString(sorter.convert(args)));
    }
}
