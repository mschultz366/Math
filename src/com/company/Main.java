package com.company;
// program that shows user tax on any given item price
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.print("Enter items to calculate tax  ");


        double input = 10,
                total = 0,
                tax = .025;
        Scanner sc = new Scanner(System.in);
        while (input != 0) {

            System.out.print("\nEnter item cost: ");
            input = sc.nextDouble();
            total += input;
        }

        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println("\nThe total for these items is: " + df.format(total));
        System.out.println("\nThe tax for these items is: " + df.format(total * tax));
        System.out.println("\nThe total with taxes for these items is: " + df.format(total * (1 + tax)));

    }
}