package main.java.vlad_mishaniy.com.vk.lesson2;

import java.util.Scanner;

/**
 * Created by kip_notebook on 09.11.2015.
 */
public class Figure {
    public int i = 0;
    public int j = 0;

    public static void main (String ... args){
        System.out.println("Enter top of triangular, for example 5");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean b = true;

        for(byte i = 0 ; i<=x ; i++ ){
            for (byte j=0; b ? (j<i) : (j>i); ){
                j++;
                if(i==x){
                    x = x+3;
                    b = false;
                }
                if (!b){
                    j--;
                }
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
