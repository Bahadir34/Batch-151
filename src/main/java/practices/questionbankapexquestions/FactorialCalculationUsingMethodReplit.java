package practices.questionbankapexquestions;

import java.util.Scanner;

public class FactorialCalculationUsingMethodReplit
{

    /*
        Write a return method that accepts an integer as input and calculates factorial and prints like output.

        Input : 6

        Output: 6!=6*5*4*3*2*1=720
     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number that is wanted to calculate till : ");
        int number = input.nextInt();

        calculateFactorial(number);



    }

    public static void calculateFactorial(int num)
    {
        int result = 1;

        System.out.print(num + "!=");

        for(int i = num ; i>1;i--)
        {
            System.out.print(i+"*");
            result*=i;
        }

        System.out.print("1="+result);


    }

}
