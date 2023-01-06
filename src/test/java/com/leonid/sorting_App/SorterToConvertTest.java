package com.leonid.sorting_App;

import com.leonid.sorting_app.Sorter;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SorterToConvertTest {



    private static Sorter sorter;


    @BeforeClass
    public static void setUp() {
        sorter = new Sorter();

    }


    @Test(expected = IllegalArgumentException.class)
    public void noElementsCaseInConvertMethod() {
        String[] args = {};
        sorter.convert(args);
    }

    @Test
    public void oneElementsCaseInConvertMethod() {
        String[] args = {"1"};
        int[] expectedArgs = {1};
        int[] result = sorter.convert(args);
        Assert.assertArrayEquals(expectedArgs, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void moreThenTenDigitsCaseInConvertMethod() {
        String[] args = {"1", "24", "21", "43", "12", "65", "34", "6", "23", "2", "765", "34"};
        sorter.convert(args);
    }


}