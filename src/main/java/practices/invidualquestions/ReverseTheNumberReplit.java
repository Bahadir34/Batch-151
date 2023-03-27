package practices.invidualquestions;

import java.util.Scanner;
public class ReverseTheNumberReplit
{

    /*
    Write a java program to reverse the number which user entered.

    Input  :1238
    Output :Reverse Of The Number: 8321
     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int copyNumber = number;
        String sayi = "";
        do {

            sayi += Integer.toString(copyNumber%10);
            copyNumber /= 10;

        }while(copyNumber != 0);

        System.out.println("Reverse Of The Number : " + sayi);

    }
}
