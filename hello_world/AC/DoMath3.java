package AC;
import java.util.Scanner;

public class DoMath3 {
    //public static double square(double x)
    //{
    //    double squareAnswer = x*x;
    //    return squareAnswer;
    //}

    //public static double cube(double x)
    //{
    //    double cubeAnswer = x*x*x;
    //    return cubeAnswer;
    //}

    //public static double fourthPower(double x)
    //{
    //    double fourthPowerAnswer = x*x*x*x;
    //    return fourthPowerAnswer;
    //}

    public static double power(double base, int exponent)
    {
        if (exponent >= 0)
        {
            double answer = 1;
            for (int k = 0; k < exponent; k++)
            {
                answer = answer * base;
            }
            return answer;
        }
        else 
        {
            double answer = 1;
            for (int k = 0; k > -1 * exponent; k++)
            {
                answer = answer * base;
            }
            answer = 1 / answer;
            return answer;
        }
        
    }
    public static void main(String[] args)
    {
        Scanner mikuscanner = new Scanner(System.in);
        System.out.println("enter your number");
        double base = mikuscanner.nextDouble();
        
        System.out.println("what exponent?");
        int exponent = mikuscanner.nextInt();


        //double squareAnswer = square(base);
        //System.out.println("The square of " + base + " is " + squareAnswer);

        //double cubeAnswer = cube(base);
        //System.out.println("The cube of " + base + " is " + cubeAnswer);

        //double fourthPowerAnswer = fourthPower(base);
        //System.out.println("The fourth power of " + base + " is " + fourthPowerAnswer);

        double answer = power(base, exponent);
        System.out.println(base + " to the power of " + exponent + " is " + answer + ".");
        mikuscanner.close();
    }
}
