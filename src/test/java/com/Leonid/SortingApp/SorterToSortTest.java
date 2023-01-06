package com.Leonid.SortingApp;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SorterToSortTest {

    private static Sorter sorter;


    @BeforeClass
    public static void setUp() {
        sorter = new Sorter();

    }



    @Test(expected = IllegalArgumentException.class)
    public void noElementsCaseInSortMethod() {
        int[] args = {};
        sorter.sort(args);
    }

    @Test
    public void oneElementsCaseInConvertMethod() {
        int[] args = {1};
        int[] expectedArgs = {1};
        int[] result = sorter.sort(args);
        Assert.assertArrayEquals(expectedArgs, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void moreThenTenDigitsCaseInConvertMethod() {
        int[] args = {1, 24, 21, 43, 12, 65, 34, 6, 23, 2, 765, 34};
        sorter.sort(args);
    }


}
