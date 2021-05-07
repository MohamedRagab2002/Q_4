package com.company;

import java.util.Random;

public class Q8 {
    public static void main(String[] args){
        Random rand = new Random();
        int No1 = rand.nextInt(20)+1 , No2 = rand.nextInt(20)+1;


        System.out.println("Sine(" + (No1+No2) + ") = " + Math.sin(Math.toRadians(No1+No2)));

        System.out.println("Cosine(" + (No1 + No2) + ") = " + Math.cos(Math.toRadians(No1 + No2)));
    }
}