package com.kakura.task1.customreader.impl;

import com.kakura.task1.customreader.CustomReader;
import com.kakura.task1.exception.CustomReaderException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomReaderImplTest {

    private CustomReader customReader;
    private static final String EXPECTED_STRING = "21, 45, 36 99 -5 -12 - 33";

    @BeforeEach
    void setUp() {
        customReader = new CustomReaderImpl();
    }

    @AfterEach
    void tearDown() {
        customReader = null;
    }

    @Test
    void readLine() throws CustomReaderException {
        String actualString = customReader.readLine("src/test/java/resources/data/correctarrays.txt");
        assertEquals(EXPECTED_STRING, actualString);
    }

    @Test
    void readLineFileNotFound() {
        assertThrows(CustomReaderException.class, () -> {
            customReader.readLine("sr/tst/java/resources/dataz/correctarrays.word");
        });
    }

    @Test
    void readLineNoCorrectStrings() {
        assertThrows(CustomReaderException.class, () -> {
            customReader.readLine("src/test/java/resources/data/incorrectarrays.txt");
        });
    }
}