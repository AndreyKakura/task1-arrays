package com.kakura.task1.service;

import com.kakura.task1.entitiy.CustomArray;

public interface ArrayService {

    int findMin(CustomArray customArray);

    int findMax(CustomArray customArray);

    int findSum(CustomArray customArray);

    double findAverage(CustomArray customArray);

    int numberOfPositiveElements(CustomArray customArray);

    int numberOfNegativeElements(CustomArray customArray);

    void replaceNegativeWithZero(CustomArray customArray);

    void bubbleSort(CustomArray customArray);

    void shuttleSort(CustomArray customArray);

    void shellSort(CustomArray customArray);

}
