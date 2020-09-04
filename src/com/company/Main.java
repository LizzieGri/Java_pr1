package com.company;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ///////////////////task2//////////////////
        System.out.print("Выполняю второе задание");
        int[] array = new int[10];
        int sumOfArray = 0;
        Random random = new Random();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
            sumOfArray = sumOfArray + array[i];
        }
        System.out.println(sumOfArray);
        /////////////////task3//////////////////
        System.out.print("Выполняю третье задание");
        System.out.println();
        for (String str : args) {
            System.out.print(str + " ");
        }

        /////////////////task4////////////////
        System.out.println("Выполняю четвертое задание");
        System.out.println();
        int a = 11;
        double[] Array = new double[a];
        for (int i = 1; i < a; i++) {
            Array[i] = 1 / (Math.pow(i,2));
            System.out.printf("%.3f", Array[i]);
            System.out.print("  ");
        }
    }

}