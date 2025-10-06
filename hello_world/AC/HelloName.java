package AC;
import java.util.Scanner;

public class HelloName {
    public static void printName(String name)
    {
        System.out.println("Hello, " + name + "!");
    }
    public static void main (String[] args) {
        Scanner abcscanner = new Scanner(System.in);
        System.out.println("What is your name ");
        String name = abcscanner.nextLine();
        printName(name);
        abcscanner.close();
    }
}