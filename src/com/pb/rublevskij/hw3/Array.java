package com.pb.rublevskij.hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Array {public static void main(String[] args) {
    int counter, num, array[];


    Scanner input = new Scanner(System.in);
    System.out.println("Введите количество элементов массива: ");
    num = input.nextInt();


    array = new int[num];

    System.out.println("Введите " + num + " чисел");


    for (counter = 0; counter < num; counter++) {
        array[counter] = input.nextInt();
    }


    System.out.println("массив перед пузырьковой сортировкой : " + Arrays.toString(array));

    int sum = 0;
    for(int i = 0; i < array.length; i++) {
        sum += array[i];
    }
    System.out.println("Сумма элементов массива:" + sum);
    int positiveCount = 0;
    for(int i = 0; i < array.length; i++) {
        if (array[i] > 0) {
            positiveCount++;
        } else {
            continue;
        }
    }
    System.out.println("Кол-во положительных элементов:" + positiveCount);
    bubbleSort(array);


    System.out.println("массив после пузырьковой сортировки : " + Arrays.toString(array));
}
    public static void bubbleSort(int[] num) {
        int j;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}

