package main.java.vlad_mishaniy.com.vk.lesson3;

/**
 * Created by kip_notebook on 11.11.2015.
 */

public class Main {
    public static void main(String ... args){
        Cat barsik = new Cat(2, 13, "white", "barsik", true);
        Cat murzik = new Cat(7, 13, "black", "murzik", true);
        Cat murka = new Cat(5, 8, "black", "murka", false);

        murka.voice();
        barsik.makeLove(murzik);
        Cat newCat = barsik.makeLove(murka);
        System.out.println(newCat.getName() + " - this is new cat's name");

        System.out.println("-------");
        System.out.println("Winner: " + barsik.fight(murzik).getName());
    }
}
