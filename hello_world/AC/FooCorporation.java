package AC;
import java.util.Scanner;
public class FooCorporation {

    public static double pay(double work, double basepay)
    {
        if (work > 40)
        {
            if (work >= 60)
            {
                double answer = basepay * 40 + 1.5 * basepay * 20;
                System.out.println("remember, there's a maximum of 20 hours of overtime!");
                return answer;
            }
            else 
            {
                double answer = basepay * 40 + 1.5 * basepay * (work - 40);
                return answer;
            }
        } 
        else
        {
            double answer = work * basepay;
            return answer;
        }
    }
    public static void main(String[] args) {
        Scanner tetoscanner = new Scanner (System.in);
        System.out.println("how many hours did you work?");
        double work = tetoscanner.nextDouble();

        System.out.println("what's the base pay per hour?");
        double basepay = tetoscanner.nextDouble();

        if (basepay >= 8)
        {
            double answer = pay(work, basepay);

            System.out.println("you will recieve $" + answer + ".");
        }
        else
        {
            System.out.println("base pay must be at least 8 dollars :(");
        }
    }
}
