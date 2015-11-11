package main.java.vlad_mishaniy.com.vk.lesson3;

/**
 * Created by kip_notebook on 11.11.2015.
 */
public class Cat {
    private int age, weight;
    private String name;
    private boolean sex;

    public Cat(){}
    public Cat(int Age, int Weight, String Name, boolean Sex){
        this.age = Age;
        this.weight = Weight;
        this.name = Name;
        this.sex = Sex;
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
        System.out.println("Myau-Myau");
    }

    public String returnCustomVoice(String customVoice){
        return customVoice;
    }
}
