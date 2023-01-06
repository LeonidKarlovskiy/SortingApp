package com.leonid.sorting_app;

import org.apache.log4j.Logger;
import java.util.Arrays;

public class Sorter {

    private static final Logger logger = Logger.getLogger(Sorter.class);

    public int[] convert(String[] args) {
        validator(args);
        return Arrays.stream(args).mapToInt(Integer::parseInt).sorted().toArray();
    }

    private void validator(String[] args) {
        if (args.length==0){
            logger.error("Empty argument line");
            throw new IllegalArgumentException(" Empty argument line");
        } else if (args.length > 10) {
            logger.error("more than 10 arguments");
            throw new IllegalArgumentException("more than 10 arguments");
        }
    }
}