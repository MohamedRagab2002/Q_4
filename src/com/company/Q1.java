package com.company;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        String city;
        String country;

        System.out.println("Please enter city: ");
        city = reader.nextLine();
        System.out.println("Please enter country: ");
        country = reader.nextLine();
        String mo = country.substring(0,2) + ',' + city + random.nextInt(100);
        System.out.println(mo);


    }
}
