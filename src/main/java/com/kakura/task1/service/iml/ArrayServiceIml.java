package com.kakura.task1.service.iml;

import com.kakura.task1.entitiy.CustomArray;
import com.kakura.task1.service.ArrayService;

public class ArrayServiceIml implements ArrayService {

    @Override
    public int findMin(CustomArray customArray) {

        int[] array = customArray.getArray();

        int min = array[0];

        for (int current : array) {
            if (min < current) {
                min = current;
            }
        }
        return min;
    }

    @Override
    public int findMax(CustomArray customArray) {

        int[] array = customArray.getArray();

        int max = array[0];

        for (int current : array) {
            if (max > current) {
                max = current;
            }
        }

        return max;
    }

    @Override
    public void replaceNegativeWithZero(CustomArray customArray) {

        int[] array = customArray.getArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }

        customArray.setArray(array);
    }

    @Override
    public int findSum(CustomArray customArray) {

        int[] array = customArray.getArray();
        int sum = 0;

        for (int current : array) {
            sum += current;
        }

        return sum;
    }

    @Override
    public double findAverage(CustomArray customArray) {

        int[] array = customArray.getArray();

        double sum = 0;

        for (int current : array) {
            sum += current;
        }

        double average = sum / array.length;
        return average;
    }

    @Override
    public int numberOfPositiveElements(CustomArray customArray) {

        int[] array = customArray.getArray();

        int amount = 0;

        for (int current : array) {
            if (current > 0) {
                amount++;
            }
        }

        return amount;
    }

    @Override
    public int numberOfNegativeElements(CustomArray customArray) {

        int[] array = customArray.getArray();

        int amount = 0;

        for (int current : array) {
            if (current < 0) {
                amount++;
            }
        }

        return amount;
    }

    @Override
    public void bubbleSort(CustomArray customArray) {

        int[] array = customArray.getArray();

        boolean needIteration = true;

        while (needIteration) {
            needIteration = false;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }

        customArray.setArray(array);
    }

    @Override
    public void shuttleSort(CustomArray customArray) {

        int[] array = customArray.getArray();

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }

        customArray.setArray(array);
    }

    @Override
    public void shellSort(CustomArray customArray) {

        int[] array = customArray.getArray();

        int gap = array.length / 2;

        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }

        customArray.setArray(array);
    }

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
