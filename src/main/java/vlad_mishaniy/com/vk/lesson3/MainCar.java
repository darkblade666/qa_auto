package main.java.vlad_mishaniy.com.vk.lesson3;

/**
 * Created by kip_notebook on 11.11.2015.
 */
public class MainCar {
    public static void main(String ... args){
        Car bmw = new Car("bmw", "red", "germany", 2);
        System.out.println("Name: " + bmw.getName() + " Color: " + bmw.getColor() + " Manufavteur: " + bmw.getManufavteur() + " Engine: " + bmw.getEngine());
    }
}
