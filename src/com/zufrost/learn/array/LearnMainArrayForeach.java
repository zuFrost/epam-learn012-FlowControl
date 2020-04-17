package com.zufrost.learn.array;

public class LearnMainArrayForeach {
    public static void main(String[] args) {
        /*String [] strings = {"Java", "Oracle", "<epam>"};
        for (String elem : strings) {
            elem +=11;
        }
        for (String elem : strings) {
            System.out.println(elem);
        }*/

        StringBuilder[] stringBuilders = new StringBuilder[3];
        stringBuilders[0] = new StringBuilder("Java");
        stringBuilders[1] = new StringBuilder("Oracle");
        stringBuilders[2] = new StringBuilder("<epam>");
        for (StringBuilder elem :
                stringBuilders) {
            elem.append("12");
        }

        for (StringBuilder elem :
                stringBuilders) {
            System.out.println(elem);
        }
    }
}
