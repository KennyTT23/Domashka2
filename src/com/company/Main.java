package com.company;

public class Main {

    public static void main(String[] args) {
        String introduction = "My name is Vyacheslav, I'll try hard).";
        //hope didn't lose variables...
        byte b1 = 1;
        short s1 = 123;
        int i1 = 4512;
        long l1 = 51112;
        float f1 = 12.42f;
        double d1 = 142.56563;
        char c1 = 'D';

        letsCount(10.34f, 31.45f, 42.54f, 3.56f);
        count(9, 5);
        wholeNumber(6);
        chooseWise(-5);
        name("Алекс!");
        divide(400);
    }

    // task 3...
    public static float letsCount(float a, float b, float c, float d) {
        float sum = a * (b + (c / d));
        System.out.println(sum);
        return sum;
    }

    //Not sure about that...task 4 (h/w)
    public static boolean count(int a, int b) {
        int sum = a + b;
        boolean right = true;
        if (sum > 10 && sum < 20) {
            return true;
        } else
            return false;
    }

    // task 5...
    public static int wholeNumber(int a) {

        if (a >= 0) {
            System.out.println(a + " is Positive");
        } else
            System.out.println(a + " is Negative");

        return 0;
    }

    // task 6...
    public static boolean chooseWise(int a) {
        int result = a;
        if (a < 0) {
            return true;
        } else
            return false;
    }

    //  task 7...
    public static String name(String callMe) {
        System.out.println("Привет, " + callMe);

        return callMe;
    }

// task 8... 2020 is leap year...

    public static int divide(int a) {
        int sum1 = a % 4;
        int sum2 = a % 400;
        int sum3 = a % 100;

        if (sum3 < sum2) {
            System.out.println(a + " - не високосный год.");
        } else if (sum1 == 0) {
            System.out.println(a + " - високосный год.");
        }else
            System.out.println(a + " - Ошибка");
     return 0;

    }
}
