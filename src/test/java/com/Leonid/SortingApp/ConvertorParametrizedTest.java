package com.Leonid.SortingApp;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ConvertorParametrizedTest {

    private static Sorter sorter;
    private final String[] inputArgs;
    private final int[] expected;

    @BeforeClass
    public static void setUp() {
        sorter = new Sorter();

    }

    public ConvertorParametrizedTest(String[] inputArgs, int[] expected) {
        this.inputArgs = inputArgs;
        this.expected = expected;
    }



    @Parameterized.Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"1", "24", "21", "43", "12", "65", "34", "6", "23"},
                        new int[]{1, 24, 21, 43, 12, 65, 34, 6, 23}},
                {new String[]{"25", "9", "47", "24", "27", "67", "67", "39", "14"},
                        new int[]{25, 9, 47, 24, 27, 67, 67, 39, 14}},
                {new String[]{"40", "18", "44", "53", "17", "3", "15", "75", "45"},
                        new int[]{40, 18, 44, 53, 17, 3, 15, 75, 45}},
                {new String[]{"66", "73", "2", "74", "96", "29", "10", "74", "79"},
                        new int[]{66, 73, 2, 74, 96, 29, 10, 74, 79}},
                {new String[]{"28", "47", "53", "7", "13", "62", "64", "54", "85"},
                        new int[]{28, 47, 53, 7, 13, 62, 64, 54, 85}}
        });
    }

    @Test
    public void stringMassiveConvertToIntMassiveCaseTest() {
        Assert.assertArrayEquals(expected, sorter.convert(inputArgs));
    }
}
