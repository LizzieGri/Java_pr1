package com.company;


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        int sumOfArray = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
            sumOfArray = sumOfArray + array[i];
        }
        System.out.println(sumOfArray);
    }
}