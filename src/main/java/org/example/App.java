package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        double sTax = 0;
        double cTax = 0;
        double tax = 0;
        double total = 0;
        String wi = "Wisconsin";
        String il = "Illinois";
        String ec = "Eau Claire";
        String dn = "Dunn";

        System.out.print("What is the order amount: ");
        String ordAmt = se.nextLine();
        double amt = Double.parseDouble(ordAmt);

        System.out.print("What state do you live in? ");
        String state = se.nextLine();

        if (state.equalsIgnoreCase(wi)){
            System.out.print("What county do you live in? ");
            String county = se.nextLine();

            sTax = amt * 0.05;

            if(county.equalsIgnoreCase(ec)){
                cTax = amt * 0.005;
                tax = sTax + cTax;
                total = amt + tax;
            }
            else if(county.equalsIgnoreCase(dn)){
                cTax = amt * 0.004;
                tax = sTax + cTax;
                total = amt + tax;
            }
            else{
                tax = sTax;
                total = amt + tax;
            }
        }
        else if (state.equalsIgnoreCase(il)){
            sTax = amt * 0.08;
            tax = sTax;
            total = amt + tax;
        }
        else{
            total = amt;
        }

        System.out.println("The tax is $" + String.format("%.2f", tax) + ".\nThe total is $" + String.format("%.2f", total) + ".");
    }
}
