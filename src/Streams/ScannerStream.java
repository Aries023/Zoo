package Streams;

/**
 * this class is serviced to receive input from the user
 *
 * - method getStringInput serve for String imput
 * - method getIntInput serve for int input
 * - method close serve as closer of Scanner
 */

public class ScannerStream {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    public String getStringImput (){
        try {
            scanner.nextLine();       // reset Scanner
            return scanner.nextLine();
        }catch (Exception e){
            e.getStackTrace();
            System.out.println("there is error, try it again :/");
        }
        return getStringImput();
    }

    public int getIntInput (){
        try {
            scanner.nextInt();        // reset Scanner
            return scanner.nextInt();
        }catch (Exception e){
            e.getStackTrace();
            System.out.println("you probably did not put number :/ try it again!");
        }
        return getIntInput();
    }

    public void close (){
        scanner.close();
    }
}
