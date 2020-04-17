package com.zufrost.learn.array;

public class LearnMainArrayBound {
    public static void main(String[] args) {
        ArrayAction action = new ArrayAction();
        int [] a = {3, 4, 42};
        action.changeArray(a, 7);

        for (int element : a) {
            element += 1;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
}
