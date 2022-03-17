package objects;

import abstracts.Herbivoves;

public class Parrot extends Herbivoves {

    byte dominance = 0;

    protected void noise (){
        System.out.println("Kraaa kraaaaa!");
    }
    protected void speak (String arg){
        System.out.println(arg + " kraaaa!");
    }
}
