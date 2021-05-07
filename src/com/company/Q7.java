package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(".##");
        float first_side, second_side , height;


        System.out.print("Enter first_side: ");
        first_side = input.nextFloat();
        System.out.print("Please enter second_side: ");
        second_side = input.nextFloat();

        System.out.print("Enter the height of the trapezoid: ");
        height = input.nextFloat();

        System.out.println("Area = " + format.format(((first_side + second_side) / 2) * height));
    }
}
