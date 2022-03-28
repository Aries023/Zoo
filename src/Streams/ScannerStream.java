package Streams;

import java.util.Scanner;

/**
 * this class is serviced to receive input from the user
 *
 * - method getStringInput serve for String imput
 * - method getIntInput serve for int input
 * - method close serve as closer of Scanner
 */

public class ScannerStream {

    static Scanner sc = new Scanner(System.in);

    public String getStringImput (){
        try {
            sc.nextLine();       // reset Scanner
            return sc.nextLine();
        }catch (Exception e){
            e.getStackTrace();
            System.out.println("there is error, try it again :/");
        }
        return getStringImput();
    }

    public int getIntInput (){
        try {
            sc.nextInt();        // reset Scanner
            return sc.nextInt();
        }catch (Exception e){
            e.getStackTrace();
            System.out.println("you probably did not put number :/ try it again!");
        }
        return getIntInput();
    }

    static public void close (Scanner scanner){
        scanner.close();
    }
}
