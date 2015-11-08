package main.java.vlad_mishaniy.com.vk.lesson1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by kip_notebook on 04.11.2015.
 */
public class Pars {
    public static void main(String ... agrs){
        try{
            System.out.println("Enter five symbols");
            Scanner scannerA = new Scanner(System.in);
            int x = scannerA.nextInt();
            int a = x/10000;
            int b = x/1000%10;
            int c = x/100%10;
            int d = x/10%10;
            int e = x/1%10;
            System.out.println("You enter: " + x);
            System.out.println("First symbol: " + a);
            System.out.println("Second symbol: " + b);
            System.out.println("Third symbol: " + c);
            System.out.println("Fourth symbol: " + d);
            System.out.println("Fifth symbol: " + e);

            System.out.println("----------NEXT TEST----------");
            System.out.println("Enter five symbols");
            Scanner scannerB = new Scanner(System.in);
            String pars = scannerB.next();
            for (byte i = 0; i < 5; i++){
                System.out.println(pars.charAt(i));
            }

            System.out.println("----------NEXT TEST----------");
            System.out.println("Enter five symbols");
            Scanner scannerC = new Scanner(System.in);
            String parsC = scannerB.next();
            StringTokenizer stringTokenizer = new StringTokenizer(parsC, "1234567890", true);
            while (stringTokenizer.hasMoreTokens()){
                System.out.println(stringTokenizer.nextToken());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
