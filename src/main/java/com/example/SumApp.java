package com.example;

import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } finally {
            scanner.close();
        }
    }
}
