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
    public CustomArray replaceNegativeWithZero(CustomArray customArray) {

        int[] array = customArray.getArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }

        return new CustomArray(array);
    }

    @Override
    public int findSum(CustomArray customArray) {

        int[] array = customArray.getArray();
        int sum = 0;

        for (int current : array) {
            sum+= current;
        }

        return sum;
    }

    @Override
    public double findAverage(CustomArray customArray) {

        int[] array = customArray.getArray();

        double sum = 0;

        for (int current : array) {
            sum+= current;
        }

        double average = sum/array.length;
        return average;
    }

    @Override
    public int numberOfPositiveElements(CustomArray customArray) {

        int[] array = customArray.getArray();

        int amount = 0;

        for(int current: array) {
            if(current>0) {
                amount++;
            }
        }

        return amount;
    }

    @Override
    public int numberOfNegativeElements(CustomArray customArray) {

        int[] array = customArray.getArray();

        int amount = 0;

        for(int current: array) {
            if(current<0) {
                amount++;
            }
        }

        return amount;
    }

}
