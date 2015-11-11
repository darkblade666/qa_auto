package main.java.vlad_mishaniy.com.vk.lesson3;

/**
 * Created by kip_notebook on 11.11.2015.
 */

public class Main {
    public static void main(String ... args){
        Cat murzik = new Cat();
        Cat barsik = new Cat(1,14,"Barsik", true);
        String murzikVoise = "Myau-Myau-Myau";
        String toConsole = murzik.returnCustomVoice(murzikVoise);

        murzik.setAge(3);
        murzik.setWeight(12);
        murzik.setName("Murzik");
        murzik.setSex(true);

        System.out.println("Murzik's age: " + murzik.getAge() + " Murzik's weight: " + murzik.getWeight() + " Murzik's name: " + murzik.getName());
        System.out.println("Barsik's age: " + barsik.getAge() + " Barsik's weight: " + barsik.getWeight() + " Barsik's name: " + barsik.getName());
        barsik.voice();
    }
}
