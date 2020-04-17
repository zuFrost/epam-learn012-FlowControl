package com.zufrost.learn.array;

public class ArrayCreator {
    public int[] createIntArray() {
        int [] array;
        array = new int[10];
        for (int i = 0; i < 10 ; i++) {
            array[i] = 100 + i;
        }
        return array;
    }

    public String[] createStringArray(final int SIZE) {
        String [] strings = new String[SIZE];
        for (int i = 0; i < SIZE; i++) {
            strings[i] = String.valueOf(i);
        }
        return strings;
    }
}
