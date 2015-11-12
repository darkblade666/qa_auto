package main.java.vlad_mishaniy.com.vk.lesson3;

import java.util.Random;

/**
 * Created by kip_notebook on 11.11.2015.
 */
public class Cat {
    private int age, weight;
    private String name, color;
    private boolean sex;

    public Cat(){}
    public Cat(int age, int weight, String color, String name, boolean sex){
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void voice(){
        System.out.println(this.getName() + " " + " = say mayu-myau");
    }


    public Cat makeLove(Cat anotherCat){
        if ((this.isSex() == true) && (anotherCat.isSex() == true)){
            System.out.println(this.getName() + " vs " + anotherCat.getName() + " = fight");
        }
        if ((this.isSex() == false) && (anotherCat.isSex() == false)){
            System.out.println(this.getName() + " vs " + anotherCat.getName() + " = say haha");
        }
        if ((this.isSex() != anotherCat.isSex())){
            Random rn = new Random();
            Cat myLittleCat = new Cat(0, 1, "color", "kitten", rn.nextBoolean());
            System.out.println("New cat has been created!");
            return myLittleCat;
        }
        return null;
    }

    public Cat fight(Cat opponent){
        if (this.getWeight() < opponent.getWeight()){
            return opponent;
        }

        if (this.getWeight() > opponent.getWeight()){
            return this;
        }
        return null;
    }
}
