package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] notes = new int [3];
        int totalSum = 0;

        Random rand = new Random();

        for (int i= 0;
             i < notes.length; i++){
            notes [i] = rand.nextInt(10);
        }

        double mitjana = (double)totalSum/ notes.length;
        System.out.println("\n Mitjana de les notes");

    }
}