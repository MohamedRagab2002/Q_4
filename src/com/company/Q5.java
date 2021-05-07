package com.company;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
   System.out.print("Enter x1 : ");
   double x1 = reader.nextInt();
   System.out.print("Enter y1 : ");
   double y1 = reader.nextInt();
   System.out.print("Enter x2 : ");
   double x2 = reader.nextInt();
   System.out.print("Enter y2 : ");
   double y2 = reader.nextInt();
   System.out.println("Slope = " + ((y2 - y1)/(x2 - x1)));

    }
}
