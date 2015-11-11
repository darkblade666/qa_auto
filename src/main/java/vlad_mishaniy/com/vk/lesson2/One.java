package main.java.vlad_mishaniy.com.vk.lesson2;

import java.util.Scanner;

/**
 * Created by kip_notebook on 11.11.2015.
 */
public class One {
    public static void main (String ... args){
        System.out.println("Enter top of triangular, for example 5");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean b = true;

//        for(byte i = 0; i<=(x*2) ; i++ ){
            after:
            for(byte j = 0; b ? j<=(x*2) : j<=((x*2)-j); j++){
                if (j==x) b=false;
                System.out.print("*");
                if (j==j++) continue after;
            }
//            System.out.println("*");
//        }
    }
}
