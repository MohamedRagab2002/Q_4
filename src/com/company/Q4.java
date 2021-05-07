package com.;
import java.util.Scanner;
public class Q4 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number");

        int power = reader.nextInt();

        double result = Math.exp(power);
        System.out.println("The Result is"   + result);
    }
}
