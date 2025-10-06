package AC;
import java.util.Scanner;

public class GravityCalculator {
    public static void main(String[] args)
    {
        Scanner hiscanner= new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        
        double a = 9.8; //accelleration mps^2
        double t = hiscanner.nextDouble(); //time secs
        double v = 1; //velocity mps
        double p = 7; //initial position m

        double x = (0.5 * a * t * t) + (v * t) + p;

        x = Math.round(x);

        System.out.println("position after " + t + " secs is " + x + "m");

        hiscanner.close();

    }
    
}
