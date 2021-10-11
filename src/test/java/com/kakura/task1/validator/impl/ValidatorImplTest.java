package com.kakura.task1.validator.impl;

import com.kakura.task1.validator.Validator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorImplTest {

    private Validator validator;
    private static final String CORRECT_STRING  = "11, 22, -33 - 44";
    private static final String INCORRECT_STRING = "111, 1asf aqwr   14";

    @BeforeEach
    void setUp() {
        validator = ValidatorImpl.getInstance();
    }

    @AfterEach
    void tearDown() {
        validator = null;
    }

    @Test
    void validateString() {
        assertTrue(validator.validateString(CORRECT_STRING));
        assertFalse(validator.validateString(INCORRECT_STRING));
    }
}