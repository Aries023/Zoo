package stuffs;

import Streams.ScannerStream;
import objects.Employee;

import java.util.Scanner;

public class TextStream {

    static public boolean BasicEmployeeOrNot (ScannerStream sc){
        System.out.println("do you want basic employee? if yes write 1 and enter, whatever else means no..");
        return sc.getIntInput() == 1;
    }

    static public boolean addEmployeeOrNot(ScannerStream sc){
        System.out.println("if you want create another employee press 1, if you dont, then press whatever you want and create them.");
        return sc.getIntInput() == 1;
    }

    static public Employee createEmployee(ScannerStream sc){
        System.out.println("what is employee name?");
        String name = sc.getStringImput();
        System.out.println("how old " + name + " is?");
        byte age = (byte) sc.getIntInput();
        return new Employee(name,age);
    }

    static public void intro(String name){
        System.out.println("Hello there, welcome to our zoo!");
        System.out.println(name + " has today shift. He will leads you.");
        System.out.println(name + ": hello adventure, we have 5 cages.");
        System.out.println(name + " now if you excuse me, i have to work.. enjoy your journey!");
        System.out.println();
    }

    static public int whereToGo(ScannerStream sc){
        System.out.println("where you want to go? put a number..");
        System.out.println("0 = monkey / 1 = tyger / 2 = lion / 3 = parrot / 4 = pufferfish / other numbers will send you home..");
        return sc.getIntInput();
    }
}
