package com.kakura.task1.parser.impl;

import com.kakura.task1.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserImplTest {

    private Parser parser;
    private static final String string = "11, 22 -33 - 44";

    @BeforeEach
    void setUp() {
        parser = new ParserImpl();
    }

    @Test
    void parseStringToIntArray() {
        int[] actualArray = parser.parseStringToIntArray(string);
        assertArrayEquals(new int[]{11, 22, -33, 44}, actualArray);

    }
}