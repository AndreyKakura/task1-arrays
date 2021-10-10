package com.kakura.task1.validator.impl;

import com.kakura.task1.validator.Validator;

public class ValidatorImpl implements Validator {

    private static final ValidatorImpl instance = new ValidatorImpl();

    //private static final String INT_REGEX = "-?\\d+";
    private static final String STRING_OF_INT_ARRAY_REGEX = "(-?\\d+( |, | - |))+";

    private ValidatorImpl() {

    }

    public static ValidatorImpl getInstance() {
        return instance;
    }

    @Override
    public boolean validateString(String string) {
        return string.matches(STRING_OF_INT_ARRAY_REGEX);
    }

    /*
    @Override
    public boolean isInt(String stringNumber) {
        return stringNumber.matches(INT_REGEX);
    }
*/
}
