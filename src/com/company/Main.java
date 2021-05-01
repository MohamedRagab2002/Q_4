package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number");

        int power = reader.nextInt();

        double result = Math.exp(power);
        System.out.println("The Result is"   + result);
    }
}
