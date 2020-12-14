package com.company;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
         int[] task1 = {1, 0, 0, 1, 0, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(changeNumbers(task1)));

        int[] task2 = new int[8];
        System.out.println(Arrays.toString(fillNumbers(task2)));

        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(mulNumbers(task3)));

        int[][] task4 = new int[5][5];
        squareArr(task4);

//        int [] task5 = {23, 5, 14, 13, 20, 16, 1, 3 };
//        System.out.println(Arrays.toString(showMin(task5)));
    }


    // task 1
    private static int[] changeNumbers(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    //     task 2
    private static int[] fillNumbers(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j = j + 3;
        }
        return arr;
    }

    // task 3
    private static int[] mulNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            } else {
                arr[i] = arr[i];
            }
        }
        return arr;
    }

//task 4
    private static  int[][] squareArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][i] = 1;
                arr[i][arr.length - 1 - i] = 1;
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        return arr;
    }

//task 5

//    private static int[]  showMin(int[] arr){
//        int min = arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i] > min ){
//                return min;
//            }
//        }return arr;
//    }
}

