package com.zufrost.learn;

public class LearnMainWhile {
    public static void main(String[] args) {
        int value = 42;
        System.out.println("while do");
        System.out.println("break");
        while (value < 50) {
            value++;
            if (value > 44 && value < 48) {
                break;
            }
            System.out.println(value);
        }

        System.out.println("\ncontinue");
        value = 42;
        while (value < 50) {
            value++;
            if (value > 44 && value < 48) {
                continue;
            }
            System.out.println(value);
        }

        System.out.println("\ndo while");
        value = 42;
        do {
            value++;
            System.out.println(value);
        } while (value < 40);
        System.out.println("\nend");
    }
}
