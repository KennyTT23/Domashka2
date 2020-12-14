package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {



    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] randNum = new int[11];
        for (int i = 0; i < randNum.length; i++){
            randNum[i] = (int) Math.random();
        }
        System.out.println(randNum);
    }
}
