package com.zufrost.learn;

public class LearnMainIf {
    public static void main(String[] args) {
        String stringName = "Дорогой нашему коллективу прямоугольник";
        System.out.println(stringName + " " + perimeter(2, 4, stringName));
    }

    public static double perimeter(double lengthA, double lengthB, String name) {
        double result;
        if (name == null) {
            throw new IllegalArgumentException("Illegal argument name " + name);
        }
        if (lengthA > 0 && lengthB > 0) {
            result = 2 * (lengthA + lengthB);
        } else {
            result = -1;
        }
        return result;
    }

}
