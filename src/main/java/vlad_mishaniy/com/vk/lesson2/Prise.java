package main.java.vlad_mishaniy.com.vk.lesson2;

import java.util.Scanner;

/**
 * Created by kip_notebook on 09.11.2015.
 */
public class Prise {
    public static void main (String ... args){

        System.out.println("Enter prise of gasoline, for example 22,3");
        Scanner scannerA = new Scanner(System.in);
        float gasoline = scannerA.nextFloat();

        System.out.println("Enter distance, for example 450");
        Scanner scannerB = new Scanner(System.in);
        float distance = scannerB.nextFloat();

        System.out.println("Enter consumption of gasoline, for example 8");
        Scanner scannerC = new Scanner(System.in);
        float consumption = scannerC.nextFloat();

        float cost = (distance/100)*consumption*gasoline;
        System.out.println("You must pay: " + cost);
    }
}
