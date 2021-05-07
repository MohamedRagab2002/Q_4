package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(".####");
        float radius;

                System.out.print("Enter the radius: ");
        radius = input.nextFloat();


        System.out.println("Volume = " + format.format(Math.PI * (4/3) *Math.pow(radius, 3)));

        System.out.println("Surface area = " + format.format(Math.pow(radius, 2) * 4 * Math.PI));

    }
}
