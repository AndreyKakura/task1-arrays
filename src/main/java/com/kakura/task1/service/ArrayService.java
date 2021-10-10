package com.kakura.task1.service;

import com.kakura.task1.entitiy.CustomArray;

public interface ArrayService {

    int findMin(CustomArray customArray);

    int findMax(CustomArray customArray);

    CustomArray replaceNegativeWithZero(CustomArray customArray);

    int findSum(CustomArray customArray);

    double findAverage(CustomArray customArray);

    int numberOfPositiveElements(CustomArray customArray);

    int numberOfNegativeElements(CustomArray customArray);

}
