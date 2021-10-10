package com.kakura.task1.entitiy;

public class CustomArray {
    private int[] array;

    public CustomArray(int[] array) {
        this.array = array.clone();
    }


    public int[] getArray() {
        int[] array = this.array.clone();
        return array;
    }

    public void setArray(int[] array) {
        this.array = array.clone();
    }

    @Override
    public String toString() {

        String arrayString = "";

        for(int current: array) {
            arrayString += current + " ";
        }

        return arrayString;
    }
}
