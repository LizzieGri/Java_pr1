package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ////////////////////task1////////////////////
        System.out.println("Выполняю третье задание");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        System.out.print("> ");
        int ar = scan.nextInt();
        int[] array = new int[ar];
        int sumOfArray = 0;
        Random random = new Random();
        System.out.println();
        for (int i = 0; i < ar; i++) {
            array[i] = random.nextInt(15);
            sumOfArray = sumOfArray + array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println("Сумма массива = " + sumOfArray);
        System.out.println("");

        ////////////////////task2////////////////////
        System.out.println("Выполняю четвертое задание");
        System.out.println("Элементы командной строки: ");
        for (String str : args) {
            System.out.print(str + " ");
        }
        System.out.println("");
        System.out.println("");

        ////////////////////task3////////////////////
        System.out.println("Выполняю пятое задание");
        int a = 11;
        double[] Array = new double[a];
        System.out.println("Элементы гармонического ряда: ");
        for (int i = 1; i < a; i++) {
            Array[i] = 1 / (Math.pow(i, 2));
            System.out.printf("%.2f", Array[i]);
            System.out.print("  ");
        }
        System.out.println("");
        System.out.println("");

        ////////////////////task4////////////////////
        System.out.println("Выполняю шестое задание");
        int[] arr = new int[10];
        System.out.println("Неотсортированный массив: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("");

        ////////////////////task5////////////////////
        System.out.println("Выполняю седьмое задание");
        System.out.println("Введите число, факториал которого хотите узнать: ");
        System.out.print("> ");
        int f = scan.nextInt();
        getFactorial(f);
    }

    public static void getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}

