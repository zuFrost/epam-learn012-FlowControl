package com.zufrost.learn;

public class LearnMainForQuest {
    public static void main(String[] args) {
        /*int i = 1;
        int sum = 0;
        for(; i <= 100; i++){
            sum += i;
        }*/ //5050

        /*int sum = 0;
        for(int i = 1; i <= 100; ){
            sum += i++;
        }*/ //5050

        /*for(int i = 1, sum = 0; i <= 100; sum += i+, i++) {
            System.out.println(sum);
        }*/ // Error:(16, 52) java: illegal start of expression

        /*for(int i = 1, sum = 0; i <= 100; sum += i++) {
            System.out.println(sum); //4950
        }*/

//        for(int i = 0, sum = 0; i++, i <= 100; sum += i) {
//            System.out.println(sum);
//        }

//        System.out.println(sum);
    }
}
