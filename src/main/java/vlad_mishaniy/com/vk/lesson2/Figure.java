package main.java.vlad_mishaniy.com.vk.lesson2;

import java.util.Scanner;

/**
 * Created by kip_notebook on 09.11.2015.
 */
public class Figure {
//    public int i = 0;
//    public int j = 0;

    public static void main (String ... args){
        System.out.println("Enter top of triangular, for example 5");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), n = 0;
        boolean b = true;

        for(byte i = 0; i<=(x*2) ; i++ ){

            for(byte j = 0; b ? j<=i : j<=((x*2)-i); j++){
                if (j==x) b=false;
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
