package com.kakura.task1.parser.impl;

import com.kakura.task1.parser.Parser;
import com.kakura.task1.validator.impl.ValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ParserImpl implements Parser {

    private static Logger logger = LogManager.getLogger();

    private static final String REGEX_DELIMITER = " - |, | ";

    @Override
    public int[] parseStringToIntArray(String string) {

        ValidatorImpl validator = ValidatorImpl.getInstance();

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
