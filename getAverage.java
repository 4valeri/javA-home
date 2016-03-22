package com.company;

import java.util.Scanner;

/**
 * Created by Valeri on 19.3.2016 г..
 */
public class getAverage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        average(a, b, c);

    }

    public static void average (double a, double b, double c) {

    double average = (a + b + c) / 3;

        System.out.printf("%.2f", average);


    }
}
