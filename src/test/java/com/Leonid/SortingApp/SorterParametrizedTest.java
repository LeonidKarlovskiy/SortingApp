package com.Leonid.SortingApp;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SorterParametrizedTest {

    private static Sorter sorter;

    private final int[] inputted;

    private final int[] expected;

    public SorterParametrizedTest(int[] inputted, int[] expected) {
        this.inputted = inputted;
        this.expected = expected;
    }

    @BeforeClass
    public static void setUp() {
        sorter = new Sorter();

    }
    @Parameterized.Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 83, 13, 86, 0, 43, 34, 56, 69},
                        new int[]{0, 1, 13, 34, 43, 56, 69, 83, 86}},
                {new int[]{27, 31, 73, 95, 10, 20, 10, 35, 27},
                        new int[]{10, 10, 20, 27, 27, 31, 35, 73, 95}},
                {new int[]{7, 31, 77, 0, 92, 20, 21, 95, 89},
                        new int[]{0, 7, 20, 21, 31, 77, 89, 92, 95}},
                {new int[]{76, 61, 53, 59, 79, 7, 89, 54, 60},
                        new int[]{7, 53, 54, 59, 60, 61, 76, 79, 89}},
                {new int[]{43, 76, 89, 25, 1, 78, 86, 8, 18},
                        new int[]{1, 8, 18, 25, 43, 76, 78, 86, 89}}
        });
    }

    @Test
    public void stringMassiveConvertToIntMassiveCaseTest() {
        Assert.assertArrayEquals(expected, sorter.sort(inputted));
    }
}