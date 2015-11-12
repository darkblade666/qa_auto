package main.java.vlad_mishaniy.com.vk.lesson3;

/**
 * Created by kip_notebook on 11.11.2015.
 */
public class Car {
    private String name, color, manufavteur;
    private int engine;

    public Car(){}

    public Car(String name, String color, String manufavteur, int engine) {
        this.name = name;
        this.color = color;
        this.manufavteur = manufavteur;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufavteur() {
        return manufavteur;
    }

    public void setManufavteur(String manufavteur) {
        this.manufavteur = manufavteur;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public boolean start(boolean start){
        return start;
    }

    public boolean stop(boolean stop){
        return stop;
    }
}
