package stuffs;

import Streams.ScannerStream;

public class TextStream {
   static ScannerStream sc = new ScannerStream();

    public boolean createOrLoad(){
        System.out.println("if you want load persons press 1, if you dont, then press whatever you want and create them.");
        return sc.getIntInput() == 1;
    }

    protected void intro(String name){
        System.out.println("Hello there, welcome to our zoo!");
        System.out.println(name + " has today shift. He will leads you.");
        System.out.println(name + ": hello adventure, we have 5 cages.");
        System.out.println(name + " now if you excuse me, i have to work.. enjoy your journey!");
        System.out.println();
    }

    protected void whereToGo(){
        System.out.println("where you want to go? put a number..");
        System.out.println("0 = monkey / 1 = tyger / 2 = lion / 3 = parrot / 4 = pufferfish / other numbers will send you home..");
    }
}
