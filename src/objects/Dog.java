package objects;

import abstracts.Herbivoves;

public class Dog extends Herbivoves {
    String name = "dog";
    boolean alive = true;

    public void noice(){
        System.out.println("Bark bark bark!!");
    }
}
