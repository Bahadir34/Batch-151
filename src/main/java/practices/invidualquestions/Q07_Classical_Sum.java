package practices.invidualquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q07_Classical_Sum
{
    /*

    Klasik toplama işlemi yapan kodu yazınız.

    1   2   3
    2   5   7
  +
  --------------
    3   8   0

     */

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int number1,number2,elde = 0;

        System.out.print("Number 1 : ");
        number1 = input.nextInt();

        System.out.print("Number 2 : ");
        number2 = input.nextInt();

        System.out.println(basamakHesapla(number1));
        System.out.println(basamakHesapla(number2));

        int basamak = basamakHesapla(number1) > basamakHesapla(number2) ? basamakHesapla(number1) : basamakHesapla(number2);

        System.out.println(Math.pow(2,5));

        int a = number1;
        int b = number2;

        int i = 0;
        while(i < basamak)
        {
            int basamakA, basamakB;

            basamakA = a % 10;
            basamakB = b % 10;

            if(basamakA+basamakB+elde > 9)
            {
                elde = 1;
            }
            else
            {
                elde = 0;
            }


            if(a / 10 == 0 && b / 10 == 0)
            {
                break;
            }

            i++;
        }


    }

    public static int basamakHesapla(int x)
    {
        int counter = 1;

        do {
            counter++;
            x /= 10;

        }while(x / 10 != 0);

        return counter;
    }

}
