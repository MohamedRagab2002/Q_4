package com.company;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int No1, No2, No3, fin_Result;
            System.out.println("Enter The first No ");
            No1 = reader.nextInt();
            System.out.println("Enter The second No: ");
            No2 = reader.nextInt();
            System.out.println("Enter The Third No: ");
            No3 = reader.nextInt();
        fin_Result = (int) Math.pow(No1*No2*No3,2);
            System.out.println("The result = " + fin_Result);
        }
    }
