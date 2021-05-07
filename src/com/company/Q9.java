package com.company;

import java.util.Random;

public class Q9 {
    public static void main(String[] args){
        int a = getRandom(), base = getRandom(), height = getRandom();
        System.out.println("Area = " + (base * height));
        // Print perimeter
        System.out.println("Perimeter = " + 2*(a + base));
    }
    static int getRandom(){
        Random rand = new Random();
        return rand.nextInt(30 - 10) + 10;
    }
}
