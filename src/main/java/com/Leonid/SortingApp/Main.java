package com.Leonid.SortingApp;


public class Main {
    public static void main(String[] args) {



        Sorter sorter = new Sorter();
        sorter.printSortedList(sorter.sort(sorter.convert(args)));
    }
}
