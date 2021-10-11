package com.kakura.task1.entitiy;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray(int... array) {
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

        for (int current : array) {
            arrayString += current + " ";
        }

        return arrayString;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        return Arrays.equals(this.array, ((CustomArray) obj).getArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
