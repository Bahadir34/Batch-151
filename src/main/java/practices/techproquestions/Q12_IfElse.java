package practices.techproquestions;

import java.util.Scanner;

public class Q12_IfElse
{

    /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.

        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

    */

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if (number < 0)
        {
            System.out.println("The number is negative.");
        }
        else if(number < 10)
        {
            System.out.println("The number is a digit.");
        }
        else
        {
            System.out.println("The number is positive number.");
        }

    }

}
