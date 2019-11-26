package com.company;

public class Exercises {

    public static void main(String[] args) {
        System.out.println(addOdds(7));
        System.out.println(addOdds(9));
        System.out.println(addOdds(12));
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(69));
        System.out.println(sumDigits(99999969));
        sillyNumbers();
        sillyNumbers2();
        dollarsAndStars();
    }

    public static int addOdds(int n) {
        int i;
        int a = 0;
        for (i = 1; i <= n; i = i + 2) {
            a = a + i;
        }
        return a;
    }

    public static int howManyYears(double startPop, double endPop) {
        int a = 0;
        while (startPop <= endPop) {
            startPop = startPop + (startPop * 0.0113);
            a++;
        }
        return a;
    }

    public static int sumDigits(int n) {
        int total = 0;
        int a = 0;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            total = total + a;
        }
        return total;
    }

    public static void sillyNumbers() {
        int a = 0;
        for (int z = 1; z <= 3; z++) {
            for (int i = 0; i < 10; i++) {
                for (a = 1; a <= 3; a++) {
                    System.out.print(i);

                }
            }
            System.out.println();
        }
    }

    public static void sillyNumbers2() {
        int a = 0;
        for (int z = 1; z <= 4; z++) {
            for (int i = 9; i > 0; i--) {
                for (a = 1; a <= i * 1; a++) {
                    System.out.print(i);

                }
            }
            System.out.println();
        }
    }
    public static void dollarsAndStars(){

    }
}
