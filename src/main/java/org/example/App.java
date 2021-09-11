package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App {
    public static void main(String[] args) {

        int p, year, cNum;
        double interest, inv;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        p = input.nextInt();
        System.out.print("What is the rate? ");
        interest = input.nextDouble();
        System.out.print("What is the number of years? ");
        year = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        cNum = input.nextInt();

        inv = (double)(p * Math.pow(1+(interest/100)/cNum,(cNum*year)));

        String output = String.format("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f\n", p,interest,year,cNum,inv );

        System.out.println(output);

    }
}
