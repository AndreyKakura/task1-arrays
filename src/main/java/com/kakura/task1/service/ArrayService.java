package com.kakura.task1.service;

import com.kakura.task1.entitiy.CustomArray;

public interface ArrayService {

    int findMin(CustomArray customArray);

    int findMinStream(CustomArray customArray);

    int findMax(CustomArray customArray);

    int findMaxStream(CustomArray customArray);

    int findSum(CustomArray customArray);

    int findSumStream(CustomArray customArray);

    double findAverage(CustomArray customArray);

    double findAverageStream(CustomArray customArray);

    int numberOfPositiveElements(CustomArray customArray);

    int numberOfPositiveElementsStream(CustomArray customArray);

    int numberOfNegativeElements(CustomArray customArray);

    int numberOfNegativeElementsStream(CustomArray customArray);

    void replaceNegativeWithZero(CustomArray customArray);

    void bubbleSort(CustomArray customArray);

    void shuttleSort(CustomArray customArray);

    void shellSort(CustomArray customArray);

}
