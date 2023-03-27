package practices.invidualquestions;

import java.util.Scanner;

public class PrintingEvenNumbersNotUsingDecrementReplit
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive number : ");
        int number = input.nextInt();

        System.out.print("Even Numbers from " + number + " to 0 are: ");

        for(int i = 0 ; i <= number ; i++)
        {
            if((number - i) % 2 == 0)
                System.out.print(" " + (number-i));
        }

    }

}
