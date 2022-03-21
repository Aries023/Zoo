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

    static public String getStringImput (Scanner sc){
        try {
            sc.nextLine();       // reset Scanner
            return sc.nextLine();
        }catch (Exception e){
            e.getStackTrace();
            System.out.println("there is error, try it again :/");
        }
        return getStringImput(sc);
    }

    private ScannerStream() {
    }

    static public int getIntInput (Scanner scanner){
        try {
            scanner.nextInt();        // reset Scanner
            return scanner.nextInt();
        }catch (Exception e){
            e.getStackTrace();
            System.out.println("you probably did not put number :/ try it again!");
        }
        return getIntInput(scanner);
    }

    static public void close (Scanner scanner){
        scanner.close();
    }
}
