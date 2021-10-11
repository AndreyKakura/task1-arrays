package com.kakura.task1.service.impl;

import com.kakura.task1.entitiy.CustomArray;
import com.kakura.task1.service.ArrayService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceImplTest {

    private ArrayService arrayService;
    private CustomArray customArray = new CustomArray(11, -22, 33, 88, -44);

    @BeforeEach
    void setUp() {
        arrayService = new ArrayServiceImpl();
    }

    @AfterEach
    void tearDown() {
        arrayService = null;
    }

    @Test
    void findMin() {
        int actualResult = arrayService.findMin(customArray);
        assertEquals(-44, actualResult);

    }

    @Test
    void findMinStream() {
        int actualResult = arrayService.findMin(customArray);
        assertEquals(-44, actualResult);
    }

    @Test
    void findMax() {
        int actualResult = arrayService.findMax(customArray);
        assertEquals(88, actualResult);
    }

    @Test
    void findMaxStream() {
        int actualResult = arrayService.findMax(customArray);
        assertEquals(88, actualResult);
    }

    @Test
    void replaceNegativeWithZero() {
        arrayService.replaceNegativeWithZero(customArray);
        assertEquals(new CustomArray(11, 0, 33, 88, 0), customArray);

    }

    @Test
    void findSum() {
        int actualResult = arrayService.findSum(customArray);
        assertEquals(66, actualResult);
    }

    @Test
    void findSumStream() {
        int actualResult = arrayService.findSum(customArray);
        assertEquals(66, actualResult);
    }

    @Test
    void findAverage() {
        double actualResult = arrayService.findAverage(customArray);
        assertEquals(13.2, actualResult);
    }

    @Test
    void findAverageStream() {
        double actualResult = arrayService.findAverage(customArray);
        assertEquals(13.2, actualResult);
    }

    @Test
    void numberOfPositiveElements() {
        int actualResult = arrayService.numberOfPositiveElements(customArray);
        assertEquals(3, actualResult);
    }

    @Test
    void numberOfPositiveElementsStream() {
        int actualResult = arrayService.numberOfPositiveElements(customArray);
        assertEquals(3, actualResult);
    }

    @Test
    void numberOfNegativeElements() {
        int actualResult = arrayService.numberOfNegativeElements(customArray);
        assertEquals(2, actualResult);
    }

    @Test
    void numberOfNegativeElementsStream() {
        int actualResult = arrayService.numberOfNegativeElements(customArray);
        assertEquals(2, actualResult);
    }

    @Test
    void bubbleSort() {
        arrayService.bubbleSort(customArray);
        assertEquals(new CustomArray(-44, -22, 11, 33, 88), customArray);

    }

    @Test
    void shuttleSort() {
        arrayService.shuttleSort(customArray);
        assertEquals(new CustomArray(-44, -22, 11, 33, 88), customArray);
    }

    @Test
    void shellSort() {
        arrayService.shellSort(customArray);
        assertEquals(new CustomArray(-44, -22, 11, 33, 88), customArray);
    }
}