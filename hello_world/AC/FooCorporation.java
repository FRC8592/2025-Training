package AC;
import java.util.Scanner;
public class FooCorporation {

    public static double pay(double work)
    {
        if (work > 40)
        {
            if (work > 60)
            {
                double answer = 580;
                return answer;
            }
            else 
            {
                double answer = 320 + 12 * (work - 40);
                return answer;
            }
        } 
        else
        {
            double answer = work * 8;
            return answer;
        }
    }
    public static void main(String[] args) {
        Scanner tetoscanner = new Scanner (System.in);
        System.out.println("how many hours did you work?");

        double work = tetoscanner.nextDouble();

        double answer = pay(work);

        System.out.println("you will recieve $" + answer + ".");
    }
}
