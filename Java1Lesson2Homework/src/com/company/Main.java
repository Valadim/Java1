package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


//      1 Задать целочисленный массив, состоящий из элементов 0 и 1 . Например: [ 1 , 1 , 0, 0, 1 , 0, 1 , 1 , 0, 0 ]. С помощью цикла и условия заменить 0 на 1 , 1 на 0;

        int[] task1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < task1.length; i++) {

            if (task1[i] == 0) {
                task1[i] = 1;
            } else {
                task1[i] = 0;
            }
        }

        System.out.println(Arrays.toString(task1));

        System.out.println();


//      2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int counter = 0;
        int[] task2 = new int[8];

        for (int i = 0; i < task2.length; i++) {

            task2[i] = counter;
            counter += 3;
            System.out.print(task2[i] + " ");

        }

        System.out.println();
        System.out.println();


//      3 Задать массив [ 1 , 5, 3, 2, 1 1 , 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < task3.length; i++) {

            if (task3[i] < 6) {
                task3[i] *= 2;
            }
            System.out.print(task3[i] + " ");

        }

        System.out.println();
        System.out.println();


//      4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] task4 = new int[5][5];
        for (int i = 0; i < task4.length; i++) {
            for (int j = 0; j < task4[i].length; j++) {
                if ((i == j) || (i == 6 - 1)) {
                    task4[i][j] = 1;
                }

                System.out.print(task4[i][j] + " ");
            }

            System.out.println();
        }

//        Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
//        помощи интернета)

        int[] arr = {12, 3, -29, 146, 1, 952};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println("Минимальное число " + min + " " + "Максимальное число " + max);
    }


}
