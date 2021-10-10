package com.kakura.task1.parser.impl;

import com.kakura.task1.parser.Parser;

import java.util.ArrayList;
import java.util.List;

public class ParserImpl implements Parser {

    private static final String REGEX_DELIMITER = " - |, | ";

    @Override
    public int[] parseStringToIntArray(String string) {

        String[] stringIntArray = string.split(REGEX_DELIMITER);

        List<Integer> intList = new ArrayList<>();

        for (String stringNumber : stringIntArray) {
            Integer temp = Integer.parseInt(stringNumber);
            intList.add(temp);
        }

        int[] intArray = intList.stream().mapToInt(i -> i).toArray();

        return intArray;
    }
}
