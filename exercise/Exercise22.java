package test;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secoundNumber = input.nextDouble();

        double product = firstNumber * secoundNumber;

        System.out.println("The product of: " + firstNumber + " x " + secoundNumber + " = " + product);

        input.close();
    }
}

