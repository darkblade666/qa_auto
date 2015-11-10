package main.java.vlad_mishaniy.com.vk.lesson2;

import java.util.Scanner;

/**
 * Created by kip_notebook on 09.11.2015.
 */
public class Main {

    public Scanner scanner = new Scanner(System.in);
    String hj = scanner.next();
    public void getString(){
        switch (hj){
            case "a": System.out.println(" This a"); break;
            case "b": System.out.println("This b"); break;
            default: System.out.println("Null"); break;
        }
    }

    public static void main (String ... aggs){
        System.out.println("Enter a or b");
        Main main = new Main();
        main.getString();
    }
}
