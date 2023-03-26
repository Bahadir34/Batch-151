package practices.invidualquestions;

/*

    Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

    Input : 30 and 40

    Expected OutPut:

    GCD for 30 and 40 = 10

    LCM for 30 and 40 = 120

 */

import java.util.Scanner;

public class EBOB_EKOK_Replit
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int fNum = input.nextInt();

        System.out.print("Enter second number : ");
        int sNum = input.nextInt();

        int ebob = ebobCalculate(fNum,sNum);
        int ekok = ekokCalculater(fNum,sNum);

        System.out.println("EBOB(" + fNum + " , " + sNum + ")" + " = " + ebob);
        System.out.println("EKOK(" + fNum + " , " + sNum + ")" + " = " + ekok);
    }

    public static int ebobCalculate(int num1 , int num2)
    {
        int eBOB = 0;

        for(int i = 1; i <= Math.min(num1,num2) ; i++)
        {
            if(num1 % i == 0 && num2 % i == 0)
            {
                eBOB = i;
            }
        }

        return eBOB;
    }

    public static int ekokCalculater(int num1 , int num2)
    {
        int eKOK = 1;

        for(int i = 2;  ; i++)
        {
            if(num1 == 1 && num2 == 1)
            {
                break;
            }

            if(num1 % i == 0 && num2 % i == 0)
            {
                eKOK *= i;
                num2 /= i;
                num1 /= i;
                i--;
            }

            else if(num1 % i == 0 && num2 % i != 0)
            {
                eKOK *= i;
                num1 /= i;
                i--;
            }

            else if(num1 % i != 0 && num2 % i == 0)
            {
                eKOK *= i;
                num2 /= i;
                i--;
            }
        }
        return eKOK;
    }

}
